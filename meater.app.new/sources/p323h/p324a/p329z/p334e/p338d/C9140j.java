package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9240a;
import java.util.Iterator;
import p323h.p324a.InterfaceC9079p;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p328y.InterfaceC9098f;
import p323h.p324a.p329z.p330a.EnumC9103c;
import p323h.p324a.p329z.p331b.C9108b;

/* compiled from: ObservableFlattenIterable.java */
/* renamed from: h.a.z.e.d.j */
/* loaded from: classes2.dex */
public final class C9140j<T, R> extends AbstractC9131a<T, R> {

    /* renamed from: g */
    final InterfaceC9098f<? super T, ? extends Iterable<? extends R>> f35085g;

    /* compiled from: ObservableFlattenIterable.java */
    /* renamed from: h.a.z.e.d.j$a */
    static final class a<T, R> implements InterfaceC9080q<T>, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9080q<? super R> f35086f;

        /* renamed from: g */
        final InterfaceC9098f<? super T, ? extends Iterable<? extends R>> f35087g;

        /* renamed from: h */
        InterfaceC9089c f35088h;

        a(InterfaceC9080q<? super R> interfaceC9080q, InterfaceC9098f<? super T, ? extends Iterable<? extends R>> interfaceC9098f) {
            this.f35086f = interfaceC9080q;
            this.f35087g = interfaceC9098f;
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: a */
        public void mo29218a() {
            InterfaceC9089c interfaceC9089c = this.f35088h;
            EnumC9103c enumC9103c = EnumC9103c.DISPOSED;
            if (interfaceC9089c == enumC9103c) {
                return;
            }
            this.f35088h = enumC9103c;
            this.f35086f.mo29218a();
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: b */
        public void mo29219b(InterfaceC9089c interfaceC9089c) {
            if (EnumC9103c.m29249D(this.f35088h, interfaceC9089c)) {
                this.f35088h = interfaceC9089c;
                this.f35086f.mo29219b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            this.f35088h.mo29115k();
            this.f35088h = EnumC9103c.DISPOSED;
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onError(Throwable th) {
            InterfaceC9089c interfaceC9089c = this.f35088h;
            EnumC9103c enumC9103c = EnumC9103c.DISPOSED;
            if (interfaceC9089c == enumC9103c) {
                C9063a.m29147o(th);
            } else {
                this.f35088h = enumC9103c;
                this.f35086f.onError(th);
            }
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onNext(T t) {
            if (this.f35088h == EnumC9103c.DISPOSED) {
                return;
            }
            try {
                Iterator<? extends R> it = this.f35087g.mo4660a(t).iterator();
                InterfaceC9080q<? super R> interfaceC9080q = this.f35086f;
                while (it.hasNext()) {
                    try {
                        try {
                            interfaceC9080q.onNext((Object) C9108b.m29271c(it.next(), "The iterator returned a null value"));
                        } catch (Throwable th) {
                            C9240a.m30000a(th);
                            this.f35088h.mo29115k();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        C9240a.m30000a(th2);
                        this.f35088h.mo29115k();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                C9240a.m30000a(th3);
                this.f35088h.mo29115k();
                onError(th3);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35088h.mo29116q();
        }
    }

    public C9140j(InterfaceC9079p<T> interfaceC9079p, InterfaceC9098f<? super T, ? extends Iterable<? extends R>> interfaceC9098f) {
        super(interfaceC9079p);
        this.f35085g = interfaceC9098f;
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    protected void mo29214x(InterfaceC9080q<? super R> interfaceC9080q) {
        this.f35009f.mo29199a(new a(interfaceC9080q, this.f35085g));
    }
}
