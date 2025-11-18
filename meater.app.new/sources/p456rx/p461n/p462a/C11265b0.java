package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11243h;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;

/* compiled from: OnSubscribeSkipTimed.java */
/* renamed from: rx.n.a.b0 */
/* loaded from: classes3.dex */
public final class C11265b0<T> implements C11234e.a<T> {

    /* renamed from: f */
    final long f42189f;

    /* renamed from: g */
    final TimeUnit f42190g;

    /* renamed from: h */
    final AbstractC11243h f42191h;

    /* renamed from: i */
    final C11234e<T> f42192i;

    /* compiled from: OnSubscribeSkipTimed.java */
    /* renamed from: rx.n.a.b0$a */
    static final class a<T> extends AbstractC11245j<T> implements InterfaceC11252a {

        /* renamed from: f */
        final AbstractC11245j<? super T> f42193f;

        /* renamed from: g */
        volatile boolean f42194g;

        a(AbstractC11245j<? super T> abstractC11245j) {
            this.f42193f = abstractC11245j;
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            this.f42194g = true;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            try {
                this.f42193f.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            try {
                this.f42193f.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            if (this.f42194g) {
                this.f42193f.onNext(t);
            }
        }
    }

    public C11265b0(C11234e<T> c11234e, long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        this.f42192i = c11234e;
        this.f42189f = j2;
        this.f42190g = timeUnit;
        this.f42191h = abstractC11243h;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        AbstractC11243h.a aVarCreateWorker = this.f42191h.createWorker();
        a aVar = new a(abstractC11245j);
        aVar.add(aVarCreateWorker);
        abstractC11245j.add(aVar);
        aVarCreateWorker.mo40147d(aVar, this.f42189f, this.f42190g);
        this.f42192i.m40089c1(aVar);
    }
}
