package p323h.p324a.p329z.p334e.p335a;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.Callable;
import p323h.p324a.AbstractC9064b;
import p323h.p324a.InterfaceC9067d;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.C9090d;
import p323h.p324a.p327x.InterfaceC9089c;

/* compiled from: CompletableFromCallable.java */
/* renamed from: h.a.z.e.a.b */
/* loaded from: classes2.dex */
public final class C9119b extends AbstractC9064b {

    /* renamed from: a */
    final Callable<?> f34965a;

    public C9119b(Callable<?> callable) {
        this.f34965a = callable;
    }

    @Override // p323h.p324a.AbstractC9064b
    /* renamed from: e */
    protected void mo29113e(InterfaceC9067d interfaceC9067d) {
        InterfaceC9089c interfaceC9089cM29243b = C9090d.m29243b();
        interfaceC9067d.mo29119b(interfaceC9089cM29243b);
        try {
            this.f34965a.call();
            if (interfaceC9089cM29243b.mo29116q()) {
                return;
            }
            interfaceC9067d.mo29118a();
        } catch (Throwable th) {
            C9240a.m30000a(th);
            if (interfaceC9089cM29243b.mo29116q()) {
                C9063a.m29147o(th);
            } else {
                interfaceC9067d.onError(th);
            }
        }
    }
}
