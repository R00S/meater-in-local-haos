"""API endpoints for Kitchen Cooking Engine.

This module provides HTTP endpoints to serve cooking data to the frontend,
ensuring a single source of truth for all cut/protein/doneness data.

Last Updated: 8 Jan 2026, 23:50 CET
Last Change: Added Phase 3.1 multi-appliance API endpoints
"""

from __future__ import annotations

import json
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
from .storage import (
    async_load_cook_history,
    async_add_cook_to_history,
    async_update_cook_notes,
    async_delete_cook_from_history,
    async_load_user_preferences,
    async_set_cut_preference,
    async_get_cut_preference,
    async_load_active_recipe_cook,
    async_save_active_recipe_cook,
    async_clear_active_recipe_cook,
    async_get_language,
    async_set_language,
    async_get_measurement_system,
    async_set_measurement_system,
)

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
    requires_auth = True  # Require authentication for security

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
    requires_auth = True  # Require authentication for security

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
    # Existing endpoints
    hass.http.register_view(CookingDataView)
    hass.http.register_view(DonenessOptionsView)
    hass.http.register_view(CookHistoryView)
    hass.http.register_view(CookHistoryItemView)
    hass.http.register_view(UserPreferencesView)
    hass.http.register_view(CutPreferenceView)
    
    # Phase 7: Language & measurement preferences
    hass.http.register_view(LanguagePreferenceView)
    hass.http.register_view(MeasurementSystemPreferenceView)
    
    # Phase 3.1: Multi-appliance endpoints
    hass.http.register_view(AppliancesView)
    hass.http.register_view(ApplianceFeatureNotesView)
    hass.http.register_view(AvailableFeaturesView)
    hass.http.register_view(CompatibleRecipesView)
    hass.http.register_view(RecipeMatchView)
    
    # AI Recipe Builder endpoints
    hass.http.register_view(AIRecipeIngredientsView)
    hass.http.register_view(AIRecipeCookingStylesView)
    hass.http.register_view(AIRecipeGenerateView)
    hass.http.register_view(AIRecipeDetailView)
    hass.http.register_view(AIRecipeCheckView)
    hass.http.register_view(AIRecipeStatusView)
    hass.http.register_view(AISettingsView)
    hass.http.register_view(AIRecipeSaveCookView)
    
    # Active recipe cook state (cross-device visibility)
    hass.http.register_view(ActiveRecipeCookView)
    
    _LOGGER.info("Kitchen Cooking Engine: API endpoints registered")


class ActiveRecipeCookView(HomeAssistantView):
    """API endpoint for active recipe cooks (cross-device visibility).

    Stores an array of active recipe cook states so all devices can see
    ongoing cooks regardless of which device started them.

    GET    → returns {cooks: [...]}
    POST   → saves the array of active cooks
    DELETE → clears all active cooks
    """

    url = "/api/kitchen_cooking_engine/active_recipe_cook"
    name = "api:kitchen_cooking_engine:active_recipe_cook"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Return all active recipe cooks."""
        hass = request.app["hass"]
        state = await async_load_active_recipe_cook(hass)
        # state may be a list (new format) or a dict (old single-cook format)
        if isinstance(state, list):
            return self.json({"cooks": state})
        if isinstance(state, dict) and state:
            return self.json({"cooks": [state]})
        return self.json({"cooks": []})

    async def post(self, request: web.Request) -> web.Response:
        """Save the array of active recipe cooks."""
        hass = request.app["hass"]
        try:
            data = await request.json()
            cooks = data.get("cooks") if isinstance(data, dict) else None
            if not isinstance(cooks, list):
                return self.json(
                    {"status": "error", "message": "Expected {cooks: [...]}"}
                )
            success = await async_save_active_recipe_cook(hass, cooks)
            if success:
                return self.json({"status": "ok"})
            return self.json({"status": "error", "message": "Failed to save"})
        except Exception as exc:
            _LOGGER.error("Error saving active recipe cooks: %s", exc)
            return self.json(
                {"status": "error", "message": "Failed to process request"}
            )

    async def delete(self, request: web.Request) -> web.Response:
        """Clear all active recipe cooks."""
        hass = request.app["hass"]
        success = await async_clear_active_recipe_cook(hass)
        if success:
            return self.json({"status": "ok"})
        return self.json({"status": "error", "message": "Failed to clear"})


class CookHistoryView(HomeAssistantView):
    """API endpoint for cook history."""

    url = "/api/kitchen_cooking_engine/history"
    name = "api:kitchen_cooking_engine:history"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Get all cook history."""
        hass = request.app["hass"]
        history = await async_load_cook_history(hass)
        # Return most recent first
        history.reverse()
        return self.json({"history": history})

    async def post(self, request: web.Request) -> web.Response:
        """Add a new cook to history."""
        hass = request.app["hass"]
        try:
            data = await request.json()
            success = await async_add_cook_to_history(hass, data)
            if success:
                return self.json({"status": "ok"})
            return self.json({"status": "error", "message": "Failed to save"})
        except Exception as e:
            _LOGGER.error("Error adding cook to history: %s", e)
            return self.json({"status": "error", "message": "Failed to process request"})


