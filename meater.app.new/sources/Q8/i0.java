package Q8;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z7.AbstractC5208j;
import z7.InterfaceC5201c;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f14459a = I.c("awaitEvenIfOnMainThread task continuation executor");

    @Deprecated
    public static <T> T b(AbstractC5208j<T> abstractC5208j) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC5208j.h(f14459a, new InterfaceC5201c() { // from class: Q8.h0
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j2) {
                return i0.d(countDownLatch, abstractC5208j2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (abstractC5208j.o()) {
            return abstractC5208j.k();
        }
        if (abstractC5208j.m()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC5208j.n()) {
            throw new IllegalStateException(abstractC5208j.j());
        }
        throw new TimeoutException();
    }

    public static boolean c(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d(CountDownLatch countDownLatch, AbstractC5208j abstractC5208j) {
        countDownLatch.countDown();
        return null;
    }
}
