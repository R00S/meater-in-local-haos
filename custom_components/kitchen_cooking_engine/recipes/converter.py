"""Recipe conversion utilities for Kitchen Cooking Engine.

Converts existing recipes to unified format with automatic feature detection.
"""

from typing import Dict, List, Set, Optional, Any
from .models import UnifiedRecipe, CookingPhase
from ..appliances import FeatureType


class RecipeConverter:
    """Converts recipes from various formats to UnifiedRecipe."""
    
    # Ninja Combi mode to feature mapping
    NINJA_MODE_FEATURES = {
        "Combi-Crisp": {"steam", "air_fry", "combi_crisp"},
        "Combi-Bake": {"steam", "bake", "combi_bake"},
        "Combi-Meal": {"steam", "air_fry", "combi_meal"},
        "Combi-Roast": {"steam", "roast", "combi_roast"},
        "Air Fry": {"air_fry"},
        "Air Crisp": {"air_fry"},
        "Bake": {"bake", "oven"},
        "Roast": {"roast", "oven"},
        "Steam": {"steam"},
        "Grill": {"grill"},
        "Reheat": {"reheat"},
    }
    
    # Difficulty classification
    DIFFICULTY_KEYWORDS = {
        "easy": ["quick", "simple", "easy", "basic"],
        "medium": ["intermediate", "moderate"],
        "hard": ["advanced", "complex", "difficult", "challenging"]
    }
    
    def convert_ninja_combi_recipe(
        self,
        recipe_data: Dict[str, Any],
        recipe_id: int
    ) -> UnifiedRecipe:
        """Convert Ninja Combi recipe to unified format.
        
        Args:
            recipe_data: Original Ninja Combi recipe dict
            recipe_id: Unique ID for recipe
            
        Returns:
            UnifiedRecipe with auto-detected features
        """
        # Extract basic info
        name = recipe_data.get("name", "Untitled Recipe")
        description = recipe_data.get("description", "")
        
        # Auto-detect features from mode
        mode = recipe_data.get("mode", "")
        required_features = self._detect_features_from_mode(mode)
        
        # Check for MEATER+ probe
        use_probe = recipe_data.get("use_probe", False)
        target_temp = recipe_data.get("target_temp_c")
        if use_probe or target_temp:
            required_features.add("temperature_probe")
        
        # Optional features
        optional_features = set()
        if recipe_data.get("convection", False):
            optional_features.add("convection")
        
        # Convert phases
        phases = self._convert_phases(recipe_data.get("phases", []))
        
        # Extract metadata
        ingredients = recipe_data.get("ingredients", [])
        instructions = recipe_data.get("instructions", [])
        prep_time = recipe_data.get("prep_time_minutes", 0)
        cook_time = recipe_data.get("cook_time_minutes", 0)
        servings = recipe_data.get("servings", 4)
        tips = recipe_data.get("tips", [])
        
        # Auto-detect difficulty
        difficulty = self._detect_difficulty(name, description, instructions)
        
        # Auto-generate tags
        tags = self._generate_tags(recipe_data)
        
        return UnifiedRecipe(
            id=recipe_id,
            name=name,
            description=description,
            required_features=required_features,
            optional_features=optional_features,
            suggested_appliances=["ninja_combi"],
            alternative_appliances=[],
            phases=phases,
            use_probe=use_probe,
            target_temp_c=target_temp,
            target_temp_f=self._c_to_f(target_temp) if target_temp else None,
            ingredients=ingredients,
            instructions=instructions,
            prep_time_minutes=prep_time,
            cook_time_minutes=cook_time,
            servings=servings,
            difficulty=difficulty,
            tips=tips,
            tags=tags
        )
    
    def convert_multifry_recipe(
        self,
        recipe_data: Dict[str, Any],
        recipe_id: int
    ) -> UnifiedRecipe:
        """Convert De'Longhi MultiFry recipe to unified format."""
        name = recipe_data.get("name", "Untitled Recipe")
        description = recipe_data.get("description", "")
        
        # Detect features from mode
        mode = recipe_data.get("mode", "")
        required_features = set()
        
        mode_lower = mode.lower()
        if "fry" in mode_lower:
            required_features.add("fry")
        if "air" in mode_lower:
            required_features.add("air_fry")
        if "roast" in mode_lower:
            required_features.add("roast")
        if "casserole" in mode_lower or "risotto" in mode_lower:
            required_features.add("casserole")
        if "grill" in mode_lower or "gratin" in mode_lower:
            required_features.add("grill")
        if "dessert" in mode_lower:
            required_features.add("bake")
        if "pan" in mode_lower:
            required_features.add("pan_fry")
        if "sear" in mode_lower:
            required_features.add("sear")
        
        # Check for probe
        use_probe = recipe_data.get("use_probe", False)
        target_temp = recipe_data.get("target_temp_c")
        if use_probe or target_temp:
            required_features.add("temperature_probe")
        
        # Paddle rotation
        optional_features = set()
        if recipe_data.get("paddle_rotation", False):
            optional_features.add("paddle_rotation")
        
        return UnifiedRecipe(
            id=recipe_id,
            name=name,
            description=description,
            required_features=required_features,
            optional_features=optional_features,
            suggested_appliances=["multifry"],
            alternative_appliances=[],
            phases=[],  # MultiFry typically single phase
            use_probe=use_probe,
            target_temp_c=target_temp,
            target_temp_f=self._c_to_f(target_temp) if target_temp else None,
            ingredients=recipe_data.get("ingredients", []),
            instructions=recipe_data.get("instructions", []),
            prep_time_minutes=recipe_data.get("prep_time_minutes", 0),
            cook_time_minutes=recipe_data.get("cook_time_minutes", 0),
            servings=recipe_data.get("servings", 4),
            difficulty=self._detect_difficulty(name, description, recipe_data.get("instructions", [])),
            tips=recipe_data.get("tips", []),
            tags=self._generate_tags(recipe_data)
        )
    
    def _detect_features_from_mode(self, mode: str) -> Set[str]:
        """Auto-detect features from cooking mode."""
        for mode_name, features in self.NINJA_MODE_FEATURES.items():
            if mode_name.lower() in mode.lower():
                return features.copy()
        return set()
    
    def _convert_phases(self, phases_data: List[Dict]) -> List[CookingPhase]:
        """Convert phase dictionaries to CookingPhase objects."""
        from ..appliances import CookingPhase as AppliancePhase
        phases = []
        for phase_data in phases_data:
            phase = AppliancePhase(
                name=phase_data.get("name", ""),
                temperature_c=phase_data.get("temperature_c", 0),
                duration_minutes=phase_data.get("duration_minutes", 0),
                mode=phase_data.get("mode", "")
            )
            phases.append(phase)
        return phases
    
    def _detect_difficulty(
        self,
        name: str,
        description: str,
        instructions: List[str]
    ) -> str:
        """Auto-detect recipe difficulty."""
        text = f"{name} {description} {' '.join(instructions)}".lower()
        
        for difficulty, keywords in self.DIFFICULTY_KEYWORDS.items():
            if any(kw in text for kw in keywords):
                return difficulty
        
        # Heuristic: more instructions = harder
        if len(instructions) > 10:
            return "hard"
        elif len(instructions) > 5:
            return "medium"
        else:
            return "easy"
    
    def _generate_tags(self, recipe_data: Dict[str, Any]) -> Set[str]:
        """Auto-generate recipe tags."""
        tags = set()
        
        # Extract from metadata
        if "tags" in recipe_data:
            tags.update(recipe_data["tags"])
        
        # Dietary tags
        name_lower = recipe_data.get("name", "").lower()
        if "vegan" in name_lower:
            tags.add("vegan")
        if "vegetarian" in name_lower:
            tags.add("vegetarian")
        if "gluten" in name_lower:
            tags.add("gluten-free")
        
        # Protein tags
        if any(p in name_lower for p in ["chicken", "poultry"]):
            tags.add("chicken")
        if any(p in name_lower for p in ["beef", "steak"]):
            tags.add("beef")
        if any(p in name_lower for p in ["pork", "bacon"]):
            tags.add("pork")
        if any(p in name_lower for p in ["fish", "salmon", "tuna"]):
            tags.add("seafood")
        
        # Meal type
        if any(m in name_lower for m in ["breakfast", "morning"]):
            tags.add("breakfast")
        if any(m in name_lower for m in ["lunch", "sandwich"]):
            tags.add("lunch")
        if any(m in name_lower for m in ["dinner", "supper"]):
            tags.add("dinner")
        if any(m in name_lower for m in ["snack", "appetizer"]):
            tags.add("snack")
        if any(m in name_lower for m in ["dessert", "sweet", "cake"]):
            tags.add("dessert")
        
        return tags
    
    @staticmethod
    def _c_to_f(celsius: Optional[int]) -> Optional[int]:
        """Convert Celsius to Fahrenheit."""
        if celsius is None:
            return None
        return int(celsius * 9/5 + 32)
