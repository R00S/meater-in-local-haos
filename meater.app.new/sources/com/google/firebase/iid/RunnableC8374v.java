package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* renamed from: com.google.firebase.iid.v */
/* loaded from: classes2.dex */
class RunnableC8374v implements Runnable {

    /* renamed from: f */
    private final long f31768f;

    /* renamed from: g */
    private final PowerManager.WakeLock f31769g;

    /* renamed from: h */
    private final FirebaseInstanceId f31770h;

    /* renamed from: i */
    @VisibleForTesting
    ExecutorService f31771i = C8354b.m26201b();

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    @VisibleForTesting
    /* renamed from: com.google.firebase.iid.v$a */
    static class a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC8374v f31772a;

        public a(RunnableC8374v runnableC8374v) {
            this.f31772a = runnableC8374v;
        }

        /* renamed from: a */
        public void m26243a() {
            if (FirebaseInstanceId.m26170s()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f31772a.m26240b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC8374v runnableC8374v = this.f31772a;
            if (runnableC8374v != null && runnableC8374v.m26241c()) {
                if (FirebaseInstanceId.m26170s()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f31772a.f31770h.m26182f(this.f31772a, 0L);
                this.f31772a.m26240b().unregisterReceiver(this);
                this.f31772a = null;
            }
        }
    }

    @VisibleForTesting
    RunnableC8374v(FirebaseInstanceId firebaseInstanceId, long j2) {
        this.f31770h = firebaseInstanceId;
        this.f31768f = j2;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) m26240b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f31769g = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    /* renamed from: b */
    Context m26240b() {
        return this.f31770h.m26183g().m26404i();
    }

    /* renamed from: c */
    boolean m26241c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m26240b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    /* renamed from: d */
    boolean m26242d() throws IOException {
        if (!this.f31770h.m26179H(this.f31770h.m26189q())) {
            return true;
        }
        try {
            if (this.f31770h.m26181d() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e2) {
            if (!C8363k.m26206f(e2.getMessage())) {
                if (e2.getMessage() != null) {
                    throw e2;
                }
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
            sb.append("Token retrieval failed: ");
            sb.append(message);
            sb.append(". Will retry token retrieval");
            Log.w("FirebaseInstanceId", sb.toString());
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (C8372t.m26222a().m26224c(m26240b())) {
            this.f31769g.acquire();
        }
        try {
            try {
                this.f31770h.m26176D(true);
                if (!this.f31770h.m26191t()) {
                    this.f31770h.m26176D(false);
                    if (!C8372t.m26222a().m26224c(m26240b())) {
                        return;
                    }
                } else if (!C8372t.m26222a().m26223b(m26240b()) || m26241c()) {
                    if (m26242d()) {
                        this.f31770h.m26176D(false);
                    } else {
                        this.f31770h.m26178G(this.f31768f);
                    }
                    if (!C8372t.m26222a().m26224c(m26240b())) {
                        return;
                    }
                } else {
                    new a(this).m26243a();
                    if (!C8372t.m26222a().m26224c(m26240b())) {
                        return;
                    }
                }
            } catch (IOException e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                this.f31770h.m26176D(false);
                if (!C8372t.m26222a().m26224c(m26240b())) {
                    return;
                }
            }
            this.f31769g.release();
        } catch (Throwable th) {
            if (C8372t.m26222a().m26224c(m26240b())) {
                this.f31769g.release();
            }
            throw th;
        }
    }
}
