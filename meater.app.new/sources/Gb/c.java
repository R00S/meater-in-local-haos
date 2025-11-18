package Gb;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: locks.kt */
/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f4993c;

    /* renamed from: d, reason: collision with root package name */
    private final Ba.l<InterruptedException, C4153F> f4994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Lock lock, Runnable checkCancelled, Ba.l<? super InterruptedException, C4153F> interruptedExceptionHandler) {
        super(lock);
        C3862t.g(lock, "lock");
        C3862t.g(checkCancelled, "checkCancelled");
        C3862t.g(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f4993c = checkCancelled;
        this.f4994d = interruptedExceptionHandler;
    }

    @Override // Gb.d, Gb.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f4993c.run();
            } catch (InterruptedException e10) {
                this.f4994d.invoke(e10);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Runnable checkCancelled, Ba.l<? super InterruptedException, C4153F> interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        C3862t.g(checkCancelled, "checkCancelled");
        C3862t.g(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
