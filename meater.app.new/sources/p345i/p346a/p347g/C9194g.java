package p345i.p346a.p347g;

import java.net.InetAddress;
import java.util.Iterator;
import java.util.Set;
import okhttp3.HttpUrl;
import p345i.p346a.AbstractC9185d;
import p345i.p346a.p347g.AbstractC9195h;
import p345i.p346a.p347g.p348s.EnumC9209d;
import p345i.p346a.p347g.p348s.EnumC9210e;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: DNSQuestion.java */
/* renamed from: i.a.g.g */
/* loaded from: classes2.dex */
public class C9194g extends AbstractC9189b {

    /* renamed from: h */
    private static InterfaceC9732b f35333h = C9733c.m32189i(C9194g.class.getName());

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35334a;

        static {
            int[] iArr = new int[EnumC9210e.values().length];
            f35334a = iArr;
            try {
                iArr[EnumC9210e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35334a[EnumC9210e.TYPE_A6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35334a[EnumC9210e.TYPE_AAAA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35334a[EnumC9210e.TYPE_ANY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35334a[EnumC9210e.TYPE_HINFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35334a[EnumC9210e.TYPE_PTR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35334a[EnumC9210e.TYPE_SRV.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35334a[EnumC9210e.TYPE_TXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$b */
    private static class b extends C9194g {
        b(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z) {
            super(str, enumC9210e, enumC9209d, z);
        }

        @Override // p345i.p346a.p347g.C9194g
        /* renamed from: B */
        public boolean mo29527B(C9199l c9199l) {
            String lowerCase = m29447c().toLowerCase();
            return c9199l.m29674n0().m29624q().equals(lowerCase) || c9199l.m29687y0().keySet().contains(lowerCase);
        }

        @Override // p345i.p346a.p347g.AbstractC9189b
        /* renamed from: n */
        public boolean mo29458n(AbstractC9189b abstractC9189b) {
            return abstractC9189b != null;
        }

        @Override // p345i.p346a.p347g.C9194g
        /* renamed from: y */
        public void mo29528y(C9199l c9199l, Set<AbstractC9195h> set) {
            String lowerCase = m29447c().toLowerCase();
            if (c9199l.m29674n0().m29624q().equalsIgnoreCase(lowerCase)) {
                set.addAll(c9199l.m29674n0().m29613a(m29449e(), m29460p(), 3600));
            } else {
                if (c9199l.m29685x0().containsKey(lowerCase)) {
                    new f(m29447c(), EnumC9210e.TYPE_PTR, m29449e(), m29460p()).mo29528y(c9199l, set);
                    return;
                }
                Iterator<AbstractC9185d> it = c9199l.m29687y0().values().iterator();
                while (it.hasNext()) {
                    m29529z(c9199l, set, (C9204q) it.next());
                }
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$c */
    private static class c extends C9194g {
        c(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z) {
            super(str, enumC9210e, enumC9209d, z);
        }

        @Override // p345i.p346a.p347g.C9194g
        /* renamed from: B */
        public boolean mo29527B(C9199l c9199l) {
            String lowerCase = m29447c().toLowerCase();
            return c9199l.m29674n0().m29624q().equals(lowerCase) || c9199l.m29687y0().keySet().contains(lowerCase);
        }

        @Override // p345i.p346a.p347g.C9194g
        /* renamed from: y */
        public void mo29528y(C9199l c9199l, Set<AbstractC9195h> set) {
            AbstractC9195h.a aVarM29618k = c9199l.m29674n0().m29618k(m29450f(), true, 3600);
            if (aVarM29618k != null) {
                set.add(aVarM29618k);
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$d */
    private static class d extends C9194g {
        d(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z) {
            super(str, enumC9210e, enumC9209d, z);
        }

        @Override // p345i.p346a.p347g.C9194g
        /* renamed from: B */
        public boolean mo29527B(C9199l c9199l) {
            String lowerCase = m29447c().toLowerCase();
            return c9199l.m29674n0().m29624q().equals(lowerCase) || c9199l.m29687y0().keySet().contains(lowerCase);
        }

        @Override // p345i.p346a.p347g.C9194g
        /* renamed from: y */
        public void mo29528y(C9199l c9199l, Set<AbstractC9195h> set) {
            AbstractC9195h.a aVarM29618k = c9199l.m29674n0().m29618k(m29450f(), true, 3600);
            if (aVarM29618k != null) {
                set.add(aVarM29618k);
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$e */
    private static class e extends C9194g {
        e(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z) {
            super(str, enumC9210e, enumC9209d, z);
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$f */
    private static class f extends C9194g {
        f(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z) {
            super(str, enumC9210e, enumC9209d, z);
        }

        @Override // p345i.p346a.p347g.C9194g
        /* renamed from: y */
        public void mo29528y(C9199l c9199l, Set<AbstractC9195h> set) {
            Iterator<AbstractC9185d> it = c9199l.m29687y0().values().iterator();
            while (it.hasNext()) {
                m29529z(c9199l, set, (C9204q) it.next());
            }
            if (m29459o()) {
                Iterator<String> it2 = c9199l.m29685x0().keySet().iterator();
                while (it2.hasNext()) {
                    set.add(new AbstractC9195h.e("_services._dns-sd._udp.local.", EnumC9209d.CLASS_IN, false, 3600, c9199l.m29685x0().get(it2.next()).m29693f()));
                }
                return;
            }
            if (!m29455k()) {
                m29453i();
                return;
            }
            String str = m29448d().get(AbstractC9185d.a.Instance);
            if (str == null || str.length() <= 0) {
                return;
            }
            InetAddress inetAddressM29622o = c9199l.m29674n0().m29622o();
            if (str.equalsIgnoreCase(inetAddressM29622o != null ? inetAddressM29622o.getHostAddress() : HttpUrl.FRAGMENT_ENCODE_SET)) {
                if (m29461q()) {
                    set.add(c9199l.m29674n0().m29619l(EnumC9210e.TYPE_A, false, 3600));
                }
                if (m29462r()) {
                    set.add(c9199l.m29674n0().m29619l(EnumC9210e.TYPE_AAAA, false, 3600));
                }
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$g */
    private static class g extends C9194g {
        g(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z) {
            super(str, enumC9210e, enumC9209d, z);
        }

        @Override // p345i.p346a.p347g.C9194g
        /* renamed from: B */
        public boolean mo29527B(C9199l c9199l) {
            String lowerCase = m29447c().toLowerCase();
            return c9199l.m29674n0().m29624q().equals(lowerCase) || c9199l.m29687y0().keySet().contains(lowerCase);
        }

        @Override // p345i.p346a.p347g.C9194g
        /* renamed from: y */
        public void mo29528y(C9199l c9199l, Set<AbstractC9195h> set) {
            String lowerCase = m29447c().toLowerCase();
            if (c9199l.m29674n0().m29624q().equalsIgnoreCase(lowerCase)) {
                set.addAll(c9199l.m29674n0().m29613a(m29449e(), m29460p(), 3600));
            } else if (c9199l.m29685x0().containsKey(lowerCase)) {
                new f(m29447c(), EnumC9210e.TYPE_PTR, m29449e(), m29460p()).mo29528y(c9199l, set);
            } else {
                m29529z(c9199l, set, (C9204q) c9199l.m29687y0().get(lowerCase));
            }
        }
    }

    /* compiled from: DNSQuestion.java */
    /* renamed from: i.a.g.g$h */
    private static class h extends C9194g {
        h(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z) {
            super(str, enumC9210e, enumC9209d, z);
        }

        @Override // p345i.p346a.p347g.C9194g
        /* renamed from: B */
        public boolean mo29527B(C9199l c9199l) {
            String lowerCase = m29447c().toLowerCase();
            return c9199l.m29674n0().m29624q().equals(lowerCase) || c9199l.m29687y0().keySet().contains(lowerCase);
        }

        @Override // p345i.p346a.p347g.C9194g
        /* renamed from: y */
        public void mo29528y(C9199l c9199l, Set<AbstractC9195h> set) {
            m29529z(c9199l, set, (C9204q) c9199l.m29687y0().get(m29447c().toLowerCase()));
        }
    }

    C9194g(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z) {
        super(str, enumC9210e, enumC9209d, z);
    }

    /* renamed from: C */
    public static C9194g m29525C(String str, EnumC9210e enumC9210e, EnumC9209d enumC9209d, boolean z) {
        switch (a.f35334a[enumC9210e.ordinal()]) {
            case 1:
                return new c(str, enumC9210e, enumC9209d, z);
            case 2:
                return new d(str, enumC9210e, enumC9209d, z);
            case 3:
                return new d(str, enumC9210e, enumC9209d, z);
            case 4:
                return new b(str, enumC9210e, enumC9209d, z);
            case 5:
                return new e(str, enumC9210e, enumC9209d, z);
            case 6:
                return new f(str, enumC9210e, enumC9209d, z);
            case 7:
                return new g(str, enumC9210e, enumC9209d, z);
            case 8:
                return new h(str, enumC9210e, enumC9209d, z);
            default:
                return new C9194g(str, enumC9210e, enumC9209d, z);
        }
    }

    /* renamed from: A */
    boolean m29526A(AbstractC9189b abstractC9189b) {
        return m29457m(abstractC9189b) && mo29458n(abstractC9189b) && m29447c().equals(abstractC9189b.m29447c());
    }

    /* renamed from: B */
    public boolean mo29527B(C9199l c9199l) {
        return false;
    }

    @Override // p345i.p346a.p347g.AbstractC9189b
    /* renamed from: j */
    public boolean mo29454j(long j2) {
        return false;
    }

    @Override // p345i.p346a.p347g.AbstractC9189b
    /* renamed from: x */
    public void mo29468x(StringBuilder sb) {
    }

    /* renamed from: y */
    public void mo29528y(C9199l c9199l, Set<AbstractC9195h> set) {
    }

    /* renamed from: z */
    protected void m29529z(C9199l c9199l, Set<AbstractC9195h> set, C9204q c9204q) {
        if (c9204q == null || !c9204q.m29731Q()) {
            return;
        }
        if (m29447c().equalsIgnoreCase(c9204q.mo29425o()) || m29447c().equalsIgnoreCase(c9204q.mo29429s()) || m29447c().equalsIgnoreCase(c9204q.m29730O())) {
            set.addAll(c9199l.m29674n0().m29613a(m29449e(), true, 3600));
            set.addAll(c9204q.m29722D(m29449e(), true, 3600, c9199l.m29674n0()));
        }
        if (f35333h.mo32173b()) {
            f35333h.mo32174c(c9199l.m29676p0() + " DNSQuestion(" + m29447c() + ").addAnswersForServiceInfo(): info: " + c9204q + "\n" + set);
        }
    }
}
