package Xb;

import Xb.AbstractC1838g0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: DefaultExecutor.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u0010\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010\u001a\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005R\u0014\u0010#\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010$\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0005R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\rR\u0014\u0010-\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\rR\u0014\u0010/\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\n¨\u00060"}, d2 = {"LXb/N;", "LXb/g0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "Loa/F;", "V1", "Ljava/lang/Thread;", "R1", "()Ljava/lang/Thread;", "", "U1", "()Z", "Q1", "task", "C1", "(Ljava/lang/Runnable;)V", "", "now", "LXb/g0$c;", "delayedTask", "q1", "(JLXb/g0$c;)V", "shutdown", "timeMillis", "block", "Lta/g;", "context", "LXb/b0;", "h0", "(JLjava/lang/Runnable;Lta/g;)LXb/b0;", "run", "K", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "S1", "isShutDown", "T1", "isShutdownRequested", "n1", "thread", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class N extends AbstractC1838g0 implements Runnable {

    /* renamed from: J, reason: collision with root package name */
    public static final N f19038J;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private static final long KEEP_ALIVE_NANOS;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l10;
        N n10 = new N();
        f19038J = n10;
        AbstractC1836f0.U0(n10, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(l10.longValue());
    }

    private N() {
    }

    private final synchronized void Q1() {
        if (T1()) {
            debugStatus = 3;
            K1();
            C3862t.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread R1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(N.class.getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean S1() {
        return debugStatus == 4;
    }

    private final boolean T1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean U1() {
        if (T1()) {
            return false;
        }
        debugStatus = 1;
        C3862t.e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void V1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // Xb.AbstractC1838g0
    public void C1(Runnable task) {
        if (S1()) {
            V1();
        }
        super.C1(task);
    }

    @Override // Xb.AbstractC1838g0, Xb.S
    public InterfaceC1828b0 h0(long timeMillis, Runnable block, ta.g context) {
        return N1(timeMillis, block);
    }

    @Override // Xb.AbstractC1840h0
    /* renamed from: n1 */
    protected Thread getThread() {
        Thread thread = _thread;
        return thread == null ? R1() : thread;
    }

    @Override // Xb.AbstractC1840h0
    protected void q1(long now, AbstractC1838g0.c delayedTask) {
        V1();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zI1;
        T0.f19045a.d(this);
        C1829c.a();
        try {
            if (!U1()) {
                if (zI1) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jG1 = g1();
                if (jG1 == Long.MAX_VALUE) {
                    C1829c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = KEEP_ALIVE_NANOS + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        Q1();
                        C1829c.a();
                        if (I1()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    jG1 = Ha.g.h(jG1, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jG1 > 0) {
                    if (T1()) {
                        _thread = null;
                        Q1();
                        C1829c.a();
                        if (I1()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    C1829c.a();
                    LockSupport.parkNanos(this, jG1);
                }
            }
        } finally {
            _thread = null;
            Q1();
            C1829c.a();
            if (!I1()) {
                getThread();
            }
        }
    }

    @Override // Xb.AbstractC1838g0, Xb.AbstractC1836f0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
