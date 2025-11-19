package Ua;

import Ra.AbstractC1707u;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.c0;
import Ra.g0;
import Ra.h0;
import Ra.m0;
import Ra.t0;
import com.apptionlabs.meater_app.data.Config;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: SimpleFunctionDescriptorImpl.java */
/* loaded from: classes3.dex */
public class O extends AbstractC1779s implements g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected O(InterfaceC1700m interfaceC1700m, g0 g0Var, Sa.h hVar, qb.f fVar, InterfaceC1689b.a aVar, h0 h0Var) {
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
    }

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 18:
            case 23:
            case 24:
            case 29:
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 18:
            case 23:
            case 24:
            case 29:
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static O m1(InterfaceC1700m interfaceC1700m, Sa.h hVar, qb.f fVar, InterfaceC1689b.a aVar, h0 h0Var) {
        if (interfaceC1700m == null) {
            H(5);
        }
        if (hVar == null) {
            H(6);
        }
        if (fVar == null) {
            H(7);
        }
        if (aVar == null) {
            H(8);
        }
        if (h0Var == null) {
            H(9);
        }
        return new O(interfaceC1700m, null, hVar, fVar, aVar, h0Var);
    }

    @Override // Ua.AbstractC1779s
    /* renamed from: M0 */
    protected AbstractC1779s p1(InterfaceC1700m interfaceC1700m, InterfaceC1712z interfaceC1712z, InterfaceC1689b.a aVar, qb.f fVar, Sa.h hVar, h0 h0Var) {
        if (interfaceC1700m == null) {
            H(25);
        }
        if (aVar == null) {
            H(26);
        }
        if (hVar == null) {
            H(27);
        }
        if (h0Var == null) {
            H(28);
        }
        g0 g0Var = (g0) interfaceC1712z;
        if (fVar == null) {
            fVar = getName();
        }
        return new O(interfaceC1700m, g0Var, hVar, fVar, aVar, h0Var);
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1689b
    /* renamed from: l1 */
    public g0 a0(InterfaceC1700m interfaceC1700m, Ra.E e10, AbstractC1707u abstractC1707u, InterfaceC1689b.a aVar, boolean z10) {
        g0 g0Var = (g0) super.a0(interfaceC1700m, e10, abstractC1707u, aVar, z10);
        if (g0Var == null) {
            H(29);
        }
        return g0Var;
    }

    @Override // Ua.AbstractC1779s, Ua.AbstractC1775n, Ua.AbstractC1774m, Ra.InterfaceC1700m
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public g0 L0() {
        g0 g0Var = (g0) super.L0();
        if (g0Var == null) {
            H(24);
        }
        return g0Var;
    }

    @Override // Ua.AbstractC1779s
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public O S0(c0 c0Var, c0 c0Var2, List<c0> list, List<? extends m0> list2, List<t0> list3, Hb.U u10, Ra.E e10, AbstractC1707u abstractC1707u) {
        if (list == null) {
            H(14);
        }
        if (list2 == null) {
            H(15);
        }
        if (list3 == null) {
            H(16);
        }
        if (abstractC1707u == null) {
            H(17);
        }
        O oP1 = p1(c0Var, c0Var2, list, list2, list3, u10, e10, abstractC1707u, null);
        if (oP1 == null) {
            H(18);
        }
        return oP1;
    }

    public O p1(c0 c0Var, c0 c0Var2, List<c0> list, List<? extends m0> list2, List<t0> list3, Hb.U u10, Ra.E e10, AbstractC1707u abstractC1707u, Map<? extends InterfaceC1688a.InterfaceC0222a<?>, ?> map) {
        if (list == null) {
            H(19);
        }
        if (list2 == null) {
            H(20);
        }
        if (list3 == null) {
            H(21);
        }
        if (abstractC1707u == null) {
            H(22);
        }
        super.S0(c0Var, c0Var2, list, list2, list3, u10, e10, abstractC1707u);
        if (map != null && !map.isEmpty()) {
            this.f17879e0 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1712z, Ra.g0
    public InterfaceC1712z.a<? extends g0> v() {
        InterfaceC1712z.a aVarV = super.v();
        if (aVarV == null) {
            H(30);
        }
        return aVarV;
    }
}
