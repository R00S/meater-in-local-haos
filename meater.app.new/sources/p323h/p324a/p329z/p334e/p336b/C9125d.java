package p323h.p324a.p329z.p334e.p336b;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.atomic.AtomicLong;
import p323h.p324a.AbstractC9071h;
import p323h.p324a.InterfaceC9072i;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p328y.InterfaceC9097e;
import p323h.p324a.p329z.p343i.EnumC9175b;
import p323h.p324a.p329z.p344j.C9177b;
import p355k.p356a.InterfaceC9729b;
import p355k.p356a.InterfaceC9730c;

/* compiled from: FlowableOnBackpressureDrop.java */
/* renamed from: h.a.z.e.b.d */
/* loaded from: classes2.dex */
public final class C9125d<T> extends AbstractC9122a<T, T> implements InterfaceC9097e<T> {

    /* renamed from: c */
    final InterfaceC9097e<? super T> f34991c;

    /* compiled from: FlowableOnBackpressureDrop.java */
    /* renamed from: h.a.z.e.b.d$a */
    static final class a<T> extends AtomicLong implements InterfaceC9072i<T>, InterfaceC9730c {

        /* renamed from: f */
        final InterfaceC9729b<? super T> f34992f;

        /* renamed from: g */
        final InterfaceC9097e<? super T> f34993g;

        /* renamed from: h */
        InterfaceC9730c f34994h;

        /* renamed from: i */
        boolean f34995i;

        a(InterfaceC9729b<? super T> interfaceC9729b, InterfaceC9097e<? super T> interfaceC9097e) {
            this.f34992f = interfaceC9729b;
            this.f34993g = interfaceC9097e;
        }

        @Override // p355k.p356a.InterfaceC9729b
        /* renamed from: a */
        public void mo29121a() {
            if (this.f34995i) {
                return;
            }
            this.f34995i = true;
            this.f34992f.mo29121a();
        }

        @Override // p355k.p356a.InterfaceC9729b
        /* renamed from: b */
        public void mo29122b(InterfaceC9730c interfaceC9730c) {
            if (EnumC9175b.m29383y(this.f34994h, interfaceC9730c)) {
                this.f34994h = interfaceC9730c;
                this.f34992f.mo29122b(this);
                interfaceC9730c.request(Long.MAX_VALUE);
            }
        }

        @Override // p355k.p356a.InterfaceC9730c
        public void cancel() {
            this.f34994h.cancel();
        }

        @Override // p355k.p356a.InterfaceC9729b
        public void onError(Throwable th) {
            if (this.f34995i) {
                C9063a.m29147o(th);
            } else {
                this.f34995i = true;
                this.f34992f.onError(th);
            }
        }

        @Override // p355k.p356a.InterfaceC9729b
        public void onNext(T t) {
            if (this.f34995i) {
                return;
            }
            if (get() != 0) {
                this.f34992f.onNext(t);
                C9177b.m29388c(this, 1L);
                return;
            }
            try {
                this.f34993g.mo7420a(t);
            } catch (Throwable th) {
                C9240a.m30000a(th);
                cancel();
                onError(th);
            }
        }

        @Override // p355k.p356a.InterfaceC9730c
        public void request(long j2) {
            if (EnumC9175b.m29382x(j2)) {
                C9177b.m29386a(this, j2);
            }
        }
    }

    public C9125d(AbstractC9071h<T> abstractC9071h) {
        super(abstractC9071h);
        this.f34991c = this;
    }

    @Override // p323h.p324a.p328y.InterfaceC9097e
    /* renamed from: a */
    public void mo7420a(T t) {
    }

    @Override // p323h.p324a.AbstractC9071h
    /* renamed from: i */
    protected void mo29179i(InterfaceC9729b<? super T> interfaceC9729b) {
        this.f34973b.m29178h(new a(interfaceC9729b, this.f34991c));
    }
}
