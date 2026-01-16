"""Example multi-appliance recipes for Kitchen Cooking Engine.

Demonstrates various recipe patterns:
- Single appliance recipes
- Multi-appliance recipes
- Recipes with alternatives
- Recipes with optional features
"""

from .models import UnifiedRecipe
from ..appliances import CookingPhase


# Single Appliance Recipes

AIR_FRIED_WINGS = UnifiedRecipe(
    id=5001,
    name="Crispy Air Fried Chicken Wings",
    description="Perfectly crispy chicken wings with no oil using air fry",
    required_features={"air_fry"},
    optional_features={"temperature_probe"},
    suggested_appliances=["ninja_combi"],
    alternative_appliances=[["multifry"], ["standard_oven_with_convection"]],
    phases=[
        CookingPhase(
            feature_name="air_fry",
            temperature_c=200,
            temperature_f=392,
            duration_minutes=25,
            description="Air Fry"
        )
    ],
    use_probe=True,
    target_temp_c=74,
    target_temp_f=165,
    ingredients=[
        "1 kg chicken wings",
        "1 tbsp olive oil",
        "1 tsp salt",
        "1 tsp black pepper",
        "1 tsp garlic powder",
        "1 tsp paprika"
    ],
    instructions=[
        "Pat chicken wings dry with paper towels",
        "Toss wings with olive oil and seasonings",
        "Place wings in air fryer basket in single layer",
        "Air fry at 200°C for 25 minutes, flipping halfway",
        "Check internal temp reaches 74°C with MEATER+",
        "Let rest 5 minutes before serving"
    ],
    prep_time_minutes=10,
    cook_time_minutes=25,
    servings=4,
    difficulty="easy",
    tips=[
        "Pat wings very dry for maximum crispiness",
        "Don't overcrowd the basket",
        "Flip halfway through for even cooking",
        "MEATER+ probe ensures perfect doneness"
    ],
    tags={"chicken", "dinner", "air-fried", "crispy"}
)


PRESSURE_COOKED_BEANS = UnifiedRecipe(
    id=5002,
    name="Quick Pressure Cooked Black Beans",
    description="Tender black beans cooked in 30 minutes with pressure cooker",
    required_features={"pressure_cook"},
    optional_features=set(),
    suggested_appliances=["instant_pot"],
    alternative_appliances=[["pressure_cooker"]],
    phases=[
        CookingPhase(
            feature_name="pressure_cook",
            temperature_c=120,
            temperature_f=248,
            duration_minutes=30,
            description="High Pressure"
        )
    ],
    use_probe=False,
    target_temp_c=None,
    target_temp_f=None,
    ingredients=[
        "500g dried black beans, rinsed",
        "6 cups water",
        "1 onion, quartered",
        "3 cloves garlic",
        "2 bay leaves",
        "1 tsp salt"
    ],
    instructions=[
        "Add beans, water, onion, garlic, and bay leaves to pressure cooker",
        "Close lid and set to high pressure",
        "Cook for 30 minutes",
        "Natural release for 10 minutes",
        "Season with salt after cooking"
    ],
    prep_time_minutes=5,
    cook_time_minutes=30,
    servings=8,
    difficulty="easy",
    tips=[
        "No need to soak beans when pressure cooking",
        "Natural release prevents bean skins from bursting",
        "Salt after cooking for tender beans"
    ],
    tags={"vegetarian", "vegan", "beans", "pressure-cooker"}
)


# Multi-Appliance Recipes

PERFECT_ROAST_CHICKEN = UnifiedRecipe(
    id=5010,
    name="Perfect Roast Chicken",
    description="Juicy roast chicken with crispy skin, monitored with MEATER+ probe",
    required_features={"oven", "temperature_probe"},
    optional_features={"convection"},
    suggested_appliances=["standard_oven", "meater_plus"],
    alternative_appliances=[
        ["ninja_combi"],  # Has both features
        ["multifry", "meater_plus"]  # Alternative combo
    ],
    phases=[
        CookingPhase(
            feature_name="roast",
            temperature_c=200,
            temperature_f=392,
            duration_minutes=75,
            description="Roast"
        )
    ],
    use_probe=True,
    target_temp_c=74,
    target_temp_f=165,
    ingredients=[
        "1.5 kg whole chicken",
        "2 tbsp olive oil",
        "2 tsp salt",
        "1 tsp black pepper",
        "1 lemon, halved",
        "4 cloves garlic",
        "Fresh herbs (thyme, rosemary)"
    ],
    instructions=[
        "Preheat oven to 200°C",
        "Pat chicken dry and rub with oil, salt, and pepper",
        "Stuff cavity with lemon, garlic, and herbs",
        "Insert MEATER+ probe into thickest part of thigh",
        "Roast until probe reads 74°C (about 75 minutes)",
        "System will auto-shutoff oven when target reached",
        "Let rest 10 minutes before carving"
    ],
    prep_time_minutes=15,
    cook_time_minutes=75,
    servings=4,
    difficulty="medium",
    tips=[
        "MEATER+ ensures perfect doneness every time",
        "Convection mode reduces cook time by ~10%",
        "Smart power outlet can auto-shutoff oven",
        "Let chicken rest to redistribute juices"
    ],
    tags={"chicken", "roast", "dinner", "meater"}
)


