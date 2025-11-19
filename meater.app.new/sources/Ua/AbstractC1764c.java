package Ua;

import Hb.J0;
import Hb.Q0;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1702o;
import Ra.c0;
import Ra.h0;
import Ra.m0;
import Ra.t0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: AbstractReceiverParameterDescriptor.java */
/* renamed from: Ua.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1764c extends AbstractC1774m implements c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1764c(Sa.h hVar) {
        super(hVar, qb.h.f48206i);
        if (hVar == null) {
            H(0);
        }
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
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
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
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getOriginal";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
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
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Ra.InterfaceC1688a
    public boolean F() {
        return false;
    }

    @Override // Ra.s0
    public Hb.U a() {
        Hb.U uA = getValue().a();
        if (uA == null) {
            H(6);
        }
        return uA;
    }

    @Override // Ra.InterfaceC1688a
    public c0 d0() {
        return null;
    }

    @Override // Ra.InterfaceC1688a
    public Collection<? extends InterfaceC1688a> g() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            H(8);
        }
        return setEmptySet;
    }

    @Override // Ra.InterfaceC1688a
    public Hb.U getReturnType() {
        return a();
    }

    @Override // Ra.InterfaceC1688a
    public List<m0> getTypeParameters() {
        List<m0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            H(5);
        }
        return listEmptyList;
    }

    @Override // Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        AbstractC1707u abstractC1707u = C1706t.f15171f;
        if (abstractC1707u == null) {
            H(9);
        }
        return abstractC1707u;
    }

    @Override // Ra.InterfaceC1703p
    public h0 j() {
        h0 h0Var = h0.f15158a;
        if (h0Var == null) {
            H(11);
        }
        return h0Var;
    }

    @Override // Ra.InterfaceC1688a
    public c0 j0() {
        return null;
    }

    @Override // Ra.InterfaceC1688a
    public List<t0> k() {
        List<t0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            H(7);
        }
        return listEmptyList;
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> interfaceC1702o, D d10) {
        return interfaceC1702o.d(this, d10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1764c(Sa.h hVar, qb.f fVar) {
        super(hVar, fVar);
        if (hVar == null) {
            H(1);
        }
        if (fVar == null) {
            H(2);
        }
    }

    @Override // Ra.j0
    public c0 d(J0 j02) {
        if (j02 == null) {
            H(3);
        }
        if (j02.k()) {
            return this;
        }
        Hb.U uP = c() instanceof InterfaceC1692e ? j02.p(a(), Q0.f5695H) : j02.p(a(), Q0.f5693F);
        if (uP == null) {
            return null;
        }
        return uP == a() ? this : new N(c(), new Bb.j(uP), getAnnotations());
    }

    @Override // Ua.AbstractC1774m, Ra.InterfaceC1700m
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public Ra.W b() {
        return this;
    }
}
