package io.sentry;

import io.sentry.protocol.C9540a0;
import io.sentry.protocol.C9558q;
import io.sentry.protocol.EnumC9567z;
import io.sentry.util.C9649t;
import io.sentry.util.C9654u;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Baggage.java */
@ApiStatus.Experimental
/* renamed from: io.sentry.u0 */
/* loaded from: classes2.dex */
public final class C9624u0 {

    /* renamed from: a */
    static final Integer f36913a = 8192;

    /* renamed from: b */
    static final Integer f36914b = 64;

    /* renamed from: c */
    final Map<String, String> f36915c;

    /* renamed from: d */
    final String f36916d;

    /* renamed from: e */
    private boolean f36917e;

    /* renamed from: f */
    final InterfaceC9670w1 f36918f;

    /* compiled from: Baggage.java */
    @ApiStatus.Internal
    /* renamed from: io.sentry.u0$a */
    public static final class a {

        /* renamed from: a */
        public static final List<String> f36919a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-user_segment", "sentry-transaction", "sentry-sample_rate", "sentry-sampled");
    }

    @ApiStatus.Internal
    public C9624u0(InterfaceC9670w1 interfaceC9670w1) {
        this(new HashMap(), null, true, interfaceC9670w1);
    }

    @ApiStatus.Internal
    /* renamed from: b */
    public static C9624u0 m31728b(C9506l4 c9506l4, C9680x4 c9680x4) {
        C9624u0 c9624u0 = new C9624u0(c9680x4.getLogger());
        C9436f5 c9436f5M31234e = c9506l4.m30575C().m31234e();
        c9624u0.m31734A(c9436f5M31234e != null ? c9436f5M31234e.m30803k().toString() : null);
        c9624u0.m31756w(new C9432f1(c9680x4.getDsn()).m30783a());
        c9624u0.m31757x(c9506l4.m30582J());
        c9624u0.m31755v(c9506l4.m30578F());
        C9540a0 c9540a0M30589Q = c9506l4.m30589Q();
        c9624u0.m31736C(c9540a0M30589Q != null ? m31729j(c9540a0M30589Q) : null);
        c9624u0.m31735B(c9506l4.m31005t0());
        c9624u0.m31758y(null);
        c9624u0.m31759z(null);
        c9624u0.m31740a();
        return c9624u0;
    }

    /* renamed from: j */
    private static String m31729j(C9540a0 c9540a0) {
        if (c9540a0.m31218m() != null) {
            return c9540a0.m31218m();
        }
        Map<String, String> mapM31215j = c9540a0.m31215j();
        if (mapM31215j != null) {
            return mapM31215j.get("segment");
        }
        return null;
    }

    /* renamed from: p */
    private static boolean m31730p(EnumC9567z enumC9567z) {
        return (enumC9567z == null || EnumC9567z.URL.equals(enumC9567z)) ? false : true;
    }

    /* renamed from: r */
    private static Double m31731r(C9574q5 c9574q5) {
        if (c9574q5 == null) {
            return null;
        }
        return c9574q5.m31561b();
    }

