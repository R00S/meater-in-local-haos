package e7;

import android.app.Dialog;
import android.app.PendingIntent;
import c7.C2333b;
import com.google.android.gms.common.api.GoogleApiActivity;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
final class f0 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final d0 f40688B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ g0 f40689C;

    f0(g0 g0Var, d0 d0Var) {
        this.f40689C = g0Var;
        this.f40688B = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f40689C.f40691C) {
            C2333b c2333bB = this.f40688B.b();
            if (c2333bB.v0()) {
                g0 g0Var = this.f40689C;
                g0Var.f40695B.startActivityForResult(GoogleApiActivity.a(g0Var.b(), (PendingIntent) C3445p.k(c2333bB.r0()), this.f40688B.a(), false), 1);
                return;
            }
            g0 g0Var2 = this.f40689C;
            if (g0Var2.f40694F.b(g0Var2.b(), c2333bB.f0(), null) != null) {
                g0 g0Var3 = this.f40689C;
                g0Var3.f40694F.v(g0Var3.b(), g0Var3.f40695B, c2333bB.f0(), 2, this.f40689C);
                return;
            }
            if (c2333bB.f0() != 18) {
                this.f40689C.l(c2333bB, this.f40688B.a());
                return;
            }
            g0 g0Var4 = this.f40689C;
            Dialog dialogQ = g0Var4.f40694F.q(g0Var4.b(), g0Var4);
            g0 g0Var5 = this.f40689C;
            g0Var5.f40694F.r(g0Var5.b().getApplicationContext(), new e0(this, dialogQ));
        }
    }
}
