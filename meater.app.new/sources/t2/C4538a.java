package t2;

import java.util.Arrays;

/* compiled from: FixedFrameRateEstimator.java */
/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4538a {

    /* renamed from: c, reason: collision with root package name */
    private boolean f49812c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f49813d;

    /* renamed from: f, reason: collision with root package name */
    private int f49815f;

    /* renamed from: a, reason: collision with root package name */
    private C0705a f49810a = new C0705a();

    /* renamed from: b, reason: collision with root package name */
    private C0705a f49811b = new C0705a();

    /* renamed from: e, reason: collision with root package name */
    private long f49814e = -9223372036854775807L;

    /* compiled from: FixedFrameRateEstimator.java */
    /* renamed from: t2.a$a, reason: collision with other inner class name */
    private static final class C0705a {

        /* renamed from: a, reason: collision with root package name */
        private long f49816a;

        /* renamed from: b, reason: collision with root package name */
        private long f49817b;

        /* renamed from: c, reason: collision with root package name */
        private long f49818c;

        /* renamed from: d, reason: collision with root package name */
        private long f49819d;

        /* renamed from: e, reason: collision with root package name */
        private long f49820e;

        /* renamed from: f, reason: collision with root package name */
        private long f49821f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f49822g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f49823h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f49820e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f49821f / j10;
        }

        public long b() {
            return this.f49821f;
        }

        public boolean d() {
            long j10 = this.f49819d;
            if (j10 == 0) {
                return false;
            }
            return this.f49822g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f49819d > 15 && this.f49823h == 0;
        }

        public void f(long j10) {
            long j11 = this.f49819d;
            if (j11 == 0) {
                this.f49816a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f49816a;
                this.f49817b = j12;
                this.f49821f = j12;
                this.f49820e = 1L;
            } else {
                long j13 = j10 - this.f49818c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f49817b) <= 1000000) {
                    this.f49820e++;
                    this.f49821f += j13;
                    boolean[] zArr = this.f49822g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f49823h--;
                    }
                } else {
                    boolean[] zArr2 = this.f49822g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f49823h++;
                    }
                }
            }
            this.f49819d++;
            this.f49818c = j10;
        }

        public void g() {
            this.f49819d = 0L;
            this.f49820e = 0L;
            this.f49821f = 0L;
            this.f49823h = 0;
            Arrays.fill(this.f49822g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f49810a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f49810a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f49815f;
    }

    public long d() {
        if (e()) {
            return this.f49810a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f49810a.e();
    }

    public void f(long j10) {
        this.f49810a.f(j10);
        if (this.f49810a.e() && !this.f49813d) {
            this.f49812c = false;
        } else if (this.f49814e != -9223372036854775807L) {
            if (!this.f49812c || this.f49811b.d()) {
                this.f49811b.g();
                this.f49811b.f(this.f49814e);
            }
            this.f49812c = true;
            this.f49811b.f(j10);
        }
        if (this.f49812c && this.f49811b.e()) {
            C0705a c0705a = this.f49810a;
            this.f49810a = this.f49811b;
            this.f49811b = c0705a;
            this.f49812c = false;
            this.f49813d = false;
        }
        this.f49814e = j10;
        this.f49815f = this.f49810a.e() ? 0 : this.f49815f + 1;
    }

    public void g() {
        this.f49810a.g();
        this.f49811b.g();
        this.f49812c = false;
        this.f49814e = -9223372036854775807L;
        this.f49815f = 0;
    }
}
