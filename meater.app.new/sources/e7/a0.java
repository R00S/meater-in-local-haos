package e7;

import c7.C2335d;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class a0 extends X {

    /* renamed from: c, reason: collision with root package name */
    public final C3220j f40649c;

    public a0(C3220j c3220j, C5209k c5209k) {
        super(4, c5209k);
        this.f40649c = c3220j;
    }

    @Override // e7.J
    public final boolean f(C3209B c3209b) {
        if (((P) c3209b.y().get(this.f40649c)) == null) {
            return false;
        }
        throw null;
    }

    @Override // e7.J
    public final C2335d[] g(C3209B c3209b) {
        if (((P) c3209b.y().get(this.f40649c)) == null) {
            return null;
        }
        throw null;
    }

    @Override // e7.X
    public final void h(C3209B c3209b) {
        if (((P) c3209b.y().remove(this.f40649c)) == null) {
            this.f40644b.e(Boolean.FALSE);
        } else {
            c3209b.w();
            throw null;
        }
    }

    @Override // e7.b0
    public final /* bridge */ /* synthetic */ void d(r rVar, boolean z10) {
    }
}
