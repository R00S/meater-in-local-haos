"""Storage module for Kitchen Cooking Engine.

Handles persistent storage for:
- Cook history (completed cooks with timestamps, temps, notes)
- User preferences (last doneness per cut)

Last Updated: 2 Dec 2025, 15:30 CET
"""

from __future__ import annotations

import json
import logging
from datetime import datetime
from pathlib import Path
from typing import Any

from homeassistant.core import HomeAssistant
from homeassistant.util import dt as dt_util

from .const import DOMAIN

_LOGGER = logging.getLogger(__name__)

# Storage file names
COOK_HISTORY_FILE = "cook_history.json"
USER_PREFERENCES_FILE = "user_preferences.json"

# Maximum history entries to keep
MAX_HISTORY_ENTRIES = 100


def _get_storage_path(hass: HomeAssistant, filename: str) -> Path:
    """Get the path to a storage file."""
    storage_dir = Path(hass.config.path()) / ".storage" / DOMAIN
    storage_dir.mkdir(parents=True, exist_ok=True)
    return storage_dir / filename


async def async_load_cook_history(hass: HomeAssistant) -> list[dict]:
    """Load cook history from storage."""
    storage_path = _get_storage_path(hass, COOK_HISTORY_FILE)
    
    def load_history():
        if not storage_path.exists():
            return []
        try:
            with open(storage_path, "r", encoding="utf-8") as f:
                data = json.load(f)
                return data if isinstance(data, list) else []
        except (json.JSONDecodeError, IOError) as e:
            _LOGGER.warning("Failed to load cook history: %s", e)
            return []
    
    return await hass.async_add_executor_job(load_history)


async def async_save_cook_history(hass: HomeAssistant, history: list[dict]) -> bool:
    """Save cook history to storage."""
    storage_path = _get_storage_path(hass, COOK_HISTORY_FILE)
    
    # Limit history size
    if len(history) > MAX_HISTORY_ENTRIES:
        history = history[-MAX_HISTORY_ENTRIES:]
    
    def save_history():
        try:
            with open(storage_path, "w", encoding="utf-8") as f:
                json.dump(history, f, indent=2, default=str)
            return True
        except IOError as e:
            _LOGGER.error("Failed to save cook history: %s", e)
            return False
    
    return await hass.async_add_executor_job(save_history)


async def async_add_cook_to_history(
    hass: HomeAssistant,
    cook_data: dict[str, Any],
) -> bool:
    """Add a completed cook to history."""
    history = await async_load_cook_history(hass)
    
    # Add timestamp if not present
    if "completed_at" not in cook_data:
        cook_data["completed_at"] = dt_util.utcnow().isoformat()
    
    # Generate unique ID
    cook_data["id"] = f"cook_{int(datetime.now().timestamp() * 1000)}"
    
    history.append(cook_data)
    return await async_save_cook_history(hass, history)


async def async_update_cook_notes(
    hass: HomeAssistant,
    cook_id: str,
    notes: str,
) -> bool:
    """Update notes for a specific cook."""
    history = await async_load_cook_history(hass)
    
    for cook in history:
        if cook.get("id") == cook_id:
            cook["notes"] = notes
            return await async_save_cook_history(hass, history)
    
    _LOGGER.warning("Cook not found: %s", cook_id)
    return False


async def async_delete_cook_from_history(
    hass: HomeAssistant,
    cook_id: str,
) -> bool:
    """Delete a cook from history."""
    history = await async_load_cook_history(hass)
    original_len = len(history)
    history = [c for c in history if c.get("id") != cook_id]
    
    if len(history) == original_len:
        _LOGGER.warning("Cook not found for deletion: %s", cook_id)
        return False
    
    return await async_save_cook_history(hass, history)


# User Preferences (last doneness per cut)

async def async_load_user_preferences(hass: HomeAssistant) -> dict:
    """Load user preferences from storage."""
    storage_path = _get_storage_path(hass, USER_PREFERENCES_FILE)
    
    def load_prefs():
        if not storage_path.exists():
            return {"cut_preferences": {}}
        try:
            with open(storage_path, "r", encoding="utf-8") as f:
                data = json.load(f)
                return data if isinstance(data, dict) else {"cut_preferences": {}}
        except (json.JSONDecodeError, IOError) as e:
            _LOGGER.warning("Failed to load user preferences: %s", e)
            return {"cut_preferences": {}}
    
    return await hass.async_add_executor_job(load_prefs)


async def async_save_user_preferences(hass: HomeAssistant, preferences: dict) -> bool:
    """Save user preferences to storage."""
    storage_path = _get_storage_path(hass, USER_PREFERENCES_FILE)
    
    def save_prefs():
        try:
            with open(storage_path, "w", encoding="utf-8") as f:
                json.dump(preferences, f, indent=2)
            return True
        except IOError as e:
            _LOGGER.error("Failed to save user preferences: %s", e)
            return False
    
    return await hass.async_add_executor_job(save_prefs)


async def async_set_cut_preference(
    hass: HomeAssistant,
    cut_id: int,
    doneness: str,
    custom_temp_c: int | None = None,
    cooking_method: str | None = None,
) -> bool:
    """Set user preference for a specific cut including fine-tuned temperature."""
    preferences = await async_load_user_preferences(hass)
    
    if "cut_preferences" not in preferences:
        preferences["cut_preferences"] = {}
    
    pref_data = {
        "doneness": doneness,
        "cooking_method": cooking_method,
        "last_used": dt_util.utcnow().isoformat(),
    }
    
    # Only store custom_temp_c if it's set (user fine-tuned)
    if custom_temp_c is not None:
        pref_data["custom_temp_c"] = custom_temp_c
    
    preferences["cut_preferences"][str(cut_id)] = pref_data
    
    return await async_save_user_preferences(hass, preferences)


async def async_get_cut_preference(
    hass: HomeAssistant,
    cut_id: int,
) -> dict | None:
    """Get user preference for a specific cut."""
    preferences = await async_load_user_preferences(hass)
    return preferences.get("cut_preferences", {}).get(str(cut_id))
