package Gc;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.eclipse.paho.client.mqttv3.MqttException;
import x4.b;

/* compiled from: CommsCallback.java */
/* loaded from: classes3.dex */
public class c implements Runnable {

    /* renamed from: P, reason: collision with root package name */
    private static final String f5085P = "Gc.c";

    /* renamed from: Q, reason: collision with root package name */
    private static final Kc.b f5086Q = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", c.class.getName());

    /* renamed from: B, reason: collision with root package name */
    private Fc.h f5087B;

    /* renamed from: C, reason: collision with root package name */
    private Fc.i f5088C;

    /* renamed from: E, reason: collision with root package name */
    private final a f5090E;

    /* renamed from: K, reason: collision with root package name */
    private Thread f5096K;

    /* renamed from: N, reason: collision with root package name */
    private b f5099N;

    /* renamed from: H, reason: collision with root package name */
    public boolean f5093H = false;

    /* renamed from: I, reason: collision with root package name */
    private boolean f5094I = false;

    /* renamed from: J, reason: collision with root package name */
    private final Object f5095J = new Object();

    /* renamed from: L, reason: collision with root package name */
    private final Object f5097L = new Object();

    /* renamed from: M, reason: collision with root package name */
    private final Object f5098M = new Object();

    /* renamed from: O, reason: collision with root package name */
    private boolean f5100O = false;

    /* renamed from: F, reason: collision with root package name */
    private final Vector<Jc.o> f5091F = new Vector<>(10);

    /* renamed from: G, reason: collision with root package name */
    private final Vector<Fc.p> f5092G = new Vector<>(10);

    /* renamed from: D, reason: collision with root package name */
    private final Hashtable<String, Fc.d> f5089D = new Hashtable<>();

    c(a aVar) {
        this.f5090E = aVar;
        f5086Q.d(aVar.r().a());
    }

