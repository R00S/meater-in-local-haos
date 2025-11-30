# Alternative Temperature Probes and Open Source Projects Research

**Created:** 2025-11-30  
**Status:** Research document for exploring alternatives to MEATER BLE Block protocol

Since the MEATER Block protocol analysis has reached an impasse, this document explores alternative approaches, including other temperature probes that may be easier to emulate and open-source projects with similar functionality.

---

## Executive Summary

The research identified several promising paths forward:

1. **iGrill/Weber Thermometers** - Already have working ESPHome integration (`esphome-igrill`)
2. **Inkbird BLE Thermometers** - Have open-source ESP32 integrations and Home Assistant support
3. **Open-source BBQ Controllers** - PiFire, HeaterMeter, PitmasterPi for DIY temperature monitoring
4. **Grill Buddy** - Home Assistant integration for managing cooking with any temperature probe

---

## Part 1: Alternative BLE Temperature Probes

### 1. iGrill / Weber Thermometers

**Why This is Promising:**
- **Working ESPHome integration exists**: [`bendikwa/esphome-igrill`](https://github.com/bendikwa/esphome-igrill)
- BLE protocol has been reverse-engineered and documented
- Same single-connection limitation as MEATER can be bypassed with ESP32 proxy
- 60+ GitHub stars, actively maintained

**Supported Models:**
- ✅ iGrill mini
- ✅ iGrill V2
- ✅ iGrill V3
- ✅ Weber Pulse 1000
- ✅ Weber Pulse 2000

**Integration Method:**
```yaml
external_components:
  - source: github://bendikwa/esphome-igrill@v1.2

esp32_ble_tracker:

ble_client:
  - mac_address: 70:91:8F:XX:XX:XX
    id: igrill_device

sensor:
  - platform: igrill
    ble_client_id: igrill_device
    temperature_probe1:
      name: "iGrill temp probe 1"
    battery_level:
      name: "iGrill battery"
```

**Key Insight:** The `esphome-igrill` component shows how to properly implement a BLE client that:
- Handles connection authorization
- Reads multiple temperature probes
- Reports battery level
- Uses ESPHome's `ble_client` platform

This could serve as a reference for improving our MEATER implementation.

---

### 2. Inkbird BLE Thermometers

**Why This is Promising:**
- Multiple open-source projects available
- Protocol is simpler than MEATER
- Direct Home Assistant integration available
- ESP32 solutions already exist

**Available Integrations:**

#### a) `satrik/esp32_ble_inkbird`
- GitHub: https://github.com/satrik/esp32_ble_inkbird
- ESP32 web server for Inkbird BBQ thermometers
- Detects probes, shows battery, web interface
- 8 stars, last updated 2025

#### b) `runningtoy/InkBird_BLE2MQTT`
- ESP32 bridge from Inkbird BLE to MQTT
- Integrates with Home Assistant via MQTT

#### c) `Bluetooth-Devices/inkbird-ble`
- Python library for parsing Inkbird BLE data
- MIT License, actively maintained
- Works with Home Assistant BLE Monitor

**Supported Models:**
- IBT-2X, IBT-4XS, IBT-6XS, IBT-8XS
- IBT-11P-B, IBT-11I-B
- Most BLE-enabled Inkbird models

**Key Insight:** ESPHome natively supports Inkbird IBS-TH1/TH2 sensors. The BBQ thermometer models use similar protocols and have community-developed solutions.

---

### 3. ThermoPro BLE Thermometers

**Models:**
- TempSpike
- TempSpike Pro
- Various Wi-Fi models

**Status:** Less community support than iGrill/Inkbird, but some hobbyist projects exist.

---

### 4. MeatStick

**Status:** Limited open-source support. Protocol is proprietary and less documented than iGrill/Inkbird.

---

## Part 2: Open Source BBQ Temperature Monitoring Projects

These projects provide temperature monitoring without needing to reverse-engineer BLE protocols. They use wired probes (thermistors/thermocouples) with open hardware.

### 1. HeaterMeter 🌟 (Highly Recommended)

**GitHub:** https://github.com/HeaterMeter/HeaterMeter  
**Platform:** Raspberry Pi

**Features:**
- Reads temperatures from thermistor/thermocouple probes
- Controls blower for maintaining grill temperature
- Web interface with logging and graphing
- Alarm notifications via email/SMS
- No third-party cloud dependencies
- Full documentation and kits available

**Why Consider:**
- Proven, mature project (years of development)
- Large community
- Works with any thermocouple/thermistor probes
- Can be integrated with Home Assistant

---

### 2. PiFire 🌟 (Highly Recommended)

**GitHub:** https://github.com/nebhead/PiFire (122 stars)  
**Platform:** Raspberry Pi  
**Language:** Python/JavaScript

**Features:**
- Smart Wi-Fi enabled controller for pellet smokers
- Wireless control and temperature plotting
- Modern web interface
- Designed for Traeger pellet grills (adaptable)
- Active Discord community

**Topics:** `bootstrap`, `chartjs`, `flask`, `html`, `javascript`, `python`, `raspberry-pi`, `smoker-grill`

---

### 3. PitmasterPi

**GitHub:** https://github.com/justindean/PitmasterPi (75 stars)  
**Platform:** Raspberry Pi  
**Language:** Python

**Features:**
- Automated BBQ temperature controller
- DevOps-style automation for grilling
- Docker support
- Modular code, easily extendable
- Open access for tweaks and integrations

---

### 4. PitmasterIOT

**GitHub:** https://github.com/RyanOC/PitmasterIOT  
**Platform:** ESP32

**Features:**
- IoT-powered grill and food temperature monitoring
- Real-time data with web dashboard
- **MQTT support for Home Assistant integration**
- Fan control for temperature management
- Simple and affordable

**Why Consider:** ESP32-based like our project, uses MQTT for HA integration.

---

### 5. BBQ Buddy

**GitHub:** https://github.com/skyeperry1/BBQ-Buddy

**Features:**
- Multi-probe monitoring
- Web-based visualizations
- Under active development
- Fully open source

---

## Part 3: Home Assistant Native Integrations

### 1. Grill Buddy for Home Assistant

**GitHub:** https://github.com/jeroenterheerdt/grillbuddy (23 stars)  
**Type:** Custom Home Assistant Integration

**Features:**
- Works with **any temperature probe** connected to Home Assistant
- Provides cooking management features
- Tracks internal temperature targets for different meats
- Not tied to any specific hardware

**Topics:** `barbecue`, `bbq`, `grill`, `homeassistant`, `internal-temperature`, `meat`, `probe`, `protein`, `sensor`, `smoker`

**Why This Matters:** Instead of emulating the MEATER app, we could:
1. Connect ESP32 to MEATER probe (BLE client only)
2. Expose temperatures to Home Assistant
3. Use Grill Buddy for the "app experience" in Home Assistant

---

### 2. Native Inkbird Integration

Home Assistant has a native `inkbird` integration that works with supported Inkbird devices.

**Documentation:** https://www.home-assistant.io/integrations/inkbird/

---

## Part 4: Recommended Paths Forward

### Path A: Pivot to iGrill (Lower Risk)

**Approach:** Purchase an iGrill V2/V3 and use `esphome-igrill`

**Pros:**
- Working solution already exists
- Well-documented protocol
- Active maintenance

**Cons:**
- Requires different hardware
- No MEATER app compatibility

**Estimated Effort:** Low (days to weeks)

---

### Path B: Study esphome-igrill Implementation (Medium Risk)

**Approach:** Study how `esphome-igrill` implements BLE client successfully and apply learnings to MEATER

**Key Files to Study:**
- `components/igrill/igrill.cpp` - BLE client implementation
- `components/igrill/igrill.h` - Header with service/characteristic UUIDs

**Potential Learnings:**
- How to handle BLE authorization
- Proper notification subscription
- Connection management best practices

**Estimated Effort:** Medium (weeks)

---

### Path C: Abandon BLE Server, Focus on BLE Client Only (Recommended)

**Approach:** 
1. Keep ESP32 as BLE client to MEATER probe only
2. Expose temperatures to Home Assistant via ESPHome API
3. Use Grill Buddy or custom HA dashboard for the "app experience"
4. Accept that MEATER phone app won't work with this setup

**Pros:**
- Simpler architecture (no BLE server)
- BLE client connection to MEATER probes is proven to work
- Home Assistant provides similar features to MEATER app
- Grill Buddy adds cooking management features

**Cons:**
- MEATER app still doesn't work
- Users need Home Assistant

**Estimated Effort:** Medium (weeks)

---

### Path D: Use Alternative Open-Source Platform (Different Project)

**Approach:** Build custom hardware using PiFire, HeaterMeter, or similar

**Pros:**
- Full control over hardware and software
- No reverse engineering needed
- Well-documented projects

**Cons:**
- Different hardware required
- Not using existing MEATER probes

**Estimated Effort:** High (months)

---

## Conclusion

The most pragmatic paths forward are:

1. **Path C (Recommended):** Focus on BLE client only, use Home Assistant + Grill Buddy for the "app experience"

2. **Path B:** Study `esphome-igrill` to understand proper BLE client implementation and apply learnings

3. **Path A:** If switching hardware is acceptable, iGrill with `esphome-igrill` is a proven solution

The MEATER Block protocol remains difficult to reverse-engineer because it likely includes:
- Proprietary authentication handshakes
- Encrypted or obfuscated data
- Complex state machine requirements

Alternative approaches may provide better value for development effort.

---

## References

### GitHub Repositories
- [esphome-igrill](https://github.com/bendikwa/esphome-igrill) - ESPHome iGrill integration
- [esp32_ble_inkbird](https://github.com/satrik/esp32_ble_inkbird) - ESP32 Inkbird integration
- [inkbird-ble](https://github.com/Bluetooth-Devices/inkbird-ble) - Python Inkbird parser
- [PiFire](https://github.com/nebhead/PiFire) - Raspberry Pi pellet grill controller
- [PitmasterPi](https://github.com/justindean/PitmasterPi) - BBQ temperature controller
- [PitmasterIOT](https://github.com/RyanOC/PitmasterIOT) - ESP32 IoT grill monitor
- [grillbuddy](https://github.com/jeroenterheerdt/grillbuddy) - Home Assistant BBQ integration
- [HeaterMeter](https://github.com/HeaterMeter/HeaterMeter) - Open-source BBQ controller

### Documentation
- [ESPHome Inkbird Sensor](https://esphome.io/components/sensor/inkbird_ibsth1_mini/)
- [Home Assistant Inkbird Integration](https://www.home-assistant.io/integrations/inkbird/)
- [Reverse Engineering BLE Devices Guide](https://reverse-engineering-ble-devices.readthedocs.io/en/latest/)

### Community Resources
- [Home Assistant Community - Inkbird BBQ](https://community.home-assistant.io/t/inkbird-bt-thermometer-ibbq-with-esp32/325825)
- [Home Assistant Community - iGrill](https://www.creatingsmarthome.com/index.php/2022/04/02/home-assistant-weber-igrill-sensors/)
