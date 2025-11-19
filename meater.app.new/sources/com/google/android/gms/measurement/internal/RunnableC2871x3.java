package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2871x3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f35709B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35710C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ String f35711D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ boolean f35712E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f35713F;

    RunnableC2871x3(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02, String str, String str2, boolean z10) {
        this.f35709B = u02;
        this.f35710C = str;
        this.f35711D = str2;
        this.f35712E = z10;
        this.f35713F = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35713F.f34744B.N().I(this.f35709B, this.f35710C, this.f35711D, this.f35712E);
    }
}
