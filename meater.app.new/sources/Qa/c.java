package Qa;

import Oa.p;
import Pa.f;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C3862t;
import qb.b;
import yb.EnumC5149e;

/* compiled from: JavaToKotlinClassMap.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f14576a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f14577b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f14578c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f14579d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f14580e;

    /* renamed from: f, reason: collision with root package name */
    private static final qb.b f14581f;

    /* renamed from: g, reason: collision with root package name */
    private static final qb.c f14582g;

    /* renamed from: h, reason: collision with root package name */
    private static final qb.b f14583h;

    /* renamed from: i, reason: collision with root package name */
    private static final qb.b f14584i;

    /* renamed from: j, reason: collision with root package name */
    private static final qb.b f14585j;

    /* renamed from: k, reason: collision with root package name */
    private static final HashMap<qb.d, qb.b> f14586k;

    /* renamed from: l, reason: collision with root package name */
    private static final HashMap<qb.d, qb.b> f14587l;

    /* renamed from: m, reason: collision with root package name */
    private static final HashMap<qb.d, qb.c> f14588m;

    /* renamed from: n, reason: collision with root package name */
    private static final HashMap<qb.d, qb.c> f14589n;

    /* renamed from: o, reason: collision with root package name */
    private static final HashMap<qb.b, qb.b> f14590o;

    /* renamed from: p, reason: collision with root package name */
    private static final HashMap<qb.b, qb.b> f14591p;

    /* renamed from: q, reason: collision with root package name */
    private static final List<a> f14592q;

    /* compiled from: JavaToKotlinClassMap.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final qb.b f14593a;

        /* renamed from: b, reason: collision with root package name */
        private final qb.b f14594b;

        /* renamed from: c, reason: collision with root package name */
        private final qb.b f14595c;

        public a(qb.b javaClass, qb.b kotlinReadOnly, qb.b kotlinMutable) {
            C3862t.g(javaClass, "javaClass");
            C3862t.g(kotlinReadOnly, "kotlinReadOnly");
            C3862t.g(kotlinMutable, "kotlinMutable");
            this.f14593a = javaClass;
            this.f14594b = kotlinReadOnly;
            this.f14595c = kotlinMutable;
        }

        public final qb.b a() {
            return this.f14593a;
        }

        public final qb.b b() {
            return this.f14594b;
        }

        public final qb.b c() {
            return this.f14595c;
        }

        public final qb.b d() {
            return this.f14593a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C3862t.b(this.f14593a, aVar.f14593a) && C3862t.b(this.f14594b, aVar.f14594b) && C3862t.b(this.f14595c, aVar.f14595c);
        }

        public int hashCode() {
            return (((this.f14593a.hashCode() * 31) + this.f14594b.hashCode()) * 31) + this.f14595c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f14593a + ", kotlinReadOnly=" + this.f14594b + ", kotlinMutable=" + this.f14595c + ')';
        }
    }

    static {
        c cVar = new c();
        f14576a = cVar;
        StringBuilder sb2 = new StringBuilder();
        f.a aVar = f.a.f14165e;
        sb2.append(aVar.b());
        sb2.append('.');
        sb2.append(aVar.a());
        f14577b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        f.b bVar = f.b.f14166e;
        sb3.append(bVar.b());
        sb3.append('.');
        sb3.append(bVar.a());
        f14578c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        f.d dVar = f.d.f14168e;
        sb4.append(dVar.b());
        sb4.append('.');
        sb4.append(dVar.a());
        f14579d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        f.c cVar2 = f.c.f14167e;
        sb5.append(cVar2.b());
        sb5.append('.');
        sb5.append(cVar2.a());
        f14580e = sb5.toString();
        b.a aVar2 = qb.b.f48178d;
        qb.b bVarC = aVar2.c(new qb.c("kotlin.jvm.functions.FunctionN"));
        f14581f = bVarC;
        f14582g = bVarC.a();
        qb.i iVar = qb.i.f48254a;
        f14583h = iVar.k();
        f14584i = iVar.j();
        f14585j = cVar.g(Class.class);
        f14586k = new HashMap<>();
        f14587l = new HashMap<>();
        f14588m = new HashMap<>();
        f14589n = new HashMap<>();
        f14590o = new HashMap<>();
        f14591p = new HashMap<>();
        qb.b bVarC2 = aVar2.c(p.a.f13437W);
        a aVar3 = new a(cVar.g(Iterable.class), bVarC2, new qb.b(bVarC2.f(), qb.e.g(p.a.f13450e0, bVarC2.f()), false));
        qb.b bVarC3 = aVar2.c(p.a.f13436V);
        a aVar4 = new a(cVar.g(Iterator.class), bVarC3, new qb.b(bVarC3.f(), qb.e.g(p.a.f13448d0, bVarC3.f()), false));
        qb.b bVarC4 = aVar2.c(p.a.f13438X);
        a aVar5 = new a(cVar.g(Collection.class), bVarC4, new qb.b(bVarC4.f(), qb.e.g(p.a.f13452f0, bVarC4.f()), false));
        qb.b bVarC5 = aVar2.c(p.a.f13439Y);
        a aVar6 = new a(cVar.g(List.class), bVarC5, new qb.b(bVarC5.f(), qb.e.g(p.a.f13454g0, bVarC5.f()), false));
        qb.b bVarC6 = aVar2.c(p.a.f13442a0);
        a aVar7 = new a(cVar.g(Set.class), bVarC6, new qb.b(bVarC6.f(), qb.e.g(p.a.f13458i0, bVarC6.f()), false));
        qb.b bVarC7 = aVar2.c(p.a.f13440Z);
        a aVar8 = new a(cVar.g(ListIterator.class), bVarC7, new qb.b(bVarC7.f(), qb.e.g(p.a.f13456h0, bVarC7.f()), false));
        qb.c cVar3 = p.a.f13444b0;
        qb.b bVarC8 = aVar2.c(cVar3);
        a aVar9 = new a(cVar.g(Map.class), bVarC8, new qb.b(bVarC8.f(), qb.e.g(p.a.f13460j0, bVarC8.f()), false));
        qb.b bVarC9 = aVar2.c(cVar3);
        qb.f fVarG = p.a.f13446c0.g();
        C3862t.f(fVarG, "shortName(...)");
        qb.b bVarD = bVarC9.d(fVarG);
        List<a> listP = kotlin.collections.r.p(aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a(cVar.g(Map.Entry.class), bVarD, new qb.b(bVarD.f(), qb.e.g(p.a.f13462k0, bVarD.f()), false)));
        f14592q = listP;
        cVar.f(Object.class, p.a.f13443b);
        cVar.f(String.class, p.a.f13455h);
        cVar.f(CharSequence.class, p.a.f13453g);
        cVar.e(Throwable.class, p.a.f13481u);
        cVar.f(Cloneable.class, p.a.f13447d);
        cVar.f(Number.class, p.a.f13475r);
        cVar.e(Comparable.class, p.a.f13483v);
        cVar.f(Enum.class, p.a.f13477s);
        cVar.e(Annotation.class, p.a.f13412G);
        Iterator<a> it = listP.iterator();
        while (it.hasNext()) {
            f14576a.d(it.next());
        }
        for (EnumC5149e enumC5149e : EnumC5149e.values()) {
            c cVar4 = f14576a;
            b.a aVar10 = qb.b.f48178d;
            qb.c cVarU = enumC5149e.u();
            C3862t.f(cVarU, "getWrapperFqName(...)");
            qb.b bVarC10 = aVar10.c(cVarU);
            Oa.m mVarT = enumC5149e.t();
            C3862t.f(mVarT, "getPrimitiveType(...)");
            cVar4.a(bVarC10, aVar10.c(Oa.p.c(mVarT)));
        }
        for (qb.b bVar2 : Oa.d.f13314a.a()) {
            f14576a.a(qb.b.f48178d.c(new qb.c("kotlin.jvm.internal." + bVar2.h().j() + "CompanionObject")), bVar2.d(qb.h.f48201d));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            c cVar5 = f14576a;
            cVar5.a(qb.b.f48178d.c(new qb.c("kotlin.jvm.functions.Function" + i10)), Oa.p.a(i10));
            cVar5.c(new qb.c(f14578c + i10), f14583h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            f.c cVar6 = f.c.f14167e;
            f14576a.c(new qb.c((cVar6.b() + '.' + cVar6.a()) + i11), f14583h);
        }
        c cVar7 = f14576a;
        qb.c cVarL = p.a.f13445c.l();
        C3862t.f(cVarL, "toSafe(...)");
        cVar7.c(cVarL, cVar7.g(Void.class));
    }

    private c() {
    }

    private final void a(qb.b bVar, qb.b bVar2) {
        b(bVar, bVar2);
        c(bVar2.a(), bVar);
    }

    private final void b(qb.b bVar, qb.b bVar2) {
        f14586k.put(bVar.a().j(), bVar2);
    }

    private final void c(qb.c cVar, qb.b bVar) {
        f14587l.put(cVar.j(), bVar);
    }

    private final void d(a aVar) {
        qb.b bVarA = aVar.a();
        qb.b bVarB = aVar.b();
        qb.b bVarC = aVar.c();
        a(bVarA, bVarB);
        c(bVarC.a(), bVarA);
        f14590o.put(bVarC, bVarB);
        f14591p.put(bVarB, bVarC);
        qb.c cVarA = bVarB.a();
        qb.c cVarA2 = bVarC.a();
        f14588m.put(bVarC.a().j(), cVarA);
        f14589n.put(cVarA.j(), cVarA2);
    }

    private final void e(Class<?> cls, qb.c cVar) {
        a(g(cls), qb.b.f48178d.c(cVar));
    }

    private final void f(Class<?> cls, qb.d dVar) {
        qb.c cVarL = dVar.l();
        C3862t.f(cVarL, "toSafe(...)");
        e(cls, cVarL);
    }

    private final qb.b g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            return qb.b.f48178d.c(new qb.c(cls.getCanonicalName()));
        }
        qb.b bVarG = g(declaringClass);
        qb.f fVarT = qb.f.t(cls.getSimpleName());
        C3862t.f(fVarT, "identifier(...)");
        return bVarG.d(fVarT);
    }

    private final boolean j(qb.d dVar, String str) {
        Integer numJ;
        String strB = dVar.b();
        C3862t.f(strB, "asString(...)");
        if (!Ub.n.G(strB, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strB.substring(str.length());
        C3862t.f(strSubstring, "substring(...)");
        return (Ub.n.C0(strSubstring, '0', false, 2, null) || (numJ = Ub.n.j(strSubstring)) == null || numJ.intValue() < 23) ? false : true;
    }

    public final qb.c h() {
        return f14582g;
    }

    public final List<a> i() {
        return f14592q;
    }

    public final boolean k(qb.d dVar) {
        return f14588m.containsKey(dVar);
    }

    public final boolean l(qb.d dVar) {
        return f14589n.containsKey(dVar);
    }

    public final qb.b m(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return f14586k.get(fqName.j());
    }

    public final qb.b n(qb.d kotlinFqName) {
        C3862t.g(kotlinFqName, "kotlinFqName");
        return j(kotlinFqName, f14577b) ? f14581f : j(kotlinFqName, f14579d) ? f14581f : j(kotlinFqName, f14578c) ? f14583h : j(kotlinFqName, f14580e) ? f14583h : f14587l.get(kotlinFqName);
    }

    public final qb.c o(qb.d dVar) {
        return f14588m.get(dVar);
    }

    public final qb.c p(qb.d dVar) {
        return f14589n.get(dVar);
    }
}
