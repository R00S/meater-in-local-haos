package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.a5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2713a5 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C2880y5 f35262B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ Runnable f35263C;

    RunnableC2713a5(Z4 z42, C2880y5 c2880y5, Runnable runnable) {
        this.f35262B = c2880y5;
        this.f35263C = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35262B.N0();
        this.f35262B.F(this.f35263C);
        this.f35262B.S0();
    }
}
