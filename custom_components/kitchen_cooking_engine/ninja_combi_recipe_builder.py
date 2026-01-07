"""
Ninja Combi Recipe Builder

This module implements the "Build Your Combi Meal" formula from the
Ninja Combi user manual. It allows users to create custom 3-part meals
by selecting a base (grains/pasta), protein, and vegetables.

Based on: Ninja Combi SFP700EU User Manual - "Build Your Combi Meal" (Page 7)

Usage:
    from ninja_combi_recipe_builder import build_combi_meal, CombiMealBase, CombiMealProtein

    recipe = build_combi_meal(
        base=CombiMealBase.WHITE_RICE,
        protein=CombiMealProtein.CHICKEN_BREAST,
        crispy_veggies=["broccoli", "carrots"]
    )
    
    print(recipe.get_recipe_card())
"""

from dataclasses import dataclass, field
from enum import Enum
from typing import Optional


class CombiMealBase(Enum):
    """Base grains and pasta options for Combi Meals."""
    
    WHITE_RICE = "white_rice"
    INSTANT_BROWN_RICE = "instant_brown_rice"
    BOXED_RICE_PILAF = "boxed_rice_pilaf"
    BOXED_SPANISH_RICE = "boxed_spanish_rice"
    BOXED_WILD_RICE = "boxed_wild_rice"
    ISRAELI_COUSCOUS = "israeli_couscous"
    QUINOA = "quinoa"
    PLAIN_PASTA = "plain_pasta"
    MARINARA_PASTA = "marinara_pasta"
    ALFREDO_PASTA = "alfredo_pasta"


class CombiMealProtein(Enum):
    """Protein options for Combi Meals."""
    
    # Chicken
    CHICKEN_BREAST_FRESH = "chicken_breast_fresh"
    CHICKEN_BREAST_FROZEN = "chicken_breast_frozen"
    CHICKEN_THIGH_BONELESS = "chicken_thigh_boneless"
    CHICKEN_THIGH_BONE_IN = "chicken_thigh_bone_in"
    CHICKEN_CUTLET_BREADED = "chicken_cutlet_breaded"
    
    # Beef
    STEAK_TIPS = "steak_tips"
    SIRLOIN_STEAKS = "sirloin_steaks"
    GROUND_BEEF = "ground_beef"
    MEATBALLS = "meatballs"
    
    # Pork
    PORK_CHOPS_BONELESS = "pork_chops_boneless"
    PORK_CHOPS_BONE_IN = "pork_chops_bone_in"
    ITALIAN_SAUSAGES = "italian_sausages"
    
    # Seafood
    SALMON_FILETS = "salmon_filets"
    JUMBO_SHRIMP = "jumbo_shrimp"
    
    # Plant-based
    PLANT_BASED_BEEF = "plant_based_beef"
    TOFU = "tofu"


@dataclass
class BaseIngredients:
    """Ingredients for a Combi Meal base."""
    
    base_type: CombiMealBase
    name: str
    main_ingredient: str
    liquid: str
    oil_amount: str = ""
    additional_ingredients: list[str] = field(default_factory=list)
    tender_veggies_allowed: bool = True  # Can add tender veggies to base


@dataclass
class ProteinDetails:
    """Details for a Combi Meal protein."""
    
    protein_type: CombiMealProtein
    name: str
    quantity: str
    weight_per_piece: str
    temperature_f: int
    cook_time_minutes: tuple[int, int]  # (min, max)
    preparation_notes: str = ""
    frozen_ok: bool = False


