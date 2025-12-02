"""Sensor platform for Kitchen Cooking Engine.

Last Updated: 2 Dec 2025, 15:00 CET
Last Change: v0.1.2.5 - Added TTS announcements, rest light transition
"""

from __future__ import annotations

import asyncio
import logging
from datetime import datetime, timedelta
from typing import Any
from collections import deque

from homeassistant.components.sensor import SensorEntity
from homeassistant.config_entries import ConfigEntry
from homeassistant.core import HomeAssistant, callback
from homeassistant.helpers.device_registry import DeviceInfo
from homeassistant.helpers.entity_platform import AddEntitiesCallback
from homeassistant.helpers.event import async_track_state_change_event, async_track_time_interval
from homeassistant.util import dt as dt_util

from .const import (
    APPROACHING_THRESHOLD_C,
    ATTR_AMBIENT_TEMP,
    ATTR_BATTERY_LEVEL,
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
    ATTR_REST_TIME_REMAINING,
    ATTR_REST_START,
    ATTR_SESSION_START,
    ATTR_TARGET_TEMP_C,
    ATTR_TARGET_TEMP_F,
    ATTR_TEMP_HISTORY,
    ATTR_USDA_SAFE,
    CONF_AMBIENT_SENSOR,
    CONF_BATTERY_SENSOR,
    CONF_INDICATOR_LIGHT,
    CONF_MEDIA_PLAYER,
    CONF_NOTIFY_SERVICE,
    CONF_TEMPERATURE_SENSOR,
    CONF_TEMPERATURE_UNIT,
    CONF_TTS_ENTITY,
    DOMAIN,
    EVENT_APPROACHING_TARGET,
    EVENT_COOK_STARTED,
    EVENT_COOK_STOPPED,
    EVENT_ETA_CHANGED,
    EVENT_FIVE_MINUTES_REMAINING,
    EVENT_GOAL_REACHED,
    EVENT_REST_COMPLETE,
    EVENT_REST_START,
    FIVE_MIN_REMAINING_THRESHOLD,
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

# Temperature history settings
TEMP_HISTORY_MAX_SAMPLES = 60  # Store up to 60 samples
TEMP_HISTORY_INTERVAL_SECONDS = 30  # Sample every 30 seconds
MIN_RATE_CALC_TIME_MINUTES = 0.5  # Minimum time for reliable rate calculation
ETA_CHANGE_THRESHOLD_MINUTES = 2  # Fire event if ETA changes by this much

# Light color gradient from cold (blue) to hot (red)
# Uses RGB values for color temperature progression
LIGHT_COLOR_COLD = (66, 135, 245)    # Cold blue at room temp (23°C)
LIGHT_COLOR_WARM = (255, 165, 0)     # Warm orange (midpoint)
LIGHT_COLOR_HOT = (255, 0, 0)        # Deep red at target temp
LIGHT_COLOR_WHITE = (255, 255, 255)  # White for rest complete
LIGHT_START_TEMP_C = 23              # Temperature at which light starts (room temp)


async def async_setup_entry(
    hass: HomeAssistant,
    config_entry: ConfigEntry,
    async_add_entities: AddEntitiesCallback,
) -> None:
    """Set up the Kitchen Cooking Engine sensors."""
    temp_sensor = config_entry.data.get(CONF_TEMPERATURE_SENSOR)
    ambient_sensor = config_entry.data.get(CONF_AMBIENT_SENSOR)
    battery_sensor = config_entry.data.get(CONF_BATTERY_SENSOR)
    indicator_light = config_entry.data.get(CONF_INDICATOR_LIGHT)
    notify_service = config_entry.data.get(CONF_NOTIFY_SERVICE)
    tts_entity = config_entry.data.get(CONF_TTS_ENTITY)
    media_player = config_entry.data.get(CONF_MEDIA_PLAYER)
    temp_unit = config_entry.data.get(CONF_TEMPERATURE_UNIT, TEMP_CELSIUS)

    cooking_session = CookingSessionSensor(
        hass,
        config_entry.entry_id,
        temp_sensor,
        ambient_sensor,
        battery_sensor,
        indicator_light,
        notify_service,
        tts_entity,
        media_player,
        temp_unit,
    )
    
    entities = [cooking_session]

    # Store reference to the entity for service handlers
    # Ensure the data structure exists
    if DOMAIN not in hass.data:
        hass.data[DOMAIN] = {}
    if config_entry.entry_id not in hass.data[DOMAIN]:
        hass.data[DOMAIN][config_entry.entry_id] = {}
    if not isinstance(hass.data[DOMAIN][config_entry.entry_id], dict):
        hass.data[DOMAIN][config_entry.entry_id] = {}
    
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
        battery_sensor: str | None,
        indicator_light: str | None,
        notify_service: str | None,
        tts_entity: str | None,
        media_player: str | None,
        temp_unit: str,
    ) -> None:
        """Initialize the cooking session sensor."""
        self._hass = hass
        self._entry_id = entry_id
        self._temp_sensor = temp_sensor
        self._ambient_sensor = ambient_sensor
        self._battery_sensor = battery_sensor
        self._indicator_light = indicator_light
        self._notify_service = notify_service.strip() if notify_service else None
        self._tts_entity = tts_entity.strip() if tts_entity else None
        self._media_player = media_player.strip() if media_player else None
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
        self._battery_level: float | None = None
        self._session_start: datetime | None = None
        self._rest_start: datetime | None = None
        self._progress: float = 0.0
        self._rest_time_min: int = 0
        self._rest_time_max: int = 0
        self._usda_safe: bool = False
        self._carryover_temp_c: int = 0
        
        # Temperature history for ETA calculation
        self._temp_history: deque = deque(maxlen=TEMP_HISTORY_MAX_SAMPLES)
        self._last_eta: int | None = None
        self._five_min_alert_fired: bool = False
        
        # Timer for rest countdown
        self._rest_timer_unsub = None
        
        # Indicator light state (saved when cook starts)
        self._light_original_state: dict | None = None
        self._light_flash_task: asyncio.Task | None = None

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
            sw_version="0.1.2.5",
        )

    def _to_celsius(self, temp: float) -> float:
        """Convert temperature to Celsius if needed."""
        if self._temp_unit != TEMP_CELSIUS:
            return (temp - 32) * 5 / 9
        return temp

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
            ATTR_BATTERY_LEVEL: self._battery_level,
            ATTR_PROGRESS: round(self._progress, 1),
            ATTR_USDA_SAFE: self._usda_safe,
            ATTR_REST_TIME_MINUTES: f"{self._rest_time_min}-{self._rest_time_max}",
        }

        if self._session_start:
            attrs[ATTR_SESSION_START] = self._session_start.isoformat()

        if self._rest_start:
            attrs[ATTR_REST_START] = self._rest_start.isoformat()
            # Calculate remaining rest time
            rest_elapsed = (dt_util.utcnow() - self._rest_start).total_seconds() / 60
            rest_remaining = max(0, self._rest_time_min - rest_elapsed)
            attrs[ATTR_REST_TIME_REMAINING] = round(rest_remaining, 1)

        # Calculate ETA if cooking
        if self._state in (STATE_COOKING, STATE_APPROACHING) and self._current_temp and self._target_temp_c:
            eta = self._calculate_eta()
            if eta is not None:
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

        # Track battery sensor changes
        if self._battery_sensor:
            self.async_on_remove(
                async_track_state_change_event(
                    self._hass,
                    [self._battery_sensor],
                    self._async_battery_changed,
                )
            )

        # Get initial values
        await self._async_update_sensors()

    async def async_will_remove_from_hass(self) -> None:
        """Clean up when entity is removed."""
        if self._rest_timer_unsub:
            self._rest_timer_unsub()
            self._rest_timer_unsub = None

    @callback
    def _async_temp_changed(self, event) -> None:
        """Handle temperature sensor state changes."""
        new_state = event.data.get("new_state")
        if new_state is None or new_state.state in ("unknown", "unavailable"):
            return

        try:
            new_temp = float(new_state.state)
            self._current_temp = new_temp
            
            # Record temperature history for ETA calculation
            if self._state in (STATE_COOKING, STATE_APPROACHING):
                self._temp_history.append({
                    "time": datetime.now(),
                    "temp": new_temp,
                })
            
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

    @callback
    def _async_battery_changed(self, event) -> None:
        """Handle battery sensor state changes."""
        new_state = event.data.get("new_state")
        if new_state is None or new_state.state in ("unknown", "unavailable"):
            return

        try:
            self._battery_level = float(new_state.state)
            self.async_write_ha_state()
        except ValueError:
            _LOGGER.warning("Invalid battery level: %s", new_state.state)

    async def _async_update_sensors(self) -> None:
        """Update values from all configured sensors."""
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

        if self._battery_sensor:
            state = self._hass.states.get(self._battery_sensor)
            if state and state.state not in ("unknown", "unavailable"):
                try:
                    self._battery_level = float(state.state)
                except ValueError:
                    pass

    def _update_cooking_state(self) -> None:
        """Update cooking state based on current temperature."""
        if self._state == STATE_IDLE or not self._target_temp_c:
            return

        if self._current_temp is None:
            return

        # Convert to Celsius for comparison
        current_c = self._to_celsius(self._current_temp)

        # Calculate progress (0-100%)
        if self._min_temp_c and self._target_temp_c:
            start_temp = min(current_c, self._min_temp_c - PROGRESS_START_OFFSET_C)
            temp_range = self._target_temp_c - start_temp
            if temp_range > 0:
                self._progress = min(
                    100.0, max(0.0, (current_c - start_temp) / temp_range * 100)
                )
        
        # Update indicator light color based on temperature
        if self._indicator_light and self._state in (STATE_COOKING, STATE_APPROACHING):
            self._hass.async_create_task(self._update_indicator_light())

        # Check for 5-minute remaining alert and ETA changes
        if self._state == STATE_COOKING:
            eta = self._calculate_eta()
            if eta is not None:
                # Check for significant ETA change (fire event directly to avoid recursion)
                if self._last_eta is not None and abs(eta - self._last_eta) > ETA_CHANGE_THRESHOLD_MINUTES:
                    self._hass.bus.async_fire(EVENT_ETA_CHANGED, {
                        "entity_id": self.entity_id,
                        "previous_eta": self._last_eta,
                        "new_eta": eta,
                    })
                    _LOGGER.debug("ETA changed from %d to %d minutes", self._last_eta, eta)
                self._last_eta = eta
                
                # Check for 5-minute remaining alert
                if not self._five_min_alert_fired and eta <= FIVE_MIN_REMAINING_THRESHOLD and eta > 0:
                    self._five_min_alert_fired = True
                    self._fire_event(EVENT_FIVE_MINUTES_REMAINING)
                    _LOGGER.info(
                        "5 minutes remaining for %s - ETA: %d minutes",
                        self._cut_display,
                        eta,
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
                # Start flashing the light to indicate user action needed
                if self._indicator_light:
                    self._hass.async_create_task(self._start_light_flash())
                _LOGGER.info(
                    "Goal reached: %s at %.1f°C - Time to rest!",
                    self._cut_display,
                    current_c,
                )
        elif self._state == STATE_RESTING:
            # Resting state is managed by service calls and timer
            pass

    def _fire_event(self, event_type: str, extra_data: dict | None = None) -> None:
        """Fire an event with current cooking session data and send notifications."""
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
            "ambient_temp": self._ambient_temp,
            "battery_level": self._battery_level,
            "progress": round(self._progress, 1),
            "rest_time_min": self._rest_time_min,
            "rest_time_max": self._rest_time_max,
        }
        
        # Add ETA if available
        eta = self._calculate_eta()
        if eta is not None:
            event_data["eta_minutes"] = eta
            
        # Merge any extra data
        if extra_data:
            event_data.update(extra_data)
            
        self._hass.bus.async_fire(event_type, event_data)
        _LOGGER.debug("Fired event %s with data: %s", event_type, event_data)
        
        # Send Home Assistant notifications for important events
        self._send_notification(event_type, event_data)

    def _send_notification(self, event_type: str, event_data: dict) -> None:
        """Send notifications for cooking events via persistent_notification, mobile app, and TTS."""
        cut_display = event_data.get('cut_display', 'Your food')
        target_temp = event_data.get('target_temp_c', '')
        
        notification_map = {
            EVENT_APPROACHING_TARGET: {
                "title": "🔥 Almost There!",
                "message": f"{cut_display} is approaching target temperature ({target_temp}°C)",
                "tts_message": f"Attention! Your {cut_display} is approaching the target temperature of {target_temp} degrees.",
                "notification_id": f"cooking_approaching_{self.entity_id}",
            },
            EVENT_FIVE_MINUTES_REMAINING: {
                "title": "⏰ 5 Minutes Remaining!",
                "message": f"{cut_display} will reach target in about 5 minutes",
                "tts_message": f"5 minutes remaining! Your {cut_display} will be done in about 5 minutes.",
                "notification_id": f"cooking_5min_{self.entity_id}",
            },
            EVENT_GOAL_REACHED: {
                "title": "✅ Target Reached!",
                "message": f"{cut_display} has reached {target_temp}°C - Time to rest!",
                "tts_message": f"Target reached! Your {cut_display} has reached {target_temp} degrees. Time to let it rest.",
                "notification_id": f"cooking_goal_{self.entity_id}",
            },
            EVENT_REST_COMPLETE: {
                "title": "🍽️ Ready to Serve!",
                "message": f"{cut_display} has finished resting and is ready to serve!",
                "tts_message": f"Ready to serve! Your {cut_display} has finished resting and is ready to eat.",
                "notification_id": f"cooking_complete_{self.entity_id}",
            },
        }
        
        notification = notification_map.get(event_type)
        if notification:
            # Create persistent notification in Home Assistant UI
            self._hass.async_create_task(
                self._hass.services.async_call(
                    "persistent_notification",
                    "create",
                    {
                        "title": notification["title"],
                        "message": notification["message"],
                        "notification_id": notification["notification_id"],
                    },
                )
            )
            
            # Send push notification to mobile app if configured
            if self._notify_service:
                self._hass.async_create_task(
                    self._hass.services.async_call(
                        "notify",
                        self._notify_service,
                        {
                            "title": notification["title"],
                            "message": notification["message"],
                            "data": {
                                "tag": notification["notification_id"],
                                "importance": "high",
                                "channel": "cooking_alerts",
                            },
                        },
                    )
                )
                _LOGGER.debug("Sent mobile notification: %s", notification["title"])
            
            # Send TTS announcement if configured
            if self._tts_entity and self._media_player:
                self._hass.async_create_task(
                    self._hass.services.async_call(
                        "tts",
                        "speak",
                        {
                            "entity_id": self._tts_entity,
                            "media_player_entity_id": self._media_player,
                            "message": notification["tts_message"],
                            "cache": True,
                        },
                    )
                )
                _LOGGER.debug("Sent TTS announcement: %s", notification["tts_message"])
            
            _LOGGER.debug("Sent notification: %s", notification["title"])

    # ---- Indicator Light Control Methods ----
    
    async def _save_light_state(self) -> None:
        """Save the current state of the indicator light before taking control."""
        if not self._indicator_light:
            return
            
        light_state = self._hass.states.get(self._indicator_light)
        if light_state:
            self._light_original_state = {
                "state": light_state.state,
                "brightness": light_state.attributes.get("brightness"),
                "rgb_color": light_state.attributes.get("rgb_color"),
                "hs_color": light_state.attributes.get("hs_color"),
                "color_temp": light_state.attributes.get("color_temp"),
            }
            _LOGGER.debug("Saved light state: %s", self._light_original_state)
    
    async def _restore_light_state(self) -> None:
        """Restore the indicator light to its original state."""
        if not self._indicator_light or not self._light_original_state:
            return
        
        # Stop any flashing
        await self._stop_light_flash()
        
        try:
            if self._light_original_state["state"] == "off":
                await self._hass.services.async_call(
                    "light", "turn_off",
                    {"entity_id": self._indicator_light}
                )
            else:
                service_data = {"entity_id": self._indicator_light}
                if self._light_original_state.get("brightness"):
                    service_data["brightness"] = self._light_original_state["brightness"]
                if self._light_original_state.get("rgb_color"):
                    service_data["rgb_color"] = self._light_original_state["rgb_color"]
                elif self._light_original_state.get("hs_color"):
                    service_data["hs_color"] = self._light_original_state["hs_color"]
                elif self._light_original_state.get("color_temp"):
                    service_data["color_temp"] = self._light_original_state["color_temp"]
                    
                await self._hass.services.async_call("light", "turn_on", service_data)
                
            _LOGGER.debug("Restored light to original state")
        except Exception as e:
            _LOGGER.warning("Failed to restore light state: %s", e)
        
        self._light_original_state = None
    
    def _calculate_temp_color(self, current_temp_c: float, target_temp_c: float) -> tuple[int, int, int]:
        """Calculate RGB color based on temperature.
        
        Transitions from cold blue (23°C) -> warm orange (midpoint) -> deep red (target).
        """
        if current_temp_c is None or target_temp_c is None:
            return LIGHT_COLOR_COLD
        
        # Calculate progress from 23°C to target
        temp_range = target_temp_c - LIGHT_START_TEMP_C
        if temp_range <= 0:
            return LIGHT_COLOR_HOT
        
        current_progress = (current_temp_c - LIGHT_START_TEMP_C) / temp_range
        current_progress = max(0, min(1, current_progress))  # Clamp 0-1
        
        if current_progress <= 0.5:
            # Transition from blue to orange (0-50%)
            t = current_progress / 0.5
            r = int(LIGHT_COLOR_COLD[0] + (LIGHT_COLOR_WARM[0] - LIGHT_COLOR_COLD[0]) * t)
            g = int(LIGHT_COLOR_COLD[1] + (LIGHT_COLOR_WARM[1] - LIGHT_COLOR_COLD[1]) * t)
            b = int(LIGHT_COLOR_COLD[2] + (LIGHT_COLOR_WARM[2] - LIGHT_COLOR_COLD[2]) * t)
        else:
            # Transition from orange to deep red (50-100%)
            t = (current_progress - 0.5) / 0.5
            r = int(LIGHT_COLOR_WARM[0] + (LIGHT_COLOR_HOT[0] - LIGHT_COLOR_WARM[0]) * t)
            g = int(LIGHT_COLOR_WARM[1] + (LIGHT_COLOR_HOT[1] - LIGHT_COLOR_WARM[1]) * t)
            b = int(LIGHT_COLOR_WARM[2] + (LIGHT_COLOR_HOT[2] - LIGHT_COLOR_WARM[2]) * t)
        
        return (r, g, b)
    
    async def _update_indicator_light(self) -> None:
        """Update the indicator light color based on current temperature."""
        if not self._indicator_light:
            return
        
        # Only update during active cooking states
        if self._state not in (STATE_COOKING, STATE_APPROACHING):
            return
        
        if not self._current_temp or not self._target_temp_c:
            return
        
        current_c = self._to_celsius(self._current_temp)
        rgb_color = self._calculate_temp_color(current_c, self._target_temp_c)
        
        try:
            await self._hass.services.async_call(
                "light", "turn_on",
                {
                    "entity_id": self._indicator_light,
                    "rgb_color": list(rgb_color),
                    "brightness": 255,
                }
            )
        except Exception as e:
            _LOGGER.warning("Failed to update indicator light: %s", e)
    
    async def _update_rest_light_color(self, rest_elapsed: float, rest_total: float) -> None:
        """Update indicator light during rest phase (red → white transition)."""
        if not self._indicator_light or rest_total <= 0:
            return
        
        # Calculate progress through rest period (0 = start, 1 = complete)
        progress = min(1.0, rest_elapsed / rest_total)
        
        # Interpolate from hot red to white
        r = int(LIGHT_COLOR_HOT[0] + (LIGHT_COLOR_WHITE[0] - LIGHT_COLOR_HOT[0]) * progress)
        g = int(LIGHT_COLOR_HOT[1] + (LIGHT_COLOR_WHITE[1] - LIGHT_COLOR_HOT[1]) * progress)
        b = int(LIGHT_COLOR_HOT[2] + (LIGHT_COLOR_WHITE[2] - LIGHT_COLOR_HOT[2]) * progress)
        
        try:
            await self._hass.services.async_call(
                "light", "turn_on",
                {
                    "entity_id": self._indicator_light,
                    "rgb_color": [r, g, b],
                    "brightness": 255,
                }
            )
        except Exception as e:
            _LOGGER.warning("Failed to update rest light color: %s", e)
    
    async def _start_light_flash(self) -> None:
        """Start flashing the indicator light (for goal reached, rest complete)."""
        if not self._indicator_light:
            return
        
        # Cancel existing flash task
        await self._stop_light_flash()
        
        async def flash_loop():
            """Flash the light on and off."""
            flash_on = True
            try:
                while True:
                    if flash_on:
                        await self._hass.services.async_call(
                            "light", "turn_on",
                            {
                                "entity_id": self._indicator_light,
                                "rgb_color": [0, 255, 0],  # Green for success
                                "brightness": 255,
                            }
                        )
                    else:
                        await self._hass.services.async_call(
                            "light", "turn_on",
                            {
                                "entity_id": self._indicator_light,
                                "brightness": 50,
                            }
                        )
                    flash_on = not flash_on
                    await asyncio.sleep(0.5)
            except asyncio.CancelledError:
                pass
            except Exception as e:
                _LOGGER.warning("Flash loop error: %s", e)
        
        self._light_flash_task = self._hass.async_create_task(flash_loop())
        _LOGGER.debug("Started light flashing")
    
    async def _stop_light_flash(self) -> None:
        """Stop the flashing indicator light."""
        if self._light_flash_task:
            self._light_flash_task.cancel()
            try:
                await self._light_flash_task
            except asyncio.CancelledError:
                pass
            self._light_flash_task = None
            _LOGGER.debug("Stopped light flashing")

    def _calculate_eta(self) -> int | None:
        """Estimate time to reach target temperature.

        Uses temperature history to calculate rise rate for better estimates.
        Falls back to simple calculation if insufficient history.
        """
        if not self._current_temp or not self._target_temp_c:
            return None

        current_c = self._to_celsius(self._current_temp)

        temp_diff = self._target_temp_c - current_c
        if temp_diff <= 0:
            return 0

        # Try to calculate from temperature history
        if len(self._temp_history) >= 3:
            # Get readings from the last 5 minutes for rate calculation
            now = datetime.now()
            recent_samples = [
                s for s in self._temp_history
                if (now - s["time"]).total_seconds() <= 300  # Last 5 minutes
            ]
            
            if len(recent_samples) >= 2:
                # Calculate temperature rise rate (°C per minute)
                first = recent_samples[0]
                last = recent_samples[-1]
                
                first_temp_c = self._to_celsius(first["temp"])
                last_temp_c = self._to_celsius(last["temp"])
                
                temp_change = last_temp_c - first_temp_c
                time_diff_minutes = (last["time"] - first["time"]).total_seconds() / 60
                
                if time_diff_minutes > MIN_RATE_CALC_TIME_MINUTES and temp_change > 0:
                    rise_rate = temp_change / time_diff_minutes  # °C per minute
                    eta = int(temp_diff / rise_rate)
                    return max(0, eta)

        # Fall back to simple estimate based on typical cooking rates
        eta = int(temp_diff * MINUTES_PER_DEGREE_C)
        return eta

    @callback
    def _async_rest_timer_tick(self, now: datetime) -> None:
        """Handle rest timer tick - check if rest is complete."""
        if self._state != STATE_RESTING or self._rest_start is None:
            return
            
        rest_elapsed = (now - self._rest_start).total_seconds() / 60
        
        # Update indicator light color during rest (red → white transition)
        if self._indicator_light and self._rest_time_min > 0:
            self._hass.async_create_task(
                self._update_rest_light_color(rest_elapsed, self._rest_time_min)
            )
        
        # Check if rest time is complete (using minimum rest time)
        if rest_elapsed >= self._rest_time_min:
            self._fire_event(EVENT_REST_COMPLETE)
            # Start flashing the light to indicate food is ready
            if self._indicator_light:
                self._hass.async_create_task(self._start_light_flash())
            _LOGGER.info(
                "Rest complete for %s after %.1f minutes",
                self._cut_display,
                rest_elapsed,
            )
            # Don't auto-complete, let user manually complete when ready
            
        self.async_write_ha_state()

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
        self._rest_start = None
        self._state = STATE_COOKING
        self._progress = 0.0
        self._temp_history.clear()
        self._last_eta = None
        self._five_min_alert_fired = False
        
        # Save indicator light state and take control
        if self._indicator_light:
            self._hass.async_create_task(self._save_light_state())
            self._hass.async_create_task(self._update_indicator_light())
        
        # Fire cook started event
        self._fire_event(EVENT_COOK_STARTED)
        
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
        
        # Fire event before resetting state
        self._fire_event(EVENT_COOK_STOPPED)
        
        # Restore indicator light to original state
        if self._indicator_light:
            self._hass.async_create_task(self._restore_light_state())
        
        self._state = STATE_IDLE
        self._progress = 0.0
        self._temp_history.clear()
        self._last_eta = None
        self._five_min_alert_fired = False
        
        # Cancel rest timer if running
        if self._rest_timer_unsub:
            self._rest_timer_unsub()
            self._rest_timer_unsub = None
            
        self.async_write_ha_state()

    def start_rest(self) -> None:
        """Start the resting phase."""
        _LOGGER.info(
            "Started rest phase - Rest time: %d-%d minutes",
            self._rest_time_min,
            self._rest_time_max,
        )
        self._state = STATE_RESTING
        self._rest_start = dt_util.utcnow()
        
        # Stop flashing (user acknowledged goal reached)
        if self._indicator_light:
            self._hass.async_create_task(self._stop_light_flash())
        
        # Fire rest started event
        self._fire_event(EVENT_REST_START)
        
        # Start timer to track rest time
        self._rest_timer_unsub = async_track_time_interval(
            self._hass,
            self._async_rest_timer_tick,
            timedelta(seconds=30),  # Check every 30 seconds
        )
        
        self.async_write_ha_state()

    def complete_session(self) -> None:
        """Mark session as complete."""
        _LOGGER.info("Cooking session completed")
        self._state = STATE_COMPLETE
        
        # Restore indicator light to original state
        if self._indicator_light:
            self._hass.async_create_task(self._restore_light_state())
        
        # Cancel rest timer if running
        if self._rest_timer_unsub:
            self._rest_timer_unsub()
            self._rest_timer_unsub = None
            
        self.async_write_ha_state()
