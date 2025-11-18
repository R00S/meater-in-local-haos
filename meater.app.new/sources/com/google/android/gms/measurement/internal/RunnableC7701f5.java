package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.f5 */
/* loaded from: classes2.dex */
final class RunnableC7701f5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f28632f;

    /* renamed from: g */
    private final /* synthetic */ zzhc f28633g;

    RunnableC7701f5(zzhc zzhcVar, AtomicReference atomicReference) {
        this.f28633g = zzhcVar;
        this.f28632f = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28632f) {
            try {
                this.f28632f.set(Integer.valueOf(this.f28633g.mo22841n().m23588t(this.f28633g.mo22795q().m23110C(), zzap.f29115R)));
            } finally {
                this.f28632f.notify();
            }
        }
    }
}
