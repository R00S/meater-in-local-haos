"""Sensor platform for Kitchen Cooking Engine.

Last Updated: 2024-12-01T01:50:00Z
Last Agent Edit: 2024-12-01T01:50:00Z
"""

from __future__ import annotations

import logging
from datetime import datetime
from typing import Any

from homeassistant.components.sensor import SensorEntity
from homeassistant.config_entries import ConfigEntry
from homeassistant.core import HomeAssistant, callback
from homeassistant.helpers.device_registry import DeviceInfo
from homeassistant.helpers.entity_platform import AddEntitiesCallback
from homeassistant.helpers.event import async_track_state_change_event

from .const import (
    APPROACHING_THRESHOLD_C,
    ATTR_AMBIENT_TEMP,
    ATTR_COOKING_METHOD,
    ATTR_CURRENT_TEMP,
    ATTR_CUT,
    ATTR_CUT_DISPLAY,
    ATTR_DONENESS,
    ATTR_ETA_MINUTES,
    ATTR_MAX_TEMP_C,
    ATTR_MAX_TEMP_F,
    ATTR_MIN_TEMP_C,
    ATTR_MIN_TEMP_F,
    ATTR_PROGRESS,
    ATTR_PROTEIN,
    ATTR_REST_TIME_MINUTES,
    ATTR_SESSION_START,
    ATTR_TARGET_TEMP_C,
    ATTR_TARGET_TEMP_F,
    ATTR_USDA_SAFE,
    CONF_AMBIENT_SENSOR,
    CONF_TEMPERATURE_SENSOR,
    CONF_TEMPERATURE_UNIT,
    DOMAIN,
    EVENT_APPROACHING_TARGET,
    EVENT_GOAL_REACHED,
    MINUTES_PER_DEGREE_C,
    PROGRESS_START_OFFSET_C,
    STATE_APPROACHING,
    STATE_COMPLETE,
    STATE_COOKING,
    STATE_GOAL_REACHED,
    STATE_IDLE,
    STATE_RESTING,
    TEMP_CELSIUS,
)

_LOGGER = logging.getLogger(__name__)


async def async_setup_entry(
    hass: HomeAssistant,
    config_entry: ConfigEntry,
    async_add_entities: AddEntitiesCallback,
) -> None:
    """Set up the Kitchen Cooking Engine sensors."""
    temp_sensor = config_entry.data.get(CONF_TEMPERATURE_SENSOR)
    ambient_sensor = config_entry.data.get(CONF_AMBIENT_SENSOR)
    temp_unit = config_entry.data.get(CONF_TEMPERATURE_UNIT, TEMP_CELSIUS)

    cooking_session = CookingSessionSensor(
        hass,
        config_entry.entry_id,
        temp_sensor,
        ambient_sensor,
        temp_unit,
    )
    
    entities = [cooking_session]

    # Store reference to the entity for service handlers
    if config_entry.entry_id in hass.data.get(DOMAIN, {}):
        hass.data[DOMAIN][config_entry.entry_id]["entities"] = entities

    async_add_entities(entities)


