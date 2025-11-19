package cb;

import Hb.U;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.h0;
import Ua.C1770i;
import java.util.List;
import kotlin.collections.r;
import oa.C4170o;
import tb.C4596h;

/* compiled from: JavaClassConstructorDescriptor.java */
/* loaded from: classes3.dex */
public class b extends C1770i implements InterfaceC2355a {

    /* renamed from: g0, reason: collision with root package name */
    private Boolean f31125g0;

    /* renamed from: h0, reason: collision with root package name */
    private Boolean f31126h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(InterfaceC1692e interfaceC1692e, b bVar, Sa.h hVar, boolean z10, InterfaceC1689b.a aVar, h0 h0Var) {
        super(interfaceC1692e, bVar, hVar, z10, aVar, h0Var);
        if (interfaceC1692e == null) {
            H(0);
        }
        if (hVar == null) {
            H(1);
        }
        if (aVar == null) {
            H(2);
        }
        if (h0Var == null) {
            H(3);
        }
        this.f31125g0 = null;
        this.f31126h0 = null;
    }

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "newOwner";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 18:
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b u1(InterfaceC1692e interfaceC1692e, Sa.h hVar, boolean z10, h0 h0Var) {
        if (interfaceC1692e == null) {
            H(4);
        }
        if (hVar == null) {
            H(5);
        }
        if (h0Var == null) {
            H(6);
        }
        return new b(interfaceC1692e, null, hVar, z10, InterfaceC1689b.a.DECLARATION, h0Var);
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1688a
    public boolean F() {
        return this.f31126h0.booleanValue();
    }

    @Override // Ua.AbstractC1779s
    public boolean R0() {
        return this.f31125g0.booleanValue();
    }

    @Override // Ua.AbstractC1779s
    public void Z0(boolean z10) {
        this.f31125g0 = Boolean.valueOf(z10);
    }

    @Override // Ua.AbstractC1779s
    public void a1(boolean z10) {
        this.f31126h0 = Boolean.valueOf(z10);
    }

    protected b t1(InterfaceC1692e interfaceC1692e, b bVar, InterfaceC1689b.a aVar, h0 h0Var, Sa.h hVar) {
        if (interfaceC1692e == null) {
            H(12);
        }
        if (aVar == null) {
            H(13);
        }
        if (h0Var == null) {
            H(14);
        }
        if (hVar == null) {
            H(15);
        }
        return new b(interfaceC1692e, bVar, hVar, this.f17822f0, aVar, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ua.C1770i
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public b p1(InterfaceC1700m interfaceC1700m, InterfaceC1712z interfaceC1712z, InterfaceC1689b.a aVar, qb.f fVar, Sa.h hVar, h0 h0Var) {
        if (interfaceC1700m == null) {
            H(7);
        }
        if (aVar == null) {
            H(8);
        }
        if (hVar == null) {
            H(9);
        }
        if (h0Var == null) {
            H(10);
        }
        if (aVar == InterfaceC1689b.a.DECLARATION || aVar == InterfaceC1689b.a.SYNTHESIZED) {
            b bVarT1 = t1((InterfaceC1692e) interfaceC1700m, (b) interfaceC1712z, aVar, h0Var, hVar);
            bVarT1.Z0(R0());
            bVarT1.a1(F());
            return bVarT1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC1700m + "\nkind: " + aVar);
    }

    @Override // cb.InterfaceC2355a
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public b X(U u10, List<U> list, U u11, C4170o<InterfaceC1688a.InterfaceC0222a<?>, ?> c4170o) {
        if (list == null) {
            H(16);
        }
        if (u11 == null) {
            H(17);
        }
        b bVarP1 = p1(c(), null, i(), null, getAnnotations(), j());
        bVarP1.S0(u10 == null ? null : C4596h.i(bVarP1, u10, Sa.h.f15630e.b()), d0(), r.m(), getTypeParameters(), h.a(list, k(), bVarP1), u11, m(), getVisibility());
        if (c4170o != null) {
            bVarP1.V0(c4170o.c(), c4170o.d());
        }
        return bVarP1;
    }
}
