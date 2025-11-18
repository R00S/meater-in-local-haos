package io.sentry.protocol;

import io.sentry.C9244a1;
import io.sentry.C9429e5;
import io.sentry.C9450h5;
import io.sentry.C9518n2;
import io.sentry.EnumC9493j5;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.protocol.C9558q;
import io.sentry.util.C9638i;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentrySpan.java */
@ApiStatus.Internal
/* renamed from: io.sentry.protocol.t */
/* loaded from: classes2.dex */
public final class C9561t implements InterfaceC9578r2 {

    /* renamed from: f */
    private final Double f36734f;

    /* renamed from: g */
    private final Double f36735g;

    /* renamed from: h */
    private final C9558q f36736h;

    /* renamed from: i */
    private final C9450h5 f36737i;

    /* renamed from: j */
    private final C9450h5 f36738j;

    /* renamed from: k */
    private final String f36739k;

    /* renamed from: l */
    private final String f36740l;

    /* renamed from: m */
    private final EnumC9493j5 f36741m;

    /* renamed from: n */
    private final String f36742n;

    /* renamed from: o */
    private final Map<String, String> f36743o;

    /* renamed from: p */
    private final Map<String, Object> f36744p;

    /* renamed from: q */
    private Map<String, Object> f36745q;

    /* compiled from: SentrySpan.java */
    /* renamed from: io.sentry.protocol.t$a */
    public static final class a implements InterfaceC9504l2<C9561t> {
        /* renamed from: c */
        private Exception m31468c(String str, InterfaceC9670w1 interfaceC9670w1) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9561t mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            Map map = null;
            Double dValueOf = null;
            Double dValueOf2 = null;
            C9558q c9558qMo30683a = null;
            C9450h5 c9450h5Mo30683a = null;
            C9450h5 c9450h5 = null;
            String strM31090N0 = null;
            String strM31090N02 = null;
            EnumC9493j5 enumC9493j5 = null;
            String strM31090N03 = null;
            ConcurrentHashMap concurrentHashMap = null;
            Map map2 = null;
            while (true) {
                Map map3 = map2;
                String str = strM31090N03;
                EnumC9493j5 enumC9493j52 = enumC9493j5;
                String str2 = strM31090N02;
                if (c9518n2.m31882N() != EnumC9666b.NAME) {
                    if (dValueOf == null) {
                        throw m31468c("start_timestamp", interfaceC9670w1);
                    }
                    if (c9558qMo30683a == null) {
                        throw m31468c("trace_id", interfaceC9670w1);
                    }
                    if (c9450h5Mo30683a == null) {
                        throw m31468c("span_id", interfaceC9670w1);
                    }
                    if (strM31090N0 == null) {
                        throw m31468c("op", interfaceC9670w1);
                    }
                    C9561t c9561t = new C9561t(dValueOf, dValueOf2, c9558qMo30683a, c9450h5Mo30683a, c9450h5, strM31090N0, str2, enumC9493j52, str, map == null ? new HashMap() : map, map3);
                    c9561t.m31467c(concurrentHashMap);
                    c9518n2.m31889j();
                    return c9561t;
                }
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "span_id":
                        c9450h5Mo30683a = new C9450h5.a().mo30683a(c9518n2, interfaceC9670w1);
                        map2 = map3;
                        strM31090N03 = str;
                        enumC9493j5 = enumC9493j52;
                        strM31090N02 = str2;
                        break;
                    case "parent_span_id":
                        c9450h5 = (C9450h5) c9518n2.m31089M0(interfaceC9670w1, new C9450h5.a());
                        map2 = map3;
                        strM31090N03 = str;
                        enumC9493j5 = enumC9493j52;
                        strM31090N02 = str2;
                        break;
                    case "description":
                        strM31090N02 = c9518n2.m31090N0();
                        map2 = map3;
                        strM31090N03 = str;
                        enumC9493j5 = enumC9493j52;
                        break;
                    case "start_timestamp":
                        try {
                            dValueOf = c9518n2.m31095t0();
                        } catch (NumberFormatException unused) {
                            Date dateM31094q0 = c9518n2.m31094q0(interfaceC9670w1);
                            dValueOf = dateM31094q0 != null ? Double.valueOf(C9244a1.m30007b(dateM31094q0)) : null;
                        }
                        map2 = map3;
                        strM31090N03 = str;
                        enumC9493j5 = enumC9493j52;
                        strM31090N02 = str2;
                        break;
                    case "origin":
                        strM31090N03 = c9518n2.m31090N0();
                        map2 = map3;
                        enumC9493j5 = enumC9493j52;
                        strM31090N02 = str2;
                        break;
                    case "status":
                        enumC9493j5 = (EnumC9493j5) c9518n2.m31089M0(interfaceC9670w1, new EnumC9493j5.a());
                        map2 = map3;
                        strM31090N03 = str;
                        strM31090N02 = str2;
                        break;
                    case "op":
                        strM31090N0 = c9518n2.m31090N0();
                        map2 = map3;
                        strM31090N03 = str;
                        enumC9493j5 = enumC9493j52;
                        strM31090N02 = str2;
                        break;
                    case "data":
                        map2 = (Map) c9518n2.m31088K0();
                        strM31090N03 = str;
                        enumC9493j5 = enumC9493j52;
                        strM31090N02 = str2;
                        break;
                    case "tags":
                        map = (Map) c9518n2.m31088K0();
                        map2 = map3;
                        strM31090N03 = str;
                        enumC9493j5 = enumC9493j52;
                        strM31090N02 = str2;
                        break;
                    case "timestamp":
                        try {
                            dValueOf2 = c9518n2.m31095t0();
                        } catch (NumberFormatException unused2) {
                            Date dateM31094q02 = c9518n2.m31094q0(interfaceC9670w1);
                            dValueOf2 = dateM31094q02 != null ? Double.valueOf(C9244a1.m30007b(dateM31094q02)) : null;
                        }
                        map2 = map3;
                        strM31090N03 = str;
                        enumC9493j5 = enumC9493j52;
                        strM31090N02 = str2;
                        break;
                    case "trace_id":
                        c9558qMo30683a = new C9558q.a().mo30683a(c9518n2, interfaceC9670w1);
                        map2 = map3;
                        strM31090N03 = str;
                        enumC9493j5 = enumC9493j52;
                        strM31090N02 = str2;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        map2 = map3;
                        strM31090N03 = str;
                        enumC9493j5 = enumC9493j52;
                        strM31090N02 = str2;
                        break;
                }
            }
        }
    }

    public C9561t(C9429e5 c9429e5) {
        this(c9429e5, c9429e5.m30771r());
    }

    /* renamed from: a */
    private BigDecimal m31465a(Double d2) {
        return BigDecimal.valueOf(d2.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    /* renamed from: b */
    public String m31466b() {
        return this.f36739k;
    }

    /* renamed from: c */
    public void m31467c(Map<String, Object> map) {
        this.f36745q = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("start_timestamp").mo30824g(interfaceC9670w1, m31465a(this.f36734f));
        if (this.f36735g != null) {
            interfaceC9448h3.mo30828k("timestamp").mo30824g(interfaceC9670w1, m31465a(this.f36735g));
        }
        interfaceC9448h3.mo30828k("trace_id").mo30824g(interfaceC9670w1, this.f36736h);
        interfaceC9448h3.mo30828k("span_id").mo30824g(interfaceC9670w1, this.f36737i);
        if (this.f36738j != null) {
            interfaceC9448h3.mo30828k("parent_span_id").mo30824g(interfaceC9670w1, this.f36738j);
        }
        interfaceC9448h3.mo30828k("op").mo30819b(this.f36739k);
        if (this.f36740l != null) {
            interfaceC9448h3.mo30828k("description").mo30819b(this.f36740l);
        }
        if (this.f36741m != null) {
            interfaceC9448h3.mo30828k("status").mo30824g(interfaceC9670w1, this.f36741m);
        }
        if (this.f36742n != null) {
            interfaceC9448h3.mo30828k("origin").mo30824g(interfaceC9670w1, this.f36742n);
        }
        if (!this.f36743o.isEmpty()) {
            interfaceC9448h3.mo30828k("tags").mo30824g(interfaceC9670w1, this.f36743o);
        }
        if (this.f36744p != null) {
            interfaceC9448h3.mo30828k("data").mo30824g(interfaceC9670w1, this.f36744p);
        }
        Map<String, Object> map = this.f36745q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36745q.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    @ApiStatus.Internal
    public C9561t(C9429e5 c9429e5, Map<String, Object> map) {
        C9646q.m31802c(c9429e5, "span is required");
        this.f36740l = c9429e5.getDescription();
        this.f36739k = c9429e5.m30772t();
        this.f36737i = c9429e5.m30776x();
        this.f36738j = c9429e5.m30774v();
        this.f36736h = c9429e5.m30778z();
        this.f36741m = c9429e5.getStatus();
        this.f36742n = c9429e5.mo30527m().m30795c();
        Map<String, String> mapM31767b = C9638i.m31767b(c9429e5.m30777y());
        this.f36743o = mapM31767b == null ? new ConcurrentHashMap<>() : mapM31767b;
        this.f36735g = Double.valueOf(C9244a1.m30017l(c9429e5.mo30531q().mo30791v(c9429e5.mo30528n())));
        this.f36734f = Double.valueOf(C9244a1.m30017l(c9429e5.mo30531q().mo30792x()));
        this.f36744p = map;
    }

    @ApiStatus.Internal
    public C9561t(Double d2, Double d3, C9558q c9558q, C9450h5 c9450h5, C9450h5 c9450h52, String str, String str2, EnumC9493j5 enumC9493j5, String str3, Map<String, String> map, Map<String, Object> map2) {
        this.f36734f = d2;
        this.f36735g = d3;
        this.f36736h = c9558q;
        this.f36737i = c9450h5;
        this.f36738j = c9450h52;
        this.f36739k = str;
        this.f36740l = str2;
        this.f36741m = enumC9493j5;
        this.f36743o = map;
        this.f36744p = map2;
        this.f36742n = str3;
    }
}
