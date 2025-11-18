package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
final class p40 implements Runnable {

    /* renamed from: f */
    private ValueCallback<String> f20274f = new q40(this);

    /* renamed from: g */
    final /* synthetic */ zzuo f20275g;

    /* renamed from: h */
    final /* synthetic */ WebView f20276h;

    /* renamed from: i */
    final /* synthetic */ boolean f20277i;

    /* renamed from: j */
    final /* synthetic */ zzuu f20278j;

    p40(zzuu zzuuVar, zzuo zzuoVar, WebView webView, boolean z) {
        this.f20278j = zzuuVar;
        this.f20275g = zzuoVar;
        this.f20276h = webView;
        this.f20277i = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20276h.getSettings().getJavaScriptEnabled()) {
            try {
                this.f20276h.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f20274f);
            } catch (Throwable unused) {
                this.f20274f.onReceiveValue(HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }
    }
}
