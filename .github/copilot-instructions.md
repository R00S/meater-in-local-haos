# MEATER BLE Proxy - Copilot Instructions

## Project Overview

This is an ESPHome configuration for an ESP32 device that acts as a BLE proxy between a MEATER+ temperature probe and both Home Assistant and the MEATER phone app simultaneously. The MEATER+ device only allows one BLE connection at a time, so this proxy enables dual connectivity by:

1. Acting as a BLE client to connect to the real MEATER+ device
2. Acting as a BLE server that emulates a MEATER device for phone apps
3. Forwarding all temperature, battery, and firmware data bidirectionally

## Technology Stack

- **ESPHome**: YAML-based configuration framework for ESP32/ESP8266 devices
- **ESP32**: Microcontroller with BLE capabilities (specifically ESP32-C3-DevKitM-1)
- **ESP-IDF**: ESP32 development framework (used instead of Arduino)
- **BLE (Bluetooth Low Energy)**: For communication with MEATER device and phone apps
- **C++**: Custom BLE server implementation in header file
- **Home Assistant**: Integration for smart home monitoring

## Key Files and Their Purposes

### Configuration Files

- **`meater.yaml`**: Main ESPHome configuration file
  - Defines ESP32 board and framework settings
  - Configures WiFi, API, and OTA update settings
  - Sets up BLE client to connect to MEATER device
  - Defines sensors for temperature, battery, and RSSI
  - Contains lambda functions to forward data to BLE server
  - Uses secrets for sensitive data (WiFi credentials, MAC address, etc.)

- **`secrets.yaml.example`**: Template for user secrets
  - Shows structure of required secrets without exposing actual values
  - Users copy this to `secrets.yaml` and fill in their specific values

- **`secrets.yaml`**: User's actual secrets (gitignored, never committed)
  - WiFi SSID and password
  - API encryption key
  - OTA password
  - MEATER device MAC address
  - Fallback AP credentials

### Code Files

- **`includes/meater_ble_server.h`**: Custom C++ BLE server implementation
  - Implements GATT server using ESP32 BLE APIs
  - Emulates MEATER+ device services and characteristics
  - Handles BLE connections, reads, writes, and notifications
  - Forwards temperature and battery data to connected phone apps
  - Uses ESP32-IDF BLE stack directly (not Arduino BLE library)

### Documentation

- **`README.md`**: Comprehensive user documentation
  - Hardware requirements and compatibility
  - Setup instructions
  - Configuration guide
  - Troubleshooting section
  - Technical details about BLE services

## MEATER BLE Protocol

The MEATER device exposes these BLE services and characteristics:

### MEATER Service (`a75cc7fc-c956-488f-ac2a-2dbc08b63a04`)
- **Temperature Characteristic** (`7edda774-045e-4bbf-909b-45d1991a2876`): 
  - 8-byte payload with raw temperature data
  - Includes tip temp, ambient temp, and calculation parameters
  - Supports read and notify operations
  
- **Battery Characteristic** (`2adb4877-68d8-4884-bd3c-d83853bf27b8`):
  - 2-byte payload for battery level
  - Supports read and notify operations

### Device Information Service (`180A`)
- **Firmware Revision** (`00002a26-0000-1000-8000-00805f9b34fb`):
  - String value with firmware version
  - Read-only

## Development Guidelines

### Making Changes to BLE Implementation

- The BLE server code in `includes/meater_ble_server.h` uses ESP-IDF APIs directly
- UUIDs must be in reverse byte order for ESP32 (compared to standard UUID format)
- All BLE operations are asynchronous with callback-based event handling
- Logging uses ESP-IDF macros: `ESP_LOGI`, `ESP_LOGD`, `ESP_LOGE`

### ESPHome Configuration Changes

- Always use secrets for sensitive data: `!secret secret_name`
- Lambda functions must capture IDs properly: `id(sensor_name)`
- BLE client sensors use characteristic UUIDs to subscribe to notifications
- Data forwarding happens in lambda functions within sensor definitions

### Testing and Validation

- **No automated tests**: This is an embedded hardware project
- **Testing requires physical hardware**: ESP32 board and MEATER probe
- **Testing workflow**:
  1. Make configuration changes
  2. Compile with: `esphome compile meater.yaml`
  3. Flash to ESP32: `esphome run meater.yaml`
  4. Monitor logs: `esphome logs meater.yaml`
  5. Test with real MEATER device and phone app

### Build and Deployment

- **Build**: ESPHome compiles YAML + C++ to ESP32 firmware
- **Flash**: Initial flash via USB, subsequent updates via OTA (Over-The-Air)
- **Dependencies**: Managed automatically by ESPHome (ESP-IDF, BLE libraries)
- **Build artifacts**: Created in `.esphome/` and `build/` (gitignored)

## Common Tasks

### Adding New Sensors
1. Add sensor definition in `meater.yaml` under appropriate platform
2. Use `ble_client` platform for reading from MEATER device
3. Add lambda to forward data to BLE server if needed
4. Test with physical hardware

### Modifying BLE Server Behavior
1. Edit `includes/meater_ble_server.h`
2. Consider event-driven architecture (callbacks)
3. Update characteristic values and trigger notifications
4. Rebuild and reflash to test

### Adding New Secrets
1. Update `secrets.yaml.example` with placeholder
2. Update documentation in README.md
3. Add usage in `meater.yaml` with `!secret` syntax

## Important Constraints

- **Memory limits**: ESP32-C3 has 4MB flash, code uses ~1.5-2MB
- **BLE connections**: Configured for max 4 simultaneous connections
- **Range**: BLE range typically 10-30 meters depending on environment
- **Power**: ESP32 must be continuously powered (not battery operated)
- **Real-time**: BLE notifications are near real-time but not deterministic

## Security Considerations

- Never commit `secrets.yaml` (it's gitignored)
- API encryption key required for Home Assistant connection
- OTA password protects firmware updates
- Fallback AP password for emergency WiFi access
- BLE communication is not encrypted (standard MEATER limitation)

## When Helping with Code Changes

1. **Preserve existing functionality**: This is working code, make minimal changes
2. **Test considerations**: Remember this requires physical hardware to test
3. **Documentation**: Update README.md if user-facing changes are made
4. **Secrets**: Never expose or commit actual secret values
5. **ESPHome patterns**: Follow existing patterns for sensors and lambdas
6. **BLE protocol**: Respect MEATER's existing BLE protocol structure
7. **ESP32-specific**: Use ESP-IDF APIs, not Arduino APIs for BLE
