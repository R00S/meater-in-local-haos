# Branch Timeline: fix-readme-android-apk-link (0.10.0.x)

## Problem
The README links to `releases/latest/download/meater-kitchen.apk` but the APK is never attached to releases.

## Root Cause
`publish-apk.yml` listens to the `release` event (types: published). However, GitHub Actions **does not allow a workflow using GITHUB_TOKEN to trigger other workflows**. So when `create-test-release.yml` creates a release via API, `publish-apk.yml` is never triggered, and the APK is never attached.

For production releases created through the GitHub UI (by a human), `publish-apk.yml` would work. But all releases in practice are created by `create-test-release.yml`.

## First Attempt (Reverted)
Embed APK build steps directly inside `create-test-release.yml` so APK is built alongside the HACS zip. This was committed then reverted because it tightly coupled the APK release cadence to the integration release — they should be independent.

## Final Solution
- **Deleted** `publish-apk.yml` (the broken release-event workflow)
- **Added** `build-apk.yml` — `workflow_dispatch` only; reads `versionName` from `build.gradle.kts`, builds `app-debug.apk`, commits it as `android/apk/meater-kitchen-<version>.apk` and updates the `android/apk/meater-kitchen-latest.apk` symlink in the repo
- **`create-test-release.yml`** — reverted to produce only the HACS zip (APK build removed)
- **`README.md`** — APK download link changed from `releases/latest/download/meater-kitchen.apk` to raw-main URL pointing at the in-repo symlink `android/apk/meater-kitchen-latest.apk`

## Status
- [x] Root cause identified
- [x] First attempt (embed in create-test-release.yml) tried and reverted
- [x] Final solution implemented: standalone build-apk.yml + APK stored in repo
- [x] create-test-release.yml verified restored to pre-change state (checked against git diff of previous session's commit)
- [x] README APK link updated
- [x] USER_GUIDE.md section 15 updated to reflect new APK distribution method
- [x] Version bumped to 0.10.0.5
