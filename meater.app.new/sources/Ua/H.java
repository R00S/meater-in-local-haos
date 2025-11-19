package Ua;

import Ra.InterfaceC1700m;
import Ra.InterfaceC1702o;
import Ra.h0;
import kotlin.jvm.internal.C3862t;

/* compiled from: PackageFragmentDescriptorImpl.kt */
/* loaded from: classes3.dex */
public abstract class H extends AbstractC1775n implements Ra.N {

    /* renamed from: F, reason: collision with root package name */
    private final qb.c f17711F;

    /* renamed from: G, reason: collision with root package name */
    private final String f17712G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Ra.H module, qb.c fqName) {
        super(module, Sa.h.f15630e.b(), fqName.h(), h0.f15158a);
        C3862t.g(module, "module");
        C3862t.g(fqName, "fqName");
        this.f17711F = fqName;
        this.f17712G = "package " + fqName + " of " + module;
    }

    @Override // Ra.N
    public final qb.c f() {
        return this.f17711F;
    }

    @Override // Ua.AbstractC1775n, Ra.InterfaceC1703p
    public h0 j() {
        h0 NO_SOURCE = h0.f15158a;
        C3862t.f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // Ua.AbstractC1774m
    public String toString() {
        return this.f17712G;
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> visitor, D d10) {
        C3862t.g(visitor, "visitor");
        return visitor.f(this, d10);
    }

    @Override // Ua.AbstractC1775n, Ra.InterfaceC1700m
    public Ra.H c() {
        InterfaceC1700m interfaceC1700mC = super.c();
        C3862t.e(interfaceC1700mC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (Ra.H) interfaceC1700mC;
    }
}
