package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.EventLoopImplBase;
import okhttp3.HttpUrl;

/* compiled from: EventLoop.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\bH\u0004R\u0012\u0010\u0003\u001a\u00020\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m32267d2 = {"Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/EventLoop;", "()V", "thread", "Ljava/lang/Thread;", "getThread", "()Ljava/lang/Thread;", "reschedule", HttpUrl.FRAGMENT_ENCODE_SET, "now", HttpUrl.FRAGMENT_ENCODE_SET, "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "unpark", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.k1, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class EventLoopImplPlatform extends EventLoop {
    /* renamed from: t0 */
    protected abstract Thread getF41741l();

    /* renamed from: x0 */
    protected void mo39617x0(long j2, EventLoopImplBase.b bVar) {
        DefaultExecutor.f41885l.m39611T0(j2, bVar);
    }

    /* renamed from: y0 */
    protected final void m39618y0() {
        Thread f41741l = getF41741l();
        if (Thread.currentThread() != f41741l) {
            if (C10893c.m39138a() != null) {
                throw null;
            }
            LockSupport.unpark(f41741l);
        }
    }
}
