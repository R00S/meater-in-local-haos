package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9240a;
import java.util.Collection;
import java.util.concurrent.Callable;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.AbstractC9082s;
import p323h.p324a.InterfaceC9079p;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.InterfaceC9084u;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.EnumC9103c;
import p323h.p324a.p329z.p330a.EnumC9104d;
import p323h.p324a.p329z.p331b.C9107a;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p332c.InterfaceC9109a;

/* compiled from: ObservableToListSingle.java */
/* renamed from: h.a.z.e.d.s */
/* loaded from: classes2.dex */
public final class C9149s<T, U extends Collection<? super T>> extends AbstractC9082s<U> implements InterfaceC9109a<U> {

    /* renamed from: a */
    final InterfaceC9079p<T> f35129a;

    /* renamed from: b */
    final Callable<U> f35130b;

    /* compiled from: ObservableToListSingle.java */
    /* renamed from: h.a.z.e.d.s$a */
    static final class a<T, U extends Collection<? super T>> implements InterfaceC9080q<T>, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9084u<? super U> f35131f;

        /* renamed from: g */
        U f35132g;

        /* renamed from: h */
        InterfaceC9089c f35133h;

        a(InterfaceC9084u<? super U> interfaceC9084u, U u) {
            this.f35131f = interfaceC9084u;
            this.f35132g = u;
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: a */
        public void mo29218a() {
            U u = this.f35132g;
            this.f35132g = null;
            this.f35131f.onSuccess(u);
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: b */
        public void mo29219b(InterfaceC9089c interfaceC9089c) {
            if (EnumC9103c.m29249D(this.f35133h, interfaceC9089c)) {
                this.f35133h = interfaceC9089c;
                this.f35131f.mo29132b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            this.f35133h.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onError(Throwable th) {
            this.f35132g = null;
            this.f35131f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onNext(T t) {
            this.f35132g.add(t);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35133h.mo29116q();
        }
    }

    public C9149s(InterfaceC9079p<T> interfaceC9079p, int i2) {
        this.f35129a = interfaceC9079p;
        this.f35130b = C9107a.m29262a(i2);
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9109a
    /* renamed from: a */
    public AbstractC9076m<U> mo29273a() {
        return C9063a.m29145m(new C9148r(this.f35129a, this.f35130b));
    }

    @Override // p323h.p324a.AbstractC9082s
    /* renamed from: h */
    public void mo29129h(InterfaceC9084u<? super U> interfaceC9084u) {
        try {
            this.f35129a.mo29199a(new a(interfaceC9084u, (Collection) C9108b.m29271c(this.f35130b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C9240a.m30000a(th);
            EnumC9104d.m29258y(th, interfaceC9084u);
        }
    }
}
