package com.google.android.gms.measurement.internal;

import android.content.Context;
import g7.C3442m;
import g7.C3448t;
import g7.C3449u;
import g7.C3451w;
import g7.InterfaceC3450v;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import z7.InterfaceC5204f;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2745f2 {

    /* renamed from: d, reason: collision with root package name */
    private static C2745f2 f35342d;

    /* renamed from: e, reason: collision with root package name */
    private static final Duration f35343e = Duration.ofMinutes(30);

    /* renamed from: a, reason: collision with root package name */
    private final P2 f35344a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3450v f35345b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f35346c = new AtomicLong(-1);

    private C2745f2(Context context, P2 p22) {
        this.f35345b = C3449u.b(context, C3451w.c().b("measurement:api").a());
        this.f35344a = p22;
    }

    static C2745f2 a(P2 p22) {
        if (f35342d == null) {
            f35342d = new C2745f2(p22.a(), p22);
        }
        return f35342d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        final long jC = this.f35344a.b().c();
        if (this.f35346c.get() != -1 && jC - this.f35346c.get() <= f35343e.toMillis()) {
            return;
        }
        this.f35345b.a(new C3448t(0, Arrays.asList(new C3442m(36301, i11, 0, j10, j11, null, null, 0, i12)))).e(new InterfaceC5204f() { // from class: v7.p
            @Override // z7.InterfaceC5204f
            public final void d(Exception exc) {
                this.f51570a.f35346c.set(jC);
            }
        });
    }
}
