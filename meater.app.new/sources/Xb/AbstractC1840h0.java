package Xb;

import Xb.AbstractC1838g0;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

/* compiled from: EventLoop.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LXb/h0;", "LXb/f0;", "<init>", "()V", "Loa/F;", "s1", "", "now", "LXb/g0$c;", "delayedTask", "q1", "(JLXb/g0$c;)V", "Ljava/lang/Thread;", "n1", "()Ljava/lang/Thread;", "thread", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1840h0 extends AbstractC1836f0 {
    /* renamed from: n1 */
    protected abstract Thread getThread();

    protected void q1(long now, AbstractC1838g0.c delayedTask) {
        N.f19038J.L1(now, delayedTask);
    }

    protected final void s1() {
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            C1829c.a();
            LockSupport.unpark(thread);
        }
    }
}
