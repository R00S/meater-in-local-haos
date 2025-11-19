package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2789l4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ Bundle f35439B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2782k4 f35440C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ C2782k4 f35441D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ long f35442E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ C2796m4 f35443F;

    RunnableC2789l4(C2796m4 c2796m4, Bundle bundle, C2782k4 c2782k4, C2782k4 c2782k42, long j10) {
        this.f35439B = bundle;
        this.f35440C = c2782k4;
        this.f35441D = c2782k42;
        this.f35442E = j10;
        this.f35443F = c2796m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2796m4.L(this.f35443F, this.f35439B, this.f35440C, this.f35441D, this.f35442E);
    }
}
