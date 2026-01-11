"""Panel Data Service for Kitchen Cooking Engine.

Efficient data layer for the frontend panel with caching and change detection.
Provides incremental updates to minimize data transfer.

Last Updated: 8 Jan 2026, 23:55 CET
Last Change: Initial panel data service implementation (Phase 3.1)
"""

from __future__ import annotations

import logging
from datetime import datetime, timedelta
from typing import TYPE_CHECKING, Any, Dict, List, Optional, Set

from homeassistant.core import HomeAssistant
from homeassistant.helpers.event import async_track_time_interval

if TYPE_CHECKING:
    from .appliance_manager import ApplianceManager
    from .appliances import KitchenAppliance
    from .recipes.models import UnifiedRecipe

_LOGGER = logging.getLogger(__name__)

# Cache TTL in seconds
CACHE_TTL = 30


class PanelDataService:
    """
    Data service for frontend panel.
    
    Provides:
    - Efficient data caching
    - Change detection
    - Incremental updates
    - Automatic cache invalidation
    """
    
    def __init__(self, hass: HomeAssistant, manager: ApplianceManager) -> None:
        """Initialize the panel data service.
        
        Args:
            hass: Home Assistant instance
            manager: Appliance manager instance
        """
        self.hass = hass
        self.manager = manager
        
        # Cache storage
        self._appliances_cache: Optional[Dict[str, Any]] = None
        self._features_cache: Optional[Set[str]] = None
        self._recipes_cache: Optional[List[Dict[str, Any]]] = None
        
        # Cache timestamps
        self._appliances_cache_time: Optional[datetime] = None
        self._features_cache_time: Optional[datetime] = None
        self._recipes_cache_time: Optional[datetime] = None
        
        # Track changes
        self._appliances_version = 0
        self._recipes_version = 0
        
        _LOGGER.info("Panel Data Service initialized")
    
    async def async_setup(self) -> bool:
        """Set up the panel data service.
        
        Sets up periodic cache cleanup.
        
        Returns:
            True if setup successful
        """
        # Set up periodic cache cleanup (every 5 minutes)
        async_track_time_interval(
            self.hass,
            self._async_cleanup_expired_cache,
            timedelta(minutes=5)
        )
        
        _LOGGER.info("Panel Data Service setup complete")
        return True
    
    async def _async_cleanup_expired_cache(self, now: datetime) -> None:
        """Clean up expired cache entries.
        
        Args:
            now: Current timestamp
        """
        expired = timedelta(seconds=CACHE_TTL)
        
        if (self._appliances_cache_time and 
            now - self._appliances_cache_time > expired):
            self._appliances_cache = None
            self._appliances_cache_time = None
            _LOGGER.debug("Expired appliances cache cleared")
        
        if (self._features_cache_time and 
            now - self._features_cache_time > expired):
            self._features_cache = None
            self._features_cache_time = None
            _LOGGER.debug("Expired features cache cleared")
        
        if (self._recipes_cache_time and 
            now - self._recipes_cache_time > expired):
            self._recipes_cache = None
            self._recipes_cache_time = None
            _LOGGER.debug("Expired recipes cache cleared")
    
    def invalidate_cache(self, cache_type: Optional[str] = None) -> None:
        """Invalidate cached data.
        
        Args:
            cache_type: Type of cache to invalidate, or None for all
        """
        if cache_type is None or cache_type == "appliances":
            self._appliances_cache = None
            self._appliances_cache_time = None
            self._appliances_version += 1
            _LOGGER.debug("Appliances cache invalidated")
        
        if cache_type is None or cache_type == "features":
            self._features_cache = None
            self._features_cache_time = None
            _LOGGER.debug("Features cache invalidated")
        
        if cache_type is None or cache_type == "recipes":
            self._recipes_cache = None
            self._recipes_cache_time = None
            self._recipes_version += 1
            _LOGGER.debug("Recipes cache invalidated")
    
    async def async_get_appliances_data(
        self,
        force_refresh: bool = False
    ) -> Dict[str, Any]:
        """Get appliances data with caching.
        
        Args:
            force_refresh: Force cache refresh
            
        Returns:
            Dictionary with appliances data and metadata
        """
        # Check cache
        if (not force_refresh and 
            self._appliances_cache is not None and
            self._appliances_cache_time is not None):
            age = datetime.now() - self._appliances_cache_time
            if age.total_seconds() < CACHE_TTL:
                return {
                    **self._appliances_cache,
                    "cached": True,
                    "cache_age_seconds": age.total_seconds()
                }
        
        # Build fresh data
        appliances = []
        for appliance in self.manager.get_appliances():
            appliances.append({
                "id": appliance.appliance_id,
                "name": appliance.name,
                "brand": appliance.brand,
                "model": appliance.model,
                "features": sorted(list(appliance.get_features())),
                "recipe_count": len(appliance.recipes) if hasattr(appliance, 'recipes') else 0,
            })
        
        # Cache it
        self._appliances_cache = {
            "appliances": appliances,
            "count": len(appliances),
            "version": self._appliances_version,
            "timestamp": datetime.now().isoformat()
        }
        self._appliances_cache_time = datetime.now()
        
        return {
            **self._appliances_cache,
            "cached": False
        }
    
    async def async_get_features_data(
        self,
        force_refresh: bool = False
    ) -> Dict[str, Any]:
        """Get available features with caching.
        
        Args:
            force_refresh: Force cache refresh
            
        Returns:
            Dictionary with features data
        """
        # Check cache
        if (not force_refresh and 
            self._features_cache is not None and
            self._features_cache_time is not None):
            age = datetime.now() - self._features_cache_time
            if age.total_seconds() < CACHE_TTL:
                return {
                    "features": sorted(list(self._features_cache)),
                    "count": len(self._features_cache),
                    "cached": True,
                    "cache_age_seconds": age.total_seconds()
                }
        
        # Build fresh data
        features = self.manager.get_available_features()
        
        # Cache it
        self._features_cache = features
        self._features_cache_time = datetime.now()
        
        return {
            "features": sorted(list(features)),
            "count": len(features),
            "cached": False,
            "timestamp": datetime.now().isoformat()
        }
    
    async def async_get_compatible_recipes(
        self,
        min_quality: Optional[str] = None,
        force_refresh: bool = False
    ) -> Dict[str, Any]:
        """Get compatible recipes with caching.
        
        Args:
            min_quality: Minimum quality filter (EXCELLENT, GOOD, ACCEPTABLE, POOR)
            force_refresh: Force cache refresh
            
        Returns:
            Dictionary with recipes data
        """
        from .recipes.matcher import RecipeMatcher
        from .recipes.models import ImplementationQuality
        
        # Parse quality filter
        quality_filter = None
        if min_quality:
            try:
                quality_filter = ImplementationQuality[min_quality.upper()]
            except KeyError:
                quality_filter = ImplementationQuality.ACCEPTABLE
        else:
            quality_filter = ImplementationQuality.ACCEPTABLE
        
        # Check cache (cache key includes quality filter)
        cache_key = f"recipes_{quality_filter.name}"
        
        if (not force_refresh and 
            self._recipes_cache is not None and
            self._recipes_cache_time is not None and
            self._recipes_cache.get("cache_key") == cache_key):
            age = datetime.now() - self._recipes_cache_time
            if age.total_seconds() < CACHE_TTL:
                return {
                    **self._recipes_cache,
                    "cached": True,
                    "cache_age_seconds": age.total_seconds()
                }
        
        # Build fresh data
        if not self.manager.registry.has_appliances():
            return {
                "recipes": [],
                "count": 0,
                "message": "No appliances configured",
                "cached": False
            }
        
        # Get all recipes
        all_recipes = self.manager.registry.get_all_recipes()
        
        # Filter using matcher
        matcher = RecipeMatcher(self.manager.registry)
        compatible_recipes = matcher.filter_recipes(all_recipes, min_quality=quality_filter)
        
        # Build results
        recipes_with_results = []
        for recipe in compatible_recipes:
            result = matcher.match_recipe(recipe)
            recipes_with_results.append({
                "recipe": {
                    "id": recipe.id,
                    "name": recipe.name,
                    "description": recipe.description,
                    "required_features": sorted(list(recipe.required_features)),
                    "optional_features": sorted(list(recipe.optional_features)),
                },
                "match": {
                    "quality": result.implementation_quality.name,
                    "score": result.quality_score,
                    "confidence": result.confidence,
                    "suggested_appliances": result.suggested_appliances,
                    "alternative_appliances": result.alternative_appliances,
                    "notes": result.notes,
                }
            })
        
        # Cache it
        self._recipes_cache = {
            "recipes": recipes_with_results,
            "count": len(recipes_with_results),
            "min_quality": quality_filter.name,
            "version": self._recipes_version,
            "cache_key": cache_key,
            "timestamp": datetime.now().isoformat()
        }
        self._recipes_cache_time = datetime.now()
        
        return {
            **self._recipes_cache,
            "cached": False
        }
    
    async def async_match_recipe(
        self,
        recipe_id: int
    ) -> Optional[Dict[str, Any]]:
        """Match a specific recipe against available appliances.
        
        Args:
            recipe_id: Recipe ID to match
            
        Returns:
            Match result dictionary, or None if recipe not found
        """
        from .recipes.matcher import RecipeMatcher
        
        # Find recipe
        recipe = self.manager.registry.get_recipe_by_id(recipe_id)
        if not recipe:
            return None
        
        # Match recipe
        matcher = RecipeMatcher(self.manager.registry)
        result = matcher.match_recipe(recipe)
        
        # Get suggestions for missing appliances
        missing_appliances = {}
        if not result.can_cook:
            missing_appliances = matcher.suggest_missing_appliances(recipe)
        
        return {
            "recipe_id": recipe_id,
            "recipe_name": recipe.name,
            "can_cook": result.can_cook,
            "missing_features": sorted(list(result.missing_features)),
            "suggested_appliances": result.suggested_appliances,
            "alternative_appliances": result.alternative_appliances,
            "implementation_quality": result.implementation_quality.name,
            "quality_score": result.quality_score,
            "confidence": result.confidence,
            "notes": result.notes,
            "missing_appliances_suggestions": missing_appliances
        }


def get_panel_data_service(hass: HomeAssistant) -> Optional[PanelDataService]:
    """Get the panel data service instance.
    
    Args:
        hass: Home Assistant instance
        
    Returns:
        PanelDataService instance or None if not initialized
    """
    from .const import DOMAIN
    
    if DOMAIN not in hass.data:
        return None
    return hass.data[DOMAIN].get("panel_data_service")
