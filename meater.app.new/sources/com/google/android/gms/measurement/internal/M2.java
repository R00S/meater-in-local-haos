package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.2.0 */
/* loaded from: classes2.dex */
final class M2 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f35048B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f35049C;

    M2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02) {
        this.f35048B = u02;
        this.f35049C = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35049C.f34744B.N().F(this.f35048B);
    }
}
