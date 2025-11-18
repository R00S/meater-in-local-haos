package p323h.p324a.p329z.p330a;

import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.p327x.InterfaceC9089c;

/* compiled from: SequentialDisposable.java */
/* renamed from: h.a.z.a.f */
/* loaded from: classes2.dex */
public final class C9106f extends AtomicReference<InterfaceC9089c> implements InterfaceC9089c {
    public C9106f() {
    }

    /* renamed from: a */
    public boolean m29261a(InterfaceC9089c interfaceC9089c) {
        return EnumC9103c.m29252v(this, interfaceC9089c);
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: k */
    public void mo29115k() {
        EnumC9103c.m29250g(this);
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: q */
    public boolean mo29116q() {
        return EnumC9103c.m29251u(get());
    }

    public C9106f(InterfaceC9089c interfaceC9089c) {
        lazySet(interfaceC9089c);
    }
}
