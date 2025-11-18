package p456rx.p461n.p462a;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11245j;
import p456rx.C11230a;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.MissingBackpressureException;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p461n.p466e.C11354c;

/* compiled from: OperatorOnBackpressureBuffer.java */
/* renamed from: rx.n.a.s0 */
/* loaded from: classes3.dex */
public class C11316s0<T> implements C11234e.b<T, T> {

    /* renamed from: f */
    private final Long f42584f = null;

    /* renamed from: g */
    private final InterfaceC11252a f42585g = null;

    /* renamed from: h */
    private final C11230a.d f42586h = C11230a.f42035b;

    /* compiled from: OperatorOnBackpressureBuffer.java */
    /* renamed from: rx.n.a.s0$a */
    static final class a<T> extends AbstractC11245j<T> implements C11354c.a {

        /* renamed from: g */
        private final AtomicLong f42588g;

        /* renamed from: h */
        private final AbstractC11245j<? super T> f42589h;

        /* renamed from: j */
        private final C11354c f42591j;

        /* renamed from: k */
        private final InterfaceC11252a f42592k;

        /* renamed from: l */
        private final C11230a.d f42593l;

        /* renamed from: f */
        private final ConcurrentLinkedQueue<Object> f42587f = new ConcurrentLinkedQueue<>();

        /* renamed from: i */
        private final AtomicBoolean f42590i = new AtomicBoolean(false);

        public a(AbstractC11245j<? super T> abstractC11245j, Long l, InterfaceC11252a interfaceC11252a, C11230a.d dVar) {
            this.f42589h = abstractC11245j;
            this.f42588g = l != null ? new AtomicLong(l.longValue()) : null;
            this.f42592k = interfaceC11252a;
            this.f42591j = new C11354c(this);
            this.f42593l = dVar;
        }

        /* renamed from: c */
        private boolean m40320c() throws Throwable {
            long j2;
            if (this.f42588g == null) {
                return true;
            }
            do {
                j2 = this.f42588g.get();
                if (j2 <= 0) {
                    try {
                    } catch (MissingBackpressureException e2) {
                        if (this.f42590i.compareAndSet(false, true)) {
                            unsubscribe();
                            this.f42589h.onError(e2);
                        }
                    }
                    boolean z = this.f42593l.mo39942a() && poll() != null;
                    InterfaceC11252a interfaceC11252a = this.f42592k;
                    if (interfaceC11252a != null) {
                        try {
                            interfaceC11252a.call();
                        } catch (Throwable th) {
                            C11240a.m40140e(th);
                            this.f42591j.m40419c(th);
                            return false;
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            } while (!this.f42588g.compareAndSet(j2, j2 - 1));
            return true;
        }

        @Override // p456rx.p461n.p466e.C11354c.a
        /* renamed from: a */
        public boolean mo40321a(Object obj) {
            return C11282h.m40215a(this.f42589h, obj);
        }

        @Override // p456rx.p461n.p466e.C11354c.a
        /* renamed from: b */
        public void mo40322b(Throwable th) {
            if (th != null) {
                this.f42589h.onError(th);
            } else {
                this.f42589h.onCompleted();
            }
        }

        /* renamed from: d */
        protected InterfaceC11242g m40323d() {
            return this.f42591j;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() throws Throwable {
            if (this.f42590i.get()) {
                return;
            }
            this.f42591j.m40418b();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) throws Throwable {
            if (this.f42590i.get()) {
                return;
            }
            this.f42591j.m40419c(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) throws Throwable {
            if (m40320c()) {
                this.f42587f.offer(C11282h.m40221g(t));
                this.f42591j.m40417a();
            }
        }

        @Override // p456rx.AbstractC11245j
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // p456rx.p461n.p466e.C11354c.a
        public Object peek() {
            return this.f42587f.peek();
        }

        @Override // p456rx.p461n.p466e.C11354c.a
        public Object poll() {
            Object objPoll = this.f42587f.poll();
            AtomicLong atomicLong = this.f42588g;
            if (atomicLong != null && objPoll != null) {
                atomicLong.incrementAndGet();
            }
            return objPoll;
        }
    }

    /* compiled from: OperatorOnBackpressureBuffer.java */
    /* renamed from: rx.n.a.s0$b */
    static final class b {

        /* renamed from: a */
        static final C11316s0<?> f42594a = new C11316s0<>();
    }

    C11316s0() {
    }

    /* renamed from: b */
    public static <T> C11316s0<T> m40318b() {
        return (C11316s0<T>) b.f42594a;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super T> abstractC11245j) {
        a aVar = new a(abstractC11245j, this.f42584f, this.f42585g, this.f42586h);
        abstractC11245j.add(aVar);
        abstractC11245j.setProducer(aVar.m40323d());
        return aVar;
    }
}
