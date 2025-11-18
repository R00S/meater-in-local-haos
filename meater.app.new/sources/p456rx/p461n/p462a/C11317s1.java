package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p456rx.AbstractC11243h;
import p456rx.AbstractC11244i;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p471q.C11409c;

/* compiled from: SingleTimeout.java */
/* renamed from: rx.n.a.s1 */
/* loaded from: classes3.dex */
public final class C11317s1<T> implements Single.InterfaceC11229j<T> {

    /* renamed from: f */
    final Single.InterfaceC11229j<T> f42595f;

    /* renamed from: g */
    final long f42596g;

    /* renamed from: h */
    final TimeUnit f42597h;

    /* renamed from: i */
    final AbstractC11243h f42598i;

    /* renamed from: j */
    final Single.InterfaceC11229j<? extends T> f42599j;

    /* compiled from: SingleTimeout.java */
    /* renamed from: rx.n.a.s1$a */
    static final class a<T> extends AbstractC11244i<T> implements InterfaceC11252a {

        /* renamed from: g */
        final AbstractC11244i<? super T> f42600g;

        /* renamed from: h */
        final AtomicBoolean f42601h = new AtomicBoolean();

        /* renamed from: i */
        final Single.InterfaceC11229j<? extends T> f42602i;

        /* compiled from: SingleTimeout.java */
        /* renamed from: rx.n.a.s1$a$a, reason: collision with other inner class name */
        static final class C11604a<T> extends AbstractC11244i<T> {

            /* renamed from: g */
            final AbstractC11244i<? super T> f42603g;

            C11604a(AbstractC11244i<? super T> abstractC11244i) {
                this.f42603g = abstractC11244i;
            }

            @Override // p456rx.AbstractC11244i
            /* renamed from: c */
            public void mo29130c(T t) {
                this.f42603g.mo29130c(t);
            }

            @Override // p456rx.AbstractC11244i
            public void onError(Throwable th) {
                this.f42603g.onError(th);
            }
        }

        a(AbstractC11244i<? super T> abstractC11244i, Single.InterfaceC11229j<? extends T> interfaceC11229j) {
            this.f42600g = abstractC11244i;
            this.f42602i = interfaceC11229j;
        }

        @Override // p456rx.AbstractC11244i
        /* renamed from: c */
        public void mo29130c(T t) {
            if (this.f42601h.compareAndSet(false, true)) {
                try {
                    this.f42600g.mo29130c(t);
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            if (this.f42601h.compareAndSet(false, true)) {
                try {
                    Single.InterfaceC11229j<? extends T> interfaceC11229j = this.f42602i;
                    if (interfaceC11229j == null) {
                        this.f42600g.onError(new TimeoutException());
                    } else {
                        C11604a c11604a = new C11604a(this.f42600g);
                        this.f42600g.m40149b(c11604a);
                        interfaceC11229j.call(c11604a);
                    }
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // p456rx.AbstractC11244i
        public void onError(Throwable th) {
            if (!this.f42601h.compareAndSet(false, true)) {
                C11409c.m40578j(th);
                return;
            }
            try {
                this.f42600g.onError(th);
            } finally {
                unsubscribe();
            }
        }
    }

    public C11317s1(Single.InterfaceC11229j<T> interfaceC11229j, long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h, Single.InterfaceC11229j<? extends T> interfaceC11229j2) {
        this.f42595f = interfaceC11229j;
        this.f42596g = j2;
        this.f42597h = timeUnit;
        this.f42598i = abstractC11243h;
        this.f42599j = interfaceC11229j2;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11244i<? super T> abstractC11244i) {
        a aVar = new a(abstractC11244i, this.f42599j);
        AbstractC11243h.a aVarCreateWorker = this.f42598i.createWorker();
        aVar.m40149b(aVarCreateWorker);
        abstractC11244i.m40149b(aVar);
        aVarCreateWorker.mo40147d(aVar, this.f42596g, this.f42597h);
        this.f42595f.call(aVar);
    }
}
