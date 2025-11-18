package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.e5 */
/* loaded from: classes2.dex */
final class RunnableC7692e5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f28616f;

    /* renamed from: g */
    private final /* synthetic */ zzhc f28617g;

    RunnableC7692e5(zzhc zzhcVar, AtomicReference atomicReference) {
        this.f28617g = zzhcVar;
        this.f28616f = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28616f) {
            try {
                this.f28616f.set(this.f28617g.mo22841n().m23569H(this.f28617g.mo22795q().m23110C()));
            } finally {
                this.f28616f.notify();
            }
        }
    }
}
