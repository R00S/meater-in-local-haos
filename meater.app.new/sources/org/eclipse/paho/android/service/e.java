package org.eclipse.paho.android.service;

import Fc.k;
import Fc.m;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.paho.android.service.c;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;

/* compiled from: MqttConnection.java */
/* loaded from: classes3.dex */
class e implements Fc.i {

    /* renamed from: a, reason: collision with root package name */
    private String f47273a;

    /* renamed from: b, reason: collision with root package name */
    private String f47274b;

    /* renamed from: c, reason: collision with root package name */
    private Fc.j f47275c;

    /* renamed from: d, reason: collision with root package name */
    private k f47276d;

    /* renamed from: e, reason: collision with root package name */
    private String f47277e;

    /* renamed from: h, reason: collision with root package name */
    private MqttService f47280h;

    /* renamed from: q, reason: collision with root package name */
    private String f47289q;

    /* renamed from: f, reason: collision with root package name */
    private String f47278f = null;

    /* renamed from: g, reason: collision with root package name */
    private Fc.f f47279g = null;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f47281i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f47282j = true;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f47283k = false;

    /* renamed from: l, reason: collision with root package name */
    private final Map<Fc.c, String> f47284l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private final Map<Fc.c, m> f47285m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private final Map<Fc.c, String> f47286n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private final Map<Fc.c, String> f47287o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    private PowerManager.WakeLock f47288p = null;

    /* compiled from: MqttConnection.java */
    class a extends d {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f47290c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Bundle bundle, Bundle bundle2) {
            super(bundle);
            this.f47290c = bundle2;
        }

        @Override // org.eclipse.paho.android.service.e.d, Fc.a
        public void a(Fc.e eVar) {
            e.this.n(this.f47290c);
            e.this.f47280h.b("MqttConnection", "connect success!");
        }

