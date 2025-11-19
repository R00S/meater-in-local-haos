package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: TransactionExecutor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/room/I;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "command", "Loa/F;", "execute", "(Ljava/lang/Runnable;)V", "d", "()V", "B", "Ljava/util/concurrent/Executor;", "Ljava/util/ArrayDeque;", "C", "Ljava/util/ArrayDeque;", "tasks", "D", "Ljava/lang/Runnable;", "active", "", "E", "Ljava/lang/Object;", "syncLock", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I implements Executor {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<Runnable> tasks;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Runnable active;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Object syncLock;

    public I(Executor executor) {
        C3862t.g(executor, "executor");
        this.executor = executor;
        this.tasks = new ArrayDeque<>();
        this.syncLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable command, I this$0) {
        C3862t.g(command, "$command");
        C3862t.g(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.d();
        }
    }

    public final void d() {
        synchronized (this.syncLock) {
            try {
                Runnable runnablePoll = this.tasks.poll();
                Runnable runnable = runnablePoll;
                this.active = runnable;
                if (runnablePoll != null) {
                    this.executor.execute(runnable);
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        C3862t.g(command, "command");
        synchronized (this.syncLock) {
            try {
                this.tasks.offer(new Runnable() { // from class: androidx.room.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        I.b(command, this);
                    }
                });
                if (this.active == null) {
                    d();
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
