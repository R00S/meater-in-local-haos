package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11243h;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p470p.C11405e;

/* compiled from: OperatorSampleWithTime.java */
/* renamed from: rx.n.a.v0 */
/* loaded from: classes3.dex */
public final class C11324v0<T> implements C11234e.b<T, T> {

    /* renamed from: f */
    final long f42636f;

    /* renamed from: g */
    final TimeUnit f42637g;

    /* renamed from: h */
    final AbstractC11243h f42638h;

    /* compiled from: OperatorSampleWithTime.java */
    /* renamed from: rx.n.a.v0$a */
    static final class a<T> extends AbstractC11245j<T> implements InterfaceC11252a {

        /* renamed from: f */
        private static final Object f42639f = new Object();

        /* renamed from: g */
        private final AbstractC11245j<? super T> f42640g;

        /* renamed from: h */
        final AtomicReference<Object> f42641h = new AtomicReference<>(f42639f);

        public a(AbstractC11245j<? super T> abstractC11245j) {
            this.f42640g = abstractC11245j;
        }

        /* renamed from: c */
        private void m40346c() {
            AtomicReference<Object> atomicReference = this.f42641h;
            Object obj = f42639f;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                try {
                    this.f42640g.onNext(andSet);
                } catch (Throwable th) {
                    C11240a.m40141f(th, this);
                }
            }
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            m40346c();
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            m40346c();
            this.f42640g.onCompleted();
            unsubscribe();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42640g.onError(th);
            unsubscribe();
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            this.f42641h.set(t);
        }

        @Override // p456rx.AbstractC11245j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public C11324v0(long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        this.f42636f = j2;
        this.f42637g = timeUnit;
        this.f42638h = abstractC11243h;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super T> abstractC11245j) {
        C11405e c11405e = new C11405e(abstractC11245j);
        AbstractC11243h.a aVarCreateWorker = this.f42638h.createWorker();
        abstractC11245j.add(aVarCreateWorker);
        a aVar = new a(c11405e);
        abstractC11245j.add(aVar);
        long j2 = this.f42636f;
        aVarCreateWorker.mo40148e(aVar, j2, j2, this.f42637g);
        return aVar;
    }
}
