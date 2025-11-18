package Ua;

import Hb.AbstractC1082f0;
import Ra.AbstractC1707u;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1702o;
import Ra.Z;
import Ra.b0;
import Ra.h0;
import Ra.t0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import xb.C5087e;

/* compiled from: PropertySetterDescriptorImpl.java */
/* loaded from: classes3.dex */
public class M extends J implements b0 {

    /* renamed from: N, reason: collision with root package name */
    private t0 f17760N;

    /* renamed from: O, reason: collision with root package name */
    private final b0 f17761O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M(Z z10, Sa.h hVar, Ra.E e10, AbstractC1707u abstractC1707u, boolean z11, boolean z12, boolean z13, InterfaceC1689b.a aVar, b0 b0Var, h0 h0Var) {
        M m10;
        M m11;
        super(e10, abstractC1707u, z10, hVar, qb.f.w("<set-" + z10.getName() + ">"), z11, z12, z13, aVar, h0Var);
        if (z10 == null) {
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
        if (aVar == null) {
            H(4);
        }
        if (h0Var == null) {
            H(5);
        }
        if (b0Var != 0) {
            m11 = this;
            m10 = b0Var;
        } else {
            m10 = this;
            m11 = m10;
        }
        m11.f17761O = m10;
    }

    private static /* synthetic */ void H(int i10) {
        String str;
        int i11;
        switch (i10) {
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getValueParameters";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[1] = "getReturnType";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static V Q0(b0 b0Var, Hb.U u10, Sa.h hVar) {
        if (b0Var == null) {
            H(7);
        }
        if (u10 == null) {
            H(8);
        }
        if (hVar == null) {
            H(9);
        }
        return new V(b0Var, null, 0, hVar, qb.h.f48212o, u10, false, false, false, null, h0.f15158a);
    }

    @Override // Ua.J, Ua.AbstractC1775n, Ua.AbstractC1774m, Ra.InterfaceC1700m
    /* renamed from: R0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b0 L0() {
        b0 b0Var = this.f17761O;
        if (b0Var == null) {
            H(13);
        }
        return b0Var;
    }

    public void S0(t0 t0Var) {
        if (t0Var == null) {
            H(6);
        }
        this.f17760N = t0Var;
    }

    @Override // Ra.InterfaceC1712z, Ra.InterfaceC1689b, Ra.InterfaceC1688a
    public Collection<? extends b0> g() {
        Collection<Ra.Y> collectionM0 = super.M0(false);
        if (collectionM0 == null) {
            H(10);
        }
        return collectionM0;
    }

    @Override // Ra.InterfaceC1688a
    public Hb.U getReturnType() {
        AbstractC1082f0 abstractC1082f0Z = C5087e.m(this).Z();
        if (abstractC1082f0Z == null) {
            H(12);
        }
        return abstractC1082f0Z;
    }

    @Override // Ra.InterfaceC1688a
    public List<t0> k() {
        t0 t0Var = this.f17760N;
        if (t0Var == null) {
            throw new IllegalStateException();
        }
        List<t0> listSingletonList = Collections.singletonList(t0Var);
        if (listSingletonList == null) {
            H(11);
        }
        return listSingletonList;
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> interfaceC1702o, D d10) {
        return interfaceC1702o.g(this, d10);
    }
}
