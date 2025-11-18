package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ServiceC0518n;
import androidx.work.AbstractC0807n;
import androidx.work.impl.foreground.C0733b;

/* loaded from: classes.dex */
public class SystemForegroundService extends ServiceC0518n implements C0733b.b {

    /* renamed from: g */
    private static final String f4614g = AbstractC0807n.m5223f("SystemFgService");

    /* renamed from: h */
    private static SystemForegroundService f4615h = null;

    /* renamed from: i */
    private Handler f4616i;

    /* renamed from: j */
    private boolean f4617j;

    /* renamed from: k */
    C0733b f4618k;

    /* renamed from: l */
    NotificationManager f4619l;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    class RunnableC0729a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f4620f;

        /* renamed from: g */
        final /* synthetic */ Notification f4621g;

        /* renamed from: h */
        final /* synthetic */ int f4622h;

        RunnableC0729a(int i2, Notification notification, int i3) {
            this.f4620f = i2;
            this.f4621g = notification;
            this.f4622h = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f4620f, this.f4621g, this.f4622h);
            } else {
                SystemForegroundService.this.startForeground(this.f4620f, this.f4621g);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    class RunnableC0730b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f4624f;

        /* renamed from: g */
        final /* synthetic */ Notification f4625g;

        RunnableC0730b(int i2, Notification notification) {
            this.f4624f = i2;
            this.f4625g = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f4619l.notify(this.f4624f, this.f4625g);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    class RunnableC0731c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f4627f;

        RunnableC0731c(int i2) {
            this.f4627f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f4619l.cancel(this.f4627f);
        }
    }

    /* renamed from: e */
    private void m4945e() {
        this.f4616i = new Handler(Looper.getMainLooper());
        this.f4619l = (NotificationManager) getApplicationContext().getSystemService("notification");
        C0733b c0733b = new C0733b(getApplicationContext());
        this.f4618k = c0733b;
        c0733b.m4958m(this);
    }

    @Override // androidx.work.impl.foreground.C0733b.b
    /* renamed from: b */
    public void mo4946b(int i2, int i3, Notification notification) {
        this.f4616i.post(new RunnableC0729a(i2, notification, i3));
    }

    @Override // androidx.work.impl.foreground.C0733b.b
    /* renamed from: c */
    public void mo4947c(int i2, Notification notification) {
        this.f4616i.post(new RunnableC0730b(i2, notification));
    }

    @Override // androidx.work.impl.foreground.C0733b.b
    /* renamed from: d */
    public void mo4948d(int i2) {
        this.f4616i.post(new RunnableC0731c(i2));
    }

    @Override // androidx.lifecycle.ServiceC0518n, android.app.Service
    public void onCreate() {
        super.onCreate();
        f4615h = this;
        m4945e();
    }

    @Override // androidx.lifecycle.ServiceC0518n, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4618k.m4956k();
    }

    @Override // androidx.lifecycle.ServiceC0518n, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f4617j) {
            AbstractC0807n.m5221c().mo5226d(f4614g, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f4618k.m4956k();
            m4945e();
            this.f4617j = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4618k.m4957l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.C0733b.b
    public void stop() {
        this.f4617j = true;
        AbstractC0807n.m5221c().mo5224a(f4614g, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f4615h = null;
        stopSelf();
    }
}
