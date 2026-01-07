"""
Ninja Combi SFP700EU cooking data for Kitchen Cooking Engine.

Last Updated: 7 Jan 2026
Last Change: Initial creation for Ninja Combi support

This module contains cooking modes, recipes, and guidelines specific to the
Ninja Combi (SFP700EU) multi-function oven.

The Ninja Combi combines multiple cooking methods:
- Convection oven
- Air fryer
- Steamer
- Proving oven
- Special combi modes (steam + another method)

DATA SOURCES:
- Ninja Combi SFP700EU official manual and recipe book
- Ninja Crispi recipes (compatible appliance)
- Professional chef adaptations for combi cooking
- Community-tested recipes
"""

from dataclasses import dataclass, field
from enum import Enum
from typing import Optional


class NinjaCombiMode(Enum):
    """Cooking modes available on the Ninja Combi SFP700EU."""
    
    # Standard modes (use existing recipes)
    CONVECTION = "convection"
    AIR_FRY = "air_fry"
    STEAM = "steam"
    PROVE = "prove"
    
    # Modified recipe modes
    SEAR = "sear"
    GRILL = "grill"
    RICE_PASTA = "rice_pasta"
    SLOW_COOK = "slow_cook"
    
    # Combi modes (signature features)
    COMBI_CRISP = "combi_crisp"  # Steam + Air Fry
    COMBI_BAKE = "combi_bake"    # Steam + Convection
    COMBI_ROAST = "combi_roast"  # Steam + Roast
    COMBI_MEAL = "combi_meal"    # Multi-tray cooking


class TrayPosition(Enum):
    """Tray positions in the Ninja Combi oven."""
    
    UPPER = 3   # Direct high heat, close to top element
    MIDDLE = 2  # Even heat distribution, most versatile
    LOWER = 1   # Maximum air circulation, crisper tray
    DRIP = 0    # Bottom drip tray (not for cooking)


@dataclass
class CookingPhase:
    """A single phase in a cooking program (for combi modes)."""
    
    mode: NinjaCombiMode
    temperature_c: int
    temperature_f: int
    duration_minutes: int
    description: str
    steam_enabled: bool = False


@dataclass
class NinjaCombiRecipe:
    """A recipe specifically designed for the Ninja Combi."""
    
    id: int
    name: str
    description: str
    mode: NinjaCombiMode
    tray_position: TrayPosition
    phases: list[CookingPhase] = field(default_factory=list)
    
    # Temperature monitoring (if using probe)
    use_probe: bool = False
    target_temp_c: Optional[int] = None
    target_temp_f: Optional[int] = None
    
    # Ingredients and instructions
    ingredients: list[str] = field(default_factory=list)
    instructions: list[str] = field(default_factory=list)
    
    # Metadata
    prep_time_minutes: int = 0
    cook_time_minutes: int = 0
    servings: int = 4
    difficulty: str = "medium"  # easy, medium, hard
    
    # Tips and notes
    tips: list[str] = field(default_factory=list)
    notes: str = ""


@dataclass
class NinjaCombiModeInfo:
    """Information about a specific Ninja Combi cooking mode."""
    
    mode: NinjaCombiMode
    name: str
    description: str
    typical_temp_range_c: tuple[int, int]
    typical_temp_range_f: tuple[int, int]
    typical_tray_positions: list[TrayPosition]
    use_standard_recipes: bool  # True if can use existing recipes
    requires_adaptation: bool   # True if recipes need modification
    is_combi_mode: bool        # True for signature combi modes
    water_tank_required: bool  # True if steam is involved
    preheat_required: bool
    instructions: str
    best_for: list[str] = field(default_factory=list)


# ============================================================================
# NINJA COMBI COOKING MODES
# ============================================================================

