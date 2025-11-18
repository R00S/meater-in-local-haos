package com.google.android.gms.internal.ads;

import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.kz */
/* loaded from: classes2.dex */
final class RunnableC6876kz implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Surface f19728f;

    /* renamed from: g */
    private final /* synthetic */ zzhd f19729g;

    RunnableC6876kz(zzhd zzhdVar, Surface surface) {
        this.f19729g = zzhdVar;
        this.f19728f = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19729g.f26175H.mo15395g(this.f19728f);
    }
}
