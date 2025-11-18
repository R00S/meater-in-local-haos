package eb;

import Ra.InterfaceC1692e;
import Ra.h0;
import db.C3088c;
import db.C3093h;
import db.C3096k;
import hb.InterfaceC3514g;
import hb.InterfaceC3528u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb.InterfaceC3760D;
import kb.C3816a;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import qb.b;
import yb.C5148d;

/* compiled from: LazyJavaPackageFragment.kt */
/* renamed from: eb.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3268D extends Ua.H {

    /* renamed from: P, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f40810P = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(C3268D.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(C3268D.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: H, reason: collision with root package name */
    private final InterfaceC3528u f40811H;

    /* renamed from: I, reason: collision with root package name */
    private final C3096k f40812I;

    /* renamed from: J, reason: collision with root package name */
    private final pb.e f40813J;

    /* renamed from: K, reason: collision with root package name */
    private final Gb.i f40814K;

    /* renamed from: L, reason: collision with root package name */
    private final C3274f f40815L;

    /* renamed from: M, reason: collision with root package name */
    private final Gb.i<List<qb.c>> f40816M;

    /* renamed from: N, reason: collision with root package name */
    private final Sa.h f40817N;

    /* renamed from: O, reason: collision with root package name */
    private final Gb.i f40818O;

    /* compiled from: LazyJavaPackageFragment.kt */
    /* renamed from: eb.D$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40819a;

        static {
            int[] iArr = new int[C3816a.EnumC0573a.values().length];
            try {
                iArr[C3816a.EnumC0573a.f43852J.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3816a.EnumC0573a.f43849G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f40819a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3268D(C3096k outerContext, InterfaceC3528u jPackage) {
        super(outerContext.d(), jPackage.f());
        C3862t.g(outerContext, "outerContext");
        C3862t.g(jPackage, "jPackage");
        this.f40811H = jPackage;
        C3096k c3096kF = C3088c.f(outerContext, this, null, 0, 6, null);
        this.f40812I = c3096kF;
        this.f40813J = Rb.c.a(outerContext.a().b().f().g());
        this.f40814K = c3096kF.e().g(new C3265A(this));
        this.f40815L = new C3274f(c3096kF, jPackage, this);
        this.f40816M = c3096kF.e().f(new C3266B(this), kotlin.collections.r.m());
        this.f40817N = c3096kF.a().i().b() ? Sa.h.f15630e.b() : C3093h.a(c3096kF, jPackage);
        this.f40818O = c3096kF.e().g(new C3267C(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map N0(C3268D c3268d) {
        InterfaceC3760D interfaceC3760DO = c3268d.f40812I.a().o();
        String strB = c3268d.f().b();
        C3862t.f(strB, "asString(...)");
        List<String> listA = interfaceC3760DO.a(strB);
        ArrayList arrayList = new ArrayList();
        for (String str : listA) {
            b.a aVar = qb.b.f48178d;
            qb.c cVarE = C5148d.d(str).e();
            C3862t.f(cVarE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            jb.x xVarB = jb.w.b(c3268d.f40812I.a().j(), aVar.c(cVarE), c3268d.f40813J);
            C4170o c4170oA = xVarB != null ? oa.v.a(str, xVarB) : null;
            if (c4170oA != null) {
                arrayList.add(c4170oA);
            }
        }
        return kotlin.collections.M.p(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap S0(C3268D c3268d) {
        HashMap map = new HashMap();
        for (Map.Entry<String, jb.x> entry : c3268d.P0().entrySet()) {
            String key = entry.getKey();
            jb.x value = entry.getValue();
            C5148d c5148dD = C5148d.d(key);
            C3862t.f(c5148dD, "byInternalName(...)");
            C3816a c3816aA = value.a();
            int i10 = a.f40819a[c3816aA.c().ordinal()];
            if (i10 == 1) {
                String strE = c3816aA.e();
                if (strE != null) {
                    map.put(c5148dD, C5148d.d(strE));
                }
            } else if (i10 == 2) {
                map.put(c5148dD, c5148dD);
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List T0(C3268D c3268d) {
        Collection<InterfaceC3528u> collectionB = c3268d.f40811H.B();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collectionB, 10));
        Iterator<T> it = collectionB.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC3528u) it.next()).f());
        }
        return arrayList;
    }

    public final InterfaceC1692e O0(InterfaceC3514g jClass) {
        C3862t.g(jClass, "jClass");
        return this.f40815L.i().k0(jClass);
    }

    public final Map<String, jb.x> P0() {
        return (Map) Gb.m.a(this.f40814K, this, f40810P[0]);
    }

    @Override // Ra.N
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public C3274f s() {
        return this.f40815L;
    }

    public final List<qb.c> R0() {
        return this.f40816M.invoke();
    }

    @Override // Sa.b, Sa.a
    public Sa.h getAnnotations() {
        return this.f40817N;
    }

    @Override // Ua.H, Ua.AbstractC1775n, Ra.InterfaceC1703p
    public h0 j() {
        return new jb.y(this);
    }

    @Override // Ua.H, Ua.AbstractC1774m
    public String toString() {
        return "Lazy Java package fragment: " + f() + " of module " + this.f40812I.a().m();
    }
}