NINJA_COMBI_MODES = {
    NinjaCombiMode.CONVECTION: NinjaCombiModeInfo(
        mode=NinjaCombiMode.CONVECTION,
        name="Convection Oven",
        description="Fan-assisted oven cooking, works like standard convection oven",
        typical_temp_range_c=(150, 220),
        typical_temp_range_f=(300, 428),
        typical_tray_positions=[TrayPosition.MIDDLE],
        use_standard_recipes=True,
        requires_adaptation=False,
        is_combi_mode=False,
        water_tank_required=False,
        preheat_required=True,
        instructions="Use any standard oven recipe. Reduce temp by 10-20°C from conventional oven recipes.",
        best_for=["Roasting meats", "Baking", "General oven cooking", "Casseroles"],
    ),
    
    NinjaCombiMode.AIR_FRY: NinjaCombiModeInfo(
        mode=NinjaCombiMode.AIR_FRY,
        name="Air Fryer",
        description="Rapid hot air circulation for crispy results without oil",
        typical_temp_range_c=(175, 200),
        typical_temp_range_f=(347, 392),
        typical_tray_positions=[TrayPosition.LOWER],
        use_standard_recipes=True,
        requires_adaptation=False,
        is_combi_mode=False,
        water_tank_required=False,
        preheat_required=False,
        instructions="Use crisper tray for best air circulation. Don't overcrowd. Works exactly like standalone air fryers.",
        best_for=["Fries", "Wings", "Crispy vegetables", "Frozen foods", "Breaded items"],
    ),
    
    NinjaCombiMode.STEAM: NinjaCombiModeInfo(
        mode=NinjaCombiMode.STEAM,
        name="Steam",
        description="Pure steam cooking for healthy, moist results",
        typical_temp_range_c=(100, 100),
        typical_temp_range_f=(212, 212),
        typical_tray_positions=[TrayPosition.MIDDLE],
        use_standard_recipes=True,
        requires_adaptation=False,
        is_combi_mode=False,
        water_tank_required=True,
        preheat_required=False,
        instructions="Fill water tank to indicated level. Use steamer tray. Can add herbs to water for flavor.",
        best_for=["Vegetables", "Fish", "Dumplings", "Rice", "Seafood"],
    ),
    
    NinjaCombiMode.PROVE: NinjaCombiModeInfo(
        mode=NinjaCombiMode.PROVE,
        name="Proving",
        description="Low-temperature environment for dough rising",
        typical_temp_range_c=(30, 40),
        typical_temp_range_f=(86, 104),
        typical_tray_positions=[TrayPosition.MIDDLE],
        use_standard_recipes=True,
        requires_adaptation=False,
        is_combi_mode=False,
        water_tank_required=False,
        preheat_required=False,
        instructions="Place dough in bowl on middle rack. Maintains consistent warm temperature.",
        best_for=["Bread dough", "Pizza dough", "Pastry dough", "Yeast activation"],
    ),
    
    NinjaCombiMode.SEAR: NinjaCombiModeInfo(
        mode=NinjaCombiMode.SEAR,
        name="Sear/Sauté",
        description="High-heat searing in oven-safe pan",
        typical_temp_range_c=(230, 260),
        typical_temp_range_f=(446, 500),
        typical_tray_positions=[TrayPosition.LOWER],
        use_standard_recipes=False,
        requires_adaptation=True,
        is_combi_mode=False,
        water_tank_required=False,
        preheat_required=True,
        instructions="Use oven-safe pan on crisper tray. Preheat 5 minutes. Higher temp than stovetop, shorter time.",
        best_for=["Searing steaks", "Browning meat", "Quick vegetable sauté"],
    ),
    
    NinjaCombiMode.GRILL: NinjaCombiModeInfo(
        mode=NinjaCombiMode.GRILL,
        name="Grill",
        description="Direct high heat from top element for charring",
        typical_temp_range_c=(230, 260),
        typical_temp_range_f=(446, 500),
        typical_tray_positions=[TrayPosition.UPPER],
        use_standard_recipes=False,
        requires_adaptation=True,
        is_combi_mode=False,
        water_tank_required=False,
        preheat_required=True,
        instructions="Position food close to top element. Flip halfway. Watch carefully to prevent burning.",
        best_for=["Steaks with char", "Burgers", "Vegetables with char marks", "Browning tops"],
    ),
    
    NinjaCombiMode.RICE_PASTA: NinjaCombiModeInfo(
        mode=NinjaCombiMode.RICE_PASTA,
        name="Rice/Pasta Cooker",
        description="Sealed pot cooking for grains and pasta",
        typical_temp_range_c=(100, 100),
        typical_temp_range_f=(212, 212),
        typical_tray_positions=[TrayPosition.MIDDLE],
        use_standard_recipes=False,
        requires_adaptation=True,
        is_combi_mode=False,
        water_tank_required=False,
        preheat_required=False,
        instructions="Use sealed oven-safe pot with lid. Water ratios differ from stovetop. No stirring needed.",
        best_for=["Rice", "Pasta", "Quinoa", "Grains"],
    ),
    
    NinjaCombiMode.SLOW_COOK: NinjaCombiModeInfo(
        mode=NinjaCombiMode.SLOW_COOK,
        name="Slow Cook",
        description="Low-temperature braising and stewing",
        typical_temp_range_c=(85, 95),
        typical_temp_range_f=(185, 203),
        typical_tray_positions=[TrayPosition.LOWER],
        use_standard_recipes=False,
        requires_adaptation=True,
        is_combi_mode=False,
        water_tank_required=False,
        preheat_required=False,
        instructions="Use covered pot or Dutch oven. Less evaporation than stovetop. Extended cook times 4-8 hours.",
        best_for=["Stews", "Braised meats", "Pot roasts", "Pulled pork"],
    ),
    
    # Combi modes (signature features)
    
    NinjaCombiMode.COMBI_CRISP: NinjaCombiModeInfo(
        mode=NinjaCombiMode.COMBI_CRISP,
        name="Combi-Crisp (Steam + Air Fry)",
        description="Steams first for moist interior, then air fries for crispy exterior",
        typical_temp_range_c=(100, 200),
        typical_temp_range_f=(212, 392),
        typical_tray_positions=[TrayPosition.LOWER],
        use_standard_recipes=False,
        requires_adaptation=True,
        is_combi_mode=True,
        water_tank_required=True,
        preheat_required=False,
        instructions="Phase 1: Steam 100°C for 10-15 min. Phase 2: Air Fry 200°C for 8-12 min. Use crisper tray.",
        best_for=["Chicken thighs", "Root vegetables", "Fish with crispy skin", "Frozen foods"],
    ),
    
    NinjaCombiMode.COMBI_BAKE: NinjaCombiModeInfo(
        mode=NinjaCombiMode.COMBI_BAKE,
        name="Combi-Bake (Steam + Convection)",
        description="Adds steam during baking for professional bakery results",
        typical_temp_range_c=(180, 220),
        typical_temp_range_f=(356, 428),
        typical_tray_positions=[TrayPosition.MIDDLE],
        use_standard_recipes=False,
        requires_adaptation=True,
        is_combi_mode=True,
        water_tank_required=True,
        preheat_required=True,
        instructions="Phase 1: Steam + Bake for initial rise. Phase 2: Bake only for browning. Creates better crust.",
        best_for=["Artisan bread", "Dinner rolls", "Pastries", "Crusty baked goods"],
    ),
    
    NinjaCombiMode.COMBI_ROAST: NinjaCombiModeInfo(
        mode=NinjaCombiMode.COMBI_ROAST,
        name="Combi-Roast (Steam + Roast)",
        description="Steam keeps meat moist while roasting creates browning",
        typical_temp_range_c=(160, 200),
        typical_temp_range_f=(320, 392),
        typical_tray_positions=[TrayPosition.MIDDLE],
        use_standard_recipes=False,
        requires_adaptation=True,
        is_combi_mode=True,
        water_tank_required=True,
        preheat_required=False,
        instructions="Phase 1: Steam + Roast for main cook. Phase 2: Roast only for final browning. Keeps meat juicy.",
        best_for=["Pork roasts", "Whole chicken", "Beef roasts", "Turkey breast"],
    ),
    
    NinjaCombiMode.COMBI_MEAL: NinjaCombiModeInfo(
        mode=NinjaCombiMode.COMBI_MEAL,
        name="Combi-Meal (Multi-Layer)",
        description="Cook complete meals on multiple trays simultaneously",
        typical_temp_range_c=(100, 200),
        typical_temp_range_f=(212, 392),
        typical_tray_positions=[TrayPosition.LOWER, TrayPosition.MIDDLE, TrayPosition.UPPER],
        use_standard_recipes=False,
        requires_adaptation=True,
        is_combi_mode=True,
        water_tank_required=True,
        preheat_required=False,
        instructions="Multi-phase program. Protein on middle, vegetables on upper, grains on lower. Everything ready together.",
        best_for=["One-pan dinners", "Protein + sides", "Complete meals", "Meal prep"],
    ),
}


