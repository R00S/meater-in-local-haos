package Hb;

import Hb.InterfaceC1105r0;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes3.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public static final X f5717a = new X();

    /* renamed from: b, reason: collision with root package name */
    private static final Ba.l<Ib.g, AbstractC1082f0> f5718b = a.f5719B;

    /* compiled from: KotlinTypeFactory.kt */
    static final class a implements Ba.l {

        /* renamed from: B, reason: collision with root package name */
        public static final a f5719B = new a();

        a() {
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Ib.g gVar) {
            C3862t.g(gVar, "<unused var>");
            return null;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1082f0 f5720a;

        /* renamed from: b, reason: collision with root package name */
        private final y0 f5721b;

        public b(AbstractC1082f0 abstractC1082f0, y0 y0Var) {
            this.f5720a = abstractC1082f0;
            this.f5721b = y0Var;
        }

        public final AbstractC1082f0 a() {
            return this.f5720a;
        }

        public final y0 b() {
            return this.f5721b;
        }
    }

    private X() {
    }

    public static final AbstractC1082f0 c(Ra.l0 l0Var, List<? extends E0> arguments) {
        C3862t.g(l0Var, "<this>");
        C3862t.g(arguments, "arguments");
        return new C1102p0(InterfaceC1105r0.a.f5787a, false).i(C1104q0.f5782e.a(null, l0Var, arguments), u0.f5791C.j());
    }

    private final Ab.k d(y0 y0Var, List<? extends E0> list, Ib.g gVar) {
        InterfaceC1695h interfaceC1695hT = y0Var.t();
        if (interfaceC1695hT instanceof Ra.m0) {
            return ((Ra.m0) interfaceC1695hT).u().s();
        }
        if (interfaceC1695hT instanceof InterfaceC1692e) {
            if (gVar == null) {
                gVar = C5087e.r(C5087e.s(interfaceC1695hT));
            }
            return list.isEmpty() ? Ua.A.b((InterfaceC1692e) interfaceC1695hT, gVar) : Ua.A.a((InterfaceC1692e) interfaceC1695hT, z0.f5820c.b(y0Var, list), gVar);
        }
        if (interfaceC1695hT instanceof Ra.l0) {
            return Jb.l.a(Jb.h.f7683F, true, ((Ra.l0) interfaceC1695hT).getName().toString());
        }
        if (y0Var instanceof T) {
            return ((T) y0Var).f();
        }
        throw new IllegalStateException("Unsupported classifier: " + interfaceC1695hT + " for constructor: " + y0Var);
    }

    public static final P0 e(AbstractC1082f0 lowerBound, AbstractC1082f0 upperBound) {
        C3862t.g(lowerBound, "lowerBound");
        C3862t.g(upperBound, "upperBound");
        return C3862t.b(lowerBound, upperBound) ? lowerBound : new L(lowerBound, upperBound);
    }

    public static final AbstractC1082f0 f(u0 attributes, vb.q constructor, boolean z10) {
        C3862t.g(attributes, "attributes");
        C3862t.g(constructor, "constructor");
        return m(attributes, constructor, kotlin.collections.r.m(), z10, Jb.l.a(Jb.h.f7681D, true, "unknown integer literal type"));
    }

    private final b g(y0 y0Var, Ib.g gVar, List<? extends E0> list) {
        InterfaceC1695h interfaceC1695hF;
        InterfaceC1695h interfaceC1695hT = y0Var.t();
        if (interfaceC1695hT == null || (interfaceC1695hF = gVar.f(interfaceC1695hT)) == null) {
            return null;
        }
        if (interfaceC1695hF instanceof Ra.l0) {
            return new b(c((Ra.l0) interfaceC1695hF, list), null);
        }
        y0 y0VarR = interfaceC1695hF.l().r(gVar);
        C3862t.f(y0VarR, "refine(...)");
        return new b(null, y0VarR);
    }

    public static final AbstractC1082f0 h(u0 attributes, InterfaceC1692e descriptor, List<? extends E0> arguments) {
        C3862t.g(attributes, "attributes");
        C3862t.g(descriptor, "descriptor");
        C3862t.g(arguments, "arguments");
        y0 y0VarL = descriptor.l();
        C3862t.f(y0VarL, "getTypeConstructor(...)");
        return k(attributes, y0VarL, arguments, false, null, 16, null);
    }

    public static final AbstractC1082f0 i(u0 attributes, y0 constructor, List<? extends E0> arguments, boolean z10) {
        C3862t.g(attributes, "attributes");
        C3862t.g(constructor, "constructor");
        C3862t.g(arguments, "arguments");
        return k(attributes, constructor, arguments, z10, null, 16, null);
    }

    public static final AbstractC1082f0 j(u0 attributes, y0 constructor, List<? extends E0> arguments, boolean z10, Ib.g gVar) {
        C3862t.g(attributes, "attributes");
        C3862t.g(constructor, "constructor");
        C3862t.g(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z10 || constructor.t() == null) {
            return n(attributes, constructor, arguments, z10, f5717a.d(constructor, arguments, gVar), new V(constructor, arguments, attributes, z10));
        }
        InterfaceC1695h interfaceC1695hT = constructor.t();
        C3862t.d(interfaceC1695hT);
        AbstractC1082f0 abstractC1082f0U = interfaceC1695hT.u();
        C3862t.f(abstractC1082f0U, "getDefaultType(...)");
        return abstractC1082f0U;
    }

    public static /* synthetic */ AbstractC1082f0 k(u0 u0Var, y0 y0Var, List list, boolean z10, Ib.g gVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return j(u0Var, y0Var, list, z10, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1082f0 l(y0 y0Var, List list, u0 u0Var, boolean z10, Ib.g refiner) {
        C3862t.g(refiner, "refiner");
        b bVarG = f5717a.g(y0Var, refiner, list);
        if (bVarG == null) {
            return null;
        }
        AbstractC1082f0 abstractC1082f0A = bVarG.a();
        if (abstractC1082f0A != null) {
            return abstractC1082f0A;
        }
        y0 y0VarB = bVarG.b();
        C3862t.d(y0VarB);
        return j(u0Var, y0VarB, list, z10, refiner);
    }

    public static final AbstractC1082f0 m(u0 attributes, y0 constructor, List<? extends E0> arguments, boolean z10, Ab.k memberScope) {
        C3862t.g(attributes, "attributes");
        C3862t.g(constructor, "constructor");
        C3862t.g(arguments, "arguments");
        C3862t.g(memberScope, "memberScope");
        C1084g0 c1084g0 = new C1084g0(constructor, arguments, z10, memberScope, new W(constructor, arguments, attributes, z10, memberScope));
        return attributes.isEmpty() ? c1084g0 : new C1086h0(c1084g0, attributes);
    }

    public static final AbstractC1082f0 n(u0 attributes, y0 constructor, List<? extends E0> arguments, boolean z10, Ab.k memberScope, Ba.l<? super Ib.g, ? extends AbstractC1082f0> refinedTypeFactory) {
        C3862t.g(attributes, "attributes");
        C3862t.g(constructor, "constructor");
        C3862t.g(arguments, "arguments");
        C3862t.g(memberScope, "memberScope");
        C3862t.g(refinedTypeFactory, "refinedTypeFactory");
        C1084g0 c1084g0 = new C1084g0(constructor, arguments, z10, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? c1084g0 : new C1086h0(c1084g0, attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1082f0 o(y0 y0Var, List list, u0 u0Var, boolean z10, Ab.k kVar, Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        b bVarG = f5717a.g(y0Var, kotlinTypeRefiner, list);
        if (bVarG == null) {
            return null;
        }
        AbstractC1082f0 abstractC1082f0A = bVarG.a();
        if (abstractC1082f0A != null) {
            return abstractC1082f0A;
        }
        y0 y0VarB = bVarG.b();
        C3862t.d(y0VarB);
        return m(u0Var, y0VarB, list, z10, kVar);
    }
}