class CookHistoryItemView(HomeAssistantView):
    """API endpoint for individual cook history items."""

    url = "/api/kitchen_cooking_engine/history/{cook_id}"
    name = "api:kitchen_cooking_engine:history_item"
    requires_auth = True

    async def patch(self, request: web.Request, cook_id: str) -> web.Response:
        """Update cook entry fields (notes, ratings)."""
        from .storage import async_update_cook_entry
        
        hass = request.app["hass"]
        try:
            data = await request.json()
            # Support updating notes and/or ratings
            updates = {}
            if "notes" in data:
                updates["notes"] = str(data["notes"])
            if "ease_rating" in data:
                rating = int(data["ease_rating"])
                if 1 <= rating <= 5:
                    updates["ease_rating"] = rating
            if "result_rating" in data:
                rating = int(data["result_rating"])
                if 1 <= rating <= 5:
                    updates["result_rating"] = rating
            
            if not updates:
                return self.json({"status": "error", "message": "No valid fields to update"})
            
            success = await async_update_cook_entry(hass, cook_id, updates)
            if success:
                return self.json({"status": "ok"})
            return self.json({"status": "error", "message": "Cook not found"})
        except (ValueError, TypeError) as e:
            _LOGGER.error("Invalid data for cook entry update: %s", e)
            return self.json({"status": "error", "message": "Invalid data provided"})
        except Exception as e:
            _LOGGER.error("Error updating cook entry: %s", e)
            return self.json({"status": "error", "message": "Failed to process request"})

    async def delete(self, request: web.Request, cook_id: str) -> web.Response:
        """Delete a cook from history."""
        hass = request.app["hass"]
        success = await async_delete_cook_from_history(hass, cook_id)
        if success:
            return self.json({"status": "ok"})
        return self.json({"status": "error", "message": "Cook not found"})


