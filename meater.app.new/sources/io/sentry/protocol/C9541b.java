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

/* compiled from: Browser.java */
/* renamed from: io.sentry.protocol.b */
/* loaded from: classes2.dex */
public final class C9541b implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36596f;

    /* renamed from: g */
    private String f36597g;

    /* renamed from: h */
    private Map<String, Object> f36598h;

    /* compiled from: Browser.java */
    /* renamed from: io.sentry.protocol.b$a */
    public static final class a implements InterfaceC9504l2<C9541b> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9541b mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            c9518n2.m31884b();
            C9541b c9541b = new C9541b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                String strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                if (strM31879B.equals("name")) {
                    c9541b.f36596f = c9518n2.m31090N0();
                } else if (strM31879B.equals("version")) {
                    c9541b.f36597g = c9518n2.m31090N0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                }
            }
            c9541b.m31225c(concurrentHashMap);
            c9518n2.m31889j();
            return c9541b;
        }
    }

    public C9541b() {
    }

    /* renamed from: c */
    public void m31225c(Map<String, Object> map) {
        this.f36598h = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9541b.class != obj.getClass()) {
            return false;
        }
        C9541b c9541b = (C9541b) obj;
        return C9646q.m31800a(this.f36596f, c9541b.f36596f) && C9646q.m31800a(this.f36597g, c9541b.f36597g);
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36596f, this.f36597g);
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36596f != null) {
            interfaceC9448h3.mo30828k("name").mo30819b(this.f36596f);
        }
        if (this.f36597g != null) {
            interfaceC9448h3.mo30828k("version").mo30819b(this.f36597g);
        }
        Map<String, Object> map = this.f36598h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36598h.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    C9541b(C9541b c9541b) {
        this.f36596f = c9541b.f36596f;
        this.f36597g = c9541b.f36597g;
        this.f36598h = C9638i.m31767b(c9541b.f36598h);
    }
}
