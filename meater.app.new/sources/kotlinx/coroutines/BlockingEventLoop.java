package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: EventLoop.kt */
@Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"Lkotlinx/coroutines/BlockingEventLoop;", "Lkotlinx/coroutines/EventLoopImplBase;", "thread", "Ljava/lang/Thread;", "(Ljava/lang/Thread;)V", "getThread", "()Ljava/lang/Thread;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.g, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class BlockingEventLoop extends EventLoopImplBase {

    /* renamed from: l */
    private final Thread f41741l;

    public BlockingEventLoop(Thread thread) {
        this.f41741l = thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* renamed from: t0, reason: from getter */
    protected Thread getF41741l() {
        return this.f41741l;
    }
}
