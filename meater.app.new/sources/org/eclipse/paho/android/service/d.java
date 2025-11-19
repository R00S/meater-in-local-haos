package org.eclipse.paho.android.service;

import Fc.k;
import Fc.m;
import P5.Q;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: MqttAndroidClient.java */
/* loaded from: classes3.dex */
public class d extends BroadcastReceiver implements Fc.b {

    /* renamed from: S, reason: collision with root package name */
    private static final ExecutorService f47250S = Executors.newCachedThreadPool();

    /* renamed from: B, reason: collision with root package name */
    private final c f47251B;

    /* renamed from: C, reason: collision with root package name */
    public MqttService f47252C;

    /* renamed from: D, reason: collision with root package name */
    private String f47253D;

    /* renamed from: E, reason: collision with root package name */
    Context f47254E;

    /* renamed from: F, reason: collision with root package name */
    private final SparseArray<Fc.e> f47255F;

    /* renamed from: G, reason: collision with root package name */
    private int f47256G;

    /* renamed from: H, reason: collision with root package name */
    private final String f47257H;

    /* renamed from: I, reason: collision with root package name */
    private final String f47258I;

    /* renamed from: J, reason: collision with root package name */
    private Fc.j f47259J;

    /* renamed from: K, reason: collision with root package name */
    private k f47260K;

    /* renamed from: L, reason: collision with root package name */
    private Fc.e f47261L;

    /* renamed from: M, reason: collision with root package name */
    private Fc.h f47262M;

    /* renamed from: N, reason: collision with root package name */
    private Ec.d f47263N;

    /* renamed from: O, reason: collision with root package name */
    private final b f47264O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f47265P;

    /* renamed from: Q, reason: collision with root package name */
    private volatile boolean f47266Q;

    /* renamed from: R, reason: collision with root package name */
    private volatile boolean f47267R;

    /* compiled from: MqttAndroidClient.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.l();
            if (d.this.f47266Q) {
                return;
            }
            d dVar = d.this;
            dVar.q(dVar);
        }
    }

    /* compiled from: MqttAndroidClient.java */
    public enum b {
        AUTO_ACK,
        MANUAL_ACK
    }

    /* compiled from: MqttAndroidClient.java */
    private final class c implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (g.class.isAssignableFrom(iBinder.getClass())) {
                d.this.f47252C = ((g) iBinder).a();
                d.this.f47267R = true;
                d.this.l();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d.this.f47252C = null;
        }

