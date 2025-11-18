package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.ArrayQueue;
import okhttp3.HttpUrl;

/* compiled from: EventLoop.common.kt */
@Metadata(m32266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0010J\u0010\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\nH\u0016J\u0006\u0010\u001d\u001a\u00020\u0004J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m32267d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "isActive", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isEmpty", "isUnconfinedLoopActive", "isUnconfinedQueueEmpty", "nextTime", HttpUrl.FRAGMENT_ENCODE_SET, "getNextTime", "()J", "shared", "unconfinedQueue", "Lkotlinx/coroutines/internal/ArrayQueue;", "Lkotlinx/coroutines/DispatchedTask;", "useCount", "decrementUseCount", HttpUrl.FRAGMENT_ENCODE_SET, "unconfined", "delta", "dispatchUnconfined", "task", "incrementUseCount", "limitedParallelism", "parallelism", HttpUrl.FRAGMENT_ENCODE_SET, "processNextEvent", "processUnconfinedEvent", "shouldBeProcessedFromContext", "shutdown", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.i1, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class EventLoop extends CoroutineDispatcher {

    /* renamed from: g */
    private long f41758g;

    /* renamed from: h */
    private boolean f41759h;

    /* renamed from: i */
    private ArrayQueue<DispatchedTask<?>> f41760i;

    /* renamed from: W */
    public static /* synthetic */ void m39427W(EventLoop eventLoop, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        eventLoop.m39430T(z);
    }

    /* renamed from: Y */
    private final long m39428Y(boolean z) {
        return z ? 4294967296L : 1L;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m39429f0(EventLoop eventLoop, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        eventLoop.m39433e0(z);
    }

    /* renamed from: T */
    public final void m39430T(boolean z) {
        long jM39428Y = this.f41758g - m39428Y(z);
        this.f41758g = jM39428Y;
        if (jM39428Y > 0) {
            return;
        }
        if (C11045s0.m39681a()) {
            if (!(this.f41758g == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f41759h) {
            shutdown();
        }
    }

    /* renamed from: Z */
    public final void m39431Z(DispatchedTask<?> dispatchedTask) {
        ArrayQueue<DispatchedTask<?>> arrayQueue = this.f41760i;
        if (arrayQueue == null) {
            arrayQueue = new ArrayQueue<>();
            this.f41760i = arrayQueue;
        }
        arrayQueue.m39441a(dispatchedTask);
    }

    /* renamed from: a0 */
    protected long mo39432a0() {
        ArrayQueue<DispatchedTask<?>> arrayQueue = this.f41760i;
        return (arrayQueue == null || arrayQueue.m39442c()) ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: e0 */
    public final void m39433e0(boolean z) {
        this.f41758g += m39428Y(z);
        if (z) {
            return;
        }
        this.f41759h = true;
    }

    /* renamed from: i0 */
    public final boolean m39434i0() {
        return this.f41758g >= m39428Y(true);
    }

    /* renamed from: m0 */
    public final boolean m39435m0() {
        ArrayQueue<DispatchedTask<?>> arrayQueue = this.f41760i;
        if (arrayQueue != null) {
            return arrayQueue.m39442c();
        }
        return true;
    }

    /* renamed from: n0 */
    public long mo39436n0() {
        return !m39437p0() ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: p0 */
    public final boolean m39437p0() {
        DispatchedTask<?> dispatchedTaskM39443d;
        ArrayQueue<DispatchedTask<?>> arrayQueue = this.f41760i;
        if (arrayQueue == null || (dispatchedTaskM39443d = arrayQueue.m39443d()) == null) {
            return false;
        }
        dispatchedTaskM39443d.run();
        return true;
    }

    /* renamed from: q0 */
    public boolean m39438q0() {
        return false;
    }

    public void shutdown() {
    }
}
