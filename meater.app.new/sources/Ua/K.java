package Ua;

import Hb.H0;
import Hb.J0;
import Hb.Q0;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1702o;
import Ra.InterfaceC1709w;
import Ra.InterfaceC1712z;
import Ra.Z;
import Ra.a0;
import Ra.b0;
import Ra.c0;
import Ra.h0;
import Ra.m0;
import Ra.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import vb.AbstractC4943g;
import xb.C5087e;

/* compiled from: PropertyDescriptorImpl.java */
/* loaded from: classes3.dex */
public class K extends Y implements Z {

    /* renamed from: J, reason: collision with root package name */
    private final Ra.E f17725J;

    /* renamed from: K, reason: collision with root package name */
    private AbstractC1707u f17726K;

    /* renamed from: L, reason: collision with root package name */
    private Collection<? extends Z> f17727L;

    /* renamed from: M, reason: collision with root package name */
    private final Z f17728M;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1689b.a f17729N;

    /* renamed from: O, reason: collision with root package name */
    private final boolean f17730O;

    /* renamed from: P, reason: collision with root package name */
    private final boolean f17731P;

    /* renamed from: Q, reason: collision with root package name */
    private final boolean f17732Q;

    /* renamed from: R, reason: collision with root package name */
    private final boolean f17733R;

    /* renamed from: S, reason: collision with root package name */
    private final boolean f17734S;

    /* renamed from: T, reason: collision with root package name */
    private final boolean f17735T;

    /* renamed from: U, reason: collision with root package name */
    private List<c0> f17736U;

    /* renamed from: V, reason: collision with root package name */
    private c0 f17737V;

    /* renamed from: W, reason: collision with root package name */
    private c0 f17738W;

    /* renamed from: X, reason: collision with root package name */
    private List<m0> f17739X;

    /* renamed from: Y, reason: collision with root package name */
    private L f17740Y;

    /* renamed from: Z, reason: collision with root package name */
    private b0 f17741Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f17742a0;

    /* renamed from: b0, reason: collision with root package name */
    private InterfaceC1709w f17743b0;

    /* renamed from: c0, reason: collision with root package name */
    private InterfaceC1709w f17744c0;

    /* compiled from: PropertyDescriptorImpl.java */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC1700m f17745a;

        /* renamed from: b, reason: collision with root package name */
        private Ra.E f17746b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC1707u f17747c;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC1689b.a f17750f;

        /* renamed from: i, reason: collision with root package name */
        private c0 f17753i;

        /* renamed from: k, reason: collision with root package name */
        private qb.f f17755k;

        /* renamed from: l, reason: collision with root package name */
        private Hb.U f17756l;

        /* renamed from: d, reason: collision with root package name */
        private Z f17748d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17749e = false;

        /* renamed from: g, reason: collision with root package name */
        private H0 f17751g = H0.f5660b;

        /* renamed from: h, reason: collision with root package name */
        private boolean f17752h = true;

        /* renamed from: j, reason: collision with root package name */
        private List<m0> f17754j = null;

