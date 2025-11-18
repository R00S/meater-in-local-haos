package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10736x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.w */
/* loaded from: classes3.dex */
public final class C10227w extends AbstractC10205a0<Byte> {
    public C10227w(byte b2) {
        super(Byte.valueOf(b2));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
    /* renamed from: a */
    public AbstractC10344e0 mo36013a(InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10592g0, "module");
        InterfaceC10585e interfaceC10585eM38149a = C10736x.m38149a(interfaceC10592g0, C9917k.a.f37609y0);
        AbstractC10368m0 abstractC10368m0Mo36400s = interfaceC10585eM38149a != null ? interfaceC10585eM38149a.mo36400s() : null;
        return abstractC10368m0Mo36400s == null ? C10427k.m37053d(EnumC10426j.f40269A0, "UByte") : abstractC10368m0Mo36400s;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
    public String toString() {
        return mo36023b().intValue() + ".toUByte()";
    }
}
