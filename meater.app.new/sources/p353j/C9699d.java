package p353j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.C10775u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9797k;
import kotlin.jvm.internal.C9801m;

/* compiled from: AsyncTimeout.kt */
/* renamed from: j.d */
/* loaded from: classes3.dex */
public class C9699d extends C9702e0 {
    public static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static C9699d head;
    private boolean inQueue;
    private C9699d next;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: j.d$a */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m31989d(C9699d c9699d) {
            synchronized (C9699d.class) {
                if (!c9699d.inQueue) {
                    return false;
                }
                c9699d.inQueue = false;
                for (C9699d c9699d2 = C9699d.head; c9699d2 != null; c9699d2 = c9699d2.next) {
                    if (c9699d2.next == c9699d) {
                        c9699d2.next = c9699d.next;
                        c9699d.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m31990e(C9699d c9699d, long j2, boolean z) {
            synchronized (C9699d.class) {
                if (!(!c9699d.inQueue)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                c9699d.inQueue = true;
                if (C9699d.head == null) {
                    C9699d.head = new C9699d();
                    new b().start();
                }
                long jNanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    c9699d.timeoutAt = Math.min(j2, c9699d.deadlineNanoTime() - jNanoTime) + jNanoTime;
                } else if (j2 != 0) {
                    c9699d.timeoutAt = j2 + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    c9699d.timeoutAt = c9699d.deadlineNanoTime();
                }
                long jRemainingNanos = c9699d.remainingNanos(jNanoTime);
                C9699d c9699d2 = C9699d.head;
                C9801m.m32343c(c9699d2);
                while (c9699d2.next != null) {
                    C9699d c9699d3 = c9699d2.next;
                    C9801m.m32343c(c9699d3);
                    if (jRemainingNanos < c9699d3.remainingNanos(jNanoTime)) {
                        break;
                    }
                    c9699d2 = c9699d2.next;
                    C9801m.m32343c(c9699d2);
                }
                c9699d.next = c9699d2.next;
                c9699d2.next = c9699d;
                if (c9699d2 == C9699d.head) {
                    C9699d.class.notify();
                }
                C10775u c10775u = C10775u.f41439a;
            }
        }

        /* renamed from: c */
        public final C9699d m31991c() throws InterruptedException {
            C9699d c9699d = C9699d.head;
            C9801m.m32343c(c9699d);
            C9699d c9699d2 = c9699d.next;
            if (c9699d2 == null) {
                long jNanoTime = System.nanoTime();
                C9699d.class.wait(C9699d.IDLE_TIMEOUT_MILLIS);
                C9699d c9699d3 = C9699d.head;
                C9801m.m32343c(c9699d3);
                if (c9699d3.next != null || System.nanoTime() - jNanoTime < C9699d.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C9699d.head;
            }
            long jRemainingNanos = c9699d2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                long j2 = jRemainingNanos / 1000000;
                C9699d.class.wait(j2, (int) (jRemainingNanos - (1000000 * j2)));
                return null;
            }
            C9699d c9699d4 = C9699d.head;
            C9801m.m32343c(c9699d4);
            c9699d4.next = c9699d2.next;
            c9699d2.next = null;
            return c9699d2;
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: j.d$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C9699d c9699dM31991c;
            while (true) {
                try {
                    synchronized (C9699d.class) {
                        try {
                            c9699dM31991c = C9699d.Companion.m31991c();
                            if (c9699dM31991c == C9699d.head) {
                                C9699d.head = null;
                                return;
                            }
                            C10775u c10775u = C10775u.f41439a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (c9699dM31991c != null) {
                        c9699dM31991c.timedOut();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: j.d$c */
    public static final class c implements InterfaceC9696b0 {

        /* renamed from: g */
        final /* synthetic */ InterfaceC9696b0 f37035g;

        c(InterfaceC9696b0 interfaceC9696b0) {
            this.f37035g = interfaceC9696b0;
        }

        @Override // p353j.InterfaceC9696b0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9699d timeout() {
            return C9699d.this;
        }

        @Override // p353j.InterfaceC9696b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C9699d c9699d = C9699d.this;
            c9699d.enter();
            try {
                this.f37035g.close();
                C10775u c10775u = C10775u.f41439a;
                if (c9699d.exit()) {
                    throw c9699d.access$newTimeoutException(null);
                }
            } catch (IOException e2) {
                if (!c9699d.exit()) {
                    throw e2;
                }
                throw c9699d.access$newTimeoutException(e2);
            } finally {
                c9699d.exit();
            }
        }

        @Override // p353j.InterfaceC9696b0, java.io.Flushable
        public void flush() throws IOException {
            C9699d c9699d = C9699d.this;
            c9699d.enter();
            try {
                this.f37035g.flush();
                C10775u c10775u = C10775u.f41439a;
                if (c9699d.exit()) {
                    throw c9699d.access$newTimeoutException(null);
                }
            } catch (IOException e2) {
                if (!c9699d.exit()) {
                    throw e2;
                }
                throw c9699d.access$newTimeoutException(e2);
            } finally {
                c9699d.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f37035g + ')';
        }

        @Override // p353j.InterfaceC9696b0
        public void write(C9703f c9703f, long j2) throws IOException {
            C9801m.m32346f(c9703f, "source");
            C9697c.m31982b(c9703f.size(), 0L, j2);
            while (true) {
                long j3 = 0;
                if (j2 <= 0) {
                    return;
                }
                C9726y c9726y = c9703f.f37038f;
                C9801m.m32343c(c9726y);
                while (true) {
                    if (j3 >= C9699d.TIMEOUT_WRITE_SIZE) {
                        break;
                    }
                    j3 += c9726y.f37093d - c9726y.f37092c;
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    } else {
                        c9726y = c9726y.f37096g;
                        C9801m.m32343c(c9726y);
                    }
                }
                C9699d c9699d = C9699d.this;
                c9699d.enter();
                try {
                    this.f37035g.write(c9703f, j3);
                    C10775u c10775u = C10775u.f41439a;
                    if (c9699d.exit()) {
                        throw c9699d.access$newTimeoutException(null);
                    }
                    j2 -= j3;
                } catch (IOException e2) {
                    if (!c9699d.exit()) {
                        throw e2;
                    }
                    throw c9699d.access$newTimeoutException(e2);
                } finally {
                    c9699d.exit();
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: j.d$d */
    public static final class d implements InterfaceC9700d0 {

        /* renamed from: g */
        final /* synthetic */ InterfaceC9700d0 f37037g;

        d(InterfaceC9700d0 interfaceC9700d0) {
            this.f37037g = interfaceC9700d0;
        }

        @Override // p353j.InterfaceC9700d0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9699d timeout() {
            return C9699d.this;
        }

        @Override // p353j.InterfaceC9700d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C9699d c9699d = C9699d.this;
            c9699d.enter();
            try {
                this.f37037g.close();
                C10775u c10775u = C10775u.f41439a;
                if (c9699d.exit()) {
                    throw c9699d.access$newTimeoutException(null);
                }
            } catch (IOException e2) {
                if (!c9699d.exit()) {
                    throw e2;
                }
                throw c9699d.access$newTimeoutException(e2);
            } finally {
                c9699d.exit();
            }
        }

        @Override // p353j.InterfaceC9700d0
        public long read(C9703f c9703f, long j2) throws IOException {
            C9801m.m32346f(c9703f, "sink");
            C9699d c9699d = C9699d.this;
            c9699d.enter();
            try {
                long j3 = this.f37037g.read(c9703f, j2);
                if (c9699d.exit()) {
                    throw c9699d.access$newTimeoutException(null);
                }
                return j3;
            } catch (IOException e2) {
                if (c9699d.exit()) {
                    throw c9699d.access$newTimeoutException(e2);
                }
                throw e2;
            } finally {
                c9699d.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f37037g + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j2) {
        return this.timeoutAt - j2;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            Companion.m31990e(this, jTimeoutNanos, zHasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.m31989d(this);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final InterfaceC9696b0 sink(InterfaceC9696b0 interfaceC9696b0) {
        C9801m.m32346f(interfaceC9696b0, "sink");
        return new c(interfaceC9696b0);
    }

    public final InterfaceC9700d0 source(InterfaceC9700d0 interfaceC9700d0) {
        C9801m.m32346f(interfaceC9700d0, "source");
        return new d(interfaceC9700d0);
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(Function0<? extends T> function0) throws IOException {
        C9801m.m32346f(function0, "block");
        enter();
        try {
            try {
                T tInvoke = function0.invoke();
                C9797k.m32324b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                C9797k.m32323a(1);
                return tInvoke;
            } catch (IOException e2) {
                if (exit()) {
                    throw access$newTimeoutException(e2);
                }
                throw e2;
            }
        } catch (Throwable th) {
            C9797k.m32324b(1);
            exit();
            C9797k.m32323a(1);
            throw th;
        }
    }
}
