package p323h.p324a.p329z.p334e.p339e;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9082s;
import p323h.p324a.InterfaceC9084u;
import p323h.p324a.InterfaceC9086w;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p328y.InterfaceC9098f;
import p323h.p324a.p329z.p330a.EnumC9103c;
import p323h.p324a.p329z.p331b.C9108b;

/* compiled from: SingleFlatMap.java */
/* renamed from: h.a.z.e.e.b */
/* loaded from: classes2.dex */
public final class C9152b<T, R> extends AbstractC9082s<R> {

    /* renamed from: a */
    final InterfaceC9086w<? extends T> f35141a;

    /* renamed from: b */
    final InterfaceC9098f<? super T, ? extends InterfaceC9086w<? extends R>> f35142b;

    /* compiled from: SingleFlatMap.java */
    /* renamed from: h.a.z.e.e.b$a */
    static final class a<T, R> extends AtomicReference<InterfaceC9089c> implements InterfaceC9084u<T>, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9084u<? super R> f35143f;

        /* renamed from: g */
        final InterfaceC9098f<? super T, ? extends InterfaceC9086w<? extends R>> f35144g;

        /* compiled from: SingleFlatMap.java */
        /* renamed from: h.a.z.e.e.b$a$a, reason: collision with other inner class name */
        static final class C11531a<R> implements InterfaceC9084u<R> {

            /* renamed from: f */
            final AtomicReference<InterfaceC9089c> f35145f;

            /* renamed from: g */
            final InterfaceC9084u<? super R> f35146g;

            C11531a(AtomicReference<InterfaceC9089c> atomicReference, InterfaceC9084u<? super R> interfaceC9084u) {
                this.f35145f = atomicReference;
                this.f35146g = interfaceC9084u;
            }

            @Override // p323h.p324a.InterfaceC9084u
            /* renamed from: b */
            public void mo29132b(InterfaceC9089c interfaceC9089c) {
                EnumC9103c.m29252v(this.f35145f, interfaceC9089c);
            }

            @Override // p323h.p324a.InterfaceC9084u
            public void onError(Throwable th) {
                this.f35146g.onError(th);
            }

            @Override // p323h.p324a.InterfaceC9084u
            public void onSuccess(R r) {
                this.f35146g.onSuccess(r);
            }
        }

        a(InterfaceC9084u<? super R> interfaceC9084u, InterfaceC9098f<? super T, ? extends InterfaceC9086w<? extends R>> interfaceC9098f) {
            this.f35143f = interfaceC9084u;
            this.f35144g = interfaceC9098f;
        }

        @Override // p323h.p324a.InterfaceC9084u
        /* renamed from: b */
        public void mo29132b(InterfaceC9089c interfaceC9089c) {
            if (EnumC9103c.m29248A(this, interfaceC9089c)) {
                this.f35143f.mo29132b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9103c.m29250g(this);
        }

        @Override // p323h.p324a.InterfaceC9084u
        public void onError(Throwable th) {
            this.f35143f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9084u
        public void onSuccess(T t) {
            try {
                InterfaceC9086w interfaceC9086w = (InterfaceC9086w) C9108b.m29271c(this.f35144g.mo4660a(t), "The single returned by the mapper is null");
                if (mo29116q()) {
                    return;
                }
                interfaceC9086w.mo29228b(new C11531a(this, this.f35143f));
            } catch (Throwable th) {
                C9240a.m30000a(th);
                this.f35143f.onError(th);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return EnumC9103c.m29251u(get());
        }
    }

    public C9152b(InterfaceC9086w<? extends T> interfaceC9086w, InterfaceC9098f<? super T, ? extends InterfaceC9086w<? extends R>> interfaceC9098f) {
        this.f35142b = interfaceC9098f;
        this.f35141a = interfaceC9086w;
    }

    @Override // p323h.p324a.AbstractC9082s
    /* renamed from: h */
    protected void mo29129h(InterfaceC9084u<? super R> interfaceC9084u) {
        this.f35141a.mo29228b(new a(interfaceC9084u, this.f35142b));
    }
}
