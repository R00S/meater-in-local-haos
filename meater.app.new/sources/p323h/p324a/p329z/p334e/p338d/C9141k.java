package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9240a;
import java.util.Iterator;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p329z.p330a.EnumC9104d;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p333d.AbstractC9116b;

/* compiled from: ObservableFromIterable.java */
/* renamed from: h.a.z.e.d.k */
/* loaded from: classes2.dex */
public final class C9141k<T> extends AbstractC9076m<T> {

    /* renamed from: f */
    final Iterable<? extends T> f35089f;

    /* compiled from: ObservableFromIterable.java */
    /* renamed from: h.a.z.e.d.k$a */
    static final class a<T> extends AbstractC9116b<T> {

        /* renamed from: f */
        final InterfaceC9080q<? super T> f35090f;

        /* renamed from: g */
        final Iterator<? extends T> f35091g;

        /* renamed from: h */
        volatile boolean f35092h;

        /* renamed from: i */
        boolean f35093i;

        /* renamed from: j */
        boolean f35094j;

        /* renamed from: k */
        boolean f35095k;

        a(InterfaceC9080q<? super T> interfaceC9080q, Iterator<? extends T> it) {
            this.f35090f = interfaceC9080q;
            this.f35091g = it;
        }

        /* renamed from: a */
        void m29304a() {
            while (!mo29116q()) {
                try {
                    this.f35090f.onNext(C9108b.m29271c(this.f35091g.next(), "The iterator returned a null value"));
                    if (mo29116q()) {
                        return;
                    }
                    try {
                        if (!this.f35091g.hasNext()) {
                            if (mo29116q()) {
                                return;
                            }
                            this.f35090f.mo29218a();
                            return;
                        }
                    } catch (Throwable th) {
                        C9240a.m30000a(th);
                        this.f35090f.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    C9240a.m30000a(th2);
                    this.f35090f.onError(th2);
                    return;
                }
            }
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public void clear() {
            this.f35094j = true;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9111c
        /* renamed from: g */
        public int mo29259g(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            this.f35093i = true;
            return 1;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public boolean isEmpty() {
            return this.f35094j;
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            this.f35092h = true;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public T poll() {
            if (this.f35094j) {
                return null;
            }
            if (!this.f35095k) {
                this.f35095k = true;
            } else if (!this.f35091g.hasNext()) {
                this.f35094j = true;
                return null;
            }
            return (T) C9108b.m29271c(this.f35091g.next(), "The iterator returned a null value");
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35092h;
        }
    }

    public C9141k(Iterable<? extends T> iterable) {
        this.f35089f = iterable;
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    public void mo29214x(InterfaceC9080q<? super T> interfaceC9080q) {
        try {
            Iterator<? extends T> it = this.f35089f.iterator();
            try {
                if (!it.hasNext()) {
                    EnumC9104d.m29256v(interfaceC9080q);
                    return;
                }
                a aVar = new a(interfaceC9080q, it);
                interfaceC9080q.mo29219b(aVar);
                if (aVar.f35093i) {
                    return;
                }
                aVar.m29304a();
            } catch (Throwable th) {
                C9240a.m30000a(th);
                EnumC9104d.m29257x(th, interfaceC9080q);
            }
        } catch (Throwable th2) {
            C9240a.m30000a(th2);
            EnumC9104d.m29257x(th2, interfaceC9080q);
        }
    }
}
