package Ic;

import Gc.p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.nio.ByteBuffer;
import javax.net.SocketFactory;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: WebSocketNetworkModule.java */
/* loaded from: classes3.dex */
public class d extends p {

    /* renamed from: n, reason: collision with root package name */
    private static final Kc.b f7024n = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", d.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private final String f7025h;

    /* renamed from: i, reason: collision with root package name */
    private final String f7026i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7027j;

    /* renamed from: k, reason: collision with root package name */
    private final PipedInputStream f7028k;

    /* renamed from: l, reason: collision with root package name */
    private e f7029l;

    /* renamed from: m, reason: collision with root package name */
    private final ByteArrayOutputStream f7030m;

    /* compiled from: WebSocketNetworkModule.java */
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
            d.this.g().write(new b((byte) 2, true, byteBufferWrap.array()).d());
            d.this.g().flush();
        }
    }

    public d(SocketFactory socketFactory, String str, String str2, int i10, String str3) {
        super(socketFactory, str2, i10, str3);
        this.f7030m = new a();
        this.f7025h = str;
        this.f7026i = str2;
        this.f7027j = i10;
        this.f7028k = new PipedInputStream();
        f7024n.d(str3);
    }

    private InputStream f() {
        return super.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OutputStream g() {
        return super.b();
    }

    @Override // Gc.p, Gc.m
    public String a() {
        return "ws://" + this.f7026i + ":" + this.f7027j;
    }

    @Override // Gc.p, Gc.m
    public OutputStream b() {
        return this.f7030m;
    }

    @Override // Gc.p, Gc.m
    public InputStream c() {
        return this.f7028k;
    }

    @Override // Gc.p, Gc.m
    public void start() throws MqttException, IOException {
        super.start();
        new c(f(), g(), this.f7025h, this.f7026i, this.f7027j).a();
        e eVar = new e(f(), this.f7028k);
        this.f7029l = eVar;
        eVar.b("webSocketReceiver");
    }

    @Override // Gc.p, Gc.m
    public void stop() throws IOException {
        g().write(new b((byte) 8, true, "1000".getBytes()).d());
        g().flush();
        e eVar = this.f7029l;
        if (eVar != null) {
            eVar.c();
        }
        super.stop();
    }
}
