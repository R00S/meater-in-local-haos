package com.liulishuo.filedownloader.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.C9004f;
import p241e.p307h.p308a.InterfaceC9046u;
import p241e.p307h.p308a.p312h0.C9021b;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: BaseFileServiceUIGuard.java */
/* renamed from: com.liulishuo.filedownloader.services.a */
/* loaded from: classes2.dex */
public abstract class AbstractServiceConnectionC8701a<CALLBACK extends Binder, INTERFACE extends IInterface> implements InterfaceC9046u, ServiceConnection {

    /* renamed from: g */
    private volatile INTERFACE f33035g;

    /* renamed from: h */
    private final Class<?> f33036h;

    /* renamed from: i */
    protected boolean f33037i = false;

    /* renamed from: j */
    private final HashMap<String, Object> f33038j = new HashMap<>();

    /* renamed from: k */
    private final List<Context> f33039k = new ArrayList();

    /* renamed from: l */
    private final ArrayList<Runnable> f33040l = new ArrayList<>();

    /* renamed from: f */
    private final CALLBACK f33034f = (CALLBACK) mo27606c();

    protected AbstractServiceConnectionC8701a(Class<?> cls) {
        this.f33036h = cls;
    }

    /* renamed from: f */
    private void m27603f(boolean z) {
        if (!z && this.f33035g != null) {
            try {
                mo27609g(this.f33035g, this.f33034f);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "release connect resources %s", this.f33035g);
        }
        this.f33035g = null;
        C9004f.m28724e().m28906b(new C9021b(z ? C9021b.a.lost : C9021b.a.disconnected, this.f33036h));
    }

    /* renamed from: a */
    protected abstract INTERFACE mo27604a(IBinder iBinder);

    /* renamed from: b */
    public void m27605b(Context context, Runnable runnable) {
        if (C9036f.m28983J(context)) {
            throw new IllegalStateException("Fatal-Exception: You can't bind the FileDownloadService in :filedownloader process.\n It's the invalid operation and is likely to cause unexpected problems.\n Maybe you want to use non-separate process mode for FileDownloader, More detail about non-separate mode, please move to wiki manually: https://github.com/lingochamp/FileDownloader/wiki/filedownloader.properties");
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "bindStartByContext %s", context.getClass().getSimpleName());
        }
        Intent intent = new Intent(context, this.f33036h);
        if (runnable != null && !this.f33040l.contains(runnable)) {
            this.f33040l.add(runnable);
        }
        if (!this.f33039k.contains(context)) {
            this.f33039k.add(context);
        }
        boolean zM28989P = C9036f.m28989P(context);
        this.f33037i = zM28989P;
        intent.putExtra("is_foreground", zM28989P);
        context.bindService(intent, this, 1);
        if (!this.f33037i) {
            context.startService(intent);
            return;
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "start foreground service", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        }
    }

    /* renamed from: c */
    protected abstract CALLBACK mo27606c();

    /* renamed from: d */
    protected INTERFACE m27607d() {
        return this.f33035g;
    }

    /* renamed from: e */
    protected abstract void mo27608e(INTERFACE r1, CALLBACK callback) throws RemoteException;

    /* renamed from: g */
    protected abstract void mo27609g(INTERFACE r1, CALLBACK callback) throws RemoteException;

    @Override // p241e.p307h.p308a.InterfaceC9046u
    public boolean isConnected() {
        return m27607d() != null;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f33035g = (INTERFACE) mo27604a(iBinder);
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "onServiceConnected %s %s", componentName, this.f33035g);
        }
        try {
            mo27608e(this.f33035g, this.f33034f);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
        List list = (List) this.f33040l.clone();
        this.f33040l.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        C9004f.m28724e().m28906b(new C9021b(C9021b.a.connected, this.f33036h));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "onServiceDisconnected %s %s", componentName, this.f33035g);
        }
        m27603f(true);
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: u0 */
    public void mo27610u0(Context context) {
        m27605b(context, null);
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: v0 */
    public boolean mo27611v0() {
        return this.f33037i;
    }
}
