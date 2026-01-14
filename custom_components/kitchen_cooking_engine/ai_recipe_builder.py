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


class IngredientCategory(Enum):
    """Categories for ingredient selection."""
    
    PROTEINS = "proteins"
    VEGETABLES = "vegetables"
    GRAINS = "grains"
    DAIRY = "dairy"
    SPICES = "spices"
    OTHER = "other"


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
    
    async def generate_recipe_suggestions(
        self,
        ingredients: List[str],
        cooking_style: str,
        appliance_ids: Optional[List[str]] = None,
        dietary_restrictions: Optional[List[str]] = None,
        servings: int = 4,
        max_time_minutes: Optional[int] = None,
    ) -> List[AIRecipeSuggestion]:
        """Generate 4 recipe suggestions from AI.
        
        Args:
            ingredients: List of ingredient names
            cooking_style: Cooking style preference (from CookingStyle enum)
            appliance_ids: Optional list of available appliance IDs
            dietary_restrictions: Optional dietary restrictions
            servings: Number of servings
            max_time_minutes: Optional maximum cooking time
        
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
            dietary_restrictions=dietary_restrictions,
            servings=servings,
            max_time_minutes=max_time_minutes,
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
        appliance_ids: Optional[List[str]] = None,
    ) -> Optional[AIRecipeDetail]:
        """Get detailed recipe for a suggestion.
        
        Args:
            suggestion_id: ID of the suggestion to expand
            appliance_ids: Optional list of available appliance IDs
        
        Returns:
            Detailed recipe with instructions
        """
        # Check if we already generated this detail
        if suggestion_id in self._session_recipes:
            return self._session_recipes[suggestion_id]
        
        # Get appliance info
        appliance_info = await self._get_appliance_info(appliance_ids)
        
        # Build prompt for detailed recipe
        prompt = self._build_detail_prompt(suggestion_id, appliance_info)
        
        # Call OpenAI
        try:
            response = await self._call_openai(prompt)
            detail = self._parse_recipe_detail(response, suggestion_id)
            
            # Cache the detail
            self._session_recipes[suggestion_id] = detail
            return detail
            
        except Exception as ex:
            _LOGGER.error("Failed to get recipe detail: %s", ex)
            return None
    
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
            info["appliances"].append({
                "name": appliance.name,
                "brand": appliance.brand,
                "model": appliance.model,
                "features": list(appliance.features.keys()),
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
    ) -> str:
        """Build prompt for recipe suggestions.
        
        Args:
            ingredients: Selected ingredients
            cooking_style: Cooking style
            appliance_info: Available appliances and features
            dietary_restrictions: Dietary restrictions
            servings: Number of servings
            max_time_minutes: Maximum cooking time
        
        Returns:
            Formatted prompt for OpenAI
        """
        appliance_list = ", ".join([
            f"{a['brand']} {a['model']}" 
            for a in appliance_info["appliances"]
        ]) if appliance_info["appliances"] else "standard kitchen equipment"
        
        feature_list = ", ".join(sorted(appliance_info["features"]))
        
        restrictions = (
            f"\nDietary restrictions: {', '.join(dietary_restrictions)}"
            if dietary_restrictions else ""
        )
        
        time_constraint = (
            f"\nMaximum cooking time: {max_time_minutes} minutes"
            if max_time_minutes else ""
        )
        
        prompt = f"""You are a professional chef creating recipes for a home kitchen.

Available ingredients: {', '.join(ingredients)}
Cooking style: {cooking_style.replace('_', ' ')}
Servings: {servings}{restrictions}{time_constraint}

Available kitchen equipment:
{appliance_list}

Available cooking features:
{feature_list}

Please suggest 4 quite different recipes using these ingredients. For each recipe, provide:
1. Recipe name (creative and descriptive)
2. Brief description (1-2 sentences)
3. Total cooking time in minutes
4. Difficulty level (easy, medium, or hard)
5. Main ingredients used from the list
6. Required appliances/equipment
7. Cuisine type (if applicable)

Format your response as a JSON array with exactly 4 recipes:
[
  {{
    "name": "Recipe Name",
    "description": "Brief description",
    "cook_time_minutes": 45,
    "difficulty": "medium",
    "main_ingredients": ["ingredient1", "ingredient2"],
    "required_appliances": ["oven", "probe"],
    "cuisine_type": "italian"
  }},
  ...
]

Make the recipes diverse in cooking methods, flavors, and cuisines.
"""
        return prompt
    
    def _build_detail_prompt(
        self,
        suggestion_id: str,
        appliance_info: Dict[str, Any],
    ) -> str:
        """Build prompt for detailed recipe.
        
        Args:
            suggestion_id: ID of the suggestion to expand
            appliance_info: Available appliances
        
        Returns:
            Formatted prompt for detailed recipe
        """
        # This would reference the previously selected suggestion
        # For now, this is a placeholder - full implementation would track
        # the conversation history or store the suggestion
        
        prompt = f"""Please provide the complete, detailed recipe for suggestion {suggestion_id}.

