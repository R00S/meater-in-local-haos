package Gc;

import Jc.u;
import java.io.EOFException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: ClientState.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: C, reason: collision with root package name */
    private static final String f5055C = "Gc.b";

    /* renamed from: D, reason: collision with root package name */
    private static final Kc.b f5056D = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", b.class.getName());

    /* renamed from: A, reason: collision with root package name */
    private Hashtable<Integer, u> f5057A;

    /* renamed from: B, reason: collision with root package name */
    private Fc.o f5058B;

    /* renamed from: b, reason: collision with root package name */
    private Hashtable<Integer, Integer> f5060b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Vector<u> f5061c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Vector<u> f5062d;

    /* renamed from: e, reason: collision with root package name */
    private f f5063e;

    /* renamed from: f, reason: collision with root package name */
    private a f5064f;

    /* renamed from: g, reason: collision with root package name */
    private c f5065g;

    /* renamed from: h, reason: collision with root package name */
    private long f5066h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5067i;

    /* renamed from: j, reason: collision with root package name */
    private Fc.j f5068j;

    /* renamed from: l, reason: collision with root package name */
    private int f5070l;

    /* renamed from: m, reason: collision with root package name */
    private int f5071m;

    /* renamed from: t, reason: collision with root package name */
    private u f5078t;

    /* renamed from: x, reason: collision with root package name */
    private Hashtable<Integer, u> f5082x;

    /* renamed from: y, reason: collision with root package name */
    private Hashtable<Integer, u> f5083y;

    /* renamed from: z, reason: collision with root package name */
    private Hashtable<Integer, u> f5084z;

    /* renamed from: a, reason: collision with root package name */
    private int f5059a = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f5069k = 0;

    /* renamed from: n, reason: collision with root package name */
    private final Object f5072n = new Object();

    /* renamed from: o, reason: collision with root package name */
    private final Object f5073o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private boolean f5074p = false;

    /* renamed from: q, reason: collision with root package name */
    private long f5075q = 0;

    /* renamed from: r, reason: collision with root package name */
    private long f5076r = 0;

    /* renamed from: s, reason: collision with root package name */
    private long f5077s = 0;

    /* renamed from: u, reason: collision with root package name */
    private final Object f5079u = new Object();

    /* renamed from: v, reason: collision with root package name */
    private int f5080v = 0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f5081w = false;

    protected b(Fc.j jVar, f fVar, c cVar, a aVar, Fc.o oVar) throws MqttException {
        this.f5064f = null;
        this.f5065g = null;
        this.f5070l = 0;
        this.f5071m = 0;
        this.f5082x = null;
        this.f5083y = null;
        this.f5084z = null;
        this.f5057A = null;
        this.f5058B = null;
        Kc.b bVar = f5056D;
        bVar.d(aVar.r().a());
        bVar.a(f5055C, "<Init>", "");
        this.f5060b = new Hashtable<>();
        this.f5062d = new Vector<>();
        this.f5082x = new Hashtable<>();
        this.f5083y = new Hashtable<>();
        this.f5084z = new Hashtable<>();
        this.f5057A = new Hashtable<>();
        this.f5078t = new Jc.i();
        this.f5071m = 0;
        this.f5070l = 0;
        this.f5068j = jVar;
        this.f5065g = cVar;
        this.f5063e = fVar;
        this.f5064f = aVar;
        this.f5058B = oVar;
        D();
    }

    private void B() {
        this.f5061c = new Vector<>(this.f5069k);
        this.f5062d = new Vector<>();
        Enumeration<Integer> enumerationKeys = this.f5082x.keys();
        while (enumerationKeys.hasMoreElements()) {
            Integer numNextElement = enumerationKeys.nextElement();
            u uVar = this.f5082x.get(numNextElement);
            if (uVar instanceof Jc.o) {
                f5056D.g(f5055C, "restoreInflightMessages", "610", new Object[]{numNextElement});
                uVar.w(true);
                o(this.f5061c, uVar);
            } else if (uVar instanceof Jc.n) {
                f5056D.g(f5055C, "restoreInflightMessages", "611", new Object[]{numNextElement});
                o(this.f5062d, uVar);
            }
        }
        Enumeration<Integer> enumerationKeys2 = this.f5083y.keys();
        while (enumerationKeys2.hasMoreElements()) {
            Integer numNextElement2 = enumerationKeys2.nextElement();
            Jc.o oVar = (Jc.o) this.f5083y.get(numNextElement2);
            oVar.w(true);
            f5056D.g(f5055C, "restoreInflightMessages", "612", new Object[]{numNextElement2});
            o(this.f5061c, oVar);
        }
        Enumeration<Integer> enumerationKeys3 = this.f5084z.keys();
        while (enumerationKeys3.hasMoreElements()) {
            Integer numNextElement3 = enumerationKeys3.nextElement();
            Jc.o oVar2 = (Jc.o) this.f5084z.get(numNextElement3);
            f5056D.g(f5055C, "restoreInflightMessages", "512", new Object[]{numNextElement3});
            o(this.f5061c, oVar2);
        }
        this.f5062d = y(this.f5062d);
        this.f5061c = y(this.f5061c);
    }

    private u C(String str, Fc.n nVar) throws MqttException {
        u uVarG;
        try {
            uVarG = u.g(nVar);
        } catch (MqttException e10) {
            f5056D.e(f5055C, "restoreMessage", "602", new Object[]{str}, e10);
            if (!(e10.getCause() instanceof EOFException)) {
                throw e10;
            }
            if (str != null) {
                this.f5068j.remove(str);
            }
            uVarG = null;
        }
        f5056D.g(f5055C, "restoreMessage", "601", new Object[]{str, uVarG});
        return uVarG;
    }

    private void e() {
        synchronized (this.f5072n) {
            try {
                int i10 = this.f5070l - 1;
                this.f5070l = i10;
                f5056D.g(f5055C, "decrementInFlight", "646", new Object[]{Integer.valueOf(i10)});
                if (!b()) {
                    this.f5072n.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized int k() {
        int i10;
        try {
            int i11 = this.f5059a;
            int i12 = 0;
            do {
                int i13 = this.f5059a + 1;
                this.f5059a = i13;
                if (i13 > 65535) {
                    this.f5059a = 1;
                }
                i10 = this.f5059a;
                if (i10 == i11 && (i12 = i12 + 1) == 2) {
                    throw h.a(32001);
                }
            } while (this.f5060b.containsKey(Integer.valueOf(i10)));
            Integer numValueOf = Integer.valueOf(this.f5059a);
            this.f5060b.put(numValueOf, numValueOf);
        } catch (Throwable th) {
            throw th;
        }
        return this.f5059a;
    }

    private String l(u uVar) {
        return "r-" + uVar.p();
    }

    private String m(u uVar) {
        return "sc-" + uVar.p();
    }

    private String n(u uVar) {
        return "s-" + uVar.p();
    }

    private void o(Vector<u> vector, u uVar) {
        int iP = uVar.p();
        for (int i10 = 0; i10 < vector.size(); i10++) {
            if (vector.elementAt(i10).p() > iP) {
                vector.insertElementAt(uVar, i10);
                return;
            }
        }
        vector.addElement(uVar);
    }

    private Vector<u> y(Vector<u> vector) {
        Vector<u> vector2 = new Vector<>();
        if (vector.size() == 0) {
            return vector2;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < vector.size()) {
            int iP = vector.elementAt(i10).p();
            int i14 = iP - i11;
            if (i14 > i12) {
                i13 = i10;
                i12 = i14;
            }
            i10++;
            i11 = iP;
        }
        if ((65535 - i11) + vector.elementAt(0).p() > i12) {
            i13 = 0;
        }
        for (int i15 = i13; i15 < vector.size(); i15++) {
            vector2.addElement(vector.elementAt(i15));
        }
        for (int i16 = 0; i16 < i13; i16++) {
            vector2.addElement(vector.elementAt(i16));
        }
        return vector2;
    }

    private synchronized void z(int i10) {
        this.f5060b.remove(Integer.valueOf(i10));
    }

    public Vector A(MqttException mqttException) {
        f5056D.g(f5055C, "resolveOldTokens", "632", new Object[]{mqttException});
        if (mqttException == null) {
            mqttException = new MqttException(32102);
        }
        Vector<Fc.p> vectorD = this.f5063e.d();
        Enumeration<Fc.p> enumerationElements = vectorD.elements();
        while (enumerationElements.hasMoreElements()) {
            Fc.p pVarNextElement = enumerationElements.nextElement();
            synchronized (pVarNextElement) {
                try {
                    if (!pVarNextElement.g() && !pVarNextElement.f4754a.j() && pVarNextElement.f() == null) {
                        pVarNextElement.f4754a.q(mqttException);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!(pVarNextElement instanceof Fc.l)) {
                this.f5063e.j(pVarNextElement.f4754a.d());
            }
        }
        return vectorD;
    }

    protected void D() throws MqttException {
        Enumeration enumerationC = this.f5068j.c();
        int iMax = this.f5059a;
        Vector vector = new Vector();
        f5056D.c(f5055C, "restoreState", "600");
        while (enumerationC.hasMoreElements()) {
            String str = (String) enumerationC.nextElement();
            u uVarC = C(str, this.f5068j.a(str));
            if (uVarC != null) {
                if (str.startsWith("r-")) {
                    f5056D.g(f5055C, "restoreState", "604", new Object[]{str, uVarC});
                    this.f5057A.put(Integer.valueOf(uVarC.p()), uVarC);
                } else if (str.startsWith("s-")) {
                    Jc.o oVar = (Jc.o) uVarC;
                    iMax = Math.max(oVar.p(), iMax);
                    if (this.f5068j.e(m(oVar))) {
                        Jc.n nVar = (Jc.n) C(str, this.f5068j.a(m(oVar)));
                        if (nVar != null) {
                            f5056D.g(f5055C, "restoreState", "605", new Object[]{str, uVarC});
                            this.f5082x.put(Integer.valueOf(nVar.p()), nVar);
                        } else {
                            f5056D.g(f5055C, "restoreState", "606", new Object[]{str, uVarC});
                        }
                    } else {
                        oVar.w(true);
                        if (oVar.z().c() == 2) {
                            f5056D.g(f5055C, "restoreState", "607", new Object[]{str, uVarC});
                            this.f5082x.put(Integer.valueOf(oVar.p()), oVar);
                        } else {
                            f5056D.g(f5055C, "restoreState", "608", new Object[]{str, uVarC});
                            this.f5083y.put(Integer.valueOf(oVar.p()), oVar);
                        }
                    }
                    this.f5063e.k(oVar).f4754a.p(this.f5064f.r());
                    this.f5060b.put(Integer.valueOf(oVar.p()), Integer.valueOf(oVar.p()));
                } else if (str.startsWith("sb-")) {
                    Jc.o oVar2 = (Jc.o) uVarC;
                    iMax = Math.max(oVar2.p(), iMax);
                    if (oVar2.z().c() == 2) {
                        f5056D.g(f5055C, "restoreState", "607", new Object[]{str, uVarC});
                        this.f5082x.put(Integer.valueOf(oVar2.p()), oVar2);
                    } else if (oVar2.z().c() == 1) {
                        f5056D.g(f5055C, "restoreState", "608", new Object[]{str, uVarC});
                        this.f5083y.put(Integer.valueOf(oVar2.p()), oVar2);
                    } else {
                        f5056D.g(f5055C, "restoreState", "511", new Object[]{str, uVarC});
                        this.f5084z.put(Integer.valueOf(oVar2.p()), oVar2);
                        this.f5068j.remove(str);
                    }
                    this.f5063e.k(oVar2).f4754a.p(this.f5064f.r());
                    this.f5060b.put(Integer.valueOf(oVar2.p()), Integer.valueOf(oVar2.p()));
                } else if (str.startsWith("sc-") && !this.f5068j.e(n((Jc.n) uVarC))) {
                    vector.addElement(str);
                }
            }
        }
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            String str2 = (String) enumerationElements.nextElement();
            f5056D.g(f5055C, "restoreState", "609", new Object[]{str2});
            this.f5068j.remove(str2);
        }
        this.f5059a = iMax;
    }

    public void E(u uVar, Fc.p pVar) {
        if (uVar.u() && uVar.p() == 0) {
            uVar.x(k());
        }
        if (pVar != null) {
            try {
                pVar.f4754a.t(uVar.p());
            } catch (Exception unused) {
            }
        }
        if (uVar instanceof Jc.o) {
            synchronized (this.f5072n) {
                try {
                    int i10 = this.f5070l;
                    if (i10 >= this.f5069k) {
                        f5056D.g(f5055C, "send", "613", new Object[]{Integer.valueOf(i10)});
                        throw new MqttException(32202);
                    }
                    Fc.m mVarZ = ((Jc.o) uVar).z();
                    f5056D.g(f5055C, "send", "628", new Object[]{Integer.valueOf(uVar.p()), Integer.valueOf(mVarZ.c()), uVar});
                    int iC = mVarZ.c();
                    if (iC == 1) {
                        this.f5083y.put(Integer.valueOf(uVar.p()), uVar);
                        this.f5068j.b(n(uVar), (Jc.o) uVar);
                    } else if (iC == 2) {
                        this.f5082x.put(Integer.valueOf(uVar.p()), uVar);
                        this.f5068j.b(n(uVar), (Jc.o) uVar);
                    }
                    this.f5063e.l(pVar, uVar);
                    this.f5061c.addElement(uVar);
                    this.f5072n.notifyAll();
                } finally {
                }
            }
            return;
        }
        f5056D.g(f5055C, "send", "615", new Object[]{Integer.valueOf(uVar.p()), uVar});
        if (uVar instanceof Jc.d) {
            synchronized (this.f5072n) {
                this.f5063e.l(pVar, uVar);
                this.f5062d.insertElementAt(uVar, 0);
                this.f5072n.notifyAll();
            }
            return;
        }
        if (uVar instanceof Jc.i) {
            this.f5078t = uVar;
        } else if (uVar instanceof Jc.n) {
            this.f5082x.put(Integer.valueOf(uVar.p()), uVar);
            this.f5068j.b(m(uVar), (Jc.n) uVar);
        } else if (uVar instanceof Jc.l) {
            this.f5068j.remove(l(uVar));
        }
        synchronized (this.f5072n) {
            try {
                if (!(uVar instanceof Jc.b)) {
                    this.f5063e.l(pVar, uVar);
                }
                this.f5062d.addElement(uVar);
                this.f5072n.notifyAll();
            } finally {
            }
        }
    }

    protected void F(boolean z10) {
        this.f5067i = z10;
    }

    protected void G(long j10) {
        this.f5066h = j10 * 1000;
    }

    protected void H(int i10) {
        this.f5069k = i10;
        this.f5061c = new Vector<>(this.f5069k);
    }

    protected void I(Jc.o oVar) {
        synchronized (this.f5072n) {
            try {
                f5056D.g(f5055C, "undo", "618", new Object[]{Integer.valueOf(oVar.p()), Integer.valueOf(oVar.z().c())});
                if (oVar.z().c() == 1) {
                    this.f5083y.remove(Integer.valueOf(oVar.p()));
                } else {
                    this.f5082x.remove(Integer.valueOf(oVar.p()));
                }
                this.f5061c.removeElement(oVar);
                this.f5068j.remove(n(oVar));
                this.f5063e.i(oVar);
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Fc.p a(Fc.a aVar) throws Throwable {
        Object obj;
        long jMax;
        Kc.b bVar = f5056D;
        String str = f5055C;
        bVar.g(str, "checkForActivity", "616", new Object[0]);
        synchronized (this.f5073o) {
            try {
                Fc.p pVar = null;
                if (this.f5074p) {
                    return null;
                }
                j();
                if (this.f5081w && this.f5066h > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Object obj2 = this.f5079u;
                    synchronized (obj2) {
                        try {
                            try {
                                int i10 = this.f5080v;
                                if (i10 > 0) {
                                    long j10 = jCurrentTimeMillis - this.f5076r;
                                    long j11 = this.f5066h;
                                    obj = obj2;
                                    if (j10 >= 100 + j11) {
                                        bVar.f(str, "checkForActivity", "619", new Object[]{Long.valueOf(j11), Long.valueOf(this.f5075q), Long.valueOf(this.f5076r), Long.valueOf(jCurrentTimeMillis), Long.valueOf(this.f5077s)});
                                        throw h.a(32000);
                                    }
                                } else {
                                    obj = obj2;
                                }
                                if (i10 == 0) {
                                    long j12 = jCurrentTimeMillis - this.f5075q;
                                    long j13 = this.f5066h;
                                    if (j12 >= 2 * j13) {
                                        bVar.f(str, "checkForActivity", "642", new Object[]{Long.valueOf(j13), Long.valueOf(this.f5075q), Long.valueOf(this.f5076r), Long.valueOf(jCurrentTimeMillis), Long.valueOf(this.f5077s)});
                                        throw h.a(32002);
                                    }
                                }
                                if ((i10 != 0 || jCurrentTimeMillis - this.f5076r < this.f5066h - 100) && jCurrentTimeMillis - this.f5075q < this.f5066h - 100) {
                                    pVar = null;
                                    bVar.g(str, "checkForActivity", "634", null);
                                    jMax = Math.max(1L, j() - (jCurrentTimeMillis - this.f5075q));
                                } else {
                                    bVar.g(str, "checkForActivity", "620", new Object[]{Long.valueOf(this.f5066h), Long.valueOf(this.f5075q), Long.valueOf(this.f5076r)});
                                    pVar = new Fc.p(this.f5064f.r().a());
                                    if (aVar != null) {
                                        pVar.c(aVar);
                                    }
                                    this.f5063e.l(pVar, this.f5078t);
                                    this.f5062d.insertElementAt(this.f5078t, 0);
                                    jMax = j();
                                    q();
                                }
                                bVar.g(str, "checkForActivity", "624", new Object[]{Long.valueOf(jMax)});
                                this.f5058B.a(jMax);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    throw th;
                }
                return pVar;
            } finally {
            }
        }
    }

    protected boolean b() {
        int iB = this.f5063e.b();
        if (!this.f5074p || iB != 0 || this.f5062d.size() != 0 || !this.f5065g.h()) {
            return false;
        }
        f5056D.g(f5055C, "checkQuiesceLock", "626", new Object[]{Boolean.valueOf(this.f5074p), Integer.valueOf(this.f5070l), Integer.valueOf(this.f5062d.size()), Integer.valueOf(this.f5071m), Boolean.valueOf(this.f5065g.h()), Integer.valueOf(iB)});
        synchronized (this.f5073o) {
            this.f5073o.notifyAll();
        }
        return true;
    }

    protected void c() {
        f5056D.c(f5055C, "clearState", ">");
        this.f5068j.clear();
        this.f5060b.clear();
        this.f5061c.clear();
        this.f5062d.clear();
        this.f5082x.clear();
        this.f5083y.clear();
        this.f5084z.clear();
        this.f5057A.clear();
        this.f5063e.a();
    }

    public void d() {
        f5056D.c(f5055C, "connected", "631");
        this.f5081w = true;
        this.f5058B.start();
    }

    protected void f(Jc.o oVar) {
        f5056D.g(f5055C, "deliveryComplete", "641", new Object[]{Integer.valueOf(oVar.p())});
        this.f5068j.remove(l(oVar));
        this.f5057A.remove(Integer.valueOf(oVar.p()));
    }

    public void g(MqttException mqttException) {
        f5056D.g(f5055C, "disconnected", "633", new Object[]{mqttException});
        this.f5081w = false;
        try {
            if (this.f5067i) {
                c();
            }
            this.f5061c.clear();
            this.f5062d.clear();
            synchronized (this.f5079u) {
                this.f5080v = 0;
            }
        } catch (MqttException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected Jc.u h() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f5072n
            monitor-enter(r0)
            r1 = 0
            r2 = r1
        L5:
            if (r2 != 0) goto Ld9
            java.util.Vector<Jc.u> r3 = r8.f5061c     // Catch: java.lang.Throwable -> L18
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1b
            java.util.Vector<Jc.u> r3 = r8.f5062d     // Catch: java.lang.Throwable -> L18
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L29
            goto L1b
        L18:
            r1 = move-exception
            goto Ldb
        L1b:
            java.util.Vector<Jc.u> r3 = r8.f5062d     // Catch: java.lang.Throwable -> L18
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L40
            int r3 = r8.f5070l     // Catch: java.lang.Throwable -> L18
            int r4 = r8.f5069k     // Catch: java.lang.Throwable -> L18
            if (r3 < r4) goto L40
        L29:
            Kc.b r3 = Gc.b.f5056D     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L40
            java.lang.String r4 = Gc.b.f5055C     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L40
            java.lang.String r5 = "get"
            java.lang.String r6 = "644"
            r3.c(r4, r5, r6)     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L40
            java.lang.Object r5 = r8.f5072n     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L40
            r5.wait()     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L40
            java.lang.String r5 = "get"
            java.lang.String r6 = "647"
            r3.c(r4, r5, r6)     // Catch: java.lang.Throwable -> L18 java.lang.InterruptedException -> L40
        L40:
            boolean r3 = r8.f5081w     // Catch: java.lang.Throwable -> L18
            r4 = 0
            if (r3 != 0) goto L64
            java.util.Vector<Jc.u> r3 = r8.f5062d     // Catch: java.lang.Throwable -> L18
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L57
            java.util.Vector<Jc.u> r3 = r8.f5062d     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r3.elementAt(r4)     // Catch: java.lang.Throwable -> L18
            boolean r3 = r3 instanceof Jc.d     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L64
        L57:
            Kc.b r2 = Gc.b.f5056D     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = Gc.b.f5055C     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "get"
            java.lang.String r5 = "621"
            r2.c(r3, r4, r5)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L64:
            java.util.Vector<Jc.u> r3 = r8.f5062d     // Catch: java.lang.Throwable -> L18
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L96
            java.util.Vector<Jc.u> r2 = r8.f5062d     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r2.remove(r4)     // Catch: java.lang.Throwable -> L18
            Jc.u r2 = (Jc.u) r2     // Catch: java.lang.Throwable -> L18
            boolean r3 = r2 instanceof Jc.n     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L91
            int r3 = r8.f5071m     // Catch: java.lang.Throwable -> L18
            int r3 = r3 + 1
            r8.f5071m = r3     // Catch: java.lang.Throwable -> L18
            Kc.b r4 = Gc.b.f5056D     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = Gc.b.f5055C     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "get"
            java.lang.String r7 = "617"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L18
            r4.g(r5, r6, r7, r3)     // Catch: java.lang.Throwable -> L18
        L91:
            r8.b()     // Catch: java.lang.Throwable -> L18
            goto L5
        L96:
            java.util.Vector<Jc.u> r3 = r8.f5061c     // Catch: java.lang.Throwable -> L18
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L5
            int r3 = r8.f5070l     // Catch: java.lang.Throwable -> L18
            int r5 = r8.f5069k     // Catch: java.lang.Throwable -> L18
            if (r3 >= r5) goto Lcc
            java.util.Vector<Jc.u> r2 = r8.f5061c     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r2.elementAt(r4)     // Catch: java.lang.Throwable -> L18
            Jc.u r2 = (Jc.u) r2     // Catch: java.lang.Throwable -> L18
            java.util.Vector<Jc.u> r3 = r8.f5061c     // Catch: java.lang.Throwable -> L18
            r3.removeElementAt(r4)     // Catch: java.lang.Throwable -> L18
            int r3 = r8.f5070l     // Catch: java.lang.Throwable -> L18
            int r3 = r3 + 1
            r8.f5070l = r3     // Catch: java.lang.Throwable -> L18
            Kc.b r4 = Gc.b.f5056D     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = Gc.b.f5055C     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "get"
            java.lang.String r7 = "623"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L18
            r4.g(r5, r6, r7, r3)     // Catch: java.lang.Throwable -> L18
            goto L5
        Lcc:
            Kc.b r3 = Gc.b.f5056D     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = Gc.b.f5055C     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = "get"
            java.lang.String r6 = "622"
            r3.c(r4, r5, r6)     // Catch: java.lang.Throwable -> L18
            goto L5
        Ld9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        Ldb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Gc.b.h():Jc.u");
    }

    protected boolean i() {
        return this.f5067i;
    }

    protected long j() {
        return this.f5066h;
    }

    protected void p(Fc.p pVar) {
        u uVarH = pVar.f4754a.h();
        if (uVarH == null || !(uVarH instanceof Jc.b)) {
            return;
        }
        Kc.b bVar = f5056D;
        String str = f5055C;
        bVar.g(str, "notifyComplete", "629", new Object[]{Integer.valueOf(uVarH.p()), pVar, uVarH});
        Jc.b bVar2 = (Jc.b) uVarH;
        if (bVar2 instanceof Jc.k) {
            this.f5068j.remove(n(uVarH));
            this.f5083y.remove(Integer.valueOf(bVar2.p()));
            e();
            z(uVarH.p());
            this.f5063e.i(uVarH);
            bVar.g(str, "notifyComplete", "650", new Object[]{Integer.valueOf(bVar2.p())});
        } else if (bVar2 instanceof Jc.l) {
            this.f5068j.remove(n(uVarH));
            this.f5068j.remove(m(uVarH));
            this.f5082x.remove(Integer.valueOf(bVar2.p()));
            this.f5071m--;
            e();
            z(uVarH.p());
            this.f5063e.i(uVarH);
            bVar.g(str, "notifyComplete", "645", new Object[]{Integer.valueOf(bVar2.p()), Integer.valueOf(this.f5071m)});
        }
        b();
    }

    public void q() {
        synchronized (this.f5072n) {
            f5056D.c(f5055C, "notifyQueueLock", "638");
            this.f5072n.notifyAll();
        }
    }

    protected void r(Jc.b bVar) throws MqttException {
        this.f5076r = System.currentTimeMillis();
        Kc.b bVar2 = f5056D;
        String str = f5055C;
        bVar2.g(str, "notifyReceivedAck", "627", new Object[]{Integer.valueOf(bVar.p()), bVar});
        Fc.p pVarE = this.f5063e.e(bVar);
        if (pVarE == null) {
            bVar2.g(str, "notifyReceivedAck", "662", new Object[]{Integer.valueOf(bVar.p())});
        } else if (bVar instanceof Jc.m) {
            E(new Jc.n((Jc.m) bVar), pVarE);
        } else if ((bVar instanceof Jc.k) || (bVar instanceof Jc.l)) {
            u(bVar, pVarE, null);
        } else if (bVar instanceof Jc.j) {
            synchronized (this.f5079u) {
                try {
                    this.f5080v = Math.max(0, this.f5080v - 1);
                    u(bVar, pVarE, null);
                    if (this.f5080v == 0) {
                        this.f5063e.i(bVar);
                    }
                } finally {
                }
            }
            bVar2.g(str, "notifyReceivedAck", "636", new Object[]{Integer.valueOf(this.f5080v)});
        } else if (bVar instanceof Jc.c) {
            Jc.c cVar = (Jc.c) bVar;
            int iY = cVar.y();
            if (iY != 0) {
                throw h.a(iY);
            }
            synchronized (this.f5072n) {
                try {
                    if (this.f5067i) {
                        c();
                        this.f5063e.l(pVarE, bVar);
                    }
                    this.f5071m = 0;
                    this.f5070l = 0;
                    B();
                    d();
                } finally {
                }
            }
            this.f5064f.n(cVar, null);
            u(bVar, pVarE, null);
            this.f5063e.i(bVar);
            synchronized (this.f5072n) {
                this.f5072n.notifyAll();
            }
        } else {
            u(bVar, pVarE, null);
            z(bVar.p());
            this.f5063e.i(bVar);
        }
        b();
    }

    public void s(int i10) {
        if (i10 > 0) {
            this.f5076r = System.currentTimeMillis();
        }
        f5056D.g(f5055C, "notifyReceivedBytes", "630", new Object[]{Integer.valueOf(i10)});
    }

    protected void t(u uVar) {
        this.f5076r = System.currentTimeMillis();
        if (uVar == null) {
            U4.b.e("*********ERROR****** MESSAGE IS NULL", new Object[0]);
        } else {
            f5056D.g(f5055C, "notifyReceivedMsg", "651", new Object[]{Integer.valueOf(uVar.p()), uVar});
        }
        if (this.f5074p) {
            return;
        }
        if (!(uVar instanceof Jc.o)) {
            if (uVar instanceof Jc.n) {
                Jc.o oVar = (Jc.o) this.f5057A.get(Integer.valueOf(uVar.p()));
                if (oVar == null) {
                    E(new Jc.l(uVar.p()), null);
                    return;
                }
                c cVar = this.f5065g;
                if (cVar != null) {
                    cVar.i(oVar);
                    return;
                }
                return;
            }
            return;
        }
        Jc.o oVar2 = (Jc.o) uVar;
        int iC = oVar2.z().c();
        if (iC == 0 || iC == 1) {
            c cVar2 = this.f5065g;
            if (cVar2 != null) {
                cVar2.i(oVar2);
                return;
            }
            return;
        }
        if (iC != 2) {
            return;
        }
        this.f5068j.b(l(uVar), oVar2);
        this.f5057A.put(Integer.valueOf(oVar2.p()), oVar2);
        E(new Jc.m(oVar2), null);
    }

    protected void u(u uVar, Fc.p pVar, MqttException mqttException) {
        pVar.f4754a.l(uVar, mqttException);
        pVar.f4754a.m();
        if (uVar != null && (uVar instanceof Jc.b) && !(uVar instanceof Jc.m)) {
            f5056D.g(f5055C, "notifyResult", "648", new Object[]{pVar.f4754a.d(), uVar, mqttException});
            this.f5065g.a(pVar);
        }
        if (uVar == null) {
            f5056D.g(f5055C, "notifyResult", "649", new Object[]{pVar.f4754a.d(), mqttException});
            this.f5065g.a(pVar);
        }
    }

    protected void v(u uVar) {
        int i10;
        this.f5075q = System.currentTimeMillis();
        Kc.b bVar = f5056D;
        String str = f5055C;
        bVar.g(str, "notifySent", "625", new Object[]{uVar.o()});
        Fc.p pVarE = this.f5063e.e(uVar);
        pVarE.f4754a.n();
        if (uVar instanceof Jc.i) {
            synchronized (this.f5079u) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (this.f5079u) {
                    this.f5077s = jCurrentTimeMillis;
                    i10 = this.f5080v + 1;
                    this.f5080v = i10;
                }
                bVar.g(str, "notifySent", "635", new Object[]{Integer.valueOf(i10)});
            }
            return;
        }
        if ((uVar instanceof Jc.o) && ((Jc.o) uVar).z().c() == 0) {
            pVarE.f4754a.l(null, null);
            this.f5065g.a(pVarE);
            e();
            z(uVar.p());
            this.f5063e.i(uVar);
            b();
        }
    }

    public void w(int i10) {
        if (i10 > 0) {
            this.f5075q = System.currentTimeMillis();
        }
        f5056D.g(f5055C, "notifySentBytes", "643", new Object[]{Integer.valueOf(i10)});
    }

    public void x(long j10) {
        if (j10 > 0) {
            Kc.b bVar = f5056D;
            String str = f5055C;
            bVar.g(str, "quiesce", "637", new Object[]{Long.valueOf(j10)});
            synchronized (this.f5072n) {
                this.f5074p = true;
            }
            this.f5065g.j();
            q();
            synchronized (this.f5073o) {
                try {
                    try {
                        int iB = this.f5063e.b();
                        if (iB > 0 || this.f5062d.size() > 0 || !this.f5065g.h()) {
                            bVar.g(str, "quiesce", "639", new Object[]{Integer.valueOf(this.f5070l), Integer.valueOf(this.f5062d.size()), Integer.valueOf(this.f5071m), Integer.valueOf(iB)});
                            this.f5073o.wait(j10);
                        }
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (this.f5072n) {
                this.f5061c.clear();
                this.f5062d.clear();
                this.f5074p = false;
                this.f5070l = 0;
            }
            f5056D.c(f5055C, "quiesce", "640");
        }
    }
}
