package p353j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.C10775u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9797k;
import kotlin.jvm.internal.C9801m;

/* compiled from: Timeout.kt */
/* renamed from: j.e0 */
/* loaded from: classes3.dex */
public class C9702e0 {
    public static final b Companion = new b(null);
    public static final C9702e0 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* compiled from: Timeout.kt */
    /* renamed from: j.e0$a */
    public static final class a extends C9702e0 {
        a() {
        }

        @Override // p353j.C9702e0
        public C9702e0 deadlineNanoTime(long j2) {
            return this;
        }

        @Override // p353j.C9702e0
        public void throwIfReached() {
        }

        @Override // p353j.C9702e0
        public C9702e0 timeout(long j2, TimeUnit timeUnit) {
            C9801m.m32346f(timeUnit, "unit");
            return this;
        }
    }

    /* compiled from: Timeout.kt */
    /* renamed from: j.e0$b */
    public static final class b {
        private b() {
        }

        /* renamed from: a */
        public final long m31994a(long j2, long j3) {
            return (j2 != 0 && (j3 == 0 || j2 < j3)) ? j2 : j3;
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }
    }

    public C9702e0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public C9702e0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final C9702e0 deadline(long j2, TimeUnit timeUnit) {
        C9801m.m32346f(timeUnit, "unit");
        if (j2 > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j2));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j2).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final void intersectWith(C9702e0 c9702e0, Function0<C10775u> function0) {
        C9801m.m32346f(c9702e0, "other");
        C9801m.m32346f(function0, "block");
        long jTimeoutNanos = timeoutNanos();
        long jM31994a = Companion.m31994a(c9702e0.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(jM31994a, timeUnit);
        if (!hasDeadline()) {
            if (c9702e0.hasDeadline()) {
                deadlineNanoTime(c9702e0.deadlineNanoTime());
            }
            try {
                function0.invoke();
                C9797k.m32324b(1);
                timeout(jTimeoutNanos, timeUnit);
                if (c9702e0.hasDeadline()) {
                    clearDeadline();
                }
                C9797k.m32323a(1);
                return;
            } catch (Throwable th) {
                C9797k.m32324b(1);
                timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (c9702e0.hasDeadline()) {
                    clearDeadline();
                }
                C9797k.m32323a(1);
                throw th;
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (c9702e0.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), c9702e0.deadlineNanoTime()));
        }
        try {
            function0.invoke();
            C9797k.m32324b(1);
            timeout(jTimeoutNanos, timeUnit);
            if (c9702e0.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            C9797k.m32323a(1);
        } catch (Throwable th2) {
            C9797k.m32324b(1);
            timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (c9702e0.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            C9797k.m32323a(1);
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        Thread threadCurrentThread = Thread.currentThread();
        C9801m.m32345e(threadCurrentThread, "Thread.currentThread()");
        if (threadCurrentThread.isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C9702e0 timeout(long j2, TimeUnit timeUnit) {
        C9801m.m32346f(timeUnit, "unit");
        if (j2 >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedException, InterruptedIOException {
        C9801m.m32346f(obj, "monitor");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                long j2 = jTimeoutNanos / 1000000;
                Long.signum(j2);
                obj.wait(j2, (int) (jTimeoutNanos - (1000000 * j2)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public C9702e0 deadlineNanoTime(long j2) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j2;
        return this;
    }
}
