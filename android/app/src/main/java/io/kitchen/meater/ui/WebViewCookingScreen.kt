package io.kitchen.meater.ui

import android.webkit.JavascriptInterface
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import io.kitchen.meater.cooking.CookingSession
import org.json.JSONArray
import org.json.JSONObject

/**
 * Embeds the KCE kitchen-cooking-panel.js panel in an Android WebView.
 * The JS is bundled as an APK asset (android/app/src/main/assets/kitchen-cooking-panel.js).
 *
 * A JS bridge object ("KceAndroid") is injected so the panel can call back into
 * the native app for cooking session management.
 *
 * Live probe data is pushed to JS by calling window.kceAndroidProbeUpdate(...).
 */
@Composable
fun WebViewCookingScreen(
    sessions: Map<Int, CookingSession>,
    language: String,   // "en" or "sv"
    onStartCooking: (probeIndex: Int, cutId: String, doneness: String, targetTempC: Int) -> Unit,
    onStopCooking: (probeIndex: Int) -> Unit
) {
    val webViewRef = remember { mutableStateOf<WebView?>(null) }

    // Push probe data to the panel whenever sessions change
    LaunchedEffect(sessions) {
        val wv = webViewRef.value ?: return@LaunchedEffect
        val payload = buildProbePayloadJson(sessions)
        wv.post {
            wv.evaluateJavascript(
                "if(typeof window.kceAndroidProbeUpdate==='function') window.kceAndroidProbeUpdate($payload);",
                null
            )
        }
    }

    DisposableEffect(Unit) {
        onDispose { webViewRef.value?.destroy() }
    }

    AndroidView(
        factory = { ctx ->
            WebView(ctx).also { wv ->
                webViewRef.value = wv
                with(wv.settings) {
                    javaScriptEnabled = true
                    domStorageEnabled = true
                    allowFileAccessFromFileURLs = true
                    cacheMode = WebSettings.LOAD_NO_CACHE
                }
                wv.webViewClient = WebViewClient()
                wv.addJavascriptInterface(
                    KceBridgeImpl(
                        onStartCooking = onStartCooking,
                        onStopCooking = onStopCooking
                    ),
                    "KceAndroid"
                )
                // Inject the language setting before loading the panel
                wv.loadDataWithBaseURL(
                    "file:///android_asset/",
                    buildHtmlWrapper(language),
                    "text/html",
                    "utf-8",
                    null
                )
            }
        }
    )
}

private fun buildProbePayloadJson(sessions: Map<Int, CookingSession>): String {
    val arr = JSONArray()
    sessions.values.sortedBy { it.probeIndex }.forEach { s ->
        arr.put(JSONObject().apply {
            put("probeIndex", s.probeIndex)
            put("tipC", s.tipCelsius ?: 0.0)
            put("ambientC", s.ambientCelsius ?: 0.0)
            put("battery", s.batteryPercent ?: 0)
            put("state", s.state.name.lowercase())
            put("etaMinutes", s.etaMinutes ?: -1)
            put("targetC", s.targetTempC ?: 0)
            put("cutId", s.cutId)
            put("doneness", s.doneness)
        })
    }
    return arr.toString()
}

/** HTML shell that loads the panel JS and sets language before init. */
private fun buildHtmlWrapper(language: String): String = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <style>body{margin:0;padding:0;}</style>
</head>
<body>
  <script>
    window.KCE_ANDROID_LANGUAGE = '$language';
  </script>
  <script src="kitchen-cooking-panel.js"></script>
