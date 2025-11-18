# BLE Connection Validator - Usage Guide

## Overview

The BLE Connection Validator (`validate_ble_connection.py`) is a tool that interprets decompiled MEATER app code line-by-line to understand the BLE connection process, then validates your BLE implementation against this extracted flow.

**Key Design Principles:**
- **No Assumptions**: Doesn't assume how the app works - extracts behavior from decompiled code
- **Line-by-Line Interpretation**: Parses Java code to understand what the app does at each step
- **Version Agnostic**: Works with different decompiled app versions
- **Independent Layer**: Acts as a test layer between decompiled app and your implementation

## How It Works

### 1. Code Parsing Phase

The validator scans decompiled Java code for BLE-related operations:

```
Decompiled App Code (Input)
    ↓
JavaBleCodeParser
    ↓
Extracted Connection Flow (sequence of actions)
```

**What it extracts:**
- Scan filters (service UUIDs)
- Device name patterns
- Manufacturer IDs in advertising data
- Connection sequence (scan → connect → discover → read → subscribe)
- Expected characteristics and their properties

### 2. Validation Phase

The validator executes each extracted action against your BLE device:

```
Your BLE Device ← BleConnectionValidator → Extracted Connection Flow
    ↓                                            ↓
Actual Behavior                          Expected Behavior
    ↓                                            ↓
         Comparison & Validation Result
```

**For each step:**
- Executes the action exactly as the app would
- Compares actual response with expected behavior
- Reports success/failure with details
- Continues to next step or stops on critical failure

## Installation

### Prerequisites

```bash
# Python 3.7 or higher
python3 --version

# Install BLE library (optional for simulation mode)
pip install bleak

# Or use without bleak for simulation-only testing
```

### Project Structure

```
tools/
├── validate_ble_connection.py    # Main validator script
├── BLE_VALIDATOR_USAGE.md        # This file
└── example_ble_responses.json    # (optional) Simulated responses
```

## Usage

### Basic Usage

```bash
# Test against live BLE device
python validate_ble_connection.py E4:B3:23:C2:92:F4

# Run in simulation mode (no real BLE hardware needed)
python validate_ble_connection.py --simulate

# Specify decompiled app path
python validate_ble_connection.py E4:B3:23:C2:92:F4 --app-path ./meater_app

# Save validation results
python validate_ble_connection.py E4:B3:23:C2:92:F4 --output results.json
```

### Advanced Usage

```bash
# Use specific app version
python validate_ble_connection.py E4:B3:23:C2:92:F4 --app-version v5.11.0

# Combine options
python validate_ble_connection.py E4:B3:23:C2:92:F4 \
    --app-path ./meater_app \
    --app-version v5.11.0 \
    --output validation_results.json
```

## Output Format

### Console Output

The validator prints detailed step-by-step progress:

```
======================================================================
PARSING BLE CONNECTION FLOW FROM DECOMPILED APP
======================================================================

Found 8 BLE-related Java files

Parsing: BleManager.java
  Found scan filter: a75cc7fc-c956-488f-ac2a-2dbc08b63a04
  Found device name: MEATER
  Found manufacturer ID: 0x037B
  Found 12 BLE actions

======================================================================
EXTRACTION COMPLETE
======================================================================
Scan filters: 1
Connection actions: 12

======================================================================
VALIDATING BLE CONNECTION FLOW
======================================================================

Action: scan
  Source: scanner.startScan(filters);
  [ 1] ✓ Scanning for devices...
     Scanning with filters: ['a75cc7fc-c956-488f-ac2a-2dbc08b63a04']
  [ 2] ✓ Found 1 matching device(s)
       - MEATER (E4:B3:23:C2:92:F4)

Action: connect
  Source: device.connectGatt(context, false, callback);
  [ 3] ✓ Connecting to E4:B3:23:C2:92:F4...
  [ 4] ✓ Connected successfully

Action: discover_services
  Source: gatt.discoverServices();
  [ 5] ✓ Discovering services...
     Found 3 services:
       - 1800 (Generic Access)
         └─ 2a00 (READ)
       - 180a (Device Information)
         └─ 2a29 (READ)
         └─ 2a24 (READ)
         └─ 2a26 (READ)
       - a75cc7fc-c956-488f-ac2a-2dbc08b63a04 (MEATER Service)
         └─ 7edda774-045e-4bbf-909b-45d1991a2876 (READ,NOTIFY)
         └─ 2adb4877-68d8-4884-bd3c-d83853bf27b8 (READ,NOTIFY)
  [ 6] ✓ All expected services present

Action: read_characteristic
  Source: gatt.readCharacteristic(firmwareChar);
  [ 7] ✓ Reading characteristic 2a26...
  [ 8] ✓ Read 9 bytes: 76312e302e345f30

======================================================================
VALIDATION COMPLETE
======================================================================
Total steps: 12
Passed: 12
Failed: 0
Overall: SUCCESS
```

### JSON Output

When using `--output`, results are saved in structured JSON:

```json
{
  "success": true,
  "total_steps": 12,
  "passed_steps": 12,
  "failed_steps": 0,
  "step_results": [
    {
      "action": "scan",
      "success": true,
      "details": {
        "devices": [
          {"name": "MEATER", "address": "E4:B3:23:C2:92:F4"}
        ]
      }
    },
    {
      "action": "read_characteristic",
      "uuid": "2a26",
      "success": true,
      "details": {
        "value": "76312e302e345f30",
        "length": 9
      }
    }
  ]
}
```

## Simulation Mode

When you don't have physical BLE hardware, use simulation mode:

```bash
python validate_ble_connection.py --simulate
```

