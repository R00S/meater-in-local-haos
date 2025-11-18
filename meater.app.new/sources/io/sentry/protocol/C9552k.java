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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: OperatingSystem.java */
/* renamed from: io.sentry.protocol.k */
/* loaded from: classes2.dex */
public final class C9552k implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36683f;

    /* renamed from: g */
    private String f36684g;

    /* renamed from: h */
    private String f36685h;

    /* renamed from: i */
    private String f36686i;

    /* renamed from: j */
    private String f36687j;

    /* renamed from: k */
    private Boolean f36688k;

    /* renamed from: l */
    private Map<String, Object> f36689l;

    /* compiled from: OperatingSystem.java */
    /* renamed from: io.sentry.protocol.k$a */
    public static final class a implements InterfaceC9504l2<C9552k> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9552k mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9552k c9552k = new C9552k();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "rooted":
                        c9552k.f36688k = c9518n2.m31093p0();
                        break;
                    case "raw_description":
                        c9552k.f36685h = c9518n2.m31090N0();
                        break;
                    case "name":
                        c9552k.f36683f = c9518n2.m31090N0();
                        break;
                    case "build":
                        c9552k.f36686i = c9518n2.m31090N0();
                        break;
                    case "version":
                        c9552k.f36684g = c9518n2.m31090N0();
                        break;
                    case "kernel_version":
                        c9552k.f36687j = c9518n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9552k.m31393l(concurrentHashMap);
            c9518n2.m31889j();
            return c9552k;
        }
    }

    public C9552k() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9552k.class != obj.getClass()) {
            return false;
        }
        C9552k c9552k = (C9552k) obj;
        return C9646q.m31800a(this.f36683f, c9552k.f36683f) && C9646q.m31800a(this.f36684g, c9552k.f36684g) && C9646q.m31800a(this.f36685h, c9552k.f36685h) && C9646q.m31800a(this.f36686i, c9552k.f36686i) && C9646q.m31800a(this.f36687j, c9552k.f36687j) && C9646q.m31800a(this.f36688k, c9552k.f36688k);
    }

    /* renamed from: g */
    public String m31388g() {
        return this.f36683f;
    }

    /* renamed from: h */
    public void m31389h(String str) {
        this.f36686i = str;
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36683f, this.f36684g, this.f36685h, this.f36686i, this.f36687j, this.f36688k);
    }

    /* renamed from: i */
    public void m31390i(String str) {
        this.f36687j = str;
    }

    /* renamed from: j */
    public void m31391j(String str) {
        this.f36683f = str;
    }

    /* renamed from: k */
    public void m31392k(Boolean bool) {
        this.f36688k = bool;
    }

    /* renamed from: l */
    public void m31393l(Map<String, Object> map) {
        this.f36689l = map;
    }

    /* renamed from: m */
    public void m31394m(String str) {
        this.f36684g = str;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36683f != null) {
            interfaceC9448h3.mo30828k("name").mo30819b(this.f36683f);
        }
        if (this.f36684g != null) {
            interfaceC9448h3.mo30828k("version").mo30819b(this.f36684g);
        }
        if (this.f36685h != null) {
            interfaceC9448h3.mo30828k("raw_description").mo30819b(this.f36685h);
        }
        if (this.f36686i != null) {
            interfaceC9448h3.mo30828k("build").mo30819b(this.f36686i);
        }
        if (this.f36687j != null) {
            interfaceC9448h3.mo30828k("kernel_version").mo30819b(this.f36687j);
        }
        if (this.f36688k != null) {
            interfaceC9448h3.mo30828k("rooted").mo30825h(this.f36688k);
        }
        Map<String, Object> map = this.f36689l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36689l.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    C9552k(C9552k c9552k) {
        this.f36683f = c9552k.f36683f;
        this.f36684g = c9552k.f36684g;
        this.f36685h = c9552k.f36685h;
        this.f36686i = c9552k.f36686i;
        this.f36687j = c9552k.f36687j;
        this.f36688k = c9552k.f36688k;
        this.f36689l = C9638i.m31767b(c9552k.f36689l);
    }
}