</body>
</html>
""".trimIndent()

/**
 * JS interface object exposed as window.KceAndroid inside the WebView.
 * All @JavascriptInterface methods are callable from JavaScript.
 */
class KceBridgeImpl(
    private val onStartCooking: (probeIndex: Int, cutId: String, doneness: String, targetTempC: Int) -> Unit,
    private val onStopCooking: (probeIndex: Int) -> Unit
) {
    @JavascriptInterface
    fun startCooking(probeIndex: Int, cutId: String, doneness: String, targetTempC: Int) {
        onStartCooking(probeIndex, cutId, doneness, targetTempC)
    }

    @JavascriptInterface
    fun stopCooking(probeIndex: Int) {
        onStopCooking(probeIndex)
    }
}

// ─────────────────────────────────────────────────────────────────────────────
// WebViewCutSelectionScreen
//
// Runs the actual KCE kitchen-cooking-panel.js cook path in a WebView so the
// Android app and the HAOS panel share one GUI codebase.  No HA server is
// needed: a minimal mock `hass` object is injected into the page.
//
// The mock hass:
//   • callApi()      → Promise.resolve(null)  — all API calls fail silently
//                      (every try/catch in the panel handles null gracefully)
//   • callService()  → routes 'start_cook' / 'start_simple_probe_cook' to the
//                      KceAndroid JS bridge, ignores everything else
//   • states         → {}   (no HA entities — entity dropdown stays hidden)
//   • user.language  → in-app language setting
//
// On "Start Cook" the bridge calls onStartCook() with the raw serviceData JSON.
// The caller (MainActivity) is responsible for enriching that data (cut display
// name, protein category, rest time) from CookingDataRepository and forwarding
// it to MainViewModel.startCooking().
// ─────────────────────────────────────────────────────────────────────────────

@Composable
fun WebViewCutSelectionScreen(
    probeIndex: Int,
    language: String,
    onStartCook: (probeIndex: Int, cutId: String, doneness: String,
                  customTempC: Int?, cookingMethod: String, dataSource: String) -> Unit,
    onCancel: () -> Unit,
    modifier: Modifier = Modifier
) {
    val webViewRef = remember { mutableStateOf<WebView?>(null) }

    DisposableEffect(Unit) {
        onDispose { webViewRef.value?.destroy() }
    }

    AndroidView(
        modifier = modifier,
        factory = { ctx ->
            WebView(ctx).also { wv ->
                webViewRef.value = wv
                with(wv.settings) {
                    javaScriptEnabled = true
                    domStorageEnabled = true
                    allowFileAccessFromFileURLs = true
                    cacheMode = WebSettings.LOAD_NO_CACHE
                }
                wv.webViewClient = WebViewClient()
                wv.addJavascriptInterface(
                    CutSelectionBridgeImpl(
                        probeIndex = probeIndex,
                        onStartCook = onStartCook,
                        onCancel = onCancel
                    ),
                    "KceAndroid"
                )
                wv.loadDataWithBaseURL(
                    "file:///android_asset/",
                    buildCookPathHtml(language, probeIndex),
                    "text/html",
                    "utf-8",
                    null
                )
            }
        }
    )
}

/**
 * HTML page that:
 * 1. Defines a mock `hass` object (no server required).
 * 2. Loads the bundled kitchen-cooking-panel.js.
 * 3. Creates the <kitchen-cooking-panel> element, sets `hass` and initial state
 *    *before* appending to DOM so the very first LitElement render goes straight
 *    to the MEATER cook path — no flash of the welcome/appliance screen.
 */
private fun buildCookPathHtml(language: String, probeIndex: Int): String {
    // Escape for JS string literal — language is always "en" or "sv" so this is safe,
    // but being explicit avoids any future surprise.
    val langJs = language.replace("'", "\\'")
    return """
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
  <style>
    /*
     * HA-compatible theme variables — the KCE panel (a LitElement) reads these via
     * CSS custom properties that pierce shadow-DOM boundaries.  Without them the panel
     * renders invisible text on a dark background (all vars resolve to 'transparent').
     * Values match the HA default dark theme.
     */
    :root {
      --primary-background-color: #111111;
      --secondary-background-color: #1c1c1e;
      --primary-text-color:        #e5e5ea;
      --secondary-text-color:      #aeaeb2;
      --disabled-text-color:       #636366;
      --divider-color:             #3a3a3c;
      --card-background-color:     #1c1c1e;
      --ha-card-background:        #1c1c1e;
      --primary-color:             #0a84ff;
      --accent-color:              #0a84ff;
      --error-color:               #ff453a;
      --warning-color:             #ffd60a;
      --success-color:             #30d158;
      --info-color:                #64d2ff;
    }
    html, body {
      margin: 0; padding: 0; height: 100%;
      background: var(--primary-background-color);
      /* color inherits into LitElement shadow DOM via CSS cascade */
      color: var(--primary-text-color);
    }
    kitchen-cooking-panel { display: block; min-height: 100vh; }
    /* ha-card is an unknown custom element in standalone mode — give it block layout
       so cards stack vertically rather than rendering inline. */
    ha-card {
      display: block;
      background: var(--ha-card-background);
      border-radius: 12px;
    }
  </style>
