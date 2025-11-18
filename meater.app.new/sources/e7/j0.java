package e7;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
final class j0 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ C3218h f40700B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ String f40701C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ k0 f40702D;

    j0(k0 k0Var, C3218h c3218h, String str) {
        this.f40700B = c3218h;
        this.f40701C = str;
        this.f40702D = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        k0 k0Var = this.f40702D;
        if (k0Var.f40715b > 0) {
            C3218h c3218h = this.f40700B;
            if (k0Var.f40716c != null) {
                bundle = k0Var.f40716c.getBundle(this.f40701C);
            } else {
                bundle = null;
            }
            c3218h.f(bundle);
        }
        if (this.f40702D.f40715b >= 2) {
            this.f40700B.j();
        }
        if (this.f40702D.f40715b >= 3) {
            this.f40700B.h();
        }
        if (this.f40702D.f40715b >= 4) {
            this.f40700B.k();
        }
        if (this.f40702D.f40715b >= 5) {
            this.f40700B.g();
        }
    }
}
