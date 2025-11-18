package io.sentry.android.core;

import io.sentry.C9436f5;
import io.sentry.C9506l4;
import io.sentry.C9517n1;
import io.sentry.InterfaceC9496k1;
import io.sentry.InterfaceC9659v2;
import io.sentry.protocol.C9549h;
import io.sentry.protocol.C9558q;
import io.sentry.protocol.C9561t;
import io.sentry.protocol.C9565x;
import io.sentry.util.C9646q;
import java.util.List;
import java.util.Map;

/* compiled from: PerformanceAndroidEventProcessor.java */
/* renamed from: io.sentry.android.core.f1 */
/* loaded from: classes2.dex */
final class C9279f1 implements InterfaceC9496k1 {

    /* renamed from: f */
    private boolean f35902f = false;

    /* renamed from: g */
    private final C9278f0 f35903g;

    /* renamed from: h */
    private final SentryAndroidOptions f35904h;

    C9279f1(SentryAndroidOptions sentryAndroidOptions, C9278f0 c9278f0) {
        this.f35904h = (SentryAndroidOptions) C9646q.m31802c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f35903g = (C9278f0) C9646q.m31802c(c9278f0, "ActivityFramesTracker is required");
    }

    /* renamed from: a */
    private boolean m30200a(List<C9561t> list) {
        for (C9561t c9561t : list) {
            if (c9561t.m31466b().contentEquals("app.start.cold") || c9561t.m31466b().contentEquals("app.start.warm")) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: b */
    public C9506l4 mo30135b(C9506l4 c9506l4, C9517n1 c9517n1) {
        return c9506l4;
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: e */
    public synchronized C9565x mo30136e(C9565x c9565x, C9517n1 c9517n1) {
        Map<String, C9549h> mapM30196q;
        Long lM30391b;
        if (!this.f35904h.isTracingEnabled()) {
            return c9565x;
        }
        if (!this.f35902f && m30200a(c9565x.m31541o0()) && (lM30391b = C9340q0.m30389e().m30391b()) != null) {
            c9565x.m31539m0().put(C9340q0.m30389e().m30394f().booleanValue() ? "app_start_cold" : "app_start_warm", new C9549h(Float.valueOf(lM30391b.longValue()), InterfaceC9659v2.a.MILLISECOND.apiName()));
            this.f35902f = true;
        }
        C9558q c9558qM30579G = c9565x.m30579G();
        C9436f5 c9436f5M31234e = c9565x.m30575C().m31234e();
        if (c9558qM30579G != null && c9436f5M31234e != null && c9436f5M31234e.m30794b().contentEquals("ui.load") && (mapM30196q = this.f35903g.m30196q(c9558qM30579G)) != null) {
            c9565x.m31539m0().putAll(mapM30196q);
        }
        return c9565x;
    }
}
