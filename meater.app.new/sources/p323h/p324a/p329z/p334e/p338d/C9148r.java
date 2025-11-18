package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9240a;
import java.util.Collection;
import java.util.concurrent.Callable;
import p323h.p324a.InterfaceC9079p;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.EnumC9103c;
import p323h.p324a.p329z.p330a.EnumC9104d;
import p323h.p324a.p329z.p331b.C9108b;

/* compiled from: ObservableToList.java */
/* renamed from: h.a.z.e.d.r */
/* loaded from: classes2.dex */
public final class C9148r<T, U extends Collection<? super T>> extends AbstractC9131a<T, U> {

    /* renamed from: g */
    final Callable<U> f35125g;

    /* compiled from: ObservableToList.java */
    /* renamed from: h.a.z.e.d.r$a */
    static final class a<T, U extends Collection<? super T>> implements InterfaceC9080q<T>, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9080q<? super U> f35126f;

        /* renamed from: g */
        InterfaceC9089c f35127g;

        /* renamed from: h */
        U f35128h;

        a(InterfaceC9080q<? super U> interfaceC9080q, U u) {
            this.f35126f = interfaceC9080q;
            this.f35128h = u;
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: a */
        public void mo29218a() {
            U u = this.f35128h;
            this.f35128h = null;
            this.f35126f.onNext(u);
            this.f35126f.mo29218a();
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: b */
        public void mo29219b(InterfaceC9089c interfaceC9089c) {
            if (EnumC9103c.m29249D(this.f35127g, interfaceC9089c)) {
                this.f35127g = interfaceC9089c;
                this.f35126f.mo29219b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            this.f35127g.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onError(Throwable th) {
            this.f35128h = null;
            this.f35126f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onNext(T t) {
            this.f35128h.add(t);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35127g.mo29116q();
        }
    }

    public C9148r(InterfaceC9079p<T> interfaceC9079p, Callable<U> callable) {
        super(interfaceC9079p);
        this.f35125g = callable;
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    public void mo29214x(InterfaceC9080q<? super U> interfaceC9080q) {
        try {
            this.f35009f.mo29199a(new a(interfaceC9080q, (Collection) C9108b.m29271c(this.f35125g.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C9240a.m30000a(th);
            EnumC9104d.m29257x(th, interfaceC9080q);
        }
    }
}
