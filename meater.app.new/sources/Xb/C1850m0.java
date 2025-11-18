package Xb;

import cc.C2372c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\u00072\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"LXb/m0;", "LXb/l0;", "LXb/S;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lta/g;", "context", "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "M0", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lta/g;J)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Loa/F;", "G0", "(Lta/g;Ljava/util/concurrent/RejectedExecutionException;)V", "p0", "(Lta/g;Ljava/lang/Runnable;)V", "LXb/l;", "continuation", "i0", "(JLXb/l;)V", "LXb/b0;", "h0", "(JLjava/lang/Runnable;Lta/g;)LXb/b0;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "E", "Ljava/util/concurrent/Executor;", "L0", "()Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1850m0 extends AbstractC1848l0 implements S {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    public C1850m0(Executor executor) {
        this.executor = executor;
        C2372c.a(getExecutor());
    }

    private final void G0(ta.g context, RejectedExecutionException exception) {
        C1873y0.d(context, C1846k0.a("The task was rejected", exception));
    }

    private final ScheduledFuture<?> M0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, ta.g gVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            G0(gVar, e10);
            return null;
        }
    }

    /* renamed from: L0, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = getExecutor();
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object other) {
        return (other instanceof C1850m0) && ((C1850m0) other).getExecutor() == getExecutor();
    }

    @Override // Xb.S
    public InterfaceC1828b0 h0(long timeMillis, Runnable block, ta.g context) {
        Executor executor = getExecutor();
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> scheduledFutureM0 = scheduledExecutorService != null ? M0(scheduledExecutorService, block, context, timeMillis) : null;
        return scheduledFutureM0 != null ? new C1826a0(scheduledFutureM0) : N.f19038J.h0(timeMillis, block, context);
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }

    @Override // Xb.S
    public void i0(long timeMillis, InterfaceC1847l<? super C4153F> continuation) {
        Executor executor = getExecutor();
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> scheduledFutureM0 = scheduledExecutorService != null ? M0(scheduledExecutorService, new O0(this, continuation), continuation.getContext(), timeMillis) : null;
        if (scheduledFutureM0 != null) {
            C1873y0.j(continuation, scheduledFutureM0);
        } else {
            N.f19038J.i0(timeMillis, continuation);
        }
    }

    @Override // Xb.E
    public void p0(ta.g context, Runnable block) {
        try {
            Executor executor = getExecutor();
            C1829c.a();
            executor.execute(block);
        } catch (RejectedExecutionException e10) {
            C1829c.a();
            G0(context, e10);
            Z.b().p0(context, block);
        }
    }

    @Override // Xb.E
    public String toString() {
        return getExecutor().toString();
    }
}
