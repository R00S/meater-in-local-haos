package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.p4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2817p4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C2782k4 f35511B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2782k4 f35512C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ long f35513D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ boolean f35514E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ C2796m4 f35515F;

    RunnableC2817p4(C2796m4 c2796m4, C2782k4 c2782k4, C2782k4 c2782k42, long j10, boolean z10) {
        this.f35511B = c2782k4;
        this.f35512C = c2782k42;
        this.f35513D = j10;
        this.f35514E = z10;
        this.f35515F = c2796m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35515F.J(this.f35511B, this.f35512C, this.f35513D, this.f35514E, null);
    }
}
