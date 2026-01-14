"""Migration utilities for Kitchen Cooking Engine.

Handles migration from single-appliance (MEATER+ only) configuration
to multi-appliance architecture.

Last Updated: 8 Jan 2026, 23:58 CET
Last Change: Initial migration utilities (Phase 3.1)
"""

from __future__ import annotations

import logging
from typing import TYPE_CHECKING, Any, Dict, Optional

from homeassistant.config_entries import ConfigEntry
from homeassistant.core import HomeAssistant
from homeassistant.helpers import entity_registry as er

if TYPE_CHECKING:
    pass

_LOGGER = logging.getLogger(__name__)

# Migration status tracking
MIGRATION_STATUS_KEY = "migration_status"
MIGRATION_VERSION_KEY = "migration_version"

# Current migration version
CURRENT_MIGRATION_VERSION = 1


def detect_config_version(entry: ConfigEntry) -> str:
    """Detect the configuration entry version.
    
    Args:
        entry: Config entry to check
        
    Returns:
        Version string: "v0.3+" for new format, "v0.2" for legacy
    """
    # New format has appliance_type field
    if "appliance_type" in entry.data:
        return "v0.3+"
    
    # Old format (legacy MEATER+ only)
    return "v0.2"


def needs_migration(entry: ConfigEntry) -> bool:
    """Check if a config entry needs migration.
    
    Args:
        entry: Config entry to check
        
    Returns:
        True if migration needed
    """
    version = detect_config_version(entry)
    
    if version == "v0.2":
        # Check if already migrated
        migration_status = entry.data.get(MIGRATION_STATUS_KEY)
        if migration_status == "completed":
            return False
        return True
    
    return False


async def async_migrate_entry(
    hass: HomeAssistant,
    entry: ConfigEntry
) -> bool:
    """Migrate a config entry from v0.2 to v0.3+.
    
    Migration steps:
    1. Detect old format
    2. Add appliance_type field
    3. Preserve all existing settings
    4. Update entry version
    5. Mark as migrated
    6. Notify user
    
    Args:
        hass: Home Assistant instance
        entry: Config entry to migrate
        
    Returns:
        True if migration successful
    """
    _LOGGER.info(
        "Starting migration for config entry: %s (id: %s)",
        entry.title,
        entry.entry_id
    )
    
    try:
        # Create new data dictionary with appliance type
        new_data = {
            **entry.data,
            "appliance_type": "meater_plus",
            MIGRATION_STATUS_KEY: "completed",
            MIGRATION_VERSION_KEY: CURRENT_MIGRATION_VERSION,
        }
        
        # Update config entry with new version
        # Version 1 is the base version for migrated entries
        hass.config_entries.async_update_entry(
            entry, 
            data=new_data,
            version=1
        )
        
        _LOGGER.info(
            "Migration successful for entry: %s (updated to version 1)",
            entry.title
        )
        
        # Create notification for user
        await _async_create_migration_notification(hass, entry)
        
        return True
        
    except Exception as ex:
        _LOGGER.error(
            "Migration failed for entry %s: %s",
            entry.title,
            ex,
            exc_info=True
        )
        return False


async def _async_create_migration_notification(
    hass: HomeAssistant,
    entry: ConfigEntry
) -> None:
    """Create a persistent notification for successful migration.
    
    Args:
        hass: Home Assistant instance
        entry: Migrated config entry
    """
    title = "Kitchen Cooking Engine Updated"
    message = (
        f"Your Kitchen Cooking Engine configuration has been automatically "
        f"upgraded to support multiple appliances!\n\n"
        f"**What's New:**\n"
        f"- Your existing MEATER+ configuration has been preserved\n"
        f"- You can now add more appliances (Ninja Combi, MultiFry, etc.)\n"
        f"- Recipes will automatically filter based on your appliances\n"
        f"- Multi-appliance recipe support\n\n"
        f"**Next Steps:**\n"
        f"1. Go to **Settings** → **Devices & Services**\n"
        f"2. Click **Add Integration**\n"
        f"3. Search for **Kitchen Cooking Engine**\n"
        f"4. Select your appliance type and configure\n\n"
        f"No action is required - your existing setup continues to work!"
    )
    
    notification_id = f"kce_migration_{entry.entry_id}"
    
    await hass.services.async_call(
        "persistent_notification",
        "create",
        {
            "title": title,
            "message": message,
            "notification_id": notification_id,
        },
    )
    
    _LOGGER.info("Migration notification created for entry: %s", entry.title)


