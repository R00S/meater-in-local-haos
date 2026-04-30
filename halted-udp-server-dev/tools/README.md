# MEATER App Code Analysis Tools

This directory contains tools for analyzing the decompiled MEATER Android app to extract BLE protocol information **directly from source code without making assumptions**.

## Philosophy

**NO ASSUMPTIONS OR DEDUCTIONS** - These tools only extract what's explicitly present in the decompiled app code. No protocol testing, simulation, or interpretation.

## Available Tools

### 1. `validate_from_parsed_code.py` ✅

**Purpose:** Extract BLE operations directly from decompiled Java source code.

**What it does:**
- Parses Config.java to extract all UUID constants
- Parses MEATERDevice.java to extract pairing logic (isPaired() method)
- Parses NearbyDevicesFragment.java to extract scanner initialization
- Parses DevicePairingFragment.java to extract GATT operations
- Outputs extracted operations to JSON for reference

**What it does NOT do:**
- Does not make assumptions about protocol behavior
- Does not test or simulate connections
- Does not validate against implementation
- Only reads and extracts actual code

**Usage:**
```bash
# Analyze old non-obfuscated app (default)
python3 validate_from_parsed_code.py

# Analyze specific app directory
python3 validate_from_parsed_code.py meater.app.new

# With custom path
python3 validate_from_parsed_code.py /path/to/decompiled/app
```

**Output:** `extracted_operations.json` containing all extracted code elements

---

### 2. `compare_protocol_versions.py` ✅

**Purpose:** Compare BLE protocol elements between two versions of the MEATER app.

**What it does:**
- Extracts UUID constants from Config.java in both apps
- Searches for corresponding code patterns in obfuscated app
- Compares protocol elements to identify changes
- Reports differences (if any) between versions

**What it does NOT do:**
- Does not assume what UUIDs should be
- Does not test protocol functionality
- Does not validate implementation correctness
- Only compares what's in the actual code

**Usage:**
```bash
python3 compare_protocol_versions.py
```

**Output:** 
- Console report of comparison results
- `protocol_elements_old.json` - UUIDs from old app
- `protocol_comparison_findings.json` - Comparison results

---

### 3. `trace_add_probe_flow.py` ✅

**Purpose:** Trace the complete "Add Probe" flow through decompiled app code.

**What it does:**
- Follows code paths in NearbyDevicesFragment, DevicePairingFragment
- Extracts actual method calls and control flow
- Maps out the sequence of BLE operations
- Documents what the app does during pairing

**What it does NOT do:**
- Does not simulate the pairing process
- Does not test against ESP32 implementation
- Does not make assumptions about expected behavior
- Only traces actual code execution paths

**Usage:**
```bash
python3 trace_add_probe_flow.py
```

---

## Documentation Files

### `MEATER_APP_NEW_ISSUE.md`
Explains the obfuscation challenge with meater.app.new and documents the structure of the decompiled apps.

### `PROTOCOL_COMPARISON_RESULTS.md`
Complete analysis results showing that BLE protocol is unchanged between app versions v3.x and v4.6.3.

---

## JSON Output Files

### `extracted_operations.json`
All operations extracted by `validate_from_parsed_code.py` including:
- 29 UUID constants from Config.java
- isPaired() method implementation
- Scanner initialization code
- GATT connection operations

### `protocol_elements_old.json`
Protocol elements (UUIDs, constants) extracted from old non-obfuscated app.

### `protocol_comparison_findings.json`
Detailed comparison results between old and new app versions.

---

## Removed Tools (Made Assumptions)

The following types of tools have been removed because they made assumptions, tested, simulated, or validated the protocol:

- **Test scripts** (test_*.py) - Made assumptions about expected behavior
- **Validation scripts** (validate_*.py except validate_from_parsed_code.py) - Validated against assumed protocol
- **Simulation scripts** (simulate_*.py, demonstrate_*.py) - Simulated protocol behavior
- **Analysis scripts** (analyze_*.py) - Made deductions about protocol
- **Protocol documentation** (PROTOCOL_ANALYSIS_NOTES.md, etc.) - Contained interpretations

These tools were useful for development but should not be relied upon as they contained assumptions rather than direct code extraction.

---

## Key Findings (From Direct Code Extraction)

### Protocol Unchanged Between Versions ✅

Comparison between old app (v3.x non-obfuscated) and new app (v4.6.3 obfuscated) shows:

**All 29 UUID constants identical:**
```
MEATERBLETemperatureServiceUUID = "a75cc7fc-c956-488f-ac2a-2dbc08b63a04"
MEATERTemperatureBLECharacteristicUUID = "7edda774-045e-4bbf-909b-45d1991a2876"
MEATERBatteryBLECharacteristicUUID = "2adb4877-68d8-4884-bd3c-d83853bf27b8"
MEATERCookSetupBLECharacteristicUUID = "caf28e64-3b17-4cb4-bb0a-2eaa33c47af7"
... (and 25 more)
```

**Pairing logic identical:**
```java
public boolean isPaired() {
    if (this.datePaired != null) {
        return true;
    }
    return false;
}
```

Source: `extracted_operations.json` and `protocol_comparison_findings.json`

---

## Usage Workflow

1. **Extract protocol from decompiled app:**
   ```bash
   python3 validate_from_parsed_code.py meater_app
   ```

2. **Compare between app versions:**
   ```bash
   python3 compare_protocol_versions.py
   ```

3. **Trace pairing flow in app:**
   ```bash
   python3 trace_add_probe_flow.py
   ```

4. **Review extracted data:**
   - Check `extracted_operations.json` for all protocol elements
   - Check `protocol_comparison_findings.json` for version differences

---

## Contributing

When adding new tools, ensure they:
- ✅ Extract information directly from decompiled code
- ✅ Make zero assumptions about protocol behavior
- ✅ Only report what's explicitly in the source
- ❌ Do not test, simulate, or validate protocols
- ❌ Do not make deductions or interpretations
- ❌ Do not contain hardcoded expected values

---

## See Also

- `/meater.yaml` - ESPHome configuration for ESP32 MEATER probe
- `/includes/meater_bluedroid_server.h` - BLE server implementation
- `/CRITICAL_BLE_FIX_NEEDED.md` - Root cause analysis (in parent directory)
- `/FIX_VALIDATION_REPORT.md` - Fix validation results (in parent directory)
