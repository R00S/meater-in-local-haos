# Issue with meater.app.new Directory

## Problem

The `meater.app.new` directory in the repository contains the **wrong APK**. It appears to be the **Aptoide app store** (package: `cm.aptoide.pt`) instead of the **MEATER app** (package: `com.apptionlabs.meater`).

## Verification

The validator now automatically detects this issue:

```bash
$ python3 tools/validate_from_parsed_code.py meater.app.new

❌ ERROR: This appears to be the Aptoide app, not MEATER
   Package: package cm.aptoide.p092pt.view;

   The MEATER app should have package name starting with:
   'com.apptionlabs.meater'
```

## Impact

The protocol validator cannot analyze the MEATER app protocol by parsing the wrong app's code. The validator is designed to extract BLE operations from the decompiled MEATER app to ensure our ESP32 implementation matches the app's expectations.

## Solution

### Option 1: Replace with Correct MEATER App (Recommended)

1. Download the latest MEATER Android APK from:
   - Google Play Store (requires extraction tools)
   - APKMirror: https://www.apkmirror.com/apk/apption-labs-ltd/meater/
   - APKPure: https://apkpure.com/meater/com.apptionlabs.meater

2. Decompile the APK using jadx:
   ```bash
   jadx -d meater.app.new meater-latest.apk
   ```

3. Verify the decompilation contains the correct package:
   ```bash
   python3 tools/validate_from_parsed_code.py meater.app.new
   ```

### Option 2: Continue Using Existing meater_app

The existing `meater_app` directory contains a valid (though older) version of the decompiled MEATER app. If the protocol hasn't changed significantly, this is sufficient:

```bash
# Use default meater_app directory
python3 tools/validate_from_parsed_code.py
```

## Checking for Protocol Changes

Once you have a correctly decompiled new MEATER app:

### 1. Extract operations from the new app

```bash
python3 tools/validate_from_parsed_code.py meater.app.new
```

### 2. Compare with old app

```bash
# Extract from old app
python3 tools/validate_from_parsed_code.py meater_app > old_results.txt

# Extract from new app (once you have the correct APK)
python3 tools/validate_from_parsed_code.py meater.app.new > new_results.txt

# Compare
diff old_results.txt new_results.txt
```

### 3. Look for differences in:

- **BLE Service UUIDs**: If the service UUIDs changed, our BLE server needs updating
- **Characteristic UUIDs**: If characteristic UUIDs changed, we need to update characteristic definitions
- **Pairing logic**: If `isPaired()` or `datePaired` fields changed, update our NVS storage implementation
- **Data format**: If the temperature/battery data format changed, update our data encoding

## Expected Differences Between App Versions

When comparing old and new MEATER app versions, you might find:

1. **New BLE characteristics**: Additional sensors or features
2. **Changed pairing flow**: Enhanced security or connection handling
3. **Updated data encoding**: More efficient protobuf messages
4. **New device types**: Support for MEATER Block, MEATER+, etc.

## Current Validator Capabilities

The validator (`validate_from_parsed_code.py`) can:

- ✅ Detect if a directory contains the correct MEATER app
- ✅ Parse BLE operations from non-obfuscated Java code
- ✅ Extract pairing logic (isPaired, datePaired)
- ✅ Identify scanning and connection patterns
- ✅ Validate our implementation against extracted requirements

The validator **cannot**:

- ❌ Parse heavily obfuscated code (ProGuard with aggressive settings)
- ❌ Automatically decompile APKs (requires jadx or similar)
- ❌ Handle completely restructured codebases without updates

## Updating the Validator

If the new MEATER app has significant structural changes, the validator may need updates:

### 1. Update class name patterns

Edit `JavaCodeParser` in `validate_from_parsed_code.py`:

```python
def parse_nearby_devices_fragment(self):
    # Update to find new class names
    files = self.find_java_files('DeviceScanFragment')  # New name?
```

### 2. Update method signatures

If method names changed:

```python
# Old
is_paired = self.extract_method_body(content, 'public boolean isPaired()')

# New (example)
is_paired = self.extract_method_body(content, 'public boolean isDevicePaired()')
```

### 3. Add new operation types

If the app has new BLE operations:

```python
# Add to parse_all()
self.parse_new_ble_feature()
```

## Conclusion

The `meater.app.new` directory needs to be replaced with a correctly decompiled MEATER app to:

1. Verify the BLE protocol hasn't changed
2. Update our implementation if it has changed
3. Ensure compatibility with the latest MEATER app

Until then, the existing `meater_app` directory provides protocol information from a working (older) version of the app.

## How to Get Help

If you need assistance:

1. **Finding the correct APK**: Check APKMirror or APKPure
2. **Decompiling the APK**: Use jadx with default settings
3. **Updating the validator**: Open an issue describing what changed in the new app structure

