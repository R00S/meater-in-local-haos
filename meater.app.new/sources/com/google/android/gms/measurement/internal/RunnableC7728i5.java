package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.i5 */
/* loaded from: classes2.dex */
final class RunnableC7728i5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f28703f;

    /* renamed from: g */
    private final /* synthetic */ zzhc f28704g;

    RunnableC7728i5(zzhc zzhcVar, AtomicReference atomicReference) {
        this.f28704g = zzhcVar;
        this.f28703f = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28703f) {
            try {
                this.f28703f.set(Double.valueOf(this.f28704g.mo22841n().m23590v(this.f28704g.mo22795q().m23110C(), zzap.f29117S)));
            } finally {
                this.f28703f.notify();
            }
        }
    }
}
