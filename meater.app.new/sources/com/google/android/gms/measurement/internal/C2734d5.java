package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.d5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2734d5 {

    /* renamed from: a, reason: collision with root package name */
    private RunnableC2762h5 f35329a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2727c5 f35330b;

    C2734d5(C2727c5 c2727c5) {
        this.f35330b = c2727c5;
    }

    final void a() {
        this.f35330b.n();
        if (this.f35329a != null) {
            this.f35330b.f35311c.removeCallbacks(this.f35329a);
        }
        this.f35330b.h().f35615u.a(false);
        this.f35330b.F(false);
        if (this.f35330b.c().u(K.f34948U0) && this.f35330b.s().P0()) {
            this.f35330b.k().L().a("Retrying trigger URI registration in foreground");
            this.f35330b.s().N0();
        }
    }

    final void b(long j10) {
        this.f35329a = new RunnableC2762h5(this, this.f35330b.b().a(), j10);
        this.f35330b.f35311c.postDelayed(this.f35329a, 2000L);
    }
}