        private c() {
        }
    }

    public d(Context context, String str, String str2) {
        this(context, str, str2, null, b.AUTO_ACK);
    }

    private void A(Bundle bundle) {
        u(r(bundle), bundle);
    }

    private void g(Bundle bundle) {
        Fc.e eVar = this.f47261L;
        r(bundle);
        u(eVar, bundle);
    }

    private void h(Bundle bundle) {
        if (this.f47262M instanceof Fc.i) {
            ((Fc.i) this.f47262M).c(bundle.getBoolean("MqttService.reconnect", false), bundle.getString("MqttService.serverURI"));
        }
    }

    private void i(Bundle bundle) {
        if (this.f47262M != null) {
            this.f47262M.b((Exception) Q.m(bundle, "MqttService.exception", Exception.class));
        }
    }

    private void k(Bundle bundle) {
        this.f47253D = null;
        Fc.e eVarR = r(bundle);
        if (eVarR != null) {
            ((h) eVarR).f();
        }
        Fc.h hVar = this.f47262M;
        if (hVar != null) {
            hVar.b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f47253D == null) {
            this.f47253D = this.f47252C.i(this.f47257H, this.f47258I, this.f47254E.getApplicationInfo().packageName, this.f47259J);
        }
        this.f47252C.r(this.f47265P);
        this.f47252C.q(this.f47253D);
        try {
            this.f47252C.g(this.f47253D, this.f47260K, null, v(this.f47261L));
        } catch (MqttException e10) {
            Fc.a aVarA = this.f47261L.a();
            if (aVarA != null) {
                aVarA.b(this.f47261L, e10);
            }
        }
    }

    private synchronized Fc.e m(Bundle bundle) {
        return this.f47255F.get(Integer.parseInt(bundle.getString("MqttService.activityToken")));
    }

    private void n(Bundle bundle) {
        if (this.f47262M != null) {
            String string = bundle.getString("MqttService.messageId");
            String string2 = bundle.getString("MqttService.destinationName");
            i iVar = (i) Q.k(bundle, "MqttService.PARCEL", i.class);
            try {
                if (this.f47264O == b.AUTO_ACK) {
                    this.f47262M.a(string2, iVar);
                    this.f47252C.e(this.f47253D, string);
                } else {
                    iVar.f47308H = string;
                    this.f47262M.a(string2, iVar);
                }
            } catch (Exception unused) {
            }
        }
    }

    private void o(Bundle bundle) {
        Fc.e eVarR = r(bundle);
        if (eVarR == null || this.f47262M == null || ((j) Q.m(bundle, "MqttService.callbackStatus", j.class)) != j.OK || !(eVarR instanceof Fc.c)) {
            return;
        }
        this.f47262M.d((Fc.c) eVarR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("MqttService.callbackToActivity.v0");
        T1.a.b(this.f47254E).c(broadcastReceiver, intentFilter);
        this.f47266Q = true;
    }

    private synchronized Fc.e r(Bundle bundle) {
        String string = bundle.getString("MqttService.activityToken");
        if (string == null) {
            return null;
        }
        int i10 = Integer.parseInt(string);
        Fc.e eVar = this.f47255F.get(i10);
        this.f47255F.delete(i10);
        return eVar;
    }

    private void s(Bundle bundle) {
        u(m(bundle), bundle);
    }

    private void u(Fc.e eVar, Bundle bundle) {
        if (eVar == null) {
            this.f47252C.a("MqttService", "simpleAction : token is null");
        } else if (((j) Q.m(bundle, "MqttService.callbackStatus", j.class)) == j.OK) {
            ((h) eVar).f();
        } else {
            ((h) eVar).g((Exception) Q.m(bundle, "MqttService.exception", Exception.class));
        }
    }

    private synchronized String v(Fc.e eVar) {
        int i10;
        this.f47255F.put(this.f47256G, eVar);
        i10 = this.f47256G;
        this.f47256G = i10 + 1;
        return Integer.toString(i10);
    }

    private void y(Bundle bundle) {
        u(r(bundle), bundle);
    }

    private void z(Bundle bundle) {
        if (this.f47263N != null) {
            String string = bundle.getString("MqttService.traceSeverity");
            String string2 = bundle.getString("MqttService.errorMessage");
            String string3 = bundle.getString("MqttService.traceTag");
            if ("debug".equals(string)) {
                this.f47263N.b(string3, string2);
            } else if ("error".equals(string)) {
                this.f47263N.a(string3, string2);
            } else {
                this.f47263N.c(string3, string2, (Exception) Q.m(bundle, "MqttService.exception", Exception.class));
            }
        }
    }

    public Fc.e B(String str) {
        return C(str, null, null);
    }

    public Fc.e C(String str, Object obj, Fc.a aVar) throws MqttException {
        if (this.f47252C == null) {
            throw new MqttException(32104);
        }
        h hVar = new h(this, obj, aVar);
        this.f47252C.u(this.f47253D, str, null, v(hVar));
        return hVar;
    }

    @Override // Fc.b
    public String a() {
        return this.f47258I;
    }

    public Fc.e f(k kVar, Object obj, Fc.a aVar) {
        Fc.a aVarA;
        if (!x4.g.y()) {
            U4.b.e("Oreo os = app in background ", new Object[0]);
            return null;
        }
        Fc.e hVar = new h(this, obj, aVar);
        this.f47260K = kVar;
        this.f47261L = hVar;
        if (this.f47252C == null) {
            Intent intent = new Intent();
            intent.setClassName(this.f47254E, "org.eclipse.paho.android.service.MqttService");
            if (this.f47254E.startService(intent) == null && (aVarA = hVar.a()) != null) {
                aVarA.b(hVar, new RuntimeException("cannot start service org.eclipse.paho.android.service.MqttService"));
            }
            this.f47254E.bindService(intent, this.f47251B, 1);
            if (!this.f47266Q) {
                q(this);
            }
        } else {
            f47250S.execute(new a());
        }
        return hVar;
    }

    public Fc.e j() {
        h hVar = new h(this, null, null);
        String strV = v(hVar);
        MqttService mqttService = this.f47252C;
        if (mqttService == null) {
            return null;
        }
        mqttService.h(this.f47253D, null, strV);
        return hVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("MqttService.clientHandle");
        if (string == null || !string.equals(this.f47253D)) {
            return;
        }
        String string2 = extras.getString("MqttService.callbackAction");
        if ("connect".equals(string2)) {
            g(extras);
            return;
        }
        if ("connectExtended".equals(string2)) {
            h(extras);
            return;
        }
        if ("messageArrived".equals(string2)) {
            n(extras);
            return;
        }
        if ("subscribe".equals(string2)) {
            y(extras);
            return;
        }
        if ("unsubscribe".equals(string2)) {
            A(extras);
            return;
        }
        if ("send".equals(string2)) {
            s(extras);
            return;
        }
        if ("messageDelivered".equals(string2)) {
            o(extras);
            return;
        }
        if ("onConnectionLost".equals(string2)) {
            i(extras);
            return;
        }
        if ("disconnect".equals(string2)) {
            k(extras);
        } else if ("trace".equals(string2)) {
            z(extras);
        } else {
            this.f47252C.a("MqttService", "Callback action doesn't exist.");
        }
    }

    public Fc.c p(String str, m mVar, Object obj, Fc.a aVar) {
        f fVar = new f(this, obj, aVar, mVar);
        fVar.h(this.f47252C.n(this.f47253D, str, mVar, null, v(fVar)));
        return fVar;
    }

    public void t(Fc.h hVar) {
        this.f47262M = hVar;
    }

    public Fc.e w(String str, int i10) {
        return x(str, i10, null, null);
    }

    public Fc.e x(String str, int i10, Object obj, Fc.a aVar) throws MqttException {
        if (this.f47252C == null) {
            throw new MqttException(32104);
        }
        h hVar = new h(this, obj, aVar, new String[]{str});
        this.f47252C.s(this.f47253D, str, i10, null, v(hVar));
        return hVar;
    }

    public d(Context context, String str, String str2, Fc.j jVar, b bVar) {
        this.f47251B = new c();
        this.f47255F = new SparseArray<>();
        this.f47256G = 0;
        this.f47259J = null;
        this.f47265P = false;
        this.f47266Q = false;
        this.f47267R = false;
        this.f47254E = context;
        this.f47257H = str;
        this.f47258I = str2;
        this.f47259J = jVar;
        this.f47264O = bVar;
    }
}
