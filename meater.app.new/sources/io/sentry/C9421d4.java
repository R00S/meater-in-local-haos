package io.sentry;

import io.sentry.C9422d5;
import io.sentry.C9586s3;
import io.sentry.C9680x4;
import io.sentry.clientreport.EnumC9401e;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.hints.InterfaceC9452b;
import io.sentry.hints.InterfaceC9454d;
import io.sentry.hints.InterfaceC9467q;
import io.sentry.protocol.C9543c;
import io.sentry.protocol.C9558q;
import io.sentry.protocol.C9565x;
import io.sentry.transport.InterfaceC9614r;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import io.sentry.util.C9655v;
import java.io.Closeable;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryClient.java */
/* renamed from: io.sentry.d4 */
/* loaded from: classes2.dex */
public final class C9421d4 implements InterfaceC9245a2 {

    /* renamed from: b */
    private final C9680x4 f36265b;

    /* renamed from: c */
    private final InterfaceC9614r f36266c;

    /* renamed from: d */
    private final SecureRandom f36267d;

    /* renamed from: e */
    private final b f36268e = new b();

    /* renamed from: a */
    private boolean f36264a = true;

    /* compiled from: SentryClient.java */
    /* renamed from: io.sentry.d4$b */
    private static final class b implements Comparator<C9657v0> {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C9657v0 c9657v0, C9657v0 c9657v02) {
            return c9657v0.m31838j().compareTo(c9657v02.m31838j());
        }
    }

    C9421d4(C9680x4 c9680x4) {
        this.f36265b = (C9680x4) C9646q.m31802c(c9680x4, "SentryOptions is required.");
        InterfaceC9440g2 transportFactory = c9680x4.getTransportFactory();
        if (transportFactory instanceof C9441g3) {
            transportFactory = new C9576r0();
            c9680x4.setTransportFactory(transportFactory);
        }
        this.f36266c = transportFactory.mo30812a(c9680x4, new C9572q3(c9680x4).m31554a());
        this.f36267d = c9680x4.getSampleRate() != null ? new SecureRandom() : null;
    }

    /* renamed from: d */
    private void m30718d(C9586s3 c9586s3, C9517n1 c9517n1) {
        if (c9586s3 != null) {
            c9517n1.m31071a(c9586s3.m31596i());
        }
    }

    /* renamed from: e */
    private <T extends AbstractC9375c4> T m30719e(T t, C9586s3 c9586s3) {
        if (c9586s3 != null) {
            if (t.m30583K() == null) {
                t.m30598Z(c9586s3.m31604q());
            }
            if (t.m30589Q() == null) {
                t.m30603e0(c9586s3.m31610w());
            }
            if (t.m30586N() == null) {
                t.m30602d0(new HashMap(c9586s3.m31607t()));
            } else {
                for (Map.Entry<String, String> entry : c9586s3.m31607t().entrySet()) {
                    if (!t.m30586N().containsKey(entry.getKey())) {
                        t.m30586N().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (t.m30574B() == null) {
                t.m30590R(new ArrayList(c9586s3.m31597j()));
            } else {
                m30733v(t, c9586s3.m31597j());
            }
            if (t.m30580H() == null) {
                t.m30595W(new HashMap(c9586s3.m31600m()));
            } else {
                for (Map.Entry<String, Object> entry2 : c9586s3.m31600m().entrySet()) {
                    if (!t.m30580H().containsKey(entry2.getKey())) {
                        t.m30580H().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C9543c c9543cM30575C = t.m30575C();
            for (Map.Entry<String, Object> entry3 : new C9543c(c9586s3.m31598k()).entrySet()) {
                if (!c9543cM30575C.containsKey(entry3.getKey())) {
                    c9543cM30575C.put(entry3.getKey(), entry3.getValue());
                }
            }
        }
        return t;
    }

    /* renamed from: f */
    private C9506l4 m30720f(C9506l4 c9506l4, C9586s3 c9586s3, C9517n1 c9517n1) {
        if (c9586s3 == null) {
            return c9506l4;
        }
        m30719e(c9506l4, c9586s3);
        if (c9506l4.m31005t0() == null) {
            c9506l4.m30998E0(c9586s3.m31609v());
        }
        if (c9506l4.m31001p0() == null) {
            c9506l4.m31010y0(c9586s3.m31601n());
        }
        if (c9586s3.m31602o() != null) {
            c9506l4.m31011z0(c9586s3.m31602o());
        }
        InterfaceC9419d2 interfaceC9419d2M31606s = c9586s3.m31606s();
        if (c9506l4.m30575C().m31234e() == null) {
            if (interfaceC9419d2M31606s == null) {
                c9506l4.m30575C().m31242n(C9581r5.m31565q(c9586s3.m31603p()));
            } else {
                c9506l4.m30575C().m31242n(interfaceC9419d2M31606s.mo30527m());
            }
        }
        return m30728q(c9506l4, c9517n1, c9586s3.m31599l());
    }

    /* renamed from: g */
    private C9449h4 m30721g(AbstractC9375c4 abstractC9375c4, List<C9583s0> list, C9422d5 c9422d5, C9528o5 c9528o5, C9512m3 c9512m3) throws SentryEnvelopeException, IOException {
        C9558q c9558q;
        ArrayList arrayList = new ArrayList();
        if (abstractC9375c4 != null) {
            arrayList.add(C9492j4.m30890d(this.f36265b.getSerializer(), abstractC9375c4));
            c9558q = abstractC9375c4.m30579G();
        } else {
            c9558q = null;
        }
        if (c9422d5 != null) {
            arrayList.add(C9492j4.m30892f(this.f36265b.getSerializer(), c9422d5));
        }
        if (c9512m3 != null) {
            arrayList.add(C9492j4.m30891e(c9512m3, this.f36265b.getMaxTraceFileSize(), this.f36265b.getSerializer()));
            if (c9558q == null) {
                c9558q = new C9558q(c9512m3.m31061z());
            }
        }
        if (list != null) {
            Iterator<C9583s0> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C9492j4.m30888b(this.f36265b.getSerializer(), this.f36265b.getLogger(), it.next(), this.f36265b.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C9449h4(new C9473i4(c9558q, this.f36265b.getSdkVersion(), c9528o5), arrayList);
    }

    /* renamed from: i */
    private C9506l4 m30722i(C9506l4 c9506l4, C9517n1 c9517n1) {
        C9680x4.b beforeSend = this.f36265b.getBeforeSend();
        if (beforeSend == null) {
            return c9506l4;
        }
        try {
            return beforeSend.m31944a(c9506l4, c9517n1);
        } catch (Throwable th) {
            this.f36265b.getLogger().mo30213b(EnumC9587s4.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th);
            return null;
        }
    }

    /* renamed from: k */
    private C9565x m30723k(C9565x c9565x, C9517n1 c9517n1) {
        C9680x4.c beforeSendTransaction = this.f36265b.getBeforeSendTransaction();
        if (beforeSendTransaction == null) {
            return c9565x;
        }
        try {
            return beforeSendTransaction.m31945a(c9565x, c9517n1);
        } catch (Throwable th) {
            this.f36265b.getLogger().mo30213b(EnumC9587s4.ERROR, "The BeforeSendTransaction callback threw an exception. It will be added as breadcrumb and continue.", th);
            return null;
        }
    }

    /* renamed from: l */
    private List<C9583s0> m30724l(List<C9583s0> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C9583s0 c9583s0 : list) {
            if (c9583s0.m31581j()) {
                arrayList.add(c9583s0);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    private List<C9583s0> m30725m(C9517n1 c9517n1) {
        List<C9583s0> listM31075e = c9517n1.m31075e();
        C9583s0 c9583s0M31076f = c9517n1.m31076f();
        if (c9583s0M31076f != null) {
            listM31075e.add(c9583s0M31076f);
        }
        C9583s0 c9583s0M31078h = c9517n1.m31078h();
        if (c9583s0M31078h != null) {
            listM31075e.add(c9583s0M31078h);
        }
        C9583s0 c9583s0M31077g = c9517n1.m31077g();
        if (c9583s0M31077g != null) {
            listM31075e.add(c9583s0M31077g);
        }
        return listM31075e;
    }

    /* renamed from: n */
    static /* synthetic */ void m30726n(C9422d5 c9422d5) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30734p(C9506l4 c9506l4, C9517n1 c9517n1, C9422d5 c9422d5) {
        if (c9422d5 == null) {
            this.f36265b.getLogger().mo30214c(EnumC9587s4.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strMo30104f = null;
        C9422d5.b bVar = c9506l4.m31007v0() ? C9422d5.b.Crashed : null;
        boolean z = C9422d5.b.Crashed == bVar || c9506l4.m31008w0();
        String str = (c9506l4.m30583K() == null || c9506l4.m30583K().m31407l() == null || !c9506l4.m30583K().m31407l().containsKey("user-agent")) ? null : c9506l4.m30583K().m31407l().get("user-agent");
        Object objM31780c = C9642m.m31780c(c9517n1);
        if (objM31780c instanceof InterfaceC9452b) {
            strMo30104f = ((InterfaceC9452b) objM31780c).mo30104f();
            bVar = C9422d5.b.Abnormal;
        }
        if (c9422d5.m30753q(bVar, str, z, strMo30104f) && c9422d5.m30749m()) {
            c9422d5.m30740c();
        }
    }

    /* renamed from: q */
    private C9506l4 m30728q(C9506l4 c9506l4, C9517n1 c9517n1, List<InterfaceC9496k1> list) {
        Iterator<InterfaceC9496k1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC9496k1 next = it.next();
            try {
                boolean z = next instanceof InterfaceC9590t0;
                boolean zM31781d = C9642m.m31781d(c9517n1, InterfaceC9454d.class);
                if (zM31781d && z) {
                    c9506l4 = next.mo30135b(c9506l4, c9517n1);
                } else if (!zM31781d && !z) {
                    c9506l4 = next.mo30135b(c9506l4, c9517n1);
                }
            } catch (Throwable th) {
                this.f36265b.getLogger().mo30212a(EnumC9587s4.ERROR, th, "An exception occurred while processing event by processor: %s", next.getClass().getName());
            }
            if (c9506l4 == null) {
                this.f36265b.getLogger().mo30214c(EnumC9587s4.DEBUG, "Event was dropped by a processor: %s", next.getClass().getName());
                this.f36265b.getClientReportRecorder().mo30690a(EnumC9401e.EVENT_PROCESSOR, EnumC9688z0.Error);
                break;
            }
        }
        return c9506l4;
    }

    /* renamed from: r */
    private C9565x m30729r(C9565x c9565x, C9517n1 c9517n1, List<InterfaceC9496k1> list) {
        Iterator<InterfaceC9496k1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC9496k1 next = it.next();
            try {
                c9565x = next.mo30136e(c9565x, c9517n1);
            } catch (Throwable th) {
                this.f36265b.getLogger().mo30212a(EnumC9587s4.ERROR, th, "An exception occurred while processing transaction by processor: %s", next.getClass().getName());
            }
            if (c9565x == null) {
                this.f36265b.getLogger().mo30214c(EnumC9587s4.DEBUG, "Transaction was dropped by a processor: %s", next.getClass().getName());
                this.f36265b.getClientReportRecorder().mo30690a(EnumC9401e.EVENT_PROCESSOR, EnumC9688z0.Transaction);
                break;
            }
        }
        return c9565x;
    }

    /* renamed from: s */
    private boolean m30730s() {
        return this.f36265b.getSampleRate() == null || this.f36267d == null || this.f36265b.getSampleRate().doubleValue() >= this.f36267d.nextDouble();
    }

    /* renamed from: t */
    private boolean m30731t(AbstractC9375c4 abstractC9375c4, C9517n1 c9517n1) {
        if (C9642m.m31794q(c9517n1)) {
            return true;
        }
        this.f36265b.getLogger().mo30214c(EnumC9587s4.DEBUG, "Event was cached so not applying scope: %s", abstractC9375c4.m30579G());
        return false;
    }

    /* renamed from: u */
    private boolean m30732u(C9422d5 c9422d5, C9422d5 c9422d52) {
        if (c9422d52 == null) {
            return false;
        }
        if (c9422d5 == null) {
            return true;
        }
        C9422d5.b bVarM30748l = c9422d52.m30748l();
        C9422d5.b bVar = C9422d5.b.Crashed;
        if (bVarM30748l == bVar && c9422d5.m30748l() != bVar) {
            return true;
        }
        return c9422d52.m30742e() > 0 && c9422d5.m30742e() <= 0;
    }

    /* renamed from: v */
    private void m30733v(AbstractC9375c4 abstractC9375c4, Collection<C9657v0> collection) {
        List<C9657v0> listM30574B = abstractC9375c4.m30574B();
        if (listM30574B == null || collection.isEmpty()) {
            return;
        }
        listM30574B.addAll(collection);
        Collections.sort(listM30574B, this.f36268e);
    }

    @Override // io.sentry.InterfaceC9245a2
    @ApiStatus.Internal
    /* renamed from: a */
    public void mo30021a(C9422d5 c9422d5, C9517n1 c9517n1) {
        C9646q.m31802c(c9422d5, "Session is required.");
        if (c9422d5.m30745h() == null || c9422d5.m30745h().isEmpty()) {
            this.f36265b.getLogger().mo30214c(EnumC9587s4.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            mo30025j(C9449h4.m30830a(this.f36265b.getSerializer(), c9422d5, this.f36265b.getSdkVersion()), c9517n1);
        } catch (IOException e2) {
            this.f36265b.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to capture session.", e2);
        }
    }

    @Override // io.sentry.InterfaceC9245a2
    /* renamed from: b */
    public C9558q mo30022b(C9506l4 c9506l4, C9586s3 c9586s3, C9517n1 c9517n1) {
        C9506l4 c9506l42;
        InterfaceC9426e2 interfaceC9426e2M31608u;
        C9528o5 c9528o5Mo30515a;
        C9528o5 c9528o5;
        C9646q.m31802c(c9506l4, "SentryEvent is required.");
        if (c9517n1 == null) {
            c9517n1 = new C9517n1();
        }
        if (m30731t(c9506l4, c9517n1)) {
            m30718d(c9586s3, c9517n1);
        }
        InterfaceC9670w1 logger = this.f36265b.getLogger();
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        logger.mo30214c(enumC9587s4, "Capturing event: %s", c9506l4.m30579G());
        Throwable thM30587O = c9506l4.m30587O();
        if (thM30587O != null && this.f36265b.containsIgnoredExceptionForType(thM30587O)) {
            this.f36265b.getLogger().mo30214c(enumC9587s4, "Event was dropped as the exception %s is ignored", thM30587O.getClass());
            this.f36265b.getClientReportRecorder().mo30690a(EnumC9401e.EVENT_PROCESSOR, EnumC9688z0.Error);
            return C9558q.f36725f;
        }
        if (m30731t(c9506l4, c9517n1) && (c9506l4 = m30720f(c9506l4, c9586s3, c9517n1)) == null) {
            this.f36265b.getLogger().mo30214c(enumC9587s4, "Event was dropped by applyScope", new Object[0]);
            return C9558q.f36725f;
        }
        C9506l4 c9506l4M30728q = m30728q(c9506l4, c9517n1, this.f36265b.getEventProcessors());
        if (c9506l4M30728q != null && (c9506l4M30728q = m30722i(c9506l4M30728q, c9517n1)) == null) {
            this.f36265b.getLogger().mo30214c(enumC9587s4, "Event was dropped by beforeSend", new Object[0]);
            this.f36265b.getClientReportRecorder().mo30690a(EnumC9401e.BEFORE_SEND, EnumC9688z0.Error);
        }
        if (c9506l4M30728q == null) {
            return C9558q.f36725f;
        }
        C9422d5 c9422d5M31588C = c9586s3 != null ? c9586s3.m31588C(new C9586s3.b() { // from class: io.sentry.v
            @Override // io.sentry.C9586s3.b
            /* renamed from: a */
            public final void mo31615a(C9422d5 c9422d5) {
                C9421d4.m30726n(c9422d5);
            }
        }) : null;
        C9422d5 c9422d5M30735w = (c9422d5M31588C == null || !c9422d5M31588C.m30749m()) ? m30735w(c9506l4M30728q, c9517n1, c9586s3) : null;
        if (m30730s()) {
            c9506l42 = c9506l4M30728q;
        } else {
            this.f36265b.getLogger().mo30214c(enumC9587s4, "Event %s was dropped due to sampling decision.", c9506l4M30728q.m30579G());
            this.f36265b.getClientReportRecorder().mo30690a(EnumC9401e.SAMPLE_RATE, EnumC9688z0.Error);
            c9506l42 = null;
        }
        boolean zM30732u = m30732u(c9422d5M31588C, c9422d5M30735w);
        if (c9506l42 == null && !zM30732u) {
            this.f36265b.getLogger().mo30214c(enumC9587s4, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return C9558q.f36725f;
        }
        C9558q c9558qM30579G = C9558q.f36725f;
        if (c9506l42 != null && c9506l42.m30579G() != null) {
            c9558qM30579G = c9506l42.m30579G();
        }
        try {
            if (C9642m.m31781d(c9517n1, InterfaceC9454d.class)) {
                if (c9506l42 != null) {
                    c9528o5Mo30515a = C9624u0.m31728b(c9506l42, this.f36265b).m31739F();
                    c9528o5 = c9528o5Mo30515a;
                }
                c9528o5 = null;
            } else {
                if (c9586s3 != null) {
                    InterfaceC9426e2 interfaceC9426e2M31608u2 = c9586s3.m31608u();
                    c9528o5Mo30515a = interfaceC9426e2M31608u2 != null ? interfaceC9426e2M31608u2.mo30515a() : C9655v.m31826d(c9586s3, this.f36265b).m31130h();
                    c9528o5 = c9528o5Mo30515a;
                }
                c9528o5 = null;
            }
            C9449h4 c9449h4M30721g = m30721g(c9506l42, c9506l42 != null ? m30725m(c9517n1) : null, c9422d5M30735w, c9528o5, null);
            c9517n1.m31072b();
            if (c9449h4M30721g != null) {
                this.f36266c.mo31675V(c9449h4M30721g, c9517n1);
            }
        } catch (SentryEnvelopeException | IOException e2) {
            this.f36265b.getLogger().mo30212a(EnumC9587s4.WARNING, e2, "Capturing event %s failed.", c9558qM30579G);
            c9558qM30579G = C9558q.f36725f;
        }
        if (c9586s3 != null && (interfaceC9426e2M31608u = c9586s3.m31608u()) != null && C9642m.m31781d(c9517n1, InterfaceC9467q.class)) {
            interfaceC9426e2M31608u.mo30519e(EnumC9493j5.ABORTED, false);
        }
        return c9558qM30579G;
    }

    @Override // io.sentry.InterfaceC9245a2
    /* renamed from: c */
    public C9558q mo30023c(C9565x c9565x, C9528o5 c9528o5, C9586s3 c9586s3, C9517n1 c9517n1, C9512m3 c9512m3) {
        C9565x c9565xM30729r = c9565x;
        C9646q.m31802c(c9565x, "Transaction is required.");
        C9517n1 c9517n12 = c9517n1 == null ? new C9517n1() : c9517n1;
        if (m30731t(c9565x, c9517n12)) {
            m30718d(c9586s3, c9517n12);
        }
        InterfaceC9670w1 logger = this.f36265b.getLogger();
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        logger.mo30214c(enumC9587s4, "Capturing transaction: %s", c9565x.m30579G());
        C9558q c9558q = C9558q.f36725f;
        C9558q c9558qM30579G = c9565x.m30579G() != null ? c9565x.m30579G() : c9558q;
        if (m30731t(c9565x, c9517n12)) {
            c9565xM30729r = (C9565x) m30719e(c9565x, c9586s3);
            if (c9565xM30729r != null && c9586s3 != null) {
                c9565xM30729r = m30729r(c9565xM30729r, c9517n12, c9586s3.m31599l());
            }
            if (c9565xM30729r == null) {
                this.f36265b.getLogger().mo30214c(enumC9587s4, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (c9565xM30729r != null) {
            c9565xM30729r = m30729r(c9565xM30729r, c9517n12, this.f36265b.getEventProcessors());
        }
        if (c9565xM30729r == null) {
            this.f36265b.getLogger().mo30214c(enumC9587s4, "Transaction was dropped by Event processors.", new Object[0]);
            return c9558q;
        }
        C9565x c9565xM30723k = m30723k(c9565xM30729r, c9517n12);
        if (c9565xM30723k == null) {
            this.f36265b.getLogger().mo30214c(enumC9587s4, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            this.f36265b.getClientReportRecorder().mo30690a(EnumC9401e.BEFORE_SEND, EnumC9688z0.Transaction);
            return c9558q;
        }
        try {
            C9449h4 c9449h4M30721g = m30721g(c9565xM30723k, m30724l(m30725m(c9517n12)), null, c9528o5, c9512m3);
            c9517n12.m31072b();
            if (c9449h4M30721g == null) {
                return c9558q;
            }
            this.f36266c.mo31675V(c9449h4M30721g, c9517n12);
            return c9558qM30579G;
        } catch (SentryEnvelopeException | IOException e2) {
            this.f36265b.getLogger().mo30212a(EnumC9587s4.WARNING, e2, "Capturing transaction %s failed.", c9558qM30579G);
            return C9558q.f36725f;
        }
    }

    @Override // io.sentry.InterfaceC9245a2
    public void close() throws IOException {
        this.f36265b.getLogger().mo30214c(EnumC9587s4.INFO, "Closing SentryClient.", new Object[0]);
        try {
            mo30024h(this.f36265b.getShutdownTimeoutMillis());
            this.f36266c.close();
        } catch (IOException e2) {
            this.f36265b.getLogger().mo30213b(EnumC9587s4.WARNING, "Failed to close the connection to the Sentry Server.", e2);
        }
        for (InterfaceC9496k1 interfaceC9496k1 : this.f36265b.getEventProcessors()) {
            if (interfaceC9496k1 instanceof Closeable) {
                try {
                    ((Closeable) interfaceC9496k1).close();
                } catch (IOException e3) {
                    this.f36265b.getLogger().mo30214c(EnumC9587s4.WARNING, "Failed to close the event processor {}.", interfaceC9496k1, e3);
                }
            }
        }
        this.f36264a = false;
    }

    @Override // io.sentry.InterfaceC9245a2
    /* renamed from: h */
    public void mo30024h(long j2) {
        this.f36266c.mo31676h(j2);
    }

    @Override // io.sentry.InterfaceC9245a2
    @ApiStatus.Internal
    /* renamed from: j */
    public C9558q mo30025j(C9449h4 c9449h4, C9517n1 c9517n1) {
        C9646q.m31802c(c9449h4, "SentryEnvelope is required.");
        if (c9517n1 == null) {
            c9517n1 = new C9517n1();
        }
        try {
            c9517n1.m31072b();
            this.f36266c.mo31675V(c9449h4, c9517n1);
            C9558q c9558qM30849a = c9449h4.m30831b().m30849a();
            return c9558qM30849a != null ? c9558qM30849a : C9558q.f36725f;
        } catch (IOException e2) {
            this.f36265b.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to capture envelope.", e2);
            return C9558q.f36725f;
        }
    }

    /* renamed from: w */
    C9422d5 m30735w(final C9506l4 c9506l4, final C9517n1 c9517n1, C9586s3 c9586s3) {
        if (C9642m.m31794q(c9517n1)) {
            if (c9586s3 != null) {
                return c9586s3.m31588C(new C9586s3.b() { // from class: io.sentry.w
                    @Override // io.sentry.C9586s3.b
                    /* renamed from: a */
                    public final void mo31615a(C9422d5 c9422d5) {
                        this.f36990a.m30734p(c9506l4, c9517n1, c9422d5);
                    }
                });
            }
            this.f36265b.getLogger().mo30214c(EnumC9587s4.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }
}
