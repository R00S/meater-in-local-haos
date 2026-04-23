#!/usr/bin/env python3
"""
Simple demonstration of Ninja Combi recipes without dependencies.

This directly imports the recipe data without loading the full integration.

Run from repository root:
    python3 docs/examples/ninja_combi_simple_demo.py
"""

import sys
from pathlib import Path

# Add path
repo_root = Path(__file__).parent.parent.parent
sys.path.insert(0, str(repo_root / "custom_components" / "kitchen_cooking_engine"))

# Direct imports
from ninja_combi_data import (
    NinjaCombiMode,
    get_ninja_combi_recipes,
    get_all_ninja_combi_modes,
    get_combi_modes,
)

def main():
    print("=" * 80)
    print("NINJA COMBI RECIPE DATABASE - SIMPLE DEMO")
    print("=" * 80)
    
    # All recipes
    all_recipes = get_ninja_combi_recipes()
    print(f"\n📚 Total Recipes: {len(all_recipes)}")
    print("-" * 80)
    for recipe in all_recipes:
        probe_marker = "🌡️" if recipe.use_probe else "  "
        print(f"{probe_marker} [{recipe.id:4d}] {recipe.name}")
        print(f"           {recipe.description}")
        print(f"           Mode: {recipe.mode.value} | {recipe.difficulty} | " + 
              f"{recipe.cook_time_minutes} min cook")
        print()
    
    # Combi mode recipes
    print("\n🥷 SIGNATURE COMBI MODE RECIPES:")
    print("-" * 80)
    combi_modes = get_combi_modes()
    for mode in combi_modes:
        recipes = get_ninja_combi_recipes(mode)
        if recipes:
            print(f"\n{mode.value.upper()}:")
            for recipe in recipes:
                print(f"  • {recipe.name}")
                for phase in recipe.phases:
                    print(f"      Phase: {phase.description} ({phase.duration_minutes} min)")
    
    # Easy recipes
    print("\n\n👶 BEGINNER-FRIENDLY RECIPES (Easy):")
    print("-" * 80)
    easy = [r for r in all_recipes if r.difficulty == "easy"]
    for recipe in easy:
        total_time = recipe.prep_time_minutes + recipe.cook_time_minutes
        print(f"  • {recipe.name} - {total_time} minutes total")
    
    # Probe recipes
    print("\n\n🌡️  RECIPES USING TEMPERATURE PROBE:")
    print("-" * 80)
    probe_recipes = [r for r in all_recipes if r.use_probe]
    for recipe in probe_recipes:
        print(f"  • {recipe.name}")
        print(f"      Target: {recipe.target_temp_c}°C / {recipe.target_temp_f}°F")
    
    # Statistics
    print("\n\n📊 STATISTICS:")
    print("-" * 80)
    easy_count = len([r for r in all_recipes if r.difficulty == "easy"])
    medium_count = len([r for r in all_recipes if r.difficulty == "medium"])
    probe_count = len([r for r in all_recipes if r.use_probe])
    combi_count = len([r for r in all_recipes if any(p.steam_enabled for p in r.phases)])
    
    print(f"  Total recipes: {len(all_recipes)}")
    print(f"  Easy: {easy_count}, Medium: {medium_count}")
    print(f"  Use probe: {probe_count}")
    print(f"  Use steam (combi): {combi_count}")
    
    # Modes
    print("\n\n🔥 ALL COOKING MODES:")
    print("-" * 80)
    modes = get_all_ninja_combi_modes()
    for mode_info in modes:
        water_marker = "💧" if mode_info.water_tank_required else "  "
        combi_marker = "⭐" if mode_info.is_combi_mode else "  "
        print(f"{combi_marker}{water_marker} {mode_info.name}")
        print(f"       {mode_info.description}")
    
    print("\n" + "=" * 80)
    print("See docs/NINJA_COMBI_GUIDE.md for complete cooking guide!")
    print("=" * 80 + "\n")

if __name__ == "__main__":
    main()
