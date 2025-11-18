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
import androidx.core.app.C0245i;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C8419a;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.c */
/* loaded from: classes2.dex */
class C8425c {

    /* renamed from: a */
    private final Executor f31976a;

    /* renamed from: b */
    private final Context f31977b;

    /* renamed from: c */
    private final C8436h0 f31978c;

    public C8425c(Context context, C8436h0 c8436h0, Executor executor) {
        this.f31976a = executor;
        this.f31977b = context;
        this.f31978c = c8436h0;
    }

    /* renamed from: b */
    private boolean m26501b() {
        if (((KeyguardManager) this.f31977b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.m14644h()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f31977b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m26502c(C8419a.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f31977b.getSystemService("notification")).notify(aVar.f31957b, aVar.f31958c, aVar.f31956a.m1590c());
    }

    /* renamed from: d */
    private C8428d0 m26503d() {
        C8428d0 c8428d0M26507c = C8428d0.m26507c(this.f31978c.m26569p("gcm.n.image"));
        if (c8428d0M26507c != null) {
            c8428d0M26507c.m26510e(this.f31976a);
        }
        return c8428d0M26507c;
    }

    /* renamed from: e */
    private void m26504e(C0245i.e eVar, C8428d0 c8428d0) throws IOException {
        if (c8428d0 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.m23660b(c8428d0.m26509d(), 5L, TimeUnit.SECONDS);
            eVar.m1600p(bitmap);
            eVar.m1583A(new C0245i.b().m1571i(bitmap).m1570h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c8428d0.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            String strValueOf = String.valueOf(e2.getCause());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 26);
            sb.append("Failed to download image: ");
            sb.append(strValueOf);
            Log.w("FirebaseMessaging", sb.toString());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c8428d0.close();
        }
    }

    /* renamed from: a */
    boolean m26505a() throws PackageManager.NameNotFoundException, IOException {
        if (this.f31978c.m26555a("gcm.n.noui")) {
            return true;
        }
        if (m26501b()) {
            return false;
        }
        C8428d0 c8428d0M26503d = m26503d();
        C8419a.a aVarM26466d = C8419a.m26466d(this.f31977b, this.f31978c);
        m26504e(aVarM26466d.f31956a, c8428d0M26503d);
        m26502c(aVarM26466d);
        return true;
    }
}
