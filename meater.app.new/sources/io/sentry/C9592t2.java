package io.sentry;

import io.sentry.hints.InterfaceC9452b;
import io.sentry.hints.InterfaceC9456f;
import io.sentry.protocol.C9540a0;
import io.sentry.protocol.C9545d;
import io.sentry.protocol.C9557p;
import io.sentry.protocol.C9565x;
import io.sentry.protocol.DebugImage;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: MainEventProcessor.java */
@ApiStatus.Internal
/* renamed from: io.sentry.t2 */
/* loaded from: classes2.dex */
public final class C9592t2 implements InterfaceC9496k1, Closeable {

    /* renamed from: f */
    private final C9680x4 f36847f;

    /* renamed from: g */
    private final C9248a5 f36848g;

    /* renamed from: h */
    private final C9513m4 f36849h;

    /* renamed from: i */
    private volatile C9524o1 f36850i = null;

    public C9592t2(C9680x4 c9680x4) {
        C9680x4 c9680x42 = (C9680x4) C9646q.m31802c(c9680x4, "The SentryOptions is required.");
        this.f36847f = c9680x42;
        C9692z4 c9692z4 = new C9692z4(c9680x42);
        this.f36849h = new C9513m4(c9692z4);
        this.f36848g = new C9248a5(c9692z4, c9680x42);
    }

