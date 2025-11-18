package com.liulishuo.filedownloader.services;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import p241e.p307h.p308a.C8994b0;
import p241e.p307h.p308a.p311g0.C9013c;
import p241e.p307h.p308a.p313i0.InterfaceC9026b;
import p241e.p307h.p308a.p315k0.C9033c;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9035e;
import p241e.p307h.p308a.p315k0.C9036f;

@SuppressLint({"Registered"})
/* loaded from: classes2.dex */
public class FileDownloadService extends Service {

    /* renamed from: f */
    private InterfaceC8710j f33032f;

    /* renamed from: g */
    private C8994b0 f33033g;

    public static class SeparateProcessService extends FileDownloadService {
    }

    public static class SharedMainProcessService extends FileDownloadService {
    }

    /* renamed from: a */
    private void m27602a(Intent intent) {
        if (intent != null && intent.getBooleanExtra("is_foreground", false)) {
            C8709i c8709iM28796h = C9013c.m28789j().m28796h();
            if (c8709iM28796h.m27676f() && Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel(c8709iM28796h.m27673c(), c8709iM28796h.m27674d(), 2);
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                if (notificationManager == null) {
                    return;
                } else {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            startForeground(c8709iM28796h.m27675e(), c8709iM28796h.m27672b(this));
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "run service foreground with config: %s", c8709iM28796h);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f33032f.mo27632P(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C9033c.m28957b(this);
        try {
            C9036f.m28993T(C9035e.m28971a().f34820a);
            C9036f.m28994U(C9035e.m28971a().f34821b);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
        C8707g c8707g = new C8707g();
        if (C9035e.m28971a().f34823d) {
            this.f33032f = new BinderC8705e(new WeakReference(this), c8707g);
        } else {
            this.f33032f = new BinderC8704d(new WeakReference(this), c8707g);
        }
        C8994b0.m28664a();
        C8994b0 c8994b0 = new C8994b0((InterfaceC9026b) this.f33032f);
        this.f33033g = c8994b0;
        c8994b0.m28667d();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f33033g.m28668e();
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        this.f33032f.mo27640k0(intent, i2, i3);
        m27602a(intent);
        return 1;
    }
}
