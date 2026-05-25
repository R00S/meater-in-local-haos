# Android App (v0.10.x baseline)

This directory contains the initial Android APK implementation for the standalone MEATER Kitchen app from `docs/ANDROID_APP_TOR.md`.

## Current baseline

- Kotlin Android app project scaffolded with Gradle
- Compose app shell
- BLE scan entry point (`MeaterBleScanner`) for discovering MEATER-named BLE devices
- Local session storage skeleton (`SessionHistoryRepository`)
- App version set to `0.10.0.0` to match ToR versioning

## Build prerequisites

- Android SDK (API 35)
- Java 17

## Build

```bash
cd android
./gradlew assembleDebug
```

## Notes

- This is phase-1 foundation only.
- GATT connection, temperature decode, multi-probe telemetry, and KCE panel asset bundling are not implemented yet.
