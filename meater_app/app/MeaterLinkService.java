package com.apptionlabs.meater_app.app;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.w;
import c6.h;
import com.apptionlabs.meater_app.activities.j;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.NetworkState;
import e6.b;
import f8.t;
import j6.i;
import l6.k;
import s6.c;
import t5.x;
import y5.g;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MeaterLinkService extends Service {

    /* renamed from: s, reason: collision with root package name */
    public static boolean f9590s;

    /* renamed from: t, reason: collision with root package name */
    private static MeaterLinkService f9591t;

    /* renamed from: u, reason: collision with root package name */
    public static String f9592u;

    /* renamed from: q, reason: collision with root package name */
    private final IBinder f9593q = new a();

    /* renamed from: r, reason: collision with root package name */
    private final i f9594r = new i() { // from class: r5.f
        @Override // j6.i
        public final void a(boolean z10, b bVar) {
            MeaterLinkService.this.f(z10, bVar);
        }
    };

    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a extends Binder {
        public a() {
        }
    }

    private void b(NetworkState networkState) {
        try {
            for (Probe probe : h.f8879a.M()) {
                if (probe.getEventLog() != null) {
                    probe.getEventLog().networkConnectivityChanged(networkState);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void d() {
        k.e0().a();
        t6.b.f().a();
        g.E().L();
        x.E().J();
        x.E().K();
    }

    public static MeaterLinkService e() {
        return f9591t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(boolean z10, b bVar) {
        if (z10 && bVar != b.f11811q) {
            if (bVar == b.f11813s) {
                b(NetworkState.NETWORK_STATE_WIFI);
                if (com.apptionlabs.meater_app.app.a.u().e0()) {
                    k.e0().c();
                    t6.b.f().c();
                }
                if (com.apptionlabs.meater_app.app.a.u().d0()) {
                    g.E().G();
                    return;
                }
                return;
            }
            if (bVar == b.f11812r) {
                b(NetworkState.NETWORK_STATE_CELLULAR);
                k.e0().a();
                t6.b.f().a();
                g.E().G();
                return;
            }
            return;
        }
        b(NetworkState.NETWORK_STATE_NO_CONNECTION);
        k.e0().a();
        t6.b.f().a();
        g.E().K();
    }

    public static void g() {
        if (com.apptionlabs.meater_app.app.a.u().e0()) {
            k.e0().c();
            t6.b.f().c();
        }
        if (com.apptionlabs.meater_app.app.a.u().d0()) {
            g.E().G();
        }
        j l10 = com.apptionlabs.meater_app.app.a.l();
        if (!com.apptionlabs.meater_app.app.a.u().H1() && l10 != null && !ih.a.f268a.a(l10)) {
            x.E().H();
        }
    }

    private void i() {
        k6.b.u("Starting startForeground notification", new Object[0]);
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                w.a(this, 786, c.d(true), 16);
            } else {
                startForeground(786, c.d(true));
            }
            f9591t = this;
        } catch (Exception e10) {
            k6.b.u("Exception on creating service notification... %s", e10.getLocalizedMessage());
        }
    }

    public void c() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancelAll();
            stopSelf();
        }
    }

    public void h(boolean z10) {
        if (z10) {
            k.e0().d0(true);
        }
        x.E().I();
    }

    public void j() {
        k6.b.u("Stopping MEATER service...", new Object[0]);
        stopForeground(2);
        stopSelf();
        if (f9591t == this) {
            f9591t = null;
        }
    }

    public void k() {
        k.e0().d0(false);
        x.E().K();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        k6.b.u("MEATER Service bound", new Object[0]);
        f9590s = true;
        return this.f9593q;
    }

    @Override // android.app.Service
    public void onCreate() {
        k6.b.u("MEATER Service created", new Object[0]);
        c.b();
        t.f12516a.c(this.f9594r);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        k6.b.u("MEATER Service destroyed", new Object[0]);
        d();
        c();
        if (f9591t == this) {
            f9591t = null;
        }
        t.f12516a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        k6.b.u("MEATER Service rebound", new Object[0]);
        f9590s = true;
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        MeaterLinkService meaterLinkService = f9591t;
        if (meaterLinkService != null && meaterLinkService != this) {
            meaterLinkService.stopForeground(2);
            f9591t.stopSelf();
        }
        if (intent != null) {
            f9592u = intent.getStringExtra(MEATERIntent.EXTRA_CALLING_ACTIVITY);
        }
        k6.b.u("MEATER Service onStartCommand calling activity" + f9592u, new Object[0]);
        i();
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        stopSelf();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        k6.b.u("MEATER Service unbound", new Object[0]);
        f9590s = false;
        return true;
    }
}
