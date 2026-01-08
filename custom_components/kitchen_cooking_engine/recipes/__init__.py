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
]
