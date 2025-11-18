package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.AbstractC9375c4;
import io.sentry.C9244a1;
import io.sentry.C9506l4;
import io.sentry.C9517n1;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9496k1;
import io.sentry.android.core.C9346t0;
import io.sentry.android.core.internal.util.C9311h;
import io.sentry.protocol.C9539a;
import io.sentry.protocol.C9540a0;
import io.sentry.protocol.C9552k;
import io.sentry.protocol.C9564w;
import io.sentry.protocol.C9565x;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: DefaultAndroidEventProcessor.java */
/* renamed from: io.sentry.android.core.v0 */
/* loaded from: classes2.dex */
final class C9350v0 implements InterfaceC9496k1 {

    /* renamed from: f */
    final Context f36110f;

    /* renamed from: g */
    private final C9344s0 f36111g;

    /* renamed from: h */
    private final SentryAndroidOptions f36112h;

    /* renamed from: i */
    private final Future<C9352w0> f36113i;

    public C9350v0(final Context context, C9344s0 c9344s0, final SentryAndroidOptions sentryAndroidOptions) {
        this.f36110f = (Context) C9646q.m31802c(context, "The application context is required.");
        this.f36111g = (C9344s0) C9646q.m31802c(c9344s0, "The BuildInfoProvider is required.");
        this.f36112h = (SentryAndroidOptions) C9646q.m31802c(sentryAndroidOptions, "The options object is required.");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f36113i = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9352w0.m30460p(context, sentryAndroidOptions);
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    /* renamed from: d */
    private void m30432d(AbstractC9375c4 abstractC9375c4) {
        String str;
        C9552k c9552kM31232c = abstractC9375c4.m30575C().m31232c();
        try {
            abstractC9375c4.m30575C().m31239k(this.f36113i.get().m30471r());
        } catch (Throwable th) {
            this.f36112h.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to retrieve os system", th);
        }
        if (c9552kM31232c != null) {
            String strM31388g = c9552kM31232c.m31388g();
            if (strM31388g == null || strM31388g.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strM31388g.trim().toLowerCase(Locale.ROOT);
            }
            abstractC9375c4.m30575C().put(str, c9552kM31232c);
        }
    }

    /* renamed from: f */
    private void m30433f(AbstractC9375c4 abstractC9375c4) {
        C9540a0 c9540a0M30589Q = abstractC9375c4.m30589Q();
        if (c9540a0M30589Q == null) {
            abstractC9375c4.m30603e0(m30443a(this.f36110f));
        } else if (c9540a0M30589Q.m31216k() == null) {
            c9540a0M30589Q.m31219n(C9262a1.m30148a(this.f36110f));
        }
    }

    /* renamed from: g */
    private void m30434g(AbstractC9375c4 abstractC9375c4, C9517n1 c9517n1) {
        C9539a c9539aM31230a = abstractC9375c4.m30575C().m31230a();
        if (c9539aM31230a == null) {
            c9539aM31230a = new C9539a();
        }
        m30435h(c9539aM31230a, c9517n1);
        m30439l(abstractC9375c4, c9539aM31230a);
        abstractC9375c4.m30575C().m31235f(c9539aM31230a);
    }

    /* renamed from: h */
    private void m30435h(C9539a c9539a, C9517n1 c9517n1) {
        Boolean boolM30400b;
        c9539a.m31198m(C9346t0.m30410b(this.f36110f, this.f36112h.getLogger()));
        c9539a.m31199n(C9244a1.m30019n(C9340q0.m30389e().m30393d()));
        if (C9642m.m31782e(c9517n1) || c9539a.m31195j() != null || (boolM30400b = C9342r0.m30399a().m30400b()) == null) {
            return;
        }
        c9539a.m31201p(Boolean.valueOf(!boolM30400b.booleanValue()));
    }

    /* renamed from: i */
    private void m30436i(AbstractC9375c4 abstractC9375c4, boolean z, boolean z2) {
        m30433f(abstractC9375c4);
        m30437j(abstractC9375c4, z, z2);
        m30440m(abstractC9375c4);
    }

    /* renamed from: j */
    private void m30437j(AbstractC9375c4 abstractC9375c4, boolean z, boolean z2) {
        if (abstractC9375c4.m30575C().m31231b() == null) {
            try {
                abstractC9375c4.m30575C().m31237i(this.f36113i.get().m30470a(z, z2));
            } catch (Throwable th) {
                this.f36112h.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to retrieve device info", th);
            }
            m30432d(abstractC9375c4);
        }
    }

    /* renamed from: k */
    private void m30438k(AbstractC9375c4 abstractC9375c4, String str) {
        if (abstractC9375c4.m30577E() == null) {
            abstractC9375c4.m30592T(str);
        }
    }

    /* renamed from: l */
    private void m30439l(AbstractC9375c4 abstractC9375c4, C9539a c9539a) {
        PackageInfo packageInfoM30417i = C9346t0.m30417i(this.f36110f, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT, this.f36112h.getLogger(), this.f36111g);
        if (packageInfoM30417i != null) {
            m30438k(abstractC9375c4, C9346t0.m30419k(packageInfoM30417i, this.f36111g));
            C9346t0.m30425q(packageInfoM30417i, this.f36111g, c9539a);
        }
    }

    /* renamed from: m */
    private void m30440m(AbstractC9375c4 abstractC9375c4) {
        try {
            C9346t0.a aVarM30472t = this.f36113i.get().m30472t();
            if (aVarM30472t != null) {
                for (Map.Entry<String, String> entry : aVarM30472t.m30426a().entrySet()) {
                    abstractC9375c4.m30601c0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.f36112h.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting side loaded info.", th);
        }
    }

    /* renamed from: n */
    private void m30441n(C9506l4 c9506l4, C9517n1 c9517n1) {
        if (c9506l4.m31004s0() != null) {
            boolean zM31782e = C9642m.m31782e(c9517n1);
            for (C9564w c9564w : c9506l4.m31004s0()) {
                boolean zMo30275b = C9311h.m30273e().mo30275b(c9564w);
                if (c9564w.m31519o() == null) {
                    c9564w.m31522r(Boolean.valueOf(zMo30275b));
                }
                if (!zM31782e && c9564w.m31520p() == null) {
                    c9564w.m31526v(Boolean.valueOf(zMo30275b));
                }
            }
        }
    }

    /* renamed from: o */
    private boolean m30442o(AbstractC9375c4 abstractC9375c4, C9517n1 c9517n1) {
        if (C9642m.m31794q(c9517n1)) {
            return true;
        }
        this.f36112h.getLogger().mo30214c(EnumC9587s4.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC9375c4.m30579G());
        return false;
    }

    /* renamed from: a */
    public C9540a0 m30443a(Context context) {
        C9540a0 c9540a0 = new C9540a0();
        c9540a0.m31219n(C9262a1.m30148a(context));
        return c9540a0;
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: b */
    public C9506l4 mo30135b(C9506l4 c9506l4, C9517n1 c9517n1) {
        boolean zM30442o = m30442o(c9506l4, c9517n1);
        if (zM30442o) {
            m30434g(c9506l4, c9517n1);
            m30441n(c9506l4, c9517n1);
        }
        m30436i(c9506l4, true, zM30442o);
        return c9506l4;
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: e */
    public C9565x mo30136e(C9565x c9565x, C9517n1 c9517n1) {
        boolean zM30442o = m30442o(c9565x, c9517n1);
        if (zM30442o) {
            m30434g(c9565x, c9517n1);
        }
        m30436i(c9565x, false, zM30442o);
        return c9565x;
    }
}
