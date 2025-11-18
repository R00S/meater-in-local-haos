package p345i.p346a.p347g;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import okhttp3.HttpUrl;
import p345i.p346a.AbstractC9185d;
import p345i.p346a.p347g.p348s.EnumC9209d;
import p345i.p346a.p347g.p348s.EnumC9210e;

/* compiled from: DNSEntry.java */
/* renamed from: i.a.g.b */
/* loaded from: classes2.dex */
public abstract class AbstractC9189b {

    /* renamed from: a */
    private final String f35297a;

    /* renamed from: b */
    private final String f35298b;

    /* renamed from: c */
    private final String f35299c;

    /* renamed from: d */
    private final EnumC9210e f35300d;

    /* renamed from: e */
    private final EnumC9209d f35301e;

    /* renamed from: f */
    private final boolean f35302f;

    /* renamed from: g */
    final Map<AbstractC9185d.a, String> f35303g;

    AbstractC9189b(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z) {
        String str2;
        String str3;
        this.f35298b = str;
        this.f35300d = enumC9210e;
        this.f35301e = enumC9209d;
        this.f35302f = z;
        Map<AbstractC9185d.a, String> mapM29714J = C9204q.m29714J(m29447c());
        this.f35303g = mapM29714J;
        String str4 = mapM29714J.get(AbstractC9185d.a.Domain);
        String str5 = mapM29714J.get(AbstractC9185d.a.Protocol);
        String str6 = mapM29714J.get(AbstractC9185d.a.Application);
        String lowerCase = mapM29714J.get(AbstractC9185d.a.Instance).toLowerCase();
        StringBuilder sb = new StringBuilder();
        int length = str6.length();
        String str7 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (length > 0) {
            str2 = "_" + str6 + ".";
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str2);
        if (str5.length() > 0) {
            str3 = "_" + str5 + ".";
        } else {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str3);
        sb.append(str4);
        sb.append(".");
        String string = sb.toString();
        this.f35299c = string;
        StringBuilder sb2 = new StringBuilder();
        if (lowerCase.length() > 0) {
            str7 = lowerCase + ".";
        }
        sb2.append(str7);
        sb2.append(string);
        this.f35297a = sb2.toString().toLowerCase();
    }

    /* renamed from: a */
    public int m29445a(AbstractC9189b abstractC9189b) {
        byte[] bArrM29467w = m29467w();
        byte[] bArrM29467w2 = abstractC9189b.m29467w();
        int iMin = Math.min(bArrM29467w.length, bArrM29467w2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            if (bArrM29467w[i2] > bArrM29467w2[i2]) {
                return 1;
            }
            if (bArrM29467w[i2] < bArrM29467w2[i2]) {
                return -1;
            }
        }
        return bArrM29467w.length - bArrM29467w2.length;
    }

    /* renamed from: b */
    public String m29446b() {
        String str = this.f35297a;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: c */
    public String m29447c() {
        String str = this.f35298b;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: d */
    public Map<AbstractC9185d.a, String> m29448d() {
        return Collections.unmodifiableMap(this.f35303g);
    }

    /* renamed from: e */
    public EnumC9209d m29449e() {
        EnumC9209d enumC9209d = this.f35301e;
        return enumC9209d != null ? enumC9209d : EnumC9209d.CLASS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC9189b)) {
            return false;
        }
        AbstractC9189b abstractC9189b = (AbstractC9189b) obj;
        return m29446b().equals(abstractC9189b.m29446b()) && m29450f().equals(abstractC9189b.m29450f()) && m29449e() == abstractC9189b.m29449e();
    }

    /* renamed from: f */
    public EnumC9210e m29450f() {
        EnumC9210e enumC9210e = this.f35300d;
        return enumC9210e != null ? enumC9210e : EnumC9210e.TYPE_IGNORE;
    }

    /* renamed from: g */
    public String m29451g() {
        String str = m29448d().get(AbstractC9185d.a.Subtype);
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: h */
    public String m29452h() {
        String str = this.f35299c;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public int hashCode() {
        return m29446b().hashCode() + m29450f().m29755g() + m29449e().m29752k();
    }

    /* renamed from: i */
    public boolean m29453i() {
        if (!this.f35303g.get(AbstractC9185d.a.Application).equals("dns-sd")) {
            return false;
        }
        String str = this.f35303g.get(AbstractC9185d.a.Instance);
        return "b".equals(str) || "db".equals(str) || "r".equals(str) || "dr".equals(str) || "lb".equals(str);
    }

    /* renamed from: j */
    public abstract boolean mo29454j(long j2);

    /* renamed from: k */
    public boolean m29455k() {
        return m29461q() || m29462r();
    }

    /* renamed from: l */
    public boolean mo29456l(AbstractC9189b abstractC9189b) {
        return m29446b().equals(abstractC9189b.m29446b()) && m29464t(abstractC9189b.m29450f()) && m29463s(abstractC9189b.m29449e());
    }

    /* renamed from: m */
    public boolean m29457m(AbstractC9189b abstractC9189b) {
        return abstractC9189b != null && abstractC9189b.m29449e() == m29449e();
    }

    /* renamed from: n */
    public boolean mo29458n(AbstractC9189b abstractC9189b) {
        return abstractC9189b != null && abstractC9189b.m29450f() == m29450f();
    }

    /* renamed from: o */
    public boolean m29459o() {
        return this.f35303g.get(AbstractC9185d.a.Application).equals("dns-sd") && this.f35303g.get(AbstractC9185d.a.Instance).equals("_services");
    }

    /* renamed from: p */
    public boolean m29460p() {
        return this.f35302f;
    }

    /* renamed from: q */
    public boolean m29461q() {
        return this.f35303g.get(AbstractC9185d.a.Domain).endsWith("in-addr.arpa");
    }

    /* renamed from: r */
    public boolean m29462r() {
        return this.f35303g.get(AbstractC9185d.a.Domain).endsWith("ip6.arpa");
    }

    /* renamed from: s */
    public boolean m29463s(EnumC9209d enumC9209d) {
        EnumC9209d enumC9209d2 = EnumC9209d.CLASS_ANY;
        return enumC9209d2 == enumC9209d || enumC9209d2 == m29449e() || m29449e().equals(enumC9209d);
    }

    /* renamed from: t */
    public boolean m29464t(EnumC9210e enumC9210e) {
        return m29450f().equals(enumC9210e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("[" + getClass().getSimpleName() + "@" + System.identityHashCode(this));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" type: ");
        sb2.append(m29450f());
        sb.append(sb2.toString());
        sb.append(", class: " + m29449e());
        sb.append(this.f35302f ? "-unique," : ",");
        sb.append(" name: " + this.f35298b);
        mo29468x(sb);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean m29465u(AbstractC9189b abstractC9189b) {
        return m29451g().equals(abstractC9189b.m29451g());
    }

    /* renamed from: v */
    protected void mo29466v(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(m29447c().getBytes("UTF8"));
        dataOutputStream.writeShort(m29450f().m29755g());
        dataOutputStream.writeShort(m29449e().m29752k());
    }

    /* renamed from: w */
    protected byte[] m29467w() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            mo29466v(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }

    /* renamed from: x */
    protected void mo29468x(StringBuilder sb) {
    }
}
