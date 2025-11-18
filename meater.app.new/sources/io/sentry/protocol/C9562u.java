package io.sentry.protocol;

import cm.aptoide.p092pt.downloadmanager.Constants;
import io.sentry.C9518n2;
import io.sentry.C9594t4;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryStackFrame.java */
/* renamed from: io.sentry.protocol.u */
/* loaded from: classes2.dex */
public final class C9562u implements InterfaceC9578r2 {

    /* renamed from: f */
    private String f36746f;

    /* renamed from: g */
    private String f36747g;

    /* renamed from: h */
    private String f36748h;

    /* renamed from: i */
    private Integer f36749i;

    /* renamed from: j */
    private Integer f36750j;

    /* renamed from: k */
    private String f36751k;

    /* renamed from: l */
    private String f36752l;

    /* renamed from: m */
    private Boolean f36753m;

    /* renamed from: n */
    private String f36754n;

    /* renamed from: o */
    private Boolean f36755o;

    /* renamed from: p */
    private String f36756p;

    /* renamed from: q */
    private String f36757q;

    /* renamed from: r */
    private String f36758r;

    /* renamed from: s */
    private String f36759s;

    /* renamed from: t */
    private String f36760t;

    /* renamed from: u */
    private Map<String, Object> f36761u;

    /* renamed from: v */
    private String f36762v;

    /* renamed from: w */
    private C9594t4 f36763w;

    /* compiled from: SentryStackFrame.java */
    /* renamed from: io.sentry.protocol.u$a */
    public static final class a implements InterfaceC9504l2<C9562u> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9562u mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            C9562u c9562u = new C9562u();
            c9518n2.m31884b();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "image_addr":
                        c9562u.f36757q = c9518n2.m31090N0();
                        break;
                    case "in_app":
                        c9562u.f36753m = c9518n2.m31093p0();
                        break;
                    case "raw_function":
                        c9562u.f36762v = c9518n2.m31090N0();
                        break;
                    case "lineno":
                        c9562u.f36749i = c9518n2.m31084E0();
                        break;
                    case "module":
                        c9562u.f36748h = c9518n2.m31090N0();
                        break;
                    case "native":
                        c9562u.f36755o = c9518n2.m31093p0();
                        break;
                    case "symbol":
                        c9562u.f36760t = c9518n2.m31090N0();
                        break;
                    case "package":
                        c9562u.f36754n = c9518n2.m31090N0();
                        break;
                    case "filename":
                        c9562u.f36746f = c9518n2.m31090N0();
                        break;
                    case "symbol_addr":
                        c9562u.f36758r = c9518n2.m31090N0();
                        break;
                    case "lock":
                        c9562u.f36763w = (C9594t4) c9518n2.m31089M0(interfaceC9670w1, new C9594t4.a());
                        break;
                    case "colno":
                        c9562u.f36750j = c9518n2.m31084E0();
                        break;
                    case "instruction_addr":
                        c9562u.f36759s = c9518n2.m31090N0();
                        break;
                    case "context_line":
                        c9562u.f36752l = c9518n2.m31090N0();
                        break;
                    case "function":
                        c9562u.f36747g = c9518n2.m31090N0();
                        break;
                    case "abs_path":
                        c9562u.f36751k = c9518n2.m31090N0();
                        break;
                    case "platform":
                        c9562u.f36756p = c9518n2.m31090N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9562u.m31495z(concurrentHashMap);
            c9518n2.m31889j();
            return c9562u;
        }
    }

    /* renamed from: r */
    public void m31487r(String str) {
        this.f36746f = str;
    }

    /* renamed from: s */
    public void m31488s(String str) {
        this.f36747g = str;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36746f != null) {
            interfaceC9448h3.mo30828k("filename").mo30819b(this.f36746f);
        }
        if (this.f36747g != null) {
            interfaceC9448h3.mo30828k("function").mo30819b(this.f36747g);
        }
        if (this.f36748h != null) {
            interfaceC9448h3.mo30828k("module").mo30819b(this.f36748h);
        }
        if (this.f36749i != null) {
            interfaceC9448h3.mo30828k("lineno").mo30822e(this.f36749i);
        }
        if (this.f36750j != null) {
            interfaceC9448h3.mo30828k("colno").mo30822e(this.f36750j);
        }
        if (this.f36751k != null) {
            interfaceC9448h3.mo30828k("abs_path").mo30819b(this.f36751k);
        }
        if (this.f36752l != null) {
            interfaceC9448h3.mo30828k("context_line").mo30819b(this.f36752l);
        }
        if (this.f36753m != null) {
            interfaceC9448h3.mo30828k("in_app").mo30825h(this.f36753m);
        }
        if (this.f36754n != null) {
            interfaceC9448h3.mo30828k(Constants.PACKAGE).mo30819b(this.f36754n);
        }
        if (this.f36755o != null) {
            interfaceC9448h3.mo30828k("native").mo30825h(this.f36755o);
        }
        if (this.f36756p != null) {
            interfaceC9448h3.mo30828k("platform").mo30819b(this.f36756p);
        }
        if (this.f36757q != null) {
            interfaceC9448h3.mo30828k("image_addr").mo30819b(this.f36757q);
        }
        if (this.f36758r != null) {
            interfaceC9448h3.mo30828k("symbol_addr").mo30819b(this.f36758r);
        }
        if (this.f36759s != null) {
            interfaceC9448h3.mo30828k("instruction_addr").mo30819b(this.f36759s);
        }
        if (this.f36762v != null) {
            interfaceC9448h3.mo30828k("raw_function").mo30819b(this.f36762v);
        }
        if (this.f36760t != null) {
            interfaceC9448h3.mo30828k("symbol").mo30819b(this.f36760t);
        }
        if (this.f36763w != null) {
            interfaceC9448h3.mo30828k("lock").mo30824g(interfaceC9670w1, this.f36763w);
        }
        Map<String, Object> map = this.f36761u;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36761u.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    /* renamed from: t */
    public void m31489t(Boolean bool) {
        this.f36753m = bool;
    }

    /* renamed from: u */
    public void m31490u(Integer num) {
        this.f36749i = num;
    }

    /* renamed from: v */
    public void m31491v(C9594t4 c9594t4) {
        this.f36763w = c9594t4;
    }

    /* renamed from: w */
    public void m31492w(String str) {
        this.f36748h = str;
    }

    /* renamed from: x */
    public void m31493x(Boolean bool) {
        this.f36755o = bool;
    }

    /* renamed from: y */
    public void m31494y(String str) {
        this.f36754n = str;
    }

    /* renamed from: z */
    public void m31495z(Map<String, Object> map) {
        this.f36761u = map;
    }
}
