# Branch Timeline: fix-readme-android-apk-link (0.10.0.x)

## Problem
The README links to `releases/latest/download/meater-kitchen.apk` but the APK is never attached to releases.

## Root Cause
`publish-apk.yml` listens to the `release` event (types: published). However, GitHub Actions **does not allow a workflow using GITHUB_TOKEN to trigger other workflows**. So when `create-test-release.yml` creates a release via API, `publish-apk.yml` is never triggered, and the APK is never attached.

For production releases created through the GitHub UI (by a human), `publish-apk.yml` would work. But all releases in practice are created by `create-test-release.yml`.

## Fix
Add APK build and attachment steps directly inside `create-test-release.yml`, so the APK is always built and uploaded alongside the HACS zip whenever a test/beta/rc release is created.

## Status
- [x] Root cause identified
- [x] Fix applied to create-test-release.yml — added Java/Gradle APK build steps before the Python steps, and added meater-kitchen.apk to the release files list
- [x] Timeline file created and committed
