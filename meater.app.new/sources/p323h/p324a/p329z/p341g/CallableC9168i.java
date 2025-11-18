package p323h.p324a.p329z.p341g;

import java.util.concurrent.Callable;

/* compiled from: ScheduledDirectTask.java */
/* renamed from: h.a.z.g.i */
/* loaded from: classes2.dex */
public final class CallableC9168i extends AbstractC9160a implements Callable<Void> {
    public CallableC9168i(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.f35181i = Thread.currentThread();
        try {
            this.f35180h.run();
            return null;
        } finally {
            lazySet(AbstractC9160a.f35178f);
            this.f35181i = null;
        }
    }
}
