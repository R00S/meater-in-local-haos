package p456rx.p473s;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p470p.C11404d;

/* compiled from: SerializedSubject.java */
/* renamed from: rx.s.c */
/* loaded from: classes3.dex */
public class C11419c<T, R> extends AbstractC11420d<T, R> {

    /* renamed from: g */
    private final C11404d<T> f43047g;

    /* renamed from: h */
    private final AbstractC11420d<T, R> f43048h;

    /* compiled from: SerializedSubject.java */
    /* renamed from: rx.s.c$a */
    class a implements C11234e.a<R> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11420d f43049f;

        a(AbstractC11420d abstractC11420d) {
            this.f43049f = abstractC11420d;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11245j<? super R> abstractC11245j) {
            this.f43049f.m40089c1(abstractC11245j);
        }
    }

    public C11419c(AbstractC11420d<T, R> abstractC11420d) {
        super(new a(abstractC11420d));
        this.f43048h = abstractC11420d;
        this.f43047g = new C11404d<>(abstractC11420d);
    }

    @Override // p456rx.InterfaceC11241f
    public void onCompleted() {
        this.f43047g.onCompleted();
    }

    @Override // p456rx.InterfaceC11241f
    public void onError(Throwable th) {
        this.f43047g.onError(th);
    }

    @Override // p456rx.InterfaceC11241f
    public void onNext(T t) {
        this.f43047g.onNext(t);
    }
}
