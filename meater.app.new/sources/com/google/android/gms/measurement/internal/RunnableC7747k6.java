package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzn;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.k6 */
/* loaded from: classes2.dex */
final class RunnableC7747k6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzn f28738f;

    /* renamed from: g */
    private final /* synthetic */ String f28739g;

    /* renamed from: h */
    private final /* synthetic */ String f28740h;

    /* renamed from: i */
    private final /* synthetic */ AppMeasurementDynamiteService f28741i;

    RunnableC7747k6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzn zznVar, String str, String str2) {
        this.f28741i = appMeasurementDynamiteService;
        this.f28738f = zznVar;
        this.f28739g = str;
        this.f28740h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f28741i.f28531f.m23226R().m23359I(this.f28738f, this.f28739g, this.f28740h);
    }
}