class UserPreferencesView(HomeAssistantView):
    """API endpoint for user preferences."""

    url = "/api/kitchen_cooking_engine/preferences"
    name = "api:kitchen_cooking_engine:preferences"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Get all user preferences."""
        hass = request.app["hass"]
        preferences = await async_load_user_preferences(hass)
        return self.json(preferences)


class CutPreferenceView(HomeAssistantView):
    """API endpoint for cut-specific preferences."""

    url = "/api/kitchen_cooking_engine/preferences/cut/{cut_id}"
    name = "api:kitchen_cooking_engine:cut_preference"
    requires_auth = True

    async def get(self, request: web.Request, cut_id: str) -> web.Response:
        """Get preference for a specific cut."""
        hass = request.app["hass"]
        try:
            preference = await async_get_cut_preference(hass, int(cut_id))
            if preference:
                return self.json({"preference": preference})
            return self.json({"preference": None})
        except ValueError:
            return self.json({"status": "error", "message": "Invalid cut_id"})

    async def post(self, request: web.Request, cut_id: str) -> web.Response:
        """Set preference for a specific cut."""
        hass = request.app["hass"]
        try:
            data = await request.json()
            success = await async_set_cut_preference(
                hass,
                int(cut_id),
                data.get("doneness"),
                data.get("custom_temp_c"),
                data.get("cooking_method"),
            )
            if success:
                    return self.json({"status": "ok"})
            return self.json({"status": "error", "message": "Failed to save"})
        except Exception as e:
            _LOGGER.error("Error setting cut preference: %s", e)
            return self.json({"status": "error", "message": "Failed to process request"})


class LanguagePreferenceView(HomeAssistantView):
    """API endpoint for language preference (GET/POST)."""

    url = "/api/kitchen_cooking_engine/preferences/language"
    name = "api:kitchen_cooking_engine:language_preference"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Get current language preference."""
        hass = request.app["hass"]
        language = await async_get_language(hass)
        return self.json({"language": language})

    async def post(self, request: web.Request) -> web.Response:
        """Set language preference."""
        hass = request.app["hass"]
        try:
            data = await request.json()
            language = data.get("language", "en")
            if language not in ("sv", "en"):
                return self.json({"status": "error", "message": f"Unsupported language: {language}"})
            success = await async_set_language(hass, language)
            if success:
                return self.json({"status": "ok", "language": language})
            return self.json({"status": "error", "message": "Failed to save"})
        except Exception as e:
            _LOGGER.error("Error setting language: %s", e)
            return self.json({"status": "error", "message": "Failed to process request"})


class MeasurementSystemPreferenceView(HomeAssistantView):
    """API endpoint for measurement system preference (GET/POST)."""

    url = "/api/kitchen_cooking_engine/preferences/measurement_system"
    name = "api:kitchen_cooking_engine:measurement_system_preference"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Get current measurement system preference."""
        hass = request.app["hass"]
        system = await async_get_measurement_system(hass)
        return self.json({"measurement_system": system})

    async def post(self, request: web.Request) -> web.Response:
        """Set measurement system preference."""
        hass = request.app["hass"]
        try:
            data = await request.json()
            system = data.get("measurement_system", "se")
            if system not in ("se", "uk", "us"):
                return self.json({"status": "error", "message": f"Unsupported measurement system: {system}"})
            success = await async_set_measurement_system(hass, system)
            if success:
                return self.json({"status": "ok", "measurement_system": system})
            return self.json({"status": "error", "message": "Failed to save"})
        except Exception as e:
            _LOGGER.error("Error setting measurement system: %s", e)
            return self.json({"status": "error", "message": "Failed to process request"})


# =============================================================================
# PHASE 3.1: MULTI-APPLIANCE API ENDPOINTS
# =============================================================================


class AppliancesView(HomeAssistantView):
    """API endpoint to list all configured appliances."""

    url = "/api/kitchen_cooking_engine/appliances"
    name = "api:kitchen_cooking_engine:appliances"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Get all configured appliances with their features."""
        from .appliance_manager import get_appliance_manager
        from .const import DOMAIN
        
        hass = request.app["hass"]
        manager = get_appliance_manager(hass)
        
        if not manager:
            return self.json({
                "appliances": [],
                "count": 0
            })
        
        appliances = []
        for entry_id, appliance in manager.get_appliances_with_entry_ids():
            # Build feature_types dictionary: feature_name -> type string
            feature_types = {}
            feature_notes = {}
            for feature_name in appliance.get_features():
                ftype = appliance.get_feature_type(feature_name)
                if ftype:
                    # Convert FeatureType enum to string
                    feature_types[feature_name] = ftype.value
                fnote = appliance.get_feature_notes(feature_name)
                if fnote:
                    feature_notes[feature_name] = fnote
            
            appliances.append({
                "id": appliance.appliance_id,
                "entry_id": entry_id,
                "name": appliance.name,
                "brand": appliance.brand,
                "model": appliance.model,
                "features": list(appliance.get_features()),
                "feature_types": feature_types,
                "feature_notes": feature_notes,
                "recipe_count": len(appliance.recipes) if hasattr(appliance, 'recipes') else 0,
            })
        
        return self.json({
            "appliances": appliances,
            "count": len(appliances)
        })


