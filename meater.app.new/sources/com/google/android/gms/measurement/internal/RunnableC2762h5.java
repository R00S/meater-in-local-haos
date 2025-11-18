package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.h5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2762h5 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private long f35391B;

    /* renamed from: C, reason: collision with root package name */
    private long f35392C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ C2734d5 f35393D;

    RunnableC2762h5(C2734d5 c2734d5, long j10, long j11) {
        this.f35393D = c2734d5;
        this.f35391B = j10;
        this.f35392C = j11;
    }

    public static /* synthetic */ void a(RunnableC2762h5 runnableC2762h5) {
        C2734d5 c2734d5 = runnableC2762h5.f35393D;
        long j10 = runnableC2762h5.f35391B;
        long j11 = runnableC2762h5.f35392C;
        c2734d5.f35330b.n();
        c2734d5.f35330b.k().G().a("Application going to the background");
        c2734d5.f35330b.h().f35615u.a(true);
        c2734d5.f35330b.F(true);
        if (!c2734d5.f35330b.c().Y()) {
            c2734d5.f35330b.G(false, false, j11);
            c2734d5.f35330b.f35314f.e(j11);
        }
        c2734d5.f35330b.k().K().b("Application backgrounded at: timestamp_millis", Long.valueOf(j10));
        c2734d5.f35330b.s().G0();
        if (c2734d5.f35330b.c().u(K.f34934N0)) {
            long jD = c2734d5.f35330b.j().F0(c2734d5.f35330b.a().getPackageName(), c2734d5.f35330b.c().W()) ? 1000L : c2734d5.f35330b.c().D(c2734d5.f35330b.a().getPackageName(), K.f34907A);
            c2734d5.f35330b.k().L().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jD));
            c2734d5.f35330b.t().D(jD);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35393D.f35330b.o().E(new Runnable() { // from class: com.google.android.gms.measurement.internal.g5
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC2762h5.a(this.f35370B);
            }
        });
    }
}
