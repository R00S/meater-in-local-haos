"""Constants for the Kitchen Cooking Engine integration.

Last Updated: 2 Dec 2025, 08:30 CET
Last Change: v0.1.1.11 - Frontend data generated at install/update time
"""

DOMAIN = "kitchen_cooking_engine"

# Panel version - This is updated automatically by generate_frontend_data.py
# when the integration is installed/updated. Do not edit manually.
PANEL_VERSION = "27"

# Configuration keys
CONF_TEMPERATURE_SENSOR = "temperature_sensor"
CONF_AMBIENT_SENSOR = "ambient_sensor"
CONF_TEMPERATURE_UNIT = "temperature_unit"

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
ATTR_PROGRESS = "progress"
ATTR_ETA_MINUTES = "eta_minutes"
ATTR_CARRYOVER_TEMP = "carryover_temp"
ATTR_REST_TIME_MINUTES = "rest_time_minutes"
ATTR_USDA_SAFE = "usda_safe"
ATTR_COOKING_METHOD = "cooking_method"
ATTR_SESSION_START = "session_start"
ATTR_NOTES = "notes"

# Service names
SERVICE_START_COOK = "start_cook"
SERVICE_STOP_COOK = "stop_cook"
SERVICE_SET_TARGET = "set_target"
SERVICE_START_REST = "start_rest"
SERVICE_COMPLETE = "complete_session"

# Event names
EVENT_APPROACHING_TARGET = "kitchen_cooking_engine_approaching_target"
EVENT_GOAL_REACHED = "kitchen_cooking_engine_goal_reached"
EVENT_REST_COMPLETE = "kitchen_cooking_engine_rest_complete"

# Default values
DEFAULT_APPROACHING_THRESHOLD = 90  # Notify when 90% to target
DEFAULT_REST_ALERT_MINUTES = 1  # Alert 1 minute before rest complete
