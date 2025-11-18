package ib;

import ib.f0;
import java.util.Map;
import jb.C3762F;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import yb.EnumC5149e;

/* compiled from: predefinedEnhancementInfo.kt */
/* renamed from: ib.X, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3664X {

    /* renamed from: a, reason: collision with root package name */
    private static final C3674h f43216a = new C3674h(EnumC3677k.f43278C, null, false, false, 8, null);

    /* renamed from: b, reason: collision with root package name */
    private static final C3674h f43217b;

    /* renamed from: c, reason: collision with root package name */
    private static final C3674h f43218c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, C3665Y> f43219d;

    static {
        EnumC3677k enumC3677k = EnumC3677k.f43279D;
        f43217b = new C3674h(enumC3677k, null, false, false, 8, null);
        f43218c = new C3674h(enumC3677k, null, true, false, 8, null);
        C3762F c3762f = C3762F.f43573a;
        String strH = c3762f.h("Object");
        String strG = c3762f.g("Predicate");
        String strG2 = c3762f.g("Function");
        String strG3 = c3762f.g("Consumer");
        String strG4 = c3762f.g("BiFunction");
        String strG5 = c3762f.g("BiConsumer");
        String strG6 = c3762f.g("UnaryOperator");
        String strI = c3762f.i("stream/Stream");
        String strI2 = c3762f.i("Optional");
        f0 f0Var = new f0();
        f0.a.b(new f0.a(f0Var, c3762f.i("Iterator")), "forEachRemaining", null, new C3679m(strG3), 2, null);
        f0.a.b(new f0.a(f0Var, c3762f.h("Iterable")), "spliterator", null, new C3690x(c3762f), 2, null);
        f0.a aVar = new f0.a(f0Var, c3762f.i("Collection"));
        f0.a.b(aVar, "removeIf", null, new C3650I(strG), 2, null);
        f0.a.b(aVar, "stream", null, new C3657P(strI), 2, null);
        f0.a.b(aVar, "parallelStream", null, new C3658Q(strI), 2, null);
        f0.a aVar2 = new f0.a(f0Var, c3762f.i("List"));
        f0.a.b(aVar2, "replaceAll", null, new C3659S(strG6), 2, null);
        aVar2.a("addFirst", "2.1", new C3660T(strH));
        aVar2.a("addLast", "2.1", new C3661U(strH));
        aVar2.a("removeFirst", "2.1", new C3662V(strH));
        aVar2.a("removeLast", "2.1", new C3663W(strH));
        f0.a aVar3 = new f0.a(f0Var, c3762f.i("LinkedList"));
        aVar3.a("addFirst", "2.1", new C3680n(strH));
        aVar3.a("addLast", "2.1", new C3681o(strH));
        aVar3.a("removeFirst", "2.1", new C3682p(strH));
        aVar3.a("removeLast", "2.1", new C3683q(strH));
        f0.a aVar4 = new f0.a(f0Var, c3762f.i("Map"));
        f0.a.b(aVar4, "forEach", null, new C3684r(strG5), 2, null);
        f0.a.b(aVar4, "putIfAbsent", null, new C3685s(strH), 2, null);
        f0.a.b(aVar4, "replace", null, new C3686t(strH), 2, null);
        f0.a.b(aVar4, "replace", null, new C3687u(strH), 2, null);
        f0.a.b(aVar4, "replaceAll", null, new C3688v(strG4), 2, null);
        f0.a.b(aVar4, "compute", null, new C3689w(strH, strG4), 2, null);
        f0.a.b(aVar4, "computeIfAbsent", null, new C3691y(strH, strG2), 2, null);
        f0.a.b(aVar4, "computeIfPresent", null, new C3692z(strH, strG4), 2, null);
        f0.a.b(aVar4, "merge", null, new C3642A(strH, strG4), 2, null);
        f0.a aVar5 = new f0.a(f0Var, strI2);
        f0.a.b(aVar5, "empty", null, new C3643B(strI2), 2, null);
        f0.a.b(aVar5, "of", null, new C3644C(strH, strI2), 2, null);
        f0.a.b(aVar5, "ofNullable", null, new C3645D(strH, strI2), 2, null);
        f0.a.b(aVar5, "get", null, new C3646E(strH), 2, null);
        f0.a.b(aVar5, "ifPresent", null, new C3647F(strG3), 2, null);
        f0.a.b(new f0.a(f0Var, c3762f.h("ref/Reference")), "get", null, new C3648G(strH), 2, null);
        f0.a.b(new f0.a(f0Var, strG), "test", null, new C3649H(strH), 2, null);
        f0.a.b(new f0.a(f0Var, c3762f.g("BiPredicate")), "test", null, new C3651J(strH), 2, null);
        f0.a.b(new f0.a(f0Var, strG3), "accept", null, new C3652K(strH), 2, null);
        f0.a.b(new f0.a(f0Var, strG5), "accept", null, new C3653L(strH), 2, null);
        f0.a.b(new f0.a(f0Var, strG2), "apply", null, new C3654M(strH), 2, null);
        f0.a.b(new f0.a(f0Var, strG4), "apply", null, new C3655N(strH), 2, null);
        f0.a.b(new f0.a(f0Var, c3762f.g("Supplier")), "get", null, new C3656O(strH), 2, null);
        f43219d = f0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F A(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.b(str, f43217b);
        function.d(EnumC5149e.BOOLEAN);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F B(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h);
        function.b(str, c3674h);
        function.d(EnumC5149e.BOOLEAN);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F C(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.b(str, f43217b);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F D(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h);
        function.b(str, c3674h);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F E(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h);
        function.c(str, c3674h);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F F(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h);
        function.b(str, c3674h);
        function.c(str, c3674h);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F G(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.c(str, f43217b);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F H(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h, c3674h);
        function.d(EnumC5149e.BOOLEAN);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F I(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.c(str, c3674h, c3674h);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F J(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.c(str, c3674h, c3674h);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F a(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h, c3674h);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F b(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.b(str, f43217b);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F c(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.c(str, f43217b);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F d(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.c(str, f43217b);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F e(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h, c3674h);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F f(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.b(str, f43217b);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F g(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.b(str, f43217b);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F h(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.b(str, f43217b);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F i(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.c(str, f43217b);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F j(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.c(str, f43217b);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F k(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h, c3674h, c3674h);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F l(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h);
        function.b(str, c3674h);
        function.c(str, f43216a);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F m(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h);
        function.b(str, c3674h);
        function.c(str, f43216a);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F n(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h);
        function.b(str, c3674h);
        function.b(str, c3674h);
        function.d(EnumC5149e.BOOLEAN);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F o(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h, c3674h, c3674h, c3674h);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F p(String str, String str2, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h);
        C3674h c3674h2 = f43216a;
        function.b(str2, c3674h, c3674h, c3674h2, c3674h2);
        function.c(str, c3674h2);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F q(String str, String str2, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h);
        function.b(str2, c3674h, c3674h, c3674h);
        function.c(str, c3674h);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F r(String str, String str2, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h);
        C3674h c3674h2 = f43218c;
        C3674h c3674h3 = f43216a;
        function.b(str2, c3674h, c3674h, c3674h2, c3674h3);
        function.c(str, c3674h3);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F s(String str, String str2, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43217b;
        function.b(str, c3674h);
        C3674h c3674h2 = f43218c;
        function.b(str, c3674h2);
        C3674h c3674h3 = f43216a;
        function.b(str2, c3674h, c3674h2, c3674h2, c3674h3);
        function.c(str, c3674h3);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F t(C3762F c3762f, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        String strI = c3762f.i("Spliterator");
        C3674h c3674h = f43217b;
        function.c(strI, c3674h, c3674h);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F u(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.c(str, f43217b, f43218c);
        return C4153F.f46609a;
    }

    public static final Map<String, C3665Y> u0() {
        return f43219d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F v(String str, String str2, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        C3674h c3674h = f43218c;
        function.b(str, c3674h);
        function.c(str2, f43217b, c3674h);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F w(String str, String str2, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.b(str, f43216a);
        function.c(str2, f43217b, f43218c);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F x(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.c(str, f43218c);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F y(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.b(str, f43217b, f43218c);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F z(String str, f0.a.C0551a function) {
        C3862t.g(function, "$this$function");
        function.c(str, f43216a);
        return C4153F.f46609a;
    }
}
