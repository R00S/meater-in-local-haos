package p323h.p324a.p329z.p334e.p336b;

import p323h.p324a.AbstractC9071h;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p327x.InterfaceC9089c;
import p355k.p356a.InterfaceC9729b;
import p355k.p356a.InterfaceC9730c;

/* compiled from: FlowableFromObservable.java */
/* renamed from: h.a.z.e.b.b */
/* loaded from: classes2.dex */
public final class C9123b<T> extends AbstractC9071h<T> {

    /* renamed from: b */
    private final AbstractC9076m<T> f34974b;

    /* compiled from: FlowableFromObservable.java */
    /* renamed from: h.a.z.e.b.b$a */
    static final class a<T> implements InterfaceC9080q<T>, InterfaceC9730c {

        /* renamed from: f */
        final InterfaceC9729b<? super T> f34975f;

        /* renamed from: g */
        InterfaceC9089c f34976g;

        a(InterfaceC9729b<? super T> interfaceC9729b) {
            this.f34975f = interfaceC9729b;
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: a */
        public void mo29218a() {
            this.f34975f.mo29121a();
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: b */
        public void mo29219b(InterfaceC9089c interfaceC9089c) {
            this.f34976g = interfaceC9089c;
            this.f34975f.mo29122b(this);
        }

        @Override // p355k.p356a.InterfaceC9730c
        public void cancel() {
            this.f34976g.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onError(Throwable th) {
            this.f34975f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onNext(T t) {
            this.f34975f.onNext(t);
        }

        @Override // p355k.p356a.InterfaceC9730c
        public void request(long j2) {
        }
    }

    public C9123b(AbstractC9076m<T> abstractC9076m) {
        this.f34974b = abstractC9076m;
    }

    @Override // p323h.p324a.AbstractC9071h
    /* renamed from: i */
    protected void mo29179i(InterfaceC9729b<? super T> interfaceC9729b) {
        this.f34974b.mo29199a(new a(interfaceC9729b));
    }
}
