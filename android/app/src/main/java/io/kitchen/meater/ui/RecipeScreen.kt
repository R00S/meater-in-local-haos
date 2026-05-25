package io.kitchen.meater.ui

import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView

/**
 * Displays the KCE:CUT method-specific recipe file for a given cut + method.
 *
 * The recipe .md files are bundled in the APK as assets under assets/recipes/.
 * The EXP_RECIPE_INDEX constant (injected into kitchen-cooking-panel.js by the
 * generator) maps "{slug}-{method}" → relative path so we load the right file.
 *
 * Each method file (e.g. filet_mignon-pan_sear.md) contains source recipes with
 * ingredients and step-by-step instructions — the content the user wants to read.
 * The master cut profile file is NOT shown here (cut profile info is in CutSelectionScreen).
 *
 * The HTML comment frontmatter (<!-- KCE:CUT_METHOD ... -->) is stripped before display.
 * A minimal CSS stylesheet makes the content readable.
 */
@Composable
fun RecipeScreen(
    slug: String,
    cutName: String,
    cutNameSv: String,
    method: String,
    useSv: Boolean,
    onBack: () -> Unit
) {
    val context = LocalContext.current

    val strBack  = if (useSv) "Tillbaka"      else "Back"
    val strTitle = if (useSv && cutNameSv.isNotBlank()) cutNameSv else cutName

    // Load recipe content from assets; done once and cached in remember.
    val htmlContent = remember(slug) {
        buildRecipeHtml(context, slug, useSv)
    }

    DisposableEffect(Unit) { onDispose { } }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Header bar
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Button(onClick = onBack) { Text(strBack) }
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = strTitle,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            // Recipe content in a WebView
            AndroidView(
                modifier = Modifier.fillMaxSize(),
                factory = { ctx ->
                    WebView(ctx).also { wv ->
                        with(wv.settings) {
                            javaScriptEnabled = false
                            domStorageEnabled = false
                            cacheMode = WebSettings.LOAD_NO_CACHE
                        }
                        wv.webViewClient = WebViewClient()
                        wv.loadDataWithBaseURL(
                            "file:///android_asset/",
                            htmlContent,
                            "text/html",
                            "utf-8",
                            null
                        )
                    }
                }
            )
        }
    }
}

/**
 * Build a complete HTML document from all available recipe files for [slug].
 *
 * Loads the master cut file and all method files, strips the HTML comment
 * frontmatter, and wraps the markdown body in styled HTML.
 * Falls back to a "no recipe" message if the asset index is missing.
 */
private fun buildRecipeHtml(
    context: android.content.Context,
    slug: String,
    useSv: Boolean
): String {
    // Read the recipe index from kitchen-cooking-panel.js (EXP_RECIPE_INDEX constant).
    val index = loadRecipeIndex(context)

    if (index.isEmpty()) {
        val msg = if (useSv)
            "<p>Receptfiler inte tillgängliga i den här versionen.</p>"
        else
            "<p>Recipe files are not available in this build.</p>"
        return wrapHtml(slug, msg)
    }

    val sections = StringBuilder()

    // 1. Master cut file
    val masterPath = index[slug]
    if (masterPath != null) {
        val body = loadAndStripMd(context, masterPath)
        if (body.isNotBlank()) sections.append(markdownToHtml(body))
    }

    // 2. Method-specific recipe files (slug-method_name)
    val methodFiles = index.entries
        .filter { it.key.startsWith("$slug-") }
        .sortedBy { it.key }

    methodFiles.forEach { (_, path) ->
        val body = loadAndStripMd(context, path)
        if (body.isNotBlank()) {
            sections.append("<hr>")
            sections.append(markdownToHtml(body))
        }
    }

    if (sections.isEmpty()) {
        val msg = if (useSv)
            "<p>Inga receptfiler hittades för den här styckdelen.</p>"
        else
            "<p>No recipe files found for this cut.</p>"
        return wrapHtml(slug, msg)
    }

    return wrapHtml(slug, sections.toString())
}

/**
 * Extract EXP_RECIPE_INDEX from the bundled kitchen-cooking-panel.js.
 * Returns an empty map if the constant is not present (older build).
 */
