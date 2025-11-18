package io.sentry;

import io.sentry.transport.C9609m;
import io.sentry.transport.C9621y;
import io.sentry.transport.InterfaceC9614r;
import io.sentry.util.C9646q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AsyncHttpTransportFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.r0 */
/* loaded from: classes2.dex */
public final class C9576r0 implements InterfaceC9440g2 {
    @Override // io.sentry.InterfaceC9440g2
    /* renamed from: a */
    public InterfaceC9614r mo30812a(C9680x4 c9680x4, C9533p3 c9533p3) {
        C9646q.m31802c(c9680x4, "options is required");
        C9646q.m31802c(c9533p3, "requestDetails is required");
        return new C9609m(c9680x4, new C9621y(c9680x4), c9680x4.getTransportGate(), c9533p3);
    }
}