# ============================================================================
# NINJA COMBI RECIPES
# ============================================================================

NINJA_COMBI_RECIPES = [
    # Combi-Crisp recipes
    NinjaCombiRecipe(
        id=1001,
        name="Combi-Crisp Chicken Thighs",
        description="Juicy chicken with perfectly crispy skin using steam then air fry",
        mode=NinjaCombiMode.COMBI_CRISP,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.STEAM,
                temperature_c=100,
                temperature_f=212,
                duration_minutes=12,
                description="Steam to cook through and keep moist",
                steam_enabled=True,
            ),
            CookingPhase(
                mode=NinjaCombiMode.AIR_FRY,
                temperature_c=200,
                temperature_f=392,
                duration_minutes=10,
                description="Air fry to crisp the skin",
                steam_enabled=False,
            ),
        ],
        use_probe=True,
        target_temp_c=74,
        target_temp_f=165,
        ingredients=[
            "4 chicken thighs with skin",
            "1 tbsp olive oil",
            "1 tsp garlic powder",
            "1 tsp paprika",
            "Salt and pepper to taste",
        ],
        instructions=[
            "Pat chicken thighs dry with paper towel",
            "Season both sides with spices, salt, and pepper",
            "Brush skin lightly with olive oil",
            "Place skin-side up on crisper tray",
            "Fill water tank",
            "Run Combi-Crisp program",
            "Check internal temperature reaches 74°C (165°F)",
            "Let rest 5 minutes before serving",
        ],
        prep_time_minutes=10,
        cook_time_minutes=22,
        servings=4,
        difficulty="easy",
        tips=[
            "Pat chicken completely dry for crispiest skin",
            "Don't overcrowd the tray - leave space between pieces",
            "For extra crispy skin, increase air fry phase by 2-3 minutes",
        ],
        notes="This is the signature Ninja Combi recipe that shows off the appliance's unique capability.",
    ),
    
    NinjaCombiRecipe(
        id=1002,
        name="Combi-Crisp Root Vegetables",
        description="Tender inside, caramelized outside root vegetables",
        mode=NinjaCombiMode.COMBI_CRISP,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.STEAM,
                temperature_c=100,
                temperature_f=212,
                duration_minutes=10,
                description="Steam to tenderize",
                steam_enabled=True,
            ),
            CookingPhase(
                mode=NinjaCombiMode.AIR_FRY,
                temperature_c=200,
                temperature_f=392,
                duration_minutes=12,
                description="Air fry to caramelize",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "500g mixed root vegetables (carrots, parsnips, potatoes)",
            "2 tbsp olive oil",
            "2 cloves garlic, minced",
            "1 tsp dried thyme",
            "Salt and pepper",
        ],
        instructions=[
            "Cut vegetables into 2-3 cm chunks (similar sizes)",
            "Toss with olive oil, garlic, thyme, salt, and pepper",
            "Spread in single layer on crisper tray",
            "Fill water tank",
            "Run Combi-Crisp program",
            "Shake tray halfway through air fry phase",
        ],
        prep_time_minutes=15,
        cook_time_minutes=22,
        servings=4,
        difficulty="easy",
        tips=[
            "Cut vegetables to uniform size for even cooking",
            "Don't skip the shake halfway through air fry phase",
            "Add fresh herbs after cooking for bright flavor",
        ],
    ),
    
    # Combi-Bake recipes
    NinjaCombiRecipe(
        id=1003,
        name="Combi-Bake Artisan Bread",
        description="Professional crusty bread with steam injection",
        mode=NinjaCombiMode.COMBI_BAKE,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.CONVECTION,
                temperature_c=220,
                temperature_f=428,
                duration_minutes=15,
                description="Steam + bake for oven spring and crust development",
                steam_enabled=True,
            ),
            CookingPhase(
                mode=NinjaCombiMode.CONVECTION,
                temperature_c=200,
                temperature_f=392,
                duration_minutes=20,
                description="Bake to finish and brown",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "500g bread flour",
            "350ml warm water",
            "10g salt",
            "7g instant yeast",
            "Olive oil for greasing",
        ],
        instructions=[
            "Mix flour, salt, and yeast",
            "Add water and knead 10 minutes until smooth",
            "Let rise in Prove mode (35°C) for 1 hour until doubled",
            "Shape into loaf and score top",
            "Preheat oven with steam",
            "Place loaf on middle rack",
            "Run Combi-Bake program",
            "Bread should sound hollow when tapped",
            "Cool on wire rack before slicing",
        ],
        prep_time_minutes=90,  # Including rise time
        cook_time_minutes=35,
        servings=8,
        difficulty="medium",
        tips=[
            "Don't skip the steam phase - it creates the crispy crust",
            "Score the top just before baking for proper expansion",
            "Bread is done when internal temp reaches 95°C",
        ],
        notes="The steam phase mimics professional bread ovens, creating artisan-quality results at home.",
    ),
    
    # Combi-Roast recipes
    NinjaCombiRecipe(
        id=1004,
        name="Combi-Roast Whole Chicken",
        description="Moist, evenly cooked chicken with golden skin",
        mode=NinjaCombiMode.COMBI_ROAST,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.CONVECTION,
                temperature_c=160,
                temperature_f=320,
                duration_minutes=50,
                description="Steam + roast for moist, even cooking",
                steam_enabled=True,
            ),
            CookingPhase(
                mode=NinjaCombiMode.CONVECTION,
                temperature_c=200,
                temperature_f=392,
                duration_minutes=10,
                description="High heat to crisp skin",
                steam_enabled=False,
            ),
        ],
        use_probe=True,
        target_temp_c=74,
        target_temp_f=165,
        ingredients=[
            "1 whole chicken (1.5-2 kg)",
            "2 tbsp butter, softened",
            "2 cloves garlic, minced",
            "1 lemon, quartered",
            "Fresh herbs (thyme, rosemary)",
            "Salt and pepper",
        ],
        instructions=[
            "Pat chicken dry inside and out",
            "Mix butter with garlic, salt, and pepper",
            "Rub butter mixture under and over skin",
            "Stuff cavity with lemon and herbs",
            "Truss legs with kitchen string",
            "Place on middle rack with drip tray below",
            "Fill water tank",
            "Run Combi-Roast program",
            "Check thickest part of thigh reaches 74°C (165°F)",
            "Rest 15 minutes before carving",
        ],
        prep_time_minutes=15,
        cook_time_minutes=60,
        servings=4,
        difficulty="medium",
        tips=[
            "Use a meat thermometer to ensure doneness",
            "Don't skip the resting time - juices redistribute",
            "Save drippings from drip tray for gravy",
        ],
        notes="The steam phase keeps the breast meat moist while ensuring the dark meat cooks through.",
    ),
    
    NinjaCombiRecipe(
        id=1005,
        name="Combi-Roast Pork Loin",
        description="Tender pork loin that stays juicy",
        mode=NinjaCombiMode.COMBI_ROAST,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.CONVECTION,
                temperature_c=160,
                temperature_f=320,
                duration_minutes=40,
                description="Steam + roast to keep moist",
                steam_enabled=True,
            ),
            CookingPhase(
                mode=NinjaCombiMode.CONVECTION,
                temperature_c=200,
                temperature_f=392,
                duration_minutes=10,
                description="Brown the exterior",
                steam_enabled=False,
            ),
        ],
        use_probe=True,
        target_temp_c=63,
        target_temp_f=145,
        ingredients=[
            "1 kg pork loin roast",
            "3 cloves garlic, sliced",
            "2 tbsp olive oil",
            "1 tbsp fresh rosemary, chopped",
            "1 tsp fennel seeds",
            "Salt and pepper",
        ],
        instructions=[
            "Make small cuts in pork and insert garlic slices",
            "Rub with olive oil, rosemary, fennel, salt, and pepper",
            "Let sit 30 minutes at room temperature",
            "Place on middle rack with drip tray below",
            "Fill water tank",
            "Run Combi-Roast program",
            "Check internal temperature reaches 63°C (145°F)",
            "Rest 10 minutes before slicing",
        ],
        prep_time_minutes=40,
        cook_time_minutes=50,
        servings=6,
        difficulty="easy",
        tips=[
            "Don't overcook - pork is safe at 63°C and stays juicy",
            "Slice against the grain for tender pieces",
            "Leftovers make great sandwiches",
        ],
    ),
    
    # Combi-Meal recipes
    NinjaCombiRecipe(
        id=1006,
        name="Combi-Meal: Salmon with Vegetables and Rice",
        description="Complete meal cooked simultaneously on multiple trays",
        mode=NinjaCombiMode.COMBI_MEAL,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.STEAM,
                temperature_c=100,
                temperature_f=212,
                duration_minutes=20,
                description="Steam rice and start cooking salmon",
                steam_enabled=True,
            ),
            CookingPhase(
                mode=NinjaCombiMode.AIR_FRY,
                temperature_c=180,
                temperature_f=356,
                duration_minutes=8,
                description="Finish salmon and crisp vegetables",
                steam_enabled=False,
            ),
        ],
        use_probe=True,
        target_temp_c=54,
        target_temp_f=130,
        ingredients=[
            "4 salmon fillets (150g each)",
            "1 cup jasmine rice",
            "1.5 cups water",
            "300g broccoli florets",
            "200g cherry tomatoes",
            "2 tbsp olive oil",
            "Lemon wedges",
            "Salt, pepper, dill",
        ],
        instructions=[
            "Lower rack: Place rice and water in covered oven-safe pot",
            "Middle rack: Season salmon with salt, pepper, and dill",
            "Upper rack: Toss vegetables with olive oil, salt, and pepper",
            "Fill water tank",
            "Run Combi-Meal program",
            "Check salmon internal temp reaches 54°C (130°F) for medium",
            "Serve with lemon wedges",
        ],
        prep_time_minutes=15,
        cook_time_minutes=28,
        servings=4,
        difficulty="medium",
        tips=[
            "Use a covered pot for rice to trap steam",
            "Don't overcrowd vegetable tray",
            "Salmon can be cooked to 60°C (140°F) if preferred well-done",
        ],
        notes="This showcases the Ninja Combi's ability to cook a complete meal at once, saving time and dishes.",
    ),
    
    # Standard mode recipes (for reference)
    NinjaCombiRecipe(
        id=1007,
        name="Air Fryer Chicken Wings",
        description="Crispy wings without deep frying",
        mode=NinjaCombiMode.AIR_FRY,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.AIR_FRY,
                temperature_c=200,
                temperature_f=392,
                duration_minutes=25,
                description="Air fry until crispy",
                steam_enabled=False,
            ),
        ],
        use_probe=True,
        target_temp_c=74,
        target_temp_f=165,
        ingredients=[
            "1 kg chicken wings",
            "1 tbsp baking powder (for crispy skin)",
            "1 tsp garlic powder",
            "1 tsp paprika",
            "Salt and pepper",
            "Your favorite wing sauce",
        ],
        instructions=[
            "Pat wings completely dry",
            "Toss with baking powder and spices",
            "Arrange in single layer on crisper tray",
            "Air fry 200°C for 25 minutes",
            "Flip wings halfway through",
            "Toss with sauce after cooking",
        ],
        prep_time_minutes=10,
        cook_time_minutes=25,
        servings=4,
        difficulty="easy",
        tips=[
            "Baking powder helps create extra crispy skin",
            "Don't overcrowd - cook in batches if needed",
            "For extra crispy, add 3-5 minutes to cooking time",
        ],
    ),
    
    NinjaCombiRecipe(
        id=1008,
        name="Steam Broccoli and Carrots",
        description="Perfectly steamed vegetables that retain nutrients",
        mode=NinjaCombiMode.STEAM,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.STEAM,
                temperature_c=100,
                temperature_f=212,
                duration_minutes=12,
                description="Steam until tender-crisp",
                steam_enabled=True,
            ),
        ],
        use_probe=False,
        ingredients=[
            "300g broccoli florets",
            "200g carrots, sliced",
            "1 tbsp butter",
            "Salt and pepper",
            "Lemon juice",
        ],
        instructions=[
            "Cut broccoli and carrots to similar sizes",
            "Place on steamer tray",
            "Fill water tank",
            "Steam for 12 minutes",
            "Toss with butter, salt, pepper, and lemon juice",
        ],
        prep_time_minutes=10,
        cook_time_minutes=12,
        servings=4,
        difficulty="easy",
        tips=[
            "Don't overcook - vegetables should still have bite",
            "Add fresh herbs after steaming",
            "Can add garlic or ginger to water tank for flavor",
        ],
    ),
]


