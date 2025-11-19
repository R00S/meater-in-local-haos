package h2;

import U1.s;
import X1.L;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import o8.C4141a;

/* compiled from: SegmentBase.java */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    final i f42280a;

    /* renamed from: b, reason: collision with root package name */
    final long f42281b;

    /* renamed from: c, reason: collision with root package name */
    final long f42282c;

    /* compiled from: SegmentBase.java */
    public static abstract class a extends k {

        /* renamed from: d, reason: collision with root package name */
        final long f42283d;

        /* renamed from: e, reason: collision with root package name */
        final long f42284e;

        /* renamed from: f, reason: collision with root package name */
        final List<d> f42285f;

        /* renamed from: g, reason: collision with root package name */
        private final long f42286g;

        /* renamed from: h, reason: collision with root package name */
        private final long f42287h;

        /* renamed from: i, reason: collision with root package name */
        final long f42288i;

        public a(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f42283d = j12;
            this.f42284e = j13;
            this.f42285f = list;
            this.f42288i = j14;
            this.f42286g = j15;
            this.f42287h = j16;
        }

        public long c(long j10, long j11) {
            long jG = g(j10);
            return jG != -1 ? jG : (int) (i((j11 - this.f42287h) + this.f42288i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f42286g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f42287h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f42283d;
        }

        public long f(long j10, long j11) {
            if (this.f42285f != null) {
                return -9223372036854775807L;
            }
            long jD = d(j10, j11) + c(j10, j11);
            return (j(jD) + h(jD, j10)) - this.f42288i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List<d> list = this.f42285f;
            if (list != null) {
                return (list.get((int) (j10 - this.f42283d)).f42294b * 1000000) / this.f42281b;
            }
            long jG = g(j11);
            return (jG == -1 || j10 != (e() + jG) - 1) ? (this.f42284e * 1000000) / this.f42281b : j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long jE = e();
            long jG = g(j11);
            if (jG == 0) {
                return jE;
            }
            if (this.f42285f == null) {
                long j12 = this.f42283d + (j10 / ((this.f42284e * 1000000) / this.f42281b));
                return j12 < jE ? jE : jG == -1 ? j12 : Math.min(j12, (jE + jG) - 1);
            }
            long j13 = (jG + jE) - 1;
            long j14 = jE;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                long j16 = j(j15);
                if (j16 < j10) {
                    j14 = j15 + 1;
                } else {
                    if (j16 <= j10) {
                        return j15;
                    }
                    j13 = j15 - 1;
                }
            }
            return j14 == jE ? j14 : j13;
        }

        public final long j(long j10) {
            List<d> list = this.f42285f;
            return L.d1(list != null ? list.get((int) (j10 - this.f42283d)).f42293a - this.f42282c : (j10 - this.f42283d) * this.f42284e, 1000000L, this.f42281b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f42285f != null;
        }
    }

    /* compiled from: SegmentBase.java */
    public static final class b extends a {

        /* renamed from: j, reason: collision with root package name */
        final List<i> f42289j;

        public b(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f42289j = list2;
        }

        @Override // h2.k.a
        public long g(long j10) {
            return this.f42289j.size();
        }

        @Override // h2.k.a
        public i k(j jVar, long j10) {
            return this.f42289j.get((int) (j10 - this.f42283d));
        }

        @Override // h2.k.a
        public boolean l() {
            return true;
        }
    }

    /* compiled from: SegmentBase.java */
    public static final class c extends a {

        /* renamed from: j, reason: collision with root package name */
        final n f42290j;

        /* renamed from: k, reason: collision with root package name */
        final n f42291k;

        /* renamed from: l, reason: collision with root package name */
        final long f42292l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f42290j = nVar;
            this.f42291k = nVar2;
            this.f42292l = j13;
        }

        @Override // h2.k
        public i a(j jVar) {
            n nVar = this.f42290j;
            if (nVar == null) {
                return super.a(jVar);
            }
            s sVar = jVar.f42267b;
            return new i(nVar.a(sVar.f17148a, 0L, sVar.f17157j, 0L), 0L, -1L);
        }

        @Override // h2.k.a
        public long g(long j10) {
            if (this.f42285f != null) {
                return r0.size();
            }
            long j11 = this.f42292l;
            if (j11 != -1) {
                return (j11 - this.f42283d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return C4141a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f42281b)), BigInteger.valueOf(this.f42284e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // h2.k.a
        public i k(j jVar, long j10) {
            List<d> list = this.f42285f;
            long j11 = list != null ? list.get((int) (j10 - this.f42283d)).f42293a : (j10 - this.f42283d) * this.f42284e;
            n nVar = this.f42291k;
            s sVar = jVar.f42267b;
            return new i(nVar.a(sVar.f17148a, j10, sVar.f17157j, j11), 0L, -1L);
        }
    }

    /* compiled from: SegmentBase.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        final long f42293a;

        /* renamed from: b, reason: collision with root package name */
        final long f42294b;

        public d(long j10, long j11) {
            this.f42293a = j10;
            this.f42294b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f42293a == dVar.f42293a && this.f42294b == dVar.f42294b;
        }

        public int hashCode() {
            return (((int) this.f42293a) * 31) + ((int) this.f42294b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f42280a = iVar;
        this.f42281b = j10;
        this.f42282c = j11;
    }

    public i a(j jVar) {
        return this.f42280a;
    }

    public long b() {
        return L.d1(this.f42282c, 1000000L, this.f42281b);
    }

    /* compiled from: SegmentBase.java */
    public static class e extends k {

        /* renamed from: d, reason: collision with root package name */
        final long f42295d;

        /* renamed from: e, reason: collision with root package name */
        final long f42296e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f42295d = j12;
            this.f42296e = j13;
        }

        public i c() {
            long j10 = this.f42296e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f42295d, j10);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
