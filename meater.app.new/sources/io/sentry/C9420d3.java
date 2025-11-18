package io.sentry;

import io.sentry.protocol.C9558q;
import io.sentry.protocol.EnumC9567z;
import okhttp3.HttpUrl;

/* compiled from: NoOpTransaction.java */
/* renamed from: io.sentry.d3 */
/* loaded from: classes2.dex */
public final class C9420d3 implements InterfaceC9426e2 {

    /* renamed from: a */
    private static final C9420d3 f36263a = new C9420d3();

    private C9420d3() {
    }

    /* renamed from: r */
    public static C9420d3 m30717r() {
        return f36263a;
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: a */
    public C9528o5 mo30515a() {
        return new C9528o5(C9558q.f36725f, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: b */
    public boolean mo30516b() {
        return true;
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

    @Override // io.sentry.InterfaceC9426e2
    /* renamed from: e */
    public void mo30519e(EnumC9493j5 enumC9493j5, boolean z) {
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: f */
    public InterfaceC9419d2 mo30520f(String str, String str2, AbstractC9435f4 abstractC9435f4, EnumC9447h2 enumC9447h2) {
        return C9374c3.m30546r();
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: g */
    public void mo30521g() {
    }

    @Override // io.sentry.InterfaceC9419d2
    public String getDescription() {
        return null;
    }

    @Override // io.sentry.InterfaceC9426e2
    public String getName() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // io.sentry.InterfaceC9419d2
    public EnumC9493j5 getStatus() {
        return null;
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: h */
    public void mo30522h(String str, Number number, InterfaceC9659v2 interfaceC9659v2) {
    }

    @Override // io.sentry.InterfaceC9426e2
    /* renamed from: i */
    public C9429e5 mo30523i() {
        return null;
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: j */
    public void mo30524j(String str) {
    }

    @Override // io.sentry.InterfaceC9426e2
    /* renamed from: k */
    public C9558q mo30525k() {
        return C9558q.f36725f;
    }

    @Override // io.sentry.InterfaceC9426e2
    /* renamed from: l */
    public void mo30526l() {
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

    @Override // io.sentry.InterfaceC9426e2
    /* renamed from: p */
    public EnumC9567z mo30530p() {
        return EnumC9567z.CUSTOM;
    }

    @Override // io.sentry.InterfaceC9419d2
    /* renamed from: q */
    public AbstractC9435f4 mo30531q() {
        return new C9661v4();
    }
}
