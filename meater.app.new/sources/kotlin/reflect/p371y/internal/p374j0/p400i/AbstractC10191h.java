package kotlin.reflect.p371y.internal.p374j0.p400i;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;

/* compiled from: OverridingStrategy.kt */
/* renamed from: kotlin.f0.y.e.j0.i.h */
/* loaded from: classes3.dex */
public abstract class AbstractC10191h extends AbstractC10192i {
    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10192i
    /* renamed from: b */
    public void mo35847b(InterfaceC10576b interfaceC10576b, InterfaceC10576b interfaceC10576b2) {
        C9801m.m32346f(interfaceC10576b, "first");
        C9801m.m32346f(interfaceC10576b2, "second");
        mo33156e(interfaceC10576b, interfaceC10576b2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.AbstractC10192i
    /* renamed from: c */
    public void mo35848c(InterfaceC10576b interfaceC10576b, InterfaceC10576b interfaceC10576b2) {
        C9801m.m32346f(interfaceC10576b, "fromSuper");
        C9801m.m32346f(interfaceC10576b2, "fromCurrent");
        mo33156e(interfaceC10576b, interfaceC10576b2);
    }

    /* renamed from: e */
    protected abstract void mo33156e(InterfaceC10576b interfaceC10576b, InterfaceC10576b interfaceC10576b2);
}
