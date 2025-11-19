package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.2.0 */
/* loaded from: classes2.dex */
final class R3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f35153B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ J f35154C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ String f35155D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f35156E;

    R3(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02, J j10, String str) {
        this.f35153B = u02;
        this.f35154C = j10;
        this.f35155D = str;
        this.f35156E = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35156E.f34744B.N().G(this.f35153B, this.f35154C, this.f35155D);
    }
}
