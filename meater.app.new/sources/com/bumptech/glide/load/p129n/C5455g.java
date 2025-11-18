package com.bumptech.glide.load.p129n;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.p145r.C5596j;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: GlideUrl.java */
/* renamed from: com.bumptech.glide.load.n.g */
/* loaded from: classes.dex */
public class C5455g implements InterfaceC5423f {

    /* renamed from: b */
    private final InterfaceC5456h f13626b;

    /* renamed from: c */
    private final URL f13627c;

    /* renamed from: d */
    private final String f13628d;

    /* renamed from: e */
    private String f13629e;

    /* renamed from: f */
    private URL f13630f;

    /* renamed from: g */
    private volatile byte[] f13631g;

    /* renamed from: h */
    private int f13632h;

    public C5455g(URL url) {
        this(url, InterfaceC5456h.f13634b);
    }

    /* renamed from: b */
    private byte[] m10537b() {
        if (this.f13631g == null) {
            this.f13631g = m10540a().getBytes(InterfaceC5423f.f13555a);
        }
        return this.f13631g;
    }

    /* renamed from: d */
    private String m10538d() {
        if (TextUtils.isEmpty(this.f13629e)) {
            String string = this.f13628d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) C5596j.m11042d(this.f13627c)).toString();
            }
            this.f13629e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f13629e;
    }

    /* renamed from: e */
    private URL m10539e() throws MalformedURLException {
        if (this.f13630f == null) {
            this.f13630f = new URL(m10538d());
        }
        return this.f13630f;
    }

    /* renamed from: a */
    public String m10540a() {
        String str = this.f13628d;
        return str != null ? str : ((URL) C5596j.m11042d(this.f13627c)).toString();
    }

    /* renamed from: c */
    public Map<String, String> m10541c() {
        return this.f13626b.mo10543a();
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public boolean equals(Object obj) {
        if (!(obj instanceof C5455g)) {
            return false;
        }
        C5455g c5455g = (C5455g) obj;
        return m10540a().equals(c5455g.m10540a()) && this.f13626b.equals(c5455g.f13626b);
    }

    /* renamed from: f */
    public URL m10542f() throws MalformedURLException {
        return m10539e();
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public int hashCode() {
        if (this.f13632h == 0) {
            int iHashCode = m10540a().hashCode();
            this.f13632h = iHashCode;
            this.f13632h = (iHashCode * 31) + this.f13626b.hashCode();
        }
        return this.f13632h;
    }

    public String toString() {
        return m10540a();
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(m10537b());
    }

    public C5455g(String str) {
        this(str, InterfaceC5456h.f13634b);
    }

    public C5455g(URL url, InterfaceC5456h interfaceC5456h) {
        this.f13627c = (URL) C5596j.m11042d(url);
        this.f13628d = null;
        this.f13626b = (InterfaceC5456h) C5596j.m11042d(interfaceC5456h);
    }

    public C5455g(String str, InterfaceC5456h interfaceC5456h) {
        this.f13627c = null;
        this.f13628d = C5596j.m11040b(str);
        this.f13626b = (InterfaceC5456h) C5596j.m11042d(interfaceC5456h);
    }
}
