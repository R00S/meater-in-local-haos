package p323h.p324a.p329z.p330a;

import p323h.p324a.InterfaceC9074k;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.InterfaceC9084u;
import p323h.p324a.p329z.p332c.InterfaceC9110b;

/* compiled from: EmptyDisposable.java */
/* renamed from: h.a.z.a.d */
/* loaded from: classes2.dex */
public enum EnumC9104d implements InterfaceC9110b<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: u */
    public static void m29255u(InterfaceC9074k<?> interfaceC9074k) {
        interfaceC9074k.mo29186b(INSTANCE);
        interfaceC9074k.mo29185a();
    }

    /* renamed from: v */
    public static void m29256v(InterfaceC9080q<?> interfaceC9080q) {
        interfaceC9080q.mo29219b(INSTANCE);
        interfaceC9080q.mo29218a();
    }

    /* renamed from: x */
    public static void m29257x(Throwable th, InterfaceC9080q<?> interfaceC9080q) {
        interfaceC9080q.mo29219b(INSTANCE);
        interfaceC9080q.onError(th);
    }

    /* renamed from: y */
    public static void m29258y(Throwable th, InterfaceC9084u<?> interfaceC9084u) {
        interfaceC9084u.mo29132b(INSTANCE);
        interfaceC9084u.onError(th);
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
    public void clear() {
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9111c
    /* renamed from: g */
    public int mo29259g(int i2) {
        return i2 & 2;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
    public boolean isEmpty() {
        return true;
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: k */
    public void mo29115k() {
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
    public Object poll() throws Exception {
        return null;
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: q */
    public boolean mo29116q() {
        return this == INSTANCE;
    }
}
