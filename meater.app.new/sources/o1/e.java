package o1;

import android.util.Base64;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f46277a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46278b;

    /* renamed from: c, reason: collision with root package name */
    private final String f46279c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f46280d;

    /* renamed from: e, reason: collision with root package name */
    private final int f46281e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final String f46282f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f46277a = (String) r1.i.g(str);
        this.f46278b = (String) r1.i.g(str2);
        this.f46279c = (String) r1.i.g(str3);
        this.f46280d = (List) r1.i.g(list);
        this.f46282f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f46280d;
    }

    public int c() {
        return this.f46281e;
    }

    String d() {
        return this.f46282f;
    }

    public String e() {
        return this.f46277a;
    }

    public String f() {
        return this.f46278b;
    }

    public String g() {
        return this.f46279c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f46277a + ", mProviderPackage: " + this.f46278b + ", mQuery: " + this.f46279c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f46280d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f46280d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f46281e);
        return sb2.toString();
    }
}
