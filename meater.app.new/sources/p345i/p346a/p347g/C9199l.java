package p345i.p346a.p347g;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.HttpUrl;
import p345i.p346a.AbstractC9182a;
import p345i.p346a.AbstractC9184c;
import p345i.p346a.AbstractC9185d;
import p345i.p346a.InterfaceC9186e;
import p345i.p346a.p347g.AbstractC9195h;
import p345i.p346a.p347g.C9200m;
import p345i.p346a.p347g.InterfaceC9197j;
import p345i.p346a.p347g.InterfaceC9201n;
import p345i.p346a.p347g.p348s.C9206a;
import p345i.p346a.p347g.p348s.EnumC9209d;
import p345i.p346a.p347g.p348s.EnumC9210e;
import p345i.p346a.p347g.p348s.EnumC9212g;
import p345i.p346a.p347g.p349t.AbstractC9213a;
import p345i.p346a.p347g.p352u.ThreadFactoryC9224a;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: JmDNSImpl.java */
/* renamed from: i.a.g.l */
/* loaded from: classes2.dex */
public class C9199l extends AbstractC9182a implements InterfaceC9196i, InterfaceC9197j {

    /* renamed from: g */
    private static InterfaceC9732b f35375g = C9733c.m32189i(C9199l.class.getName());

    /* renamed from: h */
    private static final Random f35376h = new Random();

    /* renamed from: A */
    private final String f35377A;

    /* renamed from: i */
    private volatile InetAddress f35379i;

    /* renamed from: j */
    private volatile MulticastSocket f35380j;

    /* renamed from: k */
    private final List<InterfaceC9191d> f35381k;

    /* renamed from: l */
    final ConcurrentMap<String, List<C9200m.a>> f35382l;

    /* renamed from: m */
    private final Set<C9200m.b> f35383m;

    /* renamed from: n */
    private final C9188a f35384n;

    /* renamed from: o */
    private final ConcurrentMap<String, AbstractC9185d> f35385o;

    /* renamed from: p */
    private final ConcurrentMap<String, j> f35386p;

    /* renamed from: q */
    private volatile AbstractC9182a.a f35387q;

    /* renamed from: r */
    protected Thread f35388r;

    /* renamed from: s */
    private C9198k f35389s;

    /* renamed from: t */
    private Thread f35390t;

    /* renamed from: u */
    private int f35391u;

    /* renamed from: v */
    private long f35392v;

    /* renamed from: y */
    private C9190c f35395y;

    /* renamed from: z */
    private final ConcurrentMap<String, i> f35396z;

    /* renamed from: w */
    private final ExecutorService f35393w = Executors.newSingleThreadExecutor(new ThreadFactoryC9224a("JmDNS"));

    /* renamed from: x */
    private final ReentrantLock f35394x = new ReentrantLock();

    /* renamed from: B */
    private final Object f35378B = new Object();

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9200m.a f35397f;

        /* renamed from: g */
        final /* synthetic */ AbstractC9184c f35398g;

