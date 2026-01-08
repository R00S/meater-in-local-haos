"""
Recipe matcher service for feature-based recipe matching.

This module implements smart appliance suggestions, quality scoring,
and multi-appliance recipe matching based on available features.

Last Updated: 08 Jan 2026, 22:30 CET
Last Change: Initial recipe matcher implementation
"""

import logging
from typing import List, Set, Dict, Tuple, Optional
from collections import defaultdict

from .models import UnifiedRecipe, RecipeMatchResult, ImplementationQuality
from ..appliances import KitchenAppliance, FeatureType
from ..appliances.registry import ApplianceRegistry

_LOGGER = logging.getLogger(__name__)


class RecipeMatcher:
    """
    Smart recipe matching service.
    
    Analyzes available appliances and matches them against recipe requirements,
    suggesting optimal appliance combinations with quality scoring.
    """
    
    def __init__(self, registry: ApplianceRegistry):
        """Initialize the recipe matcher.
        
        Args:
            registry: Appliance registry instance
        """
        self.registry = registry
    
    def can_cook_recipe(self, recipe: UnifiedRecipe) -> bool:
        """
        Check if available appliances can cook this recipe.
        
        Args:
            recipe: The recipe to check
            
        Returns:
            True if user has all required features
        """
        available_features = self.registry.get_available_features()
        return recipe.required_features.issubset(available_features)
    
    def match_recipe(self, recipe: UnifiedRecipe) -> RecipeMatchResult:
        """
        Match recipe against available appliances with smart suggestions.
        
        This is the core matching algorithm that:
        1. Checks if recipe can be cooked with available appliances
        2. Finds optimal appliance combination
        3. Scores implementation quality (STANDARD > MODIFIED > SPECIAL)
        4. Suggests alternatives
        
        Args:
            recipe: The recipe to match
            
        Returns:
            RecipeMatchResult with suggestions and quality scoring
        """
        available_features = self.registry.get_available_features()
        
        # Check if recipe can be cooked
        can_cook = recipe.required_features.issubset(available_features)
        
        if not can_cook:
            missing = recipe.required_features - available_features
            return RecipeMatchResult(
                can_cook=False,
                missing_features=missing,
                suggested_appliances=[],
                alternative_appliances=[],
                implementation_quality=ImplementationQuality.INCOMPATIBLE,
                quality_score=0.0,
                confidence=1.0,
                notes=f"Missing required features: {', '.join(sorted(missing))}"
            )
        
        # Find optimal appliance combination
        suggested = self._find_optimal_combination(recipe.required_features)
        alternatives = self._find_alternative_combinations(recipe.required_features, suggested)
        
        # Calculate implementation quality
        quality, score = self._calculate_quality(recipe.required_features, suggested)
        
        # Calculate confidence based on optional features
        confidence = self._calculate_confidence(recipe, available_features)
        
        # Generate notes
        notes = self._generate_match_notes(recipe, suggested, quality)
        
        return RecipeMatchResult(
            can_cook=True,
            missing_features=set(),
            suggested_appliances=suggested,
            alternative_appliances=alternatives,
            implementation_quality=quality,
            quality_score=score,
            confidence=confidence,
            notes=notes
        )
    
    def _find_optimal_combination(self, required_features: Set[str]) -> List[str]:
        """
        Find the best appliance combination for required features.
        
        Strategy:
        1. Prefer single appliance if it has all features
        2. Prefer STANDARD implementations over MODIFIED
        3. Minimize number of appliances needed
        
        Args:
            required_features: Set of required feature names
            
        Returns:
            List of appliance IDs that provide all features
        """
        all_appliances = self.registry.get_all_appliances()
        
        if not all_appliances:
            return []
        
        # Try to find single appliance with all features
        for appliance in all_appliances.values():
            if required_features.issubset(appliance.get_features()):
                return [appliance.appliance_id]
        
        # Need multiple appliances - use greedy algorithm
        # Sort appliances by number of required features they provide (descending)
        appliance_coverage = []
        for appliance in all_appliances.values():
            coverage = len(required_features & appliance.get_features())
            if coverage > 0:
                appliance_coverage.append((coverage, appliance))
        
        appliance_coverage.sort(key=lambda x: x[0], reverse=True)
        
        # Greedy selection
        selected = []
        covered = set()
        
        for _, appliance in appliance_coverage:
            if covered == required_features:
                break
            
            new_features = appliance.get_features() & required_features - covered
            if new_features:
                selected.append(appliance.appliance_id)
                covered |= new_features
        
        return selected
    
    def _find_alternative_combinations(
        self,
        required_features: Set[str],
        suggested: List[str]
    ) -> List[List[str]]:
        """
        Find alternative appliance combinations.
        
        Args:
            required_features: Set of required features
            suggested: The suggested combination
            
        Returns:
            List of alternative appliance ID combinations
        """
        all_appliances = self.registry.get_all_appliances()
        alternatives = []
        
        # Find other single appliances that have all features
        for appliance in all_appliances.values():
            if appliance.appliance_id not in suggested:
                if required_features.issubset(appliance.get_features()):
                    alternatives.append([appliance.appliance_id])
        
        # Limit to top 3 alternatives
        return alternatives[:3]
    
    def _calculate_quality(
        self,
        required_features: Set[str],
        appliance_ids: List[str]
    ) -> Tuple[ImplementationQuality, float]:
        """
        Calculate implementation quality for appliance combination.
        
        Quality hierarchy:
        - EXCELLENT: All features STANDARD
        - GOOD: All features STANDARD or MODIFIED, at least one STANDARD
        - ACCEPTABLE: Mix of STANDARD/MODIFIED/SPECIAL, mostly usable
        - POOR: Mostly MODIFIED or has SPECIAL features
        - INCOMPATIBLE: Missing features
        
        Args:
            required_features: Required features
            appliance_ids: List of appliance IDs providing features
            
        Returns:
            Tuple of (quality enum, numeric score 0-1)
        """
        all_appliances = self.registry.get_all_appliances()
        
        # Collect implementation types for each feature
        feature_implementations: Dict[str, List[FeatureType]] = defaultdict(list)
        
        for appliance_id in appliance_ids:
            appliance = all_appliances.get(appliance_id)
            if not appliance:
                continue
            
            for feature in required_features:
                if feature in appliance.get_features():
                    impl_type = appliance.get_feature_implementation(feature)
                    feature_implementations[feature].append(impl_type)
        
        # Analyze implementations
        standard_count = 0
        modified_count = 0
        special_count = 0
        
        for implementations in feature_implementations.values():
            # Use best implementation available for each feature
            if FeatureType.STANDARD in implementations:
                standard_count += 1
            elif FeatureType.MODIFIED in implementations:
                modified_count += 1
            elif FeatureType.SPECIAL in implementations:
                special_count += 1
        
        total = len(required_features)
        
        # Calculate quality
        if standard_count == total:
            return ImplementationQuality.EXCELLENT, 1.0
        elif modified_count == 0 and special_count == 0 and standard_count > 0:
            return ImplementationQuality.EXCELLENT, 0.95
        elif special_count == 0 and standard_count >= total * 0.5:
            return ImplementationQuality.GOOD, 0.75
        elif special_count <= 1:
            return ImplementationQuality.ACCEPTABLE, 0.5
        else:
            return ImplementationQuality.POOR, 0.25
    
    def _calculate_confidence(
        self,
        recipe: UnifiedRecipe,
        available_features: Set[str]
    ) -> float:
        """
        Calculate confidence score based on optional features.
        
        Args:
            recipe: The recipe
            available_features: Available features
            
        Returns:
            Confidence score 0-1
        """
        if not recipe.optional_features:
            return 1.0
        
        available_optional = recipe.optional_features & available_features
        confidence = len(available_optional) / len(recipe.optional_features)
        
        # Base confidence starts at 0.8 if all required features available
        # Increases to 1.0 with optional features
        return 0.8 + (confidence * 0.2)
    
    def _generate_match_notes(
        self,
        recipe: UnifiedRecipe,
        appliance_ids: List[str],
        quality: ImplementationQuality
    ) -> str:
        """
        Generate human-readable notes about the match.
        
        Args:
            recipe: The recipe
            appliance_ids: Matched appliance IDs
            quality: Implementation quality
            
        Returns:
            Notes string
        """
        all_appliances = self.registry.get_all_appliances()
        
        appliance_names = []
        for aid in appliance_ids:
            appliance = all_appliances.get(aid)
            if appliance:
                appliance_names.append(appliance.name)
        
        if not appliance_names:
            return "No appliances matched"
        
        appliances_str = " + ".join(appliance_names)
        
        if quality == ImplementationQuality.EXCELLENT:
            return f"Perfect match using {appliances_str}"
        elif quality == ImplementationQuality.GOOD:
            return f"Good match using {appliances_str} (some recipe adaptation needed)"
        elif quality == ImplementationQuality.ACCEPTABLE:
            return f"Acceptable match using {appliances_str} (significant adaptation needed)"
        else:
            return f"Poor match using {appliances_str} (results may vary)"
    
    def filter_recipes(
        self,
        recipes: List[UnifiedRecipe],
        min_quality: Optional[ImplementationQuality] = None
    ) -> List[UnifiedRecipe]:
        """
        Filter recipes by what user can cook.
        
        Args:
            recipes: List of all recipes
            min_quality: Minimum quality threshold (None = any quality)
            
        Returns:
            List of cookable recipes
        """
        available_features = self.registry.get_available_features()
        filtered = []
        
        for recipe in recipes:
            if not recipe.required_features.issubset(available_features):
                continue
            
            if min_quality is not None:
                match_result = self.match_recipe(recipe)
                if match_result.implementation_quality.value < min_quality.value:
                    continue
            
            filtered.append(recipe)
        
        return filtered
    
    def suggest_missing_appliances(
        self,
        recipe: UnifiedRecipe
    ) -> Dict[str, List[str]]:
        """
        Suggest appliances that would enable cooking this recipe.
        
        Args:
            recipe: Recipe that can't currently be cooked
            
        Returns:
            Dict mapping feature names to suggested appliance types
        """
        available_features = self.registry.get_available_features()
        missing = recipe.required_features - available_features
        
        suggestions = {}
        
        # Map features to common appliances that provide them
        feature_to_appliances = {
            "oven": ["Standard Oven", "Ninja Combi", "MultiFry"],
            "air_fry": ["Ninja Combi", "MultiFry", "Air Fryer"],
            "temperature_probe": ["MEATER+", "Thermometer"],
            "pressure_cook": ["Instant Pot", "Pressure Cooker"],
            "slow_cook": ["Slow Cooker", "Instant Pot", "MultiFry"],
            "steam": ["Ninja Combi", "Steam Oven"],
            "sous_vide": ["Sous Vide Cooker", "Anova"],
            "microwave": ["Microwave Oven"],
            "pan_fry": ["Stovetop", "Electric Griddle"],
            "boil": ["Stovetop", "Electric Kettle"],
        }
        
        for feature in missing:
            suggestions[feature] = feature_to_appliances.get(
                feature,
                ["Appliance with " + feature.replace("_", " ")]
            )
        
        return suggestions
