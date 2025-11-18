package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0;

import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10591g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10078x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10049z;

/* compiled from: context.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.a */
/* loaded from: classes2.dex */
public final class C9984a {

    /* compiled from: context.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.a$a */
    static final class a extends Lambda implements Function0<C10078x> {

        /* renamed from: f */
        final /* synthetic */ C9990g f37958f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10591g f37959g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9990g c9990g, InterfaceC10591g interfaceC10591g) {
            super(0);
            this.f37958f = c9990g;
            this.f37959g = interfaceC10591g;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10078x invoke() {
            return C9984a.m33236g(this.f37958f, this.f37959g.getAnnotations());
        }
    }

    /* compiled from: context.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.a$b */
    static final class b extends Lambda implements Function0<C10078x> {

        /* renamed from: f */
        final /* synthetic */ C9990g f37960f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10620g f37961g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C9990g c9990g, InterfaceC10620g interfaceC10620g) {
            super(0);
            this.f37960f = c9990g;
            this.f37961g = interfaceC10620g;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10078x invoke() {
            return C9984a.m33236g(this.f37960f, this.f37961g);
        }
    }

    /* renamed from: a */
    private static final C9990g m33230a(C9990g c9990g, InterfaceC10609m interfaceC10609m, InterfaceC10049z interfaceC10049z, int i2, Lazy<C10078x> lazy) {
        return new C9990g(c9990g.m33282a(), interfaceC10049z != null ? new C9991h(c9990g, interfaceC10609m, interfaceC10049z, i2) : c9990g.m33287f(), lazy);
    }

    /* renamed from: b */
    public static final C9990g m33231b(C9990g c9990g, InterfaceC9994k interfaceC9994k) {
        C9801m.m32346f(c9990g, "<this>");
        C9801m.m32346f(interfaceC9994k, "typeParameterResolver");
        return new C9990g(c9990g.m33282a(), interfaceC9994k, c9990g.m33284c());
    }

    /* renamed from: c */
    public static final C9990g m33232c(C9990g c9990g, InterfaceC10591g interfaceC10591g, InterfaceC10049z interfaceC10049z, int i2) {
        C9801m.m32346f(c9990g, "<this>");
        C9801m.m32346f(interfaceC10591g, "containingDeclaration");
        return m33230a(c9990g, interfaceC10591g, interfaceC10049z, i2, C10550i.m37593a(LazyThreadSafetyMode.NONE, new a(c9990g, interfaceC10591g)));
    }

    /* renamed from: d */
    public static /* synthetic */ C9990g m33233d(C9990g c9990g, InterfaceC10591g interfaceC10591g, InterfaceC10049z interfaceC10049z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            interfaceC10049z = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return m33232c(c9990g, interfaceC10591g, interfaceC10049z, i2);
    }

    /* renamed from: e */
    public static final C9990g m33234e(C9990g c9990g, InterfaceC10609m interfaceC10609m, InterfaceC10049z interfaceC10049z, int i2) {
        C9801m.m32346f(c9990g, "<this>");
        C9801m.m32346f(interfaceC10609m, "containingDeclaration");
        C9801m.m32346f(interfaceC10049z, "typeParameterOwner");
        return m33230a(c9990g, interfaceC10609m, interfaceC10049z, i2, c9990g.m33284c());
    }

    /* renamed from: f */
    public static /* synthetic */ C9990g m33235f(C9990g c9990g, InterfaceC10609m interfaceC10609m, InterfaceC10049z interfaceC10049z, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return m33234e(c9990g, interfaceC10609m, interfaceC10049z, i2);
    }

    /* renamed from: g */
    public static final C10078x m33236g(C9990g c9990g, InterfaceC10620g interfaceC10620g) {
        C9801m.m32346f(c9990g, "<this>");
        C9801m.m32346f(interfaceC10620g, "additionalAnnotations");
        return c9990g.m33282a().m33241a().m33035c(c9990g.m33283b(), interfaceC10620g);
    }

    /* renamed from: h */
    public static final C9990g m33237h(C9990g c9990g, InterfaceC10620g interfaceC10620g) {
        C9801m.m32346f(c9990g, "<this>");
        C9801m.m32346f(interfaceC10620g, "additionalAnnotations");
        return interfaceC10620g.isEmpty() ? c9990g : new C9990g(c9990g.m33282a(), c9990g.m33287f(), C10550i.m37593a(LazyThreadSafetyMode.NONE, new b(c9990g, interfaceC10620g)));
    }

    /* renamed from: i */
    public static final C9990g m33238i(C9990g c9990g, C9985b c9985b) {
        C9801m.m32346f(c9990g, "<this>");
        C9801m.m32346f(c9985b, "components");
        return new C9990g(c9985b, c9990g.m33287f(), c9990g.m33284c());
    }
}