@dataclass
class CombiMealRecipe:
    """A complete Combi Meal recipe built using the recipe builder."""
    
    base: BaseIngredients
    protein: ProteinDetails
    tender_veggies: list[str] = field(default_factory=list)
    crispy_veggies: list[str] = field(default_factory=list)
    servings: int = 6
    
    def get_temperature_f(self) -> int:
        """Get cooking temperature in Fahrenheit."""
        return self.protein.temperature_f
    
    def get_cook_time_minutes(self) -> tuple[int, int]:
        """Get cooking time range in minutes."""
        return self.protein.cook_time_minutes
    
    def get_recipe_card(self) -> str:
        """Generate a formatted recipe card."""
        temp_f = self.get_temperature_f()
        time_min, time_max = self.get_cook_time_minutes()
        
        output = []
        output.append("=" * 80)
        output.append(f"COMBI MEAL: {self.protein.name.upper()} WITH {self.base.name.upper()}")
        output.append("=" * 80)
        output.append(f"\n**Temperature:** {temp_f}°F")
        output.append(f"**Cook Time:** {time_min}-{time_max} minutes")
        output.append(f"**Servings:** {self.servings}")
        
        output.append("\n## LEVEL 1 (Combi Cooker Pan) - BASE")
        output.append(f"- {self.base.main_ingredient}")
        output.append(f"- {self.base.liquid}")
        if self.base.oil_amount:
            output.append(f"- {self.base.oil_amount}")
        for ingredient in self.base.additional_ingredients:
            output.append(f"- {ingredient}")
        
        if self.tender_veggies:
            output.append(f"\n**Tender Veggies (add to Level 1 with base):**")
            for veggie in self.tender_veggies:
                output.append(f"- {veggie}")
        
        output.append("\n## LEVEL 2 (Bake Tray) - PROTEIN")
        output.append(f"- {self.protein.quantity}")
        if self.protein.preparation_notes:
            output.append(f"  {self.protein.preparation_notes}")
        
        if self.crispy_veggies:
            output.append(f"\n**Crispy Veggies (add to Level 2):**")
            for veggie in self.crispy_veggies:
                output.append(f"- {veggie}")
            output.append("  *Add hearty veggies at start, delicate veggies in last 5-7 minutes*")
        
        output.append("\n## INSTRUCTIONS")
        output.append("1. Add all Level 1 ingredients to Combi Cooker Pan and stir to combine")
        output.append("   - Include tender veggies if using")
        output.append("   - Slide pan into Level 1")
        output.append("")
        output.append("2. Prepare protein and place on Bake Tray")
        output.append("   - Add hearty crispy veggies if using")
        output.append("   - Slide tray into Level 2")
        output.append("")
        output.append("3. Close door and flip SmartSwitch to COMBI COOKER")
        output.append("   - Select COMBI MEALS")
        output.append(f"   - Set temperature to {temp_f}°F")
        output.append(f"   - Set time to {time_max} minutes")
        output.append("   - Press START/STOP")
        output.append("")
        if self.crispy_veggies:
            output.append("4. When 5-7 minutes remain, add delicate veggies to Level 2")
            output.append("")
        output.append(f"5. When cooking is complete:")
        output.append(f"   - Check protein is cooked through")
        if self.base.base_type in [CombiMealBase.PLAIN_PASTA, CombiMealBase.MARINARA_PASTA, CombiMealBase.ALFREDO_PASTA]:
            output.append("   - Stir pasta and let sit 5-10 minutes until sauce is absorbed")
        else:
            output.append("   - Fluff base with fork")
        output.append("   - Serve immediately")
        
        output.append("\n## TIPS")
        output.append("- Temperatures and times are for well-done proteins")
        output.append("- Monitor protein doneness and adjust time as needed")
        output.append("- Don't forget to add liquid to Level 1 (creates steam)")
        output.append("- If base needs more time, switch to SEAR/SAUTÉ with door open")
        
        output.append("\n" + "=" * 80)
        return "\n".join(output)


# ============================================================================
# BASE DEFINITIONS (from manual page 7)
# ============================================================================

