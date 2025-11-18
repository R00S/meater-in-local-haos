package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: Builders.kt */
@Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0013"}, m32267d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "blockedThread", "Ljava/lang/Thread;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "isScopedCoroutine", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "afterCompletion", HttpUrl.FRAGMENT_ENCODE_SET, "state", HttpUrl.FRAGMENT_ENCODE_SET, "joinBlocking", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.f, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class BlockingCoroutine<T> extends AbstractCoroutine<T> {

    /* renamed from: h */
    private final Thread f41708h;

    /* renamed from: i */
    private final EventLoop f41709i;

    public BlockingCoroutine(CoroutineContext coroutineContext, Thread thread, EventLoop eventLoop) {
        super(coroutineContext, true, true);
        this.f41708h = thread;
        this.f41709i = eventLoop;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G0 */
    public final T m39309G0() throws Throwable {
        if (C10893c.m39138a() != null) {
            throw null;
        }
        try {
            EventLoop eventLoop = this.f41709i;
            if (eventLoop != null) {
                EventLoop.m39429f0(eventLoop, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    EventLoop eventLoop2 = this.f41709i;
                    long jMo39436n0 = eventLoop2 != null ? eventLoop2.mo39436n0() : Long.MAX_VALUE;
                    if (m39353b0()) {
                        if (C10893c.m39138a() != null) {
                            throw null;
                        }
                        T t = (T) C10960g2.m39407h(m39350X());
                        completedExceptionally = t instanceof CompletedExceptionally ? (CompletedExceptionally) t : null;
                        if (completedExceptionally == null) {
                            return t;
                        }
                        throw completedExceptionally.f41577b;
                    }
                    if (C10893c.m39138a() != null) {
                        throw null;
                    }
                    LockSupport.parkNanos(this, jMo39436n0);
                } finally {
                    EventLoop eventLoop3 = this.f41709i;
                    if (eventLoop3 != null) {
                        EventLoop.m39427W(eventLoop3, false, 1, null);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m39367y(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            if (C10893c.m39138a() != null) {
                throw null;
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: c0 */
    protected boolean mo39310c0() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: v */
    protected void mo39094v(Object obj) {
        if (C9801m.m32341a(Thread.currentThread(), this.f41708h)) {
            return;
        }
        Thread thread = this.f41708h;
        if (C10893c.m39138a() != null) {
            throw null;
        }
        LockSupport.unpark(thread);
    }
}
