package jb;

import Db.EnumC0998d;
import Db.InterfaceC0999e;
import Db.N;
import Hb.U;
import Ra.h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jb.C3757A;
import jb.x;
import kotlin.jvm.internal.C3862t;
import lb.C3934n;
import nb.C4076b;
import vb.AbstractC4943g;
import vb.t;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* renamed from: jb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3770d<A, C> extends AbstractC3771e<A, C3773g<? extends A, ? extends C>> implements InterfaceC0999e<A, C> {

    /* renamed from: c, reason: collision with root package name */
    private final Gb.g<x, C3773g<A, C>> f43599c;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: jb.d$a */
    public static final class a implements x.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3770d<A, C> f43600a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap<C3757A, List<A>> f43601b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f43602c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap<C3757A, C> f43603d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap<C3757A, C> f43604e;

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* renamed from: jb.d$a$a, reason: collision with other inner class name */
        public final class C0560a extends b implements x.e {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f43605d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0560a(a aVar, C3757A signature) {
                super(aVar, signature);
                C3862t.g(signature, "signature");
                this.f43605d = aVar;
            }

            @Override // jb.x.e
            public x.a b(int i10, qb.b classId, h0 source) {
                C3862t.g(classId, "classId");
                C3862t.g(source, "source");
                C3757A c3757aE = C3757A.f43569b.e(d(), i10);
                List<A> arrayList = this.f43605d.f43601b.get(c3757aE);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f43605d.f43601b.put(c3757aE, arrayList);
                }
                return this.f43605d.f43600a.y(classId, source, arrayList);
            }
        }

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* renamed from: jb.d$a$b */
        public class b implements x.c {

            /* renamed from: a, reason: collision with root package name */
            private final C3757A f43606a;

            /* renamed from: b, reason: collision with root package name */
            private final ArrayList<A> f43607b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f43608c;

            public b(a aVar, C3757A signature) {
                C3862t.g(signature, "signature");
                this.f43608c = aVar;
                this.f43606a = signature;
                this.f43607b = new ArrayList<>();
            }

            @Override // jb.x.c
            public void a() {
                if (this.f43607b.isEmpty()) {
                    return;
                }
                this.f43608c.f43601b.put(this.f43606a, this.f43607b);
            }

            @Override // jb.x.c
            public x.a c(qb.b classId, h0 source) {
                C3862t.g(classId, "classId");
                C3862t.g(source, "source");
                return this.f43608c.f43600a.y(classId, source, this.f43607b);
            }

            protected final C3757A d() {
                return this.f43606a;
            }
        }

        a(AbstractC3770d<A, C> abstractC3770d, HashMap<C3757A, List<A>> map, x xVar, HashMap<C3757A, C> map2, HashMap<C3757A, C> map3) {
            this.f43600a = abstractC3770d;
            this.f43601b = map;
            this.f43602c = xVar;
            this.f43603d = map2;
            this.f43604e = map3;
        }

        @Override // jb.x.d
        public x.c a(qb.f name, String desc, Object obj) {
            C cI;
            C3862t.g(name, "name");
            C3862t.g(desc, "desc");
            C3757A.a aVar = C3757A.f43569b;
            String strJ = name.j();
            C3862t.f(strJ, "asString(...)");
            C3757A c3757aA = aVar.a(strJ, desc);
            if (obj != null && (cI = this.f43600a.I(desc, obj)) != null) {
                this.f43604e.put(c3757aA, cI);
            }
            return new b(this, c3757aA);
        }

        @Override // jb.x.d
        public x.e b(qb.f name, String desc) {
            C3862t.g(name, "name");
            C3862t.g(desc, "desc");
            C3757A.a aVar = C3757A.f43569b;
            String strJ = name.j();
            C3862t.f(strJ, "asString(...)");
            return new C0560a(this, aVar.d(strJ, desc));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3770d(Gb.n storageManager, v kotlinClassFinder) {
        super(kotlinClassFinder);
        C3862t.g(storageManager, "storageManager");
        C3862t.g(kotlinClassFinder, "kotlinClassFinder");
        this.f43599c = storageManager.h(new C3767a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object G(C3773g loadConstantFromProperty, C3757A it) {
        C3862t.g(loadConstantFromProperty, "$this$loadConstantFromProperty");
        C3862t.g(it, "it");
        return loadConstantFromProperty.b().get(it);
    }

    private final C3773g<A, C> H(x xVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        xVar.b(new a(this, map, xVar, map3, map2), r(xVar));
        return new C3773g<>(map, map2, map3);
    }

    private final C J(N n10, C3934n c3934n, EnumC0998d enumC0998d, U u10, Ba.p<? super C3773g<? extends A, ? extends C>, ? super C3757A, ? extends C> pVar) {
        C cInvoke;
        x xVarP = p(n10, AbstractC3771e.f43609b.a(n10, true, true, C4076b.f45798B.d(c3934n.b0()), pb.i.f(c3934n), v(), u()));
        if (xVarP == null) {
            return null;
        }
        C3757A c3757aS = s(c3934n, n10.b(), n10.d(), enumC0998d, xVarP.a().d().d(n.f43651b.a()));
        if (c3757aS == null || (cInvoke = pVar.invoke(this.f43599c.invoke(xVarP), c3757aS)) == null) {
            return null;
        }
        return Oa.t.d(u10) ? M(cInvoke) : cInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(C3773g loadConstantFromProperty, C3757A it) {
        C3862t.g(loadConstantFromProperty, "$this$loadConstantFromProperty");
        C3862t.g(it, "it");
        return loadConstantFromProperty.c().get(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3773g L(AbstractC3770d abstractC3770d, x kotlinClass) {
        C3862t.g(kotlinClass, "kotlinClass");
        return abstractC3770d.H(kotlinClass);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jb.AbstractC3771e
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C3773g<A, C> q(x binaryClass) {
        C3862t.g(binaryClass, "binaryClass");
        return this.f43599c.invoke(binaryClass);
    }

    protected final boolean F(qb.b annotationClassId, Map<qb.f, ? extends AbstractC4943g<?>> arguments) {
        C3862t.g(annotationClassId, "annotationClassId");
        C3862t.g(arguments, "arguments");
        if (!C3862t.b(annotationClassId, Na.a.f12585a.a())) {
            return false;
        }
        AbstractC4943g<?> abstractC4943g = arguments.get(qb.f.t("value"));
        vb.t tVar = abstractC4943g instanceof vb.t ? (vb.t) abstractC4943g : null;
        if (tVar == null) {
            return false;
        }
        t.b bVarB = tVar.b();
        t.b.C0741b c0741b = bVarB instanceof t.b.C0741b ? (t.b.C0741b) bVarB : null;
        if (c0741b == null) {
            return false;
        }
        return w(c0741b.b());
    }

    protected abstract C I(String str, Object obj);

    protected abstract C M(C c10);

    @Override // Db.InterfaceC0999e
    public C b(N container, C3934n proto, U expectedType) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        C3862t.g(expectedType, "expectedType");
        return J(container, proto, EnumC0998d.PROPERTY, expectedType, C3769c.f43598B);
    }

    @Override // Db.InterfaceC0999e
    public C h(N container, C3934n proto, U expectedType) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        C3862t.g(expectedType, "expectedType");
        return J(container, proto, EnumC0998d.PROPERTY_GETTER, expectedType, C3768b.f43597B);
    }
}
