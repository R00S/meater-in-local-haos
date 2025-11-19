package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z7.AbstractC5208j;
import z7.C5209k;
import z7.InterfaceC5203e;

/* compiled from: WithinAppServiceConnection.java */
/* loaded from: classes2.dex */
class k0 implements ServiceConnection {

    /* renamed from: B, reason: collision with root package name */
    private final Context f38410B;

    /* renamed from: C, reason: collision with root package name */
    private final Intent f38411C;

    /* renamed from: D, reason: collision with root package name */
    private final ScheduledExecutorService f38412D;

    /* renamed from: E, reason: collision with root package name */
    private final Queue<a> f38413E;

    /* renamed from: F, reason: collision with root package name */
    private h0 f38414F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f38415G;

    /* compiled from: WithinAppServiceConnection.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f38416a;

        /* renamed from: b, reason: collision with root package name */
        private final C5209k<Void> f38417b = new C5209k<>();

        a(Intent intent) {
            this.f38416a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f38416a.getAction() + " finishing.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38405B.f();
                }
            }, 20L, TimeUnit.SECONDS);
            e().b(scheduledExecutorService, new InterfaceC5203e() { // from class: com.google.firebase.messaging.j0
                @Override // z7.InterfaceC5203e
                public final void a(AbstractC5208j abstractC5208j) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f38417b.e(null);
        }

        AbstractC5208j<Void> e() {
            return this.f38417b.a();
        }
    }

    k0(Context context, String str) {
        this(context, str, a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void b() {
        while (!this.f38413E.isEmpty()) {
            this.f38413E.poll().d();
        }
    }

    private synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f38413E.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                h0 h0Var = this.f38414F;
                if (h0Var == null || !h0Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f38414F.c(this.f38413E.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f38415G);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f38415G) {
            return;
        }
        this.f38415G = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (j7.b.b().a(this.f38410B, this.f38411C, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f38415G = false;
        b();
    }

    synchronized AbstractC5208j<Void> d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f38412D);
            this.f38413E.add(aVar);
            c();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f38415G = false;
            if (iBinder instanceof h0) {
                this.f38414F = (h0) iBinder;
                c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        c();
    }

    k0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f38413E = new ArrayDeque();
        this.f38415G = false;
        Context applicationContext = context.getApplicationContext();
        this.f38410B = applicationContext;
        this.f38411C = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f38412D = scheduledExecutorService;
    }
}
