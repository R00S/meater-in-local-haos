"""
AI-Powered Recipe Builder for Kitchen Cooking Engine.

Last Updated: 14 Jan 2026, 03:27 UTC
Last Change: Initial implementation of AI recipe generation

This module provides AI-powered recipe generation using OpenAI integration.
Instead of a static recipe database, it generates custom recipes on-the-fly
based on user's ingredients, cooking style, and available appliances.

Usage:
    builder = AIRecipeBuilder(hass)
    suggestions = await builder.generate_recipe_suggestions(
        ingredients=["chicken breast", "broccoli", "rice"],
        cooking_style="quick_and_easy",
        appliances=["ninja_combi", "meater_probe"]
    )
"""

from __future__ import annotations

import logging
from dataclasses import dataclass, field
from enum import Enum
from typing import List, Optional, Set, Dict, Any

from homeassistant.core import HomeAssistant
from homeassistant.helpers.aiohttp_client import async_get_clientsession
from homeassistant.components import conversation

from .recipes.models import (
    UnifiedRecipe,
    CookingPhase,
    RecipeDifficulty,
    DietaryTag,
    CuisineType,
    MealType,
)
from .appliances.registry import get_registry

_LOGGER = logging.getLogger(__name__)


class CookingStyle(Enum):
    """Cooking style preferences for AI recipe generation."""
    
    QUICK_AND_EASY = "quick_and_easy"
    GOURMET = "gourmet"
    HEALTHY = "healthy"
    COMFORT_FOOD = "comfort_food"
    FAMILY_FRIENDLY = "family_friendly"
    MEAL_PREP = "meal_prep"
    ONE_POT = "one_pot"
    LOW_CARB = "low_carb"
    HIGH_PROTEIN = "high_protein"
    VEGETARIAN = "vegetarian"
    VEGAN = "vegan"
    SLOW_COOK = "slow_cook"
    BARBEQUE = "barbeque"
    BAKING = "baking"


class IngredientCategory(Enum):
    """Categories for ingredient selection."""
    
    PROTEINS = "proteins"
    VEGETABLES = "vegetables"
    GRAINS = "grains"
    DAIRY = "dairy"
    SPICES = "spices"
    OTHER = "other"


# Maximum ratio of *extra* ingredients the AI may add, relative to the number
# of user-selected ingredients, keyed by CookingStyle value.
# A ratio of 0.50 means: if the user selected 4 ingredients, the AI may add
# at most 2 more (= 4 × 0.50).  These are *ceilings*, not targets.
# The complexity slider (1–5) adjusts them further via _get_ingredient_ceiling().
_INGREDIENT_CEILING_BY_STYLE: Dict[str, float] = {
    "quick_and_easy":   0.50,   # keep it short — at most 50% extra
    "comfort_food":     0.50,   # familiar, simple ingredient lists
    "family_friendly":  0.75,   # a little more variety allowed
    "one_pot":          0.75,   # limited by the single-vessel constraint
    "healthy":          0.75,   # focused ingredient list
    "low_carb":         0.75,   # focused on protein/veg, not elaborate
    "high_protein":     0.75,   # protein-first, moderate supporting cast
    "vegetarian":       1.00,   # plant-based often needs broader pantry
    "vegan":            1.00,   # same rationale as vegetarian
    "slow_cook":        1.00,   # low-and-slow benefits from a full pantry
    "barbeque":         1.25,   # rubs, brines, sauces add ingredient depth
    "baking":           1.25,   # leavening, fats, dairy, flavourings add up
    "meal_prep":        1.50,   # batch cooking justifies more ingredients
    "gourmet":          2.00,   # complex dishes may need twice as many items
}
# Fallback when style is not recognised
_INGREDIENT_CEILING_DEFAULT: float = 1.00


@dataclass
class Ingredient:
    """An ingredient that can be selected for recipe generation."""
    
    id: str
    name: str
    category: IngredientCategory
    common: bool = True  # Common ingredients appear first in UI


@dataclass
class AIRecipeSuggestion:
    """A recipe suggestion from AI (summary only)."""
    
    id: str  # Temporary ID for this session
    name: str
    description: str
    cook_time_minutes: int
    difficulty: str
    main_ingredients: List[str]
    cuisine_type: Optional[str] = None
    required_appliances: List[str] = field(default_factory=list)
    recipe_origin: str = "original"  # "known" for classic recipes, "original" for AI-created


@dataclass
class AIRecipeDetail:
    """Detailed recipe from AI with full instructions."""
    
    suggestion: AIRecipeSuggestion
    ingredients: List[str]
    instructions: List[str]
    tips: List[str]
    phases: List[CookingPhase] = field(default_factory=list)
    use_probe: bool = False
    target_temp_c: Optional[int] = None
    target_temp_f: Optional[int] = None
    servings: int = 4
    prep_time_minutes: int = 0