    /* renamed from: A */
    private void m31619A(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30584L() == null) {
            abstractC9375c4.m30599a0(this.f36847f.getSdkVersion());
        }
    }

    /* renamed from: B */
    private void m31620B(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30585M() == null) {
            abstractC9375c4.m30600b0(this.f36847f.getServerName());
        }
        if (this.f36847f.isAttachServerName() && abstractC9375c4.m30585M() == null) {
            m31624a();
            if (this.f36850i != null) {
                abstractC9375c4.m30600b0(this.f36850i.m31116b());
            }
        }
    }

    /* renamed from: D */
    private void m31621D(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30586N() == null) {
            abstractC9375c4.m30602d0(new HashMap(this.f36847f.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f36847f.getTags().entrySet()) {
            if (!abstractC9375c4.m30586N().containsKey(entry.getKey())) {
                abstractC9375c4.m30601c0(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: H */
    private void m31622H(C9506l4 c9506l4, C9517n1 c9517n1) {
        if (c9506l4.m31004s0() == null) {
            ArrayList arrayList = null;
            List<C9557p> listM31000o0 = c9506l4.m31000o0();
            if (listM31000o0 != null && !listM31000o0.isEmpty()) {
                for (C9557p c9557p : listM31000o0) {
                    if (c9557p.m31441g() != null && c9557p.m31442h() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(c9557p.m31442h());
                    }
                }
            }
            if (this.f36847f.isAttachThreads() || C9642m.m31781d(c9517n1, InterfaceC9452b.class)) {
                Object objM31780c = C9642m.m31780c(c9517n1);
                c9506l4.m30996C0(this.f36848g.m30054b(arrayList, objM31780c instanceof InterfaceC9452b ? ((InterfaceC9452b) objM31780c).mo30103d() : false));
            } else if (this.f36847f.isAttachStacktrace()) {
                if ((listM31000o0 == null || listM31000o0.isEmpty()) && !m31625c(c9517n1)) {
                    c9506l4.m30996C0(this.f36848g.m30053a());
                }
            }
        }
    }

    /* renamed from: I */
    private boolean m31623I(AbstractC9375c4 abstractC9375c4, C9517n1 c9517n1) {
        if (C9642m.m31794q(c9517n1)) {
            return true;
        }
        this.f36847f.getLogger().mo30214c(EnumC9587s4.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC9375c4.m30579G());
        return false;
    }

    /* renamed from: a */
    private void m31624a() {
        if (this.f36850i == null) {
            synchronized (this) {
                if (this.f36850i == null) {
                    this.f36850i = C9524o1.m31110c();
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m31625c(C9517n1 c9517n1) {
        return C9642m.m31781d(c9517n1, InterfaceC9456f.class);
    }

    /* renamed from: d */
    private void m31626d(AbstractC9375c4 abstractC9375c4) {
        if (this.f36847f.isSendDefaultPii()) {
            if (abstractC9375c4.m30589Q() == null) {
                C9540a0 c9540a0 = new C9540a0();
                c9540a0.m31220o("{{auto}}");
                abstractC9375c4.m30603e0(c9540a0);
            } else if (abstractC9375c4.m30589Q().m31217l() == null) {
                abstractC9375c4.m30589Q().m31220o("{{auto}}");
            }
        }
    }

    /* renamed from: f */
    private void m31627f(AbstractC9375c4 abstractC9375c4) {
        m31635z(abstractC9375c4);
        m31631m(abstractC9375c4);
        m31620B(abstractC9375c4);
        m31630l(abstractC9375c4);
        m31619A(abstractC9375c4);
        m31621D(abstractC9375c4);
        m31626d(abstractC9375c4);
    }

    /* renamed from: j */
    private void m31628j(AbstractC9375c4 abstractC9375c4) {
        m31634y(abstractC9375c4);
    }

    /* renamed from: k */
    private void m31629k(AbstractC9375c4 abstractC9375c4) {
        ArrayList arrayList = new ArrayList();
        if (this.f36847f.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(this.f36847f.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : this.f36847f.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C9545d c9545dM30576D = abstractC9375c4.m30576D();
        if (c9545dM30576D == null) {
            c9545dM30576D = new C9545d();
        }
        if (c9545dM30576D.m31268c() == null) {
            c9545dM30576D.m31269d(arrayList);
        } else {
            c9545dM30576D.m31268c().addAll(arrayList);
        }
        abstractC9375c4.m30591S(c9545dM30576D);
    }

    /* renamed from: l */
    private void m31630l(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30577E() == null) {
            abstractC9375c4.m30592T(this.f36847f.getDist());
        }
    }

    /* renamed from: m */
    private void m31631m(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30578F() == null) {
            abstractC9375c4.m30593U(this.f36847f.getEnvironment());
        }
    }

    /* renamed from: p */
    private void m31632p(C9506l4 c9506l4) {
        Throwable thM30588P = c9506l4.m30588P();
        if (thM30588P != null) {
            c9506l4.m31009x0(this.f36849h.m31066c(thM30588P));
        }
    }

    /* renamed from: x */
    private void m31633x(C9506l4 c9506l4) {
        Map<String, String> mapMo30866a = this.f36847f.getModulesLoader().mo30866a();
        if (mapMo30866a == null) {
            return;
        }
        Map<String, String> mapM31003r0 = c9506l4.m31003r0();
        if (mapM31003r0 == null) {
            c9506l4.m30995B0(mapMo30866a);
        } else {
            mapM31003r0.putAll(mapMo30866a);
        }
    }

    /* renamed from: y */
    private void m31634y(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30581I() == null) {
            abstractC9375c4.m30596X("java");
        }
    }

    /* renamed from: z */
    private void m31635z(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30582J() == null) {
            abstractC9375c4.m30597Y(this.f36847f.getRelease());
        }
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: b */
    public C9506l4 mo30135b(C9506l4 c9506l4, C9517n1 c9517n1) {
        m31628j(c9506l4);
        m31632p(c9506l4);
        m31629k(c9506l4);
        m31633x(c9506l4);
        if (m31623I(c9506l4, c9517n1)) {
            m31627f(c9506l4);
            m31622H(c9506l4, c9517n1);
        }
        return c9506l4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f36850i != null) {
            this.f36850i.m31115a();
        }
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: e */
    public C9565x mo30136e(C9565x c9565x, C9517n1 c9517n1) {
        m31628j(c9565x);
        m31629k(c9565x);
        if (m31623I(c9565x, c9517n1)) {
            m31627f(c9565x);
        }
        return c9565x;
    }
}
