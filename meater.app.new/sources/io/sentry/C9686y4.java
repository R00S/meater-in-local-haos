package io.sentry;

import io.sentry.protocol.C9560s;
import io.sentry.protocol.C9565x;

/* compiled from: SentryRuntimeEventProcessor.java */
/* renamed from: io.sentry.y4 */
/* loaded from: classes2.dex */
final class C9686y4 implements InterfaceC9496k1 {

    /* renamed from: f */
    private final String f37023f;

    /* renamed from: g */
    private final String f37024g;

    public C9686y4(String str, String str2) {
        this.f37023f = str;
        this.f37024g = str2;
    }

    /* renamed from: a */
    private <T extends AbstractC9375c4> T m31958a(T t) {
        if (t.m30575C().m31233d() == null) {
            t.m30575C().m31241m(new C9560s());
        }
        C9560s c9560sM31233d = t.m30575C().m31233d();
        if (c9560sM31233d != null && c9560sM31233d.m31459d() == null && c9560sM31233d.m31460e() == null) {
            c9560sM31233d.m31461f(this.f37024g);
            c9560sM31233d.m31463h(this.f37023f);
        }
        return t;
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: b */
    public C9506l4 mo30135b(C9506l4 c9506l4, C9517n1 c9517n1) {
        return (C9506l4) m31958a(c9506l4);
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: e */
    public C9565x mo30136e(C9565x c9565x, C9517n1 c9517n1) {
        return (C9565x) m31958a(c9565x);
    }

    public C9686y4() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
