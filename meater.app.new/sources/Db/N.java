package Db;

import Ra.h0;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import lb.C3923c;
import nb.C4076b;
import nb.InterfaceC4077c;

/* compiled from: ProtoContainer.kt */
/* loaded from: classes3.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4077c f3622a;

    /* renamed from: b, reason: collision with root package name */
    private final nb.g f3623b;

    /* renamed from: c, reason: collision with root package name */
    private final h0 f3624c;

    /* compiled from: ProtoContainer.kt */
    public static final class a extends N {

        /* renamed from: d, reason: collision with root package name */
        private final C3923c f3625d;

        /* renamed from: e, reason: collision with root package name */
        private final a f3626e;

        /* renamed from: f, reason: collision with root package name */
        private final qb.b f3627f;

        /* renamed from: g, reason: collision with root package name */
        private final C3923c.EnumC0599c f3628g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f3629h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f3630i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3923c classProto, InterfaceC4077c nameResolver, nb.g typeTable, h0 h0Var, a aVar) {
            super(nameResolver, typeTable, h0Var, null);
            C3862t.g(classProto, "classProto");
            C3862t.g(nameResolver, "nameResolver");
            C3862t.g(typeTable, "typeTable");
            this.f3625d = classProto;
            this.f3626e = aVar;
            this.f3627f = L.a(nameResolver, classProto.G0());
            C3923c.EnumC0599c enumC0599cD = C4076b.f45818f.d(classProto.F0());
            this.f3628g = enumC0599cD == null ? C3923c.EnumC0599c.CLASS : enumC0599cD;
            Boolean boolD = C4076b.f45819g.d(classProto.F0());
            C3862t.f(boolD, "get(...)");
            this.f3629h = boolD.booleanValue();
            Boolean boolD2 = C4076b.f45820h.d(classProto.F0());
            C3862t.f(boolD2, "get(...)");
            this.f3630i = boolD2.booleanValue();
        }

        @Override // Db.N
        public qb.c a() {
            return this.f3627f.a();
        }

        public final qb.b e() {
            return this.f3627f;
        }

        public final C3923c f() {
            return this.f3625d;
        }

        public final C3923c.EnumC0599c g() {
            return this.f3628g;
        }

        public final a h() {
            return this.f3626e;
        }

        public final boolean i() {
            return this.f3629h;
        }
    }

    /* compiled from: ProtoContainer.kt */
    public static final class b extends N {

        /* renamed from: d, reason: collision with root package name */
        private final qb.c f3631d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qb.c fqName, InterfaceC4077c nameResolver, nb.g typeTable, h0 h0Var) {
            super(nameResolver, typeTable, h0Var, null);
            C3862t.g(fqName, "fqName");
            C3862t.g(nameResolver, "nameResolver");
            C3862t.g(typeTable, "typeTable");
            this.f3631d = fqName;
        }

        @Override // Db.N
        public qb.c a() {
            return this.f3631d;
        }
    }

    public /* synthetic */ N(InterfaceC4077c interfaceC4077c, nb.g gVar, h0 h0Var, C3854k c3854k) {
        this(interfaceC4077c, gVar, h0Var);
    }

    public abstract qb.c a();

    public final InterfaceC4077c b() {
        return this.f3622a;
    }

    public final h0 c() {
        return this.f3624c;
    }

    public final nb.g d() {
        return this.f3623b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    private N(InterfaceC4077c interfaceC4077c, nb.g gVar, h0 h0Var) {
        this.f3622a = interfaceC4077c;
        this.f3623b = gVar;
        this.f3624c = h0Var;
    }
}
