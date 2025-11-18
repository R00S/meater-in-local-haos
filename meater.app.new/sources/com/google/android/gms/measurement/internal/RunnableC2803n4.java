package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.n4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2803n4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f35475B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35476C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ String f35477D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f35478E;

    RunnableC2803n4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02, String str, String str2) {
        this.f35475B = u02;
        this.f35476C = str;
        this.f35477D = str2;
        this.f35478E = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35478E.f34744B.N().H(this.f35475B, this.f35476C, this.f35477D);
    }
}
