package p456rx.p461n.p462a;

import java.util.NoSuchElementException;
import p456rx.AbstractC11244i;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p471q.C11409c;

/* compiled from: SingleFromObservable.java */
/* renamed from: rx.n.a.k1 */
/* loaded from: classes3.dex */
public final class C11293k1<T> implements Single.InterfaceC11229j<T> {

    /* renamed from: f */
    final C11234e.a<T> f42394f;

    /* compiled from: SingleFromObservable.java */
    /* renamed from: rx.n.a.k1$a */
    static final class a<T> extends AbstractC11245j<T> {

        /* renamed from: f */
        final AbstractC11244i<? super T> f42395f;

        /* renamed from: g */
        T f42396g;

        /* renamed from: h */
        int f42397h;

        a(AbstractC11244i<? super T> abstractC11244i) {
            this.f42395f = abstractC11244i;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            int i2 = this.f42397h;
            if (i2 == 0) {
                this.f42395f.onError(new NoSuchElementException());
            } else if (i2 == 1) {
                this.f42397h = 2;
                T t = this.f42396g;
                this.f42396g = null;
                this.f42395f.mo29130c(t);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42397h == 2) {
                C11409c.m40578j(th);
            } else {
                this.f42396g = null;
                this.f42395f.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            int i2 = this.f42397h;
            if (i2 == 0) {
                this.f42397h = 1;
                this.f42396g = t;
            } else if (i2 == 1) {
                this.f42397h = 2;
                this.f42395f.onError(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }
    }

    public C11293k1(C11234e.a<T> aVar) {
        this.f42394f = aVar;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11244i<? super T> abstractC11244i) {
        a aVar = new a(abstractC11244i);
        abstractC11244i.m40149b(aVar);
        this.f42394f.call(aVar);
    }
}
