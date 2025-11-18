package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzn;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.p5 */
/* loaded from: classes2.dex */
final class RunnableC7791p5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzn f28827f;

    /* renamed from: g */
    private final /* synthetic */ AppMeasurementDynamiteService f28828g;

    RunnableC7791p5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzn zznVar) {
        this.f28828g = appMeasurementDynamiteService;
        this.f28827f = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f28828g.f28531f.m23226R().m23357F(this.f28827f);
    }
}
