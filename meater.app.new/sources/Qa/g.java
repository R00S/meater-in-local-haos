package Qa;

import Oa.p;
import Ra.E;
import Ra.EnumC1693f;
import Ra.H;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.N;
import Ra.h0;
import Ua.C1772k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.V;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import qb.b;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes3.dex */
public final class g implements Ta.b {

    /* renamed from: g, reason: collision with root package name */
    private static final qb.f f14603g;

    /* renamed from: h, reason: collision with root package name */
    private static final qb.b f14604h;

    /* renamed from: a, reason: collision with root package name */
    private final H f14605a;

    /* renamed from: b, reason: collision with root package name */
    private final Ba.l<H, InterfaceC1700m> f14606b;

    /* renamed from: c, reason: collision with root package name */
    private final Gb.i f14607c;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f14601e = {P.h(new G(P.b(g.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: d, reason: collision with root package name */
    public static final a f14600d = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final qb.c f14602f = Oa.p.f13366A;

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final qb.b a() {
            return g.f14604h;
        }

        private a() {
        }
    }

    static {
        qb.d dVar = p.a.f13447d;
        qb.f fVarI = dVar.i();
        C3862t.f(fVarI, "shortName(...)");
        f14603g = fVarI;
        b.a aVar = qb.b.f48178d;
        qb.c cVarL = dVar.l();
        C3862t.f(cVarL, "toSafe(...)");
        f14604h = aVar.c(cVarL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(Gb.n storageManager, H moduleDescriptor, Ba.l<? super H, ? extends InterfaceC1700m> computeContainingDeclaration) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(moduleDescriptor, "moduleDescriptor");
        C3862t.g(computeContainingDeclaration, "computeContainingDeclaration");
        this.f14605a = moduleDescriptor;
        this.f14606b = computeContainingDeclaration;
        this.f14607c = storageManager.g(new e(this, storageManager));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Oa.c d(H module) {
        C3862t.g(module, "module");
        List<N> listI = module.G(f14602f).I();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (obj instanceof Oa.c) {
                arrayList.add(obj);
            }
        }
        return (Oa.c) kotlin.collections.r.j0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1772k h(g gVar, Gb.n nVar) {
        C1772k c1772k = new C1772k(gVar.f14606b.invoke(gVar.f14605a), f14603g, E.f15109F, EnumC1693f.f15144D, kotlin.collections.r.e(gVar.f14605a.q().i()), h0.f15158a, false, nVar);
        c1772k.L0(new Qa.a(nVar, c1772k), V.d(), null);
        return c1772k;
    }

    private final C1772k i() {
        return (C1772k) Gb.m.a(this.f14607c, this, f14601e[0]);
    }

    @Override // Ta.b
    public InterfaceC1692e a(qb.b classId) {
        C3862t.g(classId, "classId");
        if (C3862t.b(classId, f14604h)) {
            return i();
        }
        return null;
    }

    @Override // Ta.b
    public Collection<InterfaceC1692e> b(qb.c packageFqName) {
        C3862t.g(packageFqName, "packageFqName");
        return C3862t.b(packageFqName, f14602f) ? V.c(i()) : V.d();
    }

    @Override // Ta.b
    public boolean c(qb.c packageFqName, qb.f name) {
        C3862t.g(packageFqName, "packageFqName");
        C3862t.g(name, "name");
        return C3862t.b(name, f14603g) && C3862t.b(packageFqName, f14602f);
    }

    public /* synthetic */ g(Gb.n nVar, H h10, Ba.l lVar, int i10, C3854k c3854k) {
        this(nVar, h10, (i10 & 4) != 0 ? f.f14599B : lVar);
    }
}
