package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9240a;
import io.reactivex.exceptions.CompositeException;
import p323h.p324a.InterfaceC9079p;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p328y.InterfaceC9098f;
import p323h.p324a.p329z.p330a.EnumC9103c;

/* compiled from: ObservableOnErrorReturn.java */
/* renamed from: h.a.z.e.d.o */
/* loaded from: classes2.dex */
public final class C9145o<T> extends AbstractC9131a<T, T> {

    /* renamed from: g */
    final InterfaceC9098f<? super Throwable, ? extends T> f35112g;

    /* compiled from: ObservableOnErrorReturn.java */
    /* renamed from: h.a.z.e.d.o$a */
    static final class a<T> implements InterfaceC9080q<T>, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9080q<? super T> f35113f;

        /* renamed from: g */
        final InterfaceC9098f<? super Throwable, ? extends T> f35114g;

        /* renamed from: h */
        InterfaceC9089c f35115h;

        a(InterfaceC9080q<? super T> interfaceC9080q, InterfaceC9098f<? super Throwable, ? extends T> interfaceC9098f) {
            this.f35113f = interfaceC9080q;
            this.f35114g = interfaceC9098f;
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: a */
        public void mo29218a() {
            this.f35113f.mo29218a();
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: b */
        public void mo29219b(InterfaceC9089c interfaceC9089c) {
            if (EnumC9103c.m29249D(this.f35115h, interfaceC9089c)) {
                this.f35115h = interfaceC9089c;
                this.f35113f.mo29219b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            this.f35115h.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onError(Throwable th) {
            try {
                T tMo4660a = this.f35114g.mo4660a(th);
                if (tMo4660a != null) {
                    this.f35113f.onNext(tMo4660a);
                    this.f35113f.mo29218a();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f35113f.onError(nullPointerException);
                }
            } catch (Throwable th2) {
                C9240a.m30000a(th2);
                this.f35113f.onError(new CompositeException(th, th2));
            }
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onNext(T t) {
            this.f35113f.onNext(t);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35115h.mo29116q();
        }
    }

    public C9145o(InterfaceC9079p<T> interfaceC9079p, InterfaceC9098f<? super Throwable, ? extends T> interfaceC9098f) {
        super(interfaceC9079p);
        this.f35112g = interfaceC9098f;
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    public void mo29214x(InterfaceC9080q<? super T> interfaceC9080q) {
        this.f35009f.mo29199a(new a(interfaceC9080q, this.f35112g));
    }
}
