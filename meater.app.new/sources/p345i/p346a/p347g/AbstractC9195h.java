package p345i.p346a.p347g;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p345i.p346a.AbstractC9184c;
import p345i.p346a.AbstractC9185d;
import p345i.p346a.p347g.C9193f;
import p345i.p346a.p347g.InterfaceC9201n;
import p345i.p346a.p347g.p348s.EnumC9209d;
import p345i.p346a.p347g.p348s.EnumC9210e;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: DNSRecord.java */
/* renamed from: i.a.g.h */
/* loaded from: classes2.dex */
public abstract class AbstractC9195h extends AbstractC9189b {

    /* renamed from: h */
    private static InterfaceC9732b f35335h = C9733c.m32189i(AbstractC9195h.class.getName());

    /* renamed from: i */
    public static final byte[] f35336i = {0};

    /* renamed from: j */
    private int f35337j;

    /* renamed from: k */
    private long f35338k;

    /* renamed from: l */
    private int f35339l;

    /* renamed from: m */
    private final int f35340m;

    /* renamed from: n */
    private InetAddress f35341n;

    /* compiled from: DNSRecord.java */
    /* renamed from: i.a.g.h$b */
    public static class b extends AbstractC9195h {

        /* renamed from: o */
        String f35344o;

        /* renamed from: p */
        String f35345p;

