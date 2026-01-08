#!/usr/bin/env python3
"""
Demo of the Ninja Combi Recipe Builder with MEATER+ Probe Integration.

This shows how to use the "Build Your Combi Meal" formula to create
custom 3-part meals (base + protein + veggies) with MEATER+ temperature monitoring.

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
    build_air_fry_recipe,
    AirFryIngredient,
    list_air_fry_ingredients,
)

def main():
    print("=" * 80)
    print("NINJA COMBI RECIPE BUILDER WITH MEATER+ PROBE - DEMO")
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
    
    print("\n\n🍗 AVAILABLE AIR FRY INGREDIENTS:")
    print("-" * 80)
    for ingredient_name in list_air_fry_ingredients():
        print(f"  • {ingredient_name}")
    
    # Example 1: Combi Meal with MEATER+ probe
    print("\n\n" + "=" * 80)
    print("EXAMPLE 1: Chicken & Rice with MEATER+ Probe Monitoring")
    print("=" * 80)
    
    recipe1 = build_combi_meal(
        base=CombiMealBase.WHITE_RICE,
        protein=CombiMealProtein.CHICKEN_BREAST_FRESH,
        crispy_veggies=["2 cups broccoli florets"],
        use_meater_probe=True  # Enable MEATER+ probe
    )
    
    print(recipe1.get_recipe_card())
    
    # Example 2: Salmon with custom probe temp
    print("\n\n" + "=" * 80)
    print("EXAMPLE 2: Salmon with Quinoa (Custom Probe Temperature)")
    print("=" * 80)
    
    recipe2 = build_combi_meal(
        base=CombiMealBase.QUINOA,
        protein=CombiMealProtein.SALMON_FILETS,
        tender_veggies=["1 cup frozen peas"],
        crispy_veggies=["2 cups asparagus, trimmed (add last 5 min)"],
        use_meater_probe=True,
        target_temp_c=54,  # Medium doneness
        target_temp_f=130
    )
    
    print(recipe2.get_recipe_card())
    
    # Example 3: Air Fry with probe
    print("\n\n" + "=" * 80)
    print("EXAMPLE 3: Air Fry Chicken Wings with MEATER+ Probe")
    print("=" * 80)
    
    air_fry_recipe = build_air_fry_recipe(
        ingredient=AirFryIngredient.CHICKEN_WINGS,
        use_meater_probe=True
    )
    
    print(air_fry_recipe)
    
    print("\n\n" + "=" * 80)
    print("MEATER+ PROBE INTEGRATION TIPS")
    print("=" * 80)
    print("""
🌡️ How MEATER+ Works with Recipe Builder:
    
1. **Automatic Target Temps**: Recipe builder sets safe temperatures based on protein
2. **Real-Time Monitoring**: Watch temperature rise in Home Assistant
3. **Notifications**: Get alerted when target temperature reached
4. **Perfect Doneness**: No more guessing - precise to the degree

📱 Using MEATER+ in Home Assistant:
   - Open Kitchen Cooking Engine panel
   - Start cook with selected recipe
   - Monitor temperature graph in real-time
   - Get mobile/TTS notifications when done

💡 Pro Tips:
   - Insert probe into thickest part of protein
   - Avoid touching bone (gives false readings)
   - Remove food 2-3°C before target for carryover cooking
   - Keep probe in during rest to monitor temperature plateau

🎯 Common Target Temperatures:
   - Chicken: 74°C / 165°F (safe)
   - Pork: 63°C / 145°F (safe)
   - Beef Steak: 54°C / 130°F (medium-rare), 60°C / 140°F (medium)
   - Salmon: 54°C / 130°F (medium)
   - Ground Beef: 71°C / 160°F (safe)

🔥 Benefits in Ninja Combi:
   - Monitor through multi-phase cooking (steam → air fry/roast)
   - Track temperature rise during steam phase
   - Verify safe temp before crisping phase
   - Perfect results every time - no overcooking!
""")
    
    # Example 4: Combi-Bake Recipe
    print("\n" + "=" * 80)
    print("EXAMPLE 4: BUILD COMBI-BAKE RECIPE (ARTISAN BREAD)")
    print("=" * 80 + "\n")
    
    from ninja_combi_recipe_builder import build_combi_bake_recipe, BakeType
    
    bread_recipe = build_combi_bake_recipe(
        bake_type=BakeType.ARTISAN_BREAD,
        custom_name="Rosemary Focaccia",
        servings=8
    )
    
    print(bread_recipe)
    
    # Example 5: Modify Recipe Ingredient
    print("\n" + "=" * 80)
    print("EXAMPLE 5: MODIFY EXISTING RECIPE")
    print("=" * 80 + "\n")
    print("Starting from Combi-Meal Salmon recipe, swapping salmon for chicken...\n")
    
    from ninja_combi_recipe_builder import modify_recipe_ingredient
    
    modified = modify_recipe_ingredient(
        recipe_id=1004,  # Salmon with Rice recipe
        ingredient_to_replace="salmon",
        new_ingredient=CombiMealProtein.CHICKEN_BREAST_FRESH
    )
    
    print(modified)
    
    print("\n" + "=" * 80)
    print("The recipe builder + MEATER+ probe = Perfect cooking every time!")
    print("=" * 80 + "\n")

if __name__ == "__main__":
    main()
