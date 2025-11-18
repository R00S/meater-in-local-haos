package Ua;

import Ra.InterfaceC1700m;
import Ra.c0;
import Ra.h0;
import Ra.m0;
import Ra.t0;
import Ra.u0;
import java.util.Collections;
import java.util.List;

/* compiled from: VariableDescriptorImpl.java */
/* loaded from: classes3.dex */
public abstract class X extends AbstractC1775n implements u0 {

    /* renamed from: F, reason: collision with root package name */
    protected Hb.U f17786F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(InterfaceC1700m interfaceC1700m, Sa.h hVar, qb.f fVar, Hb.U u10, h0 h0Var) {
        super(interfaceC1700m, hVar, fVar, h0Var);
        if (interfaceC1700m == null) {
            H(0);
        }
        if (hVar == null) {
            H(1);
        }
        if (fVar == null) {
            H(2);
        }
        if (h0Var == null) {
            H(3);
        }
        this.f17786F = u10;
    }

    private static /* synthetic */ void H(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Ra.InterfaceC1688a
    public boolean F() {
        return false;
    }

    public void F0(Hb.U u10) {
        this.f17786F = u10;
    }

    @Override // Ra.s0
    public Hb.U a() {
        Hb.U u10 = this.f17786F;
        if (u10 == null) {
            H(4);
        }
        return u10;
    }

    public c0 d0() {
        return null;
    }

    public Hb.U getReturnType() {
        Hb.U uA = a();
        if (uA == null) {
            H(10);
        }
        return uA;
    }

    public List<m0> getTypeParameters() {
        List<m0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            H(8);
        }
        return listEmptyList;
    }

    public c0 j0() {
        return null;
    }

    @Override // Ra.InterfaceC1688a
    public List<t0> k() {
        List<t0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            H(6);
        }
        return listEmptyList;
    }
}
