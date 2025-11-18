package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f;
import okhttp3.HttpUrl;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.t */
/* loaded from: classes3.dex */
public abstract class AbstractC10484t implements InterfaceC10470f {

    /* renamed from: a */
    private final String f40494a;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.t$a */
    public static final class a extends AbstractC10484t {

        /* renamed from: b */
        private final int f40495b;

        public a(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("must have at least ");
            sb.append(i2);
            sb.append(" value parameter");
            sb.append(i2 > 1 ? "s" : HttpUrl.FRAGMENT_ENCODE_SET);
            super(sb.toString(), null);
            this.f40495b = i2;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
        /* renamed from: b */
        public boolean mo37195b(InterfaceC10738y interfaceC10738y) {
            C9801m.m32346f(interfaceC10738y, "functionDescriptor");
            return interfaceC10738y.mo37028f().size() >= this.f40495b;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.t$b */
    public static final class b extends AbstractC10484t {

        /* renamed from: b */
        private final int f40496b;

        public b(int i2) {
            super("must have exactly " + i2 + " value parameters", null);
            this.f40496b = i2;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
        /* renamed from: b */
        public boolean mo37195b(InterfaceC10738y interfaceC10738y) {
            C9801m.m32346f(interfaceC10738y, "functionDescriptor");
            return interfaceC10738y.mo37028f().size() == this.f40496b;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.t$c */
    public static final class c extends AbstractC10484t {

        /* renamed from: b */
        public static final c f40497b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
        /* renamed from: b */
        public boolean mo37195b(InterfaceC10738y interfaceC10738y) {
            C9801m.m32346f(interfaceC10738y, "functionDescriptor");
            return interfaceC10738y.mo37028f().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.t$d */
    public static final class d extends AbstractC10484t {

        /* renamed from: b */
        public static final d f40498b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
        /* renamed from: b */
        public boolean mo37195b(InterfaceC10738y interfaceC10738y) {
            C9801m.m32346f(interfaceC10738y, "functionDescriptor");
            return interfaceC10738y.mo37028f().size() == 1;
        }
    }

    private AbstractC10484t(String str) {
        this.f40494a = str;
    }

    public /* synthetic */ AbstractC10484t(String str, C9789g c9789g) {
        this(str);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
    /* renamed from: a */
    public String mo37194a(InterfaceC10738y interfaceC10738y) {
        return InterfaceC10470f.a.m37196a(this, interfaceC10738y);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
    public String getDescription() {
        return this.f40494a;
    }
}
