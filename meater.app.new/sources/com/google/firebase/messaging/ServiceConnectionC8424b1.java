package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ServiceConnectionC8424b1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.b1 */
/* loaded from: classes2.dex */
class ServiceConnectionC8424b1 implements ServiceConnection {

    /* renamed from: f */
    private final Context f31968f;

    /* renamed from: g */
    private final Intent f31969g;

    /* renamed from: h */
    private final ScheduledExecutorService f31970h;

    /* renamed from: i */
    private final Queue<a> f31971i;

    /* renamed from: j */
    private BinderC8470y0 f31972j;

    /* renamed from: k */
    private boolean f31973k;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.b1$a */
    static class a {

        /* renamed from: a */
        final Intent f31974a;

        /* renamed from: b */
        private final TaskCompletionSource<Void> f31975b = new TaskCompletionSource<>();

        a(Intent intent) {
            this.f31974a = intent;
        }

        /* renamed from: a */
        void m26497a(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable(this) { // from class: com.google.firebase.messaging.z0

                /* renamed from: f */
                private final ServiceConnectionC8424b1.a f32092f;

                {
                    this.f32092f = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f32092f.m26500d();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            m26499c().mo23640c(scheduledExecutorService, new OnCompleteListener(scheduledFutureSchedule) { // from class: com.google.firebase.messaging.a1

                /* renamed from: a */
                private final ScheduledFuture f31960a;

                {
                    this.f31960a = scheduledFutureSchedule;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                /* renamed from: a */
                public void mo7019a(Task task) {
                    this.f31960a.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m26498b() {
            this.f31975b.m23658e(null);
        }

        /* renamed from: c */
        Task<Void> m26499c() {
            return this.f31975b.m23654a();
        }

        /* renamed from: d */
        final /* synthetic */ void m26500d() {
            String action = this.f31974a.getAction();
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
            sb.append("Service took too long to process intent: ");
            sb.append(action);
            sb.append(" App may get closed.");
            Log.w("FirebaseMessaging", sb.toString());
            m26498b();
        }
    }

    ServiceConnectionC8424b1(Context context, String str) {
        this(context, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    private void m26492a() {
        while (!this.f31971i.isEmpty()) {
            this.f31971i.poll().m26498b();
        }
    }

    /* renamed from: b */
    private synchronized void m26493b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f31971i.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            BinderC8470y0 binderC8470y0 = this.f31972j;
            if (binderC8470y0 == null || !binderC8470y0.isBinderAlive()) {
                m26494d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f31972j.m26672b(this.f31971i.poll());
        }
    }

    /* renamed from: d */
    private void m26494d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z = this.f31973k;
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(!z);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f31973k) {
            return;
        }
        this.f31973k = true;
        try {
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e2);
        }
        if (ConnectionTracker.m14575b().m14580a(this.f31968f, this.f31969g, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f31973k = false;
        m26492a();
    }

    /* renamed from: c */
    synchronized Task<Void> m26495c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.m26497a(this.f31970h);
        this.f31971i.add(aVar);
        m26493b();
        return aVar.m26499c();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(strValueOf);
            Log.d("FirebaseMessaging", sb.toString());
        }
        this.f31973k = false;
        if (iBinder instanceof BinderC8470y0) {
            this.f31972j = (BinderC8470y0) iBinder;
            m26493b();
            return;
        }
        String strValueOf2 = String.valueOf(iBinder);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 28);
        sb2.append("Invalid service connection: ");
        sb2.append(strValueOf2);
        Log.e("FirebaseMessaging", sb2.toString());
        m26492a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(strValueOf);
            Log.d("FirebaseMessaging", sb.toString());
        }
        m26493b();
    }

    ServiceConnectionC8424b1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f31971i = new ArrayDeque();
        this.f31973k = false;
        Context applicationContext = context.getApplicationContext();
        this.f31968f = applicationContext;
        this.f31969g = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f31970h = scheduledExecutorService;
    }
}
