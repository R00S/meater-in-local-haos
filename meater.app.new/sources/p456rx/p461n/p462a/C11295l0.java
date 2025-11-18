package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11243h;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;

/* compiled from: OperatorDelay.java */
/* renamed from: rx.n.a.l0 */
/* loaded from: classes3.dex */
public final class C11295l0<T> implements C11234e.b<T, T> {

    /* renamed from: f */
    final long f42399f;

    /* renamed from: g */
    final TimeUnit f42400g;

    /* renamed from: h */
    final AbstractC11243h f42401h;

    /* compiled from: OperatorDelay.java */
    /* renamed from: rx.n.a.l0$a */
    class a extends AbstractC11245j<T> {

        /* renamed from: f */
        boolean f42402f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11243h.a f42403g;

        /* renamed from: h */
        final /* synthetic */ AbstractC11245j f42404h;

        /* compiled from: OperatorDelay.java */
        /* renamed from: rx.n.a.l0$a$a, reason: collision with other inner class name */
        class C11599a implements InterfaceC11252a {
            C11599a() {
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                a aVar = a.this;
                if (aVar.f42402f) {
                    return;
                }
                aVar.f42402f = true;
                aVar.f42404h.onCompleted();
            }
        }

        /* compiled from: OperatorDelay.java */
        /* renamed from: rx.n.a.l0$a$b */
        class b implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ Throwable f42407f;

            b(Throwable th) {
                this.f42407f = th;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                a aVar = a.this;
                if (aVar.f42402f) {
                    return;
                }
                aVar.f42402f = true;
                aVar.f42404h.onError(this.f42407f);
                a.this.f42403g.unsubscribe();
            }
        }

        /* compiled from: OperatorDelay.java */
        /* renamed from: rx.n.a.l0$a$c */
        class c implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ Object f42409f;

            c(Object obj) {
                this.f42409f = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                a aVar = a.this;
                if (aVar.f42402f) {
                    return;
                }
                aVar.f42404h.onNext(this.f42409f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC11245j abstractC11245j, AbstractC11243h.a aVar, AbstractC11245j abstractC11245j2) {
            super(abstractC11245j);
            this.f42403g = aVar;
            this.f42404h = abstractC11245j2;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            AbstractC11243h.a aVar = this.f42403g;
            C11599a c11599a = new C11599a();
            C11295l0 c11295l0 = C11295l0.this;
            aVar.mo40147d(c11599a, c11295l0.f42399f, c11295l0.f42400g);
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42403g.mo40146c(new b(th));
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            AbstractC11243h.a aVar = this.f42403g;
            c cVar = new c(t);
            C11295l0 c11295l0 = C11295l0.this;
            aVar.mo40147d(cVar, c11295l0.f42399f, c11295l0.f42400g);
        }
    }

    public C11295l0(long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        this.f42399f = j2;
        this.f42400g = timeUnit;
        this.f42401h = abstractC11243h;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super T> abstractC11245j) {
        AbstractC11243h.a aVarCreateWorker = this.f42401h.createWorker();
        abstractC11245j.add(aVarCreateWorker);
        return new a(abstractC11245j, aVarCreateWorker, abstractC11245j);
    }
}
