package Gc;

import Jc.u;
import java.util.Enumeration;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: ClientComms.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: q, reason: collision with root package name */
    private static final String f5027q = "Gc.a";

    /* renamed from: r, reason: collision with root package name */
    private static final Kc.b f5028r = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Fc.b f5029a;

    /* renamed from: b, reason: collision with root package name */
    private int f5030b;

    /* renamed from: c, reason: collision with root package name */
    private m[] f5031c;

    /* renamed from: d, reason: collision with root package name */
    private d f5032d;

    /* renamed from: e, reason: collision with root package name */
    private e f5033e;

    /* renamed from: f, reason: collision with root package name */
    private c f5034f;

    /* renamed from: g, reason: collision with root package name */
    private Gc.b f5035g;

    /* renamed from: h, reason: collision with root package name */
    private Fc.k f5036h;

    /* renamed from: i, reason: collision with root package name */
    private Fc.j f5037i;

    /* renamed from: j, reason: collision with root package name */
    private Fc.o f5038j;

    /* renamed from: k, reason: collision with root package name */
    private f f5039k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5040l = false;

    /* renamed from: n, reason: collision with root package name */
    private final Object f5042n = new Object();

    /* renamed from: o, reason: collision with root package name */
    private final boolean f5043o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5044p = false;

    /* renamed from: m, reason: collision with root package name */
    private byte f5041m = 3;

    /* compiled from: ClientComms.java */
    /* renamed from: Gc.a$a, reason: collision with other inner class name */
    private class RunnableC0095a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        a f5045B;

        /* renamed from: C, reason: collision with root package name */
        Thread f5046C;

        /* renamed from: D, reason: collision with root package name */
        Fc.p f5047D;

        /* renamed from: E, reason: collision with root package name */
        Jc.d f5048E;

        RunnableC0095a(a aVar, Fc.p pVar, Jc.d dVar) {
            this.f5046C = null;
            this.f5045B = aVar;
            this.f5047D = pVar;
            this.f5048E = dVar;
            this.f5046C = new Thread(this, "MQTT Con: " + a.this.r().a());
        }

        void a() {
            this.f5046C.start();
        }

        @Override // java.lang.Runnable
        public void run() {
            MqttException mqttExceptionB;
            a.f5028r.c(a.f5027q, "connectBG:run", "220");
            try {
                Fc.l[] lVarArrC = a.this.f5039k.c();
                int i10 = 0;
                while (true) {
                    mqttExceptionB = null;
                    if (i10 >= lVarArrC.length) {
                        break;
                    }
                    lVarArrC[i10].f4754a.q(null);
                    i10++;
                }
                a.this.f5039k.l(this.f5047D, this.f5048E);
                m mVar = a.this.f5031c[a.this.f5030b];
                mVar.start();
                a.this.f5032d = new d(this.f5045B, a.this.f5035g, a.this.f5039k, mVar.c());
                a.this.f5032d.a("MQTT Rec: " + a.this.r().a());
                a.this.f5033e = new e(this.f5045B, a.this.f5035g, a.this.f5039k, mVar.b());
                a.this.f5033e.b("MQTT Snd: " + a.this.r().a());
                a.this.f5034f.p("MQTT Call: " + a.this.r().a());
                a.this.x(this.f5048E, this.f5047D);
            } catch (MqttException e10) {
                a.f5028r.e(a.f5027q, "connectBG:run", "212", null, e10);
                mqttExceptionB = e10;
            } catch (Exception e11) {
                a.f5028r.e(a.f5027q, "connectBG:run", "209", null, e11);
                mqttExceptionB = h.b(e11);
            }
            if (mqttExceptionB != null) {
                a.this.L(this.f5047D, mqttExceptionB);
            }
        }
    }

    /* compiled from: ClientComms.java */
    private class b implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        Thread f5050B = null;

        /* renamed from: C, reason: collision with root package name */
        Jc.e f5051C;

        /* renamed from: D, reason: collision with root package name */
        long f5052D;

        /* renamed from: E, reason: collision with root package name */
        Fc.p f5053E;

        b(Jc.e eVar, long j10, Fc.p pVar) {
            this.f5051C = eVar;
            this.f5052D = j10;
            this.f5053E = pVar;
        }

        void a() {
            Thread thread = new Thread(this, "MQTT Disc: " + a.this.r().a());
            this.f5050B = thread;
            thread.start();
        }

        @Override // java.lang.Runnable
        public void run() {
            a.f5028r.c(a.f5027q, "disconnectBG:run", "221");
            a.this.f5035g.x(this.f5052D);
            try {
                a.this.x(this.f5051C, this.f5053E);
                this.f5053E.f4754a.x();
            } catch (MqttException unused) {
            } catch (Throwable th) {
                this.f5053E.f4754a.l(null, null);
                a.this.L(this.f5053E, null);
                throw th;
            }
            this.f5053E.f4754a.l(null, null);
            a.this.L(this.f5053E, null);
        }
    }

    public a(Fc.b bVar, Fc.j jVar, Fc.o oVar) {
        this.f5029a = bVar;
        this.f5037i = jVar;
        this.f5038j = oVar;
        oVar.b(this);
        this.f5039k = new f(r().a());
        this.f5034f = new c(this);
        Gc.b bVar2 = new Gc.b(jVar, this.f5039k, this.f5034f, this, oVar);
        this.f5035g = bVar2;
        this.f5034f.n(bVar2);
        f5028r.d(r().a());
    }

    private Fc.p v(Fc.p pVar, MqttException mqttException) {
        f5028r.c(f5027q, "handleOldTokens", "222");
        Fc.p pVar2 = null;
        if (pVar != null) {
            try {
                if (this.f5039k.f(pVar.f4754a.d()) == null) {
                    this.f5039k.m(pVar, pVar.f4754a.d());
                }
            } catch (Exception unused) {
            }
        }
        Enumeration enumerationElements = this.f5035g.A(mqttException).elements();
        while (enumerationElements.hasMoreElements()) {
            Fc.p pVar3 = (Fc.p) enumerationElements.nextElement();
            if (pVar3.f4754a.d().equals("Disc") || pVar3.f4754a.d().equals("Con")) {
                pVar2 = pVar3;
            } else {
                this.f5034f.a(pVar3);
            }
        }
        return pVar2;
    }

    private void w(Exception exc) {
        f5028r.e(f5027q, "handleRunException", "804", null, exc);
        L(null, !(exc instanceof MqttException) ? new MqttException(32109, exc) : (MqttException) exc);
    }

    public boolean A() {
        boolean z10;
        synchronized (this.f5042n) {
            z10 = true;
            if (this.f5041m != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean B() {
        boolean z10;
        synchronized (this.f5042n) {
            z10 = this.f5041m == 3;
        }
        return z10;
    }

    public boolean C() {
        boolean z10;
        synchronized (this.f5042n) {
            z10 = this.f5041m == 2;
        }
        return z10;
    }

    public void E(String str) {
        this.f5034f.k(str);
    }

    public void F(u uVar, Fc.p pVar) throws MqttException {
        if (z() || ((!z() && (uVar instanceof Jc.d)) || (C() && (uVar instanceof Jc.e)))) {
            x(uVar, pVar);
        } else {
            f5028r.c(f5027q, "sendNoWait", "208");
            throw h.a(32104);
        }
    }

    public void G(Fc.h hVar) {
        this.f5034f.m(hVar);
    }

    public void H(int i10) {
        this.f5030b = i10;
    }

    public void I(m[] mVarArr) {
        this.f5031c = mVarArr;
    }

    public void J(Fc.i iVar) {
        this.f5034f.o(iVar);
    }

    public void K(boolean z10) {
        this.f5044p = z10;
    }

    public void L(Fc.p pVar, MqttException mqttException) {
        c cVar;
        m mVar;
        synchronized (this.f5042n) {
            try {
                if (!this.f5040l && !y()) {
                    this.f5040l = true;
                    f5028r.c(f5027q, "shutdownConnection", "216");
                    boolean z10 = z() || C();
                    this.f5041m = (byte) 2;
                    if (pVar != null && !pVar.g()) {
                        pVar.f4754a.q(mqttException);
                    }
                    c cVar2 = this.f5034f;
                    if (cVar2 != null) {
                        cVar2.q();
                    }
                    try {
                        m[] mVarArr = this.f5031c;
                        if (mVarArr != null && (mVar = mVarArr[this.f5030b]) != null) {
                            mVar.stop();
                        }
                    } catch (Exception unused) {
                    }
                    d dVar = this.f5032d;
                    if (dVar != null) {
                        dVar.b();
                    }
                    this.f5039k.h(new MqttException(32102));
                    Fc.p pVarV = v(pVar, mqttException);
                    try {
                        this.f5035g.g(mqttException);
                        if (this.f5035g.i()) {
                            this.f5034f.l();
                        }
                    } catch (Exception unused2) {
                    }
                    e eVar = this.f5033e;
                    if (eVar != null) {
                        eVar.c();
                    }
                    Fc.o oVar = this.f5038j;
                    if (oVar != null) {
                        oVar.stop();
                    }
                    try {
                        Fc.j jVar = this.f5037i;
                        if (jVar != null) {
                            jVar.close();
                        }
                    } catch (Exception unused3) {
                    }
                    synchronized (this.f5042n) {
                        f5028r.c(f5027q, "shutdownConnection", "217");
                        this.f5041m = (byte) 3;
                        this.f5040l = false;
                    }
                    boolean z11 = pVarV != null;
                    c cVar3 = this.f5034f;
                    if (z11 & (cVar3 != null)) {
                        cVar3.a(pVarV);
                    }
                    if (z10 && (cVar = this.f5034f) != null) {
                        cVar.b(mqttException);
                    }
                    synchronized (this.f5042n) {
                    }
                }
            } finally {
            }
        }
    }

    public Fc.p l(Fc.a aVar) {
        try {
            return this.f5035g.a(aVar);
        } catch (MqttException e10) {
            w(e10);
            return null;
        } catch (Exception e11) {
            w(e11);
            return null;
        }
    }

    public void m(Fc.k kVar, Fc.p pVar) {
        synchronized (this.f5042n) {
            if (!B()) {
                f5028r.g(f5027q, "connect", "207", new Object[]{Byte.valueOf(this.f5041m)});
                if (y()) {
                    throw new MqttException(32111);
                }
                if (A()) {
                    throw new MqttException(32110);
                }
                if (!C()) {
                    throw h.a(32100);
                }
                throw new MqttException(32102);
            }
            try {
                f5028r.c(f5027q, "connect", "214");
                this.f5041m = (byte) 1;
                this.f5036h = kVar;
                Jc.d dVar = new Jc.d(this.f5029a.a(), this.f5036h.e(), this.f5036h.n(), this.f5036h.c(), this.f5036h.j(), this.f5036h.f(), this.f5036h.l(), this.f5036h.k());
                this.f5035g.G(this.f5036h.c());
                this.f5035g.F(this.f5036h.n());
                this.f5035g.H(this.f5036h.d());
                this.f5039k.g();
                new RunnableC0095a(this, pVar, dVar).a();
            } catch (IllegalArgumentException e10) {
                e10.getLocalizedMessage();
            } catch (Exception e11) {
                e11.getLocalizedMessage();
            }
        }
    }

    public void n(Jc.c cVar, MqttException mqttException) throws MqttException {
        int iY = cVar.y();
        synchronized (this.f5042n) {
            try {
                if (iY != 0) {
                    f5028r.g(f5027q, "connectComplete", "204", new Object[]{Integer.valueOf(iY)});
                    throw mqttException;
                }
                f5028r.c(f5027q, "connectComplete", "215");
                this.f5041m = (byte) 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void o(Jc.o oVar) {
        this.f5035g.f(oVar);
    }

    public void p(Jc.e eVar, long j10, Fc.p pVar) {
        synchronized (this.f5042n) {
            try {
                if (y()) {
                    f5028r.c(f5027q, "disconnect", "223");
                    throw h.a(32111);
                }
                if (B()) {
                    f5028r.c(f5027q, "disconnect", "211");
                    throw h.a(32101);
                }
                if (C()) {
                    f5028r.c(f5027q, "disconnect", "219");
                    throw h.a(32102);
                }
                if (Thread.currentThread() == this.f5034f.e()) {
                    f5028r.c(f5027q, "disconnect", "210");
                    throw h.a(32107);
                }
                f5028r.c(f5027q, "disconnect", "218");
                this.f5041m = (byte) 2;
                new b(eVar, j10, pVar).a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(long j10, long j11) {
        if (this.f5029a != null) {
            this.f5035g.x(j10);
            Fc.p pVar = new Fc.p(this.f5029a.a());
            pVar.f4754a.l(null, null);
            L(pVar, null);
        }
    }

    public Fc.b r() {
        return this.f5029a;
    }

    public long s() {
        return this.f5035g.j();
    }

    public int t() {
        return this.f5030b;
    }

    public m[] u() {
        return this.f5031c;
    }

    void x(u uVar, Fc.p pVar) throws MqttException {
        Kc.b bVar = f5028r;
        String str = f5027q;
        bVar.g(str, "internalSend", "200", new Object[]{uVar.o(), uVar, pVar});
        if (pVar.b() != null) {
            bVar.g(str, "internalSend", "213", new Object[]{uVar.o(), uVar, pVar});
            throw new MqttException(32201);
        }
        pVar.f4754a.p(r());
        try {
            this.f5035g.E(uVar, pVar);
        } catch (MqttException e10) {
            if (uVar instanceof Jc.o) {
                this.f5035g.I((Jc.o) uVar);
            }
            throw e10;
        }
    }

    public boolean y() {
        boolean z10;
        synchronized (this.f5042n) {
            z10 = this.f5041m == 4;
        }
        return z10;
    }

    public boolean z() {
        boolean z10;
        synchronized (this.f5042n) {
            z10 = this.f5041m == 0;
        }
        return z10;
    }

    public void D() {
    }
}
