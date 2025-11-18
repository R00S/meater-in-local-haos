package p456rx.p473s;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11241f;
import p456rx.InterfaceC11242g;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.MissingBackpressureException;
import p456rx.p461n.p462a.C11261a;

/* compiled from: PublishSubject.java */
/* renamed from: rx.s.b */
/* loaded from: classes3.dex */
public final class C11418b<T> extends AbstractC11420d<T, T> {

    /* renamed from: g */
    final b<T> f43040g;

    /* compiled from: PublishSubject.java */
    /* renamed from: rx.s.b$a */
    static final class a<T> extends AtomicLong implements InterfaceC11242g, InterfaceC11246k, InterfaceC11241f<T> {

        /* renamed from: f */
        final b<T> f43041f;

        /* renamed from: g */
        final AbstractC11245j<? super T> f43042g;

        /* renamed from: h */
        long f43043h;

        public a(b<T> bVar, AbstractC11245j<? super T> abstractC11245j) {
            this.f43041f = bVar;
            this.f43042g = abstractC11245j;
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.f43042g.onCompleted();
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f43042g.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            long j2 = get();
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.f43043h;
                if (j2 != j3) {
                    this.f43043h = j3 + 1;
                    this.f43042g.onNext(t);
                } else {
                    unsubscribe();
                    this.f43042g.onError(new MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
                }
            }
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
            long j3;
            if (C11261a.m40164d(j2)) {
                do {
                    j3 = get();
                    if (j3 == Long.MIN_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j3, C11261a.m40161a(j3, j2)));
            }
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f43041f.m40640c(this);
            }
        }
    }

    /* compiled from: PublishSubject.java */
    /* renamed from: rx.s.b$b */
    static final class b<T> extends AtomicReference<a<T>[]> implements C11234e.a<T>, InterfaceC11241f<T> {

        /* renamed from: f */
        static final a[] f43044f = new a[0];

        /* renamed from: g */
        static final a[] f43045g = new a[0];

        /* renamed from: h */
        Throwable f43046h;

        public b() {
            lazySet(f43044f);
        }

        /* renamed from: a */
        boolean m40638a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == f43045g) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        @Override // p456rx.p460m.InterfaceC11253b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(AbstractC11245j<? super T> abstractC11245j) {
            a<T> aVar = new a<>(this, abstractC11245j);
            abstractC11245j.add(aVar);
            abstractC11245j.setProducer(aVar);
            if (m40638a(aVar)) {
                if (aVar.isUnsubscribed()) {
                    m40640c(aVar);
                }
            } else {
                Throwable th = this.f43046h;
                if (th != null) {
                    abstractC11245j.onError(th);
                } else {
                    abstractC11245j.onCompleted();
                }
            }
        }

        /* renamed from: c */
        void m40640c(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == f43045g || aVarArr == f43044f) {
                    return;
                }
                int length = aVarArr.length;
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (aVarArr[i3] == aVar) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f43044f;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i2);
                    System.arraycopy(aVarArr, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            for (a<T> aVar : getAndSet(f43045g)) {
                aVar.onCompleted();
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f43046h = th;
            ArrayList arrayList = null;
            for (a<T> aVar : getAndSet(f43045g)) {
                try {
                    aVar.onError(th);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(th2);
                }
            }
            C11240a.m40139d(arrayList);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            for (a<T> aVar : get()) {
                aVar.onNext(t);
            }
        }
    }

    protected C11418b(b<T> bVar) {
        super(bVar);
        this.f43040g = bVar;
    }

    /* renamed from: g1 */
    public static <T> C11418b<T> m40637g1() {
        return new C11418b<>(new b());
    }

    @Override // p456rx.InterfaceC11241f
    public void onCompleted() {
        this.f43040g.onCompleted();
    }

    @Override // p456rx.InterfaceC11241f
    public void onError(Throwable th) {
        this.f43040g.onError(th);
    }

    @Override // p456rx.InterfaceC11241f
    public void onNext(T t) {
        this.f43040g.onNext(t);
    }
}
