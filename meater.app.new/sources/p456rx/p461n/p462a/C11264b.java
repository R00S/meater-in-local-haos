package p456rx.p461n.p462a;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11241f;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p473s.AbstractC11420d;
import p456rx.p474t.C11429e;

/* compiled from: BufferUntilSubscriber.java */
/* renamed from: rx.n.a.b */
/* loaded from: classes3.dex */
public final class C11264b<T> extends AbstractC11420d<T, T> {

    /* renamed from: g */
    static final InterfaceC11241f f42181g = new a();

    /* renamed from: h */
    final c<T> f42182h;

    /* renamed from: i */
    private boolean f42183i;

    /* compiled from: BufferUntilSubscriber.java */
    /* renamed from: rx.n.a.b$a */
    static class a implements InterfaceC11241f {
        a() {
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(Object obj) {
        }
    }

    /* compiled from: BufferUntilSubscriber.java */
    /* renamed from: rx.n.a.b$b */
    static final class b<T> implements C11234e.a<T> {

        /* renamed from: f */
        final c<T> f42184f;

        /* compiled from: BufferUntilSubscriber.java */
        /* renamed from: rx.n.a.b$b$a */
        class a implements InterfaceC11252a {
            a() {
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                b.this.f42184f.set(C11264b.f42181g);
            }
        }

        public b(c<T> cVar) {
            this.f42184f = cVar;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11245j<? super T> abstractC11245j) {
            boolean z;
            if (!this.f42184f.m40185a(null, abstractC11245j)) {
                abstractC11245j.onError(new IllegalStateException("Only one subscriber allowed!"));
                return;
            }
            abstractC11245j.add(C11429e.m40674a(new a()));
            synchronized (this.f42184f.f42186f) {
                c<T> cVar = this.f42184f;
                z = true;
                if (cVar.f42187g) {
                    z = false;
                } else {
                    cVar.f42187g = true;
                }
            }
            if (!z) {
                return;
            }
            while (true) {
                Object objPoll = this.f42184f.f42188h.poll();
                if (objPoll != null) {
                    C11282h.m40215a(this.f42184f.get(), objPoll);
                } else {
                    synchronized (this.f42184f.f42186f) {
                        if (this.f42184f.f42188h.isEmpty()) {
                            this.f42184f.f42187g = false;
                            return;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: BufferUntilSubscriber.java */
    /* renamed from: rx.n.a.b$c */
    static final class c<T> extends AtomicReference<InterfaceC11241f<? super T>> {

        /* renamed from: g */
        boolean f42187g;

        /* renamed from: f */
        final Object f42186f = new Object();

        /* renamed from: h */
        final ConcurrentLinkedQueue<Object> f42188h = new ConcurrentLinkedQueue<>();

        c() {
        }

        /* renamed from: a */
        boolean m40185a(InterfaceC11241f<? super T> interfaceC11241f, InterfaceC11241f<? super T> interfaceC11241f2) {
            return compareAndSet(interfaceC11241f, interfaceC11241f2);
        }
    }

    private C11264b(c<T> cVar) {
        super(new b(cVar));
        this.f42182h = cVar;
    }

    /* renamed from: g1 */
    public static <T> C11264b<T> m40182g1() {
        return new C11264b<>(new c());
    }

    /* renamed from: h1 */
    private void m40183h1(Object obj) {
        synchronized (this.f42182h.f42186f) {
            this.f42182h.f42188h.add(obj);
            if (this.f42182h.get() != null) {
                c<T> cVar = this.f42182h;
                if (!cVar.f42187g) {
                    this.f42183i = true;
                    cVar.f42187g = true;
                }
            }
        }
        if (!this.f42183i) {
            return;
        }
        while (true) {
            Object objPoll = this.f42182h.f42188h.poll();
            if (objPoll == null) {
                return;
            } else {
                C11282h.m40215a(this.f42182h.get(), objPoll);
            }
        }
    }

    @Override // p456rx.InterfaceC11241f
    public void onCompleted() {
        if (this.f42183i) {
            this.f42182h.get().onCompleted();
        } else {
            m40183h1(C11282h.m40216b());
        }
    }

    @Override // p456rx.InterfaceC11241f
    public void onError(Throwable th) {
        if (this.f42183i) {
            this.f42182h.get().onError(th);
        } else {
            m40183h1(C11282h.m40217c(th));
        }
    }

    @Override // p456rx.InterfaceC11241f
    public void onNext(T t) {
        if (this.f42183i) {
            this.f42182h.get().onNext(t);
        } else {
            m40183h1(C11282h.m40221g(t));
        }
    }
}
