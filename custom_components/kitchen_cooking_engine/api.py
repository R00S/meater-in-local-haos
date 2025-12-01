"""API endpoints for Kitchen Cooking Engine.

This module provides HTTP endpoints to serve cooking data to the frontend,
ensuring a single source of truth for all cut/protein/doneness data.
"""

from __future__ import annotations

import logging
from aiohttp import web

from homeassistant.components.http import HomeAssistantView
from homeassistant.core import HomeAssistant

from .cooking_data import (
    MEAT_CATEGORIES,
    TemperatureRange,
    MeatCut,
    CutType,
    Meat,
    MeatCategory,
)
from .swedish_cooking_data import SWEDISH_MEAT_CATEGORIES

_LOGGER = logging.getLogger(__name__)


def _temperature_range_to_dict(tr: TemperatureRange) -> dict:
    """Convert TemperatureRange to dictionary for JSON serialization."""
    return {
        "id": tr.id,
        "name": tr.name,
        "description": tr.description,
        "target_temp_c": tr.target_temp_c,
        "target_temp_f": tr.target_temp_f,
        "min_temp_c": tr.min_temp_c,
        "min_temp_f": tr.min_temp_f,
        "max_temp_c": tr.max_temp_c,
        "max_temp_f": tr.max_temp_f,
        "usda_safe": tr.usda_safe,
        "is_meater_recommended": tr.is_meater_recommended,
        "start_hex": tr.start_hex,
        "end_hex": tr.end_hex,
    }


def _cut_to_dict(cut: MeatCut) -> dict:
    """Convert MeatCut to dictionary for JSON serialization."""
    return {
        "id": cut.id,
        "name": cut.name,
        "name_long": cut.name_long,
        "cut_order": cut.cut_order,
        "estimated_thickness_mm": cut.estimated_thickness_mm,
        "usda_safe_c": cut.usda_safe_c,
        "usda_safe_f": cut.usda_safe_f,
        "rest_time_min": cut.rest_time_min,
        "rest_time_max": cut.rest_time_max,
        "carryover_temp_c": cut.carryover_temp_c,
        "recommended_doneness": cut.recommended_doneness,
        "temperature_ranges": [
            _temperature_range_to_dict(tr) for tr in cut.temperature_ranges
        ],
        # Extract doneness names for frontend compatibility
        "doneness": [tr.name for tr in cut.temperature_ranges],
    }


def _cut_type_to_dict(ct: CutType) -> dict:
    """Convert CutType to dictionary for JSON serialization."""
    return {
        "id": ct.id,
        "name": ct.name,
        "cuts": [_cut_to_dict(cut) for cut in ct.cuts],
    }


def _meat_to_dict(meat: Meat) -> dict:
    """Convert Meat to dictionary for JSON serialization."""
    return {
        "id": meat.id,
        "name": meat.name,
        "description": meat.description,
        "cutTypes": [_cut_type_to_dict(ct) for ct in meat.cut_types],
    }


def _category_to_dict(cat: MeatCategory) -> dict:
    """Convert MeatCategory to dictionary for JSON serialization."""
    return {
        "id": cat.id,
        "name": cat.name,
        "color_hex": cat.color_hex,
        "meats": [_meat_to_dict(meat) for meat in cat.meats],
    }


def _normalize_swedish_key(name: str) -> str:
    """Normalize Swedish text to ASCII-friendly key."""
    return name.lower().replace("ö", "o").replace("ä", "a").replace("å", "a")


def _get_category_icon(name: str) -> str:
    """Get icon for a category name (supports both English and Swedish)."""
    # Normalize the name for lookup
    normalized = _normalize_swedish_key(name)
    
    # Icon mapping for both English and Swedish category names
    icons = {
        # English
        "beef": "🥩",
        "pork": "🐷",
        "poultry": "🍗",
        "fish": "🐟",
        "lamb": "🐑",
        "game": "🦌",
        "vegetables": "🥕",
        # Swedish (normalized)
        "notkott": "🥩",
        "flask": "🐷",
        "fagel": "🍗",
        "fisk": "🐟",
        "lamm": "🐑",
        "vilt": "🦌",
        "kalv": "🐄",
    }
    return icons.get(normalized, "🍖")


def get_international_categories_dict() -> dict:
    """Get international meat categories as a dictionary keyed by name."""
    result = {}
    for cat in MEAT_CATEGORIES:
        key = cat.name.lower()
        result[key] = _category_to_dict(cat)
        result[key]["icon"] = _get_category_icon(cat.name)
    return result


def get_swedish_categories_dict() -> dict:
    """Get Swedish meat categories as a dictionary keyed by name."""
    result = {}
    for cat in SWEDISH_MEAT_CATEGORIES:
        key = _normalize_swedish_key(cat.name)
        result[key] = _category_to_dict(cat)
        result[key]["icon"] = _get_category_icon(cat.name)
    return result


class CookingDataView(HomeAssistantView):
    """API endpoint to serve cooking data to the frontend."""

    url = "/api/kitchen_cooking_engine/cooking_data"
    name = "api:kitchen_cooking_engine:cooking_data"
    requires_auth = False  # Panel users are already authenticated

    async def get(self, request: web.Request) -> web.Response:
        """Handle GET request for cooking data."""
        data_source = request.query.get("source", "international")
        
        if data_source == "swedish":
            categories = get_swedish_categories_dict()
        else:
            categories = get_international_categories_dict()
        
        return self.json({
            "source": data_source,
            "categories": categories,
        })


