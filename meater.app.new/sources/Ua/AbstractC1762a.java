package Ua;

import Hb.AbstractC1082f0;
import Hb.H0;
import Hb.J0;
import Hb.M0;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1702o;
import Ra.c0;
import Ra.l0;
import java.util.Collections;
import java.util.List;
import tb.C4597i;
import xb.C5087e;

/* compiled from: AbstractClassDescriptor.java */
/* renamed from: Ua.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1762a extends z {

    /* renamed from: C, reason: collision with root package name */
    private final qb.f f17790C;

    /* renamed from: D, reason: collision with root package name */
    protected final Gb.i<AbstractC1082f0> f17791D;

    /* renamed from: E, reason: collision with root package name */
    private final Gb.i<Ab.k> f17792E;

    /* renamed from: F, reason: collision with root package name */
    private final Gb.i<c0> f17793F;

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: Ua.a$a, reason: collision with other inner class name */
    class C0261a implements Ba.a<AbstractC1082f0> {

        /* compiled from: AbstractClassDescriptor.java */
        /* renamed from: Ua.a$a$a, reason: collision with other inner class name */
        class C0262a implements Ba.l<Ib.g, AbstractC1082f0> {
            C0262a() {
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC1082f0 invoke(Ib.g gVar) {
                InterfaceC1695h interfaceC1695hF = gVar.f(AbstractC1762a.this);
                return interfaceC1695hF == null ? AbstractC1762a.this.f17791D.invoke() : interfaceC1695hF instanceof l0 ? Hb.X.c((l0) interfaceC1695hF, M0.g(interfaceC1695hF.l().getParameters())) : interfaceC1695hF instanceof z ? M0.u(interfaceC1695hF.l().r(gVar), ((z) interfaceC1695hF).z0(gVar), this) : interfaceC1695hF.u();
            }
        }

        C0261a() {
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1082f0 invoke() {
            AbstractC1762a abstractC1762a = AbstractC1762a.this;
            return M0.v(abstractC1762a, abstractC1762a.C0(), new C0262a());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: Ua.a$b */
    class b implements Ba.a<Ab.k> {
        b() {
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ab.k invoke() {
            return new Ab.g(AbstractC1762a.this.C0());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: Ua.a$c */
    class c implements Ba.a<c0> {
        c() {
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c0 invoke() {
            return new C1780t(AbstractC1762a.this);
        }
    }

    public AbstractC1762a(Gb.n nVar, qb.f fVar) {
        if (nVar == null) {
            E0(0);
        }
        if (fVar == null) {
            E0(1);
        }
        this.f17790C = fVar;
        this.f17791D = nVar.g(new C0261a());
        this.f17792E = nVar.g(new b());
        this.f17793F = nVar.g(new c());
    }

    private static /* synthetic */ void E0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Ra.InterfaceC1692e
    public Ab.k C0() {
        Ab.k kVarZ0 = z0(C5087e.r(C4597i.g(this)));
        if (kVarZ0 == null) {
            E0(17);
        }
        return kVarZ0;
    }

    @Override // Ra.j0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1692e d(J0 j02) {
        if (j02 == null) {
            E0(18);
        }
        return j02.k() ? this : new C1785y(this, j02);
    }

    @Override // Ra.InterfaceC1692e
    public List<c0> G0() {
        List<c0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            E0(6);
        }
        return listEmptyList;
    }

    @Override // Ua.z
    public Ab.k H(H0 h02, Ib.g gVar) {
        if (h02 == null) {
            E0(10);
        }
        if (gVar == null) {
            E0(11);
        }
        if (!h02.f()) {
            return new Ab.t(z0(gVar), J0.g(h02));
        }
        Ab.k kVarZ0 = z0(gVar);
        if (kVarZ0 == null) {
            E0(12);
        }
        return kVarZ0;
    }

    @Override // Ra.InterfaceC1692e
    public Ab.k H0(H0 h02) {
        if (h02 == null) {
            E0(15);
        }
        Ab.k kVarH = H(h02, C5087e.r(C4597i.g(this)));
        if (kVarH == null) {
            E0(16);
        }
        return kVarH;
    }

    @Override // Ra.InterfaceC1692e
    public c0 K0() {
        c0 c0VarInvoke = this.f17793F.invoke();
        if (c0VarInvoke == null) {
            E0(5);
        }
        return c0VarInvoke;
    }

    @Override // Ra.J
    public qb.f getName() {
        qb.f fVar = this.f17790C;
        if (fVar == null) {
            E0(2);
        }
        return fVar;
    }

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1695h
    public AbstractC1082f0 u() {
        AbstractC1082f0 abstractC1082f0Invoke = this.f17791D.invoke();
        if (abstractC1082f0Invoke == null) {
            E0(20);
        }
        return abstractC1082f0Invoke;
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> interfaceC1702o, D d10) {
        return interfaceC1702o.h(this, d10);
    }

    @Override // Ra.InterfaceC1692e
    public Ab.k x0() {
        Ab.k kVarInvoke = this.f17792E.invoke();
        if (kVarInvoke == null) {
            E0(4);
        }
        return kVarInvoke;
    }

    @Override // Ua.z, Ra.InterfaceC1700m
    public InterfaceC1692e b() {
        return this;
    }
}
