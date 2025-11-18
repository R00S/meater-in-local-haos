package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2824q4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C2782k4 f35535B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ long f35536C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ C2796m4 f35537D;

    RunnableC2824q4(C2796m4 c2796m4, C2782k4 c2782k4, long j10) {
        this.f35535B = c2782k4;
        this.f35536C = j10;
        this.f35537D = c2796m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35537D.K(this.f35535B, false, this.f35536C);
        C2796m4 c2796m4 = this.f35537D;
        c2796m4.f35460e = null;
        c2796m4.v().M(null);
    }
}
