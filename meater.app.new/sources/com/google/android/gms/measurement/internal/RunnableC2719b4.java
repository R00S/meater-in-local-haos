package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2719b4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C2823q3 f35297B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ long f35298C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ boolean f35299D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35300E;

    RunnableC2719b4(C2843t3 c2843t3, C2823q3 c2823q3, long j10, boolean z10) {
        this.f35297B = c2823q3;
        this.f35298C = j10;
        this.f35299D = z10;
        this.f35300E = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35300E.R(this.f35297B);
        C2843t3.X(this.f35300E, this.f35297B, this.f35298C, true, this.f35299D);
    }
}
