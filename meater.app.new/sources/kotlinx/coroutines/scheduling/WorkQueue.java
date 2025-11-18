package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.C11045s0;
import okhttp3.HttpUrl;

/* compiled from: WorkQueue.kt */
@Metadata(m32266d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020*B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J!\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\r*\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, m32267d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "<init>", "()V", "Lkotlinx/coroutines/scheduling/Task;", "task", HttpUrl.FRAGMENT_ENCODE_SET, "fair", "add", "(Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "addLast", "(Lkotlinx/coroutines/scheduling/Task;)Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalQueue", HttpUrl.FRAGMENT_ENCODE_SET, "offloadAllWorkTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)V", "poll", "()Lkotlinx/coroutines/scheduling/Task;", "pollBuffer", "queue", "pollTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)Z", "victim", HttpUrl.FRAGMENT_ENCODE_SET, "tryStealBlockingFrom", "(Lkotlinx/coroutines/scheduling/WorkQueue;)J", "tryStealFrom", "blockingOnly", "tryStealLastScheduled", "(Lkotlinx/coroutines/scheduling/WorkQueue;Z)J", "decrementIfBlocking", "(Lkotlinx/coroutines/scheduling/Task;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", HttpUrl.FRAGMENT_ENCODE_SET, "getBufferSize$kotlinx_coroutines_core", "()I", "bufferSize", "getSize$kotlinx_coroutines_core", "size", "kotlinx-coroutines-core", HttpUrl.FRAGMENT_ENCODE_SET}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.c3.n, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class WorkQueue {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41639a = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");

    /* renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f41640b = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f41641c = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f41642d = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");

    /* renamed from: e */
    private final AtomicReferenceArray<Task> f41643e = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* renamed from: b */
    public static /* synthetic */ Task m39190b(WorkQueue workQueue, Task task, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return workQueue.m39196a(task, z);
    }

    /* renamed from: c */
    private final Task m39191c(Task task) {
        if (task.f41628g.getF41629a() == 1) {
            f41642d.incrementAndGet(this);
        }
        if (m39197e() == 127) {
            return task;
        }
        int i2 = this.producerIndex & 127;
        while (this.f41643e.get(i2) != null) {
            Thread.yield();
        }
        this.f41643e.lazySet(i2, task);
        f41640b.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m39192d(Task task) {
        if (task != null) {
            if (task.f41628g.getF41629a() == 1) {
                int iDecrementAndGet = f41642d.decrementAndGet(this);
                if (C11045s0.m39681a()) {
                    if (!(iDecrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private final Task m39193i() {
        Task andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f41641c.compareAndSet(this, i2, i2 + 1) && (andSet = this.f41643e.getAndSet(i3, null)) != null) {
                m39192d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m39194j(GlobalQueue globalQueue) {
        Task taskM39193i = m39193i();
        if (taskM39193i == null) {
            return false;
        }
        globalQueue.m39563a(taskM39193i);
        return true;
    }

    /* renamed from: m */
    private final long m39195m(WorkQueue workQueue, boolean z) {
        Task task;
        do {
            task = (Task) workQueue.lastScheduledTask;
            if (task == null) {
                return -2L;
            }
            if (z) {
                if (!(task.f41628g.getF41629a() == 1)) {
                    return -2L;
                }
            }
            long jMo39185a = C10908l.f41635e.mo39185a() - task.f41627f;
            long j2 = C10908l.f41631a;
            if (jMo39185a < j2) {
                return j2 - jMo39185a;
            }
        } while (!f41639a.compareAndSet(workQueue, task, null));
        m39190b(this, task, false, 2, null);
        return -1L;
    }

    /* renamed from: a */
    public final Task m39196a(Task task, boolean z) {
        if (z) {
            return m39191c(task);
        }
        Task task2 = (Task) f41639a.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return m39191c(task2);
    }

    /* renamed from: e */
    public final int m39197e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int m39198f() {
        return this.lastScheduledTask != null ? m39197e() + 1 : m39197e();
    }

    /* renamed from: g */
    public final void m39199g(GlobalQueue globalQueue) {
        Task task = (Task) f41639a.getAndSet(this, null);
        if (task != null) {
            globalQueue.m39563a(task);
        }
        while (m39194j(globalQueue)) {
        }
    }

    /* renamed from: h */
    public final Task m39200h() {
        Task task = (Task) f41639a.getAndSet(this, null);
        return task == null ? m39193i() : task;
    }

    /* renamed from: k */
    public final long m39201k(WorkQueue workQueue) {
        if (C11045s0.m39681a()) {
            if (!(m39197e() == 0)) {
                throw new AssertionError();
            }
        }
        int i2 = workQueue.producerIndex;
        AtomicReferenceArray<Task> atomicReferenceArray = workQueue.f41643e;
        for (int i3 = workQueue.consumerIndex; i3 != i2; i3++) {
            int i4 = i3 & 127;
            if (workQueue.blockingTasksInBuffer == 0) {
                break;
            }
            Task task = atomicReferenceArray.get(i4);
            if (task != null) {
                if ((task.f41628g.getF41629a() == 1) && atomicReferenceArray.compareAndSet(i4, task, null)) {
                    f41642d.decrementAndGet(workQueue);
                    m39190b(this, task, false, 2, null);
                    return -1L;
                }
            }
        }
        return m39195m(workQueue, true);
    }

    /* renamed from: l */
    public final long m39202l(WorkQueue workQueue) {
        if (C11045s0.m39681a()) {
            if (!(m39197e() == 0)) {
                throw new AssertionError();
            }
        }
        Task taskM39193i = workQueue.m39193i();
        if (taskM39193i == null) {
            return m39195m(workQueue, false);
        }
        Task taskM39190b = m39190b(this, taskM39193i, false, 2, null);
        if (!C11045s0.m39681a()) {
            return -1L;
        }
        if (taskM39190b == null) {
            return -1L;
        }
        throw new AssertionError();
    }
}
