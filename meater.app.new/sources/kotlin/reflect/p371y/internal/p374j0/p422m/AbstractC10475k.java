package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.k */
/* loaded from: classes3.dex */
public abstract class AbstractC10475k implements InterfaceC10470f {

    /* renamed from: a */
    private final String f40421a;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.k$a */
    public static final class a extends AbstractC10475k {

        /* renamed from: b */
        public static final a f40422b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
        /* renamed from: b */
        public boolean mo37195b(InterfaceC10738y interfaceC10738y) {
            C9801m.m32346f(interfaceC10738y, "functionDescriptor");
            return interfaceC10738y.mo37029f0() != null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.k$b */
    public static final class b extends AbstractC10475k {

        /* renamed from: b */
        public static final b f40423b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
        /* renamed from: b */
        public boolean mo37195b(InterfaceC10738y interfaceC10738y) {
            C9801m.m32346f(interfaceC10738y, "functionDescriptor");
            return (interfaceC10738y.mo37029f0() == null && interfaceC10738y.mo37032m0() == null) ? false : true;
        }
    }

    private AbstractC10475k(String str) {
        this.f40421a = str;
    }

    public /* synthetic */ AbstractC10475k(String str, C9789g c9789g) {
        this(str);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
    /* renamed from: a */
    public String mo37194a(InterfaceC10738y interfaceC10738y) {
        return InterfaceC10470f.a.m37196a(this, interfaceC10738y);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10470f
    public String getDescription() {
        return this.f40421a;
    }
}
