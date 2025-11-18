package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2885z3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35782B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35783C;

    RunnableC2885z3(C2843t3 c2843t3, AtomicReference atomicReference) {
        this.f35782B = atomicReference;
        this.f35783C = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f35782B) {
            try {
                try {
                    this.f35782B.set(Boolean.valueOf(this.f35783C.c().P(this.f35783C.q().H())));
                } finally {
                    this.f35782B.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
