package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.c5 */
/* loaded from: classes2.dex */
final class RunnableC7674c5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Bundle f28587f;

    /* renamed from: g */
    private final /* synthetic */ zzhc f28588g;

    RunnableC7674c5(zzhc zzhcVar, Bundle bundle) {
        this.f28588g = zzhcVar;
        this.f28587f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28588g.m23255A0(this.f28587f);
    }
}
