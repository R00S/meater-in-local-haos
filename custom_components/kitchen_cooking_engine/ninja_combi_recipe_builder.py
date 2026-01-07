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
    use_meater_probe: bool = True  # Enable MEATER+ probe monitoring by default
    target_temp_c: Optional[int] = None  # Target temperature in Celsius
    target_temp_f: Optional[int] = None  # Target temperature in Fahrenheit
    
    def get_temperature_f(self) -> int:
        """Get cooking temperature in Fahrenheit."""
        return self.protein.temperature_f
    
    def get_cook_time_minutes(self) -> tuple[int, int]:
        """Get cooking time range in minutes."""
        return self.protein.cook_time_minutes
    
    def get_probe_target_temps(self) -> tuple[Optional[int], Optional[int]]:
        """Get probe target temperatures (Celsius, Fahrenheit)."""
        if self.target_temp_c and self.target_temp_f:
            return (self.target_temp_c, self.target_temp_f)
        
        # Default safe temperatures based on protein type
        protein_type = self.protein.protein_type
        
        if protein_type in [CombiMealProtein.CHICKEN_BREAST_FRESH, CombiMealProtein.CHICKEN_BREAST_FROZEN,
                           CombiMealProtein.CHICKEN_THIGH_BONELESS, CombiMealProtein.CHICKEN_THIGH_BONE_IN]:
            return (74, 165)  # Chicken safe temp
        elif protein_type in [CombiMealProtein.PORK_CHOPS_BONELESS, CombiMealProtein.PORK_CHOPS_BONE_IN]:
            return (63, 145)  # Pork safe temp
        elif protein_type in [CombiMealProtein.SALMON_FILETS]:
            return (54, 130)  # Salmon medium
        elif protein_type in [CombiMealProtein.JUMBO_SHRIMP]:
            return (60, 140)  # Shrimp safe temp
        elif protein_type in [CombiMealProtein.STEAK_TIPS, CombiMealProtein.SIRLOIN_STEAKS]:
            return (54, 130)  # Beef medium-rare
        elif protein_type in [CombiMealProtein.GROUND_BEEF, CombiMealProtein.MEATBALLS]:
            return (71, 160)  # Ground beef safe temp
        
        return (None, None)
    
    def get_recipe_card(self) -> str:
        """Generate a formatted recipe card."""
        temp_f = self.get_temperature_f()
        time_min, time_max = self.get_cook_time_minutes()
        target_c, target_f = self.get_probe_target_temps()
        
        output = []
        output.append("=" * 80)
        output.append(f"COMBI MEAL: {self.protein.name.upper()} WITH {self.base.name.upper()}")
        output.append("=" * 80)
        output.append(f"\n**Temperature:** {temp_f}°F")
        output.append(f"**Cook Time:** {time_min}-{time_max} minutes")
        output.append(f"**Servings:** {self.servings}")
        
        if self.use_meater_probe and target_c and target_f:
            output.append(f"**🌡️ MEATER+ Probe:** Recommended")
            output.append(f"**Target Temp:** {target_c}°C / {target_f}°F")
        
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
        
        if self.use_meater_probe and target_c:
            output.append(f"\n**🌡️ MEATER+ Setup:**")
            output.append(f"- Insert probe into thickest part of protein")
            output.append(f"- Avoid touching bone")
            output.append(f"- Monitor temperature in Home Assistant")
        
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
        if self.use_meater_probe and target_c:
            output.append("   - Insert MEATER+ probe into thickest part of protein")
        output.append("   - Add hearty crispy veggies if using")
        output.append("   - Slide tray into Level 2")
        output.append("")
        output.append("3. Close door and flip SmartSwitch to COMBI COOKER")
        output.append("   - Select COMBI MEALS")
        output.append(f"   - Set temperature to {temp_f}°F")
        output.append(f"   - Set time to {time_max} minutes")
        output.append("   - Press START/STOP")
        output.append("")
        if self.use_meater_probe and target_c:
            output.append(f"4. Monitor MEATER+ in Home Assistant Kitchen Cooking Engine panel")
            output.append(f"   - Watch temperature rise towards {target_c}°C / {target_f}°F")
            output.append(f"   - Get notification when target reached")
            output.append("")
        if self.crispy_veggies:
            step_num = "5" if self.use_meater_probe and target_c else "4"
            output.append(f"{step_num}. When 5-7 minutes remain, add delicate veggies to Level 2")
            output.append("")
        final_step = "6" if (self.use_meater_probe and target_c and self.crispy_veggies) else ("5" if (self.use_meater_probe and target_c) or self.crispy_veggies else "4")
        output.append(f"{final_step}. When cooking is complete:")
        if self.use_meater_probe and target_c:
            output.append(f"   - Verify internal temp reaches {target_c}°C / {target_f}°F")
        else:
            output.append(f"   - Check protein is cooked through")
        if self.base.base_type in [CombiMealBase.PLAIN_PASTA, CombiMealBase.MARINARA_PASTA, CombiMealBase.ALFREDO_PASTA]:
            output.append("   - Stir pasta and let sit 5-10 minutes until sauce is absorbed")
        else:
            output.append("   - Fluff base with fork")
        output.append("   - Serve immediately")
        
        output.append("\n## TIPS")
        output.append("- Temperatures and times are for well-done proteins")
        if self.use_meater_probe and target_c:
            output.append(f"- Use MEATER+ probe for perfect doneness ({target_c}°C / {target_f}°F)")
            output.append("- Remove when probe reaches target (or 2-3°C before for carryover)")
        else:
            output.append("- Consider using MEATER+ probe for precise monitoring")
        output.append("- Monitor protein doneness and adjust time as needed")
        output.append("- Don't forget to add liquid to Level 1 (creates steam)")
        output.append("- If base needs more time, switch to SEAR/SAUTÉ with door open")
        
        # Add MEATER cook session button if probe is enabled
        if self.use_meater_probe and target_c:
            meater_session = create_meater_cook_session_from_combi_meal(self)
            if meater_session:
                output.append(meater_session.get_start_cook_button())
        
        # Add recipe suggestions from database
        suggestions = suggest_similar_recipes(
            protein=self.protein.protein_type,
            base=self.base.base_type,
            mode="combi_meal"
        )
        if suggestions:
            output.append(format_recipe_suggestions(suggestions))
        
        output.append("\n" + "=" * 80)
        return "\n".join(output)
    
    def get_speedi_recipe_card(self) -> str:
        """Generate a Speedi-formatted recipe card (official Ninja Speedi style)."""
        temp_f = self.get_temperature_f()
        temp_c = int((temp_f - 32) * 5 / 9)  # Convert to Celsius
        time_min, time_max = self.get_cook_time_minutes()
        target_c, target_f = self.get_probe_target_temps()
        
        output = []
        output.append(f"SPEEDI MEAL: {self.protein.name.upper()} WITH {self.base.name.upper()}")
        output.append("")
        output.append("Ingredients")
        output.append("━" * 80)
        output.append("")
        
        # Base ingredients (bottom level)
        output.append("Base (Combi Cooker Pan - Bottom):")
        output.append(f"• {self.base.main_ingredient}")
        liquid_parts = self.base.liquid.split()
        output.append(f"• {self.base.liquid}")
        if self.base.oil_amount:
            output.append(f"• {self.base.oil_amount}")
        for ingredient in self.base.additional_ingredients:
            output.append(f"• {ingredient}")
        output.append("")
        
        # Vegetables with base
        if self.tender_veggies:
            output.append("Vegetables (with base):")
            for veggie in self.tender_veggies:
                output.append(f"• {veggie}")
            output.append("")
        
        # Protein (top level)
        output.append("Protein (Cook & Crisp Tray - Top):")
        output.append(f"• {self.protein.quantity}")
        output.append(f"• Seasoning")
        output.append("")
        
        # Crispy vegetables
        if self.crispy_veggies:
            output.append("Additional Vegetables (Cook & Crisp Tray):")
            for veggie in self.crispy_veggies:
                output.append(f"• {veggie}")
            output.append("")
        
        # Instructions
        output.append("Instructions")
        output.append("━" * 80)
        output.append("")
        
        # Tip: Serving size adjustment
        output.append(f"💡 TIP: This recipe is {self.servings//2}-{self.servings} servings. To reduce servings")
        output.append(f"for 1-2 people, cut the quantities in half for the base, veggies, and")
        output.append(f"protein, then follow temperature and time recommendations as listed.")
        output.append(f"Then, cover Crisper Tray with foil to protect base from additional heat.")
        output.append("")
        
        # Step 1: Add base
        output.append(f"1. Start by adding {self.base.name.lower()} ({self.base.main_ingredient.split(',')[0]}) to the")
        output.append(f"   bottom of the unit")
        output.append("")
        
        # Step 2: Add liquid and oil
        output.append(f"2. Add {self.base.liquid.lower()}")
        if self.base.oil_amount:
            output.append(f"   and {self.base.oil_amount.lower()}")
        output.append("")
        
        # Step 3: Mix vegetables with base
        if self.tender_veggies:
            veggie_list = ", ".join([v.lower() for v in self.tender_veggies])
            output.append(f"3. Mix {veggie_list} with the {self.base.name.lower()}.")
            if self.crispy_veggies:
                output.append(f"   (Alternatively vegetables can be cooked to tender in a foil packet")
                output.append(f"   placed on the Cook & Crisp tray with the {self.protein.name.lower()})")
            output.append("")
            
            # Tip: Crispy vegetables
            if self.crispy_veggies:
                output.append(f"   💡 TIP: For extra crispy results, add vegetables directly to the")
                output.append(f"   Cook & Crisp tray with the {self.protein.name.lower()}. Delicate vegetables")
                output.append(f"   should be added for the remaining 5-7 minutes.")
                output.append("")
            step_num = 4
        else:
            step_num = 3
        
        # Step: Season protein
        output.append(f"{step_num}. Season the {self.protein.name.lower()}")
        output.append("")
        
        # Tip: Marination
        output.append(f"   💡 TIP: Marinate the {self.protein.name.lower()} for a minimum of 30 minutes")
        output.append(f"   and up to 6 hours ahead of time with your favorite marinade, or buy")
        output.append(f"   pre-marinated proteins to save time.")
        output.append("")
        
        step_num += 1
        
        # Step: Place protein on tray
        output.append(f"{step_num}. Place your {self.protein.name.lower()} on the Cook & Crisp tray in the")
        output.append(f"   top position")
        output.append("")
        
        step_num += 1
        
        # Step: Cook
        output.append(f"{step_num}. Close the lid and flip the SmartSwitch to RAPID COOKER. Select")
        output.append(f"   SPEEDI MEALS, set temperature to {temp_c}°C, and set time for {time_min}")
        output.append(f"   to {time_max} minutes. Press START/STOP to begin cooking (the unit will")
        output.append(f"   steam for approximately 10 minutes before countdown timer begins).")
        output.append("")
        
        # Tip: Thickness
        output.append(f"   💡 TIP: We recommend sticking to the suggested heights and weights")
        output.append(f"   above for your protein. Thicker cuts of meat may need 3-5 extra")
        output.append(f"   minutes of cooking time which could overcook your grains.")
        output.append("")
        
        step_num += 1
        
        # MEATER+ monitoring
        if self.use_meater_probe and target_c:
            output.append(f"{step_num}. Monitor MEATER+ probe in Home Assistant")
            output.append(f"   - Target temperature: {target_c}°C / {target_f}°F")
            output.append(f"   - Get notification when target reached")
            output.append("")
            step_num += 1
        
        # Final step
        output.append(f"{step_num}. Enjoy!")
        output.append("")
        
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
    use_meater_probe: bool = True,
    target_temp_c: Optional[int] = None,
    target_temp_f: Optional[int] = None,
) -> CombiMealRecipe:
    """
    Build a custom Combi Meal recipe using the recipe builder formula.
    
    Args:
        base: Base grain or pasta type
        protein: Protein type
        tender_veggies: List of tender veggies to cook with base (optional)
        crispy_veggies: List of crispy veggies to cook with protein (optional)
        servings: Number of servings (default 6, can halve to 3)
        use_meater_probe: Enable MEATER+ probe monitoring (default True)
        target_temp_c: Target temperature in Celsius (optional, auto-set if not provided)
        target_temp_f: Target temperature in Fahrenheit (optional, auto-set if not provided)
    
    Returns:
        Complete CombiMealRecipe object with MEATER+ probe support
    
    Example:
        recipe = build_combi_meal(
            base=CombiMealBase.WHITE_RICE,
            protein=CombiMealProtein.CHICKEN_BREAST_FRESH,
            crispy_veggies=["2 cups broccoli florets", "1 cup sliced carrots"],
            use_meater_probe=True  # Enable probe monitoring
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
        use_meater_probe=use_meater_probe,
        target_temp_c=target_temp_c,
        target_temp_f=target_temp_f,
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


# ============================================================================
# AIR FRY COOKING CHARTS (from manual pages 29-30)
# ============================================================================

class AirFryIngredient(Enum):
    """Ingredients for Air Fry mode from cooking charts."""
    # Vegetables
    ASPARAGUS = "asparagus"
    BROCCOLI = "broccoli"
    BRUSSELS_SPROUTS = "brussels_sprouts"
    CARROTS = "carrots"
    CAULIFLOWER = "cauliflower"
    POTATOES_RUSSET = "potatoes_russet"
    POTATOES_SWEET = "potatoes_sweet"
    
    # Poultry
    CHICKEN_BREAST = "chicken_breast"
    CHICKEN_THIGH = "chicken_thigh"
    CHICKEN_WINGS = "chicken_wings"
    CHICKEN_WHOLE = "chicken_whole"
    
    # Beef
    BURGERS = "burgers"
    STEAKS = "steaks"
    
    # Pork & Lamb
    BACON = "bacon"
    PORK_CHOPS = "pork_chops"
    SAUSAGES = "sausages"
    
    # Seafood
    SALMON = "salmon"
    SHRIMP = "shrimp"


@dataclass
class AirFryGuide:
    """Cooking guide for Air Fry mode ingredients."""
    
    ingredient: AirFryIngredient
    name: str
    amount: str
    preparation: str
    oil: str
    temp_f: int
    cook_time_min: int
    cook_time_max: int
    use_probe: bool = False
    probe_temp_c: Optional[int] = None
    probe_temp_f: Optional[int] = None
    notes: str = ""


# Air Fry Cooking Chart Data (from manual)
AIR_FRY_GUIDES = {
    AirFryIngredient.CHICKEN_BREAST: AirFryGuide(
        ingredient=AirFryIngredient.CHICKEN_BREAST,
        name="Chicken Breasts (Boneless)",
        amount="4-6 breasts (6-8 oz each)",
        preparation="Boneless",
        oil="Brush with oil",
        temp_f=375,
        cook_time_min=22,
        cook_time_max=25,
        use_probe=True,
        probe_temp_c=74,
        probe_temp_f=165,
        notes="Use MEATER+ probe for perfect doneness"
    ),
    
    AirFryIngredient.CHICKEN_THIGH: AirFryGuide(
        ingredient=AirFryIngredient.CHICKEN_THIGH,
        name="Chicken Thighs (Boneless)",
        amount="4 thighs (4-8 oz each)",
        preparation="Boneless",
        oil="Brush with oil",
        temp_f=390,
        cook_time_min=18,
        cook_time_max=22,
        use_probe=True,
        probe_temp_c=74,
        probe_temp_f=165,
        notes="Use MEATER+ probe for perfect doneness"
    ),
    
    AirFryIngredient.CHICKEN_WINGS: AirFryGuide(
        ingredient=AirFryIngredient.CHICKEN_WINGS,
        name="Chicken Wings",
        amount="2 1/2 lbs",
        preparation="Drumettes & flats",
        oil="1 Tbsp",
        temp_f=390,
        cook_time_min=24,
        cook_time_max=28,
        use_probe=True,
        probe_temp_c=74,
        probe_temp_f=165,
        notes="Flip halfway through. Use MEATER+ probe to verify doneness"
    ),
    
    AirFryIngredient.CHICKEN_WHOLE: AirFryGuide(
        ingredient=AirFryIngredient.CHICKEN_WHOLE,
        name="Whole Chicken",
        amount="1 chicken (4-6 lbs)",
        preparation="Trussed",
        oil="Brush with oil",
        temp_f=375,
        cook_time_min=55,
        cook_time_max=75,
        use_probe=True,
        probe_temp_c=74,
        probe_temp_f=165,
        notes="Insert MEATER+ probe into thickest part of breast"
    ),
    
    AirFryIngredient.STEAKS: AirFryGuide(
        ingredient=AirFryIngredient.STEAKS,
        name="Beef Steaks",
        amount="2 steaks (8 oz each)",
        preparation="Whole",
        oil="None",
        temp_f=390,
        cook_time_min=10,
        cook_time_max=20,
        use_probe=True,
        probe_temp_c=54,  # Medium-rare
        probe_temp_f=130,
        notes="Use MEATER+ probe for precise doneness (54°C=medium-rare, 60°C=medium)"
    ),
    
    AirFryIngredient.SALMON: AirFryGuide(
        ingredient=AirFryIngredient.SALMON,
        name="Salmon Filets",
        amount="2 filets (4 oz each)",
        preparation="None",
        oil="Brush with oil",
        temp_f=390,
        cook_time_min=10,
        cook_time_max=13,
        use_probe=True,
        probe_temp_c=54,  # Medium
        probe_temp_f=130,
        notes="Use MEATER+ probe for perfect doneness (54°C=medium)"
    ),
    
    AirFryIngredient.PORK_CHOPS: AirFryGuide(
        ingredient=AirFryIngredient.PORK_CHOPS,
        name="Pork Chops (Boneless)",
        amount="4 boneless chops (6-8 oz each)",
        preparation="None",
        oil="Brush with oil",
        temp_f=375,
        cook_time_min=15,
        cook_time_max=18,
        use_probe=True,
        probe_temp_c=63,
        probe_temp_f=145,
        notes="Use MEATER+ probe for safe doneness (63°C/145°F)"
    ),
}


def get_air_fry_guide(ingredient: AirFryIngredient) -> Optional[AirFryGuide]:
    """Get Air Fry cooking guide for an ingredient."""
    return AIR_FRY_GUIDES.get(ingredient)


def list_air_fry_ingredients() -> list[str]:
    """List all ingredients with Air Fry guides."""
    return [guide.name for guide in AIR_FRY_GUIDES.values()]


def build_air_fry_recipe(ingredient: AirFryIngredient, use_meater_probe: bool = True) -> str:
    """
    Build an Air Fry recipe card from cooking chart data.
    
    Args:
        ingredient: Air fry ingredient
        use_meater_probe: Enable MEATER+ probe monitoring (default True)
    
    Returns:
        Formatted recipe card string
    """
    guide = get_air_fry_guide(ingredient)
    if not guide:
        return f"No cooking guide found for {ingredient.value}"
    
    output = []
    output.append("=" * 80)
    output.append(f"AIR FRY: {guide.name.upper()}")
    output.append("=" * 80)
    output.append(f"\n**Amount:** {guide.amount}")
    output.append(f"**Temperature:** {guide.temp_f}°F")
    output.append(f"**Cook Time:** {guide.cook_time_min}-{guide.cook_time_max} minutes")
    
    if guide.use_probe and use_meater_probe and guide.probe_temp_c:
        output.append(f"**🌡️ MEATER+ Probe:** Recommended")
        output.append(f"**Target Temp:** {guide.probe_temp_c}°C / {guide.probe_temp_f}°F")
    
    output.append("\n## INGREDIENTS")
    output.append(f"- {guide.amount} {guide.name.lower()}")
    if guide.oil and guide.oil != "None":
        output.append(f"- Oil: {guide.oil}")
    output.append("- Salt and pepper to taste")
    
    output.append("\n## INSTRUCTIONS")
    output.append(f"1. Prepare {guide.name.lower()}: {guide.preparation}")
    if guide.oil and guide.oil != "None":
        output.append(f"2. Apply oil: {guide.oil}")
    output.append("3. Season with salt and pepper")
    
    if guide.use_probe and use_meater_probe and guide.probe_temp_c:
        output.append("4. Insert MEATER+ probe into thickest part")
    
    output.append(f"5. Place on Crisper Plate in Combi Cooker Pan")
    output.append("6. Slide into Level 1")
    output.append("7. Close door and flip SmartSwitch to AIR FRY/STOVETOP")
    output.append("8. Select AIR FRY")
    output.append(f"9. Set temperature to {guide.temp_f}°F")
    output.append(f"10. Set time to {guide.cook_time_max} minutes (includes 5 min preheat)")
    output.append("11. Press START/STOP")
    
    if guide.use_probe and use_meater_probe and guide.probe_temp_c:
        output.append(f"\n## MEATER+ MONITORING")
        output.append(f"- Monitor temperature in Home Assistant")
        output.append(f"- Target: {guide.probe_temp_c}°C / {guide.probe_temp_f}°F")
        output.append(f"- Get notification when target reached")
    
    output.append("\n## TIPS")
    output.append("- Add 5 minutes for preheating when using Air Fry")
    output.append("- Shake/toss or flip often for even cooking")
    output.append("- Use instant-read thermometer to verify doneness")
    if guide.notes:
        output.append(f"- {guide.notes}")
    
    output.append("\n" + "=" * 80)
    return "\n".join(output)


# ============================================================================
# HELPER FUNCTIONS FOR ALL COOKING MODES
# ============================================================================

def get_all_cooking_modes() -> dict:
    """Get summary of all available cooking modes and their features."""
    return {
        "combi_meals": {
            "name": "Combi Meals (3-Part Meals)",
            "bases": len(BASE_RECIPES),
            "proteins": len(PROTEIN_RECIPES),
            "meater_probe": "Supported (recommended for proteins)",
            "description": "Build custom meals with base + protein + veggies"
        },
        "air_fry": {
            "name": "Air Fry",
            "ingredients": len(AIR_FRY_GUIDES),
            "meater_probe": "Supported for proteins",
            "description": "Crispy results without deep frying"
        },
    }


def print_cooking_mode_summary():
    """Print summary of all available cooking modes."""
    modes = get_all_cooking_modes()
    
    print("=" * 80)
    print("NINJA COMBI COOKING MODES WITH RECIPE BUILDER")
    print("=" * 80)
    
    for mode_key, mode_info in modes.items():
        print(f"\n{mode_info['name']}:")
        print(f"  Description: {mode_info['description']}")
        for key, value in mode_info.items():
            if key not in ['name', 'description']:
                print(f"  {key.replace('_', ' ').title()}: {value}")
    
    print("\n" + "=" * 80)
    print("All modes support MEATER+ probe integration for precise temperature monitoring!")
    print("=" * 80)


# ============================================================================
# COMBI-CRISP COOKING CHARTS (from manual pages 18-20)
# ============================================================================

class CombiCrispIngredient(Enum):
    """Ingredients for Combi-Crisp mode from cooking charts."""
    # Vegetables
    ACORN_SQUASH = "acorn_squash"
    BEETS = "beets"
    BROCCOLI_CC = "broccoli_cc"
    BRUSSELS_SPROUTS_CC = "brussels_sprouts_cc"
    CARROTS_CC = "carrots_cc"
    CAULIFLOWER_CC = "cauliflower_cc"
    RUSSET_POTATOES = "russet_potatoes"
    RUSSET_FRIES = "russet_fries"
    SWEET_POTATOES_CC = "sweet_potatoes_cc"
    
    # Fresh Poultry
    CHICKEN_BREAST_BONE_IN = "chicken_breast_bone_in"
    CHICKEN_BREAST_BONELESS_CC = "chicken_breast_boneless_cc"
    CHICKEN_THIGHS_BONE_IN_CC = "chicken_thighs_bone_in_cc"
    CHICKEN_THIGHS_BONELESS_CC = "chicken_thighs_boneless_cc"
    CHICKEN_WHOLE_CC = "chicken_whole_cc"
    CHICKEN_WINGS_CC = "chicken_wings_cc"
    
    # Fresh Pork
    PORK_CHOPS_BONELESS_CC = "pork_chops_boneless_cc"
    PORK_TENDERLOINS_CC = "pork_tenderloins_cc"
    
    # Fresh Fish
    SALMON_CC = "salmon_cc"
    COD_CC = "cod_cc"
    
    # Fresh Beef
    ROAST_BEEF = "roast_beef"
    BEEF_TENDERLOIN = "beef_tenderloin"
    
    # Frozen Proteins
    FROZEN_CHICKEN_BREAST = "frozen_chicken_breast"
    FROZEN_CHICKEN_THIGHS_BONELESS = "frozen_chicken_thighs_boneless"
    FROZEN_CHICKEN_WINGS = "frozen_chicken_wings"
    FROZEN_SALMON = "frozen_salmon"
    FROZEN_PORK_CHOPS = "frozen_pork_chops"


@dataclass
class CombiCrispGuide:
    """Cooking guide for Combi-Crisp mode ingredients."""
    
    ingredient: CombiCrispIngredient
    name: str
    amount: str
    preparation: str
    oil: str
    water: str
    temp_f: int
    cook_time_min: int
    cook_time_max: int
    use_probe: bool = False
    probe_temp_c: Optional[int] = None
    probe_temp_f: Optional[int] = None
    accessory: str = "Combi Cooker Pan, Crisper Plate"
    notes: str = ""


# Combi-Crisp Cooking Chart Data (from manual pages 18-20)
COMBI_CRISP_GUIDES = {
    # Vegetables
    CombiCrispIngredient.RUSSET_POTATOES: CombiCrispGuide(
        ingredient=CombiCrispIngredient.RUSSET_POTATOES,
        name="Russet Potatoes (Wedges)",
        amount="1.5-2 lbs",
        preparation="Cut into 8 wedges",
        oil="1 Tbsp",
        water="1/2 cup",
        temp_f=400,
        cook_time_min=15,
        cook_time_max=20,
        notes="Steam builds in 5-10 minutes"
    ),
    
    CombiCrispIngredient.BROCCOLI_CC: CombiCrispGuide(
        ingredient=CombiCrispIngredient.BROCCOLI_CC,
        name="Broccoli",
        amount="1 1/2 head",
        preparation="Large florets",
        oil="1-1 1/2 Tbsp",
        water="1/2 cup",
        temp_f=425,
        cook_time_min=10,
        cook_time_max=12,
        notes="Crispy outside, tender inside"
    ),
    
    # Fresh Poultry
    CombiCrispIngredient.CHICKEN_BREAST_BONELESS_CC: CombiCrispGuide(
        ingredient=CombiCrispIngredient.CHICKEN_BREAST_BONELESS_CC,
        name="Chicken Breasts (Boneless)",
        amount="6 breasts, 6-8 oz each",
        preparation="Brush with oil",
        oil="2 Tbsp",
        water="1 cup",
        temp_f=375,
        cook_time_min=15,
        cook_time_max=20,
        use_probe=True,
        probe_temp_c=74,
        probe_temp_f=165,
        accessory="Combi Cooker Pan, Bake Tray",
        notes="Use MEATER+ probe for perfect doneness"
    ),
    
    CombiCrispIngredient.CHICKEN_THIGHS_BONELESS_CC: CombiCrispGuide(
        ingredient=CombiCrispIngredient.CHICKEN_THIGHS_BONELESS_CC,
        name="Chicken Thighs (Boneless)",
        amount="6 thighs, 6-8 oz each",
        preparation="Brush with oil",
        oil="2 Tbsp",
        water="1 cup",
        temp_f=400,
        cook_time_min=10,
        cook_time_max=12,
        use_probe=True,
        probe_temp_c=74,
        probe_temp_f=165,
        accessory="Combi Cooker Pan, Bake Tray",
        notes="Use MEATER+ probe for perfect doneness"
    ),
    
    CombiCrispIngredient.CHICKEN_WHOLE_CC: CombiCrispGuide(
        ingredient=CombiCrispIngredient.CHICKEN_WHOLE_CC,
        name="Whole Chicken",
        amount="4 1/2-5 lbs",
        preparation="Trussed, brushed with oil",
        oil="Brushed with oil",
        water="1 cup",
        temp_f=400,
        cook_time_min=35,
        cook_time_max=40,
        use_probe=True,
        probe_temp_c=74,
        probe_temp_f=165,
        notes="Insert MEATER+ probe into thickest part of breast"
    ),
    
    # Fresh Pork
    CombiCrispIngredient.PORK_TENDERLOINS_CC: CombiCrispGuide(
        ingredient=CombiCrispIngredient.PORK_TENDERLOINS_CC,
        name="Pork Tenderloins",
        amount="3 tenderloins (1 lb each)",
        preparation="Brush with oil",
        oil="2 Tbsp",
        water="1 cup",
        temp_f=365,
        cook_time_min=25,
        cook_time_max=30,
        use_probe=True,
        probe_temp_c=63,
        probe_temp_f=145,
        notes="Use MEATER+ probe for safe doneness"
    ),
    
    # Fresh Fish
    CombiCrispIngredient.SALMON_CC: CombiCrispGuide(
        ingredient=CombiCrispIngredient.SALMON_CC,
        name="Salmon Filets",
        amount="6 filets, 6-7 oz each",
        preparation="None",
        oil="1 Tbsp",
        water="1 cup",
        temp_f=400,
        cook_time_min=6,
        cook_time_max=8,
        use_probe=True,
        probe_temp_c=54,
        probe_temp_f=130,
        accessory="Combi Cooker Pan, Bake Tray",
        notes="Use MEATER+ probe for perfect medium doneness"
    ),
    
    # Fresh Beef
    CombiCrispIngredient.BEEF_TENDERLOIN: CombiCrispGuide(
        ingredient=CombiCrispIngredient.BEEF_TENDERLOIN,
        name="Beef Tenderloin",
        amount="2-3 lbs",
        preparation="None",
        oil="2 Tbsp",
        water="1 cup",
        temp_f=365,
        cook_time_min=25,
        cook_time_max=30,
        use_probe=True,
        probe_temp_c=54,
        probe_temp_f=130,
        notes="Use MEATER+ probe - 54°C for medium-rare, 60°C for medium"
    ),
    
    # Frozen Proteins
    CombiCrispIngredient.FROZEN_CHICKEN_BREAST: CombiCrispGuide(
        ingredient=CombiCrispIngredient.FROZEN_CHICKEN_BREAST,
        name="Frozen Chicken Breasts (Boneless)",
        amount="4 breasts, 4-6 oz each",
        preparation="As desired",
        oil="2 Tbsp",
        water="2 cups",
        temp_f=390,
        cook_time_min=18,
        cook_time_max=23,
        use_probe=True,
        probe_temp_c=74,
        probe_temp_f=165,
        accessory="Combi Cooker Pan, Bake Tray",
        notes="Frozen proteins need 2 cups water. Use MEATER+ probe"
    ),
    
    CombiCrispIngredient.FROZEN_SALMON: CombiCrispGuide(
        ingredient=CombiCrispIngredient.FROZEN_SALMON,
        name="Frozen Salmon Filets",
        amount="5-6 filets, 6 oz each",
        preparation="None",
        oil="2 Tbsp",
        water="2 cups",
        temp_f=450,
        cook_time_min=10,
        cook_time_max=13,
        use_probe=True,
        probe_temp_c=54,
        probe_temp_f=130,
        accessory="Combi Cooker Pan, Bake Tray",
        notes="Frozen proteins need 2 cups water. Use MEATER+ probe"
    ),
}


# ============================================================================
# SOUS VIDE COOKING CHART (from manual pages 33-34)
# ============================================================================

class SousVideIngredient(Enum):
    """Ingredients for Sous Vide mode from cooking charts."""
    # Beef
    BEEF_FILET_MIGNON = "beef_filet_mignon"
    BEEF_RIBEYE = "beef_ribeye"
    
    # Pork
    PORK_CHOPS_SV = "pork_chops_sv"
    PORK_TENDERLOIN_SV = "pork_tenderloin_sv"
    PORK_SAUSAGES_SV = "pork_sausages_sv"
    
    # Chicken
    CHICKEN_BREAST_SV = "chicken_breast_sv"
    CHICKEN_THIGHS_SV = "chicken_thighs_sv"
    CHICKEN_WINGS_SV = "chicken_wings_sv"
    
    # Seafood
    SALMON_SV = "salmon_sv"
    SHRIMP_SV = "shrimp_sv"
    WHITEFISH_SV = "whitefish_sv"


@dataclass
class SousVideGuide:
    """Cooking guide for Sous Vide mode ingredients."""
    
    ingredient: SousVideIngredient
    name: str
    amount: str
    temp_f: int
    cook_time_min_hrs: float
    cook_time_max_hrs: float
    doneness: str
    use_probe: bool = True  # Always use probe with sous vide
    probe_temp_c: Optional[int] = None
    probe_temp_f: Optional[int] = None
    notes: str = ""


# Sous Vide Cooking Chart Data (from manual pages 33-34)
SOUS_VIDE_GUIDES = {
    SousVideIngredient.BEEF_FILET_MIGNON: SousVideGuide(
        ingredient=SousVideIngredient.BEEF_FILET_MIGNON,
        name="Filet Mignon (Medium-Rare)",
        amount="4 steaks, 8 oz each, 1-2 inches thick",
        temp_f=130,
        cook_time_min_hrs=1,
        cook_time_max_hrs=5,
        doneness="Medium Rare",
        probe_temp_c=54,
        probe_temp_f=130,
        notes="Finish with searing for crust. Use MEATER+ to monitor bath temp"
    ),
    
    SousVideIngredient.PORK_CHOPS_SV: SousVideGuide(
        ingredient=SousVideIngredient.PORK_CHOPS_SV,
        name="Pork Chops (Boneless)",
        amount="4 chops, 6-8 oz each, 1-2 inches thick",
        temp_f=145,
        cook_time_min_hrs=1,
        cook_time_max_hrs=4,
        doneness="Safe",
        probe_temp_c=63,
        probe_temp_f=145,
        notes="Finish with searing. Use MEATER+ to monitor bath temp"
    ),
    
    SousVideIngredient.CHICKEN_BREAST_SV: SousVideGuide(
        ingredient=SousVideIngredient.CHICKEN_BREAST_SV,
        name="Chicken Breasts",
        amount="4 breasts, 6-8 oz each, 1-2 inches thick",
        temp_f=165,
        cook_time_min_hrs=1,
        cook_time_max_hrs=3,
        doneness="Safe",
        probe_temp_c=74,
        probe_temp_f=165,
        notes="Finish with searing or air frying. Use MEATER+ to monitor"
    ),
    
    SousVideIngredient.SALMON_SV: SousVideGuide(
        ingredient=SousVideIngredient.SALMON_SV,
        name="Salmon",
        amount="4 portions, 6-10 oz each, 1-2 inches thick",
        temp_f=130,
        cook_time_min_hrs=1,
        cook_time_max_hrs=1.5,
        doneness="Medium",
        probe_temp_c=54,
        probe_temp_f=130,
        notes="Finish with searing. Use MEATER+ to monitor bath temp"
    ),
}


# ============================================================================
# HELPER FUNCTIONS FOR START MEATER COOK
# ============================================================================

@dataclass
class MeaterCookSession:
    """Data structure for starting a MEATER cook session."""
    
    recipe_name: str
    cooking_mode: str  # "combi_meal", "air_fry", "combi_crisp", "sous_vide"
    target_temp_c: int
    target_temp_f: int
    cook_time_minutes: int
    oven_temp_f: int
    instructions: list[str]
    
    def get_ha_service_call(self) -> dict:
        """Generate Home Assistant service call data for starting a MEATER cook."""
        return {
            "service": "kitchen_cooking_engine.start_cook",
            "data": {
                "recipe_name": self.recipe_name,
                "cooking_mode": self.cooking_mode,
                "target_temp_c": self.target_temp_c,
                "target_temp_f": self.target_temp_f,
                "cook_time_minutes": self.cook_time_minutes,
                "oven_temp_f": self.oven_temp_f,
                "use_probe": True,
                "instructions": self.instructions,
            }
        }
    
    def get_start_cook_button(self) -> str:
        """Generate a formatted button/instruction for starting MEATER cook."""
        output = []
        output.append("\n" + "="*80)
        output.append("🌡️ START COOK WITH MEATER+ PROBE")
        output.append("="*80)
        output.append(f"\n**Recipe:** {self.recipe_name}")
        output.append(f"**Mode:** {self.cooking_mode.replace('_', ' ').title()}")
        output.append(f"**Target Temp:** {self.target_temp_c}°C / {self.target_temp_f}°F")
        output.append(f"**Cook Time:** {self.cook_time_minutes} minutes")
        output.append(f"**Oven Temp:** {self.oven_temp_f}°F")
        
        output.append("\n### TO START COOK IN HOME ASSISTANT:")
        output.append("1. Open Home Assistant")
        output.append("2. Go to Kitchen Cooking Engine panel")
        output.append("3. Click 'Start New Cook'")
        output.append(f"4. Select '{self.recipe_name}'")
        output.append("5. Insert MEATER+ probe into protein")
        output.append("6. Click 'Start Cooking'")
        output.append("7. Monitor temperature in real-time")
        output.append("8. Get notification when target reached!")
        
        output.append("\n### OR USE SERVICE CALL:")
        output.append("```yaml")
        output.append(f"service: kitchen_cooking_engine.start_cook")
        output.append(f"data:")
        output.append(f"  recipe_name: {self.recipe_name}")
        output.append(f"  target_temp_c: {self.target_temp_c}")
        output.append(f"  target_temp_f: {self.target_temp_f}")
        output.append(f"  cook_time_minutes: {self.cook_time_minutes}")
        output.append("```")
        output.append("\n" + "="*80 + "\n")
        
        return "\n".join(output)


def create_meater_cook_session_from_combi_meal(recipe: 'CombiMealRecipe') -> Optional[MeaterCookSession]:
    """Create a MEATER cook session from a Combi Meal recipe."""
    if not recipe.use_meater_probe:
        return None
    
    target_c, target_f = recipe.get_probe_target_temps()
    if not target_c or not target_f:
        return None
    
    time_min, time_max = recipe.get_cook_time_minutes()
    
    instructions = [
        f"1. Add {recipe.base.name} ingredients to Level 1",
        "2. Insert MEATER+ probe into protein",
        "3. Place protein on Level 2",
        f"4. Set oven to {recipe.get_temperature_f()}°F",
        f"5. Cook for {time_max} minutes",
        f"6. Monitor probe until {target_c}°C / {target_f}°F",
    ]
    
    return MeaterCookSession(
        recipe_name=f"{recipe.protein.name} with {recipe.base.name}",
        cooking_mode="combi_meal",
        target_temp_c=target_c,
        target_temp_f=target_f,
        cook_time_minutes=time_max,
        oven_temp_f=recipe.get_temperature_f(),
        instructions=instructions,
    )


def get_combi_crisp_guide(ingredient: CombiCrispIngredient) -> Optional[CombiCrispGuide]:
    """Get Combi-Crisp cooking guide for an ingredient."""
    return COMBI_CRISP_GUIDES.get(ingredient)


def get_sous_vide_guide(ingredient: SousVideIngredient) -> Optional[SousVideGuide]:
    """Get Sous Vide cooking guide for an ingredient."""
    return SOUS_VIDE_GUIDES.get(ingredient)


def list_combi_crisp_ingredients() -> list[str]:
    """List all ingredients with Combi-Crisp guides."""
    return [guide.name for guide in COMBI_CRISP_GUIDES.values()]


def list_sous_vide_ingredients() -> list[str]:
    """List all ingredients with Sous Vide guides."""
    return [guide.name for guide in SOUS_VIDE_GUIDES.values()]


# ============================================================================
# COMBI-BAKE BUILDER (NEW)
# ============================================================================

class BakeType(Enum):
    """Types of baked goods for Combi-Bake mode."""
    
    ARTISAN_BREAD = "artisan_bread"
    PASTRIES = "pastries"
    CAKES = "cakes"
    COOKIES = "cookies"
    BISCUITS = "biscuits"
    PIE_CRUST = "pie_crust"
    CROISSANTS = "croissants"
    PIZZA_DOUGH = "pizza_dough"


@dataclass
class CombiBakeParams:
    """Parameters for Combi-Bake recipes."""
    
    bake_type: BakeType
    name: str
    steam_temp_f: int
    steam_minutes: int
    bake_temp_f: int
    bake_minutes: int
    water_cups: float
    tray_position: str
    description: str


# Combi-Bake parameter mapping
COMBI_BAKE_PARAMS = {
    BakeType.ARTISAN_BREAD: CombiBakeParams(
        bake_type=BakeType.ARTISAN_BREAD,
        name="Artisan Bread",
        steam_temp_f=400,
        steam_minutes=15,
        bake_temp_f=375,
        bake_minutes=20,
        water_cups=2.0,
        tray_position="Middle",
        description="Steam creates professional bakery crust, then bake completes interior"
    ),
    BakeType.PASTRIES: CombiBakeParams(
        bake_type=BakeType.PASTRIES,
        name="Pastries",
        steam_temp_f=375,
        steam_minutes=10,
        bake_temp_f=350,
        bake_minutes=15,
        water_cups=1.0,
        tray_position="Middle",
        description="Light steam for flaky layers, gentle bake to finish"
    ),
    BakeType.CAKES: CombiBakeParams(
        bake_type=BakeType.CAKES,
        name="Cakes",
        steam_temp_f=325,
        steam_minutes=0,
        bake_temp_f=325,
        bake_minutes=35,
        water_cups=0.5,
        tray_position="Middle",
        description="Minimal steam for moisture, even baking throughout"
    ),
    BakeType.COOKIES: CombiBakeParams(
        bake_type=BakeType.COOKIES,
        name="Cookies",
        steam_temp_f=350,
        steam_minutes=0,
        bake_temp_f=350,
        bake_minutes=12,
        water_cups=0.0,
        tray_position="Middle",
        description="No steam needed, direct baking for crispy edges"
    ),
    BakeType.BISCUITS: CombiBakeParams(
        bake_type=BakeType.BISCUITS,
        name="Biscuits",
        steam_temp_f=425,
        steam_minutes=5,
        bake_temp_f=400,
        bake_minutes=10,
        water_cups=1.0,
        tray_position="Middle",
        description="Quick steam for rise, hot bake for golden tops"
    ),
    BakeType.PIE_CRUST: CombiBakeParams(
        bake_type=BakeType.PIE_CRUST,
        name="Pie Crust",
        steam_temp_f=375,
        steam_minutes=0,
        bake_temp_f=375,
        bake_minutes=25,
        water_cups=0.0,
        tray_position="Lower",
        description="No steam, direct heat from below for crispy bottom"
    ),
    BakeType.CROISSANTS: CombiBakeParams(
        bake_type=BakeType.CROISSANTS,
        name="Croissants",
        steam_temp_f=400,
        steam_minutes=10,
        bake_temp_f=375,
        bake_minutes=15,
        water_cups=1.5,
        tray_position="Middle",
        description="Steam expands butter layers, bake creates golden exterior"
    ),
    BakeType.PIZZA_DOUGH: CombiBakeParams(
        bake_type=BakeType.PIZZA_DOUGH,
        name="Pizza Dough",
        steam_temp_f=450,
        steam_minutes=5,
        bake_temp_f=450,
        bake_minutes=12,
        water_cups=1.0,
        tray_position="Lower",
        description="Quick steam for chewy texture, high heat for crispy crust"
    ),
}


def build_combi_bake_recipe(
    bake_type: BakeType,
    custom_name: Optional[str] = None,
    servings: int = 8,
    use_meater_probe: bool = False
) -> str:
    """
    Build a Combi-Bake recipe with steam + bake phases.
    
    Args:
        bake_type: Type of baked good
        custom_name: Optional custom recipe name
        servings: Number of servings
        use_meater_probe: Whether to use MEATER+ (not typical for baking)
    
    Returns:
        Formatted recipe card
    """
    params = COMBI_BAKE_PARAMS.get(bake_type)
    if not params:
        return f"Error: No parameters found for {bake_type}"
    
    recipe_name = custom_name if custom_name else params.name
    
    output = []
    output.append("=" * 80)
    output.append(f"COMBI-BAKE: {recipe_name.upper()}")
    output.append("=" * 80)
    
    if params.steam_minutes > 0:
        output.append(f"\n**Phase 1 - Steam:** {params.steam_temp_f}°F for {params.steam_minutes} minutes")
        output.append(f"**Phase 2 - Bake:** {params.bake_temp_f}°F for {params.bake_minutes} minutes")
        output.append(f"**Total Time:** {params.steam_minutes + params.bake_minutes} minutes")
    else:
        output.append(f"\n**Temperature:** {params.bake_temp_f}°F")
        output.append(f"**Bake Time:** {params.bake_minutes} minutes")
    
    output.append(f"**Water Required:** {params.water_cups} cups")
    output.append(f"**Tray Position:** {params.tray_position}")
    output.append(f"**Servings:** {servings}")
    
    output.append(f"\n## ABOUT THIS METHOD")
    output.append(params.description)
    
    output.append("\n## SETUP")
    if params.water_cups > 0:
        output.append(f"1. Fill water tank with {params.water_cups} cups water")
    else:
        output.append("1. No water needed for this recipe")
    output.append(f"2. Position tray in {params.tray_position} position")
    output.append("3. Prepare your baked goods on tray")
    
    output.append("\n## COOKING INSTRUCTIONS")
    output.append("1. Close door and flip SmartSwitch to COMBI COOKER")
    output.append("2. Select COMBI-BAKE mode")
    
    if params.steam_minutes > 0:
        output.append(f"3. Set temperature to {params.steam_temp_f}°F")
        output.append(f"4. Set time to {params.steam_minutes} minutes (steam phase)")
        output.append("5. Press START/STOP")
        output.append(f"6. When steam phase completes, oven will automatically continue")
        output.append(f"7. Bake phase: {params.bake_temp_f}°F for {params.bake_minutes} minutes")
        output.append("8. Check for doneness - golden brown, sounds hollow when tapped")
    else:
        output.append(f"3. Set temperature to {params.bake_temp_f}°F")
        output.append(f"4. Set time to {params.bake_minutes} minutes")
        output.append("5. Press START/STOP")
        output.append("6. Check for doneness - golden brown")
    
    output.append("\n## TIPS")
    output.append(f"- Steam phase creates professional bakery-quality {params.name.lower()}")
    output.append("- Don't open door during steam phase (releases steam)")
    output.append("- Check 2-3 minutes before end time to prevent over-baking")
    output.append("- Let cool on wire rack for best texture")
    
    if bake_type == BakeType.ARTISAN_BREAD:
        output.append("- For extra-crispy crust, add 5 minutes to bake time")
        output.append("- Score dough before baking for professional appearance")
    elif bake_type == BakeType.CROISSANTS:
        output.append("- Brush with egg wash before baking for golden shine")
        output.append("- Don't overbake - should be deep golden, not dark brown")
    elif bake_type == BakeType.PIZZA_DOUGH:
        output.append("- Use parchment paper for easy removal")
        output.append("- Add toppings before baking")
    
    output.append("\n" + "=" * 80)
    return "\n".join(output)


# ============================================================================
# RECIPE SUGGESTIONS FROM DATABASE
# ============================================================================

def suggest_similar_recipes(
    protein: Optional[CombiMealProtein] = None,
    base: Optional[CombiMealBase] = None,
    mode: Optional[str] = None,
    limit: int = 5
) -> list[dict]:
    """
    Suggest similar recipes from the database based on ingredients/mode.
    
    Args:
        protein: Protein type to match
        base: Base ingredient to match
        mode: Cooking mode to match
        limit: Maximum number of suggestions
    
    Returns:
        List of recipe suggestions with match scores
    """
    try:
        from . import ninja_combi_data
    except ImportError:
        # Standalone script mode
        try:
            import ninja_combi_data
        except ImportError:
            # No recipe database available
            return []
    
    suggestions = []
    
    # Score each recipe
    for recipe in ninja_combi_data.NINJA_COMBI_RECIPES:
        score = 0
        match_reasons = []
        
        # Check protein match (50 points)
        if protein:
            protein_name = protein.value.replace("_", " ")
            recipe_ingredients_lower = " ".join([ing.lower() for ing in recipe.ingredients])
            
            if "chicken" in protein_name and "chicken" in recipe_ingredients_lower:
                score += 50
                match_reasons.append("chicken")
            elif "salmon" in protein_name and "salmon" in recipe_ingredients_lower:
                score += 50
                match_reasons.append("salmon")
            elif "pork" in protein_name and "pork" in recipe_ingredients_lower:
                score += 50
                match_reasons.append("pork")
            elif "beef" in protein_name and "beef" in recipe_ingredients_lower:
                score += 50
                match_reasons.append("beef")
            elif "shrimp" in protein_name and "shrimp" in recipe_ingredients_lower:
                score += 50
                match_reasons.append("shrimp")
        
        # Check base match (30 points)
        if base:
            base_name = base.value.replace("_", " ")
            recipe_ingredients_lower = " ".join([ing.lower() for ing in recipe.ingredients])
            
            if "rice" in base_name and "rice" in recipe_ingredients_lower:
                score += 30
                match_reasons.append("rice")
            elif "pasta" in base_name and "pasta" in recipe_ingredients_lower:
                score += 30
                match_reasons.append("pasta")
            elif "couscous" in base_name and "couscous" in recipe_ingredients_lower:
                score += 30
                match_reasons.append("couscous")
            elif "quinoa" in base_name and "quinoa" in recipe_ingredients_lower:
                score += 30
                match_reasons.append("quinoa")
        
        # Check mode match (20 points)
        if mode:
            if recipe.mode.value == mode:
                score += 20
                match_reasons.append(f"{mode} mode")
        
        if score > 0:
            suggestions.append({
                "recipe": recipe,
                "score": score,
                "match_reasons": match_reasons
            })
    
    # Sort by score (highest first) and return top matches
    suggestions.sort(key=lambda x: x["score"], reverse=True)
    return suggestions[:limit]


def format_recipe_suggestions(suggestions: list[dict]) -> str:
    """Format recipe suggestions for display."""
    if not suggestions:
        return ""
    
    output = []
    output.append("\n" + "=" * 80)
    output.append("💡 SIMILAR RECIPES FROM DATABASE")
    output.append("=" * 80)
    output.append("\nYou might also like these tested recipes:\n")
    
    for i, suggestion in enumerate(suggestions, 1):
        recipe = suggestion["recipe"]
        reasons = ", ".join(suggestion["match_reasons"])
        
        output.append(f"{i}. **{recipe.name}** (Recipe #{recipe.id})")
        output.append(f"   Mode: {recipe.mode.value.replace('_', ' ').title()}")
        output.append(f"   Cook Time: {recipe.cook_time_minutes} min | Difficulty: {recipe.difficulty.title()}")
        output.append(f"   Match: {reasons}")
        if recipe.use_probe:
            output.append(f"   🌡️ MEATER+ Probe: {recipe.target_temp_c}°C / {recipe.target_temp_f}°F")
        output.append("")
    
    output.append("=" * 80)
    return "\n".join(output)


# ============================================================================
# INGREDIENT MODIFICATION (START FROM RECIPE)
# ============================================================================

def modify_recipe_ingredient(
    recipe_id: int,
    ingredient_to_replace: str,
    new_ingredient: Optional[CombiMealProtein] = None,
    new_base: Optional[CombiMealBase] = None,
) -> str:
    """
    Start from an existing recipe and modify ingredients.
    Automatically adjusts cooking parameters based on new ingredients.
    
    Args:
        recipe_id: ID of recipe to start from
        ingredient_to_replace: Name of ingredient to replace (e.g., "salmon", "rice")
        new_ingredient: New protein to use (if replacing protein)
        new_base: New base to use (if replacing base)
    
    Returns:
        Modified recipe with adjusted parameters
    """
    try:
        from . import ninja_combi_data
    except ImportError:
        # Standalone script mode
        try:
            import ninja_combi_data
        except ImportError:
            return "Error: Recipe database not available"
    
    # Find original recipe
    original = None
    for recipe in ninja_combi_data.NINJA_COMBI_RECIPES:
        if recipe.id == recipe_id:
            original = recipe
            break
    
    if not original:
        return f"Error: Recipe #{recipe_id} not found"
    
    output = []
    output.append("=" * 80)
    output.append(f"MODIFIED RECIPE: {original.name.upper()}")
    output.append("=" * 80)
    output.append(f"\n**Original Recipe:** {original.name} (#{original.id})")
    output.append(f"**Modification:** Replacing {ingredient_to_replace}")
    
    # Determine what's being replaced and adjust parameters
    modifications = []
    new_temp_f = None
    new_time_min = None
    new_probe_temp_c = None
    new_probe_temp_f = None
    new_water_amount = None
    new_mode = original.mode
    
    # PROTEIN REPLACEMENT
    if new_ingredient:
        protein_details = PROTEIN_RECIPES.get(new_ingredient)
        if protein_details:
            new_temp_f = protein_details.temperature_f
            new_time_min = protein_details.cook_time_minutes[1]  # Use max time
            
            # Get probe temps
            if new_ingredient in [CombiMealProtein.CHICKEN_BREAST_FRESH, CombiMealProtein.CHICKEN_BREAST_FROZEN,
                                 CombiMealProtein.CHICKEN_THIGH_BONELESS, CombiMealProtein.CHICKEN_THIGH_BONE_IN]:
                new_probe_temp_c, new_probe_temp_f = 74, 165
            elif new_ingredient in [CombiMealProtein.PORK_CHOPS_BONELESS, CombiMealProtein.PORK_CHOPS_BONE_IN]:
                new_probe_temp_c, new_probe_temp_f = 63, 145
            elif new_ingredient == CombiMealProtein.SALMON_FILETS:
                new_probe_temp_c, new_probe_temp_f = 54, 130
            elif new_ingredient in [CombiMealProtein.STEAK_TIPS, CombiMealProtein.SIRLOIN_STEAKS]:
                new_probe_temp_c, new_probe_temp_f = 54, 130
            elif new_ingredient in [CombiMealProtein.GROUND_BEEF, CombiMealProtein.MEATBALLS]:
                new_probe_temp_c, new_probe_temp_f = 71, 160
            
            modifications.append(f"- Protein: {ingredient_to_replace} → {protein_details.name}")
            modifications.append(f"- Temperature: {new_temp_f}°F (adjusted for {protein_details.name})")
            modifications.append(f"- Cook Time: ~{new_time_min} minutes (adjusted)")
            if new_probe_temp_c:
                modifications.append(f"- MEATER+ Target: {new_probe_temp_c}°C / {new_probe_temp_f}°F")
    
    # BASE REPLACEMENT
    if new_base:
        base_details = BASE_RECIPES.get(new_base)
        if base_details:
            # Extract liquid amount from base recipe
            liquid_parts = base_details.liquid.split()
            if len(liquid_parts) >= 2:
                new_water_amount = f"{liquid_parts[0]} {liquid_parts[1]}"
            
            modifications.append(f"- Base: {ingredient_to_replace} → {base_details.name}")
            if new_water_amount:
                modifications.append(f"- Liquid: {new_water_amount} (adjusted for {base_details.name})")
    
    # Display modifications
    if modifications:
        output.append(f"\n## AUTOMATIC ADJUSTMENTS")
        for mod in modifications:
            output.append(mod)
    
    # Show adjusted recipe details
    output.append(f"\n## ADJUSTED RECIPE DETAILS")
    output.append(f"**Mode:** {new_mode.value.replace('_', ' ').title()}")
    
    if new_temp_f:
        output.append(f"**Temperature:** {new_temp_f}°F")
    elif original.phases:
        # For multi-phase recipes, show phase temps
        output.append(f"**Temperature:** See phases below")
    
    if new_time_min:
        output.append(f"**Cook Time:** ~{new_time_min} minutes")
    else:
        output.append(f"**Cook Time:** {original.cook_time_minutes} minutes (from original)")
    
    output.append(f"**Servings:** {original.servings}")
    output.append(f"**Difficulty:** {original.difficulty.title()}")
    
    if new_probe_temp_c:
        output.append(f"\n**🌡️ MEATER+ Probe Recommended**")
        output.append(f"**Target Temperature:** {new_probe_temp_c}°C / {new_probe_temp_f}°F")
    
    # Show phases if multi-phase recipe
    if original.phases:
        output.append(f"\n## COOKING PHASES")
        for i, phase in enumerate(original.phases, 1):
            output.append(f"\n**Phase {i}: {phase.description}**")
            
            # Use adjusted temp if available, otherwise original
            phase_temp = new_temp_f if new_temp_f and i == len(original.phases) else phase.temperature_f
            output.append(f"- Temperature: {phase_temp}°F ({phase.temperature_c}°C)")
            output.append(f"- Duration: {phase.duration_minutes} minutes")
            if phase.steam_enabled:
                output.append(f"- Steam: Enabled")
    
    # Ingredients (modified)
    output.append(f"\n## INGREDIENTS")
    for ingredient in original.ingredients:
        # Replace ingredient text if it matches
        if ingredient_to_replace.lower() in ingredient.lower():
            if new_ingredient:
                protein_details = PROTEIN_RECIPES.get(new_ingredient)
                output.append(f"- {protein_details.quantity} (MODIFIED)")
            elif new_base:
                base_details = BASE_RECIPES.get(new_base)
                output.append(f"- {base_details.main_ingredient} (MODIFIED)")
            else:
                output.append(f"- {ingredient}")
        else:
            output.append(f"- {ingredient}")
    
    # Instructions (adapted from original)
    output.append(f"\n## INSTRUCTIONS")
    output.append("(Adapted from original recipe with modifications)")
    for i, instruction in enumerate(original.instructions, 1):
        # Update instructions with new ingredient names
        modified_instruction = instruction
        if new_ingredient:
            protein_details = PROTEIN_RECIPES.get(new_ingredient)
            modified_instruction = modified_instruction.replace(
                ingredient_to_replace,
                protein_details.name.lower()
            )
        if new_base:
            base_details = BASE_RECIPES.get(new_base)
            modified_instruction = modified_instruction.replace(
                ingredient_to_replace,
                base_details.name.lower()
            )
        
        output.append(f"{i}. {modified_instruction}")
    
    # Tips from original
    if original.tips:
        output.append(f"\n## TIPS")
        for tip in original.tips:
            output.append(f"- {tip}")
        
        # Add modification-specific tip
        if new_ingredient:
            output.append(f"- Cooking time and temperature adjusted for {protein_details.name}")
        if new_base:
            output.append(f"- Liquid amount adjusted for {base_details.name}")
    
    output.append("\n## NOTES")
    output.append(f"This recipe was automatically adapted from '{original.name}'.")
    output.append("Parameters have been adjusted based on the new ingredients.")
    output.append("Monitor cooking progress and adjust as needed.")
    
    output.append("\n" + "=" * 80)
    return "\n".join(output)


def get_recipe_by_id(recipe_id: int):
    """Get a recipe from the database by ID."""
    try:
        from . import ninja_combi_data
    except ImportError:
        # Standalone script mode
        try:
            import ninja_combi_data
        except ImportError:
            return None
    
    for recipe in ninja_combi_data.NINJA_COMBI_RECIPES:
        if recipe.id == recipe_id:
            return recipe
    return None
