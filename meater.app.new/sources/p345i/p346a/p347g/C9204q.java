package p345i.p346a.p347g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import p345i.p346a.AbstractC9185d;
import p345i.p346a.p347g.AbstractC9195h;
import p345i.p346a.p347g.InterfaceC9196i;
import p345i.p346a.p347g.p348s.EnumC9209d;
import p345i.p346a.p347g.p348s.EnumC9210e;
import p345i.p346a.p347g.p348s.EnumC9212g;
import p345i.p346a.p347g.p349t.AbstractC9213a;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: ServiceInfoImpl.java */
/* renamed from: i.a.g.q */
/* loaded from: classes2.dex */
public class C9204q extends AbstractC9185d implements InterfaceC9191d, InterfaceC9196i {

    /* renamed from: g */
    private static InterfaceC9732b f35445g = C9733c.m32189i(C9204q.class.getName());

    /* renamed from: h */
    private String f35446h;

    /* renamed from: i */
    private String f35447i;

    /* renamed from: j */
    private String f35448j;

    /* renamed from: k */
    private String f35449k;

    /* renamed from: l */
    private String f35450l;

    /* renamed from: m */
    private String f35451m;

    /* renamed from: n */
    private int f35452n;

    /* renamed from: o */
    private int f35453o;

    /* renamed from: p */
    private int f35454p;

    /* renamed from: q */
    private byte[] f35455q;

    /* renamed from: r */
    private Map<String, byte[]> f35456r;

    /* renamed from: s */
    private final Set<Inet4Address> f35457s;

    /* renamed from: t */
    private final Set<Inet6Address> f35458t;

    /* renamed from: u */
    private transient String f35459u;

    /* renamed from: v */
    private boolean f35460v;

    /* renamed from: w */
    private boolean f35461w;

    /* renamed from: x */
    private final b f35462x;

    /* compiled from: ServiceInfoImpl.java */
    /* renamed from: i.a.g.q$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35463a;

        static {
            int[] iArr = new int[EnumC9210e.values().length];
            f35463a = iArr;
            try {
                iArr[EnumC9210e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35463a[EnumC9210e.TYPE_AAAA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35463a[EnumC9210e.TYPE_SRV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35463a[EnumC9210e.TYPE_TXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35463a[EnumC9210e.TYPE_PTR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: ServiceInfoImpl.java */
    /* renamed from: i.a.g.q$b */
    private static final class b extends InterfaceC9196i.b {

        /* renamed from: l */
        private final C9204q f35464l;

        public b(C9204q c9204q) {
            this.f35464l = c9204q;
        }

        @Override // p345i.p346a.p347g.InterfaceC9196i.b
        /* renamed from: q */
        public void mo29579q(C9199l c9199l) {
            super.mo29579q(c9199l);
        }

        @Override // p345i.p346a.p347g.InterfaceC9196i.b
        /* renamed from: s */
        protected void mo29581s(AbstractC9213a abstractC9213a) {
            super.mo29581s(abstractC9213a);
            if (this.f35358h == null && this.f35464l.m29735U()) {
                lock();
                try {
                    if (this.f35358h == null && this.f35464l.m29735U()) {
                        if (this.f35359i.m29761k()) {
                            m29580r(EnumC9212g.f35575i);
                            if (m29567e() != null) {
                                m29567e().mo29591l();
                            }
                        }
                        this.f35464l.m29742f0(false);
                    }
                } finally {
                    unlock();
                }
            }
        }
    }

    public C9204q(String str, String str2, String str3, int i2, int i3, int i4, boolean z, byte[] bArr) {
        this(m29713I(str, str2, str3), i2, i3, i4, z, bArr);
    }

