package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Geo.java */
/* renamed from: io.sentry.protocol.f */
/* loaded from: classes2.dex */
public final class C9547f implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36653f;

    /* renamed from: g */
    private String f36654g;

    /* renamed from: h */
    private String f36655h;

    /* renamed from: i */
    private Map<String, Object> f36656i;

    /* compiled from: Geo.java */
    /* renamed from: io.sentry.protocol.f$a */
    public static final class a implements InterfaceC9504l2<C9547f> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9547f mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9547f c9547f = new C9547f();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "region":
                        c9547f.f36655h = c9518n2.m31090N0();
                        break;
                    case "city":
                        c9547f.f36653f = c9518n2.m31090N0();
                        break;
                    case "country_code":
                        c9547f.f36654g = c9518n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9547f.m31348d(concurrentHashMap);
            c9518n2.m31889j();
            return c9547f;
        }
    }

    /* renamed from: d */
    public void m31348d(Map<String, Object> map) {
        this.f36656i = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36653f != null) {
            interfaceC9448h3.mo30828k("city").mo30819b(this.f36653f);
        }
        if (this.f36654g != null) {
            interfaceC9448h3.mo30828k("country_code").mo30819b(this.f36654g);
        }
        if (this.f36655h != null) {
            interfaceC9448h3.mo30828k("region").mo30819b(this.f36655h);
        }
        Map<String, Object> map = this.f36656i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36656i.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }
}
