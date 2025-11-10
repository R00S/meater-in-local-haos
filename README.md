# MEATER WiFi Bridge for Home Assistant

This ESPHome configuration allows an ESP32 to act as a WiFi bridge for a MEATER probe, enabling simultaneous use with Home Assistant and the MEATER phone app.

> **📝 Note for Home Assistant GUI Users**: This configuration requires adding a custom C++ include file. See the detailed [setup instructions below](#setup) for how to add this file through the File Editor add-on. If you prefer a simpler setup process, you can use the ESPHome command line interface instead.

## Problem

The MEATER probe/block has limitations when used with multiple systems:
- Direct BLE connection to Home Assistant means the phone app can't connect
- Using only the phone app means no Home Assistant integration
- The MEATER Block WiFi functionality requires the official hardware

## Solution

This configuration makes the ESP32 act as a MEATER Block emulator:

1. **BLE Client**: Connects to the MEATER probe/device via Bluetooth and reads temperature/battery/device info
2. **UDP Broadcaster**: Emulates MEATER Block WiFi functionality by broadcasting data on UDP port 7878
3. **Data Forwarder**: Forwards all data from the MEATER device to both Home Assistant and the WiFi network for phone app discovery

## How It Works

```
MEATER Probe
    ↓ (BLE connection)
ESP32 with this config
    ↓                    ↓
Home Assistant      UDP Broadcast (port 7878)
(existing sensors)   ↓
                Phone App (discovers via WiFi)
```

### Initialization Flow

1. **On Boot**: ESP32 connects to WiFi and starts BLE scanning
2. **BLE Client Connection**: ESP32 connects to the real MEATER probe/block
3. **Device Detection**: Reads the device name from MEATER (e.g., "MEATER+", "MEATER 2")
4. **UDP Broadcasting**: Starts broadcasting temperature and battery data on UDP port 7878
5. **Data Forwarding**: Continuously forwards data to both Home Assistant sensors and UDP broadcasts

This approach allows the phone app to discover the ESP32 as if it were a MEATER Block on WiFi.

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
- **ESP32-C6 board** (recommended: ESP32-C6-DevKitC-1) - Required for NimBLE compatibility
- MEATER Block (WiFi bridge device that connects to MEATER probes)

### Memory Requirements

**Why ESP32-C6?** 

This project requires BLE client functionality and WiFi connectivity. The ESP32-C6 is the recommended choice because:

- **BLE 5.3 support**: Modern Bluetooth stack with reliable client connectivity
- **More RAM**: 512KB provides headroom for BLE client and WiFi operations
- **WiFi performance**: Good WiFi range for UDP broadcasting
- **Stable operation**: Handles BLE client and WiFi concurrently without issues
- **Flash memory**: 4MB is sufficient for all features with room for OTA updates
- **Modern chipset**: Latest ESP32 generation with better power efficiency

**Compatible boards**:
- ✅ **ESP32-C6-DevKitC-1** (4MB flash) - **Recommended** - Best overall performance
- ✅ ESP32-C3-DevKitM-1 (4MB flash) - Also good choice, slightly less powerful
- ✅ ESP32-DevKitC (4MB+ flash, dual-core) - Classic option, works well
- ✅ ESP32-WROOM-32 (4MB+ flash, dual-core) - Works great
- ❌ ESP8266 - Not compatible (no BLE support)
- ❌ Raspberry Pi Pico W - Not compatible (ESPHome requires ESP32/ESP8266)

Any ESP32 variant with BLE and WiFi will work for this application.

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
   - Click the file icon with a plus sign to create a new file called `meater_udp_broadcast.h`
   - Open the file [`includes/meater_udp_broadcast.h`](includes/meater_udp_broadcast.h) from this GitHub repository in your browser
   - Click the "Raw" button to view the raw content
   - Select all (Ctrl+A or Cmd+A) and copy the entire file contents
   - Paste into the new file in your File Editor
   - Click the save icon (floppy disk) to save the file
   - Verify the full path is `/config/esphome/includes/meater_udp_broadcast.h`
   
   **OR using SSH/Terminal** (Advanced users):
   ```bash
   # SSH into your Home Assistant instance, then run:
   mkdir -p /config/esphome/includes
   cd /config/esphome/includes
   wget https://raw.githubusercontent.com/R00S/meater-in-local-haos/main/includes/meater_udp_broadcast.h
   # Or if wget is not available:
   curl -o meater_udp_broadcast.h https://raw.githubusercontent.com/R00S/meater-in-local-haos/main/includes/meater_udp_broadcast.h
   ```

4. **Install to your ESP32**:
   - In the ESPHome dashboard, click on your new device
   - Click **INSTALL**
   - Choose your installation method (USB, Wireless, etc.)
   - Wait for compilation and installation to complete

5. **Verify it's working**:
   - Check the logs in the ESPHome dashboard for your device
   - Look for messages like "UDP broadcaster started successfully"
   - The ESP32 should connect to your real MEATER+ device
   - In your phone's MEATER app, scan for devices and connect to "MEATER"

### Important Notes

- The real MEATER device must be powered on and within BLE range of the ESP32
- The ESP32 must be connected to WiFi for both Home Assistant integration and UDP broadcasting
- Phone app should be on the same WiFi network as the ESP32 to discover UDP broadcasts
- UDP broadcasts are sent to the local subnet (x.x.x.255) on port 7878

## Features

### Preserved Functionality
- ✅ MEATER tip temperature sensor in Home Assistant
- ✅ MEATER ambient temperature sensor in Home Assistant
- ✅ MEATER battery level sensor in Home Assistant
- ✅ MEATER firmware version in Home Assistant
- ✅ MEATER RSSI signal strength in Home Assistant
- ✅ Bluetooth proxy for other devices
- ✅ OTA updates
- ✅ WiFi connectivity with fallback AP

### New Functionality
- ✅ **UDP broadcasting on port 7878** - Emulates MEATER Block WiFi functionality
- ✅ **Automatic device name detection** - Reads device name from real MEATER device
- ✅ Broadcasts raw temperature data for phone app discovery
- ✅ Broadcasts battery data
- ✅ MEATER device name sensor showing detected variant
- ✅ Works with MEATER app's WiFi discovery feature

## Technical Details

### BLE Client Implementation

The ESP32 connects to the MEATER device as a BLE client and reads:

**MEATER Service** (`a75cc7fc-c956-488f-ac2a-2dbc08b63a04`):
- Temperature Characteristic (`7edda774-045e-4bbf-909b-45d1991a2876`) - 8 bytes of raw temperature data
- Battery Characteristic (`2adb4877-68d8-4884-bd3c-d83853bf27b8`) - 2 bytes of battery data

**Device Information Service** (`180A`):
- Firmware Revision Characteristic (`00002a26-0000-1000-8000-00805f9b34fb`)

**Generic Access Profile Service** (`1800`):
- Device Name Characteristic (`2A00`) - Used to detect MEATER variant (MEATER, MEATER+, etc.)

### UDP Broadcasting

The ESP32 broadcasts on **UDP port 7878** (MEATER_LINK_UDP_PORT) to emulate MEATER Block WiFi functionality:

**Broadcast Format**:
- Device name (null-terminated string)
- Raw temperature data (8 bytes)
- Raw battery data (2 bytes)

**Broadcast Behavior**:
- Sends to local subnet broadcast address (e.g., 192.168.1.255)
- Rate limited to once per second
- Only broadcasts when WiFi is connected
- Triggered whenever new temperature data is received from MEATER device

### How It Works

1. ESP32 boots and connects to WiFi
2. ESP32 connects to the real MEATER device via BLE
3. Reads device name from MEATER (e.g., "MEATER+")
4. Initializes UDP broadcaster with detected device name
5. Continuously reads temperature and battery data from MEATER
6. Broadcasts raw data via UDP for phone app discovery
7. Also publishes processed data to Home Assistant sensors

### BLE Stack Implementation

This project uses **NimBLE** for BLE client operations:

**Why NimBLE?**
- **ESP32-C6 Requirement**: C6 only supports NimBLE, not the older Bluedroid stack
- **BLE Client**: Efficient BLE scanning and client connectivity
- **Better Performance**: Lower memory footprint
- **Modern**: Active development and better BLE 5.x support

**Key Implementation Details**:
- BLE client only (no server/peripheral role needed)
- Scans for and connects to MEATER device by MAC address
- Subscribes to temperature and battery characteristics for notifications
- Reads device name, firmware version on connection

### Files

- `meater.yaml` - Main ESPHome configuration file
- `secrets.yaml.example` - Template for your secrets file (copy to `secrets.yaml`)
- `secrets.yaml` - Your personal secrets file (gitignored, not in repo)
- `includes/meater_udp_broadcast.h` - Custom C++ code for UDP broadcasting

## Credits

Based on MEATER BLE protocol research from:
- https://github.com/nathanfaber/meaterble

UDP broadcast implementation based on analysis of the MEATER Android app.

## Troubleshooting

### "Could not find file '/config/esphome/includes/meater_udp_broadcast.h'" Error

This error occurs when using the ESPHome GUI and the include file hasn't been added yet.

**Solution**: Follow the steps in "Option B: Using Home Assistant ESPHome GUI" above, specifically step 3 about adding the include file. You need to:
1. Create the directory `/config/esphome/includes/` (use File Editor add-on or SSH)
2. Copy the file `includes/meater_udp_broadcast.h` from this repository into that directory
3. Make sure the file path is exactly `/config/esphome/includes/meater_udp_broadcast.h`

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
1. Check logs for: `"UDP broadcaster started successfully"` and `"Read device name from real MEATER: XXX"` - this confirms connection
2. If you never see these messages, the BLE client hasn't connected to the real MEATER
3. Power cycle both the MEATER probe and ESP32
4. Verify MAC address with a BLE scanner app
5. Move devices closer together

### Phone app can't discover the ESP32 via WiFi

If the MEATER app isn't discovering the ESP32 as a Block device:

**Symptoms:**
- ESP32 is connected to WiFi
- Home Assistant sensors are working
- Phone app doesn't show any Block devices

**Common Causes:**

1. **Phone not on same WiFi network**
   - The ESP32 broadcasts UDP packets to the local subnet only
   - Make sure your phone is connected to the same WiFi network as the ESP32
   - Check that both are on the same subnet (e.g., 192.168.1.x)

2. **UDP broadcasts not working**
   - Check ESP32 logs for: `"UDP broadcaster started successfully"`
   - Look for: `"Broadcast X bytes to X.X.X.255:7878"` messages
   - If you don't see broadcast messages, the UDP broadcaster may not be initialized

3. **Firewall or router blocking UDP**
   - Some routers or firewalls block UDP broadcast traffic
   - Check router settings for broadcast/multicast filtering
   - Try disabling AP isolation if enabled

4. **MEATER Link feature not enabled in app**
   - The app needs to have Link features enabled to listen for UDP broadcasts
   - Check app settings for Link/WiFi connectivity options

**Troubleshooting Steps:**
1. Verify ESP32 and phone are on same WiFi network
2. Check ESP32 logs for UDP broadcast messages
3. Use a network analyzer tool (like Wireshark or tcpdump) to verify UDP packets are being sent
4. Temporarily disable any firewalls to test
5. Try restarting the MEATER app

### Home Assistant sensors not updating
- Verify the MAC address in the configuration matches your MEATER device
- Check that the MEATER is powered on and within range
- Review the ESP32 logs for connection errors
- Look for `"Read device name from real MEATER: XXX"` message - this confirms successful connection
- If sensors were working before, see "ESP32 not connecting to MEATER device" section above

### Both phone and Home Assistant not working
- The MEATER might be too far away or have a low battery
- Check the ESP32 logs for BLE connection issues
- Try power cycling the MEATER and ESP32
- Verify the ESP32 is connected to WiFi (check Home Assistant device status)

### Compilation errors about BLE or WiFi functions
- Make sure you're using `esp-idf` framework (not Arduino) as specified in the configuration
- The ESP32 board must support BLE and WiFi (ESP32, ESP32-C3, ESP32-C6, ESP32-S3 work; ESP8266 does not)
- ESP32-C6 requires NimBLE stack (included in the current implementation)
- WiFiUDP library should be available by default in ESP-IDF
