"""Multi-Appliance Cook Coordinator for Kitchen Cooking Engine.

Phase 4: Coordinates cooking sessions across multiple appliances simultaneously.
Validates appliance availability, manages session state, and provides unified interface
for starting multi-appliance cooking sessions.

Last Updated: 10 Jan 2026
"""

from __future__ import annotations

import logging
from typing import Any, Dict, List, Optional
from dataclasses import dataclass

from homeassistant.core import HomeAssistant
from homeassistant.exceptions import HomeAssistantError

from .const import DOMAIN
from .appliances.registry import get_registry
from .recipes.matcher import RecipeMatcher, MatchQuality

_LOGGER = logging.getLogger(__name__)


@dataclass
class ApplianceAssignment:
    """Assignment of a feature role to a specific appliance."""
    feature_role: str  # e.g., "oven", "probe", "air_fryer"
    appliance_id: str  # e.g., "ninja_combi_1", "meater_plus_1"
    appliance_name: str  # Human-readable name
    entity_id: Optional[str] = None  # Associated sensor entity if applicable


@dataclass
class MultiApplianceCookSession:
    """Represents a cooking session involving multiple appliances."""
    session_id: str
    recipe_id: Optional[str]
    recipe_name: str
    appliance_assignments: List[ApplianceAssignment]
    primary_appliance_id: str  # Main appliance driving the session
    secondary_appliance_ids: List[str]  # Supporting appliances
    start_time: str
    status: str  # cooking, complete, error
    notes: Optional[str] = None


