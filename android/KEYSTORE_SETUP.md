# Signed Release APK — Keystore Setup

The release APK is signed using a keystore file. Follow these steps once to configure signing.

## 1. Generate a keystore (run once, keep it safe)

```bash
keytool -genkey -v \
  -keystore meater-release.keystore \
  -alias meater \
  -keyalg RSA -keysize 2048 \
  -validity 10000
```

Place the resulting `meater-release.keystore` file in `android/app/`.
**Do NOT commit it to git** — it is in `.gitignore`.

## 2. Local builds — create keystore.properties

Create `android/keystore.properties` (also gitignored):

```properties
storeFile=app/meater-release.keystore
storePassword=YOUR_STORE_PASSWORD
keyAlias=meater
keyPassword=YOUR_KEY_PASSWORD
```

Now `./gradlew :app:assembleRelease` will produce a signed APK.

## 3. CI (GitHub Actions) — set secrets

In your GitHub repository → Settings → Secrets and variables → Actions, add:

| Secret name        | Value                                             |
|--------------------|---------------------------------------------------|
| `KEYSTORE_BASE64`  | `base64 -i meater-release.keystore` output        |
| `KEYSTORE_PASSWORD`| Store password you set in step 1                  |
| `KEY_ALIAS`        | `meater`                                          |
| `KEY_PASSWORD`     | Key password you set in step 1                    |

The `publish-apk` workflow will then produce a signed release APK on every GitHub Release.

## 4. Without a keystore

If no keystore is configured (neither env vars nor `keystore.properties`), the release build
skips signing. The debug APK is always produced regardless.
