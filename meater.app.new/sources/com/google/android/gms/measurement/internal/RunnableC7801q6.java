package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.q6 */
/* loaded from: classes2.dex */
final class RunnableC7801q6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzjc f28842f;

    RunnableC7801q6(zzjc zzjcVar) {
        this.f28842f = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar = this.f28842f.f29347h;
        Context contextMo22834f = this.f28842f.f29347h.mo22834f();
        this.f28842f.f29347h.mo22832G();
        zzikVar.m23346E(new ComponentName(contextMo22834f, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
