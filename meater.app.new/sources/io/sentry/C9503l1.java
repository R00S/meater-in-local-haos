package io.sentry;

import io.sentry.C9680x4;
import io.sentry.config.InterfaceC9412g;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ExternalOptions.java */
/* renamed from: io.sentry.l1 */
/* loaded from: classes2.dex */
public final class C9503l1 {

    /* renamed from: A */
    private List<String> f36420A;

    /* renamed from: B */
    private Boolean f36421B;

    /* renamed from: a */
    private String f36422a;

    /* renamed from: b */
    private String f36423b;

    /* renamed from: c */
    private String f36424c;

    /* renamed from: d */
    private String f36425d;

    /* renamed from: e */
    private String f36426e;

    /* renamed from: f */
    private Boolean f36427f;

    /* renamed from: g */
    private Boolean f36428g;

    /* renamed from: h */
    private Boolean f36429h;

    /* renamed from: i */
    private Boolean f36430i;

    /* renamed from: j */
    private Double f36431j;

    /* renamed from: k */
    private Double f36432k;

    /* renamed from: l */
    private C9680x4.f f36433l;

    /* renamed from: n */
    private C9680x4.e f36435n;

    /* renamed from: s */
    private String f36440s;

    /* renamed from: t */
    private Long f36441t;

    /* renamed from: v */
    private Boolean f36443v;

    /* renamed from: w */
    private Boolean f36444w;

    /* renamed from: y */
    private Boolean f36446y;

    /* renamed from: z */
    private Boolean f36447z;

    /* renamed from: m */
    private final Map<String, String> f36434m = new ConcurrentHashMap();

    /* renamed from: o */
    private final List<String> f36436o = new CopyOnWriteArrayList();

    /* renamed from: p */
    private final List<String> f36437p = new CopyOnWriteArrayList();

    /* renamed from: q */
    private List<String> f36438q = null;

    /* renamed from: r */
    private final List<String> f36439r = new CopyOnWriteArrayList();

    /* renamed from: u */
    private final Set<Class<? extends Throwable>> f36442u = new CopyOnWriteArraySet();

