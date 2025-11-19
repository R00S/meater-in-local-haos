package Ua;

import Hb.Q0;
import Ra.InterfaceC1700m;
import Ra.h0;
import Ra.k0;
import Ra.m0;
import java.util.ArrayList;
import java.util.List;
import tb.C4597i;
import xb.C5087e;

/* compiled from: TypeParameterDescriptorImpl.java */
/* loaded from: classes3.dex */
public class U extends AbstractC1769h {

    /* renamed from: L, reason: collision with root package name */
    private final Ba.l<Hb.U, Void> f17774L;

    /* renamed from: M, reason: collision with root package name */
    private final List<Hb.U> f17775M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f17776N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private U(InterfaceC1700m interfaceC1700m, Sa.h hVar, boolean z10, Q0 q02, qb.f fVar, int i10, h0 h0Var, Ba.l<Hb.U, Void> lVar, k0 k0Var, Gb.n nVar) {
        super(nVar, interfaceC1700m, hVar, fVar, q02, z10, i10, h0Var, k0Var);
        if (interfaceC1700m == null) {
            H(19);
        }
        if (hVar == null) {
            H(20);
        }
        if (q02 == null) {
            H(21);
        }
        if (fVar == null) {
            H(22);
        }
        if (h0Var == null) {
            H(23);
        }
        if (k0Var == null) {
            H(24);
        }
        if (nVar == null) {
            H(25);
        }
        this.f17775M = new ArrayList(1);
        this.f17776N = false;
        this.f17774L = lVar;
    }

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    private void O0() {
        if (this.f17776N) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + V0());
    }

    private void P0() {
        if (this.f17776N) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + V0());
        }
    }

    public static U Q0(InterfaceC1700m interfaceC1700m, Sa.h hVar, boolean z10, Q0 q02, qb.f fVar, int i10, h0 h0Var, Ba.l<Hb.U, Void> lVar, k0 k0Var, Gb.n nVar) {
        if (interfaceC1700m == null) {
            H(12);
        }
        if (hVar == null) {
            H(13);
        }
        if (q02 == null) {
            H(14);
        }
        if (fVar == null) {
            H(15);
        }
        if (h0Var == null) {
            H(16);
        }
        if (k0Var == null) {
            H(17);
        }
        if (nVar == null) {
            H(18);
        }
        return new U(interfaceC1700m, hVar, z10, q02, fVar, i10, h0Var, lVar, k0Var, nVar);
    }

    public static U R0(InterfaceC1700m interfaceC1700m, Sa.h hVar, boolean z10, Q0 q02, qb.f fVar, int i10, h0 h0Var, Gb.n nVar) {
        if (interfaceC1700m == null) {
            H(6);
        }
        if (hVar == null) {
            H(7);
        }
        if (q02 == null) {
            H(8);
        }
        if (fVar == null) {
            H(9);
        }
        if (h0Var == null) {
            H(10);
        }
        if (nVar == null) {
            H(11);
        }
        return Q0(interfaceC1700m, hVar, z10, q02, fVar, i10, h0Var, null, k0.a.f15161a, nVar);
    }

    public static m0 S0(InterfaceC1700m interfaceC1700m, Sa.h hVar, boolean z10, Q0 q02, qb.f fVar, int i10, Gb.n nVar) {
        if (interfaceC1700m == null) {
            H(0);
        }
        if (hVar == null) {
            H(1);
        }
        if (q02 == null) {
            H(2);
        }
        if (fVar == null) {
            H(3);
        }
        if (nVar == null) {
            H(4);
        }
        U uR0 = R0(interfaceC1700m, hVar, z10, q02, fVar, i10, h0.f15158a, nVar);
        uR0.N0(C5087e.m(interfaceC1700m).y());
        uR0.W0();
        return uR0;
    }

    private void T0(Hb.U u10) {
        if (Hb.Y.a(u10)) {
            return;
        }
        this.f17775M.add(u10);
    }

    private String V0() {
        return getName() + " declared in " + C4597i.m(c());
    }

    @Override // Ua.AbstractC1769h
    protected void L0(Hb.U u10) {
        if (u10 == null) {
            H(27);
        }
        Ba.l<Hb.U, Void> lVar = this.f17774L;
        if (lVar == null) {
            return;
        }
        lVar.invoke(u10);
    }

    @Override // Ua.AbstractC1769h
    protected List<Hb.U> M0() {
        O0();
        List<Hb.U> list = this.f17775M;
        if (list == null) {
            H(28);
        }
        return list;
    }

    public void N0(Hb.U u10) {
        if (u10 == null) {
            H(26);
        }
        P0();
        T0(u10);
    }

    public boolean U0() {
        return this.f17776N;
    }

    public void W0() {
        P0();
        this.f17776N = true;
    }
}
