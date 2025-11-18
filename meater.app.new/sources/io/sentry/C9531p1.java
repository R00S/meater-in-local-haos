package io.sentry;

import io.sentry.C9500k5;
import io.sentry.C9586s3;
import io.sentry.clientreport.EnumC9401e;
import io.sentry.hints.C9463m;
import io.sentry.hints.C9465o;
import io.sentry.protocol.C9558q;
import io.sentry.protocol.C9565x;
import io.sentry.util.C9640k;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import io.sentry.util.C9647r;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Hub.java */
/* renamed from: io.sentry.p1 */
/* loaded from: classes2.dex */
public final class C9531p1 implements InterfaceC9658v1 {

    /* renamed from: a */
    private volatile C9558q f36556a;

    /* renamed from: b */
    private final C9680x4 f36557b;

    /* renamed from: c */
    private volatile boolean f36558c;

    /* renamed from: d */
    private final C9500k5 f36559d;

    /* renamed from: e */
    private final C9535p5 f36560e;

    /* renamed from: f */
    private final Map<Throwable, C9647r<WeakReference<InterfaceC9419d2>, String>> f36561f;

    /* renamed from: g */
    private final InterfaceC9629u5 f36562g;

    public C9531p1(C9680x4 c9680x4) {
        this(c9680x4, m31142d(c9680x4));
    }

    /* renamed from: a */
    private void m31139a(C9506l4 c9506l4) {
        C9647r<WeakReference<InterfaceC9419d2>, String> c9647r;
        InterfaceC9419d2 interfaceC9419d2;
        if (!this.f36557b.isTracingEnabled() || c9506l4.m30587O() == null || (c9647r = this.f36561f.get(C9640k.m31774a(c9506l4.m30587O()))) == null) {
            return;
        }
        WeakReference<InterfaceC9419d2> weakReferenceM31803a = c9647r.m31803a();
        if (c9506l4.m30575C().m31234e() == null && weakReferenceM31803a != null && (interfaceC9419d2 = weakReferenceM31803a.get()) != null) {
            c9506l4.m30575C().m31242n(interfaceC9419d2.mo30527m());
        }
        String strM31804b = c9647r.m31804b();
        if (c9506l4.m31005t0() != null || strM31804b == null) {
            return;
        }
        c9506l4.m30998E0(strM31804b);
    }

    /* renamed from: b */
    private C9586s3 m31140b(C9586s3 c9586s3, InterfaceC9593t3 interfaceC9593t3) {
        if (interfaceC9593t3 != null) {
            try {
                C9586s3 c9586s32 = new C9586s3(c9586s3);
                interfaceC9593t3.mo30217a(c9586s32);
                return c9586s32;
            } catch (Throwable th) {
                this.f36557b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error in the 'ScopeCallback' callback.", th);
            }
        }
        return c9586s3;
    }

