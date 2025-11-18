package io.sentry.protocol;

import io.sentry.AbstractC9375c4;
import io.sentry.C9244a1;
import io.sentry.C9369b5;
import io.sentry.C9429e5;
import io.sentry.C9436f5;
import io.sentry.C9518n2;
import io.sentry.C9574q5;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.protocol.C9549h;
import io.sentry.protocol.C9561t;
import io.sentry.protocol.C9566y;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryTransaction.java */
@ApiStatus.Internal
/* renamed from: io.sentry.protocol.x */
/* loaded from: classes2.dex */
public final class C9565x extends AbstractC9375c4 implements InterfaceC9578r2 {

    /* renamed from: A */
    private C9566y f36779A;

    /* renamed from: B */
    private Map<String, Object> f36780B;

    /* renamed from: u */
    private String f36781u;

    /* renamed from: v */
    private Double f36782v;

    /* renamed from: w */
    private Double f36783w;

    /* renamed from: x */
    private final List<C9561t> f36784x;

    /* renamed from: y */
    private final String f36785y;

    /* renamed from: z */
    private final Map<String, C9549h> f36786z;

    /* compiled from: SentryTransaction.java */
    /* renamed from: io.sentry.protocol.x$a */
    public static final class a implements InterfaceC9504l2<C9565x> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9565x mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            C9565x c9565x = new C9565x(HttpUrl.FRAGMENT_ENCODE_SET, Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), new C9566y(EnumC9567z.CUSTOM.apiName()));
            AbstractC9375c4.a aVar = new AbstractC9375c4.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "start_timestamp":
                        try {
                            Double dM31095t0 = c9518n2.m31095t0();
                            if (dM31095t0 == null) {
                                break;
                            } else {
                                c9565x.f36782v = dM31095t0;
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            Date dateM31094q0 = c9518n2.m31094q0(interfaceC9670w1);
                            if (dateM31094q0 == null) {
                                break;
                            } else {
                                c9565x.f36782v = Double.valueOf(C9244a1.m30007b(dateM31094q0));
                                break;
                            }
                        }
                    case "measurements":
                        Map mapM31087J0 = c9518n2.m31087J0(interfaceC9670w1, new C9549h.a());
                        if (mapM31087J0 == null) {
                            break;
                        } else {
                            c9565x.f36786z.putAll(mapM31087J0);
                            break;
                        }
                    case "type":
                        c9518n2.m31881J();
                        break;
                    case "timestamp":
                        try {
                            Double dM31095t02 = c9518n2.m31095t0();
                            if (dM31095t02 == null) {
                                break;
                            } else {
                                c9565x.f36783w = dM31095t02;
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            Date dateM31094q02 = c9518n2.m31094q0(interfaceC9670w1);
                            if (dateM31094q02 == null) {
                                break;
                            } else {
                                c9565x.f36783w = Double.valueOf(C9244a1.m30007b(dateM31094q02));
                                break;
                            }
                        }
                    case "spans":
                        List listM31085F0 = c9518n2.m31085F0(interfaceC9670w1, new C9561t.a());
                        if (listM31085F0 == null) {
                            break;
                        } else {
                            c9565x.f36784x.addAll(listM31085F0);
                            break;
                        }
                    case "transaction_info":
                        c9565x.f36779A = new C9566y.a().mo30683a(c9518n2, interfaceC9670w1);
                        break;
                    case "transaction":
                        c9565x.f36781u = c9518n2.m31090N0();
                        break;
                    default:
                        if (!aVar.m30604a(c9565x, strM31879B, c9518n2, interfaceC9670w1)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                            break;
                        } else {
                            break;
                        }
                }
            }
            c9565x.m31544r0(concurrentHashMap);
            c9518n2.m31889j();
            return c9565x;
        }
    }

    public C9565x(C9369b5 c9369b5) {
        super(c9369b5.mo30525k());
        this.f36784x = new ArrayList();
        this.f36785y = "transaction";
        this.f36786z = new HashMap();
        C9646q.m31802c(c9369b5, "sentryTracer is required");
        this.f36782v = Double.valueOf(C9244a1.m30017l(c9369b5.mo30531q().mo30792x()));
        this.f36783w = Double.valueOf(C9244a1.m30017l(c9369b5.mo30531q().mo30791v(c9369b5.mo30528n())));
        this.f36781u = c9369b5.getName();
        for (C9429e5 c9429e5 : c9369b5.m30533x()) {
            if (Boolean.TRUE.equals(c9429e5.m30767B())) {
                this.f36784x.add(new C9561t(c9429e5));
            }
        }
        C9543c c9543cM30575C = m30575C();
        c9543cM30575C.putAll(c9369b5.m30534y());
        C9436f5 c9436f5Mo30527m = c9369b5.mo30527m();
        c9543cM30575C.m31242n(new C9436f5(c9436f5Mo30527m.m30803k(), c9436f5Mo30527m.m30800h(), c9436f5Mo30527m.m30796d(), c9436f5Mo30527m.m30794b(), c9436f5Mo30527m.m30793a(), c9436f5Mo30527m.m30799g(), c9436f5Mo30527m.m30801i(), c9436f5Mo30527m.m30795c()));
        for (Map.Entry<String, String> entry : c9436f5Mo30527m.m30802j().entrySet()) {
            m30601c0(entry.getKey(), entry.getValue());
        }
        Map<String, Object> mapM30535z = c9369b5.m30535z();
        if (mapM30535z != null) {
            for (Map.Entry<String, Object> entry2 : mapM30535z.entrySet()) {
                m30594V(entry2.getKey(), entry2.getValue());
            }
        }
        this.f36779A = new C9566y(c9369b5.mo30530p().apiName());
    }

    /* renamed from: l0 */
    private BigDecimal m31538l0(Double d2) {
        return BigDecimal.valueOf(d2.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    /* renamed from: m0 */
    public Map<String, C9549h> m31539m0() {
        return this.f36786z;
    }

    /* renamed from: n0 */
    public C9574q5 m31540n0() {
        C9436f5 c9436f5M31234e = m30575C().m31234e();
        if (c9436f5M31234e == null) {
            return null;
        }
        return c9436f5M31234e.m30799g();
    }

    /* renamed from: o0 */
    public List<C9561t> m31541o0() {
        return this.f36784x;
    }

    /* renamed from: p0 */
    public boolean m31542p0() {
        return this.f36783w != null;
    }

    /* renamed from: q0 */
    public boolean m31543q0() {
        C9574q5 c9574q5M31540n0 = m31540n0();
        if (c9574q5M31540n0 == null) {
            return false;
        }
        return c9574q5M31540n0.m31562c().booleanValue();
    }

    /* renamed from: r0 */
    public void m31544r0(Map<String, Object> map) {
        this.f36780B = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36781u != null) {
            interfaceC9448h3.mo30828k("transaction").mo30819b(this.f36781u);
        }
        interfaceC9448h3.mo30828k("start_timestamp").mo30824g(interfaceC9670w1, m31538l0(this.f36782v));
        if (this.f36783w != null) {
            interfaceC9448h3.mo30828k("timestamp").mo30824g(interfaceC9670w1, m31538l0(this.f36783w));
        }
        if (!this.f36784x.isEmpty()) {
            interfaceC9448h3.mo30828k("spans").mo30824g(interfaceC9670w1, this.f36784x);
        }
        interfaceC9448h3.mo30828k("type").mo30819b("transaction");
        if (!this.f36786z.isEmpty()) {
            interfaceC9448h3.mo30828k("measurements").mo30824g(interfaceC9670w1, this.f36786z);
        }
        interfaceC9448h3.mo30828k("transaction_info").mo30824g(interfaceC9670w1, this.f36779A);
        new AbstractC9375c4.b().m30605a(this, interfaceC9448h3, interfaceC9670w1);
        Map<String, Object> map = this.f36780B;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36780B.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    @ApiStatus.Internal
    public C9565x(String str, Double d2, Double d3, List<C9561t> list, Map<String, C9549h> map, C9566y c9566y) {
        ArrayList arrayList = new ArrayList();
        this.f36784x = arrayList;
        this.f36785y = "transaction";
        HashMap map2 = new HashMap();
        this.f36786z = map2;
        this.f36781u = str;
        this.f36782v = d2;
        this.f36783w = d3;
        arrayList.addAll(list);
        map2.putAll(map);
        this.f36779A = c9566y;
    }
}
