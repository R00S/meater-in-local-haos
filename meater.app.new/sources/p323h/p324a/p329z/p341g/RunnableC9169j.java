package p323h.p324a.p329z.p341g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.InterfaceC9102b;

/* compiled from: ScheduledRunnable.java */
/* renamed from: h.a.z.g.j */
/* loaded from: classes2.dex */
public final class RunnableC9169j extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, InterfaceC9089c {

    /* renamed from: f */
    static final Object f35243f = new Object();

    /* renamed from: g */
    static final Object f35244g = new Object();

    /* renamed from: h */
    static final Object f35245h = new Object();

    /* renamed from: i */
    static final Object f35246i = new Object();

    /* renamed from: j */
    final Runnable f35247j;

    public RunnableC9169j(Runnable runnable, InterfaceC9102b interfaceC9102b) {
        super(3);
        this.f35247j = runnable;
        lazySet(0, interfaceC9102b);
    }

    /* renamed from: a */
    public void m29365a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f35246i) {
                return;
            }
            if (obj == f35244g) {
                future.cancel(false);
                return;
            } else if (obj == f35245h) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: k */
    public void mo29115k() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f35246i || obj5 == (obj3 = f35244g) || obj5 == (obj4 = f35245h)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f35246i || obj == (obj2 = f35243f) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((InterfaceC9102b) obj).mo29240c(this);
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: q */
    public boolean mo29116q() {
        Object obj = get(0);
        return obj == f35243f || obj == f35246i;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean zCompareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.f35247j.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f35243f) {
                    ((InterfaceC9102b) obj4).mo29240c(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f35244g) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, f35246i));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != f35243f && compareAndSet(0, obj4, f35246i) && obj4 != null) {
            ((InterfaceC9102b) obj4).mo29240c(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f35244g || obj5 == f35245h) {
                return;
            }
        } while (!compareAndSet(1, obj5, f35246i));
    }
}
