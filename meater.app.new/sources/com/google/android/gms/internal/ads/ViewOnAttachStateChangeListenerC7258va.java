package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.va */
/* loaded from: classes2.dex */
final class ViewOnAttachStateChangeListenerC7258va implements View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final /* synthetic */ zzavb f20735f;

    /* renamed from: g */
    private final /* synthetic */ zzbha f20736g;

    ViewOnAttachStateChangeListenerC7258va(zzbha zzbhaVar, zzavb zzavbVar) {
        this.f20736g = zzbhaVar;
        this.f20735f = zzavbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f20736g.m17670q(view, this.f20735f, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
