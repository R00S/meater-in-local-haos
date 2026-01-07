"""
Ninja Combi Recipe Helper Module

This module provides helper functions and utilities for working with
Ninja Combi recipes in the Kitchen Cooking Engine.

Example usage:

    from custom_components.kitchen_cooking_engine import ninja_combi_helper
    
    # Get all combi-mode recipes
    combi_recipes = ninja_combi_helper.get_combi_recipes()
    
    # Get recipes suitable for a specific ingredient
    chicken_recipes = ninja_combi_helper.search_recipes("chicken")
    
    # Check if a mode requires water tank
    needs_water = ninja_combi_helper.needs_water_tank(NinjaCombiMode.STEAM)
"""

from typing import Optional
from .ninja_combi_data import (
    NinjaCombiMode,
    NinjaCombiRecipe,
    NinjaCombiModeInfo,
    TrayPosition,
    get_ninja_combi_mode_info,
    get_all_ninja_combi_modes,
    get_ninja_combi_recipes,
    get_ninja_combi_recipe_by_id,
    is_combi_mode,
    requires_water_tank,
    get_standard_modes,
    get_adapted_modes,
    get_combi_modes,
)


def search_recipes(query: str) -> list[NinjaCombiRecipe]:
    """
    Search recipes by name, description, or ingredients.
    
    Args:
        query: Search term (case-insensitive)
    
    Returns:
        List of matching recipes
    """
    query_lower = query.lower()
    all_recipes = get_ninja_combi_recipes()
    
    matching_recipes = []
    for recipe in all_recipes:
        # Search in name
        if query_lower in recipe.name.lower():
            matching_recipes.append(recipe)
            continue
        
        # Search in description
        if query_lower in recipe.description.lower():
            matching_recipes.append(recipe)
            continue
        
        # Search in ingredients
        for ingredient in recipe.ingredients:
            if query_lower in ingredient.lower():
                matching_recipes.append(recipe)
                break
    
    return matching_recipes


def get_recipes_by_difficulty(difficulty: str) -> list[NinjaCombiRecipe]:
    """
    Get recipes filtered by difficulty level.
    
    Args:
        difficulty: "easy", "medium", or "hard"
    
    Returns:
        List of recipes matching difficulty
    """
    all_recipes = get_ninja_combi_recipes()
    return [r for r in all_recipes if r.difficulty.lower() == difficulty.lower()]


def get_recipes_by_cook_time(max_minutes: int) -> list[NinjaCombiRecipe]:
    """
    Get recipes that can be cooked within specified time.
    
    Args:
        max_minutes: Maximum cooking time in minutes
    
    Returns:
        List of recipes that fit within time limit
    """
    all_recipes = get_ninja_combi_recipes()
    return [r for r in all_recipes if r.cook_time_minutes <= max_minutes]


def get_probe_recipes() -> list[NinjaCombiRecipe]:
    """
    Get recipes that use temperature probe for monitoring.
    
    Returns:
        List of recipes that use probe
    """
    all_recipes = get_ninja_combi_recipes()
    return [r for r in all_recipes if r.use_probe]


def get_recipes_for_tray_position(position: TrayPosition) -> list[NinjaCombiRecipe]:
    """
    Get recipes using a specific tray position.
    
    Args:
        position: TrayPosition enum value
    
    Returns:
        List of recipes using that tray position
    """
    all_recipes = get_ninja_combi_recipes()
    return [r for r in all_recipes if r.tray_position == position]


def needs_water_tank(mode: NinjaCombiMode) -> bool:
    """
    Check if a cooking mode requires the water tank to be filled.
    
    Args:
        mode: NinjaCombiMode enum value
    
    Returns:
        True if water tank is required
    """
    return requires_water_tank(mode)


def get_mode_display_name(mode: NinjaCombiMode) -> str:
    """
    Get the display name for a cooking mode.
    
    Args:
        mode: NinjaCombiMode enum value
    
    Returns:
        Human-readable mode name
    """
    mode_info = get_ninja_combi_mode_info(mode)
    return mode_info.name if mode_info else mode.value


def get_total_cook_time(recipe: NinjaCombiRecipe) -> int:
    """
    Calculate total time from prep to finish.
    
    Args:
        recipe: NinjaCombiRecipe object
    
    Returns:
        Total minutes (prep + cook)
    """
    return recipe.prep_time_minutes + recipe.cook_time_minutes


def format_cook_time(minutes: int) -> str:
    """
    Format cooking time in human-readable format.
    
    Args:
        minutes: Time in minutes
    
    Returns:
        Formatted string (e.g., "1 hour 30 minutes")
    """
    if minutes < 60:
        return f"{minutes} minutes"
    
    hours = minutes // 60
    remaining_minutes = minutes % 60
    
    if remaining_minutes == 0:
        return f"{hours} hour{'s' if hours > 1 else ''}"
    
    return f"{hours} hour{'s' if hours > 1 else ''} {remaining_minutes} minutes"