    /* renamed from: s */
    private static String m31732s(Double d2) {
        if (C9649t.m31811e(d2, false)) {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d2);
        }
        return null;
    }

    /* renamed from: t */
    private static Boolean m31733t(C9574q5 c9574q5) {
        if (c9574q5 == null) {
            return null;
        }
        return c9574q5.m31562c();
    }

    @ApiStatus.Internal
    /* renamed from: A */
    public void m31734A(String str) {
        m31754u("sentry-trace_id", str);
    }

    @ApiStatus.Internal
    /* renamed from: B */
    public void m31735B(String str) {
        m31754u("sentry-transaction", str);
    }

    @ApiStatus.Internal
    /* renamed from: C */
    public void m31736C(String str) {
        m31754u("sentry-user_segment", str);
    }

    @ApiStatus.Internal
    /* renamed from: D */
    public void m31737D(C9586s3 c9586s3, C9680x4 c9680x4) {
        C9526o3 c9526o3M31603p = c9586s3.m31603p();
        C9540a0 c9540a0M31610w = c9586s3.m31610w();
        m31734A(c9526o3M31603p.m31127e().toString());
        m31756w(new C9432f1(c9680x4.getDsn()).m30783a());
        m31757x(c9680x4.getRelease());
        m31755v(c9680x4.getEnvironment());
        m31736C(c9540a0M31610w != null ? m31729j(c9540a0M31610w) : null);
        m31735B(null);
        m31758y(null);
        m31759z(null);
    }

    @ApiStatus.Internal
    /* renamed from: E */
    public void m31738E(InterfaceC9426e2 interfaceC9426e2, C9540a0 c9540a0, C9680x4 c9680x4, C9574q5 c9574q5) {
        m31734A(interfaceC9426e2.mo30527m().m30803k().toString());
        m31756w(new C9432f1(c9680x4.getDsn()).m30783a());
        m31757x(c9680x4.getRelease());
        m31755v(c9680x4.getEnvironment());
        m31736C(c9540a0 != null ? m31729j(c9540a0) : null);
        m31735B(m31730p(interfaceC9426e2.mo30530p()) ? interfaceC9426e2.getName() : null);
        m31758y(m31732s(m31731r(c9574q5)));
        m31759z(C9654u.m31822f(m31733t(c9574q5)));
    }

    @ApiStatus.Internal
    /* renamed from: F */
    public C9528o5 m31739F() {
        String strM31748k = m31748k();
        String strM31743e = m31743e();
        if (strM31748k == null || strM31743e == null) {
            return null;
        }
        C9528o5 c9528o5 = new C9528o5(new C9558q(strM31748k), strM31743e, m31744f(), m31742d(), m31751n(), m31752o(), m31749l(), m31745g(), m31747i());
        c9528o5.m31132b(m31750m());
        return c9528o5;
    }

    @ApiStatus.Internal
    /* renamed from: a */
    public void m31740a() {
        this.f36917e = false;
    }

    @ApiStatus.Internal
    /* renamed from: c */
    public String m31741c(String str) {
        if (str == null) {
            return null;
        }
        return this.f36915c.get(str);
    }

    @ApiStatus.Internal
    /* renamed from: d */
    public String m31742d() {
        return m31741c("sentry-environment");
    }

    @ApiStatus.Internal
    /* renamed from: e */
    public String m31743e() {
        return m31741c("sentry-public_key");
    }

    @ApiStatus.Internal
    /* renamed from: f */
    public String m31744f() {
        return m31741c("sentry-release");
    }

    @ApiStatus.Internal
    /* renamed from: g */
    public String m31745g() {
        return m31741c("sentry-sample_rate");
    }

    @ApiStatus.Internal
    /* renamed from: h */
    public Double m31746h() throws NumberFormatException {
        String strM31745g = m31745g();
        if (strM31745g != null) {
            try {
                double d2 = Double.parseDouble(strM31745g);
                if (C9649t.m31811e(Double.valueOf(d2), false)) {
                    return Double.valueOf(d2);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @ApiStatus.Internal
    /* renamed from: i */
    public String m31747i() {
        return m31741c("sentry-sampled");
    }

    @ApiStatus.Internal
    /* renamed from: k */
    public String m31748k() {
        return m31741c("sentry-trace_id");
    }

    @ApiStatus.Internal
    /* renamed from: l */
    public String m31749l() {
        return m31741c("sentry-transaction");
    }

    @ApiStatus.Internal
    /* renamed from: m */
    public Map<String, Object> m31750m() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : this.f36915c.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!a.f36919a.contains(key) && value != null) {
                concurrentHashMap.put(key.replaceFirst("sentry-", HttpUrl.FRAGMENT_ENCODE_SET), value);
            }
        }
        return concurrentHashMap;
    }

    @ApiStatus.Internal
    /* renamed from: n */
    public String m31751n() {
        return m31741c("sentry-user_id");
    }

    @ApiStatus.Internal
    /* renamed from: o */
    public String m31752o() {
        return m31741c("sentry-user_segment");
    }

    @ApiStatus.Internal
    /* renamed from: q */
    public boolean m31753q() {
        return this.f36917e;
    }

    @ApiStatus.Internal
    /* renamed from: u */
    public void m31754u(String str, String str2) {
        if (this.f36917e) {
            this.f36915c.put(str, str2);
        }
    }

    @ApiStatus.Internal
    /* renamed from: v */
    public void m31755v(String str) {
        m31754u("sentry-environment", str);
    }

    @ApiStatus.Internal
    /* renamed from: w */
    public void m31756w(String str) {
        m31754u("sentry-public_key", str);
    }

    @ApiStatus.Internal
    /* renamed from: x */
    public void m31757x(String str) {
        m31754u("sentry-release", str);
    }

    @ApiStatus.Internal
    /* renamed from: y */
    public void m31758y(String str) {
        m31754u("sentry-sample_rate", str);
    }

    @ApiStatus.Internal
    /* renamed from: z */
    public void m31759z(String str) {
        m31754u("sentry-sampled", str);
    }

    @ApiStatus.Internal
    public C9624u0(C9624u0 c9624u0) {
        this(c9624u0.f36915c, c9624u0.f36916d, c9624u0.f36917e, c9624u0.f36918f);
    }

    @ApiStatus.Internal
    public C9624u0(Map<String, String> map, String str, boolean z, InterfaceC9670w1 interfaceC9670w1) {
        this.f36915c = map;
        this.f36918f = interfaceC9670w1;
        this.f36917e = z;
        this.f36916d = str;
    }
}