def get_ninja_combi_mode_info(mode: NinjaCombiMode) -> NinjaCombiModeInfo:
    """Get information about a specific Ninja Combi mode."""
    return NINJA_COMBI_MODES.get(mode)


def get_all_ninja_combi_modes() -> list[NinjaCombiModeInfo]:
    """Get all Ninja Combi cooking modes."""
    return list(NINJA_COMBI_MODES.values())


def get_ninja_combi_recipes(mode: Optional[NinjaCombiMode] = None) -> list[NinjaCombiRecipe]:
    """Get Ninja Combi recipes, optionally filtered by mode."""
    if mode is None:
        return NINJA_COMBI_RECIPES
    return [recipe for recipe in NINJA_COMBI_RECIPES if recipe.mode == mode]


def get_ninja_combi_recipe_by_id(recipe_id: int) -> Optional[NinjaCombiRecipe]:
    """Get a specific Ninja Combi recipe by ID."""
    for recipe in NINJA_COMBI_RECIPES:
        if recipe.id == recipe_id:
            return recipe
    return None


def is_combi_mode(mode: NinjaCombiMode) -> bool:
    """Check if a mode is a signature combi mode (multi-phase)."""
    mode_info = NINJA_COMBI_MODES.get(mode)
    return mode_info.is_combi_mode if mode_info else False


def requires_water_tank(mode: NinjaCombiMode) -> bool:
    """Check if a mode requires the water tank to be filled."""
    mode_info = NINJA_COMBI_MODES.get(mode)
    return mode_info.water_tank_required if mode_info else False


def get_standard_modes() -> list[NinjaCombiMode]:
    """Get modes that work with standard recipes (no adaptation needed)."""
    return [
        mode for mode, info in NINJA_COMBI_MODES.items()
        if info.use_standard_recipes
    ]


def get_adapted_modes() -> list[NinjaCombiMode]:
    """Get modes that require recipe adaptation."""
    return [
        mode for mode, info in NINJA_COMBI_MODES.items()
        if info.requires_adaptation
    ]


def get_combi_modes() -> list[NinjaCombiMode]:
    """Get signature combi modes (multi-phase cooking)."""
    return [
        mode for mode, info in NINJA_COMBI_MODES.items()
        if info.is_combi_mode
    ]
