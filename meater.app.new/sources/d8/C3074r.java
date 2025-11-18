package d8;

import android.os.RemoteException;
import e8.AbstractRunnableC3254q;
import z7.C5209k;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3074r extends AbstractRunnableC3254q {

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ String f39774C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ C5209k f39775D;

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C3077u f39776E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3074r(C3077u c3077u, C5209k c5209k, String str, C5209k c5209k2) {
        super(c5209k);
        this.f39776E = c3077u;
        this.f39774C = str;
        this.f39775D = c5209k2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, e8.k] */
    @Override // e8.AbstractRunnableC3254q
    protected final void a() {
        try {
            ?? E10 = this.f39776E.f39784a.e();
            C3077u c3077u = this.f39776E;
            E10.Z0(c3077u.f39785b, C3077u.b(c3077u, this.f39774C), new BinderC3076t(this.f39776E, this.f39775D, this.f39774C));
        } catch (RemoteException e10) {
            C3077u.f39782e.b(e10, "requestUpdateInfo(%s)", this.f39774C);
            this.f39775D.d(new RuntimeException(e10));
        }
    }
}
