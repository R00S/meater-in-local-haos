# MEATER BLE Probe Emulator for Home Assistant

⚠️ **DEVELOPMENT STATUS** - See [STATUS.md](STATUS.md) for current project state.

This ESPHome configuration implements a BLE server that emulates a MEATER probe, with the goal of providing temperature and battery data to both the MEATER phone app and Home Assistant simultaneously.

**Current State:**
- BLE server is working and can be added to the MEATER app
- Connection to the device fails after being added to the app
- BLE client (connection to real MEATER probe) is temporarily disabled to free memory for server debugging

> **📝 Note for Home Assistant GUI Users**: This configuration requires adding a custom C++ include file. See the detailed [setup instructions below](#setup) for how to add this file through the File Editor add-on. If you prefer a simpler setup process, you can use the ESPHome command line interface instead.

## Problem

MEATER probes only allow one BLE connection at a time:
- Connecting via the phone app means no Home Assistant integration
- Connecting to Home Assistant means the phone app can't connect
- Official MEATER Block hardware is required for simultaneous connectivity

## Solution (In Development)

This configuration is implementing an ESP32 BLE server that acts as a MEATER probe:

1. **BLE Server**: Advertises as "MEATER" with proper GATT services and characteristics
2. **Protocol Implementation**: Implements the BLE protocol used by real MEATER probes
3. **Dual Integration Goal**: Aims to expose data to both MEATER app (via BLE) and Home Assistant (via ESPHome API)

**Current Limitations:**
- BLE client functionality (connection to real MEATER probe) is not included in the current build due to memory constraints needed for debugging the BLE server
- The device can be added to the MEATER app but cannot maintain a stable connection afterward

## How It Works (Current Implementation)

```
ESP32 (BLE Server)
    ↓ BLE Advertisement
MEATER Phone App discovers device
    ↓ Attempts to connect via BLE
    ❌ Connection fails after device is added
ESP32 exposes mock sensors to Home Assistant via WiFi/API
```

### Current Initialization Flow

1. **On Boot**: ESP32 initializes Bluedroid BLE stack
2. **BLE Advertising**: Starts advertising as "MEATER" with MEATER service UUIDs
3. **GATT Services**: Exposes temperature, battery, and device info characteristics
4. **Phone App Discovery**: MEATER app can find and add the device
5. **Connection Issue**: App cannot establish stable connection after adding device
6. **Home Assistant**: Mock temperature and battery data available in Home Assistant

This implementation focuses on BLE only. UDP broadcasting was investigated but ruled out as it requires an HTTP server component in addition to UDP discovery.

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
- **ESP32-C3 board** (currently using: ESP32-C3-DevKitM-1 with 4MB flash)
- MEATER probe (for future integration when BLE client is re-enabled)

### Hardware Notes

**Current Implementation: ESP32-C3 with Bluedroid**

The project currently uses ESP32-C3 with the Bluedroid BLE stack (ESP-IDF framework) for the BLE server implementation.

**ESP32-C6 with NimBLE - Not Used**
- NimBLE on ESP32-C6 was attempted but found not mature enough in ESPHome yet
- Current ESPHome/ESP-IDF toolchain for C6 has compatibility issues
- Development focuses on C3 with Bluedroid which is more stable

**Compatible boards**:
- ✅ ESP32-C3-DevKitM-1 (4MB flash) - **Currently used**
- ✅ ESP32-DevKitC (4MB+ flash, dual-core) - Should work
- ✅ ESP32-WROOM-32 (4MB+ flash, dual-core) - Should work
- ❌ ESP32-C6 - Not recommended until ESPHome NimBLE support matures
- ❌ ESP8266 - Not compatible (no BLE support)

**Memory Constraints:**
- BLE server currently requires most available RAM for debugging
- BLE client (connection to real MEATER probe) is disabled in current build to free memory
- Future versions will need memory optimization to run both client and server

### Note About MEATER MAC Address

**Not currently needed:** The BLE client functionality (which would connect to a real MEATER probe) is disabled in the current build. The configuration currently runs only as a BLE server advertising as a MEATER device.

When BLE client is re-enabled in future versions, you will need your MEATER device's MAC address:
- Use a BLE scanner app (nRF Connect, BLE Scanner, LightBlue)
- Look for a device named "MEATER"
- Note the MAC address (format: XX:XX:XX:XX:XX:XX)

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
   - The ESP32 will start advertising as "MEATER" via BLE
   - In your phone's MEATER app, scan for devices
   - You can add the device to the app, but connection will fail afterward
   - Mock temperature and battery data will be visible in Home Assistant
   - Note: BLE client (connection to real MEATER probe) is currently disabled

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
   - Click the file icon with a plus sign to create a new file called `meater_bluedroid_server.h`
   - Open the file [`includes/meater_bluedroid_server.h`](includes/meater_bluedroid_server.h) from this GitHub repository in your browser
   - Click the "Raw" button to view the raw content
   - Select all (Ctrl+A or Cmd+A) and copy the entire file contents
   - Paste into the new file in your File Editor
   - Click the save icon (floppy disk) to save the file
   - Verify the full path is `/config/esphome/includes/meater_bluedroid_server.h`
   
   **OR using SSH/Terminal** (Advanced users):
   ```bash
   # SSH into your Home Assistant instance, then run:
   mkdir -p /config/esphome/includes
   cd /config/esphome/includes
   wget https://raw.githubusercontent.com/R00S/meater-in-local-haos/main/includes/meater_bluedroid_server.h
   # Or if wget is not available:
   curl -o meater_bluedroid_server.h https://raw.githubusercontent.com/R00S/meater-in-local-haos/main/includes/meater_bluedroid_server.h
   ```

4. **Install to your ESP32**:
   - In the ESPHome dashboard, click on your new device
   - Click **INSTALL**
   - Choose your installation method (USB, Wireless, etc.)
   - Wait for compilation and installation to complete

5. **Current behavior**:
   - Check the logs in the ESPHome dashboard for your device
   - Look for messages like "BLE server initialization complete"
   - The ESP32 will advertise as "MEATER" via BLE
   - In your phone's MEATER app, you can scan for and add the device
   - Note: Connection will fail after adding - this is a known issue being investigated

### Important Notes

- The ESP32 must be connected to WiFi for Home Assistant integration
- BLE client functionality (connection to real MEATER probe) is currently disabled
- The device generates mock temperature and battery data
- UDP broadcasting was investigated but ruled out (requires HTTP server implementation)

## Features

### Currently Working
- ✅ BLE server advertising as "MEATER"
- ✅ MEATER GATT services and characteristics configured
- ✅ Mock tip temperature sensor in Home Assistant
- ✅ Mock ambient temperature sensor in Home Assistant
- ✅ Mock battery level sensor in Home Assistant
- ✅ Mock RSSI signal strength in Home Assistant
- ✅ OTA updates
- ✅ WiFi connectivity with fallback AP

### Not Working Yet
- ❌ MEATER app connection (device can be added but cannot connect)
- ❌ BLE client (connection to real MEATER probe - currently disabled)
- ❌ Real temperature data (using mock data currently)

## Technical Details

### BLE Server Implementation

The ESP32 acts as a BLE server (peripheral) advertising as "MEATER":

**MEATER Service** (`a75cc7fc-c956-488f-ac2a-2dbc08b63a04`):
- Temperature Characteristic (`7edda774-045e-4bbf-909b-45d1991a2876`) - 8 bytes of temperature data
- Battery Characteristic (`2adb4877-68d8-4884-bd3c-d83853bf27b8`) - 2 bytes of battery data

**Device Information Service** (`180A`):
- Firmware Revision Characteristic (`00002a26-0000-1000-8000-00805f9b34fb`)

**Generic Access Profile Service** (`1800`):
- Device Name Characteristic (`2A00`) - Set to "MEATER"

### BLE Stack Implementation

This project uses **Bluedroid** on ESP32-C3:

**Why Bluedroid on C3?**
- **Stability**: Bluedroid is mature and well-supported in ESPHome
- **ESP32-C3 Compatibility**: Works reliably with ESP-IDF framework
- **NimBLE Not Ready**: ESP32-C6 with NimBLE was attempted but ESPHome support is not mature enough yet

**Key Implementation Details**:
- BLE server (peripheral role)
- Advertises as "MEATER" with proper service UUIDs
- Implements MEATER GATT service structure
- Currently using mock data (BLE client disabled to free memory for debugging)

### BLE Client (Currently Disabled)

The BLE client functionality that would connect to a real MEATER probe is currently commented out due to memory constraints needed for debugging the BLE server. When re-enabled, it will:
- Connect to real MEATER device via BLE
- Read temperature and battery characteristics
- Forward data to BLE server for app connectivity

### Files

- `meater.yaml` - Main ESPHome configuration file
- `secrets.yaml.example` - Template for your secrets file (copy to `secrets.yaml`)
- `secrets.yaml` - Your personal secrets file (gitignored, not in repo)
- `includes/meater_bluedroid_server.h` - Custom C++ BLE server implementation
- `STATUS.md` - Current project status and development notes

## Credits

Based on MEATER BLE protocol research from:
- https://github.com/nathanfaber/meaterble

UDP broadcast implementation based on analysis of the MEATER Android app.

## Troubleshooting

### "Could not find file '/config/esphome/includes/meater_bluedroid_server.h'" Error

This error occurs when using the ESPHome GUI and the include file hasn't been added yet.

**Solution**: Follow the steps in "Option B: Using Home Assistant ESPHome GUI" above, specifically step 3 about adding the include file. You need to:
1. Create the directory `/config/esphome/includes/` (use File Editor add-on or SSH)
2. Copy the file `includes/meater_bluedroid_server.h` from this repository into that directory
3. Make sure the file path is exactly `/config/esphome/includes/meater_bluedroid_server.h`

If you prefer not to manage external files, you can use the ESPHome command line interface instead (see Option A).

### Compilation Error: "cannot execute 'cc1'" with HAOS 2025.11.1

**IMPORTANT**: Home Assistant OS 2025.11.1 (with ESPHome 2025.10.4) has a broken toolchain (14.2.0+20241119) that affects **both ESP-IDF and Arduino frameworks** for ESP32-C6 wireless compilation. This is an environment/platform issue, not a configuration issue.

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
  board: esp32-c6-devkitc-1
  framework:
    type: esp-idf
```

The ESP-IDF framework with NimBLE is recommended and will work once the toolchain is fixed. It requires no version pinning and is fully compatible with ESP32-C6 BLE functionality.

### MEATER app can add device but cannot connect

This is a known issue currently being investigated.

**Symptoms:**
- ESP32 advertises as "MEATER" successfully
- MEATER app can discover and add the device
- Connection fails immediately after adding
- Home Assistant sensors show mock data

**Current Status:**
This issue is under investigation. The next step is to perform an extremely thorough examination of the decompiled MEATER app to understand exactly how the BLE connection process works and what the app expects from the device.

**Workaround:**
None currently available. The project is in development to resolve this issue.

### Home Assistant sensors showing mock data

This is expected behavior in the current development version.

**Why:**
- BLE client (connection to real MEATER probe) is currently disabled
- Mock temperature and battery data is generated every 2 seconds
- This allows testing of Home Assistant integration while BLE server is being debugged

**When will this change:**
Once the BLE server connection issues are resolved, the BLE client will be re-enabled to read real data from MEATER probes.

### Compilation errors about BLE functions
- Make sure you're using `esp-idf` framework (not Arduino) as specified in the configuration
- The ESP32 board must support BLE (ESP32, ESP32-C3, ESP32-S3 work; ESP8266 does not)
- Current implementation uses Bluedroid stack on ESP32-C3
- If you're trying to use ESP32-C6 with NimBLE, be aware that ESPHome support is not mature enough yet
