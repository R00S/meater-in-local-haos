package Fb;

import Ab.k;
import Ab.n;
import Db.C1008n;
import Db.C1010p;
import Db.InterfaceC1016w;
import Db.N;
import Db.X;
import Hb.AbstractC1073b;
import Hb.AbstractC1082f0;
import Hb.U;
import Hb.y0;
import Ra.AbstractC1707u;
import Ra.C1708v;
import Ra.EnumC1693f;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.M;
import Ra.Z;
import Ra.c0;
import Ra.f0;
import Ra.g0;
import Ra.h0;
import Ra.k0;
import Ra.m0;
import Ra.q0;
import Ra.r0;
import Ra.t0;
import Ua.AbstractC1762a;
import Ua.AbstractC1779s;
import Ua.C1770i;
import Ua.C1778q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.V;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.C3862t;
import lb.C3923c;
import lb.C3924d;
import lb.C3927g;
import lb.C3929i;
import lb.C3934n;
import lb.C3937q;
import lb.C3938r;
import lb.C3939s;
import lb.C3940t;
import nb.AbstractC4075a;
import nb.C4076b;
import nb.InterfaceC4077c;
import nb.h;
import tb.AbstractC4601m;
import tb.C4589a;
import tb.C4596h;
import tb.C4603o;
import xb.C5087e;

