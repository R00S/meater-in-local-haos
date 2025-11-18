package p323h.p324a.p329z.p334e.p339e;

import io.reactivex.exceptions.C9240a;
import p323h.p324a.AbstractC9082s;
import p323h.p324a.InterfaceC9084u;
import p323h.p324a.InterfaceC9086w;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p328y.InterfaceC9098f;
import p323h.p324a.p329z.p331b.C9108b;

/* compiled from: SingleMap.java */
/* renamed from: h.a.z.e.e.d */
/* loaded from: classes2.dex */
public final class C9154d<T, R> extends AbstractC9082s<R> {

    /* renamed from: a */
    final InterfaceC9086w<? extends T> f35148a;

    /* renamed from: b */
    final InterfaceC9098f<? super T, ? extends R> f35149b;

    /* compiled from: SingleMap.java */
    /* renamed from: h.a.z.e.e.d$a */
    static final class a<T, R> implements InterfaceC9084u<T> {

        /* renamed from: f */
        final InterfaceC9084u<? super R> f35150f;

        /* renamed from: g */
        final InterfaceC9098f<? super T, ? extends R> f35151g;

        a(InterfaceC9084u<? super R> interfaceC9084u, InterfaceC9098f<? super T, ? extends R> interfaceC9098f) {
            this.f35150f = interfaceC9084u;
            this.f35151g = interfaceC9098f;
        }

        @Override // p323h.p324a.InterfaceC9084u
        /* renamed from: b */
        public void mo29132b(InterfaceC9089c interfaceC9089c) {
            this.f35150f.mo29132b(interfaceC9089c);
        }

        @Override // p323h.p324a.InterfaceC9084u
        public void onError(Throwable th) {
            this.f35150f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9084u
        public void onSuccess(T t) {
            try {
                this.f35150f.onSuccess(C9108b.m29271c(this.f35151g.mo4660a(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                C9240a.m30000a(th);
                onError(th);
            }
        }
    }

    public C9154d(InterfaceC9086w<? extends T> interfaceC9086w, InterfaceC9098f<? super T, ? extends R> interfaceC9098f) {
        this.f35148a = interfaceC9086w;
        this.f35149b = interfaceC9098f;
    }

    @Override // p323h.p324a.AbstractC9082s
    /* renamed from: h */
    protected void mo29129h(InterfaceC9084u<? super R> interfaceC9084u) {
        this.f35148a.mo29228b(new a(interfaceC9084u, this.f35149b));
    }
}