    /* renamed from: x */
    private Set<String> f36445x = new CopyOnWriteArraySet();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static C9503l1 m30928g(InterfaceC9412g interfaceC9412g, InterfaceC9670w1 interfaceC9670w1) throws ClassNotFoundException {
        C9503l1 c9503l1 = new C9503l1();
        c9503l1.m30939K(interfaceC9412g.mo30702b("dsn"));
        c9503l1.m30945Q(interfaceC9412g.mo30702b("environment"));
        c9503l1.m30953Y(interfaceC9412g.mo30702b("release"));
        c9503l1.m30938J(interfaceC9412g.mo30702b("dist"));
        c9503l1.m30958b0(interfaceC9412g.mo30702b("servername"));
        c9503l1.m30943O(interfaceC9412g.mo30703c("uncaught.handler.enabled"));
        c9503l1.m30949U(interfaceC9412g.mo30703c("uncaught.handler.print-stacktrace"));
        c9503l1.m30942N(interfaceC9412g.mo30703c("enable-tracing"));
        c9503l1.m30962d0(interfaceC9412g.mo30705e("traces-sample-rate"));
        c9503l1.m30950V(interfaceC9412g.mo30705e("profiles-sample-rate"));
        c9503l1.m30937I(interfaceC9412g.mo30703c("debug"));
        c9503l1.m30940L(interfaceC9412g.mo30703c("enable-deduplication"));
        c9503l1.m30954Z(interfaceC9412g.mo30703c("send-client-reports"));
        String strMo30702b = interfaceC9412g.mo30702b("max-request-body-size");
        if (strMo30702b != null) {
            c9503l1.m30948T(C9680x4.f.valueOf(strMo30702b.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry<String, String> entry : interfaceC9412g.mo30701a("tags").entrySet()) {
            c9503l1.m30960c0(entry.getKey(), entry.getValue());
        }
        String strMo30702b2 = interfaceC9412g.mo30702b("proxy.host");
        String strMo30702b3 = interfaceC9412g.mo30702b("proxy.user");
        String strMo30702b4 = interfaceC9412g.mo30702b("proxy.pass");
        String strMo30706f = interfaceC9412g.mo30706f("proxy.port", "80");
        if (strMo30702b2 != null) {
            c9503l1.m30952X(new C9680x4.e(strMo30702b2, strMo30706f, strMo30702b3, strMo30702b4));
        }
        Iterator<String> it = interfaceC9412g.mo30707g("in-app-includes").iterator();
        while (it.hasNext()) {
            c9503l1.m30963e(it.next());
        }
        Iterator<String> it2 = interfaceC9412g.mo30707g("in-app-excludes").iterator();
        while (it2.hasNext()) {
            c9503l1.m30961d(it2.next());
        }
        List<String> listMo30707g = interfaceC9412g.mo30702b("trace-propagation-targets") != null ? interfaceC9412g.mo30707g("trace-propagation-targets") : null;
        if (listMo30707g == null && interfaceC9412g.mo30702b("tracing-origins") != null) {
            listMo30707g = interfaceC9412g.mo30707g("tracing-origins");
        }
        if (listMo30707g != null) {
            Iterator<String> it3 = listMo30707g.iterator();
            while (it3.hasNext()) {
                c9503l1.m30964f(it3.next());
            }
        }
        Iterator<String> it4 = interfaceC9412g.mo30707g("context-tags").iterator();
        while (it4.hasNext()) {
            c9503l1.m30957b(it4.next());
        }
        c9503l1.m30951W(interfaceC9412g.mo30702b("proguard-uuid"));
        Iterator<String> it5 = interfaceC9412g.mo30707g("bundle-ids").iterator();
        while (it5.hasNext()) {
            c9503l1.m30955a(it5.next());
        }
        c9503l1.m30946R(interfaceC9412g.mo30704d("idle-timeout"));
        c9503l1.m30944P(interfaceC9412g.mo30703c("enabled"));
        c9503l1.m30941M(interfaceC9412g.mo30703c("enable-pretty-serialization-output"));
        c9503l1.m30956a0(interfaceC9412g.mo30703c("send-modules"));
        c9503l1.m30947S(interfaceC9412g.mo30707g("ignored-checkins"));
        for (String str : interfaceC9412g.mo30707g("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str);
                if (Throwable.class.isAssignableFrom(cls)) {
                    c9503l1.m30959c(cls);
                } else {
                    interfaceC9670w1.mo30214c(EnumC9587s4.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str, str);
                }
            } catch (ClassNotFoundException unused) {
                interfaceC9670w1.mo30214c(EnumC9587s4.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str, str);
            }
        }
        return c9503l1;
    }

    /* renamed from: A */
    public Boolean m30929A() {
        return this.f36444w;
    }

    /* renamed from: B */
    public String m30930B() {
        return this.f36426e;
    }

    /* renamed from: C */
    public Map<String, String> m30931C() {
        return this.f36434m;
    }

    /* renamed from: D */
    public List<String> m30932D() {
        return this.f36438q;
    }

    /* renamed from: E */
    public Double m30933E() {
        return this.f36431j;
    }

    /* renamed from: F */
    public Boolean m30934F() {
        return this.f36447z;
    }

    /* renamed from: G */
    public Boolean m30935G() {
        return this.f36446y;
    }

    /* renamed from: H */
    public Boolean m30936H() {
        return this.f36421B;
    }

    /* renamed from: I */
    public void m30937I(Boolean bool) {
        this.f36428g = bool;
    }

    /* renamed from: J */
    public void m30938J(String str) {
        this.f36425d = str;
    }

    /* renamed from: K */
    public void m30939K(String str) {
        this.f36422a = str;
    }

    /* renamed from: L */
    public void m30940L(Boolean bool) {
        this.f36429h = bool;
    }

    /* renamed from: M */
    public void m30941M(Boolean bool) {
        this.f36447z = bool;
    }

    /* renamed from: N */
    public void m30942N(Boolean bool) {
        this.f36430i = bool;
    }

    /* renamed from: O */
    public void m30943O(Boolean bool) {
        this.f36427f = bool;
    }

    /* renamed from: P */
    public void m30944P(Boolean bool) {
        this.f36446y = bool;
    }

    /* renamed from: Q */
    public void m30945Q(String str) {
        this.f36423b = str;
    }

    /* renamed from: R */
    public void m30946R(Long l) {
        this.f36441t = l;
    }

    @ApiStatus.Experimental
    /* renamed from: S */
    public void m30947S(List<String> list) {
        this.f36420A = list;
    }

    /* renamed from: T */
    public void m30948T(C9680x4.f fVar) {
        this.f36433l = fVar;
    }

    /* renamed from: U */
    public void m30949U(Boolean bool) {
        this.f36443v = bool;
    }

    /* renamed from: V */
    public void m30950V(Double d2) {
        this.f36432k = d2;
    }

    /* renamed from: W */
    public void m30951W(String str) {
        this.f36440s = str;
    }

    /* renamed from: X */
    public void m30952X(C9680x4.e eVar) {
        this.f36435n = eVar;
    }

    /* renamed from: Y */
    public void m30953Y(String str) {
        this.f36424c = str;
    }

    /* renamed from: Z */
    public void m30954Z(Boolean bool) {
        this.f36444w = bool;
    }

    /* renamed from: a */
    public void m30955a(String str) {
        this.f36445x.add(str);
    }

    /* renamed from: a0 */
    public void m30956a0(Boolean bool) {
        this.f36421B = bool;
    }

    /* renamed from: b */
    public void m30957b(String str) {
        this.f36439r.add(str);
    }

    /* renamed from: b0 */
    public void m30958b0(String str) {
        this.f36426e = str;
    }

    /* renamed from: c */
    public void m30959c(Class<? extends Throwable> cls) {
        this.f36442u.add(cls);
    }

    /* renamed from: c0 */
    public void m30960c0(String str, String str2) {
        this.f36434m.put(str, str2);
    }

    /* renamed from: d */
    public void m30961d(String str) {
        this.f36436o.add(str);
    }

    /* renamed from: d0 */
    public void m30962d0(Double d2) {
        this.f36431j = d2;
    }

    /* renamed from: e */
    public void m30963e(String str) {
        this.f36437p.add(str);
    }

    /* renamed from: f */
    public void m30964f(String str) {
        if (this.f36438q == null) {
            this.f36438q = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.f36438q.add(str);
    }

    /* renamed from: h */
    public Set<String> m30965h() {
        return this.f36445x;
    }

    /* renamed from: i */
    public List<String> m30966i() {
        return this.f36439r;
    }

    /* renamed from: j */
    public Boolean m30967j() {
        return this.f36428g;
    }

    /* renamed from: k */
    public String m30968k() {
        return this.f36425d;
    }

    /* renamed from: l */
    public String m30969l() {
        return this.f36422a;
    }

    /* renamed from: m */
    public Boolean m30970m() {
        return this.f36429h;
    }

    /* renamed from: n */
    public Boolean m30971n() {
        return this.f36430i;
    }

    /* renamed from: o */
    public Boolean m30972o() {
        return this.f36427f;
    }

    /* renamed from: p */
    public String m30973p() {
        return this.f36423b;
    }

    /* renamed from: q */
    public Long m30974q() {
        return this.f36441t;
    }

    @ApiStatus.Experimental
    /* renamed from: r */
    public List<String> m30975r() {
        return this.f36420A;
    }

    /* renamed from: s */
    public Set<Class<? extends Throwable>> m30976s() {
        return this.f36442u;
    }

    /* renamed from: t */
    public List<String> m30977t() {
        return this.f36436o;
    }

    /* renamed from: u */
    public List<String> m30978u() {
        return this.f36437p;
    }

    /* renamed from: v */
    public Boolean m30979v() {
        return this.f36443v;
    }

    /* renamed from: w */
    public Double m30980w() {
        return this.f36432k;
    }

    /* renamed from: x */
    public String m30981x() {
        return this.f36440s;
    }

    /* renamed from: y */
    public C9680x4.e m30982y() {
        return this.f36435n;
    }

    /* renamed from: z */
    public String m30983z() {
        return this.f36424c;
    }
}
