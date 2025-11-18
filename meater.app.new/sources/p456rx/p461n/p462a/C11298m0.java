package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.p461n.p466e.C11364m;

/* compiled from: OperatorDistinctUntilChanged.java */
/* renamed from: rx.n.a.m0 */
/* loaded from: classes3.dex */
public final class C11298m0<T, U> implements C11234e.b<T, T>, InterfaceC11257f<U, U, Boolean> {

    /* renamed from: f */
    final InterfaceC11256e<? super T, ? extends U> f42418f;

    /* renamed from: g */
    final InterfaceC11257f<? super U, ? super U, Boolean> f42419g = this;

    /* compiled from: OperatorDistinctUntilChanged.java */
    /* renamed from: rx.n.a.m0$a */
    class a extends AbstractC11245j<T> {

        /* renamed from: f */
        U f42420f;

        /* renamed from: g */
        boolean f42421g;

        /* renamed from: h */
        final /* synthetic */ AbstractC11245j f42422h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC11245j abstractC11245j, AbstractC11245j abstractC11245j2) {
            super(abstractC11245j);
            this.f42422h = abstractC11245j2;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42422h.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42422h.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            try {
                U uCall = C11298m0.this.f42418f.call(t);
                U u = this.f42420f;
                this.f42420f = uCall;
                if (!this.f42421g) {
                    this.f42421g = true;
                    this.f42422h.onNext(t);
                    return;
                }
                try {
                    if (C11298m0.this.f42419g.mo6865a(u, uCall).booleanValue()) {
                        request(1L);
                    } else {
                        this.f42422h.onNext(t);
                    }
                } catch (Throwable th) {
                    C11240a.m40142g(th, this.f42422h, uCall);
                }
            } catch (Throwable th2) {
                C11240a.m40142g(th2, this.f42422h, t);
            }
        }
    }

    /* compiled from: OperatorDistinctUntilChanged.java */
    /* renamed from: rx.n.a.m0$b */
    static final class b {

        /* renamed from: a */
        static final C11298m0<?, ?> f42424a = new C11298m0<>(C11364m.m40467b());
    }

    public C11298m0(InterfaceC11256e<? super T, ? extends U> interfaceC11256e) {
        this.f42418f = interfaceC11256e;
    }

    /* renamed from: d */
    public static <T> C11298m0<T, T> m40255d() {
        return (C11298m0<T, T>) b.f42424a;
    }

    @Override // p456rx.p460m.InterfaceC11257f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean mo6865a(U u, U u2) {
        return Boolean.valueOf(u == u2 || (u != null && u.equals(u2)));
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super T> abstractC11245j) {
        return new a(abstractC11245j, abstractC11245j);
    }
}