private fun loadRecipeIndex(context: android.content.Context): Map<String, String> {
    return try {
        val js = context.assets.open("kitchen-cooking-panel.js").bufferedReader().readText()
        val marker = "const EXP_RECIPE_INDEX = {"
        val start = js.indexOf(marker)
        if (start < 0) return emptyMap()
        val objectStart = start + marker.length - 1

        var depth = 0; var inString = false; var escape = false; var i = objectStart
        while (i < js.length) {
            val c = js[i]
            when {
                escape                  -> escape = false
                inString && c == '\\'  -> escape = true
                c == '"'               -> inString = !inString
                !inString && c == '{'  -> depth++
                !inString && c == '}' -> { depth--; if (depth == 0) {
                    val obj = org.json.JSONObject(js.substring(objectStart, i + 1))
                    return obj.keys().asSequence().associateWith { obj.getString(it) }
                } }
            }
            i++
        }
        emptyMap()
    } catch (_: Exception) { emptyMap() }
}

/**
 * Load a recipe .md file from assets/recipes/ and strip the
 * <!-- KCE:CUT ... --> frontmatter comment block.
 */
private fun loadAndStripMd(context: android.content.Context, relativePath: String): String {
    return try {
        val text = context.assets.open("recipes/$relativePath").bufferedReader().readText()
        // Strip the HTML comment block <!-- ... -->
        text.replace(Regex("<!--.*?-->", RegexOption.DOT_MATCHES_ALL), "").trim()
    } catch (_: Exception) { "" }
}

/**
 * Very minimal Markdown → HTML conversion sufficient for the recipe files.
 * Handles: # headings, **bold**, horizontal rules, and paragraphs.
 */
private fun markdownToHtml(md: String): String {
    val sb = StringBuilder()
    val lines = md.lines()
    var inParagraph = false

    fun closeParagraph() {
        if (inParagraph) { sb.append("</p>\n"); inParagraph = false }
    }

    for (rawLine in lines) {
        val line = rawLine
        when {
            line.startsWith("#### ") -> {
                closeParagraph()
                sb.append("<h4>${escHtml(line.removePrefix("#### "))}</h4>\n")
            }
            line.startsWith("### ") -> {
                closeParagraph()
                sb.append("<h3>${escHtml(line.removePrefix("### "))}</h3>\n")
            }
            line.startsWith("## ") -> {
                closeParagraph()
                sb.append("<h2>${escHtml(line.removePrefix("## "))}</h2>\n")
            }
            line.startsWith("# ") -> {
                closeParagraph()
                sb.append("<h1>${escHtml(line.removePrefix("# "))}</h1>\n")
            }
            line.startsWith("---") -> {
                closeParagraph()
                sb.append("<hr>\n")
            }
            line.startsWith("- ") -> {
                closeParagraph()
                sb.append("<li>${inlineMd(line.removePrefix("- "))}</li>\n")
            }
            line.isBlank() -> {
                closeParagraph()
            }
            else -> {
                if (!inParagraph) { sb.append("<p>"); inParagraph = true }
                else sb.append(" ")
                sb.append(inlineMd(line))
            }
        }
    }
    closeParagraph()
    return sb.toString()
}

/** Inline markdown: **bold**, *italic*, `code` */
private fun inlineMd(text: String): String {
    return escHtml(text)
        .replace(Regex("\\*\\*(.+?)\\*\\*"), "<strong>$1</strong>")
        .replace(Regex("\\*(.+?)\\*"), "<em>$1</em>")
        .replace(Regex("`(.+?)`"), "<code>$1</code>")
}

private fun escHtml(s: String): String =
    s.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")

private fun wrapHtml(slug: String, body: String): String = """
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <style>
    body { font-family: -apple-system, sans-serif; margin: 0; padding: 16px;
           line-height: 1.6; color: #1c1c1e; background: #fff; }
    h1 { font-size: 1.4em; margin-top: 1em; }
    h2 { font-size: 1.2em; margin-top: 1em; border-bottom: 1px solid #ddd; padding-bottom: 4px; }
    h3 { font-size: 1.05em; margin-top: 0.9em; color: #333; }
    h4 { font-size: 0.95em; margin-top: 0.8em; color: #555; }
    li { margin: 4px 0 4px 1em; }
    code { background: #f0f0f0; padding: 1px 4px; border-radius: 3px; font-size: 0.9em; }
    hr { border: none; border-top: 1px solid #ddd; margin: 16px 0; }
    p { margin: 8px 0; }
  </style>
</head>
<body>
$body
</body>
</html>
""".trimIndent()
