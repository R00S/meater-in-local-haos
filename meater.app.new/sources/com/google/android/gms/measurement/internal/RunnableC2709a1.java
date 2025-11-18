package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2709a1 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ long f35252B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2707a f35253C;

    RunnableC2709a1(C2707a c2707a, long j10) {
        this.f35252B = j10;
        this.f35253C = c2707a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35253C.D(this.f35252B);
    }
}
