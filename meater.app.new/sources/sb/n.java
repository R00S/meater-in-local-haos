package sb;

import Hb.E0;
import Hb.U;
import Ra.EnumC1693f;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1696i;
import Ra.InterfaceC1700m;
import Ra.l0;
import Ra.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.V;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import sb.InterfaceC4523b;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f49589a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f49590b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f49591c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f49592d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f49593e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f49594f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f49595g;

    /* renamed from: h, reason: collision with root package name */
    public static final n f49596h;

    /* renamed from: i, reason: collision with root package name */
    public static final n f49597i;

    /* renamed from: j, reason: collision with root package name */
    public static final n f49598j;

    /* renamed from: k, reason: collision with root package name */
    public static final n f49599k;

    /* renamed from: l, reason: collision with root package name */
    public static final n f49600l;

    /* compiled from: DescriptorRenderer.kt */
    public static final class a {

        /* compiled from: DescriptorRenderer.kt */
        /* renamed from: sb.n$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0701a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f49601a;

            static {
                int[] iArr = new int[EnumC1693f.values().length];
                try {
                    iArr[EnumC1693f.f15143C.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1693f.f15144D.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC1693f.f15145E.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC1693f.f15148H.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC1693f.f15147G.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC1693f.f15146F.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f49601a = iArr;
            }
        }

        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final String a(InterfaceC1696i classifier) {
            C3862t.g(classifier, "classifier");
            if (classifier instanceof l0) {
                return "typealias";
            }
            if (!(classifier instanceof InterfaceC1692e)) {
                throw new AssertionError("Unexpected classifier: " + classifier);
            }
            InterfaceC1692e interfaceC1692e = (InterfaceC1692e) classifier;
            if (interfaceC1692e.y()) {
                return "companion object";
            }
            switch (C0701a.f49601a[interfaceC1692e.i().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final n b(Ba.l<? super w, C4153F> changeOptions) {
            C3862t.g(changeOptions, "changeOptions");
            z zVar = new z();
            changeOptions.invoke(zVar);
            zVar.q0();
            return new u(zVar);
        }

        private a() {
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    public interface b {

        /* compiled from: DescriptorRenderer.kt */
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f49602a = new a();

            private a() {
            }

            @Override // sb.n.b
            public void a(t0 parameter, int i10, int i11, StringBuilder builder) {
                C3862t.g(parameter, "parameter");
                C3862t.g(builder, "builder");
                if (i10 != i11 - 1) {
                    builder.append(", ");
                }
            }

            @Override // sb.n.b
            public void b(int i10, StringBuilder builder) {
                C3862t.g(builder, "builder");
                builder.append("(");
            }

            @Override // sb.n.b
            public void c(t0 parameter, int i10, int i11, StringBuilder builder) {
                C3862t.g(parameter, "parameter");
                C3862t.g(builder, "builder");
            }

            @Override // sb.n.b
            public void d(int i10, StringBuilder builder) {
                C3862t.g(builder, "builder");
                builder.append(")");
            }
        }

        void a(t0 t0Var, int i10, int i11, StringBuilder sb2);

        void b(int i10, StringBuilder sb2);

        void c(t0 t0Var, int i10, int i11, StringBuilder sb2);

        void d(int i10, StringBuilder sb2);
    }

    static {
        a aVar = new a(null);
        f49589a = aVar;
        f49590b = aVar.b(C4524c.f49578B);
        f49591c = aVar.b(C4526e.f49580B);
        f49592d = aVar.b(C4527f.f49581B);
        f49593e = aVar.b(C4528g.f49582B);
        f49594f = aVar.b(h.f49583B);
        f49595g = aVar.b(i.f49584B);
        f49596h = aVar.b(j.f49585B);
        f49597i = aVar.b(k.f49586B);
        f49598j = aVar.b(l.f49587B);
        f49599k = aVar.b(m.f49588B);
        f49600l = aVar.b(C4525d.f49579B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F A(w withOptions) {
        C3862t.g(withOptions, "$this$withOptions");
        withOptions.f(false);
        withOptions.e(V.d());
        withOptions.m(InterfaceC4523b.C0700b.f49576a);
        withOptions.r(true);
        withOptions.h(D.f49556D);
        withOptions.l(true);
        withOptions.k(true);
        withOptions.i(true);
        withOptions.d(true);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F B(w withOptions) {
        C3862t.g(withOptions, "$this$withOptions");
        withOptions.m(InterfaceC4523b.C0700b.f49576a);
        withOptions.h(D.f49555C);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F C(w withOptions) {
        C3862t.g(withOptions, "$this$withOptions");
        withOptions.e(V.d());
        return C4153F.f46609a;
    }

    public static /* synthetic */ String Q(n nVar, Sa.c cVar, Sa.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        return nVar.P(cVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F s(w withOptions) {
        C3862t.g(withOptions, "$this$withOptions");
        withOptions.f(false);
        withOptions.e(V.d());
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F t(w withOptions) {
        C3862t.g(withOptions, "$this$withOptions");
        withOptions.f(false);
        withOptions.e(V.d());
        withOptions.i(true);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F u(w withOptions) {
        C3862t.g(withOptions, "$this$withOptions");
        withOptions.f(false);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F v(w withOptions) {
        C3862t.g(withOptions, "$this$withOptions");
        withOptions.e(V.d());
        withOptions.m(InterfaceC4523b.C0700b.f49576a);
        withOptions.h(D.f49555C);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F w(w withOptions) {
        C3862t.g(withOptions, "$this$withOptions");
        withOptions.j(true);
        withOptions.m(InterfaceC4523b.a.f49575a);
        withOptions.e(v.f49617E);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F x(w withOptions) {
        C3862t.g(withOptions, "$this$withOptions");
        withOptions.e(v.f49616D);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F y(w withOptions) {
        C3862t.g(withOptions, "$this$withOptions");
        withOptions.e(v.f49617E);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F z(w withOptions) {
        C3862t.g(withOptions, "$this$withOptions");
        withOptions.a(F.f49565C);
        withOptions.e(v.f49617E);
        return C4153F.f46609a;
    }

    public abstract String O(InterfaceC1700m interfaceC1700m);

    public abstract String P(Sa.c cVar, Sa.e eVar);

    public abstract String R(String str, String str2, Oa.j jVar);

    public abstract String S(qb.d dVar);

    public abstract String T(qb.f fVar, boolean z10);

    public abstract String U(U u10);

    public abstract String V(E0 e02);

    public final n W(Ba.l<? super w, C4153F> changeOptions) {
        C3862t.g(changeOptions, "changeOptions");
        C3862t.e(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        z zVarU = ((u) this).K0().u();
        changeOptions.invoke(zVarU);
        zVarU.q0();
        return new u(zVarU);
    }
}
