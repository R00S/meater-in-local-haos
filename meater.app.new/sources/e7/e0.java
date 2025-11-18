package e7;

import android.app.Dialog;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
final class e0 extends H {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f40667a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f0 f40668b;

    e0(f0 f0Var, Dialog dialog) {
        this.f40668b = f0Var;
        this.f40667a = dialog;
    }

    @Override // e7.H
    public final void a() {
        this.f40668b.f40689C.o();
        if (this.f40667a.isShowing()) {
            this.f40667a.dismiss();
        }
    }
}
