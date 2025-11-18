package ec;

import Xb.C1829c;
import Xb.M;
import cc.C2356A;
import cc.C2361F;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.O;
import oa.C4153F;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: CoroutineScheduler.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0003YZ!B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\u0004\u0018\u00010\f*\b\u0018\u00010\u0011R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010\u0013J)\u0010)\u001a\u00020\u00192\n\u0010\u0014\u001a\u00060\u0011R\u00020\u00002\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000¢\u0006\u0004\b+\u0010,J\u001b\u00100\u001a\u00020\u00192\n\u0010/\u001a\u00060-j\u0002`.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0019H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J-\u0010:\u001a\u00020\u00192\n\u00107\u001a\u00060-j\u0002`.2\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010#\u001a\u00020\u000e¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u00020\f2\n\u00107\u001a\u00060-j\u0002`.2\u0006\u00109\u001a\u000208¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0019¢\u0006\u0004\b>\u00103J\u000f\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010KR\u001e\u0010R\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00000O8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0011\u0010S\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bS\u0010 R\u000b\u0010U\u001a\u00020T8\u0002X\u0082\u0004R\u000b\u0010W\u001a\u00020V8\u0002X\u0082\u0004R\u000b\u0010X\u001a\u00020V8\u0002X\u0082\u0004¨\u0006["}, d2 = {"Lec/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lec/h;", "task", "", "b", "(Lec/h;)Z", "Lec/a$c;", "p", "()Lec/a$c;", "worker", "o", "(Lec/a$c;)I", "stateSnapshot", "skipUnpark", "Loa/F;", "y", "(JZ)V", "state", "K", "(J)Z", "N", "()Z", "d", "()I", "tailDispatch", "C", "(Lec/a$c;Lec/h;Z)Lec/h;", "f", "oldIndex", "newIndex", "s", "(Lec/a$c;II)V", "q", "(Lec/a$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "x", "(J)V", "block", "Lec/i;", "taskContext", "g", "(Ljava/lang/Runnable;Lec/i;Z)V", "e", "(Ljava/lang/Runnable;Lec/i;)Lec/h;", "z", "toString", "()Ljava/lang/String;", "u", "(Lec/h;)V", "B", "I", "D", "J", "E", "Ljava/lang/String;", "Lec/d;", "F", "Lec/d;", "globalCpuQueue", "G", "globalBlockingQueue", "Lcc/A;", "H", "Lcc/A;", "workers", "isTerminated", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "Lkotlinx/atomicfu/AtomicLong;", "controlState", "parkedWorkersStack", "a", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ec.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC3294a implements Executor, Closeable {

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f40954J = AtomicLongFieldUpdater.newUpdater(ExecutorC3294a.class, "parkedWorkersStack$volatile");

    /* renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f40955K = AtomicLongFieldUpdater.newUpdater(ExecutorC3294a.class, "controlState$volatile");

    /* renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f40956L = AtomicIntegerFieldUpdater.newUpdater(ExecutorC3294a.class, "_isTerminated$volatile");

    /* renamed from: M, reason: collision with root package name */
    public static final C2361F f40957M = new C2361F("NOT_IN_STACK");

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final int corePoolSize;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final int maxPoolSize;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final long idleWorkerKeepAliveNs;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final String schedulerName;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public final C3297d globalCpuQueue;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public final C3297d globalBlockingQueue;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public final C2356A<c> workers;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ec.a$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40965a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f40977D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f40976C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f40975B.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f40978E.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f40979F.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f40965a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lec/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "F", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ec.a$d */
    public static final class d {

        /* renamed from: B, reason: collision with root package name */
        public static final d f40975B = new d("CPU_ACQUIRED", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final d f40976C = new d("BLOCKING", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final d f40977D = new d("PARKING", 2);

        /* renamed from: E, reason: collision with root package name */
        public static final d f40978E = new d("DORMANT", 3);

        /* renamed from: F, reason: collision with root package name */
        public static final d f40979F = new d("TERMINATED", 4);

        /* renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ d[] f40980G;

        /* renamed from: H, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f40981H;

        static {
            d[] dVarArrC = c();
            f40980G = dVarArrC;
            f40981H = C4929b.a(dVarArrC);
        }

        private d(String str, int i10) {
        }

        private static final /* synthetic */ d[] c() {
            return new d[]{f40975B, f40976C, f40977D, f40978E, f40979F};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f40980G.clone();
        }
    }

    public ExecutorC3294a(int i10, int i11, long j10, String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.globalCpuQueue = new C3297d();
        this.globalBlockingQueue = new C3297d();
        this.workers = new C2356A<>((i10 + 1) * 2);
        this.controlState$volatile = i10 << 42;
        this._isTerminated$volatile = 0;
    }

    private final h C(c cVar, h hVar, boolean z10) {
        if (cVar == null || cVar.state == d.f40979F) {
            return hVar;
        }
        if (hVar.taskContext.getTaskMode() == 0 && cVar.state == d.f40976C) {
            return hVar;
        }
        cVar.mayHaveLocalTasks = true;
        return cVar.localQueue.a(hVar, z10);
    }

    private final boolean K(long state) {
        if (Ha.g.d(((int) (2097151 & state)) - ((int) ((state & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int iD = d();
            if (iD == 1 && this.corePoolSize > 1) {
                d();
            }
            if (iD > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean L(ExecutorC3294a executorC3294a, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f40955K.get(executorC3294a);
        }
        return executorC3294a.K(j10);
    }

    private final boolean N() {
        c cVarP;
        do {
            cVarP = p();
            if (cVarP == null) {
                return false;
            }
        } while (!c.f40966J.compareAndSet(cVarP, -1, 0));
        LockSupport.unpark(cVarP);
        return true;
    }

    private final boolean b(h task) {
        return task.taskContext.getTaskMode() == 1 ? this.globalBlockingQueue.a(task) : this.globalCpuQueue.a(task);
    }

    private final int d() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f40955K.get(this);
                int i10 = (int) (j10 & 2097151);
                int iD = Ha.g.d(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iD >= this.corePoolSize) {
                    return 0;
                }
                if (i10 >= this.maxPoolSize) {
                    return 0;
                }
                int i11 = ((int) (l().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.workers.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.workers.c(i11, cVar);
                if (i11 != ((int) (2097151 & f40955K.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iD + 1;
                cVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final c f() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !C3862t.b(ExecutorC3294a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void k(ExecutorC3294a executorC3294a, Runnable runnable, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f41001g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        executorC3294a.g(runnable, iVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater l() {
        return f40955K;
    }

    private final int o(c worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f40957M) {
            if (nextParkedWorker == null) {
                return 0;
            }
            c cVar = (c) nextParkedWorker;
            int indexInArray = cVar.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = cVar.getNextParkedWorker();
        }
        return -1;
    }

    private final c p() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40954J;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVarB = this.workers.b((int) (2097151 & j10));
            if (cVarB == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iO = o(cVarB);
            if (iO >= 0 && f40954J.compareAndSet(this, j10, iO | j11)) {
                cVarB.r(f40957M);
                return cVarB;
            }
        }
    }

    private final void y(long stateSnapshot, boolean skipUnpark) {
        if (skipUnpark || N() || K(stateSnapshot)) {
            return;
        }
        N();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        x(10000L);
    }

    public final h e(Runnable block, i taskContext) {
        long jA = l.f41000f.a();
        if (!(block instanceof h)) {
            return new k(block, jA, taskContext);
        }
        h hVar = (h) block;
        hVar.submissionTime = jA;
        hVar.taskContext = taskContext;
        return hVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        k(this, command, null, false, 6, null);
    }

    public final void g(Runnable block, i taskContext, boolean tailDispatch) {
        C1829c.a();
        h hVarE = e(block, taskContext);
        boolean z10 = false;
        boolean z11 = hVarE.taskContext.getTaskMode() == 1;
        long jAddAndGet = z11 ? f40955K.addAndGet(this, 2097152L) : 0L;
        c cVarF = f();
        h hVarC = C(cVarF, hVarE, tailDispatch);
        if (hVarC != null && !b(hVarC)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (tailDispatch && cVarF != null) {
            z10 = true;
        }
        if (z11) {
            y(jAddAndGet, z10);
        } else {
            if (z10) {
                return;
            }
            z();
        }
    }

    public final boolean isTerminated() {
        return f40956L.get(this) != 0;
    }

    public final boolean q(c worker) {
        long j10;
        int indexInArray;
        if (worker.getNextParkedWorker() != f40957M) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40954J;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            indexInArray = worker.getIndexInArray();
            worker.r(this.workers.b((int) (2097151 & j10)));
        } while (!f40954J.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | indexInArray));
        return true;
    }

    public final void s(c worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40954J;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iO = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iO == oldIndex) {
                iO = newIndex == 0 ? o(worker) : newIndex;
            }
            if (iO >= 0 && f40954J.compareAndSet(this, j10, j11 | iO)) {
                return;
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.workers.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVarB = this.workers.b(i15);
            if (cVarB != null) {
                int i16 = cVarB.localQueue.i();
                int i17 = b.f40965a[cVarB.state.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i17 == 5) {
                    i14++;
                }
            }
        }
        long j10 = f40955K.get(this);
        return this.schedulerName + '@' + M.b(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.c() + ", global blocking queue size = " + this.globalBlockingQueue.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void u(h task) {
        try {
            task.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = n()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            ec.a$c r0 = r7.f()
            cc.A<ec.a$c> r1 = r7.workers
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            cc.A<ec.a$c> r4 = r7.workers
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.C3862t.d(r4)
            ec.a$c r4 = (ec.ExecutorC3294a.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            ec.n r4 = r4.localQueue
            ec.d r5 = r7.globalBlockingQueue
            r4.j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            ec.d r8 = r7.globalBlockingQueue
            r8.b()
            ec.d r8 = r7.globalCpuQueue
            r8.b()
        L57:
            if (r0 == 0) goto L5f
            ec.h r8 = r0.g(r2)
            if (r8 != 0) goto L8b
        L5f:
            ec.d r8 = r7.globalCpuQueue
            java.lang.Object r8 = r8.e()
            ec.h r8 = (ec.h) r8
            if (r8 != 0) goto L8b
            ec.d r8 = r7.globalBlockingQueue
            java.lang.Object r8 = r8.e()
            ec.h r8 = (ec.h) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            ec.a$d r8 = ec.ExecutorC3294a.d.f40979F
            r0.u(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = m()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = l()
            r8.set(r7, r0)
            return
        L8b:
            r7.u(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.ExecutorC3294a.x(long):void");
    }

    public final void z() {
        if (N() || L(this, 0L, 1, null)) {
            return;
        }
        N();
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b \u0010\u001cJ\u001d\u0010#\u001a\u0004\u0018\u00010\u000f2\n\u0010\"\u001a\u00060\u0004j\u0002`!H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\fJ\u0015\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\u001fR*\u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0015R\u0014\u00107\u001a\u0002048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010AR\u0016\u0010M\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00100R\u0016\u0010-\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\b\u0010Q\u001a\u00020P8\u0006¨\u0006R"}, d2 = {"Lec/a$c;", "Ljava/lang/Thread;", "<init>", "(Lec/a;)V", "", "index", "(Lec/a;I)V", "", "s", "()Z", "Loa/F;", "p", "()V", "t", "l", "Lec/h;", "task", "d", "(Lec/h;)V", "taskMode", "c", "(I)V", "b", "n", "w", "mode", "k", "f", "()Lec/h;", "scanLocalQueue", "e", "(Z)Lec/h;", "o", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "v", "(I)Lec/h;", "Lec/a$d;", "newState", "u", "(Lec/a$d;)Z", "run", "upperBound", "m", "(I)I", "mayHaveLocalTasks", "g", "indexInArray", "I", "h", "()I", "q", "Lec/n;", "B", "Lec/n;", "localQueue", "Lkotlin/jvm/internal/O;", "C", "Lkotlin/jvm/internal/O;", "stolenTask", "D", "Lec/a$d;", "state", "", "E", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "r", "(Ljava/lang/Object;)V", "F", "minDelayUntilStealableTaskNs", "G", "rngState", "H", "Z", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ec.a$c */
    public final class c extends Thread {

        /* renamed from: J, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f40966J = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        public final n localQueue;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final O<h> stolenTask;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        public d state;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private long terminationDeadline;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private long minDelayUntilStealableTaskNs;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private int rngState;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        public boolean mayHaveLocalTasks;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(ExecutorC3294a.this.getClass().getClassLoader());
            this.localQueue = new n();
            this.stolenTask = new O<>();
            this.state = d.f40978E;
            this.nextParkedWorker = ExecutorC3294a.f40957M;
            int iNanoTime = (int) System.nanoTime();
            this.rngState = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void b(int taskMode) {
            if (taskMode == 0) {
                return;
            }
            ExecutorC3294a.l().addAndGet(ExecutorC3294a.this, -2097152L);
            if (this.state != d.f40979F) {
                this.state = d.f40978E;
            }
        }

        private final void c(int taskMode) {
            if (taskMode != 0 && u(d.f40976C)) {
                ExecutorC3294a.this.z();
            }
        }

        private final void d(h task) {
            int taskMode = task.taskContext.getTaskMode();
            k(taskMode);
            c(taskMode);
            ExecutorC3294a.this.u(task);
            b(taskMode);
        }

        private final h e(boolean scanLocalQueue) {
            h hVarO;
            h hVarO2;
            if (scanLocalQueue) {
                boolean z10 = m(ExecutorC3294a.this.corePoolSize * 2) == 0;
                if (z10 && (hVarO2 = o()) != null) {
                    return hVarO2;
                }
                h hVarK = this.localQueue.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z10 && (hVarO = o()) != null) {
                    return hVarO;
                }
            } else {
                h hVarO3 = o();
                if (hVarO3 != null) {
                    return hVarO3;
                }
            }
            return v(3);
        }

        private final h f() {
            h hVarL = this.localQueue.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVarE = ExecutorC3294a.this.globalBlockingQueue.e();
            return hVarE == null ? v(1) : hVarE;
        }

        private final void k(int mode) {
            this.terminationDeadline = 0L;
            if (this.state == d.f40977D) {
                this.state = d.f40976C;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != ExecutorC3294a.f40957M;
        }

        private final void n() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + ExecutorC3294a.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(ExecutorC3294a.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                w();
            }
        }

        private final h o() {
            if (m(2) == 0) {
                h hVarE = ExecutorC3294a.this.globalCpuQueue.e();
                return hVarE != null ? hVarE : ExecutorC3294a.this.globalBlockingQueue.e();
            }
            h hVarE2 = ExecutorC3294a.this.globalBlockingQueue.e();
            return hVarE2 != null ? hVarE2 : ExecutorC3294a.this.globalCpuQueue.e();
        }

        private final void p() {
            loop0: while (true) {
                boolean z10 = false;
                while (!ExecutorC3294a.this.isTerminated() && this.state != d.f40979F) {
                    h hVarG = g(this.mayHaveLocalTasks);
                    if (hVarG != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        d(hVarG);
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.minDelayUntilStealableTaskNs == 0) {
                            t();
                        } else if (z10) {
                            u(d.f40977D);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            u(d.f40979F);
        }

        private final boolean s() {
            long j10;
            if (this.state == d.f40975B) {
                return true;
            }
            ExecutorC3294a executorC3294a = ExecutorC3294a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterL = ExecutorC3294a.l();
            do {
                j10 = atomicLongFieldUpdaterL.get(executorC3294a);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC3294a.l().compareAndSet(executorC3294a, j10, j10 - 4398046511104L));
            this.state = d.f40975B;
            return true;
        }

        private final void t() {
            if (!l()) {
                ExecutorC3294a.this.q(this);
                return;
            }
            f40966J.set(this, -1);
            while (l() && f40966J.get(this) == -1 && !ExecutorC3294a.this.isTerminated() && this.state != d.f40979F) {
                u(d.f40977D);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int stealingMode) {
            int i10 = (int) (ExecutorC3294a.l().get(ExecutorC3294a.this) & 2097151);
            if (i10 < 2) {
                return null;
            }
            int iM = m(i10);
            ExecutorC3294a executorC3294a = ExecutorC3294a.this;
            long jMin = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                iM++;
                if (iM > i10) {
                    iM = 1;
                }
                c cVarB = executorC3294a.workers.b(iM);
                if (cVarB != null && cVarB != this) {
                    long jR = cVarB.localQueue.r(stealingMode, this.stolenTask);
                    if (jR == -1) {
                        O<h> o10 = this.stolenTask;
                        h hVar = o10.f43978B;
                        o10.f43978B = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }

        private final void w() {
            ExecutorC3294a executorC3294a = ExecutorC3294a.this;
            synchronized (executorC3294a.workers) {
                try {
                    if (executorC3294a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC3294a.l().get(executorC3294a) & 2097151)) <= executorC3294a.corePoolSize) {
                        return;
                    }
                    if (f40966J.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        q(0);
                        executorC3294a.s(this, i10, 0);
                        int andDecrement = (int) (ExecutorC3294a.l().getAndDecrement(executorC3294a) & 2097151);
                        if (andDecrement != i10) {
                            c cVarB = executorC3294a.workers.b(andDecrement);
                            C3862t.d(cVarB);
                            c cVar = cVarB;
                            executorC3294a.workers.c(i10, cVar);
                            cVar.q(i10);
                            executorC3294a.s(cVar, andDecrement, i10);
                        }
                        executorC3294a.workers.c(andDecrement, null);
                        C4153F c4153f = C4153F.f46609a;
                        this.state = d.f40979F;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final h g(boolean mayHaveLocalTasks) {
            return s() ? e(mayHaveLocalTasks) : f();
        }

        /* renamed from: h, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        /* renamed from: i, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final int m(int upperBound) {
            int i10 = this.rngState;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >> 17);
            int i13 = i12 ^ (i12 << 5);
            this.rngState = i13;
            int i14 = upperBound - 1;
            return (i14 & upperBound) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % upperBound;
        }

        public final void q(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ExecutorC3294a.this.schedulerName);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d newState) {
            d dVar = this.state;
            boolean z10 = dVar == d.f40975B;
            if (z10) {
                ExecutorC3294a.l().addAndGet(ExecutorC3294a.this, 4398046511104L);
            }
            if (dVar != newState) {
                this.state = newState;
            }
            return z10;
        }

        public c(ExecutorC3294a executorC3294a, int i10) {
            this();
            q(i10);
        }
    }
}
