package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.g5 */
/* loaded from: classes2.dex */
final class RunnableC7710g5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f28649f;

    /* renamed from: g */
    private final /* synthetic */ zzhc f28650g;

    RunnableC7710g5(zzhc zzhcVar, AtomicReference atomicReference) {
        this.f28650g = zzhcVar;
        this.f28649f = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28649f) {
            try {
                this.f28649f.set(Long.valueOf(this.f28650g.mo22841n().m23585p(this.f28650g.mo22795q().m23110C(), zzap.f29113Q)));
            } finally {
                this.f28649f.notify();
            }
        }
    }
}