class ApplianceCookCoordinator:
    """Coordinates cooking across multiple appliances.
    
    Phase 4 Implementation:
    - Validates appliances have required features
    - Creates multi-appliance cook sessions
    - Manages session state and coordination
    - Provides unified interface for automation
    """

    def __init__(self, hass: HomeAssistant):
        """Initialize the coordinator."""
        self.hass = hass
        self._active_sessions: Dict[str, MultiApplianceCookSession] = {}
        self._session_counter = 0

    def _generate_session_id(self) -> str:
        """Generate unique session ID."""
        self._session_counter += 1
        return f"multi_cook_{self._session_counter}"

    async def validate_appliances_for_recipe(
        self, 
        recipe: Dict[str, Any],
        appliance_ids: Optional[List[str]] = None
    ) -> tuple[bool, List[str]]:
        """Validate that required appliances are available for recipe.
        
        Args:
            recipe: Recipe dictionary with required_features
            appliance_ids: Optional list of specific appliance IDs to use
            
        Returns:
            Tuple of (is_valid, missing_features)
        """
        registry = get_registry(self.hass)
        required_features = recipe.get("required_features", [])
        
        if not required_features:
            return True, []
        
        # Get available features from registry
        if appliance_ids:
            # Check specific appliances
            available_features = set()
            for app_id in appliance_ids:
                appliance = registry.get_appliance_by_id(app_id)
                if appliance:
                    available_features.update(appliance.get("features", []))
        else:
            # Check all available appliances
            available_features = registry.get_available_features()
        
        missing_features = [f for f in required_features if f not in available_features]
        return len(missing_features) == 0, missing_features

    async def suggest_appliance_assignments(
        self,
        recipe: Dict[str, Any]
    ) -> List[ApplianceAssignment]:
        """Suggest optimal appliance assignments for a recipe.
        
        Uses the recipe matcher to find best appliance combinations.
        """
        registry = get_registry(self.hass)
        matcher = RecipeMatcher(registry)
        
        match_result = matcher.match_recipe(recipe)
        
        assignments = []
        if match_result and match_result.get("suggested_appliances"):
            for app_id in match_result["suggested_appliances"]:
                appliance = registry.get_appliance_by_id(app_id)
                if appliance:
                    # Determine feature role based on appliance capabilities
                    role = self._determine_appliance_role(appliance)
                    
                    # Find associated entity if this is a sensor-based appliance
                    entity_id = self._find_entity_for_appliance(app_id)
                    
                    assignment = ApplianceAssignment(
                        feature_role=role,
                        appliance_id=app_id,
                        appliance_name=appliance.get("name", app_id),
                        entity_id=entity_id
                    )
                    assignments.append(assignment)
        
        return assignments

    def _determine_appliance_role(self, appliance: Dict[str, Any]) -> str:
        """Determine the primary role of an appliance based on its features."""
        features = set(appliance.get("features", []))
        
        # Priority order for role determination
        if "temperature_probe" in features:
            return "probe"
        elif any(f.startswith("combi_") for f in features):
            return "combi_oven"
        elif "air_fry" in features:
            return "air_fryer"
        elif "oven" in features:
            return "oven"
        elif "stovetop" in features:
            return "stovetop"
        elif "microwave" in features:
            return "microwave"
        else:
            return "appliance"

    def _find_entity_for_appliance(self, appliance_id: str) -> Optional[str]:
        """Find the sensor entity associated with an appliance."""
        # Look through domain data for entities
        if DOMAIN in self.hass.data:
            for entry_id, entry_data in self.hass.data[DOMAIN].items():
                if isinstance(entry_data, dict) and "entities" in entry_data:
                    # Check if this entry corresponds to the appliance
                    # For now, we'll use a simple heuristic based on entry_id
                    # Future: Add proper appliance_id to entity mapping
                    entities = entry_data.get("entities", [])
                    if entities and len(entities) > 0:
                        # Return first entity (cooking session sensor)
                        return entities[0].entity_id
        return None

    async def start_multi_appliance_cook(
        self,
        recipe: Dict[str, Any],
        appliance_assignments: Optional[List[ApplianceAssignment]] = None,
        options: Optional[Dict[str, Any]] = None
    ) -> MultiApplianceCookSession:
        """Start a multi-appliance cooking session.
        
        Args:
            recipe: Recipe dictionary with name, required_features, etc.
            appliance_assignments: Optional specific appliance assignments
            options: Optional cooking options (target_temp, time, etc.)
            
        Returns:
            MultiApplianceCookSession object
            
        Raises:
            HomeAssistantError: If validation fails or appliances unavailable
        """
        options = options or {}
        
        # Validate recipe has required appliances
        appliance_ids = None
        if appliance_assignments:
            appliance_ids = [a.appliance_id for a in appliance_assignments]
        
        is_valid, missing = await self.validate_appliances_for_recipe(recipe, appliance_ids)
        if not is_valid:
            raise HomeAssistantError(
                f"Cannot start cook: Missing required features: {', '.join(missing)}"
            )
        
        # Get or generate appliance assignments
        if not appliance_assignments:
            appliance_assignments = await self.suggest_appliance_assignments(recipe)
        
        if not appliance_assignments:
            raise HomeAssistantError(
                "Cannot start cook: No suitable appliances found for recipe"
            )
        
        # Determine primary and secondary appliances
        # Primary = first appliance or probe if available
        primary_assignment = appliance_assignments[0]
        for assignment in appliance_assignments:
            if assignment.feature_role == "probe":
                primary_assignment = assignment
                break
        
        primary_id = primary_assignment.appliance_id
        secondary_ids = [
            a.appliance_id for a in appliance_assignments 
            if a.appliance_id != primary_id
        ]
        
        # Generate session
        session_id = self._generate_session_id()
        from homeassistant.util import dt as dt_util
        
        session = MultiApplianceCookSession(
            session_id=session_id,
            recipe_id=recipe.get("id"),
            recipe_name=recipe.get("name", "Unknown Recipe"),
            appliance_assignments=appliance_assignments,
            primary_appliance_id=primary_id,
            secondary_appliance_ids=secondary_ids,
            start_time=dt_util.now().isoformat(),
            status="cooking"
        )
        
        # Store active session
        self._active_sessions[session_id] = session
        
        _LOGGER.info(
            "Started multi-appliance cook session %s for recipe '%s' with appliances: %s",
            session_id,
            session.recipe_name,
            ", ".join([a.appliance_name for a in appliance_assignments])
        )
        
        # Fire event for integrations/automations
        self.hass.bus.fire(
            f"{DOMAIN}_multi_cook_started",
            {
                "session_id": session_id,
                "recipe_name": session.recipe_name,
                "appliances": [
                    {
                        "role": a.feature_role,
                        "id": a.appliance_id,
                        "name": a.appliance_name
                    }
                    for a in appliance_assignments
                ]
            }
        )
        
        return session

    async def stop_multi_appliance_cook(self, session_id: str) -> None:
        """Stop a multi-appliance cooking session."""
        if session_id not in self._active_sessions:
            raise HomeAssistantError(f"Session {session_id} not found")
        
        session = self._active_sessions[session_id]
        session.status = "complete"
        
        _LOGGER.info(
            "Stopped multi-appliance cook session %s for recipe '%s'",
            session_id,
            session.recipe_name
        )
        
        # Fire event
        self.hass.bus.fire(
            f"{DOMAIN}_multi_cook_stopped",
            {
                "session_id": session_id,
                "recipe_name": session.recipe_name
            }
        )
        
        # Remove from active sessions after a delay (keep for history)
        # For now, just mark as complete
        del self._active_sessions[session_id]

    def get_active_session(self, session_id: str) -> Optional[MultiApplianceCookSession]:
        """Get an active cooking session."""
        return self._active_sessions.get(session_id)

    def get_all_active_sessions(self) -> List[MultiApplianceCookSession]:
        """Get all active cooking sessions."""
        return list(self._active_sessions.values())


def get_coordinator(hass: HomeAssistant) -> ApplianceCookCoordinator:
    """Get or create the coordinator instance."""
    if "coordinator" not in hass.data.get(DOMAIN, {}):
        if DOMAIN not in hass.data:
            hass.data[DOMAIN] = {}
        hass.data[DOMAIN]["coordinator"] = ApplianceCookCoordinator(hass)
    return hass.data[DOMAIN]["coordinator"]
