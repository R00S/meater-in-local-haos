package v2;

import v2.J;

/* compiled from: ConstantBitrateSeekMap.java */
/* renamed from: v2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4802h implements J {

    /* renamed from: a, reason: collision with root package name */
    private final long f51168a;

    /* renamed from: b, reason: collision with root package name */
    private final long f51169b;

    /* renamed from: c, reason: collision with root package name */
    private final int f51170c;

    /* renamed from: d, reason: collision with root package name */
    private final long f51171d;

    /* renamed from: e, reason: collision with root package name */
    private final int f51172e;

    /* renamed from: f, reason: collision with root package name */
    private final long f51173f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f51174g;

    public C4802h(long j10, long j11, int i10, int i11, boolean z10) {
        this.f51168a = j10;
        this.f51169b = j11;
        this.f51170c = i11 == -1 ? 1 : i11;
        this.f51172e = i10;
        this.f51174g = z10;
        if (j10 == -1) {
            this.f51171d = -1L;
            this.f51173f = -9223372036854775807L;
        } else {
            this.f51171d = j10 - j11;
            this.f51173f = d(j10, j11, i10);
        }
    }

    private long b(long j10) {
        int i10 = this.f51170c;
        long jMin = (((j10 * this.f51172e) / 8000000) / i10) * i10;
        long j11 = this.f51171d;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - i10);
        }
        return this.f51169b + Math.max(jMin, 0L);
    }

    private static long d(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    public long c(long j10) {
        return d(j10, this.f51169b, this.f51172e);
    }

    @Override // v2.J
    public boolean g() {
        return this.f51171d != -1 || this.f51174g;
    }

    @Override // v2.J
    public J.a k(long j10) {
        if (this.f51171d == -1 && !this.f51174g) {
            return new J.a(new K(0L, this.f51169b));
        }
        long jB = b(j10);
        long jC = c(jB);
        K k10 = new K(jC, jB);
        if (this.f51171d != -1 && jC < j10) {
            int i10 = this.f51170c;
            if (i10 + jB < this.f51168a) {
                long j11 = jB + i10;
                return new J.a(k10, new K(c(j11), j11));
            }
        }
        return new J.a(k10);
    }

    @Override // v2.J
    public long m() {
        return this.f51173f;
    }
}
