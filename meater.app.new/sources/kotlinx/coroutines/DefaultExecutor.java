package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.ranges.C9848l;
import kotlinx.coroutines.EventLoopImplBase;
import okhttp3.HttpUrl;

/* compiled from: DefaultExecutor.kt */
@Metadata(m32266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\u0014\u0010 \u001a\u00020\u001e2\n\u0010!\u001a\u00060\u0002j\u0002`\u0003H\u0016J\r\u0010\"\u001a\u00020\u001eH\u0000¢\u0006\u0002\b#J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\b2\n\u0010'\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0015H\u0002J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020.H\u0014J\b\u0010/\u001a\u00020\u001eH\u0016J\b\u00100\u001a\u00020\u001eH\u0016J\b\u00101\u001a\u00020\u001eH\u0002J\u000e\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0004R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, m32267d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "ACTIVE", HttpUrl.FRAGMENT_ENCODE_SET, "DEFAULT_KEEP_ALIVE_MS", HttpUrl.FRAGMENT_ENCODE_SET, "FRESH", "KEEP_ALIVE_NANOS", "SHUTDOWN", "SHUTDOWN_ACK", "SHUTDOWN_REQ", "THREAD_NAME", HttpUrl.FRAGMENT_ENCODE_SET, "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "debugStatus", "isShutDown", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isShutdownRequested", "isThreadPresent", "isThreadPresent$kotlinx_coroutines_core", "thread", "getThread", "()Ljava/lang/Thread;", "acknowledgeShutdownIfNeeded", HttpUrl.FRAGMENT_ENCODE_SET, "createThreadSync", "enqueue", "task", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "context", "Lkotlin/coroutines/CoroutineContext;", "notifyStartup", "reschedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "run", "shutdown", "shutdownError", "shutdownForTests", "timeout", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.u0, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class DefaultExecutor extends EventLoopImplBase implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: l */
    public static final DefaultExecutor f41885l;

    /* renamed from: m */
    private static final long f41886m;

    static {
        Long l;
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        f41885l = defaultExecutor;
        EventLoop.m39429f0(defaultExecutor, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f41886m = timeUnit.toNanos(l.longValue());
    }

    private DefaultExecutor() {
    }

    /* renamed from: a1 */
    private final synchronized void m39690a1() {
        if (m39693h1()) {
            debugStatus = 3;
            m39610R0();
            notifyAll();
        }
    }

    /* renamed from: c1 */
    private final synchronized Thread m39691c1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: f1 */
    private final boolean m39692f1() {
        return debugStatus == 4;
    }

    /* renamed from: h1 */
    private final boolean m39693h1() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    /* renamed from: k1 */
    private final synchronized boolean m39694k1() {
        if (m39693h1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: l1 */
    private final void m39695l1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    /* renamed from: J0 */
    public void mo39608J0(Runnable runnable) {
        if (m39692f1()) {
            m39695l1();
        }
        super.mo39608J0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadLocalEventLoop.f41888a.m39699d(this);
        if (C10893c.m39138a() != null) {
            throw null;
        }
        try {
            if (!m39694k1()) {
                _thread = null;
                m39690a1();
                if (C10893c.m39138a() != null) {
                    throw null;
                }
                if (m39609N0()) {
                    return;
                }
                getF41741l();
                return;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo39436n0 = mo39436n0();
                if (jMo39436n0 != Long.MAX_VALUE) {
                    j2 = Long.MAX_VALUE;
                } else {
                    if (C10893c.m39138a() != null) {
                        throw null;
                    }
                    long jNanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = f41886m + jNanoTime;
                    }
                    long j3 = j2 - jNanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        m39690a1();
                        if (C10893c.m39138a() != null) {
                            throw null;
                        }
                        if (m39609N0()) {
                            return;
                        }
                        getF41741l();
                        return;
                    }
                    jMo39436n0 = C9848l.m32422e(jMo39436n0, j3);
                }
                if (jMo39436n0 > 0) {
                    if (m39693h1()) {
                        _thread = null;
                        m39690a1();
                        if (C10893c.m39138a() != null) {
                            throw null;
                        }
                        if (m39609N0()) {
                            return;
                        }
                        getF41741l();
                        return;
                    }
                    if (C10893c.m39138a() != null) {
                        throw null;
                    }
                    LockSupport.parkNanos(this, jMo39436n0);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m39690a1();
            if (C10893c.m39138a() != null) {
                throw null;
            }
            if (!m39609N0()) {
                getF41741l();
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* renamed from: t0 */
    protected Thread getF41741l() {
        Thread thread = _thread;
        return thread == null ? m39691c1() : thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* renamed from: x0 */
    protected void mo39617x0(long j2, EventLoopImplBase.b bVar) {
        m39695l1();
    }
}
