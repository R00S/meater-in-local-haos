package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class GmsClientEventManager implements Handler.Callback {

    /* renamed from: f */
    private final GmsClientEventState f17750f;

    /* renamed from: m */
    private final Handler f17757m;

    /* renamed from: g */
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> f17751g = new ArrayList<>();

    /* renamed from: h */
    @VisibleForTesting
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> f17752h = new ArrayList<>();

    /* renamed from: i */
    private final ArrayList<GoogleApiClient.OnConnectionFailedListener> f17753i = new ArrayList<>();

    /* renamed from: j */
    private volatile boolean f17754j = false;

    /* renamed from: k */
    private final AtomicInteger f17755k = new AtomicInteger(0);

    /* renamed from: l */
    private boolean f17756l = false;

    /* renamed from: n */
    private final Object f17758n = new Object();

    @VisibleForTesting
    public interface GmsClientEventState {
        Bundle getConnectionHint();

        boolean isConnected();
    }

    public GmsClientEventManager(Looper looper, GmsClientEventState gmsClientEventState) {
        this.f17750f = gmsClientEventState;
        this.f17757m = new zap(looper, this);
    }

    /* renamed from: a */
    public final void m14331a() {
        this.f17754j = false;
        this.f17755k.incrementAndGet();
    }

    /* renamed from: b */
    public final void m14332b() {
        this.f17754j = true;
    }

    @VisibleForTesting
    /* renamed from: c */
    public final void m14333c(ConnectionResult connectionResult) {
        Preconditions.m14366e(this.f17757m, "onConnectionFailure must only be called on the Handler thread");
        this.f17757m.removeMessages(1);
        synchronized (this.f17758n) {
            ArrayList arrayList = new ArrayList(this.f17753i);
            int i2 = this.f17755k.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) obj;
                if (this.f17754j && this.f17755k.get() == i2) {
                    if (this.f17753i.contains(onConnectionFailedListener)) {
                        onConnectionFailedListener.mo13895E0(connectionResult);
                    }
                }
                return;
            }
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    public final void m14334d(Bundle bundle) {
        Preconditions.m14366e(this.f17757m, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f17758n) {
            boolean z = true;
            Preconditions.m14375n(!this.f17756l);
            this.f17757m.removeMessages(1);
            this.f17756l = true;
            if (this.f17752h.size() != 0) {
                z = false;
            }
            Preconditions.m14375n(z);
            ArrayList arrayList = new ArrayList(this.f17751g);
            int i2 = this.f17755k.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.f17754j || !this.f17750f.isConnected() || this.f17755k.get() != i2) {
                    break;
                } else if (!this.f17752h.contains(connectionCallbacks)) {
                    connectionCallbacks.mo13894P(bundle);
                }
            }
            this.f17752h.clear();
            this.f17756l = false;
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    public final void m14335e(int i2) {
        Preconditions.m14366e(this.f17757m, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f17757m.removeMessages(1);
        synchronized (this.f17758n) {
            this.f17756l = true;
            ArrayList arrayList = new ArrayList(this.f17751g);
            int i3 = this.f17755k.get();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.f17754j || this.f17755k.get() != i3) {
                    break;
                } else if (this.f17751g.contains(connectionCallbacks)) {
                    connectionCallbacks.mo13893H(i2);
                }
            }
            this.f17752h.clear();
            this.f17756l = false;
        }
    }

    /* renamed from: f */
    public final void m14336f(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.m14372k(connectionCallbacks);
        synchronized (this.f17758n) {
            if (this.f17751g.contains(connectionCallbacks)) {
                String strValueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(strValueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f17751g.add(connectionCallbacks);
            }
        }
        if (this.f17750f.isConnected()) {
            Handler handler = this.f17757m;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    /* renamed from: g */
    public final void m14337g(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.m14372k(onConnectionFailedListener);
        synchronized (this.f17758n) {
            if (this.f17753i.contains(onConnectionFailedListener)) {
                String strValueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(strValueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f17753i.add(onConnectionFailedListener);
            }
        }
    }

    /* renamed from: h */
    public final void m14338h(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.m14372k(onConnectionFailedListener);
        synchronized (this.f17758n) {
            if (!this.f17753i.remove(onConnectionFailedListener)) {
                String strValueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(strValueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i2);
            Log.wtf("GmsClientEvents", sb.toString(), new Exception());
            return false;
        }
        GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
        synchronized (this.f17758n) {
            if (this.f17754j && this.f17750f.isConnected() && this.f17751g.contains(connectionCallbacks)) {
                connectionCallbacks.mo13894P(this.f17750f.getConnectionHint());
            }
        }
        return true;
    }
}
