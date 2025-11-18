package g7;

import android.os.Bundle;
import c7.C2333b;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class g0 extends Q {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC3433d f42052g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(AbstractC3433d abstractC3433d, int i10, Bundle bundle) {
        super(abstractC3433d, i10, bundle);
        this.f42052g = abstractC3433d;
    }

    @Override // g7.Q
    protected final void f(C2333b c2333b) {
        if (this.f42052g.t() && AbstractC3433d.h0(this.f42052g)) {
            AbstractC3433d.d0(this.f42052g, 16);
        } else {
            this.f42052g.f41994Q.c(c2333b);
            this.f42052g.L(c2333b);
        }
    }

    @Override // g7.Q
    protected final boolean g() {
        this.f42052g.f41994Q.c(C2333b.f31067F);
        return true;
    }
}
