package A6;

import A6.b;
import android.content.Context;
import android.util.Log;
import g1.C3377a;

/* compiled from: DefaultConnectivityMonitorFactory.java */
/* loaded from: classes2.dex */
public class e implements c {
    @Override // A6.c
    public b a(Context context, b.a aVar) {
        boolean z10 = C3377a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new d(context, aVar) : new n();
    }
}
