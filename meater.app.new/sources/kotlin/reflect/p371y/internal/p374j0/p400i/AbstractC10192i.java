package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Collection;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;

/* compiled from: OverridingStrategy.kt */
/* renamed from: kotlin.f0.y.e.j0.i.i */
/* loaded from: classes3.dex */
public abstract class AbstractC10192i {
    /* renamed from: a */
    public abstract void mo33154a(InterfaceC10576b interfaceC10576b);

    /* renamed from: b */
    public abstract void mo35847b(InterfaceC10576b interfaceC10576b, InterfaceC10576b interfaceC10576b2);

    /* renamed from: c */
    public abstract void mo35848c(InterfaceC10576b interfaceC10576b, InterfaceC10576b interfaceC10576b2);

    /* renamed from: d */
    public void mo33155d(InterfaceC10576b interfaceC10576b, Collection<? extends InterfaceC10576b> collection) {
        C9801m.m32346f(interfaceC10576b, "member");
        C9801m.m32346f(collection, "overridden");
        interfaceC10576b.mo36993x0(collection);
    }
}
