package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2748f5 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f35349B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f35350C;

    RunnableC2748f5(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02) {
        this.f35349B = u02;
        this.f35350C = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35350C.f34744B.P().V(this.f35349B, this.f35350C.f34744B.r());
    }
}
