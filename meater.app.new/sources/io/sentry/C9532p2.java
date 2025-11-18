package io.sentry;

import io.sentry.vendor.gson.stream.C9667c;
import java.io.IOException;
import java.io.Writer;

/* compiled from: JsonObjectWriter.java */
/* renamed from: io.sentry.p2 */
/* loaded from: classes2.dex */
public final class C9532p2 implements InterfaceC9448h3 {

    /* renamed from: a */
    private final C9667c f36563a;

    /* renamed from: b */
    private final C9525o2 f36564b;

    public C9532p2(Writer writer, int i2) {
        this.f36563a = new C9667c(writer);
        this.f36564b = new C9525o2(i2);
    }

    @Override // io.sentry.InterfaceC9448h3
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C9532p2 mo30829l() throws IOException {
        this.f36563a.m31911c();
        return this;
    }

    @Override // io.sentry.InterfaceC9448h3
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C9532p2 mo30823f() throws IOException {
        this.f36563a.m31912d();
        return this;
    }

    @Override // io.sentry.InterfaceC9448h3
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C9532p2 mo30827j() throws IOException {
        this.f36563a.m31913f();
        return this;
    }

    @Override // io.sentry.InterfaceC9448h3
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C9532p2 mo30821d() throws IOException {
        this.f36563a.m31914j();
        return this;
    }

    @Override // io.sentry.InterfaceC9448h3
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C9532p2 mo30828k(String str) throws IOException {
        this.f36563a.m31915k(str);
        return this;
    }

    @Override // io.sentry.InterfaceC9448h3
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C9532p2 mo30826i() throws IOException {
        this.f36563a.m31916m();
        return this;
    }

    /* renamed from: s */
    public void m31166s(String str) {
        this.f36563a.m31905A(str);
    }

    @Override // io.sentry.InterfaceC9448h3
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C9532p2 mo30818a(long j2) throws IOException {
        this.f36563a.m31906D(j2);
        return this;
    }

    @Override // io.sentry.InterfaceC9448h3
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public C9532p2 mo30824g(InterfaceC9670w1 interfaceC9670w1, Object obj) throws IOException {
        this.f36564b.m31122a(this, interfaceC9670w1, obj);
        return this;
    }

    @Override // io.sentry.InterfaceC9448h3
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C9532p2 mo30825h(Boolean bool) throws IOException {
        this.f36563a.m31907H(bool);
        return this;
    }

    @Override // io.sentry.InterfaceC9448h3
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public C9532p2 mo30822e(Number number) throws IOException {
        this.f36563a.m31908I(number);
        return this;
    }

    @Override // io.sentry.InterfaceC9448h3
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public C9532p2 mo30819b(String str) throws IOException {
        this.f36563a.m31909J(str);
        return this;
    }

    @Override // io.sentry.InterfaceC9448h3
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C9532p2 mo30820c(boolean z) throws IOException {
        this.f36563a.m31910K(z);
        return this;
    }
}
