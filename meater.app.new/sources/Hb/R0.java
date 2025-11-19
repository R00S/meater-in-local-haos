package Hb;

import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinType.kt */
/* loaded from: classes3.dex */
public abstract class R0 extends U {
    public R0() {
        super(null);
    }

    @Override // Hb.U
    public List<E0> M0() {
        return S0().M0();
    }

    @Override // Hb.U
    public u0 N0() {
        return S0().N0();
    }

    @Override // Hb.U
    public y0 O0() {
        return S0().O0();
    }

    @Override // Hb.U
    public boolean P0() {
        return S0().P0();
    }

    @Override // Hb.U
    public final P0 R0() {
        U uS0 = S0();
        while (uS0 instanceof R0) {
            uS0 = ((R0) uS0).S0();
        }
        C3862t.e(uS0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (P0) uS0;
    }

    protected abstract U S0();

    public boolean T0() {
        return true;
    }

    @Override // Hb.U
    public Ab.k s() {
        return S0().s();
    }

    public String toString() {
        return T0() ? S0().toString() : "<Not computed yet>";
    }
}
