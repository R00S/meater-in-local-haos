package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.r4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2830r4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ long f35592B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2796m4 f35593C;

    RunnableC2830r4(C2796m4 c2796m4, long j10) {
        this.f35592B = j10;
        this.f35593C = c2796m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35593C.p().x(this.f35592B);
        this.f35593C.f35460e = null;
    }
}
