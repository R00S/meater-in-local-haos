"""
Ninja Speedi to Ninja Combi Recipe Converter.

Last Updated: 07 Jan 2026, 23:50 CET
Last Change: Added CET timestamp for HACS release

This module converts recipes from the Ninja Speedi/Crispi format to Ninja Combi format,
translating mode names, button labels, and cooking parameters.

Mode Name Translation:
- Speedi Meals → Combi-Meal
- Steam Air Fry → Combi-Crisp  
- Steam & Bake → Combi-Bake
- Steam → Steam
- Air Fry → Air Fry
- Slow Cook → Slow Cook

Hardware Translation:
- SmartSwitch: RAPID COOKER → SmartSwitch: COMBI COOKER
- Cook & Crisp Tray → Crisper Tray (Lower Position)
- Combi Cooker Pan → Combi Pan (Lower Position)
"""

from dataclasses import dataclass
from typing import List, Dict, Any
from ninja_combi_data import NinjaCombiRecipe, NinjaCombiMode, TrayPosition, CookingPhase


# Mode translation mapping
SPEEDI_TO_COMBI_MODES = {
    "speedi_meals": NinjaCombiMode.COMBI_MEAL,
    "steam_air_fry": NinjaCombiMode.COMBI_CRISP,
    "steam_and_bake": NinjaCombiMode.COMBI_BAKE,
    "steam": NinjaCombiMode.STEAM,
    "air_fry": NinjaCombiMode.AIR_FRY,
    "slow_cook": NinjaCombiMode.SLOW_COOK,
}

# Terminology replacements for instructions
SPEEDI_TO_COMBI_TERMS = {
    "SPEEDI MEALS": "COMBI-MEAL",
    "Speedi Meals": "Combi-Meal",
    "speedi meals": "combi-meal",
    "STEAM AIR FRY": "COMBI-CRISP",
    "Steam Air Fry": "Combi-Crisp",
    "steam air fry": "combi-crisp",
    "STEAM & BAKE": "COMBI-BAKE",
    "Steam & Bake": "Combi-Bake",
    "steam & bake": "combi-bake",
    "RAPID COOKER": "COMBI COOKER",
    "Rapid Cooker": "Combi Cooker",
    "rapid cooker": "combi cooker",
    "Cook & Crisp Tray": "Crisper Tray",
    "cook & crisp tray": "crisper tray",
    "Combi Cooker Pan": "Combi Pan",
    "combi cooker pan": "combi pan",
}


def translate_speedi_text(text: str) -> str:
    """Replace Speedi terminology with Combi terminology in text."""
    for speedi_term, combi_term in SPEEDI_TO_COMBI_TERMS.items():
        text = text.replace(speedi_term, combi_term)
    return text


