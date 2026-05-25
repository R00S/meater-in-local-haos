# Terms of Reference

## MEATER Kitchen Android App – Standalone Cooking Companion

**Version:** 0.10.0.0  
**Created:** 2026-05-25  
**Status:** Planning  
**Branch:** `copilot/bump-version-a-b-c-d`

---

## 1. Purpose

Build a standalone Android application that replicates the core MEATER+ cooking path KCE without requiring Home Assistant or cloud connectivity.

The app shall:
- Communicate directly with a MEATER+ block via BLE (using Android's BLE stack)
- Present the full MEATER path cooking UI from the Kitchen Cooking Engine (KCE) HAOS app, except for the AI recipe generator; the recipes in the cut files are included
- Support all meat cuts, temperatures, doneness levels, and recipes from KCE cut files — the cut files are the ground truth, exactly as with the KCE MEATER path
- Support both English and Swedish languages
- Work entirely offline on a local Android device

---

## 2. Scope

### 2.1 In Scope

| Component | Description |
|-----------|-------------|
| **BLE Backend** | Android BLE client connecting directly to MEATER+ Block; mirrors MEATER app BLE communication path; supports all probes the Block exposes (up to 4) |
| **Multi-probe** | Simultaneous monitoring of all MEATER+ probes docked in the Block; each probe gets its own cooking session, cut selection, and ETA |
| **Cooking UI** | Full MEATER path cooking panel matching KCE HAOS frontend; same protein tree, cuts, doneness, temp targets; AI recipe generator excluded; cut file recipes included |
| **Recipe Data** | All KCE:CUT recipe files (www/recipes/) — the ground truth for the cooking tree, identical to KCE MEATER path |
| **Languages** | English and Swedish (same strings as HAOS panel) |
| **Cooking Algorithm** | Dynamic ETA, resting phase, carryover prediction — same algorithm as sensor.py |
| **Notifications** | Local Android notifications at key cooking moments, per probe |
| **Session History** | Local storage of cook history with notes |

### 2.2 Out of Scope (v0.10.x)

| Excluded | Reason |
|----------|--------|
| MEATER 2 probe | Different, incompatible BLE protocol (different UUIDs, undocumented — see §9 research note) |
| MEATER Link local UDP/protobuf | Different product (WiFi LAN bridge), not needed; app targets Block BLE directly |
| AI recipe generator | Excluded by design; cut file recipes are included |
| Home Assistant integration | App is standalone; no HA dependency |
| Cloud connectivity | Local-only by design |
| iOS version | Android-only for v0.10.x |

---

## 3. Hardware Constraint

The Android app connects to the **MEATER+ Block** via BLE, exactly as the official MEATER app does. The Block then handles communication with the probe over its own proprietary link.

> ⚠️ **Critical**: The MEATER+ Block enforces a strict 1-to-1 BLE connection chain. When the Block is cloud-connected (WiFi active), it simultaneously holds the BLE slot to the probe — and to the phone. Only one BLE client can connect to the Block at a time.

This means:
- The Android app connects to the Block (not directly to the probe)
- The Block must **not** be connected to MEATER Cloud or any other BLE client while the app is in use
- Disable WiFi on the Block, or ensure it is not cloud-connected, before using the app

This is the same constraint that the ESP32 BLE client path faced against the probe. The app targets the Block end of the chain.

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
│  │ (MEATER+ Block  │    │ (KCE MEATER path port)   │ │
│  │  client)        │    │                          │ │
│  │ • GATT client   │    │ • Protein/cut tree       │ │
│  │ • Temp decode   │◄───┤ • Doneness (per probe)   │ │
│  │ • Battery       │    │ • Live temp graph        │ │
│  │ • Multi-probe   │    │ • ETA display            │ │
│  │ • Notifications │    │ • Recipe cards (cut files│ │
│  └────────┬────────┘    │   only, no AI generator) │ │
│           │             │ • Multi-probe dashboard  │ │
│           │             │ • History                │ │
│           │             └──────────────────────────┘ │
└───────────┼─────────────────────────────────────────┘
            │ BLE (GATT)
            ▼
┌───────────────────┐        ┌────────────────────────┐
│  MEATER+ Block    │◄──────►│  MEATER+ Probes (1–4)  │
│  (not cloud-conn.)│  BLE   │                        │
└───────────────────┘        └────────────────────────┘
```

### 4.1 BLE Backend

The Android app acts as a BLE GATT client to the **MEATER+ Block** — the same role the official MEATER app takes. The Block manages communication with up to 4 MEATER+ probes simultaneously; the app reads all of them through the single BLE connection to the Block.

Based on protocol documentation in `halted-ble-server-dev/MEATER_BLE_PROTOCOL.md` and decompiled app code:

- **MEATER Service UUID**: `a75cc7fc-c956-488f-ac2a-2dbc08b63a04`
- **Temperature Characteristic**: `7edda774-045e-4bbf-909b-45d1991a2876` (READ + NOTIFY, 8 bytes)
- **Temperature formula** (from `Temperature.java`): `(raw + 8) / 32` for positive values in °C
- **Ambient formula**: `tip + max(0, (ra - min(48, oa)) * 9424 / 1487)`
- **Battery Characteristic**: `2adb4877-68d8-4884-bd3c-d83853bf27b8`

### 4.2 Cooking UI

The UI shall be a port/reuse of the KCE MEATER path panel:
- Option A: Embed KCE panel JS in a WebView with a local data bridge (preferred)
- Option B: Native Android (Kotlin/Compose) re-implementation of the KCE MEATER path UI

The AI recipe generator is **excluded**. Cut file recipes (from KCE:CUT files) are **included**.

Option A (WebView) is preferred for v0.10.x — avoids duplicating cooking data and UI logic; the KCE JS panel already works well.

### 4.3 Data Source

The KCE:CUT files in `www/recipes/` are the **ground truth** for the cooking tree — identical to how the KCE MEATER path works in HAOS:
- `www/recipes/` KCE:CUT files → cooking tree, cuts, temperatures, doneness, cut-file recipes
- Cooking temperatures and doneness from the same data structures as KCE

The Android app build pipeline will run `generate_frontend_data.py` to produce bundled JS/JSON data assets. **Cuisine data is excluded from v0.10.x** (cooking path only).

---

## 5. Functional Requirements

### 5.1 BLE Connection

| # | Requirement |
|---|-------------|
| BLE-01 | App shall scan for and connect to a MEATER+ Block via BLE GATT |
| BLE-02 | App shall read and subscribe to temperature characteristic notifications |
| BLE-03 | App shall decode tip temperature and ambient temperature using verified formulas from Temperature.java |
| BLE-04 | App shall read battery level from battery characteristic |
| BLE-05 | App shall handle BLE disconnection gracefully and attempt reconnection |
| BLE-06 | App shall display connection status clearly (scanning / connected / disconnected) |
| BLE-07 | App shall read temperature and battery data for all probes the Block exposes (up to 4) |
| BLE-08 | App shall present a multi-probe dashboard showing all active probes simultaneously |

### 5.2 Cooking Session

| # | Requirement |
|---|-------------|
| COOK-01 | User shall be able to select protein category, cut, and doneness level for each active probe independently |
| COOK-02 | App shall display target temperature based on selection (same data as KCE) |
| COOK-03 | App shall display live tip and ambient temperature for each probe |
| COOK-04 | App shall calculate and display dynamic ETA using KCE cooking algorithm, per probe |
| COOK-05 | App shall detect resting phase and carryover cooking |
| COOK-06 | App shall send Android local notification when approaching target, at remove, and when rest is complete — per probe |
| COOK-07 | User shall be able to add notes to a cooking session |
| COOK-08 | Sessions shall be stored locally on device |

### 5.3 Recipe Data

| # | Requirement |
|---|-------------|
| DATA-01 | App shall include all cuts and temperatures from www/recipes/ KCE:CUT files |
| DATA-02 | KCE:CUT files are the ground truth for the cooking tree — same as KCE MEATER path |
| DATA-03 | Cut file recipes shall be displayed in the cooking UI |
| DATA-04 | AI recipe generator shall NOT be included |
| DATA-05 | All recipe data shall be bundled offline (no network required) |

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
| KCE:CUT recipe files | `www/recipes/` | Cooking tree, temperatures, cut recipes |
| JS panel code | `www/panel-class-template.js` | MEATER path UI logic (WebView option) |
| Generated panel | `www/kitchen-cooking-panel.js` | Bundled in APK (WebView option) |
| BLE protocol docs | `halted-ble-server-dev/MEATER_BLE_PROTOCOL.md` | BLE implementation reference |
| Temperature.java formulas | (documented in BLE_PROTOCOL.md) | Correct decode formulas |

**The cooking data is NOT duplicated.** The Android app build reads the same source files.

---

## 8. Deliverables

| Deliverable | Description |
|-------------|-------------|
| `android/` directory | Android app project (Kotlin, Gradle) in this repository |
| BLE service module | `MeaterBleService.kt` — GATT client to MEATER+ Block, multi-probe temp decode, notifications |
| Cooking engine module | Port of KCE cooking algorithm (ETA, resting, doneness) to Kotlin; one engine instance per probe |
| UI module | WebView-based MEATER path panel OR Compose UI; multi-probe dashboard |
| Data build script | Script to bundle KCE:CUT data assets into APK |
| README for Android | Setup, build instructions, Block cloud-disconnect guide |
| Release APK | Distributed via GitHub Releases (publish-apk workflow); version follows KCE versioning |

---

## 9. Constraints & Risks

| Risk | Mitigation |
|------|-----------|
| BLE Block availability (must not be cloud-connected) | Document clearly; show "Disconnect Block from cloud" dialog on connect failure |
| MEATER+ BLE protocol changes in firmware | Pin to known-good Block firmware; document tested version |
| GATT protocol gaps (partial reverse-engineering) | Use verified formulas from Temperature.java; test against real Block |
| Multi-probe GATT enumeration | Protocol must enumerate all probe slots exposed by Block; test with 2+ live probes |
| WebView performance on older Android | Test on API 29; fall back to Compose if unacceptable |

### 9.1 Research Note — MEATER 2 and MEATER Link

**MEATER 2 probe (BLE)**
MEATER 2 uses a completely different and undocumented BLE protocol from MEATER+. As of 2025, no community effort has successfully reverse-engineered the MEATER 2 GATT services. The UUIDs are different from MEATER+ and the encoding is unknown. This is a genuine dead end until someone captures and decodes the traffic.
**Status: Dead end. Excluded until protocol is documented.**

**MEATER Link (UDP/protobuf)**
MEATER Link is a separate product — a standalone WiFi LAN bridge (not the same as the MEATER+ Block). It broadcasts probe data over UDP using Google Protocol Buffers. The community has partially reverse-engineered the `.proto` schemas (reference: [ccutrer/meater-link-esp32](https://github.com/ccutrer/meater-link-esp32)), but there is no production-quality, complete local integration as of 2025. This path is interesting for a future LAN-based mode but is not required for the Android app, which connects directly to the Block via BLE.
**Status: Partially documented community effort; not a dead end, but not needed for v0.10.x.**

---

## 10. Success Criteria

The v0.10.x first release is complete when:

1. ✅ App connects to a MEATER+ Block via BLE (Block not cloud-connected)
2. ✅ Live tip and ambient temperatures display correctly for each probe
3. ✅ Multi-probe dashboard shows all active probes simultaneously
4. ✅ User can select any cut from the full KCE cooking tree per probe (cut files are ground truth)
5. ✅ Dynamic ETA calculates and updates in real time per probe
6. ✅ Android notification fires at cooking milestones, per probe
7. ✅ App works fully offline in English and Swedish
8. ✅ Cook history with notes is stored locally
9. ✅ publish-apk GitHub Action produces a signed APK on release

---

## 11. Versioning

The Android app version **follows KCE versioning** — it does not start from 1.0. The first release ships as the same version as the KCE integration at the time of release (e.g., `0.10.0.0`). Subsequent app releases increment the `d` component independently when needed.

Version is encoded in the APK `versionName` and displayed in the app's About screen.

---

## 12. Out of Scope — Future Versions

- **MEATER 2 probe support** — different BLE protocol, dead end until reverse-engineered (see §9.1)
- **MEATER Link LAN mode (UDP/protobuf)** — partially documented community effort; viable future addition for a WiFi-based path
- iOS version
- HA integration bridge (sending probe data back to HA)
- AI recipe generator
- Cuisine / ingredient browser

---

*References: `halted-ble-server-dev/MEATER_BLE_PROTOCOL.md`, `halted-ble-server-dev/README.md`, `docs/TERMS_OF_REFERENCE.md`, `custom_components/kitchen_cooking_engine/www/panel-class-template.js`*
