package Hb;

import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes3.dex */
public abstract class B extends AbstractC1082f0 {
    @Override // Hb.U
    public List<E0> M0() {
        return X0().M0();
    }

    @Override // Hb.U
    public u0 N0() {
        return X0().N0();
    }

    @Override // Hb.U
    public y0 O0() {
        return X0().O0();
    }

    @Override // Hb.U
    public boolean P0() {
        return X0().P0();
    }

    protected abstract AbstractC1082f0 X0();

    @Override // Hb.P0
    public AbstractC1082f0 Y0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        U uA = kotlinTypeRefiner.a(X0());
        C3862t.e(uA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return Z0((AbstractC1082f0) uA);
    }

    public abstract B Z0(AbstractC1082f0 abstractC1082f0);

    @Override // Hb.U
    public Ab.k s() {
        return X0().s();
    }
}