BASE_RECIPES = {
    CombiMealBase.WHITE_RICE: BaseIngredients(
        base_type=CombiMealBase.WHITE_RICE,
        name="White Rice",
        main_ingredient="2 cups white rice, rinsed",
        liquid="4 cups water",
        oil_amount="1 tablespoon canola oil",
    ),
    
    CombiMealBase.INSTANT_BROWN_RICE: BaseIngredients(
        base_type=CombiMealBase.INSTANT_BROWN_RICE,
        name="Instant Brown Rice",
        main_ingredient="2 cups instant brown rice",
        liquid="1 3/4 cups water",
    ),
    
    CombiMealBase.BOXED_RICE_PILAF: BaseIngredients(
        base_type=CombiMealBase.BOXED_RICE_PILAF,
        name="Rice Pilaf",
        main_ingredient="2 boxes (6.9 oz each) rice pilaf mix with spice packets",
        liquid="3 1/2 cups water",
        oil_amount="2 tablespoons canola oil",
    ),
    
    CombiMealBase.BOXED_SPANISH_RICE: BaseIngredients(
        base_type=CombiMealBase.BOXED_SPANISH_RICE,
        name="Spanish Rice",
        main_ingredient="2 boxes (6.8 oz each) Spanish rice mix",
        liquid="4 cups water",
        oil_amount="2 tablespoons canola oil",
        additional_ingredients=["2 cans (14 oz each) diced tomatoes"],
    ),
    
    CombiMealBase.BOXED_WILD_RICE: BaseIngredients(
        base_type=CombiMealBase.BOXED_WILD_RICE,
        name="Wild Rice",
        main_ingredient="2 boxes (6 oz each) wild rice mix",
        liquid="3 1/2 cups water",
        oil_amount="2 tablespoons canola oil",
    ),
    
    CombiMealBase.ISRAELI_COUSCOUS: BaseIngredients(
        base_type=CombiMealBase.ISRAELI_COUSCOUS,
        name="Israeli Couscous",
        main_ingredient="2 boxes (10 oz each) Israeli couscous",
        liquid="4 cups water",
        oil_amount="2 tablespoons canola oil",
    ),
    
    CombiMealBase.QUINOA: BaseIngredients(
        base_type=CombiMealBase.QUINOA,
        name="Quinoa",
        main_ingredient="2 cups quinoa, rinsed",
        liquid="3 1/2 cups water",
    ),
    
    CombiMealBase.PLAIN_PASTA: BaseIngredients(
        base_type=CombiMealBase.PLAIN_PASTA,
        name="Plain Pasta",
        main_ingredient="1 box (16 oz) white or wheat pasta",
        liquid="4 1/2 cups water",
        oil_amount="1 tablespoon oil",
    ),
    
    CombiMealBase.MARINARA_PASTA: BaseIngredients(
        base_type=CombiMealBase.MARINARA_PASTA,
        name="Pasta with Marinara",
        main_ingredient="1 box (16 oz) pasta",
        liquid="3 cups water",
        oil_amount="1 tablespoon oil",
        additional_ingredients=["1 jar (32 oz) marinara sauce"],
    ),
    
    CombiMealBase.ALFREDO_PASTA: BaseIngredients(
        base_type=CombiMealBase.ALFREDO_PASTA,
        name="Pasta with Alfredo",
        main_ingredient="1 box (16 oz) pasta",
        liquid="2 1/2 cups water",
        additional_ingredients=["2 jars (15 oz each) Alfredo sauce"],
    ),
}


# ============================================================================
# PROTEIN DEFINITIONS (from manual page 7)
# ============================================================================

