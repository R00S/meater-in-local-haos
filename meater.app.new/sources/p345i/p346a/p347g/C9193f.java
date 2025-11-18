package p345i.p346a.p347g;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DNSOutgoing.java */
/* renamed from: i.a.g.f */
/* loaded from: classes2.dex */
public final class C9193f extends AbstractC9192e {

    /* renamed from: h */
    public static boolean f35323h = true;

    /* renamed from: i */
    Map<String, Integer> f35324i;

    /* renamed from: j */
    private int f35325j;

    /* renamed from: k */
    private final a f35326k;

    /* renamed from: l */
    private final a f35327l;

    /* renamed from: m */
    private final a f35328m;

    /* renamed from: n */
    private final a f35329n;

    /* renamed from: o */
    private InetSocketAddress f35330o;

    /* compiled from: DNSOutgoing.java */
    /* renamed from: i.a.g.f$a */
    public static class a extends ByteArrayOutputStream {

        /* renamed from: f */
        private final C9193f f35331f;

        /* renamed from: g */
        private final int f35332g;

        a(int i2, C9193f c9193f) {
            this(i2, c9193f, 0);
        }

        /* renamed from: a */
        void m29516a(int i2) {
            write(i2 & 255);
        }

        /* renamed from: b */
        void m29517b(byte[] bArr, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                m29516a(bArr[i2 + i4]);
            }
        }

        /* renamed from: c */
        void m29518c(int i2) {
            m29523k(i2 >> 16);
            m29523k(i2);
        }

        /* renamed from: d */
        void m29519d(String str) {
            m29520e(str, true);
        }

        /* renamed from: e */
        void m29520e(String str, boolean z) {
            while (true) {
                int iIndexOf = str.indexOf(46);
                if (iIndexOf < 0) {
                    iIndexOf = str.length();
                }
                if (iIndexOf <= 0) {
                    m29516a(0);
                    return;
                }
                String strSubstring = str.substring(0, iIndexOf);
                if (z && C9193f.f35323h) {
                    Integer num = this.f35331f.f35324i.get(str);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        m29516a((iIntValue >> 8) | 192);
                        m29516a(iIntValue & 255);
                        return;
                    }
                    this.f35331f.f35324i.put(str, Integer.valueOf(size() + this.f35332g));
                    m29524l(strSubstring, 0, strSubstring.length());
                } else {
                    m29524l(strSubstring, 0, strSubstring.length());
                }
                str = str.substring(iIndexOf);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }

        /* renamed from: f */
        void m29521f(C9194g c9194g) {
            m29519d(c9194g.m29447c());
            m29523k(c9194g.m29450f().m29755g());
            m29523k(c9194g.m29449e().m29752k());
        }

        /* renamed from: j */
        void m29522j(AbstractC9195h abstractC9195h, long j2) {
            m29519d(abstractC9195h.m29447c());
            m29523k(abstractC9195h.m29450f().m29755g());
            m29523k(abstractC9195h.m29449e().m29752k() | ((abstractC9195h.m29460p() && this.f35331f.m29498o()) ? 32768 : 0));
            m29518c(j2 == 0 ? abstractC9195h.m29534E() : abstractC9195h.m29530A(j2));
            a aVar = new a(AdRequest.MAX_CONTENT_URL_LENGTH, this.f35331f, this.f35332g + size() + 2);
            abstractC9195h.mo29548S(aVar);
            byte[] byteArray = aVar.toByteArray();
            m29523k(byteArray.length);
            write(byteArray, 0, byteArray.length);
        }

        /* renamed from: k */
        void m29523k(int i2) {
            m29516a(i2 >> 8);
            m29516a(i2);
        }

