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

/* compiled from: Request.java */
/* renamed from: io.sentry.protocol.l */
/* loaded from: classes2.dex */
public final class C9553l implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36690f;

    /* renamed from: g */
    private String f36691g;

    /* renamed from: h */
    private String f36692h;

    /* renamed from: i */
    private Object f36693i;

    /* renamed from: j */
    private String f36694j;

    /* renamed from: k */
    private Map<String, String> f36695k;

    /* renamed from: l */
    private Map<String, String> f36696l;

    /* renamed from: m */
    private Long f36697m;

    /* renamed from: n */
    private Map<String, String> f36698n;

    /* renamed from: o */
    private String f36699o;

    /* renamed from: p */
    private String f36700p;

    /* renamed from: q */
    private Map<String, Object> f36701q;

    /* compiled from: Request.java */
    /* renamed from: io.sentry.protocol.l$a */
    public static final class a implements InterfaceC9504l2<C9553l> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9553l mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9553l c9553l = new C9553l();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "fragment":
                        c9553l.f36699o = c9518n2.m31090N0();
                        break;
                    case "method":
                        c9553l.f36691g = c9518n2.m31090N0();
                        break;
                    case "env":
                        Map map = (Map) c9518n2.m31088K0();
                        if (map == null) {
                            break;
                        } else {
                            c9553l.f36696l = C9638i.m31767b(map);
                            break;
                        }
                    case "url":
                        c9553l.f36690f = c9518n2.m31090N0();
                        break;
                    case "data":
                        c9553l.f36693i = c9518n2.m31088K0();
                        break;
                    case "other":
                        Map map2 = (Map) c9518n2.m31088K0();
                        if (map2 == null) {
                            break;
                        } else {
                            c9553l.f36698n = C9638i.m31767b(map2);
                            break;
                        }
                    case "headers":
                        Map map3 = (Map) c9518n2.m31088K0();
                        if (map3 == null) {
                            break;
                        } else {
                            c9553l.f36695k = C9638i.m31767b(map3);
                            break;
                        }
                    case "cookies":
                        c9553l.f36694j = c9518n2.m31090N0();
                        break;
                    case "body_size":
                        c9553l.f36697m = c9518n2.m31086G0();
                        break;
                    case "query_string":
                        c9553l.f36692h = c9518n2.m31090N0();
                        break;
                    case "api_target":
                        c9553l.f36700p = c9518n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9553l.m31408m(concurrentHashMap);
            c9518n2.m31889j();
            return c9553l;
        }
    }

    public C9553l() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9553l.class != obj.getClass()) {
            return false;
        }
        C9553l c9553l = (C9553l) obj;
        return C9646q.m31800a(this.f36690f, c9553l.f36690f) && C9646q.m31800a(this.f36691g, c9553l.f36691g) && C9646q.m31800a(this.f36692h, c9553l.f36692h) && C9646q.m31800a(this.f36694j, c9553l.f36694j) && C9646q.m31800a(this.f36695k, c9553l.f36695k) && C9646q.m31800a(this.f36696l, c9553l.f36696l) && C9646q.m31800a(this.f36697m, c9553l.f36697m) && C9646q.m31800a(this.f36699o, c9553l.f36699o) && C9646q.m31800a(this.f36700p, c9553l.f36700p);
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36690f, this.f36691g, this.f36692h, this.f36694j, this.f36695k, this.f36696l, this.f36697m, this.f36699o, this.f36700p);
    }

    /* renamed from: l */
    public Map<String, String> m31407l() {
        return this.f36695k;
    }

    /* renamed from: m */
    public void m31408m(Map<String, Object> map) {
        this.f36701q = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36690f != null) {
            interfaceC9448h3.mo30828k("url").mo30819b(this.f36690f);
        }
        if (this.f36691g != null) {
            interfaceC9448h3.mo30828k("method").mo30819b(this.f36691g);
        }
        if (this.f36692h != null) {
            interfaceC9448h3.mo30828k("query_string").mo30819b(this.f36692h);
        }
        if (this.f36693i != null) {
            interfaceC9448h3.mo30828k("data").mo30824g(interfaceC9670w1, this.f36693i);
        }
        if (this.f36694j != null) {
            interfaceC9448h3.mo30828k("cookies").mo30819b(this.f36694j);
        }
        if (this.f36695k != null) {
            interfaceC9448h3.mo30828k("headers").mo30824g(interfaceC9670w1, this.f36695k);
        }
        if (this.f36696l != null) {
            interfaceC9448h3.mo30828k("env").mo30824g(interfaceC9670w1, this.f36696l);
        }
        if (this.f36698n != null) {
            interfaceC9448h3.mo30828k("other").mo30824g(interfaceC9670w1, this.f36698n);
        }
        if (this.f36699o != null) {
            interfaceC9448h3.mo30828k("fragment").mo30824g(interfaceC9670w1, this.f36699o);
        }
        if (this.f36697m != null) {
            interfaceC9448h3.mo30828k("body_size").mo30824g(interfaceC9670w1, this.f36697m);
        }
        if (this.f36700p != null) {
            interfaceC9448h3.mo30828k("api_target").mo30824g(interfaceC9670w1, this.f36700p);
        }
        Map<String, Object> map = this.f36701q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36701q.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public C9553l(C9553l c9553l) {
        this.f36690f = c9553l.f36690f;
        this.f36694j = c9553l.f36694j;
        this.f36691g = c9553l.f36691g;
        this.f36692h = c9553l.f36692h;
        this.f36695k = C9638i.m31767b(c9553l.f36695k);
        this.f36696l = C9638i.m31767b(c9553l.f36696l);
        this.f36698n = C9638i.m31767b(c9553l.f36698n);
        this.f36701q = C9638i.m31767b(c9553l.f36701q);
        this.f36693i = c9553l.f36693i;
        this.f36699o = c9553l.f36699o;
        this.f36697m = c9553l.f36697m;
        this.f36700p = c9553l.f36700p;
    }
}
