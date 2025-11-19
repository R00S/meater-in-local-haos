package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class O3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ long f35072B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35073C;

    O3(C2843t3 c2843t3, long j10) {
        this.f35072B = j10;
        this.f35073C = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35073C.S0(this.f35072B);
        this.f35073C.v().U(new AtomicReference<>());
    }
}
