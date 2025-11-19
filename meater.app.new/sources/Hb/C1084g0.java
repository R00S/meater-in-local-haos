package Hb;

import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: Hb.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1084g0 extends AbstractC1082f0 {

    /* renamed from: C, reason: collision with root package name */
    private final y0 f5743C;

    /* renamed from: D, reason: collision with root package name */
    private final List<E0> f5744D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f5745E;

    /* renamed from: F, reason: collision with root package name */
    private final Ab.k f5746F;

    /* renamed from: G, reason: collision with root package name */
    private final Ba.l<Ib.g, AbstractC1082f0> f5747G;

    /* JADX WARN: Multi-variable type inference failed */
    public C1084g0(y0 constructor, List<? extends E0> arguments, boolean z10, Ab.k memberScope, Ba.l<? super Ib.g, ? extends AbstractC1082f0> refinedTypeFactory) {
        C3862t.g(constructor, "constructor");
        C3862t.g(arguments, "arguments");
        C3862t.g(memberScope, "memberScope");
        C3862t.g(refinedTypeFactory, "refinedTypeFactory");
        this.f5743C = constructor;
        this.f5744D = arguments;
        this.f5745E = z10;
        this.f5746F = memberScope;
        this.f5747G = refinedTypeFactory;
        if (!(s() instanceof Jb.g) || (s() instanceof Jb.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + s() + '\n' + O0());
    }

    @Override // Hb.U
    public List<E0> M0() {
        return this.f5744D;
    }

    @Override // Hb.U
    public u0 N0() {
        return u0.f5791C.j();
    }

    @Override // Hb.U
    public y0 O0() {
        return this.f5743C;
    }

    @Override // Hb.U
    public boolean P0() {
        return this.f5745E;
    }

    @Override // Hb.P0
    /* renamed from: V0 */
    public AbstractC1082f0 S0(boolean z10) {
        return z10 == P0() ? this : z10 ? new C1078d0(this) : new C1074b0(this);
    }

    @Override // Hb.P0
    /* renamed from: W0 */
    public AbstractC1082f0 U0(u0 newAttributes) {
        C3862t.g(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new C1086h0(this, newAttributes);
    }

    @Override // Hb.P0
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public AbstractC1082f0 Y0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC1082f0 abstractC1082f0Invoke = this.f5747G.invoke(kotlinTypeRefiner);
        return abstractC1082f0Invoke == null ? this : abstractC1082f0Invoke;
    }

    @Override // Hb.U
    public Ab.k s() {
        return this.f5746F;
    }
}
