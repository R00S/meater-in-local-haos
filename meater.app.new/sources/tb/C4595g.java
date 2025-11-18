package tb;

import Hb.y0;
import Ib.g;
import Ra.D;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.N;
import Ra.h0;
import Ra.m0;
import java.util.Collection;
import kotlin.jvm.internal.C3862t;
import tb.C4603o;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
/* renamed from: tb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4595g {

    /* renamed from: a, reason: collision with root package name */
    public static final C4595g f50013a = new C4595g();

    private C4595g() {
    }

    public static /* synthetic */ boolean f(C4595g c4595g, InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2, boolean z10, boolean z11, boolean z12, Ib.g gVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return c4595g.e(interfaceC1688a, interfaceC1688a2, z10, z13, z12, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC1700m interfaceC1700m, InterfaceC1700m interfaceC1700m2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(boolean z10, InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2, y0 c12, y0 c22) {
        C3862t.g(c12, "c1");
        C3862t.g(c22, "c2");
        if (C3862t.b(c12, c22)) {
            return true;
        }
        InterfaceC1695h interfaceC1695hT = c12.t();
        InterfaceC1695h interfaceC1695hT2 = c22.t();
        if ((interfaceC1695hT instanceof m0) && (interfaceC1695hT2 instanceof m0)) {
            return f50013a.n((m0) interfaceC1695hT, (m0) interfaceC1695hT2, z10, new C4594f(interfaceC1688a, interfaceC1688a2));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2, InterfaceC1700m interfaceC1700m, InterfaceC1700m interfaceC1700m2) {
        return C3862t.b(interfaceC1700m, interfaceC1688a) && C3862t.b(interfaceC1700m2, interfaceC1688a2);
    }

    private final boolean j(InterfaceC1692e interfaceC1692e, InterfaceC1692e interfaceC1692e2) {
        return C3862t.b(interfaceC1692e.l(), interfaceC1692e2.l());
    }

    public static /* synthetic */ boolean l(C4595g c4595g, InterfaceC1700m interfaceC1700m, InterfaceC1700m interfaceC1700m2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return c4595g.k(interfaceC1700m, interfaceC1700m2, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean o(C4595g c4595g, m0 m0Var, m0 m0Var2, boolean z10, Ba.p pVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            pVar = C4591c.f50006B;
        }
        return c4595g.n(m0Var, m0Var2, z10, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(InterfaceC1700m interfaceC1700m, InterfaceC1700m interfaceC1700m2) {
        return false;
    }

    private final boolean q(InterfaceC1700m interfaceC1700m, InterfaceC1700m interfaceC1700m2, Ba.p<? super InterfaceC1700m, ? super InterfaceC1700m, Boolean> pVar, boolean z10) {
        InterfaceC1700m interfaceC1700mC = interfaceC1700m.c();
        InterfaceC1700m interfaceC1700mC2 = interfaceC1700m2.c();
        return ((interfaceC1700mC instanceof InterfaceC1689b) || (interfaceC1700mC2 instanceof InterfaceC1689b)) ? pVar.invoke(interfaceC1700mC, interfaceC1700mC2).booleanValue() : l(this, interfaceC1700mC, interfaceC1700mC2, z10, false, 8, null);
    }

    private final h0 r(InterfaceC1688a interfaceC1688a) {
        while (interfaceC1688a instanceof InterfaceC1689b) {
            InterfaceC1689b interfaceC1689b = (InterfaceC1689b) interfaceC1688a;
            if (interfaceC1689b.i() != InterfaceC1689b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends InterfaceC1689b> collectionG = interfaceC1689b.g();
            C3862t.f(collectionG, "getOverriddenDescriptors(...)");
            interfaceC1688a = (InterfaceC1689b) kotlin.collections.r.K0(collectionG);
            if (interfaceC1688a == null) {
                return null;
            }
        }
        return interfaceC1688a.j();
    }

    public final boolean e(InterfaceC1688a a10, InterfaceC1688a b10, boolean z10, boolean z11, boolean z12, Ib.g kotlinTypeRefiner) {
        C3862t.g(a10, "a");
        C3862t.g(b10, "b");
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (C3862t.b(a10, b10)) {
            return true;
        }
        if (!C3862t.b(a10.getName(), b10.getName())) {
            return false;
        }
        if (z11 && (a10 instanceof D) && (b10 instanceof D) && ((D) a10).K() != ((D) b10).K()) {
            return false;
        }
        if ((C3862t.b(a10.c(), b10.c()) && (!z10 || !C3862t.b(r(a10), r(b10)))) || C4597i.E(a10) || C4597i.E(b10) || !q(a10, b10, C4592d.f50007B, z10)) {
            return false;
        }
        C4603o c4603oI = C4603o.i(kotlinTypeRefiner, new C4593e(z10, a10, b10));
        C3862t.f(c4603oI, "create(...)");
        C4603o.i.a aVarC = c4603oI.E(a10, b10, null, !z12).c();
        C4603o.i.a aVar = C4603o.i.a.OVERRIDABLE;
        return aVarC == aVar && c4603oI.E(b10, a10, null, z12 ^ true).c() == aVar;
    }

    public final boolean k(InterfaceC1700m interfaceC1700m, InterfaceC1700m interfaceC1700m2, boolean z10, boolean z11) {
        return ((interfaceC1700m instanceof InterfaceC1692e) && (interfaceC1700m2 instanceof InterfaceC1692e)) ? j((InterfaceC1692e) interfaceC1700m, (InterfaceC1692e) interfaceC1700m2) : ((interfaceC1700m instanceof m0) && (interfaceC1700m2 instanceof m0)) ? o(this, (m0) interfaceC1700m, (m0) interfaceC1700m2, z10, null, 8, null) : ((interfaceC1700m instanceof InterfaceC1688a) && (interfaceC1700m2 instanceof InterfaceC1688a)) ? f(this, (InterfaceC1688a) interfaceC1700m, (InterfaceC1688a) interfaceC1700m2, z10, z11, false, g.a.f6982a, 16, null) : ((interfaceC1700m instanceof N) && (interfaceC1700m2 instanceof N)) ? C3862t.b(((N) interfaceC1700m).f(), ((N) interfaceC1700m2).f()) : C3862t.b(interfaceC1700m, interfaceC1700m2);
    }

    public final boolean m(m0 a10, m0 b10, boolean z10) {
        C3862t.g(a10, "a");
        C3862t.g(b10, "b");
        return o(this, a10, b10, z10, null, 8, null);
    }

    public final boolean n(m0 a10, m0 b10, boolean z10, Ba.p<? super InterfaceC1700m, ? super InterfaceC1700m, Boolean> equivalentCallables) {
        C3862t.g(a10, "a");
        C3862t.g(b10, "b");
        C3862t.g(equivalentCallables, "equivalentCallables");
        if (C3862t.b(a10, b10)) {
            return true;
        }
        return !C3862t.b(a10.c(), b10.c()) && q(a10, b10, equivalentCallables, z10) && a10.getIndex() == b10.getIndex();
    }
}