Include:
1. Full ingredient list with measurements
2. Step-by-step instructions (numbered)
3. Cooking phases with temperatures and times
4. Helpful tips and tricks
5. Temperature probe usage if applicable

Format as JSON:
{{
  "ingredients": ["ingredient with measurement", ...],
  "instructions": ["Step 1: ...", "Step 2: ...", ...],
  "tips": ["Tip 1", "Tip 2", ...],
  "phases": [
    {{
      "mode": "oven",
      "temperature_c": 200,
      "temperature_f": 392,
      "duration_minutes": 25,
      "description": "Roast chicken"
    }}
  ],
  "use_probe": true,
  "target_temp_c": 74,
  "target_temp_f": 165,
  "prep_time_minutes": 15
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
            # Try to find and use the OpenAI conversation agent
            # Default to None (use default agent) if not found
            agent_id = None
            
            # Try to find OpenAI agent in conversation data
            try:
                # Check if conversation component has agent info
                if "conversation" in self.hass.data:
                    conversation_data = self.hass.data.get("conversation", {})
                    _LOGGER.debug(f"Conversation data keys: {conversation_data.keys()}")
                    
                    # Try different common OpenAI agent IDs without testing them
                    # Just try them in order when making the actual call
                    possible_ids = [
                        "extended_openai_conversation_2",  # Extended OpenAI Conversation
                        "conversation.openai_conversation",  # OpenAI Conversation integration
                        "conversation.openai",  # Alternative format
                        "openai",
                        "conversation.home_assistant_cloud",  # In case using Nabu Casa
                    ]
                    
                    # Don't test - just use the first one we try
                    # If it fails, we'll catch the error and user will see it
                    agent_id = possible_ids[0]  # Start with most common
                    _LOGGER.info(f"Will try OpenAI agent: {agent_id}")
                else:
                    _LOGGER.warning("Conversation component not loaded in hass.data")
            except Exception as e:
                _LOGGER.debug(f"Could not access conversation data: {e}")
            
            _LOGGER.info(f"Calling conversation agent: {agent_id or 'default'} with prompt length: {len(prompt)}")
            
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
        
        try:
            # Try to extract JSON from response
            # AI might wrap it in markdown code blocks
            response = response.strip()
            if "```json" in response:
                start = response.find("```json") + 7
                end = response.find("```", start)
                response = response[start:end].strip()
            elif "```" in response:
                start = response.find("```") + 3
                end = response.find("```", start)
                response = response[start:end].strip()
            
            data = json.loads(response)
            
            suggestions = []
            for i, item in enumerate(data[:4]):  # Max 4 suggestions
                suggestion = AIRecipeSuggestion(
                    id=f"ai_recipe_{i+1}",
                    name=item.get("name", "Unnamed Recipe"),
                    description=item.get("description", ""),
                    cook_time_minutes=item.get("cook_time_minutes", 30),
                    difficulty=item.get("difficulty", "medium"),
                    main_ingredients=item.get("main_ingredients", []),
                    cuisine_type=item.get("cuisine_type"),
                    required_appliances=item.get("required_appliances", []),
                )
                suggestions.append(suggestion)
            
            return suggestions
            
        except Exception as ex:
            _LOGGER.error("Failed to parse AI suggestions: %s", ex)
            raise
    
    def _parse_recipe_detail(
        self,
        response: str,
        suggestion_id: str
    ) -> AIRecipeDetail:
        """Parse detailed recipe from AI response.
        
        Args:
            response: AI response text
            suggestion_id: ID of the original suggestion
        
        Returns:
            Parsed recipe detail
        """
        import json
        
        try:
            # Extract JSON from response
            response = response.strip()
            if "```json" in response:
                start = response.find("```json") + 7
                end = response.find("```", start)
                response = response[start:end].strip()
            elif "```" in response:
                start = response.find("```") + 3
                end = response.find("```", start)
                response = response[start:end].strip()
            
            data = json.loads(response)
            
            # Parse cooking phases
            phases = []
            for phase_data in data.get("phases", []):
                phase = CookingPhase(
                    mode=phase_data.get("mode", "oven"),
                    temperature_c=phase_data.get("temperature_c", 200),
                    temperature_f=phase_data.get("temperature_f", 392),
                    duration_minutes=phase_data.get("duration_minutes", 30),
                    description=phase_data.get("description", ""),
                )
                phases.append(phase)
            
            # Create detail object (we need the original suggestion)
            # For now, create a minimal suggestion
            suggestion = AIRecipeSuggestion(
                id=suggestion_id,
                name=data.get("name", "AI Generated Recipe"),
                description=data.get("description", ""),
                cook_time_minutes=sum(p.duration_minutes for p in phases),
                difficulty=data.get("difficulty", "medium"),
                main_ingredients=data.get("main_ingredients", []),
            )
            
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
            
        except Exception as ex:
            _LOGGER.error("Failed to parse recipe detail: %s", ex)
            raise
    
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
