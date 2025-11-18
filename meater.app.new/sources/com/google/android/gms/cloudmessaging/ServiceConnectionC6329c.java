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
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.c */
/* loaded from: classes2.dex */
final class ServiceConnectionC6329c implements ServiceConnection {

    /* renamed from: f */
    int f17154f;

    /* renamed from: g */
    final Messenger f17155g;

    /* renamed from: h */
    C6338l f17156h;

    /* renamed from: i */
    final Queue<AbstractC6339m<?>> f17157i;

    /* renamed from: j */
    final SparseArray<AbstractC6339m<?>> f17158j;

    /* renamed from: k */
    final /* synthetic */ zze f17159k;

    private ServiceConnectionC6329c(zze zzeVar) {
        this.f17159k = zzeVar;
        this.f17154f = 0;
        this.f17155g = new Messenger(new com.google.android.gms.internal.cloudmessaging.zze(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.android.gms.cloudmessaging.f

            /* renamed from: f */
            private final ServiceConnectionC6329c f17161f;

            {
                this.f17161f = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f17161f.m13768d(message);
            }
        }));
        this.f17157i = new ArrayDeque();
        this.f17158j = new SparseArray<>();
    }

    /* renamed from: a */
    final void m13765a() {
        this.f17159k.f17188c.execute(new Runnable(this) { // from class: com.google.android.gms.cloudmessaging.g

            /* renamed from: f */
            private final ServiceConnectionC6329c f17162f;

            {
                this.f17162f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC6339m<?> abstractC6339mPoll;
                final ServiceConnectionC6329c serviceConnectionC6329c = this.f17162f;
                while (true) {
                    synchronized (serviceConnectionC6329c) {
                        if (serviceConnectionC6329c.f17154f != 2) {
                            return;
                        }
                        if (serviceConnectionC6329c.f17157i.isEmpty()) {
                            serviceConnectionC6329c.m13770f();
                            return;
                        } else {
                            abstractC6339mPoll = serviceConnectionC6329c.f17157i.poll();
                            serviceConnectionC6329c.f17158j.put(abstractC6339mPoll.f17170a, abstractC6339mPoll);
                            serviceConnectionC6329c.f17159k.f17188c.schedule(new Runnable(serviceConnectionC6329c, abstractC6339mPoll) { // from class: com.google.android.gms.cloudmessaging.i

                                /* renamed from: f */
                                private final ServiceConnectionC6329c f17165f;

                                /* renamed from: g */
                                private final AbstractC6339m f17166g;

                                {
                                    this.f17165f = serviceConnectionC6329c;
                                    this.f17166g = abstractC6339mPoll;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f17165f.m13766b(this.f17166g.f17170a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(abstractC6339mPoll);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context context = serviceConnectionC6329c.f17159k.f17187b;
                    Messenger messenger = serviceConnectionC6329c.f17155g;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = abstractC6339mPoll.f17172c;
                    messageObtain.arg1 = abstractC6339mPoll.f17170a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC6339mPoll.mo13773d());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", abstractC6339mPoll.f17173d);
                    messageObtain.setData(bundle);
                    try {
                        serviceConnectionC6329c.f17156h.m13774a(messageObtain);
                    } catch (RemoteException e2) {
                        serviceConnectionC6329c.m13767c(2, e2.getMessage());
                    }
                }
            }
        });
    }

    /* renamed from: b */
    final synchronized void m13766b(int i2) {
        AbstractC6339m<?> abstractC6339m = this.f17158j.get(i2);
        if (abstractC6339m != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i2);
            Log.w("MessengerIpcClient", sb.toString());
            this.f17158j.remove(i2);
            abstractC6339m.m13775b(new zzp(3, "Timed out waiting for response"));
            m13770f();
        }
    }

    /* renamed from: c */
    final synchronized void m13767c(int i2, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        int i3 = this.f17154f;
        if (i3 == 0) {
            throw new IllegalStateException();
        }
        if (i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                this.f17154f = 4;
                return;
            } else {
                if (i3 == 4) {
                    return;
                }
                int i4 = this.f17154f;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i4);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f17154f = 4;
        ConnectionTracker.m14575b().m14581c(this.f17159k.f17187b, this);
        zzp zzpVar = new zzp(i2, str);
        Iterator<AbstractC6339m<?>> it = this.f17157i.iterator();
        while (it.hasNext()) {
            it.next().m13775b(zzpVar);
        }
        this.f17157i.clear();
        for (int i5 = 0; i5 < this.f17158j.size(); i5++) {
            this.f17158j.valueAt(i5).m13775b(zzpVar);
        }
        this.f17158j.clear();
    }

    /* renamed from: d */
    final boolean m13768d(Message message) {
        int i2 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            AbstractC6339m<?> abstractC6339m = this.f17158j.get(i2);
            if (abstractC6339m == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i2);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.f17158j.remove(i2);
            m13770f();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                abstractC6339m.m13775b(new zzp(4, "Not supported by GmsCore"));
            } else {
                abstractC6339m.mo13772a(data);
            }
            return true;
        }
    }

    /* renamed from: e */
    final synchronized boolean m13769e(AbstractC6339m<?> abstractC6339m) {
        int i2 = this.f17154f;
        if (i2 == 0) {
            this.f17157i.add(abstractC6339m);
            Preconditions.m14375n(this.f17154f == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f17154f = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (ConnectionTracker.m14575b().m14580a(this.f17159k.f17187b, intent, this, 1)) {
                this.f17159k.f17188c.schedule(new Runnable(this) { // from class: com.google.android.gms.cloudmessaging.e

                    /* renamed from: f */
                    private final ServiceConnectionC6329c f17160f;

                    {
                        this.f17160f = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17160f.m13771g();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                m13767c(0, "Unable to bind to service");
            }
            return true;
        }
        if (i2 == 1) {
            this.f17157i.add(abstractC6339m);
            return true;
        }
        if (i2 == 2) {
            this.f17157i.add(abstractC6339m);
            m13765a();
            return true;
        }
        if (i2 != 3 && i2 != 4) {
            int i3 = this.f17154f;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    /* renamed from: f */
    final synchronized void m13770f() {
        if (this.f17154f == 2 && this.f17157i.isEmpty() && this.f17158j.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f17154f = 3;
            ConnectionTracker.m14575b().m14581c(this.f17159k.f17187b, this);
        }
    }

    /* renamed from: g */
    final synchronized void m13771g() {
        if (this.f17154f == 1) {
            m13767c(1, "Timed out while binding");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f17159k.f17188c.execute(new Runnable(this, iBinder) { // from class: com.google.android.gms.cloudmessaging.h

            /* renamed from: f */
            private final ServiceConnectionC6329c f17163f;

            /* renamed from: g */
            private final IBinder f17164g;

            {
                this.f17163f = this;
                this.f17164g = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC6329c serviceConnectionC6329c = this.f17163f;
                IBinder iBinder2 = this.f17164g;
                synchronized (serviceConnectionC6329c) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC6329c.m13767c(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC6329c.f17156h = new C6338l(iBinder2);
                            serviceConnectionC6329c.f17154f = 2;
                            serviceConnectionC6329c.m13765a();
                        } catch (RemoteException e2) {
                            serviceConnectionC6329c.m13767c(0, e2.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
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
        this.f17159k.f17188c.execute(new Runnable(this) { // from class: com.google.android.gms.cloudmessaging.j

            /* renamed from: f */
            private final ServiceConnectionC6329c f17167f;

            {
                this.f17167f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f17167f.m13767c(2, "Service disconnected");
            }
        });
    }
}
