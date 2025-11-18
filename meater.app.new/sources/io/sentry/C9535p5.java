package io.sentry;

import io.sentry.util.C9646q;
import java.security.SecureRandom;

/* compiled from: TracesSampler.java */
/* renamed from: io.sentry.p5 */
/* loaded from: classes2.dex */
final class C9535p5 {

    /* renamed from: a */
    private static final Double f36567a = Double.valueOf(1.0d);

    /* renamed from: b */
    private final C9680x4 f36568b;

    /* renamed from: c */
    private final SecureRandom f36569c;

    public C9535p5(C9680x4 c9680x4) {
        this((C9680x4) C9646q.m31802c(c9680x4, "options are required"), new SecureRandom());
    }

    /* renamed from: b */
    private boolean m31175b(Double d2) {
        return d2.doubleValue() >= this.f36569c.nextDouble();
    }

    /* renamed from: a */
    C9574q5 m31176a(C9579r3 c9579r3) {
        Double dM31946a;
        Double dM31951a;
        C9574q5 c9574q5M30799g = c9579r3.m31563a().m30799g();
        if (c9574q5M30799g != null) {
            return c9574q5M30799g;
        }
        if (this.f36568b.getProfilesSampler() != null) {
            try {
                dM31946a = this.f36568b.getProfilesSampler().m31946a(c9579r3);
            } catch (Throwable th) {
                this.f36568b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error in the 'ProfilesSamplerCallback' callback.", th);
            }
        } else {
            dM31946a = null;
        }
        if (dM31946a == null) {
            dM31946a = this.f36568b.getProfilesSampleRate();
        }
        Boolean boolValueOf = Boolean.valueOf(dM31946a != null && m31175b(dM31946a));
        if (this.f36568b.getTracesSampler() != null) {
            try {
                dM31951a = this.f36568b.getTracesSampler().m31951a(c9579r3);
            } catch (Throwable th2) {
                this.f36568b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error in the 'TracesSamplerCallback' callback.", th2);
                dM31951a = null;
            }
            if (dM31951a != null) {
                return new C9574q5(Boolean.valueOf(m31175b(dM31951a)), dM31951a, boolValueOf, dM31946a);
            }
        }
        C9574q5 c9574q5M31569u = c9579r3.m31563a().m31569u();
        if (c9574q5M31569u != null) {
            return c9574q5M31569u;
        }
        Double tracesSampleRate = this.f36568b.getTracesSampleRate();
        Double d2 = Boolean.TRUE.equals(this.f36568b.getEnableTracing()) ? f36567a : null;
        if (tracesSampleRate == null) {
            tracesSampleRate = d2;
        }
        if (tracesSampleRate != null) {
            return new C9574q5(Boolean.valueOf(m31175b(tracesSampleRate)), tracesSampleRate, boolValueOf, dM31946a);
        }
        Boolean bool = Boolean.FALSE;
        return new C9574q5(bool, null, bool, null);
    }

    C9535p5(C9680x4 c9680x4, SecureRandom secureRandom) {
        this.f36568b = c9680x4;
        this.f36569c = secureRandom;
    }
}
