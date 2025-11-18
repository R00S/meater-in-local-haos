package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;

@zzard
@TargetApi(11)
/* loaded from: classes2.dex */
public final class zzbgr extends WebChromeClient {

    /* renamed from: a */
    private final zzbgz f23018a;

    public zzbgr(zzbgz zzbgzVar) {
        this.f23018a = zzbgzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static Context m17663a(WebView webView) {
        if (!(webView instanceof zzbgz)) {
            return webView.getContext();
        }
        zzbgz zzbgzVar = (zzbgz) webView;
        Activity activityMo14897a = zzbgzVar.mo14897a();
        return activityMo14897a != null ? activityMo14897a : zzbgzVar.getContext();
    }

    /* renamed from: b */
    private final boolean m17664b(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzbgz zzbgzVar;
        com.google.android.gms.ads.internal.zzb zzbVarMo17693o;
        try {
            zzbgzVar = this.f23018a;
        } catch (WindowManager.BadTokenException e2) {
            zzbad.m17348d("Fail to display Dialog.", e2);
        }
        if (zzbgzVar != null && zzbgzVar.mo14926p() != null && this.f23018a.mo14926p().mo17693o() != null && (zzbVarMo17693o = this.f23018a.mo14926p().mo17693o()) != null && !zzbVarMo17693o.zzkx()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zzbVarMo17693o.zzbk(sb.toString());
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builder.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC7110ra(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC7073qa(jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC7036pa(jsPromptResult)).create().show();
        } else {
            builder.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC6999oa(jsResult)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC6962na(jsResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC6925ma(jsResult)).create().show();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzbgz)) {
            zzbad.m17353i("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzd zzdVarMo14918k0 = ((zzbgz) webView).mo14918k0();
        if (zzdVarMo14918k0 == null) {
            zzbad.m17353i("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzdVarMo14918k0.close();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(strMessage).length() + 19 + String.valueOf(strSourceId).length());
        sb.append("JS: ");
        sb.append(strMessage);
        sb.append(" (");
        sb.append(strSourceId);
        sb.append(":");
        sb.append(iLineNumber);
        sb.append(")");
        String string = sb.toString();
        if (string.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i2 = C7147sa.f20515a[consoleMessage.messageLevel().ordinal()];
        if (i2 == 1) {
            zzbad.m17351g(string);
        } else if (i2 == 2) {
            zzbad.m17353i(string);
        } else if (i2 == 3 || i2 == 4 || i2 != 5) {
            zzbad.m17352h(string);
        } else {
            zzbad.m17349e(string);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f23018a.mo14941z() != null) {
            webView2.setWebViewClient(this.f23018a.mo14941z());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        long j5 = 5242880 - j4;
        if (j5 <= 0) {
            quotaUpdater.updateQuota(j2);
            return;
        }
        if (j2 != 0) {
            if (j3 == 0) {
                j2 = Math.min(j2 + Math.min(131072L, j5), 1048576L);
            } else if (j3 <= Math.min(1048576 - j2, j5)) {
                j2 += j3;
            }
            j3 = j2;
        } else if (j3 > j5 || j3 > 1048576) {
            j3 = 0;
        }
        quotaUpdater.updateQuota(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L2c
            com.google.android.gms.ads.internal.zzk.zzlg()
            com.google.android.gms.internal.ads.zzbgz r0 = r3.f23018a
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = com.google.android.gms.internal.ads.zzaxi.m17152f0(r0, r1)
            r1 = 1
            if (r0 != 0) goto L28
            com.google.android.gms.ads.internal.zzk.zzlg()
            com.google.android.gms.internal.ads.zzbgz r0 = r3.f23018a
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.google.android.gms.internal.ads.zzaxi.m17152f0(r0, r2)
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            r5.invoke(r4, r0, r1)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgr.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzd zzdVarMo14918k0 = this.f23018a.mo14918k0();
        if (zzdVarMo14918k0 == null) {
            zzbad.m17353i("Could not get ad overlay when hiding custom view.");
        } else {
            zzdVarMo14918k0.zzte();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m17664b(m17663a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m17664b(m17663a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m17664b(m17663a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m17664b(m17663a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (PlatformVersion.m14644h()) {
            if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21701S0)).booleanValue()) {
                zzbgz zzbgzVar = this.f23018a;
                if (zzbgzVar == null || zzbgzVar.mo14926p() == null || this.f23018a.mo14926p().mo17692n() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] strArrMo16972d = this.f23018a.mo14926p().mo17692n().mo16972d(permissionRequest.getResources());
                if (strArrMo16972d.length > 0) {
                    permissionRequest.grant(strArrMo16972d);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }

    public final void onReachedMaxAppCacheSize(long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = j2 + 131072;
        if (5242880 - j3 < j4) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j4);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzd zzdVarMo14918k0 = this.f23018a.mo14918k0();
        if (zzdVarMo14918k0 == null) {
            zzbad.m17353i("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzdVarMo14918k0.zza(view, customViewCallback);
            zzdVarMo14918k0.setRequestedOrientation(i2);
        }
    }
}
