package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p469o.AbstractC11400b;
import p456rx.p474t.C11426b;
import p456rx.p474t.C11429e;

/* compiled from: OnSubscribeRefCount.java */
/* renamed from: rx.n.a.z */
/* loaded from: classes3.dex */
public final class C11331z<T> implements C11234e.a<T> {

    /* renamed from: f */
    private final AbstractC11400b<? extends T> f42703f;

    /* renamed from: g */
    volatile C11426b f42704g = new C11426b();

    /* renamed from: h */
    final AtomicInteger f42705h = new AtomicInteger(0);

    /* renamed from: i */
    final ReentrantLock f42706i = new ReentrantLock();

    /* compiled from: OnSubscribeRefCount.java */
    /* renamed from: rx.n.a.z$a */
    class a implements InterfaceC11253b<InterfaceC11246k> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f42707f;

        /* renamed from: g */
        final /* synthetic */ AtomicBoolean f42708g;

        a(AbstractC11245j abstractC11245j, AtomicBoolean atomicBoolean) {
            this.f42707f = abstractC11245j;
            this.f42708g = atomicBoolean;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(InterfaceC11246k interfaceC11246k) {
            try {
                C11331z.this.f42704g.m40667a(interfaceC11246k);
                C11331z c11331z = C11331z.this;
                c11331z.m40369d(this.f42707f, c11331z.f42704g);
            } finally {
                C11331z.this.f42706i.unlock();
                this.f42708g.set(false);
            }
        }
    }

    /* compiled from: OnSubscribeRefCount.java */
    /* renamed from: rx.n.a.z$b */
    class b extends AbstractC11245j<T> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f42710f;

        /* renamed from: g */
        final /* synthetic */ C11426b f42711g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC11245j abstractC11245j, AbstractC11245j abstractC11245j2, C11426b c11426b) {
            super(abstractC11245j);
            this.f42710f = abstractC11245j2;
            this.f42711g = c11426b;
        }

        /* renamed from: c */
        void m40371c() {
            C11331z.this.f42706i.lock();
            try {
                if (C11331z.this.f42704g == this.f42711g) {
                    if (C11331z.this.f42703f instanceof InterfaceC11246k) {
                        ((InterfaceC11246k) C11331z.this.f42703f).unsubscribe();
                    }
                    C11331z.this.f42704g.unsubscribe();
                    C11331z.this.f42704g = new C11426b();
                    C11331z.this.f42705h.set(0);
                }
            } finally {
                C11331z.this.f42706i.unlock();
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            m40371c();
            this.f42710f.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            m40371c();
            this.f42710f.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            this.f42710f.onNext(t);
        }
    }

    /* compiled from: OnSubscribeRefCount.java */
    /* renamed from: rx.n.a.z$c */
    class c implements InterfaceC11252a {

        /* renamed from: f */
        final /* synthetic */ C11426b f42713f;

        c(C11426b c11426b) {
            this.f42713f = c11426b;
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            C11331z.this.f42706i.lock();
            try {
                if (C11331z.this.f42704g == this.f42713f && C11331z.this.f42705h.decrementAndGet() == 0) {
                    if (C11331z.this.f42703f instanceof InterfaceC11246k) {
                        ((InterfaceC11246k) C11331z.this.f42703f).unsubscribe();
                    }
                    C11331z.this.f42704g.unsubscribe();
                    C11331z.this.f42704g = new C11426b();
                }
            } finally {
                C11331z.this.f42706i.unlock();
            }
        }
    }

    public C11331z(AbstractC11400b<? extends T> abstractC11400b) {
        this.f42703f = abstractC11400b;
    }

    /* renamed from: c */
    private InterfaceC11246k m40366c(C11426b c11426b) {
        return C11429e.m40674a(new c(c11426b));
    }

    /* renamed from: e */
    private InterfaceC11253b<InterfaceC11246k> m40367e(AbstractC11245j<? super T> abstractC11245j, AtomicBoolean atomicBoolean) {
        return new a(abstractC11245j, atomicBoolean);
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        this.f42706i.lock();
        if (this.f42705h.incrementAndGet() != 1) {
            try {
                m40369d(abstractC11245j, this.f42704g);
            } finally {
                this.f42706i.unlock();
            }
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f42703f.mo40336i1(m40367e(abstractC11245j, atomicBoolean));
            } finally {
                if (atomicBoolean.get()) {
                }
            }
        }
    }

    /* renamed from: d */
    void m40369d(AbstractC11245j<? super T> abstractC11245j, C11426b c11426b) {
        abstractC11245j.add(m40366c(c11426b));
        this.f42703f.m40089c1(new b(abstractC11245j, abstractC11245j, c11426b));
    }
}
