# Android App (v0.10.x baseline)

This directory contains the Android APK implementation for the standalone MEATER Kitchen app from `docs/ANDROID_APP_TOR.md`.

**[Download latest APK](https://github.com/R00S/meater-in-local-haos/releases/latest/download/meater-kitchen.apk)**

## Current baseline

- Kotlin Android app project scaffolded with Gradle
- Compose app shell
- BLE scan entry point (`MeaterBleScanner`) for discovering MEATER-named BLE devices
- BLE GATT connection service (`MeaterBleService`) with:
  - connection/disconnection flow
  - MEATER service/characteristic discovery
  - temperature and battery read + notify handling
  - tip/ambient decode based on documented formulas in ToR
- Local session storage skeleton (`SessionHistoryRepository`)
- App version set to `0.10.0.1` to match current branch release version

## Build prerequisites

- Android SDK (API 35)
- Java 17

## Build

```bash
cd android
./gradlew assembleDebug
```

## Notes

- This is still an early implementation.
- Multi-probe session orchestration, cooking algorithm port, full KCE panel/cut-data bundling, and release workflow are not implemented yet.
