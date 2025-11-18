package R8;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import z7.AbstractC5208j;
import z7.C5211m;
import z7.InterfaceC5201c;
import z7.N;

/* compiled from: CrashlyticsWorker.java */
/* loaded from: classes2.dex */
public class e implements Executor {

    /* renamed from: B, reason: collision with root package name */
    private final ExecutorService f15089B;

    /* renamed from: C, reason: collision with root package name */
    private final Object f15090C = new Object();

    /* renamed from: D, reason: collision with root package name */
    private AbstractC5208j<?> f15091D = C5211m.e(null);

    e(ExecutorService executorService) {
        this.f15089B = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC5208j e(Runnable runnable, AbstractC5208j abstractC5208j) {
        runnable.run();
        return C5211m.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC5208j f(Callable callable, AbstractC5208j abstractC5208j) {
        return (AbstractC5208j) callable.call();
    }

    public ExecutorService d() {
        return this.f15089B;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f15089B.execute(runnable);
    }

    public AbstractC5208j<Void> g(final Runnable runnable) {
        AbstractC5208j abstractC5208jI;
        synchronized (this.f15090C) {
            abstractC5208jI = this.f15091D.i(this.f15089B, new InterfaceC5201c() { // from class: R8.d
                @Override // z7.InterfaceC5201c
                public final Object a(AbstractC5208j abstractC5208j) {
                    return e.e(runnable, abstractC5208j);
                }
            });
            this.f15091D = abstractC5208jI;
        }
        return abstractC5208jI;
    }

    public <T> AbstractC5208j<T> h(final Callable<AbstractC5208j<T>> callable) {
        N n10;
        synchronized (this.f15090C) {
            n10 = (AbstractC5208j<T>) this.f15091D.i(this.f15089B, new InterfaceC5201c() { // from class: R8.c
                @Override // z7.InterfaceC5201c
                public final Object a(AbstractC5208j abstractC5208j) {
                    return e.f(callable, abstractC5208j);
                }
            });
            this.f15091D = n10;
        }
        return n10;
    }
}
