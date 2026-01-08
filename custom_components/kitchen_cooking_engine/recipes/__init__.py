"""
Recipe management system for Kitchen Cooking Engine.

This module provides unified recipe models and feature-based matching
for multi-appliance cooking workflows.
"""

from .models import (
    UnifiedRecipe,
    CookingPhase,
    RecipeDifficulty,
    DietaryTag,
    CuisineType,
    MealType,
    RecipeMatchResult,
    ImplementationQuality,
)

from .matcher import RecipeMatcher
from .converter import RecipeConverter
from .examples import (
    get_example_recipes,
    get_single_appliance_recipes,
    get_multi_appliance_recipes,
    get_recipes_with_alternatives,
    ALL_EXAMPLE_RECIPES,
)

__all__ = [
    "UnifiedRecipe",
    "CookingPhase",
    "RecipeDifficulty",
    "DietaryTag",
    "CuisineType",
    "MealType",
    "RecipeMatchResult",
    "ImplementationQuality",
    "RecipeMatcher",
    "RecipeConverter",
    "get_example_recipes",
    "get_single_appliance_recipes",
    "get_multi_appliance_recipes",
    "get_recipes_with_alternatives",
    "ALL_EXAMPLE_RECIPES",
]
