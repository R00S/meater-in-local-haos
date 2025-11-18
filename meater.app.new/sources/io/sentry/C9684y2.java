package io.sentry;

import io.sentry.protocol.C9558q;
import io.sentry.protocol.C9565x;

/* compiled from: NoOpHub.java */
/* renamed from: io.sentry.y2 */
/* loaded from: classes2.dex */
public final class C9684y2 implements InterfaceC9658v1 {

    /* renamed from: a */
    private static final C9684y2 f37020a = new C9684y2();

    /* renamed from: b */
    private final C9680x4 f37021b = C9680x4.empty();

    private C9684y2() {
    }

    /* renamed from: a */
    public static C9684y2 m31957a() {
        return f37020a;
    }

    @Override // io.sentry.InterfaceC9658v1
    public void close() {
    }

    @Override // io.sentry.InterfaceC9658v1
    public void endSession() {
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: h */
    public void mo31147h(long j2) {
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: i */
    public /* synthetic */ void mo31148i(C9657v0 c9657v0) {
        C9625u1.m31760a(this, c9657v0);
    }

    @Override // io.sentry.InterfaceC9658v1
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: j */
    public C9558q mo31149j(C9449h4 c9449h4, C9517n1 c9517n1) {
        return C9558q.f36725f;
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: k */
    public /* synthetic */ C9558q mo31150k(C9506l4 c9506l4) {
        return C9625u1.m31762c(this, c9506l4);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: l */
    public InterfaceC9426e2 mo31151l(C9581r5 c9581r5, C9595t5 c9595t5) {
        return C9420d3.m30717r();
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: m */
    public /* synthetic */ C9558q mo31152m(C9565x c9565x, C9528o5 c9528o5, C9517n1 c9517n1) {
        return C9625u1.m31763d(this, c9565x, c9528o5, c9517n1);
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: n */
    public void mo31153n(C9657v0 c9657v0, C9517n1 c9517n1) {
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: o */
    public void mo31154o(InterfaceC9593t3 interfaceC9593t3) {
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: p */
    public void mo31155p(Throwable th, InterfaceC9419d2 interfaceC9419d2, String str) {
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: q */
    public C9680x4 mo31156q() {
        return this.f37021b;
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: r */
    public C9558q mo31157r(C9565x c9565x, C9528o5 c9528o5, C9517n1 c9517n1, C9512m3 c9512m3) {
        return C9558q.f36725f;
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: s */
    public /* synthetic */ C9558q mo31158s(C9449h4 c9449h4) {
        return C9625u1.m31761b(this, c9449h4);
    }

    @Override // io.sentry.InterfaceC9658v1
    public void startSession() {
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: t */
    public C9558q mo31159t(C9506l4 c9506l4, C9517n1 c9517n1) {
        return C9558q.f36725f;
    }

    @Override // io.sentry.InterfaceC9658v1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC9658v1 m41050clone() {
        return f37020a;
    }
}
