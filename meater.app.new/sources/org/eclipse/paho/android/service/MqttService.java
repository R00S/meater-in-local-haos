package org.eclipse.paho.android.service;

import Fc.k;
import Fc.m;
import P5.z;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class MqttService extends Service implements Ec.d {

    /* renamed from: B, reason: collision with root package name */
    private String f47221B;

    /* renamed from: D, reason: collision with root package name */
    c f47223D;

    /* renamed from: F, reason: collision with root package name */
    private g f47225F;

    /* renamed from: C, reason: collision with root package name */
    private boolean f47222C = false;

    /* renamed from: E, reason: collision with root package name */
    private volatile boolean f47224E = true;

    /* renamed from: G, reason: collision with root package name */
    private final Map<String, e> f47226G = new ConcurrentHashMap();

    /* renamed from: H, reason: collision with root package name */
    private final T4.i f47227H = new T4.i() { // from class: Ec.c
        @Override // T4.i
        public final void a(boolean z10, O4.b bVar) {
            this.f4158a.l(z10, bVar);
        }
    };

    private e j(String str) {
        e eVar = this.f47226G.get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Invalid ClientHandle");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(boolean z10, O4.b bVar) {
        b("MqttService", "Internal network status receive.");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "MQTT");
        wakeLockNewWakeLock.acquire();
        b("MqttService", "Reconnect for Network recovery.");
        if (k()) {
            b("MqttService", "Online,reconnect.");
            o();
        } else {
            m();
        }
        wakeLockNewWakeLock.release();
    }

    private void t(String str, String str2, String str3) {
        if (this.f47221B == null || !this.f47222C) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "trace");
        bundle.putString("MqttService.traceSeverity", str);
        bundle.putString("MqttService.traceTag", str2);
        bundle.putString("MqttService.errorMessage", str3);
        f(this.f47221B, j.ERROR, bundle);
    }

    @Override // Ec.d
    public void a(String str, String str2) {
        t("error", str, str2);
    }

    @Override // Ec.d
    public void b(String str, String str2) {
        t("debug", str, str2);
    }

    @Override // Ec.d
    public void c(String str, String str2, Exception exc) {
        if (this.f47221B != null) {
            Bundle bundle = new Bundle();
            bundle.putString("MqttService.callbackAction", "trace");
            bundle.putString("MqttService.traceSeverity", "exception");
            bundle.putString("MqttService.errorMessage", str2);
            bundle.putSerializable("MqttService.exception", exc);
            bundle.putString("MqttService.traceTag", str);
            f(this.f47221B, j.ERROR, bundle);
        }
    }

    public j e(String str, String str2) {
        return this.f47223D.c(str, str2) ? j.OK : j.ERROR;
    }

    void f(String str, j jVar, Bundle bundle) {
        Intent intent = new Intent("MqttService.callbackToActivity.v0");
        if (str != null) {
            intent.putExtra("MqttService.clientHandle", str);
        }
        intent.putExtra("MqttService.callbackStatus", jVar);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setPackage(getPackageName());
        T1.a.b(this).d(intent);
    }

    public void g(String str, k kVar, String str2, String str3) {
        j(str).j(kVar, str2, str3);
    }

    public void h(String str, String str2, String str3) {
        if (str != null) {
            j(str).l(str2, str3);
            this.f47226G.remove(str);
        }
        stopSelf();
    }

    public String i(String str, String str2, String str3, Fc.j jVar) {
        String str4 = str + ":" + str2 + ":" + str3;
        if (!this.f47226G.containsKey(str4)) {
            this.f47226G.put(str4, new e(this, str, str2, jVar, str4));
        }
        return str4;
    }

    public boolean k() {
        return this.f47224E && z.f14085a.b();
    }

    public void m() {
        Iterator<e> it = this.f47226G.values().iterator();
        while (it.hasNext()) {
            it.next().s();
        }
    }

    public Fc.c n(String str, String str2, m mVar, String str3, String str4) {
        return j(str).t(str2, mVar, str3, str4);
    }

    void o() {
        b("MqttService", "Reconnect to server, client size=" + this.f47226G.size());
        for (e eVar : this.f47226G.values()) {
            if (eVar != null) {
                b("Reconnect Client:", eVar.o() + '/' + eVar.p());
                if (k()) {
                    eVar.u();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f47225F.b(intent.getStringExtra("MqttService.activityToken"));
        return this.f47225F;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f47225F = new g(this);
        this.f47223D = new b(this, this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Iterator<e> it = this.f47226G.values().iterator();
        while (it.hasNext()) {
            it.next().l(null, null);
        }
        if (this.f47225F != null) {
            this.f47225F = null;
        }
        c cVar = this.f47223D;
        if (cVar != null) {
            cVar.close();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        p();
        return 2;
    }

    public void q(String str) {
        this.f47221B = str;
    }

    public void r(boolean z10) {
        this.f47222C = z10;
    }

    public void s(String str, String str2, int i10, String str3, String str4) {
        j(str).y(str2, i10, str3, str4);
    }

    public void u(String str, String str2, String str3, String str4) {
        if (str != null) {
            j(str).z(str2, str3, str4);
        }
    }

    private void p() {
    }
}
