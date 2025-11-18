package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.protocol.C9544c0;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ViewHierarchy.java */
/* renamed from: io.sentry.protocol.b0 */
/* loaded from: classes2.dex */
public final class C9542b0 implements InterfaceC9578r2 {

    /* renamed from: f */
    private final String f36599f;

    /* renamed from: g */
    private final List<C9544c0> f36600g;

    /* renamed from: h */
    private Map<String, Object> f36601h;

    /* compiled from: ViewHierarchy.java */
    /* renamed from: io.sentry.protocol.b0$a */
    public static final class a implements InterfaceC9504l2<C9542b0> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9542b0 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            c9518n2.m31884b();
            String strM31090N0 = null;
            List listM31085F0 = null;
            HashMap map = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                String strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                if (strM31879B.equals("rendering_system")) {
                    strM31090N0 = c9518n2.m31090N0();
                } else if (strM31879B.equals("windows")) {
                    listM31085F0 = c9518n2.m31085F0(interfaceC9670w1, new C9544c0.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    c9518n2.m31092R0(interfaceC9670w1, map, strM31879B);
                }
            }
            c9518n2.m31889j();
            C9542b0 c9542b0 = new C9542b0(strM31090N0, listM31085F0);
            c9542b0.m31227a(map);
            return c9542b0;
        }
    }

    public C9542b0(String str, List<C9544c0> list) {
        this.f36599f = str;
        this.f36600g = list;
    }

    /* renamed from: a */
    public void m31227a(Map<String, Object> map) {
        this.f36601h = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36599f != null) {
            interfaceC9448h3.mo30828k("rendering_system").mo30819b(this.f36599f);
        }
        if (this.f36600g != null) {
            interfaceC9448h3.mo30828k("windows").mo30824g(interfaceC9670w1, this.f36600g);
        }
        Map<String, Object> map = this.f36601h;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.f36601h.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }
}
