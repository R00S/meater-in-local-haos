package O2;

import X1.L;
import java.math.RoundingMode;
import v2.E;
import v2.J;

/* compiled from: IndexSeeker.java */
/* loaded from: classes.dex */
final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long f13118a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13119b;

    /* renamed from: c, reason: collision with root package name */
    private final E f13120c;

    public b(long j10, long j11, long j12) {
        this.f13120c = new E(new long[]{j11}, new long[]{0}, j10);
        this.f13118a = j12;
        int i10 = -2147483647;
        if (j10 == -9223372036854775807L) {
            this.f13119b = -2147483647;
            return;
        }
        long jF1 = L.f1(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jF1 > 0 && jF1 <= 2147483647L) {
            i10 = (int) jF1;
        }
        this.f13119b = i10;
    }

    @Override // O2.g
    public long a(long j10) {
        return this.f13120c.a(j10);
    }

    public boolean b(long j10) {
        return this.f13120c.c(j10, 100000L);
    }

    public void c(long j10, long j11) {
        if (b(j10)) {
            return;
        }
        this.f13120c.b(j10, j11);
    }

    void d(long j10) {
        this.f13120c.d(j10);
    }

    @Override // O2.g
    public long f() {
        return this.f13118a;
    }

    @Override // v2.J
    public boolean g() {
        return this.f13120c.g();
    }

    @Override // v2.J
    public J.a k(long j10) {
        return this.f13120c.k(j10);
    }

    @Override // O2.g
    public int l() {
        return this.f13119b;
    }

    @Override // v2.J
    public long m() {
        return this.f13120c.m();
    }
}
