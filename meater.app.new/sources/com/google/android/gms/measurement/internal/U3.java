package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class U3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35184B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35185C;

    U3(C2843t3 c2843t3, AtomicReference atomicReference) {
        this.f35184B = atomicReference;
        this.f35185C = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f35184B) {
            try {
                try {
                    this.f35184B.set(Long.valueOf(this.f35185C.c().D(this.f35185C.q().H(), K.f34953X)));
                } finally {
                    this.f35184B.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
