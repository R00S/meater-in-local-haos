package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class K3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35019B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35020C;

    K3(C2843t3 c2843t3, AtomicReference atomicReference) {
        this.f35019B = atomicReference;
        this.f35020C = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f35019B) {
            try {
                try {
                    this.f35019B.set(this.f35020C.c().J(this.f35020C.q().H()));
                } finally {
                    this.f35019B.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
