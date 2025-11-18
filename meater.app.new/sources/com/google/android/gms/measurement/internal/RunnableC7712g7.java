package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzn;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.g7 */
/* loaded from: classes2.dex */
final class RunnableC7712g7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzn f28657f;

    /* renamed from: g */
    private final /* synthetic */ String f28658g;

    /* renamed from: h */
    private final /* synthetic */ String f28659h;

    /* renamed from: i */
    private final /* synthetic */ boolean f28660i;

    /* renamed from: j */
    private final /* synthetic */ AppMeasurementDynamiteService f28661j;

    RunnableC7712g7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzn zznVar, String str, String str2, boolean z) {
        this.f28661j = appMeasurementDynamiteService;
        this.f28657f = zznVar;
        this.f28658g = str;
        this.f28659h = str2;
        this.f28660i = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f28661j.f28531f.m23226R().m23360J(this.f28657f, this.f28658g, this.f28659h, this.f28660i);
    }
}
