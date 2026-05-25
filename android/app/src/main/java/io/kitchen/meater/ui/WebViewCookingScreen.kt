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
