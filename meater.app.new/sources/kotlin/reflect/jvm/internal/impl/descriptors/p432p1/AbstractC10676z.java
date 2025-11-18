package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: PackageFragmentDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.z */
/* loaded from: classes2.dex */
public abstract class AbstractC10676z extends AbstractC10657k implements InterfaceC10604k0 {

    /* renamed from: j */
    private final C10160c f41128j;

    /* renamed from: k */
    private final String f41129k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10676z(InterfaceC10592g0 interfaceC10592g0, C10160c c10160c) {
        super(interfaceC10592g0, InterfaceC10620g.f40808c.m37735b(), c10160c.m35426h(), InterfaceC10741z0.f41247a);
        C9801m.m32346f(interfaceC10592g0, "module");
        C9801m.m32346f(c10160c, "fqName");
        this.f41128j = c10160c;
        this.f41129k = "package " + c10160c + " of " + interfaceC10592g0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        C9801m.m32346f(interfaceC10628o, "visitor");
        return interfaceC10628o.mo35678f(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0
    /* renamed from: d */
    public final C10160c mo37712d() {
        return this.f41128j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p
    /* renamed from: t */
    public InterfaceC10741z0 mo32883t() {
        InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
        C9801m.m32345e(interfaceC10741z0, "NO_SOURCE");
        return interfaceC10741z0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j
    public String toString() {
        return this.f41129k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: b */
    public InterfaceC10592g0 mo32876b() {
        InterfaceC10609m interfaceC10609mMo32876b = super.mo32876b();
        C9801m.m32344d(interfaceC10609mMo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC10592g0) interfaceC10609mMo32876b;
    }
}
