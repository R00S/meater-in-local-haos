package Pa;

import Oa.p;
import kotlin.jvm.internal.C3862t;

/* compiled from: FunctionTypeKind.kt */
/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private final qb.c f14161a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14162b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14163c;

    /* renamed from: d, reason: collision with root package name */
    private final qb.b f14164d;

    /* compiled from: FunctionTypeKind.kt */
    public static final class a extends f {

        /* renamed from: e, reason: collision with root package name */
        public static final a f14165e = new a();

        private a() {
            super(p.f13366A, "Function", false, null);
        }
    }

    /* compiled from: FunctionTypeKind.kt */
    public static final class b extends f {

        /* renamed from: e, reason: collision with root package name */
        public static final b f14166e = new b();

        private b() {
            super(p.f13397x, "KFunction", true, null);
        }
    }

    /* compiled from: FunctionTypeKind.kt */
    public static final class c extends f {

        /* renamed from: e, reason: collision with root package name */
        public static final c f14167e = new c();

        private c() {
            super(p.f13397x, "KSuspendFunction", true, null);
        }
    }

    /* compiled from: FunctionTypeKind.kt */
    public static final class d extends f {

        /* renamed from: e, reason: collision with root package name */
        public static final d f14168e = new d();

        private d() {
            super(p.f13392s, "SuspendFunction", false, null);
        }
    }

    public f(qb.c packageFqName, String classNamePrefix, boolean z10, qb.b bVar) {
        C3862t.g(packageFqName, "packageFqName");
        C3862t.g(classNamePrefix, "classNamePrefix");
        this.f14161a = packageFqName;
        this.f14162b = classNamePrefix;
        this.f14163c = z10;
        this.f14164d = bVar;
    }

    public final String a() {
        return this.f14162b;
    }

    public final qb.c b() {
        return this.f14161a;
    }

    public final qb.f c(int i10) {
        qb.f fVarT = qb.f.t(this.f14162b + i10);
        C3862t.f(fVarT, "identifier(...)");
        return fVarT;
    }

    public String toString() {
        return this.f14161a + '.' + this.f14162b + 'N';
    }
}
