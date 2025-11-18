package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.internal.m */
/* loaded from: classes2.dex */
final class ServiceConnectionC6430m implements ServiceConnection, zzs {

    /* renamed from: f */
    private final Map f17822f = new HashMap();

    /* renamed from: g */
    private int f17823g = 2;

    /* renamed from: h */
    private boolean f17824h;

    /* renamed from: i */
    private IBinder f17825i;

    /* renamed from: j */
    private final zzn f17826j;

    /* renamed from: k */
    private ComponentName f17827k;

    /* renamed from: l */
    final /* synthetic */ C6432o f17828l;

    public ServiceConnectionC6430m(C6432o c6432o, zzn zznVar) {
        this.f17828l = c6432o;
        this.f17826j = zznVar;
    }

    /* renamed from: a */
    public final int m14408a() {
        return this.f17823g;
    }

    /* renamed from: b */
    public final ComponentName m14409b() {
        return this.f17827k;
    }

    /* renamed from: c */
    public final IBinder m14410c() {
        return this.f17825i;
    }

    /* renamed from: d */
    public final void m14411d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f17822f.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m14412e(String str, Executor executor) {
        this.f17823g = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.m14651o()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C6432o c6432o = this.f17828l;
            boolean zM14582d = c6432o.f17834j.m14582d(c6432o.f17831g, str, this.f17826j.m14509c(c6432o.f17831g), this, this.f17826j.m14507a(), executor);
            this.f17824h = zM14582d;
            if (zM14582d) {
                this.f17828l.f17832h.sendMessageDelayed(this.f17828l.f17832h.obtainMessage(1, this.f17826j), this.f17828l.f17836l);
            } else {
                this.f17823g = 2;
                try {
                    C6432o c6432o2 = this.f17828l;
                    c6432o2.f17834j.m14581c(c6432o2.f17831g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void m14413f(ServiceConnection serviceConnection, String str) {
        this.f17822f.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m14414g(String str) {
        this.f17828l.f17832h.removeMessages(1, this.f17826j);
        C6432o c6432o = this.f17828l;
        c6432o.f17834j.m14581c(c6432o.f17831g, this);
        this.f17824h = false;
        this.f17823g = 2;
    }

    /* renamed from: h */
    public final boolean m14415h(ServiceConnection serviceConnection) {
        return this.f17822f.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m14416i() {
        return this.f17822f.isEmpty();
    }

    /* renamed from: j */
    public final boolean m14417j() {
        return this.f17824h;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f17828l.f17830f) {
            this.f17828l.f17832h.removeMessages(1, this.f17826j);
            this.f17825i = iBinder;
            this.f17827k = componentName;
            Iterator it = this.f17822f.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f17823g = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f17828l.f17830f) {
            this.f17828l.f17832h.removeMessages(1, this.f17826j);
            this.f17825i = null;
            this.f17827k = componentName;
            Iterator it = this.f17822f.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f17823g = 2;
        }
    }
}
