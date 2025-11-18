package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzn;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.t4 */
/* loaded from: classes2.dex */
final class RunnableC7826t4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzn f28916f;

    /* renamed from: g */
    private final /* synthetic */ zzan f28917g;

    /* renamed from: h */
    private final /* synthetic */ String f28918h;

    /* renamed from: i */
    private final /* synthetic */ AppMeasurementDynamiteService f28919i;

    RunnableC7826t4(AppMeasurementDynamiteService appMeasurementDynamiteService, zzn zznVar, zzan zzanVar, String str) {
        this.f28919i = appMeasurementDynamiteService;
        this.f28916f = zznVar;
        this.f28917g = zzanVar;
        this.f28918h = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f28919i.f28531f.m23226R().m23358H(this.f28916f, this.f28917g, this.f28918h);
    }
}
