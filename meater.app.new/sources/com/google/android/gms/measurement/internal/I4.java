package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.2.0 */
/* loaded from: classes2.dex */
final class I4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService.a f34886B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f34887C;

    I4(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f34886B = aVar;
        this.f34887C = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34887C.f34744B.J().r0(this.f34886B);
    }
}
