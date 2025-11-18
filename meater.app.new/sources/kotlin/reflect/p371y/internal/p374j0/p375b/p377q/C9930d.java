package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.util.Collection;
import kotlin.collections.C10817u;
import kotlin.collections.C10820v0;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;

/* compiled from: JavaToKotlinClassMapper.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.d */
/* loaded from: classes2.dex */
public final class C9930d {

    /* renamed from: a */
    public static final C9930d f37687a = new C9930d();

    private C9930d() {
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC10585e m32936f(C9930d c9930d, C10160c c10160c, AbstractC9914h abstractC9914h, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        return c9930d.m32941e(c10160c, abstractC9914h, num);
    }

    /* renamed from: a */
    public final InterfaceC10585e m32937a(InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10585e, "mutable");
        C10160c c10160cM32930o = C9929c.f37667a.m32930o(C10187d.m35825m(interfaceC10585e));
        if (c10160cM32930o != null) {
            InterfaceC10585e interfaceC10585eM32797o = C10235a.m36072f(interfaceC10585e).m32797o(c10160cM32930o);
            C9801m.m32345e(interfaceC10585eM32797o, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return interfaceC10585eM32797o;
        }
        throw new IllegalArgumentException("Given class " + interfaceC10585e + " is not a mutable collection");
    }

    /* renamed from: b */
    public final InterfaceC10585e m32938b(InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10585e, "readOnly");
        C10160c c10160cM32931p = C9929c.f37667a.m32931p(C10187d.m35825m(interfaceC10585e));
        if (c10160cM32931p != null) {
            InterfaceC10585e interfaceC10585eM32797o = C10235a.m36072f(interfaceC10585e).m32797o(c10160cM32931p);
            C9801m.m32345e(interfaceC10585eM32797o, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return interfaceC10585eM32797o;
        }
        throw new IllegalArgumentException("Given class " + interfaceC10585e + " is not a read-only collection");
    }

    /* renamed from: c */
    public final boolean m32939c(InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10585e, "mutable");
        return C9929c.f37667a.m32926k(C10187d.m35825m(interfaceC10585e));
    }

    /* renamed from: d */
    public final boolean m32940d(InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10585e, "readOnly");
        return C9929c.f37667a.m32927l(C10187d.m35825m(interfaceC10585e));
    }

    /* renamed from: e */
    public final InterfaceC10585e m32941e(C10160c c10160c, AbstractC9914h abstractC9914h, Integer num) {
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(abstractC9914h, "builtIns");
        C10159b c10159bM32928m = (num == null || !C9801m.m32341a(c10160c, C9929c.f37667a.m32924h())) ? C9929c.f37667a.m32928m(c10160c) : C9917k.m32826a(num.intValue());
        if (c10159bM32928m != null) {
            return abstractC9914h.m32797o(c10159bM32928m.m35409b());
        }
        return null;
    }

    /* renamed from: g */
    public final Collection<InterfaceC10585e> m32942g(C10160c c10160c, AbstractC9914h abstractC9914h) {
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(abstractC9914h, "builtIns");
        InterfaceC10585e interfaceC10585eM32936f = m32936f(this, c10160c, abstractC9914h, null, 4, null);
        if (interfaceC10585eM32936f == null) {
            return C10822w0.m38917d();
        }
        C10160c c10160cM32931p = C9929c.f37667a.m32931p(C10235a.m36075i(interfaceC10585eM32936f));
        if (c10160cM32931p == null) {
            return C10820v0.m38916c(interfaceC10585eM32936f);
        }
        InterfaceC10585e interfaceC10585eM32797o = abstractC9914h.m32797o(c10160cM32931p);
        C9801m.m32345e(interfaceC10585eM32797o, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        return C10817u.m38891m(interfaceC10585eM32936f, interfaceC10585eM32797o);
    }
}
