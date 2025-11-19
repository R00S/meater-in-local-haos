package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: StubTypes.kt */
/* renamed from: Hb.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1100o0 extends AbstractC1079e implements Lb.j {

    /* renamed from: G, reason: collision with root package name */
    private final y0 f5767G;

    /* renamed from: H, reason: collision with root package name */
    private final Ab.k f5768H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100o0(Ib.r originalTypeVariable, boolean z10, y0 constructor) {
        super(originalTypeVariable, z10);
        C3862t.g(originalTypeVariable, "originalTypeVariable");
        C3862t.g(constructor, "constructor");
        this.f5767G = constructor;
        this.f5768H = originalTypeVariable.q().i().s();
    }

    @Override // Hb.U
    public y0 O0() {
        return this.f5767G;
    }

    @Override // Hb.AbstractC1079e
    public AbstractC1079e Y0(boolean z10) {
        return new C1100o0(X0(), z10, O0());
    }

    @Override // Hb.AbstractC1079e, Hb.U
    public Ab.k s() {
        return this.f5768H;
    }

    @Override // Hb.AbstractC1082f0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stub (BI): ");
        sb2.append(X0());
        sb2.append(P0() ? "?" : "");
        return sb2.toString();
    }
}
