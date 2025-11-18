package X1;

/* compiled from: TimestampAdjuster.java */
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private long f18620a;

    /* renamed from: b, reason: collision with root package name */
    private long f18621b;

    /* renamed from: c, reason: collision with root package name */
    private long f18622c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f18623d = new ThreadLocal<>();

    public E(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return L.d1(j10, 1000000L, 90000L);
    }

    public static long j(long j10) {
        return L.d1(j10, 90000L, 1000000L);
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long jLongValue = this.f18620a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) C1804a.e(this.f18623d.get())).longValue();
                }
                this.f18621b = jLongValue - j10;
                notifyAll();
            }
            this.f18622c = j10;
            return j10 + this.f18621b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f18622c;
            if (j11 != -9223372036854775807L) {
                long j12 = j(j11);
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                j10 += j13 * 8589934592L;
                if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                    j10 = j14;
                }
            }
            return a(h(j10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f18622c;
            if (j11 != -9223372036854775807L) {
                long j12 = j(j11);
                long j13 = j12 / 8589934592L;
                long j14 = (j13 * 8589934592L) + j10;
                j10 += (j13 + 1) * 8589934592L;
                if (j14 >= j12) {
                    j10 = j14;
                }
            }
            return a(h(j10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long d() {
        long j10;
        j10 = this.f18620a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        try {
            j10 = this.f18622c;
        } catch (Throwable th) {
            throw th;
        }
        return j10 != -9223372036854775807L ? j10 + this.f18621b : d();
    }

    public synchronized long f() {
        return this.f18621b;
    }

    public synchronized boolean g() {
        return this.f18621b != -9223372036854775807L;
    }

    public synchronized void i(long j10) {
        this.f18620a = j10;
        this.f18621b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f18622c = -9223372036854775807L;
    }
}
