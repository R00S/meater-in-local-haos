package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import kotlin.C10775u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10089e;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10301k;

/* compiled from: RuntimeModuleData.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.k */
/* loaded from: classes2.dex */
public final class C10694k {

    /* renamed from: a */
    public static final a f41150a = new a(null);

    /* renamed from: b */
    private final C10301k f41151b;

    /* renamed from: c */
    private final C10684a f41152c;

    /* compiled from: RuntimeModuleData.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.k$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10694k m38034a(ClassLoader classLoader) {
            C9801m.m32346f(classLoader, "classLoader");
            C10690g c10690g = new C10690g(classLoader);
            C10089e.a aVar = C10089e.f38441a;
            ClassLoader classLoader2 = C10775u.class.getClassLoader();
            C9801m.m32345e(classLoader2, "Unit::class.java.classLoader");
            C10089e.a.C11550a c11550aM33957a = aVar.m33957a(c10690g, new C10690g(classLoader2), new C10687d(classLoader), "runtime module for " + classLoader, C10693j.f41149b, C10695l.f41153a);
            return new C10694k(c11550aM33957a.m33958a().m33956a(), new C10684a(c11550aM33957a.m33959b(), c10690g), null);
        }
    }

    private C10694k(C10301k c10301k, C10684a c10684a) {
        this.f41151b = c10301k;
        this.f41152c = c10684a;
    }

    public /* synthetic */ C10694k(C10301k c10301k, C10684a c10684a, C9789g c9789g) {
        this(c10301k, c10684a);
    }

    /* renamed from: a */
    public final C10301k m38031a() {
        return this.f41151b;
    }

    /* renamed from: b */
    public final InterfaceC10592g0 m38032b() {
        return this.f41151b.m36431p();
    }

    /* renamed from: c */
    public final C10684a m38033c() {
        return this.f41152c;
    }
}
