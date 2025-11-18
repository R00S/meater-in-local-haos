package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2712a4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C2823q3 f35258B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ long f35259C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ boolean f35260D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35261E;

    RunnableC2712a4(C2843t3 c2843t3, C2823q3 c2823q3, long j10, boolean z10) {
        this.f35258B = c2823q3;
        this.f35259C = j10;
        this.f35260D = z10;
        this.f35261E = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35261E.R(this.f35258B);
        C2843t3.X(this.f35261E, this.f35258B, this.f35259C, false, this.f35260D);
    }
}
