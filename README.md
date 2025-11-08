# MEATER BLE Proxy for Home Assistant

This ESPHome configuration allows an ESP32 to act as a proxy between a MEATER+ temperature probe and both Home Assistant and the MEATER phone app simultaneously.

## Problem

The MEATER+ device only allows one BLE connection at a time. Normally, you have to choose between:
- Connecting the MEATER to Home Assistant via ESP32 (loses phone app functionality)
- Connecting the MEATER to phone app (loses Home Assistant integration)

## Solution

This configuration makes the ESP32 do double duty:

1. **BLE Client**: Connects to the real MEATER+ device and reads temperature/battery data
2. **BLE Server**: Pretends to be a MEATER+ device that the phone app can connect to
3. **Data Forwarder**: Forwards all data from the real MEATER to both Home Assistant and any connected phone

## How It Works

```
Real MEATER+ 
    ↓ (BLE connection)
ESP32 with this config
    ↓                    ↓
Home Assistant      Phone App
(existing sensors)   (connects to ESP32 as if it were the MEATER)
```

## Configuration

### Hardware Required
- ESP32 board (tested with ESP32-C3-DevKitM-1)
- MEATER+ temperature probe

### Memory Requirements

**Will it fit on my ESP32?** Yes! ✅

The ESP32-C3-DevKitM-1 has **4MB flash memory**, which is more than sufficient for this configuration:

- **Code size**: The BLE server implementation adds approximately ~12KB of source code
- **Compiled size**: ESPHome with ESP-IDF and BLE client+server typically uses 1.5-2MB of flash
- **Available space**: You'll have plenty of room (2+ MB remaining) for OTA updates and additional features

**Compatible boards**:
- ✅ ESP32-C3-DevKitM-1 (4MB flash) - Recommended
- ✅ ESP32-DevKitC (4MB+ flash)
- ✅ ESP32-WROOM-32 (4MB+ flash)
- ⚠️ ESP32-C3-01M (2MB flash) - May be tight, not recommended
- ❌ ESP8266 - Not compatible (no BLE support)

The additional BLE server functionality adds minimal overhead since the ESP32 already has BLE hardware and the ESP-IDF framework includes the necessary BLE stack.

### Finding Your MEATER MAC Address

Before setup, you need to find your MEATER+ device's Bluetooth MAC address. You can do this several ways:

1. **Using a BLE scanner app on your phone**:
   - Android: "nRF Connect" or "BLE Scanner"
   - iOS: "LightBlue" or "nRF Connect"
   - Look for a device named "MEATER" or similar
   - Note the MAC address (format: XX:XX:XX:XX:XX:XX)

2. **Using ESPHome logs**:
   - Flash a basic ESP32 with BLE scanning enabled
   - Check logs for nearby BLE devices

### Setup

1. Update the `mac_address` in `meater.yaml` to match your MEATER+ device:
   ```yaml
   ble_client:
     - mac_address: B8:1F:5E:44:EC:8D  # Replace with your MEATER's MAC address
       id: meater
   ```

2. Update WiFi credentials:
   ```yaml
   wifi:
     ssid: "your-wifi-ssid"
     password: "your-wifi-password"
   ```

3. Update API encryption key and OTA password (or remove them for initial testing):
   ```yaml
   api:
     encryption:
       key: "your-new-key-here"  # Generate a new key with: esphome config meater.yaml
   
   ota:
     - platform: esphome
       password: "your-ota-password"
   ```

4. Flash the ESP32 with ESPHome using this configuration:
   ```bash
   esphome run meater.yaml
   ```

5. Once the ESP32 is running:
   - The ESP32 will connect to your real MEATER+ device
   - It will start advertising as "MEATER" via BLE
   - In your phone's MEATER app, scan for devices
   - Connect to "MEATER" (which is actually the ESP32)
   - The app should work normally, receiving data forwarded from the real MEATER+

### Important Notes

- The real MEATER+ must be powered on and within BLE range of the ESP32
- The ESP32 must be connected to WiFi for Home Assistant integration
- Phone app connects to the ESP32 via Bluetooth (no WiFi required on phone)
- Multiple phones can potentially connect if the ESP32 supports multiple BLE connections

## Features

### Preserved Functionality (from original config)
- ✅ MEATER tip temperature sensor in Home Assistant
- ✅ MEATER ambient temperature sensor in Home Assistant
- ✅ MEATER battery level sensor in Home Assistant
- ✅ MEATER firmware version in Home Assistant
- ✅ MEATER RSSI signal strength in Home Assistant
- ✅ Bluetooth proxy for other devices
- ✅ OTA updates
- ✅ WiFi connectivity with fallback AP

### New Functionality
- ✅ BLE server that advertises as a MEATER device
- ✅ Forwards temperature data to connected phone apps
- ✅ Forwards battery data to connected phone apps
- ✅ Forwards firmware version to connected phone apps
- ✅ Supports phone app connections while maintaining Home Assistant integration

## Technical Details

### BLE Services Implemented

**MEATER Service** (`a75cc7fc-c956-488f-ac2a-2dbc08b63a04`):
- Temperature Characteristic (`7edda774-045e-4bbf-909b-45d1991a2876`) - Read, Notify
- Battery Characteristic (`2adb4877-68d8-4884-bd3c-d83853bf27b8`) - Read, Notify

**Device Information Service** (`180A`):
- Firmware Revision Characteristic (`00002a26-0000-1000-8000-00805f9b34fb`) - Read

### Files

- `meater.yaml` - Main ESPHome configuration file
- `includes/meater_ble_server.h` - Custom C++ code for BLE server implementation

## Credits

Based on MEATER BLE protocol research from:
- https://github.com/nathanfaber/meaterble

## Troubleshooting

### Phone app can't find the ESP32
- Make sure the ESP32 is powered on and connected to WiFi
- Check the logs to ensure the BLE server started successfully
- Try restarting the MEATER app on your phone

### Home Assistant sensors not updating
- Verify the MAC address in the configuration matches your MEATER device
- Check that the MEATER is powered on and within range
- Review the ESP32 logs for connection errors

### Both phone and Home Assistant not working
- The MEATER might be too far away or have a low battery
- Check the ESP32 logs for BLE connection issues
- Try power cycling the MEATER and ESP32
