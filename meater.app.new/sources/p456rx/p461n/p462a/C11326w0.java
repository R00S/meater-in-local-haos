package p456rx.p461n.p462a;

import java.util.NoSuchElementException;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p461n.p463b.C11335c;
import p456rx.p471q.C11409c;

/* compiled from: OperatorSingle.java */
/* renamed from: rx.n.a.w0 */
/* loaded from: classes3.dex */
public final class C11326w0<T> implements C11234e.b<T, T> {

    /* renamed from: f */
    private final boolean f42647f;

    /* renamed from: g */
    private final T f42648g;

    /* compiled from: OperatorSingle.java */
    /* renamed from: rx.n.a.w0$a */
    static final class a {

        /* renamed from: a */
        static final C11326w0<?> f42649a = new C11326w0<>();
    }

    /* compiled from: OperatorSingle.java */
    /* renamed from: rx.n.a.w0$b */
    static final class b<T> extends AbstractC11245j<T> {

        /* renamed from: f */
        private final AbstractC11245j<? super T> f42650f;

        /* renamed from: g */
        private final boolean f42651g;

        /* renamed from: h */
        private final T f42652h;

        /* renamed from: i */
        private T f42653i;

        /* renamed from: j */
        private boolean f42654j;

        /* renamed from: k */
        private boolean f42655k;

        b(AbstractC11245j<? super T> abstractC11245j, boolean z, T t) {
            this.f42650f = abstractC11245j;
            this.f42651g = z;
            this.f42652h = t;
            request(2L);
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42655k) {
                return;
            }
            if (this.f42654j) {
                this.f42650f.setProducer(new C11335c(this.f42650f, this.f42653i));
            } else if (this.f42651g) {
                this.f42650f.setProducer(new C11335c(this.f42650f, this.f42652h));
            } else {
                this.f42650f.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42655k) {
                C11409c.m40578j(th);
            } else {
                this.f42650f.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            if (this.f42655k) {
                return;
            }
            if (!this.f42654j) {
                this.f42653i = t;
                this.f42654j = true;
            } else {
                this.f42655k = true;
                this.f42650f.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
            }
        }
    }

    C11326w0() {
        this(false, null);
    }

    /* renamed from: b */
    public static <T> C11326w0<T> m40348b() {
        return (C11326w0<T>) a.f42649a;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super T> abstractC11245j) {
        b bVar = new b(abstractC11245j, this.f42647f, this.f42648g);
        abstractC11245j.add(bVar);
        return bVar;
    }

    private C11326w0(boolean z, T t) {
        this.f42647f = z;
        this.f42648g = t;
    }
}