PAN_SEARED_STEAK = UnifiedRecipe(
    id=5011,
    name="Perfect Pan-Seared Steak",
    description="Restaurant-quality steak with MEATER+ precision",
    required_features={"pan_fry", "sear", "temperature_probe"},
    optional_features=set(),
    suggested_appliances=["stovetop", "meater_plus"],
    alternative_appliances=[["multifry", "meater_plus"]],
    phases=[
        CookingPhase(
            feature_name="sear",
            temperature_c=230,
            temperature_f=446,
            duration_minutes=8,
            description="High Heat Sear"
        )
    ],
    use_probe=True,
    target_temp_c=54,  # Medium rare
    target_temp_f=129,
    ingredients=[
        "2 ribeye steaks (250g each)",
        "2 tbsp vegetable oil",
        "Salt and pepper",
        "2 tbsp butter",
        "2 cloves garlic, crushed",
        "Fresh thyme sprigs"
    ],
    instructions=[
        "Remove steaks from fridge 30 minutes before cooking",
        "Pat dry and season generously with salt and pepper",
        "Insert MEATER+ probe into side of steak",
        "Heat pan over high heat until smoking",
        "Add oil and sear steaks 2-3 minutes per side",
        "Add butter, garlic, and thyme",
        "Baste steaks until MEATER+ reaches 54°C for medium rare",
        "Rest 5 minutes before serving"
    ],
    prep_time_minutes=5,
    cook_time_minutes=8,
    servings=2,
    difficulty="medium",
    tips=[
        "MEATER+ probe inserted from side for accuracy",
        "High heat is crucial for good sear",
        "Internal temp will rise 3-5°C during rest",
        "Adjust target temp for your preferred doneness"
    ],
    tags={"beef", "steak", "dinner", "meater", "stovetop"}
)


# Recipes with Alternative Appliances

CRISPY_FRIES = UnifiedRecipe(
    id=5020,
    name="Crispy French Fries",
    description="Golden crispy fries - works with multiple appliances",
    required_features={"air_fry"},  # Can be achieved multiple ways
    optional_features={"convection"},
    suggested_appliances=["ninja_combi"],
    alternative_appliances=[
        ["multifry"],
        ["standard_oven_with_convection"],
        ["air_fryer"]
    ],
    phases=[
        CookingPhase(
            feature_name="air_fry",
            temperature_c=200,
            temperature_f=392,
            duration_minutes=25,
            description="Air Fry"
        )
    ],
    use_probe=False,
    target_temp_c=None,
    target_temp_f=None,
    ingredients=[
        "1 kg potatoes, cut into fries",
        "2 tbsp olive oil",
        "1 tsp salt",
        "Optional: paprika, garlic powder"
    ],
    instructions=[
        "Soak cut potatoes in cold water for 30 minutes",
        "Pat completely dry",
        "Toss with oil and seasonings",
        "Air fry at 200°C for 25 minutes, shaking halfway",
        "Serve immediately"
    ],
    prep_time_minutes=35,
    cook_time_minutes=25,
    servings=4,
    difficulty="easy",
    tips=[
        "Soaking removes excess starch for crispier fries",
        "Completely dry potatoes before cooking",
        "Ninja Combi: Use Air Fry mode",
        "MultiFry: Will take +20% longer (MODIFIED)",
        "Convection oven: Works well with high temp"
    ],
    tags={"side-dish", "potatoes", "air-fried", "vegetarian"}
)


STEAMED_VEGETABLES = UnifiedRecipe(
    id=5021,
    name="Perfectly Steamed Vegetables",
    description="Healthy steamed veggies - multiple methods work",
    required_features={"steam"},
    optional_features=set(),
    suggested_appliances=["ninja_combi"],
    alternative_appliances=[
        ["stovetop"],  # With steamer basket
        ["microwave"]  # Steam in covered dish
    ],
    phases=[
        CookingPhase(
            feature_name="steam",
            temperature_c=100,
            temperature_f=212,
            duration_minutes=8,
            description="Steam"
        )
    ],
    use_probe=False,
    target_temp_c=None,
    target_temp_f=None,
    ingredients=[
        "500g mixed vegetables (broccoli, carrots, cauliflower)",
        "Salt and pepper",
        "Optional: butter, lemon"
    ],
    instructions=[
        "Cut vegetables into similar sizes",
        "Add to steamer basket",
        "Steam for 8-10 minutes until tender-crisp",
        "Season and serve"
    ],
    prep_time_minutes=10,
    cook_time_minutes=8,
    servings=4,
    difficulty="easy",
    tips=[
        "Ninja Combi: Perfect steam function",
        "Stovetop: Use steamer basket over boiling water",
        "Microwave: Add 2 tbsp water, cover, steam 5-7 min",
        "Don't overcook - should be bright and crisp"
    ],
    tags={"vegetables", "healthy", "side-dish", "vegetarian", "vegan"}
)


# Collection for easy access
ALL_EXAMPLE_RECIPES = [
    AIR_FRIED_WINGS,
    PRESSURE_COOKED_BEANS,
    PERFECT_ROAST_CHICKEN,
    PAN_SEARED_STEAK,
    CRISPY_FRIES,
    STEAMED_VEGETABLES,
]


def get_example_recipes():
    """Get all example recipes."""
    return ALL_EXAMPLE_RECIPES


def get_single_appliance_recipes():
    """Get recipes that need only one appliance."""
    return [
        AIR_FRIED_WINGS,
        PRESSURE_COOKED_BEANS,
    ]


def get_multi_appliance_recipes():
    """Get recipes that require multiple appliances."""
    return [
        PERFECT_ROAST_CHICKEN,
        PAN_SEARED_STEAK,
    ]


def get_recipes_with_alternatives():
    """Get recipes that can be made with different appliance combinations."""
    return [
        CRISPY_FRIES,
        STEAMED_VEGETABLES,
    ]
