package io.sentry.protocol;

import io.sentry.C9436f5;
import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.protocol.C9539a;
import io.sentry.protocol.C9541b;
import io.sentry.protocol.C9546e;
import io.sentry.protocol.C9548g;
import io.sentry.protocol.C9552k;
import io.sentry.protocol.C9554m;
import io.sentry.protocol.C9560s;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Contexts.java */
/* renamed from: io.sentry.protocol.c */
/* loaded from: classes2.dex */
public final class C9543c extends ConcurrentHashMap<String, Object> implements InterfaceC9578r2 {

    /* renamed from: f */
    private final Object f36602f = new Object();

    /* compiled from: Contexts.java */
    /* renamed from: io.sentry.protocol.c$a */
    public static final class a implements InterfaceC9504l2<C9543c> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9543c mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            C9543c c9543c = new C9543c();
            c9518n2.m31884b();
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "device":
                        c9543c.m31237i(new C9546e.a().mo30683a(c9518n2, interfaceC9670w1));
                        break;
                    case "response":
                        c9543c.m31240l(new C9554m.a().mo30683a(c9518n2, interfaceC9670w1));
                        break;
                    case "os":
                        c9543c.m31239k(new C9552k.a().mo30683a(c9518n2, interfaceC9670w1));
                        break;
                    case "app":
                        c9543c.m31235f(new C9539a.a().mo30683a(c9518n2, interfaceC9670w1));
                        break;
                    case "gpu":
                        c9543c.m31238j(new C9548g.a().mo30683a(c9518n2, interfaceC9670w1));
                        break;
                    case "trace":
                        c9543c.m31242n(new C9436f5.a().mo30683a(c9518n2, interfaceC9670w1));
                        break;
                    case "browser":
                        c9543c.m31236h(new C9541b.a().mo30683a(c9518n2, interfaceC9670w1));
                        break;
                    case "runtime":
                        c9543c.m31241m(new C9560s.a().mo30683a(c9518n2, interfaceC9670w1));
                        break;
                    default:
                        Object objM31088K0 = c9518n2.m31088K0();
                        if (objM31088K0 == null) {
                            break;
                        } else {
                            c9543c.put(strM31879B, objM31088K0);
                            break;
                        }
                }
            }
            c9518n2.m31889j();
            return c9543c;
        }
    }

    public C9543c() {
    }

    /* renamed from: o */
    private <T> T m31229o(String str, Class<T> cls) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    /* renamed from: a */
    public C9539a m31230a() {
        return (C9539a) m31229o("app", C9539a.class);
    }

    /* renamed from: b */
    public C9546e m31231b() {
        return (C9546e) m31229o("device", C9546e.class);
    }

    /* renamed from: c */
    public C9552k m31232c() {
        return (C9552k) m31229o("os", C9552k.class);
    }

    /* renamed from: d */
    public C9560s m31233d() {
        return (C9560s) m31229o("runtime", C9560s.class);
    }

    /* renamed from: e */
    public C9436f5 m31234e() {
        return (C9436f5) m31229o("trace", C9436f5.class);
    }

    /* renamed from: f */
    public void m31235f(C9539a c9539a) {
        put("app", c9539a);
    }

    /* renamed from: h */
    public void m31236h(C9541b c9541b) {
        put("browser", c9541b);
    }

    /* renamed from: i */
    public void m31237i(C9546e c9546e) {
        put("device", c9546e);
    }

    /* renamed from: j */
    public void m31238j(C9548g c9548g) {
        put("gpu", c9548g);
    }

    /* renamed from: k */
    public void m31239k(C9552k c9552k) {
        put("os", c9552k);
    }

    /* renamed from: l */
    public void m31240l(C9554m c9554m) {
        synchronized (this.f36602f) {
            put("response", c9554m);
        }
    }

    /* renamed from: m */
    public void m31241m(C9560s c9560s) {
        put("runtime", c9560s);
    }

    /* renamed from: n */
    public void m31242n(C9436f5 c9436f5) {
        C9646q.m31802c(c9436f5, "traceContext is required");
        put("trace", c9436f5);
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public C9543c(C9543c c9543c) {
        for (Map.Entry<String, Object> entry : c9543c.entrySet()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C9539a)) {
                    m31235f(new C9539a((C9539a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof C9541b)) {
                    m31236h(new C9541b((C9541b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof C9546e)) {
                    m31237i(new C9546e((C9546e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof C9552k)) {
                    m31239k(new C9552k((C9552k) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof C9560s)) {
                    m31241m(new C9560s((C9560s) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof C9548g)) {
                    m31238j(new C9548g((C9548g) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof C9436f5)) {
                    m31242n(new C9436f5((C9436f5) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof C9554m)) {
                    m31240l(new C9554m((C9554m) value));
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }
}
