package Ua;

import Hb.AbstractC1082f0;
import Hb.C1109v;
import Hb.C1112y;
import Hb.H0;
import Hb.J0;
import Hb.M0;
import Hb.Q0;
import Hb.y0;
import Ra.AbstractC1707u;
import Ra.EnumC1693f;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1702o;
import Ra.c0;
import Ra.h0;
import Ra.m0;
import Ra.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tb.C4597i;
import xb.C5087e;

/* compiled from: LazySubstitutingClassDescriptor.java */
/* renamed from: Ua.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1785y extends z {

    /* renamed from: C, reason: collision with root package name */
    private final z f17918C;

    /* renamed from: D, reason: collision with root package name */
    private final J0 f17919D;

    /* renamed from: E, reason: collision with root package name */
    private J0 f17920E;

    /* renamed from: F, reason: collision with root package name */
    private List<m0> f17921F;

    /* renamed from: G, reason: collision with root package name */
    private List<m0> f17922G;

    /* renamed from: H, reason: collision with root package name */
    private y0 f17923H;

    /* compiled from: LazySubstitutingClassDescriptor.java */
    /* renamed from: Ua.y$a */
    class a implements Ba.l<m0, Boolean> {
        a() {
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(m0 m0Var) {
            return Boolean.valueOf(!m0Var.l0());
        }
    }

    /* compiled from: LazySubstitutingClassDescriptor.java */
    /* renamed from: Ua.y$b */
    class b implements Ba.l<AbstractC1082f0, AbstractC1082f0> {
        b() {
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1082f0 invoke(AbstractC1082f0 abstractC1082f0) {
            return C1785y.this.N0(abstractC1082f0);
        }
    }

    public C1785y(z zVar, J0 j02) {
        this.f17918C = zVar;
        this.f17919D = j02;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void E0(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.C1785y.E0(int):void");
    }

    private J0 L0() {
        if (this.f17920E == null) {
            if (this.f17919D.k()) {
                this.f17920E = this.f17919D;
            } else {
                List<m0> parameters = this.f17918C.l().getParameters();
                this.f17921F = new ArrayList(parameters.size());
                this.f17920E = Hb.D.b(parameters, this.f17919D.j(), this, this.f17921F);
                this.f17922G = kotlin.collections.r.f0(this.f17921F, new a());
            }
        }
        return this.f17920E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC1082f0 N0(AbstractC1082f0 abstractC1082f0) {
        return (abstractC1082f0 == null || this.f17919D.k()) ? abstractC1082f0 : (AbstractC1082f0) L0().p(abstractC1082f0, Q0.f5693F);
    }

    @Override // Ra.InterfaceC1692e
    public boolean C() {
        return this.f17918C.C();
    }

    @Override // Ra.InterfaceC1692e
    public Ab.k C0() {
        Ab.k kVarZ0 = z0(C5087e.r(C4597i.g(this.f17918C)));
        if (kVarZ0 == null) {
            E0(12);
        }
        return kVarZ0;
    }

    @Override // Ra.D
    public boolean D0() {
        return this.f17918C.D0();
    }

    @Override // Ra.InterfaceC1692e
    public List<c0> G0() {
        List<c0> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            E0(17);
        }
        return listEmptyList;
    }

    @Override // Ua.z
    public Ab.k H(H0 h02, Ib.g gVar) {
        if (h02 == null) {
            E0(5);
        }
        if (gVar == null) {
            E0(6);
        }
        Ab.k kVarH = this.f17918C.H(h02, gVar);
        if (!this.f17919D.k()) {
            return new Ab.t(kVarH, L0());
        }
        if (kVarH == null) {
            E0(7);
        }
        return kVarH;
    }

    @Override // Ra.InterfaceC1692e
    public Ab.k H0(H0 h02) {
        if (h02 == null) {
            E0(10);
        }
        Ab.k kVarH = H(h02, C5087e.r(C4597i.g(this)));
        if (kVarH == null) {
            E0(11);
        }
        return kVarH;
    }

    @Override // Ra.InterfaceC1692e
    public Collection<InterfaceC1692e> J() {
        Collection<InterfaceC1692e> collectionJ = this.f17918C.J();
        if (collectionJ == null) {
            E0(31);
        }
        return collectionJ;
    }

    @Override // Ra.InterfaceC1692e
    public boolean J0() {
        return this.f17918C.J0();
    }

    @Override // Ra.D
    public boolean K() {
        return this.f17918C.K();
    }

    @Override // Ra.InterfaceC1692e
    public c0 K0() {
        throw new UnsupportedOperationException();
    }

    @Override // Ra.InterfaceC1696i
    public boolean L() {
        return this.f17918C.L();
    }

    @Override // Ra.j0
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1692e d(J0 j02) {
        if (j02 == null) {
            E0(23);
        }
        return j02.k() ? this : new C1785y(this, J0.h(j02.j(), L0().j()));
    }

    @Override // Ra.InterfaceC1692e
    public InterfaceC1691d P() {
        return this.f17918C.P();
    }

    @Override // Ra.InterfaceC1692e
    public Ab.k Q() {
        Ab.k kVarQ = this.f17918C.Q();
        if (kVarQ == null) {
            E0(15);
        }
        return kVarQ;
    }

    @Override // Ra.InterfaceC1692e
    public InterfaceC1692e S() {
        return this.f17918C.S();
    }

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1701n, Ra.InterfaceC1700m
    public InterfaceC1700m c() {
        InterfaceC1700m interfaceC1700mC = this.f17918C.c();
        if (interfaceC1700mC == null) {
            E0(22);
        }
        return interfaceC1700mC;
    }

    @Override // Sa.a
    public Sa.h getAnnotations() {
        Sa.h annotations = this.f17918C.getAnnotations();
        if (annotations == null) {
            E0(19);
        }
        return annotations;
    }

    @Override // Ra.J
    public qb.f getName() {
        qb.f name = this.f17918C.getName();
        if (name == null) {
            E0(20);
        }
        return name;
    }

    @Override // Ra.InterfaceC1692e, Ra.D, Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        AbstractC1707u visibility = this.f17918C.getVisibility();
        if (visibility == null) {
            E0(27);
        }
        return visibility;
    }

    @Override // Ra.InterfaceC1692e
    public EnumC1693f i() {
        EnumC1693f enumC1693fI = this.f17918C.i();
        if (enumC1693fI == null) {
            E0(25);
        }
        return enumC1693fI;
    }

    @Override // Ra.D
    public boolean isExternal() {
        return this.f17918C.isExternal();
    }

    @Override // Ra.InterfaceC1692e
    public boolean isInline() {
        return this.f17918C.isInline();
    }

    @Override // Ra.InterfaceC1703p
    public h0 j() {
        h0 h0Var = h0.f15158a;
        if (h0Var == null) {
            E0(29);
        }
        return h0Var;
    }

    @Override // Ra.InterfaceC1695h
    public y0 l() {
        y0 y0VarL = this.f17918C.l();
        if (this.f17919D.k()) {
            if (y0VarL == null) {
                E0(0);
            }
            return y0VarL;
        }
        if (this.f17923H == null) {
            J0 j0L0 = L0();
            Collection<Hb.U> collectionS = y0VarL.s();
            ArrayList arrayList = new ArrayList(collectionS.size());
            Iterator<Hb.U> it = collectionS.iterator();
            while (it.hasNext()) {
                arrayList.add(j0L0.p(it.next(), Q0.f5693F));
            }
            this.f17923H = new C1109v(this, this.f17921F, arrayList, Gb.f.f4998e);
        }
        y0 y0Var = this.f17923H;
        if (y0Var == null) {
            E0(1);
        }
        return y0Var;
    }

    @Override // Ra.InterfaceC1692e, Ra.D
    public Ra.E m() {
        Ra.E eM = this.f17918C.m();
        if (eM == null) {
            E0(26);
        }
        return eM;
    }

    @Override // Ra.InterfaceC1692e
    public Collection<InterfaceC1691d> n() {
        Collection<InterfaceC1691d> collectionN = this.f17918C.n();
        ArrayList arrayList = new ArrayList(collectionN.size());
        for (InterfaceC1691d interfaceC1691d : collectionN) {
            arrayList.add(((InterfaceC1691d) interfaceC1691d.v().j(interfaceC1691d.L0()).m(interfaceC1691d.m()).h(interfaceC1691d.getVisibility()).n(interfaceC1691d.i()).g(false).e()).d(L0()));
        }
        return arrayList;
    }

    @Override // Ra.InterfaceC1692e
    public boolean o() {
        return this.f17918C.o();
    }

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1695h
    public AbstractC1082f0 u() {
        AbstractC1082f0 abstractC1082f0M = Hb.X.m(C1112y.f5816a.a(getAnnotations(), null, null), l(), M0.g(l().getParameters()), false, C0());
        if (abstractC1082f0M == null) {
            E0(16);
        }
        return abstractC1082f0M;
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> interfaceC1702o, D d10) {
        return interfaceC1702o.h(this, d10);
    }

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1696i
    public List<m0> w() {
        L0();
        List<m0> list = this.f17922G;
        if (list == null) {
            E0(30);
        }
        return list;
    }

    @Override // Ra.InterfaceC1692e
    public Ab.k x0() {
        Ab.k kVarX0 = this.f17918C.x0();
        if (kVarX0 == null) {
            E0(28);
        }
        return kVarX0;
    }

    @Override // Ra.InterfaceC1692e
    public boolean y() {
        return this.f17918C.y();
    }

    @Override // Ra.InterfaceC1692e
    public r0<AbstractC1082f0> y0() {
        r0<AbstractC1082f0> r0VarY0 = this.f17918C.y0();
        if (r0VarY0 == null) {
            return null;
        }
        return r0VarY0.b(new b());
    }

    @Override // Ua.z
    public Ab.k z0(Ib.g gVar) {
        if (gVar == null) {
            E0(13);
        }
        Ab.k kVarZ0 = this.f17918C.z0(gVar);
        if (!this.f17919D.k()) {
            return new Ab.t(kVarZ0, L0());
        }
        if (kVarZ0 == null) {
            E0(14);
        }
        return kVarZ0;
    }

    @Override // Ua.z, Ra.InterfaceC1700m
    /* renamed from: b */
    public InterfaceC1692e L0() {
        InterfaceC1692e interfaceC1692eB = this.f17918C.L0();
        if (interfaceC1692eB == null) {
            E0(21);
        }
        return interfaceC1692eB;
    }
}
