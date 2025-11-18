package p323h.p324a.p329z.p341g;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p331b.C9107a;

/* compiled from: AbstractDirectTask.java */
/* renamed from: h.a.z.g.a */
/* loaded from: classes2.dex */
abstract class AbstractC9160a extends AtomicReference<Future<?>> implements InterfaceC9089c {

    /* renamed from: f */
    protected static final FutureTask<Void> f35178f;

    /* renamed from: g */
    protected static final FutureTask<Void> f35179g;

    /* renamed from: h */
    protected final Runnable f35180h;

    /* renamed from: i */
    protected Thread f35181i;

    static {
        Runnable runnable = C9107a.f34947b;
        f35178f = new FutureTask<>(runnable, null);
        f35179g = new FutureTask<>(runnable, null);
    }

    AbstractC9160a(Runnable runnable) {
        this.f35180h = runnable;
    }

    /* renamed from: a */
    public final void m29347a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f35178f) {
                return;
            }
            if (future2 == f35179g) {
                future.cancel(this.f35181i != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: k */
    public final void mo29115k() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f35178f || future == (futureTask = f35179g) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f35181i != Thread.currentThread());
    }

    @Override // p323h.p324a.p327x.InterfaceC9089c
    /* renamed from: q */
    public final boolean mo29116q() {
        Future<?> future = get();
        return future == f35178f || future == f35179g;
    }
}
