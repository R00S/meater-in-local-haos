package io.sentry;

import io.sentry.util.C9646q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SendFireAndForgetEnvelopeSender.java */
@ApiStatus.Internal
/* renamed from: io.sentry.y3 */
/* loaded from: classes2.dex */
public final class C9685y3 implements InterfaceC9679x3 {

    /* renamed from: a */
    private final InterfaceC9660v3 f37022a;

    public C9685y3(InterfaceC9660v3 interfaceC9660v3) {
        this.f37022a = (InterfaceC9660v3) C9646q.m31802c(interfaceC9660v3, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.InterfaceC9679x3
    /* renamed from: a */
    public /* synthetic */ InterfaceC9627u3 mo31940a(AbstractC9425e1 abstractC9425e1, String str, InterfaceC9670w1 interfaceC9670w1) {
        return C9672w3.m31933b(this, abstractC9425e1, str, interfaceC9670w1);
    }

    @Override // io.sentry.InterfaceC9679x3
    /* renamed from: b */
    public InterfaceC9627u3 mo31941b(InterfaceC9658v1 interfaceC9658v1, C9680x4 c9680x4) {
        C9646q.m31802c(interfaceC9658v1, "Hub is required");
        C9646q.m31802c(c9680x4, "SentryOptions is required");
        String strMo30388a = this.f37022a.mo30388a();
        if (strMo30388a != null && mo31942c(strMo30388a, c9680x4.getLogger())) {
            return mo31940a(new C9470i1(interfaceC9658v1, c9680x4.getSerializer(), c9680x4.getLogger(), c9680x4.getFlushTimeoutMillis()), strMo30388a, c9680x4.getLogger());
        }
        c9680x4.getLogger().mo30214c(EnumC9587s4.ERROR, "No cache dir path is defined in options.", new Object[0]);
        return null;
    }

    @Override // io.sentry.InterfaceC9679x3
    /* renamed from: c */
    public /* synthetic */ boolean mo31942c(String str, InterfaceC9670w1 interfaceC9670w1) {
        return C9672w3.m31932a(this, str, interfaceC9670w1);
    }
}
