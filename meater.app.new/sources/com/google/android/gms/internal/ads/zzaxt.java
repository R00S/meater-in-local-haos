package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebSettings;

@TargetApi(16)
/* loaded from: classes2.dex */
public class zzaxt extends zzaxo {
    public zzaxt() {
        super();
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: c */
    public final void mo17192c(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: i */
    public final void mo17198i(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: k */
    public boolean mo17200k(Context context, WebSettings webSettings) {
        super.mo17200k(context, webSettings);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }
}
