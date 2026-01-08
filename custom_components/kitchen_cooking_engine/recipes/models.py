"""
Unified recipe data models for multi-appliance cooking.

These models enable feature-based recipe matching, multi-appliance
workflows, and smart appliance suggestions.
"""

from dataclasses import dataclass, field
from enum import Enum
from typing import List, Optional, Set


class RecipeDifficulty(Enum):
    """Recipe difficulty levels."""
    EASY = "easy"
    MEDIUM = "medium"
    HARD = "hard"


class DietaryTag(Enum):
    """Dietary restriction tags."""
    VEGETARIAN = "vegetarian"
    VEGAN = "vegan"
    GLUTEN_FREE = "gluten_free"
    DAIRY_FREE = "dairy_free"
    KETO = "keto"
    LOW_CARB = "low_carb"
    PALEO = "paleo"
    WHOLE30 = "whole30"


class CuisineType(Enum):
    """Cuisine types."""
    AMERICAN = "american"
    ITALIAN = "italian"
    MEXICAN = "mexican"
    ASIAN = "asian"
    CHINESE = "chinese"
    JAPANESE = "japanese"
    INDIAN = "indian"
    FRENCH = "french"
    MEDITERRANEAN = "mediterranean"
    MIDDLE_EASTERN = "middle_eastern"


class MealType(Enum):
    """Meal types."""
    BREAKFAST = "breakfast"
    LUNCH = "lunch"
    DINNER = "dinner"
    SNACK = "snack"
    DESSERT = "dessert"
    APPETIZER = "appetizer"
    SIDE_DISH = "side_dish"


@dataclass
class CookingPhase:
    """A single phase in a multi-phase cooking program."""
    
    mode: str  # Cooking mode/feature name
    temperature_c: int
    temperature_f: int
    duration_minutes: int
    description: str
    
    # Additional phase parameters
    steam_enabled: bool = False
    power_level: Optional[int] = None  # For microwaves, etc.
    stirring_required: bool = False  # For paddle-based appliances
    
    def __str__(self) -> str:
        return f"{self.description} - {self.temperature_c}°C for {self.duration_minutes}min"


@dataclass
class UnifiedRecipe:
    """
    Unified recipe format that works across all appliances.
    
    Key Features:
    - Feature-based matching (not appliance-specific)
    - Multi-appliance support
    - Smart appliance suggestions
    - User override capability
    """
    
    # Basic info
    id: int
    name: str
    description: str
    
    # Feature-based requirements (NEW ARCHITECTURE)
    required_features: Set[str] = field(default_factory=set)
    """Features that MUST be available (e.g., {"oven", "temperature_probe"})"""
    
    optional_features: Set[str] = field(default_factory=set)
    """Features that enhance the recipe but aren't required"""
    
    # Smart appliance suggestions
    suggested_appliances: List[str] = field(default_factory=list)
    """System-recommended appliance combination"""
    
    alternative_appliances: List[str] = field(default_factory=list)
    """Alternative appliances user can choose"""
    
    # Cooking program
    phases: List[CookingPhase] = field(default_factory=list)
    """Multi-phase cooking instructions"""
    
    # MEATER+ probe integration
    use_probe: bool = False
    target_temp_c: Optional[int] = None
    target_temp_f: Optional[int] = None
    probe_placement: str = "center of thickest part"
    
    # Recipe content
    ingredients: List[str] = field(default_factory=list)
    instructions: List[str] = field(default_factory=list)
    tips: List[str] = field(default_factory=list)
    notes: str = ""
    
    # Metadata
    prep_time_minutes: int = 0
    cook_time_minutes: int = 0
    servings: int = 4
    difficulty: RecipeDifficulty = RecipeDifficulty.MEDIUM
    
    # Tags for filtering
    dietary_tags: Set[DietaryTag] = field(default_factory=set)
    cuisine_type: Optional[CuisineType] = None
    meal_type: Optional[MealType] = None
    custom_tags: Set[str] = field(default_factory=set)
    
    # Appliance-specific settings (optional)
    tray_position: Optional[int] = None  # For ovens
    oil_level: Optional[str] = None  # Zero, Low, Medium, Rich
    bowl_type: Optional[str] = None  # For MultiFry: Ceramic J / Non-stick Z
    
    def get_total_time_minutes(self) -> int:
        """Get total time including prep and cooking."""
        return self.prep_time_minutes + self.cook_time_minutes
    
    def can_be_cooked_with(self, available_features: Set[str]) -> bool:
        """Check if recipe can be cooked with given features."""
        return self.required_features.issubset(available_features)
    
    def get_enhancement_features(self, available_features: Set[str]) -> Set[str]:
        """Get optional features that are available and would enhance recipe."""
        return self.optional_features.intersection(available_features)
    
    def __str__(self) -> str:
        features_str = ", ".join(sorted(self.required_features))
        return f"{self.name} (requires: {features_str})"


@dataclass
class RecipeMatchResult:
    """Result of matching a recipe against available appliances."""
    
    recipe: UnifiedRecipe
    can_cook: bool
    
    # Appliance suggestions
    suggested_combination: List[str]  # Appliance IDs
    alternative_combinations: List[List[str]]
    
    # Feature analysis
    missing_required_features: Set[str]
    available_optional_features: Set[str]
    
    # Implementation quality
    has_standard_implementations: bool  # All features are STANDARD
    has_modified_implementations: bool  # Some features are MODIFIED
    needs_adaptation: bool  # Recipe will be auto-adapted
    
    confidence_score: float  # 0.0 to 1.0
    
    def get_recommendation_text(self) -> str:
        """Get human-readable recommendation."""
        if not self.can_cook:
            missing = ", ".join(self.missing_required_features)
            return f"Cannot cook: missing {missing}"
        
        if self.has_standard_implementations:
            return "Perfect match - all features supported"
        elif self.has_modified_implementations:
            return "Good match - recipe will be auto-adapted"
        else:
            return "Can cook with some adjustments"
