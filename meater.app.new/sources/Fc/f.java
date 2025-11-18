package Fc;

import Jc.r;
import Jc.t;
import com.apptionlabs.meater_app.data.Config;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

/* compiled from: MqttAsyncClient.java */
/* loaded from: classes3.dex */
public class f implements Fc.b {

    /* renamed from: L, reason: collision with root package name */
    private static final String f4718L = "Fc.f";

    /* renamed from: M, reason: collision with root package name */
    private static final Kc.b f4719M = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f.class.getName());

    /* renamed from: N, reason: collision with root package name */
    private static int f4720N = 1000;

    /* renamed from: B, reason: collision with root package name */
    private final String f4721B;

    /* renamed from: C, reason: collision with root package name */
    private final String f4722C;

    /* renamed from: D, reason: collision with root package name */
    protected Gc.a f4723D;

    /* renamed from: E, reason: collision with root package name */
    private final Hashtable<String, q> f4724E;

    /* renamed from: F, reason: collision with root package name */
    private j f4725F;

    /* renamed from: G, reason: collision with root package name */
    private h f4726G;

    /* renamed from: H, reason: collision with root package name */
    private k f4727H;

    /* renamed from: I, reason: collision with root package name */
    private Object f4728I;

    /* renamed from: J, reason: collision with root package name */
    private Timer f4729J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f4730K = false;

    /* compiled from: MqttAsyncClient.java */
    class b implements Fc.a {
        b() {
        }

        @Override // Fc.a
        public void a(e eVar) {
            f.f4719M.g(f.f4718L, "attemptReconnect", "501", new Object[]{eVar.b().a()});
            f.this.f4723D.K(false);
            f.this.B();
        }

        @Override // Fc.a
        public void b(e eVar, Throwable th) {
            f.f4719M.g(f.f4718L, "attemptReconnect", "502", new Object[]{eVar.b().a()});
            if (f.f4720N < 128000) {
                f.f4720N *= 2;
            }
            f.this.y(f.f4720N);
        }
    }

    /* compiled from: MqttAsyncClient.java */
    private class c extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            f.f4719M.c(f.f4718L, "ReconnectTask.run", "506");
            f.this.l();
        }

        private c() {
        }
    }

    public f(String str, String str2, j jVar, o oVar) {
        int i10 = 0;
        f4719M.d(str2);
        if (str2 == null) {
            throw new IllegalArgumentException("Null clientId");
        }
        int i11 = 0;
        while (i10 < str2.length() - 1) {
            if (k(str2.charAt(i10))) {
                i10++;
            }
            i11++;
            i10++;
        }
        if (i11 > 65535) {
            throw new IllegalArgumentException("ClientId longer than 65535 characters");
        }
        k.u(str);
        this.f4722C = str;
        this.f4721B = str2;
        this.f4725F = jVar;
        if (jVar == null) {
            this.f4725F = new Lc.a();
        }
        f4719M.g(f4718L, "MqttAsyncClient", "101", new Object[]{str2, str, jVar});
        this.f4725F.d(str2, str);
        this.f4723D = new Gc.a(this, this.f4725F, oVar);
        this.f4725F.close();
        this.f4724E = new Hashtable<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        f4719M.g(f4718L, "startReconnectCycle", "503", new Object[]{this.f4721B, Long.valueOf(f4720N)});
        Timer timer = new Timer("MQTT Reconnect: " + this.f4721B);
        this.f4729J = timer;
        timer.schedule(new c(), (long) f4720N);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        f4719M.g(f4718L, "stopReconnectCycle", "504", new Object[]{this.f4721B});
        this.f4729J.cancel();
        f4720N = 1000;
    }

    protected static boolean k(char c10) {
        return c10 >= 55296 && c10 <= 56319;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        f4719M.g(f4718L, "attemptReconnect", "500", new Object[]{this.f4721B});
        try {
            m(this.f4727H, this.f4728I, new b());
        } catch (MqttSecurityException e10) {
            f4719M.e(f4718L, "attemptReconnect", "804", null, e10);
        } catch (MqttException e11) {
            f4719M.e(f4718L, "attemptReconnect", "804", null, e11);
        }
    }

    private Gc.m n(String str, k kVar) throws NoSuchAlgorithmException, UnrecoverableKeyException, MqttException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        Hc.a aVar;
        String[] strArrE;
        Hc.a aVar2;
        String[] strArrE2;
        f4719M.g(f4718L, "createNetworkModule", "115", new Object[]{str});
        SocketFactory socketFactoryI = kVar.i();
        int iU = k.u(str);
        if (iU == 0) {
            String strSubstring = str.substring(6);
            String strT = t(strSubstring);
            int iU2 = u(strSubstring, 1883);
            if (socketFactoryI == null) {
                socketFactoryI = SocketFactory.getDefault();
            } else if (socketFactoryI instanceof SSLSocketFactory) {
                throw Gc.h.a(32105);
            }
            Gc.p pVar = new Gc.p(socketFactoryI, strT, iU2, this.f4721B);
            pVar.d(kVar.a());
            return pVar;
        }
        if (iU == 1) {
            String strSubstring2 = str.substring(6);
            String strT2 = t(strSubstring2);
            int iU3 = u(strSubstring2, 8883);
            if (socketFactoryI == null) {
                Hc.a aVar3 = new Hc.a();
                Properties propertiesG = kVar.g();
                if (propertiesG != null) {
                    aVar3.t(propertiesG, null);
                }
                aVar = aVar3;
                socketFactoryI = aVar3.c(null);
            } else {
                if (!(socketFactoryI instanceof SSLSocketFactory)) {
                    throw Gc.h.a(32105);
                }
                aVar = null;
            }
            Gc.o oVar = new Gc.o((SSLSocketFactory) socketFactoryI, strT2, iU3, this.f4721B);
            oVar.f(kVar.a());
            if (aVar != null && (strArrE = aVar.e(null)) != null) {
                oVar.e(strArrE);
            }
            return oVar;
        }
        if (iU == 2) {
            return new Gc.j(str.substring(8));
        }
        if (iU == 3) {
            String strSubstring3 = str.substring(5);
            String strT3 = t(strSubstring3);
            int iU4 = u(strSubstring3, 80);
            if (socketFactoryI == null) {
                socketFactoryI = SocketFactory.getDefault();
            } else if (socketFactoryI instanceof SSLSocketFactory) {
                throw Gc.h.a(32105);
            }
            Ic.d dVar = new Ic.d(socketFactoryI, str, strT3, iU4, this.f4721B);
            dVar.d(kVar.a());
            return dVar;
        }
        if (iU != 4) {
            return null;
        }
        String strSubstring4 = str.substring(6);
        String strT4 = t(strSubstring4);
        int iU5 = u(strSubstring4, 443);
        if (socketFactoryI == null) {
            Hc.a aVar4 = new Hc.a();
            Properties propertiesG2 = kVar.g();
            if (propertiesG2 != null) {
                aVar4.t(propertiesG2, null);
            }
            aVar2 = aVar4;
            socketFactoryI = aVar4.c(null);
        } else {
            if (!(socketFactoryI instanceof SSLSocketFactory)) {
                throw Gc.h.a(32105);
            }
            aVar2 = null;
        }
        Ic.f fVar = new Ic.f((SSLSocketFactory) socketFactoryI, str, strT4, iU5, this.f4721B);
        fVar.f(kVar.a());
        if (aVar2 != null && (strArrE2 = aVar2.e(null)) != null) {
            fVar.e(strArrE2);
        }
        return fVar;
    }

    private String t(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf(47);
        }
        if (iIndexOf == -1) {
            iIndexOf = str.length();
        }
        return str.substring(0, iIndexOf);
    }

    private int u(String str, int i10) {
        int iLastIndexOf = str.lastIndexOf(58);
        if (iLastIndexOf == -1) {
            return i10;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf == -1) {
            iIndexOf = str.length();
        }
        return Integer.parseInt(str.substring(iLastIndexOf + 1, iIndexOf));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(int i10) {
        f4719M.g(f4718L, "rescheduleReconnectCycle", "505", new Object[]{this.f4721B, Long.valueOf(f4720N)});
        this.f4729J.schedule(new c(), f4720N);
    }

    public e C(String str, int i10, Object obj, Fc.a aVar) {
        return D(new String[]{str}, new int[]{i10}, obj, aVar);
    }

    public e D(String[] strArr, int[] iArr, Object obj, Fc.a aVar) throws MqttException {
        if (strArr.length != iArr.length) {
            throw new IllegalArgumentException();
        }
        for (String str : strArr) {
            this.f4723D.E(str);
        }
        String str2 = "";
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 > 0) {
                str2 = str2 + ", ";
            }
            str2 = str2 + "topic=" + strArr[i10] + " qos=" + iArr[i10];
            q.b(strArr[i10], true);
        }
        Kc.b bVar = f4719M;
        String str3 = f4718L;
        bVar.g(str3, "subscribe", "106", new Object[]{str2, obj, aVar});
        p pVar = new p(a());
        pVar.c(aVar);
        pVar.h(obj);
        pVar.f4754a.v(strArr);
        this.f4723D.F(new r(strArr, iArr), pVar);
        bVar.c(str3, "subscribe", "109");
        return pVar;
    }

    public e E(String str, Object obj, Fc.a aVar) {
        return F(new String[]{str}, obj, aVar);
    }

    public e F(String[] strArr, Object obj, Fc.a aVar) throws MqttException {
        String str = "";
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + strArr[i10];
            q.b(strArr[i10], true);
        }
        f4719M.g(f4718L, "unsubscribe", "107", new Object[]{str, obj, aVar});
        for (String str2 : strArr) {
            this.f4723D.E(str2);
        }
        p pVar = new p(a());
        pVar.c(aVar);
        pVar.h(obj);
        pVar.f4754a.v(strArr);
        this.f4723D.F(new t(strArr), pVar);
        f4719M.c(f4718L, "unsubscribe", "110");
        return pVar;
    }

    @Override // Fc.b
    public String a() {
        return this.f4721B;
    }

    public e m(k kVar, Object obj, Fc.a aVar) {
        if (this.f4723D.z()) {
            throw Gc.h.a(32100);
        }
        if (this.f4723D.A()) {
            throw new MqttException(32110);
        }
        if (this.f4723D.C()) {
            throw new MqttException(32102);
        }
        if (this.f4723D.y()) {
            throw new MqttException(32111);
        }
        this.f4727H = kVar;
        this.f4728I = obj;
        boolean zM = kVar.m();
        f4719M.g(f4718L, "connect", "103", new Object[]{Boolean.valueOf(kVar.n()), Integer.valueOf(kVar.a()), Integer.valueOf(kVar.c()), kVar.j(), kVar.f() == null ? "[null]" : "[notnull]", kVar.l() != null ? "[notnull]" : "[null]", obj, aVar});
        this.f4723D.I(o(this.f4722C, kVar));
        this.f4723D.J(new a(zM));
        p pVar = new p(a());
        Gc.g gVar = new Gc.g(this, this.f4725F, this.f4723D, kVar, pVar, obj, aVar, this.f4730K);
        pVar.c(gVar);
        pVar.h(this);
        h hVar = this.f4726G;
        if (hVar instanceof i) {
            gVar.d((i) hVar);
        }
        this.f4723D.H(0);
        gVar.c();
        return pVar;
    }

    protected Gc.m[] o(String str, k kVar) {
        f4719M.g(f4718L, "createNetworkModules", "116", new Object[]{str});
        String[] strArrH = kVar.h();
        if (strArrH == null || strArrH.length == 0) {
            strArrH = new String[]{str};
        }
        Gc.m[] mVarArr = new Gc.m[strArrH.length];
        for (int i10 = 0; i10 < strArrH.length; i10++) {
            mVarArr[i10] = n(strArrH[i10], kVar);
        }
        f4719M.c(f4718L, "createNetworkModules", "108");
        return mVarArr;
    }

    public e p(long j10, Object obj, Fc.a aVar) throws MqttException {
        Kc.b bVar = f4719M;
        String str = f4718L;
        bVar.g(str, "disconnect", "104", new Object[]{Long.valueOf(j10), obj, aVar});
        p pVar = new p(a());
        pVar.c(aVar);
        pVar.h(obj);
        try {
            this.f4723D.p(new Jc.e(), j10, pVar);
            bVar.c(str, "disconnect", "108");
            return pVar;
        } catch (MqttException e10) {
            f4719M.e(f4718L, "disconnect", "105", null, e10);
            throw e10;
        }
    }

    public e q(Object obj, Fc.a aVar) {
        return p(Config.MC_STATS_INTERVAL, obj, aVar);
    }

    public void r() {
        s(Config.MC_STATS_INTERVAL, 10000L);
    }

    public void s(long j10, long j11) {
        this.f4723D.q(j10, j11);
    }

    public String v() {
        return this.f4722C;
    }

    public boolean w() {
        return this.f4723D.z();
    }

    public Fc.c x(String str, m mVar, Object obj, Fc.a aVar) {
        Kc.b bVar = f4719M;
        String str2 = f4718L;
        bVar.g(str2, "publish", "111", new Object[]{str, obj, aVar});
        q.b(str, false);
        l lVar = new l(a());
        lVar.c(aVar);
        lVar.h(obj);
        lVar.i(mVar);
        lVar.f4754a.v(new String[]{str});
        this.f4723D.F(new Jc.o(str, mVar), lVar);
        bVar.c(str2, "publish", "112");
        return lVar;
    }

    public void z(h hVar) {
        this.f4726G = hVar;
        this.f4723D.G(hVar);
    }

    /* compiled from: MqttAsyncClient.java */
    class a implements i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4731a;

        a(boolean z10) {
            this.f4731a = z10;
        }

        @Override // Fc.h
        public void b(Throwable th) {
            if (this.f4731a) {
                f.this.f4723D.K(true);
                f.this.f4730K = true;
                f.this.A();
            }
        }

        @Override // Fc.h
        public void d(Fc.c cVar) {
        }

        @Override // Fc.h
        public void a(String str, m mVar) {
        }

        @Override // Fc.i
        public void c(boolean z10, String str) {
        }
    }
}