class ApplianceFeatureNotesView(HomeAssistantView):
    """API endpoint to save feature notes for an appliance."""

    url = "/api/kitchen_cooking_engine/appliances/{entry_id}/feature_notes"
    name = "api:kitchen_cooking_engine:appliance_feature_notes"
    requires_auth = True

    async def post(self, request: web.Request, entry_id: str) -> web.Response:
        """Save feature notes for a specific appliance."""
        from .config_flow import CONF_FEATURE_NOTES, CONF_FEATURES, FEATURE_TYPE_MODIFIED, FEATURE_TYPE_SPECIAL
        from .appliance_manager import get_appliance_manager
        
        hass = request.app["hass"]
        
        # Find the config entry
        config_entry = hass.config_entries.async_get_entry(entry_id)
        if not config_entry:
            return self.json({"error": "Appliance not found"}, status_code=404)
        
        try:
            data = await request.json()
        except (ValueError, KeyError):
            return self.json({"error": "Invalid JSON"}, status_code=400)
        
        feature_notes = data.get("feature_notes", {})
        if not isinstance(feature_notes, dict):
            return self.json({"error": "feature_notes must be a dictionary"}, status_code=400)
        
        # Validate: only allow notes for features that are modified or special
        features = config_entry.data.get(CONF_FEATURES, {})
        validated_notes = {}
        for fname, note in feature_notes.items():
            if not isinstance(note, str):
                continue
            note = note.strip()
            if not note:
                continue
            ftype = features.get(fname)
            if ftype in (FEATURE_TYPE_MODIFIED, FEATURE_TYPE_SPECIAL):
                validated_notes[fname] = note
        
        # Update config entry data
        updated_data = {**config_entry.data, CONF_FEATURE_NOTES: validated_notes}
        hass.config_entries.async_update_entry(config_entry, data=updated_data)
        
        # Reload the appliance so in-memory state reflects the change
        manager = get_appliance_manager(hass)
        if manager:
            appliance = manager.get_appliance_by_id(entry_id)
            if appliance:
                appliance.update_feature_notes(validated_notes)
        
        return self.json({"success": True, "feature_notes": validated_notes})