# Common ingredients database for UI selection
COMMON_INGREDIENTS = [
    # Proteins
    Ingredient("chicken_breast", "Chicken Breast", IngredientCategory.PROTEINS),
    Ingredient("chicken_thigh", "Chicken Thighs", IngredientCategory.PROTEINS),
    Ingredient("ground_beef", "Ground Beef", IngredientCategory.PROTEINS),
    Ingredient("steak", "Steak (Beef)", IngredientCategory.PROTEINS),
    Ingredient("pork_chop", "Pork Chops", IngredientCategory.PROTEINS),
    Ingredient("salmon", "Salmon", IngredientCategory.PROTEINS),
    Ingredient("shrimp", "Shrimp", IngredientCategory.PROTEINS),
    Ingredient("tofu", "Tofu", IngredientCategory.PROTEINS),
    Ingredient("eggs", "Eggs", IngredientCategory.PROTEINS),
    
    # Vegetables
    Ingredient("broccoli", "Broccoli", IngredientCategory.VEGETABLES),
    Ingredient("carrots", "Carrots", IngredientCategory.VEGETABLES),
    Ingredient("bell_peppers", "Bell Peppers", IngredientCategory.VEGETABLES),
    Ingredient("onions", "Onions", IngredientCategory.VEGETABLES),
    Ingredient("garlic", "Garlic", IngredientCategory.VEGETABLES),
    Ingredient("tomatoes", "Tomatoes", IngredientCategory.VEGETABLES),
    Ingredient("spinach", "Spinach", IngredientCategory.VEGETABLES),
    Ingredient("potatoes", "Potatoes", IngredientCategory.VEGETABLES),
    Ingredient("sweet_potatoes", "Sweet Potatoes", IngredientCategory.VEGETABLES),
    Ingredient("zucchini", "Zucchini", IngredientCategory.VEGETABLES),
    Ingredient("cauliflower", "Cauliflower", IngredientCategory.VEGETABLES),
    Ingredient("green_beans", "Green Beans", IngredientCategory.VEGETABLES),
    
    # Grains
    Ingredient("rice", "Rice", IngredientCategory.GRAINS),
    Ingredient("pasta", "Pasta", IngredientCategory.GRAINS),
    Ingredient("quinoa", "Quinoa", IngredientCategory.GRAINS),
    Ingredient("bread", "Bread", IngredientCategory.GRAINS),
    Ingredient("tortillas", "Tortillas", IngredientCategory.GRAINS),
    
    # Dairy
    Ingredient("cheese", "Cheese", IngredientCategory.DAIRY),
    Ingredient("milk", "Milk", IngredientCategory.DAIRY),
    Ingredient("butter", "Butter", IngredientCategory.DAIRY),
    Ingredient("cream", "Cream", IngredientCategory.DAIRY),
    Ingredient("yogurt", "Yogurt", IngredientCategory.DAIRY),
]


