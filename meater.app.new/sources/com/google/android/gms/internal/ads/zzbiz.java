package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import okhttp3.internal.p454ws.WebSocketProtocol;

@zzard
/* loaded from: classes2.dex */
public class zzbiz extends WebViewClient {

    /* renamed from: a */
    private static final String[] f23097a = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: b */
    private static final String[] f23098b = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: c */
    private zzbje f23099c;

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (str == null) {
            return;
        }
        zzawz.m17082m(str.length() != 0 ? "Loading resource: ".concat(str) : new String("Loading resource: "));
        mo16150r(new zzbja(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (str == null) {
            return;
        }
        zzbja zzbjaVar = new zzbja(str);
        zzbje zzbjeVar = this.f23099c;
        if (zzbjeVar != null) {
            zzbjeVar.mo17771u(zzbjaVar);
        } else {
            mo16149p(zzbjaVar);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        if (i2 >= 0 || (-i2) - 1 >= f23097a.length) {
            String.valueOf(i2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError == null) {
            return;
        }
        int primaryError = sslError.getPrimaryError();
        if (primaryError < 0 || primaryError >= f23098b.length) {
            String.valueOf(primaryError);
        }
        sslError.getUrl();
    }

    /* renamed from: p */
    public void mo16149p(zzbja zzbjaVar) {
    }

    /* renamed from: q */
    final void m17768q(zzbje zzbjeVar) {
        this.f23099c = zzbjeVar;
    }

    /* renamed from: r */
    public void mo16150r(zzbja zzbjaVar) {
    }

    /* renamed from: s */
    public boolean mo16151s(zzbja zzbjaVar) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return mo17763t(new zzbja(str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return mo16151s(new zzbja(str));
    }

    /* renamed from: t */
    public WebResourceResponse mo17763t(zzbja zzbjaVar) {
        return null;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return mo17763t(new zzbja(webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return mo16151s(new zzbja(webResourceRequest));
    }
}
