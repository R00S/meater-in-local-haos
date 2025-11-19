package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: TopicsSyncTask.java */
/* loaded from: classes2.dex */
class d0 implements Runnable {

    /* renamed from: G, reason: collision with root package name */
    private static final Object f38373G = new Object();

    /* renamed from: H, reason: collision with root package name */
    private static Boolean f38374H;

    /* renamed from: I, reason: collision with root package name */
    private static Boolean f38375I;

    /* renamed from: B, reason: collision with root package name */
    private final Context f38376B;

    /* renamed from: C, reason: collision with root package name */
    private final G f38377C;

    /* renamed from: D, reason: collision with root package name */
    private final PowerManager.WakeLock f38378D;

    /* renamed from: E, reason: collision with root package name */
    private final c0 f38379E;

    /* renamed from: F, reason: collision with root package name */
    private final long f38380F;

    /* compiled from: TopicsSyncTask.java */
    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private d0 f38381a;

        public a(d0 d0Var) {
            this.f38381a = d0Var;
        }

        public void a() {
            if (d0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            d0.this.f38376B.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                d0 d0Var = this.f38381a;
                if (d0Var == null) {
                    return;
                }
                if (d0Var.i()) {
                    if (d0.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f38381a.f38379E.l(this.f38381a, 0L);
                    context.unregisterReceiver(this);
                    this.f38381a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    d0(c0 c0Var, Context context, G g10, long j10) {
        this.f38379E = c0Var;
        this.f38376B = context;
        this.f38380F = j10;
        this.f38377C = g10;
        this.f38378D = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f38373G) {
            try {
                Boolean bool = f38375I;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f38375I = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f38373G) {
            try {
                Boolean bool = f38374H;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f38374H = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f38376B     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.d0.i():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f38376B)) {
            this.f38378D.acquire(C2919d.f38372a);
        }
        try {
            try {
                try {
                    this.f38379E.m(true);
                } catch (IOException e10) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                    this.f38379E.m(false);
                    if (!h(this.f38376B)) {
                        return;
                    } else {
                        wakeLock = this.f38378D;
                    }
                }
                if (!this.f38377C.g()) {
                    this.f38379E.m(false);
                    if (h(this.f38376B)) {
                        try {
                            this.f38378D.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (f(this.f38376B) && !i()) {
                    new a(this).a();
                    if (h(this.f38376B)) {
                        try {
                            this.f38378D.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (this.f38379E.p()) {
                    this.f38379E.m(false);
                } else {
                    this.f38379E.q(this.f38380F);
                }
                if (h(this.f38376B)) {
                    wakeLock = this.f38378D;
                    wakeLock.release();
                }
            } catch (Throwable th) {
                if (h(this.f38376B)) {
                    try {
                        this.f38378D.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
