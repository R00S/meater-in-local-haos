package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import okhttp3.HttpUrl;

/* compiled from: EventLoop.common.kt */
@Metadata(m32266d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b \u0018\u00002\u0002092\u00020::\u00044567B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0002J\u0017\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00032\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0002J\u000f\u0010\u0018\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0018\u0010\u0002J\u001d\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00142\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010\u0002R$\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0014\u00103\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016¨\u00068"}, m32267d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "closeQueue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dequeue", "()Ljava/lang/Runnable;", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "enqueue", "(Ljava/lang/Runnable;)V", HttpUrl.FRAGMENT_ENCODE_SET, "enqueueImpl", "(Ljava/lang/Runnable;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "processNextEvent", "()J", "rescheduleAllDelayed", "resetAll", "now", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "delayedTask", "schedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", HttpUrl.FRAGMENT_ENCODE_SET, "scheduleImpl", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)I", "timeMillis", "Lkotlinx/coroutines/DisposableHandle;", "scheduleInvokeOnTimeout", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "shouldUnpark", "(Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;)Z", "shutdown", "value", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "getNextTime", "nextTime", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.j1, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {

    /* renamed from: j */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41841j = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue");

    /* renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41842k = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* compiled from: EventLoop.common.kt */
    @Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m32267d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", HttpUrl.FRAGMENT_ENCODE_SET, "cont", "Lkotlinx/coroutines/CancellableContinuation;", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.j1$a */
    private final class a extends b {

        /* renamed from: h */
        private final CancellableContinuation<C10775u> f41843h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j2, CancellableContinuation<? super C10775u> cancellableContinuation) {
            super(j2);
            this.f41843h = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41843h.mo39634h(EventLoopImplBase.this, C10775u.f41439a);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.b
        public String toString() {
            return super.toString() + this.f41843h;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(m32266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u0007J\b\u0010$\u001a\u00020%H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m32267d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "nanoTime", HttpUrl.FRAGMENT_ENCODE_SET, "(J)V", "_heap", HttpUrl.FRAGMENT_ENCODE_SET, "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", HttpUrl.FRAGMENT_ENCODE_SET, "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "dispose", HttpUrl.FRAGMENT_ENCODE_SET, "scheduleTask", "now", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.j1$b */
    public static abstract class b implements Runnable, Comparable<b>, DisposableHandle, ThreadSafeHeapNode {
        private volatile Object _heap;

        /* renamed from: f */
        public long f41845f;

        /* renamed from: g */
        private int f41846g = -1;

        public b(long j2) {
            this.f41845f = j2;
        }

        /* renamed from: A */
        public final boolean m39612A(long j2) {
            return j2 - this.f41845f >= 0;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: D */
        public void mo39527D(int i2) {
            this.f41846g = i2;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: g, reason: from getter */
        public int getF41846g() {
            return this.f41846g;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        /* renamed from: k */
        public final synchronized void mo39285k() {
            Object obj = this._heap;
            if (obj == C11022m1.f41853a) {
                return;
            }
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                cVar.m39518g(this);
            }
            this._heap = C11022m1.f41853a;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: q */
        public void mo39529q(ThreadSafeHeap<?> threadSafeHeap) {
            if (!(this._heap != C11022m1.f41853a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = threadSafeHeap;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f41845f + ']';
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        /* renamed from: v */
        public ThreadSafeHeap<?> mo39530v() {
            Object obj = this._heap;
            if (obj instanceof ThreadSafeHeap) {
                return (ThreadSafeHeap) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            long j2 = this.f41845f - bVar.f41845f;
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }

        /* renamed from: y */
        public final synchronized int m39614y(long j2, c cVar, EventLoopImplBase eventLoopImplBase) {
            if (this._heap == C11022m1.f41853a) {
                return 2;
            }
            synchronized (cVar) {
                b bVarM39514b = cVar.m39514b();
                if (eventLoopImplBase.m39603M0()) {
                    return 1;
                }
                if (bVarM39514b == null) {
                    cVar.f41847b = j2;
                } else {
                    long j3 = bVarM39514b.f41845f;
                    if (j3 - j2 < 0) {
                        j2 = j3;
                    }
                    if (j2 - cVar.f41847b > 0) {
                        cVar.f41847b = j2;
                    }
                }
                long j4 = this.f41845f;
                long j5 = cVar.f41847b;
                if (j4 - j5 < 0) {
                    this.f41845f = j5;
                }
                cVar.m39513a(this);
                return 0;
            }
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m32267d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", HttpUrl.FRAGMENT_ENCODE_SET, "(J)V", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.j1$c */
    public static final class c extends ThreadSafeHeap<b> {

        /* renamed from: b */
        public long f41847b;

        public c(long j2) {
            this.f41847b = j2;
        }
    }

    /* renamed from: F0 */
    private final void m39600F0() {
        if (C11045s0.m39681a() && !m39603M0()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f41841j.compareAndSet(this, null, C11022m1.f41854b)) {
                    return;
                }
            } else if (obj instanceof LockFreeTaskQueueCore) {
                ((LockFreeTaskQueueCore) obj).m39573d();
                return;
            } else {
                if (obj == C11022m1.f41854b) {
                    return;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                lockFreeTaskQueueCore.m39572a((Runnable) obj);
                if (f41841j.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                    return;
                }
            }
        }
    }

    /* renamed from: G0 */
    private final Runnable m39601G0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof LockFreeTaskQueueCore) {
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                Object objM39577j = lockFreeTaskQueueCore.m39577j();
                if (objM39577j != LockFreeTaskQueueCore.f41824d) {
                    return (Runnable) objM39577j;
                }
                f41841j.compareAndSet(this, obj, lockFreeTaskQueueCore.m39576i());
            } else {
                if (obj == C11022m1.f41854b) {
                    return null;
                }
                if (f41841j.compareAndSet(this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: K0 */
    private final boolean m39602K0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m39603M0()) {
                return false;
            }
            if (obj == null) {
                if (f41841j.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof LockFreeTaskQueueCore) {
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                int iM39572a = lockFreeTaskQueueCore.m39572a(runnable);
                if (iM39572a == 0) {
                    return true;
                }
                if (iM39572a == 1) {
                    f41841j.compareAndSet(this, obj, lockFreeTaskQueueCore.m39576i());
                } else if (iM39572a == 2) {
                    return false;
                }
            } else {
                if (obj == C11022m1.f41854b) {
                    return false;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore2 = new LockFreeTaskQueueCore(8, true);
                lockFreeTaskQueueCore2.m39572a((Runnable) obj);
                lockFreeTaskQueueCore2.m39572a(runnable);
                if (f41841j.compareAndSet(this, obj, lockFreeTaskQueueCore2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: M0 */
    public final boolean m39603M0() {
        return this._isCompleted;
    }

    /* renamed from: Q0 */
    private final void m39604Q0() {
        b bVarM39520i;
        if (C10893c.m39138a() != null) {
            throw null;
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            if (cVar == null || (bVarM39520i = cVar.m39520i()) == null) {
                return;
            } else {
                mo39617x0(jNanoTime, bVarM39520i);
            }
        }
    }

    /* renamed from: V0 */
    private final int m39605V0(long j2, b bVar) {
        if (m39603M0()) {
            return 1;
        }
        c cVar = (c) this._delayed;
        if (cVar == null) {
            f41842k.compareAndSet(this, null, new c(j2));
            Object obj = this._delayed;
            C9801m.m32343c(obj);
            cVar = (c) obj;
        }
        return bVar.m39614y(j2, cVar, this);
    }

    /* renamed from: X0 */
    private final void m39606X0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: Z0 */
    private final boolean m39607Z0(b bVar) {
        c cVar = (c) this._delayed;
        return (cVar != null ? cVar.m39517e() : null) == bVar;
    }

    /* renamed from: J0 */
    public void mo39608J0(Runnable runnable) {
        if (m39602K0(runnable)) {
            m39618y0();
        } else {
            DefaultExecutor.f41885l.mo39608J0(runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: K */
    public final void mo39106K(CoroutineContext coroutineContext, Runnable runnable) {
        mo39608J0(runnable);
    }

    /* renamed from: N0 */
    protected boolean m39609N0() {
        if (!m39435m0()) {
            return false;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.m39516d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof LockFreeTaskQueueCore) {
                return ((LockFreeTaskQueueCore) obj).m39575g();
            }
            if (obj != C11022m1.f41854b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: R0 */
    protected final void m39610R0() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: T0 */
    public final void m39611T0(long j2, b bVar) {
        int iM39605V0 = m39605V0(j2, bVar);
        if (iM39605V0 == 0) {
            if (m39607Z0(bVar)) {
                m39618y0();
            }
        } else if (iM39605V0 == 1) {
            mo39617x0(j2, bVar);
        } else if (iM39605V0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // kotlinx.coroutines.EventLoop
    /* renamed from: a0 */
    protected long mo39432a0() {
        b bVarM39517e;
        if (super.mo39432a0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                return obj == C11022m1.f41854b ? Long.MAX_VALUE : 0L;
            }
            if (!((LockFreeTaskQueueCore) obj).m39575g()) {
                return 0L;
            }
        }
        c cVar = (c) this._delayed;
        if (cVar == null || (bVarM39517e = cVar.m39517e()) == null) {
            return Long.MAX_VALUE;
        }
        long j2 = bVarM39517e.f41845f;
        if (C10893c.m39138a() == null) {
            return C9848l.m32420c(j2 - System.nanoTime(), 0L);
        }
        throw null;
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: e */
    public void mo39110e(long j2, CancellableContinuation<? super C10775u> cancellableContinuation) {
        long jM39630c = C11022m1.m39630c(j2);
        if (jM39630c < 4611686018427387903L) {
            if (C10893c.m39138a() != null) {
                throw null;
            }
            long jNanoTime = System.nanoTime();
            a aVar = new a(jM39630c + jNanoTime, cancellableContinuation);
            m39611T0(jNanoTime, aVar);
            C11036q.m39673a(cancellableContinuation, aVar);
        }
    }

    @Override // kotlinx.coroutines.EventLoop
    /* renamed from: n0 */
    public long mo39436n0() {
        b bVarM39519h;
        if (m39437p0()) {
            return 0L;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.m39516d()) {
            if (C10893c.m39138a() != null) {
                throw null;
            }
            long jNanoTime = System.nanoTime();
            do {
                synchronized (cVar) {
                    b bVarM39514b = cVar.m39514b();
                    if (bVarM39514b == null) {
                        bVarM39519h = null;
                    } else {
                        b bVar = bVarM39514b;
                        bVarM39519h = bVar.m39612A(jNanoTime) ? m39602K0(bVar) : false ? cVar.m39519h(0) : null;
                    }
                }
            } while (bVarM39519h != null);
        }
        Runnable runnableM39601G0 = m39601G0();
        if (runnableM39601G0 == null) {
            return mo39432a0();
        }
        runnableM39601G0.run();
        return 0L;
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
        ThreadLocalEventLoop.f41888a.m39698c();
        m39606X0(true);
        m39600F0();
        while (mo39436n0() <= 0) {
        }
        m39604Q0();
    }
}