PROTEIN_RECIPES = {
    # Chicken
    CombiMealProtein.CHICKEN_BREAST_FRESH: ProteinDetails(
        protein_type=CombiMealProtein.CHICKEN_BREAST_FRESH,
        name="Chicken Breasts",
        quantity="6 boneless skinless chicken breasts (6-8 oz each, 1 inch thick)",
        weight_per_piece="6-8 oz",
        temperature_f=390,
        cook_time_minutes=(15, 18),
    ),
    
    CombiMealProtein.CHICKEN_BREAST_FROZEN: ProteinDetails(
        protein_type=CombiMealProtein.CHICKEN_BREAST_FROZEN,
        name="Frozen Chicken Breasts",
        quantity="5-6 frozen chicken breasts (5-8 oz each)",
        weight_per_piece="5-8 oz",
        temperature_f=390,
        cook_time_minutes=(15, 18),
        frozen_ok=True,
    ),
    
    CombiMealProtein.CHICKEN_THIGH_BONELESS: ProteinDetails(
        protein_type=CombiMealProtein.CHICKEN_THIGH_BONELESS,
        name="Chicken Thighs",
        quantity="6 boneless skinless chicken thighs (3-5 oz each)",
        weight_per_piece="3-5 oz",
        temperature_f=390,
        cook_time_minutes=(15, 18),
    ),
    
    CombiMealProtein.CHICKEN_THIGH_BONE_IN: ProteinDetails(
        protein_type=CombiMealProtein.CHICKEN_THIGH_BONE_IN,
        name="Chicken Thighs (Bone-In)",
        quantity="6 bone-in, skin-on chicken thighs (5-7 oz each)",
        weight_per_piece="5-7 oz",
        temperature_f=390,
        cook_time_minutes=(15, 18),
    ),
    
    CombiMealProtein.CHICKEN_CUTLET_BREADED: ProteinDetails(
        protein_type=CombiMealProtein.CHICKEN_CUTLET_BREADED,
        name="Breaded Chicken Cutlets",
        quantity="6 frozen breaded chicken cutlets (5-7 oz each)",
        weight_per_piece="5-7 oz",
        temperature_f=375,
        cook_time_minutes=(12, 15),
        frozen_ok=True,
    ),
    
    # Beef
    CombiMealProtein.STEAK_TIPS: ProteinDetails(
        protein_type=CombiMealProtein.STEAK_TIPS,
        name="Steak Tips",
        quantity="2 lbs steak tips, marinated",
        weight_per_piece="2 lbs total",
        temperature_f=350,
        cook_time_minutes=(12, 15),
        preparation_notes="Marinate before cooking for best flavor",
    ),
    
    CombiMealProtein.SIRLOIN_STEAKS: ProteinDetails(
        protein_type=CombiMealProtein.SIRLOIN_STEAKS,
        name="Sirloin Steaks",
        quantity="8 sirloin steaks (5-7 oz each)",
        weight_per_piece="5-7 oz",
        temperature_f=350,
        cook_time_minutes=(12, 15),
    ),
    
    CombiMealProtein.GROUND_BEEF: ProteinDetails(
        protein_type=CombiMealProtein.GROUND_BEEF,
        name="Ground Beef",
        quantity="2 lbs ground beef, broken into chunks or formed into patties",
        weight_per_piece="2 lbs total",
        temperature_f=350,
        cook_time_minutes=(12, 15),
        preparation_notes="Break into chunks or form 6-8 patties",
    ),
    
    CombiMealProtein.MEATBALLS: ProteinDetails(
        protein_type=CombiMealProtein.MEATBALLS,
        name="Meatballs",
        quantity="18-24 meatballs (1-1.5 inch each), fresh or frozen",
        weight_per_piece="1-1.5 inch diameter",
        temperature_f=350,
        cook_time_minutes=(12, 15),
        frozen_ok=True,
    ),
    
    # Pork
    CombiMealProtein.PORK_CHOPS_BONELESS: ProteinDetails(
        protein_type=CombiMealProtein.PORK_CHOPS_BONELESS,
        name="Pork Chops",
        quantity="8 boneless pork chops (6 oz each), fresh or frozen",
        weight_per_piece="6 oz",
        temperature_f=375,
        cook_time_minutes=(12, 15),
        frozen_ok=True,
    ),
    
    CombiMealProtein.PORK_CHOPS_BONE_IN: ProteinDetails(
        protein_type=CombiMealProtein.PORK_CHOPS_BONE_IN,
        name="Pork Chops (Bone-In)",
        quantity="4-6 bone-in pork chops (12-14 oz each)",
        weight_per_piece="12-14 oz",
        temperature_f=375,
        cook_time_minutes=(12, 15),
    ),
    
    CombiMealProtein.ITALIAN_SAUSAGES: ProteinDetails(
        protein_type=CombiMealProtein.ITALIAN_SAUSAGES,
        name="Italian Sausages",
        quantity="5-6 Italian sausages (1 lb total)",
        weight_per_piece="1 lb total",
        temperature_f=375,
        cook_time_minutes=(12, 15),
    ),
    
    # Seafood
    CombiMealProtein.SALMON_FILETS: ProteinDetails(
        protein_type=CombiMealProtein.SALMON_FILETS,
        name="Salmon Filets",
        quantity="6 salmon filets (5-8 oz each), fresh or frozen",
        weight_per_piece="5-8 oz",
        temperature_f=350,
        cook_time_minutes=(12, 15),
        frozen_ok=True,
    ),
    
    CombiMealProtein.JUMBO_SHRIMP: ProteinDetails(
        protein_type=CombiMealProtein.JUMBO_SHRIMP,
        name="Jumbo Shrimp",
        quantity="1.5 lbs jumbo shrimp, peeled and deveined, fresh or frozen",
        weight_per_piece="1.5 lbs total",
        temperature_f=350,
        cook_time_minutes=(12, 15),
        frozen_ok=True,
    ),
    
    # Plant-based
    CombiMealProtein.PLANT_BASED_BEEF: ProteinDetails(
        protein_type=CombiMealProtein.PLANT_BASED_BEEF,
        name="Plant-Based Beef",
        quantity="2 packages (12 oz each) plant-based beef",
        weight_per_piece="12 oz per package",
        temperature_f=350,
        cook_time_minutes=(12, 15),
        preparation_notes="Break into chunks or form into patties",
    ),
    
    CombiMealProtein.TOFU: ProteinDetails(
        protein_type=CombiMealProtein.TOFU,
        name="Tofu",
        quantity="1 package (16 oz) firm tofu, cut into 1-2 inch cubes or sticks",
        weight_per_piece="16 oz total",
        temperature_f=350,
        cook_time_minutes=(12, 15),
        preparation_notes="Press tofu to remove excess water, then cut into cubes",
    ),
}


