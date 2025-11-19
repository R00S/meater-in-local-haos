package Ic;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* compiled from: WebSocketReceiver.java */
/* loaded from: classes3.dex */
public class e implements Runnable {

    /* renamed from: I, reason: collision with root package name */
    private static final String f7032I = "Ic.e";

    /* renamed from: J, reason: collision with root package name */
    private static final Kc.b f7033J = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", e.class.getName());

    /* renamed from: E, reason: collision with root package name */
    private final InputStream f7037E;

    /* renamed from: G, reason: collision with root package name */
    private volatile boolean f7039G;

    /* renamed from: H, reason: collision with root package name */
    private final PipedOutputStream f7040H;

    /* renamed from: B, reason: collision with root package name */
    private boolean f7034B = false;

    /* renamed from: C, reason: collision with root package name */
    private boolean f7035C = false;

    /* renamed from: D, reason: collision with root package name */
    private final Object f7036D = new Object();

    /* renamed from: F, reason: collision with root package name */
    private Thread f7038F = null;

    public e(InputStream inputStream, PipedInputStream pipedInputStream) throws IOException {
        this.f7037E = inputStream;
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        this.f7040H = pipedOutputStream;
        pipedInputStream.connect(pipedOutputStream);
    }

    private void a() throws IOException {
        try {
            this.f7040H.close();
        } catch (IOException unused) {
        }
    }

    public void b(String str) {
        f7033J.c(f7032I, "start", "855");
        synchronized (this.f7036D) {
            try {
                if (!this.f7034B) {
                    this.f7034B = true;
                    Thread thread = new Thread(this, str);
                    this.f7038F = thread;
                    thread.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        this.f7035C = true;
        synchronized (this.f7036D) {
            f7033J.c(f7032I, "stop", "850");
            if (this.f7034B) {
                this.f7034B = false;
                this.f7039G = false;
                a();
                if (!Thread.currentThread().equals(this.f7038F)) {
                    try {
                        this.f7038F.join();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        this.f7038F = null;
        f7033J.c(f7032I, "stop", "851");
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        while (this.f7034B && this.f7037E != null) {
            try {
                f7033J.c(f7032I, "run", "852");
                this.f7039G = this.f7037E.available() > 0;
                b bVar = new b(this.f7037E);
                if (!bVar.g()) {
                    for (int i10 = 0; i10 < bVar.f().length; i10++) {
                        this.f7040H.write(bVar.f()[i10]);
                    }
                    this.f7040H.flush();
                } else if (!this.f7035C) {
                    throw new IOException("Server sent a WebSocket Frame with the Stop OpCode");
                }
                this.f7039G = false;
            } catch (IOException unused) {
                c();
            }
        }
    }
}
