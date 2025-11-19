package jb;

import Db.EnumC0998d;
import Db.InterfaceC1002h;
import Db.N;
import Ra.h0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jb.AbstractC3771e.a;
import jb.C3757A;
import jb.x;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import lb.C3922b;
import lb.C3923c;
import lb.C3924d;
import lb.C3927g;
import lb.C3929i;
import lb.C3934n;
import lb.C3937q;
import lb.C3939s;
import nb.C4076b;
import nb.InterfaceC4077c;
import ob.C4176a;
import pb.d;
import qb.b;
import va.C4929b;
import va.InterfaceC4928a;
import yb.C5148d;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* renamed from: jb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3771e<A, S extends a<? extends A>> implements InterfaceC1002h<A> {

    /* renamed from: b, reason: collision with root package name */
    public static final b f43609b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final v f43610a;

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: jb.e$a */
    public static abstract class a<A> {
        public abstract Map<C3757A, List<A>> a();
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: jb.e$b */
    public static final class b {
        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        public final x a(N container, boolean z10, boolean z11, Boolean bool, boolean z12, v kotlinClassFinder, pb.e jvmMetadataVersion) {
            N.a aVarH;
            C3862t.g(container, "container");
            C3862t.g(kotlinClassFinder, "kotlinClassFinder");
            C3862t.g(jvmMetadataVersion, "jvmMetadataVersion");
            if (z10) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
                }
                if (container instanceof N.a) {
                    N.a aVar = (N.a) container;
                    if (aVar.g() == C3923c.EnumC0599c.INTERFACE) {
                        qb.b bVarE = aVar.e();
                        qb.f fVarT = qb.f.t("DefaultImpls");
                        C3862t.f(fVarT, "identifier(...)");
                        return w.b(kotlinClassFinder, bVarE.d(fVarT), jvmMetadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof N.b)) {
                    h0 h0VarC = container.c();
                    r rVar = h0VarC instanceof r ? (r) h0VarC : null;
                    C5148d c5148dF = rVar != null ? rVar.f() : null;
                    if (c5148dF != null) {
                        b.a aVar2 = qb.b.f48178d;
                        String strF = c5148dF.f();
                        C3862t.f(strF, "getInternalName(...)");
                        return w.b(kotlinClassFinder, aVar2.c(new qb.c(Ub.n.B(strF, '/', '.', false, 4, null))), jvmMetadataVersion);
                    }
                }
            }
            if (z11 && (container instanceof N.a)) {
                N.a aVar3 = (N.a) container;
                if (aVar3.g() == C3923c.EnumC0599c.COMPANION_OBJECT && (aVarH = aVar3.h()) != null && (aVarH.g() == C3923c.EnumC0599c.CLASS || aVarH.g() == C3923c.EnumC0599c.ENUM_CLASS || (z12 && (aVarH.g() == C3923c.EnumC0599c.INTERFACE || aVarH.g() == C3923c.EnumC0599c.ANNOTATION_CLASS)))) {
                    h0 h0VarC2 = aVarH.c();
                    z zVar = h0VarC2 instanceof z ? (z) h0VarC2 : null;
                    if (zVar != null) {
                        return zVar.d();
                    }
                    return null;
                }
            }
            if (!(container instanceof N.b) || !(container.c() instanceof r)) {
                return null;
            }
            h0 h0VarC3 = container.c();
            C3862t.e(h0VarC3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            r rVar2 = (r) h0VarC3;
            x xVarG = rVar2.g();
            return xVarG == null ? w.b(kotlinClassFinder, rVar2.d(), jvmMetadataVersion) : xVarG;
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: jb.e$c */
    private static final class c {

        /* renamed from: B, reason: collision with root package name */
        public static final c f43611B = new c("PROPERTY", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final c f43612C = new c("BACKING_FIELD", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final c f43613D = new c("DELEGATE_FIELD", 2);

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ c[] f43614E;

        /* renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f43615F;

        static {
            c[] cVarArrC = c();
            f43614E = cVarArrC;
            f43615F = C4929b.a(cVarArrC);
        }

        private c(String str, int i10) {
        }

        private static final /* synthetic */ c[] c() {
            return new c[]{f43611B, f43612C, f43613D};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f43614E.clone();
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: jb.e$d */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43616a;

        static {
            int[] iArr = new int[EnumC0998d.values().length];
            try {
                iArr[EnumC0998d.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0998d.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0998d.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43616a = iArr;
        }
    }

    public AbstractC3771e(v kotlinClassFinder) {
        C3862t.g(kotlinClassFinder, "kotlinClassFinder");
        this.f43610a = kotlinClassFinder;
    }

    private final x A(N.a aVar) {
        h0 h0VarC = aVar.c();
        z zVar = h0VarC instanceof z ? (z) h0VarC : null;
        if (zVar != null) {
            return zVar.d();
        }
        return null;
    }

    private final int m(N n10, kotlin.reflect.jvm.internal.impl.protobuf.o oVar) {
        if (oVar instanceof C3929i) {
            if (!nb.f.g((C3929i) oVar)) {
                return 0;
            }
        } else if (oVar instanceof C3934n) {
            if (!nb.f.h((C3934n) oVar)) {
                return 0;
            }
        } else {
            if (!(oVar instanceof C3924d)) {
                throw new UnsupportedOperationException("Unsupported message: " + oVar.getClass());
            }
            C3862t.e(n10, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            N.a aVar = (N.a) n10;
            if (aVar.g() == C3923c.EnumC0599c.ENUM_CLASS) {
                return 2;
            }
            if (!aVar.i()) {
                return 0;
            }
        }
        return 1;
    }

    private final List<A> n(N n10, C3757A c3757a, boolean z10, boolean z11, Boolean bool, boolean z12) {
        x xVarP = p(n10, f43609b.a(n10, z10, z11, bool, z12, this.f43610a, u()));
        if (xVarP == null) {
            return kotlin.collections.r.m();
        }
        List<A> list = q(xVarP).a().get(c3757a);
        return list == null ? kotlin.collections.r.m() : list;
    }

    static /* synthetic */ List o(AbstractC3771e abstractC3771e, N n10, C3757A c3757a, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj == null) {
            return abstractC3771e.n(n10, c3757a, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? false : z12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public static /* synthetic */ C3757A t(AbstractC3771e abstractC3771e, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, InterfaceC4077c interfaceC4077c, nb.g gVar, EnumC0998d enumC0998d, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return abstractC3771e.s(oVar, interfaceC4077c, gVar, enumC0998d, z10);
    }

    private final List<A> z(N n10, C3934n c3934n, c cVar) {
        Boolean boolD = C4076b.f45798B.d(c3934n.b0());
        C3862t.f(boolD, "get(...)");
        boolD.booleanValue();
        boolean zF = pb.i.f(c3934n);
        if (cVar == c.f43611B) {
            C3757A c3757aB = C3772f.b(c3934n, n10.b(), n10.d(), false, true, false, 40, null);
            return c3757aB == null ? kotlin.collections.r.m() : o(this, n10, c3757aB, true, false, boolD, zF, 8, null);
        }
        C3757A c3757aB2 = C3772f.b(c3934n, n10.b(), n10.d(), true, false, false, 48, null);
        if (c3757aB2 == null) {
            return kotlin.collections.r.m();
        }
        return Ub.n.L(c3757aB2.a(), "$delegate", false, 2, null) != (cVar == c.f43613D) ? kotlin.collections.r.m() : n(n10, c3757aB2, true, true, boolD, zF);
    }

    @Override // Db.InterfaceC1002h
    public List<A> a(N container, C3927g proto) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        return o(this, container, C3757A.f43569b.a(container.b().getString(proto.G()), pb.b.b(((N.a) container).e().b())), false, false, null, false, 60, null);
    }

    @Override // Db.InterfaceC1002h
    public List<A> c(N container, kotlin.reflect.jvm.internal.impl.protobuf.o proto, EnumC0998d kind) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        C3862t.g(kind, "kind");
        C3757A c3757aT = t(this, proto, container.b(), container.d(), kind, false, 16, null);
        return c3757aT != null ? o(this, container, C3757A.f43569b.e(c3757aT, 0), false, false, null, false, 60, null) : kotlin.collections.r.m();
    }

    @Override // Db.InterfaceC1002h
    public List<A> d(N container, kotlin.reflect.jvm.internal.impl.protobuf.o callableProto, EnumC0998d kind, int i10, lb.u proto) {
        C3862t.g(container, "container");
        C3862t.g(callableProto, "callableProto");
        C3862t.g(kind, "kind");
        C3862t.g(proto, "proto");
        C3757A c3757aT = t(this, callableProto, container.b(), container.d(), kind, false, 16, null);
        if (c3757aT == null) {
            return kotlin.collections.r.m();
        }
        return o(this, container, C3757A.f43569b.e(c3757aT, i10 + m(container, callableProto)), false, false, null, false, 60, null);
    }

    @Override // Db.InterfaceC1002h
    public List<A> e(N.a container) {
        C3862t.g(container, "container");
        x xVarA = A(container);
        if (xVarA != null) {
            ArrayList arrayList = new ArrayList(1);
            xVarA.d(new C0561e(this, arrayList), r(xVarA));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
    }

    @Override // Db.InterfaceC1002h
    public List<A> f(N container, C3934n proto) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        return z(container, proto, c.f43612C);
    }

    @Override // Db.InterfaceC1002h
    public List<A> g(C3937q proto, InterfaceC4077c nameResolver) {
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        Object objV = proto.v(C4176a.f46661f);
        C3862t.f(objV, "getExtension(...)");
        Iterable<C3922b> iterable = (Iterable) objV;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(iterable, 10));
        for (C3922b c3922b : iterable) {
            C3862t.d(c3922b);
            arrayList.add(k(c3922b, nameResolver));
        }
        return arrayList;
    }

    @Override // Db.InterfaceC1002h
    public List<A> i(N container, C3934n proto) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        return z(container, proto, c.f43613D);
    }

    @Override // Db.InterfaceC1002h
    public List<A> j(C3939s proto, InterfaceC4077c nameResolver) {
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        Object objV = proto.v(C4176a.f46663h);
        C3862t.f(objV, "getExtension(...)");
        Iterable<C3922b> iterable = (Iterable) objV;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(iterable, 10));
        for (C3922b c3922b : iterable) {
            C3862t.d(c3922b);
            arrayList.add(k(c3922b, nameResolver));
        }
        return arrayList;
    }

    @Override // Db.InterfaceC1002h
    public abstract A k(C3922b c3922b, InterfaceC4077c interfaceC4077c);

    @Override // Db.InterfaceC1002h
    public List<A> l(N container, kotlin.reflect.jvm.internal.impl.protobuf.o proto, EnumC0998d kind) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        C3862t.g(kind, "kind");
        if (kind == EnumC0998d.PROPERTY) {
            return z(container, (C3934n) proto, c.f43611B);
        }
        C3757A c3757aT = t(this, proto, container.b(), container.d(), kind, false, 16, null);
        return c3757aT == null ? kotlin.collections.r.m() : o(this, container, c3757aT, false, false, null, false, 60, null);
    }

    protected final x p(N container, x xVar) {
        C3862t.g(container, "container");
        if (xVar != null) {
            return xVar;
        }
        if (container instanceof N.a) {
            return A((N.a) container);
        }
        return null;
    }

    protected abstract S q(x xVar);

    protected byte[] r(x kotlinClass) {
        C3862t.g(kotlinClass, "kotlinClass");
        return null;
    }

    protected final C3757A s(kotlin.reflect.jvm.internal.impl.protobuf.o proto, InterfaceC4077c nameResolver, nb.g typeTable, EnumC0998d kind, boolean z10) {
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        C3862t.g(kind, "kind");
        if (proto instanceof C3924d) {
            C3757A.a aVar = C3757A.f43569b;
            d.b bVarB = pb.i.f47746a.b((C3924d) proto, nameResolver, typeTable);
            if (bVarB == null) {
                return null;
            }
            return aVar.b(bVarB);
        }
        if (proto instanceof C3929i) {
            C3757A.a aVar2 = C3757A.f43569b;
            d.b bVarE = pb.i.f47746a.e((C3929i) proto, nameResolver, typeTable);
            if (bVarE == null) {
                return null;
            }
            return aVar2.b(bVarE);
        }
        if (!(proto instanceof C3934n)) {
            return null;
        }
        h.f<C3934n, C4176a.d> propertySignature = C4176a.f46659d;
        C3862t.f(propertySignature, "propertySignature");
        C4176a.d dVar = (C4176a.d) nb.e.a((h.d) proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        int i10 = d.f43616a[kind.ordinal()];
        if (i10 == 1) {
            if (!dVar.H()) {
                return null;
            }
            C3757A.a aVar3 = C3757A.f43569b;
            C4176a.c cVarC = dVar.C();
            C3862t.f(cVarC, "getGetter(...)");
            return aVar3.c(nameResolver, cVarC);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return C3772f.a((C3934n) proto, nameResolver, typeTable, true, true, z10);
        }
        if (!dVar.I()) {
            return null;
        }
        C3757A.a aVar4 = C3757A.f43569b;
        C4176a.c cVarD = dVar.D();
        C3862t.f(cVarD, "getSetter(...)");
        return aVar4.c(nameResolver, cVarD);
    }

    public abstract pb.e u();

    protected final v v() {
        return this.f43610a;
    }

    protected final boolean w(qb.b classId) {
        x xVarB;
        C3862t.g(classId, "classId");
        return classId.e() != null && C3862t.b(classId.h().j(), "Container") && (xVarB = w.b(this.f43610a, classId, u())) != null && Na.a.f12585a.c(xVarB);
    }

    protected abstract x.a x(qb.b bVar, h0 h0Var, List<A> list);

    protected final x.a y(qb.b annotationClassId, h0 source, List<A> result) {
        C3862t.g(annotationClassId, "annotationClassId");
        C3862t.g(source, "source");
        C3862t.g(result, "result");
        if (Na.a.f12585a.b().contains(annotationClassId)) {
            return null;
        }
        return x(annotationClassId, source, result);
    }

    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    /* renamed from: jb.e$e, reason: collision with other inner class name */
    public static final class C0561e implements x.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3771e<A, S> f43617a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<A> f43618b;

        C0561e(AbstractC3771e<A, S> abstractC3771e, ArrayList<A> arrayList) {
            this.f43617a = abstractC3771e;
            this.f43618b = arrayList;
        }

        @Override // jb.x.c
        public x.a c(qb.b classId, h0 source) {
            C3862t.g(classId, "classId");
            C3862t.g(source, "source");
            return this.f43617a.y(classId, source, this.f43618b);
        }

        @Override // jb.x.c
        public void a() {
        }
    }
}
