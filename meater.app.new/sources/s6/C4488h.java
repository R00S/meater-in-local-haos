package s6;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import m6.InterfaceC3970e;

/* compiled from: GlideUrl.java */
/* renamed from: s6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4488h implements InterfaceC3970e {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4489i f49319b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f49320c;

    /* renamed from: d, reason: collision with root package name */
    private final String f49321d;

    /* renamed from: e, reason: collision with root package name */
    private String f49322e;

    /* renamed from: f, reason: collision with root package name */
    private URL f49323f;

    /* renamed from: g, reason: collision with root package name */
    private volatile byte[] f49324g;

    /* renamed from: h, reason: collision with root package name */
    private int f49325h;

    public C4488h(URL url) {
        this(url, InterfaceC4489i.f49327b);
    }

    private byte[] d() {
        if (this.f49324g == null) {
            this.f49324g = c().getBytes(InterfaceC3970e.f45117a);
        }
        return this.f49324g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f49322e)) {
            String string = this.f49321d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) H6.k.d(this.f49320c)).toString();
            }
            this.f49322e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f49322e;
    }

    private URL g() {
        if (this.f49323f == null) {
            this.f49323f = new URL(f());
        }
        return this.f49323f;
    }

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f49321d;
        return str != null ? str : ((URL) H6.k.d(this.f49320c)).toString();
    }

    public Map<String, String> e() {
        return this.f49319b.a();
    }

    @Override // m6.InterfaceC3970e
    public boolean equals(Object obj) {
        if (!(obj instanceof C4488h)) {
            return false;
        }
        C4488h c4488h = (C4488h) obj;
        return c().equals(c4488h.c()) && this.f49319b.equals(c4488h.f49319b);
    }

    public URL h() {
        return g();
    }

    @Override // m6.InterfaceC3970e
    public int hashCode() {
        if (this.f49325h == 0) {
            int iHashCode = c().hashCode();
            this.f49325h = iHashCode;
            this.f49325h = (iHashCode * 31) + this.f49319b.hashCode();
        }
        return this.f49325h;
    }

    public String toString() {
        return c();
    }

    public C4488h(String str) {
        this(str, InterfaceC4489i.f49327b);
    }

    public C4488h(URL url, InterfaceC4489i interfaceC4489i) {
        this.f49320c = (URL) H6.k.d(url);
        this.f49321d = null;
        this.f49319b = (InterfaceC4489i) H6.k.d(interfaceC4489i);
    }

    public C4488h(String str, InterfaceC4489i interfaceC4489i) {
        this.f49320c = null;
        this.f49321d = H6.k.b(str);
        this.f49319b = (InterfaceC4489i) H6.k.d(interfaceC4489i);
    }
}
