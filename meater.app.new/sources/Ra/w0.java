package Ra;

import java.util.Map;
import kotlin.jvm.internal.C3862t;

/* compiled from: Visibilities.kt */
/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f15184a = new w0();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<x0, Integer> f15185b;

    /* renamed from: c, reason: collision with root package name */
    private static final h f15186c;

    /* compiled from: Visibilities.kt */
    public static final class a extends x0 {

        /* renamed from: c, reason: collision with root package name */
        public static final a f15187c = new a();

        private a() {
            super("inherited", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class b extends x0 {

        /* renamed from: c, reason: collision with root package name */
        public static final b f15188c = new b();

        private b() {
            super("internal", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class c extends x0 {

        /* renamed from: c, reason: collision with root package name */
        public static final c f15189c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class d extends x0 {

        /* renamed from: c, reason: collision with root package name */
        public static final d f15190c = new d();

        private d() {
            super("local", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class e extends x0 {

        /* renamed from: c, reason: collision with root package name */
        public static final e f15191c = new e();

        private e() {
            super("private", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class f extends x0 {

        /* renamed from: c, reason: collision with root package name */
        public static final f f15192c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // Ra.x0
        public String b() {
            return "private/*private to this*/";
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class g extends x0 {

        /* renamed from: c, reason: collision with root package name */
        public static final g f15193c = new g();

        private g() {
            super("protected", true);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class h extends x0 {

        /* renamed from: c, reason: collision with root package name */
        public static final h f15194c = new h();

        private h() {
            super("public", true);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class i extends x0 {

        /* renamed from: c, reason: collision with root package name */
        public static final i f15195c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map mapC = kotlin.collections.M.c();
        mapC.put(f.f15192c, 0);
        mapC.put(e.f15191c, 0);
        mapC.put(b.f15188c, 1);
        mapC.put(g.f15193c, 1);
        h hVar = h.f15194c;
        mapC.put(hVar, 2);
        f15185b = kotlin.collections.M.b(mapC);
        f15186c = hVar;
    }

    private w0() {
    }

    public final Integer a(x0 first, x0 second) {
        C3862t.g(first, "first");
        C3862t.g(second, "second");
        if (first == second) {
            return 0;
        }
        Map<x0, Integer> map = f15185b;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num == null || num2 == null || C3862t.b(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(x0 visibility) {
        C3862t.g(visibility, "visibility");
        return visibility == e.f15191c || visibility == f.f15192c;
    }
}
