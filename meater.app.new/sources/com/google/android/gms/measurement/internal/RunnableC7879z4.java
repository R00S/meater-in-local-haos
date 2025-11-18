package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.z4 */
/* loaded from: classes2.dex */
final class RunnableC7879z4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Bundle f29053f;

    /* renamed from: g */
    private final /* synthetic */ zzhc f29054g;

    RunnableC7879z4(zzhc zzhcVar, Bundle bundle) {
        this.f29054g = zzhcVar;
        this.f29053f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29054g.m23268x0(this.f29053f);
    }
}
