package cb;

import Hb.U;
import Ob.s;
import Ra.AbstractC1707u;
import Ra.E;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.c0;
import Ra.g0;
import Ra.h0;
import Ra.m0;
import Ra.t0;
import Ua.O;
import java.util.List;
import java.util.Map;
import oa.C4170o;
import tb.C4596h;

/* compiled from: JavaMethodDescriptor.java */
/* loaded from: classes3.dex */
public class e extends O implements InterfaceC2355a {

    /* renamed from: h0, reason: collision with root package name */
    public static final InterfaceC1688a.InterfaceC0222a<t0> f31130h0 = new a();

    /* renamed from: i0, reason: collision with root package name */
    public static final InterfaceC1688a.InterfaceC0222a<Boolean> f31131i0 = new b();

    /* renamed from: f0, reason: collision with root package name */
    private c f31132f0;

    /* renamed from: g0, reason: collision with root package name */
    private final boolean f31133g0;

    /* compiled from: JavaMethodDescriptor.java */
    static class a implements InterfaceC1688a.InterfaceC0222a<t0> {
        a() {
        }
    }

    /* compiled from: JavaMethodDescriptor.java */
    static class b implements InterfaceC1688a.InterfaceC0222a<Boolean> {
        b() {
        }
    }

    /* compiled from: JavaMethodDescriptor.java */
    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* renamed from: B, reason: collision with root package name */
        public final boolean f31139B;

        /* renamed from: C, reason: collision with root package name */
        public final boolean f31140C;

        c(boolean z10, boolean z11) {
            this.f31139B = z10;
            this.f31140C = z11;
        }

        private static /* synthetic */ void c(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        public static c j(boolean z10, boolean z11) {
            c cVar = z10 ? z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                c(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(InterfaceC1700m interfaceC1700m, g0 g0Var, Sa.h hVar, qb.f fVar, InterfaceC1689b.a aVar, h0 h0Var, boolean z10) {
        super(interfaceC1700m, g0Var, hVar, fVar, aVar, h0Var);
        if (interfaceC1700m == null) {
            H(0);
        }
        if (hVar == null) {
            H(1);
        }
        if (fVar == null) {
            H(2);
        }
        if (aVar == null) {
            H(3);
        }
        if (h0Var == null) {
            H(4);
        }
        this.f31132f0 = null;
        this.f31133g0 = z10;
    }

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "typeParameters";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "visibility";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "initialize";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static e q1(InterfaceC1700m interfaceC1700m, Sa.h hVar, qb.f fVar, h0 h0Var, boolean z10) {
        if (interfaceC1700m == null) {
            H(5);
        }
        if (hVar == null) {
            H(6);
        }
        if (fVar == null) {
            H(7);
        }
        if (h0Var == null) {
            H(8);
        }
        return new e(interfaceC1700m, null, hVar, fVar, InterfaceC1689b.a.DECLARATION, h0Var, z10);
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1688a
    public boolean F() {
        return this.f31132f0.f31140C;
    }

    @Override // Ua.AbstractC1779s
    public boolean R0() {
        return this.f31132f0.f31139B;
    }

    @Override // Ua.O
    public O p1(c0 c0Var, c0 c0Var2, List<c0> list, List<? extends m0> list2, List<t0> list3, U u10, E e10, AbstractC1707u abstractC1707u, Map<? extends InterfaceC1688a.InterfaceC0222a<?>, ?> map) {
        if (list == null) {
            H(9);
        }
        if (list2 == null) {
            H(10);
        }
        if (list3 == null) {
            H(11);
        }
        if (abstractC1707u == null) {
            H(12);
        }
        O oP1 = super.p1(c0Var, c0Var2, list, list2, list3, u10, e10, abstractC1707u, map);
        g1(s.f13558a.a(oP1).a());
        if (oP1 == null) {
            H(13);
        }
        return oP1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ua.O, Ua.AbstractC1779s
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public e p1(InterfaceC1700m interfaceC1700m, InterfaceC1712z interfaceC1712z, InterfaceC1689b.a aVar, qb.f fVar, Sa.h hVar, h0 h0Var) {
        if (interfaceC1700m == null) {
            H(14);
        }
        if (aVar == null) {
            H(15);
        }
        if (hVar == null) {
            H(16);
        }
        if (h0Var == null) {
            H(17);
        }
        g0 g0Var = (g0) interfaceC1712z;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(interfaceC1700m, g0Var, hVar, fVar, aVar, h0Var, this.f31133g0);
        eVar.t1(R0(), F());
        return eVar;
    }

    @Override // cb.InterfaceC2355a
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public e X(U u10, List<U> list, U u11, C4170o<InterfaceC1688a.InterfaceC0222a<?>, ?> c4170o) {
        if (list == null) {
            H(19);
        }
        if (u11 == null) {
            H(20);
        }
        e eVar = (e) v().c(h.a(list, k(), this)).s(u11).p(u10 == null ? null : C4596h.i(this, u10, Sa.h.f15630e.b())).a().d().e();
        if (c4170o != null) {
            eVar.V0(c4170o.c(), c4170o.d());
        }
        if (eVar == null) {
            H(21);
        }
        return eVar;
    }

    public void t1(boolean z10, boolean z11) {
        this.f31132f0 = c.j(z10, z11);
    }
}
