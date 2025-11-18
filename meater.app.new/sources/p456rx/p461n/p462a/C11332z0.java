package p456rx.p461n.p462a;

import p456rx.AbstractC11243h;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.p460m.InterfaceC11252a;

/* compiled from: OperatorSubscribeOn.java */
/* renamed from: rx.n.a.z0 */
/* loaded from: classes3.dex */
public final class C11332z0<T> implements C11234e.a<T> {

    /* renamed from: f */
    final AbstractC11243h f42715f;

    /* renamed from: g */
    final C11234e<T> f42716g;

    /* renamed from: h */
    final boolean f42717h;

    /* compiled from: OperatorSubscribeOn.java */
    /* renamed from: rx.n.a.z0$a */
    static final class a<T> extends AbstractC11245j<T> implements InterfaceC11252a {

        /* renamed from: f */
        final AbstractC11245j<? super T> f42718f;

        /* renamed from: g */
        final boolean f42719g;

        /* renamed from: h */
        final AbstractC11243h.a f42720h;

        /* renamed from: i */
        C11234e<T> f42721i;

        /* renamed from: j */
        Thread f42722j;

        /* compiled from: OperatorSubscribeOn.java */
        /* renamed from: rx.n.a.z0$a$a, reason: collision with other inner class name */
        class C11606a implements InterfaceC11242g {

            /* renamed from: f */
            final /* synthetic */ InterfaceC11242g f42723f;

            /* compiled from: OperatorSubscribeOn.java */
            /* renamed from: rx.n.a.z0$a$a$a, reason: collision with other inner class name */
            class C11607a implements InterfaceC11252a {

                /* renamed from: f */
                final /* synthetic */ long f42725f;

                C11607a(long j2) {
                    this.f42725f = j2;
                }

                @Override // p456rx.p460m.InterfaceC11252a
                public void call() {
                    C11606a.this.f42723f.request(this.f42725f);
                }
            }

            C11606a(InterfaceC11242g interfaceC11242g) {
                this.f42723f = interfaceC11242g;
            }

            @Override // p456rx.InterfaceC11242g
            public void request(long j2) {
                if (a.this.f42722j != Thread.currentThread()) {
                    a aVar = a.this;
                    if (aVar.f42719g) {
                        aVar.f42720h.mo40146c(new C11607a(j2));
                        return;
                    }
                }
                this.f42723f.request(j2);
            }
        }

        a(AbstractC11245j<? super T> abstractC11245j, boolean z, AbstractC11243h.a aVar, C11234e<T> c11234e) {
            this.f42718f = abstractC11245j;
            this.f42719g = z;
            this.f42720h = aVar;
            this.f42721i = c11234e;
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            C11234e<T> c11234e = this.f42721i;
            this.f42721i = null;
            this.f42722j = Thread.currentThread();
            c11234e.m40089c1(this);
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            try {
                this.f42718f.onCompleted();
            } finally {
                this.f42720h.unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            try {
                this.f42718f.onError(th);
            } finally {
                this.f42720h.unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            this.f42718f.onNext(t);
        }

        @Override // p456rx.AbstractC11245j
        public void setProducer(InterfaceC11242g interfaceC11242g) {
            this.f42718f.setProducer(new C11606a(interfaceC11242g));
        }
    }

    public C11332z0(C11234e<T> c11234e, AbstractC11243h abstractC11243h, boolean z) {
        this.f42715f = abstractC11243h;
        this.f42716g = c11234e;
        this.f42717h = z;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        AbstractC11243h.a aVarCreateWorker = this.f42715f.createWorker();
        a aVar = new a(abstractC11245j, this.f42717h, aVarCreateWorker, this.f42716g);
        abstractC11245j.add(aVar);
        abstractC11245j.add(aVarCreateWorker);
        aVarCreateWorker.mo40146c(aVar);
    }
}
