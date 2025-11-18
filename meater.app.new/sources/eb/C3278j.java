package eb;

import Hb.AbstractC1082f0;
import Hb.L0;
import Hb.Q0;
import Ra.C1711y;
import Ra.InterfaceC1692e;
import Ra.t0;
import ab.C1928I;
import bb.C2275a;
import db.C3096k;
import fb.C3355b;
import gb.InterfaceC3458a;
import hb.InterfaceC3508a;
import hb.InterfaceC3509b;
import hb.InterfaceC3510c;
import hb.InterfaceC3512e;
import hb.InterfaceC3514g;
import hb.InterfaceC3515h;
import hb.InterfaceC3520m;
import hb.InterfaceC3522o;
import hb.InterfaceC3531x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import vb.AbstractC4943g;
import vb.C4937a;
import vb.C4945i;
import xb.C5087e;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
/* renamed from: eb.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3278j implements cb.g {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f40898i = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(C3278j.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(C3278j.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(C3278j.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a, reason: collision with root package name */
    private final C3096k f40899a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3508a f40900b;

    /* renamed from: c, reason: collision with root package name */
    private final Gb.j f40901c;

    /* renamed from: d, reason: collision with root package name */
    private final Gb.i f40902d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3458a f40903e;

    /* renamed from: f, reason: collision with root package name */
    private final Gb.i f40904f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f40905g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f40906h;

    public C3278j(C3096k c10, InterfaceC3508a javaAnnotation, boolean z10) {
        C3862t.g(c10, "c");
        C3862t.g(javaAnnotation, "javaAnnotation");
        this.f40899a = c10;
        this.f40900b = javaAnnotation;
        this.f40901c = c10.e().i(new C3275g(this));
        this.f40902d = c10.e().g(new C3276h(this));
        this.f40903e = c10.a().t().a(javaAnnotation);
        this.f40904f = c10.e().g(new C3277i(this));
        this.f40905g = javaAnnotation.e();
        this.f40906h = javaAnnotation.w() || z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map h(C3278j c3278j) {
        Collection<InterfaceC3509b> collectionB = c3278j.f40900b.b();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3509b interfaceC3509b : collectionB) {
            qb.f name = interfaceC3509b.getName();
            if (name == null) {
                name = C1928I.f20141c;
            }
            AbstractC4943g<?> abstractC4943gO = c3278j.o(interfaceC3509b);
            C4170o c4170oA = abstractC4943gO != null ? oa.v.a(name, abstractC4943gO) : null;
            if (c4170oA != null) {
                arrayList.add(c4170oA);
            }
        }
        return kotlin.collections.M.p(arrayList);
    }

    private final InterfaceC1692e i(qb.c cVar) {
        return C1711y.d(this.f40899a.d(), qb.b.f48178d.c(cVar), this.f40899a.a().b().f().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qb.c k(C3278j c3278j) {
        qb.b bVarC = c3278j.f40900b.c();
        if (bVarC != null) {
            return bVarC.a();
        }
        return null;
    }

    private final AbstractC4943g<?> o(InterfaceC3509b interfaceC3509b) {
        if (interfaceC3509b instanceof InterfaceC3522o) {
            return C4945i.f(C4945i.f51601a, ((InterfaceC3522o) interfaceC3509b).getValue(), null, 2, null);
        }
        if (interfaceC3509b instanceof InterfaceC3520m) {
            InterfaceC3520m interfaceC3520m = (InterfaceC3520m) interfaceC3509b;
            return r(interfaceC3520m.b(), interfaceC3520m.d());
        }
        if (!(interfaceC3509b instanceof InterfaceC3512e)) {
            if (interfaceC3509b instanceof InterfaceC3510c) {
                return p(((InterfaceC3510c) interfaceC3509b).a());
            }
            if (interfaceC3509b instanceof InterfaceC3515h) {
                return s(((InterfaceC3515h) interfaceC3509b).c());
            }
            return null;
        }
        InterfaceC3512e interfaceC3512e = (InterfaceC3512e) interfaceC3509b;
        qb.f name = interfaceC3512e.getName();
        if (name == null) {
            name = C1928I.f20141c;
        }
        C3862t.d(name);
        return q(name, interfaceC3512e.e());
    }

    private final AbstractC4943g<?> p(InterfaceC3508a interfaceC3508a) {
        return new C4937a(new C3278j(this.f40899a, interfaceC3508a, false, 4, null));
    }

    private final AbstractC4943g<?> q(qb.f fVar, List<? extends InterfaceC3509b> list) {
        Hb.U uL;
        if (Hb.Y.a(a())) {
            return null;
        }
        InterfaceC1692e interfaceC1692eL = C5087e.l(this);
        C3862t.d(interfaceC1692eL);
        t0 t0VarB = C2275a.b(fVar, interfaceC1692eL);
        if (t0VarB == null || (uL = t0VarB.a()) == null) {
            uL = this.f40899a.a().m().q().l(Q0.f5693F, Jb.l.d(Jb.k.f7763f1, new String[0]));
            C3862t.f(uL, "getArrayType(...)");
        }
        List<? extends InterfaceC3509b> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            AbstractC4943g<?> abstractC4943gO = o((InterfaceC3509b) it.next());
            if (abstractC4943gO == null) {
                abstractC4943gO = new vb.v();
            }
            arrayList.add(abstractC4943gO);
        }
        return C4945i.f51601a.b(arrayList, uL);
    }

    private final AbstractC4943g<?> r(qb.b bVar, qb.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new vb.k(bVar, fVar);
    }

    private final AbstractC4943g<?> s(InterfaceC3531x interfaceC3531x) {
        return vb.t.f51622b.a(this.f40899a.g().p(interfaceC3531x, C3355b.b(L0.f5678C, false, false, null, 7, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1082f0 t(C3278j c3278j) {
        qb.c cVarF = c3278j.f();
        if (cVarF == null) {
            return Jb.l.d(Jb.k.f7765g1, c3278j.f40900b.toString());
        }
        InterfaceC1692e interfaceC1692eF = Qa.d.f(Qa.d.f14596a, cVarF, c3278j.f40899a.d().q(), null, 4, null);
        if (interfaceC1692eF == null) {
            InterfaceC3514g interfaceC3514gA = c3278j.f40900b.A();
            interfaceC1692eF = interfaceC3514gA != null ? c3278j.f40899a.a().n().a(interfaceC3514gA) : null;
            if (interfaceC1692eF == null) {
                interfaceC1692eF = c3278j.i(cVarF);
            }
        }
        return interfaceC1692eF.u();
    }

    @Override // Sa.c
    public Map<qb.f, AbstractC4943g<?>> b() {
        return (Map) Gb.m.a(this.f40904f, this, f40898i[2]);
    }

    @Override // cb.g
    public boolean e() {
        return this.f40905g;
    }

    @Override // Sa.c
    public qb.c f() {
        return (qb.c) Gb.m.b(this.f40901c, this, f40898i[0]);
    }

    @Override // Sa.c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public InterfaceC3458a j() {
        return this.f40903e;
    }

    @Override // Sa.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC1082f0 a() {
        return (AbstractC1082f0) Gb.m.a(this.f40902d, this, f40898i[1]);
    }

    public final boolean n() {
        return this.f40906h;
    }

    public String toString() {
        return sb.n.Q(sb.n.f49596h, this, null, 2, null);
    }

    public /* synthetic */ C3278j(C3096k c3096k, InterfaceC3508a interfaceC3508a, boolean z10, int i10, C3854k c3854k) {
        this(c3096k, interfaceC3508a, (i10 & 4) != 0 ? false : z10);
    }
}
