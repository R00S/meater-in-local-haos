package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C10813s;
import kotlin.collections.C10815t;
import kotlin.collections.C10820v0;
import kotlin.collections.C10822w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10651h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p375b.InterfaceC9908b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.e */
/* loaded from: classes2.dex */
public final class C9931e implements InterfaceC10631b {

    /* renamed from: d */
    private static final C10163f f37691d;

    /* renamed from: e */
    private static final C10159b f37692e;

    /* renamed from: f */
    private final InterfaceC10592g0 f37693f;

    /* renamed from: g */
    private final Function1<InterfaceC10592g0, InterfaceC10609m> f37694g;

    /* renamed from: h */
    private final InterfaceC10325i f37695h;

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f37689b = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9931e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: a */
    public static final b f37688a = new b(null);

    /* renamed from: c */
    private static final C10160c f37690c = C9917k.f37517r;

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.e$a */
    static final class a extends Lambda implements Function1<InterfaceC10592g0, InterfaceC9908b> {

        /* renamed from: f */
        public static final a f37696f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC9908b invoke(InterfaceC10592g0 interfaceC10592g0) {
            C9801m.m32346f(interfaceC10592g0, "module");
            List<InterfaceC10604k0> listMo37749I = interfaceC10592g0.mo37018N(C9931e.f37690c).mo37749I();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo37749I) {
                if (obj instanceof InterfaceC9908b) {
                    arrayList.add(obj);
                }
            }
            return (InterfaceC9908b) C10813s.m38830U(arrayList);
        }
    }

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.e$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10159b m32950a() {
            return C9931e.f37692e;
        }
    }

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.e$c */
    static final class c extends Lambda implements Function0<C10651h> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10330n f37698g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC10330n interfaceC10330n) {
            super(0);
            this.f37698g = interfaceC10330n;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10651h invoke() {
            C10651h c10651h = new C10651h((InterfaceC10609m) C9931e.this.f37694g.invoke(C9931e.this.f37693f), C9931e.f37691d, EnumC10583d0.ABSTRACT, EnumC10588f.INTERFACE, C10815t.m38883e(C9931e.this.f37693f.mo37021o().m32791i()), InterfaceC10741z0.f41247a, false, this.f37698g);
            c10651h.m37854L0(new C9927a(this.f37698g, c10651h), C10822w0.m38917d(), null);
            return c10651h;
        }
    }

    static {
        C10161d c10161d = C9917k.a.f37566d;
        C10163f c10163fM35438i = c10161d.m35438i();
        C9801m.m32345e(c10163fM35438i, "cloneable.shortName()");
        f37691d = c10163fM35438i;
        C10159b c10159bM35408m = C10159b.m35408m(c10161d.m35441l());
        C9801m.m32345e(c10159bM35408m, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        f37692e = c10159bM35408m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9931e(InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0, Function1<? super InterfaceC10592g0, ? extends InterfaceC10609m> function1) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10592g0, "moduleDescriptor");
        C9801m.m32346f(function1, "computeContainingDeclaration");
        this.f37693f = interfaceC10592g0;
        this.f37694g = function1;
        this.f37695h = interfaceC10330n.mo36516d(new c(interfaceC10330n));
    }

    /* renamed from: i */
    private final C10651h m32948i() {
        return (C10651h) C10329m.m36555a(this.f37695h, this, f37689b[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b
    /* renamed from: a */
    public Collection<InterfaceC10585e> mo32848a(C10160c c10160c) {
        C9801m.m32346f(c10160c, "packageFqName");
        return C9801m.m32341a(c10160c, f37690c) ? C10820v0.m38916c(m32948i()) : C10822w0.m38917d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b
    /* renamed from: b */
    public boolean mo32849b(C10160c c10160c, C10163f c10163f) {
        C9801m.m32346f(c10160c, "packageFqName");
        C9801m.m32346f(c10163f, "name");
        return C9801m.m32341a(c10163f, f37691d) && C9801m.m32341a(c10160c, f37690c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b
    /* renamed from: c */
    public InterfaceC10585e mo32850c(C10159b c10159b) {
        C9801m.m32346f(c10159b, "classId");
        if (C9801m.m32341a(c10159b, f37692e)) {
            return m32948i();
        }
        return null;
    }

    public /* synthetic */ C9931e(InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0, Function1 function1, int i2, C9789g c9789g) {
        this(interfaceC10330n, interfaceC10592g0, (i2 & 4) != 0 ? a.f37696f : function1);
    }
}
