package Nb;

import Hb.U;
import Ib.e;
import Ra.m0;
import kotlin.jvm.internal.C3862t;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes3.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final m0 f12593a;

    /* renamed from: b, reason: collision with root package name */
    private final U f12594b;

    /* renamed from: c, reason: collision with root package name */
    private final U f12595c;

    public d(m0 typeParameter, U inProjection, U outProjection) {
        C3862t.g(typeParameter, "typeParameter");
        C3862t.g(inProjection, "inProjection");
        C3862t.g(outProjection, "outProjection");
        this.f12593a = typeParameter;
        this.f12594b = inProjection;
        this.f12595c = outProjection;
    }

    public final U a() {
        return this.f12594b;
    }

    public final U b() {
        return this.f12595c;
    }

    public final m0 c() {
        return this.f12593a;
    }

    public final boolean d() {
        return e.f6980a.b(this.f12594b, this.f12595c);
    }
}
