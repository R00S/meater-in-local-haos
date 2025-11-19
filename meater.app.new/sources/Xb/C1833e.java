package Xb;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LXb/e;", "T", "LXb/a;", "Lta/g;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "LXb/f0;", "eventLoop", "<init>", "(Lta/g;Ljava/lang/Thread;LXb/f0;)V", "", "state", "Loa/F;", "H", "(Ljava/lang/Object;)V", "f1", "()Ljava/lang/Object;", "E", "Ljava/lang/Thread;", "F", "LXb/f0;", "", "z0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1833e<T> extends AbstractC1825a<T> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Thread blockedThread;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1836f0 eventLoop;

    public C1833e(ta.g gVar, Thread thread, AbstractC1836f0 abstractC1836f0) {
        super(gVar, true, true);
        this.blockedThread = thread;
        this.eventLoop = abstractC1836f0;
    }

    @Override // Xb.C0
    protected void H(Object state) {
        if (C3862t.b(Thread.currentThread(), this.blockedThread)) {
            return;
        }
        Thread thread = this.blockedThread;
        C1829c.a();
        LockSupport.unpark(thread);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T f1() throws Throwable {
        C1829c.a();
        try {
            AbstractC1836f0 abstractC1836f0 = this.eventLoop;
            if (abstractC1836f0 != null) {
                AbstractC1836f0.U0(abstractC1836f0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC1836f0 abstractC1836f02 = this.eventLoop;
                    long jG1 = abstractC1836f02 != null ? abstractC1836f02.g1() : Long.MAX_VALUE;
                    if (y0()) {
                        AbstractC1836f0 abstractC1836f03 = this.eventLoop;
                        if (abstractC1836f03 != null) {
                            AbstractC1836f0.L0(abstractC1836f03, false, 1, null);
                        }
                        C1829c.a();
                        T t10 = (T) D0.h(r0());
                        C1874z c1874z = t10 instanceof C1874z ? (C1874z) t10 : null;
                        if (c1874z == null) {
                            return t10;
                        }
                        throw c1874z.cause;
                    }
                    C1829c.a();
                    LockSupport.parkNanos(this, jG1);
                } catch (Throwable th) {
                    AbstractC1836f0 abstractC1836f04 = this.eventLoop;
                    if (abstractC1836f04 != null) {
                        AbstractC1836f0.L0(abstractC1836f04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            U(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            C1829c.a();
            throw th2;
        }
    }

    @Override // Xb.C0
    protected boolean z0() {
        return true;
    }
}
