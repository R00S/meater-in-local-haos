package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@zzard
@TargetApi(11)
/* loaded from: classes2.dex */
public final class zzbhz extends zzbia {
    public zzbhz(zzbgz zzbgzVar, zzwj zzwjVar, boolean z) {
        super(zzbgzVar, zzwjVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbha, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m17730L(webView, str, null);
    }
}