class CookingSessionSensor(SensorEntity):
    """Sensor representing a cooking session."""

    _attr_has_entity_name = True
    _attr_should_poll = False
    _attr_icon = "mdi:food-steak"

    def __init__(
        self,
        hass: HomeAssistant,
        entry_id: str,
        temp_sensor: str,
        ambient_sensor: str | None,
        temp_unit: str,
    ) -> None:
        """Initialize the cooking session sensor."""
        self._hass = hass
        self._entry_id = entry_id
        self._temp_sensor = temp_sensor
        self._ambient_sensor = ambient_sensor
        self._temp_unit = temp_unit

        # Session state
        self._state = STATE_IDLE
        self._protein: str | None = None
        self._cut: str | None = None
        self._cut_display: str | None = None
        self._doneness: str | None = None
        self._cooking_method: str | None = None
        self._target_temp_c: int | None = None
        self._target_temp_f: int | None = None
        self._min_temp_c: int | None = None
        self._min_temp_f: int | None = None
        self._max_temp_c: int | None = None
        self._max_temp_f: int | None = None
        self._current_temp: float | None = None
        self._ambient_temp: float | None = None
        self._session_start: datetime | None = None
        self._progress: float = 0.0
        self._rest_time_min: int = 0
        self._rest_time_max: int = 0
        self._usda_safe: bool = False
        self._carryover_temp_c: int = 0

        # Entity attributes
        self._attr_unique_id = f"{DOMAIN}_{entry_id}_session"
        self._attr_name = "Cooking Session"
        
        # Device info - group entities under a device
        # Extract sensor name for device identification
        sensor_name = temp_sensor.split(".")[-1] if temp_sensor else "unknown"
        self._attr_device_info = DeviceInfo(
            identifiers={(DOMAIN, entry_id)},
            name=f"Kitchen Cooking Engine ({sensor_name})",
            manufacturer="Kitchen Cooking Engine",
            model="Cooking Session",
            sw_version="0.1.0",
        )

    @property
    def native_value(self) -> str:
        """Return the state of the sensor."""
        return self._state

    @property
    def icon(self) -> str:
        """Return the icon based on cooking state."""
        state_icons = {
            STATE_IDLE: "mdi:food-steak",
            STATE_COOKING: "mdi:fire",
            STATE_APPROACHING: "mdi:thermometer-alert",
            STATE_GOAL_REACHED: "mdi:check-circle",
            STATE_RESTING: "mdi:timer-sand",
            STATE_COMPLETE: "mdi:silverware-fork-knife",
        }
        return state_icons.get(self._state, "mdi:food-steak")

    @property
    def extra_state_attributes(self) -> dict[str, Any]:
        """Return entity specific state attributes."""
        attrs = {
            ATTR_PROTEIN: self._protein,
            ATTR_CUT: self._cut,
            ATTR_CUT_DISPLAY: self._cut_display,
            ATTR_DONENESS: self._doneness,
            ATTR_COOKING_METHOD: self._cooking_method,
            ATTR_TARGET_TEMP_C: self._target_temp_c,
            ATTR_TARGET_TEMP_F: self._target_temp_f,
            ATTR_MIN_TEMP_C: self._min_temp_c,
            ATTR_MIN_TEMP_F: self._min_temp_f,
            ATTR_MAX_TEMP_C: self._max_temp_c,
            ATTR_MAX_TEMP_F: self._max_temp_f,
            ATTR_CURRENT_TEMP: self._current_temp,
            ATTR_AMBIENT_TEMP: self._ambient_temp,
            ATTR_PROGRESS: round(self._progress, 1),
            ATTR_USDA_SAFE: self._usda_safe,
            ATTR_REST_TIME_MINUTES: f"{self._rest_time_min}-{self._rest_time_max}",
        }

        if self._session_start:
            attrs[ATTR_SESSION_START] = self._session_start.isoformat()

        # Calculate ETA if cooking
        if self._state == STATE_COOKING and self._current_temp and self._target_temp_c:
            eta = self._calculate_eta()
            if eta:
                attrs[ATTR_ETA_MINUTES] = eta

        return attrs

    async def async_added_to_hass(self) -> None:
        """Register callbacks when entity is added."""
        # Track temperature sensor changes
        if self._temp_sensor:
            self.async_on_remove(
                async_track_state_change_event(
                    self._hass,
                    [self._temp_sensor],
                    self._async_temp_changed,
                )
            )

        # Track ambient sensor changes
        if self._ambient_sensor:
            self.async_on_remove(
                async_track_state_change_event(
                    self._hass,
                    [self._ambient_sensor],
                    self._async_ambient_changed,
                )
            )

        # Get initial values
        await self._async_update_temps()

    @callback
    def _async_temp_changed(self, event) -> None:
        """Handle temperature sensor state changes."""
        new_state = event.data.get("new_state")
        if new_state is None or new_state.state in ("unknown", "unavailable"):
            return

        try:
            self._current_temp = float(new_state.state)
            self._update_cooking_state()
            self.async_write_ha_state()
        except ValueError:
            _LOGGER.warning("Invalid temperature value: %s", new_state.state)

    @callback
    def _async_ambient_changed(self, event) -> None:
        """Handle ambient sensor state changes."""
        new_state = event.data.get("new_state")
        if new_state is None or new_state.state in ("unknown", "unavailable"):
            return

        try:
            self._ambient_temp = float(new_state.state)
            self.async_write_ha_state()
        except ValueError:
            _LOGGER.warning("Invalid ambient temperature: %s", new_state.state)

    async def _async_update_temps(self) -> None:
        """Update temperature values from sensors."""
        if self._temp_sensor:
            state = self._hass.states.get(self._temp_sensor)
            if state and state.state not in ("unknown", "unavailable"):
                try:
                    self._current_temp = float(state.state)
                except ValueError:
                    pass

        if self._ambient_sensor:
            state = self._hass.states.get(self._ambient_sensor)
            if state and state.state not in ("unknown", "unavailable"):
                try:
                    self._ambient_temp = float(state.state)
                except ValueError:
                    pass

    def _update_cooking_state(self) -> None:
        """Update cooking state based on current temperature."""
        if self._state == STATE_IDLE or not self._target_temp_c:
            return

        if self._current_temp is None:
            return

        # Convert to Celsius if needed for comparison
        current_c = self._current_temp
        if self._temp_unit != TEMP_CELSIUS:
            current_c = (self._current_temp - 32) * 5 / 9

        # Calculate progress (0-100%)
        if self._min_temp_c and self._target_temp_c:
            start_temp = min(current_c, self._min_temp_c - PROGRESS_START_OFFSET_C)
            temp_range = self._target_temp_c - start_temp
            if temp_range > 0:
                self._progress = min(
                    100.0, max(0.0, (current_c - start_temp) / temp_range * 100)
                )

        # State transitions with event firing
        if self._state == STATE_COOKING:
            # Check if approaching target
            if current_c >= self._target_temp_c - APPROACHING_THRESHOLD_C:
                self._state = STATE_APPROACHING
                self._fire_event(EVENT_APPROACHING_TARGET)
                _LOGGER.info(
                    "Approaching target: %s at %.1f°C (target: %d°C)",
                    self._cut_display,
                    current_c,
                    self._target_temp_c,
                )
        elif self._state == STATE_APPROACHING:
            # Check if goal reached
            if current_c >= self._target_temp_c:
                self._state = STATE_GOAL_REACHED
                self._fire_event(EVENT_GOAL_REACHED)
                _LOGGER.info(
                    "Goal reached: %s at %.1f°C - Time to rest!",
                    self._cut_display,
                    current_c,
                )
        elif self._state == STATE_RESTING:
            # Resting state is managed by service calls
            pass

    def _fire_event(self, event_type: str) -> None:
        """Fire an event with current cooking session data."""
        event_data = {
            "entity_id": self.entity_id,
            "protein": self._protein,
            "cut": self._cut,
            "cut_display": self._cut_display,
            "doneness": self._doneness,
            "cooking_method": self._cooking_method,
            "target_temp_c": self._target_temp_c,
            "target_temp_f": self._target_temp_f,
            "current_temp": self._current_temp,
            "progress": round(self._progress, 1),
            "rest_time_min": self._rest_time_min,
            "rest_time_max": self._rest_time_max,
        }
        self._hass.bus.async_fire(event_type, event_data)
        _LOGGER.debug("Fired event %s with data: %s", event_type, event_data)

    def _calculate_eta(self) -> int | None:
        """Estimate time to reach target temperature.

        This is a simplified calculation. A more sophisticated version
        would use temperature history and Newton's law of cooling.
        """
        if not self._current_temp or not self._target_temp_c:
            return None

        current_c = self._current_temp
        if self._temp_unit != TEMP_CELSIUS:
            current_c = (self._current_temp - 32) * 5 / 9

        temp_diff = self._target_temp_c - current_c
        if temp_diff <= 0:
            return 0

        # Simple estimate based on typical cooking rates
        # This varies significantly based on cut thickness, cooking method, etc.
        return int(temp_diff * MINUTES_PER_DEGREE_C)

    def start_cook(
        self,
        protein: str,
        cut: str,
        doneness: str,
        cooking_method: str,
        target_temp_c: int,
        target_temp_f: int,
        min_temp_c: int,
        min_temp_f: int,
        max_temp_c: int,
        max_temp_f: int,
        rest_time_min: int,
        rest_time_max: int,
        usda_safe: bool,
        carryover_temp_c: int,
        cut_display: str | None = None,
    ) -> None:
        """Start a new cooking session."""
        self._protein = protein
        self._cut = cut
        self._cut_display = cut_display or cut
        self._doneness = doneness
        self._cooking_method = cooking_method
        self._target_temp_c = target_temp_c
        self._target_temp_f = target_temp_f
        self._min_temp_c = min_temp_c
        self._min_temp_f = min_temp_f
        self._max_temp_c = max_temp_c
        self._max_temp_f = max_temp_f
        self._rest_time_min = rest_time_min
        self._rest_time_max = rest_time_max
        self._usda_safe = usda_safe
        self._carryover_temp_c = carryover_temp_c
        self._session_start = datetime.now()
        self._state = STATE_COOKING
        self._progress = 0.0
        self.async_write_ha_state()
        _LOGGER.info(
            "Started cooking session: %s (%s) - Target: %d°C (%d°F)",
            self._cut_display,
            self._doneness,
            self._target_temp_c,
            self._target_temp_f,
        )

    def stop_cook(self) -> None:
        """Stop the current cooking session."""
        _LOGGER.info("Stopped cooking session")
        self._state = STATE_IDLE
        self._progress = 0.0
        self.async_write_ha_state()

    def start_rest(self) -> None:
        """Start the resting phase."""
        _LOGGER.info(
            "Started rest phase - Rest time: %d-%d minutes",
            self._rest_time_min,
            self._rest_time_max,
        )
        self._state = STATE_RESTING
        self.async_write_ha_state()

    def complete_session(self) -> None:
        """Mark session as complete."""
        _LOGGER.info("Cooking session completed")
        self._state = STATE_COMPLETE
        self.async_write_ha_state()
