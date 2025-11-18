package Gc;

import Jc.u;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: CommsReceiver.java */
/* loaded from: classes3.dex */
public class d implements Runnable {

    /* renamed from: J, reason: collision with root package name */
    private static final String f5101J = "Gc.d";

    /* renamed from: K, reason: collision with root package name */
    private static final Kc.b f5102K = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", d.class.getName());

    /* renamed from: D, reason: collision with root package name */
    private b f5105D;

    /* renamed from: E, reason: collision with root package name */
    private a f5106E;

    /* renamed from: F, reason: collision with root package name */
    private final Jc.f f5107F;

    /* renamed from: G, reason: collision with root package name */
    private f f5108G;

    /* renamed from: I, reason: collision with root package name */
    private volatile boolean f5110I;

    /* renamed from: B, reason: collision with root package name */
    private boolean f5103B = false;

    /* renamed from: C, reason: collision with root package name */
    private final Object f5104C = new Object();

    /* renamed from: H, reason: collision with root package name */
    private Thread f5109H = null;

    public d(a aVar, b bVar, f fVar, InputStream inputStream) {
        this.f5105D = null;
        this.f5106E = null;
        this.f5108G = null;
        this.f5107F = new Jc.f(bVar, inputStream);
        this.f5106E = aVar;
        this.f5105D = bVar;
        this.f5108G = fVar;
        f5102K.d(aVar.r().a());
    }

    public void a(String str) {
        f5102K.c(f5101J, "start", "855");
        synchronized (this.f5104C) {
            try {
                if (!this.f5103B) {
                    this.f5103B = true;
                    Thread thread = new Thread(this, str);
                    this.f5109H = thread;
                    thread.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.f5104C) {
            f5102K.c(f5101J, "stop", "850");
            if (this.f5103B) {
                this.f5103B = false;
                this.f5110I = false;
                if (!Thread.currentThread().equals(this.f5109H)) {
                    try {
                        this.f5109H.join();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        this.f5109H = null;
        f5102K.c(f5101J, "stop", "851");
    }

    @Override // java.lang.Runnable
    public void run() {
        Fc.p pVarE = null;
        while (this.f5103B && this.f5107F != null) {
            try {
                try {
                    try {
                        f5102K.c(f5101J, "run", "852");
                        this.f5110I = this.f5107F.available() > 0;
                        u uVarB = this.f5107F.b();
                        this.f5110I = false;
                        if (uVarB instanceof Jc.b) {
                            pVarE = this.f5108G.e(uVarB);
                            if (pVarE == null) {
                                throw new MqttException(6);
                            }
                            synchronized (pVarE) {
                                this.f5105D.r((Jc.b) uVarB);
                            }
                        } else {
                            this.f5105D.t(uVarB);
                        }
                    } catch (MqttException e10) {
                        f5102K.e(f5101J, "run", "856", null, e10);
                        this.f5103B = false;
                        this.f5106E.L(pVarE, e10);
                    }
                } catch (IOException e11) {
                    f5102K.c(f5101J, "run", "853");
                    this.f5103B = false;
                    if (!this.f5106E.C()) {
                        this.f5106E.L(pVarE, new MqttException(32109, e11));
                    }
                }
                this.f5110I = false;
            } catch (Throwable th) {
                this.f5110I = false;
                throw th;
            }
        }
        f5102K.c(f5101J, "run", "854");
    }
}