class AIRecipeBuilder:
    """AI-powered recipe builder using OpenAI integration."""
    
    def __init__(self, hass: HomeAssistant):
        """Initialize the AI recipe builder.
        
        Args:
            hass: Home Assistant instance
        """
        self.hass = hass
        self._session_recipes: Dict[str, AIRecipeDetail] = {}
        self._recipe_counter = 0
    
    async def check_openai_available(self) -> bool:
        """Check if OpenAI conversation integration is available.
        
        Returns:
            True if OpenAI is configured and available
        """
        try:
            # Check if conversation component is loaded
            if "conversation" not in self.hass.data:
                _LOGGER.debug("Conversation component not in hass.data")
                return False
            
            # Check if there's a conversation agent configured
            # The conversation component manages agents including OpenAI
            try:
                agents = await self.hass.async_add_executor_job(
                    conversation.async_get_conversation_agent, self.hass, None
                )
                # If we get an agent, conversation is available
                if agents:
                    _LOGGER.debug("Conversation agent found, OpenAI should be available")
                    return True
            except AttributeError:
                # async_get_conversation_agent might not exist in older HA versions
                # Just check if conversation domain exists
                _LOGGER.debug("Using fallback check - conversation domain exists")
                return True
            
            return False
            
        except Exception as ex:
            _LOGGER.warning("OpenAI conversation check failed: %s", ex)
            # Return True anyway to let user try - they'll get error if it doesn't work
            return True

    @staticmethod
    def _get_ingredient_ceiling(
        user_ingredient_count: int,
        cooking_style: str,
        complexity: int,
    ) -> int:
        """Return the maximum number of *extra* ingredients the AI may add.

        The ceiling is derived from the cooking-style base ratio (see
        ``_INGREDIENT_CEILING_BY_STYLE``) adjusted by the complexity slider:

        - complexity 1 → 60 % of the base ceiling  (very simple)
        - complexity 2 → 80 %
        - complexity 3 → 100 % (baseline, no adjustment)
        - complexity 4 → 120 %
        - complexity 5 → 140 %  (chef level)

        Unrecognised cooking styles fall back to ``_INGREDIENT_CEILING_DEFAULT``
        (1.0). Complexity values outside [1, 5] are clamped silently.

        The returned value is always at least 1 so the AI is never forced to
        use *only* the user's ingredients.
        """
        base_ratio = _INGREDIENT_CEILING_BY_STYLE.get(
            cooking_style, _INGREDIENT_CEILING_DEFAULT
        )
        # ±20 % per step away from complexity 3, clamped to [1, 5]
        clamped = max(1, min(5, complexity))
        complexity_multiplier = 1.0 + (clamped - 3) * 0.20
        max_extra = round(user_ingredient_count * base_ratio * complexity_multiplier)
        return max(1, max_extra)

    async def generate_recipe_suggestions(
        self,
        ingredients: List[str],
        cooking_style: str,
        appliance_ids: Optional[List[str]] = None,
        main_appliance_id: Optional[str] = None,
        dietary_restrictions: Optional[List[str]] = None,
        servings: int = 4,
        max_time_minutes: Optional[int] = None,
        complexity: int = 3,
        cuisines: Optional[List[str]] = None,
    ) -> List[AIRecipeSuggestion]:
        """Generate 4 recipe suggestions from AI.
        
        Args:
            ingredients: List of ingredient names
            cooking_style: Cooking style preference (from CookingStyle enum)
            appliance_ids: Optional list of available appliance IDs
            main_appliance_id: Optional ID of the primary/selected appliance
            dietary_restrictions: Optional dietary restrictions
            servings: Number of servings
            max_time_minutes: Optional maximum cooking time
            complexity: Recipe complexity 1-5 (1=very simple, 5=chef level)
            cuisines: Optional list of cuisine/region IDs for fusion cooking
        
        Returns:
            List of 4 recipe suggestions
        """
        # Get appliance info
        appliance_info = await self._get_appliance_info(appliance_ids)
        
        # Build the prompt for AI
        prompt = self._build_suggestion_prompt(
            ingredients=ingredients,
            cooking_style=cooking_style,
            appliance_info=appliance_info,
            main_appliance_id=main_appliance_id,
            dietary_restrictions=dietary_restrictions,
            servings=servings,
            max_time_minutes=max_time_minutes,
            complexity=complexity,
            cuisines=cuisines,
        )
        
        # Call OpenAI via conversation integration
        try:
            response = await self._call_openai(prompt)
            suggestions = self._parse_suggestions(response)
            
            if not suggestions:
                _LOGGER.warning("No suggestions parsed from AI response")
                return self._get_fallback_suggestions(ingredients)
            
            return suggestions
            
        except Exception as ex:
            _LOGGER.error("Failed to generate recipe suggestions: %s", ex, exc_info=True)
            # Don't return fallback - let the error propagate so user knows something is wrong
            raise RuntimeError(
                f"Failed to generate recipes. Please check your OpenAI configuration. Error: {str(ex)}"
            )
    
    async def get_recipe_detail(
        self,
        suggestion_id: str,
        suggestion: AIRecipeSuggestion,
        appliance_ids: Optional[List[str]] = None,
        cooking_style: str = "quick_and_easy",
        complexity: int = 3,
        user_ingredients: Optional[List[str]] = None,
        servings: int = 4,
    ) -> Optional[AIRecipeDetail]:
        """Get detailed recipe for a suggestion.
        
        Args:
            suggestion_id: ID of the suggestion to expand
            suggestion: The suggestion object with recipe summary
            appliance_ids: Optional list of available appliance IDs
            cooking_style: Original cooking style used for suggestions
            complexity: Recipe complexity 1-5 (used for ingredient ceiling)
            user_ingredients: Original user-selected ingredients (for ceiling)
            servings: Number of servings requested by the user
        
        Returns:
            Detailed recipe with instructions
        """
        # Check if we already generated this detail
        if suggestion_id in self._session_recipes:
            return self._session_recipes[suggestion_id]
        
        # Get appliance info
        appliance_info = await self._get_appliance_info(appliance_ids)
        
        # Build prompt for detailed recipe
        prompt = self._build_detail_prompt(
            suggestion,
            appliance_info,
            cooking_style=cooking_style,
            complexity=complexity,
            user_ingredients=user_ingredients or suggestion.main_ingredients,
            servings=servings,
        )
        
        # Call OpenAI
        try:
            response = await self._call_openai(prompt)
            detail = self._parse_recipe_detail(response, suggestion)
            
            # Cache the detail
            self._session_recipes[suggestion_id] = detail
            return detail
            
        except Exception as ex:
            _LOGGER.error("Failed to get recipe detail: %s", ex, exc_info=True)
            raise RuntimeError(f"Failed to get recipe detail: {str(ex)}")
    
    def convert_to_unified_recipe(
        self,
        detail: AIRecipeDetail,
    ) -> UnifiedRecipe:
        """Convert AI recipe detail to UnifiedRecipe format.
        
        Args:
            detail: AI recipe detail
        
        Returns:
            UnifiedRecipe that can be used with appliance system
        """
        # Generate a unique recipe ID
        self._recipe_counter += 1
        recipe_id = 9000 + self._recipe_counter  # AI recipes start at 9000
        
        # Extract features from appliances
        required_features = set()
        for appliance in detail.suggestion.required_appliances:
            # Map appliance names to features
            if "oven" in appliance.lower() or "combi" in appliance.lower():
                required_features.add("oven")
            if "air" in appliance.lower() and "fry" in appliance.lower():
                required_features.add("air_fry")
            if "probe" in appliance.lower() or "meater" in appliance.lower():
                required_features.add("temperature_probe")
        
        # Parse difficulty
        difficulty_map = {
            "easy": RecipeDifficulty.EASY,
            "medium": RecipeDifficulty.MEDIUM,
            "hard": RecipeDifficulty.HARD,
        }
        difficulty = difficulty_map.get(
            detail.suggestion.difficulty.lower(),
            RecipeDifficulty.MEDIUM
        )
        
        # Create unified recipe
        recipe = UnifiedRecipe(
            id=recipe_id,
            name=detail.suggestion.name,
            description=detail.suggestion.description,
            required_features=required_features,
            optional_features=set(),
            suggested_appliances=detail.suggestion.required_appliances,
            alternative_appliances=[],
            phases=detail.phases,
            use_probe=detail.use_probe,
            target_temp_c=detail.target_temp_c,
            target_temp_f=detail.target_temp_f,
            ingredients=detail.ingredients,
            instructions=detail.instructions,
            tips=detail.tips,
            prep_time_minutes=detail.prep_time_minutes,
            cook_time_minutes=detail.suggestion.cook_time_minutes,
            servings=detail.servings,
            difficulty=difficulty,
            custom_tags={"ai_generated", "custom"},
        )
        
        return recipe
    
    async def _get_appliance_info(
        self,
        appliance_ids: Optional[List[str]] = None
    ) -> Dict[str, Any]:
        """Get information about available appliances.
        
        Args:
            appliance_ids: Optional list of appliance IDs to include
        
        Returns:
            Dictionary with appliance information
        """
        registry = get_registry(self.hass)
        
        if not appliance_ids:
            # Get all appliances
            appliances = registry.get_all_appliances()
        else:
            # Get specific appliances
            appliances = [
                registry.get_appliance(aid)
                for aid in appliance_ids
                if registry.get_appliance(aid)
            ]
        
        # Extract appliance info
        info = {
            "appliances": [],
            "features": set(),
        }
        
        for appliance in appliances:
            # Build feature details including modification notes
            feature_details = {}
            for fname in appliance.features.keys():
                ftype = appliance.get_feature_type(fname)
                fnotes = appliance.get_feature_notes(fname)
                detail = {"type": ftype.value if ftype else "standard"}
                if fnotes:
                    detail["notes"] = fnotes
                feature_details[fname] = detail
            
            info["appliances"].append({
                "appliance_id": appliance.appliance_id,
                "name": appliance.name,
                "brand": appliance.brand,
                "model": appliance.model,
                "features": list(appliance.features.keys()),
                "feature_details": feature_details,
            })
            info["features"].update(appliance.features.keys())
        
        return info
    
    def _build_suggestion_prompt(
        self,
        ingredients: List[str],
        cooking_style: str,
        appliance_info: Dict[str, Any],
        dietary_restrictions: Optional[List[str]],
        servings: int,
        max_time_minutes: Optional[int],
        complexity: int = 3,
        cuisines: Optional[List[str]] = None,
        main_appliance_id: Optional[str] = None,
    ) -> str:
        """Build prompt for recipe suggestions.
        
        Args:
            ingredients: Selected ingredients
            cooking_style: Cooking style
            appliance_info: Available appliances and features
            dietary_restrictions: Dietary restrictions
            servings: Number of servings
            max_time_minutes: Maximum cooking time
            complexity: Recipe complexity 1-5
            cuisines: Optional cuisine/region preferences
        
        Returns:
            Formatted prompt for OpenAI
        """
        appliance_list = ", ".join([
            f"{a['brand']} {a['model']}" 
            for a in appliance_info["appliances"]
        ]) if appliance_info["appliances"] else "standard kitchen equipment"
        
        feature_list = ", ".join(sorted(appliance_info["features"]))
        
        # Build modification notes section for AI context
        mod_notes_lines = []
        for a in appliance_info.get("appliances", []):
            for fname, detail in a.get("feature_details", {}).items():
                if detail.get("notes"):
                    mod_notes_lines.append(f"- {a['name']} {fname}: {detail['notes']}")
        modification_notes = ""
        if mod_notes_lines:
            modification_notes = (
                "\n\nAppliance modification notes (adapt recipes accordingly):\n"
                + "\n".join(mod_notes_lines)
            )

        # Build primary appliance directive when user has selected a specific appliance
        primary_appliance_directive = ""
        if main_appliance_id and appliance_info and appliance_info.get("appliances"):
            main_appliance = next(
                (a for a in appliance_info["appliances"] if a.get("appliance_id") == main_appliance_id),
                None,
            )
            if main_appliance is None:
                _LOGGER.warning(
                    "main_appliance_id '%s' not found in appliance_info; "
                    "skipping primary appliance directive",
                    main_appliance_id,
                )
            else:
                main_name = f"{main_appliance['brand']} {main_appliance['model']}"
                primary_appliance_directive = (
                    f"\nCRITICAL RULE — PRIMARY APPLIANCE:\n"
                    f"The user has specifically selected the {main_name} as their primary cooking appliance. "
                    f"ALL 4 recipes MUST be designed to be cooked primarily using this appliance. "
                    f"Exploit its unique cooking modes and features. "
                    f"Do NOT suggest recipes that require a different primary appliance."
                )
        
        restrictions = (
            f"\nDietary restrictions: {', '.join(dietary_restrictions)}"
            if dietary_restrictions else ""
        )
        
        time_constraint = (
            f"\nMaximum cooking time: {max_time_minutes} minutes"
            if max_time_minutes else ""
        )

        complexity_labels = {
            1: "very simple (few steps, basic techniques, beginner-friendly)",
            2: "simple (straightforward, minimal prep)",
            3: "medium (moderate steps, some technique required)",
            4: "complex (multi-step, advanced techniques)",
            5: "chef level (restaurant-quality, advanced skills required)",
        }
        complexity_desc = complexity_labels.get(complexity, complexity_labels[3])

        # --- Ingredient ceiling rule ---
        max_extra = self._get_ingredient_ceiling(
            user_ingredient_count=len(ingredients),
            cooking_style=cooking_style,
            complexity=complexity,
        )
        ingredient_ceiling_rule = (
            f"\nCRITICAL RULE — INGREDIENT LIMIT:\n"
            f"The user selected {len(ingredients)} ingredient(s). You may add at most "
            f"{max_extra} additional ingredient(s) beyond those listed above (excluding "
            f"basic staples: oil, butter, salt, black pepper, sugar, vinegar). "
            f"This is a hard ceiling — do NOT exceed it. This limit reflects the "
            f"'{cooking_style.replace('_', ' ')}' cooking style at complexity {complexity}."
        )

        # --- Cooking-time honesty rule ---
        cooking_time_honesty_rule = (
            "\nCRITICAL RULE — HONEST COOKING TIME:\n"
            "The cook_time_minutes value MUST include every minute the cook must spend "
            "from start to finish — including pre-soaking, dry-brining, marinating, "
            "tempering, resting, and any other prep the cook must perform. "
            "Do NOT assume any ingredient has been pre-prepared in advance UNLESS the "
            "user explicitly listed it in its pre-prepped form (e.g. 'pre-soaked rice "
            "noodles' means no soaking time; 'rice noodles' means soaking time IS "
            "included). Never hide prep time by assuming it was already done."
        )

        cuisine_hint = ""
        if cuisines and len(cuisines) > 0:
            cuisine_names = [c.replace('_', ' ').title() for c in cuisines]
            if len(cuisine_names) == 1:
                cuisine_hint = f"\nCuisine focus: {cuisine_names[0]} — IMPORTANT: use authentic local {cuisine_names[0]} cooking traditions as practiced in the cuisine's countries of origin, NOT Americanized/Westernized adaptations. Suggest dishes that locals would recognize and cook at home."
            else:
                cuisine_hint = f"\nCuisine fusion: combine elements from {', '.join(cuisine_names)} — blend authentic local traditions from each cuisine. Each cuisine's contribution should reflect how it is cooked in its home country, not Westernized versions."
        
        prompt = f"""You are a professional chef creating recipes for a home kitchen.

Available ingredients: {', '.join(ingredients)}
Also assume basic staples are available: cooking oil, butter, salt, black pepper, sugar, vinegar.
Cooking style: {cooking_style.replace('_', ' ')}
Servings: {servings}
Complexity level: {complexity_desc}{cuisine_hint}{restrictions}{time_constraint}
{ingredient_ceiling_rule}
{cooking_time_honesty_rule}
{primary_appliance_directive}
Available kitchen equipment:
{appliance_list}

Available cooking features:
{feature_list}{modification_notes}

CRITICAL RULE — AUTHENTIC LOCAL COOKING:
When a cuisine is specified, you MUST suggest recipes that follow the authentic local
cooking traditions of that cuisine's home country. Do NOT suggest Americanized or
Westernized adaptations. For example:
- Indian: suggest dishes like Dal Makhani, Chole, Sambar, Aviyal — NOT "Chicken Tikka Masala"
  (a British invention). Use traditional souring agents (tamarind, amchur, kokum) not tomato
  in every dish. Tomato-based gravies are a modern/colonial addition.
- Chinese: suggest dishes like Mapo Tofu, Kung Pao Chicken, Red-Braised Pork (Hong Shao Rou)
  — NOT "General Tso's Chicken" or "Orange Chicken" (American-Chinese inventions).
- Middle Eastern: suggest dishes like Musakhan, Makloubeh, Mansaf, Kousa Mahshi
  — NOT simplified "falafel wraps" or dishes heavy on tomato sauce.
- Thai: suggest dishes like Gaeng Som, Larb, Khao Soi — NOT just Pad Thai and Green Curry.
If the user wants fusion (e.g., Indian + American), both cuisines will be listed above
and you should then blend them. A single cuisine means: cook it the local way.

Please suggest 4 quite different recipes using these ingredients. For each recipe, provide:
1. Recipe name - IMPORTANT naming rules:
   - Prefer well-known, real dish names that people can find online (e.g. "Dal Makhani", "Mapo Tofu", "Bibimbap", "Shakshuka", "Musakhan").
   - Only use a creative/poetic name if the dish is a well-known classic (e.g. "Coq au Vin" is fine, but don't invent names like "Midnight Sun Grilled Salmon").
   - For original/invented recipes, use a simple descriptive name based on the main ingredients and cooking method (e.g. "Pan-Seared Salmon with Dill Cream Sauce").
2. Brief description (1-2 sentences)
3. Total cooking time in minutes (MUST include all prep: soaking, marinating, dry-brining, etc.)
4. Difficulty level (easy, medium, or hard)
5. Main ingredients used from the list
6. Required appliances/equipment
7. Cuisine type (if applicable)
8. Whether this is a known/classic recipe or an AI-created original ("known" or "original")

Try to include at least 2 well-known classic recipes that people can search for online, and mark the rest as originals.
If you have web search tools available, use them to find and verify real recipe sources.

Format your response as a JSON array with exactly 4 recipes:
[
  {{
    "name": "Recipe Name",
    "description": "Brief description",
    "cook_time_minutes": 45,
    "difficulty": "medium",
    "main_ingredients": ["ingredient1", "ingredient2"],
    "required_appliances": ["oven", "probe"],
    "cuisine_type": "italian",
    "recipe_origin": "known"
  }},
  ...
]

Make the recipes diverse in cooking methods, flavors, and cuisines.
"""
        return prompt
    
    def _build_detail_prompt(
        self,
        suggestion: AIRecipeSuggestion,
        appliance_info: Dict[str, Any],
        cooking_style: str = "quick_and_easy",
        complexity: int = 3,
        user_ingredients: Optional[List[str]] = None,
        servings: int = 4,
    ) -> str:
        """Build prompt for detailed recipe.
        
        Args:
            suggestion: The recipe suggestion to expand
            appliance_info: Available appliances
            cooking_style: Original cooking style (for ingredient ceiling)
            complexity: Recipe complexity 1-5 (for ingredient ceiling)
            user_ingredients: Original user-selected ingredients (for ceiling)
            servings: Number of servings requested by the user
        
        Returns:
            Formatted prompt for detailed recipe
        """
        appliance_list = ", ".join([
            f"{a['brand']} {a['model']}" 
            for a in appliance_info["appliances"]
        ]) if appliance_info["appliances"] else "standard kitchen equipment"
        
        # Build modification notes section for AI context
        mod_notes_lines = []
        for a in appliance_info.get("appliances", []):
            for fname, detail in a.get("feature_details", {}).items():
                if detail.get("notes"):
                    mod_notes_lines.append(f"- {a['name']} {fname}: {detail['notes']}")
        modification_notes = ""
        if mod_notes_lines:
            modification_notes = (
                "\n\nAppliance modification notes (adapt recipes accordingly):\n"
                + "\n".join(mod_notes_lines)
            )
        
        # Resolve user ingredients once so the same list is used throughout
        resolved_ingredients = user_ingredients if user_ingredients else suggestion.main_ingredients
        max_extra = self._get_ingredient_ceiling(
            len(resolved_ingredients), cooking_style, complexity
        )

        prompt = f"""You are a professional chef. Please provide the complete, detailed recipe for:

Recipe Name: {suggestion.name}
Description: {suggestion.description}
Main Ingredients: {', '.join(suggestion.main_ingredients)}
Cooking Time: {suggestion.cook_time_minutes} minutes
Difficulty: {suggestion.difficulty}
Cuisine Type: {suggestion.cuisine_type or 'Any'}
Required Appliances: {', '.join(suggestion.required_appliances)}
Cooking Style: {cooking_style.replace('_', ' ')}

Available kitchen equipment:
{appliance_list}{modification_notes}

CRITICAL RULE — INGREDIENT LIMIT:
The user originally selected {len(resolved_ingredients)} ingredient(s): {', '.join(resolved_ingredients)}.
You may add at most {max_extra} additional ingredient(s) beyond those (excluding basic staples: oil, butter, salt, black pepper, sugar, vinegar).
This is a hard ceiling — do NOT exceed it.

CRITICAL RULE — HONEST COOKING TIME:
The total cook time already stated ({suggestion.cook_time_minutes} minutes) MUST be accurate from start to finish — including
pre-soaking, dry-brining, marinating, tempering, resting, and any other prep the cook must perform.
Do NOT assume any ingredient has been pre-prepared in advance UNLESS it was explicitly listed
in its pre-prepped form by the user (e.g. 'pre-soaked rice noodles' means no soaking time needed;
'rice noodles' means soaking time IS included). Never hide prep time by assuming it was already done.
Reflect any such steps explicitly in the instructions and phases.

IMPORTANT — AUTHENTIC COOKING:
If this recipe belongs to a specific cuisine, follow authentic local cooking
traditions as practiced in that cuisine's home country. Use traditional
techniques, spice combinations, and flavor profiles — NOT Americanized or
Westernized adaptations. For example, an Indian dal should use tamarind or
amchur for sourness rather than defaulting to tomatoes; a Chinese dish should
follow wok technique and traditional seasonings, not American-Chinese shortcuts.

If you have web search tools available, use them to find and verify the recipe
source, authentic techniques, and accurate cooking temperatures.

Please provide the full detailed recipe with:
1. Complete ingredient list with precise measurements (for {servings} servings)
2. Detailed step-by-step cooking instructions (numbered, including any pre-soak/marinate/dry-brine steps)
3. Cooking phases with specific temperatures and times
4. Helpful tips and tricks for best results
5. Temperature probe usage if meat/protein is involved

Format your response as JSON:
{{
  "ingredients": ["1 lb chicken breast, diced", "2 cups rice", ...],
  "instructions": ["Step 1: Preheat oven to 400°F (200°C)", "Step 2: Season chicken with salt and pepper", ...],
  "tips": ["Tip 1: Let meat rest 5 minutes before serving", "Tip 2: Use fresh herbs for best flavor", ...],
  "phases": [
    {{
      "mode": "oven",
      "temperature_c": 200,
      "temperature_f": 392,
      "duration_minutes": 25,
      "description": "Roast chicken until golden"
    }}
  ],
  "use_probe": true,
  "target_temp_c": 74,
  "target_temp_f": 165,
  "prep_time_minutes": 15,
  "servings": {servings}
}}
"""
        return prompt
    
    async def _call_openai(self, prompt: str) -> str:
        """Call OpenAI via Home Assistant conversation integration.
        
        Args:
            prompt: The prompt to send
        
        Returns:
            AI response text
        """
        try:
            # Load AI settings from storage to get user-configured agent ID
            from .storage import async_load_ai_settings
            
            ai_settings = await async_load_ai_settings(self.hass)
            agent_id = ai_settings.get("agent_id", "extended_openai_conversation_2")
            
            _LOGGER.info(f"Using configured AI agent: {agent_id}")
            _LOGGER.info(f"Calling conversation agent with prompt length: {len(prompt)}")
            
            # Use Home Assistant's conversation component
            # This handles the OpenAI API integration
            result = await conversation.async_converse(
                hass=self.hass,
                text=prompt,
                conversation_id=None,
                context=None,
                language=None,
                agent_id=agent_id,  # Use OpenAI agent if found, otherwise default
            )
            
            response_text = result.response.speech.get("plain", {}).get("speech", "")
            
            if not response_text:
                _LOGGER.error("Empty response from conversation agent")
                raise ValueError("Empty response from AI - check if the agent is configured correctly")
            
            _LOGGER.info(f"Received response of length: {len(response_text)}")
            return response_text
            
        except Exception as ex:
            _LOGGER.error("Failed to call conversation agent: %s", ex, exc_info=True)
            raise RuntimeError(
                f"Failed to communicate with OpenAI. "
                f"Error: {str(ex)}. "
                f"Please verify: 1) OpenAI assistant is configured in Voice Assistants, "
                f"2) Your OpenAI API key is valid, "
                f"3) Check Home Assistant logs for more details"
            )
    
    def _parse_suggestions(self, response: str) -> List[AIRecipeSuggestion]:
        """Parse AI response into recipe suggestions.
        
        Args:
            response: AI response text
        
        Returns:
            List of parsed suggestions
        """
        import json
        import re
        
        try:
            # Log raw response for debugging
            _LOGGER.debug(f"Raw AI response (first 500 chars): {response[:500]}")
            
            # Check for common error patterns from AI conversation component
            error_patterns = [
                "Sorry, I had a problem",
                "FinishReason.MAX_TOKENS",
                "content violations",
                "got blocked",
                "Reason:",
            ]
            
            response_lower = response.lower()
            for pattern in error_patterns:
                if pattern.lower() in response_lower:
                    _LOGGER.error(f"AI conversation component returned an error: {response[:500]}")
                    
                    # Provide specific guidance based on error type
                    if "MAX_TOKENS" in response or "max_tokens" in response_lower:
                        error_msg = (
                            "The AI response was cut off due to token limits. "
                            "Please configure your AI assistant with a higher max_tokens setting "
                            "(recommended: 2000 or more for recipe generation)."
                        )
                    elif "content violations" in response_lower or "got blocked" in response_lower:
                        error_msg = (
                            "The AI blocked the response due to content policy. "
                            "This may be a false positive. Try different ingredients or cooking style. "
                            "If this persists, check your AI assistant's content filtering settings."
                        )
                    else:
                        error_msg = (
                            f"The AI conversation component encountered an error: {response[:200]}... "
                            f"Please check your AI assistant configuration."
                        )
                    
                    raise ValueError(error_msg)
            
            # Try to extract JSON from response
            # AI might wrap it in markdown code blocks or add extra text
            response = response.strip()
            
            # Handle markdown code blocks
            if "```json" in response:
                start = response.find("```json") + 7
                end = response.find("```", start)
                if end == -1:
                    end = len(response)
                response = response[start:end].strip()
            elif "```" in response:
                start = response.find("```") + 3
                end = response.find("```", start)
                if end == -1:
                    end = len(response)
                response = response[start:end].strip()
            
            # Try to find JSON array in the response
            # Look for [ at start and ] at end
            json_match = re.search(r'\[\s*\{.*\}\s*\]', response, re.DOTALL)
            if json_match:
                response = json_match.group(0)
            
            # Check if response is empty or too short
            if not response or len(response) < 10:
                raise ValueError(f"Response too short or empty: '{response}'")
            
            data = json.loads(response)
            
            # Validate that we got a list
            if not isinstance(data, list):
                raise ValueError(f"Expected JSON array, got {type(data).__name__}")
            
            if len(data) == 0:
                raise ValueError("AI returned empty recipe list")
            
            suggestions = []
            for i, item in enumerate(data[:4]):  # Max 4 suggestions
                if not isinstance(item, dict):
                    _LOGGER.warning(f"Skipping invalid suggestion item {i}: {item}")
                    continue
                    
                suggestion = AIRecipeSuggestion(
                    id=f"ai_recipe_{i+1}",
                    name=item.get("name", "Unnamed Recipe"),
                    description=item.get("description", ""),
                    cook_time_minutes=item.get("cook_time_minutes", 30),
                    difficulty=item.get("difficulty", "medium"),
                    main_ingredients=item.get("main_ingredients", []),
                    cuisine_type=item.get("cuisine_type"),
                    required_appliances=item.get("required_appliances", []),
                    recipe_origin=item.get("recipe_origin", "original"),
                )
                suggestions.append(suggestion)
            
            if not suggestions:
                raise ValueError("No valid recipes found in AI response")
            
            return suggestions
            
        except json.JSONDecodeError as ex:
            _LOGGER.error(
                "Failed to parse JSON from AI response. "
                f"Error: {ex}. "
                f"Response (first 200 chars): {response[:200]}"
            )
            raise ValueError(
                f"AI returned invalid JSON format. "
                f"This usually means the AI assistant needs better configuration or the response was cut off. "
                f"Error: {str(ex)}"
            )
        except Exception as ex:
            _LOGGER.error("Failed to parse AI suggestions: %s", ex, exc_info=True)
            # Include part of the response in the error for debugging
            response_preview = response[:200] if response else "(empty response)"
            raise ValueError(
                f"Could not parse AI response into recipe suggestions. "
                f"Response preview: {response_preview}... "
                f"Error: {str(ex)}"
            )

    
    def _parse_recipe_detail(
        self,
        response: str,
        suggestion: AIRecipeSuggestion
    ) -> AIRecipeDetail:
        """Parse detailed recipe from AI response.
        
        Args:
            response: AI response text
            suggestion: The original suggestion object
        
        Returns:
            Parsed recipe detail
        """
        import json
        import re
        
        try:
            # Log raw response for debugging
            _LOGGER.debug(f"Raw AI detail response (first 500 chars): {response[:500]}")
            
            # Check for common error patterns from AI conversation component
            error_patterns = [
                "Sorry, I had a problem",
                "FinishReason.MAX_TOKENS",
                "content violations",
                "got blocked",
                "Reason:",
            ]
            
            response_lower = response.lower()
            for pattern in error_patterns:
                if pattern.lower() in response_lower:
                    _LOGGER.error(f"AI conversation component returned an error: {response[:500]}")
                    
                    # Provide specific guidance based on error type
                    if "MAX_TOKENS" in response or "max_tokens" in response_lower:
                        error_msg = (
                            "The AI response was cut off due to token limits. "
                            "Please configure your AI assistant with a higher max_tokens setting "
                            "(recommended: 2000 or more for recipe details)."
                        )
                    elif "content violations" in response_lower or "got blocked" in response_lower:
                        error_msg = (
                            "The AI blocked the response due to content policy. "
                            "This may be a false positive. Try a different recipe. "
                            "If this persists, check your AI assistant's content filtering settings."
                        )
                    else:
                        error_msg = (
                            f"The AI conversation component encountered an error: {response[:200]}... "
                            f"Please check your AI assistant configuration."
                        )
                    
                    raise ValueError(error_msg)
            
            # Extract JSON from response
            response = response.strip()
            
            # Handle markdown code blocks
            if "```json" in response:
                start = response.find("```json") + 7
                end = response.find("```", start)
                if end == -1:
                    end = len(response)
                response = response[start:end].strip()
            elif "```" in response:
                start = response.find("```") + 3
                end = response.find("```", start)
                if end == -1:
                    end = len(response)
                response = response[start:end].strip()
            
            # Try to find JSON object in the response
            json_match = re.search(r'\{.*\}', response, re.DOTALL)
            if json_match:
                response = json_match.group(0)
            
            # Check if response is empty or too short
            if not response or len(response) < 10:
                raise ValueError(f"Response too short or empty: '{response}'")
            
            data = json.loads(response)
            
            # Validate that we got an object
            if not isinstance(data, dict):
                raise ValueError(f"Expected JSON object, got {type(data).__name__}")
            
            # Parse cooking phases
            phases = []
            for phase_data in data.get("phases", []):
                if not isinstance(phase_data, dict):
                    continue
                phase = CookingPhase(
                    mode=phase_data.get("mode", "oven"),
                    temperature_c=phase_data.get("temperature_c", 200),
                    temperature_f=phase_data.get("temperature_f", 392),
                    duration_minutes=phase_data.get("duration_minutes", 30),
                    description=phase_data.get("description", ""),
                )
                phases.append(phase)
            
            detail = AIRecipeDetail(
                suggestion=suggestion,
                ingredients=data.get("ingredients", []),
                instructions=data.get("instructions", []),
                tips=data.get("tips", []),
                phases=phases,
                use_probe=data.get("use_probe", False),
                target_temp_c=data.get("target_temp_c"),
                target_temp_f=data.get("target_temp_f"),
                servings=data.get("servings", 4),
                prep_time_minutes=data.get("prep_time_minutes", 0),
            )
            
            return detail
            
        except json.JSONDecodeError as ex:
            _LOGGER.error(
                "Failed to parse JSON from AI detail response. "
                f"Error: {ex}. "
                f"Response (first 200 chars): {response[:200]}"
            )
            raise ValueError(
                f"AI returned invalid JSON format for recipe details. "
                f"Error: {str(ex)}"
            )
        except Exception as ex:
            _LOGGER.error("Failed to parse recipe detail: %s", ex, exc_info=True)
            response_preview = response[:200] if response else "(empty response)"
            raise ValueError(
                f"Could not parse AI response into recipe details. "
                f"Response preview: {response_preview}... "
                f"Error: {str(ex)}"
            )

    
    def _get_fallback_suggestions(
        self,
        ingredients: List[str]
    ) -> List[AIRecipeSuggestion]:
        """Get fallback suggestions when AI is unavailable.
        
        Args:
            ingredients: Selected ingredients
        
        Returns:
            Basic fallback suggestions
        """
        main_ingredient = ingredients[0] if ingredients else "your ingredients"
        
        return [
            AIRecipeSuggestion(
                id="fallback_1",
                name=f"Simple {main_ingredient.title()} Bake",
                description=f"A straightforward baked {main_ingredient} dish",
                cook_time_minutes=45,
                difficulty="easy",
                main_ingredients=ingredients[:3],
                required_appliances=["oven"],
            ),
            AIRecipeSuggestion(
                id="fallback_2",
                name=f"{main_ingredient.title()} Stir-Fry",
                description=f"Quick and easy stir-fry with {main_ingredient}",
                cook_time_minutes=25,
                difficulty="easy",
                main_ingredients=ingredients[:3],
                required_appliances=["stovetop"],
            ),
            AIRecipeSuggestion(
                id="fallback_3",
                name=f"Air-Fried {main_ingredient.title()}",
                description=f"Crispy {main_ingredient} with your favorite seasonings",
                cook_time_minutes=30,
                difficulty="easy",
                main_ingredients=ingredients[:3],
                required_appliances=["air_fryer"],
            ),
            AIRecipeSuggestion(
                id="fallback_4",
                name=f"Slow-Cooked {main_ingredient.title()}",
                description=f"Tender, flavorful {main_ingredient} with minimal effort",
                cook_time_minutes=180,
                difficulty="easy",
                main_ingredients=ingredients[:3],
                required_appliances=["slow_cooker"],
            ),
        ]


def get_cooking_styles() -> List[Dict[str, str]]:
    """Get list of available cooking styles.
    
    Returns:
        List of cooking style options for UI
    """
    from .ai_recipe_data import COOKING_STYLES
    return COOKING_STYLES


def get_common_ingredients() -> Dict[str, List[Dict[str, str]]]:
    """Get common ingredients grouped by category.
    
    Returns:
        Dictionary mapping categories to ingredient lists
    """
    from .ai_recipe_data import COMMON_INGREDIENTS
    return COMMON_INGREDIENTS
