package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10007m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10048y;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10049z;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10324h;

/* compiled from: resolvers.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.h */
/* loaded from: classes2.dex */
public final class C9991h implements InterfaceC9994k {

    /* renamed from: a */
    private final C9990g f38003a;

    /* renamed from: b */
    private final InterfaceC10609m f38004b;

    /* renamed from: c */
    private final int f38005c;

    /* renamed from: d */
    private final Map<InterfaceC10048y, Integer> f38006d;

    /* renamed from: e */
    private final InterfaceC10324h<InterfaceC10048y, C10007m> f38007e;

    /* compiled from: resolvers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.h$a */
    static final class a extends Lambda implements Function1<InterfaceC10048y, C10007m> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10007m invoke(InterfaceC10048y interfaceC10048y) {
            C9801m.m32346f(interfaceC10048y, "typeParameter");
            Integer num = (Integer) C9991h.this.f38006d.get(interfaceC10048y);
            if (num == null) {
                return null;
            }
            C9991h c9991h = C9991h.this;
            return new C10007m(C9984a.m33237h(C9984a.m33231b(c9991h.f38003a, c9991h), c9991h.f38004b.getAnnotations()), interfaceC10048y, c9991h.f38005c + num.intValue(), c9991h.f38004b);
        }
    }

    public C9991h(C9990g c9990g, InterfaceC10609m interfaceC10609m, InterfaceC10049z interfaceC10049z, int i2) {
        C9801m.m32346f(c9990g, "c");
        C9801m.m32346f(interfaceC10609m, "containingDeclaration");
        C9801m.m32346f(interfaceC10049z, "typeParameterOwner");
        this.f38003a = c9990g;
        this.f38004b = interfaceC10609m;
        this.f38005c = i2;
        this.f38006d = C10767a.m38511d(interfaceC10049z.getTypeParameters());
        this.f38007e = c9990g.m33286e().mo36521i(new a());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.InterfaceC9994k
    /* renamed from: a */
    public InterfaceC10587e1 mo33293a(InterfaceC10048y interfaceC10048y) {
        C9801m.m32346f(interfaceC10048y, "javaTypeParameter");
        C10007m c10007mInvoke = this.f38007e.invoke(interfaceC10048y);
        return c10007mInvoke != null ? c10007mInvoke : this.f38003a.m33287f().mo33293a(interfaceC10048y);
    }
}