    /* renamed from: c */
    private C9558q m31141c(C9506l4 c9506l4, C9517n1 c9517n1, InterfaceC9593t3 interfaceC9593t3) {
        C9558q c9558qMo30022b = C9558q.f36725f;
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return c9558qMo30022b;
        }
        if (c9506l4 == null) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return c9558qMo30022b;
        }
        try {
            m31139a(c9506l4);
            C9500k5.a aVarM30923a = this.f36559d.m30923a();
            c9558qMo30022b = aVarM30923a.m30925a().mo30022b(c9506l4, m31140b(aVarM30923a.m30927c(), interfaceC9593t3), c9517n1);
            this.f36556a = c9558qMo30022b;
            return c9558qMo30022b;
        } catch (Throwable th) {
            this.f36557b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error while capturing event with id: " + c9506l4.m30579G(), th);
            return c9558qMo30022b;
        }
    }

    /* renamed from: d */
    private static C9500k5.a m31142d(C9680x4 c9680x4) {
        m31146u(c9680x4);
        return new C9500k5.a(c9680x4, new C9421d4(c9680x4), new C9586s3(c9680x4));
    }

    /* renamed from: e */
    private InterfaceC9426e2 m31143e(C9581r5 c9581r5, C9595t5 c9595t5) {
        final InterfaceC9426e2 interfaceC9426e2M30717r;
        C9646q.m31802c(c9581r5, "transactionContext is required");
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            interfaceC9426e2M30717r = C9420d3.m30717r();
        } else if (!this.f36557b.getInstrumenter().equals(c9581r5.m31567s())) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", c9581r5.m31567s(), this.f36557b.getInstrumenter());
            interfaceC9426e2M30717r = C9420d3.m30717r();
        } else if (this.f36557b.isTracingEnabled()) {
            C9574q5 c9574q5M31176a = this.f36560e.m31176a(new C9579r3(c9581r5, c9595t5.m31650e()));
            c9581r5.m30806n(c9574q5M31176a);
            C9369b5 c9369b5 = new C9369b5(c9581r5, this, c9595t5, this.f36562g);
            if (c9574q5M31176a.m31562c().booleanValue() && c9574q5M31176a.m31560a().booleanValue()) {
                this.f36557b.getTransactionProfiler().mo30351b(c9369b5);
            }
            interfaceC9426e2M30717r = c9369b5;
        } else {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            interfaceC9426e2M30717r = C9420d3.m30717r();
        }
        if (c9595t5.m31654i()) {
            mo31154o(new InterfaceC9593t3() { // from class: io.sentry.h
                @Override // io.sentry.InterfaceC9593t3
                /* renamed from: a */
                public final void mo30217a(C9586s3 c9586s3) {
                    c9586s3.m31613z(interfaceC9426e2M30717r);
                }
            });
        }
        return interfaceC9426e2M30717r;
    }

    /* renamed from: u */
    private static void m31146u(C9680x4 c9680x4) {
        C9646q.m31802c(c9680x4, "SentryOptions is required.");
        if (c9680x4.getDsn() == null || c9680x4.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
    }

    @Override // io.sentry.InterfaceC9658v1
    public void close() {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (Integration integration : this.f36557b.getIntegrations()) {
                if (integration instanceof Closeable) {
                    try {
                        ((Closeable) integration).close();
                    } catch (IOException e2) {
                        this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Failed to close the integration {}.", integration, e2);
                    }
                }
            }
            mo31154o(new InterfaceC9593t3() { // from class: io.sentry.i
                @Override // io.sentry.InterfaceC9593t3
                /* renamed from: a */
                public final void mo30217a(C9586s3 c9586s3) {
                    c9586s3.m31591b();
                }
            });
            this.f36557b.getTransactionProfiler().close();
            this.f36557b.getTransactionPerformanceCollector().close();
            this.f36557b.getExecutorService().mo30029a(this.f36557b.getShutdownTimeoutMillis());
            this.f36559d.m30923a().m30925a().close();
        } catch (Throwable th) {
            this.f36557b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error while closing the Hub.", th);
        }
        this.f36558c = false;
    }

    @Override // io.sentry.InterfaceC9658v1
    public void endSession() {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        C9500k5.a aVarM30923a = this.f36559d.m30923a();
        C9422d5 c9422d5M31595g = aVarM30923a.m30927c().m31595g();
        if (c9422d5M31595g != null) {
            aVarM30923a.m30925a().mo30021a(c9422d5M31595g, C9642m.m31778a(new C9463m()));
        }
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: h */
    public void mo31147h(long j2) {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f36559d.m30923a().m30925a().mo30024h(j2);
        } catch (Throwable th) {
            this.f36557b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: i */
    public /* synthetic */ void mo31148i(C9657v0 c9657v0) {
        C9625u1.m31760a(this, c9657v0);
    }

    @Override // io.sentry.InterfaceC9658v1
    public boolean isEnabled() {
        return this.f36558c;
    }

    @Override // io.sentry.InterfaceC9658v1
    @ApiStatus.Internal
    /* renamed from: j */
    public C9558q mo31149j(C9449h4 c9449h4, C9517n1 c9517n1) {
        C9646q.m31802c(c9449h4, "SentryEnvelope is required.");
        C9558q c9558q = C9558q.f36725f;
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return c9558q;
        }
        try {
            C9558q c9558qMo30025j = this.f36559d.m30923a().m30925a().mo30025j(c9449h4, c9517n1);
            return c9558qMo30025j != null ? c9558qMo30025j : c9558q;
        } catch (Throwable th) {
            this.f36557b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error while capturing envelope.", th);
            return c9558q;
        }
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: k */
    public /* synthetic */ C9558q mo31150k(C9506l4 c9506l4) {
        return C9625u1.m31762c(this, c9506l4);
    }

    @Override // io.sentry.InterfaceC9658v1
    @ApiStatus.Internal
    /* renamed from: l */
    public InterfaceC9426e2 mo31151l(C9581r5 c9581r5, C9595t5 c9595t5) {
        return m31143e(c9581r5, c9595t5);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: m */
    public /* synthetic */ C9558q mo31152m(C9565x c9565x, C9528o5 c9528o5, C9517n1 c9517n1) {
        return C9625u1.m31763d(this, c9565x, c9528o5, c9517n1);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: n */
    public void mo31153n(C9657v0 c9657v0, C9517n1 c9517n1) {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (c9657v0 == null) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.f36559d.m30923a().m30927c().m31590a(c9657v0, c9517n1);
        }
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: o */
    public void mo31154o(InterfaceC9593t3 interfaceC9593t3) {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            interfaceC9593t3.mo30217a(this.f36559d.m30923a().m30927c());
        } catch (Throwable th) {
            this.f36557b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.InterfaceC9658v1
    @ApiStatus.Internal
    /* renamed from: p */
    public void mo31155p(Throwable th, InterfaceC9419d2 interfaceC9419d2, String str) {
        C9646q.m31802c(th, "throwable is required");
        C9646q.m31802c(interfaceC9419d2, "span is required");
        C9646q.m31802c(str, "transactionName is required");
        Throwable thM31774a = C9640k.m31774a(th);
        if (this.f36561f.containsKey(thM31774a)) {
            return;
        }
        this.f36561f.put(thM31774a, new C9647r<>(new WeakReference(interfaceC9419d2), str));
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: q */
    public C9680x4 mo31156q() {
        return this.f36559d.m30923a().m30926b();
    }

    @Override // io.sentry.InterfaceC9658v1
    @ApiStatus.Internal
    /* renamed from: r */
    public C9558q mo31157r(C9565x c9565x, C9528o5 c9528o5, C9517n1 c9517n1, C9512m3 c9512m3) {
        C9646q.m31802c(c9565x, "transaction is required");
        C9558q c9558q = C9558q.f36725f;
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return c9558q;
        }
        if (!c9565x.m31542p0()) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", c9565x.m30579G());
            return c9558q;
        }
        if (!Boolean.TRUE.equals(Boolean.valueOf(c9565x.m31543q0()))) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.DEBUG, "Transaction %s was dropped due to sampling decision.", c9565x.m30579G());
            this.f36557b.getClientReportRecorder().mo30690a(EnumC9401e.SAMPLE_RATE, EnumC9688z0.Transaction);
            return c9558q;
        }
        try {
            C9500k5.a aVarM30923a = this.f36559d.m30923a();
            return aVarM30923a.m30925a().mo30023c(c9565x, c9528o5, aVarM30923a.m30927c(), c9517n1, c9512m3);
        } catch (Throwable th) {
            this.f36557b.getLogger().mo30213b(EnumC9587s4.ERROR, "Error while capturing transaction with id: " + c9565x.m30579G(), th);
            return c9558q;
        }
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: s */
    public /* synthetic */ C9558q mo31158s(C9449h4 c9449h4) {
        return C9625u1.m31761b(this, c9449h4);
    }

    @Override // io.sentry.InterfaceC9658v1
    public void startSession() {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        C9500k5.a aVarM30923a = this.f36559d.m30923a();
        C9586s3.d dVarM31586A = aVarM30923a.m30927c().m31586A();
        if (dVarM31586A == null) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (dVarM31586A.m31617b() != null) {
            aVarM30923a.m30925a().mo30021a(dVarM31586A.m31617b(), C9642m.m31778a(new C9463m()));
        }
        aVarM30923a.m30925a().mo30021a(dVarM31586A.m31616a(), C9642m.m31778a(new C9465o()));
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: t */
    public C9558q mo31159t(C9506l4 c9506l4, C9517n1 c9517n1) {
        return m31141c(c9506l4, c9517n1, null);
    }

    private C9531p1(C9680x4 c9680x4, C9500k5 c9500k5) {
        this.f36561f = Collections.synchronizedMap(new WeakHashMap());
        m31146u(c9680x4);
        this.f36557b = c9680x4;
        this.f36560e = new C9535p5(c9680x4);
        this.f36559d = c9500k5;
        this.f36556a = C9558q.f36725f;
        this.f36562g = c9680x4.getTransactionPerformanceCollector();
        this.f36558c = true;
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC9658v1 m41048clone() {
        if (!isEnabled()) {
            this.f36557b.getLogger().mo30214c(EnumC9587s4.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        return new C9531p1(this.f36557b, new C9500k5(this.f36559d));
    }

    private C9531p1(C9680x4 c9680x4, C9500k5.a aVar) {
        this(c9680x4, new C9500k5(c9680x4.getLogger(), aVar));
    }
}
