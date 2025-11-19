package tc;

import java.io.IOException;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import sc.AbstractC4529a;
import tc.e;
import yc.j;

/* compiled from: RealConnectionPool.kt */
@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001)\u0018\u0000 /2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010-¨\u00060"}, d2 = {"Ltc/g;", "", "Lsc/e;", "taskRunner", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lsc/e;IJLjava/util/concurrent/TimeUnit;)V", "Ltc/f;", "connection", "now", "d", "(Ltc/f;J)I", "Loc/a;", "address", "Ltc/e;", "call", "", "Loc/F;", "routes", "", "requireMultiplexed", "a", "(Loc/a;Ltc/e;Ljava/util/List;Z)Z", "Loa/F;", "e", "(Ltc/f;)V", "c", "(Ltc/f;)Z", "b", "(J)J", "I", "J", "keepAliveDurationNs", "Lsc/d;", "Lsc/d;", "cleanupQueue", "tc/g$b", "Ltc/g$b;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "f", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxIdleConnections;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long keepAliveDurationNs;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final sc.d cleanupQueue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b cleanupTask;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedQueue<f> connections;

    /* compiled from: RealConnectionPool.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tc/g$b", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends AbstractC4529a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // sc.AbstractC4529a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(sc.e taskRunner, int i10, long j10, TimeUnit timeUnit) {
        C3862t.g(taskRunner, "taskRunner");
        C3862t.g(timeUnit, "timeUnit");
        this.maxIdleConnections = i10;
        this.keepAliveDurationNs = timeUnit.toNanos(j10);
        this.cleanupQueue = taskRunner.i();
        this.cleanupTask = new b(pc.d.f47759i + " ConnectionPool");
        this.connections = new ConcurrentLinkedQueue<>();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    private final int d(f connection, long now) {
        if (pc.d.f47758h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        List<Reference<e>> listN = connection.n();
        int i10 = 0;
        while (i10 < listN.size()) {
            Reference<e> reference = listN.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                C3862t.e(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                j.INSTANCE.g().m("A connection to " + connection.getRoute().getAddress().getUrl() + " was leaked. Did you forget to close a response body?", ((e.b) reference).getCallStackTrace());
                listN.remove(i10);
                connection.C(true);
                if (listN.isEmpty()) {
                    connection.B(now - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return listN.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(oc.C4181a r4, tc.e r5, java.util.List<oc.F> r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.C3862t.g(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C3862t.g(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue<tc.f> r0 = r3.connections
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            tc.f r1 = (tc.f) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.C3862t.f(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2d
            boolean r2 = r1.v()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            goto L2d
        L2b:
            r4 = move-exception
            goto L3d
        L2d:
            boolean r2 = r1.t(r4, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            r5.d(r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            r4 = 1
            return r4
        L39:
            oa.F r2 = oa.C4153F.f46609a     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            goto L10
        L3d:
            monitor-exit(r1)
            throw r4
        L3f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.g.a(oc.a, tc.e, java.util.List, boolean):boolean");
    }

    public final long b(long now) throws IOException {
        Iterator<f> it = this.connections.iterator();
        int i10 = 0;
        long j10 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        while (it.hasNext()) {
            f connection = it.next();
            C3862t.f(connection, "connection");
            synchronized (connection) {
                if (d(connection, now) > 0) {
                    i11++;
                } else {
                    i10++;
                    long idleAtNs = now - connection.getIdleAtNs();
                    if (idleAtNs > j10) {
                        fVar = connection;
                        j10 = idleAtNs;
                    }
                    C4153F c4153f = C4153F.f46609a;
                }
            }
        }
        long j11 = this.keepAliveDurationNs;
        if (j10 < j11 && i10 <= this.maxIdleConnections) {
            if (i10 > 0) {
                return j11 - j10;
            }
            if (i11 > 0) {
                return j11;
            }
            return -1L;
        }
        C3862t.d(fVar);
        synchronized (fVar) {
            if (!fVar.n().isEmpty()) {
                return 0L;
            }
            if (fVar.getIdleAtNs() + j10 != now) {
                return 0L;
            }
            fVar.C(true);
            this.connections.remove(fVar);
            pc.d.n(fVar.D());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.a();
            }
            return 0L;
        }
    }

    public final boolean c(f connection) {
        C3862t.g(connection, "connection");
        if (pc.d.f47758h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            sc.d.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        connection.C(true);
        this.connections.remove(connection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.a();
        }
        return true;
    }

    public final void e(f connection) {
        C3862t.g(connection, "connection");
        if (!pc.d.f47758h || Thread.holdsLock(connection)) {
            this.connections.add(connection);
            sc.d.j(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}
