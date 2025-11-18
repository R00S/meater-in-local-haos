package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.lb */
/* loaded from: classes2.dex */
final class ViewOnAttachStateChangeListenerC6889lb implements View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final /* synthetic */ zzavb f19760f;

    /* renamed from: g */
    private final /* synthetic */ zzbio f19761g;

    ViewOnAttachStateChangeListenerC6889lb(zzbio zzbioVar, zzavb zzavbVar) {
        this.f19761g = zzbioVar;
        this.f19760f = zzavbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f19761g.m17749v(view, this.f19760f, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