def convert_speedi_recipe_to_combi(
    recipe_id: int,
    name: str,
    description: str,
    speedi_mode: str,
    ingredients: List[str],
    instructions: List[str],
    temp_c: int,
    temp_f: int,
    cook_time_minutes: int,
    prep_time_minutes: int = 10,
    servings: int = 4,
    difficulty: str = "easy",
    use_probe: bool = False,
    target_temp_c: int = None,
    target_temp_f: int = None,
    tips: List[str] = None,
    notes: str = ""
) -> NinjaCombiRecipe:
    """
    Convert a Speedi recipe to Combi format.
    
    Args:
        recipe_id: Unique recipe ID (use 2000+ for Speedi-converted recipes)
        name: Recipe name
        description: Short description
        speedi_mode: Original Speedi mode name
        ingredients: List of ingredients (will be translated)
        instructions: List of instruction steps (will be translated)
        temp_c: Temperature in Celsius
        temp_f: Temperature in Fahrenheit
        cook_time_minutes: Total cooking time
        prep_time_minutes: Preparation time
        servings: Number of servings
        difficulty: Recipe difficulty (easy/medium/hard)
        use_probe: Whether to use temperature probe
        target_temp_c: Target temperature in Celsius (if using probe)
        target_temp_f: Target temperature in Fahrenheit (if using probe)
        tips: List of cooking tips
        notes: Additional notes
        
    Returns:
        NinjaCombiRecipe object with Combi terminology
    """
    # Translate mode
    combi_mode = SPEEDI_TO_COMBI_MODES.get(speedi_mode.lower().replace(" ", "_"), 
                                            NinjaCombiMode.COMBI_MEAL)
    
    # Translate ingredients and instructions
    translated_ingredients = [translate_speedi_text(ing) for ing in ingredients]
    translated_instructions = [translate_speedi_text(inst) for inst in instructions]
    translated_tips = [translate_speedi_text(tip) for tip in (tips or [])]
    translated_notes = translate_speedi_text(notes)
    
    # Determine tray position based on mode
    if combi_mode == NinjaCombiMode.COMBI_MEAL:
        tray_position = TrayPosition.LOWER  # Multi-level cooking
    elif combi_mode == NinjaCombiMode.COMBI_CRISP:
        tray_position = TrayPosition.LOWER  # Crisper tray
    elif combi_mode == NinjaCombiMode.COMBI_BAKE:
        tray_position = TrayPosition.MIDDLE  # Even baking
    else:
        tray_position = TrayPosition.MIDDLE  # Default
    
    # Create cooking phase
    # For Combi modes, assume steam phase first (typical pattern)
    if combi_mode in [NinjaCombiMode.COMBI_MEAL, NinjaCombiMode.COMBI_CRISP]:
        steam_time = min(10, cook_time_minutes // 2)  # Estimate steam time
        air_fry_time = cook_time_minutes - steam_time
        
        phases = [
            CookingPhase(
                mode=NinjaCombiMode.STEAM,
                temperature_c=100,
                temperature_f=212,
                duration_minutes=steam_time,
                description="Steam phase",
                steam_enabled=True
            ),
            CookingPhase(
                mode=NinjaCombiMode.AIR_FRY if combi_mode == NinjaCombiMode.COMBI_CRISP else combi_mode,
                temperature_c=temp_c,
                temperature_f=temp_f,
                duration_minutes=air_fry_time,
                description="Cooking phase",
                steam_enabled=False
            )
        ]
    else:
        phases = [
            CookingPhase(
                mode=combi_mode,
                temperature_c=temp_c,
                temperature_f=temp_f,
                duration_minutes=cook_time_minutes,
                description="Cooking phase",
                steam_enabled=False
            )
        ]
    
    return NinjaCombiRecipe(
        id=recipe_id,
        name=name,
        description=description,
        mode=combi_mode,
        tray_position=tray_position,
        phases=phases,
        use_probe=use_probe,
        target_temp_c=target_temp_c,
        target_temp_f=target_temp_f,
        ingredients=translated_ingredients,
        instructions=translated_instructions,
        prep_time_minutes=prep_time_minutes,
        cook_time_minutes=cook_time_minutes,
        servings=servings,
        difficulty=difficulty,
        tips=translated_tips,
        notes=translated_notes
    )


# Sample converted recipes from Speedi builder
CONVERTED_SPEEDI_RECIPES = []

# Recipe 1: Lamb Steaks with Pasta (from user's example)
CONVERTED_SPEEDI_RECIPES.append(
    convert_speedi_recipe_to_combi(
        recipe_id=2001,
        name="Lamb Steaks with Pasta",
        description="Asian-inspired lamb steaks with pasta and cherry tomatoes, all cooked together in one unit",
        speedi_mode="speedi_meals",
        ingredients=[
            "200g plain pasta",
            "750ml water or stock",
            "2 tablespoons oil or butter",
            "200g cherry tomatoes",
            "8 lamb steaks (65g each, 2cm thick)",
            "Asian-inspired seasoning",
            "Cheese for topping"
        ],
        instructions=[
            "Add plain pasta (200g) to the bottom of the Combi Pan",
            "Add 750ml water or stock and 2 tablespoons oil or butter",
            "Mix cherry tomatoes (200g) with the plain pasta. (Alternatively vegetables can be cooked to tender in a foil packet placed on the Crisper Tray with the lamb steaks)",
            "Season the lamb steaks with the asian-inspired seasoning",
            "Place your lamb steaks on the Crisper Tray in the lower position",
            "Close the lid and flip the SmartSwitch to COMBI COOKER. Select COMBI-MEAL, set temperature to 190°C, and set time for 10 to 15 minutes. Press START/STOP to begin cooking (the unit will steam for approximately 10 minutes before countdown timer begins)",
            "Top off your meal with cheese",
            "Enjoy!"
        ],
        temp_c=190,
        temp_f=374,
        cook_time_minutes=15,
        prep_time_minutes=10,
        servings=4,
        difficulty="easy",
        use_probe=True,
        target_temp_c=63,  # Lamb medium
        target_temp_f=145,
        tips=[
            "This recipe is 3-4 servings. To reduce servings for 1-2 people, cut the quantities in half for the base, veggies, and protein, then follow temperature and time recommendations as listed. Then, cover Crisper Tray with foil to protect base from additional heat.",
            "For extra crispy results, add vegetables directly to the Crisper Tray with the lamb steaks. Delicate vegetables (cherry tomatoes) should be added for the remaining 5-7 minutes.",
            "Marinate the lamb steaks for a minimum of 30 minutes and up to 6 hours ahead of time with your favorite marinade, or buy pre-marinated proteins to save time.",
            "We recommend sticking to the suggested heights and weights above for your protein. Thicker cuts of meat may need 3-5 extra minutes of cooking time which could overcook your grains."
        ],
        notes="Converted from Ninja Speedi recipe builder. SmartSwitch position changed from RAPID COOKER to COMBI COOKER. Mode name changed from SPEEDI MEALS to COMBI-MEAL."
    )
)

# Recipe 2: Chicken and Rice Bowl
CONVERTED_SPEEDI_RECIPES.append(
    convert_speedi_recipe_to_combi(
        recipe_id=2002,
        name="Teriyaki Chicken and Rice Bowl",
        description="Quick and easy teriyaki chicken with rice and vegetables, perfect weeknight dinner",
        speedi_mode="speedi_meals",
        ingredients=[
            "200g white rice, rinsed",
            "500ml water",
            "1 tablespoon sesame oil",
            "4 boneless chicken breasts (150g each)",
            "4 tablespoons teriyaki sauce",
            "2 cups broccoli florets",
            "1 red bell pepper, sliced",
            "Sesame seeds for garnish",
            "Green onions, sliced"
        ],
        instructions=[
            "Add rinsed white rice to the bottom of the Combi Pan",
            "Pour in 500ml water and 1 tablespoon sesame oil",
            "Place broccoli florets on top of rice (they will steam with the rice)",
            "Brush chicken breasts with teriyaki sauce on both sides",
            "Arrange chicken breasts and bell pepper slices on the Crisper Tray",
            "Close the lid and flip the SmartSwitch to COMBI COOKER. Select COMBI-MEAL, set temperature to 190°C, and set time for 15 minutes",
            "When complete, garnish with sesame seeds and green onions",
            "Serve immediately"
        ],
        temp_c=190,
        temp_f=374,
        cook_time_minutes=15,
        prep_time_minutes=8,
        servings=4,
        difficulty="easy",
        use_probe=True,
        target_temp_c=74,  # Chicken safe temp
        target_temp_f=165,
        tips=[
            "For extra flavor, marinate chicken in teriyaki sauce for 30 minutes before cooking",
            "Add a splash of soy sauce to the rice water for extra umami",
            "Bell peppers can be added halfway through cooking if you prefer them less soft"
        ],
        notes="Converted from Ninja Speedi recipe. Great for meal prep - makes 4 servings."
    )
)

# Recipe 3: Honey Garlic Salmon with Quinoa
CONVERTED_SPEEDI_RECIPES.append(
    convert_speedi_recipe_to_combi(
        recipe_id=2003,
        name="Honey Garlic Salmon with Quinoa",
        description="Glazed salmon fillets with fluffy quinoa and asparagus",
        speedi_mode="speedi_meals",
        ingredients=[
            "180g quinoa, rinsed",
            "450ml vegetable stock",
            "1 tablespoon olive oil",
            "4 salmon fillets (150g each)",
            "3 tablespoons honey",
            "2 cloves garlic, minced",
            "2 tablespoons soy sauce",
            "1 bunch asparagus, trimmed",
            "Lemon wedges for serving"
        ],
        instructions=[
            "Add rinsed quinoa to the Combi Pan",
            "Pour in vegetable stock and olive oil, stir to combine",
            "Mix honey, minced garlic, and soy sauce in a small bowl",
            "Brush salmon fillets with honey garlic glaze",
            "Arrange salmon fillets and asparagus on the Crisper Tray",
            "Close the lid and flip the SmartSwitch to COMBI COOKER. Select COMBI-MEAL, set temperature to 180°C, and set time for 18 minutes",
            "Brush salmon with remaining glaze halfway through cooking",
            "Serve with lemon wedges"
        ],
        temp_c=180,
        temp_f=356,
        cook_time_minutes=18,
        prep_time_minutes=10,
        servings=4,
        difficulty="easy",
        use_probe=True,
        target_temp_c=54,  # Salmon medium
        target_temp_f=130,
        tips=[
            "Don't overcook salmon - it should be slightly translucent in the center for best texture",
            "Quinoa will absorb all the stock and become fluffy - no draining needed",
            "Add asparagus at 12 minutes if you prefer it very crisp"
        ],
        notes="Converted from Ninja Speedi recipe. Healthy and delicious omega-3 rich meal."
    )
)

# Recipe 4: BBQ Pulled Pork with Coleslaw
CONVERTED_SPEEDI_RECIPES.append(
    convert_speedi_recipe_to_combi(
        recipe_id=2004,
        name="BBQ Pulled Pork Pasta",
        description="Quick BBQ pork tenderloin with pasta - weeknight version of pulled pork",
        speedi_mode="speedi_meals",
        ingredients=[
            "200g penne pasta",
            "750ml water",
            "1 tablespoon butter",
            "600g pork tenderloin, cut into 2cm chunks",
            "150ml BBQ sauce",
            "1 teaspoon smoked paprika",
            "1 red onion, sliced",
            "Fresh parsley for garnish"
        ],
        instructions=[
            "Add penne pasta to the Combi Pan",
            "Pour in 750ml water and add butter",
            "Toss pork chunks with BBQ sauce and smoked paprika",
            "Arrange pork and red onion slices on the Crisper Tray",
            "Close the lid and flip the SmartSwitch to COMBI COOKER. Select COMBI-MEAL, set temperature to 190°C, and set time for 14 minutes",
            "When done, shred pork slightly with two forks",
            "Toss pasta with additional BBQ sauce if desired",
            "Garnish with fresh parsley"
        ],
        temp_c=190,
        temp_f=374,
        cook_time_minutes=14,
        prep_time_minutes=10,
        servings=4,
        difficulty="easy",
        use_probe=True,
        target_temp_c=63,  # Pork safe temp
        target_temp_f=145,
        tips=[
            "Use your favorite BBQ sauce - sweet, smoky, or spicy all work well",
            "Pork will be tender and easy to shred after cooking",
            "Add coleslaw mix to pasta at the end for crunch and freshness"
        ],
        notes="Converted from Ninja Speedi recipe. Quick alternative to slow-cooked pulled pork."
    )
)

# Recipe 5: Mediterranean Chickpea Bowl
CONVERTED_SPEEDI_RECIPES.append(
    convert_speedi_recipe_to_combi(
        recipe_id=2005,
        name="Mediterranean Chickpea Bowl with Couscous",
        description="Vegetarian Mediterranean bowl with crispy chickpeas and fluffy couscous",
        speedi_mode="speedi_meals",
        ingredients=[
            "200g Israeli couscous",
            "500ml vegetable stock",
            "2 tablespoons olive oil",
            "2 cans (400g each) chickpeas, drained and patted dry",
            "2 teaspoons za'atar spice blend",
            "1 red bell pepper, diced",
            "1 zucchini, diced",
            "100g cherry tomatoes, halved",
            "100g feta cheese, crumbled",
            "Fresh mint leaves"
        ],
        instructions=[
            "Add Israeli couscous to the Combi Pan",
            "Pour in vegetable stock and 1 tablespoon olive oil",
            "Toss chickpeas with remaining olive oil and za'atar",
            "Spread chickpeas, bell pepper, and zucchini on the Crisper Tray",
            "Close the lid and flip the SmartSwitch to COMBI COOKER. Select COMBI-MEAL, set temperature to 195°C, and set time for 12 minutes",
            "Add cherry tomatoes to the Crisper Tray for the last 5 minutes",
            "Top with crumbled feta and fresh mint",
            "Serve warm or at room temperature"
        ],
        temp_c=195,
        temp_f=383,
        cook_time_minutes=12,
        prep_time_minutes=10,
        servings=4,
        difficulty="easy",
        use_probe=False,
        tips=[
            "Make sure chickpeas are very dry for maximum crispiness",
            "Za'atar can be replaced with a mix of oregano, thyme, and sesame seeds",
            "This bowl is great for meal prep and tastes delicious cold",
            "Drizzle with tahini sauce or hummus for extra creaminess"
        ],
        notes="Converted from Ninja Speedi recipe. Plant-based protein-packed meal."
    )
)


def get_all_converted_recipes() -> List[NinjaCombiRecipe]:
    """Get all converted Speedi recipes in Combi format."""
    return CONVERTED_SPEEDI_RECIPES


def get_converted_recipe_by_id(recipe_id: int) -> NinjaCombiRecipe:
    """Get a specific converted recipe by ID."""
    for recipe in CONVERTED_SPEEDI_RECIPES:
        if recipe.id == recipe_id:
            return recipe
    return None
