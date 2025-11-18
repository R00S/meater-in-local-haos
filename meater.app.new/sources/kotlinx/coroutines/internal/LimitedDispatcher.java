package kotlinx.coroutines.internal;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C11057v0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import okhttp3.HttpUrl;

/* compiled from: LimitedDispatcher.kt */
@Metadata(m32266d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003H\u0016J#\u0010\u001a\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bH\u0082\bJ\u001c\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003H\u0017J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010!\u001a\u00020\u0013H\u0016J\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130$H\u0096\u0001J\b\u0010%\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rj\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, m32267d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/Delay;", "dispatcher", "parallelism", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "runningWorkers", "workerAllocationLock", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/SynchronizedObject;", "addAndTryDispatching", HttpUrl.FRAGMENT_ENCODE_SET, "block", "delay", HttpUrl.FRAGMENT_ENCODE_SET, "time", HttpUrl.FRAGMENT_ENCODE_SET, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "dispatchInternal", "Lkotlin/Function0;", "dispatchYield", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "limitedParallelism", "run", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryAllocateWorker", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.n, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class LimitedDispatcher extends CoroutineDispatcher implements Runnable, Delay {

    /* renamed from: g */
    private final CoroutineDispatcher f41808g;

    /* renamed from: h */
    private final int f41809h;

    /* renamed from: i */
    private final /* synthetic */ Delay f41810i;

    /* renamed from: j */
    private final LockFreeTaskQueue<Runnable> f41811j;

    /* renamed from: k */
    private final Object f41812k;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(CoroutineDispatcher coroutineDispatcher, int i2) {
        this.f41808g = coroutineDispatcher;
        this.f41809h = i2;
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.f41810i = delay == null ? C11057v0.m39700a() : delay;
        this.f41811j = new LockFreeTaskQueue<>(false);
        this.f41812k = new Object();
    }

    /* renamed from: T */
    private final boolean m39537T(Runnable runnable) {
        this.f41811j.m39563a(runnable);
        return this.runningWorkers >= this.f41809h;
    }

    /* renamed from: W */
    private final boolean m39538W() {
        synchronized (this.f41812k) {
            if (this.runningWorkers >= this.f41809h) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: K */
    public void mo39106K(CoroutineContext coroutineContext, Runnable runnable) {
        if (m39537T(runnable) || !m39538W()) {
            return;
        }
        this.f41808g.mo39106K(this, this);
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: e */
    public void mo39110e(long j2, CancellableContinuation<? super C10775u> cancellableContinuation) {
        this.f41810i.mo39110e(j2, cancellableContinuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        r1 = r4.f41812k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r4.f41811j.m39565c() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r4.runningWorkers++;
        r2 = kotlin.C10775u.f41439a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            kotlinx.coroutines.internal.s<java.lang.Runnable> r2 = r4.f41811j
            java.lang.Object r2 = r2.m39566d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            kotlin.y.h r3 = kotlin.coroutines.EmptyCoroutineContext.f41531f
            kotlinx.coroutines.C11017l0.m39620a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            kotlinx.coroutines.i0 r2 = r4.f41808g
            boolean r2 = r2.mo39107N(r4)
            if (r2 == 0) goto L2
            kotlinx.coroutines.i0 r0 = r4.f41808g
            r0.mo39106K(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f41812k
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.s<java.lang.Runnable> r2 = r4.f41811j     // Catch: java.lang.Throwable -> L47
            int r2 = r2.m39565c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlin.u r2 = kotlin.C10775u.f41439a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            goto L4b
        L4a:
            throw r0
        L4b:
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LimitedDispatcher.run():void");
    }
}