class DonenessOptionsView(HomeAssistantView):
    """API endpoint to serve doneness options."""

    url = "/api/kitchen_cooking_engine/doneness_options"
    name = "api:kitchen_cooking_engine:doneness_options"
    requires_auth = False

    async def get(self, request: web.Request) -> web.Response:
        """Handle GET request for doneness options."""
        data_source = request.query.get("source", "international")
        
        # These are the standard doneness options with their temperature mappings
        if data_source == "swedish":
            options = {
                "blodig": {"name": "Blodig", "icon": "🔴", "description": "Sval röd kärna", "temp_c": 50, "temp_f": 122},
                "medium_rare": {"name": "Medium Rare", "icon": "🟠", "description": "Rosa kärna", "temp_c": 54, "temp_f": 129},
                "medium": {"name": "Medium", "icon": "🟡", "description": "Varm rosa kärna", "temp_c": 58, "temp_f": 136},
                "medium_well": {"name": "Medium Well", "icon": "🟤", "description": "Nästan genomstekt", "temp_c": 64, "temp_f": 147},
                "genomstekt": {"name": "Genomstekt", "icon": "⚪", "description": "Ingen rosa färg", "temp_c": 70, "temp_f": 158},
                "långkokt": {"name": "Långkokt", "icon": "🍖", "description": "Strimlningsbart", "temp_c": 92, "temp_f": 198},
                "safe": {"name": "Säker (72°C)", "icon": "✅", "description": "Genomstekt, säker att äta", "temp_c": 72, "temp_f": 162},
                "dark_meat_optimal": {"name": "Mörkt kött", "icon": "🍗", "description": "Optimal textur för mörkt kött", "temp_c": 77, "temp_f": 170},
                "crispy": {"name": "Krispig", "icon": "🥓", "description": "Krispigt och utstekt", "temp_c": 90, "temp_f": 195},
                "heated_through": {"name": "Uppvärmd", "icon": "♨️", "description": "Genomvärmd (förkokt)", "temp_c": 60, "temp_f": 140},
                "well_done": {"name": "Genomstekt", "icon": "⚪", "description": "Ingen rosa färg", "temp_c": 70, "temp_f": 158},
                "done": {"name": "Färdig", "icon": "✓", "description": "Genomstekt", "temp_c": 71, "temp_f": 160},
                "tender": {"name": "Mjuk", "icon": "🥔", "description": "Mjuk och mör", "temp_c": 95, "temp_f": 203},
                "pulled": {"name": "Långkokt", "icon": "🍖", "description": "Strimlningsbart", "temp_c": 92, "temp_f": 198},
                "rare": {"name": "Blodig", "icon": "🔴", "description": "Sval röd kärna", "temp_c": 50, "temp_f": 122},
                "crisp_tender": {"name": "Krispig-mjuk", "icon": "🥦", "description": "Lätt krispig", "temp_c": 85, "temp_f": 185},
                "caramelized": {"name": "Karamelliserad", "icon": "🧅", "description": "Gyllenbrun", "temp_c": 160, "temp_f": 320},
                "charred": {"name": "Grillad", "icon": "🔥", "description": "Kolad yta", "temp_c": 200, "temp_f": 390},
            }
        else:
            options = {
                "rare": {"name": "Rare", "icon": "🔴", "description": "Cool red center", "temp_c": 49, "temp_f": 120},
                "medium_rare": {"name": "Medium Rare", "icon": "🟠", "description": "Warm red center", "temp_c": 54, "temp_f": 130},
                "medium": {"name": "Medium", "icon": "🟡", "description": "Warm pink center", "temp_c": 60, "temp_f": 140},
                "medium_well": {"name": "Medium Well", "icon": "🟤", "description": "Slightly pink center", "temp_c": 66, "temp_f": 150},
                "well_done": {"name": "Well Done", "icon": "⚪", "description": "No pink, fully cooked", "temp_c": 71, "temp_f": 160},
                "pulled": {"name": "Pulled", "icon": "🍖", "description": "Shreddable, collagen broken down", "temp_c": 93, "temp_f": 200},
                "safe": {"name": "Safe (165°F)", "icon": "✅", "description": "USDA safe, cooked through", "temp_c": 74, "temp_f": 165},
                "dark_meat_optimal": {"name": "Dark Meat", "icon": "🍗", "description": "Optimal texture for dark meat", "temp_c": 77, "temp_f": 170},
                "crispy": {"name": "Crispy", "icon": "🥓", "description": "Crispy and rendered", "temp_c": 90, "temp_f": 195},
                "heated_through": {"name": "Heated Through", "icon": "♨️", "description": "Warmed through (pre-cooked)", "temp_c": 60, "temp_f": 140},
                "done": {"name": "Done", "icon": "✓", "description": "Cooked through", "temp_c": 71, "temp_f": 160},
                "tender": {"name": "Tender", "icon": "🥔", "description": "Fork-tender", "temp_c": 95, "temp_f": 203},
                "crisp_tender": {"name": "Crisp-Tender", "icon": "🥦", "description": "Slightly firm with bite", "temp_c": 85, "temp_f": 185},
                "caramelized": {"name": "Caramelized", "icon": "🧅", "description": "Golden brown", "temp_c": 160, "temp_f": 320},
                "charred": {"name": "Charred", "icon": "🔥", "description": "Charred exterior", "temp_c": 200, "temp_f": 390},
            }
        
        return self.json({
            "source": data_source,
            "options": options,
        })


def async_register_api(hass: HomeAssistant) -> None:
    """Register API endpoints."""
    hass.http.register_view(CookingDataView)
    hass.http.register_view(DonenessOptionsView)
    _LOGGER.info("Kitchen Cooking Engine: API endpoints registered")