        a(C9200m.a aVar, AbstractC9184c abstractC9184c) {
            this.f35397f = aVar;
            this.f35398g = abstractC9184c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35397f.m29703f(this.f35398g);
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9200m.b f35400f;

        /* renamed from: g */
        final /* synthetic */ AbstractC9184c f35401g;

        b(C9200m.b bVar, AbstractC9184c abstractC9184c) {
            this.f35400f = bVar;
            this.f35401g = abstractC9184c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35400f.m29704c(this.f35401g);
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$c */
    class c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9200m.b f35403f;

        /* renamed from: g */
        final /* synthetic */ AbstractC9184c f35404g;

        c(C9200m.b bVar, AbstractC9184c abstractC9184c) {
            this.f35403f = bVar;
            this.f35404g = abstractC9184c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35403f.m29705d(this.f35404g);
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$d */
    class d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9200m.a f35406f;

        /* renamed from: g */
        final /* synthetic */ AbstractC9184c f35407g;

        d(C9200m.a aVar, AbstractC9184c abstractC9184c) {
            this.f35406f = aVar;
            this.f35407g = abstractC9184c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35406f.m29701d(this.f35407g);
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$e */
    class e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9200m.a f35409f;

        /* renamed from: g */
        final /* synthetic */ AbstractC9184c f35410g;

        e(C9200m.a aVar, AbstractC9184c abstractC9184c) {
            this.f35409f = aVar;
            this.f35410g = abstractC9184c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35409f.m29702e(this.f35410g);
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$f */
    class f extends Thread {
        f(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws IOException {
            C9199l.this.m29643D();
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$g */
    static /* synthetic */ class g {

        /* renamed from: a */
        static final /* synthetic */ int[] f35413a;

        static {
            int[] iArr = new int[h.values().length];
            f35413a = iArr;
            try {
                iArr[h.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35413a[h.Remove.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$h */
    public enum h {
        Remove,
        Update,
        Add,
        RegisterServiceType,
        Noop
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$i */
    private static class i implements InterfaceC9186e {

        /* renamed from: c */
        private final String f35422c;

        /* renamed from: a */
        private final ConcurrentMap<String, AbstractC9185d> f35420a = new ConcurrentHashMap();

        /* renamed from: b */
        private final ConcurrentMap<String, AbstractC9184c> f35421b = new ConcurrentHashMap();

        /* renamed from: d */
        private volatile boolean f35423d = true;

        public i(String str) {
            this.f35422c = str;
        }

        @Override // p345i.p346a.InterfaceC9186e
        public void serviceAdded(AbstractC9184c abstractC9184c) {
            synchronized (this) {
                AbstractC9185d abstractC9185dMo29412e = abstractC9184c.mo29412e();
                if (abstractC9185dMo29412e == null || !abstractC9185dMo29412e.mo29431u()) {
                    C9204q c9204qM29682u1 = ((C9199l) abstractC9184c.mo29411d()).m29682u1(abstractC9184c.mo29414g(), abstractC9184c.mo29413f(), abstractC9185dMo29412e != null ? abstractC9185dMo29412e.mo29427q() : HttpUrl.FRAGMENT_ENCODE_SET, true);
                    if (c9204qM29682u1 != null) {
                        this.f35420a.put(abstractC9184c.mo29413f(), c9204qM29682u1);
                    } else {
                        this.f35421b.put(abstractC9184c.mo29413f(), abstractC9184c);
                    }
                } else {
                    this.f35420a.put(abstractC9184c.mo29413f(), abstractC9185dMo29412e);
                }
            }
        }

        @Override // p345i.p346a.InterfaceC9186e
        public void serviceRemoved(AbstractC9184c abstractC9184c) {
            synchronized (this) {
                this.f35420a.remove(abstractC9184c.mo29413f());
                this.f35421b.remove(abstractC9184c.mo29413f());
            }
        }

        @Override // p345i.p346a.InterfaceC9186e
        public void serviceResolved(AbstractC9184c abstractC9184c) {
            synchronized (this) {
                this.f35420a.put(abstractC9184c.mo29413f(), abstractC9184c.mo29412e());
                this.f35421b.remove(abstractC9184c.mo29413f());
            }
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\n\tType: ");
            stringBuffer.append(this.f35422c);
            if (this.f35420a.isEmpty()) {
                stringBuffer.append("\n\tNo services collected.");
            } else {
                stringBuffer.append("\n\tServices");
                for (String str : this.f35420a.keySet()) {
                    stringBuffer.append("\n\t\tService: ");
                    stringBuffer.append(str);
                    stringBuffer.append(": ");
                    stringBuffer.append(this.f35420a.get(str));
                }
            }
            if (this.f35421b.isEmpty()) {
                stringBuffer.append("\n\tNo event queued.");
            } else {
                stringBuffer.append("\n\tEvents");
                for (String str2 : this.f35421b.keySet()) {
                    stringBuffer.append("\n\t\tEvent: ");
                    stringBuffer.append(str2);
                    stringBuffer.append(": ");
                    stringBuffer.append(this.f35421b.get(str2));
                }
            }
            return stringBuffer.toString();
        }
    }

    /* compiled from: JmDNSImpl.java */
    /* renamed from: i.a.g.l$j */
    public static class j extends AbstractMap<String, String> implements Cloneable {

        /* renamed from: f */
        private final Set<Map.Entry<String, String>> f35424f = new HashSet();

        /* renamed from: g */
        private final String f35425g;

        /* compiled from: JmDNSImpl.java */
        /* renamed from: i.a.g.l$j$a */
        private static class a implements Map.Entry<String, String>, Serializable, Cloneable {

            /* renamed from: f */
            private final String f35426f;

            /* renamed from: g */
            private final String f35427g;

            public a(String str) {
                str = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
                this.f35427g = str;
                this.f35426f = str.toLowerCase();
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a clone() {
                return this;
            }

            @Override // java.util.Map.Entry
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public String getKey() {
                return this.f35426f;
            }

            @Override // java.util.Map.Entry
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public String getValue() {
                return this.f35427g;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return getKey().equals(entry.getKey()) && getValue().equals(entry.getValue());
            }

            @Override // java.util.Map.Entry
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public String setValue(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                String str = this.f35426f;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f35427g;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return this.f35426f + "=" + this.f35427g;
            }
        }

        public j(String str) {
            this.f35425g = str;
        }

        /* renamed from: b */
        public boolean m29690b(String str) {
            if (str == null || m29692e(str)) {
                return false;
            }
            this.f35424f.add(new a(str));
            return true;
        }

        @Override // java.util.AbstractMap
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public j clone() {
            j jVar = new j(m29693f());
            Iterator<Map.Entry<String, String>> it = entrySet().iterator();
            while (it.hasNext()) {
                jVar.m29690b(it.next().getValue());
            }
            return jVar;
        }

        /* renamed from: e */
        public boolean m29692e(String str) {
            return str != null && containsKey(str.toLowerCase());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
            return this.f35424f;
        }

        /* renamed from: f */
        public String m29693f() {
            return this.f35425g;
        }

        @Override // java.util.AbstractMap
        public String toString() {
            StringBuilder sb = new StringBuilder(200);
            if (isEmpty()) {
                sb.append("empty");
            } else {
                Iterator<String> it = values().iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(", ");
                }
                sb.setLength(sb.length() - 2);
            }
            return sb.toString();
        }
    }

    public C9199l(InetAddress inetAddress, String str) throws IOException {
        if (f35375g.mo32173b()) {
            f35375g.mo32174c("JmDNS instance created");
        }
        this.f35384n = new C9188a(100);
        this.f35381k = Collections.synchronizedList(new ArrayList());
        this.f35382l = new ConcurrentHashMap();
        this.f35383m = Collections.synchronizedSet(new HashSet());
        this.f35396z = new ConcurrentHashMap();
        this.f35385o = new ConcurrentHashMap(20);
        this.f35386p = new ConcurrentHashMap(20);
        C9198k c9198kM29601A = C9198k.m29601A(inetAddress, this, str);
        this.f35389s = c9198kM29601A;
        this.f35377A = str == null ? c9198kM29601A.m29624q() : str;
        m29640f1(m29674n0());
        m29633A1(m29687y0().values());
        mo29589j();
    }

    /* renamed from: A1 */
    private void m29633A1(Collection<? extends AbstractC9185d> collection) {
        if (this.f35390t == null) {
            C9205r c9205r = new C9205r(this);
            this.f35390t = c9205r;
            c9205r.start();
        }
        mo29590k();
        Iterator<? extends AbstractC9185d> it = collection.iterator();
        while (it.hasNext()) {
            try {
                m29672l1(new C9204q(it.next()));
            } catch (Exception e2) {
                f35375g.mo32177f("start() Registration exception ", e2);
            }
        }
    }

    /* renamed from: B1 */
    static String m29634B1(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    /* renamed from: H */
    private List<AbstractC9195h> m29635H(List<AbstractC9195h> list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC9195h abstractC9195h : list) {
            if (abstractC9195h.m29450f().equals(EnumC9210e.TYPE_A) || abstractC9195h.m29450f().equals(EnumC9210e.TYPE_AAAA)) {
                arrayList2.add(abstractC9195h);
            } else {
                arrayList.add(abstractC9195h);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: J */
    private void m29636J(String str, InterfaceC9186e interfaceC9186e, boolean z) {
        C9200m.a aVar = new C9200m.a(interfaceC9186e, z);
        String lowerCase = str.toLowerCase();
        List<C9200m.a> list = this.f35382l.get(lowerCase);
        if (list == null) {
            if (this.f35382l.putIfAbsent(lowerCase, new LinkedList()) == null && this.f35396z.putIfAbsent(lowerCase, new i(str)) == null) {
                m29636J(lowerCase, this.f35396z.get(lowerCase), true);
            }
            list = this.f35382l.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                if (!list.contains(aVar)) {
                    list.add(aVar);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC9189b> it = m29663Z().m29438c().iterator();
        while (it.hasNext()) {
            AbstractC9195h abstractC9195h = (AbstractC9195h) it.next();
            if (abstractC9195h.m29450f() == EnumC9210e.TYPE_SRV && abstractC9195h.m29446b().endsWith(lowerCase)) {
                arrayList.add(new C9203p(this, abstractC9195h.m29452h(), m29634B1(abstractC9195h.m29452h(), abstractC9195h.m29447c()), abstractC9195h.m29532C()));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVar.m29701d((AbstractC9184c) it2.next());
        }
        mo29586c(str);
    }

    /* renamed from: T */
    private void m29637T() throws IOException {
        if (f35375g.mo32173b()) {
            f35375g.mo32174c("closeMulticastSocket()");
        }
        if (this.f35380j != null) {
            try {
                try {
                    this.f35380j.leaveGroup(this.f35379i);
                } catch (SocketException unused) {
                }
                this.f35380j.close();
                while (true) {
                    Thread thread = this.f35390t;
                    if (thread == null || !thread.isAlive()) {
                        break;
                    }
                    synchronized (this) {
                        try {
                            Thread thread2 = this.f35390t;
                            if (thread2 != null && thread2.isAlive()) {
                                if (f35375g.mo32173b()) {
                                    f35375g.mo32174c("closeMulticastSocket(): waiting for jmDNS monitor");
                                }
                                wait(1000L);
                            }
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
                this.f35390t = null;
            } catch (Exception e2) {
                f35375g.mo32177f("closeMulticastSocket() Close socket exception ", e2);
            }
            this.f35380j = null;
        }
    }

    /* renamed from: Y */
    private void m29638Y() {
        if (f35375g.mo32173b()) {
            f35375g.mo32174c("disposeServiceCollectors()");
        }
        for (String str : this.f35396z.keySet()) {
            i iVar = this.f35396z.get(str);
            if (iVar != null) {
                m29679s1(str, iVar);
                this.f35396z.remove(str, iVar);
            }
        }
    }

    /* renamed from: c1 */
    private boolean m29639c1(C9204q c9204q) {
        boolean z;
        AbstractC9185d abstractC9185d;
        String strM29727L = c9204q.m29727L();
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            z = false;
            for (AbstractC9189b abstractC9189b : m29663Z().m29441f(c9204q.m29727L())) {
                if (EnumC9210e.TYPE_SRV.equals(abstractC9189b.m29450f()) && !abstractC9189b.mo29454j(jCurrentTimeMillis)) {
                    AbstractC9195h.f fVar = (AbstractC9195h.f) abstractC9189b;
                    if (fVar.m29554T() != c9204q.mo29422l() || !fVar.m29556V().equals(this.f35389s.m29624q())) {
                        if (f35375g.mo32173b()) {
                            f35375g.mo32174c("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:" + abstractC9189b + " s.server=" + fVar.m29556V() + " " + this.f35389s.m29624q() + " equals:" + fVar.m29556V().equals(this.f35389s.m29624q()));
                        }
                        c9204q.m29741d0(InterfaceC9201n.c.m29709a().mo29706a(this.f35389s.m29622o(), c9204q.mo29421k(), InterfaceC9201n.d.SERVICE));
                        z = true;
                        abstractC9185d = this.f35385o.get(c9204q.m29727L());
                        if (abstractC9185d == null && abstractC9185d != c9204q) {
                            c9204q.m29741d0(InterfaceC9201n.c.m29709a().mo29706a(this.f35389s.m29622o(), c9204q.mo29421k(), InterfaceC9201n.d.SERVICE));
                            z = true;
                        }
                    }
                }
            }
            abstractC9185d = this.f35385o.get(c9204q.m29727L());
            if (abstractC9185d == null) {
            }
        } while (z);
        return !strM29727L.equals(c9204q.m29727L());
    }

    /* renamed from: f1 */
    private void m29640f1(C9198k c9198k) throws IOException {
        if (this.f35379i == null) {
            if (c9198k.m29622o() instanceof Inet6Address) {
                this.f35379i = InetAddress.getByName("FF02::FB");
            } else {
                this.f35379i = InetAddress.getByName("224.0.0.251");
            }
        }
        if (this.f35380j != null) {
            m29637T();
        }
        this.f35380j = new MulticastSocket(C9206a.f35467a);
        if (c9198k != null && c9198k.m29623p() != null) {
            try {
                this.f35380j.setNetworkInterface(c9198k.m29623p());
            } catch (SocketException e2) {
                if (f35375g.mo32173b()) {
                    f35375g.mo32174c("openMulticastSocket() Set network interface exception: " + e2.getMessage());
                }
            }
        }
        this.f35380j.setTimeToLive(255);
        this.f35380j.joinGroup(this.f35379i);
    }

    /* renamed from: q0 */
    public static Random m29641q0() {
        return f35376h;
    }

    @Override // p345i.p346a.AbstractC9182a
    /* renamed from: B */
    public void mo29403B() {
        if (f35375g.mo32173b()) {
            f35375g.mo32174c("unregisterAllServices()");
        }
        Iterator<String> it = this.f35385o.keySet().iterator();
        while (it.hasNext()) {
            C9204q c9204q = (C9204q) this.f35385o.get(it.next());
            if (c9204q != null) {
                if (f35375g.mo32173b()) {
                    f35375g.mo32174c("Cancelling service info: " + c9204q);
                }
                c9204q.m29724F();
            }
        }
        mo29588f();
        for (String str : this.f35385o.keySet()) {
            C9204q c9204q2 = (C9204q) this.f35385o.get(str);
            if (c9204q2 != null) {
                if (f35375g.mo32173b()) {
                    f35375g.mo32174c("Wait for service info cancel: " + c9204q2);
                }
                c9204q2.m29745k0(5000L);
                this.f35385o.remove(str, c9204q2);
            }
        }
    }

    /* renamed from: C1 */
    public void m29642C1(long j2, AbstractC9195h abstractC9195h, h hVar) {
        ArrayList arrayList;
        List<C9200m.a> listEmptyList;
        synchronized (this.f35381k) {
            arrayList = new ArrayList(this.f35381k);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC9191d) it.next()).mo29483b(m29663Z(), j2, abstractC9195h);
        }
        if (EnumC9210e.TYPE_PTR.equals(abstractC9195h.m29450f())) {
            AbstractC9184c abstractC9184cMo29531B = abstractC9195h.mo29531B(this);
            if (abstractC9184cMo29531B.mo29412e() == null || !abstractC9184cMo29531B.mo29412e().mo29431u()) {
                C9204q c9204qM29680t0 = m29680t0(abstractC9184cMo29531B.mo29414g(), abstractC9184cMo29531B.mo29413f(), HttpUrl.FRAGMENT_ENCODE_SET, false);
                if (c9204qM29680t0.mo29431u()) {
                    abstractC9184cMo29531B = new C9203p(this, abstractC9184cMo29531B.mo29414g(), abstractC9184cMo29531B.mo29413f(), c9204qM29680t0);
                }
            }
            List<C9200m.a> list = this.f35382l.get(abstractC9184cMo29531B.mo29414g().toLowerCase());
            if (list != null) {
                synchronized (list) {
                    listEmptyList = new ArrayList(list);
                }
            } else {
                listEmptyList = Collections.emptyList();
            }
            if (f35375g.mo32175d()) {
                f35375g.mo32180i(m29676p0() + ".updating record for event: " + abstractC9184cMo29531B + " list " + listEmptyList + " operation: " + hVar);
            }
            if (listEmptyList.isEmpty()) {
                return;
            }
            int i2 = g.f35413a[hVar.ordinal()];
            if (i2 == 1) {
                for (C9200m.a aVar : listEmptyList) {
                    if (aVar.m29699b()) {
                        aVar.m29701d(abstractC9184cMo29531B);
                    } else {
                        this.f35393w.submit(new d(aVar, abstractC9184cMo29531B));
                    }
                }
                return;
            }
            if (i2 != 2) {
                return;
            }
            for (C9200m.a aVar2 : listEmptyList) {
                if (aVar2.m29699b()) {
                    aVar2.m29702e(abstractC9184cMo29531B);
                } else {
                    this.f35393w.submit(new e(aVar2, abstractC9184cMo29531B));
                }
            }
        }
    }

    /* renamed from: D */
    void m29643D() throws IOException {
        if (f35375g.mo32173b()) {
            f35375g.mo32174c(m29676p0() + "recover() Cleanning up");
        }
        f35375g.mo32179h("RECOVERING");
        mo29584a();
        ArrayList arrayList = new ArrayList(m29687y0().values());
        mo29403B();
        m29638Y();
        m29646E1(5000L);
        mo29593p();
        m29637T();
        m29663Z().clear();
        if (f35375g.mo32173b()) {
            f35375g.mo32174c(m29676p0() + "recover() All is clean");
        }
        if (!m29660V0()) {
            f35375g.mo32179h(m29676p0() + "recover() Could not recover we are Down!");
            if (m29665a0() != null) {
                m29665a0().m29405a(m29667e0(), arrayList);
                return;
            }
            return;
        }
        Iterator<AbstractC9185d> it = arrayList.iterator();
        while (it.hasNext()) {
            ((C9204q) it.next()).m29737X();
        }
        m29671k1();
        try {
            m29640f1(m29674n0());
            m29633A1(arrayList);
        } catch (Exception e2) {
            f35375g.mo32177f(m29676p0() + "recover() Start services exception ", e2);
        }
        f35375g.mo32179h(m29676p0() + "recover() We are back!");
    }

    /* renamed from: D1 */
    public boolean m29644D1(long j2) {
        return this.f35389s.m29611F(j2);
    }

    /* renamed from: E0 */
    public MulticastSocket m29645E0() {
        return this.f35380j;
    }

    /* renamed from: E1 */
    public boolean m29646E1(long j2) {
        return this.f35389s.m29612G(j2);
    }

    /* renamed from: F0 */
    public int m29647F0() {
        return this.f35391u;
    }

    /* renamed from: G0 */
    void m29648G0(C9190c c9190c, InetAddress inetAddress, int i2) throws IOException {
        if (f35375g.mo32173b()) {
            f35375g.mo32174c(m29676p0() + ".handle query: " + c9190c);
        }
        boolean zMo29535F = false;
        long jCurrentTimeMillis = System.currentTimeMillis() + 120;
        Iterator<AbstractC9195h> it = c9190c.m29485b().iterator();
        while (it.hasNext()) {
            zMo29535F |= it.next().mo29535F(this, jCurrentTimeMillis);
        }
        m29655N0();
        try {
            C9190c c9190c2 = this.f35395y;
            if (c9190c2 != null) {
                c9190c2.m29475y(c9190c);
            } else {
                C9190c c9190cM29476z = c9190c.clone();
                if (c9190c.m29501r()) {
                    this.f35395y = c9190cM29476z;
                }
                mo29592m(c9190cM29476z, inetAddress, i2);
            }
            m29657Q0();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Iterator<? extends AbstractC9195h> it2 = c9190c.m29486c().iterator();
            while (it2.hasNext()) {
                m29650J0(it2.next(), jCurrentTimeMillis2);
            }
            if (zMo29535F) {
                mo29590k();
            }
        } catch (Throwable th) {
            m29657Q0();
            throw th;
        }
    }

    /* renamed from: I */
    public void m29649I(InterfaceC9191d interfaceC9191d, C9194g c9194g) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f35381k.add(interfaceC9191d);
        if (c9194g != null) {
            for (AbstractC9189b abstractC9189b : m29663Z().m29441f(c9194g.m29447c().toLowerCase())) {
                if (c9194g.m29526A(abstractC9189b) && !abstractC9189b.mo29454j(jCurrentTimeMillis)) {
                    interfaceC9191d.mo29483b(m29663Z(), jCurrentTimeMillis, abstractC9189b);
                }
            }
        }
    }

    /* renamed from: J0 */
    void m29650J0(AbstractC9195h abstractC9195h, long j2) {
        h hVar = h.Noop;
        boolean zMo29454j = abstractC9195h.mo29454j(j2);
        if (f35375g.mo32173b()) {
            f35375g.mo32174c(m29676p0() + " handle response: " + abstractC9195h);
        }
        if (!abstractC9195h.m29459o() && !abstractC9195h.m29453i()) {
            boolean zM29460p = abstractC9195h.m29460p();
            AbstractC9195h abstractC9195h2 = (AbstractC9195h) m29663Z().m29440e(abstractC9195h);
            if (f35375g.mo32173b()) {
                f35375g.mo32174c(m29676p0() + " handle response cached record: " + abstractC9195h2);
            }
            if (zM29460p) {
                for (AbstractC9189b abstractC9189b : m29663Z().m29441f(abstractC9195h.m29446b())) {
                    if (abstractC9195h.m29450f().equals(abstractC9189b.m29450f()) && abstractC9195h.m29449e().equals(abstractC9189b.m29449e()) && abstractC9189b != abstractC9195h2) {
                        ((AbstractC9195h) abstractC9189b).m29545P(j2);
                    }
                }
            }
            if (abstractC9195h2 != null) {
                if (zMo29454j) {
                    if (abstractC9195h.m29534E() == 0) {
                        hVar = h.Noop;
                        abstractC9195h2.m29545P(j2);
                    } else {
                        hVar = h.Remove;
                        m29663Z().m29443i(abstractC9195h2);
                    }
                } else if (abstractC9195h.mo29543N(abstractC9195h2) && (abstractC9195h.m29465u(abstractC9195h2) || abstractC9195h.m29451g().length() <= 0)) {
                    abstractC9195h2.m29541L(abstractC9195h);
                    abstractC9195h = abstractC9195h2;
                } else if (abstractC9195h.mo29538I()) {
                    hVar = h.Update;
                    m29663Z().m29444j(abstractC9195h, abstractC9195h2);
                } else {
                    hVar = h.Add;
                    m29663Z().m29437b(abstractC9195h);
                }
            } else if (!zMo29454j) {
                hVar = h.Add;
                m29663Z().m29437b(abstractC9195h);
            }
        }
        if (abstractC9195h.m29450f() == EnumC9210e.TYPE_PTR) {
            if (abstractC9195h.m29459o()) {
                if (zMo29454j) {
                    return;
                }
                m29675n1(((AbstractC9195h.e) abstractC9195h).m29553T());
                return;
            } else if ((m29675n1(abstractC9195h.m29447c()) | false) && hVar == h.Noop) {
                hVar = h.RegisterServiceType;
            }
        }
        if (hVar != h.Noop) {
            m29642C1(j2, abstractC9195h, hVar);
        }
    }

    /* renamed from: K */
    public void m29651K(AbstractC9213a abstractC9213a, EnumC9212g enumC9212g) {
        this.f35389s.m29614b(abstractC9213a, enumC9212g);
    }

    /* renamed from: K0 */
    void m29652K0(C9190c c9190c) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zMo29536G = false;
        boolean zMo29536G2 = false;
        for (AbstractC9195h abstractC9195h : m29635H(c9190c.m29485b())) {
            m29650J0(abstractC9195h, jCurrentTimeMillis);
            if (EnumC9210e.TYPE_A.equals(abstractC9195h.m29450f()) || EnumC9210e.TYPE_AAAA.equals(abstractC9195h.m29450f())) {
                zMo29536G |= abstractC9195h.mo29536G(this);
            } else {
                zMo29536G2 |= abstractC9195h.mo29536G(this);
            }
        }
        if (zMo29536G || zMo29536G2) {
            mo29590k();
        }
    }

    /* renamed from: M0 */
    void m29653M0(AbstractC9184c abstractC9184c) {
        ArrayList arrayList;
        List<C9200m.a> list = this.f35382l.get(abstractC9184c.mo29414g().toLowerCase());
        if (list == null || list.isEmpty() || abstractC9184c.mo29412e() == null || !abstractC9184c.mo29412e().mo29431u()) {
            return;
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f35393w.submit(new a((C9200m.a) it.next(), abstractC9184c));
        }
    }

    /* renamed from: N */
    public boolean m29654N() {
        return this.f35389s.m29615c();
    }

    /* renamed from: N0 */
    public void m29655N0() {
        this.f35394x.lock();
    }

    /* renamed from: Q */
    public void m29656Q() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        for (AbstractC9189b abstractC9189b : m29663Z().m29438c()) {
            try {
                AbstractC9195h abstractC9195h = (AbstractC9195h) abstractC9189b;
                if (abstractC9195h.mo29454j(jCurrentTimeMillis)) {
                    m29642C1(jCurrentTimeMillis, abstractC9195h, h.Remove);
                    m29663Z().m29443i(abstractC9195h);
                } else if (abstractC9195h.m29540K(jCurrentTimeMillis)) {
                    abstractC9195h.m29537H();
                    String lowerCase = abstractC9195h.m29532C().mo29429s().toLowerCase();
                    if (hashSet.add(lowerCase)) {
                        m29681t1(lowerCase);
                    }
                }
            } catch (Exception e2) {
                f35375g.mo32177f(m29676p0() + ".Error while reaping records: " + abstractC9189b, e2);
                f35375g.mo32179h(toString());
            }
        }
    }

    /* renamed from: Q0 */
    public void m29657Q0() {
        this.f35394x.unlock();
    }

    /* renamed from: R0 */
    public boolean m29658R0() {
        return this.f35389s.m29626s();
    }

    /* renamed from: T0 */
    public boolean m29659T0(AbstractC9213a abstractC9213a, EnumC9212g enumC9212g) {
        return this.f35389s.m29627t(abstractC9213a, enumC9212g);
    }

    /* renamed from: V0 */
    public boolean m29660V0() {
        return this.f35389s.m29628u();
    }

    /* renamed from: W */
    public boolean m29661W() {
        return this.f35389s.m29616e();
    }

    /* renamed from: X0 */
    public boolean m29662X0() {
        return this.f35389s.m29629v();
    }

    /* renamed from: Z */
    public C9188a m29663Z() {
        return this.f35384n;
    }

    /* renamed from: Z0 */
    public boolean m29664Z0() {
        return this.f35389s.m29631x();
    }

    @Override // p345i.p346a.p347g.InterfaceC9197j
    /* renamed from: a */
    public void mo29584a() {
        InterfaceC9197j.b.m29596b().m29599c(m29667e0()).mo29584a();
    }

    /* renamed from: a0 */
    public AbstractC9182a.a m29665a0() {
        return this.f35387q;
    }

    /* renamed from: a1 */
    public boolean m29666a1() {
        return this.f35389s.m29632y();
    }

    @Override // p345i.p346a.p347g.InterfaceC9197j
    /* renamed from: b */
    public void mo29585b() {
        InterfaceC9197j.b.m29596b().m29599c(m29667e0()).mo29585b();
    }

    @Override // p345i.p346a.p347g.InterfaceC9197j
    /* renamed from: c */
    public void mo29586c(String str) {
        InterfaceC9197j.b.m29596b().m29599c(m29667e0()).mo29586c(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (m29664Z0()) {
            return;
        }
        if (f35375g.mo32173b()) {
            f35375g.mo32174c("Cancelling JmDNS: " + this);
        }
        if (m29661W()) {
            f35375g.mo32174c("Canceling the timer");
            mo29587e();
            mo29403B();
            m29638Y();
            if (f35375g.mo32173b()) {
                f35375g.mo32174c("Wait for JmDNS cancel: " + this);
            }
            m29646E1(5000L);
            f35375g.mo32174c("Canceling the state timer");
            mo29585b();
            this.f35393w.shutdown();
            m29637T();
            if (this.f35388r != null) {
                Runtime.getRuntime().removeShutdownHook(this.f35388r);
            }
            InterfaceC9197j.b.m29596b().m29598a(m29667e0());
            if (f35375g.mo32173b()) {
                f35375g.mo32174c("JmDNS closed.");
            }
        }
        mo29559d(null);
    }

    @Override // p345i.p346a.p347g.InterfaceC9196i
    /* renamed from: d */
    public boolean mo29559d(AbstractC9213a abstractC9213a) {
        return this.f35389s.mo29559d(abstractC9213a);
    }

    @Override // p345i.p346a.p347g.InterfaceC9197j
    /* renamed from: e */
    public void mo29587e() {
        InterfaceC9197j.b.m29596b().m29599c(m29667e0()).mo29587e();
    }

    /* renamed from: e0 */
    public C9199l m29667e0() {
        return this;
    }

    @Override // p345i.p346a.p347g.InterfaceC9197j
    /* renamed from: f */
    public void mo29588f() {
        InterfaceC9197j.b.m29596b().m29599c(m29667e0()).mo29588f();
    }

    /* renamed from: f0 */
    public InetAddress m29668f0() {
        return this.f35379i;
    }

    /* renamed from: h1 */
    public void m29669h1() {
        f35375g.mo32174c(m29676p0() + "recover()");
        if (m29664Z0() || isClosed() || m29662X0() || m29660V0()) {
            return;
        }
        synchronized (this.f35378B) {
            if (m29654N()) {
                f35375g.mo32174c(m29676p0() + "recover() thread " + Thread.currentThread().getName());
                StringBuilder sb = new StringBuilder();
                sb.append(m29676p0());
                sb.append(".recover()");
                new f(sb.toString()).start();
            }
        }
    }

    /* renamed from: i0 */
    public InetAddress m29670i0() throws IOException {
        return this.f35389s.m29622o();
    }

    public boolean isClosed() {
        return this.f35389s.m29630w();
    }

    @Override // p345i.p346a.p347g.InterfaceC9197j
    /* renamed from: j */
    public void mo29589j() {
        InterfaceC9197j.b.m29596b().m29599c(m29667e0()).mo29589j();
    }

    @Override // p345i.p346a.p347g.InterfaceC9197j
    /* renamed from: k */
    public void mo29590k() {
        InterfaceC9197j.b.m29596b().m29599c(m29667e0()).mo29590k();
    }

    /* renamed from: k1 */
    public boolean m29671k1() {
        return this.f35389s.m29607B();
    }

    @Override // p345i.p346a.p347g.InterfaceC9197j
    /* renamed from: l */
    public void mo29591l() {
        InterfaceC9197j.b.m29596b().m29599c(m29667e0()).mo29591l();
    }

    /* renamed from: l1 */
    public void m29672l1(AbstractC9185d abstractC9185d) throws IOException {
        if (m29664Z0() || isClosed()) {
            throw new IllegalStateException("This DNS is closed.");
        }
        C9204q c9204q = (C9204q) abstractC9185d;
        if (c9204q.m29726K() != null) {
            if (c9204q.m29726K() != this) {
                throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
            }
            if (this.f35385o.get(c9204q.m29727L()) != null) {
                throw new IllegalStateException("A service information can only be registered once.");
            }
        }
        c9204q.m29740c0(this);
        m29675n1(c9204q.m29730O());
        c9204q.m29737X();
        c9204q.m29743g0(this.f35389s.m29624q());
        c9204q.m29720B(this.f35389s.m29620m());
        c9204q.m29721C(this.f35389s.m29621n());
        m29644D1(6000L);
        m29639c1(c9204q);
        while (this.f35385o.putIfAbsent(c9204q.m29727L(), c9204q) != null) {
            m29639c1(c9204q);
        }
        mo29590k();
        c9204q.m29744j0(6000L);
        if (f35375g.mo32173b()) {
            f35375g.mo32174c("registerService() JmDNS registered service as " + c9204q);
        }
    }

    @Override // p345i.p346a.p347g.InterfaceC9197j
    /* renamed from: m */
    public void mo29592m(C9190c c9190c, InetAddress inetAddress, int i2) {
        InterfaceC9197j.b.m29596b().m29599c(m29667e0()).mo29592m(c9190c, inetAddress, i2);
    }

    /* renamed from: m0 */
    public long m29673m0() {
        return this.f35392v;
    }

    /* renamed from: n0 */
    public C9198k m29674n0() {
        return this.f35389s;
    }

    /* renamed from: n1 */
    public boolean m29675n1(String str) {
        boolean z;
        j jVar;
        Map<AbstractC9185d.a, String> mapM29714J = C9204q.m29714J(str);
        String str2 = mapM29714J.get(AbstractC9185d.a.Domain);
        String str3 = mapM29714J.get(AbstractC9185d.a.Protocol);
        String str4 = mapM29714J.get(AbstractC9185d.a.Application);
        String str5 = mapM29714J.get(AbstractC9185d.a.Subtype);
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? "_" + str4 + "." : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(str3.length() > 0 ? "_" + str3 + "." : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(str2);
        sb.append(".");
        String string = sb.toString();
        String lowerCase = string.toLowerCase();
        if (f35375g.mo32173b()) {
            InterfaceC9732b interfaceC9732b = f35375g;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m29676p0());
            sb2.append(".registering service type: ");
            sb2.append(str);
            sb2.append(" as: ");
            sb2.append(string);
            sb2.append(str5.length() > 0 ? " subtype: " + str5 : HttpUrl.FRAGMENT_ENCODE_SET);
            interfaceC9732b.mo32174c(sb2.toString());
        }
        boolean z2 = true;
        if (this.f35386p.containsKey(lowerCase) || str4.toLowerCase().equals("dns-sd") || str2.toLowerCase().endsWith("in-addr.arpa") || str2.toLowerCase().endsWith("ip6.arpa")) {
            z = false;
        } else {
            z = this.f35386p.putIfAbsent(lowerCase, new j(string)) == null;
            if (z) {
                Set<C9200m.b> set = this.f35383m;
                C9200m.b[] bVarArr = (C9200m.b[]) set.toArray(new C9200m.b[set.size()]);
                C9203p c9203p = new C9203p(this, string, HttpUrl.FRAGMENT_ENCODE_SET, null);
                for (C9200m.b bVar : bVarArr) {
                    this.f35393w.submit(new b(bVar, c9203p));
                }
            }
        }
        if (str5.length() <= 0 || (jVar = this.f35386p.get(lowerCase)) == null || jVar.m29692e(str5)) {
            return z;
        }
        synchronized (jVar) {
            if (jVar.m29692e(str5)) {
                z2 = z;
            } else {
                jVar.m29690b(str5);
                Set<C9200m.b> set2 = this.f35383m;
                C9200m.b[] bVarArr2 = (C9200m.b[]) set2.toArray(new C9200m.b[set2.size()]);
                C9203p c9203p2 = new C9203p(this, "_" + str5 + "._sub." + string, HttpUrl.FRAGMENT_ENCODE_SET, null);
                for (C9200m.b bVar2 : bVarArr2) {
                    this.f35393w.submit(new c(bVar2, c9203p2));
                }
            }
        }
        return z2;
    }

    @Override // p345i.p346a.p347g.InterfaceC9197j
    /* renamed from: p */
    public void mo29593p() {
        InterfaceC9197j.b.m29596b().m29599c(m29667e0()).mo29593p();
    }

    /* renamed from: p0 */
    public String m29676p0() {
        return this.f35377A;
    }

    /* renamed from: q1 */
    public void m29677q1(AbstractC9213a abstractC9213a) {
        this.f35389s.m29608C(abstractC9213a);
    }

    /* renamed from: r1 */
    public void m29678r1(InterfaceC9191d interfaceC9191d) {
        this.f35381k.remove(interfaceC9191d);
    }

    /* renamed from: s1 */
    public void m29679s1(String str, InterfaceC9186e interfaceC9186e) {
        String lowerCase = str.toLowerCase();
        List<C9200m.a> list = this.f35382l.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                list.remove(new C9200m.a(interfaceC9186e, false));
                if (list.isEmpty()) {
                    this.f35382l.remove(lowerCase, list);
                }
            }
        }
    }

    /* renamed from: t0 */
    C9204q m29680t0(String str, String str2, String str3, boolean z) {
        C9204q c9204q;
        C9204q c9204q2;
        String strMo29426p;
        AbstractC9185d abstractC9185dMo29533D;
        AbstractC9185d abstractC9185dMo29533D2;
        AbstractC9185d abstractC9185dMo29533D3;
        AbstractC9185d abstractC9185dMo29533D4;
        C9204q c9204q3 = new C9204q(str, str2, str3, 0, 0, 0, z, null);
        C9188a c9188aM29663Z = m29663Z();
        EnumC9209d enumC9209d = EnumC9209d.CLASS_ANY;
        AbstractC9189b abstractC9189bM29440e = c9188aM29663Z.m29440e(new AbstractC9195h.e(str, enumC9209d, false, 0, c9204q3.mo29425o()));
        if (!(abstractC9189bM29440e instanceof AbstractC9195h) || (c9204q = (C9204q) ((AbstractC9195h) abstractC9189bM29440e).mo29533D(z)) == null) {
            return c9204q3;
        }
        Map<AbstractC9185d.a, String> mapM29729N = c9204q.m29729N();
        byte[] bArrMo29428r = null;
        AbstractC9189b abstractC9189bM29439d = m29663Z().m29439d(c9204q3.mo29425o(), EnumC9210e.TYPE_SRV, enumC9209d);
        if (!(abstractC9189bM29439d instanceof AbstractC9195h) || (abstractC9185dMo29533D4 = ((AbstractC9195h) abstractC9189bM29439d).mo29533D(z)) == null) {
            c9204q2 = c9204q;
            strMo29426p = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            c9204q2 = new C9204q(mapM29729N, abstractC9185dMo29533D4.mo29422l(), abstractC9185dMo29533D4.mo29430t(), abstractC9185dMo29533D4.mo29423m(), z, (byte[]) null);
            bArrMo29428r = abstractC9185dMo29533D4.mo29428r();
            strMo29426p = abstractC9185dMo29533D4.mo29426p();
        }
        Iterator<? extends AbstractC9189b> it = m29663Z().m29442h(strMo29426p, EnumC9210e.TYPE_A, enumC9209d).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC9189b next = it.next();
            if ((next instanceof AbstractC9195h) && (abstractC9185dMo29533D3 = ((AbstractC9195h) next).mo29533D(z)) != null) {
                for (Inet4Address inet4Address : abstractC9185dMo29533D3.mo29418h()) {
                    c9204q2.m29720B(inet4Address);
                }
                c9204q2.m29719A(abstractC9185dMo29533D3.mo29428r());
            }
        }
        for (AbstractC9189b abstractC9189b : m29663Z().m29442h(strMo29426p, EnumC9210e.TYPE_AAAA, EnumC9209d.CLASS_ANY)) {
            if ((abstractC9189b instanceof AbstractC9195h) && (abstractC9185dMo29533D2 = ((AbstractC9195h) abstractC9189b).mo29533D(z)) != null) {
                for (Inet6Address inet6Address : abstractC9185dMo29533D2.mo29419i()) {
                    c9204q2.m29721C(inet6Address);
                }
                c9204q2.m29719A(abstractC9185dMo29533D2.mo29428r());
            }
        }
        AbstractC9189b abstractC9189bM29439d2 = m29663Z().m29439d(c9204q2.mo29425o(), EnumC9210e.TYPE_TXT, EnumC9209d.CLASS_ANY);
        if ((abstractC9189bM29439d2 instanceof AbstractC9195h) && (abstractC9185dMo29533D = ((AbstractC9195h) abstractC9189bM29439d2).mo29533D(z)) != null) {
            c9204q2.m29719A(abstractC9185dMo29533D.mo29428r());
        }
        if (c9204q2.mo29428r().length == 0) {
            c9204q2.m29719A(bArrMo29428r);
        }
        return c9204q2.mo29431u() ? c9204q2 : c9204q3;
    }

    /* renamed from: t1 */
    public void m29681t1(String str) {
        if (this.f35396z.containsKey(str.toLowerCase())) {
            mo29586c(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [i.a.g.l$j, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    public String toString() {
        StringBuilder sb = new StringBuilder(RecyclerView.AbstractC0599l.FLAG_MOVED);
        sb.append("\n");
        sb.append("\t---- Local Host -----");
        sb.append("\n\t");
        sb.append(this.f35389s);
        sb.append("\n\t---- Services -----");
        for (String str : this.f35385o.keySet()) {
            sb.append("\n\t\tService: ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.f35385o.get(str));
        }
        sb.append("\n");
        sb.append("\t---- Types ----");
        Iterator<String> it = this.f35386p.keySet().iterator();
        while (it.hasNext()) {
            j jVar = this.f35386p.get(it.next());
            sb.append("\n\t\tType: ");
            sb.append(jVar.m29693f());
            sb.append(": ");
            if (jVar.isEmpty()) {
                jVar = "no subtypes";
            }
            sb.append(jVar);
        }
        sb.append("\n");
        sb.append(this.f35384n.toString());
        sb.append("\n");
        sb.append("\t---- Service Collectors ----");
        for (String str2 : this.f35396z.keySet()) {
            sb.append("\n\t\tService Collector: ");
            sb.append(str2);
            sb.append(": ");
            sb.append(this.f35396z.get(str2));
        }
        sb.append("\n");
        sb.append("\t---- Service Listeners ----");
        for (String str3 : this.f35382l.keySet()) {
            sb.append("\n\t\tService Listener: ");
            sb.append(str3);
            sb.append(": ");
            sb.append(this.f35382l.get(str3));
        }
        return sb.toString();
    }

    /* renamed from: u1 */
    C9204q m29682u1(String str, String str2, String str3, boolean z) {
        m29656Q();
        String lowerCase = str.toLowerCase();
        m29675n1(str);
        if (this.f35396z.putIfAbsent(lowerCase, new i(str)) == null) {
            m29636J(lowerCase, this.f35396z.get(lowerCase), true);
        }
        C9204q c9204qM29680t0 = m29680t0(str, str2, str3, z);
        mo29595y(c9204qM29680t0);
        return c9204qM29680t0;
    }

    /* renamed from: v1 */
    public void m29683v1(C9190c c9190c) {
        m29655N0();
        try {
            if (this.f35395y == c9190c) {
                this.f35395y = null;
            }
        } finally {
            m29657Q0();
        }
    }

    /* renamed from: w1 */
    public boolean m29684w1() {
        return this.f35389s.m29609D();
    }

    @Override // p345i.p346a.p347g.InterfaceC9197j
    /* renamed from: x */
    public void mo29594x() {
        InterfaceC9197j.b.m29596b().m29599c(m29667e0()).mo29594x();
    }

    /* renamed from: x0 */
    public Map<String, j> m29685x0() {
        return this.f35386p;
    }

    /* renamed from: x1 */
    public void m29686x1(C9193f c9193f) throws IOException {
        InetAddress address;
        int port;
        if (c9193f.m29497n()) {
            return;
        }
        if (c9193f.m29510D() != null) {
            address = c9193f.m29510D().getAddress();
            port = c9193f.m29510D().getPort();
        } else {
            address = this.f35379i;
            port = C9206a.f35467a;
        }
        byte[] bArrM29509C = c9193f.m29509C();
        DatagramPacket datagramPacket = new DatagramPacket(bArrM29509C, bArrM29509C.length, address, port);
        if (f35375g.mo32175d()) {
            try {
                C9190c c9190c = new C9190c(datagramPacket);
                if (f35375g.mo32175d()) {
                    f35375g.mo32180i("send(" + m29676p0() + ") JmDNS out:" + c9190c.m29474C(true));
                }
            } catch (IOException e2) {
                f35375g.mo32172a(C9199l.class.toString(), "send(" + m29676p0() + ") - JmDNS can not parse what it sends!!!", e2);
            }
        }
        MulticastSocket multicastSocket = this.f35380j;
        if (multicastSocket == null || multicastSocket.isClosed()) {
            return;
        }
        multicastSocket.send(datagramPacket);
    }

    @Override // p345i.p346a.p347g.InterfaceC9197j
    /* renamed from: y */
    public void mo29595y(C9204q c9204q) {
        InterfaceC9197j.b.m29596b().m29599c(m29667e0()).mo29595y(c9204q);
    }

    /* renamed from: y0 */
    public Map<String, AbstractC9185d> m29687y0() {
        return this.f35385o;
    }

    /* renamed from: y1 */
    public void m29688y1(long j2) {
        this.f35392v = j2;
    }

    @Override // p345i.p346a.AbstractC9182a
    /* renamed from: z */
    public void mo29404z(String str, InterfaceC9186e interfaceC9186e) {
        m29636J(str, interfaceC9186e, false);
    }

    /* renamed from: z1 */
    public void m29689z1(int i2) {
        this.f35391u = i2;
    }
}
