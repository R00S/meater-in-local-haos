package Ua;

import Hb.AbstractC1082f0;
import Hb.AbstractC1103q;
import Hb.Q0;
import Hb.u0;
import Hb.y0;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1702o;
import Ra.h0;
import Ra.k0;
import Ra.m0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import tb.C4595g;
import xb.C5087e;

/* compiled from: AbstractTypeParameterDescriptor.java */
/* renamed from: Ua.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1769h extends AbstractC1775n implements m0 {

    /* renamed from: F, reason: collision with root package name */
    private final Q0 f17808F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f17809G;

    /* renamed from: H, reason: collision with root package name */
    private final int f17810H;

    /* renamed from: I, reason: collision with root package name */
    private final Gb.i<y0> f17811I;

    /* renamed from: J, reason: collision with root package name */
    private final Gb.i<AbstractC1082f0> f17812J;

    /* renamed from: K, reason: collision with root package name */
    private final Gb.n f17813K;

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: Ua.h$a */
    class a implements Ba.a<y0> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Gb.n f17814B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ k0 f17815C;

        a(Gb.n nVar, k0 k0Var) {
            this.f17814B = nVar;
            this.f17815C = k0Var;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y0 invoke() {
            return new c(AbstractC1769h.this, this.f17814B, this.f17815C);
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: Ua.h$b */
    class b implements Ba.a<AbstractC1082f0> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ qb.f f17817B;

        /* compiled from: AbstractTypeParameterDescriptor.java */
        /* renamed from: Ua.h$b$a */
        class a implements Ba.a<Ab.k> {
            a() {
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Ab.k invoke() {
                return Ab.x.m("Scope for type parameter " + b.this.f17817B.j(), AbstractC1769h.this.getUpperBounds());
            }
        }

        b(qb.f fVar) {
            this.f17817B = fVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1082f0 invoke() {
            return Hb.X.m(u0.f5791C.j(), AbstractC1769h.this.l(), Collections.emptyList(), false, new Ab.i(new a()));
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: Ua.h$c */
    private class c extends AbstractC1103q {

        /* renamed from: d, reason: collision with root package name */
        private final k0 f17820d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC1769h f17821e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC1769h abstractC1769h, Gb.n nVar, k0 k0Var) {
            super(nVar);
            if (nVar == null) {
                I(0);
            }
            this.f17821e = abstractC1769h;
            this.f17820d = k0Var;
        }

        private static /* synthetic */ void I(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // Hb.AbstractC1103q
        protected void A(Hb.U u10) {
            if (u10 == null) {
                I(6);
            }
            this.f17821e.L0(u10);
        }

        @Override // Hb.AbstractC1110w
        protected boolean e(InterfaceC1695h interfaceC1695h) {
            if (interfaceC1695h == null) {
                I(9);
            }
            return (interfaceC1695h instanceof m0) && C4595g.f50013a.m(this.f17821e, (m0) interfaceC1695h, true);
        }

        @Override // Hb.y0
        public List<m0> getParameters() {
            List<m0> listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                I(2);
            }
            return listEmptyList;
        }

        @Override // Hb.AbstractC1103q
        protected Collection<Hb.U> n() {
            List<Hb.U> listM0 = this.f17821e.M0();
            if (listM0 == null) {
                I(1);
            }
            return listM0;
        }

        @Override // Hb.AbstractC1103q
        protected Hb.U o() {
            return Jb.l.d(Jb.k.f7742V, new String[0]);
        }

        @Override // Hb.y0
        public Oa.j q() {
            Oa.j jVarM = C5087e.m(this.f17821e);
            if (jVarM == null) {
                I(4);
            }
            return jVarM;
        }

        @Override // Hb.AbstractC1110w, Hb.y0
        public InterfaceC1695h t() {
            AbstractC1769h abstractC1769h = this.f17821e;
            if (abstractC1769h == null) {
                I(3);
            }
            return abstractC1769h;
        }

        public String toString() {
            return this.f17821e.getName().toString();
        }

        @Override // Hb.y0
        public boolean u() {
            return true;
        }

        @Override // Hb.AbstractC1103q
        protected k0 w() {
            k0 k0Var = this.f17820d;
            if (k0Var == null) {
                I(5);
            }
            return k0Var;
        }

        @Override // Hb.AbstractC1103q
        protected List<Hb.U> y(List<Hb.U> list) {
            if (list == null) {
                I(7);
            }
            List<Hb.U> listF0 = this.f17821e.F0(list);
            if (listF0 == null) {
                I(8);
            }
            return listF0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1769h(Gb.n nVar, InterfaceC1700m interfaceC1700m, Sa.h hVar, qb.f fVar, Q0 q02, boolean z10, int i10, h0 h0Var, k0 k0Var) {
        super(interfaceC1700m, hVar, fVar, h0Var);
        if (nVar == null) {
            H(0);
        }
        if (interfaceC1700m == null) {
            H(1);
        }
        if (hVar == null) {
            H(2);
        }
        if (fVar == null) {
            H(3);
        }
        if (q02 == null) {
            H(4);
        }
        if (h0Var == null) {
            H(5);
        }
        if (k0Var == null) {
            H(6);
        }
        this.f17808F = q02;
        this.f17809G = z10;
        this.f17810H = i10;
        this.f17811I = nVar.g(new a(nVar, k0Var));
        this.f17812J = nVar.g(new b(fVar));
        this.f17813K = nVar;
    }

    private static /* synthetic */ void H(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[1] = "getDefaultType";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getOriginal";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                throw new IllegalStateException(str2);
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Ra.m0
    public boolean E() {
        return this.f17809G;
    }

    protected List<Hb.U> F0(List<Hb.U> list) {
        if (list == null) {
            H(12);
        }
        if (list == null) {
            H(13);
        }
        return list;
    }

    protected abstract void L0(Hb.U u10);

    protected abstract List<Hb.U> M0();

    @Override // Ra.m0
    public Gb.n f0() {
        Gb.n nVar = this.f17813K;
        if (nVar == null) {
            H(14);
        }
        return nVar;
    }

    @Override // Ra.m0
    public int getIndex() {
        return this.f17810H;
    }

    @Override // Ra.m0
    public List<Hb.U> getUpperBounds() {
        List<Hb.U> listS = ((c) l()).s();
        if (listS == null) {
            H(8);
        }
        return listS;
    }

    @Override // Ra.m0, Ra.InterfaceC1695h
    public final y0 l() {
        y0 y0VarInvoke = this.f17811I.invoke();
        if (y0VarInvoke == null) {
            H(9);
        }
        return y0VarInvoke;
    }

    @Override // Ra.m0
    public boolean l0() {
        return false;
    }

    @Override // Ra.m0
    public Q0 p() {
        Q0 q02 = this.f17808F;
        if (q02 == null) {
            H(7);
        }
        return q02;
    }

    @Override // Ra.InterfaceC1695h
    public AbstractC1082f0 u() {
        AbstractC1082f0 abstractC1082f0Invoke = this.f17812J.invoke();
        if (abstractC1082f0Invoke == null) {
            H(10);
        }
        return abstractC1082f0Invoke;
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> interfaceC1702o, D d10) {
        return interfaceC1702o.j(this, d10);
    }

    @Override // Ua.AbstractC1775n, Ua.AbstractC1774m, Ra.InterfaceC1700m
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 L0() {
        m0 m0Var = (m0) super.L0();
        if (m0Var == null) {
            H(11);
        }
        return m0Var;
    }
}
