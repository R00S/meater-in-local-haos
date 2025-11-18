package p456rx.p472r;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11244i;
import p456rx.Single;
import p456rx.exceptions.C11240a;
import p456rx.p461n.p466e.C11355d;

/* compiled from: BlockingSingle.java */
/* renamed from: rx.r.a */
/* loaded from: classes3.dex */
public final class C11416a<T> {

    /* renamed from: a */
    private final Single<? extends T> f43032a;

    /* compiled from: BlockingSingle.java */
    /* renamed from: rx.r.a$a */
    class a extends AbstractC11244i<T> {

        /* renamed from: g */
        final /* synthetic */ AtomicReference f43033g;

        /* renamed from: h */
        final /* synthetic */ CountDownLatch f43034h;

        /* renamed from: i */
        final /* synthetic */ AtomicReference f43035i;

        a(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f43033g = atomicReference;
            this.f43034h = countDownLatch;
            this.f43035i = atomicReference2;
        }

        @Override // p456rx.AbstractC11244i
        /* renamed from: c */
        public void mo29130c(T t) {
            this.f43033g.set(t);
            this.f43034h.countDown();
        }

        @Override // p456rx.AbstractC11244i
        public void onError(Throwable th) {
            this.f43035i.set(th);
            this.f43034h.countDown();
        }
    }

    private C11416a(Single<? extends T> single) {
        this.f43032a = single;
    }

    /* renamed from: a */
    public static <T> C11416a<T> m40632a(Single<? extends T> single) {
        return new C11416a<>(single);
    }

    /* renamed from: b */
    public T m40633b() throws InterruptedException {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C11355d.m40420a(countDownLatch, this.f43032a.m39928t(new a(atomicReference, countDownLatch, atomicReference2)));
        Throwable th = (Throwable) atomicReference2.get();
        if (th == null) {
            return (T) atomicReference.get();
        }
        throw C11240a.m40138c(th);
    }
}
