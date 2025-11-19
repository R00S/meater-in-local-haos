package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class W3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35200B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35201C;

    W3(C2843t3 c2843t3, AtomicReference atomicReference) {
        this.f35200B = atomicReference;
        this.f35201C = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f35200B) {
            try {
                try {
                    this.f35200B.set(Double.valueOf(this.f35201C.c().p(this.f35201C.q().H(), K.f34957Z)));
                } finally {
                    this.f35200B.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
