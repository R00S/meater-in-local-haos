package p323h.p324a.p327x;

import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.p329z.p331b.C9108b;

/* compiled from: ReferenceDisposable.java */
/* renamed from: h.a.x.e */
/* loaded from: classes2.dex */
abstract class AbstractC9091e<T> extends AtomicReference<T> implements InterfaceC9089c {
    AbstractC9091e(T t) {
        super(C9108b.m29271c(t, "value is null"));
    }

    /* renamed from: a */
    protected abstract void mo29236a(T t);

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: k */
    public final void mo29115k() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        mo29236a(andSet);
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: q */
    public final boolean mo29116q() {
        return get() == null;
    }
}
