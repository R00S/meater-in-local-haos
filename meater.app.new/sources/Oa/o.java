package Oa;

import Hb.C1096m0;
import Hb.U;
import Hb.X;
import Hb.u0;
import Oa.p;
import Ra.C1711y;
import Ra.H;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.M;
import Ra.m0;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: ReflectionTypes.kt */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final M f13355a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4164i f13356b;

    /* renamed from: c, reason: collision with root package name */
    private final a f13357c;

    /* renamed from: d, reason: collision with root package name */
    private final a f13358d;

    /* renamed from: e, reason: collision with root package name */
    private final a f13359e;

    /* renamed from: f, reason: collision with root package name */
    private final a f13360f;

    /* renamed from: g, reason: collision with root package name */
    private final a f13361g;

    /* renamed from: h, reason: collision with root package name */
    private final a f13362h;

    /* renamed from: i, reason: collision with root package name */
    private final a f13363i;

    /* renamed from: j, reason: collision with root package name */
    private final a f13364j;

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f13354l = {P.h(new G(P.b(o.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), P.h(new G(P.b(o.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), P.h(new G(P.b(o.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), P.h(new G(P.b(o.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), P.h(new G(P.b(o.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), P.h(new G(P.b(o.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), P.h(new G(P.b(o.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), P.h(new G(P.b(o.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: k, reason: collision with root package name */
    public static final b f13353k = new b(null);

    /* compiled from: ReflectionTypes.kt */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f13365a;

        public a(int i10) {
            this.f13365a = i10;
        }

        public final InterfaceC1692e a(o types, Ia.m<?> property) {
            C3862t.g(types, "types");
            C3862t.g(property, "property");
            return types.c(Pb.a.a(property.getName()), this.f13365a);
        }
    }

    /* compiled from: ReflectionTypes.kt */
    public static final class b {
        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        public final U a(H module) {
            C3862t.g(module, "module");
            InterfaceC1692e interfaceC1692eB = C1711y.b(module, p.a.f13486w0);
            if (interfaceC1692eB == null) {
                return null;
            }
            u0 u0VarJ = u0.f5791C.j();
            List<m0> parameters = interfaceC1692eB.l().getParameters();
            C3862t.f(parameters, "getParameters(...)");
            Object objJ0 = kotlin.collections.r.J0(parameters);
            C3862t.f(objJ0, "single(...)");
            return X.h(u0VarJ, interfaceC1692eB, kotlin.collections.r.e(new C1096m0((m0) objJ0)));
        }

        private b() {
        }
    }

    public o(H module, M notFoundClasses) {
        C3862t.g(module, "module");
        C3862t.g(notFoundClasses, "notFoundClasses");
        this.f13355a = notFoundClasses;
        this.f13356b = C4165j.b(EnumC4168m.f46627C, new n(module));
        this.f13357c = new a(1);
        this.f13358d = new a(1);
        this.f13359e = new a(1);
        this.f13360f = new a(2);
        this.f13361g = new a(3);
        this.f13362h = new a(1);
        this.f13363i = new a(2);
        this.f13364j = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1692e c(String str, int i10) {
        qb.f fVarT = qb.f.t(str);
        C3862t.f(fVarT, "identifier(...)");
        InterfaceC1695h interfaceC1695hG = e().g(fVarT, Za.d.f19632I);
        InterfaceC1692e interfaceC1692e = interfaceC1695hG instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hG : null;
        return interfaceC1692e == null ? this.f13355a.d(new qb.b(p.f13397x, fVarT), kotlin.collections.r.e(Integer.valueOf(i10))) : interfaceC1692e;
    }

    private final Ab.k e() {
        return (Ab.k) this.f13356b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ab.k f(H h10) {
        return h10.G(p.f13397x).s();
    }

    public final InterfaceC1692e d() {
        return this.f13357c.a(this, f13354l[0]);
    }
}
