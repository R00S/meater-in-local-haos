package p323h.p324a.p329z.p330a;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p328y.InterfaceC9096d;

/* compiled from: CancellableDisposable.java */
/* renamed from: h.a.z.a.a */
/* loaded from: classes2.dex */
public final class C9101a extends AtomicReference<InterfaceC9096d> implements InterfaceC9089c {
    public C9101a(InterfaceC9096d interfaceC9096d) {
        super(interfaceC9096d);
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: k */
    public void mo29115k() {
        InterfaceC9096d andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e2) {
            C9240a.m30000a(e2);
            C9063a.m29147o(e2);
        }
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: q */
    public boolean mo29116q() {
        return get() == null;
    }
}
