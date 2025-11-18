package Gc;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;

/* compiled from: ConnectActionListener.java */
/* loaded from: classes3.dex */
public class g implements Fc.a {

    /* renamed from: a, reason: collision with root package name */
    private final Fc.j f5125a;

    /* renamed from: b, reason: collision with root package name */
    private final Fc.f f5126b;

    /* renamed from: c, reason: collision with root package name */
    private final a f5127c;

    /* renamed from: d, reason: collision with root package name */
    private final Fc.k f5128d;

    /* renamed from: e, reason: collision with root package name */
    private final Fc.p f5129e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f5130f;

    /* renamed from: g, reason: collision with root package name */
    private final Fc.a f5131g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5132h;

    /* renamed from: i, reason: collision with root package name */
    private Fc.i f5133i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f5134j;

    public g(Fc.f fVar, Fc.j jVar, a aVar, Fc.k kVar, Fc.p pVar, Object obj, Fc.a aVar2, boolean z10) {
        this.f5125a = jVar;
        this.f5126b = fVar;
        this.f5127c = aVar;
        this.f5128d = kVar;
        this.f5129e = pVar;
        this.f5130f = obj;
        this.f5131g = aVar2;
        this.f5132h = kVar.e();
        this.f5134j = z10;
    }

    @Override // Fc.a
    public void a(Fc.e eVar) {
        if (this.f5132h == 0) {
            this.f5128d.p(0);
        }
        this.f5129e.f4754a.l(eVar.d(), null);
        this.f5129e.f4754a.m();
        this.f5129e.f4754a.p(this.f5126b);
        if (this.f5134j) {
            this.f5127c.D();
        }
        if (this.f5131g != null) {
            this.f5129e.h(this.f5130f);
            this.f5131g.a(this.f5129e);
        }
        if (this.f5133i != null) {
            this.f5133i.c(this.f5134j, this.f5127c.u()[this.f5127c.t()].a());
        }
    }

    @Override // Fc.a
    public void b(Fc.e eVar, Throwable th) {
        int length = this.f5127c.u().length;
        int iT = this.f5127c.t() + 1;
        if (iT >= length && (this.f5132h != 0 || this.f5128d.e() != 4)) {
            if (this.f5132h == 0) {
                this.f5128d.p(0);
            }
            this.f5129e.f4754a.l(null, th instanceof MqttException ? (MqttException) th : new MqttException(th));
            this.f5129e.f4754a.m();
            this.f5129e.f4754a.p(this.f5126b);
            if (this.f5131g != null) {
                this.f5129e.h(this.f5130f);
                this.f5131g.b(this.f5129e, th);
                return;
            }
            return;
        }
        if (this.f5132h != 0) {
            this.f5127c.H(iT);
        } else if (this.f5128d.e() == 4) {
            this.f5128d.p(3);
        } else {
            this.f5128d.p(4);
            this.f5127c.H(iT);
        }
        try {
            c();
        } catch (MqttPersistenceException e10) {
            b(eVar, e10);
        }
    }

    public void c() {
        Fc.f fVar = this.f5126b;
        if (fVar != null) {
            Fc.p pVar = new Fc.p(fVar.a());
            pVar.c(this);
            pVar.h(this);
            this.f5125a.d(this.f5126b.a(), this.f5126b.v());
            if (this.f5128d.n()) {
                this.f5125a.clear();
            }
            if (this.f5128d.e() == 0) {
                this.f5128d.p(4);
            }
            try {
                this.f5127c.m(this.f5128d, pVar);
            } catch (IllegalArgumentException e10) {
                b(pVar, e10);
            } catch (MqttException e11) {
                b(pVar, e11);
            }
        }
    }

    public void d(Fc.i iVar) {
        this.f5133i = iVar;
    }
}