    private void f(Fc.p pVar) {
        synchronized (pVar) {
            try {
                f5086Q.g(f5085P, "handleActionComplete", "705", new Object[]{pVar.f4754a.d()});
                if (pVar.g()) {
                    this.f5099N.p(pVar);
                }
                pVar.f4754a.m();
                if (!pVar.f4754a.k()) {
                    if (this.f5087B != null && (pVar instanceof Fc.l) && pVar.g()) {
                        this.f5087B.d((Fc.l) pVar);
                    }
                    d(pVar);
                }
                if (pVar.g() && ((pVar instanceof Fc.l) || pVar.a() != null)) {
                    pVar.f4754a.u(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void g(Jc.o oVar) throws MqttException {
        String strA = oVar.A();
        f5086Q.g(f5085P, "handleMessage", "713", new Object[]{Integer.valueOf(oVar.p()), strA});
        c(strA, oVar.p(), oVar.z());
        if (this.f5100O) {
            return;
        }
        if (oVar.z().c() == 1) {
            this.f5090E.x(new Jc.k(oVar), new Fc.p(this.f5090E.r().a()));
        } else if (oVar.z().c() == 2) {
            this.f5090E.o(oVar);
            Jc.l lVar = new Jc.l(oVar);
            a aVar = this.f5090E;
            aVar.x(lVar, new Fc.p(aVar.r().a()));
        }
    }

    public void a(Fc.p pVar) {
        if (this.f5093H) {
            this.f5092G.addElement(pVar);
            synchronized (this.f5097L) {
                f5086Q.g(f5085P, "asyncOperationComplete", "715", new Object[]{pVar.f4754a.d()});
                this.f5097L.notifyAll();
            }
            return;
        }
        try {
            f(pVar);
        } catch (Throwable th) {
            f5086Q.e(f5085P, "asyncOperationComplete", "719", null, th);
            this.f5090E.L(null, new MqttException(th));
        }
    }

    public void b(MqttException mqttException) {
        try {
            if (this.f5087B != null && mqttException != null) {
                f5086Q.g(f5085P, "connectionLost", "708", new Object[]{mqttException});
                this.f5087B.b(mqttException);
            }
            Fc.i iVar = this.f5088C;
            if (iVar == null || mqttException == null) {
                return;
            }
            iVar.b(mqttException);
        } catch (Throwable th) {
            f5086Q.g(f5085P, "connectionLost", "720", new Object[]{th});
        }
    }

    protected boolean c(String str, int i10, Fc.m mVar) {
        Enumeration<String> enumerationKeys = this.f5089D.keys();
        boolean z10 = false;
        while (enumerationKeys.hasMoreElements()) {
            String strNextElement = enumerationKeys.nextElement();
            if (Fc.q.a(strNextElement, str)) {
                mVar.g(i10);
                this.f5089D.get(strNextElement).a(str, mVar);
                z10 = true;
            }
        }
        if (this.f5087B == null || z10) {
            return z10;
        }
        mVar.g(i10);
        this.f5087B.a(str, mVar);
        return true;
    }

    public void d(Fc.p pVar) {
        Fc.a aVarA;
        if (pVar == null || (aVarA = pVar.a()) == null) {
            return;
        }
        if (pVar.f() == null) {
            f5086Q.g(f5085P, "fireActionEvent", "716", new Object[]{pVar.f4754a.d()});
            aVarA.a(pVar);
        } else {
            f5086Q.g(f5085P, "fireActionEvent", "716", new Object[]{pVar.f4754a.d()});
            aVarA.b(pVar, pVar.f());
        }
    }

    protected Thread e() {
        return this.f5096K;
    }

    public boolean h() {
        return this.f5094I && this.f5092G.size() == 0 && this.f5091F.size() == 0;
    }

    public void i(Jc.o oVar) {
        if (this.f5087B != null || this.f5089D.size() > 0) {
            synchronized (this.f5098M) {
                while (this.f5093H && !this.f5094I && this.f5091F.size() >= 10) {
                    try {
                        f5086Q.c(f5085P, "messageArrived", "709");
                        this.f5098M.wait(200L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            if (this.f5094I) {
                return;
            }
            this.f5091F.addElement(oVar);
            synchronized (this.f5097L) {
                f5086Q.c(f5085P, "messageArrived", "710");
                this.f5097L.notifyAll();
            }
        }
    }

    public void j() {
        this.f5094I = true;
        synchronized (this.f5098M) {
            f5086Q.c(f5085P, "quiesce", "711");
            this.f5098M.notifyAll();
        }
    }

    public void k(String str) {
        this.f5089D.remove(str);
    }

    public void l() {
        this.f5089D.clear();
    }

    public void m(Fc.h hVar) {
        this.f5087B = hVar;
    }

    public void n(b bVar) {
        this.f5099N = bVar;
    }

    public void o(Fc.i iVar) {
        this.f5088C = iVar;
    }

    public void p(String str) {
        synchronized (this.f5095J) {
            try {
                if (!this.f5093H) {
                    this.f5091F.clear();
                    this.f5092G.clear();
                    this.f5093H = true;
                    this.f5094I = false;
                    Thread thread = new Thread(this, str);
                    this.f5096K = thread;
                    thread.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q() {
        synchronized (this.f5095J) {
            if (this.f5093H) {
                Kc.b bVar = f5086Q;
                String str = f5085P;
                bVar.c(str, "stop", "700");
                this.f5093H = false;
                if (!Thread.currentThread().equals(this.f5096K)) {
                    try {
                        synchronized (this.f5097L) {
                            bVar.c(str, "stop", "701");
                            this.f5097L.notifyAll();
                        }
                        this.f5096K.join();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            this.f5096K = null;
            f5086Q.c(f5085P, "stop", "703");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Fc.p pVarElementAt;
        Jc.o oVarElementAt;
        while (this.f5093H) {
            try {
                try {
                    synchronized (this.f5097L) {
                        try {
                            if (this.f5093H && this.f5091F.isEmpty() && this.f5092G.isEmpty()) {
                                f5086Q.c(f5085P, "run", "704");
                                this.f5097L.wait();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Exception e10) {
                    x4.b.f(b.EnumC0768b.f52680U1.title, "", "");
                    this.f5093H = false;
                    this.f5090E.L(null, new MqttException(e10));
                }
                if (this.f5093H) {
                    synchronized (this.f5092G) {
                        try {
                            if (this.f5092G.isEmpty()) {
                                pVarElementAt = null;
                            } else {
                                pVarElementAt = this.f5092G.elementAt(0);
                                this.f5092G.removeElementAt(0);
                            }
                        } finally {
                        }
                    }
                    if (pVarElementAt != null) {
                        f(pVarElementAt);
                    }
                    synchronized (this.f5091F) {
                        try {
                            if (this.f5091F.isEmpty()) {
                                oVarElementAt = null;
                            } else {
                                oVarElementAt = this.f5091F.elementAt(0);
                                this.f5091F.removeElementAt(0);
                            }
                        } finally {
                        }
                    }
                    if (oVarElementAt != null) {
                        g(oVarElementAt);
                    }
                }
                if (this.f5094I) {
                    this.f5099N.b();
                }
                synchronized (this.f5098M) {
                    f5086Q.c(f5085P, "run", "706");
                    this.f5098M.notifyAll();
                }
            } catch (Throwable th2) {
                try {
                    Kc.b bVar = f5086Q;
                    String str = f5085P;
                    bVar.e(str, "run", "714", null, th2);
                    this.f5093H = false;
                    this.f5090E.L(null, new MqttException(th2));
                    synchronized (this.f5098M) {
                        bVar.c(str, "run", "706");
                        this.f5098M.notifyAll();
                    }
                } catch (Throwable th3) {
                    synchronized (this.f5098M) {
                        f5086Q.c(f5085P, "run", "706");
                        this.f5098M.notifyAll();
                        throw th3;
                    }
                }
            }
        }
    }
}
