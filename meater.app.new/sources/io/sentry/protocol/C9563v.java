package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.protocol.C9562u;
import io.sentry.util.C9638i;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryStackTrace.java */
/* renamed from: io.sentry.protocol.v */
/* loaded from: classes2.dex */
public final class C9563v implements InterfaceC9578r2 {

    /* renamed from: f */
    private List<C9562u> f36764f;

    /* renamed from: g */
    private Map<String, String> f36765g;

    /* renamed from: h */
    private Boolean f36766h;

    /* renamed from: i */
    private Map<String, Object> f36767i;

    /* compiled from: SentryStackTrace.java */
    /* renamed from: io.sentry.protocol.v$a */
    public static final class a implements InterfaceC9504l2<C9563v> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9563v mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            C9563v c9563v = new C9563v();
            c9518n2.m31884b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "frames":
                        c9563v.f36764f = c9518n2.m31085F0(interfaceC9670w1, new C9562u.a());
                        break;
                    case "registers":
                        c9563v.f36765g = C9638i.m31767b((Map) c9518n2.m31088K0());
                        break;
                    case "snapshot":
                        c9563v.f36766h = c9518n2.m31093p0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9563v.m31502f(concurrentHashMap);
            c9518n2.m31889j();
            return c9563v;
        }
    }

    public C9563v() {
    }

    /* renamed from: d */
    public List<C9562u> m31500d() {
        return this.f36764f;
    }

    /* renamed from: e */
    public void m31501e(Boolean bool) {
        this.f36766h = bool;
    }

    /* renamed from: f */
    public void m31502f(Map<String, Object> map) {
        this.f36767i = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36764f != null) {
            interfaceC9448h3.mo30828k("frames").mo30824g(interfaceC9670w1, this.f36764f);
        }
        if (this.f36765g != null) {
            interfaceC9448h3.mo30828k("registers").mo30824g(interfaceC9670w1, this.f36765g);
        }
        if (this.f36766h != null) {
            interfaceC9448h3.mo30828k("snapshot").mo30825h(this.f36766h);
        }
        Map<String, Object> map = this.f36767i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36767i.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public C9563v(List<C9562u> list) {
        this.f36764f = list;
    }
}
