"""Constants for the Kitchen Cooking Engine integration.

Last Updated: 19 Feb 2026, 13:12 UTC
Last Change: v0.5.1.1 - AI Recipe Builder: fetch detail API before starting cook flow
"""

DOMAIN = "kitchen_cooking_engine"

# Panel version - This is updated automatically by generate_frontend_data.py
# when the integration is installed/updated. Do not edit manually.
PANEL_VERSION = "162"

# Configuration keys
CONF_TEMPERATURE_SENSOR = "temperature_sensor"
CONF_AMBIENT_SENSOR = "ambient_sensor"
CONF_BATTERY_SENSOR = "battery_sensor"
CONF_TEMPERATURE_UNIT = "temperature_unit"
CONF_INDICATOR_LIGHT = "indicator_light"
CONF_NOTIFY_SERVICE = "notify_service"
CONF_TTS_ENTITY = "tts_entity"
CONF_MEDIA_PLAYER = "media_player"
CONF_PERSISTENT_NOTIFICATIONS = "persistent_notifications"  # Enable/disable sidebar notifications

# Appliance device control configuration keys
CONF_POWER_OUTLET = "power_outlet"          # Switch/outlet entity to control power
CONF_START_BUTTON = "start_button"          # Button/switch entity to start cooking
CONF_AUTO_SHUTOFF = "auto_shutoff_enabled"  # Auto turn off when complete
CONF_AUTO_START = "auto_start_enabled"      # Enable remote start
CONF_AI_AGENT_ID = "ai_agent_id"            # OpenAI conversation agent ID for AI Recipe Builder

# Temperature units
TEMP_CELSIUS = "celsius"
TEMP_FAHRENHEIT = "fahrenheit"

# Cooking session states
STATE_IDLE = "idle"
STATE_SETUP = "setup"
STATE_COOKING = "cooking"
STATE_APPROACHING = "approaching"
STATE_GOAL_REACHED = "goal_reached"
STATE_RESTING = "resting"
STATE_COMPLETE = "complete"

# Temperature calculation constants
APPROACHING_THRESHOLD_C = 5  # Notify when within 5°C of target
FIVE_MIN_REMAINING_THRESHOLD = 5  # Notify when 5 minutes remaining
PROGRESS_START_OFFSET_C = 10  # Offset below min temp for progress calculation
MINUTES_PER_DEGREE_C = 2.5  # Rough ETA estimate (varies by cut/method)

# Attribute keys
ATTR_PROTEIN = "protein"
ATTR_CUT = "cut"
ATTR_CUT_DISPLAY = "cut_display"
ATTR_DONENESS = "doneness"
ATTR_TARGET_TEMP_C = "target_temp_c"
ATTR_TARGET_TEMP_F = "target_temp_f"
ATTR_MIN_TEMP_C = "min_temp_c"
ATTR_MIN_TEMP_F = "min_temp_f"
ATTR_MAX_TEMP_C = "max_temp_c"
ATTR_MAX_TEMP_F = "max_temp_f"
ATTR_CURRENT_TEMP = "current_temp"
ATTR_AMBIENT_TEMP = "ambient_temp"
ATTR_BATTERY_LEVEL = "battery_level"
ATTR_PROGRESS = "progress"
ATTR_ETA_MINUTES = "eta_minutes"
ATTR_CARRYOVER_TEMP = "carryover_temp"
ATTR_REST_TIME_MINUTES = "rest_time_minutes"
ATTR_REST_TIME_REMAINING = "rest_time_remaining"
ATTR_USDA_SAFE = "usda_safe"
ATTR_COOKING_METHOD = "cooking_method"
ATTR_SESSION_START = "session_start"
ATTR_REST_START = "rest_start"
ATTR_NOTES = "notes"
ATTR_TEMP_HISTORY = "temp_history"
ATTR_TIP_SENSOR = "tip_sensor"
ATTR_AMBIENT_SENSOR = "ambient_sensor"
# Phase 4: Multi-appliance session attributes
ATTR_ACTIVE_APPLIANCES = "active_appliances"
ATTR_PRIMARY_APPLIANCE = "primary_appliance"
ATTR_SECONDARY_APPLIANCES = "secondary_appliances"
ATTR_MULTI_COOK_SESSION_ID = "multi_cook_session_id"

# Service names
SERVICE_START_COOK = "start_cook"
SERVICE_STOP_COOK = "stop_cook"
SERVICE_SET_TARGET = "set_target"
SERVICE_START_REST = "start_rest"
SERVICE_COMPLETE = "complete_session"
SERVICE_SET_NOTES = "set_notes"
SERVICE_APPLIANCE_POWER_OFF = "appliance_power_off"
SERVICE_APPLIANCE_START = "appliance_start"
# Phase 4: Multi-appliance service
SERVICE_START_MULTI_APPLIANCE_COOK = "start_multi_appliance_cook"
# Simple probe service for temperature-only monitoring
SERVICE_START_SIMPLE_PROBE_COOK = "start_simple_probe_cook"

# Event names
EVENT_APPROACHING_TARGET = "kitchen_cooking_engine_approaching_target"
EVENT_GOAL_REACHED = "kitchen_cooking_engine_goal_reached"
EVENT_FIVE_MINUTES_REMAINING = "kitchen_cooking_engine_five_minutes_remaining"
EVENT_ETA_CHANGED = "kitchen_cooking_engine_eta_changed"
EVENT_REST_START = "kitchen_cooking_engine_rest_start"
EVENT_REST_COMPLETE = "kitchen_cooking_engine_rest_complete"
EVENT_COOK_STARTED = "kitchen_cooking_engine_cook_started"
EVENT_COOK_STOPPED = "kitchen_cooking_engine_cook_stopped"

# Default values
DEFAULT_APPROACHING_THRESHOLD = 90  # Notify when 90% to target
DEFAULT_REST_ALERT_MINUTES = 1  # Alert 1 minute before rest complete
