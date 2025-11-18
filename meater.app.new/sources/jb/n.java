package jb;

import Db.C1003i;
import Db.C1008n;
import Db.C1018y;
import Fb.M;
import Ra.InterfaceC1692e;
import Ra.N;
import java.util.Collection;
import java.util.Set;
import kb.C3816a;
import kotlin.collections.V;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import lb.C3923c;
import lb.C3932l;
import oa.C4170o;

/* compiled from: DeserializedDescriptorResolver.kt */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final a f43651b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Set<C3816a.EnumC0573a> f43652c = V.c(C3816a.EnumC0573a.f43848F);

    /* renamed from: d, reason: collision with root package name */
    private static final Set<C3816a.EnumC0573a> f43653d = V.g(C3816a.EnumC0573a.f43849G, C3816a.EnumC0573a.f43852J);

    /* renamed from: e, reason: collision with root package name */
    private static final pb.e f43654e = new pb.e(1, 1, 2);

    /* renamed from: f, reason: collision with root package name */
    private static final pb.e f43655f = new pb.e(1, 1, 11);

    /* renamed from: g, reason: collision with root package name */
    private static final pb.e f43656g = new pb.e(1, 1, 13);

    /* renamed from: a, reason: collision with root package name */
    public C1008n f43657a;

    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final pb.e a() {
            return n.f43656g;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection d() {
        return kotlin.collections.r.m();
    }

    private final Fb.r e(x xVar) {
        return f().g().b() ? Fb.r.f4676B : xVar.a().j() ? Fb.r.f4677C : Fb.r.f4676B;
    }

    private final C1018y<pb.e> g(x xVar) {
        if (i() || xVar.a().d().h(h())) {
            return null;
        }
        return new C1018y<>(xVar.a().d(), pb.e.f47733i, h(), h().k(xVar.a().d().j()), xVar.j(), xVar.c());
    }

    private final pb.e h() {
        return Rb.c.a(f().g());
    }

    private final boolean i() {
        return f().g().e();
    }

    private final boolean j(x xVar) {
        return !f().g().c() && xVar.a().i() && C3862t.b(xVar.a().d(), f43655f);
    }

    private final boolean k(x xVar) {
        return (f().g().f() && (xVar.a().i() || C3862t.b(xVar.a().d(), f43654e))) || j(xVar);
    }

    private final String[] m(x xVar, Set<? extends C3816a.EnumC0573a> set) {
        C3816a c3816aA = xVar.a();
        String[] strArrA = c3816aA.a();
        if (strArrA == null) {
            strArrA = c3816aA.b();
        }
        if (strArrA == null || !set.contains(c3816aA.c())) {
            return null;
        }
        return strArrA;
    }

    public final Ab.k c(N descriptor, x kotlinClass) {
        String[] strArrG;
        C4170o<pb.f, C3932l> c4170oM;
        C3862t.g(descriptor, "descriptor");
        C3862t.g(kotlinClass, "kotlinClass");
        String[] strArrM = m(kotlinClass, f43653d);
        if (strArrM == null || (strArrG = kotlinClass.a().g()) == null) {
            return null;
        }
        try {
            try {
                c4170oM = pb.i.m(strArrM, strArrG);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.j(), e10);
            }
        } catch (Throwable th) {
            if (i() || kotlinClass.a().d().h(h())) {
                throw th;
            }
            c4170oM = null;
        }
        if (c4170oM == null) {
            return null;
        }
        pb.f fVarA = c4170oM.a();
        C3932l c3932lB = c4170oM.b();
        r rVar = new r(kotlinClass, c3932lB, fVarA, g(kotlinClass), k(kotlinClass), e(kotlinClass));
        return new M(descriptor, c3932lB, fVarA, kotlinClass.a().d(), rVar, f(), "scope for " + rVar + " in " + descriptor, C3779m.f43650B);
    }

    public final C1008n f() {
        C1008n c1008n = this.f43657a;
        if (c1008n != null) {
            return c1008n;
        }
        C3862t.u("components");
        return null;
    }

    public final C1003i l(x kotlinClass) {
        String[] strArrG;
        C4170o<pb.f, C3923c> c4170oI;
        C3862t.g(kotlinClass, "kotlinClass");
        String[] strArrM = m(kotlinClass, f43652c);
        if (strArrM == null || (strArrG = kotlinClass.a().g()) == null) {
            return null;
        }
        try {
            try {
                c4170oI = pb.i.i(strArrM, strArrG);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.j(), e10);
            }
        } catch (Throwable th) {
            if (i() || kotlinClass.a().d().h(h())) {
                throw th;
            }
            c4170oI = null;
        }
        if (c4170oI == null) {
            return null;
        }
        return new C1003i(c4170oI.a(), c4170oI.b(), kotlinClass.a().d(), new z(kotlinClass, g(kotlinClass), k(kotlinClass), e(kotlinClass)));
    }

    public final InterfaceC1692e n(x kotlinClass) {
        C3862t.g(kotlinClass, "kotlinClass");
        C1003i c1003iL = l(kotlinClass);
        if (c1003iL == null) {
            return null;
        }
        return f().f().e(kotlinClass.c(), c1003iL);
    }

    public final void o(C1008n c1008n) {
        C3862t.g(c1008n, "<set-?>");
        this.f43657a = c1008n;
    }

    public final void p(C3777k components) {
        C3862t.g(components, "components");
        o(components.a());
    }
}
