package ec;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.O;

/* compiled from: WorkQueue.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u00100\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u000b\u00104\u001a\u0002038\u0002X\u0082\u0004R\u000b\u00105\u001a\u0002038\u0002X\u0082\u0004R\u0013\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004068\u0002X\u0082\u0004R\u000b\u00108\u001a\u0002038\u0002X\u0082\u0004¨\u00069"}, d2 = {"Lec/n;", "", "<init>", "()V", "Lec/h;", "task", "b", "(Lec/h;)Lec/h;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "p", "(I)Lec/h;", "", "onlyBlocking", "o", "(Z)Lec/h;", "index", "q", "(IZ)Lec/h;", "Lkotlin/jvm/internal/O;", "stolenTaskRef", "", "s", "(ILkotlin/jvm/internal/O;)J", "Lec/d;", "queue", "n", "(Lec/d;)Z", "m", "()Lec/h;", "Loa/F;", "c", "(Lec/h;)V", "k", "fair", "a", "(Lec/h;Z)Lec/h;", "r", "l", "globalQueue", "j", "(Lec/d;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "e", "()I", "bufferSize", "i", "size", "Lkotlinx/atomicfu/AtomicInt;", "blockingTasksInBuffer", "consumerIndex", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "producerIndex", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41004b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f41005c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f41006d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f41007e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReferenceArray<h> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h task) {
        if (e() == 127) {
            return task;
        }
        if (task.taskContext.getTaskMode() == 1) {
            f41007e.incrementAndGet(this);
        }
        int i10 = f41005c.get(this) & 127;
        while (this.buffer.get(i10) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i10, task);
        f41005c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || hVar.taskContext.getTaskMode() != 1) {
            return;
        }
        f41007e.decrementAndGet(this);
    }

    private final int e() {
        return f41005c.get(this) - f41006d.get(this);
    }

    private final h m() {
        h andSet;
        while (true) {
            int i10 = f41006d.get(this);
            if (i10 - f41005c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f41006d.compareAndSet(this, i10, i10 + 1) && (andSet = this.buffer.getAndSet(i11, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean n(C3297d queue) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        queue.a(hVarM);
        return true;
    }

    private final h o(boolean onlyBlocking) {
        h hVar;
        do {
            hVar = (h) f41004b.get(this);
            if (hVar != null) {
                if ((hVar.taskContext.getTaskMode() == 1) == onlyBlocking) {
                }
            }
            int i10 = f41006d.get(this);
            int i11 = f41005c.get(this);
            while (i10 != i11) {
                if (onlyBlocking && f41007e.get(this) == 0) {
                    return null;
                }
                i11--;
                h hVarQ = q(i11, onlyBlocking);
                if (hVarQ != null) {
                    return hVarQ;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.b.a(f41004b, this, hVar, null));
        return hVar;
    }

    private final h p(int stealingMode) {
        int i10 = f41006d.get(this);
        int i11 = f41005c.get(this);
        boolean z10 = stealingMode == 1;
        while (i10 != i11) {
            if (z10 && f41007e.get(this) == 0) {
                return null;
            }
            int i12 = i10 + 1;
            h hVarQ = q(i10, z10);
            if (hVarQ != null) {
                return hVarQ;
            }
            i10 = i12;
        }
        return null;
    }

    private final h q(int index, boolean onlyBlocking) {
        int i10 = index & 127;
        h hVar = this.buffer.get(i10);
        if (hVar != null) {
            if ((hVar.taskContext.getTaskMode() == 1) == onlyBlocking && Zb.l.a(this.buffer, i10, hVar, null)) {
                if (onlyBlocking) {
                    f41007e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, ec.h, java.lang.Object] */
    private final long s(int stealingMode, O<h> stolenTaskRef) {
        ?? r02;
        do {
            r02 = (h) f41004b.get(this);
            if (r02 == 0) {
                return -2L;
            }
            if (((r02.taskContext.getTaskMode() != 1 ? 2 : 1) & stealingMode) == 0) {
                return -2L;
            }
            long jA = l.f41000f.a() - r02.submissionTime;
            long j10 = l.f40996b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f41004b, this, r02, null));
        stolenTaskRef.f43978B = r02;
        return -1L;
    }

    public final h a(h task, boolean fair) {
        if (fair) {
            return b(task);
        }
        h hVar = (h) f41004b.getAndSet(this, task);
        if (hVar == null) {
            return null;
        }
        return b(hVar);
    }

    public final int i() {
        return f41004b.get(this) != null ? e() + 1 : e();
    }

    public final void j(C3297d globalQueue) {
        h hVar = (h) f41004b.getAndSet(this, null);
        if (hVar != null) {
            globalQueue.a(hVar);
        }
        while (n(globalQueue)) {
        }
    }

    public final h k() {
        h hVar = (h) f41004b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r(int stealingMode, O<h> stolenTaskRef) {
        T tM = stealingMode == 3 ? m() : p(stealingMode);
        if (tM == 0) {
            return s(stealingMode, stolenTaskRef);
        }
        stolenTaskRef.f43978B = tM;
        return -1L;
    }
}
