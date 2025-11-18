package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.ua */
/* loaded from: classes2.dex */
final class RunnableC7221ua implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ View f20623f;

    /* renamed from: g */
    private final /* synthetic */ zzavb f20624g;

    /* renamed from: h */
    private final /* synthetic */ int f20625h;

    /* renamed from: i */
    private final /* synthetic */ zzbha f20626i;

    RunnableC7221ua(zzbha zzbhaVar, View view, zzavb zzavbVar, int i2) {
        this.f20626i = zzbhaVar;
        this.f20623f = view;
        this.f20624g = zzavbVar;
        this.f20625h = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20626i.m17670q(this.f20623f, this.f20624g, this.f20625h - 1);
    }
}
