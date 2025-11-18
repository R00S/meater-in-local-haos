package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.util.C9638i;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: App.java */
/* renamed from: io.sentry.protocol.a */
/* loaded from: classes2.dex */
public final class C9539a implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36576f;

    /* renamed from: g */
    private Date f36577g;

    /* renamed from: h */
    private String f36578h;

    /* renamed from: i */
    private String f36579i;

    /* renamed from: j */
    private String f36580j;

    /* renamed from: k */
    private String f36581k;

    /* renamed from: l */
    private String f36582l;

    /* renamed from: m */
    private Map<String, String> f36583m;

    /* renamed from: n */
    private List<String> f36584n;

    /* renamed from: o */
    private Boolean f36585o;

    /* renamed from: p */
    private Map<String, Object> f36586p;

    /* compiled from: App.java */
    /* renamed from: io.sentry.protocol.a$a */
    public static final class a implements InterfaceC9504l2<C9539a> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9539a mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9539a c9539a = new C9539a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "device_app_hash":
                        c9539a.f36578h = c9518n2.m31090N0();
                        break;
                    case "view_names":
                        List<String> list = (List) c9518n2.m31088K0();
                        if (list == null) {
                            break;
                        } else {
                            c9539a.m31204s(list);
                            break;
                        }
                    case "app_version":
                        c9539a.f36581k = c9518n2.m31090N0();
                        break;
                    case "in_foreground":
                        c9539a.f36585o = c9518n2.m31093p0();
                        break;
                    case "build_type":
                        c9539a.f36579i = c9518n2.m31090N0();
                        break;
                    case "app_identifier":
                        c9539a.f36576f = c9518n2.m31090N0();
                        break;
                    case "app_start_time":
                        c9539a.f36577g = c9518n2.m31094q0(interfaceC9670w1);
                        break;
                    case "permissions":
                        c9539a.f36583m = C9638i.m31767b((Map) c9518n2.m31088K0());
                        break;
                    case "app_name":
                        c9539a.f36580j = c9518n2.m31090N0();
                        break;
                    case "app_build":
                        c9539a.f36582l = c9518n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9539a.m31203r(concurrentHashMap);
            c9518n2.m31889j();
            return c9539a;
        }
    }

    public C9539a() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9539a.class != obj.getClass()) {
            return false;
        }
        C9539a c9539a = (C9539a) obj;
        return C9646q.m31800a(this.f36576f, c9539a.f36576f) && C9646q.m31800a(this.f36577g, c9539a.f36577g) && C9646q.m31800a(this.f36578h, c9539a.f36578h) && C9646q.m31800a(this.f36579i, c9539a.f36579i) && C9646q.m31800a(this.f36580j, c9539a.f36580j) && C9646q.m31800a(this.f36581k, c9539a.f36581k) && C9646q.m31800a(this.f36582l, c9539a.f36582l) && C9646q.m31800a(this.f36583m, c9539a.f36583m) && C9646q.m31800a(this.f36585o, c9539a.f36585o) && C9646q.m31800a(this.f36584n, c9539a.f36584n);
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36576f, this.f36577g, this.f36578h, this.f36579i, this.f36580j, this.f36581k, this.f36582l, this.f36583m, this.f36585o, this.f36584n);
    }

    /* renamed from: j */
    public Boolean m31195j() {
        return this.f36585o;
    }

    /* renamed from: k */
    public void m31196k(String str) {
        this.f36582l = str;
    }

    /* renamed from: l */
    public void m31197l(String str) {
        this.f36576f = str;
    }

    /* renamed from: m */
    public void m31198m(String str) {
        this.f36580j = str;
    }

    /* renamed from: n */
    public void m31199n(Date date) {
        this.f36577g = date;
    }

    /* renamed from: o */
    public void m31200o(String str) {
        this.f36581k = str;
    }

    /* renamed from: p */
    public void m31201p(Boolean bool) {
        this.f36585o = bool;
    }

    /* renamed from: q */
    public void m31202q(Map<String, String> map) {
        this.f36583m = map;
    }

    /* renamed from: r */
    public void m31203r(Map<String, Object> map) {
        this.f36586p = map;
    }

    /* renamed from: s */
    public void m31204s(List<String> list) {
        this.f36584n = list;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36576f != null) {
            interfaceC9448h3.mo30828k("app_identifier").mo30819b(this.f36576f);
        }
        if (this.f36577g != null) {
            interfaceC9448h3.mo30828k("app_start_time").mo30824g(interfaceC9670w1, this.f36577g);
        }
        if (this.f36578h != null) {
            interfaceC9448h3.mo30828k("device_app_hash").mo30819b(this.f36578h);
        }
        if (this.f36579i != null) {
            interfaceC9448h3.mo30828k("build_type").mo30819b(this.f36579i);
        }
        if (this.f36580j != null) {
            interfaceC9448h3.mo30828k("app_name").mo30819b(this.f36580j);
        }
        if (this.f36581k != null) {
            interfaceC9448h3.mo30828k("app_version").mo30819b(this.f36581k);
        }
        if (this.f36582l != null) {
            interfaceC9448h3.mo30828k("app_build").mo30819b(this.f36582l);
        }
        Map<String, String> map = this.f36583m;
        if (map != null && !map.isEmpty()) {
            interfaceC9448h3.mo30828k("permissions").mo30824g(interfaceC9670w1, this.f36583m);
        }
        if (this.f36585o != null) {
            interfaceC9448h3.mo30828k("in_foreground").mo30825h(this.f36585o);
        }
        if (this.f36584n != null) {
            interfaceC9448h3.mo30828k("view_names").mo30824g(interfaceC9670w1, this.f36584n);
        }
        Map<String, Object> map2 = this.f36586p;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.f36586p.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }

    C9539a(C9539a c9539a) {
        this.f36582l = c9539a.f36582l;
        this.f36576f = c9539a.f36576f;
        this.f36580j = c9539a.f36580j;
        this.f36577g = c9539a.f36577g;
        this.f36581k = c9539a.f36581k;
        this.f36579i = c9539a.f36579i;
        this.f36578h = c9539a.f36578h;
        this.f36583m = C9638i.m31767b(c9539a.f36583m);
        this.f36585o = c9539a.f36585o;
        this.f36584n = C9638i.m31766a(c9539a.f36584n);
        this.f36586p = C9638i.m31767b(c9539a.f36586p);
    }
}
