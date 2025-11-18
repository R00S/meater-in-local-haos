package io.sentry;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.hints.EnumC9458h;
import io.sentry.protocol.C9557p;
import io.sentry.protocol.C9565x;
import io.sentry.util.C9642m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DeduplicateMultithreadedEventProcessor.java */
/* renamed from: io.sentry.b1 */
/* loaded from: classes2.dex */
public final class C9365b1 implements InterfaceC9496k1 {

    /* renamed from: f */
    private final Map<String, Long> f36149f = Collections.synchronizedMap(new HashMap());

    /* renamed from: g */
    private final C9680x4 f36150g;

    public C9365b1(C9680x4 c9680x4) {
        this.f36150g = c9680x4;
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: b */
    public C9506l4 mo30135b(C9506l4 c9506l4, C9517n1 c9517n1) {
        C9557p c9557pM31006u0;
        String strM31443i;
        Long lM31442h;
        if (!C9642m.m31781d(c9517n1, UncaughtExceptionHandlerIntegration.C9241a.class) || (c9557pM31006u0 = c9506l4.m31006u0()) == null || (strM31443i = c9557pM31006u0.m31443i()) == null || (lM31442h = c9557pM31006u0.m31442h()) == null) {
            return c9506l4;
        }
        Long l = this.f36149f.get(strM31443i);
        if (l == null || l.equals(lM31442h)) {
            this.f36149f.put(strM31443i, lM31442h);
            return c9506l4;
        }
        this.f36150g.getLogger().mo30214c(EnumC9587s4.INFO, "Event %s has been dropped due to multi-threaded deduplication", c9506l4.m30579G());
        C9642m.m31791n(c9517n1, EnumC9458h.MULTITHREADED_DEDUPLICATION);
        return null;
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: e */
    public /* synthetic */ C9565x mo30136e(C9565x c9565x, C9517n1 c9517n1) {
        return C9489j1.m30876a(this, c9565x, c9517n1);
    }
}
