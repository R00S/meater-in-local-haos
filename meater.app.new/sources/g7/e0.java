package g7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class e0 implements ServiceConnection {

    /* renamed from: B, reason: collision with root package name */
    private final int f42026B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ AbstractC3433d f42027C;

    public e0(AbstractC3433d abstractC3433d, int i10) {
        this.f42027C = abstractC3433d;
        this.f42026B = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC3433d abstractC3433d = this.f42027C;
        if (iBinder == null) {
            AbstractC3433d.d0(abstractC3433d, 16);
            return;
        }
        synchronized (abstractC3433d.f41992O) {
            try {
                AbstractC3433d abstractC3433d2 = this.f42027C;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC3433d2.f41993P = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3441l)) ? new U(iBinder) : (InterfaceC3441l) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f42027C.e0(0, null, this.f42026B);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f42027C.f41992O) {
            this.f42027C.f41993P = null;
        }
        AbstractC3433d abstractC3433d = this.f42027C;
        int i10 = this.f42026B;
        Handler handler = abstractC3433d.f41990M;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
