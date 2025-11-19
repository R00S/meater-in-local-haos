package j8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
final class r implements ServiceConnection {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ t f43552B;

    /* synthetic */ r(t tVar, s sVar) {
        this.f43552B = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f43552B.f43555b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f43552B.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f43552B.f43555b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f43552B.c().post(new q(this));
    }
}
