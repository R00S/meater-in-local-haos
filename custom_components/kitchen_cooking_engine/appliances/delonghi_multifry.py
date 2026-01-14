"""
De'Longhi MultiFry FH1394 appliance support.

Last Updated: 10 Jan 2026, 23:50 CET
Last Change: Updated to use FEATURE_CATALOG with per-appliance feature types

This module implements support for the De'Longhi MultiFry FH1394, a multi-cooker
with hot air circulation and optional rotating paddle.

FEATURES:
- Casserole/Risotto (MODIFIED)
- Fry (MODIFIED) 
- Roast (STANDARD)
- Gratin/Grilled (STANDARD)
- Pizza/Bread (STANDARD)
- Dessert (MODIFIED)
- Air Fry (MODIFIED) - added per user request
- Pan Fry (MODIFIED) - added per user request, non-stick only
- Sear (MODIFIED) - added per user request, non-stick only

OIL SYSTEM:
Simplified to 4 levels: Zero, Low, Medium, Rich (instead of 1-5 measure)

DATA SOURCE:
- De'Longhi MultiFry FH1394 official manual (delongi_multifry.pdf)
- Cooking tables from pages with time/temperature/quantity data
"""

from typing import List, Optional
from ..appliances import (
    KitchenAppliance,
    CookingFeature,
    FeatureType,
    OilLevel,
    RecipeAdapter,
    ApplianceRecipe,
    CookingPhase,
)
from ..features.catalog import FEATURE_CATALOG


class MultiFryAdapter(RecipeAdapter):
    """Recipe adapter for De'Longhi MultiFry."""
    
    def adapt_temperature(self, original_temp_c: int, cooking_method: str) -> int:
        """
        Adapt temperature for MultiFry's hot air circulation.
        
        MultiFry uses efficient hot air, so temps can be slightly lower than
        conventional cooking methods.
        """
        # Air fry modes: reduce by ~10-15°C from conventional oven
        if cooking_method in ["air_fry", "fry"]:
            return max(150, original_temp_c - 15)
        
        # Roasting: reduce by ~10°C  
        elif cooking_method == "roast":
            return max(160, original_temp_c - 10)
        
        # Casserole/slow cooking: keep similar
        elif cooking_method in ["casserole", "risotto"]:
            return original_temp_c
        
        # Default: slight reduction
        return max(150, original_temp_c - 10)
    
    def adapt_time(self, original_minutes: int, cooking_method: str) -> int:
        """
        Adapt cooking time for MultiFry.
        
        Hot air circulation cooks faster than conventional methods.
        """
        # Air frying is faster than deep frying
        if cooking_method in ["air_fry", "fry"]:
            return int(original_minutes * 0.8)  # 20% faster
        
        # Roasting is similar speed
        elif cooking_method == "roast":
            return int(original_minutes * 0.95)  # Slightly faster
        
        # Casserole/slow cooking takes full time
        elif cooking_method in ["casserole", "risotto"]:
            return original_minutes
        
        # Default: slightly faster
        return int(original_minutes * 0.9)
    
    def suggest_oil_level(self, cooking_method: str, food_type: str) -> OilLevel:
        """
        Suggest oil level based on cooking method and food type.
        
        MultiFry uses less oil than traditional methods.
        """
        food_lower = food_type.lower()
        
        # Air frying needs minimal/no oil
        if cooking_method == "air_fry":
            if any(x in food_lower for x in ["chicken", "fish", "protein"]):
                return OilLevel.LOW  # Light spray for browning
            return OilLevel.ZERO  # Vegetables/frozen foods
        
        # Traditional frying
        elif cooking_method == "fry":
            if any(x in food_lower for x in ["chip", "fries", "potato"]):
                return OilLevel.MEDIUM  # Standard frying
            elif any(x in food_lower for x in ["nugget", "breaded"]):
                return OilLevel.LOW  # Breaded items need less
            return OilLevel.MEDIUM
        
        # Pan fry and sear (non-stick bowl)
        elif cooking_method in ["pan_fry", "sear"]:
            return OilLevel.LOW  # Non-stick needs minimal oil
        
        # Roasting
        elif cooking_method == "roast":
            return OilLevel.LOW  # Light coating for browning
        
        # Casserole/risotto
        elif cooking_method in ["casserole", "risotto"]:
            return OilLevel.LOW  # Sautéing base ingredients
        
        # Default
        return OilLevel.LOW


