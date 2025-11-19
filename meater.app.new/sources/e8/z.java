package e8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
final class z implements ServiceConnection {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ C3236A f40786B;

    /* synthetic */ z(C3236A c3236a, y yVar) {
        this.f40786B = c3236a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f40786B.f40745b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        C3236A c3236a = this.f40786B;
        c3236a.c().post(new w(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f40786B.f40745b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C3236A c3236a = this.f40786B;
        c3236a.c().post(new x(this));
    }
}
