package ub;

import Hb.E0;
import Hb.Q0;
import Hb.U;
import Ib.g;
import Ib.n;
import Oa.j;
import Ra.InterfaceC1695h;
import Ra.m0;
import java.util.Collection;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: CapturedTypeConstructor.kt */
/* renamed from: ub.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4701c implements InterfaceC4700b {

    /* renamed from: a, reason: collision with root package name */
    private final E0 f50526a;

    /* renamed from: b, reason: collision with root package name */
    private n f50527b;

    public C4701c(E0 projection) {
        C3862t.g(projection, "projection");
        this.f50526a = projection;
        b().b();
        Q0 q02 = Q0.f5693F;
    }

    @Override // ub.InterfaceC4700b
    public E0 b() {
        return this.f50526a;
    }

    public Void c() {
        return null;
    }

    public final n d() {
        return this.f50527b;
    }

    @Override // Hb.y0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C4701c r(g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        E0 e0R = b().r(kotlinTypeRefiner);
        C3862t.f(e0R, "refine(...)");
        return new C4701c(e0R);
    }

    public final void f(n nVar) {
        this.f50527b = nVar;
    }

    @Override // Hb.y0
    public List<m0> getParameters() {
        return r.m();
    }

    @Override // Hb.y0
    public j q() {
        j jVarQ = b().a().O0().q();
        C3862t.f(jVarQ, "getBuiltIns(...)");
        return jVarQ;
    }

    @Override // Hb.y0
    public Collection<U> s() {
        U uA = b().b() == Q0.f5695H ? b().a() : q().I();
        C3862t.d(uA);
        return r.e(uA);
    }

    @Override // Hb.y0
    public /* bridge */ /* synthetic */ InterfaceC1695h t() {
        return (InterfaceC1695h) c();
    }

    public String toString() {
        return "CapturedTypeConstructor(" + b() + ')';
    }

    @Override // Hb.y0
    public boolean u() {
        return false;
    }
}
