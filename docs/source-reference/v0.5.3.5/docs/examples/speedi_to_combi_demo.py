#!/usr/bin/env python3
"""
Demo script showing Ninja Speedi to Ninja Combi recipe conversion.

This demonstrates how recipes from the Ninja Speedi/Crispi are automatically
converted to Ninja Combi format with proper terminology translation.
"""

import sys
import os

# Add parent directory to path for imports
sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__), '../..')))

try:
    from custom_components.kitchen_cooking_engine.speedi_to_combi_converter import (
        get_all_converted_recipes,
        get_converted_recipe_by_id,
        SPEEDI_TO_COMBI_MODES,
        SPEEDI_TO_COMBI_TERMS
    )
except ImportError:
    print("Error: Could not import converter module")
    print("Make sure you're running from the correct directory")
    sys.exit(1)


def print_separator():
    """Print a visual separator."""
    print("\n" + "="*80 + "\n")


def print_mode_mapping():
    """Show the Speedi to Combi mode translation mapping."""
    print("SPEEDI TO COMBI MODE TRANSLATION")
    print_separator()
    
    print("Mode Name Mappings:")
    for speedi, combi in SPEEDI_TO_COMBI_MODES.items():
        print(f"  {speedi:20s} → {combi.value}")
    
    print("\nTerminology Translations:")
    for speedi_term, combi_term in list(SPEEDI_TO_COMBI_TERMS.items())[:10]:
        print(f"  '{speedi_term}' → '{combi_term}'")


def print_recipe_summary():
    """Print summary of all converted recipes."""
    print("CONVERTED SPEEDI RECIPES")
    print_separator()
    
    recipes = get_all_converted_recipes()
    print(f"Total converted recipes: {len(recipes)}\n")
    
    for recipe in recipes:
        probe_indicator = "🌡️ " if recipe.use_probe else "   "
        print(f"{probe_indicator}#{recipe.id}: {recipe.name}")
        print(f"     Mode: {recipe.mode.value.upper()}")
        print(f"     Time: {recipe.cook_time_minutes} min | Difficulty: {recipe.difficulty}")
        if recipe.use_probe:
            print(f"     Probe: {recipe.target_temp_c}°C / {recipe.target_temp_f}°F")
        print()


def print_detailed_recipe(recipe_id: int):
    """Print a detailed recipe card."""
    recipe = get_converted_recipe_by_id(recipe_id)
    if not recipe:
        print(f"Recipe #{recipe_id} not found")
        return
    
    print(f"RECIPE: {recipe.name.upper()}")
    print_separator()
    
    print(f"**Description:** {recipe.description}\n")
    
    print(f"**Mode:** {recipe.mode.value.upper()}")
    print(f"**Tray Position:** {recipe.tray_position.name}")
    print(f"**Servings:** {recipe.servings}")
    print(f"**Difficulty:** {recipe.difficulty.capitalize()}")
    print(f"**Prep Time:** {recipe.prep_time_minutes} min")
    print(f"**Cook Time:** {recipe.cook_time_minutes} min\n")
    
    if recipe.use_probe:
        print(f"🌡️ **MEATER+ PROBE RECOMMENDED**")
        print(f"   Target: {recipe.target_temp_c}°C / {recipe.target_temp_f}°F\n")
    
    print("**Cooking Phases:**")
    for i, phase in enumerate(recipe.phases, 1):
        steam_note = " (STEAM)" if phase.steam_enabled else ""
        print(f"   {i}. {phase.description}")
        print(f"      {phase.temperature_c}°C / {phase.temperature_f}°F for {phase.duration_minutes} min{steam_note}")
    print()
    
    print("**Ingredients:**")
    for ingredient in recipe.ingredients:
        print(f"   • {ingredient}")
    print()
    
    print("**Instructions:**")
    for i, instruction in enumerate(recipe.instructions, 1):
        print(f"   {i}. {instruction}")
    print()
    
    if recipe.tips:
        print("**💡 Tips:**")
        for tip in recipe.tips:
            print(f"   • {tip}")
        print()
    
    if recipe.notes:
        print(f"**Note:** {recipe.notes}")


def main():
    """Run the demo."""
    print("\n" + "="*80)
    print(" "*20 + "NINJA SPEEDI TO COMBI CONVERTER DEMO")
    print("="*80 + "\n")
    
    print("This demo shows how Ninja Speedi recipes are automatically converted")
    print("to Ninja Combi format with proper terminology translation.\n")
    
    # Show mode mapping
    print_mode_mapping()
    print_separator()
    
    # Show recipe summary
    print_recipe_summary()
    print_separator()
    
    # Show detailed examples
    print("DETAILED RECIPE EXAMPLES")
    print_separator()
    
    # Example 1: Lamb Steaks with Pasta (from user's example)
    print("\n### Example 1: Recipe from User's Speedi Builder Example")
    print_detailed_recipe(2001)
    print_separator()
    
    # Example 2: Teriyaki Chicken
    print("\n### Example 2: Teriyaki Chicken and Rice Bowl")
    print_detailed_recipe(2002)
    print_separator()
    
    # Example 3: Honey Garlic Salmon
    print("\n### Example 3: Honey Garlic Salmon with Quinoa")
    print_detailed_recipe(2003)
    print_separator()
    
    print("\n" + "="*80)
    print("KEY CONVERSION HIGHLIGHTS:")
    print("="*80)
    print()
    print("✓ Mode names translated: SPEEDI MEALS → COMBI-MEAL")
    print("✓ Hardware references updated: RAPID COOKER → COMBI COOKER")
    print("✓ Tray names corrected: Cook & Crisp Tray → Crisper Tray")
    print("✓ Instructions use Ninja Combi terminology throughout")
    print("✓ MEATER+ probe integration maintained")
    print("✓ Multi-phase cooking preserved (steam + air fry)")
    print()
    print("All recipes from Ninja Speedi builder can be used with Ninja Combi!")
    print("="*80 + "\n")


if __name__ == "__main__":
    main()
