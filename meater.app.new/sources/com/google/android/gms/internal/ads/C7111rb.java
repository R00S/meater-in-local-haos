package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzk;

@zzard
/* renamed from: com.google.android.gms.internal.ads.rb */
/* loaded from: classes2.dex */
class C7111rb extends WebView {
    public C7111rb(Context context) {
        super(context);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzk.zzli().mo17200k(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            zzbad.m17347c("Unable to enable Javascript.", e2);
        }
        setLayerType(1, null);
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            zzawz.m17082m("Ignore addJavascriptInterface due to low Android version.");
        }
    }

    /* renamed from: k */
    public void mo14917k(String str) {
        C7222ub.m15926a(this, str);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
            zzk.zzlk().m17052e(e2, "CoreWebView.loadUrl");
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }
}
