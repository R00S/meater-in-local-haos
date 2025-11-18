package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.C2918c;
import f1.m;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z7.C5211m;

/* compiled from: DisplayNotification.java */
/* renamed from: com.google.firebase.messaging.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2920e {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f38383a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f38384b;

    /* renamed from: c, reason: collision with root package name */
    private final H f38385c;

    public C2920e(Context context, H h10, ExecutorService executorService) {
        this.f38383a = executorService;
        this.f38384b = context;
        this.f38385c = h10;
    }

    private boolean b() {
        if (((KeyguardManager) this.f38384b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!com.google.android.gms.common.util.l.c()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f38384b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    private void c(C2918c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f38384b.getSystemService("notification")).notify(aVar.f38361b, aVar.f38362c, aVar.f38360a.b());
    }

    private D d() {
        D d10 = D.d(this.f38385c.p("gcm.n.image"));
        if (d10 != null) {
            d10.g(this.f38383a);
        }
        return d10;
    }

    private void e(m.e eVar, D d10) {
        if (d10 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) C5211m.b(d10.e(), 5L, TimeUnit.SECONDS);
            eVar.r(bitmap);
            eVar.B(new m.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            d10.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            d10.close();
        }
    }

    boolean a() throws PackageManager.NameNotFoundException {
        if (this.f38385c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        D d10 = d();
        C2918c.a aVarE = C2918c.e(this.f38384b, this.f38385c);
        e(aVarE.f38360a, d10);
        c(aVarE);
        return true;
    }
}
