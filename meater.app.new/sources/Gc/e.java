package Gc;

import Jc.u;
import java.io.IOException;
import java.io.OutputStream;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: CommsSender.java */
/* loaded from: classes3.dex */
public class e implements Runnable {

    /* renamed from: I, reason: collision with root package name */
    private static final String f5111I = "Gc.e";

    /* renamed from: J, reason: collision with root package name */
    private static final Kc.b f5112J = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", e.class.getName());

    /* renamed from: D, reason: collision with root package name */
    private b f5115D;

    /* renamed from: E, reason: collision with root package name */
    private final Jc.g f5116E;

    /* renamed from: F, reason: collision with root package name */
    private a f5117F;

    /* renamed from: G, reason: collision with root package name */
    private f f5118G;

    /* renamed from: B, reason: collision with root package name */
    private boolean f5113B = false;

    /* renamed from: C, reason: collision with root package name */
    private final Object f5114C = new Object();

    /* renamed from: H, reason: collision with root package name */
    private Thread f5119H = null;

    public e(a aVar, b bVar, f fVar, OutputStream outputStream) {
        this.f5115D = null;
        this.f5117F = null;
        this.f5118G = null;
        this.f5116E = new Jc.g(bVar, outputStream);
        this.f5117F = aVar;
        this.f5115D = bVar;
        this.f5118G = fVar;
        f5112J.d(aVar.r().a());
    }

    private void a(u uVar, Exception exc) {
        f5112J.e(f5111I, "handleRunException", "804", null, exc);
        MqttException mqttException = !(exc instanceof MqttException) ? new MqttException(32109, exc) : (MqttException) exc;
        this.f5113B = false;
        this.f5117F.L(null, mqttException);
    }

    public void b(String str) {
        synchronized (this.f5114C) {
            try {
                if (!this.f5113B) {
                    this.f5113B = true;
                    Thread thread = new Thread(this, str);
                    this.f5119H = thread;
                    thread.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        synchronized (this.f5114C) {
            f5112J.c(f5111I, "stop", "800");
            if (this.f5113B) {
                this.f5113B = false;
                if (!Thread.currentThread().equals(this.f5119H)) {
                    while (this.f5119H.isAlive()) {
                        try {
                            this.f5115D.q();
                            this.f5119H.join(100L);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
            this.f5119H = null;
            f5112J.c(f5111I, "stop", "801");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        u uVarH = null;
        while (this.f5113B && this.f5116E != null) {
            try {
                uVarH = this.f5115D.h();
                if (uVarH != null) {
                    f5112J.g(f5111I, "run", "802", new Object[]{uVarH.o(), uVarH});
                    if (uVarH instanceof Jc.b) {
                        this.f5116E.a(uVarH);
                        this.f5116E.flush();
                    } else {
                        Fc.p pVarE = this.f5118G.e(uVarH);
                        if (pVarE != null) {
                            synchronized (pVarE) {
                                this.f5116E.a(uVarH);
                                try {
                                    this.f5116E.flush();
                                } catch (IOException e10) {
                                    if (!(uVarH instanceof Jc.e)) {
                                        throw e10;
                                    }
                                }
                                this.f5115D.v(uVarH);
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    f5112J.c(f5111I, "run", "803");
                    this.f5113B = false;
                }
            } catch (MqttException e11) {
                a(uVarH, e11);
            } catch (Exception e12) {
                a(uVarH, e12);
            }
        }
        f5112J.c(f5111I, "run", "805");
    }
}
