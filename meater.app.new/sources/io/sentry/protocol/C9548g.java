package io.sentry.protocol;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
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

/* compiled from: Gpu.java */
/* renamed from: io.sentry.protocol.g */
/* loaded from: classes2.dex */
public final class C9548g implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36657f;

    /* renamed from: g */
    private Integer f36658g;

    /* renamed from: h */
    private String f36659h;

    /* renamed from: i */
    private String f36660i;

    /* renamed from: j */
    private Integer f36661j;

    /* renamed from: k */
    private String f36662k;

    /* renamed from: l */
    private Boolean f36663l;

    /* renamed from: m */
    private String f36664m;

    /* renamed from: n */
    private String f36665n;

    /* renamed from: o */
    private Map<String, Object> f36666o;

    /* compiled from: Gpu.java */
    /* renamed from: io.sentry.protocol.g$a */
    public static final class a implements InterfaceC9504l2<C9548g> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9548g mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9548g c9548g = new C9548g();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "npot_support":
                        c9548g.f36665n = c9518n2.m31090N0();
                        break;
                    case "vendor_id":
                        c9548g.f36659h = c9518n2.m31090N0();
                        break;
                    case "multi_threaded_rendering":
                        c9548g.f36663l = c9518n2.m31093p0();
                        break;
                    case "id":
                        c9548g.f36658g = c9518n2.m31084E0();
                        break;
                    case "name":
                        c9548g.f36657f = c9518n2.m31090N0();
                        break;
                    case "vendor_name":
                        c9548g.f36660i = c9518n2.m31090N0();
                        break;
                    case "version":
                        c9548g.f36664m = c9518n2.m31090N0();
                        break;
                    case "api_type":
                        c9548g.f36662k = c9518n2.m31090N0();
                        break;
                    case "memory_size":
                        c9548g.f36661j = c9518n2.m31084E0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9548g.m31359j(concurrentHashMap);
            c9518n2.m31889j();
            return c9548g;
        }
    }

    public C9548g() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9548g.class != obj.getClass()) {
            return false;
        }
        C9548g c9548g = (C9548g) obj;
        return C9646q.m31800a(this.f36657f, c9548g.f36657f) && C9646q.m31800a(this.f36658g, c9548g.f36658g) && C9646q.m31800a(this.f36659h, c9548g.f36659h) && C9646q.m31800a(this.f36660i, c9548g.f36660i) && C9646q.m31800a(this.f36661j, c9548g.f36661j) && C9646q.m31800a(this.f36662k, c9548g.f36662k) && C9646q.m31800a(this.f36663l, c9548g.f36663l) && C9646q.m31800a(this.f36664m, c9548g.f36664m) && C9646q.m31800a(this.f36665n, c9548g.f36665n);
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36657f, this.f36658g, this.f36659h, this.f36660i, this.f36661j, this.f36662k, this.f36663l, this.f36664m, this.f36665n);
    }

    /* renamed from: j */
    public void m31359j(Map<String, Object> map) {
        this.f36666o = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36657f != null) {
            interfaceC9448h3.mo30828k("name").mo30819b(this.f36657f);
        }
        if (this.f36658g != null) {
            interfaceC9448h3.mo30828k(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID).mo30822e(this.f36658g);
        }
        if (this.f36659h != null) {
            interfaceC9448h3.mo30828k("vendor_id").mo30819b(this.f36659h);
        }
        if (this.f36660i != null) {
            interfaceC9448h3.mo30828k("vendor_name").mo30819b(this.f36660i);
        }
        if (this.f36661j != null) {
            interfaceC9448h3.mo30828k("memory_size").mo30822e(this.f36661j);
        }
        if (this.f36662k != null) {
            interfaceC9448h3.mo30828k("api_type").mo30819b(this.f36662k);
        }
        if (this.f36663l != null) {
            interfaceC9448h3.mo30828k("multi_threaded_rendering").mo30825h(this.f36663l);
        }
        if (this.f36664m != null) {
            interfaceC9448h3.mo30828k("version").mo30819b(this.f36664m);
        }
        if (this.f36665n != null) {
            interfaceC9448h3.mo30828k("npot_support").mo30819b(this.f36665n);
        }
        Map<String, Object> map = this.f36666o;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36666o.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    C9548g(C9548g c9548g) {
        this.f36657f = c9548g.f36657f;
        this.f36658g = c9548g.f36658g;
        this.f36659h = c9548g.f36659h;
        this.f36660i = c9548g.f36660i;
        this.f36661j = c9548g.f36661j;
        this.f36662k = c9548g.f36662k;
        this.f36663l = c9548g.f36663l;
        this.f36664m = c9548g.f36664m;
        this.f36665n = c9548g.f36665n;
        this.f36666o = C9638i.m31767b(c9548g.f36666o);
    }
}
