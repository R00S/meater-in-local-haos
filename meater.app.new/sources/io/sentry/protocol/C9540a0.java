package io.sentry.protocol;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.protocol.C9547f;
import io.sentry.util.C9638i;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: User.java */
/* renamed from: io.sentry.protocol.a0 */
/* loaded from: classes2.dex */
public final class C9540a0 implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36587f;

    /* renamed from: g */
    private String f36588g;

    /* renamed from: h */
    private String f36589h;

    /* renamed from: i */
    private String f36590i;

    /* renamed from: j */
    private String f36591j;

    /* renamed from: k */
    private String f36592k;

    /* renamed from: l */
    private C9547f f36593l;

    /* renamed from: m */
    private Map<String, String> f36594m;

    /* renamed from: n */
    private Map<String, Object> f36595n;

    /* compiled from: User.java */
    /* renamed from: io.sentry.protocol.a0$a */
    public static final class a implements InterfaceC9504l2<C9540a0> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9540a0 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9540a0 c9540a0 = new C9540a0();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "username":
                        c9540a0.f36589h = c9518n2.m31090N0();
                        break;
                    case "id":
                        c9540a0.f36588g = c9518n2.m31090N0();
                        break;
                    case "geo":
                        c9540a0.f36593l = new C9547f.a().mo30683a(c9518n2, interfaceC9670w1);
                        break;
                    case "data":
                        c9540a0.f36594m = C9638i.m31767b((Map) c9518n2.m31088K0());
                        break;
                    case "name":
                        c9540a0.f36592k = c9518n2.m31090N0();
                        break;
                    case "email":
                        c9540a0.f36587f = c9518n2.m31090N0();
                        break;
                    case "other":
                        if (c9540a0.f36594m != null && !c9540a0.f36594m.isEmpty()) {
                            break;
                        } else {
                            c9540a0.f36594m = C9638i.m31767b((Map) c9518n2.m31088K0());
                            break;
                        }
                        break;
                    case "ip_address":
                        c9540a0.f36591j = c9518n2.m31090N0();
                        break;
                    case "segment":
                        c9540a0.f36590i = c9518n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9540a0.m31221p(concurrentHashMap);
            c9518n2.m31889j();
            return c9540a0;
        }
    }

    public C9540a0() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9540a0.class != obj.getClass()) {
            return false;
        }
        C9540a0 c9540a0 = (C9540a0) obj;
        return C9646q.m31800a(this.f36587f, c9540a0.f36587f) && C9646q.m31800a(this.f36588g, c9540a0.f36588g) && C9646q.m31800a(this.f36589h, c9540a0.f36589h) && C9646q.m31800a(this.f36590i, c9540a0.f36590i) && C9646q.m31800a(this.f36591j, c9540a0.f36591j);
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36587f, this.f36588g, this.f36589h, this.f36590i, this.f36591j);
    }

    /* renamed from: j */
    public Map<String, String> m31215j() {
        return this.f36594m;
    }

    /* renamed from: k */
    public String m31216k() {
        return this.f36588g;
    }

    /* renamed from: l */
    public String m31217l() {
        return this.f36591j;
    }

    /* renamed from: m */
    public String m31218m() {
        return this.f36590i;
    }

    /* renamed from: n */
    public void m31219n(String str) {
        this.f36588g = str;
    }

    /* renamed from: o */
    public void m31220o(String str) {
        this.f36591j = str;
    }

    /* renamed from: p */
    public void m31221p(Map<String, Object> map) {
        this.f36595n = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36587f != null) {
            interfaceC9448h3.mo30828k("email").mo30819b(this.f36587f);
        }
        if (this.f36588g != null) {
            interfaceC9448h3.mo30828k(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID).mo30819b(this.f36588g);
        }
        if (this.f36589h != null) {
            interfaceC9448h3.mo30828k("username").mo30819b(this.f36589h);
        }
        if (this.f36590i != null) {
            interfaceC9448h3.mo30828k("segment").mo30819b(this.f36590i);
        }
        if (this.f36591j != null) {
            interfaceC9448h3.mo30828k("ip_address").mo30819b(this.f36591j);
        }
        if (this.f36592k != null) {
            interfaceC9448h3.mo30828k("name").mo30819b(this.f36592k);
        }
        if (this.f36593l != null) {
            interfaceC9448h3.mo30828k("geo");
            this.f36593l.serialize(interfaceC9448h3, interfaceC9670w1);
        }
        if (this.f36594m != null) {
            interfaceC9448h3.mo30828k("data").mo30824g(interfaceC9670w1, this.f36594m);
        }
        Map<String, Object> map = this.f36595n;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36595n.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public C9540a0(C9540a0 c9540a0) {
        this.f36587f = c9540a0.f36587f;
        this.f36589h = c9540a0.f36589h;
        this.f36588g = c9540a0.f36588g;
        this.f36591j = c9540a0.f36591j;
        this.f36590i = c9540a0.f36590i;
        this.f36592k = c9540a0.f36592k;
        this.f36593l = c9540a0.f36593l;
        this.f36594m = C9638i.m31767b(c9540a0.f36594m);
        this.f36595n = C9638i.m31767b(c9540a0.f36595n);
    }
}
