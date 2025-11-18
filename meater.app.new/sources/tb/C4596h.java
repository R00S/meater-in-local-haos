package tb;

import Hb.G0;
import Hb.Q0;
import Hb.U;
import Hb.X;
import Hb.u0;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.E;
import Ra.H;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1712z;
import Ra.Z;
import Ra.c0;
import Ra.g0;
import Ra.h0;
import Sa.h;
import Ua.C1770i;
import Ua.K;
import Ua.L;
import Ua.M;
import Ua.N;
import Ua.O;
import Ua.V;
import com.apptionlabs.meater_app.data.Config;
import java.util.Collections;
import xb.C5087e;

/* compiled from: DescriptorFactory.java */
/* renamed from: tb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4596h {

    /* compiled from: DescriptorFactory.java */
    /* renamed from: tb.h$a */
    private static class a extends C1770i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1692e interfaceC1692e, h0 h0Var, boolean z10) {
            super(interfaceC1692e, null, Sa.h.f15630e.b(), true, InterfaceC1689b.a.DECLARATION, h0Var);
            if (interfaceC1692e == null) {
                H(0);
            }
            if (h0Var == null) {
                H(1);
            }
            r1(Collections.emptyList(), C4597i.k(interfaceC1692e, z10));
        }

        private static /* synthetic */ void H(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "visibility";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[2] = "createSetter";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 23:
            case 25:
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static c0 b(InterfaceC1688a interfaceC1688a, U u10, qb.f fVar, Sa.h hVar, int i10) {
        if (interfaceC1688a == null) {
            a(32);
        }
        if (hVar == null) {
            a(33);
        }
        if (u10 == null) {
            return null;
        }
        return new N(interfaceC1688a, new Bb.c(interfaceC1688a, u10, fVar, null), hVar, qb.g.a(i10));
    }

    public static c0 c(InterfaceC1692e interfaceC1692e, U u10, qb.f fVar, Sa.h hVar, int i10) {
        if (interfaceC1692e == null) {
            a(34);
        }
        if (hVar == null) {
            a(35);
        }
        if (u10 == null) {
            return null;
        }
        return new N(interfaceC1692e, new Bb.b(interfaceC1692e, u10, fVar, null), hVar, qb.g.a(i10));
    }

    public static L d(Z z10, Sa.h hVar) {
        if (z10 == null) {
            a(13);
        }
        if (hVar == null) {
            a(14);
        }
        return j(z10, hVar, true, false, false);
    }

    public static M e(Z z10, Sa.h hVar, Sa.h hVar2) {
        if (z10 == null) {
            a(0);
        }
        if (hVar == null) {
            a(1);
        }
        if (hVar2 == null) {
            a(2);
        }
        return n(z10, hVar, hVar2, true, false, false, z10.j());
    }

    public static Z f(InterfaceC1692e interfaceC1692e) {
        if (interfaceC1692e == null) {
            a(26);
        }
        H hG = C4597i.g(interfaceC1692e);
        InterfaceC1692e interfaceC1692eA = w.a(hG).a(hG);
        if (interfaceC1692eA == null) {
            return null;
        }
        h.a aVar = Sa.h.f15630e;
        Sa.h hVarB = aVar.b();
        E e10 = E.f15106C;
        AbstractC1707u abstractC1707u = C1706t.f15170e;
        qb.f fVar = Oa.p.f13378e;
        InterfaceC1689b.a aVar2 = InterfaceC1689b.a.SYNTHESIZED;
        K kP0 = K.P0(interfaceC1692e, hVarB, e10, abstractC1707u, false, fVar, aVar2, interfaceC1692e.j(), false, false, false, false, false, false);
        L l10 = new L(kP0, aVar.b(), e10, abstractC1707u, false, false, false, aVar2, null, interfaceC1692e.j());
        kP0.V0(l10, null);
        kP0.c1(X.i(u0.f5791C.j(), interfaceC1692eA.l(), Collections.singletonList(new G0(interfaceC1692e.u())), false), Collections.emptyList(), null, null, Collections.emptyList());
        l10.R0(kP0.getReturnType());
        return kP0;
    }

    public static g0 g(InterfaceC1692e interfaceC1692e) {
        if (interfaceC1692e == null) {
            a(24);
        }
        h.a aVar = Sa.h.f15630e;
        O oM1 = O.m1(interfaceC1692e, aVar.b(), Oa.p.f13379f, InterfaceC1689b.a.SYNTHESIZED, interfaceC1692e.j());
        O oO1 = oM1.S0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new V(oM1, null, 0, aVar.b(), qb.f.t("value"), C5087e.m(interfaceC1692e).W(), false, false, false, null, interfaceC1692e.j())), interfaceC1692e.u(), E.f15106C, C1706t.f15170e);
        if (oO1 == null) {
            a(25);
        }
        return oO1;
    }

    public static g0 h(InterfaceC1692e interfaceC1692e) {
        if (interfaceC1692e == null) {
            a(22);
        }
        O oO1 = O.m1(interfaceC1692e, Sa.h.f15630e.b(), Oa.p.f13377d, InterfaceC1689b.a.SYNTHESIZED, interfaceC1692e.j()).S0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), C5087e.m(interfaceC1692e).l(Q0.f5693F, interfaceC1692e.u()), E.f15106C, C1706t.f15170e);
        if (oO1 == null) {
            a(23);
        }
        return oO1;
    }

    public static c0 i(InterfaceC1688a interfaceC1688a, U u10, Sa.h hVar) {
        if (interfaceC1688a == null) {
            a(30);
        }
        if (hVar == null) {
            a(31);
        }
        if (u10 == null) {
            return null;
        }
        return new N(interfaceC1688a, new Bb.d(interfaceC1688a, u10, null), hVar);
    }

    public static L j(Z z10, Sa.h hVar, boolean z11, boolean z12, boolean z13) {
        if (z10 == null) {
            a(15);
        }
        if (hVar == null) {
            a(16);
        }
        return k(z10, hVar, z11, z12, z13, z10.j());
    }

    public static L k(Z z10, Sa.h hVar, boolean z11, boolean z12, boolean z13, h0 h0Var) {
        if (z10 == null) {
            a(17);
        }
        if (hVar == null) {
            a(18);
        }
        if (h0Var == null) {
            a(19);
        }
        return new L(z10, hVar, z10.m(), z10.getVisibility(), z11, z12, z13, InterfaceC1689b.a.DECLARATION, null, h0Var);
    }

    public static C1770i l(InterfaceC1692e interfaceC1692e, h0 h0Var) {
        if (interfaceC1692e == null) {
            a(20);
        }
        if (h0Var == null) {
            a(21);
        }
        return new a(interfaceC1692e, h0Var, false);
    }

    public static M m(Z z10, Sa.h hVar, Sa.h hVar2, boolean z11, boolean z12, boolean z13, AbstractC1707u abstractC1707u, h0 h0Var) {
        if (z10 == null) {
            a(7);
        }
        if (hVar == null) {
            a(8);
        }
        if (hVar2 == null) {
            a(9);
        }
        if (abstractC1707u == null) {
            a(10);
        }
        if (h0Var == null) {
            a(11);
        }
        M m10 = new M(z10, hVar, z10.m(), abstractC1707u, z11, z12, z13, InterfaceC1689b.a.DECLARATION, null, h0Var);
        m10.S0(M.Q0(m10, z10.a(), hVar2));
        return m10;
    }

    public static M n(Z z10, Sa.h hVar, Sa.h hVar2, boolean z11, boolean z12, boolean z13, h0 h0Var) {
        if (z10 == null) {
            a(3);
        }
        if (hVar == null) {
            a(4);
        }
        if (hVar2 == null) {
            a(5);
        }
        if (h0Var == null) {
            a(6);
        }
        return m(z10, hVar, hVar2, z11, z12, z13, z10.getVisibility(), h0Var);
    }

    private static boolean o(InterfaceC1712z interfaceC1712z) {
        if (interfaceC1712z == null) {
            a(29);
        }
        return interfaceC1712z.i() == InterfaceC1689b.a.SYNTHESIZED && C4597i.A(interfaceC1712z.c());
    }

    public static boolean p(InterfaceC1712z interfaceC1712z) {
        if (interfaceC1712z == null) {
            a(28);
        }
        return interfaceC1712z.getName().equals(Oa.p.f13379f) && o(interfaceC1712z);
    }

    public static boolean q(InterfaceC1712z interfaceC1712z) {
        if (interfaceC1712z == null) {
            a(27);
        }
        return interfaceC1712z.getName().equals(Oa.p.f13377d) && o(interfaceC1712z);
    }
}
