package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: Task.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0004\"\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\tR\u0019\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m32267d2 = {"Lokhttp3/internal/concurrent/Task;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "runOnce", "()J", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/u;", "initQueue$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "initQueue", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "nextExecuteNanoTime", "J", "getNextExecuteNanoTime$okhttp", "setNextExecuteNanoTime$okhttp", "(J)V", "name", "Ljava/lang/String;", "getName", "Lokhttp3/internal/concurrent/TaskQueue;", "getQueue$okhttp", "()Lokhttp3/internal/concurrent/TaskQueue;", "setQueue$okhttp", HttpUrl.FRAGMENT_ENCODE_SET, "cancelable", "Z", "getCancelable", "()Z", "<init>", "(Ljava/lang/String;Z)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class Task {
    private final boolean cancelable;
    private final String name;
    private long nextExecuteNanoTime;
    private TaskQueue queue;

    public Task(String str, boolean z) {
        C9801m.m32346f(str, "name");
        this.name = str;
        this.cancelable = z;
        this.nextExecuteNanoTime = -1L;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final String getName() {
        return this.name;
    }

    /* renamed from: getNextExecuteNanoTime$okhttp, reason: from getter */
    public final long getNextExecuteNanoTime() {
        return this.nextExecuteNanoTime;
    }

    /* renamed from: getQueue$okhttp, reason: from getter */
    public final TaskQueue getQueue() {
        return this.queue;
    }

    public final void initQueue$okhttp(TaskQueue queue) {
        C9801m.m32346f(queue, "queue");
        TaskQueue taskQueue = this.queue;
        if (taskQueue == queue) {
            return;
        }
        if (!(taskQueue == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.queue = queue;
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j2) {
        this.nextExecuteNanoTime = j2;
    }

    public final void setQueue$okhttp(TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    public String toString() {
        return this.name;
    }

    public /* synthetic */ Task(String str, boolean z, int i2, C9789g c9789g) {
        this(str, (i2 & 2) != 0 ? true : z);
    }
}
