package io.sentry;

import io.sentry.C9680x4;
import io.sentry.protocol.C9539a;
import io.sentry.protocol.C9540a0;
import io.sentry.protocol.C9543c;
import io.sentry.protocol.C9553l;
import io.sentry.util.C9638i;
import io.sentry.util.C9646q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Scope.java */
/* renamed from: io.sentry.s3 */
/* loaded from: classes2.dex */
public final class C9586s3 {

    /* renamed from: a */
    private EnumC9587s4 f36825a;

    /* renamed from: b */
    private InterfaceC9426e2 f36826b;

    /* renamed from: c */
    private String f36827c;

    /* renamed from: d */
    private C9540a0 f36828d;

    /* renamed from: e */
    private String f36829e;

    /* renamed from: f */
    private C9553l f36830f;

    /* renamed from: g */
    private List<String> f36831g;

    /* renamed from: h */
    private final Queue<C9657v0> f36832h;

    /* renamed from: i */
    private Map<String, String> f36833i;

    /* renamed from: j */
    private Map<String, Object> f36834j;

    /* renamed from: k */
    private List<InterfaceC9496k1> f36835k;

    /* renamed from: l */
    private final C9680x4 f36836l;

    /* renamed from: m */
    private volatile C9422d5 f36837m;

    /* renamed from: n */
    private final Object f36838n;

    /* renamed from: o */
    private final Object f36839o;

    /* renamed from: p */
    private final Object f36840p;

    /* renamed from: q */
    private C9543c f36841q;

    /* renamed from: r */
    private List<C9583s0> f36842r;

    /* renamed from: s */
    private C9526o3 f36843s;

    /* compiled from: Scope.java */
    @ApiStatus.Internal
    /* renamed from: io.sentry.s3$a */
    public interface a {
        /* renamed from: a */
        void mo31614a(C9526o3 c9526o3);
    }

    /* compiled from: Scope.java */
    /* renamed from: io.sentry.s3$b */
    interface b {
        /* renamed from: a */
        void mo31615a(C9422d5 c9422d5);
    }

    /* compiled from: Scope.java */
    @ApiStatus.Internal
    /* renamed from: io.sentry.s3$c */
    public interface c {
        /* renamed from: a */
        void mo30201a(InterfaceC9426e2 interfaceC9426e2);
    }

    /* compiled from: Scope.java */
    /* renamed from: io.sentry.s3$d */
    static final class d {

        /* renamed from: a */
        private final C9422d5 f36844a;

        /* renamed from: b */
        private final C9422d5 f36845b;

        public d(C9422d5 c9422d5, C9422d5 c9422d52) {
            this.f36845b = c9422d5;
            this.f36844a = c9422d52;
        }

        /* renamed from: a */
        public C9422d5 m31616a() {
            return this.f36845b;
        }

        /* renamed from: b */
        public C9422d5 m31617b() {
            return this.f36844a;
        }
    }

    public C9586s3(C9680x4 c9680x4) {
        this.f36831g = new ArrayList();
        this.f36833i = new ConcurrentHashMap();
        this.f36834j = new ConcurrentHashMap();
        this.f36835k = new CopyOnWriteArrayList();
        this.f36838n = new Object();
        this.f36839o = new Object();
        this.f36840p = new Object();
        this.f36841q = new C9543c();
        this.f36842r = new CopyOnWriteArrayList();
        C9680x4 c9680x42 = (C9680x4) C9646q.m31802c(c9680x4, "SentryOptions is required.");
        this.f36836l = c9680x42;
        this.f36832h = m31584f(c9680x42.getMaxBreadcrumbs());
        this.f36843s = new C9526o3();
    }

    /* renamed from: f */
    private Queue<C9657v0> m31584f(int i2) {
        return C9514m5.m31068g(new C9669w0(i2));
    }

    /* renamed from: h */
    private C9657v0 m31585h(C9680x4.a aVar, C9657v0 c9657v0, C9517n1 c9517n1) {
        try {
            return aVar.m31943a(c9657v0, c9517n1);
        } catch (Throwable th) {
            this.f36836l.getLogger().mo30213b(EnumC9587s4.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th);
            if (th.getMessage() == null) {
                return c9657v0;
            }
            c9657v0.m31841m("sentry:message", th.getMessage());
            return c9657v0;
        }
    }