class DelonghiMultiFry(KitchenAppliance):
    """De'Longhi MultiFry FH1394 multi-cooker."""
    
    def __init__(
        self,
        name: str = "De'Longhi MultiFry",
        device_control: Optional[ApplianceDeviceControl] = None,
        feature_types: Optional[Dict[str, str]] = None,
        bowl_type: str = "paddle"
    ):
        """Initialize MultiFry appliance.
        
        Args:
            name: Appliance name
            device_control: Optional device control configuration
            feature_types: Optional user overrides for feature types
            bowl_type: Bowl type ("paddle" or "non_paddle")
        """
        super().__init__()
        self.appliance_id = "delonghi_multifry_fh1394"
        self.name = name
        self.brand = "De'Longhi"
        self.model = "FH1394"
        self.adapter = MultiFryAdapter()
        self.device_control = device_control
        self.bowl_type = bowl_type
        
        # Initialize features from catalog
        self.features = {
            "casserole_risotto": FEATURE_CATALOG["casserole_risotto"],
            "fry": FEATURE_CATALOG["fry"],
            "roast": FEATURE_CATALOG["roast"],
            "gratin_grill": FEATURE_CATALOG["gratin_grill"],
            "pizza_bread": FEATURE_CATALOG["pizza_bread"],
            "dessert": FEATURE_CATALOG["dessert"],
            "air_fry": FEATURE_CATALOG["air_fry"],
            "pan_fry": FEATURE_CATALOG["pan_fry"],
            "sear": FEATURE_CATALOG["sear"],
        }
        
        # Set default feature types for this specific appliance
        # Key insight: MultiFry MODIFIES most features due to hot air circulation
        default_feature_types = {
            "casserole_risotto": FeatureType.MODIFIED,  # Adapts slow-cooker recipes
            "fry": FeatureType.MODIFIED,                # Adapts frying recipes (less oil)
            "roast": FeatureType.STANDARD,              # Standard roasting
            "gratin_grill": FeatureType.STANDARD,       # Standard gratin/grill
            "pizza_bread": FeatureType.STANDARD,        # Standard baking
            "dessert": FeatureType.MODIFIED,            # Adapts baking recipes
            "air_fry": FeatureType.MODIFIED,            # MultiFry's air fry is slower than dedicated air fryers
            "pan_fry": FeatureType.MODIFIED,            # Non-stick bowl only, different from stovetop
            "sear": FeatureType.MODIFIED,               # Non-stick bowl only, different from stovetop
        }
        
        # Allow user override of feature types via config
        if feature_types:
            for feat, ftype in feature_types.items():
                # Convert string to FeatureType enum
                if ftype == "standard":
                    default_feature_types[feat] = FeatureType.STANDARD
                elif ftype == "modified":
                    default_feature_types[feat] = FeatureType.MODIFIED
                elif ftype == "special":
                    default_feature_types[feat] = FeatureType.SPECIAL
                # If unknown, keep default
        
        self._feature_types = default_feature_types
        
        # Initialize recipes
        self.recipes = self._load_recipes()
    
    def get_supported_features(self) -> List[CookingFeature]:
        """Return list of supported cooking features."""
        return list(self.features.values())
    
    def get_recipes(self) -> List[ApplianceRecipe]:
        """Return all MultiFry recipes."""
        return self.recipes
    
    def _load_recipes(self) -> List[ApplianceRecipe]:
        """Load MultiFry recipes from manual data."""
        recipes = []
        
        # Recipe IDs: 3000-3999 for De'Longhi MultiFry
        # This allows clear separation from Ninja Combi (1000-1999) and Speedi (2000-2999)
        
        # FRY recipes from manual tables
        recipes.extend([
            # Potatoes - Standard cut (10x10mm)
            ApplianceRecipe(
                id=3001,
                appliance_id=self.appliance_id,
                name="Crispy Fries (Fresh)",
                description="Classic fresh-cut fries with hot air frying",
                feature="fry",
                phases=[CookingPhase(
                    feature_name="fry",
                    temperature_c=180,
                    temperature_f=356,
                    duration_minutes=33,
                    description="Fry with paddle until golden and crispy",
                    oil_level=OilLevel.MEDIUM,
                    use_paddle=True
                )],
                ingredients=[
                    "1000g potatoes, cut into 10x10mm sticks",
                    "3-4 tbsp vegetable oil (Medium level)",
                    "Salt to taste"
                ],
                instructions=[
                    "Peel and cut potatoes into 10x10mm sticks",
                    "Rinse in cold water and pat completely dry",
                    "Add oil (Medium level) to bowl J",
                    "Add potatoes and salt",
                    "Select FRY mode, set to 33 minutes at 180°C",
                    "Paddle will rotate automatically",
                    "Check for golden color at 30 minutes",
                    "Season with additional salt if desired"
                ],
                cook_time_minutes=33,
                prep_time_minutes=15,
                servings=4,
                difficulty="easy",
                tips=[
                    "Dry potatoes thoroughly for crispiest results",
                    "Don't overcrowd - max 1750g for best circulation",
                    "Paddle ensures even cooking"
                ],
                tags=["fries", "potato", "crispy", "classic"]
            ),
            
            # Frozen fries
            ApplianceRecipe(
                id=3002,
                appliance_id=self.appliance_id,
                name="Frozen Fries",
                description="Quick frozen fries with minimal oil",
                feature="fry",
                phases=[CookingPhase(
                    feature_name="fry",
                    temperature_c=180,
                    temperature_f=356,
                    duration_minutes=29,
                    description="Fry without paddle until crispy",
                    oil_level=OilLevel.LOW,
                    use_paddle=False  # No paddle for frozen
                )],
                ingredients=[
                    "1000g frozen fries",
                    "1-2 tbsp oil (Low level)",
                    "Salt if needed"
                ],
                instructions=[
                    "DO NOT thaw frozen fries",
                    "Add oil (Low level) to bowl J",
                    "Add frozen fries directly from freezer",
                    "Select FRY mode, set to 29 minutes at 180°C",
                    "Do not use paddle for frozen foods",
                    "Shake bowl halfway through for even cooking",
                    "Fries will be crispy when done"
                ],
                cook_time_minutes=29,
                prep_time_minutes=2,
                servings=4,
                difficulty="easy",
                tips=[
                    "No need to thaw - cook from frozen",
                    "Use less oil than fresh fries",
                    "Shake halfway for even results"
                ],
                tags=["fries", "frozen", "quick", "easy"]
            ),
            
            # Chicken Nuggets
            ApplianceRecipe(
                id=3003,
                appliance_id=self.appliance_id,
                name="Crispy Chicken Nuggets",
                description="Golden chicken nuggets with less oil",
                feature="fry",
                use_probe=True,
                probe_target_c=74,
                probe_target_f=165,
                phases=[CookingPhase(
                    feature_name="fry",
                    temperature_c=180,
                    temperature_f=356,
                    duration_minutes=17,
                    description="Fry with paddle until golden",
                    oil_level=OilLevel.LOW,
                    use_paddle=True
                )],
                ingredients=[
                    "750g chicken nuggets (fresh or frozen)",
                    "2 tbsp oil (Low level)",
                    "Optional: dipping sauces"
                ],
                instructions=[
                    "Add oil (Low level) to bowl J",
                    "Add chicken nuggets",
                    "Insert MEATER+ probe into thickest nugget (optional)",
                    "Select FRY mode, 17 minutes at 180°C",
                    "Paddle ensures even browning",
                    "Cook until internal temp reaches 74°C",
                    "Serve hot with favorite sauces"
                ],
                cook_time_minutes=17,
                prep_time_minutes=5,
                servings=4,
                difficulty="easy",
                tips=[
                    "Works with both fresh and frozen nuggets",
                    "Use MEATER+ to ensure safe temperature",
                    "Paddle prevents sticking"
                ],
                tags=["chicken", "nuggets", "kids", "protein"]
            ),
        ])
        
        # ROAST recipes
        recipes.extend([
            ApplianceRecipe(
                id=3010,
                appliance_id=self.appliance_id,
                name="Roast Chicken Drumsticks",
                description="Juicy roasted chicken drumsticks",
                feature="roast",
                use_probe=True,
                probe_target_c=74,
                probe_target_f=165,
                phases=[CookingPhase(
                    feature_name="roast",
                    temperature_c=200,
                    temperature_f=392,
                    duration_minutes=48,
                    description="Roast without paddle for crispy skin",
                    oil_level=OilLevel.LOW,
                    use_paddle=False
                )],
                ingredients=[
                    "1000g chicken drumsticks",
                    "2 tbsp olive oil (Low level)",
                    "2 tsp paprika",
                    "1 tsp garlic powder",
                    "Salt and pepper to taste"
                ],
                instructions=[
                    "Pat drumsticks dry with paper towel",
                    "Mix oil with paprika, garlic powder, salt, and pepper",
                    "Coat drumsticks with oil mixture",
                    "Place in bowl Z (non-stick, no paddle)",
                    "Insert MEATER+ probe into thickest drumstick",
                    "Select ROAST mode, 48 minutes at 200°C",
                    "Check internal temp reaches 74°C",
                    "Let rest 5 minutes before serving"
                ],
                cook_time_minutes=48,
                prep_time_minutes=10,
                servings=4,
                difficulty="easy",
                tips=[
                    "Dry skin equals crispy skin",
                    "Don't overcrowd for even cooking",
                    "MEATER+ ensures perfect doneness"
                ],
                tags=["chicken", "roast", "protein", "crispy"]
            ),
        ])
        
        # AIR FRY recipes (user requested feature)
        recipes.extend([
            ApplianceRecipe(
                id=3020,
                appliance_id=self.appliance_id,
                name="Air Fried Chicken Wings",
                description="Crispy chicken wings with zero oil",
                feature="air_fry",
                use_probe=True,
                probe_target_c=74,
                probe_target_f=165,
                phases=[CookingPhase(
                    feature_name="air_fry",
                    temperature_c=190,
                    temperature_f=374,
                    duration_minutes=25,
                    description="Air fry for crispy skin",
                    oil_level=OilLevel.ZERO,
                    use_paddle=False
                )],
                ingredients=[
                    "800g chicken wings",
                    "1 tbsp baking powder (for crispiness)",
                    "1 tsp salt",
                    "1 tsp pepper",
                    "Optional: hot sauce, ranch"
                ],
                instructions=[
                    "Pat wings completely dry",
                    "Toss with baking powder, salt, and pepper",
                    "Place in bowl Z (no paddle needed)",
                    "Insert MEATER+ probe into thickest wing",
                    "Select AIR FRY mode (or high-temp setting)",
                    "Cook 25 minutes at 190°C",
                    "Shake bowl at 15 minutes",
                    "Check temp reaches 74°C",
                    "Toss with sauce if desired"
                ],
                cook_time_minutes=25,
                prep_time_minutes=10,
                servings=4,
                difficulty="easy",
                tips=[
                    "Baking powder creates extra crispy skin",
                    "No oil needed with air frying",
                    "Dry wings = crispy wings"
                ],
                tags=["chicken", "air-fry", "zero-oil", "wings", "crispy"]
            ),
            
            ApplianceRecipe(
                id=3021,
                appliance_id=self.appliance_id,
                name="Air Fried Vegetables",
                description="Healthy roasted vegetables with zero oil",
                feature="air_fry",
                phases=[CookingPhase(
                    feature_name="air_fry",
                    temperature_c=180,
                    temperature_f=356,
                    duration_minutes=20,
                    description="Air fry until tender and caramelized",
                    oil_level=OilLevel.ZERO,
                    use_paddle=False
                )],
                ingredients=[
                    "500g mixed vegetables (broccoli, cauliflower, carrots)",
                    "1 tsp garlic powder",
                    "1 tsp Italian seasoning",
                    "Salt and pepper to taste"
                ],
                instructions=[
                    "Cut vegetables into even-sized pieces",
                    "Season with garlic powder, herbs, salt, pepper",
                    "Place in bowl Z",
                    "Select AIR FRY mode",
                    "Cook 20 minutes at 180°C",
                    "Shake bowl halfway through",
                    "Vegetables should be tender with crispy edges"
                ],
                cook_time_minutes=20,
                prep_time_minutes=10,
                servings=4,
                difficulty="easy",
                tips=[
                    "No oil needed - vegetables release moisture",
                    "Even sizing ensures even cooking",
                    "Perfect for meal prep"
                ],
                tags=["vegetables", "air-fry", "healthy", "zero-oil", "vegan"]
            ),
        ])
        
        # PAN FRY recipes (user requested, non-stick only)
        recipes.extend([
            ApplianceRecipe(
                id=3030,
                appliance_id=self.appliance_id,
                name="Pan-Fried Salmon",
                description="Restaurant-quality salmon with minimal oil",
                feature="pan_fry",
                use_probe=True,
                probe_target_c=52,  # Medium-rare salmon
                probe_target_f=125,
                phases=[CookingPhase(
                    feature_name="pan_fry",
                    temperature_c=170,
                    temperature_f=338,
                    duration_minutes=12,
                    description="Pan fry in non-stick bowl",
                    oil_level=OilLevel.LOW,
                    use_paddle=False
                )],
                ingredients=[
                    "4 salmon fillets (150g each)",
                    "2 tbsp olive oil (Low level)",
                    "1 lemon, sliced",
                    "2 cloves garlic, minced",
                    "Fresh dill",
                    "Salt and pepper"
                ],
                instructions=[
                    "Pat salmon dry and season both sides",
                    "Add oil (Low level) to bowl Z (non-stick only)",
                    "Place salmon skin-side down",
                    "Insert MEATER+ probe into thickest fillet",
                    "Select PAN FRY mode or set to 170°C",
                    "Cook 8 minutes without moving",
                    "Flip salmon carefully",
                    "Add garlic and lemon slices",
                    "Cook until probe reads 52°C (medium-rare)",
                    "Garnish with fresh dill"
                ],
                cook_time_minutes=12,
                prep_time_minutes=5,
                servings=4,
                difficulty="medium",
                tips=[
                    "Non-stick bowl Z is essential for delicate fish",
                    "Don't move salmon while cooking first side",
                    "52°C gives perfect medium-rare"
                ],
                notes="IMPORTANT: Use non-stick bowl Z only for pan frying",
                tags=["salmon", "fish", "pan-fry", "protein", "elegant"]
            ),
        ])
        
        # SEAR recipes (user requested, non-stick only)
        recipes.extend([
            ApplianceRecipe(
                id=3040,
                appliance_id=self.appliance_id,
                name="Seared Steaks",
                description="Perfect steakhouse-style sear",
                feature="sear",
                use_probe=True,
                probe_target_c=54,  # Medium-rare
                probe_target_f=129,
                phases=[CookingPhase(
                    feature_name="sear",
                    temperature_c=190,
                    temperature_f=374,
                    duration_minutes=10,
                    description="High-heat sear in non-stick bowl",
                    oil_level=OilLevel.LOW,
                    use_paddle=False
                )],
                ingredients=[
                    "2 beef steaks (250g each, 2.5cm thick)",
                    "2 tbsp oil (Low level - non-stick needs minimal)",
                    "2 cloves garlic",
                    "Fresh rosemary",
                    "Salt and pepper"
                ],
                instructions=[
                    "Bring steaks to room temperature (30 min)",
                    "Pat completely dry and season generously",
                    "Preheat bowl Z (non-stick) with oil (Low level)",
                    "Place steaks in hot bowl",
                    "Insert MEATER+ probe into thickest part",
                    "Select SEAR mode or set to 190°C",
                    "Sear 4 minutes without moving",
                    "Flip steaks carefully",
                    "Add garlic and rosemary",
                    "Sear until probe reads 54°C for medium-rare",
                    "Rest 5 minutes before serving"
                ],
                cook_time_minutes=10,
                prep_time_minutes=35,
                servings=2,
                difficulty="medium",
                tips=[
                    "Dry steak = good crust",
                    "Don't move while searing",
                    "Non-stick bowl prevents sticking at high heat",
                    "Let rest for juicy results"
                ],
                notes="IMPORTANT: Use non-stick bowl Z only. Ceramic bowl not suitable for high-heat searing.",
                tags=["steak", "beef", "sear", "protein", "steakhouse"]
            ),
        ])
        
        # CASSEROLE/RISOTTO recipes
        recipes.extend([
            ApplianceRecipe(
                id=3050,
                appliance_id=self.appliance_id,
                name="Classic Risotto",
                description="Creamy risotto with automatic paddle stirring",
                feature="casserole_risotto",
                phases=[CookingPhase(
                    feature_name="casserole_risotto",
                    temperature_c=100,
                    temperature_f=212,
                    duration_minutes=18,
                    description="Simmer with paddle for creamy texture",
                    oil_level=OilLevel.LOW,
                    use_paddle=True
                )],
                ingredients=[
                    "480g arborio rice",
                    "1.2L hot chicken or vegetable stock",
                    "1 onion, finely chopped",
                    "2 tbsp olive oil (Low level)",
                    "100ml white wine (optional)",
                    "50g butter",
                    "100g parmesan, grated",
                    "Salt and pepper"
                ],
                instructions=[
                    "Add oil (Low level) to bowl J with paddle",
                    "Add chopped onion",
                    "Select CASSEROLE mode, sauté 3 minutes",
                    "Add rice, stir with paddle to toast",
                    "Add wine, let absorb",
                    "Add hot stock gradually",
                    "Cook 18 minutes at 100°C with paddle rotating",
                    "Paddle stirs automatically - no manual stirring needed",
                    "When creamy, remove from heat",
                    "Stir in butter and parmesan",
                    "Let rest 2 minutes before serving"
                ],
                cook_time_minutes=18,
                prep_time_minutes=10,
                servings=6,
                difficulty="easy",
                tips=[
                    "Paddle does all the stirring for you",
                    "Use hot stock for faster cooking",
                    "Don't rush - gradual liquid absorption is key"
                ],
                tags=["risotto", "rice", "italian", "paddle", "creamy"]
            ),
        ])
        
        return recipes


# Convenience function to get the MultiFry instance
def get_delonghi_multifry() -> DelonghiMultiFry:
    """Get configured De'Longhi MultiFry appliance instance."""
    return DelonghiMultiFry()
