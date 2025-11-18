package com.google.android.gms.measurement.internal;

import g7.C3445p;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class F5 implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E5 f34843a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2880y5 f34844b;

    F5(C2880y5 c2880y5, E5 e52) {
        this.f34843a = e52;
        this.f34844b = c2880y5;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        if (!this.f34844b.e0((String) C3445p.k(this.f34843a.f34806B)).x() || !C2823q3.p(this.f34843a.f34826V).x()) {
            this.f34844b.k().L().a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        C2828r2 c2828r2I = this.f34844b.i(this.f34843a);
        if (c2828r2I != null) {
            return c2828r2I.m();
        }
        this.f34844b.k().M().a("App info was null when attempting to get app instance id");
        return null;
    }
}
