package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class G3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ long f34857B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f34858C;

    G3(C2843t3 c2843t3, long j10) {
        this.f34857B = j10;
        this.f34858C = c2843t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34858C.h().f35607m.b(this.f34857B);
        this.f34858C.k().G().b("Session timeout duration set", Long.valueOf(this.f34857B));
    }
}