        @Override // org.eclipse.paho.android.service.e.d, Fc.a
        public void b(Fc.e eVar, Throwable th) {
            this.f47290c.putString("MqttService.errorMessage", th.getLocalizedMessage());
            this.f47290c.putSerializable("MqttService.exception", th);
            e.this.f47280h.a("MqttConnection", "connect fail, call connect to reconnect.reason:" + th.getMessage());
            e.this.m(this.f47290c);
        }
    }

    /* compiled from: MqttConnection.java */
    class c extends d {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f47292c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bundle bundle, Bundle bundle2) {
            super(bundle);
            this.f47292c = bundle2;
        }

        @Override // org.eclipse.paho.android.service.e.d, Fc.a
        public void a(Fc.e eVar) {
            e.this.f47280h.b("MqttConnection", "Reconnect Success!");
            e.this.f47280h.b("MqttConnection", "DeliverBacklog when reconnect.");
            e.this.n(this.f47292c);
        }

        @Override // org.eclipse.paho.android.service.e.d, Fc.a
        public void b(Fc.e eVar, Throwable th) {
            this.f47292c.putString("MqttService.errorMessage", th.getLocalizedMessage());
            this.f47292c.putSerializable("MqttService.exception", th);
            e.this.f47280h.f(e.this.f47277e, j.ERROR, this.f47292c);
            e.this.m(this.f47292c);
        }
    }

    /* compiled from: MqttConnection.java */
    private class d implements Fc.a {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f47294a;

        @Override // Fc.a
        public void a(Fc.e eVar) {
            e.this.f47280h.f(e.this.f47277e, j.OK, this.f47294a);
        }

        @Override // Fc.a
        public void b(Fc.e eVar, Throwable th) {
            this.f47294a.putString("MqttService.errorMessage", th.getLocalizedMessage());
            this.f47294a.putSerializable("MqttService.exception", th);
            e.this.f47280h.f(e.this.f47277e, j.ERROR, this.f47294a);
        }

        private d(Bundle bundle) {
            this.f47294a = bundle;
        }
    }

    e(MqttService mqttService, String str, String str2, Fc.j jVar, String str3) {
        this.f47275c = null;
        this.f47280h = null;
        this.f47289q = null;
        this.f47273a = str;
        this.f47280h = mqttService;
        this.f47274b = str2;
        this.f47275c = jVar;
        this.f47277e = str3;
        StringBuffer stringBuffer = new StringBuffer(getClass().getCanonicalName());
        stringBuffer.append(" ");
        stringBuffer.append(str2);
        stringBuffer.append(" ");
        stringBuffer.append("on host ");
        stringBuffer.append(str);
        this.f47289q = stringBuffer.toString();
    }

    private void i() {
        if (this.f47288p == null) {
            this.f47288p = ((PowerManager) this.f47280h.getSystemService("power")).newWakeLock(1, this.f47289q);
        }
        this.f47288p.acquire();
    }

    private void k() {
        Iterator<c.a> itA = this.f47280h.f47223D.a(this.f47277e);
        while (itA.hasNext()) {
            c.a next = itA.next();
            Bundle bundleR = r(next.b(), next.c(), next.a());
            bundleR.putString("MqttService.callbackAction", "messageArrived");
            this.f47280h.f(this.f47277e, j.OK, bundleR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Bundle bundle) {
        i();
        this.f47281i = true;
        w(false);
        this.f47280h.f(this.f47277e, j.ERROR, bundle);
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Bundle bundle) {
        i();
        this.f47280h.f(this.f47277e, j.OK, bundle);
        k();
        w(false);
        this.f47281i = false;
        v();
    }

    private void q(Bundle bundle, Exception exc) {
        bundle.putString("MqttService.errorMessage", exc.getLocalizedMessage());
        bundle.putSerializable("MqttService.exception", exc);
        this.f47280h.f(this.f47277e, j.ERROR, bundle);
    }

    private Bundle r(String str, String str2, m mVar) {
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.messageId", str);
        bundle.putString("MqttService.destinationName", str2);
        bundle.putParcelable("MqttService.PARCEL", new i(mVar));
        return bundle;
    }

    private void v() {
        PowerManager.WakeLock wakeLock = this.f47288p;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.f47288p.release();
    }

    private void x(String str, m mVar, Fc.c cVar, String str2, String str3) {
        this.f47284l.put(cVar, str);
        this.f47285m.put(cVar, mVar);
        this.f47286n.put(cVar, str3);
        this.f47287o.put(cVar, str2);
    }

    @Override // Fc.h
    public void a(String str, m mVar) {
        this.f47280h.b("MqttConnection", "messageArrived(" + str + ",{" + mVar.toString() + "})");
        String strB = this.f47280h.f47223D.b(this.f47277e, str, mVar);
        Bundle bundleR = r(strB, str, mVar);
        bundleR.putString("MqttService.callbackAction", "messageArrived");
        bundleR.putString("MqttService.messageId", strB);
        this.f47280h.f(this.f47277e, j.OK, bundleR);
    }

    @Override // Fc.h
    public void b(Throwable th) {
        this.f47280h.b("MqttConnection", "connectionLost(" + th.getMessage() + ")");
        this.f47281i = true;
        try {
            this.f47279g.q(null, new b(this));
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "onConnectionLost");
        bundle.putString("MqttService.errorMessage", th.getMessage());
        if (th instanceof MqttException) {
            bundle.putSerializable("MqttService.exception", th);
        }
        bundle.putString("MqttService.exceptionStack", Log.getStackTraceString(th));
        this.f47280h.f(this.f47277e, j.OK, bundle);
        v();
    }

    @Override // Fc.i
    public void c(boolean z10, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "connectExtended");
        bundle.putBoolean("MqttService.reconnect", z10);
        bundle.putString("MqttService.serverURI", str);
        this.f47280h.f(this.f47277e, j.OK, bundle);
    }

    @Override // Fc.h
    public void d(Fc.c cVar) {
        this.f47280h.b("MqttConnection", "deliveryComplete(" + cVar + ")");
        m mVarRemove = this.f47285m.remove(cVar);
        if (mVarRemove != null) {
            String strRemove = this.f47284l.remove(cVar);
            String strRemove2 = this.f47286n.remove(cVar);
            String strRemove3 = this.f47287o.remove(cVar);
            Bundle bundleR = r(null, strRemove, mVarRemove);
            if (strRemove2 != null) {
                bundleR.putString("MqttService.callbackAction", "send");
                bundleR.putString("MqttService.activityToken", strRemove2);
                bundleR.putString("MqttService.invocationContext", strRemove3);
                this.f47280h.f(this.f47277e, j.OK, bundleR);
            }
            bundleR.putString("MqttService.callbackAction", "messageDelivered");
            this.f47280h.f(this.f47277e, j.OK, bundleR);
        }
    }

    public void j(k kVar, String str, String str2) {
        this.f47276d = kVar;
        this.f47278f = str2;
        if (kVar != null) {
            this.f47282j = kVar.n();
        }
        if (this.f47276d.n()) {
            this.f47280h.f47223D.d(this.f47277e);
        }
        this.f47280h.b("MqttConnection", "Connecting {" + this.f47273a + "} as {" + this.f47274b + "}");
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.activityToken", str2);
        bundle.putString("MqttService.invocationContext", str);
        bundle.putString("MqttService.callbackAction", "connect");
        try {
            if (this.f47275c == null) {
                File externalFilesDir = this.f47280h.getExternalFilesDir("MqttConnection");
                if (externalFilesDir == null && (externalFilesDir = this.f47280h.getDir("MqttConnection", 0)) == null) {
                    bundle.putString("MqttService.errorMessage", "Error! No external and internal storage available");
                    bundle.putSerializable("MqttService.exception", new MqttPersistenceException());
                    this.f47280h.f(this.f47277e, j.ERROR, bundle);
                    return;
                }
                this.f47275c = new Lc.b(externalFilesDir.getAbsolutePath());
            }
            a aVar = new a(bundle, bundle);
            if (this.f47279g == null) {
                Fc.f fVar = new Fc.f(this.f47273a, this.f47274b, this.f47275c, new org.eclipse.paho.android.service.a(this.f47280h));
                this.f47279g = fVar;
                fVar.z(this);
                this.f47280h.b("MqttConnection", "Do Real connect!");
                w(true);
                this.f47279g.m(this.f47276d, str, aVar);
                return;
            }
            if (this.f47283k) {
                this.f47280h.b("MqttConnection", "myClient != null and the client is connecting. Connect return directly.");
                this.f47280h.b("MqttConnection", "Connect return:isConnecting:" + this.f47283k + ".disconnected:" + this.f47281i);
                return;
            }
            if (!this.f47281i) {
                this.f47280h.b("MqttConnection", "myClient != null and the client is connected and notify!");
                n(bundle);
            } else {
                this.f47280h.b("MqttConnection", "myClient != null and the client is not connected");
                this.f47280h.b("MqttConnection", "Do Real connect!");
                w(true);
                this.f47279g.m(this.f47276d, str, aVar);
            }
        } catch (Exception e10) {
            q(bundle, e10);
        }
    }

    void l(String str, String str2) {
        this.f47280h.b("MqttConnection", "disconnect()");
        this.f47281i = true;
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.activityToken", str2);
        bundle.putString("MqttService.invocationContext", str);
        bundle.putString("MqttService.callbackAction", "disconnect");
        Fc.f fVar = this.f47279g;
        if (fVar == null || !fVar.w()) {
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f47280h.a("disconnect", "not connected");
            this.f47280h.f(this.f47277e, j.ERROR, bundle);
        } else {
            new d(bundle);
            try {
                this.f47279g.r();
            } catch (Exception e10) {
                q(bundle, e10);
            }
        }
        k kVar = this.f47276d;
        if (kVar != null && kVar.n()) {
            this.f47280h.f47223D.d(this.f47277e);
        }
        v();
    }

    public String o() {
        return this.f47274b;
    }

    public String p() {
        return this.f47273a;
    }

    void s() {
        if (this.f47281i || this.f47282j) {
            return;
        }
        b(new Exception("Android offline"));
    }

    public Fc.c t(String str, m mVar, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "send");
        bundle.putString("MqttService.activityToken", str3);
        bundle.putString("MqttService.invocationContext", str2);
        Fc.f fVar = this.f47279g;
        Fc.c cVarX = null;
        byte b10 = 0;
        if (fVar == null || !fVar.w()) {
            Log.i("MqttConnection", "Client is not connected, so not sending message");
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f47280h.a("send", "not connected");
            this.f47280h.f(this.f47277e, j.ERROR, bundle);
            return null;
        }
        try {
            cVarX = this.f47279g.x(str, mVar, str2, new d(bundle));
            x(str, mVar, cVarX, str2, str3);
            return cVarX;
        } catch (Exception e10) {
            q(bundle, e10);
            return cVarX;
        }
    }

    synchronized void u() {
        if (this.f47283k) {
            this.f47280h.b("MqttConnection", "The client is connecting. Reconnect return directly.");
            return;
        }
        if (!this.f47280h.k()) {
            this.f47280h.b("MqttConnection", "The network is not reachable. Will not do reconnect");
            return;
        }
        if (this.f47281i && !this.f47282j) {
            this.f47280h.b("MqttConnection", "Do Real Reconnect!");
            Bundle bundle = new Bundle();
            bundle.putString("MqttService.activityToken", this.f47278f);
            bundle.putString("MqttService.invocationContext", null);
            bundle.putString("MqttService.callbackAction", "connect");
            try {
                try {
                    this.f47279g.m(this.f47276d, null, new c(bundle, bundle));
                    w(true);
                } catch (Exception e10) {
                    this.f47280h.a("MqttConnection", "Cannot reconnect to remote server." + e10.getMessage());
                    w(false);
                    q(bundle, new MqttException(6, e10.getCause()));
                }
            } catch (MqttException e11) {
                this.f47280h.a("MqttConnection", "Cannot reconnect to remote server." + e11.getMessage());
                w(false);
                q(bundle, e11);
            }
        }
    }

    synchronized void w(boolean z10) {
        this.f47283k = z10;
    }

    public void y(String str, int i10, String str2, String str3) {
        this.f47280h.b("MqttConnection", "subscribe({" + str + "}," + i10 + ",{" + str2 + "}, {" + str3 + "}");
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "subscribe");
        bundle.putString("MqttService.activityToken", str3);
        bundle.putString("MqttService.invocationContext", str2);
        Fc.f fVar = this.f47279g;
        if (fVar == null || !fVar.w()) {
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f47280h.a("subscribe", "not connected");
            this.f47280h.f(this.f47277e, j.ERROR, bundle);
        } else {
            try {
                this.f47279g.C(str, i10, str2, new d(bundle));
            } catch (Exception e10) {
                q(bundle, e10);
            }
        }
    }

    void z(String str, String str2, String str3) {
        this.f47280h.b("MqttConnection", "unsubscribe({" + str + "},{" + str2 + "}, {" + str3 + "})");
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "unsubscribe");
        bundle.putString("MqttService.activityToken", str3);
        bundle.putString("MqttService.invocationContext", str2);
        Fc.f fVar = this.f47279g;
        if (fVar == null || !fVar.w()) {
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f47280h.a("subscribe", "not connected");
            this.f47280h.f(this.f47277e, j.ERROR, bundle);
        } else {
            try {
                this.f47279g.E(str, str2, new d(bundle));
            } catch (Exception e10) {
                q(bundle, e10);
            }
        }
    }

    /* compiled from: MqttConnection.java */
    class b implements Fc.a {
        b(e eVar) {
        }

        @Override // Fc.a
        public void a(Fc.e eVar) {
        }

        @Override // Fc.a
        public void b(Fc.e eVar, Throwable th) {
        }
    }
}
