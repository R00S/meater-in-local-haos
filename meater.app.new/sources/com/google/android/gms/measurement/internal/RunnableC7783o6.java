package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.o6 */
/* loaded from: classes2.dex */
final class RunnableC7783o6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ ComponentName f28811f;

    /* renamed from: g */
    private final /* synthetic */ zzjc f28812g;

    RunnableC7783o6(zzjc zzjcVar, ComponentName componentName) {
        this.f28812g = zzjcVar;
        this.f28811f = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28812g.f29347h.m23346E(this.f28811f);
    }
}
