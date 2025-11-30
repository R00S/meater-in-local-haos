# Alternative Temperature Probes and Open Source Projects Research

**Created:** 2025-11-30  
**Status:** Research document for exploring alternatives to MEATER BLE Block protocol

Since the MEATER Block protocol analysis has reached an impasse, this document explores alternative approaches, including other temperature probes that may be easier to emulate and open-source projects with similar functionality.

---

## Executive Summary

The research identified several promising paths forward:

1. **iGrill/Weber Thermometers** - Already have working ESPHome integration (`esphome-igrill`)
2. **Inkbird BLE Thermometers** - Have open-source ESP32 integrations and Home Assistant support
3. **Open-source Kitchen/BBQ Controllers** - PiFire, HeaterMeter, PitmasterPi for DIY temperature monitoring
4. **Grill Buddy** - Home Assistant integration for managing cooking with any temperature probe

---

## Part 1: Alternative BLE Temperature Probes

### 1. iGrill / Weber Thermometers

**Why This is Promising:**
- **Working ESPHome integration exists**: [`bendikwa/esphome-igrill`](https://github.com/bendikwa/esphome-igrill)
- BLE protocol has been reverse-engineered and documented
- Same single-connection limitation as MEATER can be bypassed with ESP32 proxy
- Actively maintained with regular updates

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
- Actively maintained

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

## Part 2: Open Source Temperature Monitoring Projects

These projects provide temperature monitoring without needing to reverse-engineer BLE protocols. They use wired probes (thermistors/thermocouples) with open hardware. While many focus on outdoor cooking, they can be adapted for kitchen use.

### 1. HeaterMeter

**GitHub:** https://github.com/HeaterMeter/HeaterMeter  
**Platform:** Raspberry Pi

**Features:**
- Reads temperatures from thermistor/thermocouple probes
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

### 2. PiFire

**GitHub:** https://github.com/nebhead/PiFire  
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

**GitHub:** https://github.com/justindean/PitmasterPi  
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

## Part 3: Cooking Management & Guided Cook Functionality

This section specifically addresses the MEATER app's guided cook functionality and alternatives that provide similar features for setting up cooks with different cooking methods and doneness levels.

### What the MEATER App Provides

The MEATER app offers comprehensive guided cooking with:

| Feature | Description |
|---------|-------------|
| **Meat Selection** | Beef (steak cuts, roasts), Pork (chops, roasts), Chicken (whole, breast, thigh), Fish, Lamb, Game |
| **Cut Selection** | Specific cuts within each meat type (ribeye, sirloin, brisket, pork butt, etc.) |
| **Doneness Levels** | Rare, Medium-Rare, Medium, Medium-Well, Well-Done, Pulled (varies by meat type for food safety) |
| **Cooking Methods** | Oven, Stove-top, Air Fryer, Grill, Smoker, Sous-vide, Pan-sear, Roasting, Braising |
| **Cook Time Estimation** | Predicts when meat will reach target temperature |
| **Rest Time Calculation** | Accounts for carryover cooking during rest |
| **Step-by-Step Guidance** | Real-time instructions during the cook |
| **Master Class Recipes** | Expert-driven cooking tutorials |

---

### Kitchen Cooking Methods Reference

For a complete MEATER-like experience, the system must support these kitchen cooking methods:

| Cooking Method | Description | Typical Use Cases | Temperature Range |
|----------------|-------------|-------------------|-------------------|
| **Oven Roasting** | Dry heat cooking in enclosed oven | Roasts, whole poultry, casseroles | 150-230°C (300-450°F) |
| **Oven Baking** | Gentle dry heat for even cooking | Fish fillets, chicken breasts | 175-200°C (350-400°F) |
| **Stove-top Pan Fry** | Direct heat in pan with oil | Steaks, chops, fish fillets | High heat |
| **Stove-top Pan Sear** | High heat for crust, then finish | Steaks (sear + oven finish) | Very high heat |
| **Stove-top Sauté** | Quick cooking with movement | Vegetables, thin cuts | Medium-high heat |
| **Stove-top Braising** | Slow cooking in liquid | Tough cuts, stews | Low heat, long time |
| **Stove-top Poaching** | Gentle cooking in liquid | Fish, eggs, chicken breast | 70-82°C (160-180°F) |
| **Air Fryer** | Rapid hot air circulation | Chicken, fish, vegetables | 175-200°C (350-400°F) |
| **Sous Vide** | Precision water bath cooking | All proteins, eggs | Precise temp (varies) |
| **Slow Cooker** | Low, slow moist heat | Stews, pulled meats, roasts | Low: 85°C, High: 150°C |
| **Pressure Cooker** | High-pressure steam cooking | Tough cuts, beans, stocks | 115-120°C (240-250°F) |
| **Grill** | Direct radiant heat | Steaks, burgers, vegetables | High heat |
| **Smoker** | Low heat with smoke | Brisket, ribs, pork shoulder | 95-135°C (200-275°F) |

---

### Comprehensive Temperature Reference by Protein and Cut

For any cooking management system to properly replicate MEATER app functionality, it must support the following protein types, cuts, and doneness levels:

#### Beef Cuts and Target Temperatures

| Cut Type | Rare | Medium-Rare | Medium | Medium-Well | Well-Done | Pulled/Braised |
|----------|------|-------------|--------|-------------|-----------|----------------|
| **Steaks (Ribeye, Sirloin, Strip, Filet)** | 49-52°C (120-125°F) | 54-57°C (130-135°F) | 60-63°C (140-145°F) | 66-68°C (150-155°F) | 71°C+ (160°F+) | N/A |
| **Roasts (Prime Rib, Tenderloin)** | 49-52°C | 54-57°C | 60-63°C | 66-68°C | 71°C+ | N/A |
| **Pot Roast (Chuck, Shoulder)** | N/A | N/A | N/A | N/A | N/A | 90-96°C (195-205°F) |
| **Brisket** | N/A | N/A | N/A | N/A | N/A | 90-96°C (195-205°F) |
| **Short Ribs** | N/A | N/A | N/A | N/A | N/A | 90-96°C (195-205°F) |
| **Ground Beef (Burgers)** | ⚠️ | ⚠️ | 71°C (160°F) min | 71°C+ | 71°C+ | N/A |

*⚠️ USDA recommends 160°F minimum for ground beef for food safety*

#### Pork Cuts and Target Temperatures

| Cut Type | Medium | Medium-Well | Well-Done | Pulled/BBQ |
|----------|--------|-------------|-----------|------------|
| **Chops, Tenderloin** | 63°C (145°F) + rest | 66°C (150°F) | 71°C (160°F) | N/A |
| **Loin Roast** | 63°C (145°F) + rest | 66°C (150°F) | 71°C (160°F) | N/A |
| **Pork Shoulder/Butt** | N/A | N/A | N/A | 90-96°C (195-205°F) |
| **Pork Belly** | N/A | N/A | 71°C (160°F) | 90°C (195°F) for tender |
| **Ribs (Baby Back, Spare)** | N/A | N/A | N/A | 90-96°C (195-205°F) |
| **Ham** | N/A | N/A | 63°C (145°F) fresh, 60°C (140°F) pre-cooked | N/A |
| **Ground Pork** | ⚠️ 71°C (160°F) min | 71°C+ | 71°C+ | N/A |

#### Poultry - Chicken & Turkey

| Cut Type | Safe Minimum | Recommended |
|----------|--------------|-------------|
| **Whole Chicken/Turkey** | 74°C (165°F) | 74-77°C (165-170°F) |
| **Breast** | 74°C (165°F) | 74°C (165°F) - avoid overcooking |
| **Thighs, Legs, Wings** | 74°C (165°F) | 77-82°C (170-180°F) for tender texture |
| **Ground Poultry** | 74°C (165°F) | 74°C (165°F) |

*Note: Poultry does not have doneness levels - always cook to safe minimum*

#### Fish & Seafood

| Fish Type | Medium-Rare | Medium | Well-Done/Safe |
|-----------|-------------|--------|----------------|
| **Salmon (fillet, steak)** | 49-52°C (120-125°F) | 54-57°C (130-135°F) | 63°C (145°F) |
| **Tuna (steak)** | 43-49°C (110-120°F) seared | 52-54°C (125-130°F) | 63°C (145°F) |
| **White Fish (Cod, Halibut, Bass)** | N/A | 54-57°C (130-135°F) | 63°C (145°F) |
| **Swordfish** | N/A | 54-57°C (130-135°F) | 63°C (145°F) |
| **Shrimp, Lobster** | N/A | N/A | 63°C (145°F) - until opaque |
| **Shellfish (Mussels, Clams)** | N/A | N/A | Until shells open |

*Note: Sushi-grade fish may be served raw; otherwise USDA recommends 145°F*

#### Lamb Cuts and Target Temperatures

| Cut Type | Rare | Medium-Rare | Medium | Medium-Well | Well-Done |
|----------|------|-------------|--------|-------------|-----------|
| **Leg of Lamb** | 49-52°C | 54-57°C | 60-63°C | 66-68°C | 71°C+ |
| **Rack of Lamb** | 49-52°C | 54-57°C | 60-63°C | 66-68°C | 71°C+ |
| **Lamb Chops** | 49-52°C | 54-57°C | 60-63°C | 66-68°C | 71°C+ |
| **Lamb Shoulder** | N/A | N/A | N/A | N/A | 90-96°C (pulled) |
| **Ground Lamb** | ⚠️ 71°C min | ⚠️ 71°C min | 71°C+ | 71°C+ | 71°C+ |

#### Game Meats

| Meat Type | Medium-Rare | Medium | Well-Done |
|-----------|-------------|--------|-----------|
| **Venison (steaks)** | 54-57°C | 60-63°C | 71°C+ |
| **Venison (roasts)** | 54-57°C | 60-63°C | 71°C+ |
| **Duck Breast** | 54-57°C (pink) | 60-63°C | 71°C+ |
| **Wild Boar** | N/A | 63°C (145°F) min | 71°C+ |

#### Vegetables (Kitchen Cooking)

| Vegetable | Cooking Method | Target Temperature/Time | Notes |
|-----------|----------------|------------------------|-------|
| **Potatoes (baked)** | Oven | 93-98°C (200-210°F) internal | Fork-tender |
| **Potatoes (roasted)** | Oven/Air Fryer | Until golden, 200°C (400°F) oven | 25-35 min |
| **Root Vegetables (carrots, parsnips)** | Oven/Air Fryer | Until tender | 20-30 min at 200°C |
| **Corn on the cob** | Boil/Steam/Grill | Until tender | 10-15 min boil, 15-20 grill |
| **Bell Peppers** | Roast/Sauté | Until softened or charred | 10-15 min |
| **Mushrooms** | Sauté/Roast | Until caramelized | 8-12 min |
| **Zucchini/Squash** | Sauté/Roast/Air Fryer | Until tender | 8-15 min |
| **Asparagus** | Roast/Sauté/Steam | Until tender-crisp | 5-10 min |
| **Broccoli** | Steam/Roast/Air Fryer | Until bright green, tender | 5-8 min steam, 12-15 roast |
| **Brussels Sprouts** | Roast/Air Fryer | Until golden, tender | 20-25 min at 200°C |
| **Cauliflower** | Roast/Steam/Air Fryer | Until tender | 15-20 min |

---

### Doneness Levels Summary

Any guided cook system should support at minimum these doneness levels:

| Level | Description | Typical Temperature Range |
|-------|-------------|---------------------------|
| **Rare** | Cool red center | 49-52°C (120-125°F) |
| **Medium-Rare** | Warm red center | 54-57°C (130-135°F) |
| **Medium** | Warm pink center | 60-63°C (140-145°F) |
| **Medium-Well** | Slightly pink center | 66-68°C (150-155°F) |
| **Well-Done** | No pink, fully cooked | 71°C+ (160°F+) |
| **Pulled/Braised** | Collagen breakdown, shreddable | 90-96°C (195-205°F) |

---

### Cooking Method + Protein Combinations

The MEATER app adjusts timing and guidance based on cooking method. Key combinations:

| Protein | Oven Roast | Pan Sear | Air Fryer | Sous Vide | Braise/Slow Cook |
|---------|------------|----------|-----------|-----------|------------------|
| **Beef Steak** | ✅ | ✅ | ✅ | ✅ | ❌ |
| **Beef Roast** | ✅ | ❌ | ❌ | ✅ | ✅ (pot roast) |
| **Pork Chops** | ✅ | ✅ | ✅ | ✅ | ❌ |
| **Pork Shoulder** | ✅ (slow) | ❌ | ❌ | ✅ | ✅ |
| **Chicken Breast** | ✅ | ✅ | ✅ | ✅ | ❌ |
| **Chicken Thighs** | ✅ | ✅ | ✅ | ✅ | ✅ |
| **Whole Chicken** | ✅ | ❌ | ✅ | ❌ | ❌ |
| **Salmon Fillet** | ✅ | ✅ | ✅ | ✅ | ❌ |
| **White Fish** | ✅ | ✅ | ✅ | ✅ | ❌ |
| **Lamb Chops** | ✅ | ✅ | ✅ | ✅ | ❌ |
| **Lamb Shoulder** | ✅ (slow) | ❌ | ❌ | ✅ | ✅ |

---

### Grill Buddy for Home Assistant 🌟 (Best Alternative for Guided Cooks)

**GitHub:** https://github.com/jeroenterheerdt/grillbuddy  
**Type:** Custom Home Assistant Integration (HACS)

**Current Features:**

| MEATER Feature | Grill Buddy Equivalent |
|----------------|----------------------|
| Meat & Doneness Presets | ✅ Protein presets (beef, pork, chicken, fish) with doneness levels |
| Doneness Levels | ✅ Rare, Medium-Rare, Medium, Medium-Well, Well-Done |
| Specific Cut Selection | ✅ Supports different cuts (ribeye, brisket, chicken breast, etc.) |
| Target Temperature | ✅ Set specific target temperature per probe |
| Cook Time Estimation | ✅ "Time to target" prediction with countdown |
| Goal Reached Notification | ✅ Status changes from "goal_not_reached" to "goal_reached" |
| Temperature Range Monitoring | ✅ Monitor within specific ranges |
| Out-of-Range Alerts | ✅ Notifications when temp falls outside limits |
| Multiple Probes | ✅ Supports multiple probe sensors |

**Presets Available:**
- **Proteins:** Beef, Pork, Chicken, Fish, Lamb, and more
- **Cuts:** Steak (ribeye, sirloin, filet), brisket, pork shoulder, tenderloin, chicken breast/thighs, salmon, etc.
- **Doneness:** Rare, Medium-Rare, Medium, Medium-Well, Well-Done
- **Special modes:** Pulled/BBQ (195-205°F for collagen breakdown)
- **Planned additions:** Hot smoke (52-80°C), Cold smoke (20-30°C), BBQ smoke (102-110°C)

**Setup with Any Probe:**
```yaml
# Example automation for goal reached
alias: Grill Buddy Steak Done
trigger:
  - platform: state
    entity_id: sensor.grill_buddy_steak
    attribute: Status
    from: goal_not_reached
    to: goal_reached
action:
  - service: notify.mobile_app
    data:
      message: "Your steak is ready!"
```

**Installation:**
1. Install via HACS (search "Grill Buddy")
2. Add integration in Home Assistant
3. Configure probes via sidebar panel
4. Select protein type, cut, and doneness
5. Build automations for notifications

---

### Comparison: MEATER App vs Grill Buddy

| Feature | MEATER App | Grill Buddy |
|---------|------------|-------------|
| Meat type selection | ✅ Extensive | ✅ Extensive (beef, pork, chicken, fish, lamb) |
| Specific cut selection | ✅ Yes | ✅ Yes (ribeye, tenderloin, shoulder, etc.) |
| Doneness levels | ✅ 6 levels | ✅ 6 levels (rare, medium-rare, medium, medium-well, well, pulled) |
| Cooking method selection | ✅ Oven/Stove/Air Fryer/Sous Vide | ❌ Not applicable (hardware agnostic) |
| Time estimation | ✅ Yes | ✅ Yes ("Time to target") |
| Rest time calculation | ✅ Yes | ❌ Not yet (can be added via HA automation) |
| Step-by-step guidance | ✅ Yes | ❌ Not yet |
| Multiple probes | ✅ With MEATER Block | ✅ Yes |
| Works with any probe | ❌ MEATER only | ✅ Any HA sensor |
| Fish/Seafood support | ✅ Yes | ✅ Yes (salmon, tuna, white fish) |
| Vegetable support | ❌ Limited | ✅ Can set custom temps |
| Notifications | ✅ Push | ✅ Via HA automations |
| History/logging | ✅ In-app | ✅ Via HA history |
| Price | Included with probe | Free (open source) |

**Key Insight:** Grill Buddy provides ~90% of MEATER app functionality with comprehensive protein types, cuts, and doneness levels. It works with ANY temperature probe connected to Home Assistant, making it ideal for kitchen cooking scenarios.

---

### Other Home Assistant Integrations

#### Native MEATER Integration

Home Assistant has a native MEATER integration that works with MEATER Cloud:

**Documentation:** https://www.home-assistant.io/integrations/meater/

**Features:**
- Track internal and ambient temperatures
- Works via MEATER Cloud account
- Can be combined with Grill Buddy for guided cooks

**Limitation:** Requires MEATER Cloud connectivity (not local-only)

---

#### Native Inkbird Integration

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
3. Use **Grill Buddy** for guided cook functionality (see Part 3)
4. Accept that MEATER phone app won't work with this setup

**Guided Cook Features with Grill Buddy:**
- Select protein type (beef, pork, chicken, fish, lamb) and specific cuts
- Choose from 6 doneness levels (rare, medium-rare, medium, medium-well, well-done, pulled)
- Set target temperatures per probe for any cooking method (oven, stove-top, air fryer, sous vide)
- Get "time to target" predictions
- Receive notifications when goal is reached
- Monitor temperature ranges and get out-of-range alerts

**Pros:**
- Simpler architecture (no BLE server)
- BLE client connection to MEATER probes is proven to work
- **Grill Buddy provides ~90% of MEATER app cooking features**
- Works with any temperature probe in Home Assistant
- Supports all kitchen cooking methods (oven, stove-top, air fryer, sous vide, etc.)
- Open source and customizable

**Cons:**
- MEATER app still doesn't work
- Users need Home Assistant
- Missing: rest time calculation, step-by-step guidance (can be added via automations)

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
