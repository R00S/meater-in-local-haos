package Ic;

import Gc.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.nio.ByteBuffer;
import javax.net.ssl.SSLSocketFactory;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: WebSocketSecureNetworkModule.java */
/* loaded from: classes3.dex */
public class f extends o {

    /* renamed from: t, reason: collision with root package name */
    private static final Kc.b f7041t = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private final PipedInputStream f7042n;

    /* renamed from: o, reason: collision with root package name */
    private e f7043o;

    /* renamed from: p, reason: collision with root package name */
    private final String f7044p;

    /* renamed from: q, reason: collision with root package name */
    private final String f7045q;

    /* renamed from: r, reason: collision with root package name */
    private final int f7046r;

    /* renamed from: s, reason: collision with root package name */
    private final ByteArrayOutputStream f7047s;

    /* compiled from: WebSocketSecureNetworkModule.java */
    class a extends ByteArrayOutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            ByteBuffer byteBufferWrap;
            synchronized (this) {
                byteBufferWrap = ByteBuffer.wrap(toByteArray());
                reset();
            }
            f.this.i().write(new b((byte) 2, true, byteBufferWrap.array()).d());
            f.this.i().flush();
        }
    }

    public f(SSLSocketFactory sSLSocketFactory, String str, String str2, int i10, String str3) {
        super(sSLSocketFactory, str2, i10, str3);
        this.f7047s = new a();
        this.f7044p = str;
        this.f7045q = str2;
        this.f7046r = i10;
        this.f7042n = new PipedInputStream();
        f7041t.d(str3);
    }

    private InputStream h() {
        return super.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OutputStream i() {
        return super.b();
    }

    @Override // Gc.o, Gc.p, Gc.m
    public String a() {
        return "wss://" + this.f7045q + ":" + this.f7046r;
    }

    @Override // Gc.p, Gc.m
    public OutputStream b() {
        return this.f7047s;
    }

    @Override // Gc.p, Gc.m
    public InputStream c() {
        return this.f7042n;
    }

    @Override // Gc.o, Gc.p, Gc.m
    public void start() throws MqttException, IOException {
        super.start();
        new c(super.c(), super.b(), this.f7044p, this.f7045q, this.f7046r).a();
        e eVar = new e(h(), this.f7042n);
        this.f7043o = eVar;
        eVar.b("WssSocketReceiver");
    }

    @Override // Gc.p, Gc.m
    public void stop() throws IOException {
        i().write(new b((byte) 8, true, "1000".getBytes()).d());
        i().flush();
        e eVar = this.f7043o;
        if (eVar != null) {
            eVar.c();
        }
        super.stop();
    }
}
