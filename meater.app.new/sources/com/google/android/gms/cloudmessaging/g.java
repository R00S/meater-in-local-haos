package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import b7.C2267q;
import g7.C3445p;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes2.dex */
final class g implements ServiceConnection {

    /* renamed from: D, reason: collision with root package name */
    h f33433D;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ l f33436G;

    /* renamed from: B, reason: collision with root package name */
    int f33431B = 0;

    /* renamed from: C, reason: collision with root package name */
    final Messenger f33432C = new Messenger(new q7.f(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.e
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i10);
            }
            g gVar = this.f33428B;
            synchronized (gVar) {
                try {
                    j jVar = (j) gVar.f33435F.get(i10);
                    if (jVar == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                        return true;
                    }
                    gVar.f33435F.remove(i10);
                    gVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        jVar.c(new zzt(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    jVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: E, reason: collision with root package name */
    final Queue f33434E = new ArrayDeque();

    /* renamed from: F, reason: collision with root package name */
    final SparseArray f33435F = new SparseArray();

    /* synthetic */ g(l lVar, C2267q c2267q) {
        this.f33436G = lVar;
    }

    final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    final synchronized void b(int i10, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f33431B;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f33431B = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f33431B = 4;
            j7.b.b().c(this.f33436G.f33444a, this);
            zzt zztVar = new zzt(i10, str, th);
            Iterator it = this.f33434E.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(zztVar);
            }
            this.f33434E.clear();
            for (int i12 = 0; i12 < this.f33435F.size(); i12++) {
                ((j) this.f33435F.valueAt(i12)).c(zztVar);
            }
            this.f33435F.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void c() {
        this.f33436G.f33445b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.b
            @Override // java.lang.Runnable
            public final void run() {
                final j jVar;
                while (true) {
                    final g gVar = this.f33425B;
                    synchronized (gVar) {
                        try {
                            if (gVar.f33431B != 2) {
                                return;
                            }
                            if (gVar.f33434E.isEmpty()) {
                                gVar.f();
                                return;
                            } else {
                                jVar = (j) gVar.f33434E.poll();
                                gVar.f33435F.put(jVar.f33439a, jVar);
                                gVar.f33436G.f33445b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        gVar.e(jVar.f33439a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(jVar)));
                    }
                    l lVar = gVar.f33436G;
                    Messenger messenger = gVar.f33432C;
                    int i10 = jVar.f33441c;
                    Context context = lVar.f33444a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = jVar.f33439a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", jVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", jVar.f33442d);
                    messageObtain.setData(bundle);
                    try {
                        gVar.f33433D.a(messageObtain);
                    } catch (RemoteException e10) {
                        gVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void d() {
        if (this.f33431B == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void e(int i10) {
        j jVar = (j) this.f33435F.get(i10);
        if (jVar != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f33435F.remove(i10);
            jVar.c(new zzt(3, "Timed out waiting for response", null));
            f();
        }
    }

    final synchronized void f() {
        try {
            if (this.f33431B == 2 && this.f33434E.isEmpty() && this.f33435F.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f33431B = 3;
                j7.b.b().c(this.f33436G.f33444a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized boolean g(j jVar) {
        int i10 = this.f33431B;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f33434E.add(jVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f33434E.add(jVar);
            c();
            return true;
        }
        this.f33434E.add(jVar);
        C3445p.n(this.f33431B == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f33431B = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (j7.b.b().a(this.f33436G.f33444a, intent, this, 1)) {
                this.f33436G.f33445b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33426B.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f33436G.f33445b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.a
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = this.f33423B;
                IBinder iBinder2 = iBinder;
                synchronized (gVar) {
                    if (iBinder2 == null) {
                        gVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        gVar.f33433D = new h(iBinder2);
                        gVar.f33431B = 2;
                        gVar.c();
                    } catch (RemoteException e10) {
                        gVar.a(0, e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f33436G.f33445b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f33427B.a(2, "Service disconnected");
            }
        });
    }
}