/* compiled from: DeserializedClassDescriptor.kt */
/* renamed from: Fb.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1032m extends AbstractC1762a implements InterfaceC1700m {

    /* renamed from: G, reason: collision with root package name */
    private final C3923c f4638G;

    /* renamed from: H, reason: collision with root package name */
    private final AbstractC4075a f4639H;

    /* renamed from: I, reason: collision with root package name */
    private final h0 f4640I;

    /* renamed from: J, reason: collision with root package name */
    private final qb.b f4641J;

    /* renamed from: K, reason: collision with root package name */
    private final Ra.E f4642K;

    /* renamed from: L, reason: collision with root package name */
    private final AbstractC1707u f4643L;

    /* renamed from: M, reason: collision with root package name */
    private final EnumC1693f f4644M;

    /* renamed from: N, reason: collision with root package name */
    private final C1010p f4645N;

    /* renamed from: O, reason: collision with root package name */
    private final boolean f4646O;

    /* renamed from: P, reason: collision with root package name */
    private final Ab.l f4647P;

    /* renamed from: Q, reason: collision with root package name */
    private final b f4648Q;

    /* renamed from: R, reason: collision with root package name */
    private final f0<a> f4649R;

    /* renamed from: S, reason: collision with root package name */
    private final c f4650S;

    /* renamed from: T, reason: collision with root package name */
    private final InterfaceC1700m f4651T;

    /* renamed from: U, reason: collision with root package name */
    private final Gb.j<InterfaceC1691d> f4652U;

    /* renamed from: V, reason: collision with root package name */
    private final Gb.i<Collection<InterfaceC1691d>> f4653V;

    /* renamed from: W, reason: collision with root package name */
    private final Gb.j<InterfaceC1692e> f4654W;

    /* renamed from: X, reason: collision with root package name */
    private final Gb.i<Collection<InterfaceC1692e>> f4655X;

    /* renamed from: Y, reason: collision with root package name */
    private final Gb.j<r0<AbstractC1082f0>> f4656Y;

    /* renamed from: Z, reason: collision with root package name */
    private final N.a f4657Z;

    /* renamed from: a0, reason: collision with root package name */
    private final Sa.h f4658a0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: Fb.m$b */
    final class b extends AbstractC1073b {

        /* renamed from: d, reason: collision with root package name */
        private final Gb.i<List<m0>> f4664d;

        public b() {
            super(C1032m.this.e1().h());
            this.f4664d = C1032m.this.e1().h().g(new C1033n(C1032m.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List M(C1032m c1032m) {
            return q0.g(c1032m);
        }

        @Override // Hb.AbstractC1110w, Hb.y0
        /* renamed from: L, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C1032m t() {
            return C1032m.this;
        }

        @Override // Hb.y0
        public List<m0> getParameters() {
            return this.f4664d.invoke();
        }

        @Override // Hb.AbstractC1103q
        protected Collection<U> n() {
            String strJ;
            qb.c cVarA;
            List<C3937q> listO = nb.f.o(C1032m.this.f1(), C1032m.this.e1().j());
            C1032m c1032m = C1032m.this;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listO, 10));
            Iterator<T> it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(c1032m.e1().i().u((C3937q) it.next()));
            }
            List listF0 = kotlin.collections.r.F0(arrayList, C1032m.this.e1().c().c().a(C1032m.this));
            ArrayList<M.b> arrayList2 = new ArrayList();
            Iterator it2 = listF0.iterator();
            while (it2.hasNext()) {
                InterfaceC1695h interfaceC1695hT = ((U) it2.next()).O0().t();
                M.b bVar = interfaceC1695hT instanceof M.b ? (M.b) interfaceC1695hT : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC1016w interfaceC1016wJ = C1032m.this.e1().c().j();
                C1032m c1032m2 = C1032m.this;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.r.x(arrayList2, 10));
                for (M.b bVar2 : arrayList2) {
                    qb.b bVarN = C5087e.n(bVar2);
                    if (bVarN == null || (cVarA = bVarN.a()) == null || (strJ = cVarA.b()) == null) {
                        strJ = bVar2.getName().j();
                        C3862t.f(strJ, "asString(...)");
                    }
                    arrayList3.add(strJ);
                }
                interfaceC1016wJ.a(c1032m2, arrayList3);
            }
            return kotlin.collections.r.W0(listF0);
        }

        public String toString() {
            String string = C1032m.this.getName().toString();
            C3862t.f(string, "toString(...)");
            return string;
        }

        @Override // Hb.y0
        public boolean u() {
            return true;
        }

        @Override // Hb.AbstractC1103q
        protected k0 w() {
            return k0.a.f15161a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: Fb.m$c */
    final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Map<qb.f, C3927g> f4666a;

        /* renamed from: b, reason: collision with root package name */
        private final Gb.h<qb.f, InterfaceC1692e> f4667b;

        /* renamed from: c, reason: collision with root package name */
        private final Gb.i<Set<qb.f>> f4668c;

        public c() {
            List<C3927g> listE0 = C1032m.this.f1().E0();
            C3862t.f(listE0, "getEnumEntryList(...)");
            List<C3927g> list = listE0;
            LinkedHashMap linkedHashMap = new LinkedHashMap(Ha.g.d(kotlin.collections.M.d(kotlin.collections.r.x(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(Db.L.b(C1032m.this.e1().g(), ((C3927g) obj).G()), obj);
            }
            this.f4666a = linkedHashMap;
            this.f4667b = C1032m.this.e1().h().e(new C1034o(this, C1032m.this));
            this.f4668c = C1032m.this.e1().h().g(new C1035p(this));
        }

        private final Set<qb.f> e() {
            HashSet hashSet = new HashSet();
            Iterator<U> it = C1032m.this.l().s().iterator();
            while (it.hasNext()) {
                for (InterfaceC1700m interfaceC1700m : n.a.a(it.next().s(), null, null, 3, null)) {
                    if ((interfaceC1700m instanceof g0) || (interfaceC1700m instanceof Z)) {
                        hashSet.add(((InterfaceC1689b) interfaceC1700m).getName());
                    }
                }
            }
            List<C3929i> listJ0 = C1032m.this.f1().J0();
            C3862t.f(listJ0, "getFunctionList(...)");
            C1032m c1032m = C1032m.this;
            Iterator<T> it2 = listJ0.iterator();
            while (it2.hasNext()) {
                hashSet.add(Db.L.b(c1032m.e1().g(), ((C3929i) it2.next()).e0()));
            }
            List<C3934n> listX0 = C1032m.this.f1().X0();
            C3862t.f(listX0, "getPropertyList(...)");
            C1032m c1032m2 = C1032m.this;
            Iterator<T> it3 = listX0.iterator();
            while (it3.hasNext()) {
                hashSet.add(Db.L.b(c1032m2.e1().g(), ((C3934n) it3.next()).d0()));
            }
            return V.j(hashSet, hashSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC1692e f(c cVar, C1032m c1032m, qb.f name) {
            C3862t.g(name, "name");
            C3927g c3927g = cVar.f4666a.get(name);
            if (c3927g != null) {
                return C1778q.M0(c1032m.e1().h(), c1032m, name, cVar.f4668c, new C1020a(c1032m.e1().h(), new C1036q(c1032m, c3927g)), h0.f15158a);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(C1032m c1032m, C3927g c3927g) {
            return kotlin.collections.r.W0(c1032m.e1().c().d().a(c1032m.j1(), c3927g));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set h(c cVar) {
            return cVar.e();
        }

        public final Collection<InterfaceC1692e> d() {
            Set<qb.f> setKeySet = this.f4666a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                InterfaceC1692e interfaceC1692eI = i((qb.f) it.next());
                if (interfaceC1692eI != null) {
                    arrayList.add(interfaceC1692eI);
                }
            }
            return arrayList;
        }

        public final InterfaceC1692e i(qb.f name) {
            C3862t.g(name, "name");
            return this.f4667b.invoke(name);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: Fb.m$d */
    /* synthetic */ class d extends C3859p implements Ba.l<C3937q, AbstractC1082f0> {
        d(Object obj) {
            super(1, obj);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final AbstractC1082f0 invoke(C3937q p02) {
            C3862t.g(p02, "p0");
            return X.q((X) this.receiver, p02, false, 2, null);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "simpleType";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return kotlin.jvm.internal.P.b(C3862t.a.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: Fb.m$e */
    /* synthetic */ class e extends C3859p implements Ba.l<qb.f, AbstractC1082f0> {
        e(Object obj) {
            super(1, obj);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final AbstractC1082f0 invoke(qb.f p02) {
            C3862t.g(p02, "p0");
            return ((C1032m) this.receiver).k1(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "getValueClassPropertyType";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return kotlin.jvm.internal.P.b(C1032m.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: Fb.m$f */
    /* synthetic */ class f extends C3859p implements Ba.l<Ib.g, a> {
        f(Object obj) {
            super(1, obj);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final a invoke(Ib.g p02) {
            C3862t.g(p02, "p0");
            return new a((C1032m) this.receiver, p02);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return kotlin.jvm.internal.P.b(a.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1032m(C1010p outerContext, C3923c classProto, InterfaceC4077c nameResolver, AbstractC4075a metadataVersion, h0 sourceElement) {
        Ab.l qVar;
        super(outerContext.h(), Db.L.a(nameResolver, classProto.G0()).h());
        C3862t.g(outerContext, "outerContext");
        C3862t.g(classProto, "classProto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(metadataVersion, "metadataVersion");
        C3862t.g(sourceElement, "sourceElement");
        this.f4638G = classProto;
        this.f4639H = metadataVersion;
        this.f4640I = sourceElement;
        this.f4641J = Db.L.a(nameResolver, classProto.G0());
        Db.O o10 = Db.O.f3632a;
        this.f4642K = o10.b(C4076b.f45817e.d(classProto.F0()));
        this.f4643L = Db.P.a(o10, C4076b.f45816d.d(classProto.F0()));
        EnumC1693f enumC1693fA = o10.a(C4076b.f45818f.d(classProto.F0()));
        this.f4644M = enumC1693fA;
        List<C3939s> listI1 = classProto.i1();
        C3862t.f(listI1, "getTypeParameterList(...)");
        C3940t c3940tJ1 = classProto.j1();
        C3862t.f(c3940tJ1, "getTypeTable(...)");
        nb.g gVar = new nb.g(c3940tJ1);
        h.a aVar = nb.h.f45846b;
        lb.w wVarL1 = classProto.l1();
        C3862t.f(wVarL1, "getVersionRequirementTable(...)");
        C1010p c1010pA = outerContext.a(this, listI1, nameResolver, gVar, aVar.a(wVarL1), metadataVersion);
        this.f4645N = c1010pA;
        Boolean boolD = C4076b.f45825m.d(classProto.F0());
        C3862t.f(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        this.f4646O = zBooleanValue;
        EnumC1693f enumC1693f = EnumC1693f.f15145E;
        if (enumC1693fA == enumC1693f) {
            qVar = new Ab.q(c1010pA.h(), this, zBooleanValue || C3862t.b(c1010pA.c().i().a(), Boolean.TRUE));
        } else {
            qVar = k.b.f1150b;
        }
        this.f4647P = qVar;
        this.f4648Q = new b();
        this.f4649R = f0.f15152e.a(this, c1010pA.h(), c1010pA.c().n().d(), new f(this));
        this.f4650S = enumC1693fA == enumC1693f ? new c() : null;
        InterfaceC1700m interfaceC1700mE = outerContext.e();
        this.f4651T = interfaceC1700mE;
        this.f4652U = c1010pA.h().i(new C1023d(this));
        this.f4653V = c1010pA.h().g(new C1024e(this));
        this.f4654W = c1010pA.h().i(new C1025f(this));
        this.f4655X = c1010pA.h().g(new C1026g(this));
        this.f4656Y = c1010pA.h().i(new C1027h(this));
        InterfaceC4077c interfaceC4077cG = c1010pA.g();
        nb.g gVarJ = c1010pA.j();
        C1032m c1032m = interfaceC1700mE instanceof C1032m ? (C1032m) interfaceC1700mE : null;
        this.f4657Z = new N.a(classProto, interfaceC4077cG, gVarJ, sourceElement, c1032m != null ? c1032m.f4657Z : null);
        this.f4658a0 = !C4076b.f45815c.d(classProto.F0()).booleanValue() ? Sa.h.f15630e.b() : new T(c1010pA.h(), new C1028i(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List V0(C1032m c1032m) {
        return kotlin.collections.r.W0(c1032m.f4645N.c().d().e(c1032m.f4657Z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1692e W0(C1032m c1032m) {
        return c1032m.X0();
    }

    private final InterfaceC1692e X0() {
        if (!this.f4638G.m1()) {
            return null;
        }
        InterfaceC1695h interfaceC1695hG = g1().g(Db.L.b(this.f4645N.g(), this.f4638G.s0()), Za.d.f19642S);
        if (interfaceC1695hG instanceof InterfaceC1692e) {
            return (InterfaceC1692e) interfaceC1695hG;
        }
        return null;
    }

    private final Collection<InterfaceC1691d> Y0() {
        return kotlin.collections.r.F0(kotlin.collections.r.F0(a1(), kotlin.collections.r.q(P())), this.f4645N.c().c().b(this));
    }

    private final InterfaceC1691d Z0() {
        Object next;
        if (this.f4644M.j()) {
            C1770i c1770iL = C4596h.l(this, h0.f15158a);
            c1770iL.h1(u());
            return c1770iL;
        }
        List<C3924d> listV0 = this.f4638G.v0();
        C3862t.f(listV0, "getConstructorList(...)");
        Iterator<T> it = listV0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!C4076b.f45826n.d(((C3924d) next).K()).booleanValue()) {
                break;
            }
        }
        C3924d c3924d = (C3924d) next;
        if (c3924d != null) {
            return this.f4645N.f().r(c3924d, true);
        }
        return null;
    }

    private final List<InterfaceC1691d> a1() {
        List<C3924d> listV0 = this.f4638G.v0();
        C3862t.f(listV0, "getConstructorList(...)");
        ArrayList<C3924d> arrayList = new ArrayList();
        for (Object obj : listV0) {
            Boolean boolD = C4076b.f45826n.d(((C3924d) obj).K());
            C3862t.f(boolD, "get(...)");
            if (boolD.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(arrayList, 10));
        for (C3924d c3924d : arrayList) {
            Db.K kF = this.f4645N.f();
            C3862t.d(c3924d);
            arrayList2.add(kF.r(c3924d, false));
        }
        return arrayList2;
    }

    private final Collection<InterfaceC1692e> b1() {
        if (this.f4642K != Ra.E.f15107D) {
            return kotlin.collections.r.m();
        }
        List<Integer> listY0 = this.f4638G.Y0();
        C3862t.d(listY0);
        if (listY0.isEmpty()) {
            return C4589a.f50004a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : listY0) {
            C1008n c1008nC = this.f4645N.c();
            InterfaceC4077c interfaceC4077cG = this.f4645N.g();
            C3862t.d(num);
            InterfaceC1692e interfaceC1692eB = c1008nC.b(Db.L.a(interfaceC4077cG, num.intValue()));
            if (interfaceC1692eB != null) {
                arrayList.add(interfaceC1692eB);
            }
        }
        return arrayList;
    }

    private final r0<AbstractC1082f0> c1() {
        if (!isInline() && !o()) {
            return null;
        }
        r0<AbstractC1082f0> r0VarA = Db.Z.a(this.f4638G, this.f4645N.g(), this.f4645N.j(), new d(this.f4645N.i()), new e(this));
        if (r0VarA != null) {
            return r0VarA;
        }
        if (this.f4639H.c(1, 5, 1)) {
            return null;
        }
        InterfaceC1691d interfaceC1691dP = P();
        if (interfaceC1691dP == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        List<t0> listK = interfaceC1691dP.k();
        C3862t.f(listK, "getValueParameters(...)");
        qb.f name = ((t0) kotlin.collections.r.j0(listK)).getName();
        C3862t.f(name, "getName(...)");
        AbstractC1082f0 abstractC1082f0K1 = k1(name);
        if (abstractC1082f0K1 != null) {
            return new Ra.A(name, abstractC1082f0K1);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection d1(C1032m c1032m) {
        return c1032m.Y0();
    }

    private final a g1() {
        return (a) this.f4649R.c(this.f4645N.c().n().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC1082f0 k1(qb.f fVar) {
        Iterator<T> it = g1().d(fVar, Za.d.f19642S).iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((Z) next).j0() == null) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj = next;
                }
            }
        }
        obj = null;
        Z z11 = (Z) obj;
        return (AbstractC1082f0) (z11 != null ? z11.a() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1691d m1(C1032m c1032m) {
        return c1032m.Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection n1(C1032m c1032m) {
        return c1032m.b1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 o1(C1032m c1032m) {
        return c1032m.c1();
    }

    @Override // Ra.InterfaceC1692e
    public boolean C() {
        Boolean boolD = C4076b.f45824l.d(this.f4638G.F0());
        C3862t.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // Ra.D
    public boolean D0() {
        return false;
    }

    @Override // Ua.AbstractC1762a, Ra.InterfaceC1692e
    public List<c0> G0() {
        List<C3937q> listB = nb.f.b(this.f4638G, this.f4645N.j());
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new Ua.N(K0(), new Bb.b(this, this.f4645N.i().u((C3937q) it.next()), null, null), Sa.h.f15630e.b()));
        }
        return arrayList;
    }

    @Override // Ra.InterfaceC1692e
    public Collection<InterfaceC1692e> J() {
        return this.f4655X.invoke();
    }

    @Override // Ra.InterfaceC1692e
    public boolean J0() {
        Boolean boolD = C4076b.f45820h.d(this.f4638G.F0());
        C3862t.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // Ra.D
    public boolean K() {
        Boolean boolD = C4076b.f45822j.d(this.f4638G.F0());
        C3862t.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // Ra.InterfaceC1696i
    public boolean L() {
        Boolean boolD = C4076b.f45819g.d(this.f4638G.F0());
        C3862t.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // Ra.InterfaceC1692e
    public InterfaceC1691d P() {
        return this.f4652U.invoke();
    }

    @Override // Ra.InterfaceC1692e
    public InterfaceC1692e S() {
        return this.f4654W.invoke();
    }

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1701n, Ra.InterfaceC1700m
    public InterfaceC1700m c() {
        return this.f4651T;
    }

    public final C1010p e1() {
        return this.f4645N;
    }

    public final C3923c f1() {
        return this.f4638G;
    }

    @Override // Sa.a
    public Sa.h getAnnotations() {
        return this.f4658a0;
    }

    @Override // Ra.InterfaceC1692e, Ra.D, Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        return this.f4643L;
    }

    public final AbstractC4075a h1() {
        return this.f4639H;
    }

    @Override // Ra.InterfaceC1692e
    public EnumC1693f i() {
        return this.f4644M;
    }

    @Override // Ra.InterfaceC1692e
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public Ab.l Q() {
        return this.f4647P;
    }

    @Override // Ra.D
    public boolean isExternal() {
        Boolean boolD = C4076b.f45821i.d(this.f4638G.F0());
        C3862t.f(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // Ra.InterfaceC1692e
    public boolean isInline() {
        return C4076b.f45823k.d(this.f4638G.F0()).booleanValue() && this.f4639H.e(1, 4, 1);
    }

    @Override // Ra.InterfaceC1703p
    public h0 j() {
        return this.f4640I;
    }

    public final N.a j1() {
        return this.f4657Z;
    }

    @Override // Ra.InterfaceC1695h
    public y0 l() {
        return this.f4648Q;
    }

    public final boolean l1(qb.f name) {
        C3862t.g(name, "name");
        return g1().t().contains(name);
    }

    @Override // Ra.InterfaceC1692e, Ra.D
    public Ra.E m() {
        return this.f4642K;
    }

    @Override // Ra.InterfaceC1692e
    public Collection<InterfaceC1691d> n() {
        return this.f4653V.invoke();
    }

    @Override // Ra.InterfaceC1692e
    public boolean o() {
        return C4076b.f45823k.d(this.f4638G.F0()).booleanValue() && this.f4639H.c(1, 4, 2);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deserialized ");
        sb2.append(K() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1696i
    public List<m0> w() {
        return this.f4645N.i().m();
    }

    @Override // Ra.InterfaceC1692e
    public boolean y() {
        return C4076b.f45818f.d(this.f4638G.F0()) == C3923c.EnumC0599c.COMPANION_OBJECT;
    }

    @Override // Ra.InterfaceC1692e
    public r0<AbstractC1082f0> y0() {
        return this.f4656Y.invoke();
    }

    @Override // Ua.z
    protected Ab.k z0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f4649R.c(kotlinTypeRefiner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: Fb.m$a */
    final class a extends w {

        /* renamed from: g, reason: collision with root package name */
        private final Ib.g f4659g;

        /* renamed from: h, reason: collision with root package name */
        private final Gb.i<Collection<InterfaceC1700m>> f4660h;

        /* renamed from: i, reason: collision with root package name */
        private final Gb.i<Collection<U>> f4661i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C1032m f4662j;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: Fb.m$a$a, reason: collision with other inner class name */
        public static final class C0090a extends AbstractC4601m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<D> f4663a;

            C0090a(List<D> list) {
                this.f4663a = list;
            }

            @Override // tb.AbstractC4602n
            public void a(InterfaceC1689b fakeOverride) {
                C3862t.g(fakeOverride, "fakeOverride");
                C4603o.K(fakeOverride, null);
                this.f4663a.add(fakeOverride);
            }

            @Override // tb.AbstractC4601m
            protected void e(InterfaceC1689b fromSuper, InterfaceC1689b fromCurrent) {
                C3862t.g(fromSuper, "fromSuper");
                C3862t.g(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof AbstractC1779s) {
                    ((AbstractC1779s) fromCurrent).V0(C1708v.f15183a, fromSuper);
                }
            }
        }

        public a(C1032m c1032m, Ib.g kotlinTypeRefiner) {
            C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f4662j = c1032m;
            C1010p c1010pE1 = c1032m.e1();
            List<C3929i> listJ0 = c1032m.f1().J0();
            C3862t.f(listJ0, "getFunctionList(...)");
            List<C3934n> listX0 = c1032m.f1().X0();
            C3862t.f(listX0, "getPropertyList(...)");
            List<C3938r> listF1 = c1032m.f1().f1();
            C3862t.f(listF1, "getTypeAliasList(...)");
            List<Integer> listU0 = c1032m.f1().U0();
            C3862t.f(listU0, "getNestedClassNameList(...)");
            List<Integer> list = listU0;
            InterfaceC4077c interfaceC4077cG = c1032m.e1().g();
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Db.L.b(interfaceC4077cG, ((Number) it.next()).intValue()));
            }
            super(c1010pE1, listJ0, listX0, listF1, new C1029j(arrayList));
            this.f4659g = kotlinTypeRefiner;
            this.f4660h = s().h().g(new C1030k(this));
            this.f4661i = s().h().g(new C1031l(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection F(a aVar) {
            return aVar.m(Ab.d.f1121o, Ab.k.f1147a.c(), Za.d.f19637N);
        }

        private final <D extends InterfaceC1689b> void G(qb.f fVar, Collection<? extends D> collection, List<D> list) {
            s().c().n().a().v(fVar, collection, new ArrayList(list), H(), new C0090a(list));
        }

        private final C1032m H() {
            return this.f4662j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection J(a aVar) {
            return aVar.f4659g.g(aVar.H());
        }

        @Override // Fb.w
        protected boolean A(g0 function) {
            C3862t.g(function, "function");
            return s().c().t().e(this.f4662j, function);
        }

        public void I(qb.f name, Za.b location) {
            C3862t.g(name, "name");
            C3862t.g(location, "location");
            Ya.a.a(s().c().p(), location, H(), name);
        }

        @Override // Fb.w, Ab.l, Ab.k
        public Collection<g0> b(qb.f name, Za.b location) {
            C3862t.g(name, "name");
            C3862t.g(location, "location");
            I(name, location);
            return super.b(name, location);
        }

        @Override // Fb.w, Ab.l, Ab.k
        public Collection<Z> d(qb.f name, Za.b location) {
            C3862t.g(name, "name");
            C3862t.g(location, "location");
            I(name, location);
            return super.d(name, location);
        }

        @Override // Ab.l, Ab.n
        public Collection<InterfaceC1700m> f(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
            C3862t.g(kindFilter, "kindFilter");
            C3862t.g(nameFilter, "nameFilter");
            return this.f4660h.invoke();
        }

        @Override // Fb.w, Ab.l, Ab.n
        public InterfaceC1695h g(qb.f name, Za.b location) {
            InterfaceC1692e interfaceC1692eI;
            C3862t.g(name, "name");
            C3862t.g(location, "location");
            I(name, location);
            c cVar = H().f4650S;
            return (cVar == null || (interfaceC1692eI = cVar.i(name)) == null) ? super.g(name, location) : interfaceC1692eI;
        }

        @Override // Fb.w
        protected void j(Collection<InterfaceC1700m> result, Ba.l<? super qb.f, Boolean> nameFilter) {
            C3862t.g(result, "result");
            C3862t.g(nameFilter, "nameFilter");
            c cVar = H().f4650S;
            List listD = cVar != null ? cVar.d() : null;
            if (listD == null) {
                listD = kotlin.collections.r.m();
            }
            result.addAll(listD);
        }

        @Override // Fb.w
        protected void n(qb.f name, List<g0> functions) {
            C3862t.g(name, "name");
            C3862t.g(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator<U> it = this.f4661i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().s().b(name, Za.d.f19636M));
            }
            functions.addAll(s().c().c().d(name, this.f4662j));
            G(name, arrayList, functions);
        }

        @Override // Fb.w
        protected void o(qb.f name, List<Z> descriptors) {
            C3862t.g(name, "name");
            C3862t.g(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator<U> it = this.f4661i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().s().d(name, Za.d.f19636M));
            }
            G(name, arrayList, descriptors);
        }

        @Override // Fb.w
        protected qb.b p(qb.f name) {
            C3862t.g(name, "name");
            return this.f4662j.f4641J.d(name);
        }

        @Override // Fb.w
        protected Set<qb.f> v() {
            List<U> listS = H().f4648Q.s();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listS.iterator();
            while (it.hasNext()) {
                Set<qb.f> setE = ((U) it.next()).s().e();
                if (setE == null) {
                    return null;
                }
                kotlin.collections.r.D(linkedHashSet, setE);
            }
            return linkedHashSet;
        }

        @Override // Fb.w
        protected Set<qb.f> w() {
            List<U> listS = H().f4648Q.s();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listS.iterator();
            while (it.hasNext()) {
                kotlin.collections.r.D(linkedHashSet, ((U) it.next()).s().a());
            }
            linkedHashSet.addAll(s().c().c().c(this.f4662j));
            return linkedHashSet;
        }

        @Override // Fb.w
        protected Set<qb.f> x() {
            List<U> listS = H().f4648Q.s();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listS.iterator();
            while (it.hasNext()) {
                kotlin.collections.r.D(linkedHashSet, ((U) it.next()).s().c());
            }
            return linkedHashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(List list) {
            return list;
        }
    }
}
