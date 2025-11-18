package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.internal.n */
/* loaded from: classes2.dex */
final class C6431n implements Handler.Callback {

    /* renamed from: f */
    final /* synthetic */ C6432o f17829f;

    /* synthetic */ C6431n(C6432o c6432o, zzp zzpVar) {
        this.f17829f = c6432o;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f17829f.f17830f) {
                zzn zznVar = (zzn) message.obj;
                ServiceConnectionC6430m serviceConnectionC6430m = (ServiceConnectionC6430m) this.f17829f.f17830f.get(zznVar);
                if (serviceConnectionC6430m != null && serviceConnectionC6430m.m14416i()) {
                    if (serviceConnectionC6430m.m14417j()) {
                        serviceConnectionC6430m.m14414g("GmsClientSupervisor");
                    }
                    this.f17829f.f17830f.remove(zznVar);
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        synchronized (this.f17829f.f17830f) {
            zzn zznVar2 = (zzn) message.obj;
            ServiceConnectionC6430m serviceConnectionC6430m2 = (ServiceConnectionC6430m) this.f17829f.f17830f.get(zznVar2);
            if (serviceConnectionC6430m2 != null && serviceConnectionC6430m2.m14408a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(zznVar2), new Exception());
                ComponentName componentNameM14409b = serviceConnectionC6430m2.m14409b();
                if (componentNameM14409b == null) {
                    componentNameM14409b = zznVar2.m14508b();
                }
                if (componentNameM14409b == null) {
                    String strM14510d = zznVar2.m14510d();
                    Preconditions.m14372k(strM14510d);
                    componentNameM14409b = new ComponentName(strM14510d, "unknown");
                }
                serviceConnectionC6430m2.onServiceDisconnected(componentNameM14409b);
            }
        }
        return true;
    }
}
