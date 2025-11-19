package Ua;

import Ab.k;
import Hb.AbstractC1082f0;
import Hb.C1109v;
import Hb.y0;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.EnumC1693f;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.h0;
import Ra.m0;
import Ra.r0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: ClassDescriptorImpl.java */
/* renamed from: Ua.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1772k extends AbstractC1771j {

    /* renamed from: J, reason: collision with root package name */
    private final Ra.E f17826J;

    /* renamed from: K, reason: collision with root package name */
    private final EnumC1693f f17827K;

    /* renamed from: L, reason: collision with root package name */
    private final y0 f17828L;

    /* renamed from: M, reason: collision with root package name */
    private Ab.k f17829M;

    /* renamed from: N, reason: collision with root package name */
    private Set<InterfaceC1691d> f17830N;

    /* renamed from: O, reason: collision with root package name */
    private InterfaceC1691d f17831O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772k(InterfaceC1700m interfaceC1700m, qb.f fVar, Ra.E e10, EnumC1693f enumC1693f, Collection<Hb.U> collection, h0 h0Var, boolean z10, Gb.n nVar) {
        super(nVar, interfaceC1700m, fVar, h0Var, z10);
        if (interfaceC1700m == null) {
            E0(0);
        }
        if (fVar == null) {
            E0(1);
        }
        if (e10 == null) {
            E0(2);
        }
        if (enumC1693f == null) {
            E0(3);
        }
        if (collection == null) {
            E0(4);
        }
        if (h0Var == null) {
            E0(5);
        }
        if (nVar == null) {
            E0(6);
        }
        this.f17826J = e10;
        this.f17827K = enumC1693f;
        this.f17828L = new C1109v(this, Collections.emptyList(), collection, nVar);
    }

    private static /* synthetic */ void E0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getTypeConstructor";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getConstructors";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Ra.InterfaceC1692e
    public boolean C() {
        return false;
    }

    @Override // Ra.D
    public boolean D0() {
        return false;
    }

    @Override // Ra.InterfaceC1692e
    public Collection<InterfaceC1692e> J() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            E0(19);
        }
        return listEmptyList;
    }

    @Override // Ra.InterfaceC1692e
    public boolean J0() {
        return false;
    }

    @Override // Ra.D
    public boolean K() {
        return false;
    }

    @Override // Ra.InterfaceC1696i
    public boolean L() {
        return false;
    }

    public final void L0(Ab.k kVar, Set<InterfaceC1691d> set, InterfaceC1691d interfaceC1691d) {
        if (kVar == null) {
            E0(7);
        }
        if (set == null) {
            E0(8);
        }
        this.f17829M = kVar;
        this.f17830N = set;
        this.f17831O = interfaceC1691d;
    }

    @Override // Ra.InterfaceC1692e
    public InterfaceC1691d P() {
        return this.f17831O;
    }

    @Override // Ra.InterfaceC1692e
    public Ab.k Q() {
        k.b bVar = k.b.f1150b;
        if (bVar == null) {
            E0(14);
        }
        return bVar;
    }

    @Override // Ra.InterfaceC1692e
    public InterfaceC1692e S() {
        return null;
    }

    @Override // Sa.a
    public Sa.h getAnnotations() {
        Sa.h hVarB = Sa.h.f15630e.b();
        if (hVarB == null) {
            E0(9);
        }
        return hVarB;
    }

    @Override // Ra.InterfaceC1692e, Ra.D, Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        AbstractC1707u abstractC1707u = C1706t.f15170e;
        if (abstractC1707u == null) {
            E0(17);
        }
        return abstractC1707u;
    }

    @Override // Ra.InterfaceC1692e
    public EnumC1693f i() {
        EnumC1693f enumC1693f = this.f17827K;
        if (enumC1693f == null) {
            E0(15);
        }
        return enumC1693f;
    }

    @Override // Ra.InterfaceC1692e
    public boolean isInline() {
        return false;
    }

    @Override // Ra.InterfaceC1695h
    public y0 l() {
        y0 y0Var = this.f17828L;
        if (y0Var == null) {
            E0(10);
        }
        return y0Var;
    }

    @Override // Ra.InterfaceC1692e, Ra.D
    public Ra.E m() {
        Ra.E e10 = this.f17826J;
        if (e10 == null) {
            E0(16);
        }
        return e10;
    }

    @Override // Ra.InterfaceC1692e
    public Collection<InterfaceC1691d> n() {
        Set<InterfaceC1691d> set = this.f17830N;
        if (set == null) {
            E0(11);
        }
        return set;
    }

    @Override // Ra.InterfaceC1692e
    public boolean o() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1696i
    public List<m0> w() {
        List<m0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            E0(18);
        }
        return listEmptyList;
    }

    @Override // Ra.InterfaceC1692e
    public boolean y() {
        return false;
    }

    @Override // Ra.InterfaceC1692e
    public r0<AbstractC1082f0> y0() {
        return null;
    }

    @Override // Ua.z
    public Ab.k z0(Ib.g gVar) {
        if (gVar == null) {
            E0(12);
        }
        Ab.k kVar = this.f17829M;
        if (kVar == null) {
            E0(13);
        }
        return kVar;
    }
}
