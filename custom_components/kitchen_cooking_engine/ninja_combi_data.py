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
    
    # Sear mode recipes
    NinjaCombiRecipe(
        id=1009,
        name="Oven-Seared Ribeye Steak",
        description="Perfect sear in the oven without stovetop",
        mode=NinjaCombiMode.SEAR,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.SEAR,
                temperature_c=260,
                temperature_f=500,
                duration_minutes=8,
                description="Sear to develop crust",
                steam_enabled=False,
            ),
        ],
        use_probe=True,
        target_temp_c=54,
        target_temp_f=130,
        ingredients=[
            "2 ribeye steaks (2.5 cm thick)",
            "2 tbsp vegetable oil (high smoke point)",
            "Coarse salt and black pepper",
            "2 cloves garlic, crushed",
            "Fresh rosemary sprigs",
            "2 tbsp butter",
        ],
        instructions=[
            "Pat steaks completely dry",
            "Season generously with salt and pepper",
            "Let sit at room temperature for 30 minutes",
            "Preheat oven in Sear mode to 260°C for 5 minutes",
            "Add oil to oven-safe cast iron pan",
            "Place pan on crisper tray in lower position",
            "Sear steaks 3-4 minutes first side",
            "Flip, add butter, garlic, and rosemary",
            "Sear 3-4 minutes second side",
            "Check internal temp reaches 54°C for medium-rare",
            "Rest 5 minutes before serving",
        ],
        prep_time_minutes=35,
        cook_time_minutes=8,
        servings=2,
        difficulty="medium",
        tips=[
            "Cast iron pan works best for even heat",
            "Don't move steaks while searing - let crust develop",
            "Add 1-2 minutes per side for medium (60°C)",
            "Baste with butter in last minute for extra flavor",
        ],
        notes="This technique mimics restaurant-style searing but in your oven. Higher heat than stovetop.",
    ),
    
    # Grill mode recipes
    NinjaCombiRecipe(
        id=1010,
        name="Grilled Vegetable Platter",
        description="Charred vegetables with smoky flavor",
        mode=NinjaCombiMode.GRILL,
        tray_position=TrayPosition.UPPER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.GRILL,
                temperature_c=240,
                temperature_f=464,
                duration_minutes=15,
                description="Grill until charred",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "1 zucchini, sliced lengthwise",
            "1 red bell pepper, quartered",
            "1 yellow bell pepper, quartered",
            "1 red onion, cut in thick rounds",
            "200g cherry tomatoes on the vine",
            "3 tbsp olive oil",
            "2 cloves garlic, minced",
            "1 tbsp balsamic vinegar",
            "Salt, pepper, and Italian herbs",
        ],
        instructions=[
            "Preheat grill mode to 240°C",
            "Mix oil, garlic, vinegar, herbs, salt, and pepper",
            "Brush vegetables with oil mixture",
            "Arrange on grill tray in upper position",
            "Grill 8 minutes",
            "Flip vegetables",
            "Grill 7 more minutes until charred",
            "Serve warm or at room temperature",
        ],
        prep_time_minutes=15,
        cook_time_minutes=15,
        servings=4,
        difficulty="easy",
        tips=[
            "Cut vegetables similar thickness for even cooking",
            "Watch carefully to prevent burning",
            "Char adds flavor but don't overdo it",
            "Great for meal prep - keeps well in fridge",
        ],
    ),
    
    NinjaCombiRecipe(
        id=1011,
        name="Grilled Lamb Chops",
        description="Juicy lamb chops with grill marks",
        mode=NinjaCombiMode.GRILL,
        tray_position=TrayPosition.UPPER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.GRILL,
                temperature_c=250,
                temperature_f=482,
                duration_minutes=12,
                description="Grill to desired doneness",
                steam_enabled=False,
            ),
        ],
        use_probe=True,
        target_temp_c=54,
        target_temp_f=130,
        ingredients=[
            "8 lamb chops (2 cm thick)",
            "3 tbsp olive oil",
            "4 cloves garlic, minced",
            "2 tbsp fresh rosemary, chopped",
            "1 tbsp fresh thyme, chopped",
            "Zest of 1 lemon",
            "Salt and pepper",
        ],
        instructions=[
            "Combine oil, garlic, herbs, lemon zest, salt, and pepper",
            "Marinate lamb chops 2-4 hours (or overnight)",
            "Let come to room temperature 30 minutes before cooking",
            "Preheat grill mode to 250°C",
            "Pat chops dry (leave marinade herbs)",
            "Place on grill tray in upper position",
            "Grill 6 minutes first side",
            "Flip and grill 6 minutes second side",
            "Check internal temp 54°C for medium-rare",
            "Rest 5 minutes before serving",
        ],
        prep_time_minutes=150,  # Including marinating
        cook_time_minutes=12,
        servings=4,
        difficulty="medium",
        tips=[
            "Don't skip the marinating time",
            "Lamb is best medium-rare to medium",
            "Use meat thermometer for perfect doneness",
            "Serve with mint sauce or yogurt sauce",
        ],
    ),
    
    # Rice/Pasta mode recipes
    NinjaCombiRecipe(
        id=1012,
        name="Perfect Japanese Rice",
        description="Fluffy rice cooked in sealed pot",
        mode=NinjaCombiMode.RICE_PASTA,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.RICE_PASTA,
                temperature_c=100,
                temperature_f=212,
                duration_minutes=25,
                description="Cook rice in sealed pot",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "2 cups Japanese short-grain rice",
            "2.5 cups water",
            "1 tsp rice vinegar (optional)",
            "Pinch of salt",
        ],
        instructions=[
            "Rinse rice 3-4 times until water runs clear",
            "Place rice and water in oven-safe pot with tight-fitting lid",
            "Add vinegar and salt if using",
            "Place covered pot on middle rack",
            "Cook at 100°C for 25 minutes",
            "Let rest covered for 10 minutes (don't open lid!)",
            "Fluff with rice paddle before serving",
        ],
        prep_time_minutes=10,
        cook_time_minutes=35,  # Including rest time
        servings=6,
        difficulty="easy",
        tips=[
            "Rinsing removes excess starch for fluffy rice",
            "Don't open lid during cooking - steam escapes",
            "Ratio is 1:1.25 rice to water (different from stovetop)",
            "Works for any short or medium grain rice",
        ],
        notes="The sealed pot method in the oven gives perfectly cooked rice every time.",
    ),
    
    NinjaCombiRecipe(
        id=1013,
        name="One-Pot Pasta Primavera",
        description="Pasta cooked with vegetables in one pot",
        mode=NinjaCombiMode.RICE_PASTA,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.RICE_PASTA,
                temperature_c=100,
                temperature_f=212,
                duration_minutes=20,
                description="Cook pasta and vegetables together",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "300g penne pasta",
            "4 cups vegetable broth",
            "200g cherry tomatoes, halved",
            "1 zucchini, diced",
            "1 red bell pepper, diced",
            "3 cloves garlic, minced",
            "100g frozen peas",
            "2 tbsp olive oil",
            "50g Parmesan cheese, grated",
            "Fresh basil",
            "Salt and pepper",
        ],
        instructions=[
            "Combine pasta, broth, tomatoes, zucchini, pepper, and garlic in large oven-safe pot",
            "Drizzle with olive oil, season with salt and pepper",
            "Cover tightly with lid or foil",
            "Place on middle rack",
            "Cook at 100°C for 20 minutes",
            "Remove from oven, stir in peas",
            "Let sit covered 2 minutes",
            "Stir in Parmesan and basil",
            "Adjust seasoning and serve",
        ],
        prep_time_minutes=15,
        cook_time_minutes=22,
        servings=4,
        difficulty="easy",
        tips=[
            "Use oven-safe pot with tight lid",
            "Don't peek during cooking",
            "Pasta will absorb liquid and create creamy sauce",
            "Add more broth if needed for saucier result",
        ],
    ),
    
    # Slow Cook mode recipes
    NinjaCombiRecipe(
        id=1014,
        name="Slow-Cooked Beef Stew",
        description="Tender beef stew with vegetables",
        mode=NinjaCombiMode.SLOW_COOK,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.SLOW_COOK,
                temperature_c=90,
                temperature_f=194,
                duration_minutes=300,  # 5 hours
                description="Slow cook until tender",
                steam_enabled=False,
            ),
        ],
        use_probe=True,
        target_temp_c=93,
        target_temp_f=200,
        ingredients=[
            "1 kg beef chuck, cut in 4cm cubes",
            "4 carrots, cut in chunks",
            "3 potatoes, cut in chunks",
            "2 onions, quartered",
            "3 celery stalks, chopped",
            "4 cloves garlic, minced",
            "2 cups beef broth",
            "1 cup red wine",
            "3 tbsp tomato paste",
            "2 bay leaves",
            "Fresh thyme",
            "2 tbsp flour",
            "Salt and pepper",
        ],
        instructions=[
            "Season beef with salt, pepper, and flour",
            "Brown beef in pan on stovetop (optional but recommended)",
            "Place beef in large Dutch oven or covered pot",
            "Add vegetables, garlic, tomato paste, broth, wine, bay leaves, and thyme",
            "Cover tightly with lid",
            "Place on lower rack",
            "Slow cook at 90°C for 5 hours",
            "Check beef is fork-tender",
            "Remove bay leaves and adjust seasoning",
            "Let rest 10 minutes before serving",
        ],
        prep_time_minutes=30,
        cook_time_minutes=300,
        servings=6,
        difficulty="easy",
        tips=[
            "Browning beef first adds depth of flavor",
            "Cut vegetables in large chunks - they cook for hours",
            "Check at 4 hours if using smaller beef pieces",
            "Stew tastes even better the next day",
        ],
        notes="Low oven temperature creates melt-in-your-mouth tender beef.",
    ),
    
    NinjaCombiRecipe(
        id=1015,
        name="Slow-Cooked Pulled Pork",
        description="Fall-apart tender pork shoulder",
        mode=NinjaCombiMode.SLOW_COOK,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.SLOW_COOK,
                temperature_c=95,
                temperature_f=203,
                duration_minutes=360,  # 6 hours
                description="Slow cook until shreddable",
                steam_enabled=False,
            ),
        ],
        use_probe=True,
        target_temp_c=93,
        target_temp_f=200,
        ingredients=[
            "2 kg pork shoulder",
            "2 onions, sliced",
            "1 cup apple cider vinegar",
            "1 cup chicken broth",
            "3 tbsp brown sugar",
            "2 tbsp paprika",
            "1 tbsp garlic powder",
            "1 tbsp onion powder",
            "1 tsp cumin",
            "1 tsp chili powder",
            "Salt and pepper",
            "BBQ sauce for serving",
        ],
        instructions=[
            "Mix dry spices (paprika, garlic powder, onion powder, cumin, chili, salt, pepper)",
            "Rub spice mix all over pork shoulder",
            "Place onions in bottom of Dutch oven",
            "Place pork on top of onions",
            "Mix vinegar, broth, and brown sugar, pour around pork",
            "Cover tightly with lid",
            "Place on lower rack",
            "Slow cook at 95°C for 6 hours",
            "Pork should be fall-apart tender (93°C internal temp)",
            "Remove from pot, shred with forks",
            "Mix with cooking liquid and BBQ sauce",
        ],
        prep_time_minutes=20,
        cook_time_minutes=360,
        servings=8,
        difficulty="easy",
        tips=[
            "Pork shoulder is the best cut for pulled pork",
            "Don't rush - low and slow is key",
            "Save cooking liquid - it's full of flavor",
            "Great for sandwiches, tacos, or bowls",
        ],
    ),
    
    # Combi-Crisp roasted potatoes recipe
    NinjaCombiRecipe(
        id=1016,
        name="Combi-Crisp Roasted Potatoes",
        description="Perfectly tender inside with ultra-crispy outside using steam then air fry",
        mode=NinjaCombiMode.COMBI_CRISP,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.STEAM,
                temperature_c=100,
                temperature_f=212,
                duration_minutes=15,
                description="Steam to cook through and fluff up",
                steam_enabled=True,
            ),
            CookingPhase(
                mode=NinjaCombiMode.AIR_FRY,
                temperature_c=200,
                temperature_f=392,
                duration_minutes=20,
                description="Air fry for ultra-crispy exterior",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "1.5 kg potatoes (Yukon Gold or Russet)",
            "4 tbsp olive oil or duck fat",
            "4 cloves garlic, unpeeled and crushed",
            "4 sprigs fresh rosemary",
            "Coarse sea salt",
            "Black pepper",
        ],
        instructions=[
            "Peel and cut potatoes into 3-4cm chunks",
            "Toss potatoes with oil, garlic, rosemary, salt, and pepper",
            "Spread in single layer on crisper tray",
            "Place on lower rack",
            "Fill water tank",
            "Run Combi-Crisp program (Steam 15 min → Air Fry 20 min)",
            "Shake tray once during air fry phase for even crisping",
            "Potatoes will be fluffy inside with ultra-crispy exterior",
        ],
        prep_time_minutes=10,
        cook_time_minutes=35,
        servings=6,
        difficulty="easy",
        tips=[
            "No parboiling needed - steam phase handles it perfectly",
            "Combi-Crisp gives better results than traditional roasting",
            "Cut potatoes uniform size for even cooking",
            "Use crisper tray for maximum air circulation",
            "These are crispier than traditional oven-roasted potatoes",
        ],
        notes="Combi-Crisp mode makes these significantly better than traditional roasting - the steam phase ensures fluffy interiors while air fry creates unmatched crispiness.",
    ),
    
    # Prove mode recipe
    NinjaCombiRecipe(
        id=1017,
        name="Soft Dinner Rolls",
        description="Fluffy dinner rolls with perfect rise",
        mode=NinjaCombiMode.PROVE,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.PROVE,
                temperature_c=35,
                temperature_f=95,
                duration_minutes=60,
                description="First rise",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "500g all-purpose flour",
            "7g instant yeast",
            "50g sugar",
            "10g salt",
            "50g butter, softened",
            "1 egg",
            "250ml warm milk",
            "Egg wash (1 egg + 1 tbsp milk)",
        ],
        instructions=[
            "Mix flour, yeast, sugar, and salt",
            "Add butter, egg, and warm milk",
            "Knead 8-10 minutes until smooth and elastic",
            "Place dough in greased bowl",
            "Cover with damp towel",
            "Prove in oven at 35°C for 60 minutes (should double)",
            "Punch down and divide into 12 equal pieces",
            "Shape into rolls and place in baking dish",
            "Prove again for 30 minutes (or room temp covered)",
            "Brush with egg wash",
            "Bake in Convection mode at 180°C for 20 minutes",
            "Brush with melted butter while warm",
        ],
        prep_time_minutes=30,
        cook_time_minutes=110,  # Including both proves and baking
        servings=12,
        difficulty="medium",
        tips=[
            "Prove mode maintains perfect temperature for yeast",
            "Dough should double in size during first rise",
            "Don't skip the egg wash - it makes them golden",
            "Best served warm from the oven",
        ],
        notes="The Prove mode eliminates guesswork for perfect bread rising.",
    ),
    
    # ========================================================================
    # RECIPES FROM NINJA COMBI USER MANUAL
    # ========================================================================
    
    # Spinach & Cheddar Quiche (Page 10)
    NinjaCombiRecipe(
        id=1018,
        name="Spinach & Cheddar Quiche",
        description="Creamy egg custard with spinach and cheese in flaky crust",
        mode=NinjaCombiMode.COMBI_BAKE,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.COMBI_BAKE,
                temperature_c=177,
                temperature_f=350,
                duration_minutes=25,
                description="Steam + bake for perfect custard set",
                steam_enabled=True,
            ),
        ],
        use_probe=False,
        ingredients=[
            "1 refrigerated pie crust",
            "6 large eggs",
            "1 cup heavy cream",
            "1 cup milk",
            "2 cups fresh spinach, chopped",
            "1.5 cups shredded cheddar cheese",
            "1/2 tsp salt",
            "1/4 tsp black pepper",
            "1/4 tsp nutmeg",
            "1/2 cup water (for steaming)",
        ],
        instructions=[
            "Pour 1/2 cup water in Combi Cooker Pan for steaming",
            "Place Crisper Plate on top of water",
            "Press refrigerated pie crust into 9-inch pie dish",
            "In a bowl, whisk eggs, cream, milk, salt, pepper, and nutmeg",
            "Add spinach and 1 cup cheddar to egg mixture",
            "Pour mixture into pie crust",
            "Top with remaining 1/2 cup cheddar",
            "Place pie dish on Crisper Plate",
            "Slide pan into Level 1",
            "Select COMBI BAKE, 350°F, 25 minutes",
            "Unit will steam for 20 minutes before baking",
            "When done, eggs should be set with slight jiggle in center",
            "Let cool 10 minutes before slicing",
        ],
        prep_time_minutes=15,
        cook_time_minutes=25,
        servings=8,
        difficulty="easy",
        tips=[
            "Steam phase creates silky, creamy custard",
            "Don't overbake - slight jiggle is perfect",
            "Can substitute any cheese or vegetables",
            "Great for breakfast, brunch, or dinner",
        ],
        notes="Combi-Bake creates restaurant-quality quiche with perfect texture.",
    ),
    
    # "Fried" Rice (Page 11)
    NinjaCombiRecipe(
        id=1019,
        name='"Fried" Rice',
        description="Quick fried rice without a wok",
        mode=NinjaCombiMode.SEAR,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.SEAR,
                temperature_c=232,
                temperature_f=450,
                duration_minutes=12,
                description="Sear/sauté mode for wok-style fried rice",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "2 tbsp vegetable oil",
            "2 cups cooked white rice (day-old preferred)",
            "2 eggs, beaten",
            "1 cup mixed vegetables (peas, carrots, corn)",
            "2 green onions, chopped",
            "3 tbsp soy sauce",
            "1 tbsp sesame oil",
            "1/2 tsp garlic powder",
            "1/2 tsp ginger powder",
        ],
        instructions=[
            "Slide Combi Cooker Pan into Level 1",
            "With door open, select SEAR/SAUTÉ, set to HI",
            "Preheat for 2 minutes",
            "Remove pan, add oil",
            "Add eggs, scramble, then remove and set aside",
            "Add rice, break up clumps",
            "Cook 5 minutes, stirring occasionally",
            "Add vegetables, cook 3 minutes",
            "Add soy sauce, sesame oil, spices",
            "Add eggs back, stir to combine",
            "Cook 2 more minutes",
            "Garnish with green onions",
        ],
        prep_time_minutes=10,
        cook_time_minutes=12,
        servings=4,
        difficulty="easy",
        tips=[
            "Day-old rice works best (less sticky)",
            "Keep door open when using SEAR/SAUTÉ",
            "Stir frequently for even cooking",
            "Add cooked protein (chicken, shrimp, pork) for complete meal",
        ],
        notes="Sear/Sauté mode replicates wok cooking without stovetop.",
    ),
    
    # Bacon-Wrapped Pork Chops with Brussels Sprouts & Couscous (Page 13)
    NinjaCombiRecipe(
        id=1020,
        name="Bacon-Wrapped Pork Chops with Brussels Sprouts & Couscous",
        description="Complete one-pan meal with protein, grain, and veggies",
        mode=NinjaCombiMode.COMBI_MEAL,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.COMBI_MEAL,
                temperature_c=177,
                temperature_f=350,
                duration_minutes=22,
                description="Multi-level combi cooking",
                steam_enabled=True,
            ),
        ],
        use_probe=True,
        target_temp_c=63,
        target_temp_f=145,
        ingredients=[
            "# Level 1 (Combi Cooker Pan) - Base",
            "3 cups plain pearled couscous",
            "4 cups water or cooking stock",
            "1/2 tsp kosher salt",
            "2 tbsp olive oil",
            "",
            "# Level 2 (Bake Tray) - Protein",
            "6 boneless pork chops (6-8 oz each)",
            "1 lb smoked bacon",
            "2 tbsp Dijon mustard",
            "2 tbsp honey or maple syrup",
            "1.5 lbs Brussels sprouts, trimmed and halved",
            "1 tbsp olive oil",
            "1 tbsp garlic powder",
            "1 tsp kosher salt",
            "1 tsp black pepper",
        ],
        instructions=[
            "Add couscous, water/stock, salt, and oil to Combi Cooker Pan",
            "Stir to combine, slide pan into Level 1",
            "Brush pork chops with mustard-honey mixture",
            "Wrap each chop with bacon strips",
            "Place chops on Bake Tray, slide into Level 2",
            "Insert MEATER+ probe into thickest chop",
            "Select COMBI MEALS, 350°F, 22 minutes",
            "Unit will steam for 5 minutes",
            "When 10 minutes remain, toss Brussels sprouts with oil and seasonings",
            "Open door, flip chops, add Brussels sprouts around chops",
            "Close door to continue cooking",
            "When probe reaches 63°C/145°F, remove",
            "Let chops rest 3 minutes",
            "Fluff couscous with fork and serve",
        ],
        prep_time_minutes=15,
        cook_time_minutes=22,
        servings=6,
        difficulty="medium",
        tips=[
            "Use MEATER+ probe for perfect pork doneness",
            "Steam phase cooks couscous perfectly",
            "Don't forget to add liquid to Level 1",
            "Bacon adds flavor and keeps chops moist",
        ],
        notes="Complete meal cooked in one appliance - base, protein, and vegetables all done together.",
    ),
    
    # Beef Roast with Root Vegetables & Red Wine Pan Sauce (Page 15)
    NinjaCombiRecipe(
        id=1021,
        name="Beef Roast with Root Vegetables & Red Wine Pan Sauce",
        description="Perfect roast with vegetables and rich pan sauce",
        mode=NinjaCombiMode.COMBI_CRISP,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.COMBI_CRISP,
                temperature_c=182,
                temperature_f=360,
                duration_minutes=65,
                description="Steam then crisp for perfect roast",
                steam_enabled=True,
            ),
        ],
        use_probe=True,
        target_temp_c=54,  # medium-rare
        target_temp_f=130,
        ingredients=[
            "3-5 lb top round roast, patted dry",
            "2 tbsp canola oil, divided",
            "2 medium carrots, cut in 1.5-inch pieces",
            "1 medium onion, quartered",
            "3 small russet potatoes, cut in 1.5-inch pieces",
            "1.75 cups beef stock",
            "1/2 cup red wine",
            "2 sprigs fresh rosemary or thyme",
            "2 tbsp cornstarch + 1/4 cup water",
            "Kosher salt and black pepper",
        ],
        instructions=[
            "Place beef stock, red wine, herbs, 1 tsp salt, 2 tsp pepper in Combi Cooker Pan",
            "Stir to combine, place Crisper Plate on top",
            "Toss vegetables with 1 tbsp oil, salt, and pepper",
            "Rub remaining oil on roast, season generously",
            "Place roast on Crisper Plate with vegetables around it",
            "Insert MEATER+ probe into center of roast",
            "Slide into Level 1",
            "Select COMBI CRISP, 360°F, 65 minutes",
            "Unit will steam for ~6 minutes before crisping",
            "At 45 minutes, start checking probe temperature",
            "For medium-rare: remove at 54°C/130°F",
            "For medium: remove at 60°C/140°F",
            "Remove roast and vegetables, let rest 10 minutes",
            "For pan sauce: whisk cornstarch-water into drippings",
            "Select SEAR/SAUTÉ at 3, simmer 2 minutes until thickened",
            "Slice roast and serve with vegetables and sauce",
        ],
        prep_time_minutes=15,
        cook_time_minutes=65,
        servings=6,
        difficulty="easy",
        tips=[
            "Use MEATER+ probe to hit perfect doneness",
            "Steam phase tenderizes, crisp phase browns",
            "Let roast rest before slicing for juicy results",
            "Pan sauce uses flavorful drippings",
        ],
        notes="Combi-Crisp creates steakhouse-quality roast at home.",
    ),
    
    # Garlic & Herb Focaccia (Page 16)
    NinjaCombiRecipe(
        id=1022,
        name="Garlic & Herb Focaccia",
        description="Artisan-style focaccia with crispy crust",
        mode=NinjaCombiMode.COMBI_CRISP,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.PROVE,
                temperature_c=35,
                temperature_f=95,
                duration_minutes=40,
                description="Proof dough in humid environment",
                steam_enabled=True,
            ),
            CookingPhase(
                mode=NinjaCombiMode.COMBI_CRISP,
                temperature_c=177,
                temperature_f=350,
                duration_minutes=20,
                description="Steam + crisp for perfect crust",
                steam_enabled=True,
            ),
        ],
        use_probe=False,
        ingredients=[
            "1 cup water (for proofing)",
            "Nonstick cooking spray",
            "1 lb store-bought pizza dough, room temperature",
            "1/4 cup extra virgin olive oil",
            "1 tbsp garlic powder",
            "2 tbsp fresh parsley, chopped",
            "1 tbsp dried thyme",
            "1 tsp kosher salt",
        ],
        instructions=[
            "Pour 1 cup water in Combi Cooker Pan",
            "Place Crisper Plate on top",
            "Spray 8-inch round pan with cooking spray",
            "Form dough into ball, place in pan",
            "Place pan on Crisper Plate, slide into Level 1",
            "Select PROOF, 95°F, 40 minutes",
            "While proofing, mix oil, garlic, parsley, thyme, and salt",
            "When proofing complete, dimple dough all over with fingers",
            "Select COMBI CRISP, 350°F, 20 minutes",
            "Unit will steam 3-4 minutes",
            "When 5 minutes remain, brush oil mixture on top",
            "When done, remove and serve warm",
            "Keeps fresh 2 days at room temperature or frozen 2 months",
        ],
        prep_time_minutes=10,
        cook_time_minutes=60,  # 40 proof + 20 bake
        servings=8,
        difficulty="medium",
        tips=[
            "Prove mode creates perfect rising environment",
            "Dimpling creates classic focaccia appearance",
            "Steam phase makes bread soft inside",
            "Air fry phase creates crispy golden crust",
        ],
        notes="Multi-phase cooking produces bakery-quality focaccia.",
    ),
    
    # Twice-Baked Loaded Potatoes (Page 17)
    NinjaCombiRecipe(
        id=1023,
        name="Twice-Baked Loaded Potatoes",
        description="Fluffy stuffed potatoes with crispy tops",
        mode=NinjaCombiMode.COMBI_CRISP,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.COMBI_CRISP,
                temperature_c=204,
                temperature_f=400,
                duration_minutes=30,
                description="Steam + crisp to cook potatoes",
                steam_enabled=True,
            ),
            CookingPhase(
                mode=NinjaCombiMode.GRILL,
                temperature_c=260,
                temperature_f=500,
                duration_minutes=10,
                description="Broil for golden tops",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "1.5 cups water (for steaming)",
            "5 medium/large russet potatoes, poked with fork",
            "1 cup shredded cheddar cheese, divided",
            "1/2 cup whole milk",
            "1/4 cup sour cream",
            "Kosher salt and black pepper",
            "",
            "# Optional Toppings",
            "Shredded cheddar cheese",
            "Pre-cooked diced bacon",
            "Chives",
            "Sour cream",
        ],
        instructions=[
            "Pour 1.5 cups water in Combi Cooker Pan",
            "Place Crisper Plate on top",
            "Place potatoes on Crisper Plate",
            "Slide pan into Level 1",
            "Select COMBI CRISP, 400°F, 30 minutes",
            "Unit will steam for 10 minutes",
            "When done, transfer potatoes to plate, let cool 5 minutes",
            "Cut 2-3 inch opening on top of each potato",
            "Scoop out insides into bowl (keep skins intact)",
            "Add 1/2 cup cheddar, milk, sour cream, salt, pepper to bowl",
            "Mix until smooth",
            "Fill potato skins with mixture",
            "Return to Crisper Plate on pan",
            "Slide pan into Level 2",
            "Select BROIL, 10 minutes",
            "When done, top with cheese, bacon, sour cream, chives",
        ],
        prep_time_minutes=10,
        cook_time_minutes=40,
        servings=5,
        difficulty="medium",
        tips=[
            "Steam phase cooks potatoes perfectly fluffy",
            "Keep potato skins intact for structure",
            "Broil creates golden, crispy tops",
            "Customize toppings to your preference",
        ],
        notes="Two-phase cooking creates steakhouse-quality loaded potatoes.",
    ),
    
    # Flakey Chocolate Croissants (Page 22)
    NinjaCombiRecipe(
        id=1024,
        name="Flakey Chocolate Croissants",
        description="Buttery croissants with melted chocolate filling",
        mode=NinjaCombiMode.COMBI_BAKE,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.COMBI_BAKE,
                temperature_c=177,
                temperature_f=350,
                duration_minutes=12,
                description="Steam + bake for flaky pastry",
                steam_enabled=True,
            ),
        ],
        use_probe=False,
        ingredients=[
            "# Level 1",
            "1/2 cup water (for steaming)",
            "",
            "# Level 2",
            "All-purpose flour (for dusting)",
            "1 large egg",
            "1 tbsp water",
            "1 sheet (8.5 oz) frozen puff pastry, thawed",
            "1 chocolate bar (1.5 oz), broken into pieces",
        ],
        instructions=[
            "Beat egg with 1 tbsp water, set aside",
            "Pour 1/2 cup water in Combi Cooker Pan, slide into Level 1",
            "On floured surface, cut puff pastry into 6 equal rectangles",
            "Brush each rectangle with egg mixture",
            "Place 2 chocolate pieces in center of each rectangle",
            "Fold dough over chocolate to seal",
            "Place seam-side down on Bake Tray",
            "Brush tops with egg mixture",
            "Slide tray into Level 2",
            "Select COMBI BAKE, 350°F, 12 minutes",
            "Unit will steam for 20 minutes before baking",
            "When done, remove and serve immediately",
            "Store in airtight container up to 3 days",
        ],
        prep_time_minutes=15,
        cook_time_minutes=12,
        servings=6,
        difficulty="medium",
        tips=[
            "Steam phase creates incredibly flaky layers",
            "Seal edges well to keep chocolate inside",
            "Swap chocolate for jam or custard for variety",
            "Best served warm with melted chocolate",
        ],
        notes="Combi-Bake produces bakery-quality croissants at home.",
    ),
    
    # Apple Tart (Page 23)
    NinjaCombiRecipe(
        id=1025,
        name="Apple Tart",
        description="Rustic French-style apple tart with caramelized apples",
        mode=NinjaCombiMode.COMBI_BAKE,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.COMBI_BAKE,
                temperature_c=177,
                temperature_f=350,
                duration_minutes=17,
                description="Steam + bake for perfect crust and apples",
                steam_enabled=True,
            ),
        ],
        use_probe=False,
        ingredients=[
            "1/2 cup water (for steaming)",
            "1 sheet frozen puff pastry, thawed",
            "3 green apples, cut in 1/4-inch slices",
            "1/4 tsp cinnamon",
            "1/2 tsp vanilla extract",
            "1/4 cup granulated sugar",
            "4 tbsp cold butter, cut in 1/2-inch cubes",
            "Whipped cream (optional, for serving)",
            "Vanilla ice cream (optional, for serving)",
        ],
        instructions=[
            "Pour 1/2 cup water in Combi Cooker Pan",
            "Place Crisper Plate on top",
            "Cut parchment to fit on Crisper Plate",
            "Stretch puff pastry to fit on parchment",
            "Press pastry against edges",
            "Poke entire surface with fork",
            "Toss apples with cinnamon and vanilla",
            "Arrange apple slices in neat overlapping rows on pastry",
            "Sprinkle sugar on top",
            "Dot butter pieces across apples",
            "Slide pan into Level 1",
            "Select COMBI BAKE, 350°F, 17 minutes",
            "Unit will steam for 20 minutes before baking",
            "When done, let cool 10 minutes",
            "Serve with whipped cream or ice cream",
        ],
        prep_time_minutes=15,
        cook_time_minutes=17,
        servings=8,
        difficulty="medium",
        tips=[
            "Overlap apple slices for beautiful presentation",
            "Steam keeps apples tender while pastry crisps",
            "Green apples (Granny Smith) hold shape best",
            "Serve warm for best flavor",
        ],
        notes="Combi-Bake creates French patisserie-quality tart.",
    ),
    
    # Chocolate Cheesecake (Page 24)
    NinjaCombiRecipe(
        id=1026,
        name="Chocolate Cheesecake",
        description="Rich, creamy chocolate cheesecake",
        mode=NinjaCombiMode.COMBI_BAKE,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.COMBI_BAKE,
                temperature_c=191,
                temperature_f=375,
                duration_minutes=15,
                description="Steam + bake for creamy texture",
                steam_enabled=True,
            ),
        ],
        use_probe=False,
        ingredients=[
            "3/4 cup water (for steaming)",
            "1 prepared chocolate cookie pie crust (in aluminum foil dish)",
            "1 bag (12 oz) semi-sweet chocolate chips",
            "1/2 cup heavy cream",
            "1.5 blocks (12 oz) cream cheese, room temperature",
            "1/2 cup granulated sugar",
            "1 tsp instant espresso powder",
            "1 tsp vanilla extract",
            "2 large eggs",
            "Whipped cream (optional)",
        ],
        instructions=[
            "Pour 3/4 cup water in Combi Cooker Pan",
            "Place Crisper Plate on top",
            "Place prepared chocolate crust (in foil dish) on plate",
            "In microwave-safe bowl, combine chocolate chips and cream",
            "Microwave 1 minute, stir until smooth, set aside",
            "In large bowl, whisk cream cheese until fluffy (2 minutes)",
            "Whisk in sugar, espresso powder, and vanilla",
            "Whisk in eggs one at a time",
            "Fold in melted chocolate mixture",
            "Pour mixture into pie crust (fill just below rim)",
            "Slide pan into Level 1",
            "Select COMBI BAKE, 375°F, 15 minutes",
            "Unit will steam for 20 minutes before baking",
            "When done, center should have slight jiggle",
            "Let cool in pan 20 minutes",
            "Refrigerate 8 hours or overnight",
            "Serve with whipped cream",
        ],
        prep_time_minutes=15,
        cook_time_minutes=15,
        servings=8,
        difficulty="medium",
        tips=[
            "Room temperature cream cheese is essential",
            "Steam prevents cracking on surface",
            "Slight jiggle means perfect doneness",
            "Must chill overnight for best texture",
        ],
        notes="Combi-Bake creates restaurant-quality cheesecake without water bath.",
    ),
    
    # Crispy Parmesan Brussels Sprouts (Page 26)
    NinjaCombiRecipe(
        id=1027,
        name="Crispy Parmesan Brussels Sprouts",
        description="Ultra-crispy Brussels sprouts with Parmesan",
        mode=NinjaCombiMode.AIR_FRY,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.AIR_FRY,
                temperature_c=199,
                temperature_f=390,
                duration_minutes=15,
                description="Air fry for crispy exterior",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "1 cup grated Parmesan cheese, divided",
            "1.5 lbs Brussels sprouts, trimmed and halved",
            "2 tbsp olive oil",
            "2 tsp garlic powder",
            "1 tbsp balsamic vinegar",
            "Kosher salt",
            "Ground black pepper",
        ],
        instructions=[
            "Place Crisper Plate in Combi Cooker Pan",
            "Select AIR FRY, 390°F, 20 minutes to preheat",
            "Unit will preheat for 5 minutes",
            "While preheating, toss Brussels sprouts with 1/2 cup Parmesan and all other ingredients",
            "When 15 minutes remain, open door and slide pan into Level 1",
            "When 8 minutes remain, toss Brussels sprouts for 30 seconds",
            "Close door to continue",
            "When done, toss with remaining 1/2 cup Parmesan",
            "Serve warm",
        ],
        prep_time_minutes=10,
        cook_time_minutes=15,
        servings=8,
        difficulty="easy",
        tips=[
            "Halving Brussels sprouts creates more crispy surface",
            "Toss halfway through for even cooking",
            "Fresh Parmesan melts better than pre-grated",
            "Balsamic vinegar adds depth of flavor",
        ],
        notes="Air Fry mode makes Brussels sprouts crispy outside, tender inside.",
    ),
    
    # Chicken Pot "Pie" with Biscuits (Page 27)
    NinjaCombiRecipe(
        id=1028,
        name='Chicken Pot "Pie" with Biscuits',
        description="Creamy chicken pot pie filling with fluffy biscuit topping",
        mode=NinjaCombiMode.CONVECTION,
        tray_position=TrayPosition.MIDDLE,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.SEAR,
                temperature_c=232,
                temperature_f=450,
                duration_minutes=10,
                description="Sauté vegetables and make roux",
                steam_enabled=False,
            ),
            CookingPhase(
                mode=NinjaCombiMode.CONVECTION,
                temperature_c=177,
                temperature_f=350,
                duration_minutes=12,
                description="Bake filling and biscuits together",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "4 tbsp unsalted butter",
            "1 yellow or white onion, finely chopped",
            "2 cups frozen peas and carrots",
            "2 tbsp dried parsley",
            "1 tsp dried thyme",
            "1 rotisserie chicken (34 oz), cut into bite-size pieces",
            "1/4 cup all-purpose flour",
            "2 cups chicken or veggie stock",
            "3/4 cup half & half",
            "1 can (16.3 oz) refrigerated flaky biscuits",
            "Kosher salt and black pepper",
        ],
        instructions=[
            "Slide Combi Cooker Pan into Level 1",
            "With door open, select SEAR/SAUTÉ, set to HI",
            "Preheat 3 minutes",
            "Remove pan, add butter and let melt",
            "Add onion, peas, carrots, parsley, thyme",
            "Return to unit, sauté 5 minutes (door open), stirring occasionally",
            "Remove pan, add flour, whisk until combined",
            "Return to unit, cook 1 minute (door open)",
            "Remove pan, whisk in stock and half & half",
            "Return to unit, reduce heat to 3",
            "Simmer until sauce thickens (~3 minutes)",
            "Remove pan, stir in chicken, salt, pepper",
            "Return pan to Level 1, close door",
            "Select BAKE, 350°F, 12 minutes to preheat",
            "Place biscuits on Bake Tray",
            "When preheated, slide tray onto Level 2",
            "Close door and cook",
            "When done, biscuits should be golden brown",
            "Serve chicken filling with biscuits on top",
        ],
        prep_time_minutes=15,
        cook_time_minutes=22,
        servings=8,
        difficulty="easy",
        tips=[
            "Multi-mode cooking: sauté then bake",
            "Rotisserie chicken saves prep time",
            "Sauce should coat back of spoon when ready",
            "Biscuits bake above while filling stays hot below",
        ],
        notes="Two-level cooking makes complete pot pie without traditional crust.",
    ),
    
    # Classic Mac & Cheese Bake (Page 27)
    NinjaCombiRecipe(
        id=1029,
        name="Classic Mac & Cheese Bake",
        description="Ultra-creamy baked mac and cheese with crispy topping",
        mode=NinjaCombiMode.CONVECTION,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.CONVECTION,
                temperature_c=204,
                temperature_f=400,
                duration_minutes=20,
                description="Bake pasta until creamy",
                steam_enabled=False,
            ),
            CookingPhase(
                mode=NinjaCombiMode.GRILL,
                temperature_c=260,
                temperature_f=500,
                duration_minutes=4,
                description="Broil for golden crispy top",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "8 oz American cheese (about 12 slices), broken into pieces",
            "2 cups shredded sharp cheddar cheese",
            "2 cups shredded low moisture mozzarella",
            "3.5 cups whole milk",
            "2 cups water",
            "1 box (16 oz) macaroni elbows",
            "Kosher salt and black pepper",
            "",
            "# Topping",
            "4 tbsp butter, melted",
            "1 cup panko bread crumbs",
            "1 tbsp dried parsley",
        ],
        instructions=[
            "Add all cheeses, milk, water, pasta, salt, pepper to Combi Cooker Pan",
            "Stir well to combine",
            "Select BAKE, 400°F, 20 minutes to preheat",
            "Unit will preheat 3 minutes",
            "When preheated, slide pan into Level 1",
            "Close door to start cooking",
            "Mix melted butter, panko, and parsley for topping",
            "When baking complete, pull pan out and stir mac & cheese",
            "Sprinkle panko mixture evenly on top",
            "Slide pan back into Level 1",
            "Select BROIL, 4 minutes",
            "When done, let cool 5 minutes before serving",
        ],
        prep_time_minutes=5,
        cook_time_minutes=24,
        servings=10,
        difficulty="easy",
        tips=[
            "Three cheese blend creates ultimate creaminess",
            "Stir before adding topping for even consistency",
            "Broil creates golden crispy crust",
            "Let rest 5 minutes for best texture",
        ],
        notes="One-pan baked mac and cheese rivals stovetop version with better texture.",
    ),
    
    # Loaded Deep-Dish Pizza (Page 28)
    NinjaCombiRecipe(
        id=1030,
        name="Loaded Deep-Dish Pizza",
        description="Chicago-style deep-dish pizza with thick crust",
        mode=NinjaCombiMode.CONVECTION,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.PROVE,
                temperature_c=35,
                temperature_f=95,
                duration_minutes=40,
                description="Proof dough for airy crust",
                steam_enabled=True,
            ),
            CookingPhase(
                mode=NinjaCombiMode.CONVECTION,
                temperature_c=204,
                temperature_f=400,
                duration_minutes=18,
                description="Pizza mode for perfect crust",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "1 cup water (for proofing)",
            "Nonstick cooking spray",
            "16 oz store-bought pizza dough, room temperature",
            "All-purpose flour for dusting",
            "Olive oil",
            "1.5 cups shredded mozzarella cheese",
            "1/2 cup pepperoni",
            "1/2 cup green bell pepper, thinly sliced",
            "1/2 cup yellow onion, thinly sliced",
            "1 jar (14 oz) pizza sauce",
            "1/2 cup grated Parmesan cheese",
        ],
        instructions=[
            "Pour 1 cup water in Combi Cooker Pan",
            "Place Crisper Plate on top",
            "Spray plate with cooking spray",
            "Form dough into ball, place on plate",
            "Slide pan into Level 1",
            "Select PROOF, 95°F, 40 minutes",
            "When proofing done, remove pan",
            "Transfer dough to floured surface",
            "Roll into rectangle 15x8 inches",
            "Discard water, wipe pan clean",
            "Brush pan with olive oil",
            "Transfer dough to pan, press into corners and up sides",
            "Layer: mozzarella, pepperoni, peppers, onions, sauce, Parmesan",
            "Select PIZZA, 400°F, 18 minutes to preheat",
            "Unit will preheat 3 minutes",
            "When preheated, slide pan into Level 1",
            "Close door to cook",
            "When done, let cool in pan before slicing",
        ],
        prep_time_minutes=10,
        cook_time_minutes=58,  # 40 proof + 18 bake
        servings=8,
        difficulty="medium",
        tips=[
            "Prove mode creates perfect rise",
            "Press dough up sides of pan for thick crust",
            "Layer cheese first to prevent soggy crust",
            "Let cool slightly for easier slicing",
        ],
        notes="Two-phase cooking produces authentic deep-dish pizza at home.",
    ),
    
    # Slow-Cooked Bolognese Sauce (Page 32)
    NinjaCombiRecipe(
        id=1031,
        name="Slow-Cooked Bolognese Sauce",
        description="Rich, authentic Italian meat sauce",
        mode=NinjaCombiMode.SLOW_COOK,
        tray_position=TrayPosition.LOWER,
        phases=[
            CookingPhase(
                mode=NinjaCombiMode.SEAR,
                temperature_c=232,
                temperature_f=450,
                duration_minutes=15,
                description="Sauté vegetables and brown meat",
                steam_enabled=False,
            ),
            CookingPhase(
                mode=NinjaCombiMode.SLOW_COOK,
                temperature_c=93,
                temperature_f=200,
                duration_minutes=240,  # 4 hours
                description="Slow cook for deep flavors",
                steam_enabled=False,
            ),
        ],
        use_probe=False,
        ingredients=[
            "2 tbsp olive oil",
            "1 yellow or white onion, diced",
            "2 celery stalks, diced",
            "2 whole carrots, peeled and diced",
            "3 garlic cloves, minced",
            "2 tbsp tomato paste",
            "2 lbs ground beef",
            "1 tbsp Italian seasoning",
            "1 cup dry red wine",
            "2 cans (28 oz each) whole peeled tomatoes with liquid",
            "3/4 cup whole milk",
            "Kosher salt and black pepper",
        ],
        instructions=[
            "Slide Combi Cooker Pan into Level 1",
            "With door open, select SEAR/SAUTÉ, set to HI",
            "Preheat 2 minutes",
            "Remove pan, add oil to coat bottom",
            "Add onion, celery, carrots, garlic",
            "Return to unit, sauté 6 minutes (door open), stirring occasionally",
            "Remove pan, add tomato paste, stir to combine",
            "Return to unit, cook 1 minute",
            "Remove pan, add ground beef, Italian seasoning, salt, pepper",
            "Return to unit, cook until beef browned (~5 minutes)",
            "Remove pan, add red wine",
            "Return to unit, let reduce 3 minutes",
            "Turn off unit, transfer pan to heat-safe surface",
            "Add tomatoes and liquid, break up tomatoes with spoon",
            "Whisk in milk, salt, and pepper",
            "Return pan to Level 1, close door",
            "Select SLOW COOK, set to HI, 4 hours",
            "When done, serve over pasta",
            "Stores in fridge up to 1 week",
        ],
        prep_time_minutes=15,
        cook_time_minutes=255,  # 15 sauté + 240 slow cook
        servings=10,
        difficulty="medium",
        tips=[
            "Sautéing vegetables first builds deep flavor",
            "Breaking down tomatoes creates better texture",
            "Milk adds richness and reduces acidity",
            "Slow cooking develops authentic Italian flavor",
        ],
        notes="Multi-phase cooking creates restaurant-quality bolognese that slow-simmers for hours.",
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
