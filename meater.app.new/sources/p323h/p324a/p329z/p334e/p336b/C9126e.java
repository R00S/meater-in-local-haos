package p323h.p324a.p329z.p334e.p336b;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import p323h.p324a.AbstractC9071h;
import p323h.p324a.InterfaceC9072i;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p329z.p343i.EnumC9175b;
import p323h.p324a.p329z.p344j.C9177b;
import p355k.p356a.InterfaceC9729b;
import p355k.p356a.InterfaceC9730c;

/* compiled from: FlowableOnBackpressureError.java */
/* renamed from: h.a.z.e.b.e */
/* loaded from: classes2.dex */
public final class C9126e<T> extends AbstractC9122a<T, T> {

    /* compiled from: FlowableOnBackpressureError.java */
    /* renamed from: h.a.z.e.b.e$a */
    static final class a<T> extends AtomicLong implements InterfaceC9072i<T>, InterfaceC9730c {

        /* renamed from: f */
        final InterfaceC9729b<? super T> f34996f;

        /* renamed from: g */
        InterfaceC9730c f34997g;

        /* renamed from: h */
        boolean f34998h;

        a(InterfaceC9729b<? super T> interfaceC9729b) {
            this.f34996f = interfaceC9729b;
        }

        @Override // p355k.p356a.InterfaceC9729b
        /* renamed from: a */
        public void mo29121a() {
            if (this.f34998h) {
                return;
            }
            this.f34998h = true;
            this.f34996f.mo29121a();
        }

        @Override // p355k.p356a.InterfaceC9729b
        /* renamed from: b */
        public void mo29122b(InterfaceC9730c interfaceC9730c) {
            if (EnumC9175b.m29383y(this.f34997g, interfaceC9730c)) {
                this.f34997g = interfaceC9730c;
                this.f34996f.mo29122b(this);
                interfaceC9730c.request(Long.MAX_VALUE);
            }
        }

        @Override // p355k.p356a.InterfaceC9730c
        public void cancel() {
            this.f34997g.cancel();
        }

        @Override // p355k.p356a.InterfaceC9729b
        public void onError(Throwable th) {
            if (this.f34998h) {
                C9063a.m29147o(th);
            } else {
                this.f34998h = true;
                this.f34996f.onError(th);
            }
        }

        @Override // p355k.p356a.InterfaceC9729b
        public void onNext(T t) {
            if (this.f34998h) {
                return;
            }
            if (get() == 0) {
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            } else {
                this.f34996f.onNext(t);
                C9177b.m29388c(this, 1L);
            }
        }

        @Override // p355k.p356a.InterfaceC9730c
        public void request(long j2) {
            if (EnumC9175b.m29382x(j2)) {
                C9177b.m29386a(this, j2);
            }
        }
    }

    public C9126e(AbstractC9071h<T> abstractC9071h) {
        super(abstractC9071h);
    }

    @Override // p323h.p324a.AbstractC9071h
    /* renamed from: i */
    protected void mo29179i(InterfaceC9729b<? super T> interfaceC9729b) {
        this.f34973b.m29178h(new a(interfaceC9729b));
    }
}