    /* renamed from: A */
    d m31586A() {
        d dVar;
        synchronized (this.f36838n) {
            if (this.f36837m != null) {
                this.f36837m.m30740c();
            }
            C9422d5 c9422d5 = this.f36837m;
            dVar = null;
            if (this.f36836l.getRelease() != null) {
                this.f36837m = new C9422d5(this.f36836l.getDistinctId(), this.f36828d, this.f36836l.getEnvironment(), this.f36836l.getRelease());
                dVar = new d(this.f36837m.clone(), c9422d5 != null ? c9422d5.clone() : null);
            } else {
                this.f36836l.getLogger().mo30214c(EnumC9587s4.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
        }
        return dVar;
    }

    @ApiStatus.Internal
    /* renamed from: B */
    public C9526o3 m31587B(a aVar) {
        C9526o3 c9526o3;
        synchronized (this.f36840p) {
            aVar.mo31614a(this.f36843s);
            c9526o3 = new C9526o3(this.f36843s);
        }
        return c9526o3;
    }

    /* renamed from: C */
    C9422d5 m31588C(b bVar) {
        C9422d5 c9422d5Clone;
        synchronized (this.f36838n) {
            bVar.mo31615a(this.f36837m);
            c9422d5Clone = this.f36837m != null ? this.f36837m.clone() : null;
        }
        return c9422d5Clone;
    }

    @ApiStatus.Internal
    /* renamed from: D */
    public void m31589D(c cVar) {
        synchronized (this.f36839o) {
            cVar.mo30201a(this.f36826b);
        }
    }

    /* renamed from: a */
    public void m31590a(C9657v0 c9657v0, C9517n1 c9517n1) {
        if (c9657v0 == null) {
            return;
        }
        if (c9517n1 == null) {
            c9517n1 = new C9517n1();
        }
        C9680x4.a beforeBreadcrumb = this.f36836l.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            c9657v0 = m31585h(beforeBreadcrumb, c9657v0, c9517n1);
        }
        if (c9657v0 == null) {
            this.f36836l.getLogger().mo30214c(EnumC9587s4.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.f36832h.add(c9657v0);
        for (InterfaceC9689z1 interfaceC9689z1 : this.f36836l.getScopeObservers()) {
            interfaceC9689z1.mo30484i(c9657v0);
            interfaceC9689z1.mo30480a(this.f36832h);
        }
    }

    /* renamed from: b */
    public void m31591b() {
        this.f36825a = null;
        this.f36828d = null;
        this.f36830f = null;
        this.f36829e = null;
        this.f36831g.clear();
        m31593d();
        this.f36833i.clear();
        this.f36834j.clear();
        this.f36835k.clear();
        m31594e();
        m31592c();
    }

    /* renamed from: c */
    public void m31592c() {
        this.f36842r.clear();
    }

    /* renamed from: d */
    public void m31593d() {
        this.f36832h.clear();
        Iterator<InterfaceC9689z1> it = this.f36836l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo30480a(this.f36832h);
        }
    }

    /* renamed from: e */
    public void m31594e() {
        synchronized (this.f36839o) {
            this.f36826b = null;
        }
        this.f36827c = null;
        for (InterfaceC9689z1 interfaceC9689z1 : this.f36836l.getScopeObservers()) {
            interfaceC9689z1.mo30483d(null);
            interfaceC9689z1.mo30482c(null);
        }
    }

    /* renamed from: g */
    C9422d5 m31595g() {
        C9422d5 c9422d5;
        synchronized (this.f36838n) {
            c9422d5 = null;
            if (this.f36837m != null) {
                this.f36837m.m30740c();
                C9422d5 c9422d5Clone = this.f36837m.clone();
                this.f36837m = null;
                c9422d5 = c9422d5Clone;
            }
        }
        return c9422d5;
    }

    /* renamed from: i */
    List<C9583s0> m31596i() {
        return new CopyOnWriteArrayList(this.f36842r);
    }

    @ApiStatus.Internal
    /* renamed from: j */
    public Queue<C9657v0> m31597j() {
        return this.f36832h;
    }

    /* renamed from: k */
    public C9543c m31598k() {
        return this.f36841q;
    }

    /* renamed from: l */
    List<InterfaceC9496k1> m31599l() {
        return this.f36835k;
    }

    @ApiStatus.Internal
    /* renamed from: m */
    public Map<String, Object> m31600m() {
        return this.f36834j;
    }

    @ApiStatus.Internal
    /* renamed from: n */
    public List<String> m31601n() {
        return this.f36831g;
    }

    /* renamed from: o */
    public EnumC9587s4 m31602o() {
        return this.f36825a;
    }

    @ApiStatus.Internal
    /* renamed from: p */
    public C9526o3 m31603p() {
        return this.f36843s;
    }

    /* renamed from: q */
    public C9553l m31604q() {
        return this.f36830f;
    }

    @ApiStatus.Internal
    /* renamed from: r */
    public C9422d5 m31605r() {
        return this.f36837m;
    }

    /* renamed from: s */
    public InterfaceC9419d2 m31606s() {
        C9429e5 c9429e5Mo30523i;
        InterfaceC9426e2 interfaceC9426e2 = this.f36826b;
        return (interfaceC9426e2 == null || (c9429e5Mo30523i = interfaceC9426e2.mo30523i()) == null) ? interfaceC9426e2 : c9429e5Mo30523i;
    }

    @ApiStatus.Internal
    /* renamed from: t */
    public Map<String, String> m31607t() {
        return C9638i.m31767b(this.f36833i);
    }

    /* renamed from: u */
    public InterfaceC9426e2 m31608u() {
        return this.f36826b;
    }

    /* renamed from: v */
    public String m31609v() {
        InterfaceC9426e2 interfaceC9426e2 = this.f36826b;
        return interfaceC9426e2 != null ? interfaceC9426e2.getName() : this.f36827c;
    }

    /* renamed from: w */
    public C9540a0 m31610w() {
        return this.f36828d;
    }

    @ApiStatus.Internal
    /* renamed from: x */
    public void m31611x(C9526o3 c9526o3) {
        this.f36843s = c9526o3;
    }

    @ApiStatus.Internal
    /* renamed from: y */
    public void m31612y(String str) {
        this.f36829e = str;
        C9543c c9543cM31598k = m31598k();
        C9539a c9539aM31230a = c9543cM31598k.m31230a();
        if (c9539aM31230a == null) {
            c9539aM31230a = new C9539a();
            c9543cM31598k.m31235f(c9539aM31230a);
        }
        if (str == null) {
            c9539aM31230a.m31204s(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c9539aM31230a.m31204s(arrayList);
        }
        Iterator<InterfaceC9689z1> it = this.f36836l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo30481b(c9543cM31598k);
        }
    }

    /* renamed from: z */
    public void m31613z(InterfaceC9426e2 interfaceC9426e2) {
        synchronized (this.f36839o) {
            this.f36826b = interfaceC9426e2;
            for (InterfaceC9689z1 interfaceC9689z1 : this.f36836l.getScopeObservers()) {
                if (interfaceC9426e2 != null) {
                    interfaceC9689z1.mo30483d(interfaceC9426e2.getName());
                    interfaceC9689z1.mo30482c(interfaceC9426e2.mo30527m());
                } else {
                    interfaceC9689z1.mo30483d(null);
                    interfaceC9689z1.mo30482c(null);
                }
            }
        }
    }

    @ApiStatus.Internal
    public C9586s3(C9586s3 c9586s3) {
        this.f36831g = new ArrayList();
        this.f36833i = new ConcurrentHashMap();
        this.f36834j = new ConcurrentHashMap();
        this.f36835k = new CopyOnWriteArrayList();
        this.f36838n = new Object();
        this.f36839o = new Object();
        this.f36840p = new Object();
        this.f36841q = new C9543c();
        this.f36842r = new CopyOnWriteArrayList();
        this.f36826b = c9586s3.f36826b;
        this.f36827c = c9586s3.f36827c;
        this.f36837m = c9586s3.f36837m;
        this.f36836l = c9586s3.f36836l;
        this.f36825a = c9586s3.f36825a;
        C9540a0 c9540a0 = c9586s3.f36828d;
        this.f36828d = c9540a0 != null ? new C9540a0(c9540a0) : null;
        this.f36829e = c9586s3.f36829e;
        C9553l c9553l = c9586s3.f36830f;
        this.f36830f = c9553l != null ? new C9553l(c9553l) : null;
        this.f36831g = new ArrayList(c9586s3.f36831g);
        this.f36835k = new CopyOnWriteArrayList(c9586s3.f36835k);
        C9657v0[] c9657v0Arr = (C9657v0[]) c9586s3.f36832h.toArray(new C9657v0[0]);
        Queue<C9657v0> queueM31584f = m31584f(c9586s3.f36836l.getMaxBreadcrumbs());
        for (C9657v0 c9657v0 : c9657v0Arr) {
            queueM31584f.add(new C9657v0(c9657v0));
        }
        this.f36832h = queueM31584f;
        Map<String, String> map = c9586s3.f36833i;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f36833i = concurrentHashMap;
        Map<String, Object> map2 = c9586s3.f36834j;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.f36834j = concurrentHashMap2;
        this.f36841q = new C9543c(c9586s3.f36841q);
        this.f36842r = new CopyOnWriteArrayList(c9586s3.f36842r);
        this.f36843s = new C9526o3(c9586s3.f36843s);
    }
}