        public a() {
            this.f17745a = K.this.c();
            this.f17746b = K.this.m();
            this.f17747c = K.this.getVisibility();
            this.f17750f = K.this.i();
            this.f17753i = K.this.f17737V;
            this.f17755k = K.this.getName();
            this.f17756l = K.this.a();
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    objArr[0] = "kind";
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    objArr[2] = "setKind";
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public Z n() {
            return K.this.R0(this);
        }

        a0 o() {
            Z z10 = this.f17748d;
            if (z10 == null) {
                return null;
            }
            return z10.e();
        }

        b0 p() {
            Z z10 = this.f17748d;
            if (z10 == null) {
                return null;
            }
            return z10.h();
        }

        public a q(boolean z10) {
            this.f17752h = z10;
            return this;
        }

        public a r(InterfaceC1689b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f17750f = aVar;
            return this;
        }

        public a s(Ra.E e10) {
            if (e10 == null) {
                a(6);
            }
            this.f17746b = e10;
            return this;
        }

        public a t(InterfaceC1689b interfaceC1689b) {
            this.f17748d = (Z) interfaceC1689b;
            return this;
        }

        public a u(InterfaceC1700m interfaceC1700m) {
            if (interfaceC1700m == null) {
                a(0);
            }
            this.f17745a = interfaceC1700m;
            return this;
        }

        public a v(H0 h02) {
            if (h02 == null) {
                a(15);
            }
            this.f17751g = h02;
            return this;
        }

        public a w(AbstractC1707u abstractC1707u) {
            if (abstractC1707u == null) {
                a(8);
            }
            this.f17747c = abstractC1707u;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected K(InterfaceC1700m interfaceC1700m, Z z10, Sa.h hVar, Ra.E e10, AbstractC1707u abstractC1707u, boolean z11, qb.f fVar, InterfaceC1689b.a aVar, h0 h0Var, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        super(interfaceC1700m, hVar, fVar, null, z11, h0Var);
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
        if (aVar == null) {
            H(5);
        }
        if (h0Var == null) {
            H(6);
        }
        this.f17727L = null;
        this.f17736U = Collections.emptyList();
        this.f17725J = e10;
        this.f17726K = abstractC1707u;
        this.f17728M = z10 == null ? this : z10;
        this.f17729N = aVar;
        this.f17730O = z12;
        this.f17731P = z13;
        this.f17732Q = z14;
        this.f17733R = z15;
        this.f17734S = z16;
        this.f17735T = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void H(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.K.H(int):void");
    }

    public static K P0(InterfaceC1700m interfaceC1700m, Sa.h hVar, Ra.E e10, AbstractC1707u abstractC1707u, boolean z10, qb.f fVar, InterfaceC1689b.a aVar, h0 h0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
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
        if (aVar == null) {
            H(12);
        }
        if (h0Var == null) {
            H(13);
        }
        return new K(interfaceC1700m, null, hVar, e10, abstractC1707u, z10, fVar, aVar, h0Var, z11, z12, z13, z14, z15, z16);
    }

    private h0 T0(boolean z10, Z z11) {
        h0 h0VarJ;
        if (z10) {
            if (z11 == null) {
                z11 = L0();
            }
            h0VarJ = z11.j();
        } else {
            h0VarJ = h0.f15158a;
        }
        if (h0VarJ == null) {
            H(28);
        }
        return h0VarJ;
    }

    private static InterfaceC1712z U0(J0 j02, Ra.Y y10) {
        if (j02 == null) {
            H(30);
        }
        if (y10 == null) {
            H(31);
        }
        if (y10.c0() != null) {
            return y10.c0().d(j02);
        }
        return null;
    }

    private static AbstractC1707u Z0(AbstractC1707u abstractC1707u, InterfaceC1689b.a aVar) {
        return (aVar == InterfaceC1689b.a.FAKE_OVERRIDE && C1706t.g(abstractC1707u.f())) ? C1706t.f15173h : abstractC1707u;
    }

    private static c0 e1(J0 j02, Z z10, c0 c0Var) {
        Hb.U uP = j02.p(c0Var.a(), Q0.f5694G);
        if (uP == null) {
            return null;
        }
        return new N(z10, new Bb.c(z10, uP, ((Bb.f) c0Var.getValue()).b(), c0Var.getValue()), c0Var.getAnnotations());
    }

    private static c0 f1(J0 j02, Z z10, c0 c0Var) {
        Hb.U uP = j02.p(c0Var.a(), Q0.f5694G);
        if (uP == null) {
            return null;
        }
        return new N(z10, new Bb.d(z10, uP, c0Var.getValue()), c0Var.getAnnotations());
    }

    @Override // Ra.D
    public boolean D0() {
        return this.f17733R;
    }

    @Override // Ra.D
    public boolean K() {
        return this.f17732Q;
    }

    @Override // Ra.v0
    public boolean N() {
        return this.f17735T;
    }

    @Override // Ra.InterfaceC1689b
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public Z a0(InterfaceC1700m interfaceC1700m, Ra.E e10, AbstractC1707u abstractC1707u, InterfaceC1689b.a aVar, boolean z10) {
        Z zN = Y0().u(interfaceC1700m).t(null).s(e10).w(abstractC1707u).r(aVar).q(z10).n();
        if (zN == null) {
            H(42);
        }
        return zN;
    }

    protected K Q0(InterfaceC1700m interfaceC1700m, Ra.E e10, AbstractC1707u abstractC1707u, Z z10, InterfaceC1689b.a aVar, qb.f fVar, h0 h0Var) {
        if (interfaceC1700m == null) {
            H(32);
        }
        if (e10 == null) {
            H(33);
        }
        if (abstractC1707u == null) {
            H(34);
        }
        if (aVar == null) {
            H(35);
        }
        if (fVar == null) {
            H(36);
        }
        if (h0Var == null) {
            H(37);
        }
        return new K(interfaceC1700m, z10, getAnnotations(), e10, abstractC1707u, h0(), fVar, aVar, h0Var, p0(), z(), K(), D0(), isExternal(), N());
    }

    protected Z R0(a aVar) {
        c0 c0Var;
        Ba.a<Gb.j<AbstractC4943g<?>>> aVar2;
        if (aVar == null) {
            H(29);
        }
        K kQ0 = Q0(aVar.f17745a, aVar.f17746b, aVar.f17747c, aVar.f17748d, aVar.f17750f, aVar.f17755k, T0(aVar.f17749e, aVar.f17748d));
        List<m0> typeParameters = aVar.f17754j == null ? getTypeParameters() : aVar.f17754j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        J0 j0B = Hb.D.b(typeParameters, aVar.f17751g, kQ0, arrayList);
        Hb.U u10 = aVar.f17756l;
        Hb.U uP = j0B.p(u10, Q0.f5695H);
        if (uP == null) {
            return null;
        }
        Hb.U uP2 = j0B.p(u10, Q0.f5694G);
        if (uP2 != null) {
            kQ0.a1(uP2);
        }
        c0 c0Var2 = aVar.f17753i;
        if (c0Var2 != null) {
            c0 c0VarD = c0Var2.d(j0B);
            if (c0VarD == null) {
                return null;
            }
            c0Var = c0VarD;
        } else {
            c0Var = null;
        }
        c0 c0Var3 = this.f17738W;
        c0 c0VarF1 = c0Var3 != null ? f1(j0B, kQ0, c0Var3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<c0> it = this.f17736U.iterator();
        while (it.hasNext()) {
            c0 c0VarE1 = e1(j0B, kQ0, it.next());
            if (c0VarE1 != null) {
                arrayList2.add(c0VarE1);
            }
        }
        kQ0.c1(uP, arrayList, c0Var, c0VarF1, arrayList2);
        L l10 = this.f17740Y == null ? null : new L(kQ0, this.f17740Y.getAnnotations(), aVar.f17746b, Z0(this.f17740Y.getVisibility(), aVar.f17750f), this.f17740Y.T(), this.f17740Y.isExternal(), this.f17740Y.isInline(), aVar.f17750f, aVar.o(), h0.f15158a);
        if (l10 != null) {
            Hb.U returnType = this.f17740Y.getReturnType();
            l10.O0(U0(j0B, this.f17740Y));
            l10.R0(returnType != null ? j0B.p(returnType, Q0.f5695H) : null);
        }
        M m10 = this.f17741Z == null ? null : new M(kQ0, this.f17741Z.getAnnotations(), aVar.f17746b, Z0(this.f17741Z.getVisibility(), aVar.f17750f), this.f17741Z.T(), this.f17741Z.isExternal(), this.f17741Z.isInline(), aVar.f17750f, aVar.p(), h0.f15158a);
        if (m10 != null) {
            List<t0> listQ0 = AbstractC1779s.Q0(m10, this.f17741Z.k(), j0B, false, false, null);
            if (listQ0 == null) {
                kQ0.b1(true);
                listQ0 = Collections.singletonList(M.Q0(m10, C5087e.m(aVar.f17745a).H(), this.f17741Z.k().get(0).getAnnotations()));
            }
            if (listQ0.size() != 1) {
                throw new IllegalStateException();
            }
            m10.O0(U0(j0B, this.f17741Z));
            m10.S0(listQ0.get(0));
        }
        InterfaceC1709w interfaceC1709w = this.f17743b0;
        r rVar = interfaceC1709w == null ? null : new r(interfaceC1709w.getAnnotations(), kQ0);
        InterfaceC1709w interfaceC1709w2 = this.f17744c0;
        kQ0.W0(l10, m10, rVar, interfaceC1709w2 != null ? new r(interfaceC1709w2.getAnnotations(), kQ0) : null);
        if (aVar.f17752h) {
            Rb.l lVarH = Rb.l.h();
            Iterator<? extends Z> it2 = g().iterator();
            while (it2.hasNext()) {
                lVarH.add(it2.next().d(j0B));
            }
            kQ0.w0(lVarH);
        }
        if (z() && (aVar2 = this.f17789I) != null) {
            kQ0.L0(this.f17788H, aVar2);
        }
        return kQ0;
    }

    @Override // Ra.Z
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public L e() {
        return this.f17740Y;
    }

    public void V0(L l10, b0 b0Var) {
        W0(l10, b0Var, null, null);
    }

    public void W0(L l10, b0 b0Var, InterfaceC1709w interfaceC1709w, InterfaceC1709w interfaceC1709w2) {
        this.f17740Y = l10;
        this.f17741Z = b0Var;
        this.f17743b0 = interfaceC1709w;
        this.f17744c0 = interfaceC1709w2;
    }

    public boolean X0() {
        return this.f17742a0;
    }

    public a Y0() {
        return new a();
    }

    public void a1(Hb.U u10) {
        if (u10 == null) {
            H(14);
        }
    }

    public void b1(boolean z10) {
        this.f17742a0 = z10;
    }

    public void c1(Hb.U u10, List<? extends m0> list, c0 c0Var, c0 c0Var2, List<c0> list2) {
        if (u10 == null) {
            H(17);
        }
        if (list == null) {
            H(18);
        }
        if (list2 == null) {
            H(19);
        }
        F0(u10);
        this.f17739X = new ArrayList(list);
        this.f17738W = c0Var2;
        this.f17737V = c0Var;
        this.f17736U = list2;
    }

    @Override // Ua.X, Ra.InterfaceC1688a
    public c0 d0() {
        return this.f17737V;
    }

    public void d1(AbstractC1707u abstractC1707u) {
        if (abstractC1707u == null) {
            H(20);
        }
        this.f17726K = abstractC1707u;
    }

    @Override // Ra.InterfaceC1688a
    public Collection<? extends Z> g() {
        Collection<? extends Z> collectionEmptyList = this.f17727L;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList == null) {
            H(41);
        }
        return collectionEmptyList;
    }

    @Override // Ra.InterfaceC1688a
    public <V> V g0(InterfaceC1688a.InterfaceC0222a<V> interfaceC0222a) {
        return null;
    }

    @Override // Ua.X, Ra.InterfaceC1688a
    public Hb.U getReturnType() {
        Hb.U uA = a();
        if (uA == null) {
            H(23);
        }
        return uA;
    }

    @Override // Ua.X, Ra.InterfaceC1688a
    public List<m0> getTypeParameters() {
        List<m0> list = this.f17739X;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        AbstractC1707u abstractC1707u = this.f17726K;
        if (abstractC1707u == null) {
            H(25);
        }
        return abstractC1707u;
    }

    @Override // Ra.Z
    public b0 h() {
        return this.f17741Z;
    }

    @Override // Ra.InterfaceC1689b
    public InterfaceC1689b.a i() {
        InterfaceC1689b.a aVar = this.f17729N;
        if (aVar == null) {
            H(39);
        }
        return aVar;
    }

    public boolean isExternal() {
        return this.f17734S;
    }

    @Override // Ua.X, Ra.InterfaceC1688a
    public c0 j0() {
        return this.f17738W;
    }

    @Override // Ra.Z
    public InterfaceC1709w k0() {
        return this.f17744c0;
    }

    @Override // Ra.D
    public Ra.E m() {
        Ra.E e10 = this.f17725J;
        if (e10 == null) {
            H(24);
        }
        return e10;
    }

    @Override // Ra.Z
    public InterfaceC1709w n0() {
        return this.f17743b0;
    }

    @Override // Ra.InterfaceC1688a
    public List<c0> o0() {
        List<c0> list = this.f17736U;
        if (list == null) {
            H(22);
        }
        return list;
    }

    @Override // Ra.u0
    public boolean p0() {
        return this.f17730O;
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> interfaceC1702o, D d10) {
        return interfaceC1702o.a(this, d10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ra.InterfaceC1689b
    public void w0(Collection<? extends InterfaceC1689b> collection) {
        if (collection == 0) {
            H(40);
        }
        this.f17727L = collection;
    }

    @Override // Ra.Z
    public List<Ra.Y> x() {
        ArrayList arrayList = new ArrayList(2);
        L l10 = this.f17740Y;
        if (l10 != null) {
            arrayList.add(l10);
        }
        b0 b0Var = this.f17741Z;
        if (b0Var != null) {
            arrayList.add(b0Var);
        }
        return arrayList;
    }

    @Override // Ra.u0
    public boolean z() {
        return this.f17731P;
    }

    @Override // Ra.j0
    public Z d(J0 j02) {
        if (j02 == null) {
            H(27);
        }
        return j02.k() ? this : Y0().v(j02.j()).t(L0()).n();
    }

    @Override // Ua.AbstractC1775n, Ua.AbstractC1774m, Ra.InterfaceC1700m
    /* renamed from: b */
    public Z L0() {
        Z z10 = this.f17728M;
        Z zL0 = z10 == this ? this : z10.L0();
        if (zL0 == null) {
            H(38);
        }
        return zL0;
    }
}