        public b(String str, EnumC9209d enumC9209d, boolean z, int i2, String str2, String str3) {
            super(str, EnumC9210e.TYPE_HINFO, enumC9209d, z, i2);
            this.f35345p = str2;
            this.f35344o = str3;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: B */
        public AbstractC9184c mo29531B(C9199l c9199l) {
            AbstractC9185d abstractC9185dMo29533D = mo29533D(false);
            ((C9204q) abstractC9185dMo29533D).m29740c0(c9199l);
            return new C9203p(c9199l, abstractC9185dMo29533D.mo29429s(), abstractC9185dMo29533D.mo29421k(), abstractC9185dMo29533D);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: D */
        public AbstractC9185d mo29533D(boolean z) {
            HashMap map = new HashMap(2);
            map.put("cpu", this.f35345p);
            map.put("os", this.f35344o);
            return new C9204q(m29448d(), 0, 0, 0, z, map);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: F */
        boolean mo29535F(C9199l c9199l, long j2) {
            return false;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: G */
        boolean mo29536G(C9199l c9199l) {
            return false;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: I */
        public boolean mo29538I() {
            return true;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: N */
        boolean mo29543N(AbstractC9195h abstractC9195h) {
            if (!(abstractC9195h instanceof b)) {
                return false;
            }
            b bVar = (b) abstractC9195h;
            String str = this.f35345p;
            if (str != null || bVar.f35345p == null) {
                return (this.f35344o != null || bVar.f35344o == null) && str.equals(bVar.f35345p) && this.f35344o.equals(bVar.f35344o);
            }
            return false;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: S */
        void mo29548S(C9193f.a aVar) {
            String str = this.f35345p + " " + this.f35344o;
            aVar.m29524l(str, 0, str.length());
        }

        @Override // p345i.p346a.p347g.AbstractC9195h, p345i.p346a.p347g.AbstractC9189b
        /* renamed from: x */
        protected void mo29468x(StringBuilder sb) {
            super.mo29468x(sb);
            sb.append(" cpu: '" + this.f35345p + "' os: '" + this.f35344o + "'");
        }
    }

    /* compiled from: DNSRecord.java */
    /* renamed from: i.a.g.h$c */
    public static class c extends a {
        c(String str, EnumC9209d enumC9209d, boolean z, int i2, InetAddress inetAddress) {
            super(str, EnumC9210e.TYPE_A, enumC9209d, z, i2, inetAddress);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h.a, p345i.p346a.p347g.AbstractC9195h
        /* renamed from: D */
        public AbstractC9185d mo29533D(boolean z) {
            C9204q c9204q = (C9204q) super.mo29533D(z);
            c9204q.m29720B((Inet4Address) this.f35343p);
            return c9204q;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: S */
        void mo29548S(C9193f.a aVar) {
            InetAddress inetAddress = this.f35343p;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (!(this.f35343p instanceof Inet4Address)) {
                    byte[] bArr = new byte[4];
                    System.arraycopy(address, 12, bArr, 0, 4);
                    address = bArr;
                }
                aVar.m29517b(address, 0, address.length);
            }
        }

        c(String str, EnumC9209d enumC9209d, boolean z, int i2, byte[] bArr) {
            super(str, EnumC9210e.TYPE_A, enumC9209d, z, i2, bArr);
        }
    }

    /* compiled from: DNSRecord.java */
    /* renamed from: i.a.g.h$d */
    public static class d extends a {
        d(String str, EnumC9209d enumC9209d, boolean z, int i2, InetAddress inetAddress) {
            super(str, EnumC9210e.TYPE_AAAA, enumC9209d, z, i2, inetAddress);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h.a, p345i.p346a.p347g.AbstractC9195h
        /* renamed from: D */
        public AbstractC9185d mo29533D(boolean z) {
            C9204q c9204q = (C9204q) super.mo29533D(z);
            c9204q.m29721C((Inet6Address) this.f35343p);
            return c9204q;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: S */
        void mo29548S(C9193f.a aVar) {
            InetAddress inetAddress = this.f35343p;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (this.f35343p instanceof Inet4Address) {
                    byte[] bArr = new byte[16];
                    for (int i2 = 0; i2 < 16; i2++) {
                        if (i2 < 11) {
                            bArr[i2] = address[i2 - 12];
                        } else {
                            bArr[i2] = 0;
                        }
                    }
                    address = bArr;
                }
                aVar.m29517b(address, 0, address.length);
            }
        }

        d(String str, EnumC9209d enumC9209d, boolean z, int i2, byte[] bArr) {
            super(str, EnumC9210e.TYPE_AAAA, enumC9209d, z, i2, bArr);
        }
    }

    /* compiled from: DNSRecord.java */
    /* renamed from: i.a.g.h$e */
    public static class e extends AbstractC9195h {

        /* renamed from: o */
        private final String f35346o;

        public e(String str, EnumC9209d enumC9209d, boolean z, int i2, String str2) {
            super(str, EnumC9210e.TYPE_PTR, enumC9209d, z, i2);
            this.f35346o = str2;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: B */
        public AbstractC9184c mo29531B(C9199l c9199l) {
            AbstractC9185d abstractC9185dMo29533D = mo29533D(false);
            ((C9204q) abstractC9185dMo29533D).m29740c0(c9199l);
            String strMo29429s = abstractC9185dMo29533D.mo29429s();
            return new C9203p(c9199l, strMo29429s, C9199l.m29634B1(strMo29429s, m29553T()), abstractC9185dMo29533D);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: D */
        public AbstractC9185d mo29533D(boolean z) {
            if (m29459o()) {
                return new C9204q(C9204q.m29714J(m29553T()), 0, 0, 0, z, (byte[]) null);
            }
            if (m29455k()) {
                return new C9204q(m29448d(), 0, 0, 0, z, (byte[]) null);
            }
            if (m29453i()) {
                return new C9204q(m29448d(), 0, 0, 0, z, (byte[]) null);
            }
            Map<AbstractC9185d.a, String> mapM29714J = C9204q.m29714J(m29553T());
            AbstractC9185d.a aVar = AbstractC9185d.a.Subtype;
            mapM29714J.put(aVar, m29448d().get(aVar));
            return new C9204q(mapM29714J, 0, 0, 0, z, m29553T());
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: F */
        boolean mo29535F(C9199l c9199l, long j2) {
            return false;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: G */
        boolean mo29536G(C9199l c9199l) {
            return false;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: I */
        public boolean mo29538I() {
            return false;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: N */
        boolean mo29543N(AbstractC9195h abstractC9195h) {
            if (!(abstractC9195h instanceof e)) {
                return false;
            }
            e eVar = (e) abstractC9195h;
            String str = this.f35346o;
            if (str != null || eVar.f35346o == null) {
                return str.equals(eVar.f35346o);
            }
            return false;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: S */
        void mo29548S(C9193f.a aVar) {
            aVar.m29519d(this.f35346o);
        }

        /* renamed from: T */
        String m29553T() {
            return this.f35346o;
        }

        @Override // p345i.p346a.p347g.AbstractC9189b
        /* renamed from: l */
        public boolean mo29456l(AbstractC9189b abstractC9189b) {
            return super.mo29456l(abstractC9189b) && (abstractC9189b instanceof e) && mo29543N((e) abstractC9189b);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h, p345i.p346a.p347g.AbstractC9189b
        /* renamed from: x */
        protected void mo29468x(StringBuilder sb) {
            super.mo29468x(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" alias: '");
            String str = this.f35346o;
            sb2.append(str != null ? str.toString() : "null");
            sb2.append("'");
            sb.append(sb2.toString());
        }
    }

    /* compiled from: DNSRecord.java */
    /* renamed from: i.a.g.h$f */
    public static class f extends AbstractC9195h {

        /* renamed from: o */
        private static InterfaceC9732b f35347o = C9733c.m32189i(f.class.getName());

        /* renamed from: p */
        private final int f35348p;

        /* renamed from: q */
        private final int f35349q;

        /* renamed from: r */
        private final int f35350r;

        /* renamed from: s */
        private final String f35351s;

        public f(String str, EnumC9209d enumC9209d, boolean z, int i2, int i3, int i4, int i5, String str2) {
            super(str, EnumC9210e.TYPE_SRV, enumC9209d, z, i2);
            this.f35348p = i3;
            this.f35349q = i4;
            this.f35350r = i5;
            this.f35351s = str2;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: B */
        public AbstractC9184c mo29531B(C9199l c9199l) {
            AbstractC9185d abstractC9185dMo29533D = mo29533D(false);
            ((C9204q) abstractC9185dMo29533D).m29740c0(c9199l);
            return new C9203p(c9199l, abstractC9185dMo29533D.mo29429s(), abstractC9185dMo29533D.mo29421k(), abstractC9185dMo29533D);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: D */
        public AbstractC9185d mo29533D(boolean z) {
            return new C9204q(m29448d(), this.f35350r, this.f35349q, this.f35348p, z, (byte[]) null);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: F */
        boolean mo29535F(C9199l c9199l, long j2) {
            C9204q c9204q = (C9204q) c9199l.m29687y0().get(m29446b());
            if (c9204q != null && ((c9204q.m29732R() || c9204q.m29731Q()) && (this.f35350r != c9204q.mo29422l() || !this.f35351s.equalsIgnoreCase(c9199l.m29674n0().m29624q())))) {
                f35347o.mo32174c("handleQuery() Conflicting probe detected from: " + m29550z());
                f fVar = new f(c9204q.mo29425o(), EnumC9209d.CLASS_IN, true, 3600, c9204q.mo29423m(), c9204q.mo29430t(), c9204q.mo29422l(), c9199l.m29674n0().m29624q());
                try {
                    if (c9199l.m29670i0().equals(m29550z())) {
                        f35347o.mo32179h("Got conflicting probe from ourselves\nincoming: " + toString() + "\nlocal   : " + fVar.toString());
                    }
                } catch (IOException e2) {
                    f35347o.mo32177f("IOException", e2);
                }
                int iM29445a = m29445a(fVar);
                if (iM29445a == 0) {
                    f35347o.mo32174c("handleQuery() Ignoring a identical service query");
                    return false;
                }
                if (c9204q.m29734T() && iM29445a > 0) {
                    String lowerCase = c9204q.mo29425o().toLowerCase();
                    c9204q.m29741d0(InterfaceC9201n.c.m29709a().mo29706a(c9199l.m29674n0().m29622o(), c9204q.mo29421k(), InterfaceC9201n.d.SERVICE));
                    c9199l.m29687y0().remove(lowerCase);
                    c9199l.m29687y0().put(c9204q.mo29425o().toLowerCase(), c9204q);
                    f35347o.mo32174c("handleQuery() Lost tie break: new unique name chosen:" + c9204q.mo29421k());
                    c9204q.m29739b0();
                    return true;
                }
            }
            return false;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: G */
        boolean mo29536G(C9199l c9199l) {
            C9204q c9204q = (C9204q) c9199l.m29687y0().get(m29446b());
            if (c9204q == null) {
                return false;
            }
            if (this.f35350r == c9204q.mo29422l() && this.f35351s.equalsIgnoreCase(c9199l.m29674n0().m29624q())) {
                return false;
            }
            f35347o.mo32174c("handleResponse() Denial detected");
            if (c9204q.m29734T()) {
                String lowerCase = c9204q.mo29425o().toLowerCase();
                c9204q.m29741d0(InterfaceC9201n.c.m29709a().mo29706a(c9199l.m29674n0().m29622o(), c9204q.mo29421k(), InterfaceC9201n.d.SERVICE));
                c9199l.m29687y0().remove(lowerCase);
                c9199l.m29687y0().put(c9204q.mo29425o().toLowerCase(), c9204q);
                f35347o.mo32174c("handleResponse() New unique name chose:" + c9204q.mo29421k());
            }
            c9204q.m29739b0();
            return true;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: I */
        public boolean mo29538I() {
            return true;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: N */
        boolean mo29543N(AbstractC9195h abstractC9195h) {
            if (!(abstractC9195h instanceof f)) {
                return false;
            }
            f fVar = (f) abstractC9195h;
            return this.f35348p == fVar.f35348p && this.f35349q == fVar.f35349q && this.f35350r == fVar.f35350r && this.f35351s.equals(fVar.f35351s);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: S */
        void mo29548S(C9193f.a aVar) {
            aVar.m29523k(this.f35348p);
            aVar.m29523k(this.f35349q);
            aVar.m29523k(this.f35350r);
            if (C9190c.f35305i) {
                aVar.m29519d(this.f35351s);
                return;
            }
            String str = this.f35351s;
            aVar.m29524l(str, 0, str.length());
            aVar.m29516a(0);
        }

        /* renamed from: T */
        public int m29554T() {
            return this.f35350r;
        }

        /* renamed from: U */
        public int m29555U() {
            return this.f35348p;
        }

        /* renamed from: V */
        String m29556V() {
            return this.f35351s;
        }

        /* renamed from: W */
        public int m29557W() {
            return this.f35349q;
        }

        @Override // p345i.p346a.p347g.AbstractC9189b
        /* renamed from: v */
        protected void mo29466v(DataOutputStream dataOutputStream) throws IOException {
            super.mo29466v(dataOutputStream);
            dataOutputStream.writeShort(this.f35348p);
            dataOutputStream.writeShort(this.f35349q);
            dataOutputStream.writeShort(this.f35350r);
            try {
                dataOutputStream.write(this.f35351s.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }

        @Override // p345i.p346a.p347g.AbstractC9195h, p345i.p346a.p347g.AbstractC9189b
        /* renamed from: x */
        protected void mo29468x(StringBuilder sb) {
            super.mo29468x(sb);
            sb.append(" server: '" + this.f35351s + ":" + this.f35350r + "'");
        }
    }

    /* compiled from: DNSRecord.java */
    /* renamed from: i.a.g.h$g */
    public static class g extends AbstractC9195h {

        /* renamed from: o */
        private final byte[] f35352o;

        public g(String str, EnumC9209d enumC9209d, boolean z, int i2, byte[] bArr) {
            super(str, EnumC9210e.TYPE_TXT, enumC9209d, z, i2);
            this.f35352o = (bArr == null || bArr.length <= 0) ? AbstractC9195h.f35336i : bArr;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: B */
        public AbstractC9184c mo29531B(C9199l c9199l) {
            AbstractC9185d abstractC9185dMo29533D = mo29533D(false);
            ((C9204q) abstractC9185dMo29533D).m29740c0(c9199l);
            return new C9203p(c9199l, abstractC9185dMo29533D.mo29429s(), abstractC9185dMo29533D.mo29421k(), abstractC9185dMo29533D);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: D */
        public AbstractC9185d mo29533D(boolean z) {
            return new C9204q(m29448d(), 0, 0, 0, z, this.f35352o);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: F */
        boolean mo29535F(C9199l c9199l, long j2) {
            return false;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: G */
        boolean mo29536G(C9199l c9199l) {
            return false;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: I */
        public boolean mo29538I() {
            return true;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: N */
        boolean mo29543N(AbstractC9195h abstractC9195h) {
            if (!(abstractC9195h instanceof g)) {
                return false;
            }
            g gVar = (g) abstractC9195h;
            byte[] bArr = this.f35352o;
            if ((bArr == null && gVar.f35352o != null) || gVar.f35352o.length != bArr.length) {
                return false;
            }
            int length = bArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    return true;
                }
                if (gVar.f35352o[i2] != this.f35352o[i2]) {
                    return false;
                }
                length = i2;
            }
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: S */
        void mo29548S(C9193f.a aVar) {
            byte[] bArr = this.f35352o;
            aVar.m29517b(bArr, 0, bArr.length);
        }

        /* renamed from: T */
        byte[] m29558T() {
            return this.f35352o;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h, p345i.p346a.p347g.AbstractC9189b
        /* renamed from: x */
        protected void mo29468x(StringBuilder sb) {
            String str;
            super.mo29468x(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" text: '");
            if (this.f35352o.length > 20) {
                str = new String(this.f35352o, 0, 17) + "...";
            } else {
                str = new String(this.f35352o);
            }
            sb2.append(str);
            sb2.append("'");
            sb.append(sb2.toString());
        }
    }

    AbstractC9195h(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z, int i2) {
        super(str, enumC9210e, enumC9209d, z);
        this.f35337j = i2;
        this.f35338k = System.currentTimeMillis();
        int iNextInt = new Random().nextInt(3);
        this.f35340m = iNextInt;
        this.f35339l = iNextInt + 80;
    }

    /* renamed from: A */
    int m29530A(long j2) {
        return (int) Math.max(0L, (m29549y(100) - j2) / 1000);
    }

    /* renamed from: B */
    public abstract AbstractC9184c mo29531B(C9199l c9199l);

    /* renamed from: C */
    public AbstractC9185d m29532C() {
        return mo29533D(false);
    }

    /* renamed from: D */
    public abstract AbstractC9185d mo29533D(boolean z);

    /* renamed from: E */
    public int m29534E() {
        return this.f35337j;
    }

    /* renamed from: F */
    abstract boolean mo29535F(C9199l c9199l, long j2);

    /* renamed from: G */
    abstract boolean mo29536G(C9199l c9199l);

    /* renamed from: H */
    public void m29537H() {
        int i2 = this.f35339l + 5;
        this.f35339l = i2;
        if (i2 > 100) {
            this.f35339l = 100;
        }
    }

    /* renamed from: I */
    public abstract boolean mo29538I();

    /* renamed from: J */
    public boolean m29539J(long j2) {
        return m29549y(50) <= j2;
    }

    /* renamed from: K */
    public boolean m29540K(long j2) {
        return m29549y(this.f35339l) <= j2;
    }

    /* renamed from: L */
    void m29541L(AbstractC9195h abstractC9195h) {
        this.f35338k = abstractC9195h.f35338k;
        this.f35337j = abstractC9195h.f35337j;
        this.f35339l = this.f35340m + 80;
    }

    /* renamed from: M */
    boolean m29542M(AbstractC9195h abstractC9195h) {
        return m29450f() == abstractC9195h.m29450f();
    }

    /* renamed from: N */
    abstract boolean mo29543N(AbstractC9195h abstractC9195h);

    /* renamed from: O */
    public void m29544O(InetAddress inetAddress) {
        this.f35341n = inetAddress;
    }

    /* renamed from: P */
    void m29545P(long j2) {
        this.f35338k = j2;
        this.f35337j = 1;
    }

    /* renamed from: Q */
    boolean m29546Q(C9190c c9190c) {
        try {
            Iterator<AbstractC9195h> it = c9190c.m29485b().iterator();
            while (it.hasNext()) {
                if (m29547R(it.next())) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e2) {
            f35335h.mo32177f("suppressedBy() message " + c9190c + " exception ", e2);
            return false;
        }
    }

    /* renamed from: R */
    boolean m29547R(AbstractC9195h abstractC9195h) {
        return equals(abstractC9195h) && abstractC9195h.f35337j > this.f35337j / 2;
    }

    /* renamed from: S */
    abstract void mo29548S(C9193f.a aVar);

    @Override // p345i.p346a.p347g.AbstractC9189b
    public boolean equals(Object obj) {
        return (obj instanceof AbstractC9195h) && super.equals(obj) && mo29543N((AbstractC9195h) obj);
    }

    @Override // p345i.p346a.p347g.AbstractC9189b
    /* renamed from: j */
    public boolean mo29454j(long j2) {
        return m29549y(100) <= j2;
    }

    @Override // p345i.p346a.p347g.AbstractC9189b
    /* renamed from: x */
    protected void mo29468x(StringBuilder sb) {
        super.mo29468x(sb);
        sb.append(" ttl: '" + m29530A(System.currentTimeMillis()) + "/" + this.f35337j + "'");
    }

    /* renamed from: y */
    long m29549y(int i2) {
        return this.f35338k + (i2 * this.f35337j * 10);
    }

    /* renamed from: z */
    public InetAddress m29550z() {
        return this.f35341n;
    }

    /* compiled from: DNSRecord.java */
    /* renamed from: i.a.g.h$a */
    public static abstract class a extends AbstractC9195h {

        /* renamed from: o */
        private static InterfaceC9732b f35342o = C9733c.m32189i(a.class.getName());

        /* renamed from: p */
        InetAddress f35343p;

        protected a(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z, int i2, InetAddress inetAddress) {
            super(str, enumC9210e, enumC9209d, z, i2);
            this.f35343p = inetAddress;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: B */
        public AbstractC9184c mo29531B(C9199l c9199l) {
            AbstractC9185d abstractC9185dMo29533D = mo29533D(false);
            ((C9204q) abstractC9185dMo29533D).m29740c0(c9199l);
            return new C9203p(c9199l, abstractC9185dMo29533D.mo29429s(), abstractC9185dMo29533D.mo29421k(), abstractC9185dMo29533D);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: D */
        public AbstractC9185d mo29533D(boolean z) {
            return new C9204q(m29448d(), 0, 0, 0, z, (byte[]) null);
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: F */
        boolean mo29535F(C9199l c9199l, long j2) {
            a aVarM29618k;
            if (!c9199l.m29674n0().m29617f(this) || (aVarM29618k = c9199l.m29674n0().m29618k(m29450f(), m29460p(), 3600)) == null) {
                return false;
            }
            int iM29445a = m29445a(aVarM29618k);
            if (iM29445a == 0) {
                f35342o.mo32174c("handleQuery() Ignoring an identical address query");
                return false;
            }
            f35342o.mo32174c("handleQuery() Conflicting query detected.");
            if (c9199l.m29666a1() && iM29445a > 0) {
                c9199l.m29674n0().m29625r();
                c9199l.m29663Z().clear();
                Iterator<AbstractC9185d> it = c9199l.m29687y0().values().iterator();
                while (it.hasNext()) {
                    ((C9204q) it.next()).m29739b0();
                }
            }
            c9199l.m29684w1();
            return true;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: G */
        boolean mo29536G(C9199l c9199l) {
            if (!c9199l.m29674n0().m29617f(this)) {
                return false;
            }
            f35342o.mo32174c("handleResponse() Denial detected");
            if (c9199l.m29666a1()) {
                c9199l.m29674n0().m29625r();
                c9199l.m29663Z().clear();
                Iterator<AbstractC9185d> it = c9199l.m29687y0().values().iterator();
                while (it.hasNext()) {
                    ((C9204q) it.next()).m29739b0();
                }
            }
            c9199l.m29684w1();
            return true;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: I */
        public boolean mo29538I() {
            return false;
        }

        @Override // p345i.p346a.p347g.AbstractC9195h
        /* renamed from: N */
        boolean mo29543N(AbstractC9195h abstractC9195h) {
            try {
                if (!(abstractC9195h instanceof a)) {
                    return false;
                }
                a aVar = (a) abstractC9195h;
                if (m29551T() != null || aVar.m29551T() == null) {
                    return m29551T().equals(aVar.m29551T());
                }
                return false;
            } catch (Exception e2) {
                f35342o.mo32176e("Failed to compare addresses of DNSRecords", e2);
                return false;
            }
        }

        /* renamed from: T */
        InetAddress m29551T() {
            return this.f35343p;
        }

        /* renamed from: U */
        boolean m29552U(AbstractC9195h abstractC9195h) {
            return m29447c().equalsIgnoreCase(abstractC9195h.m29447c());
        }

        @Override // p345i.p346a.p347g.AbstractC9189b
        /* renamed from: v */
        protected void mo29466v(DataOutputStream dataOutputStream) throws IOException {
            super.mo29466v(dataOutputStream);
            for (byte b2 : m29551T().getAddress()) {
                dataOutputStream.writeByte(b2);
            }
        }

        @Override // p345i.p346a.p347g.AbstractC9195h, p345i.p346a.p347g.AbstractC9189b
        /* renamed from: x */
        protected void mo29468x(StringBuilder sb) {
            super.mo29468x(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" address: '");
            sb2.append(m29551T() != null ? m29551T().getHostAddress() : "null");
            sb2.append("'");
            sb.append(sb2.toString());
        }

        protected a(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z, int i2, byte[] bArr) {
            super(str, enumC9210e, enumC9209d, z, i2);
            try {
                this.f35343p = InetAddress.getByAddress(bArr);
            } catch (UnknownHostException e2) {
                f35342o.mo32177f("Address() exception ", e2);
            }
        }
    }
}
