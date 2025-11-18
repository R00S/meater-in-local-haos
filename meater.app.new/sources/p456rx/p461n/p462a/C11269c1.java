package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p470p.C11405e;

/* compiled from: OperatorTakeUntil.java */
/* renamed from: rx.n.a.c1 */
/* loaded from: classes3.dex */
public final class C11269c1<T, E> implements C11234e.b<T, T> {

    /* renamed from: f */
    private final C11234e<? extends E> f42218f;

    /* compiled from: OperatorTakeUntil.java */
    /* renamed from: rx.n.a.c1$a */
    class a extends AbstractC11245j<T> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f42219f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC11245j abstractC11245j, boolean z, AbstractC11245j abstractC11245j2) {
            super(abstractC11245j, z);
            this.f42219f = abstractC11245j2;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            try {
                this.f42219f.onCompleted();
            } finally {
                this.f42219f.unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            try {
                this.f42219f.onError(th);
            } finally {
                this.f42219f.unsubscribe();
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            this.f42219f.onNext(t);
        }
    }

    /* compiled from: OperatorTakeUntil.java */
    /* renamed from: rx.n.a.c1$b */
    class b extends AbstractC11245j<E> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11245j f42221f;

        b(AbstractC11245j abstractC11245j) {
            this.f42221f = abstractC11245j;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42221f.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42221f.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(E e2) {
            onCompleted();
        }

        @Override // p456rx.AbstractC11245j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public C11269c1(C11234e<? extends E> c11234e) {
        this.f42218f = c11234e;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super T> abstractC11245j) {
        C11405e c11405e = new C11405e(abstractC11245j, false);
        a aVar = new a(c11405e, false, c11405e);
        b bVar = new b(aVar);
        c11405e.add(aVar);
        c11405e.add(bVar);
        abstractC11245j.add(c11405e);
        this.f42218f.m40089c1(bVar);
        return aVar;
    }
}
