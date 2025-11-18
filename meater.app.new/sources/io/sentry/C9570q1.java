package io.sentry;

import io.sentry.protocol.C9558q;
import io.sentry.protocol.C9565x;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: HubAdapter.java */
/* renamed from: io.sentry.q1 */
/* loaded from: classes2.dex */
public final class C9570q1 implements InterfaceC9658v1 {

    /* renamed from: a */
    private static final C9570q1 f36792a = new C9570q1();

    private C9570q1() {
    }

    /* renamed from: a */
    public static C9570q1 m31548a() {
        return f36792a;
    }

    @Override // io.sentry.InterfaceC9658v1
    public void close() {
        C9247a4.m30035e();
    }

    @Override // io.sentry.InterfaceC9658v1
    public void endSession() {
        C9247a4.m30037g();
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: h */
    public void mo31147h(long j2) {
        C9247a4.m30039i(j2);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: i */
    public /* synthetic */ void mo31148i(C9657v0 c9657v0) {
        C9625u1.m31760a(this, c9657v0);
    }

    @Override // io.sentry.InterfaceC9658v1
    public boolean isEnabled() {
        return C9247a4.m30046p();
    }

    @Override // io.sentry.InterfaceC9658v1
    @ApiStatus.Internal
    /* renamed from: j */
    public C9558q mo31149j(C9449h4 c9449h4, C9517n1 c9517n1) {
        return C9247a4.m30040j().mo31149j(c9449h4, c9517n1);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: k */
    public /* synthetic */ C9558q mo31150k(C9506l4 c9506l4) {
        return C9625u1.m31762c(this, c9506l4);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: l */
    public InterfaceC9426e2 mo31151l(C9581r5 c9581r5, C9595t5 c9595t5) {
        return C9247a4.m30051u(c9581r5, c9595t5);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: m */
    public /* synthetic */ C9558q mo31152m(C9565x c9565x, C9528o5 c9528o5, C9517n1 c9517n1) {
        return C9625u1.m31763d(this, c9565x, c9528o5, c9517n1);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: n */
    public void mo31153n(C9657v0 c9657v0, C9517n1 c9517n1) {
        C9247a4.m30031a(c9657v0, c9517n1);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: o */
    public void mo31154o(InterfaceC9593t3 interfaceC9593t3) {
        C9247a4.m30036f(interfaceC9593t3);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: p */
    public void mo31155p(Throwable th, InterfaceC9419d2 interfaceC9419d2, String str) {
        C9247a4.m30040j().mo31155p(th, interfaceC9419d2, str);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: q */
    public C9680x4 mo31156q() {
        return C9247a4.m30040j().mo31156q();
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: r */
    public C9558q mo31157r(C9565x c9565x, C9528o5 c9528o5, C9517n1 c9517n1, C9512m3 c9512m3) {
        return C9247a4.m30040j().mo31157r(c9565x, c9528o5, c9517n1, c9512m3);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: s */
    public /* synthetic */ C9558q mo31158s(C9449h4 c9449h4) {
        return C9625u1.m31761b(this, c9449h4);
    }

    @Override // io.sentry.InterfaceC9658v1
    public void startSession() {
        C9247a4.m30050t();
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: t */
    public C9558q mo31159t(C9506l4 c9506l4, C9517n1 c9517n1) {
        return C9247a4.m30034d(c9506l4, c9517n1);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC9658v1 m41049clone() {
        return C9247a4.m30040j().m41050clone();
    }
}
