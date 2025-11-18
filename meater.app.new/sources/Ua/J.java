package Ua;

import Hb.J0;
import Ra.AbstractC1707u;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.Z;
import Ra.c0;
import Ra.h0;
import Ra.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PropertyAccessorDescriptorImpl.java */
/* loaded from: classes3.dex */
public abstract class J extends AbstractC1775n implements Ra.Y {

    /* renamed from: F, reason: collision with root package name */
    private boolean f17717F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f17718G;

    /* renamed from: H, reason: collision with root package name */
    private final Ra.E f17719H;

    /* renamed from: I, reason: collision with root package name */
    private final Z f17720I;

    /* renamed from: J, reason: collision with root package name */
    private final boolean f17721J;

    /* renamed from: K, reason: collision with root package name */
    private final InterfaceC1689b.a f17722K;

    /* renamed from: L, reason: collision with root package name */
    private AbstractC1707u f17723L;

    /* renamed from: M, reason: collision with root package name */
    private InterfaceC1712z f17724M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Ra.E e10, AbstractC1707u abstractC1707u, Z z10, Sa.h hVar, qb.f fVar, boolean z11, boolean z12, boolean z13, InterfaceC1689b.a aVar, h0 h0Var) {
        super(z10.c(), hVar, fVar, h0Var);
        if (e10 == null) {
            H(0);
        }
        if (abstractC1707u == null) {
            H(1);
        }
        if (z10 == null) {
            H(2);
        }
        if (hVar == null) {
            H(3);
        }
        if (fVar == null) {
            H(4);
        }
        if (h0Var == null) {
            H(5);
        }
        this.f17724M = null;
        this.f17719H = e10;
        this.f17723L = abstractC1707u;
        this.f17720I = z10;
        this.f17717F = z11;
        this.f17718G = z12;
        this.f17721J = z13;
        this.f17722K = aVar;
    }

    private static /* synthetic */ void H(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getModality";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getVisibility";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[1] = "getCorrespondingVariable";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Ra.Y
    public Z A0() {
        Z z10 = this.f17720I;
        if (z10 == null) {
            H(13);
        }
        return z10;
    }

    @Override // Ra.InterfaceC1712z
    public boolean B0() {
        return false;
    }

    @Override // Ra.D
    public boolean D0() {
        return false;
    }

    @Override // Ra.InterfaceC1688a
    public boolean F() {
        return false;
    }

    @Override // Ra.InterfaceC1689b
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public Ra.Y a0(InterfaceC1700m interfaceC1700m, Ra.E e10, AbstractC1707u abstractC1707u, InterfaceC1689b.a aVar, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // Ra.D
    public boolean K() {
        return false;
    }

    @Override // Ua.AbstractC1775n, Ua.AbstractC1774m, Ra.InterfaceC1700m
    public abstract Ra.Y L0();

    protected Collection<Ra.Y> M0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (Z z11 : A0().g()) {
            Ra.D dE = z10 ? z11.e() : z11.h();
            if (dE != null) {
                arrayList.add(dE);
            }
        }
        return arrayList;
    }

    public void N0(boolean z10) {
        this.f17717F = z10;
    }

    @Override // Ra.InterfaceC1712z
    public boolean O() {
        return false;
    }

    public void O0(InterfaceC1712z interfaceC1712z) {
        this.f17724M = interfaceC1712z;
    }

    public void P0(AbstractC1707u abstractC1707u) {
        this.f17723L = abstractC1707u;
    }

    @Override // Ra.Y
    public boolean T() {
        return this.f17717F;
    }

    @Override // Ra.InterfaceC1712z
    public InterfaceC1712z c0() {
        return this.f17724M;
    }

    @Override // Ra.j0
    public InterfaceC1712z d(J0 j02) {
        if (j02 == null) {
            H(7);
        }
        return this;
    }

    @Override // Ra.InterfaceC1688a
    public c0 d0() {
        return A0().d0();
    }

    @Override // Ra.InterfaceC1688a
    public <V> V g0(InterfaceC1688a.InterfaceC0222a<V> interfaceC0222a) {
        return null;
    }

    @Override // Ra.InterfaceC1688a
    public List<m0> getTypeParameters() {
        List<m0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            H(9);
        }
        return listEmptyList;
    }

    @Override // Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        AbstractC1707u abstractC1707u = this.f17723L;
        if (abstractC1707u == null) {
            H(11);
        }
        return abstractC1707u;
    }

    @Override // Ra.InterfaceC1689b
    public InterfaceC1689b.a i() {
        InterfaceC1689b.a aVar = this.f17722K;
        if (aVar == null) {
            H(6);
        }
        return aVar;
    }

    @Override // Ra.D
    public boolean isExternal() {
        return this.f17718G;
    }

    @Override // Ra.InterfaceC1712z
    public boolean isInfix() {
        return false;
    }

    @Override // Ra.InterfaceC1712z
    public boolean isInline() {
        return this.f17721J;
    }

    @Override // Ra.InterfaceC1712z
    public boolean isOperator() {
        return false;
    }

    @Override // Ra.InterfaceC1712z
    public boolean isSuspend() {
        return false;
    }

    @Override // Ra.InterfaceC1688a
    public c0 j0() {
        return A0().j0();
    }

    @Override // Ra.D
    public Ra.E m() {
        Ra.E e10 = this.f17719H;
        if (e10 == null) {
            H(10);
        }
        return e10;
    }

    @Override // Ra.InterfaceC1688a
    public List<c0> o0() {
        List<c0> listO0 = A0().o0();
        if (listO0 == null) {
            H(14);
        }
        return listO0;
    }

    @Override // Ra.InterfaceC1712z
    public boolean u0() {
        return false;
    }

    @Override // Ra.InterfaceC1689b
    public void w0(Collection<? extends InterfaceC1689b> collection) {
        if (collection == null) {
            H(16);
        }
    }
}
