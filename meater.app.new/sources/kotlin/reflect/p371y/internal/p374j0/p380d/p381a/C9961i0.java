package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10611m1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9979e;

/* compiled from: utils.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.i0 */
/* loaded from: classes2.dex */
public final class C9961i0 {
    /* renamed from: a */
    public static final boolean m33144a(InterfaceC10576b interfaceC10576b) {
        C9801m.m32346f(interfaceC10576b, "memberDescriptor");
        return (interfaceC10576b instanceof InterfaceC10738y) && C9801m.m32341a(interfaceC10576b.mo33224i0(C9979e.f37943K), Boolean.TRUE);
    }

    /* renamed from: b */
    public static final boolean m33145b(C10077w c10077w) {
        C9801m.m32346f(c10077w, "javaTypeEnhancementState");
        return c10077w.m33818c().invoke(C10075u.m33808e()) == EnumC9955f0.STRICT;
    }

    /* renamed from: c */
    public static final AbstractC10730u m33146c(AbstractC10611m1 abstractC10611m1) {
        C9801m.m32346f(abstractC10611m1, "<this>");
        AbstractC10730u abstractC10730uM33794g = C10072r.m33794g(abstractC10611m1);
        C9801m.m32345e(abstractC10730uM33794g, "toDescriptorVisibility(this)");
        return abstractC10730uM33794g;
    }
}
