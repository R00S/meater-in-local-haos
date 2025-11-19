package cb;

import Gb.j;
import Hb.U;
import Ra.AbstractC1707u;
import Ra.C1697j;
import Ra.E;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.b0;
import Ra.h0;
import Ua.K;
import Ua.L;
import Ua.M;
import ib.k0;
import java.util.List;
import kotlin.collections.r;
import oa.C4170o;
import tb.C4596h;
import vb.AbstractC4943g;

/* compiled from: JavaPropertyDescriptor.java */
/* loaded from: classes3.dex */
public class f extends K implements InterfaceC2355a {

    /* renamed from: d0, reason: collision with root package name */
    private final boolean f31141d0;

    /* renamed from: e0, reason: collision with root package name */
    private final C4170o<InterfaceC1688a.InterfaceC0222a<?>, ?> f31142e0;

    /* renamed from: f0, reason: collision with root package name */
    private U f31143f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(InterfaceC1700m interfaceC1700m, Sa.h hVar, E e10, AbstractC1707u abstractC1707u, boolean z10, qb.f fVar, h0 h0Var, Z z11, InterfaceC1689b.a aVar, boolean z12, C4170o<InterfaceC1688a.InterfaceC0222a<?>, ?> c4170o) {
        super(interfaceC1700m, z11, hVar, e10, abstractC1707u, z10, fVar, aVar, h0Var, false, false, false, false, false, false);
        if (interfaceC1700m == null) {
            H(0);
        }
        if (hVar == null) {
            H(1);
        }
        if (e10 == null) {
            H(2);
        }
        if (abstractC1707u == null) {
            H(3);
        }
        if (fVar == null) {
            H(4);
        }
        if (h0Var == null) {
            H(5);
        }
        if (aVar == null) {
            H(6);
        }
        this.f31143f0 = null;
        this.f31141d0 = z12;
        this.f31142e0 = c4170o;
    }

    private static /* synthetic */ void H(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "visibility";
                break;
            case 4:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "name";
                break;
            case 5:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "create";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static f g1(InterfaceC1700m interfaceC1700m, Sa.h hVar, E e10, AbstractC1707u abstractC1707u, boolean z10, qb.f fVar, h0 h0Var, boolean z11) {
        if (interfaceC1700m == null) {
            H(7);
        }
        if (hVar == null) {
            H(8);
        }
        if (e10 == null) {
            H(9);
        }
        if (abstractC1707u == null) {
            H(10);
        }
        if (fVar == null) {
            H(11);
        }
        if (h0Var == null) {
            H(12);
        }
        return new f(interfaceC1700m, hVar, e10, abstractC1707u, z10, fVar, h0Var, null, InterfaceC1689b.a.DECLARATION, z11, null);
    }

    @Override // Ua.X, Ra.InterfaceC1688a
    public boolean F() {
        return false;
    }

    @Override // Ua.K
    protected K Q0(InterfaceC1700m interfaceC1700m, E e10, AbstractC1707u abstractC1707u, Z z10, InterfaceC1689b.a aVar, qb.f fVar, h0 h0Var) {
        if (interfaceC1700m == null) {
            H(13);
        }
        if (e10 == null) {
            H(14);
        }
        if (abstractC1707u == null) {
            H(15);
        }
        if (aVar == null) {
            H(16);
        }
        if (fVar == null) {
            H(17);
        }
        if (h0Var == null) {
            H(18);
        }
        return new f(interfaceC1700m, getAnnotations(), e10, abstractC1707u, h0(), fVar, h0Var, z10, aVar, this.f31141d0, this.f31142e0);
    }

    @Override // cb.InterfaceC2355a
    public InterfaceC2355a X(U u10, List<U> list, U u11, C4170o<InterfaceC1688a.InterfaceC0222a<?>, ?> c4170o) {
        L l10;
        M m10;
        if (list == null) {
            H(19);
        }
        if (u11 == null) {
            H(20);
        }
        Z zL0 = L0() == this ? null : L0();
        f fVar = new f(c(), getAnnotations(), m(), getVisibility(), h0(), getName(), j(), zL0, i(), this.f31141d0, c4170o);
        L lE = e();
        if (lE != null) {
            l10 = l;
            L l11 = new L(fVar, lE.getAnnotations(), lE.m(), lE.getVisibility(), lE.T(), lE.isExternal(), lE.isInline(), i(), zL0 == null ? null : zL0.e(), lE.j());
            l10.O0(lE.c0());
            l10.R0(u11);
        } else {
            l10 = null;
        }
        b0 b0VarH = h();
        if (b0VarH != null) {
            M m11 = new M(fVar, b0VarH.getAnnotations(), b0VarH.m(), b0VarH.getVisibility(), b0VarH.T(), b0VarH.isExternal(), b0VarH.isInline(), i(), zL0 == null ? null : zL0.h(), b0VarH.j());
            m11.O0(m11.c0());
            m11.S0(b0VarH.k().get(0));
            m10 = m11;
        } else {
            m10 = null;
        }
        fVar.W0(l10, m10, n0(), k0());
        fVar.b1(X0());
        Ba.a<j<AbstractC4943g<?>>> aVar = this.f17789I;
        if (aVar != null) {
            fVar.L0(this.f17788H, aVar);
        }
        fVar.w0(g());
        fVar.c1(u11, getTypeParameters(), d0(), u10 == null ? null : C4596h.i(this, u10, Sa.h.f15630e.b()), r.m());
        return fVar;
    }

    @Override // Ua.K
    public void a1(U u10) {
        if (u10 == null) {
            H(22);
        }
        this.f31143f0 = u10;
    }

    @Override // Ua.K, Ra.InterfaceC1688a
    public <V> V g0(InterfaceC1688a.InterfaceC0222a<V> interfaceC0222a) {
        C4170o<InterfaceC1688a.InterfaceC0222a<?>, ?> c4170o = this.f31142e0;
        if (c4170o == null || !c4170o.c().equals(interfaceC0222a)) {
            return null;
        }
        return (V) this.f31142e0.d();
    }

    @Override // Ua.K, Ra.u0
    public boolean z() {
        U uA = a();
        return this.f31141d0 && C1697j.a(uA) && (!k0.i(uA) || Oa.j.v0(uA));
    }
}
