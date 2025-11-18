package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.j5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2776j5 {

    /* renamed from: a, reason: collision with root package name */
    private long f35416a;

    /* renamed from: b, reason: collision with root package name */
    protected long f35417b;

    /* renamed from: c, reason: collision with root package name */
    private final A f35418c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2727c5 f35419d;

    public C2776j5(C2727c5 c2727c5) {
        this.f35419d = c2727c5;
        this.f35418c = new C2769i5(this, c2727c5.f35457a);
        long jC = c2727c5.b().c();
        this.f35416a = jC;
        this.f35417b = jC;
    }

    static /* synthetic */ void c(C2776j5 c2776j5) {
        c2776j5.f35419d.n();
        c2776j5.d(false, false, c2776j5.f35419d.b().c());
        c2776j5.f35419d.p().x(c2776j5.f35419d.b().c());
    }

    final long a(long j10) {
        long j11 = j10 - this.f35417b;
        this.f35417b = j10;
        return j11;
    }

    final void b() {
        this.f35418c.a();
        if (this.f35419d.c().u(K.f34954X0)) {
            this.f35416a = this.f35419d.b().c();
        } else {
            this.f35416a = 0L;
        }
        this.f35417b = this.f35416a;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        this.f35419d.n();
        this.f35419d.z();
        if (this.f35419d.f35457a.s()) {
            this.f35419d.h().f35612r.b(this.f35419d.b().a());
        }
        long jA = j10 - this.f35416a;
        if (!z10 && jA < 1000) {
            this.f35419d.k().L().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jA));
            return false;
        }
        if (!z11) {
            jA = a(j10);
        }
        this.f35419d.k().L().b("Recording user engagement, ms", Long.valueOf(jA));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jA);
        Q5.Y(this.f35419d.u().E(!this.f35419d.c().Y()), bundle, true);
        if (!z11) {
            this.f35419d.s().h1("auto", "_e", bundle);
        }
        this.f35416a = j10;
        this.f35418c.a();
        this.f35418c.b(K.f34988l0.a(null).longValue());
        return true;
    }

    final void e(long j10) {
        this.f35418c.a();
    }

    final void f(long j10) {
        this.f35419d.n();
        this.f35418c.a();
        this.f35416a = j10;
        this.f35417b = j10;
    }
}
