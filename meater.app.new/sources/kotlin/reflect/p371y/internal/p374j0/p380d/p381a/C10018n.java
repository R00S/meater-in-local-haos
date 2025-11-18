package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9997c;
import kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10188e;

/* compiled from: FieldOverridabilityCondition.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.n */
/* loaded from: classes2.dex */
public final class C10018n implements InterfaceC10188e {
    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10188e
    /* renamed from: a */
    public InterfaceC10188e.a mo33227a() {
        return InterfaceC10188e.a.BOTH;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10188e
    /* renamed from: b */
    public InterfaceC10188e.b mo33228b(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2, InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10573a, "superDescriptor");
        C9801m.m32346f(interfaceC10573a2, "subDescriptor");
        if (!(interfaceC10573a2 instanceof InterfaceC10729t0) || !(interfaceC10573a instanceof InterfaceC10729t0)) {
            return InterfaceC10188e.b.UNKNOWN;
        }
        InterfaceC10729t0 interfaceC10729t0 = (InterfaceC10729t0) interfaceC10573a2;
        InterfaceC10729t0 interfaceC10729t02 = (InterfaceC10729t0) interfaceC10573a;
        return !C9801m.m32341a(interfaceC10729t0.getName(), interfaceC10729t02.getName()) ? InterfaceC10188e.b.UNKNOWN : (C9997c.m33307a(interfaceC10729t0) && C9997c.m33307a(interfaceC10729t02)) ? InterfaceC10188e.b.OVERRIDABLE : (C9997c.m33307a(interfaceC10729t0) || C9997c.m33307a(interfaceC10729t02)) ? InterfaceC10188e.b.INCOMPATIBLE : InterfaceC10188e.b.UNKNOWN;
    }
}
