package p323h.p324a.p329z.p334e.p338d;

import p323h.p324a.AbstractC9076m;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p329z.p332c.InterfaceCallableC9112d;
import p323h.p324a.p329z.p334e.p338d.C9146p;

/* compiled from: ObservableJust.java */
/* renamed from: h.a.z.e.d.m */
/* loaded from: classes2.dex */
public final class C9143m<T> extends AbstractC9076m<T> implements InterfaceCallableC9112d<T> {

    /* renamed from: f */
    private final T f35097f;

    public C9143m(T t) {
        this.f35097f = t;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceCallableC9112d, java.util.concurrent.Callable
    public T call() {
        return this.f35097f;
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    protected void mo29214x(InterfaceC9080q<? super T> interfaceC9080q) {
        C9146p.a aVar = new C9146p.a(interfaceC9080q, this.f35097f);
        interfaceC9080q.mo29219b(aVar);
        aVar.run();
    }
}