# ============================================================================
# RECIPE BUILDER FUNCTIONS
# ============================================================================

def build_combi_meal(
    base: CombiMealBase,
    protein: CombiMealProtein,
    tender_veggies: Optional[list[str]] = None,
    crispy_veggies: Optional[list[str]] = None,
    servings: int = 6,
) -> CombiMealRecipe:
    """
    Build a custom Combi Meal recipe using the recipe builder formula.
    
    Args:
        base: Base grain or pasta type
        protein: Protein type
        tender_veggies: List of tender veggies to cook with base (optional)
        crispy_veggies: List of crispy veggies to cook with protein (optional)
        servings: Number of servings (default 6, can halve to 3)
    
    Returns:
        Complete CombiMealRecipe object
    
    Example:
        recipe = build_combi_meal(
            base=CombiMealBase.WHITE_RICE,
            protein=CombiMealProtein.CHICKEN_BREAST_FRESH,
            crispy_veggies=["2 cups broccoli florets", "1 cup sliced carrots"]
        )
        print(recipe.get_recipe_card())
    """
    base_ingredients = BASE_RECIPES[base]
    protein_details = PROTEIN_RECIPES[protein]
    
    return CombiMealRecipe(
        base=base_ingredients,
        protein=protein_details,
        tender_veggies=tender_veggies or [],
        crispy_veggies=crispy_veggies or [],
        servings=servings,
    )


def list_all_bases() -> list[str]:
    """List all available base options."""
    return [base.name for base in BASE_RECIPES.values()]


def list_all_proteins() -> list[str]:
    """List all available protein options."""
    return [protein.name for protein in PROTEIN_RECIPES.values()]


def get_base_info(base: CombiMealBase) -> BaseIngredients:
    """Get detailed information about a base."""
    return BASE_RECIPES[base]


def get_protein_info(protein: CombiMealProtein) -> ProteinDetails:
    """Get detailed information about a protein."""
    return PROTEIN_RECIPES[protein]