async def async_migrate_legacy_entities(
    hass: HomeAssistant,
    entry: ConfigEntry
) -> bool:
    """Migrate entity unique IDs if needed.
    
    For backward compatibility, ensure entity IDs remain the same.
    
    Args:
        hass: Home Assistant instance
        entry: Config entry
        
    Returns:
        True if migration successful
    """
    ent_reg = er.async_get(hass)
    
    # Get all entities for this config entry
    entities = er.async_entries_for_config_entry(ent_reg, entry.entry_id)
    
    migrated_count = 0
    
    for entity in entities:
        # Check if entity needs unique_id update
        # (In case we change naming schemes in the future)
        old_unique_id = entity.unique_id
        
        # For now, no changes needed - just log for monitoring
        _LOGGER.debug(
            "Entity found: %s (unique_id: %s)",
            entity.entity_id,
            old_unique_id
        )
    
    if migrated_count > 0:
        _LOGGER.info(
            "Migrated %d entities for entry: %s",
            migrated_count,
            entry.title
        )
    
    return True


async def async_rollback_migration(
    hass: HomeAssistant,
    entry: ConfigEntry
) -> bool:
    """Rollback a migration if something goes wrong.
    
    This should rarely be needed, but provides a safety net.
    
    Args:
        hass: Home Assistant instance
        entry: Config entry to rollback
        
    Returns:
        True if rollback successful
    """
    _LOGGER.warning(
        "Rolling back migration for entry: %s",
        entry.title
    )
    
    try:
        # Create data without migration fields
        old_data = {
            k: v for k, v in entry.data.items()
            if k not in [
                "appliance_type",
                MIGRATION_STATUS_KEY,
                MIGRATION_VERSION_KEY
            ]
        }
        
        # Update config entry
        hass.config_entries.async_update_entry(entry, data=old_data)
        
        _LOGGER.info(
            "Rollback successful for entry: %s",
            entry.title
        )
        
        return True
        
    except Exception as ex:
        _LOGGER.error(
            "Rollback failed for entry %s: %s",
            entry.title,
            ex,
            exc_info=True
        )
        return False


def get_migration_status(entry: ConfigEntry) -> Dict[str, Any]:
    """Get migration status for a config entry.
    
    Args:
        entry: Config entry to check
        
    Returns:
        Dictionary with migration status information
    """
    version = detect_config_version(entry)
    needs_mig = needs_migration(entry)
    
    return {
        "config_version": version,
        "needs_migration": needs_mig,
        "migration_status": entry.data.get(MIGRATION_STATUS_KEY, "not_started"),
        "migration_version": entry.data.get(MIGRATION_VERSION_KEY, 0),
        "current_migration_version": CURRENT_MIGRATION_VERSION,
    }


async def async_check_and_migrate_all_entries(hass: HomeAssistant) -> int:
    """Check and migrate all config entries if needed.
    
    This should be called during integration setup to handle
    migrations automatically.
    
    Args:
        hass: Home Assistant instance
        
    Returns:
        Number of entries migrated
    """
    from .const import DOMAIN
    
    entries = hass.config_entries.async_entries(DOMAIN)
    migrated_count = 0
    
    for entry in entries:
        if needs_migration(entry):
            _LOGGER.info(
                "Found entry needing migration: %s",
                entry.title
            )
            
            success = await async_migrate_entry(hass, entry)
            if success:
                migrated_count += 1
                
                # Also migrate entities if needed
                await async_migrate_legacy_entities(hass, entry)
            else:
                _LOGGER.error(
                    "Failed to migrate entry: %s",
                    entry.title
                )
    
    if migrated_count > 0:
        _LOGGER.info(
            "Migration complete: %d entries migrated",
            migrated_count
        )
    
    return migrated_count
