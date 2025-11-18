package p323h.p324a.p329z.p334e.p339e;

import p323h.p324a.AbstractC9076m;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.InterfaceC9084u;
import p323h.p324a.InterfaceC9086w;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.EnumC9103c;
import p323h.p324a.p329z.p333d.C9117c;

/* compiled from: SingleToObservable.java */
/* renamed from: h.a.z.e.e.f */
/* loaded from: classes2.dex */
public final class C9156f<T> extends AbstractC9076m<T> {

    /* renamed from: f */
    final InterfaceC9086w<? extends T> f35157f;

    /* compiled from: SingleToObservable.java */
    /* renamed from: h.a.z.e.e.f$a */
    static final class a<T> extends C9117c<T> implements InterfaceC9084u<T> {

        /* renamed from: h */
        InterfaceC9089c f35158h;

        a(InterfaceC9080q<? super T> interfaceC9080q) {
            super(interfaceC9080q);
        }

        @Override // p323h.p324a.InterfaceC9084u
        /* renamed from: b */
        public void mo29132b(InterfaceC9089c interfaceC9089c) {
            if (EnumC9103c.m29249D(this.f35158h, interfaceC9089c)) {
                this.f35158h = interfaceC9089c;
                this.f34961f.mo29219b(this);
            }
        }

        @Override // p323h.p324a.p329z.p333d.C9117c, p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            super.mo29115k();
            this.f35158h.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9084u
        public void onError(Throwable th) {
            m29275d(th);
        }

        @Override // p323h.p324a.InterfaceC9084u
        public void onSuccess(T t) {
            m29274c(t);
        }
    }

    public C9156f(InterfaceC9086w<? extends T> interfaceC9086w) {
        this.f35157f = interfaceC9086w;
    }

    /* renamed from: E */
    public static <T> InterfaceC9084u<T> m29314E(InterfaceC9080q<? super T> interfaceC9080q) {
        return new a(interfaceC9080q);
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    public void mo29214x(InterfaceC9080q<? super T> interfaceC9080q) {
        this.f35157f.mo29228b(m29314E(interfaceC9080q));
    }
}