**Benefits:**
- Test code parsing without hardware
- Verify connection flow extraction
- Develop and debug the validator itself
- CI/CD pipeline testing

**Limitations:**
- Cannot catch real BLE implementation issues
- All actions return simulated success
- No actual data validation

## Troubleshooting

### No BLE Actions Found

```
WARNING: No BLE connection sequence found in decompiled code!
```

**Possible causes:**
1. Incorrect app path
2. Code is obfuscated
3. Different code structure than expected

**Solutions:**
```bash
# Verify app path
ls -la meater_app/

# Look for BLE-related files manually
find meater_app/ -name "*Ble*.java"
find meater_app/ -name "*Device*.java"

# Try with explicit path
python validate_ble_connection.py --app-path /full/path/to/meater_app E4:B3:23:C2:92:F4
```

### Bleak Library Not Installed

```
WARNING: bleak library not installed
```

**Solution:**
```bash
pip install bleak

# On Linux, may also need:
sudo apt-get install bluez
```

### Device Not Found During Scan

```
✗ No matching devices found
```

**Possible causes:**
1. Device is off or out of range
2. Device is connected to another app
3. Bluetooth is disabled on your computer

**Solutions:**
```bash
# Check if device is advertising
sudo hcitool lescan

# On Linux, verify Bluetooth is enabled
sudo systemctl status bluetooth
sudo bluetoothctl
> power on
> scan on

# Make sure MEATER app is closed
```

### Connection Refused

```
✗ Connection failed: Device refused connection
```

**Possible causes:**
1. Device already connected elsewhere
2. Device requires pairing
3. Permission issues

**Solutions:**
```bash
# Reset BLE on device (power cycle)
# Unpair device if previously paired
sudo bluetoothctl
> remove E4:B3:23:C2:92:F4

# On Linux, run as root (not recommended) or add user to bluetooth group
sudo usermod -a -G bluetooth $USER
# Log out and back in
```

## Extending the Validator

### Adding New BLE Actions

To support additional BLE operations (e.g., long writes, MTU negotiation):

1. Add to `BleActionType` enum
2. Add extraction pattern in `JavaBleCodeParser.extract_connection_sequence()`
3. Add validation method in `BleConnectionValidator`
4. Call validation method in `validate_connection_flow()`

Example:

```python
# 1. Add enum value
class BleActionType(Enum):
    REQUEST_MTU = "request_mtu"

# 2. Extract from code
elif 'requestMtu' in line:
    mtu_match = re.search(r'requestMtu\((\d+)\)', line)
    action = BleAction(
        action_type=BleActionType.REQUEST_MTU,
        parameters={"mtu": int(mtu_match.group(1)) if mtu_match else 512},
        source_line=line,
        line_number=i + 1
    )
    actions.append(action)

# 3. Add validation
async def validate_request_mtu(self, action: BleAction, client: Optional[BleakClient]) -> Dict[str, Any]:
    requested_mtu = action.parameters.get("mtu", 512)
    self.print_step(f"Requesting MTU: {requested_mtu}...")
    # Implementation here

# 4. Call in flow
elif action.action_type == BleActionType.REQUEST_MTU:
    step_result = await self.validate_request_mtu(action, client)
```

### Supporting Different App Versions

The validator is designed to work with different decompiled versions:

```python
# Version-specific parsing adjustments
def extract_scan_filters(self, java_code: str, app_version: Optional[str] = None) -> List[str]:
    if app_version and app_version.startswith("v4."):
        # Use older pattern for v4.x apps
        pattern = r'OLD_PATTERN'
    else:
        # Use current pattern
        pattern = r'CURRENT_PATTERN'
```

## Integration with Development Workflow

### Pre-commit Testing

```bash
#!/bin/bash
# test-ble-before-commit.sh

echo "Validating BLE implementation..."
python tools/validate_ble_connection.py --simulate

if [ $? -eq 0 ]; then
    echo "✓ BLE validation passed"
    exit 0
else
    echo "✗ BLE validation failed"
    exit 1
fi
```

### CI/CD Pipeline

```yaml
# .github/workflows/validate-ble.yml
name: Validate BLE Implementation

on: [push, pull_request]

jobs:
  validate:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      
      - name: Set up Python
        uses: actions/setup-python@v2
        with:
          python-version: '3.9'
      
      - name: Install dependencies
        run: pip install bleak
      
      - name: Run BLE validator
        run: python tools/validate_ble_connection.py --simulate --output results.json
      
      - name: Upload results
        uses: actions/upload-artifact@v2
        with:
          name: ble-validation-results
          path: results.json
```

## Comparison with UDP Validator

| Feature | UDP Validator | BLE Validator |
|---------|--------------|---------------|
| Protocol | Protobuf over UDP | BLE GATT |
| Input | Packet hex dump | Device MAC address |
| Parsing | ProtoAdapter decode | BLE connection flow |
| Testing | Packet validation | Live connection test |
| Simulation | ✓ | ✓ |
| Hardware Required | No | Yes (except simulation) |

## Future Enhancements

Potential improvements for the validator:

1. **Packet Capture Integration**: Parse BLE packet captures for comparison
2. **Timing Validation**: Verify connection timing matches app expectations
3. **Error Injection**: Test error handling by simulating failures
4. **Multi-Device Testing**: Validate with multiple probes simultaneously
5. **Performance Metrics**: Measure connection time, throughput, etc.
6. **Automated Regression Testing**: Compare results across code changes

## Contributing

When contributing to the validator:

1. Keep parsing logic generic (don't hardcode MEATER-specific logic)
2. Add comprehensive logging for debugging
3. Handle errors gracefully (don't crash on unexpected code structure)
4. Update this documentation with new features
5. Add test cases for new BLE actions

## License

Same as the main project.
