package p024c.p052i.p057h;

import android.util.Base64;
import java.util.List;
import p024c.p052i.p059j.C0959i;

/* compiled from: FontRequest.java */
/* renamed from: c.i.h.d */
/* loaded from: classes.dex */
public final class C0941d {

    /* renamed from: a */
    private final String f6322a;

    /* renamed from: b */
    private final String f6323b;

    /* renamed from: c */
    private final String f6324c;

    /* renamed from: d */
    private final List<List<byte[]>> f6325d;

    /* renamed from: e */
    private final int f6326e = 0;

    /* renamed from: f */
    private final String f6327f;

    public C0941d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f6322a = (String) C0959i.m6065c(str);
        this.f6323b = (String) C0959i.m6065c(str2);
        this.f6324c = (String) C0959i.m6065c(str3);
        this.f6325d = (List) C0959i.m6065c(list);
        this.f6327f = m5978a(str, str2, str3);
    }

    /* renamed from: a */
    private String m5978a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m5979b() {
        return this.f6325d;
    }

    /* renamed from: c */
    public int m5980c() {
        return this.f6326e;
    }

    /* renamed from: d */
    String m5981d() {
        return this.f6327f;
    }

    /* renamed from: e */
    public String m5982e() {
        return this.f6322a;
    }

    /* renamed from: f */
    public String m5983f() {
        return this.f6323b;
    }

    /* renamed from: g */
    public String m5984g() {
        return this.f6324c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f6322a + ", mProviderPackage: " + this.f6323b + ", mQuery: " + this.f6324c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f6325d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f6325d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f6326e);
        return sb.toString();
    }
}
