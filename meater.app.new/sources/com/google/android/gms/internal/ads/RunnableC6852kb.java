package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.kb */
/* loaded from: classes2.dex */
final class RunnableC6852kb implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ View f19530f;

    /* renamed from: g */
    private final /* synthetic */ zzavb f19531g;

    /* renamed from: h */
    private final /* synthetic */ int f19532h;

    /* renamed from: i */
    private final /* synthetic */ zzbio f19533i;

    RunnableC6852kb(zzbio zzbioVar, View view, zzavb zzavbVar, int i2) {
        this.f19533i = zzbioVar;
        this.f19530f = view;
        this.f19531g = zzavbVar;
        this.f19532h = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19533i.m17749v(this.f19530f, this.f19531g, this.f19532h - 1);
    }
}
