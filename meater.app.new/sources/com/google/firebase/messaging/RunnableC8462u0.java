package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.u0 */
/* loaded from: classes2.dex */
class RunnableC8462u0 implements Runnable {

    /* renamed from: f */
    private static final Object f32069f = new Object();

    /* renamed from: g */
    private static Boolean f32070g;

    /* renamed from: h */
    private static Boolean f32071h;

    /* renamed from: i */
    private final Context f32072i;

    /* renamed from: j */
    private final C8434g0 f32073j;

    /* renamed from: k */
    private final PowerManager.WakeLock f32074k;

    /* renamed from: l */
    private final C8460t0 f32075l;

    /* renamed from: m */
    private final long f32076m;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.u0$a */
    class a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC8462u0 f32077a;

        public a(RunnableC8462u0 runnableC8462u0) {
            this.f32077a = runnableC8462u0;
        }

        /* renamed from: a */
        public void m26660a() {
            if (RunnableC8462u0.m26659j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC8462u0.this.f32072i.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC8462u0 runnableC8462u0 = this.f32077a;
            if (runnableC8462u0 == null) {
                return;
            }
            if (runnableC8462u0.m26658i()) {
                if (RunnableC8462u0.m26659j()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f32077a.f32075l.m26645k(this.f32077a, 0L);
                context.unregisterReceiver(this);
                this.f32077a = null;
            }
        }
    }

    RunnableC8462u0(C8460t0 c8460t0, Context context, C8434g0 c8434g0, long j2) {
        this.f32075l = c8460t0;
        this.f32072i = context;
        this.f32076m = j2;
        this.f32073j = c8434g0;
        this.f32074k = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    private static String m26654e(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    /* renamed from: f */
    private static boolean m26655f(Context context) {
        boolean zBooleanValue;
        synchronized (f32069f) {
            Boolean bool = f32071h;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? m26656g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f32071h = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    /* renamed from: g */
    private static boolean m26656g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        Log.d("FirebaseMessaging", m26654e(str));
        return false;
    }

    /* renamed from: h */
    private static boolean m26657h(Context context) {
        boolean zBooleanValue;
        synchronized (f32069f) {
            Boolean bool = f32070g;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? m26656g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f32070g = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m26658i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f32072i     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L20
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L12
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L20
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L1e
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1e
            r0 = 1
        L1c:
            monitor-exit(r2)
            return r0
        L1e:
            r0 = 0
            goto L1c
        L20:
            r0 = move-exception
            monitor-exit(r2)
            goto L24
        L23:
            throw r0
        L24:
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.RunnableC8462u0.m26658i():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m26659j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (m26657h(this.f32072i)) {
            this.f32074k.acquire(C8422b.f31961a);
        }
        try {
            try {
                this.f32075l.m26646l(true);
                if (!this.f32073j.m26547g()) {
                    this.f32075l.m26646l(false);
                    if (m26657h(this.f32072i)) {
                        try {
                            this.f32074k.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (m26655f(this.f32072i) && !m26658i()) {
                    new a(this).m26660a();
                    if (m26657h(this.f32072i)) {
                        try {
                            this.f32074k.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (this.f32075l.m26648o()) {
                    this.f32075l.m26646l(false);
                } else {
                    this.f32075l.m26649p(this.f32076m);
                }
                if (m26657h(this.f32072i)) {
                    try {
                        this.f32074k.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } catch (IOException e2) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.e("FirebaseMessaging", strValueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(strValueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.f32075l.m26646l(false);
                if (m26657h(this.f32072i)) {
                    try {
                        this.f32074k.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (Throwable th) {
            if (m26657h(this.f32072i)) {
                try {
                    this.f32074k.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