class AvailableFeaturesView(HomeAssistantView):
    """API endpoint to get aggregated features across all appliances."""

    url = "/api/kitchen_cooking_engine/available_features"
    name = "api:kitchen_cooking_engine:available_features"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Get all available features across all configured appliances."""
        from .appliance_manager import get_appliance_manager
        
        hass = request.app["hass"]
        manager = get_appliance_manager(hass)
        
        if not manager:
            return self.json({
                "features": [],
                "count": 0
            })
        
        features = manager.get_available_features()
        
        return self.json({
            "features": sorted(list(features)),
            "count": len(features)
        })


class CompatibleRecipesView(HomeAssistantView):
    """API endpoint to get recipes compatible with user's appliances."""

    url = "/api/kitchen_cooking_engine/recipes/compatible"
    name = "api:kitchen_cooking_engine:recipes_compatible"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Get recipes that can be cooked with available appliances."""
        from .appliance_manager import get_appliance_manager
        from .recipes.matcher import RecipeMatcher
        from .recipes.models import ImplementationQuality
        
        hass = request.app["hass"]
        manager = get_appliance_manager(hass)
        
        if not manager or not manager.registry.has_appliances():
            return self.json({
                "recipes": [],
                "count": 0,
                "message": "No appliances configured"
            })
        
        # Get quality filter from query params
        min_quality_str = request.query.get("min_quality", "acceptable").upper()
        try:
            min_quality = ImplementationQuality[min_quality_str]
        except KeyError:
            min_quality = ImplementationQuality.ACCEPTABLE
        
        # Get all recipes from all appliances
        all_recipes = manager.registry.get_all_recipes()
        
        # Filter using recipe matcher
        matcher = RecipeMatcher(manager.registry)
        compatible_recipes = matcher.filter_recipes(all_recipes, min_quality=min_quality)
        
        # Build response with match results
        recipes_with_results = []
        for recipe in compatible_recipes:
            result = matcher.match_recipe(recipe)
            recipes_with_results.append({
                "recipe": {
                    "id": recipe.id,
                    "name": recipe.name,
                    "description": recipe.description,
                    "required_features": list(recipe.required_features),
                    "optional_features": list(recipe.optional_features),
                },
                "match": {
                    "quality": result.implementation_quality.name,
                    "score": result.quality_score,
                    "confidence": result.confidence,
                    "suggested_appliances": result.suggested_appliances,
                    "alternative_appliances": result.alternative_appliances,
                    "notes": result.notes,
                }
            })
        
        return self.json({
            "recipes": recipes_with_results,
            "count": len(recipes_with_results),
            "min_quality": min_quality.name
        })


class RecipeMatchView(HomeAssistantView):
    """API endpoint to match a specific recipe against available appliances."""

    url = "/api/kitchen_cooking_engine/recipes/{recipe_id}/match"
    name = "api:kitchen_cooking_engine:recipe_match"
    requires_auth = True

    async def get(self, request: web.Request, recipe_id: str) -> web.Response:
        """Get match result for a specific recipe."""
        from .appliance_manager import get_appliance_manager
        from .recipes.matcher import RecipeMatcher
        
        hass = request.app["hass"]
        manager = get_appliance_manager(hass)
        
        if not manager:
            return self.json({
                "status": "error",
                "message": "Appliance manager not initialized"
            })
        
        # Find recipe by ID
        try:
            recipe_id_int = int(recipe_id)
        except ValueError:
            return self.json({
                "status": "error",
                "message": "Invalid recipe ID"
            })
        
        recipe = manager.registry.get_recipe_by_id(recipe_id_int)
        if not recipe:
            return self.json({
                "status": "error",
                "message": f"Recipe {recipe_id} not found"
            })
        
        # Match recipe
        matcher = RecipeMatcher(manager.registry)
        result = matcher.match_recipe(recipe)
        
        # Get suggestions for missing appliances if not cookable
        missing_appliances = {}
        if not result.can_cook:
            missing_appliances = matcher.suggest_missing_appliances(recipe)
        
        return self.json({
            "recipe_id": recipe_id_int,
            "recipe_name": recipe.name,
            "can_cook": result.can_cook,
            "missing_features": list(result.missing_features),
            "suggested_appliances": result.suggested_appliances,
            "alternative_appliances": result.alternative_appliances,
            "implementation_quality": result.implementation_quality.name,
            "quality_score": result.quality_score,
            "confidence": result.confidence,
            "notes": result.notes,
            "missing_appliances_suggestions": missing_appliances
        })


# =============================================================================
# AI RECIPE BUILDER API ENDPOINTS
# =============================================================================


class AIRecipeCheckView(HomeAssistantView):
    """API endpoint to check if OpenAI is available."""

    url = "/api/kitchen_cooking_engine/ai_recipes/check"
    name = "api:kitchen_cooking_engine:ai_recipes_check"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Check if OpenAI conversation integration is available."""
        from .ai_recipe_builder import AIRecipeBuilder
        
        hass = request.app["hass"]
        builder = AIRecipeBuilder(hass)
        
        available = await builder.check_openai_available()
        
        return self.json({
            "available": available,
            "message": (
                "OpenAI conversation integration is configured and ready"
                if available
                else "OpenAI conversation integration is not configured. Please set up the conversation integration with OpenAI."
            )
        })


