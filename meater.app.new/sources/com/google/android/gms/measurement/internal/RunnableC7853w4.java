package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.w4 */
/* loaded from: classes2.dex */
final class RunnableC7853w4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f28972f;

    /* renamed from: g */
    private final /* synthetic */ zzhc f28973g;

    RunnableC7853w4(zzhc zzhcVar, AtomicReference atomicReference) {
        this.f28973g = zzhcVar;
        this.f28972f = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28972f) {
            try {
                this.f28972f.set(Boolean.valueOf(this.f28973g.mo22841n().m23568F(this.f28973g.mo22795q().m23110C())));
            } finally {
                this.f28972f.notify();
            }
        }
    }
}
