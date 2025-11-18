package p456rx.p469o;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p461n.p466e.C11355d;

/* compiled from: BlockingObservable.java */
/* renamed from: rx.o.a */
/* loaded from: classes3.dex */
public final class C11399a<T> {

    /* renamed from: a */
    static final Object f42978a = new Object();

    /* renamed from: b */
    static final Object f42979b = new Object();

    /* renamed from: c */
    static final Object f42980c = new Object();

    /* renamed from: d */
    private final C11234e<? extends T> f42981d;

    /* compiled from: BlockingObservable.java */
    /* renamed from: rx.o.a$a */
    class a extends AbstractC11245j<T> {

        /* renamed from: f */
        final /* synthetic */ CountDownLatch f42982f;

        /* renamed from: g */
        final /* synthetic */ AtomicReference f42983g;

        /* renamed from: h */
        final /* synthetic */ AtomicReference f42984h;

        a(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f42982f = countDownLatch;
            this.f42983g = atomicReference;
            this.f42984h = atomicReference2;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42982f.countDown();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42983g.set(th);
            this.f42982f.countDown();
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            this.f42984h.set(t);
        }
    }

    private C11399a(C11234e<? extends T> c11234e) {
        this.f42981d = c11234e;
    }

    /* renamed from: a */
    private T m40549a(C11234e<? extends T> c11234e) throws InterruptedException {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C11355d.m40420a(countDownLatch, c11234e.m40058E0(new a(countDownLatch, atomicReference2, atomicReference)));
        if (atomicReference2.get() != null) {
            C11240a.m40138c((Throwable) atomicReference2.get());
        }
        return (T) atomicReference.get();
    }

    /* renamed from: c */
    public static <T> C11399a<T> m40550c(C11234e<? extends T> c11234e) {
        return new C11399a<>(c11234e);
    }

    /* renamed from: b */
    public T m40551b() {
        return m40549a(this.f42981d.m40057E());
    }
}