def get_recipe_summary(recipe: NinjaCombiRecipe) -> dict:
    """
    Get a summary of recipe information.
    
    Args:
        recipe: NinjaCombiRecipe object
    
    Returns:
        Dictionary with key recipe information
    """
    return {
        "id": recipe.id,
        "name": recipe.name,
        "description": recipe.description,
        "mode": get_mode_display_name(recipe.mode),
        "difficulty": recipe.difficulty,
        "prep_time": format_cook_time(recipe.prep_time_minutes),
        "cook_time": format_cook_time(recipe.cook_time_minutes),
        "total_time": format_cook_time(get_total_cook_time(recipe)),
        "servings": recipe.servings,
        "uses_probe": recipe.use_probe,
        "needs_water_tank": needs_water_tank(recipe.mode),
        "tray_position": recipe.tray_position.name,
        "num_phases": len(recipe.phases),
    }


def get_all_recipe_summaries() -> list[dict]:
    """
    Get summaries of all recipes.
    
    Returns:
        List of recipe summary dictionaries
    """
    all_recipes = get_ninja_combi_recipes()
    return [get_recipe_summary(r) for r in all_recipes]


def get_recipes_by_mode_category() -> dict:
    """
    Organize recipes by mode category.
    
    Returns:
        Dictionary with categories as keys and recipe lists as values
    """
    return {
        "standard": get_ninja_combi_recipes(mode=m) 
        for m in get_standard_modes()
        if get_ninja_combi_recipes(mode=m)
    } | {
        "adapted": get_ninja_combi_recipes(mode=m)
        for m in get_adapted_modes()
        if get_ninja_combi_recipes(mode=m)
    } | {
        "combi": get_ninja_combi_recipes(mode=m)
        for m in get_combi_modes()
        if get_ninja_combi_recipes(mode=m)
    }


def get_quick_recipes(max_total_minutes: int = 30) -> list[NinjaCombiRecipe]:
    """
    Get recipes that can be completed quickly (prep + cook).
    
    Args:
        max_total_minutes: Maximum total time (default 30 minutes)
    
    Returns:
        List of quick recipes
    """
    all_recipes = get_ninja_combi_recipes()
    return [r for r in all_recipes if get_total_cook_time(r) <= max_total_minutes]


def get_beginner_friendly_recipes() -> list[NinjaCombiRecipe]:
    """
    Get recipes suitable for beginners (easy difficulty).
    
    Returns:
        List of easy recipes
    """
    return get_recipes_by_difficulty("easy")


def print_recipe(recipe: NinjaCombiRecipe) -> str:
    """
    Format recipe for printing/display.
    
    Args:
        recipe: NinjaCombiRecipe object
    
    Returns:
        Formatted recipe string
    """
    output = []
    output.append(f"# {recipe.name}")
    output.append(f"\n{recipe.description}")
    output.append(f"\n**Mode:** {get_mode_display_name(recipe.mode)}")
    output.append(f"**Tray Position:** {recipe.tray_position.name}")
    output.append(f"**Difficulty:** {recipe.difficulty.capitalize()}")
    output.append(f"**Prep Time:** {format_cook_time(recipe.prep_time_minutes)}")
    output.append(f"**Cook Time:** {format_cook_time(recipe.cook_time_minutes)}")
    output.append(f"**Servings:** {recipe.servings}")
    
    if recipe.use_probe:
        output.append(f"**Target Temperature:** {recipe.target_temp_c}°C / {recipe.target_temp_f}°F")
    
    output.append("\n## Ingredients")
    for ingredient in recipe.ingredients:
        output.append(f"- {ingredient}")
    
    output.append("\n## Instructions")
    for i, instruction in enumerate(recipe.instructions, 1):
        output.append(f"{i}. {instruction}")
    
    if recipe.tips:
        output.append("\n## Tips")
        for tip in recipe.tips:
            output.append(f"- {tip}")
    
    if recipe.notes:
        output.append(f"\n## Notes")
        output.append(recipe.notes)
    
    return "\n".join(output)


# Convenience exports
__all__ = [
    "NinjaCombiMode",
    "NinjaCombiRecipe",
    "NinjaCombiModeInfo",
    "TrayPosition",
    "search_recipes",
    "get_recipes_by_difficulty",
    "get_recipes_by_cook_time",
    "get_probe_recipes",
    "get_recipes_for_tray_position",
    "needs_water_tank",
    "get_mode_display_name",
    "get_total_cook_time",
    "format_cook_time",
    "get_recipe_summary",
    "get_all_recipe_summaries",
    "get_recipes_by_mode_category",
    "get_quick_recipes",
    "get_beginner_friendly_recipes",
    "print_recipe",
]
