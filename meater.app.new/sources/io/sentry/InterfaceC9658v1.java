package io.sentry;

import io.sentry.protocol.C9558q;
import io.sentry.protocol.C9565x;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: IHub.java */
/* renamed from: io.sentry.v1 */
/* loaded from: classes2.dex */
public interface InterfaceC9658v1 {
    InterfaceC9658v1 clone();

    void close();

    void endSession();

    /* renamed from: h */
    void mo31147h(long j2);

    /* renamed from: i */
    void mo31148i(C9657v0 c9657v0);

    boolean isEnabled();

    /* renamed from: j */
    C9558q mo31149j(C9449h4 c9449h4, C9517n1 c9517n1);

    /* renamed from: k */
    C9558q mo31150k(C9506l4 c9506l4);

    /* renamed from: l */
    InterfaceC9426e2 mo31151l(C9581r5 c9581r5, C9595t5 c9595t5);

    @ApiStatus.Internal
    /* renamed from: m */
    C9558q mo31152m(C9565x c9565x, C9528o5 c9528o5, C9517n1 c9517n1);

    /* renamed from: n */
    void mo31153n(C9657v0 c9657v0, C9517n1 c9517n1);

    /* renamed from: o */
    void mo31154o(InterfaceC9593t3 interfaceC9593t3);

    @ApiStatus.Internal
    /* renamed from: p */
    void mo31155p(Throwable th, InterfaceC9419d2 interfaceC9419d2, String str);

    /* renamed from: q */
    C9680x4 mo31156q();

    @ApiStatus.Internal
    /* renamed from: r */
    C9558q mo31157r(C9565x c9565x, C9528o5 c9528o5, C9517n1 c9517n1, C9512m3 c9512m3);

    /* renamed from: s */
    C9558q mo31158s(C9449h4 c9449h4);

    void startSession();

    /* renamed from: t */
    C9558q mo31159t(C9506l4 c9506l4, C9517n1 c9517n1);
}
