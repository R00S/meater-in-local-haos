package vb;

import Hb.AbstractC1082f0;
import Hb.E0;
import Hb.G0;
import Hb.Q0;
import Hb.U;
import Hb.X;
import Hb.Y;
import Hb.u0;
import Oa.p;
import Ra.C1711y;
import Ra.H;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.m0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import qb.b;
import xb.C5087e;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class t extends AbstractC4943g<b> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f51622b = new a(null);

    /* compiled from: constantValues.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final AbstractC4943g<?> a(U argumentType) {
            C3862t.g(argumentType, "argumentType");
            if (Y.a(argumentType)) {
                return null;
            }
            U uA = argumentType;
            int i10 = 0;
            while (Oa.j.c0(uA)) {
                uA = ((E0) kotlin.collections.r.J0(uA.M0())).a();
                i10++;
            }
            InterfaceC1695h interfaceC1695hT = uA.O0().t();
            if (interfaceC1695hT instanceof InterfaceC1692e) {
                qb.b bVarN = C5087e.n(interfaceC1695hT);
                return bVarN == null ? new t(new b.a(argumentType)) : new t(bVarN, i10);
            }
            if (!(interfaceC1695hT instanceof m0)) {
                return null;
            }
            b.a aVar = qb.b.f48178d;
            qb.c cVarL = p.a.f13443b.l();
            C3862t.f(cVarL, "toSafe(...)");
            return new t(aVar.c(cVarL), 0);
        }

        private a() {
        }
    }

    /* compiled from: constantValues.kt */
    public static abstract class b {

        /* compiled from: constantValues.kt */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final U f51623a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(U type) {
                super(null);
                C3862t.g(type, "type");
                this.f51623a = type;
            }

            public final U a() {
                return this.f51623a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C3862t.b(this.f51623a, ((a) obj).f51623a);
            }

            public int hashCode() {
                return this.f51623a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f51623a + ')';
            }
        }

        /* compiled from: constantValues.kt */
        /* renamed from: vb.t$b$b, reason: collision with other inner class name */
        public static final class C0741b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C4942f f51624a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0741b(C4942f value) {
                super(null);
                C3862t.g(value, "value");
                this.f51624a = value;
            }

            public final int a() {
                return this.f51624a.c();
            }

            public final qb.b b() {
                return this.f51624a.d();
            }

            public final C4942f c() {
                return this.f51624a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0741b) && C3862t.b(this.f51624a, ((C0741b) obj).f51624a);
            }

            public int hashCode() {
                return this.f51624a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f51624a + ')';
            }
        }

        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b value) {
        super(value);
        C3862t.g(value, "value");
    }

    @Override // vb.AbstractC4943g
    public U a(H module) {
        C3862t.g(module, "module");
        u0 u0VarJ = u0.f5791C.j();
        InterfaceC1692e interfaceC1692eE = module.q().E();
        C3862t.f(interfaceC1692eE, "getKClass(...)");
        return X.h(u0VarJ, interfaceC1692eE, kotlin.collections.r.e(new G0(c(module))));
    }

    public final U c(H module) {
        C3862t.g(module, "module");
        b bVarB = b();
        if (bVarB instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(bVarB instanceof b.C0741b)) {
            throw new NoWhenBranchMatchedException();
        }
        C4942f c4942fC = ((b.C0741b) b()).c();
        qb.b bVarA = c4942fC.a();
        int iB = c4942fC.b();
        InterfaceC1692e interfaceC1692eB = C1711y.b(module, bVarA);
        if (interfaceC1692eB == null) {
            return Jb.l.d(Jb.k.f7716I, bVarA.toString(), String.valueOf(iB));
        }
        AbstractC1082f0 abstractC1082f0U = interfaceC1692eB.u();
        C3862t.f(abstractC1082f0U, "getDefaultType(...)");
        U uD = Mb.d.D(abstractC1082f0U);
        for (int i10 = 0; i10 < iB; i10++) {
            uD = module.q().l(Q0.f5693F, uD);
        }
        return uD;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(C4942f value) {
        this(new b.C0741b(value));
        C3862t.g(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(qb.b classId, int i10) {
        this(new C4942f(classId, i10));
        C3862t.g(classId, "classId");
    }
}
