package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10471g;
import kotlin.text.Regex;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.h */
/* loaded from: classes3.dex */
public final class C10472h {

    /* renamed from: a */
    private final C10163f f40410a;

    /* renamed from: b */
    private final Regex f40411b;

    /* renamed from: c */
    private final Collection<C10163f> f40412c;

    /* renamed from: d */
    private final Function1<InterfaceC10738y, String> f40413d;

    /* renamed from: e */
    private final InterfaceC10470f[] f40414e;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.h$a */
    static final class a extends Lambda implements Function1 {

        /* renamed from: f */
        public static final a f40415f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC10738y interfaceC10738y) {
            C9801m.m32346f(interfaceC10738y, "$this$null");
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.h$b */
    static final class b extends Lambda implements Function1 {

        /* renamed from: f */
        public static final b f40416f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC10738y interfaceC10738y) {
            C9801m.m32346f(interfaceC10738y, "$this$null");
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.h$c */
    static final class c extends Lambda implements Function1 {

        /* renamed from: f */
        public static final c f40417f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC10738y interfaceC10738y) {
            C9801m.m32346f(interfaceC10738y, "$this$null");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10472h(C10163f c10163f, Regex regex, Collection<C10163f> collection, Function1<? super InterfaceC10738y, String> function1, InterfaceC10470f... interfaceC10470fArr) {
        this.f40410a = c10163f;
        this.f40411b = regex;
        this.f40412c = collection;
        this.f40413d = function1;
        this.f40414e = interfaceC10470fArr;
    }

    /* renamed from: a */
    public final AbstractC10471g m37198a(InterfaceC10738y interfaceC10738y) {
        C9801m.m32346f(interfaceC10738y, "functionDescriptor");
        for (InterfaceC10470f interfaceC10470f : this.f40414e) {
            String strMo37194a = interfaceC10470f.mo37194a(interfaceC10738y);
            if (strMo37194a != null) {
                return new AbstractC10471g.b(strMo37194a);
            }
        }
        String strInvoke = this.f40413d.invoke(interfaceC10738y);
        return strInvoke != null ? new AbstractC10471g.b(strInvoke) : AbstractC10471g.c.f40409b;
    }

    /* renamed from: b */
    public final boolean m37199b(InterfaceC10738y interfaceC10738y) {
        C9801m.m32346f(interfaceC10738y, "functionDescriptor");
        if (this.f40410a != null && !C9801m.m32341a(interfaceC10738y.getName(), this.f40410a)) {
            return false;
        }
        if (this.f40411b != null) {
            String strM35455k = interfaceC10738y.getName().m35455k();
            C9801m.m32345e(strM35455k, "functionDescriptor.name.asString()");
            if (!this.f40411b.m37438b(strM35455k)) {
                return false;
            }
        }
        Collection<C10163f> collection = this.f40412c;
        return collection == null || collection.contains(interfaceC10738y.getName());
    }

    public /* synthetic */ C10472h(C10163f c10163f, InterfaceC10470f[] interfaceC10470fArr, Function1 function1, int i2, C9789g c9789g) {
        this(c10163f, interfaceC10470fArr, (Function1<? super InterfaceC10738y, String>) ((i2 & 4) != 0 ? a.f40415f : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10472h(C10163f c10163f, InterfaceC10470f[] interfaceC10470fArr, Function1<? super InterfaceC10738y, String> function1) {
        this(c10163f, (Regex) null, (Collection<C10163f>) null, function1, (InterfaceC10470f[]) Arrays.copyOf(interfaceC10470fArr, interfaceC10470fArr.length));
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC10470fArr, "checks");
        C9801m.m32346f(function1, "additionalChecks");
    }

    public /* synthetic */ C10472h(Regex regex, InterfaceC10470f[] interfaceC10470fArr, Function1 function1, int i2, C9789g c9789g) {
        this(regex, interfaceC10470fArr, (Function1<? super InterfaceC10738y, String>) ((i2 & 4) != 0 ? b.f40416f : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10472h(Regex regex, InterfaceC10470f[] interfaceC10470fArr, Function1<? super InterfaceC10738y, String> function1) {
        this((C10163f) null, regex, (Collection<C10163f>) null, function1, (InterfaceC10470f[]) Arrays.copyOf(interfaceC10470fArr, interfaceC10470fArr.length));
        C9801m.m32346f(regex, "regex");
        C9801m.m32346f(interfaceC10470fArr, "checks");
        C9801m.m32346f(function1, "additionalChecks");
    }

    public /* synthetic */ C10472h(Collection collection, InterfaceC10470f[] interfaceC10470fArr, Function1 function1, int i2, C9789g c9789g) {
        this((Collection<C10163f>) collection, interfaceC10470fArr, (Function1<? super InterfaceC10738y, String>) ((i2 & 4) != 0 ? c.f40417f : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10472h(Collection<C10163f> collection, InterfaceC10470f[] interfaceC10470fArr, Function1<? super InterfaceC10738y, String> function1) {
        this((C10163f) null, (Regex) null, collection, function1, (InterfaceC10470f[]) Arrays.copyOf(interfaceC10470fArr, interfaceC10470fArr.length));
        C9801m.m32346f(collection, "nameList");
        C9801m.m32346f(interfaceC10470fArr, "checks");
        C9801m.m32346f(function1, "additionalChecks");
    }
}
