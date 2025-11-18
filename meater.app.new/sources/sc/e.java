package sc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: TaskRunner.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0003\u001a\u001f\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,¨\u0006."}, d2 = {"Lsc/e;", "", "Lsc/e$a;", "backend", "<init>", "(Lsc/e$a;)V", "Lsc/a;", "task", "Loa/F;", "e", "(Lsc/a;)V", "j", "", "delayNanos", "c", "(Lsc/a;J)V", "Lsc/d;", "taskQueue", "h", "(Lsc/d;)V", "d", "()Lsc/a;", "i", "()Lsc/d;", "f", "()V", "a", "Lsc/e$a;", "g", "()Lsc/e$a;", "", "b", "I", "nextQueueName", "", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "", "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final e f49702i = new e(new c(pc.d.N(pc.d.f47759i + " TaskRunner", true)));

    /* renamed from: j, reason: collision with root package name */
    private static final Logger f49703j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a backend;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nextQueueName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatorWaiting;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long coordinatorWakeUpAt;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<sc.d> busyQueues;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<sc.d> readyQueues;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Runnable runnable;

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsc/e$a;", "", "", "b", "()J", "Lsc/e;", "taskRunner", "Loa/F;", "c", "(Lsc/e;)V", "nanos", "a", "(Lsc/e;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        void a(e taskRunner, long nanos);

        long b();

        void c(e taskRunner);

        void execute(Runnable runnable);
    }

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsc/e$b;", "", "<init>", "()V", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "Lsc/e;", "INSTANCE", "Lsc/e;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: sc.e$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final Logger a() {
            return e.f49703j;
        }

        private Companion() {
        }
    }

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0018"}, d2 = {"Lsc/e$c;", "Lsc/e$a;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "", "b", "()J", "Lsc/e;", "taskRunner", "Loa/F;", "c", "(Lsc/e;)V", "nanos", "a", "(Lsc/e;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ThreadPoolExecutor executor;

        public c(ThreadFactory threadFactory) {
            C3862t.g(threadFactory, "threadFactory");
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // sc.e.a
        public void a(e taskRunner, long nanos) throws InterruptedException {
            C3862t.g(taskRunner, "taskRunner");
            long j10 = nanos / 1000000;
            long j11 = nanos - (1000000 * j10);
            if (j10 > 0 || nanos > 0) {
                taskRunner.wait(j10, (int) j11);
            }
        }

        @Override // sc.e.a
        public long b() {
            return System.nanoTime();
        }

        @Override // sc.e.a
        public void c(e taskRunner) {
            C3862t.g(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // sc.e.a
        public void execute(Runnable runnable) {
            C3862t.g(runnable, "runnable");
            this.executor.execute(runnable);
        }
    }

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sc/e$d", "Ljava/lang/Runnable;", "Loa/F;", "run", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4529a abstractC4529aD;
            long jB;
            while (true) {
                e eVar = e.this;
                synchronized (eVar) {
                    abstractC4529aD = eVar.d();
                }
                if (abstractC4529aD == null) {
                    return;
                }
                sc.d queue = abstractC4529aD.getQueue();
                C3862t.d(queue);
                e eVar2 = e.this;
                boolean zIsLoggable = e.INSTANCE.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jB = queue.getTaskRunner().getBackend().b();
                    C4530b.c(abstractC4529aD, queue, "starting");
                } else {
                    jB = -1;
                }
                try {
                    try {
                        eVar2.j(abstractC4529aD);
                        C4153F c4153f = C4153F.f46609a;
                        if (zIsLoggable) {
                            C4530b.c(abstractC4529aD, queue, "finished run in " + C4530b.b(queue.getTaskRunner().getBackend().b() - jB));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        C4530b.c(abstractC4529aD, queue, "failed a run in " + C4530b.b(queue.getTaskRunner().getBackend().b() - jB));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        C3862t.f(logger, "getLogger(TaskRunner::class.java.name)");
        f49703j = logger;
    }

    public e(a backend) {
        C3862t.g(backend, "backend");
        this.backend = backend;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new d();
    }

    private final void c(AbstractC4529a task, long delayNanos) {
        if (pc.d.f47758h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        sc.d queue = task.getQueue();
        C3862t.d(queue);
        if (queue.getActiveTask() != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean cancelActiveTask = queue.getCancelActiveTask();
        queue.m(false);
        queue.l(null);
        this.busyQueues.remove(queue);
        if (delayNanos != -1 && !cancelActiveTask && !queue.getShutdown()) {
            queue.k(task, delayNanos, true);
        }
        if (queue.e().isEmpty()) {
            return;
        }
        this.readyQueues.add(queue);
    }

    private final void e(AbstractC4529a task) {
        if (pc.d.f47758h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        task.g(-1L);
        sc.d queue = task.getQueue();
        C3862t.d(queue);
        queue.e().remove(task);
        this.readyQueues.remove(queue);
        queue.l(task);
        this.busyQueues.add(queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(AbstractC4529a task) {
        if (pc.d.f47758h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.getName());
        try {
            long jF = task.f();
            synchronized (this) {
                c(task, jF);
                C4153F c4153f = C4153F.f46609a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                c(task, -1L);
                C4153F c4153f2 = C4153F.f46609a;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final AbstractC4529a d() {
        boolean z10;
        if (pc.d.f47758h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.readyQueues.isEmpty()) {
            long jB = this.backend.b();
            Iterator<sc.d> it = this.readyQueues.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC4529a abstractC4529a = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                AbstractC4529a abstractC4529a2 = it.next().e().get(0);
                long jMax = Math.max(0L, abstractC4529a2.getNextExecuteNanoTime() - jB);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC4529a != null) {
                        z10 = true;
                        break;
                    }
                    abstractC4529a = abstractC4529a2;
                }
            }
            if (abstractC4529a != null) {
                e(abstractC4529a);
                if (z10 || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    this.backend.execute(this.runnable);
                }
                return abstractC4529a;
            }
            if (this.coordinatorWaiting) {
                if (jMin < this.coordinatorWakeUpAt - jB) {
                    this.backend.c(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = jB + jMin;
            try {
                try {
                    this.backend.a(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
            } finally {
                this.coordinatorWaiting = false;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.busyQueues.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.busyQueues.get(size).b();
            }
        }
        for (int size2 = this.readyQueues.size() - 1; -1 < size2; size2--) {
            sc.d dVar = this.readyQueues.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    /* renamed from: g, reason: from getter */
    public final a getBackend() {
        return this.backend;
    }

    public final void h(sc.d taskQueue) {
        C3862t.g(taskQueue, "taskQueue");
        if (pc.d.f47758h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.getActiveTask() == null) {
            if (taskQueue.e().isEmpty()) {
                this.readyQueues.remove(taskQueue);
            } else {
                pc.d.c(this.readyQueues, taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.c(this);
        } else {
            this.backend.execute(this.runnable);
        }
    }

    public final sc.d i() {
        int i10;
        synchronized (this) {
            i10 = this.nextQueueName;
            this.nextQueueName = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new sc.d(this, sb2.toString());
    }
}
