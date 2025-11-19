package Cc;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: AsyncTimeout.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"LCc/c;", "LCc/C;", "<init>", "()V", "", "now", "y", "(J)J", "Loa/F;", "v", "", "w", "()Z", "B", "LCc/z;", "sink", "z", "(LCc/z;)LCc/z;", "LCc/B;", "source", "A", "(LCc/B;)LCc/B;", "Ljava/io/IOException;", "cause", "p", "(Ljava/io/IOException;)Ljava/io/IOException;", "x", "", "f", "I", "state", "g", "LCc/c;", "next", "h", "J", "timeoutAt", "i", "a", "b", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0980c extends C {

    /* renamed from: i, reason: collision with root package name */
    private static final a f3213i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f3214j;

    /* renamed from: k, reason: collision with root package name */
    private static final Condition f3215k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f3216l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f3217m;

    /* renamed from: n, reason: collision with root package name */
    private static C0980c f3218n;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C0980c next;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"LCc/c$a;", "", "<init>", "()V", "LCc/c;", "node", "", "timeoutNanos", "", "hasDeadline", "Loa/F;", "f", "(LCc/c;JZ)V", "g", "(LCc/c;)V", "c", "()LCc/c;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "d", "()Ljava/util/concurrent/locks/Condition;", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "STATE_CANCELED", "I", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "TIMEOUT_WRITE_SIZE", "head", "LCc/c;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cc.c$a */
    private static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(C0980c node, long timeoutNanos, boolean hasDeadline) {
            if (C0980c.f3218n == null) {
                C0980c.f3218n = new C0980c();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (timeoutNanos != 0 && hasDeadline) {
                node.timeoutAt = Math.min(timeoutNanos, node.c() - jNanoTime) + jNanoTime;
            } else if (timeoutNanos != 0) {
                node.timeoutAt = timeoutNanos + jNanoTime;
            } else {
                if (!hasDeadline) {
                    throw new AssertionError();
                }
                node.timeoutAt = node.c();
            }
            long jY = node.y(jNanoTime);
            C0980c c0980c = C0980c.f3218n;
            C3862t.d(c0980c);
            while (c0980c.next != null) {
                C0980c c0980c2 = c0980c.next;
                C3862t.d(c0980c2);
                if (jY < c0980c2.y(jNanoTime)) {
                    break;
                }
                c0980c = c0980c.next;
                C3862t.d(c0980c);
            }
            node.next = c0980c.next;
            c0980c.next = node;
            if (c0980c == C0980c.f3218n) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C0980c node) {
            for (C0980c c0980c = C0980c.f3218n; c0980c != null; c0980c = c0980c.next) {
                if (c0980c.next == node) {
                    c0980c.next = node.next;
                    node.next = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final C0980c c() throws InterruptedException {
            C0980c c0980c = C0980c.f3218n;
            C3862t.d(c0980c);
            C0980c c0980c2 = c0980c.next;
            if (c0980c2 == null) {
                long jNanoTime = System.nanoTime();
                d().await(C0980c.f3216l, TimeUnit.MILLISECONDS);
                C0980c c0980c3 = C0980c.f3218n;
                C3862t.d(c0980c3);
                if (c0980c3.next != null || System.nanoTime() - jNanoTime < C0980c.f3217m) {
                    return null;
                }
                return C0980c.f3218n;
            }
            long jY = c0980c2.y(System.nanoTime());
            if (jY > 0) {
                d().await(jY, TimeUnit.NANOSECONDS);
                return null;
            }
            C0980c c0980c4 = C0980c.f3218n;
            C3862t.d(c0980c4);
            c0980c4.next = c0980c2.next;
            c0980c2.next = null;
            c0980c2.state = 2;
            return c0980c2;
        }

        public final Condition d() {
            return C0980c.f3215k;
        }

        public final ReentrantLock e() {
            return C0980c.f3214j;
        }

        private a() {
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"LCc/c$b;", "Ljava/lang/Thread;", "<init>", "()V", "Loa/F;", "run", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cc.c$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockE;
            C0980c c0980cC;
            while (true) {
                try {
                    reentrantLockE = C0980c.f3213i.e();
                    reentrantLockE.lock();
                    try {
                        c0980cC = C0980c.f3213i.c();
                    } finally {
                        reentrantLockE.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (c0980cC == C0980c.f3218n) {
                    a unused2 = C0980c.f3213i;
                    C0980c.f3218n = null;
                    return;
                } else {
                    C4153F c4153f = C4153F.f46609a;
                    reentrantLockE.unlock();
                    if (c0980cC != null) {
                        c0980cC.B();
                    }
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Cc/c$c", "LCc/z;", "LCc/e;", "source", "", "byteCount", "Loa/F;", "n0", "(LCc/e;J)V", "flush", "()V", "close", "LCc/c;", "a", "()LCc/c;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cc.c$c, reason: collision with other inner class name */
    public static final class C0050c implements z {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ z f3223C;

        C0050c(z zVar) {
            this.f3223C = zVar;
        }

        @Override // Cc.z
        /* renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public C0980c r() {
            return C0980c.this;
        }

        @Override // Cc.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0980c c0980c = C0980c.this;
            z zVar = this.f3223C;
            c0980c.v();
            try {
                zVar.close();
                C4153F c4153f = C4153F.f46609a;
                if (c0980c.w()) {
                    throw c0980c.p(null);
                }
            } catch (IOException e10) {
                if (!c0980c.w()) {
                    throw e10;
                }
                throw c0980c.p(e10);
            } finally {
                c0980c.w();
            }
        }

        @Override // Cc.z, java.io.Flushable
        public void flush() throws IOException {
            C0980c c0980c = C0980c.this;
            z zVar = this.f3223C;
            c0980c.v();
            try {
                zVar.flush();
                C4153F c4153f = C4153F.f46609a;
                if (c0980c.w()) {
                    throw c0980c.p(null);
                }
            } catch (IOException e10) {
                if (!c0980c.w()) {
                    throw e10;
                }
                throw c0980c.p(e10);
            } finally {
                c0980c.w();
            }
        }

        @Override // Cc.z
        public void n0(C0982e source, long byteCount) throws IOException {
            C3862t.g(source, "source");
            C0979b.b(source.getSize(), 0L, byteCount);
            while (true) {
                long j10 = 0;
                if (byteCount <= 0) {
                    return;
                }
                w wVar = source.head;
                C3862t.d(wVar);
                while (true) {
                    if (j10 >= 65536) {
                        break;
                    }
                    j10 += wVar.limit - wVar.pos;
                    if (j10 >= byteCount) {
                        j10 = byteCount;
                        break;
                    } else {
                        wVar = wVar.next;
                        C3862t.d(wVar);
                    }
                }
                C0980c c0980c = C0980c.this;
                z zVar = this.f3223C;
                c0980c.v();
                try {
                    zVar.n0(source, j10);
                    C4153F c4153f = C4153F.f46609a;
                    if (c0980c.w()) {
                        throw c0980c.p(null);
                    }
                    byteCount -= j10;
                } catch (IOException e10) {
                    if (!c0980c.w()) {
                        throw e10;
                    }
                    throw c0980c.p(e10);
                } finally {
                    c0980c.w();
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f3223C + ')';
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Cc/c$d", "LCc/B;", "LCc/e;", "sink", "", "byteCount", "I0", "(LCc/e;J)J", "Loa/F;", "close", "()V", "LCc/c;", "a", "()LCc/c;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cc.c$d */
    public static final class d implements B {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ B f3225C;

        d(B b10) {
            this.f3225C = b10;
        }

        @Override // Cc.B
        public long I0(C0982e sink, long byteCount) throws IOException {
            C3862t.g(sink, "sink");
            C0980c c0980c = C0980c.this;
            B b10 = this.f3225C;
            c0980c.v();
            try {
                long jI0 = b10.I0(sink, byteCount);
                if (c0980c.w()) {
                    throw c0980c.p(null);
                }
                return jI0;
            } catch (IOException e10) {
                if (c0980c.w()) {
                    throw c0980c.p(e10);
                }
                throw e10;
            } finally {
                c0980c.w();
            }
        }

        @Override // Cc.B
        /* renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public C0980c r() {
            return C0980c.this;
        }

        @Override // Cc.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0980c c0980c = C0980c.this;
            B b10 = this.f3225C;
            c0980c.v();
            try {
                b10.close();
                C4153F c4153f = C4153F.f46609a;
                if (c0980c.w()) {
                    throw c0980c.p(null);
                }
            } catch (IOException e10) {
                if (!c0980c.w()) {
                    throw e10;
                }
                throw c0980c.p(e10);
            } finally {
                c0980c.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f3225C + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f3214j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        C3862t.f(conditionNewCondition, "newCondition(...)");
        f3215k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f3216l = millis;
        f3217m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long now) {
        return this.timeoutAt - now;
    }

    public final B A(B source) {
        C3862t.g(source, "source");
        return new d(source);
    }

    public final IOException p(IOException cause) {
        return x(cause);
    }

    public final void v() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            ReentrantLock reentrantLock = f3214j;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                f3213i.f(this, timeoutNanos, hasDeadline);
                C4153F c4153f = C4153F.f46609a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean w() {
        ReentrantLock reentrantLock = f3214j;
        reentrantLock.lock();
        try {
            int i10 = this.state;
            this.state = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f3213i.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException x(IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final z z(z sink) {
        C3862t.g(sink, "sink");
        return new C0050c(sink);
    }

    protected void B() {
    }
}
