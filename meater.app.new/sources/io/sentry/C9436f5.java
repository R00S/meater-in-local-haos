package io.sentry;

import io.sentry.C9450h5;
import io.sentry.EnumC9493j5;
import io.sentry.protocol.C9558q;
import io.sentry.util.C9638i;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SpanContext.java */
/* renamed from: io.sentry.f5 */
/* loaded from: classes2.dex */
public class C9436f5 implements InterfaceC9578r2 {

    /* renamed from: f */
    private final C9558q f36323f;

    /* renamed from: g */
    private final C9450h5 f36324g;

    /* renamed from: h */
    private final C9450h5 f36325h;

    /* renamed from: i */
    private transient C9574q5 f36326i;

    /* renamed from: j */
    protected String f36327j;

    /* renamed from: k */
    protected String f36328k;

    /* renamed from: l */
    protected EnumC9493j5 f36329l;

    /* renamed from: m */
    protected Map<String, String> f36330m;

    /* renamed from: n */
    protected String f36331n;

    /* renamed from: o */
    private Map<String, Object> f36332o;

    /* compiled from: SpanContext.java */
    /* renamed from: io.sentry.f5$a */
    public static final class a implements InterfaceC9504l2<C9436f5> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9436f5 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            String strM31881J = null;
            C9558q c9558qMo30683a = null;
            C9450h5 c9450h5M30833b = null;
            C9450h5 c9450h5 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String strM31881J2 = null;
            EnumC9493j5 enumC9493j5 = null;
            String strM31881J3 = null;
            Map<String, String> mapM31767b = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "span_id":
                        c9450h5M30833b = new C9450h5.a().mo30683a(c9518n2, interfaceC9670w1);
                        break;
                    case "parent_span_id":
                        c9450h5 = (C9450h5) c9518n2.m31089M0(interfaceC9670w1, new C9450h5.a());
                        break;
                    case "description":
                        strM31881J2 = c9518n2.m31881J();
                        break;
                    case "origin":
                        strM31881J3 = c9518n2.m31881J();
                        break;
                    case "status":
                        enumC9493j5 = (EnumC9493j5) c9518n2.m31089M0(interfaceC9670w1, new EnumC9493j5.a());
                        break;
                    case "op":
                        strM31881J = c9518n2.m31881J();
                        break;
                    case "tags":
                        mapM31767b = C9638i.m31767b((Map) c9518n2.m31088K0());
                        break;
                    case "trace_id":
                        c9558qMo30683a = new C9558q.a().mo30683a(c9518n2, interfaceC9670w1);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            if (c9558qMo30683a == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (c9450h5M30833b == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            C9436f5 c9436f5 = new C9436f5(c9558qMo30683a, c9450h5M30833b, strM31881J == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM31881J, c9450h5, null);
            c9436f5.m30804l(strM31881J2);
            c9436f5.m30807o(enumC9493j5);
            c9436f5.m30805m(strM31881J3);
            if (mapM31767b != null) {
                c9436f5.f36330m = mapM31767b;
            }
            c9436f5.m30808p(concurrentHashMap);
            c9518n2.m31889j();
            return c9436f5;
        }
    }

    public C9436f5(String str) {
        this(new C9558q(), new C9450h5(), str, null, null);
    }

    /* renamed from: a */
    public String m30793a() {
        return this.f36328k;
    }

    /* renamed from: b */
    public String m30794b() {
        return this.f36327j;
    }

    /* renamed from: c */
    public String m30795c() {
        return this.f36331n;
    }

    /* renamed from: d */
    public C9450h5 m30796d() {
        return this.f36325h;
    }

