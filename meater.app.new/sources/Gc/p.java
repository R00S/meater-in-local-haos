package Gc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: TCPNetworkModule.java */
/* loaded from: classes3.dex */
public class p implements m {

    /* renamed from: f, reason: collision with root package name */
    private static final String f5156f = "Gc.p";

    /* renamed from: g, reason: collision with root package name */
    private static final Kc.b f5157g = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", p.class.getName());

    /* renamed from: a, reason: collision with root package name */
    protected Socket f5158a;

    /* renamed from: b, reason: collision with root package name */
    private final SocketFactory f5159b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5160c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5161d;

    /* renamed from: e, reason: collision with root package name */
    private int f5162e;

    public p(SocketFactory socketFactory, String str, int i10, String str2) {
        f5157g.d(str2);
        this.f5159b = socketFactory;
        this.f5160c = str;
        this.f5161d = i10;
    }

    @Override // Gc.m
    public String a() {
        return "tcp://" + this.f5160c + ":" + this.f5161d;
    }

    @Override // Gc.m
    public OutputStream b() {
        return this.f5158a.getOutputStream();
    }

    @Override // Gc.m
    public InputStream c() {
        return this.f5158a.getInputStream();
    }

    public void d(int i10) {
        this.f5162e = i10;
    }

    @Override // Gc.m
    public void start() throws MqttException, IOException {
        try {
            f5157g.g(f5156f, "start", "252", new Object[]{this.f5160c, Integer.valueOf(this.f5161d), Long.valueOf(this.f5162e * 1000)});
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f5160c, this.f5161d);
            Socket socketCreateSocket = this.f5159b.createSocket();
            this.f5158a = socketCreateSocket;
            socketCreateSocket.connect(inetSocketAddress, this.f5162e * 1000);
        } catch (ConnectException e10) {
            f5157g.e(f5156f, "start", "250", null, e10);
            throw new MqttException(32103, e10);
        }
    }

    @Override // Gc.m
    public void stop() throws IOException {
        Socket socket = this.f5158a;
        if (socket != null) {
            socket.close();
        }
    }
}
