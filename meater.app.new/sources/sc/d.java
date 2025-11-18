package sc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: TaskQueue.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u0019R\"\u0010$\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R$\u0010*\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u001f\u0010'\"\u0004\b(\u0010)R \u0010/\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\"\u00101\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010 \u001a\u0004\b%\u0010\u0017\"\u0004\b0\u0010#¨\u00062"}, d2 = {"Lsc/d;", "", "Lsc/e;", "taskRunner", "", "name", "<init>", "(Lsc/e;Ljava/lang/String;)V", "Lsc/a;", "task", "", "delayNanos", "Loa/F;", "i", "(Lsc/a;J)V", "", "recurrence", "k", "(Lsc/a;JZ)Z", "a", "()V", "n", "b", "()Z", "toString", "()Ljava/lang/String;", "Lsc/e;", "h", "()Lsc/e;", "Ljava/lang/String;", "f", "c", "Z", "g", "setShutdown$okhttp", "(Z)V", "shutdown", "d", "Lsc/a;", "()Lsc/a;", "l", "(Lsc/a;)V", "activeTask", "", "e", "Ljava/util/List;", "()Ljava/util/List;", "futureTasks", "m", "cancelActiveTask", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e taskRunner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean shutdown;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private AbstractC4529a activeTask;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC4529a> futureTasks;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean cancelActiveTask;

    public d(e taskRunner, String name) {
        C3862t.g(taskRunner, "taskRunner");
        C3862t.g(name, "name");
        this.taskRunner = taskRunner;
        this.name = name;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, AbstractC4529a abstractC4529a, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(abstractC4529a, j10);
    }

    public final void a() {
        if (pc.d.f47758h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            try {
                if (b()) {
                    this.taskRunner.h(this);
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        AbstractC4529a abstractC4529a = this.activeTask;
        if (abstractC4529a != null) {
            C3862t.d(abstractC4529a);
            if (abstractC4529a.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z10 = false;
        for (int size = this.futureTasks.size() - 1; -1 < size; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                AbstractC4529a abstractC4529a2 = this.futureTasks.get(size);
                if (e.INSTANCE.a().isLoggable(Level.FINE)) {
                    C4530b.c(abstractC4529a2, this, "canceled");
                }
                this.futureTasks.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC4529a getActiveTask() {
        return this.activeTask;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getCancelActiveTask() {
        return this.cancelActiveTask;
    }

    public final List<AbstractC4529a> e() {
        return this.futureTasks;
    }

    /* renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getShutdown() {
        return this.shutdown;
    }

    /* renamed from: h, reason: from getter */
    public final e getTaskRunner() {
        return this.taskRunner;
    }

    public final void i(AbstractC4529a task, long delayNanos) {
        C3862t.g(task, "task");
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (k(task, delayNanos, false)) {
                    this.taskRunner.h(this);
                }
                C4153F c4153f = C4153F.f46609a;
            } else if (task.getCancelable()) {
                if (e.INSTANCE.a().isLoggable(Level.FINE)) {
                    C4530b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.INSTANCE.a().isLoggable(Level.FINE)) {
                    C4530b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(AbstractC4529a task, long delayNanos, boolean recurrence) {
        String str;
        C3862t.g(task, "task");
        task.e(this);
        long jB = this.taskRunner.getBackend().b();
        long j10 = jB + delayNanos;
        int iIndexOf = this.futureTasks.indexOf(task);
        if (iIndexOf != -1) {
            if (task.getNextExecuteNanoTime() <= j10) {
                if (e.INSTANCE.a().isLoggable(Level.FINE)) {
                    C4530b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(iIndexOf);
        }
        task.g(j10);
        if (e.INSTANCE.a().isLoggable(Level.FINE)) {
            if (recurrence) {
                str = "run again after " + C4530b.b(j10 - jB);
            } else {
                str = "scheduled after " + C4530b.b(j10 - jB);
            }
            C4530b.c(task, this, str);
        }
        Iterator<AbstractC4529a> it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime() - jB > delayNanos) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.futureTasks.size();
        }
        this.futureTasks.add(size, task);
        return size == 0;
    }

    public final void l(AbstractC4529a abstractC4529a) {
        this.activeTask = abstractC4529a;
    }

    public final void m(boolean z10) {
        this.cancelActiveTask = z10;
    }

    public final void n() {
        if (pc.d.f47758h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            try {
                this.shutdown = true;
                if (b()) {
                    this.taskRunner.h(this);
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.name;
    }
}
