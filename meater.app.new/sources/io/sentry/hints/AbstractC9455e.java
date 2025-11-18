package io.sentry.hints;

import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: BlockingFlushHint.java */
@ApiStatus.Internal
/* renamed from: io.sentry.hints.e */
/* loaded from: classes2.dex */
public abstract class AbstractC9455e implements InterfaceC9457g, InterfaceC9459i {

    /* renamed from: a */
    private final CountDownLatch f36346a = new CountDownLatch(1);

    /* renamed from: b */
    private final long f36347b;

    /* renamed from: c */
    private final InterfaceC9670w1 f36348c;

    public AbstractC9455e(long j2, InterfaceC9670w1 interfaceC9670w1) {
        this.f36347b = j2;
        this.f36348c = interfaceC9670w1;
    }

    @Override // io.sentry.hints.InterfaceC9457g
    /* renamed from: b */
    public void mo30836b() {
        this.f36346a.countDown();
    }

    @Override // io.sentry.hints.InterfaceC9459i
    /* renamed from: e */
    public boolean mo30477e() {
        try {
            return this.f36346a.await(this.f36347b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            this.f36348c.mo30213b(EnumC9587s4.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e2);
            return false;
        }
    }
}
