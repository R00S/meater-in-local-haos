package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.internal.o */
/* loaded from: classes2.dex */
final class C6432o extends GmsClientSupervisor {

    /* renamed from: f */
    private final HashMap f17830f = new HashMap();

    /* renamed from: g */
    private final Context f17831g;

    /* renamed from: h */
    private volatile Handler f17832h;

    /* renamed from: i */
    private final C6431n f17833i;

    /* renamed from: j */
    private final ConnectionTracker f17834j;

    /* renamed from: k */
    private final long f17835k;

    /* renamed from: l */
    private final long f17836l;

    C6432o(Context context, Looper looper) {
        C6431n c6431n = new C6431n(this, null);
        this.f17833i = c6431n;
        this.f17831g = context.getApplicationContext();
        this.f17832h = new com.google.android.gms.internal.common.zzi(looper, c6431n);
        this.f17834j = ConnectionTracker.m14575b();
        this.f17835k = 5000L;
        this.f17836l = LocalNotificationSyncManager.FIVE_MINUTES;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    /* renamed from: d */
    protected final void mo14342d(zzn zznVar, ServiceConnection serviceConnection, String str) {
        Preconditions.m14373l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f17830f) {
            ServiceConnectionC6430m serviceConnectionC6430m = (ServiceConnectionC6430m) this.f17830f.get(zznVar);
            if (serviceConnectionC6430m == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + zznVar.toString());
            }
            if (!serviceConnectionC6430m.m14415h(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zznVar.toString());
            }
            serviceConnectionC6430m.m14413f(serviceConnection, str);
            if (serviceConnectionC6430m.m14416i()) {
                this.f17832h.sendMessageDelayed(this.f17832h.obtainMessage(0, zznVar), this.f17835k);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    /* renamed from: f */
    protected final boolean mo14344f(zzn zznVar, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zM14417j;
        Preconditions.m14373l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f17830f) {
            ServiceConnectionC6430m serviceConnectionC6430m = (ServiceConnectionC6430m) this.f17830f.get(zznVar);
            if (serviceConnectionC6430m == null) {
                serviceConnectionC6430m = new ServiceConnectionC6430m(this, zznVar);
                serviceConnectionC6430m.m14411d(serviceConnection, serviceConnection, str);
                serviceConnectionC6430m.m14412e(str, executor);
                this.f17830f.put(zznVar, serviceConnectionC6430m);
            } else {
                this.f17832h.removeMessages(0, zznVar);
                if (serviceConnectionC6430m.m14415h(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zznVar.toString());
                }
                serviceConnectionC6430m.m14411d(serviceConnection, serviceConnection, str);
                int iM14408a = serviceConnectionC6430m.m14408a();
                if (iM14408a == 1) {
                    serviceConnection.onServiceConnected(serviceConnectionC6430m.m14409b(), serviceConnectionC6430m.m14410c());
                } else if (iM14408a == 2) {
                    serviceConnectionC6430m.m14412e(str, executor);
                }
            }
            zM14417j = serviceConnectionC6430m.m14417j();
        }
        return zM14417j;
    }
}
