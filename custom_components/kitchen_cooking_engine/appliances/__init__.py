"""
Base classes for kitchen appliance support.

Last Updated: 08 Jan 2026, 10:45 CET
Last Change: Initial multi-appliance framework implementation

This module provides the base architecture for supporting multiple kitchen
appliances with different cooking features and capabilities.
"""

from dataclasses import dataclass, field
from enum import Enum
from typing import Optional, List, Dict, Any
from abc import ABC, abstractmethod


class FeatureType(Enum):
    """Classification of cooking feature adaptation requirements."""
    
    STANDARD = "standard"     # Uses recipes without modification
    MODIFIED = "modified"     # Auto-adapts general recipes  
    SPECIAL = "special"       # Requires appliance-specific recipes


class OilLevel(Enum):
    """Simplified oil levels for frying/cooking."""
    
    ZERO = "zero"           # No oil (air frying, steaming)
    LOW = "low"             # Minimal oil (light coating, 1-2 tbsp)
    MEDIUM = "medium"       # Standard frying (3-4 tbsp)
    RICH = "rich"           # Deep frying or rich cooking (5+ tbsp)


@dataclass
class CookingFeature:
    """Definition of a cooking feature/mode."""
    
    name: str                           # Feature identifier (e.g., "air_fry")
    display_name: str                   # User-friendly name
    feature_type: FeatureType          # How recipes are handled
    temperature_range_c: Optional[tuple[int, int]] = None  # (min, max) in Celsius (optional for non-temp features)
    temperature_range_f: Optional[tuple[int, int]] = None  # (min, max) in Fahrenheit (optional for non-temp features)
    supports_probe: bool = False        # MEATER+ compatible
    supports_paddle: bool = False       # Rotating paddle/stirrer
    oil_levels: List[OilLevel] = field(default_factory=lambda: [OilLevel.ZERO])
    default_oil: OilLevel = OilLevel.ZERO
    icon: str = "mdi:chef-hat"         # MDI icon
    description: str = ""               # Feature description


@dataclass  
class CookingPhase:
    """A single phase in a multi-phase cooking program."""
    
    feature_name: str                   # Which feature to use
    temperature_c: int
    temperature_f: int
    duration_minutes: int
    description: str
    oil_level: OilLevel = OilLevel.ZERO
    use_paddle: bool = False
    steam_enabled: bool = False


@dataclass
class ApplianceRecipe:
    """A recipe for a specific appliance."""
    
    id: int
    appliance_id: str                   # Which appliance this is for
    name: str
    description: str
    feature: str                        # Primary cooking feature
    phases: List[CookingPhase] = field(default_factory=list)
    
    # Temperature monitoring (MEATER+ integration)
    use_probe: bool = False
    probe_target_c: Optional[int] = None
    probe_target_f: Optional[int] = None
    
    # Ingredients and instructions
    ingredients: List[str] = field(default_factory=list)
    instructions: List[str] = field(default_factory=list)
    
    # Metadata
    prep_time_minutes: int = 0
    cook_time_minutes: int = 0
    servings: int = 4
    difficulty: str = "medium"          # easy, medium, hard
    
    # Tips and notes
    tips: List[str] = field(default_factory=list)
    notes: str = ""
    tags: List[str] = field(default_factory=list)


class RecipeAdapter(ABC):
    """Base class for adapting general recipes to specific appliances."""
    
    @abstractmethod
    def adapt_temperature(self, original_temp_c: int, cooking_method: str) -> int:
        """Adapt temperature for this appliance's characteristics."""
        pass
    
    @abstractmethod
    def adapt_time(self, original_minutes: int, cooking_method: str) -> int:
        """Adapt cooking time for this appliance."""
        pass
    
    @abstractmethod
    def suggest_oil_level(self, cooking_method: str, food_type: str) -> OilLevel:
        """Suggest oil level based on cooking method and food."""
        pass


@dataclass
class ApplianceDeviceControl:
    """Device control configuration for an appliance."""
    
    power_outlet_entity: Optional[str] = None    # Switch/outlet to turn off appliance
    start_button_entity: Optional[str] = None     # Button/switch to start cooking
    auto_shutoff_enabled: bool = True             # Auto turn off when cook completes
    auto_start_enabled: bool = False              # Enable remote start capability


class KitchenAppliance(ABC):
    """Base class for all kitchen appliances."""
    
    def __init__(self):
        self.appliance_id: str = ""
        self.name: str = ""
        self.brand: str = ""
        self.model: str = ""
        self.features: Dict[str, CookingFeature] = {}
        self.recipes: List[ApplianceRecipe] = []
        self.adapter: Optional[RecipeAdapter] = None
        self.device_control: Optional[ApplianceDeviceControl] = None
    
    @abstractmethod
    def get_supported_features(self) -> List[CookingFeature]:
        """Return list of cooking features this appliance supports."""
        pass
    
    @abstractmethod
    def get_recipes(self) -> List[ApplianceRecipe]:
        """Return appliance-specific recipes."""
        pass
    
    def get_recipe_by_id(self, recipe_id: int) -> Optional[ApplianceRecipe]:
        """Get a specific recipe by ID."""
        return next((r for r in self.recipes if r.id == recipe_id), None)
    
    def get_recipes_by_feature(self, feature_name: str) -> List[ApplianceRecipe]:
        """Get all recipes using a specific feature."""
        return [r for r in self.recipes if r.feature == feature_name]
    
    def supports_feature(self, feature_name: str) -> bool:
        """Check if appliance supports a specific feature."""
        return feature_name in self.features
    
    def get_feature(self, feature_name: str) -> Optional[CookingFeature]:
        """Get feature definition."""
        return self.features.get(feature_name)
