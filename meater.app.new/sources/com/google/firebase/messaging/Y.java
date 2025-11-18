package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k7.ThreadFactoryC3803a;

/* compiled from: SyncTask.java */
/* loaded from: classes2.dex */
class Y implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final long f38318B;

    /* renamed from: C, reason: collision with root package name */
    private final PowerManager.WakeLock f38319C;

    /* renamed from: D, reason: collision with root package name */
    private final FirebaseMessaging f38320D;

    /* renamed from: E, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    ExecutorService f38321E = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3803a("firebase-iid-executor"));

    /* compiled from: SyncTask.java */
    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private Y f38322a;

        public a(Y y10) {
            this.f38322a = y10;
        }

        public void a() {
            if (Y.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f38322a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Y y10 = this.f38322a;
            if (y10 != null && y10.d()) {
                if (Y.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f38322a.f38320D.l(this.f38322a, 0L);
                this.f38322a.b().unregisterReceiver(this);
                this.f38322a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public Y(FirebaseMessaging firebaseMessaging, long j10) {
        this.f38320D = firebaseMessaging;
        this.f38318B = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f38319C = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    Context b() {
        return this.f38320D.m();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() throws IOException {
        try {
            if (this.f38320D.k() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            if (!B.h(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (U.b().e(b())) {
            this.f38319C.acquire();
        }
        try {
            try {
                this.f38320D.G(true);
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f38320D.G(false);
                if (!U.b().e(b())) {
                    return;
                }
            }
            if (!this.f38320D.x()) {
                this.f38320D.G(false);
                if (U.b().e(b())) {
                    this.f38319C.release();
                    return;
                }
                return;
            }
            if (U.b().d(b()) && !d()) {
                new a(this).a();
                if (U.b().e(b())) {
                    this.f38319C.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f38320D.G(false);
            } else {
                this.f38320D.K(this.f38318B);
            }
            if (!U.b().e(b())) {
                return;
            }
            this.f38319C.release();
        } catch (Throwable th) {
            if (U.b().e(b())) {
                this.f38319C.release();
            }
            throw th;
        }
    }
}
