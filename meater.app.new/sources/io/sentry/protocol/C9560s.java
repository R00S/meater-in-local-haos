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

/* compiled from: SentryRuntime.java */
/* renamed from: io.sentry.protocol.s */
/* loaded from: classes2.dex */
public final class C9560s implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36730f;

    /* renamed from: g */
    private String f36731g;

    /* renamed from: h */
    private String f36732h;

    /* renamed from: i */
    private Map<String, Object> f36733i;

    /* compiled from: SentryRuntime.java */
    /* renamed from: io.sentry.protocol.s$a */
    public static final class a implements InterfaceC9504l2<C9560s> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9560s mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9560s c9560s = new C9560s();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "raw_description":
                        c9560s.f36732h = c9518n2.m31090N0();
                        break;
                    case "name":
                        c9560s.f36730f = c9518n2.m31090N0();
                        break;
                    case "version":
                        c9560s.f36731g = c9518n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9560s.m31462g(concurrentHashMap);
            c9518n2.m31889j();
            return c9560s;
        }
    }

    public C9560s() {
    }

    /* renamed from: d */
    public String m31459d() {
        return this.f36730f;
    }

    /* renamed from: e */
    public String m31460e() {
        return this.f36731g;
    }

    /* renamed from: f */
    public void m31461f(String str) {
        this.f36730f = str;
    }

    /* renamed from: g */
    public void m31462g(Map<String, Object> map) {
        this.f36733i = map;
    }

    /* renamed from: h */
    public void m31463h(String str) {
        this.f36731g = str;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36730f != null) {
            interfaceC9448h3.mo30828k("name").mo30819b(this.f36730f);
        }
        if (this.f36731g != null) {
            interfaceC9448h3.mo30828k("version").mo30819b(this.f36731g);
        }
        if (this.f36732h != null) {
            interfaceC9448h3.mo30828k("raw_description").mo30819b(this.f36732h);
        }
        Map<String, Object> map = this.f36733i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36733i.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    C9560s(C9560s c9560s) {
        this.f36730f = c9560s.f36730f;
        this.f36731g = c9560s.f36731g;
        this.f36732h = c9560s.f36732h;
        this.f36733i = C9638i.m31767b(c9560s.f36733i);
    }
}
