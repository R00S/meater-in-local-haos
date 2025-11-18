package g7;

import android.app.PendingIntent;
import android.os.Bundle;
import c7.C2333b;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
abstract class Q extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f41965d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f41966e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC3433d f41967f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected Q(AbstractC3433d abstractC3433d, int i10, Bundle bundle) {
        super(abstractC3433d, Boolean.TRUE);
        this.f41967f = abstractC3433d;
        this.f41965d = i10;
        this.f41966e = bundle;
    }

    @Override // g7.c0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f41965d != 0) {
            this.f41967f.i0(1, null);
            Bundle bundle = this.f41966e;
            f(new C2333b(this.f41965d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f41967f.i0(1, null);
            f(new C2333b(8, null));
        }
    }

    protected abstract void f(C2333b c2333b);

    protected abstract boolean g();

    @Override // g7.c0
    protected final void b() {
    }
}
