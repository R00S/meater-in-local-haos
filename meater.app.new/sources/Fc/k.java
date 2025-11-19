package Fc;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import javax.net.SocketFactory;

/* compiled from: MqttConnectOptions.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: e, reason: collision with root package name */
    private String f4739e;

    /* renamed from: f, reason: collision with root package name */
    private char[] f4740f;

    /* renamed from: g, reason: collision with root package name */
    private SocketFactory f4741g;

    /* renamed from: a, reason: collision with root package name */
    private int f4735a = 60;

    /* renamed from: b, reason: collision with root package name */
    private int f4736b = 10;

    /* renamed from: c, reason: collision with root package name */
    private String f4737c = null;

    /* renamed from: d, reason: collision with root package name */
    private m f4738d = null;

    /* renamed from: h, reason: collision with root package name */
    private Properties f4742h = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4743i = true;

    /* renamed from: j, reason: collision with root package name */
    private int f4744j = 10;

    /* renamed from: k, reason: collision with root package name */
    private String[] f4745k = null;

    /* renamed from: l, reason: collision with root package name */
    private int f4746l = 0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4747m = false;

    protected static int u(String str) {
        try {
            URI uri = new URI(str);
            if (uri.getScheme().equals("ws")) {
                return 3;
            }
            if (uri.getScheme().equals("wss")) {
                return 4;
            }
            if (!uri.getPath().equals("")) {
                throw new IllegalArgumentException(str);
            }
            if (uri.getScheme().equals("tcp")) {
                return 0;
            }
            if (uri.getScheme().equals("ssl")) {
                return 1;
            }
            if (uri.getScheme().equals("local")) {
                return 2;
            }
            throw new IllegalArgumentException(str);
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException(str);
        }
    }

    private void v(String str, Object obj) {
        if (str == null || obj == null) {
            throw new IllegalArgumentException();
        }
        q.b(str, false);
    }

    public int a() {
        return this.f4744j;
    }

    public Properties b() {
        Properties properties = new Properties();
        properties.put("MqttVersion", Integer.valueOf(e()));
        properties.put("CleanSession", Boolean.valueOf(n()));
        properties.put("ConTimeout", Integer.valueOf(a()));
        properties.put("KeepAliveInterval", Integer.valueOf(c()));
        properties.put("UserName", j() == null ? "null" : j());
        properties.put("WillDestination", k() == null ? "null" : k());
        if (i() == null) {
            properties.put("SocketFactory", "null");
        } else {
            properties.put("SocketFactory", i());
        }
        if (g() == null) {
            properties.put("SSLProperties", "null");
        } else {
            properties.put("SSLProperties", g());
        }
        return properties;
    }

    public int c() {
        return this.f4735a;
    }

    public int d() {
        return this.f4736b;
    }

    public int e() {
        return this.f4746l;
    }

    public char[] f() {
        return this.f4740f;
    }

    public Properties g() {
        return this.f4742h;
    }

    public String[] h() {
        return this.f4745k;
    }

    public SocketFactory i() {
        return this.f4741g;
    }

    public String j() {
        return this.f4739e;
    }

    public String k() {
        return this.f4737c;
    }

    public m l() {
        return this.f4738d;
    }

    public boolean m() {
        return this.f4747m;
    }

    public boolean n() {
        return this.f4743i;
    }

    public void o(boolean z10) {
        this.f4743i = z10;
    }

    public void p(int i10) {
        if (i10 != 0 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException();
        }
        this.f4746l = i10;
    }

    public void q(char[] cArr) {
        this.f4740f = cArr;
    }

    public void r(String str) {
        if (str != null && str.trim().equals("")) {
            throw new IllegalArgumentException();
        }
        this.f4739e = str;
    }

    protected void s(String str, m mVar, int i10, boolean z10) {
        this.f4737c = str;
        this.f4738d = mVar;
        mVar.j(i10);
        this.f4738d.k(z10);
        this.f4738d.h(false);
    }

    public void t(String str, byte[] bArr, int i10, boolean z10) {
        v(str, bArr);
        s(str, new m(bArr), i10, z10);
    }

    public String toString() {
        return Mc.a.a(b(), "Connection options");
    }
}
