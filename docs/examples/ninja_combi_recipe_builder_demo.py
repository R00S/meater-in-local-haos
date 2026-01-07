#!/usr/bin/env python3
"""
Demo of the Ninja Combi Recipe Builder.

This shows how to use the "Build Your Combi Meal" formula to create
custom 3-part meals (base + protein + veggies).

Run from repository root:
    python3 docs/examples/ninja_combi_recipe_builder_demo.py
"""

import sys
from pathlib import Path

# Add path
repo_root = Path(__file__).parent.parent.parent
sys.path.insert(0, str(repo_root / "custom_components" / "kitchen_cooking_engine"))

from ninja_combi_recipe_builder import (
    build_combi_meal,
    CombiMealBase,
    CombiMealProtein,
    list_all_bases,
    list_all_proteins,
)

def main():
    print("=" * 80)
    print("NINJA COMBI RECIPE BUILDER - DEMO")
    print("=" * 80)
    
    # Show available options
    print("\n📚 AVAILABLE BASES:")
    print("-" * 80)
    for base_name in list_all_bases():
        print(f"  • {base_name}")
    
    print("\n\n🍖 AVAILABLE PROTEINS:")
    print("-" * 80)
    for protein_name in list_all_proteins():
        print(f"  • {protein_name}")
    
    # Example 1: Simple meal
    print("\n\n" + "=" * 80)
    print("EXAMPLE 1: Simple Chicken & Rice Meal")
    print("=" * 80)
    
    recipe1 = build_combi_meal(
        base=CombiMealBase.WHITE_RICE,
        protein=CombiMealProtein.CHICKEN_BREAST_FRESH,
        crispy_veggies=["2 cups broccoli florets"]
    )
    
    print(recipe1.get_recipe_card())
    
    # Example 2: Pasta meal
    print("\n\n" + "=" * 80)
    print("EXAMPLE 2: Italian Sausage with Marinara Pasta")
    print("=" * 80)
    
    recipe2 = build_combi_meal(
        base=CombiMealBase.MARINARA_PASTA,
        protein=CombiMealProtein.ITALIAN_SAUSAGES,
        crispy_veggies=["1 red bell pepper, sliced", "1 green bell pepper, sliced"]
    )
    
    print(recipe2.get_recipe_card())
    
    # Example 3: Seafood meal
    print("\n\n" + "=" * 80)
    print("EXAMPLE 3: Salmon with Quinoa and Veggies")
    print("=" * 80)
    
    recipe3 = build_combi_meal(
        base=CombiMealBase.QUINOA,
        protein=CombiMealProtein.SALMON_FILETS,
        tender_veggies=["1 cup frozen peas"],
        crispy_veggies=["2 cups asparagus, trimmed (add last 5 min)"]
    )
    
    print(recipe3.get_recipe_card())
    
    print("\n\n" + "=" * 80)
    print("RECIPE BUILDER TIPS")
    print("=" * 80)
    print("""
📝 How to Use the Recipe Builder:
    
1. Choose Your Base (grains or pasta)
2. Choose Your Protein (chicken, beef, pork, seafood, or plant-based)
3. Optionally add vegetables:
   - Tender veggies: Cook with base (peas, spinach, etc.)
   - Crispy veggies: Cook with protein (broccoli, carrots, etc.)

🔥 Temperature & Time:
   - Temperature set automatically based on protein
   - Times are for well-done proteins
   - Monitor and adjust for your preferred doneness

💡 Pro Tips:
   - Hearty veggies (potatoes, carrots): Add at start
   - Delicate veggies (broccoli, green beans): Add last 5-7 minutes
   - For smaller servings (2-3 people): Halve all quantities
   - Don't forget liquid in Level 1 (creates steam)!

🌡️ MEATER+ Integration:
   - Insert probe into protein for precise monitoring
   - Track temperature through cooking
   - Get notifications when target reached
""")
    
    print("=" * 80)
    print("The recipe builder makes it easy to create custom meals!")
    print("=" * 80 + "\n")

if __name__ == "__main__":
    main()
