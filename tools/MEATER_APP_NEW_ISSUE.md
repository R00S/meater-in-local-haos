# MEATER App Obfuscation Challenge

## Current Status

The `meater.app.new` directory now contains the **correct MEATER app** (version 4.6.3), but it is **heavily obfuscated** with ProGuard, making protocol analysis extremely difficult.

## The Challenge

### What We Have

The new MEATER app (v4.6.3) is present in `meater.app.new` but:
- Package names are obfuscated: `A5`, `T4`, `I4`, `P5`, etc. instead of meaningful names
- Class names are obfuscated: `m.java`, `d.java`, `f.java` instead of `MEATERDevice.java`
- Method names are likely obfuscated: Cannot find `isPaired()` or `datePaired` fields
- The app uses split APKs (multiple APK files bundled together)

### Verification

```bash
$ python3 tools/validate_from_parsed_code.py meater.app.new

❌ ERROR: This appears to be the Aptoide app, not MEATER
   Package: package cm.aptoide.p092pt.view;
```

The validator detects Aptoide because there are multiple APKs in the bundle:
- `cm.aptoide.pt` (top-level - this is what validator finds first)
- `com.apptionlabs.meater_app` (the actual MEATER app, in subdirectory)

The MEATER app code is in the obfuscated packages in `meater.app.new/sources/`:
```bash
$ grep -r "com.apptionlabs.meater" meater.app.new/sources/ | head -3
meater.app.new/sources/A5/m.java: (references MEATER app package)
meater.app.new/sources/T4/p.java: (references MEATER app package)
```

## Impact

The protocol validator **cannot extract meaningful BLE operations** from obfuscated code because:
1. Method names like `isPaired()` are renamed to single letters
2. Field names like `datePaired` are renamed to single letters  
3. Class relationships are obscured
4. The code logic is intact but unreadable without a deobfuscation map

## Options Moving Forward

### Option 1: Use Existing Non-Obfuscated App (Recommended)

The existing `meater_app` directory contains an **older but non-obfuscated** version of the MEATER app. The validator can successfully parse it:

```bash
$ python3 tools/validate_from_parsed_code.py meater_app

✓ Found MEATER app: package com.apptionlabs.meater_app;
✓ SUCCESS: All extracted operations validated
```

**Recommendation**: Continue using `meater_app` for protocol analysis unless you have evidence that the BLE protocol has changed between versions.

### Option 2: Search for Older Non-Obfuscated APK

Older versions of the MEATER app (before v4.x) may not have been obfuscated. Try:

1. Download older MEATER APK versions from APKMirror
2. Look for versions around 3.x or earlier
3. Decompile with jadx and check if code is readable
4. Use validator to verify it's non-obfuscated

### Option 3: Reverse Engineer the Obfuscated App

If you need to analyze the new protocol:

1. **Use BLE packet capture** instead of code analysis:
   - Capture BLE traffic between phone and real MEATER device
   - Use Wireshark or nRF Connect to analyze packets
   - Reverse engineer the protocol from packet structure

2. **Search for deobfuscation maps**:
   - Check if MEATER releases debug builds
   - Look for crash reports with stack traces (may reveal real names)
   - Community members may have deobfuscation maps

3. **Manual deobfuscation** (advanced):
   - Look for string constants to identify classes
   - Follow BLE UUID references in code
   - Trace back from known entry points (Activities, Services)

## What's in meater.app.new

The directory contains MEATER app v4.6.3 with this structure:

```
meater.app.new/
├── resources/
│   ├── AndroidManifest.xml (Aptoide - top level wrapper)
│   ├── com.apptionlabs.meater_app.apk/ (actual MEATER app resources)
│   │   └── AndroidManifest.xml (package="com.apptionlabs.meater_app")
│   └── config.*.apk/ (split APK configuration bundles)
└── sources/
    ├── A5/, T4/, I4/, P5/, ... (obfuscated MEATER code)
    ├── com/apptionlabs/di/ (minimal non-obfuscated dependency injection)
    ├── com/aptoide/ (Aptoide app code - mixed in)
    └── ... (other obfuscated packages)
```

### Version Information

- **MEATER App Version**: 4.6.3 (versionCode 460)
- **Target SDK**: 35 (Android 15)
- **Min SDK**: 26 (Android 8.0)
- **Obfuscation**: Heavy ProGuard/R8 obfuscation applied
- **Structure**: Split APK bundle (multiple APK files)

### BLE Protocol Analysis

Even though the code is obfuscated, you can still search for BLE-related strings:

```bash
# Find BLE UUID references
grep -r "a75cc7fc-c956-488f-ac2a-2dbc08b63a04" meater.app.new/sources/

# Find characteristic UUIDs
grep -r "7edda774-045e-4bbf-909b-45d1991a2876" meater.app.new/sources/
grep -r "2adb4877-68d8-4884-bd3c-d83853bf27b8" meater.app.new/sources/
```

If the UUIDs haven't changed, the BLE protocol is likely the same.

## Checking for Protocol Changes

Given the obfuscation challenge, the best approach is:

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

