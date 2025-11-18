package p456rx.p461n.p466e;

import java.util.concurrent.CountDownLatch;
import p456rx.InterfaceC11246k;

/* compiled from: BlockingUtils.java */
/* renamed from: rx.n.e.d */
/* loaded from: classes3.dex */
public final class C11355d {
    /* renamed from: a */
    public static void m40420a(CountDownLatch countDownLatch, InterfaceC11246k interfaceC11246k) throws InterruptedException {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            interfaceC11246k.unsubscribe();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e2);
        }
    }
}
