package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.List;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10813s;
import kotlin.collections.C10815t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.C10601j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10736x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9941d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10386s0;
import kotlin.reflect.p371y.internal.p374j0.p422m.p423u.C10485a;

/* compiled from: ReflectionTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.b.j */
/* loaded from: classes2.dex */
public final class C9916j {

    /* renamed from: c */
    private final C10601j0 f37488c;

    /* renamed from: d */
    private final Lazy f37489d;

    /* renamed from: e */
    private final a f37490e;

    /* renamed from: f */
    private final a f37491f;

    /* renamed from: g */
    private final a f37492g;

    /* renamed from: h */
    private final a f37493h;

    /* renamed from: i */
    private final a f37494i;

    /* renamed from: j */
    private final a f37495j;

    /* renamed from: k */
    private final a f37496k;

    /* renamed from: l */
    private final a f37497l;

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f37487b = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9916j.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9916j.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9916j.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9916j.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9916j.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9916j.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9916j.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9916j.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: a */
    public static final b f37486a = new b(null);

    /* compiled from: ReflectionTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.j$a */
    private static final class a {

        /* renamed from: a */
        private final int f37498a;

        public a(int i2) {
            this.f37498a = i2;
        }

        /* renamed from: a */
        public final InterfaceC10585e m32823a(C9916j c9916j, KProperty<?> kProperty) {
            C9801m.m32346f(c9916j, "types");
            C9801m.m32346f(kProperty, "property");
            return c9916j.m32820b(C10485a.m37224a(kProperty.getF40571m()), this.f37498a);
        }
    }

    /* compiled from: ReflectionTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.j$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10344e0 m32824a(InterfaceC10592g0 interfaceC10592g0) {
            C9801m.m32346f(interfaceC10592g0, "module");
            InterfaceC10585e interfaceC10585eM38149a = C10736x.m38149a(interfaceC10592g0, C9917k.a.f37597s0);
            if (interfaceC10585eM38149a == null) {
                return null;
            }
            C10333a1 c10333a1M36577h = C10333a1.f40041g.m36577h();
            List<InterfaceC10587e1> parameters = interfaceC10585eM38149a.mo32877h().getParameters();
            C9801m.m32345e(parameters, "kPropertyClass.typeConstructor.parameters");
            Object objM38866s0 = C10813s.m38866s0(parameters);
            C9801m.m32345e(objM38866s0, "kPropertyClass.typeConstructor.parameters.single()");
            return C10347f0.m36667g(c10333a1M36577h, interfaceC10585eM38149a, C10815t.m38883e(new C10386s0((InterfaceC10587e1) objM38866s0)));
        }
    }

    /* compiled from: ReflectionTypes.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.j$c */
    static final class c extends Lambda implements Function0<InterfaceC10251h> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10592g0 f37499f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC10592g0 interfaceC10592g0) {
            super(0);
            this.f37499f = interfaceC10592g0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10251h invoke() {
            return this.f37499f.mo37018N(C9917k.f37514o).mo37751q();
        }
    }

    public C9916j(InterfaceC10592g0 interfaceC10592g0, C10601j0 c10601j0) {
        C9801m.m32346f(interfaceC10592g0, "module");
        C9801m.m32346f(c10601j0, "notFoundClasses");
        this.f37488c = c10601j0;
        this.f37489d = C10550i.m37593a(LazyThreadSafetyMode.PUBLICATION, new c(interfaceC10592g0));
        this.f37490e = new a(1);
        this.f37491f = new a(1);
        this.f37492g = new a(1);
        this.f37493h = new a(2);
        this.f37494i = new a(3);
        this.f37495j = new a(1);
        this.f37496k = new a(2);
        this.f37497l = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final InterfaceC10585e m32820b(String str, int i2) {
        C10163f c10163fM35454x = C10163f.m35454x(str);
        C9801m.m32345e(c10163fM35454x, "identifier(className)");
        InterfaceC10594h interfaceC10594hMo33316f = m32821d().mo33316f(c10163fM35454x, EnumC9941d.FROM_REFLECTION);
        InterfaceC10585e interfaceC10585e = interfaceC10594hMo33316f instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10594hMo33316f : null;
        return interfaceC10585e == null ? this.f37488c.m37703d(new C10159b(C9917k.f37514o, c10163fM35454x), C10815t.m38883e(Integer.valueOf(i2))) : interfaceC10585e;
    }

    /* renamed from: d */
    private final InterfaceC10251h m32821d() {
        return (InterfaceC10251h) this.f37489d.getValue();
    }

    /* renamed from: c */
    public final InterfaceC10585e m32822c() {
        return this.f37490e.m32823a(this, f37487b[0]);
    }
}
