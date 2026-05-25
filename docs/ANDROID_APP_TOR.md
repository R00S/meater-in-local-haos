# Terms of Reference

## MEATER Kitchen Android App – Standalone Cooking Companion

**Version:** 1.0  
**Created:** 2026-05-25  
**Status:** Planning  
**Branch:** `copilot/bump-version-a-b-c-d`

---

## 1. Purpose

Build a standalone Android application that replicates the core MEATER+ cooking experience without requiring Home Assistant or cloud connectivity.

The app shall:
- Communicate directly with a MEATER probe via BLE (using Android's BLE stack — replacing the ESP32 BLE client role)
- Present the full cooking UI from the Kitchen Cooking Engine (KCE) HAOS app
- Support all meat cuts, temperatures, doneness levels, and recipes from KCE
- Support both English and Swedish languages
- Work entirely offline on a local Android device

---

## 2. Scope

### 2.1 In Scope

| Component | Description |
|-----------|-------------|
| **BLE Backend** | Android BLE client connecting directly to MEATER probe; mirrors ESP32 meater+ block communication |
| **Cooking UI** | Full cooking panel matching KCE HAOS frontend; same protein tree, cuts, doneness, temp targets |
| **Recipe Data** | All KCE:CUT recipe files (www/recipes/) and cooking temps; same data as HAOS panel |
| **Cuisine Data** | All KCE:CUISINE files (www/cuisines/); Swedish and International |
| **Languages** | English and Swedish (same strings as HAOS panel) |
| **Cooking Algorithm** | Dynamic ETA, resting phase, carryover prediction — same algorithm as sensor.py |
| **Notifications** | Local Android notifications at key cooking moments |
| **Session History** | Local storage of cook history with notes |

### 2.2 Out of Scope (v1.0)

| Excluded | Reason |
|----------|--------|
| MEATER 2 / original MEATER probes | MEATER+ only for v1.0; protocol differences not yet fully mapped |
| MEATER Block emulation (UDP/protobuf) | Complex; halted in halted-udp-server-dev; not needed for direct BLE path |
| Home Assistant integration | App is standalone; no HA dependency |
| Cloud connectivity | Local-only by design |
| iOS version | Android-only for v1.0 |
| Multi-probe support | Single MEATER+ probe for v1.0 |

---

## 3. Hardware Constraint

> ⚠️ **Critical**: The MEATER+ Block enforces a 1-to-1 BLE connection chain. When the Block is cloud-connected, it holds the BLE slot to the probe exclusively. The Android app can only connect to the probe when:
> - The MEATER+ Block is powered off, OR
> - The Block is in a disconnected/standby state (not actively relaying to cloud)

This means: the Android app is a **direct-to-probe** BLE client. It bypasses the Block entirely. The user must power off the Block (or ensure it is not active) when using the Android app.

This is the same constraint as the ESP32 client path.

---

## 4. Architecture

```
┌─────────────────────────────────────────────────────┐
│                 Android App                          │
│                                                      │
│  ┌─────────────────┐    ┌──────────────────────────┐ │
│  │  BLE Backend    │    │  Cooking UI              │ │
│  │                 │    │                          │ │
│  │ Android BLE API │    │ WebView or Compose UI    │ │
│  │ (replaces ESP32)│    │ (KCE cooking panel port) │ │
│  │                 │    │                          │ │
│  │ • GATT client   │    │ • Protein/cut tree       │ │
│  │ • Temp decode   │◄───┤ • Doneness selection     │ │
│  │ • Battery       │    │ • Live temp graph        │ │
│  │ • Notifications │    │ • ETA display            │ │
│  └────────┬────────┘    │ • Recipe cards           │ │
│           │             │ • History                │ │
│           │             └──────────────────────────┘ │
└───────────┼─────────────────────────────────────────┘
            │ BLE (GATT)
            ▼
┌───────────────────┐
│  MEATER+ Probe    │
│  (direct BLE)     │
└───────────────────┘
```

### 4.1 BLE Backend

Based on protocol documentation in `halted-ble-server-dev/MEATER_BLE_PROTOCOL.md` and decompiled app code:

- **MEATER Service UUID**: `a75cc7fc-c956-488f-ac2a-2dbc08b63a04`
- **Temperature Characteristic**: `7edda774-045e-4bbf-909b-45d1991a2876` (READ + NOTIFY, 8 bytes)
- **Temperature formula** (from `Temperature.java`): `(raw + 8) / 32` for positive values in °C
- **Ambient formula**: `tip + max(0, (ra - min(48, oa)) * 9424 / 1487)`
- **Battery Characteristic**: `2adb4877-68d8-4884-bd3c-d83853bf27b8`

### 4.2 Cooking UI

The UI shall be a port/reuse of KCE panel functionality:
- Option A: Embed KCE panel JS in a WebView with a local data bridge
- Option B: Native Android (Kotlin/Compose) re-implementation of the KCE UI

Option A (WebView) is preferred for v1.0 — avoids duplicating cooking data and UI logic; the KCE JS panel already works well.

### 4.3 Data Source

All cooking data is consumed from the same sources as KCE:
- `www/recipes/` KCE:CUT files → cooking tree
- `www/cuisines/` KCE:CUISINE files → cuisine/ingredient data
- Cooking temperatures and doneness from the same data structures

The Android app build pipeline will run `generate_frontend_data.py` to produce bundled JS/JSON data assets.

---

## 5. Functional Requirements

### 5.1 BLE Connection

| # | Requirement |
|---|-------------|
| BLE-01 | App shall scan for and connect to a MEATER+ probe via BLE GATT |
| BLE-02 | App shall read and subscribe to temperature characteristic notifications |
| BLE-03 | App shall decode tip temperature and ambient temperature using verified formulas from Temperature.java |
| BLE-04 | App shall read battery level from battery characteristic |
| BLE-05 | App shall handle BLE disconnection gracefully and attempt reconnection |
| BLE-06 | App shall display connection status clearly (scanning / connected / disconnected) |

### 5.2 Cooking Session

| # | Requirement |
|---|-------------|
| COOK-01 | User shall be able to select protein category, cut, and doneness level |
| COOK-02 | App shall display target temperature based on selection (same data as KCE) |
| COOK-03 | App shall display live tip and ambient temperature |
| COOK-04 | App shall calculate and display dynamic ETA using KCE cooking algorithm |
| COOK-05 | App shall detect resting phase and carryover cooking |
| COOK-06 | App shall send Android local notification when approaching target, at remove, and when rest is complete |
| COOK-07 | User shall be able to add notes to a cooking session |
| COOK-08 | Sessions shall be stored locally on device |

### 5.3 Recipe & Cuisine Data

| # | Requirement |
|---|-------------|
| DATA-01 | App shall include all cuts and temperatures from www/recipes/ |
| DATA-02 | App shall include all cuisine data from www/cuisines/ |
| DATA-03 | All recipe and cuisine data shall be bundled offline (no network required) |

### 5.4 Language

| # | Requirement |
|---|-------------|
| LANG-01 | App shall support English and Swedish |
| LANG-02 | Language shall default to device locale; user can override in settings |
| LANG-03 | All meat names, cut names, doneness labels, and UI strings shall be translated |

---

## 6. Non-Functional Requirements

| Category | Requirement |
|----------|-------------|
| **Offline** | App shall function entirely offline; no network requests at runtime |
| **Privacy** | No telemetry, no analytics, no data sent off-device |
| **Platform** | Android 10+ (API 29+) |
| **Permissions** | BLE scan and connect permissions only; no location permission if API 31+ |
| **Performance** | Temperature UI shall update within 1 second of BLE notification |
| **Size** | App install size under 50 MB (cooking data bundled as assets) |

---

## 7. Data Sharing with KCE

The Android app is a **sibling project** within this repository. It shares:

| Shared Asset | Location | Usage |
|--------------|----------|-------|
| KCE:CUT recipe files | `www/recipes/` | Cooking tree, temperatures |
| KCE:CUISINE files | `www/cuisines/` | Cuisine ingredient data |
| JS panel code | `www/panel-class-template.js` | UI logic (WebView option) |
| Generated panel | `www/kitchen-cooking-panel.js` | Bundled in APK (WebView option) |
| BLE protocol docs | `halted-ble-server-dev/MEATER_BLE_PROTOCOL.md` | BLE implementation reference |
| Temperature.java formulas | (documented in BLE_PROTOCOL.md) | Correct decode formulas |

**The cooking data is NOT duplicated.** The Android app build reads the same source files.

---

## 8. Deliverables

| Deliverable | Description |
|-------------|-------------|
| `android/` directory | Android app project (Kotlin, Gradle) in this repository |
| BLE service module | `MeaterBleService.kt` — GATT client, temp decode, notifications |
| Cooking engine module | Port of KCE cooking algorithm (ETA, resting, doneness) to Kotlin |
| UI module | WebView-based panel OR Compose UI |
| Data build script | Script to bundle KCE data assets into APK |
| README for Android | Setup, build instructions, BLE pairing guide |
| Release APK | Distributed via GitHub Releases (same repo) |

---

## 9. Constraints & Risks

| Risk | Mitigation |
|------|-----------|
| BLE probe availability (Block must be off) | Document clearly; show "Block must be off" dialog on connect attempt failure |
| MEATER+ BLE protocol changes in firmware | Pin to known-good probe firmware; document tested version |
| GATT protocol gaps (partial reverse-engineering) | Use verified formulas from Temperature.java; test against real probe |
| WebView performance on older Android | Test on API 29; fall back to Compose if unacceptable |
| Data size growth (cuisines: 12,738 ingredients) | Bundle only cooking tree data in APK v1.0; cuisine optional download |

---

## 10. Success Criteria

The v1.0 release is complete when:

1. ✅ App connects to a MEATER+ probe via BLE (Block powered off)
2. ✅ Live tip and ambient temperatures display correctly
3. ✅ User can select any cut from the full KCE cooking tree
4. ✅ Dynamic ETA calculates and updates in real time
5. ✅ Android notification fires at cooking milestones
6. ✅ App works fully offline in English and Swedish
7. ✅ Cook history with notes is stored locally

---

## 11. Out of Scope — Future Versions

- MEATER 2 / MEATER Block protocol (UDP/protobuf)
- iOS version
- Multi-probe support
- HA integration bridge (sending probe data back to HA)
- AI recipe suggestions

---

*References: `halted-ble-server-dev/MEATER_BLE_PROTOCOL.md`, `halted-ble-server-dev/README.md`, `docs/TERMS_OF_REFERENCE.md`, `custom_components/kitchen_cooking_engine/www/panel-class-template.js`*
