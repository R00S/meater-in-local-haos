package io.sentry;

import io.sentry.EnumC9587s4;
import io.sentry.util.C9638i;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Breadcrumb.java */
/* renamed from: io.sentry.v0 */
/* loaded from: classes2.dex */
public final class C9657v0 implements InterfaceC9578r2 {

    /* renamed from: f */
    private final Date f36942f;

    /* renamed from: g */
    private String f36943g;

    /* renamed from: h */
    private String f36944h;

    /* renamed from: i */
    private Map<String, Object> f36945i;

    /* renamed from: j */
    private String f36946j;

    /* renamed from: k */
    private EnumC9587s4 f36947k;

    /* renamed from: l */
    private Map<String, Object> f36948l;

    /* compiled from: Breadcrumb.java */
    /* renamed from: io.sentry.v0$a */
    public static final class a implements InterfaceC9504l2<C9657v0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9657v0 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            Date dateM30008c = C9244a1.m30008c();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String strM31090N0 = null;
            String strM31090N02 = null;
            String strM31090N03 = null;
            EnumC9587s4 enumC9587s4Mo30683a = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "data":
                        ?? M31767b = C9638i.m31767b((Map) c9518n2.m31088K0());
                        if (M31767b == 0) {
                            break;
                        } else {
                            concurrentHashMap = M31767b;
                            break;
                        }
                    case "type":
                        strM31090N02 = c9518n2.m31090N0();
                        break;
                    case "category":
                        strM31090N03 = c9518n2.m31090N0();
                        break;
                    case "timestamp":
                        Date dateM31094q0 = c9518n2.m31094q0(interfaceC9670w1);
                        if (dateM31094q0 == null) {
                            break;
                        } else {
                            dateM30008c = dateM31094q0;
                            break;
                        }
                    case "level":
                        try {
                            enumC9587s4Mo30683a = new EnumC9587s4.a().mo30683a(c9518n2, interfaceC9670w1);
                            break;
                        } catch (Exception e2) {
                            interfaceC9670w1.mo30212a(EnumC9587s4.ERROR, e2, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                    case "message":
                        strM31090N0 = c9518n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap2, strM31879B);
                        break;
                }
            }
            C9657v0 c9657v0 = new C9657v0(dateM30008c);
            c9657v0.f36943g = strM31090N0;
            c9657v0.f36944h = strM31090N02;
            c9657v0.f36945i = concurrentHashMap;
            c9657v0.f36946j = strM31090N03;
            c9657v0.f36947k = enumC9587s4Mo30683a;
            c9657v0.m31845q(concurrentHashMap2);
            c9518n2.m31889j();
            return c9657v0;
        }
    }

    public C9657v0(Date date) {
        this.f36945i = new ConcurrentHashMap();
        this.f36942f = date;
    }

    /* renamed from: r */
    public static C9657v0 m31833r(String str, String str2, String str3, String str4, Map<String, Object> map) {
        C9657v0 c9657v0 = new C9657v0();
        c9657v0.m31844p("user");
        c9657v0.m31840l("ui." + str);
        if (str2 != null) {
            c9657v0.m31841m("view.id", str2);
        }
        if (str3 != null) {
            c9657v0.m31841m("view.class", str3);
        }
        if (str4 != null) {
            c9657v0.m31841m("view.tag", str4);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            c9657v0.m31835g().put(entry.getKey(), entry.getValue());
        }
        c9657v0.m31842n(EnumC9587s4.INFO);
        return c9657v0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9657v0.class != obj.getClass()) {
            return false;
        }
        C9657v0 c9657v0 = (C9657v0) obj;
        return this.f36942f.getTime() == c9657v0.f36942f.getTime() && C9646q.m31800a(this.f36943g, c9657v0.f36943g) && C9646q.m31800a(this.f36944h, c9657v0.f36944h) && C9646q.m31800a(this.f36946j, c9657v0.f36946j) && this.f36947k == c9657v0.f36947k;
    }

    /* renamed from: f */
    public String m31834f() {
        return this.f36946j;
    }

    @ApiStatus.Internal
    /* renamed from: g */
    public Map<String, Object> m31835g() {
        return this.f36945i;
    }

    /* renamed from: h */
    public EnumC9587s4 m31836h() {
        return this.f36947k;
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36942f, this.f36943g, this.f36944h, this.f36946j, this.f36947k);
    }

    /* renamed from: i */
    public String m31837i() {
        return this.f36943g;
    }

    /* renamed from: j */
    public Date m31838j() {
        return (Date) this.f36942f.clone();
    }

    /* renamed from: k */
    public String m31839k() {
        return this.f36944h;
    }

    /* renamed from: l */
    public void m31840l(String str) {
        this.f36946j = str;
    }

    /* renamed from: m */
    public void m31841m(String str, Object obj) {
        this.f36945i.put(str, obj);
    }

    /* renamed from: n */
    public void m31842n(EnumC9587s4 enumC9587s4) {
        this.f36947k = enumC9587s4;
    }

    /* renamed from: o */
    public void m31843o(String str) {
        this.f36943g = str;
    }

    /* renamed from: p */
    public void m31844p(String str) {
        this.f36944h = str;
    }

    /* renamed from: q */
    public void m31845q(Map<String, Object> map) {
        this.f36948l = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("timestamp").mo30824g(interfaceC9670w1, this.f36942f);
        if (this.f36943g != null) {
            interfaceC9448h3.mo30828k("message").mo30819b(this.f36943g);
        }
        if (this.f36944h != null) {
            interfaceC9448h3.mo30828k("type").mo30819b(this.f36944h);
        }
        interfaceC9448h3.mo30828k("data").mo30824g(interfaceC9670w1, this.f36945i);
        if (this.f36946j != null) {
            interfaceC9448h3.mo30828k("category").mo30819b(this.f36946j);
        }
        if (this.f36947k != null) {
            interfaceC9448h3.mo30828k("level").mo30824g(interfaceC9670w1, this.f36947k);
        }
        Map<String, Object> map = this.f36948l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36948l.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    C9657v0(C9657v0 c9657v0) {
        this.f36945i = new ConcurrentHashMap();
        this.f36942f = c9657v0.f36942f;
        this.f36943g = c9657v0.f36943g;
        this.f36944h = c9657v0.f36944h;
        this.f36946j = c9657v0.f36946j;
        Map<String, Object> mapM31767b = C9638i.m31767b(c9657v0.f36945i);
        if (mapM31767b != null) {
            this.f36945i = mapM31767b;
        }
        this.f36948l = C9638i.m31767b(c9657v0.f36948l);
        this.f36947k = c9657v0.f36947k;
    }

    public C9657v0() {
        this(C9244a1.m30008c());
    }
}
