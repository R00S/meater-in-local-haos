package Ua;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes3.dex */
public final class C implements B {

    /* renamed from: a, reason: collision with root package name */
    private final List<F> f17687a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<F> f17688b;

    /* renamed from: c, reason: collision with root package name */
    private final List<F> f17689c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<F> f17690d;

    public C(List<F> allDependencies, Set<F> modulesWhoseInternalsAreVisible, List<F> directExpectedByDependencies, Set<F> allExpectedByDependencies) {
        C3862t.g(allDependencies, "allDependencies");
        C3862t.g(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        C3862t.g(directExpectedByDependencies, "directExpectedByDependencies");
        C3862t.g(allExpectedByDependencies, "allExpectedByDependencies");
        this.f17687a = allDependencies;
        this.f17688b = modulesWhoseInternalsAreVisible;
        this.f17689c = directExpectedByDependencies;
        this.f17690d = allExpectedByDependencies;
    }

    @Override // Ua.B
    public List<F> a() {
        return this.f17687a;
    }

    @Override // Ua.B
    public Set<F> b() {
        return this.f17688b;
    }

    @Override // Ua.B
    public List<F> c() {
        return this.f17689c;
    }
}
