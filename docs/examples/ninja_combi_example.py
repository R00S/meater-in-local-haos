#!/usr/bin/env python3
"""
Example script demonstrating how to use the Ninja Combi recipe database.

Run from repository root:
    python3 docs/examples/ninja_combi_example.py
"""

import sys
from pathlib import Path

# Add the custom_components directory to the path
repo_root = Path(__file__).parent.parent.parent
sys.path.insert(0, str(repo_root))

from custom_components.kitchen_cooking_engine import ninja_combi_helper as nch

def main():
    """Demonstrate various recipe queries and displays."""
    
    print("=" * 80)
    print("NINJA COMBI RECIPE DATABASE - EXAMPLES")
    print("=" * 80)
    
    # Example 1: List all recipes
    print("\n📚 ALL RECIPES:")
    print("-" * 80)
    all_summaries = nch.get_all_recipe_summaries()
    for summary in all_summaries:
        print(f"  [{summary['id']}] {summary['name']}")
        print(f"      Mode: {summary['mode']} | {summary['difficulty']} | {summary['total_time']}")
    
    # Example 2: Search for chicken recipes
    print("\n\n🍗 CHICKEN RECIPES:")
    print("-" * 80)
    chicken_recipes = nch.search_recipes("chicken")
    for recipe in chicken_recipes:
        summary = nch.get_recipe_summary(recipe)
        print(f"  • {recipe.name} ({summary['mode']}) - {summary['cook_time']}")
    
    # Example 3: Get easy recipes for beginners
    print("\n\n👶 BEGINNER-FRIENDLY RECIPES:")
    print("-" * 80)
    easy_recipes = nch.get_beginner_friendly_recipes()
    for recipe in easy_recipes:
        print(f"  • {recipe.name} - {nch.format_cook_time(nch.get_total_cook_time(recipe))}")
    
    print("\n" + "=" * 80)
    print("For more information, see:")
    print("  docs/NINJA_COMBI_GUIDE.md - Complete guide to Ninja Combi cooking")
    print("=" * 80 + "\n")

if __name__ == "__main__":
    main()
