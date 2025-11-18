package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.util.C9638i;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Response.java */
/* renamed from: io.sentry.protocol.m */
/* loaded from: classes2.dex */
public final class C9554m implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36702f;

    /* renamed from: g */
    private Map<String, String> f36703g;

    /* renamed from: h */
    private Integer f36704h;

    /* renamed from: i */
    private Long f36705i;

    /* renamed from: j */
    private Object f36706j;

    /* renamed from: k */
    private Map<String, Object> f36707k;

    /* compiled from: Response.java */
    /* renamed from: io.sentry.protocol.m$a */
    public static final class a implements InterfaceC9504l2<C9554m> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9554m mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9554m c9554m = new C9554m();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "status_code":
                        c9554m.f36704h = c9518n2.m31084E0();
                        break;
                    case "data":
                        c9554m.f36706j = c9518n2.m31088K0();
                        break;
                    case "headers":
                        Map map = (Map) c9518n2.m31088K0();
                        if (map == null) {
                            break;
                        } else {
                            c9554m.f36703g = C9638i.m31767b(map);
                            break;
                        }
                    case "cookies":
                        c9554m.f36702f = c9518n2.m31090N0();
                        break;
                    case "body_size":
                        c9554m.f36705i = c9518n2.m31086G0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9554m.m31415f(concurrentHashMap);
            c9518n2.m31889j();
            return c9554m;
        }
    }

    public C9554m() {
    }

    /* renamed from: f */
    public void m31415f(Map<String, Object> map) {
        this.f36707k = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36702f != null) {
            interfaceC9448h3.mo30828k("cookies").mo30819b(this.f36702f);
        }
        if (this.f36703g != null) {
            interfaceC9448h3.mo30828k("headers").mo30824g(interfaceC9670w1, this.f36703g);
        }
        if (this.f36704h != null) {
            interfaceC9448h3.mo30828k("status_code").mo30824g(interfaceC9670w1, this.f36704h);
        }
        if (this.f36705i != null) {
            interfaceC9448h3.mo30828k("body_size").mo30824g(interfaceC9670w1, this.f36705i);
        }
        if (this.f36706j != null) {
            interfaceC9448h3.mo30828k("data").mo30824g(interfaceC9670w1, this.f36706j);
        }
        Map<String, Object> map = this.f36707k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36707k.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public C9554m(C9554m c9554m) {
        this.f36702f = c9554m.f36702f;
        this.f36703g = C9638i.m31767b(c9554m.f36703g);
        this.f36707k = C9638i.m31767b(c9554m.f36707k);
        this.f36704h = c9554m.f36704h;
        this.f36705i = c9554m.f36705i;
        this.f36706j = c9554m.f36706j;
    }
}
