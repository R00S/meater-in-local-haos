package Hb;

import java.util.List;
import kotlin.jvm.internal.C3854k;

/* compiled from: KotlinType.kt */
/* loaded from: classes3.dex */
public abstract class U implements Sa.a, Lb.i {

    /* renamed from: B, reason: collision with root package name */
    private int f5707B;

    public /* synthetic */ U(C3854k c3854k) {
        this();
    }

    private final int L0() {
        return Y.a(this) ? super.hashCode() : (((O0().hashCode() * 31) + M0().hashCode()) * 31) + (P0() ? 1 : 0);
    }

    public abstract List<E0> M0();

    public abstract u0 N0();

    public abstract y0 O0();

    public abstract boolean P0();

    public abstract U Q0(Ib.g gVar);

    public abstract P0 R0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        return P0() == u10.P0() && Ib.v.f7009a.a(R0(), u10.R0());
    }

    @Override // Sa.a
    public Sa.h getAnnotations() {
        return C1108u.a(N0());
    }

    public final int hashCode() {
        int i10 = this.f5707B;
        if (i10 != 0) {
            return i10;
        }
        int iL0 = L0();
        this.f5707B = iL0;
        return iL0;
    }

    public abstract Ab.k s();

    private U() {
    }
}
