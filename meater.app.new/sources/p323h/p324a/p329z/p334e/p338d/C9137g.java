package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.InterfaceC9067d;
import p323h.p324a.InterfaceC9069f;
import p323h.p324a.InterfaceC9079p;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.C9088b;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p328y.InterfaceC9098f;
import p323h.p324a.p329z.p330a.EnumC9103c;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p333d.AbstractC9115a;
import p323h.p324a.p329z.p344j.C9176a;

/* compiled from: ObservableFlatMapCompletable.java */
/* renamed from: h.a.z.e.d.g */
/* loaded from: classes2.dex */
public final class C9137g<T> extends AbstractC9131a<T, T> {

    /* renamed from: g */
    final InterfaceC9098f<? super T, ? extends InterfaceC9069f> f35052g;

    /* renamed from: h */
    final boolean f35053h;

    /* compiled from: ObservableFlatMapCompletable.java */
    /* renamed from: h.a.z.e.d.g$a */
    static final class a<T> extends AbstractC9115a<T> implements InterfaceC9080q<T> {

        /* renamed from: f */
        final InterfaceC9080q<? super T> f35054f;

        /* renamed from: h */
        final InterfaceC9098f<? super T, ? extends InterfaceC9069f> f35056h;

        /* renamed from: i */
        final boolean f35057i;

        /* renamed from: k */
        InterfaceC9089c f35059k;

        /* renamed from: l */
        volatile boolean f35060l;

        /* renamed from: g */
        final C9176a f35055g = new C9176a();

        /* renamed from: j */
        final C9088b f35058j = new C9088b();

        /* compiled from: ObservableFlatMapCompletable.java */
        /* renamed from: h.a.z.e.d.g$a$a, reason: collision with other inner class name */
        final class C11527a extends AtomicReference<InterfaceC9089c> implements InterfaceC9067d, InterfaceC9089c {
            C11527a() {
            }

            @Override // p323h.p324a.InterfaceC9067d
            /* renamed from: a */
            public void mo29118a() {
                a.this.m29293c(this);
            }

            @Override // p323h.p324a.InterfaceC9067d
            /* renamed from: b */
            public void mo29119b(InterfaceC9089c interfaceC9089c) {
                EnumC9103c.m29248A(this, interfaceC9089c);
            }

            @Override // p323h.p324a.p327x.InterfaceC9089c
            /* renamed from: k */
            public void mo29115k() {
                EnumC9103c.m29250g(this);
            }

            @Override // p323h.p324a.InterfaceC9067d
            public void onError(Throwable th) {
                a.this.m29294d(this, th);
            }

            @Override // p323h.p324a.p327x.InterfaceC9089c
            /* renamed from: q */
            public boolean mo29116q() {
                return EnumC9103c.m29251u(get());
            }
        }

        a(InterfaceC9080q<? super T> interfaceC9080q, InterfaceC9098f<? super T, ? extends InterfaceC9069f> interfaceC9098f, boolean z) {
            this.f35054f = interfaceC9080q;
            this.f35056h = interfaceC9098f;
            this.f35057i = z;
            lazySet(1);
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: a */
        public void mo29218a() {
            if (decrementAndGet() == 0) {
                Throwable thM29385b = this.f35055g.m29385b();
                if (thM29385b != null) {
                    this.f35054f.onError(thM29385b);
                } else {
                    this.f35054f.mo29218a();
                }
            }
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: b */
        public void mo29219b(InterfaceC9089c interfaceC9089c) {
            if (EnumC9103c.m29249D(this.f35059k, interfaceC9089c)) {
                this.f35059k = interfaceC9089c;
                this.f35054f.mo29219b(this);
            }
        }

        /* renamed from: c */
        void m29293c(a<T>.C11527a c11527a) {
            this.f35058j.mo29240c(c11527a);
            mo29218a();
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public void clear() {
        }

        /* renamed from: d */
        void m29294d(a<T>.C11527a c11527a, Throwable th) {
            this.f35058j.mo29240c(c11527a);
            onError(th);
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9111c
        /* renamed from: g */
        public int mo29259g(int i2) {
            return i2 & 2;
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public boolean isEmpty() {
            return true;
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            this.f35060l = true;
            this.f35059k.mo29115k();
            this.f35058j.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onError(Throwable th) {
            if (!this.f35055g.m29384a(th)) {
                C9063a.m29147o(th);
                return;
            }
            if (this.f35057i) {
                if (decrementAndGet() == 0) {
                    this.f35054f.onError(this.f35055g.m29385b());
                    return;
                }
                return;
            }
            mo29115k();
            if (getAndSet(0) > 0) {
                this.f35054f.onError(this.f35055g.m29385b());
            }
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onNext(T t) {
            try {
                InterfaceC9069f interfaceC9069f = (InterfaceC9069f) C9108b.m29271c(this.f35056h.mo4660a(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C11527a c11527a = new C11527a();
                if (this.f35060l || !this.f35058j.mo29239b(c11527a)) {
                    return;
                }
                interfaceC9069f.mo29160b(c11527a);
            } catch (Throwable th) {
                C9240a.m30000a(th);
                this.f35059k.mo29115k();
                onError(th);
            }
        }

        @Override // p323h.p324a.p329z.p332c.InterfaceC9114f
        public T poll() throws Exception {
            return null;
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35059k.mo29116q();
        }
    }

    public C9137g(InterfaceC9079p<T> interfaceC9079p, InterfaceC9098f<? super T, ? extends InterfaceC9069f> interfaceC9098f, boolean z) {
        super(interfaceC9079p);
        this.f35052g = interfaceC9098f;
        this.f35053h = z;
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    protected void mo29214x(InterfaceC9080q<? super T> interfaceC9080q) {
        this.f35009f.mo29199a(new a(interfaceC9080q, this.f35052g, this.f35053h));
    }
}
