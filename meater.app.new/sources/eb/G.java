package eb;

import Ab.d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.g0;
import ab.InterfaceC1961u;
import db.C3096k;
import eb.InterfaceC3271c;
import hb.EnumC3507D;
import hb.InterfaceC3514g;
import hb.InterfaceC3528u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jb.v;
import kb.C3816a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: LazyJavaPackageScope.kt */
/* loaded from: classes3.dex */
public final class G extends b0 {

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3528u f40824n;

    /* renamed from: o, reason: collision with root package name */
    private final C3268D f40825o;

    /* renamed from: p, reason: collision with root package name */
    private final Gb.j<Set<String>> f40826p;

    /* renamed from: q, reason: collision with root package name */
    private final Gb.h<a, InterfaceC1692e> f40827q;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyJavaPackageScope.kt */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final qb.f f40828a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3514g f40829b;

        public a(qb.f name, InterfaceC3514g interfaceC3514g) {
            C3862t.g(name, "name");
            this.f40828a = name;
            this.f40829b = interfaceC3514g;
        }

        public final InterfaceC3514g a() {
            return this.f40829b;
        }

        public final qb.f b() {
            return this.f40828a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C3862t.b(this.f40828a, ((a) obj).f40828a);
        }

        public int hashCode() {
            return this.f40828a.hashCode();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    private static abstract class b {

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC1692e f40830a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC1692e descriptor) {
                super(null);
                C3862t.g(descriptor, "descriptor");
                this.f40830a = descriptor;
            }

            public final InterfaceC1692e a() {
                return this.f40830a;
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: eb.G$b$b, reason: collision with other inner class name */
        public static final class C0510b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0510b f40831a = new C0510b();

            private C0510b() {
                super(null);
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f40832a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C3096k c10, InterfaceC3528u jPackage, C3268D ownerDescriptor) {
        super(c10);
        C3862t.g(c10, "c");
        C3862t.g(jPackage, "jPackage");
        C3862t.g(ownerDescriptor, "ownerDescriptor");
        this.f40824n = jPackage;
        this.f40825o = ownerDescriptor;
        this.f40826p = c10.e().i(new E(c10, this));
        this.f40827q = c10.e().e(new F(this, c10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1692e i0(G g10, C3096k c3096k, a request) {
        C3862t.g(request, "request");
        qb.b bVar = new qb.b(g10.R().f(), request.b());
        v.a aVarC = request.a() != null ? c3096k.a().j().c(request.a(), g10.m0()) : c3096k.a().j().b(bVar, g10.m0());
        jb.x xVarA = aVarC != null ? aVarC.a() : null;
        qb.b bVarC = xVarA != null ? xVarA.c() : null;
        if (bVarC != null && (bVarC.j() || bVarC.i())) {
            return null;
        }
        b bVarP0 = g10.p0(xVarA);
        if (bVarP0 instanceof b.a) {
            return ((b.a) bVarP0).a();
        }
        if (bVarP0 instanceof b.c) {
            return null;
        }
        if (!(bVarP0 instanceof b.C0510b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC3514g interfaceC3514gA = request.a();
        if (interfaceC3514gA == null) {
            InterfaceC1961u interfaceC1961uD = c3096k.a().d();
            v.a.C0565a c0565a = aVarC instanceof v.a.C0565a ? (v.a.C0565a) aVarC : null;
            interfaceC3514gA = interfaceC1961uD.c(new InterfaceC1961u.a(bVar, c0565a != null ? c0565a.b() : null, null, 4, null));
        }
        InterfaceC3514g interfaceC3514g = interfaceC3514gA;
        if ((interfaceC3514g != null ? interfaceC3514g.I() : null) != EnumC3507D.f42372C) {
            qb.c cVarF = interfaceC3514g != null ? interfaceC3514g.f() : null;
            if (cVarF == null || cVarF.d() || !C3862t.b(cVarF.e(), g10.R().f())) {
                return null;
            }
            C3282n c3282n = new C3282n(c3096k, g10.R(), interfaceC3514g, null, 8, null);
            c3096k.a().e().a(c3282n);
            return c3282n;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + interfaceC3514g + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + jb.w.a(c3096k.a().j(), interfaceC3514g, g10.m0()) + "\nfindKotlinClass(ClassId) = " + jb.w.b(c3096k.a().j(), bVar, g10.m0()) + '\n');
    }

    private final InterfaceC1692e j0(qb.f fVar, InterfaceC3514g interfaceC3514g) {
        if (!qb.h.f48198a.a(fVar)) {
            return null;
        }
        Set<String> setInvoke = this.f40826p.invoke();
        if (interfaceC3514g != null || setInvoke == null || setInvoke.contains(fVar.j())) {
            return this.f40827q.invoke(new a(fVar, interfaceC3514g));
        }
        return null;
    }

    private final pb.e m0() {
        return Rb.c.a(L().a().b().f().g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set o0(C3096k c3096k, G g10) {
        return c3096k.a().d().a(g10.R().f());
    }

    private final b p0(jb.x xVar) {
        if (xVar == null) {
            return b.C0510b.f40831a;
        }
        if (xVar.a().c() != C3816a.EnumC0573a.f43848F) {
            return b.c.f40832a;
        }
        InterfaceC1692e interfaceC1692eN = L().a().b().n(xVar);
        return interfaceC1692eN != null ? new b.a(interfaceC1692eN) : b.C0510b.f40831a;
    }

    @Override // eb.U
    protected void B(Collection<g0> result, qb.f name) {
        C3862t.g(result, "result");
        C3862t.g(name, "name");
    }

    @Override // eb.U
    protected Set<qb.f> D(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> lVar) {
        C3862t.g(kindFilter, "kindFilter");
        return kotlin.collections.V.d();
    }

    @Override // eb.U, Ab.l, Ab.k
    public Collection<Ra.Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return kotlin.collections.r.m();
    }

    @Override // eb.U, Ab.l, Ab.n
    public Collection<InterfaceC1700m> f(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        d.a aVar = Ab.d.f1109c;
        if (!kindFilter.a(aVar.e() | aVar.c())) {
            return kotlin.collections.r.m();
        }
        Collection<InterfaceC1700m> collectionInvoke = K().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            InterfaceC1700m interfaceC1700m = (InterfaceC1700m) obj;
            if (interfaceC1700m instanceof InterfaceC1692e) {
                qb.f name = ((InterfaceC1692e) interfaceC1700m).getName();
                C3862t.f(name, "getName(...)");
                if (nameFilter.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final InterfaceC1692e k0(InterfaceC3514g javaClass) {
        C3862t.g(javaClass, "javaClass");
        return j0(javaClass.getName(), javaClass);
    }

    @Override // Ab.l, Ab.n
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1692e g(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return j0(name, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // eb.U
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C3268D R() {
        return this.f40825o;
    }

    @Override // eb.U
    protected Set<qb.f> v(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> lVar) {
        C3862t.g(kindFilter, "kindFilter");
        if (!kindFilter.a(Ab.d.f1109c.e())) {
            return kotlin.collections.V.d();
        }
        Set<String> setInvoke = this.f40826p.invoke();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(qb.f.t((String) it.next()));
            }
            return hashSet;
        }
        InterfaceC3528u interfaceC3528u = this.f40824n;
        if (lVar == null) {
            lVar = Rb.j.k();
        }
        Collection<InterfaceC3514g> collectionV = interfaceC3528u.v(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC3514g interfaceC3514g : collectionV) {
            qb.f name = interfaceC3514g.I() == EnumC3507D.f42371B ? null : interfaceC3514g.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // eb.U
    protected Set<qb.f> x(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> lVar) {
        C3862t.g(kindFilter, "kindFilter");
        return kotlin.collections.V.d();
    }

    @Override // eb.U
    protected InterfaceC3271c z() {
        return InterfaceC3271c.a.f40886a;
    }
}
