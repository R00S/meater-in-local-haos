package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.protocol.C9550i;
import io.sentry.protocol.C9563v;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SentryException.java */
/* renamed from: io.sentry.protocol.p */
/* loaded from: classes2.dex */
public final class C9557p implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36718f;

    /* renamed from: g */
    private String f36719g;

    /* renamed from: h */
    private String f36720h;

    /* renamed from: i */
    private Long f36721i;

    /* renamed from: j */
    private C9563v f36722j;

    /* renamed from: k */
    private C9550i f36723k;

    /* renamed from: l */
    private Map<String, Object> f36724l;

    /* compiled from: SentryException.java */
    /* renamed from: io.sentry.protocol.p$a */
    public static final class a implements InterfaceC9504l2<C9557p> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9557p mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            C9557p c9557p = new C9557p();
            c9518n2.m31884b();
            HashMap map = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "thread_id":
                        c9557p.f36721i = c9518n2.m31086G0();
                        break;
                    case "module":
                        c9557p.f36720h = c9518n2.m31090N0();
                        break;
                    case "type":
                        c9557p.f36718f = c9518n2.m31090N0();
                        break;
                    case "value":
                        c9557p.f36719g = c9518n2.m31090N0();
                        break;
                    case "mechanism":
                        c9557p.f36723k = (C9550i) c9518n2.m31089M0(interfaceC9670w1, new C9550i.a());
                        break;
                    case "stacktrace":
                        c9557p.f36722j = (C9563v) c9518n2.m31089M0(interfaceC9670w1, new C9563v.a());
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, map, strM31879B);
                        break;
                }
            }
            c9518n2.m31889j();
            c9557p.m31449o(map);
            return c9557p;
        }
    }

    /* renamed from: g */
    public C9550i m31441g() {
        return this.f36723k;
    }

    /* renamed from: h */
    public Long m31442h() {
        return this.f36721i;
    }

    /* renamed from: i */
    public String m31443i() {
        return this.f36718f;
    }

    /* renamed from: j */
    public void m31444j(C9550i c9550i) {
        this.f36723k = c9550i;
    }

    /* renamed from: k */
    public void m31445k(String str) {
        this.f36720h = str;
    }

    /* renamed from: l */
    public void m31446l(C9563v c9563v) {
        this.f36722j = c9563v;
    }

    /* renamed from: m */
    public void m31447m(Long l) {
        this.f36721i = l;
    }

    /* renamed from: n */
    public void m31448n(String str) {
        this.f36718f = str;
    }

    /* renamed from: o */
    public void m31449o(Map<String, Object> map) {
        this.f36724l = map;
    }

    /* renamed from: p */
    public void m31450p(String str) {
        this.f36719g = str;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36718f != null) {
            interfaceC9448h3.mo30828k("type").mo30819b(this.f36718f);
        }
        if (this.f36719g != null) {
            interfaceC9448h3.mo30828k("value").mo30819b(this.f36719g);
        }
        if (this.f36720h != null) {
            interfaceC9448h3.mo30828k("module").mo30819b(this.f36720h);
        }
        if (this.f36721i != null) {
            interfaceC9448h3.mo30828k("thread_id").mo30822e(this.f36721i);
        }
        if (this.f36722j != null) {
            interfaceC9448h3.mo30828k("stacktrace").mo30824g(interfaceC9670w1, this.f36722j);
        }
        if (this.f36723k != null) {
            interfaceC9448h3.mo30828k("mechanism").mo30824g(interfaceC9670w1, this.f36723k);
        }
        Map<String, Object> map = this.f36724l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.f36724l.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }
}
