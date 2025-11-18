package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.oe */
/* loaded from: classes2.dex */
final class RunnableC7003oe implements Runnable {

    /* renamed from: f */
    private final WeakReference<zzbtb> f20187f;

    private RunnableC7003oe(zzbtb zzbtbVar) {
        this.f20187f = new WeakReference<>(zzbtbVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbtb zzbtbVar = this.f20187f.get();
        if (zzbtbVar != null) {
            zzbtbVar.m18321g0();
        }
    }
}
