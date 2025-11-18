package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzn;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.p7 */
/* loaded from: classes2.dex */
final class RunnableC7793p7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzn f28830f;

    /* renamed from: g */
    private final /* synthetic */ AppMeasurementDynamiteService f28831g;

    RunnableC7793p7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzn zznVar) {
        this.f28831g = appMeasurementDynamiteService;
        this.f28830f = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28831g.f28531f.m23217I().m23535R(this.f28830f, this.f28831g.f28531f.m23235o());
    }
}
