package Db;

import Fb.C1032m;
import Oa.p;
import Ra.InterfaceC1692e;
import Ra.h0;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import lb.C3923c;
import lb.C3940t;
import nb.AbstractC4075a;
import nb.InterfaceC4077c;
import nb.h;
import qb.b;

/* compiled from: ClassDeserializer.kt */
/* renamed from: Db.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1006l {

    /* renamed from: c, reason: collision with root package name */
    public static final b f3683c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Set<qb.b> f3684d;

    /* renamed from: a, reason: collision with root package name */
    private final C1008n f3685a;

    /* renamed from: b, reason: collision with root package name */
    private final Ba.l<a, InterfaceC1692e> f3686b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClassDeserializer.kt */
    /* renamed from: Db.l$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final qb.b f3687a;

        /* renamed from: b, reason: collision with root package name */
        private final C1003i f3688b;

        public a(qb.b classId, C1003i c1003i) {
            C3862t.g(classId, "classId");
            this.f3687a = classId;
            this.f3688b = c1003i;
        }

        public final C1003i a() {
            return this.f3688b;
        }

        public final qb.b b() {
            return this.f3687a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C3862t.b(this.f3687a, ((a) obj).f3687a);
        }

        public int hashCode() {
            return this.f3687a.hashCode();
        }
    }

    /* compiled from: ClassDeserializer.kt */
    /* renamed from: Db.l$b */
    public static final class b {
        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        public final Set<qb.b> a() {
            return C1006l.f3684d;
        }

        private b() {
        }
    }

    static {
        b.a aVar = qb.b.f48178d;
        qb.c cVarL = p.a.f13447d.l();
        C3862t.f(cVarL, "toSafe(...)");
        f3684d = kotlin.collections.V.c(aVar.c(cVarL));
    }

    public C1006l(C1008n components) {
        C3862t.g(components, "components");
        this.f3685a = components;
        this.f3686b = components.u().e(new C1005k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1692e c(C1006l c1006l, a key) {
        C3862t.g(key, "key");
        return c1006l.d(key);
    }

    private final InterfaceC1692e d(a aVar) {
        Object next;
        C1010p c1010pA;
        qb.b bVarB = aVar.b();
        Iterator<Ta.b> it = this.f3685a.l().iterator();
        while (it.hasNext()) {
            InterfaceC1692e interfaceC1692eA = it.next().a(bVarB);
            if (interfaceC1692eA != null) {
                return interfaceC1692eA;
            }
        }
        if (f3684d.contains(bVarB)) {
            return null;
        }
        C1003i c1003iA = aVar.a();
        if (c1003iA == null && (c1003iA = this.f3685a.e().a(bVarB)) == null) {
            return null;
        }
        InterfaceC4077c interfaceC4077cA = c1003iA.a();
        C3923c c3923cB = c1003iA.b();
        AbstractC4075a abstractC4075aC = c1003iA.c();
        h0 h0VarD = c1003iA.d();
        qb.b bVarE = bVarB.e();
        if (bVarE != null) {
            InterfaceC1692e interfaceC1692eF = f(this, bVarE, null, 2, null);
            C1032m c1032m = interfaceC1692eF instanceof C1032m ? (C1032m) interfaceC1692eF : null;
            if (c1032m == null || !c1032m.l1(bVarB.h())) {
                return null;
            }
            c1010pA = c1032m.e1();
        } else {
            Iterator<T> it2 = Ra.T.c(this.f3685a.s(), bVarB.f()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                Ra.N n10 = (Ra.N) next;
                if (!(n10 instanceof r) || ((r) n10).L0(bVarB.h())) {
                    break;
                }
            }
            Ra.N n11 = (Ra.N) next;
            if (n11 == null) {
                return null;
            }
            C1008n c1008n = this.f3685a;
            C3940t c3940tJ1 = c3923cB.j1();
            C3862t.f(c3940tJ1, "getTypeTable(...)");
            nb.g gVar = new nb.g(c3940tJ1);
            h.a aVar2 = nb.h.f45846b;
            lb.w wVarL1 = c3923cB.l1();
            C3862t.f(wVarL1, "getVersionRequirementTable(...)");
            c1010pA = c1008n.a(n11, interfaceC4077cA, gVar, aVar2.a(wVarL1), abstractC4075aC, null);
        }
        return new C1032m(c1010pA, c3923cB, interfaceC4077cA, abstractC4075aC, h0VarD);
    }

    public static /* synthetic */ InterfaceC1692e f(C1006l c1006l, qb.b bVar, C1003i c1003i, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c1003i = null;
        }
        return c1006l.e(bVar, c1003i);
    }

    public final InterfaceC1692e e(qb.b classId, C1003i c1003i) {
        C3862t.g(classId, "classId");
        return this.f3686b.invoke(new a(classId, c1003i));
    }
}
