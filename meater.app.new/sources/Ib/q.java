package Ib;

import Hb.C1085h;
import Hb.P0;
import Hb.U;
import Hb.x0;
import Ib.f;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import tb.C4603o;

/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes3.dex */
public final class q implements p {

    /* renamed from: c, reason: collision with root package name */
    private final g f7003c;

    /* renamed from: d, reason: collision with root package name */
    private final f f7004d;

    /* renamed from: e, reason: collision with root package name */
    private final C4603o f7005e;

    public q(g kotlinTypeRefiner, f kotlinTypePreparator) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        C3862t.g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f7003c = kotlinTypeRefiner;
        this.f7004d = kotlinTypePreparator;
        C4603o c4603oM = C4603o.m(d());
        C3862t.f(c4603oM, "createWithTypeRefiner(...)");
        this.f7005e = c4603oM;
    }

    @Override // Ib.p
    public C4603o a() {
        return this.f7005e;
    }

    @Override // Ib.e
    public boolean b(U subtype, U supertype) {
        C3862t.g(subtype, "subtype");
        C3862t.g(supertype, "supertype");
        return g(C1199a.b(true, false, null, f(), d(), 6, null), subtype.R0(), supertype.R0());
    }

    @Override // Ib.e
    public boolean c(U a10, U b10) {
        C3862t.g(a10, "a");
        C3862t.g(b10, "b");
        return e(C1199a.b(false, false, null, f(), d(), 6, null), a10.R0(), b10.R0());
    }

    @Override // Ib.p
    public g d() {
        return this.f7003c;
    }

    public final boolean e(x0 x0Var, P0 a10, P0 b10) {
        C3862t.g(x0Var, "<this>");
        C3862t.g(a10, "a");
        C3862t.g(b10, "b");
        return C1085h.f5748a.m(x0Var, a10, b10);
    }

    public f f() {
        return this.f7004d;
    }

    public final boolean g(x0 x0Var, P0 subType, P0 superType) {
        C3862t.g(x0Var, "<this>");
        C3862t.g(subType, "subType");
        C3862t.g(superType, "superType");
        return C1085h.v(C1085h.f5748a, x0Var, subType, superType, false, 8, null);
    }

    public /* synthetic */ q(g gVar, f fVar, int i10, C3854k c3854k) {
        this(gVar, (i10 & 2) != 0 ? f.a.f6981a : fVar);
    }
}
