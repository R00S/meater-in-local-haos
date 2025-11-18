package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10575a1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10002h;

/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.r */
/* loaded from: classes3.dex */
public final class C10102r implements InterfaceC10741z0 {

    /* renamed from: b */
    private final C10002h f38480b;

    public C10102r(C10002h c10002h) {
        C9801m.m32346f(c10002h, "packageFragment");
        this.f38480b = c10002h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0
    /* renamed from: a */
    public InterfaceC10575a1 mo33980a() {
        InterfaceC10575a1 interfaceC10575a1 = InterfaceC10575a1.f40728a;
        C9801m.m32345e(interfaceC10575a1, "NO_SOURCE_FILE");
        return interfaceC10575a1;
    }

    public String toString() {
        return this.f38480b + ": " + this.f38480b.m33427N0().keySet();
    }
}
