package Gc;

import java.io.IOException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.eclipse.paho.client.mqttv3.MqttException;

/* compiled from: SSLNetworkModule.java */
/* loaded from: classes3.dex */
public class o extends p {

    /* renamed from: l, reason: collision with root package name */
    private static final String f5150l = "Gc.o";

    /* renamed from: m, reason: collision with root package name */
    private static final Kc.b f5151m = Kc.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", o.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private String[] f5152h;

    /* renamed from: i, reason: collision with root package name */
    private int f5153i;

    /* renamed from: j, reason: collision with root package name */
    private final String f5154j;

    /* renamed from: k, reason: collision with root package name */
    private final int f5155k;

    public o(SSLSocketFactory sSLSocketFactory, String str, int i10, String str2) {
        super(sSLSocketFactory, str, i10, str2);
        this.f5154j = str;
        this.f5155k = i10;
        f5151m.d(str2);
    }

    @Override // Gc.p, Gc.m
    public String a() {
        return "ssl://" + this.f5154j + ":" + this.f5155k;
    }

    public void e(String[] strArr) {
        this.f5152h = strArr;
        if (this.f5158a == null || strArr == null) {
            return;
        }
        if (f5151m.h(5)) {
            String str = "";
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 > 0) {
                    str = str + ",";
                }
                str = str + strArr[i10];
            }
            f5151m.g(f5150l, "setEnabledCiphers", "260", new Object[]{str});
        }
        ((SSLSocket) this.f5158a).setEnabledCipherSuites(strArr);
    }

    public void f(int i10) {
        super.d(i10);
        this.f5153i = i10;
    }

    @Override // Gc.p, Gc.m
    public void start() throws MqttException, IOException {
        super.start();
        e(this.f5152h);
        int soTimeout = this.f5158a.getSoTimeout();
        if (soTimeout == 0) {
            this.f5158a.setSoTimeout(this.f5153i * 1000);
        }
        ((SSLSocket) this.f5158a).startHandshake();
        this.f5158a.setSoTimeout(soTimeout);
    }
}
