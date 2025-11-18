package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes2.dex */
final class a40 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Surface f18079f;

    /* renamed from: g */
    private final /* synthetic */ zzto f18080g;

    a40(zzto zztoVar, Surface surface) {
        this.f18080g = zztoVar;
        this.f18079f = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18080g.f27098b.mo17599j(this.f18079f);
    }
}