class AIRecipeStatusView(HomeAssistantView):
    """Polling endpoint: returns the current AI generation step message.

    The backend (AIRecipeBuilder._set_status) writes a plain-text message to
    ``hass.data[DOMAIN]["ai_generation_status"]`` at every meaningful step
    (sending request, waiting before retry, switching to backup agent, etc.).
    The frontend polls this endpoint once per second while a generation is in
    flight and displays exactly what it receives — no guessing.
    """

    url = "/api/kitchen_cooking_engine/ai_recipes/status"
    name = "api:kitchen_cooking_engine:ai_recipes_status"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Return the current AI generation status message."""
        from .const import DOMAIN

        hass = request.app["hass"]
        message = hass.data.get(DOMAIN, {}).get("ai_generation_status", "")
        return self.json({"message": message})


class AIRecipeIngredientsView(HomeAssistantView):
    """API endpoint to get available ingredients for AI recipe builder."""

    url = "/api/kitchen_cooking_engine/ai_recipes/ingredients"
    name = "api:kitchen_cooking_engine:ai_recipes_ingredients"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Get list of common ingredients grouped by category."""
        from .ai_recipe_builder import get_common_ingredients
        
        ingredients = get_common_ingredients()
        
        return self.json({
            "ingredients": ingredients
        })


