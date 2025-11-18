package io.sentry;

import io.sentry.protocol.C9558q;

/* compiled from: NoOpSpan.java */
/* renamed from: io.sentry.c3 */
/* loaded from: classes2.dex */
public final class C9374c3 implements InterfaceC9419d2 {

    /* renamed from: a */
    private static final C9374c3 f36186a = new C9374c3();

    private C9374c3() {
    }

    /* renamed from: r */
    public static C9374c3 m30546r() {
        return f36186a;
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: b */
    public boolean mo30516b() {
        return false;
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: c */
    public boolean mo30517c(AbstractC9435f4 abstractC9435f4) {
        return false;
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: d */
    public void mo30518d(EnumC9493j5 enumC9493j5) {
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: g */
    public void mo30521g() {
    }

    @Override // io.sentry.InterfaceC9419d2
    public String getDescription() {
        return null;
    }

    @Override // io.sentry.InterfaceC9419d2
    public EnumC9493j5 getStatus() {
        return null;
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: h */
    public void mo30522h(String str, Number number, InterfaceC9659v2 interfaceC9659v2) {
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: j */
    public void mo30524j(String str) {
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: m */
    public C9436f5 mo30527m() {
        return new C9436f5(C9558q.f36725f, C9450h5.f36344f, "op", null, null);
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: n */
    public AbstractC9435f4 mo30528n() {
        return new C9661v4();
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: o */
    public void mo30529o(EnumC9493j5 enumC9493j5, AbstractC9435f4 abstractC9435f4) {
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: q */
    public AbstractC9435f4 mo30531q() {
        return new C9661v4();
    }
}
