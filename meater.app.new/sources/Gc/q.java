package Gc;

import Jc.u;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: Token.java */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: p, reason: collision with root package name */
    private static final String f5163p = "Gc.q";

    /* renamed from: q, reason: collision with root package name */
    private static final Kc.b f5164q = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", q.class.getName());

    /* renamed from: j, reason: collision with root package name */
    private String f5174j;

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f5165a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5166b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5167c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Object f5168d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Object f5169e = new Object();

    /* renamed from: f, reason: collision with root package name */
    protected Fc.m f5170f = null;

    /* renamed from: g, reason: collision with root package name */
    private u f5171g = null;

    /* renamed from: h, reason: collision with root package name */
    private MqttException f5172h = null;

    /* renamed from: i, reason: collision with root package name */
    private String[] f5173i = null;

    /* renamed from: k, reason: collision with root package name */
    private Fc.b f5175k = null;

    /* renamed from: l, reason: collision with root package name */
    private Fc.a f5176l = null;

    /* renamed from: m, reason: collision with root package name */
    private Object f5177m = null;

    /* renamed from: n, reason: collision with root package name */
    private int f5178n = 0;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5179o = false;

    public q(String str) {
        f5164q.d(str);
    }

    public Fc.a a() {
        return this.f5176l;
    }

    public Fc.b b() {
        return this.f5175k;
    }

    public MqttException c() {
        return this.f5172h;
    }

    public String d() {
        return this.f5174j;
    }

    public u e() {
        return this.f5171g;
    }

    public String[] f() {
        return this.f5173i;
    }

    public Object g() {
        return this.f5177m;
    }

    public u h() {
        return this.f5171g;
    }

    public boolean i() {
        return this.f5165a;
    }

    protected boolean j() {
        return this.f5166b;
    }

    public boolean k() {
        return this.f5179o;
    }

    protected void l(u uVar, MqttException mqttException) {
        f5164q.g(f5163p, "markComplete", "404", new Object[]{d(), uVar, mqttException});
        synchronized (this.f5168d) {
            try {
                if (uVar instanceof Jc.b) {
                    this.f5170f = null;
                }
                this.f5166b = true;
                this.f5171g = uVar;
                this.f5172h = mqttException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void m() {
        f5164q.g(f5163p, "notifyComplete", "404", new Object[]{d(), this.f5171g, this.f5172h});
        synchronized (this.f5168d) {
            try {
                if (this.f5172h == null && this.f5166b) {
                    this.f5165a = true;
                    this.f5166b = false;
                } else {
                    this.f5166b = false;
                }
                this.f5168d.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f5169e) {
            this.f5167c = true;
            this.f5169e.notifyAll();
        }
    }

    protected void n() {
        f5164q.g(f5163p, "notifySent", "403", new Object[]{d()});
        synchronized (this.f5168d) {
            this.f5171g = null;
            this.f5165a = false;
        }
        synchronized (this.f5169e) {
            this.f5167c = true;
            this.f5169e.notifyAll();
        }
    }

    public void o(Fc.a aVar) {
        this.f5176l = aVar;
    }

    protected void p(Fc.b bVar) {
        this.f5175k = bVar;
    }

    public void q(MqttException mqttException) {
        synchronized (this.f5168d) {
            this.f5172h = mqttException;
        }
    }

    public void r(String str) {
        this.f5174j = str;
    }

    public void s(Fc.m mVar) {
        this.f5170f = mVar;
    }

    public void t(int i10) {
        this.f5178n = i10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(d());
        stringBuffer.append(" ,topics=");
        if (f() != null) {
            for (int i10 = 0; i10 < f().length; i10++) {
                stringBuffer.append(f()[i10]);
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(" ,usercontext=");
        stringBuffer.append(g());
        stringBuffer.append(" ,isComplete=");
        stringBuffer.append(i());
        stringBuffer.append(" ,isNotified=");
        stringBuffer.append(k());
        stringBuffer.append(" ,exception=");
        stringBuffer.append(c());
        stringBuffer.append(" ,actioncallback=");
        stringBuffer.append(a());
        return stringBuffer.toString();
    }

    public void u(boolean z10) {
        this.f5179o = z10;
    }

    public void v(String[] strArr) {
        this.f5173i = strArr;
    }

    public void w(Object obj) {
        this.f5177m = obj;
    }

    public void x() {
        boolean z10;
        synchronized (this.f5169e) {
            synchronized (this.f5168d) {
                MqttException mqttException = this.f5172h;
                if (mqttException != null) {
                    throw mqttException;
                }
            }
            while (true) {
                z10 = this.f5167c;
                if (z10) {
                    break;
                }
                try {
                    f5164q.g(f5163p, "waitUntilSent", "409", new Object[]{d()});
                    this.f5169e.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (!z10) {
                MqttException mqttException2 = this.f5172h;
                if (mqttException2 != null) {
                    throw mqttException2;
                }
                throw h.a(6);
            }
        }
    }
}
