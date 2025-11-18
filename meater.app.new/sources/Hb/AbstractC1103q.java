package Hb;

import Ra.InterfaceC1695h;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: AbstractTypeConstructor.kt */
/* renamed from: Hb.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1103q extends AbstractC1110w {

    /* renamed from: b, reason: collision with root package name */
    private final Gb.i<b> f5775b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5776c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: Hb.q$a */
    final class a implements y0 {

        /* renamed from: a, reason: collision with root package name */
        private final Ib.g f5777a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC4164i f5778b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC1103q f5779c;

        public a(AbstractC1103q abstractC1103q, Ib.g kotlinTypeRefiner) {
            C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f5779c = abstractC1103q;
            this.f5777a = kotlinTypeRefiner;
            this.f5778b = C4165j.b(EnumC4168m.f46627C, new C1101p(this, abstractC1103q));
        }

        private final List<U> d() {
            return (List) this.f5778b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List f(a aVar, AbstractC1103q abstractC1103q) {
            return Ib.h.b(aVar.f5777a, abstractC1103q.s());
        }

        @Override // Hb.y0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<U> s() {
            return d();
        }

        public boolean equals(Object obj) {
            return this.f5779c.equals(obj);
        }

        @Override // Hb.y0
        public List<Ra.m0> getParameters() {
            List<Ra.m0> parameters = this.f5779c.getParameters();
            C3862t.f(parameters, "getParameters(...)");
            return parameters;
        }

        public int hashCode() {
            return this.f5779c.hashCode();
        }

        @Override // Hb.y0
        public Oa.j q() {
            Oa.j jVarQ = this.f5779c.q();
            C3862t.f(jVarQ, "getBuiltIns(...)");
            return jVarQ;
        }

        @Override // Hb.y0
        public y0 r(Ib.g kotlinTypeRefiner) {
            C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f5779c.r(kotlinTypeRefiner);
        }

        @Override // Hb.y0
        public InterfaceC1695h t() {
            return this.f5779c.t();
        }

        public String toString() {
            return this.f5779c.toString();
        }

        @Override // Hb.y0
        public boolean u() {
            return this.f5779c.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: Hb.q$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Collection<U> f5780a;

        /* renamed from: b, reason: collision with root package name */
        private List<? extends U> f5781b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends U> allSupertypes) {
            C3862t.g(allSupertypes, "allSupertypes");
            this.f5780a = allSupertypes;
            this.f5781b = kotlin.collections.r.e(Jb.l.f7791a.l());
        }

        public final Collection<U> a() {
            return this.f5780a;
        }

        public final List<U> b() {
            return this.f5781b;
        }

        public final void c(List<? extends U> list) {
            C3862t.g(list, "<set-?>");
            this.f5781b = list;
        }
    }

    public AbstractC1103q(Gb.n storageManager) {
        C3862t.g(storageManager, "storageManager");
        this.f5775b = storageManager.b(new C1087i(this), C1089j.f5756B, new C1091k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b B(AbstractC1103q abstractC1103q) {
        return new b(abstractC1103q.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b C(boolean z10) {
        return new b(kotlin.collections.r.e(Jb.l.f7791a.l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F D(AbstractC1103q abstractC1103q, b supertypes) {
        C3862t.g(supertypes, "supertypes");
        List listA = abstractC1103q.w().a(abstractC1103q, supertypes.a(), new C1093l(abstractC1103q), new C1095m(abstractC1103q));
        if (listA.isEmpty()) {
            U uO = abstractC1103q.o();
            List listE = uO != null ? kotlin.collections.r.e(uO) : null;
            if (listE == null) {
                listE = kotlin.collections.r.m();
            }
            listA = listE;
        }
        if (abstractC1103q.v()) {
            abstractC1103q.w().a(abstractC1103q, listA, new C1097n(abstractC1103q), new C1099o(abstractC1103q));
        }
        List<U> listW0 = listA instanceof List ? (List) listA : null;
        if (listW0 == null) {
            listW0 = kotlin.collections.r.W0(listA);
        }
        supertypes.c(abstractC1103q.y(listW0));
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable E(AbstractC1103q abstractC1103q, y0 it) {
        C3862t.g(it, "it");
        return abstractC1103q.m(it, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F F(AbstractC1103q abstractC1103q, U it) {
        C3862t.g(it, "it");
        abstractC1103q.A(it);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable G(AbstractC1103q abstractC1103q, y0 it) {
        C3862t.g(it, "it");
        return abstractC1103q.m(it, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F H(AbstractC1103q abstractC1103q, U it) {
        C3862t.g(it, "it");
        abstractC1103q.z(it);
        return C4153F.f46609a;
    }

    private final Collection<U> m(y0 y0Var, boolean z10) {
        List listF0;
        AbstractC1103q abstractC1103q = y0Var instanceof AbstractC1103q ? (AbstractC1103q) y0Var : null;
        if (abstractC1103q != null && (listF0 = kotlin.collections.r.F0(abstractC1103q.f5775b.invoke().a(), abstractC1103q.p(z10))) != null) {
            return listF0;
        }
        Collection<U> collectionS = y0Var.s();
        C3862t.f(collectionS, "getSupertypes(...)");
        return collectionS;
    }

    protected void A(U type) {
        C3862t.g(type, "type");
    }

    protected abstract Collection<U> n();

    protected U o() {
        return null;
    }

    protected Collection<U> p(boolean z10) {
        return kotlin.collections.r.m();
    }

    @Override // Hb.y0
    public y0 r(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner);
    }

    protected boolean v() {
        return this.f5776c;
    }

    protected abstract Ra.k0 w();

    @Override // Hb.y0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public List<U> s() {
        return this.f5775b.invoke().b();
    }

    protected List<U> y(List<U> supertypes) {
        C3862t.g(supertypes, "supertypes");
        return supertypes;
    }

    protected void z(U type) {
        C3862t.g(type, "type");
    }
}
