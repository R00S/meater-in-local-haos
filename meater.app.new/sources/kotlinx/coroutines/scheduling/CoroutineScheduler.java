package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.random.Random;
import kotlin.ranges.C9848l;
import kotlinx.coroutines.C10893c;
import kotlinx.coroutines.C11045s0;
import kotlinx.coroutines.C11049t0;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;
import okhttp3.HttpUrl;

/* compiled from: CoroutineScheduler.kt */
@Metadata(m32266d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000 X2\u00020\\2\u00020]:\u0003XYZB+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001d\u001a\u00020\n2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010!\u001a\b\u0018\u00010 R\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013H\u0082\b¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010$\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\b$\u0010\u0017J-\u0010&\u001a\u00020\u00132\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\f¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u00132\n\u0010(\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\b-\u0010\u0017J\u001b\u0010/\u001a\u00020\u00012\n\u0010.\u001a\u00060 R\u00020\u0000H\u0002¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\b\u0018\u00010 R\u00020\u0000H\u0002¢\u0006\u0004\b1\u0010\"J\u0019\u00102\u001a\u00020\f2\n\u0010.\u001a\u00060 R\u00020\u0000¢\u0006\u0004\b2\u00103J)\u00106\u001a\u00020\u00132\n\u0010.\u001a\u00060 R\u00020\u00002\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b8\u0010,J\u0015\u00109\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0013¢\u0006\u0004\bA\u0010\u0015J\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\fH\u0082\b¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\fH\u0002¢\u0006\u0004\bH\u0010EJ+\u0010I\u001a\u0004\u0018\u00010\n*\b\u0018\u00010 R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\bI\u0010JR\u0015\u0010\u0010\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010LR\u0015\u0010\u001f\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0017R\u0014\u0010O\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0011\u0010S\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bS\u0010ER\u0014\u0010\u0003\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010TR\u001e\u0010V\u001a\f\u0012\b\u0012\u00060 R\u00020\u00000U8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006["}, m32267d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", HttpUrl.FRAGMENT_ENCODE_SET, "corePoolSize", "maxPoolSize", HttpUrl.FRAGMENT_ENCODE_SET, "idleWorkerKeepAliveNs", HttpUrl.FRAGMENT_ENCODE_SET, "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/Task;", "task", HttpUrl.FRAGMENT_ENCODE_SET, "addToGlobalQueue", "(Lkotlinx/coroutines/scheduling/Task;)Z", "state", "availableCpuPermits", "(J)I", "blockingTasks", HttpUrl.FRAGMENT_ENCODE_SET, "close", "()V", "createNewWorker", "()I", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "createTask", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;", "createdWorkers", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "currentWorker", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "decrementBlockingTasks", "decrementCreatedWorkers", "tailDispatch", "dispatch", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "incrementBlockingTasks", "()J", "incrementCreatedWorkers", "worker", "parkedWorkersStackNextIndex", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I", "parkedWorkersStackPop", "parkedWorkersStackPush", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)Z", "oldIndex", "newIndex", "parkedWorkersStackTopUpdate", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V", "releaseCpuPermit", "runSafely", "(Lkotlinx/coroutines/scheduling/Task;)V", "timeout", "shutdown", "(J)V", "skipUnpark", "signalBlockingWork", "(Z)V", "signalCpuWork", "toString", "()Ljava/lang/String;", "tryAcquireCpuPermit", "()Z", "tryCreateWorker", "(J)Z", "tryUnpark", "submitToLocalQueue", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "getAvailableCpuPermits", "I", "getCreatedWorkers", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "J", "isTerminated", "Ljava/lang/String;", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.c3.a, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: k */
    public final int f41596k;

    /* renamed from: l */
    public final int f41597l;

    /* renamed from: m */
    public final long f41598m;

    /* renamed from: n */
    public final String f41599n;

    /* renamed from: o */
    public final GlobalQueue f41600o;

    /* renamed from: p */
    public final GlobalQueue f41601p;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: q */
    public final ResizableAtomicArray<c> f41602q;

    /* renamed from: f */
    public static final a f41591f = new a(null);

    /* renamed from: j */
    public static final Symbol f41595j = new Symbol("NOT_IN_STACK");

    /* renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f41592g = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* renamed from: h */
    static final /* synthetic */ AtomicLongFieldUpdater f41593h = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: i */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f41594i = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m32267d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "BLOCKING_MASK", HttpUrl.FRAGMENT_ENCODE_SET, "BLOCKING_SHIFT", HttpUrl.FRAGMENT_ENCODE_SET, "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.c3.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.c3.a$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41603a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f41603a = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m32267d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.c3.a$d */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public CoroutineScheduler(int i2, int i3, long j2, String str) {
        this.f41596k = i2;
        this.f41597l = i3;
        this.f41598m = j2;
        this.f41599n = str;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (!(i3 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f41600o = new GlobalQueue();
        this.f41601p = new GlobalQueue();
        this.parkedWorkersStack = 0L;
        this.f41602q = new ResizableAtomicArray<>(i2 + 1);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    /* renamed from: A */
    private final void m39145A(boolean z) {
        long jAddAndGet = f41593h.addAndGet(this, 2097152L);
        if (z || m39149J() || m39147H(jAddAndGet)) {
            return;
        }
        m39149J();
    }

    /* renamed from: D */
    private final Task m39146D(c cVar, Task task, boolean z) {
        if (cVar == null || cVar.f41606h == d.TERMINATED) {
            return task;
        }
        if (task.f41628g.getF41629a() == 0 && cVar.f41606h == d.BLOCKING) {
            return task;
        }
        cVar.f41610l = true;
        return cVar.f41605g.m39196a(task, z);
    }

    /* renamed from: H */
    private final boolean m39147H(long j2) {
        if (C9848l.m32419b(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0) < this.f41596k) {
            int iM39151b = m39151b();
            if (iM39151b == 1 && this.f41596k > 1) {
                m39151b();
            }
            if (iM39151b > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    static /* synthetic */ boolean m39148I(CoroutineScheduler coroutineScheduler, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = coroutineScheduler.controlState;
        }
        return coroutineScheduler.m39147H(j2);
    }

    /* renamed from: J */
    private final boolean m39149J() {
        c cVarM39155k;
        do {
            cVarM39155k = m39155k();
            if (cVarM39155k == null) {
                return false;
            }
        } while (!c.f41604f.compareAndSet(cVarM39155k, -1, 0));
        LockSupport.unpark(cVarM39155k);
        return true;
    }

    /* renamed from: a */
    private final boolean m39150a(Task task) {
        return task.f41628g.getF41629a() == 1 ? this.f41601p.m39563a(task) : this.f41600o.m39563a(task);
    }

    /* renamed from: b */
    private final int m39151b() {
        synchronized (this.f41602q) {
            if (isTerminated()) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            int iM32419b = C9848l.m32419b(i2 - ((int) ((j2 & 4398044413952L) >> 21)), 0);
            if (iM32419b >= this.f41596k) {
                return 0;
            }
            if (i2 >= this.f41597l) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (!(i3 > 0 && this.f41602q.m39445b(i3) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c cVar = new c(this, i3);
            this.f41602q.m39446c(i3, cVar);
            if (!(i3 == ((int) (2097151 & f41593h.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            cVar.start();
            return iM32419b + 1;
        }
    }

    /* renamed from: d */
    private final c m39152d() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !C9801m.m32341a(CoroutineScheduler.this, this)) {
            return null;
        }
        return cVar;
    }

    /* renamed from: f */
    public static /* synthetic */ void m39153f(CoroutineScheduler coroutineScheduler, Runnable runnable, TaskContext taskContext, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            taskContext = C10908l.f41636f;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        coroutineScheduler.m39158e(runnable, taskContext, z);
    }

    /* renamed from: j */
    private final int m39154j(c cVar) {
        Object nextParkedWorker = cVar.getNextParkedWorker();
        while (nextParkedWorker != f41595j) {
            if (nextParkedWorker == null) {
                return 0;
            }
            c cVar2 = (c) nextParkedWorker;
            int indexInArray = cVar2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = cVar2.getNextParkedWorker();
        }
        return -1;
    }

    /* renamed from: k */
    private final c m39155k() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            c cVarM39445b = this.f41602q.m39445b((int) (2097151 & j2));
            if (cVarM39445b == null) {
                return null;
            }
            long j3 = (2097152 + j2) & (-2097152);
            int iM39154j = m39154j(cVarM39445b);
            if (iM39154j >= 0 && f41592g.compareAndSet(this, j2, iM39154j | j3)) {
                cVarM39445b.m39182p(f41595j);
                return cVarM39445b;
            }
        }
    }

    /* renamed from: B */
    public final void m39156B() {
        if (m39149J() || m39148I(this, 0L, 1, null)) {
            return;
        }
        m39149J();
    }

    /* renamed from: c */
    public final Task m39157c(Runnable runnable, TaskContext taskContext) {
        long jMo39185a = C10908l.f41635e.mo39185a();
        if (!(runnable instanceof Task)) {
            return new TaskImpl(runnable, jMo39185a, taskContext);
        }
        Task task = (Task) runnable;
        task.f41627f = jMo39185a;
        task.f41628g = taskContext;
        return task;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m39162z(10000L);
    }

    /* renamed from: e */
    public final void m39158e(Runnable runnable, TaskContext taskContext, boolean z) {
        if (C10893c.m39138a() != null) {
            throw null;
        }
        Task taskM39157c = m39157c(runnable, taskContext);
        c cVarM39152d = m39152d();
        Task taskM39146D = m39146D(cVarM39152d, taskM39157c, z);
        if (taskM39146D != null && !m39150a(taskM39146D)) {
            throw new RejectedExecutionException(this.f41599n + " was terminated");
        }
        boolean z2 = z && cVarM39152d != null;
        if (taskM39157c.f41628g.getF41629a() != 0) {
            m39145A(z2);
        } else {
            if (z2) {
                return;
            }
            m39156B();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        m39153f(this, command, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: l */
    public final boolean m39159l(c cVar) {
        long j2;
        long j3;
        int indexInArray;
        if (cVar.getNextParkedWorker() != f41595j) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            int i2 = (int) (2097151 & j2);
            j3 = (2097152 + j2) & (-2097152);
            indexInArray = cVar.getIndexInArray();
            if (C11045s0.m39681a()) {
                if (!(indexInArray != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.m39182p(this.f41602q.m39445b(i2));
        } while (!f41592g.compareAndSet(this, j2, indexInArray | j3));
        return true;
    }

    /* renamed from: m */
    public final void m39160m(c cVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int iM39154j = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (iM39154j == i2) {
                iM39154j = i3 == 0 ? m39154j(cVar) : i3;
            }
            if (iM39154j >= 0 && f41592g.compareAndSet(this, j2, j3 | iM39154j)) {
                return;
            }
        }
    }

    /* renamed from: p */
    public final void m39161p(Task task) {
        try {
            task.run();
            if (C10893c.m39138a() != null) {
                throw null;
            }
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                if (C10893c.m39138a() != null) {
                    throw null;
                }
            } catch (Throwable th2) {
                if (C10893c.m39138a() == null) {
                    throw th2;
                }
                throw null;
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM39444a = this.f41602q.m39444a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iM39444a; i7++) {
            c cVarM39445b = this.f41602q.m39445b(i7);
            if (cVarM39445b != null) {
                int iM39198f = cVarM39445b.f41605g.m39198f();
                int i8 = b.f41603a[cVarM39445b.f41606h.ordinal()];
                if (i8 == 1) {
                    i4++;
                } else if (i8 == 2) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM39198f);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i8 == 3) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM39198f);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i8 == 4) {
                    i5++;
                    if (iM39198f > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM39198f);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i8 == 5) {
                    i6++;
                }
            }
        }
        long j2 = this.controlState;
        return this.f41599n + '@' + C11049t0.m39688b(this) + "[Pool Size {core = " + this.f41596k + ", max = " + this.f41597l + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i5 + ", terminated = " + i6 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f41600o.m39565c() + ", global blocking queue size = " + this.f41601p.m39565c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.f41596k - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m39162z(long r9) throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.f41594i
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.c3.a$c r0 = r8.m39152d()
            kotlinx.coroutines.internal.b0<kotlinx.coroutines.c3.a$c> r3 = r8.f41602q
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch: java.lang.Throwable -> Lb3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L5b
            r3 = 1
        L1d:
            kotlinx.coroutines.internal.b0<kotlinx.coroutines.c3.a$c> r4 = r8.f41602q
            java.lang.Object r4 = r4.m39445b(r3)
            kotlin.jvm.internal.C9801m.m32343c(r4)
            kotlinx.coroutines.c3.a$c r4 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r4
            if (r4 == r0) goto L56
        L2a:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L37
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r9)
            goto L2a
        L37:
            kotlinx.coroutines.c3.a$d r6 = r4.f41606h
            boolean r7 = kotlinx.coroutines.C11045s0.m39681a()
            if (r7 == 0) goto L4f
            kotlinx.coroutines.c3.a$d r7 = kotlinx.coroutines.scheduling.CoroutineScheduler.d.TERMINATED
            if (r6 != r7) goto L45
            r6 = 1
            goto L46
        L45:
            r6 = 0
        L46:
            if (r6 == 0) goto L49
            goto L4f
        L49:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L4f:
            kotlinx.coroutines.c3.n r4 = r4.f41605g
            kotlinx.coroutines.c3.d r6 = r8.f41601p
            r4.m39199g(r6)
        L56:
            if (r3 == r5) goto L5b
            int r3 = r3 + 1
            goto L1d
        L5b:
            kotlinx.coroutines.c3.d r9 = r8.f41601p
            r9.m39564b()
            kotlinx.coroutines.c3.d r9 = r8.f41600o
            r9.m39564b()
        L65:
            if (r0 == 0) goto L6d
            kotlinx.coroutines.c3.h r9 = r0.m39177f(r2)
            if (r9 != 0) goto Laf
        L6d:
            kotlinx.coroutines.c3.d r9 = r8.f41600o
            java.lang.Object r9 = r9.m39566d()
            kotlinx.coroutines.c3.h r9 = (kotlinx.coroutines.scheduling.Task) r9
            if (r9 != 0) goto Laf
            kotlinx.coroutines.c3.d r9 = r8.f41601p
            java.lang.Object r9 = r9.m39566d()
            kotlinx.coroutines.c3.h r9 = (kotlinx.coroutines.scheduling.Task) r9
            if (r9 != 0) goto Laf
            if (r0 == 0) goto L88
            kotlinx.coroutines.c3.a$d r9 = kotlinx.coroutines.scheduling.CoroutineScheduler.d.TERMINATED
            r0.m39183s(r9)
        L88:
            boolean r9 = kotlinx.coroutines.C11045s0.m39681a()
            if (r9 == 0) goto La8
            long r9 = r8.controlState
            r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r9 = r9 & r3
            r0 = 42
            long r9 = r9 >> r0
            int r10 = (int) r9
            int r9 = r8.f41596k
            if (r10 != r9) goto L9f
            r1 = 1
        L9f:
            if (r1 == 0) goto La2
            goto La8
        La2:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        La8:
            r9 = 0
            r8.parkedWorkersStack = r9
            r8.controlState = r9
            return
        Laf:
            r8.m39161p(r9)
            goto L65
        Lb3:
            r9 = move-exception
            monitor-exit(r3)
            goto Lb7
        Lb6:
            throw r9
        Lb7:
            goto Lb6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.m39162z(long):void");
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(m32266d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0080\u0004\u0018\u00002\u00020GB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u001cR*\u0010*\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\tR\u0014\u00100\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010+R\u0012\u0010B\u001a\u00020?8Æ\u0002¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00106¨\u0006F"}, m32267d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", HttpUrl.FRAGMENT_ENCODE_SET, "index", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "taskMode", HttpUrl.FRAGMENT_ENCODE_SET, "afterTask", "(I)V", "beforeTask", "Lkotlinx/coroutines/scheduling/Task;", "task", "executeTask", "(Lkotlinx/coroutines/scheduling/Task;)V", HttpUrl.FRAGMENT_ENCODE_SET, "scanLocalQueue", "findAnyTask", "(Z)Lkotlinx/coroutines/scheduling/Task;", "findTask", "mode", "idleReset", "inStack", "()Z", "upperBound", "nextInt", "(I)I", "park", "()V", "pollGlobalQueues", "()Lkotlinx/coroutines/scheduling/Task;", "run", "runWorker", "tryAcquireCpuPermit", "tryPark", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "tryReleaseCpu", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "blockingOnly", "trySteal", "tryTerminateWorker", "indexInArray", "I", "getIndexInArray", "()I", "setIndexInArray", "Lkotlinx/coroutines/scheduling/WorkQueue;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "Z", HttpUrl.FRAGMENT_ENCODE_SET, "minDelayUntilStealableTaskNs", "J", HttpUrl.FRAGMENT_ENCODE_SET, "nextParkedWorker", "Ljava/lang/Object;", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "scheduler", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "terminationDeadline", "kotlinx-coroutines-core", "Ljava/lang/Thread;"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.c3.a$c */
    public final class c extends Thread {

        /* renamed from: f */
        static final /* synthetic */ AtomicIntegerFieldUpdater f41604f = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: g */
        public final WorkQueue f41605g;

        /* renamed from: h */
        public d f41606h;

        /* renamed from: i */
        private long f41607i;
        private volatile int indexInArray;

        /* renamed from: j */
        private long f41608j;

        /* renamed from: k */
        private int f41609k;

        /* renamed from: l */
        public boolean f41610l;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f41605g = new WorkQueue();
            this.f41606h = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f41595j;
            this.f41609k = Random.f37195f.mo32375c();
        }

        /* renamed from: b */
        private final void m39164b(int i2) {
            if (i2 == 0) {
                return;
            }
            CoroutineScheduler.f41593h.addAndGet(CoroutineScheduler.this, -2097152L);
            d dVar = this.f41606h;
            if (dVar != d.TERMINATED) {
                if (C11045s0.m39681a()) {
                    if (!(dVar == d.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f41606h = d.DORMANT;
            }
        }

        /* renamed from: c */
        private final void m39165c(int i2) {
            if (i2 != 0 && m39183s(d.BLOCKING)) {
                CoroutineScheduler.this.m39156B();
            }
        }

        /* renamed from: d */
        private final void m39166d(Task task) {
            int f41629a = task.f41628g.getF41629a();
            m39168i(f41629a);
            m39165c(f41629a);
            CoroutineScheduler.this.m39161p(task);
            m39164b(f41629a);
        }

        /* renamed from: e */
        private final Task m39167e(boolean z) {
            Task taskM39171m;
            Task taskM39171m2;
            if (z) {
                boolean z2 = m39180k(CoroutineScheduler.this.f41596k * 2) == 0;
                if (z2 && (taskM39171m2 = m39171m()) != null) {
                    return taskM39171m2;
                }
                Task taskM39200h = this.f41605g.m39200h();
                if (taskM39200h != null) {
                    return taskM39200h;
                }
                if (!z2 && (taskM39171m = m39171m()) != null) {
                    return taskM39171m;
                }
            } else {
                Task taskM39171m3 = m39171m();
                if (taskM39171m3 != null) {
                    return taskM39171m3;
                }
            }
            return m39175t(false);
        }

        /* renamed from: i */
        private final void m39168i(int i2) {
            this.f41607i = 0L;
            if (this.f41606h == d.PARKING) {
                if (C11045s0.m39681a()) {
                    if (!(i2 == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f41606h = d.BLOCKING;
            }
        }

        /* renamed from: j */
        private final boolean m39169j() {
            return this.nextParkedWorker != CoroutineScheduler.f41595j;
        }

        /* renamed from: l */
        private final void m39170l() {
            if (this.f41607i == 0) {
                this.f41607i = System.nanoTime() + CoroutineScheduler.this.f41598m;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f41598m);
            if (System.nanoTime() - this.f41607i >= 0) {
                this.f41607i = 0L;
                m39176u();
            }
        }

        /* renamed from: m */
        private final Task m39171m() {
            if (m39180k(2) == 0) {
                Task taskM39566d = CoroutineScheduler.this.f41600o.m39566d();
                return taskM39566d != null ? taskM39566d : CoroutineScheduler.this.f41601p.m39566d();
            }
            Task taskM39566d2 = CoroutineScheduler.this.f41601p.m39566d();
            return taskM39566d2 != null ? taskM39566d2 : CoroutineScheduler.this.f41600o.m39566d();
        }

        /* renamed from: n */
        private final void m39172n() {
            loop0: while (true) {
                boolean z = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f41606h != d.TERMINATED) {
                    Task taskM39177f = m39177f(this.f41610l);
                    if (taskM39177f != null) {
                        this.f41608j = 0L;
                        m39166d(taskM39177f);
                    } else {
                        this.f41610l = false;
                        if (this.f41608j == 0) {
                            m39174r();
                        } else if (z) {
                            m39183s(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f41608j);
                            this.f41608j = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
                break loop0;
            }
            m39183s(d.TERMINATED);
        }

        /* renamed from: q */
        private final boolean m39173q() {
            boolean z;
            if (this.f41606h != d.CPU_ACQUIRED) {
                CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                while (true) {
                    long j2 = coroutineScheduler.controlState;
                    if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                        z = false;
                        break;
                    }
                    if (CoroutineScheduler.f41593h.compareAndSet(coroutineScheduler, j2, j2 - 4398046511104L)) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f41606h = d.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: r */
        private final void m39174r() {
            if (!m39169j()) {
                CoroutineScheduler.this.m39159l(this);
                return;
            }
            if (C11045s0.m39681a()) {
                if (!(this.f41605g.m39198f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (m39169j() && this.workerCtl == -1 && !CoroutineScheduler.this.isTerminated() && this.f41606h != d.TERMINATED) {
                m39183s(d.PARKING);
                Thread.interrupted();
                m39170l();
            }
        }

        /* renamed from: t */
        private final Task m39175t(boolean z) {
            if (C11045s0.m39681a()) {
                if (!(this.f41605g.m39198f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i2 = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int iM39180k = m39180k(i2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                iM39180k++;
                if (iM39180k > i2) {
                    iM39180k = 1;
                }
                c cVarM39445b = coroutineScheduler.f41602q.m39445b(iM39180k);
                if (cVarM39445b != null && cVarM39445b != this) {
                    if (C11045s0.m39681a()) {
                        if (!(this.f41605g.m39198f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    long jM39201k = z ? this.f41605g.m39201k(cVarM39445b.f41605g) : this.f41605g.m39202l(cVarM39445b.f41605g);
                    if (jM39201k == -1) {
                        return this.f41605g.m39200h();
                    }
                    if (jM39201k > 0) {
                        jMin = Math.min(jMin, jM39201k);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f41608j = jMin;
            return null;
        }

        /* renamed from: u */
        private final void m39176u() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f41602q) {
                if (coroutineScheduler.isTerminated()) {
                    return;
                }
                if (((int) (coroutineScheduler.controlState & 2097151)) <= coroutineScheduler.f41596k) {
                    return;
                }
                if (f41604f.compareAndSet(this, -1, 1)) {
                    int i2 = this.indexInArray;
                    m39181o(0);
                    coroutineScheduler.m39160m(this, i2, 0);
                    int andDecrement = (int) (2097151 & CoroutineScheduler.f41593h.getAndDecrement(coroutineScheduler));
                    if (andDecrement != i2) {
                        c cVarM39445b = coroutineScheduler.f41602q.m39445b(andDecrement);
                        C9801m.m32343c(cVarM39445b);
                        c cVar = cVarM39445b;
                        coroutineScheduler.f41602q.m39446c(i2, cVar);
                        cVar.m39181o(i2);
                        coroutineScheduler.m39160m(cVar, andDecrement, i2);
                    }
                    coroutineScheduler.f41602q.m39446c(andDecrement, null);
                    C10775u c10775u = C10775u.f41439a;
                    this.f41606h = d.TERMINATED;
                }
            }
        }

        /* renamed from: f */
        public final Task m39177f(boolean z) {
            Task taskM39566d;
            if (m39173q()) {
                return m39167e(z);
            }
            if (!z || (taskM39566d = this.f41605g.m39200h()) == null) {
                taskM39566d = CoroutineScheduler.this.f41601p.m39566d();
            }
            return taskM39566d == null ? m39175t(true) : taskM39566d;
        }

        /* renamed from: g, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        /* renamed from: h, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final int m39180k(int i2) {
            int i3 = this.f41609k;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f41609k = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        /* renamed from: o */
        public final void m39181o(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f41599n);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        /* renamed from: p */
        public final void m39182p(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m39172n();
        }

        /* renamed from: s */
        public final boolean m39183s(d dVar) {
            d dVar2 = this.f41606h;
            boolean z = dVar2 == d.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.f41593h.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f41606h = dVar;
            }
            return z;
        }

        public c(CoroutineScheduler coroutineScheduler, int i2) {
            this();
            m39181o(i2);
        }
    }
}
