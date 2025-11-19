package d8;

import android.os.Bundle;
import com.google.android.play.core.install.InstallException;
import e8.C3253p;
import z7.C5209k;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class BinderC3076t extends BinderC3075s {

    /* renamed from: E, reason: collision with root package name */
    private final String f39780E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ C3077u f39781F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BinderC3076t(C3077u c3077u, C5209k c5209k, String str) {
        super(c3077u, new C3253p("OnRequestInstallCallback"), c5209k);
        this.f39781F = c3077u;
        this.f39780E = str;
    }

    @Override // d8.BinderC3075s, e8.InterfaceC3250m
    public final void t0(Bundle bundle) {
        super.t0(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f39778C.d(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f39778C.e(C3077u.d(this.f39781F, bundle, this.f39780E));
        }
    }
}
