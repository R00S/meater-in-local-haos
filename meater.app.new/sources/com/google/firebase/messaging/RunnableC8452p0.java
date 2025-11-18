package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.p0 */
/* loaded from: classes2.dex */
class RunnableC8452p0 implements Runnable {

    /* renamed from: f */
    private final long f32033f;

    /* renamed from: g */
    private final PowerManager.WakeLock f32034g;

    /* renamed from: h */
    private final FirebaseMessaging f32035h;

    /* renamed from: i */
    @VisibleForTesting
    ExecutorService f32036i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    @VisibleForTesting
    /* renamed from: com.google.firebase.messaging.p0$a */
    static class a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC8452p0 f32037a;

        public a(RunnableC8452p0 runnableC8452p0) {
            this.f32037a = runnableC8452p0;
        }

        /* renamed from: a */
        public void m26624a() {
            if (RunnableC8452p0.m26620c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f32037a.m26621b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC8452p0 runnableC8452p0 = this.f32037a;
            if (runnableC8452p0 != null && runnableC8452p0.m26622d()) {
                if (RunnableC8452p0.m26620c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f32037a.f32035h.m26436e(this.f32037a, 0L);
                this.f32037a.m26621b().unregisterReceiver(this);
                this.f32037a = null;
            }
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public RunnableC8452p0(FirebaseMessaging firebaseMessaging, long j2) {
        this.f32035h = firebaseMessaging;
        this.f32033f = j2;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) m26621b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f32034g = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    static boolean m26620c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: b */
    Context m26621b() {
        return this.f32035h.m26437f();
    }

    /* renamed from: d */
    boolean m26622d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m26621b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    /* renamed from: e */
    boolean m26623e() throws IOException {
        try {
            if (this.f32035h.m26434c() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e2) {
            if (!C8423b0.m26485f(e2.getMessage())) {
                if (e2.getMessage() != null) {
                    throw e2;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
            sb.append("Token retrieval failed: ");
            sb.append(message);
            sb.append(". Will retry token retrieval");
            Log.w("FirebaseMessaging", sb.toString());
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (C8444l0.m26580b().m26584e(m26621b())) {
            this.f32034g.acquire();
        }
        try {
            try {
                this.f32035h.m26445q(true);
                if (!this.f32035h.m26440l()) {
                    this.f32035h.m26445q(false);
                    if (!C8444l0.m26580b().m26584e(m26621b())) {
                        return;
                    }
                } else if (!C8444l0.m26580b().m26583d(m26621b()) || m26622d()) {
                    if (m26623e()) {
                        this.f32035h.m26445q(false);
                    } else {
                        this.f32035h.m26446t(this.f32033f);
                    }
                    if (!C8444l0.m26580b().m26584e(m26621b())) {
                        return;
                    }
                } else {
                    new a(this).m26624a();
                    if (!C8444l0.m26580b().m26584e(m26621b())) {
                        return;
                    }
                }
            } catch (IOException e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseMessaging", sb.toString());
                this.f32035h.m26445q(false);
                if (!C8444l0.m26580b().m26584e(m26621b())) {
                    return;
                }
            }
            this.f32034g.release();
        } catch (Throwable th) {
            if (C8444l0.m26580b().m26584e(m26621b())) {
                this.f32034g.release();
            }
            throw th;
        }
    }
}