class AIRecipeCookingStylesView(HomeAssistantView):
    """API endpoint to get available cooking styles for AI recipe builder."""

    url = "/api/kitchen_cooking_engine/ai_recipes/cooking_styles"
    name = "api:kitchen_cooking_engine:ai_recipes_cooking_styles"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Get list of available cooking styles."""
        from .ai_recipe_builder import get_cooking_styles
        
        styles = get_cooking_styles()
        
        return self.json({
            "cooking_styles": styles
        })


class AIRecipeGenerateView(HomeAssistantView):
    """API endpoint to generate AI recipe suggestions."""

    url = "/api/kitchen_cooking_engine/ai_recipes/generate"
    name = "api:kitchen_cooking_engine:ai_recipes_generate"
    requires_auth = True

    async def post(self, request: web.Request) -> web.Response:
        """Generate 4 recipe suggestions from AI.
        
        Request body:
        {
            "ingredients": ["chicken breast", "broccoli", "rice"],
            "cooking_style": "quick_and_easy",
            "appliance_ids": ["ninja_combi_1", "meater_probe_1"],  // optional
            "dietary_restrictions": ["gluten_free"],  // optional
            "servings": 4,  // optional
            "max_time_minutes": 60  // optional
        }
        """
        from .ai_recipe_builder import AIRecipeBuilder
        
        hass = request.app["hass"]
        
        try:
            data = await request.json()
            
            # Validate required fields
            if "ingredients" not in data or not data["ingredients"]:
                return self.json({
                    "status": "error",
                    "message": "At least one ingredient is required"
                })
            
            if "cooking_style" not in data:
                return self.json({
                    "status": "error",
                    "message": "Cooking style is required"
                })
            
            # Create builder and generate suggestions
            builder = AIRecipeBuilder(hass)
            
            suggestions = await builder.generate_recipe_suggestions(
                ingredients=data["ingredients"],
                cooking_style=data["cooking_style"],
                appliance_ids=data.get("appliance_ids"),
                main_appliance_id=data.get("main_appliance_id"),
                dietary_restrictions=data.get("dietary_restrictions"),
                servings=data.get("servings", 4),
                max_time_minutes=data.get("max_time_minutes"),
                complexity=data.get("complexity", 3),
                cuisines=data.get("cuisines"),
                language=data.get("language", "en"),
                measurement_system=data.get("measurement_system", "us"),
            )
            
            # Convert suggestions to dict for JSON
            suggestions_dict = [
                {
                    "id": s.id,
                    "name": s.name,
                    "description": s.description,
                    "cook_time_minutes": s.cook_time_minutes,
                    "difficulty": s.difficulty,
                    "main_ingredients": s.main_ingredients,
                    "cuisine_type": s.cuisine_type,
                    "required_appliances": s.required_appliances,
                    "recipe_origin": s.recipe_origin,
                }
                for s in suggestions
            ]
            
            return self.json({
                "status": "ok",
                "suggestions": suggestions_dict,
                "count": len(suggestions_dict)
            })
            
        except Exception as ex:
            _LOGGER.error("Error generating AI recipes: %s", ex)
            return self.json({
                "status": "error",
                "message": str(ex)
            })


class AIRecipeDetailView(HomeAssistantView):
    """API endpoint to get detailed recipe for a suggestion."""

    url = "/api/kitchen_cooking_engine/ai_recipes/detail"
    name = "api:kitchen_cooking_engine:ai_recipes_detail"
    requires_auth = True

    async def post(self, request: web.Request) -> web.Response:
        """Get detailed recipe for a suggestion.
        
        Request body:
        {
            "suggestion_id": "ai_recipe_1",
            "suggestion": {
                "id": "ai_recipe_1",
                "name": "Recipe Name",
                "description": "Description",
                "cook_time_minutes": 45,
                "difficulty": "medium",
                "main_ingredients": ["ingredient1", "ingredient2"],
                "cuisine_type": "italian",
                "required_appliances": ["oven"]
            },
            "appliance_ids": ["ninja_combi_1"]  // optional
        }
        """
        from .ai_recipe_builder import AIRecipeBuilder, AIRecipeSuggestion
        
        hass = request.app["hass"]
        
        try:
            data = await request.json()
            
            if "suggestion_id" not in data:
                return self.json({
                    "status": "error",
                    "message": "suggestion_id is required"
                })
            
            if "suggestion" not in data:
                return self.json({
                    "status": "error",
                    "message": "suggestion object is required"
                })
            
            # Reconstruct the suggestion object from the data
            suggestion_data = data["suggestion"]
            suggestion = AIRecipeSuggestion(
                id=suggestion_data["id"],
                name=suggestion_data["name"],
                description=suggestion_data["description"],
                cook_time_minutes=suggestion_data["cook_time_minutes"],
                difficulty=suggestion_data["difficulty"],
                main_ingredients=suggestion_data["main_ingredients"],
                cuisine_type=suggestion_data.get("cuisine_type"),
                required_appliances=suggestion_data.get("required_appliances", []),
            )
            
            builder = AIRecipeBuilder(hass)
            
            detail = await builder.get_recipe_detail(
                suggestion_id=data["suggestion_id"],
                suggestion=suggestion,
                appliance_ids=data.get("appliance_ids"),
                main_appliance_id=data.get("main_appliance_id"),
                cooking_style=data.get("cooking_style", "quick_and_easy"),
                complexity=data.get("complexity", 3),
                user_ingredients=data.get("user_ingredients"),
                servings=data.get("servings", 4),
                language=data.get("language", "en"),
                measurement_system=data.get("measurement_system", "us"),
            )
            
            if not detail:
                return self.json({
                    "status": "error",
                    "message": "Failed to get recipe detail"
                })
            
            # Convert detail to dict for JSON
            detail_dict = {
                "suggestion": {
                    "id": detail.suggestion.id,
                    "name": detail.suggestion.name,
                    "description": detail.suggestion.description,
                    "cook_time_minutes": detail.suggestion.cook_time_minutes,
                    "difficulty": detail.suggestion.difficulty,
                    "main_ingredients": detail.suggestion.main_ingredients,
                    "cuisine_type": detail.suggestion.cuisine_type,
                    "required_appliances": detail.suggestion.required_appliances,
                },
                "ingredients": detail.ingredients,
                "instructions": detail.instructions,
                "step_ingredients": detail.step_ingredients,
                "tips": detail.tips,
                "phases": [
                    {
                        "mode": p.mode,
                        "temperature_c": p.temperature_c,
                        "temperature_f": p.temperature_f,
                        "duration_minutes": p.duration_minutes,
                        "description": p.description,
                    }
                    for p in detail.phases
                ],
                "use_probe": detail.use_probe,
                "target_temp_c": detail.target_temp_c,
                "target_temp_f": detail.target_temp_f,
                "servings": detail.servings,
                "prep_time_minutes": detail.prep_time_minutes,
            }
            
            # Also convert to UnifiedRecipe format for compatibility
            unified_recipe = builder.convert_to_unified_recipe(detail)
            detail_dict["unified_recipe_id"] = unified_recipe.id
            
            return self.json({
                "status": "ok",
                "detail": detail_dict
            })
            
        except Exception as ex:
            _LOGGER.error("Error getting AI recipe detail: %s", ex)
            return self.json({
                "status": "error",
                "message": str(ex)
            })


class AISettingsView(HomeAssistantView):
    """API endpoint to get and update AI settings."""

    url = "/api/kitchen_cooking_engine/ai_settings"
    name = "api:kitchen_cooking_engine:ai_settings"
    requires_auth = True

    async def get(self, request: web.Request) -> web.Response:
        """Get current AI settings including agent ID."""
        from .storage import async_load_ai_settings
        
        hass = request.app["hass"]
        
        try:
            settings = await async_load_ai_settings(hass)
            
            return self.json({
                "status": "ok",
                "settings": settings
            })
            
        except Exception as ex:
            _LOGGER.error("Error loading AI settings: %s", ex)
            return self.json({
                "status": "error",
                "message": str(ex)
            })
    
    async def post(self, request: web.Request) -> web.Response:
        """Update AI settings.
        
        Request body:
        {
            "agent_id": "extended_openai_conversation_2",
            "backup_agent_id": "conversation.google_generative_ai_conversation"
        }
        """
        from .storage import async_save_ai_settings
        
        hass = request.app["hass"]
        
        try:
            data = await request.json()
            
            if "agent_id" not in data:
                return self.json({
                    "status": "error",
                    "message": "agent_id is required"
                })
            
            settings = {
                "agent_id": data["agent_id"],
                "backup_agent_id": data.get("backup_agent_id", ""),
            }
            
            success = await async_save_ai_settings(hass, settings)
            
            if success:
                return self.json({
                    "status": "ok",
                    "settings": settings
                })
            else:
                return self.json({
                    "status": "error",
                    "message": "Failed to save settings"
                })
            
        except Exception as ex:
            _LOGGER.error("Error saving AI settings: %s", ex)
            return self.json({
                "status": "error",
                "message": str(ex)
            })


class AIRecipeSaveCookView(HomeAssistantView):
    """API endpoint to save a completed recipe cook to history."""

    url = "/api/kitchen_cooking_engine/ai_recipes/save_cook"
    name = "api:kitchen_cooking_engine:ai_recipes_save_cook"
    requires_auth = True

    async def post(self, request: web.Request) -> web.Response:
        """Save a recipe cook to cook history.
        
        Request body:
        {
            "recipe_id": "ai_recipe_1",
            "recipe_name": "Garlic Chicken Stir-Fry",
            "serving_size": 4,
            "duration_seconds": 1800,
            "ease_rating": 4,
            "result_rating": 5,
            "notes": "Delicious!",
            "ingredients": ["chicken", "garlic"],
            "appliance_id": "ninja_combi_1"
        }
        """
        from .storage import async_add_cook_to_history
        
        hass = request.app["hass"]
        
        try:
            data = await request.json()
            
            cook_data = {
                "cook_type": "ai_recipe",
                "recipe_id": data.get("recipe_id", ""),
                "recipe_name": data.get("recipe_name", "Unknown Recipe"),
                "protein": "AI Recipe",
                "cut": data.get("recipe_name", "AI Recipe"),
                "cut_display": data.get("recipe_name", "AI Recipe"),
                "serving_size": data.get("serving_size", 4),
                "duration_seconds": data.get("duration_seconds", 0),
                "ease_rating": data.get("ease_rating", 0),
                "result_rating": data.get("result_rating", 0),
                "notes": data.get("notes", ""),
                "ingredients": data.get("ingredients", []),
                "appliance_id": data.get("appliance_id"),
                "recipe_data": data.get("recipe_data"),
            }
            
            success = await async_add_cook_to_history(hass, cook_data)
            
            if success:
                return self.json({
                    "status": "ok",
                    "message": "Recipe cook saved to history"
                })
            else:
                return self.json({
                    "status": "error",
                    "message": "Failed to save cook to history"
                })
            
        except Exception as ex:
            _LOGGER.error("Error saving recipe cook: %s", ex)
            return self.json({
                "status": "error",
                "message": str(ex)
            })
