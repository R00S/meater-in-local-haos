package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m;

import kotlin.collections.C10820v0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9973k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10357i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10386s0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10389t0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;

/* compiled from: JavaTypeResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.d */
/* loaded from: classes2.dex */
public final class C10011d {

    /* renamed from: a */
    private static final C10160c f38171a = new C10160c("java.lang.Class");

    /* renamed from: b */
    public static final InterfaceC10351g1 m33528b(InterfaceC10587e1 interfaceC10587e1, C10008a c10008a) {
        C9801m.m32346f(interfaceC10587e1, "typeParameter");
        C9801m.m32346f(c10008a, "attr");
        return c10008a.m33503e() == EnumC9973k.SUPERTYPE ? new C10357i1(C10389t0.m36828b(interfaceC10587e1)) : new C10386s0(interfaceC10587e1);
    }

    /* renamed from: c */
    public static final C10008a m33529c(EnumC9973k enumC9973k, boolean z, InterfaceC10587e1 interfaceC10587e1) {
        C9801m.m32346f(enumC9973k, "<this>");
        return new C10008a(enumC9973k, null, z, interfaceC10587e1 != null ? C10820v0.m38916c(interfaceC10587e1) : null, null, 18, null);
    }

    /* renamed from: d */
    public static /* synthetic */ C10008a m33530d(EnumC9973k enumC9973k, boolean z, InterfaceC10587e1 interfaceC10587e1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            interfaceC10587e1 = null;
        }
        return m33529c(enumC9973k, z, interfaceC10587e1);
    }
}
