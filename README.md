# MEATER BLE Proxy for Home Assistant

This ESPHome configuration allows an ESP32 to act as a proxy between a MEATER Block and both Home Assistant and the MEATER phone app simultaneously.

> **📝 Note for Home Assistant GUI Users**: This configuration requires adding a custom C++ include file. See the detailed [setup instructions below](#setup) for how to add this file through the File Editor add-on. If you prefer a simpler setup process, you can use the ESPHome command line interface instead.

## Problem

The MEATER Block only allows one BLE connection at a time. Normally, you have to choose between:
- Connecting the MEATER Block to Home Assistant via ESP32 (loses phone app functionality)
- Connecting the MEATER Block to phone app (loses Home Assistant integration)

## Solution

This configuration makes the ESP32 do triple duty:

1. **BLE Client**: Connects to the MEATER Block (which connects to the probe) and reads temperature/battery/device info
2. **BLE Server**: Emulates the same MEATER variant (MEATER, MEATER+, MEATER 2, etc.) for the phone app
3. **Data Forwarder**: Forwards all data from the MEATER Block to both Home Assistant and any connected phone

### Device Variant Detection

The ESP32 automatically detects which MEATER variant you have:
- Reads the device name from the MEATER Block (e.g., "MEATER+", "MEATER 2")
- Advertises itself with the same name so the phone app recognizes the correct model
- Works with all MEATER variants: MEATER, MEATER+, MEATER 2, MEATER 2+, etc.

## How It Works

```
MEATER Probe
    ↓ (proprietary connection)
MEATER Block (advertises as "MEATER+", etc.)
    ↓ (BLE connection - reads device name, temp, battery)
ESP32 with this config (advertises as detected variant)
    ↓                    ↓
Home Assistant      Phone App
(existing sensors)   (connects to ESP32 as if it were the MEATER Block)
```

## Security & Secrets

This configuration uses ESPHome's secrets management to keep your sensitive information secure:

- **secrets.yaml**: Contains all your personal credentials (WiFi password, API keys, MAC address, etc.)
- **secrets.yaml.example**: A template file showing what values you need to configure
- The actual `secrets.yaml` file is gitignored and never committed to version control

This approach ensures that:
- Your credentials stay private when sharing or version controlling your config
- You can easily update credentials without modifying the main configuration file
- Multiple ESPHome devices can share the same secrets file

## Configuration

### Hardware Required
- **ESP32-C6 board** (recommended: ESP32-C6-DevKitC-1) - Required for stable operation
- MEATER Block (WiFi bridge device that connects to MEATER probes)

### Memory Requirements

**Why ESP32-C6?** 

This project requires running both BLE client and BLE server simultaneously along with WiFi and Home Assistant connectivity. The ESP32-C6 is the recommended choice because:

- **More RAM**: 512KB vs 400KB on ESP32-C3
- **Better BLE stack**: Improved BLE 5.3 with better coexistence between client/server modes
- **Stable operation**: Handles concurrent BLE operations without crashes
- **Flash memory**: 4MB+ is sufficient for all features with room for OTA updates

**Compatible boards**:
- ✅ **ESP32-C6-DevKitC-1** (4MB flash) - **Recommended** - Best stability and performance
- ✅ ESP32-DevKitC (4MB+ flash, dual-core) - Also good choice
- ✅ ESP32-WROOM-32 (4MB+ flash, dual-core) - Also good choice
- ⚠️ ESP32-C3-DevKitM-1 (4MB flash) - May experience crashes due to limited RAM
- ❌ ESP8266 - Not compatible (no BLE support)
- ❌ Raspberry Pi Pico W - Not compatible (ESPHome requires ESP32/ESP8266)

The ESP32-C6 provides the best balance of cost, power efficiency, and stable operation for this dual-BLE-mode application.

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

There are two ways to set this up, depending on whether you're using the ESPHome command line or the Home Assistant GUI:

#### Option A: Using ESPHome Command Line (Recommended for First-Time Setup)

1. **Create your secrets file**:
   
   Copy the example secrets file and fill in your actual values:
   ```bash
   cp secrets.yaml.example secrets.yaml
   ```
   
   Edit `secrets.yaml` with your specific values:
   - WiFi SSID and password
   - API encryption key (generate with: `esphome config meater.yaml`)
   - OTA password
   - MEATER device MAC address (see "Finding Your MEATER MAC Address" above)
   - Fallback AP password

2. Flash the ESP32 with ESPHome using this configuration:
   ```bash
   esphome run meater.yaml
   ```

3. Once the ESP32 is running:
   - The ESP32 will connect to your real MEATER+ device
   - It will start advertising as "MEATER" via BLE
   - In your phone's MEATER app, scan for devices
   - Connect to "MEATER" (which is actually the ESP32)
   - The app should work normally, receiving data forwarded from the real MEATER+

#### Option B: Using Home Assistant ESPHome GUI

If you're using the ESPHome integration in Home Assistant, you'll need to manually add the include file since the GUI doesn't provide a way to manage external files directly. This requires using the File Editor add-on.

**Quick Overview**: You'll need to add 3 files:
1. The configuration (`meater.yaml`) in ESPHome dashboard
2. Your secrets (`secrets.yaml`) with WiFi/passwords via File Editor
3. The C++ include file (`includes/meater_ble_server.h`) via File Editor

**Detailed Steps**:

1. **Add the configuration file**:
   - In Home Assistant, go to **ESPHome** dashboard
   - Click **+ NEW DEVICE** or **+ NEW** button
   - Choose **Skip** on the wizard
   - Give it a name like "meater"
   - Open [`meater.yaml`](meater.yaml) from this GitHub repository
   - Click "Raw" button and copy all the contents
   - Paste into the ESPHome editor
   - Don't save yet - we need to set up secrets and includes first

2. **Create your secrets**:
   - In Home Assistant, go to **Settings** → **Add-ons** → **File editor**
   - Navigate to `/config/esphome/`
   - Create or edit the file called `secrets.yaml`
   - Open [`secrets.yaml.example`](secrets.yaml.example) from this GitHub repository
   - Copy the template and fill in your actual values:
     - WiFi SSID and password
     - API encryption key (you can generate one by clicking on the key icon in ESPHome dashboard)
     - OTA password (create a secure password)
     - MEATER device MAC address (see "Finding Your MEATER MAC Address" section above)
     - Fallback AP password (for emergency access)
   - Save the secrets.yaml file

3. **Add the include file** (IMPORTANT):
   The configuration requires a custom C++ file that must be added manually:
   
   **Using File Editor Add-on** (Easiest for GUI users):
   - In Home Assistant, go to **Settings** → **Add-ons** → **File editor**
   - Click the folder icon in the top left and navigate to `/config/esphome/`
   - Click the folder icon with a plus sign to create a new folder called `includes`
   - Click on the `includes` folder to enter it
   - Click the file icon with a plus sign to create a new file called `meater_ble_server.h`
   - Open the file [`includes/meater_ble_server.h`](includes/meater_ble_server.h) from this GitHub repository in your browser
   - Click the "Raw" button to view the raw content
   - Select all (Ctrl+A or Cmd+A) and copy the entire file contents
   - Paste into the new file in your File Editor
   - Click the save icon (floppy disk) to save the file
   - Verify the full path is `/config/esphome/includes/meater_ble_server.h`
   
   **OR using SSH/Terminal** (Advanced users):
   ```bash
   # SSH into your Home Assistant instance, then run:
   mkdir -p /config/esphome/includes
   cd /config/esphome/includes
   wget https://raw.githubusercontent.com/R00S/meater-in-local-haos/main/includes/meater_ble_server.h
   # Or if wget is not available:
   curl -o meater_ble_server.h https://raw.githubusercontent.com/R00S/meater-in-local-haos/main/includes/meater_ble_server.h
   ```

4. **Install to your ESP32**:
   - In the ESPHome dashboard, click on your new device
   - Click **INSTALL**
   - Choose your installation method (USB, Wireless, etc.)
   - Wait for compilation and installation to complete

5. **Verify it's working**:
   - Check the logs in the ESPHome dashboard for your device
   - Look for messages like "MEATER BLE Server setup complete" and "Started advertising as MEATER device"
   - The ESP32 should connect to your real MEATER+ device
   - In your phone's MEATER app, scan for devices and connect to "MEATER"

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
- ✅ **Automatic MEATER variant detection** (MEATER, MEATER+, MEATER 2, MEATER 2+, etc.)
- ✅ **Dynamic device name** - advertises with the same name as the real device
- ✅ Forwards temperature data to connected phone apps
- ✅ Forwards battery data to connected phone apps
- ✅ Forwards firmware version to connected phone apps
- ✅ Supports phone app connections while maintaining Home Assistant integration
- ✅ MEATER device name sensor showing detected variant

## Technical Details

### BLE Services Implemented

**MEATER Service** (`a75cc7fc-c956-488f-ac2a-2dbc08b63a04`):
- Temperature Characteristic (`7edda774-045e-4bbf-909b-45d1991a2876`) - Read, Notify
- Battery Characteristic (`2adb4877-68d8-4884-bd3c-d83853bf27b8`) - Read, Notify

**Device Information Service** (`180A`):
- Firmware Revision Characteristic (`00002a26-0000-1000-8000-00805f9b34fb`) - Read

**Generic Access Profile Service** (`1800`) - Read from real MEATER:
- Device Name Characteristic (`2A00`) - Used to detect MEATER variant (MEATER, MEATER+, etc.)

### How Device Variant Detection Works

1. ESP32 connects to the real MEATER device via BLE client
2. Reads the Device Name characteristic from GAP service (`1800`)
3. Detects the actual variant name (e.g., "MEATER+", "MEATER 2")
4. Updates BLE server to advertise with the same device name
5. Phone app sees the correct MEATER variant and connects successfully

### Files

- `meater.yaml` - Main ESPHome configuration file
- `secrets.yaml.example` - Template for your secrets file (copy to `secrets.yaml`)
- `secrets.yaml` - Your personal secrets file (gitignored, not in repo)
- `includes/meater_ble_server.h` - Custom C++ code for BLE server implementation

## Credits

Based on MEATER BLE protocol research from:
- https://github.com/nathanfaber/meaterble

## Troubleshooting

### "Could not find file '/config/esphome/includes/meater_ble_server.h'" Error

This error occurs when using the ESPHome GUI and the include file hasn't been added yet.

**Solution**: Follow the steps in "Option B: Using Home Assistant ESPHome GUI" above, specifically step 3 about adding the include file. You need to:
1. Create the directory `/config/esphome/includes/` (use File Editor add-on or SSH)
2. Copy the file `includes/meater_ble_server.h` from this repository into that directory
3. Make sure the file path is exactly `/config/esphome/includes/meater_ble_server.h`

If you prefer not to manage external files, you can use the ESPHome command line interface instead (see Option A).

### Compilation Error: "cannot execute 'cc1'" with HAOS 2025.11.1

**IMPORTANT**: Home Assistant OS 2025.11.1 (with ESPHome 2025.10.4) has a broken toolchain (14.2.0+20241119) that affects **both ESP-IDF and Arduino frameworks** for ESP32-C3 wireless compilation. This is an environment/platform issue, not a configuration issue.

**Error:**
```
toolchain-riscv32-esp @ 14.2.0+20241119
riscv32-esp-elf-gcc: fatal error: cannot execute 'cc1': posix_spawnp: No such file or directory
CMake Error: The C compiler is not able to compile a simple test program.
```

**Workarounds** (choose one):

1. **Use wired USB flashing** (Option A in setup instructions):
   - Install ESPHome command line on your computer
   - Compile locally and flash via USB cable
   - This bypasses the broken HAOS toolchain entirely

2. **Wait for ESPHome/HAOS update**:
   - This toolchain issue will likely be fixed in a future ESPHome or HAOS update
   - Monitor ESPHome release notes for toolchain fixes

3. **Use an older ESPHome version** (if available):
   - Check if you can downgrade ESPHome add-on to a version before the broken toolchain was introduced
   - This may require manual installation

**Current Configuration** (for when toolchain is fixed):
```yaml
esp32:
  board: esp32-c3-devkitm-1
  framework:
    type: arduino
```

The Arduino framework is recommended and will work once the toolchain is fixed. It requires no version pinning and is fully compatible with ESP32-C3 BLE functionality.

### ESP32 not connecting to MEATER device (Cannot poll, not connected)

If you see repeated warnings like `[MEATER battery level] Cannot poll, not connected` in the logs:

**Symptoms:**
- ESP32 connects to WiFi successfully
- BLE scanner shows "Scanner State: RUNNING"
- Logs show "Connecting: 0, discovered: 0, disconnecting: 0"
- Continuous "Cannot poll, not connected" warnings for all sensors

**Common Causes:**

1. **MEATER device is off or out of range**
   - Make sure your MEATER probe is powered on
   - Move the ESP32 closer to the MEATER device (within 10-30 feet)
   - Check MEATER battery level (low battery reduces range)

2. **Wrong MAC address in configuration**
   - Verify the MAC address in `secrets.yaml` matches your actual MEATER device
   - Use a BLE scanner app to confirm the correct MAC address
   - MAC address format should be: `XX:XX:XX:XX:XX:XX` (with colons)

3. **MEATER already connected to another device**
   - MEATER can only connect to one BLE device at a time
   - Disconnect MEATER from phone app before ESP32 connection
   - Power cycle the MEATER probe to clear any stuck connections

4. **BLE interference or conflicts**
   - Reduce number of active BLE devices nearby
   - Move away from WiFi routers (2.4GHz can interfere with BLE)
   - Try restarting the ESP32

**Troubleshooting Steps:**
1. Check logs for: `"BLE client connected, now initializing BLE server..."` - this confirms connection
2. If you never see this message, the BLE client hasn't connected to the real MEATER
3. Power cycle both the MEATER probe and ESP32
4. Verify MAC address with a BLE scanner app
5. Move devices closer together

### Phone app can't find the ESP32
- Make sure the ESP32 is powered on and connected to WiFi
- Check the logs to ensure the BLE server started successfully
- Look for "Started advertising as MEATER device" in the logs
- **Important**: The BLE server only starts AFTER the ESP32 connects to the real MEATER device
- If you don't see "BLE client connected, now initializing BLE server..." in logs, see "ESP32 not connecting to MEATER device" section above
- Try restarting the MEATER app on your phone
- Make sure Bluetooth is enabled on your phone

### Home Assistant sensors not updating
- Verify the MAC address in the configuration matches your MEATER device
- Check that the MEATER is powered on and within range
- Review the ESP32 logs for connection errors
- Look for "BLE client connected, now initializing BLE server..." message - this confirms successful connection
- If sensors were working before, see "ESP32 not connecting to MEATER device" section above

### Both phone and Home Assistant not working
- The MEATER might be too far away or have a low battery
- Check the ESP32 logs for BLE connection issues
- Try power cycling the MEATER and ESP32
- Verify the ESP32 is connected to WiFi (check Home Assistant device status)

### Compilation errors about BLE functions
- Make sure you're using `esp-idf` framework (not Arduino) as specified in the configuration
- The ESP32 board must support BLE (ESP32, ESP32-C3, ESP32-S3 work; ESP8266 does not)
- Check that `esp32_ble` is configured with `max_connections: 4` or more
