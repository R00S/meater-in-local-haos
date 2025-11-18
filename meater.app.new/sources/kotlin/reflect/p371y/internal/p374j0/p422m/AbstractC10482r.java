package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.r */
/* loaded from: classes3.dex */
public abstract class AbstractC10482r implements InterfaceC10470f {

    /* renamed from: a */
    private final String f40482a;

    /* renamed from: b */
    private final Function1<AbstractC9914h, AbstractC10344e0> f40483b;

    /* renamed from: c */
    private final String f40484c;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.r$a */
    public static final class a extends AbstractC10482r {

        /* renamed from: d */
        public static final a f40485d = new a();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.f0.y.e.j0.m.r$a$a, reason: collision with other inner class name */
        static final class C11575a extends Lambda implements Function1<AbstractC9914h, AbstractC10344e0> {

            /* renamed from: f */
            public static final C11575a f40486f = new C11575a();

            C11575a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AbstractC10344e0 invoke(AbstractC9914h abstractC9914h) {
                C9801m.m32346f(abstractC9914h, "$this$null");
                AbstractC10368m0 abstractC10368m0M32796n = abstractC9914h.m32796n();
                C9801m.m32345e(abstractC10368m0M32796n, "booleanType");
                return abstractC10368m0M32796n;
            }
        }

        private a() {
            super("Boolean", C11575a.f40486f, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.r$b */
    public static final class b extends AbstractC10482r {

        /* renamed from: d */
        public static final b f40487d = new b();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.f0.y.e.j0.m.r$b$a */
        static final class a extends Lambda implements Function1<AbstractC9914h, AbstractC10344e0> {

            /* renamed from: f */
            public static final a f40488f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AbstractC10344e0 invoke(AbstractC9914h abstractC9914h) {
                C9801m.m32346f(abstractC9914h, "$this$null");
                AbstractC10368m0 abstractC10368m0M32768D = abstractC9914h.m32768D();
                C9801m.m32345e(abstractC10368m0M32768D, "intType");
                return abstractC10368m0M32768D;
            }
        }

        private b() {
            super("Int", a.f40488f, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.r$c */
    public static final class c extends AbstractC10482r {

        /* renamed from: d */
        public static final c f40489d = new c();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.f0.y.e.j0.m.r$c$a */
        static final class a extends Lambda implements Function1<AbstractC9914h, AbstractC10344e0> {

            /* renamed from: f */
            public static final a f40490f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AbstractC10344e0 invoke(AbstractC9914h abstractC9914h) {
                C9801m.m32346f(abstractC9914h, "$this$null");
                AbstractC10368m0 abstractC10368m0M32787Z = abstractC9914h.m32787Z();
                C9801m.m32345e(abstractC10368m0M32787Z, "unitType");
                return abstractC10368m0M32787Z;
            }
        }

        private c() {
            super("Unit", a.f40490f, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC10482r(String str, Function1<? super AbstractC9914h, ? extends AbstractC10344e0> function1) {
        this.f40482a = str;
        this.f40483b = function1;
        this.f40484c = "must return " + str;
    }

    public /* synthetic */ AbstractC10482r(String str, Function1 function1, C9789g c9789g) {
        this(str, function1);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
    /* renamed from: a */
    public String mo37194a(InterfaceC10738y interfaceC10738y) {
        return InterfaceC10470f.a.m37196a(this, interfaceC10738y);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
    /* renamed from: b */
    public boolean mo37195b(InterfaceC10738y interfaceC10738y) {
        C9801m.m32346f(interfaceC10738y, "functionDescriptor");
        return C9801m.m32341a(interfaceC10738y.getReturnType(), this.f40483b.invoke(C10235a.m36072f(interfaceC10738y)));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
    public String getDescription() {
        return this.f40484c;
    }
}
