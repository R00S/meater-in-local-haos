package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9064b;
import p323h.p324a.AbstractC9076m;
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
import p323h.p324a.p329z.p332c.InterfaceC9109a;
import p323h.p324a.p329z.p344j.C9176a;

/* compiled from: ObservableFlatMapCompletableCompletable.java */
/* renamed from: h.a.z.e.d.h */
/* loaded from: classes2.dex */
public final class C9138h<T> extends AbstractC9064b implements InterfaceC9109a<T> {

    /* renamed from: a */
    final InterfaceC9079p<T> f35062a;

    /* renamed from: b */
    final InterfaceC9098f<? super T, ? extends InterfaceC9069f> f35063b;

    /* renamed from: c */
    final boolean f35064c;

    /* compiled from: ObservableFlatMapCompletableCompletable.java */
    /* renamed from: h.a.z.e.d.h$a */
    static final class a<T> extends AtomicInteger implements InterfaceC9089c, InterfaceC9080q<T> {

        /* renamed from: f */
        final InterfaceC9067d f35065f;

        /* renamed from: h */
        final InterfaceC9098f<? super T, ? extends InterfaceC9069f> f35067h;

        /* renamed from: i */
        final boolean f35068i;

        /* renamed from: k */
        InterfaceC9089c f35070k;

        /* renamed from: l */
        volatile boolean f35071l;

        /* renamed from: g */
        final C9176a f35066g = new C9176a();

        /* renamed from: j */
        final C9088b f35069j = new C9088b();

        /* compiled from: ObservableFlatMapCompletableCompletable.java */
        /* renamed from: h.a.z.e.d.h$a$a, reason: collision with other inner class name */
        final class C11528a extends AtomicReference<InterfaceC9089c> implements InterfaceC9067d, InterfaceC9089c {
            C11528a() {
            }

            @Override // p323h.p324a.InterfaceC9067d
            /* renamed from: a */
            public void mo29118a() {
                a.this.m29295c(this);
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
                a.this.m29296d(this, th);
            }

            @Override // p323h.p324a.p327x.InterfaceC9089c
            /* renamed from: q */
            public boolean mo29116q() {
                return EnumC9103c.m29251u(get());
            }
        }

        a(InterfaceC9067d interfaceC9067d, InterfaceC9098f<? super T, ? extends InterfaceC9069f> interfaceC9098f, boolean z) {
            this.f35065f = interfaceC9067d;
            this.f35067h = interfaceC9098f;
            this.f35068i = z;
            lazySet(1);
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: a */
        public void mo29218a() {
            if (decrementAndGet() == 0) {
                Throwable thM29385b = this.f35066g.m29385b();
                if (thM29385b != null) {
                    this.f35065f.onError(thM29385b);
                } else {
                    this.f35065f.mo29118a();
                }
            }
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: b */
        public void mo29219b(InterfaceC9089c interfaceC9089c) {
            if (EnumC9103c.m29249D(this.f35070k, interfaceC9089c)) {
                this.f35070k = interfaceC9089c;
                this.f35065f.mo29119b(this);
            }
        }

        /* renamed from: c */
        void m29295c(a<T>.C11528a c11528a) {
            this.f35069j.mo29240c(c11528a);
            mo29218a();
        }

        /* renamed from: d */
        void m29296d(a<T>.C11528a c11528a, Throwable th) {
            this.f35069j.mo29240c(c11528a);
            onError(th);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            this.f35071l = true;
            this.f35070k.mo29115k();
            this.f35069j.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onError(Throwable th) {
            if (!this.f35066g.m29384a(th)) {
                C9063a.m29147o(th);
                return;
            }
            if (this.f35068i) {
                if (decrementAndGet() == 0) {
                    this.f35065f.onError(this.f35066g.m29385b());
                    return;
                }
                return;
            }
            mo29115k();
            if (getAndSet(0) > 0) {
                this.f35065f.onError(this.f35066g.m29385b());
            }
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onNext(T t) {
            try {
                InterfaceC9069f interfaceC9069f = (InterfaceC9069f) C9108b.m29271c(this.f35067h.mo4660a(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C11528a c11528a = new C11528a();
                if (this.f35071l || !this.f35069j.mo29239b(c11528a)) {
                    return;
                }
                interfaceC9069f.mo29160b(c11528a);
            } catch (Throwable th) {
                C9240a.m30000a(th);
                this.f35070k.mo29115k();
                onError(th);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35070k.mo29116q();
        }
    }

    public C9138h(InterfaceC9079p<T> interfaceC9079p, InterfaceC9098f<? super T, ? extends InterfaceC9069f> interfaceC9098f, boolean z) {
        this.f35062a = interfaceC9079p;
        this.f35063b = interfaceC9098f;
        this.f35064c = z;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9109a
    /* renamed from: a */
    public AbstractC9076m<T> mo29273a() {
        return C9063a.m29145m(new C9137g(this.f35062a, this.f35063b, this.f35064c));
    }

    @Override // p323h.p324a.AbstractC9064b
    /* renamed from: e */
    protected void mo29113e(InterfaceC9067d interfaceC9067d) {
        this.f35062a.mo29199a(new a(interfaceC9067d, this.f35063b, this.f35064c));
    }
}
