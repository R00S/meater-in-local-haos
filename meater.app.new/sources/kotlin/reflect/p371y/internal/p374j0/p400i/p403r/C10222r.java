package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.r */
/* loaded from: classes3.dex */
public final class C10222r extends AbstractC10219o<Long> {
    public C10222r(long j2) {
        super(Long.valueOf(j2));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC10368m0 mo36013a(InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10592g0, "module");
        AbstractC10368m0 abstractC10368m0M32771F = interfaceC10592g0.mo37021o().m32771F();
        C9801m.m32345e(abstractC10368m0M32771F, "module.builtIns.longType");
        return abstractC10368m0M32771F;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
    public String toString() {
        return mo36023b().longValue() + ".toLong()";
    }
}
