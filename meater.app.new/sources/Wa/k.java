package Wa;

import Db.C1008n;
import Ra.H;
import jb.C3777k;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: RuntimeModuleData.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final a f18489c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C1008n f18490a;

    /* renamed from: b, reason: collision with root package name */
    private final Wa.a f18491b;

    /* compiled from: RuntimeModuleData.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final k a(ClassLoader classLoader) {
            C3862t.g(classLoader, "classLoader");
            g gVar = new g(classLoader);
            C3777k.a aVar = C3777k.f43646b;
            ClassLoader classLoader2 = C4153F.class.getClassLoader();
            C3862t.f(classLoader2, "getClassLoader(...)");
            C3777k.a.C0564a c0564aA = aVar.a(gVar, new g(classLoader2), new d(classLoader), "runtime module for " + classLoader, j.f18488b, l.f18492a);
            return new k(c0564aA.a().a(), new Wa.a(c0564aA.b(), gVar), null);
        }

        private a() {
        }
    }

    public /* synthetic */ k(C1008n c1008n, Wa.a aVar, C3854k c3854k) {
        this(c1008n, aVar);
    }

    public final C1008n a() {
        return this.f18490a;
    }

    public final H b() {
        return this.f18490a.q();
    }

    public final Wa.a c() {
        return this.f18491b;
    }

    private k(C1008n c1008n, Wa.a aVar) {
        this.f18490a = c1008n;
        this.f18491b = aVar;
    }
}
