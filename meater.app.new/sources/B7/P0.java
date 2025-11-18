package B7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class P0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f1764a = new HashMap();

    P0() {
    }

    public final void a(IBinder iBinder) {
        N0 n02;
        synchronized (this.f1764a) {
            if (iBinder == null) {
                n02 = null;
            } else {
                try {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                    n02 = iInterfaceQueryLocalInterface instanceof N0 ? (N0) iInterfaceQueryLocalInterface : new N0(iBinder);
                } catch (Throwable th) {
                    throw th;
                }
            }
            E1 e12 = new E1();
            for (Map.Entry entry : this.f1764a.entrySet()) {
                L1 l12 = (L1) entry.getValue();
                try {
                    n02.u1(e12, new C0949v0(l12));
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "onPostInitHandler: added: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(l12));
                    }
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(l12));
                }
            }
        }
    }
}
