package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class X3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35206B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35207C;

    X3(C2843t3 c2843t3, AtomicReference atomicReference) {
        this.f35206B = atomicReference;
        this.f35207C = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f35206B) {
            try {
                try {
                    this.f35206B.set(Integer.valueOf(this.f35207C.c().z(this.f35207C.q().H(), K.f34955Y)));
                } finally {
                    this.f35206B.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