    /* renamed from: G */
    protected static Map<AbstractC9185d.a, String> m29712G(Map<AbstractC9185d.a, String> map) {
        HashMap map2 = new HashMap(5);
        AbstractC9185d.a aVar = AbstractC9185d.a.Domain;
        String str = "local";
        String str2 = map.containsKey(aVar) ? map.get(aVar) : "local";
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        map2.put(aVar, m29716a0(str));
        AbstractC9185d.a aVar2 = AbstractC9185d.a.Protocol;
        String str3 = "tcp";
        String str4 = map.containsKey(aVar2) ? map.get(aVar2) : "tcp";
        if (str4 != null && str4.length() != 0) {
            str3 = str4;
        }
        map2.put(aVar2, m29716a0(str3));
        AbstractC9185d.a aVar3 = AbstractC9185d.a.Application;
        boolean zContainsKey = map.containsKey(aVar3);
        String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        String str6 = zContainsKey ? map.get(aVar3) : HttpUrl.FRAGMENT_ENCODE_SET;
        if (str6 == null || str6.length() == 0) {
            str6 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        map2.put(aVar3, m29716a0(str6));
        AbstractC9185d.a aVar4 = AbstractC9185d.a.Instance;
        String str7 = map.containsKey(aVar4) ? map.get(aVar4) : HttpUrl.FRAGMENT_ENCODE_SET;
        if (str7 == null || str7.length() == 0) {
            str7 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        map2.put(aVar4, m29716a0(str7));
        AbstractC9185d.a aVar5 = AbstractC9185d.a.Subtype;
        String str8 = map.containsKey(aVar5) ? map.get(aVar5) : HttpUrl.FRAGMENT_ENCODE_SET;
        if (str8 != null && str8.length() != 0) {
            str5 = str8;
        }
        map2.put(aVar5, m29716a0(str5));
        return map2;
    }

    /* renamed from: I */
    public static Map<AbstractC9185d.a, String> m29713I(String str, String str2, String str3) {
        Map<AbstractC9185d.a, String> mapM29714J = m29714J(str);
        mapM29714J.put(AbstractC9185d.a.Instance, str2);
        mapM29714J.put(AbstractC9185d.a.Subtype, str3);
        return m29712G(mapM29714J);
    }

    /* renamed from: J */
    public static Map<AbstractC9185d.a, String> m29714J(String str) {
        String strM29716a0;
        String strSubstring;
        String str2;
        int iIndexOf;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String lowerCase = str.toLowerCase();
        boolean zContains = lowerCase.contains("in-addr.arpa");
        String strM29716a02 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zContains || lowerCase.contains("ip6.arpa")) {
            int iIndexOf2 = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            strM29716a0 = m29716a0(str.substring(0, iIndexOf2));
            strSubstring = str.substring(iIndexOf2);
        } else {
            if (lowerCase.contains("_") || !lowerCase.contains(".")) {
                if ((!lowerCase.startsWith("_") || lowerCase.startsWith("_services")) && (iIndexOf = lowerCase.indexOf("._")) > 0) {
                    strSubstring2 = str.substring(0, iIndexOf);
                    int i2 = iIndexOf + 1;
                    if (i2 < lowerCase.length()) {
                        strSubstring3 = lowerCase.substring(i2);
                        str = str.substring(i2);
                    } else {
                        strSubstring3 = lowerCase;
                    }
                } else {
                    strSubstring3 = lowerCase;
                    strSubstring2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                int iLastIndexOf = strSubstring3.lastIndexOf("._");
                if (iLastIndexOf > 0) {
                    int i3 = iLastIndexOf + 2;
                    strSubstring4 = str.substring(i3, strSubstring3.indexOf(46, i3));
                } else {
                    strSubstring4 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (strSubstring4.length() > 0) {
                    int iIndexOf3 = strSubstring3.indexOf("_" + strSubstring4.toLowerCase() + ".");
                    int length = strSubstring4.length() + iIndexOf3 + 2;
                    int length2 = strSubstring3.length() - (strSubstring3.endsWith(".") ? 1 : 0);
                    String strSubstring5 = length2 > length ? str.substring(length, length2) : HttpUrl.FRAGMENT_ENCODE_SET;
                    if (iIndexOf3 > 0) {
                        lowerCase = str.substring(0, iIndexOf3 - 1);
                        strSubstring = strSubstring5;
                    } else {
                        strSubstring = strSubstring5;
                        lowerCase = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                } else {
                    strSubstring = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                int iIndexOf4 = lowerCase.toLowerCase().indexOf("._sub");
                if (iIndexOf4 > 0) {
                    strM29716a02 = m29716a0(lowerCase.substring(0, iIndexOf4));
                    lowerCase = lowerCase.substring(iIndexOf4 + 5);
                }
                strM29716a0 = strSubstring2;
                String str3 = strM29716a02;
                strM29716a02 = strSubstring4;
                str2 = str3;
                HashMap map = new HashMap(5);
                map.put(AbstractC9185d.a.Domain, m29716a0(strSubstring));
                map.put(AbstractC9185d.a.Protocol, strM29716a02);
                map.put(AbstractC9185d.a.Application, m29716a0(lowerCase));
                map.put(AbstractC9185d.a.Instance, strM29716a0);
                map.put(AbstractC9185d.a.Subtype, str2);
                return map;
            }
            int iIndexOf5 = lowerCase.indexOf(46);
            strM29716a0 = m29716a0(str.substring(0, iIndexOf5));
            strSubstring = m29716a0(str.substring(iIndexOf5));
        }
        lowerCase = HttpUrl.FRAGMENT_ENCODE_SET;
        str2 = lowerCase;
        HashMap map2 = new HashMap(5);
        map2.put(AbstractC9185d.a.Domain, m29716a0(strSubstring));
        map2.put(AbstractC9185d.a.Protocol, strM29716a02);
        map2.put(AbstractC9185d.a.Application, m29716a0(lowerCase));
        map2.put(AbstractC9185d.a.Instance, strM29716a0);
        map2.put(AbstractC9185d.a.Subtype, str2);
        return map2;
    }

    /* renamed from: P */
    private final boolean m29715P() {
        return this.f35457s.size() > 0 || this.f35458t.size() > 0;
    }

    /* renamed from: a0 */
    private static String m29716a0(String str) {
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith(".")) {
            strTrim = strTrim.substring(1);
        }
        if (strTrim.startsWith("_")) {
            strTrim = strTrim.substring(1);
        }
        return strTrim.endsWith(".") ? strTrim.substring(0, strTrim.length() - 1) : strTrim;
    }

    /* renamed from: h0 */
    private static byte[] m29717h0(Map<String, ?> map) throws IOException {
        byte[] byteArray = null;
        if (map != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
                    m29718l0(byteArrayOutputStream2, str);
                    if (obj != null) {
                        if (obj instanceof String) {
                            byteArrayOutputStream2.write(61);
                            m29718l0(byteArrayOutputStream2, (String) obj);
                        } else {
                            if (!(obj instanceof byte[])) {
                                throw new IllegalArgumentException("invalid property value: " + obj);
                            }
                            byte[] bArr = (byte[]) obj;
                            if (bArr.length > 0) {
                                byteArrayOutputStream2.write(61);
                                byteArrayOutputStream2.write(bArr, 0, bArr.length);
                            } else {
                                obj = null;
                            }
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    if (byteArray2.length > 255) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot have individual values larger that 255 chars. Offending value: ");
                        sb.append(str);
                        sb.append(obj != null ? HttpUrl.FRAGMENT_ENCODE_SET : "=" + obj);
                        throw new IOException(sb.toString());
                    }
                    byteArrayOutputStream.write((byte) byteArray2.length);
                    byteArrayOutputStream.write(byteArray2, 0, byteArray2.length);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                throw new RuntimeException("unexpected exception: " + e2);
            }
        }
        return (byteArray == null || byteArray.length <= 0) ? AbstractC9195h.f35336i : byteArray;
    }

    /* renamed from: l0 */
    static void m29718l0(OutputStream outputStream, String str) throws IOException {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 1 && cCharAt <= 127) {
                outputStream.write(cCharAt);
            } else if (cCharAt > 2047) {
                outputStream.write(((cCharAt >> '\f') & 15) | 224);
                outputStream.write(((cCharAt >> 6) & 63) | 128);
                outputStream.write(((cCharAt >> 0) & 63) | 128);
            } else {
                outputStream.write(((cCharAt >> 6) & 31) | 192);
                outputStream.write(((cCharAt >> 0) & 63) | 128);
            }
        }
    }

    /* renamed from: A */
    void m29719A(byte[] bArr) {
        this.f35455q = bArr;
        this.f35456r = null;
    }

    /* renamed from: B */
    void m29720B(Inet4Address inet4Address) {
        this.f35457s.add(inet4Address);
    }

    /* renamed from: C */
    void m29721C(Inet6Address inet6Address) {
        this.f35458t.add(inet6Address);
    }

    /* renamed from: D */
    public Collection<AbstractC9195h> m29722D(EnumC9209d enumC9209d, boolean z, int i2, C9198k c9198k) {
        ArrayList arrayList = new ArrayList();
        if (enumC9209d == EnumC9209d.CLASS_ANY || enumC9209d == EnumC9209d.CLASS_IN) {
            if (mo29427q().length() > 0) {
                arrayList.add(new AbstractC9195h.e(m29730O(), EnumC9209d.CLASS_IN, false, i2, mo29425o()));
            }
            String strMo29429s = mo29429s();
            EnumC9209d enumC9209d2 = EnumC9209d.CLASS_IN;
            arrayList.add(new AbstractC9195h.e(strMo29429s, enumC9209d2, false, i2, mo29425o()));
            arrayList.add(new AbstractC9195h.f(mo29425o(), enumC9209d2, z, i2, this.f35454p, this.f35453o, this.f35452n, c9198k.m29624q()));
            arrayList.add(new AbstractC9195h.g(mo29425o(), enumC9209d2, z, i2, mo29428r()));
        }
        return arrayList;
    }

    /* renamed from: E */
    public void m29723E(AbstractC9213a abstractC9213a, EnumC9212g enumC9212g) {
        this.f35462x.m29564a(abstractC9213a, enumC9212g);
    }

    /* renamed from: F */
    public boolean m29724F() {
        return this.f35462x.m29565b();
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public C9204q clone() {
        C9204q c9204q = new C9204q(m29729N(), this.f35452n, this.f35453o, this.f35454p, this.f35460v, this.f35455q);
        for (Inet6Address inet6Address : mo29419i()) {
            c9204q.f35458t.add(inet6Address);
        }
        for (Inet4Address inet4Address : mo29418h()) {
            c9204q.f35457s.add(inet4Address);
        }
        return c9204q;
    }

    /* renamed from: K */
    public C9199l m29726K() {
        return this.f35462x.m29567e();
    }

    /* renamed from: L */
    public String m29727L() {
        if (this.f35459u == null) {
            this.f35459u = mo29425o().toLowerCase();
        }
        return this.f35459u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        r0.clear();
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:9:0x0012, B:11:0x0019, B:13:0x0025, B:18:0x0032, B:20:0x003e, B:21:0x0041, B:23:0x004b, B:25:0x0051, B:26:0x0057, B:28:0x0069, B:32:0x0075, B:31:0x006e, B:33:0x0077, B:36:0x007c), top: B:44:0x0001, inners: #1 }] */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    synchronized java.util.Map<java.lang.String, byte[]> m29728M() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.Map<java.lang.String, byte[]> r0 = r9.f35456r     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L77
            byte[] r0 = r9.mo29428r()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L77
            java.util.Hashtable r0 = new java.util.Hashtable     // Catch: java.lang.Throwable -> L82
            r0.<init>()     // Catch: java.lang.Throwable -> L82
            r1 = 0
            r2 = 0
        L12:
            byte[] r3 = r9.mo29428r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r3 = r3.length     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            if (r2 >= r3) goto L75
            byte[] r3 = r9.mo29428r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r4 = r2 + 1
            r2 = r3[r2]     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L69
            int r3 = r4 + r2
            byte[] r5 = r9.mo29428r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r5 = r5.length     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            if (r3 <= r5) goto L2f
            goto L69
        L2f:
            r5 = 0
        L30:
            if (r5 >= r2) goto L41
            byte[] r6 = r9.mo29428r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r7 = r4 + r5
            r6 = r6[r7]     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            r7 = 61
            if (r6 == r7) goto L41
            int r5 = r5 + 1
            goto L30
        L41:
            byte[] r6 = r9.mo29428r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            java.lang.String r6 = r9.m29736V(r6, r4, r5)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            if (r6 != 0) goto L4f
            r0.clear()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            goto L75
        L4f:
            if (r5 != r2) goto L57
            byte[] r2 = p345i.p346a.AbstractC9185d.f35290f     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            r0.put(r6, r2)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            goto L67
        L57:
            int r5 = r5 + 1
            int r2 = r2 - r5
            byte[] r7 = new byte[r2]     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            byte[] r8 = r9.mo29428r()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            int r4 = r4 + r5
            java.lang.System.arraycopy(r8, r4, r7, r1, r2)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            r0.put(r6, r7)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
        L67:
            r2 = r3
            goto L12
        L69:
            r0.clear()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L82
            goto L75
        L6d:
            r1 = move-exception
            k.b.b r2 = p345i.p346a.p347g.C9204q.f35445g     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "Malformed TXT Field "
            r2.mo32177f(r3, r1)     // Catch: java.lang.Throwable -> L82
        L75:
            r9.f35456r = r0     // Catch: java.lang.Throwable -> L82
        L77:
            java.util.Map<java.lang.String, byte[]> r0 = r9.f35456r     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7c
            goto L80
        L7c:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L82
        L80:
            monitor-exit(r9)
            return r0
        L82:
            r0 = move-exception
            monitor-exit(r9)
            goto L86
        L85:
            throw r0
        L86:
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: p345i.p346a.p347g.C9204q.m29728M():java.util.Map");
    }

    /* renamed from: N */
    public Map<AbstractC9185d.a, String> m29729N() {
        HashMap map = new HashMap(5);
        map.put(AbstractC9185d.a.Domain, mo29417g());
        map.put(AbstractC9185d.a.Protocol, mo29424n());
        map.put(AbstractC9185d.a.Application, mo29416f());
        map.put(AbstractC9185d.a.Instance, mo29421k());
        map.put(AbstractC9185d.a.Subtype, mo29427q());
        return map;
    }

    /* renamed from: O */
    public String m29730O() {
        String str;
        String strMo29427q = mo29427q();
        StringBuilder sb = new StringBuilder();
        if (strMo29427q.length() > 0) {
            str = "_" + strMo29427q.toLowerCase() + "._sub.";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        sb.append(mo29429s());
        return sb.toString();
    }

    /* renamed from: Q */
    public boolean m29731Q() {
        return this.f35462x.m29568f();
    }

    /* renamed from: R */
    public boolean m29732R() {
        return this.f35462x.m29569g();
    }

    /* renamed from: S */
    public boolean m29733S(AbstractC9213a abstractC9213a, EnumC9212g enumC9212g) {
        return this.f35462x.m29570h(abstractC9213a, enumC9212g);
    }

    /* renamed from: T */
    public boolean m29734T() {
        return this.f35462x.m29575m();
    }

    /* renamed from: U */
    public boolean m29735U() {
        return this.f35461w;
    }

    /* renamed from: V */
    String m29736V(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        StringBuffer stringBuffer = new StringBuffer();
        int i7 = i2 + i3;
        while (i2 < i7) {
            int i8 = i2 + 1;
            int i9 = bArr[i2] & 255;
            switch (i9 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    stringBuffer.append((char) i9);
                    i2 = i8;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    i5 = i8 + 1;
                    if (i5 < i3) {
                        i4 = (i9 & 63) << 4;
                        i6 = bArr[i8] & 15;
                        break;
                    } else {
                        return null;
                    }
                case 12:
                case 13:
                    if (i8 < i3) {
                        i4 = (i9 & 31) << 6;
                        i5 = i8 + 1;
                        i6 = bArr[i8] & 63;
                        break;
                    } else {
                        return null;
                    }
                case 14:
                    if (i8 + 2 >= i3) {
                        return null;
                    }
                    int i10 = i8 + 1;
                    int i11 = ((i9 & 15) << 12) | ((bArr[i8] & 63) << 6);
                    i8 = i10 + 1;
                    i9 = i11 | (bArr[i10] & 63);
                    continue;
                    stringBuffer.append((char) i9);
                    i2 = i8;
            }
            i9 = i4 | i6;
            i8 = i5;
            stringBuffer.append((char) i9);
            i2 = i8;
        }
        return stringBuffer.toString();
    }

    /* renamed from: X */
    public boolean m29737X() {
        return this.f35462x.m29576n();
    }

    /* renamed from: Z */
    public void m29738Z(AbstractC9213a abstractC9213a) {
        this.f35462x.m29577o(abstractC9213a);
    }

    @Override // p345i.p346a.p347g.InterfaceC9191d
    /* renamed from: b */
    public void mo29483b(C9188a c9188a, long j2, AbstractC9189b abstractC9189b) {
        C9199l c9199lM29726K;
        if (!(abstractC9189b instanceof AbstractC9195h) || abstractC9189b.mo29454j(j2)) {
            return;
        }
        int i2 = a.f35463a[abstractC9189b.m29450f().ordinal()];
        boolean z = false;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5 && mo29427q().length() == 0 && abstractC9189b.m29451g().length() != 0) {
                            this.f35450l = abstractC9189b.m29451g();
                            z = true;
                        }
                    } else if (abstractC9189b.m29447c().equalsIgnoreCase(mo29425o())) {
                        this.f35455q = ((AbstractC9195h.g) abstractC9189b).m29558T();
                        this.f35456r = null;
                        z = true;
                    }
                } else if (abstractC9189b.m29447c().equalsIgnoreCase(mo29425o())) {
                    AbstractC9195h.f fVar = (AbstractC9195h.f) abstractC9189b;
                    String str = this.f35451m;
                    boolean z2 = str == null || !str.equalsIgnoreCase(fVar.m29556V());
                    this.f35451m = fVar.m29556V();
                    this.f35452n = fVar.m29554T();
                    this.f35453o = fVar.m29557W();
                    this.f35454p = fVar.m29555U();
                    if (z2) {
                        this.f35457s.clear();
                        this.f35458t.clear();
                        Iterator<? extends AbstractC9189b> it = c9188a.m29442h(this.f35451m, EnumC9210e.TYPE_A, EnumC9209d.CLASS_IN).iterator();
                        while (it.hasNext()) {
                            mo29483b(c9188a, j2, it.next());
                        }
                        Iterator<? extends AbstractC9189b> it2 = c9188a.m29442h(this.f35451m, EnumC9210e.TYPE_AAAA, EnumC9209d.CLASS_IN).iterator();
                        while (it2.hasNext()) {
                            mo29483b(c9188a, j2, it2.next());
                        }
                    } else {
                        z = true;
                    }
                }
            } else if (abstractC9189b.m29447c().equalsIgnoreCase(mo29426p())) {
                this.f35458t.add((Inet6Address) ((AbstractC9195h.a) abstractC9189b).m29551T());
                z = true;
            }
        } else if (abstractC9189b.m29447c().equalsIgnoreCase(mo29426p())) {
            this.f35457s.add((Inet4Address) ((AbstractC9195h.a) abstractC9189b).m29551T());
            z = true;
        }
        if (z && mo29431u() && (c9199lM29726K = m29726K()) != null) {
            c9199lM29726K.m29653M0(new C9203p(c9199lM29726K, mo29429s(), mo29421k(), this));
        }
        synchronized (this) {
            notifyAll();
        }
    }

    /* renamed from: b0 */
    public boolean m29739b0() {
        return this.f35462x.m29578p();
    }

    /* renamed from: c0 */
    public void m29740c0(C9199l c9199l) {
        this.f35462x.mo29579q(c9199l);
    }

    @Override // p345i.p346a.p347g.InterfaceC9196i
    /* renamed from: d */
    public boolean mo29559d(AbstractC9213a abstractC9213a) {
        return this.f35462x.mo29559d(abstractC9213a);
    }

    /* renamed from: d0 */
    void m29741d0(String str) {
        this.f35449k = str;
        this.f35459u = null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9204q) && mo29425o().equals(((C9204q) obj).mo29425o());
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: f */
    public String mo29416f() {
        String str = this.f35448j;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: f0 */
    public void m29742f0(boolean z) {
        this.f35461w = z;
        if (z) {
            this.f35462x.mo29581s(null);
        }
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: g */
    public String mo29417g() {
        String str = this.f35446h;
        return str != null ? str : "local";
    }

    /* renamed from: g0 */
    void m29743g0(String str) {
        this.f35451m = str;
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: h */
    public Inet4Address[] mo29418h() {
        Set<Inet4Address> set = this.f35457s;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    public int hashCode() {
        return mo29425o().hashCode();
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: i */
    public Inet6Address[] mo29419i() {
        Set<Inet6Address> set = this.f35458t;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: j */
    public InetAddress[] mo29420j() {
        ArrayList arrayList = new ArrayList(this.f35457s.size() + this.f35458t.size());
        arrayList.addAll(this.f35457s);
        arrayList.addAll(this.f35458t);
        return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
    }

    /* renamed from: j0 */
    public boolean m29744j0(long j2) {
        return this.f35462x.m29582t(j2);
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: k */
    public String mo29421k() {
        String str = this.f35449k;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: k0 */
    public boolean m29745k0(long j2) {
        return this.f35462x.m29583u(j2);
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: l */
    public int mo29422l() {
        return this.f35452n;
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: m */
    public int mo29423m() {
        return this.f35454p;
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: n */
    public String mo29424n() {
        String str = this.f35447i;
        return str != null ? str : "tcp";
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: o */
    public String mo29425o() {
        String str;
        String str2;
        String strMo29417g = mo29417g();
        String strMo29424n = mo29424n();
        String strMo29416f = mo29416f();
        String strMo29421k = mo29421k();
        StringBuilder sb = new StringBuilder();
        int length = strMo29421k.length();
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (length > 0) {
            str = strMo29421k + ".";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        if (strMo29416f.length() > 0) {
            str2 = "_" + strMo29416f + ".";
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str2);
        if (strMo29424n.length() > 0) {
            str3 = "_" + strMo29424n + ".";
        }
        sb.append(str3);
        sb.append(strMo29417g);
        sb.append(".");
        return sb.toString();
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: p */
    public String mo29426p() {
        String str = this.f35451m;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: q */
    public String mo29427q() {
        String str = this.f35450l;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: r */
    public byte[] mo29428r() {
        byte[] bArr = this.f35455q;
        return (bArr == null || bArr.length <= 0) ? AbstractC9195h.f35336i : bArr;
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: s */
    public String mo29429s() {
        String str;
        String strMo29417g = mo29417g();
        String strMo29424n = mo29424n();
        String strMo29416f = mo29416f();
        StringBuilder sb = new StringBuilder();
        int length = strMo29416f.length();
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (length > 0) {
            str = "_" + strMo29416f + ".";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        if (strMo29424n.length() > 0) {
            str2 = "_" + strMo29424n + ".";
        }
        sb.append(str2);
        sb.append(strMo29417g);
        sb.append(".");
        return sb.toString();
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: t */
    public int mo29430t() {
        return this.f35453o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + C9204q.class.getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("name: '");
        StringBuilder sb2 = new StringBuilder();
        int length = mo29421k().length();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        sb2.append(length > 0 ? mo29421k() + "." : HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append(m29730O());
        sb.append(sb2.toString());
        sb.append("' address: '");
        InetAddress[] inetAddressArrMo29420j = mo29420j();
        if (inetAddressArrMo29420j.length > 0) {
            for (InetAddress inetAddress : inetAddressArrMo29420j) {
                sb.append(inetAddress);
                sb.append(':');
                sb.append(mo29422l());
                sb.append(' ');
            }
        } else {
            sb.append("(null):");
            sb.append(mo29422l());
        }
        sb.append("' status: '");
        sb.append(this.f35462x.toString());
        sb.append(mo29433w() ? "' is persistent," : "',");
        sb.append(" has ");
        if (!mo29431u()) {
            str = "NO ";
        }
        sb.append(str);
        sb.append("data");
        if (mo29428r().length > 0) {
            Map<String, byte[]> mapM29728M = m29728M();
            if (mapM29728M.isEmpty()) {
                sb.append(" empty");
            } else {
                sb.append("\n");
                for (String str2 : mapM29728M.keySet()) {
                    sb.append("\t" + str2 + ": " + new String(mapM29728M.get(str2)) + "\n");
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean mo29431u() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.mo29426p()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1c
            boolean r0 = r1.m29715P()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1c
            byte[] r0 = r1.mo29428r()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1c
            byte[] r0 = r1.mo29428r()     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.length     // Catch: java.lang.Throwable -> L1f
            if (r0 <= 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            monitor-exit(r1)
            return r0
        L1f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p345i.p346a.p347g.C9204q.mo29431u():boolean");
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: v */
    public boolean mo29432v(AbstractC9185d abstractC9185d) {
        if (abstractC9185d == null) {
            return false;
        }
        if (abstractC9185d instanceof C9204q) {
            C9204q c9204q = (C9204q) abstractC9185d;
            return this.f35457s.size() == c9204q.f35457s.size() && this.f35458t.size() == c9204q.f35458t.size() && this.f35457s.equals(c9204q.f35457s) && this.f35458t.equals(c9204q.f35458t);
        }
        InetAddress[] inetAddressArrMo29420j = mo29420j();
        InetAddress[] inetAddressArrMo29420j2 = abstractC9185d.mo29420j();
        return inetAddressArrMo29420j.length == inetAddressArrMo29420j2.length && new HashSet(Arrays.asList(inetAddressArrMo29420j)).equals(new HashSet(Arrays.asList(inetAddressArrMo29420j2)));
    }

    @Override // p345i.p346a.AbstractC9185d
    /* renamed from: w */
    public boolean mo29433w() {
        return this.f35460v;
    }

    public C9204q(Map<AbstractC9185d.a, String> map, int i2, int i3, int i4, boolean z, Map<String, ?> map2) {
        this(map, i2, i3, i4, z, m29717h0(map2));
    }

    C9204q(Map<AbstractC9185d.a, String> map, int i2, int i3, int i4, boolean z, String str) {
        this(map, i2, i3, i4, z, (byte[]) null);
        this.f35451m = str;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            m29718l0(byteArrayOutputStream, str);
            this.f35455q = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException("unexpected exception: " + e2);
        }
    }

    C9204q(Map<AbstractC9185d.a, String> map, int i2, int i3, int i4, boolean z, byte[] bArr) {
        Map<AbstractC9185d.a, String> mapM29712G = m29712G(map);
        this.f35446h = mapM29712G.get(AbstractC9185d.a.Domain);
        this.f35447i = mapM29712G.get(AbstractC9185d.a.Protocol);
        this.f35448j = mapM29712G.get(AbstractC9185d.a.Application);
        this.f35449k = mapM29712G.get(AbstractC9185d.a.Instance);
        this.f35450l = mapM29712G.get(AbstractC9185d.a.Subtype);
        this.f35452n = i2;
        this.f35453o = i3;
        this.f35454p = i4;
        this.f35455q = bArr;
        m29742f0(false);
        this.f35462x = new b(this);
        this.f35460v = z;
        this.f35457s = Collections.synchronizedSet(new LinkedHashSet());
        this.f35458t = Collections.synchronizedSet(new LinkedHashSet());
    }

    C9204q(AbstractC9185d abstractC9185d) {
        this.f35457s = Collections.synchronizedSet(new LinkedHashSet());
        this.f35458t = Collections.synchronizedSet(new LinkedHashSet());
        if (abstractC9185d != null) {
            this.f35446h = abstractC9185d.mo29417g();
            this.f35447i = abstractC9185d.mo29424n();
            this.f35448j = abstractC9185d.mo29416f();
            this.f35449k = abstractC9185d.mo29421k();
            this.f35450l = abstractC9185d.mo29427q();
            this.f35452n = abstractC9185d.mo29422l();
            this.f35453o = abstractC9185d.mo29430t();
            this.f35454p = abstractC9185d.mo29423m();
            this.f35455q = abstractC9185d.mo29428r();
            this.f35460v = abstractC9185d.mo29433w();
            for (Inet6Address inet6Address : abstractC9185d.mo29419i()) {
                this.f35458t.add(inet6Address);
            }
            for (Inet4Address inet4Address : abstractC9185d.mo29418h()) {
                this.f35457s.add(inet4Address);
            }
        }
        this.f35462x = new b(this);
    }
}