    /* renamed from: e */
    public Boolean m30797e() {
        C9574q5 c9574q5 = this.f36326i;
        if (c9574q5 == null) {
            return null;
        }
        return c9574q5.m31560a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9436f5)) {
            return false;
        }
        C9436f5 c9436f5 = (C9436f5) obj;
        return this.f36323f.equals(c9436f5.f36323f) && this.f36324g.equals(c9436f5.f36324g) && C9646q.m31800a(this.f36325h, c9436f5.f36325h) && this.f36327j.equals(c9436f5.f36327j) && C9646q.m31800a(this.f36328k, c9436f5.f36328k) && this.f36329l == c9436f5.f36329l;
    }

    /* renamed from: f */
    public Boolean m30798f() {
        C9574q5 c9574q5 = this.f36326i;
        if (c9574q5 == null) {
            return null;
        }
        return c9574q5.m31562c();
    }

    /* renamed from: g */
    public C9574q5 m30799g() {
        return this.f36326i;
    }

    /* renamed from: h */
    public C9450h5 m30800h() {
        return this.f36324g;
    }

    public int hashCode() {
        return C9646q.m31801b(this.f36323f, this.f36324g, this.f36325h, this.f36327j, this.f36328k, this.f36329l);
    }

    /* renamed from: i */
    public EnumC9493j5 m30801i() {
        return this.f36329l;
    }

    /* renamed from: j */
    public Map<String, String> m30802j() {
        return this.f36330m;
    }

    /* renamed from: k */
    public C9558q m30803k() {
        return this.f36323f;
    }

    /* renamed from: l */
    public void m30804l(String str) {
        this.f36328k = str;
    }

    /* renamed from: m */
    public void m30805m(String str) {
        this.f36331n = str;
    }

    @ApiStatus.Internal
    /* renamed from: n */
    public void m30806n(C9574q5 c9574q5) {
        this.f36326i = c9574q5;
    }

    /* renamed from: o */
    public void m30807o(EnumC9493j5 enumC9493j5) {
        this.f36329l = enumC9493j5;
    }

    /* renamed from: p */
    public void m30808p(Map<String, Object> map) {
        this.f36332o = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("trace_id");
        this.f36323f.serialize(interfaceC9448h3, interfaceC9670w1);
        interfaceC9448h3.mo30828k("span_id");
        this.f36324g.serialize(interfaceC9448h3, interfaceC9670w1);
        if (this.f36325h != null) {
            interfaceC9448h3.mo30828k("parent_span_id");
            this.f36325h.serialize(interfaceC9448h3, interfaceC9670w1);
        }
        interfaceC9448h3.mo30828k("op").mo30819b(this.f36327j);
        if (this.f36328k != null) {
            interfaceC9448h3.mo30828k("description").mo30819b(this.f36328k);
        }
        if (this.f36329l != null) {
            interfaceC9448h3.mo30828k("status").mo30824g(interfaceC9670w1, this.f36329l);
        }
        if (this.f36331n != null) {
            interfaceC9448h3.mo30828k("origin").mo30824g(interfaceC9670w1, this.f36331n);
        }
        if (!this.f36330m.isEmpty()) {
            interfaceC9448h3.mo30828k("tags").mo30824g(interfaceC9670w1, this.f36330m);
        }
        Map<String, Object> map = this.f36332o;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.f36332o.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public C9436f5(C9558q c9558q, C9450h5 c9450h5, String str, C9450h5 c9450h52, C9574q5 c9574q5) {
        this(c9558q, c9450h5, c9450h52, str, null, c9574q5, null, "manual");
    }

    @ApiStatus.Internal
    public C9436f5(C9558q c9558q, C9450h5 c9450h5, C9450h5 c9450h52, String str, String str2, C9574q5 c9574q5, EnumC9493j5 enumC9493j5, String str3) {
        this.f36330m = new ConcurrentHashMap();
        this.f36331n = "manual";
        this.f36323f = (C9558q) C9646q.m31802c(c9558q, "traceId is required");
        this.f36324g = (C9450h5) C9646q.m31802c(c9450h5, "spanId is required");
        this.f36327j = (String) C9646q.m31802c(str, "operation is required");
        this.f36325h = c9450h52;
        this.f36326i = c9574q5;
        this.f36328k = str2;
        this.f36329l = enumC9493j5;
        this.f36331n = str3;
    }

    public C9436f5(C9436f5 c9436f5) {
        this.f36330m = new ConcurrentHashMap();
        this.f36331n = "manual";
        this.f36323f = c9436f5.f36323f;
        this.f36324g = c9436f5.f36324g;
        this.f36325h = c9436f5.f36325h;
        this.f36326i = c9436f5.f36326i;
        this.f36327j = c9436f5.f36327j;
        this.f36328k = c9436f5.f36328k;
        this.f36329l = c9436f5.f36329l;
        Map<String, String> mapM31767b = C9638i.m31767b(c9436f5.f36330m);
        if (mapM31767b != null) {
            this.f36330m = mapM31767b;
        }
    }
}
