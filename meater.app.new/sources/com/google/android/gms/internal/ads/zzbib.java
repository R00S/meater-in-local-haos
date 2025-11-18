package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@zzard
@TargetApi(21)
/* loaded from: classes2.dex */
public final class zzbib extends zzbia {
    public zzbib(zzbgz zzbgzVar, zzwj zzwjVar, boolean z) {
        super(zzbgzVar, zzwjVar, z);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return m17730L(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