</head>
<body>
<script>
  (function() {
    var _lang = '$langJs';
    var _probeIndex = $probeIndex;

    // ── Mock hass ─────────────────────────────────────────────────────────
    // All callApi calls in the panel are wrapped in try/catch; returning null
    // lets every if(response && response.xxx) guard skip gracefully.
    // callService routes cook commands to the Android JS bridge.
    window._mockHass = {
      user:   { name: 'User', language: _lang, is_admin: false },
      config: {
        language: _lang,
        version:  '2024.1.0',
        unit_system: { temperature: '\u00b0C', length: 'km', mass: 'g', volume: 'L' }
      },
      states: {},
      auth:   { data: { access_token: '' } },
      callApi: function() { return Promise.resolve(null); },
      callService: function(domain, service, data) {
        if (domain === 'kitchen_cooking_engine' && window.KceAndroid) {
          try { window.KceAndroid.onCallService(service, JSON.stringify(data || {})); }
          catch(e) { console.warn('KceAndroid bridge error', e); }
        }
        return Promise.resolve();
      }
    };

    // ── Boot panel ────────────────────────────────────────────────────────
    // Create element and set all state *before* appending to DOM.
    // LitElement batches the queued updates into one first render that already
    // shows the cook path — no intermediate welcome/appliance screen visible.
    document.addEventListener('DOMContentLoaded', function() {
      customElements.whenDefined('kitchen-cooking-panel').then(function() {
        var panel = document.createElement('kitchen-cooking-panel');

        // hass must be set before connectedCallback so callApi calls
        // get our mock (not undefined) even during the first async load.
        panel.hass = window._mockHass;

        // Language + data source (callApi returned null so panel kept 'en').
        panel._language   = _lang;
        panel._dataSource = (_lang === 'sv') ? 'swedish' : 'international';

        // Navigate straight to the MEATER cook-path setup form.
        panel._currentPath      = 'meater_experimental';
        panel._showMeaterCooking = true;

        document.body.appendChild(panel);
        // connectedCallback fires here — requestUpdate() batches with above.
      });
    });
  })();
</script>
<script src="kitchen-cooking-panel.js"></script>
</body>
</html>
""".trimIndent()
}

/**
 * JS bridge exposed as window.KceAndroid inside the cook-path WebView.
 *
 * The panel calls hass.callService('kitchen_cooking_engine', 'start_cook', data)
 * → our mock hass routes it to KceAndroid.onCallService().
 *
 * serviceData fields relevant to us:
 *   cut_id              – KCE cut identifier (e.g. "beef_ribeye")
 *   doneness            – doneness key  (e.g. "medium_rare")
 *   cooking_method      – method slug   (e.g. "pan_fry")
 *   data_source         – "swedish" | "international"
 *   custom_target_temp_c – Int, present only when user moved the slider
 *   entity_id           – null in Android context (no HA entities) — ignored
 */
class CutSelectionBridgeImpl(
    private val probeIndex: Int,
    private val onStartCook: (probeIndex: Int, cutId: String, doneness: String,
                               customTempC: Int?, cookingMethod: String, dataSource: String) -> Unit,
    private val onCancel: () -> Unit
) {
    @JavascriptInterface
    fun onCallService(service: String, dataJson: String) {
        if (service == "start_cook" || service == "start_simple_probe_cook") {
            try {
                val data = JSONObject(dataJson)
                val cutId        = data.optString("cut_id", "")
                val doneness     = data.optString("doneness", "")
                val method       = data.optString("cooking_method", "")
                val dataSource   = data.optString("data_source", "international")
                val customTempC  = if (data.has("custom_target_temp_c") &&
                    !data.isNull("custom_target_temp_c"))
                    data.getInt("custom_target_temp_c") else null
                onStartCook(probeIndex, cutId, doneness, customTempC, method, dataSource)
            } catch (_: Exception) { /* malformed JSON — ignore */ }
        }
    }
}
