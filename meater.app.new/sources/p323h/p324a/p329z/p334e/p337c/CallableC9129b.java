package p323h.p324a.p329z.p334e.p337c;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.Callable;
import p323h.p324a.AbstractC9073j;
import p323h.p324a.InterfaceC9074k;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.C9090d;
import p323h.p324a.p327x.InterfaceC9089c;

/* compiled from: MaybeFromCallable.java */
/* renamed from: h.a.z.e.c.b */
/* loaded from: classes2.dex */
public final class CallableC9129b<T> extends AbstractC9073j<T> implements Callable<T> {

    /* renamed from: f */
    final Callable<? extends T> f35007f;

    public CallableC9129b(Callable<? extends T> callable) {
        this.f35007f = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.f35007f.call();
    }

    @Override // p323h.p324a.AbstractC9073j
    /* renamed from: e */
    protected void mo29184e(InterfaceC9074k<? super T> interfaceC9074k) {
        InterfaceC9089c interfaceC9089cM29243b = C9090d.m29243b();
        interfaceC9074k.mo29186b(interfaceC9089cM29243b);
        if (interfaceC9089cM29243b.mo29116q()) {
            return;
        }
        try {
            T tCall = this.f35007f.call();
            if (interfaceC9089cM29243b.mo29116q()) {
                return;
            }
            if (tCall == null) {
                interfaceC9074k.mo29185a();
            } else {
                interfaceC9074k.onSuccess(tCall);
            }
        } catch (Throwable th) {
            C9240a.m30000a(th);
            if (interfaceC9089cM29243b.mo29116q()) {
                C9063a.m29147o(th);
            } else {
                interfaceC9074k.onError(th);
            }
        }
    }
}
