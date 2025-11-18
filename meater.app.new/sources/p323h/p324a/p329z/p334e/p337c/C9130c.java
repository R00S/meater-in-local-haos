package p323h.p324a.p329z.p334e.p337c;

import p323h.p324a.AbstractC9073j;
import p323h.p324a.InterfaceC9074k;
import p323h.p324a.p327x.C9090d;
import p323h.p324a.p329z.p332c.InterfaceCallableC9112d;

/* compiled from: MaybeJust.java */
/* renamed from: h.a.z.e.c.c */
/* loaded from: classes2.dex */
public final class C9130c<T> extends AbstractC9073j<T> implements InterfaceCallableC9112d<T> {

    /* renamed from: f */
    final T f35008f;

    public C9130c(T t) {
        this.f35008f = t;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceCallableC9112d, java.util.concurrent.Callable
    public T call() {
        return this.f35008f;
    }

    @Override // p323h.p324a.AbstractC9073j
    /* renamed from: e */
    protected void mo29184e(InterfaceC9074k<? super T> interfaceC9074k) {
        interfaceC9074k.mo29186b(C9090d.m29242a());
        interfaceC9074k.onSuccess(this.f35008f);
    }
}
