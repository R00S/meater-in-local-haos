package Ra;

import kotlin.jvm.internal.C3862t;

/* compiled from: DescriptorVisibility.kt */
/* loaded from: classes3.dex */
public abstract class r extends AbstractC1707u {

    /* renamed from: a, reason: collision with root package name */
    private final x0 f15165a;

    public r(x0 delegate) {
        C3862t.g(delegate, "delegate");
        this.f15165a = delegate;
    }

    @Override // Ra.AbstractC1707u
    public x0 b() {
        return this.f15165a;
    }

    @Override // Ra.AbstractC1707u
    public String c() {
        return b().b();
    }

    @Override // Ra.AbstractC1707u
    public AbstractC1707u f() {
        AbstractC1707u abstractC1707uJ = C1706t.j(b().d());
        C3862t.f(abstractC1707uJ, "toDescriptorVisibility(...)");
        return abstractC1707uJ;
    }
}