        /* renamed from: l */
        void m29524l(String str, int i2, int i3) {
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                char cCharAt = str.charAt(i2 + i5);
                i4 = (cCharAt < 1 || cCharAt > 127) ? cCharAt > 2047 ? i4 + 3 : i4 + 2 : i4 + 1;
            }
            m29516a(i4);
            for (int i6 = 0; i6 < i3; i6++) {
                char cCharAt2 = str.charAt(i2 + i6);
                if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                    m29516a(cCharAt2);
                } else if (cCharAt2 > 2047) {
                    m29516a(((cCharAt2 >> '\f') & 15) | 224);
                    m29516a(((cCharAt2 >> 6) & 63) | 128);
                    m29516a(((cCharAt2 >> 0) & 63) | 128);
                } else {
                    m29516a(((cCharAt2 >> 6) & 31) | 192);
                    m29516a(((cCharAt2 >> 0) & 63) | 128);
                }
            }
        }

        a(int i2, C9193f c9193f, int i3) {
            super(i2);
            this.f35331f = c9193f;
            this.f35332g = i3;
        }
    }

    public C9193f(int i2) {
        this(i2, true, 1460);
    }

    /* renamed from: A */
    public void m29507A(C9194g c9194g) throws IOException {
        a aVar = new a(AdRequest.MAX_CONTENT_URL_LENGTH, this);
        aVar.m29521f(c9194g);
        byte[] byteArray = aVar.toByteArray();
        aVar.close();
        if (byteArray.length >= m29508B()) {
            throw new IOException("message full");
        }
        this.f35319d.add(c9194g);
        this.f35326k.write(byteArray, 0, byteArray.length);
    }

    /* renamed from: B */
    public int m29508B() {
        return ((((this.f35325j - 12) - this.f35326k.size()) - this.f35327l.size()) - this.f35328m.size()) - this.f35329n.size();
    }

    /* renamed from: C */
    public byte[] m29509C() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f35324i.clear();
        a aVar = new a(this.f35325j, this);
        aVar.m29523k(this.f35317b ? 0 : m29489f());
        aVar.m29523k(m29488e());
        aVar.m29523k(m29493j());
        aVar.m29523k(m29491h());
        aVar.m29523k(m29492i());
        aVar.m29523k(m29490g());
        Iterator<C9194g> it = this.f35319d.iterator();
        while (it.hasNext()) {
            aVar.m29521f(it.next());
        }
        Iterator<AbstractC9195h> it2 = this.f35320e.iterator();
        while (it2.hasNext()) {
            aVar.m29522j(it2.next(), jCurrentTimeMillis);
        }
        Iterator<AbstractC9195h> it3 = this.f35321f.iterator();
        while (it3.hasNext()) {
            aVar.m29522j(it3.next(), jCurrentTimeMillis);
        }
        Iterator<AbstractC9195h> it4 = this.f35322g.iterator();
        while (it4.hasNext()) {
            aVar.m29522j(it4.next(), jCurrentTimeMillis);
        }
        byte[] byteArray = aVar.toByteArray();
        try {
            aVar.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    /* renamed from: D */
    public InetSocketAddress m29510D() {
        return this.f35330o;
    }

    /* renamed from: E */
    public int m29511E() {
        return this.f35325j;
    }

    /* renamed from: F */
    public void m29512F(InetSocketAddress inetSocketAddress) {
        this.f35330o = inetSocketAddress;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(m29499p() ? "dns[query:" : "dns[response:");
        stringBuffer.append(" id=0x");
        stringBuffer.append(Integer.toHexString(m29489f()));
        if (m29488e() != 0) {
            stringBuffer.append(", flags=0x");
            stringBuffer.append(Integer.toHexString(m29488e()));
            if (m29500q()) {
                stringBuffer.append(":r");
            }
            if (m29496m()) {
                stringBuffer.append(":aa");
            }
            if (m29501r()) {
                stringBuffer.append(":tc");
            }
        }
        if (m29493j() > 0) {
            stringBuffer.append(", questions=");
            stringBuffer.append(m29493j());
        }
        if (m29491h() > 0) {
            stringBuffer.append(", answers=");
            stringBuffer.append(m29491h());
        }
        if (m29492i() > 0) {
            stringBuffer.append(", authorities=");
            stringBuffer.append(m29492i());
        }
        if (m29490g() > 0) {
            stringBuffer.append(", additionals=");
            stringBuffer.append(m29490g());
        }
        if (m29493j() > 0) {
            stringBuffer.append("\nquestions:");
            for (C9194g c9194g : this.f35319d) {
                stringBuffer.append("\n\t");
                stringBuffer.append(c9194g);
            }
        }
        if (m29491h() > 0) {
            stringBuffer.append("\nanswers:");
            for (AbstractC9195h abstractC9195h : this.f35320e) {
                stringBuffer.append("\n\t");
                stringBuffer.append(abstractC9195h);
            }
        }
        if (m29492i() > 0) {
            stringBuffer.append("\nauthorities:");
            for (AbstractC9195h abstractC9195h2 : this.f35321f) {
                stringBuffer.append("\n\t");
                stringBuffer.append(abstractC9195h2);
            }
        }
        if (m29490g() > 0) {
            stringBuffer.append("\nadditionals:");
            for (AbstractC9195h abstractC9195h3 : this.f35322g) {
                stringBuffer.append("\n\t");
                stringBuffer.append(abstractC9195h3);
            }
        }
        stringBuffer.append("\nnames=");
        stringBuffer.append(this.f35324i);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    /* renamed from: x */
    public void m29513x(C9190c c9190c, AbstractC9195h abstractC9195h) throws IOException {
        if (c9190c == null || !abstractC9195h.m29546Q(c9190c)) {
            m29514y(abstractC9195h, 0L);
        }
    }

    /* renamed from: y */
    public void m29514y(AbstractC9195h abstractC9195h, long j2) throws IOException {
        if (abstractC9195h != null) {
            if (j2 == 0 || !abstractC9195h.mo29454j(j2)) {
                a aVar = new a(AdRequest.MAX_CONTENT_URL_LENGTH, this);
                aVar.m29522j(abstractC9195h, j2);
                byte[] byteArray = aVar.toByteArray();
                aVar.close();
                if (byteArray.length >= m29508B()) {
                    throw new IOException("message full");
                }
                this.f35320e.add(abstractC9195h);
                this.f35327l.write(byteArray, 0, byteArray.length);
            }
        }
    }

    /* renamed from: z */
    public void m29515z(AbstractC9195h abstractC9195h) throws IOException {
        a aVar = new a(AdRequest.MAX_CONTENT_URL_LENGTH, this);
        aVar.m29522j(abstractC9195h, 0L);
        byte[] byteArray = aVar.toByteArray();
        aVar.close();
        if (byteArray.length >= m29508B()) {
            throw new IOException("message full");
        }
        this.f35321f.add(abstractC9195h);
        this.f35328m.write(byteArray, 0, byteArray.length);
    }

    public C9193f(int i2, boolean z, int i3) {
        super(i2, 0, z);
        this.f35324i = new HashMap();
        this.f35325j = i3 > 0 ? i3 : 1460;
        this.f35326k = new a(i3, this);
        this.f35327l = new a(i3, this);
        this.f35328m = new a(i3, this);
        this.f35329n = new a(i3, this);
    }
}
