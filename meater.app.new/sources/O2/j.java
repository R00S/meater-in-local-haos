package O2;

import X1.C1804a;
import X1.L;
import v2.F;
import v2.J;
import v2.K;

/* compiled from: XingSeeker.java */
/* loaded from: classes.dex */
final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long f13158a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13159b;

    /* renamed from: c, reason: collision with root package name */
    private final long f13160c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13161d;

    /* renamed from: e, reason: collision with root package name */
    private final long f13162e;

    /* renamed from: f, reason: collision with root package name */
    private final long f13163f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f13164g;

    private j(long j10, int i10, long j11, int i11) {
        this(j10, i10, j11, i11, -1L, null);
    }

    public static j b(i iVar, long j10) {
        long[] jArr;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j11 = iVar.f13154c;
        if (j11 == -1 || (jArr = iVar.f13157f) == null) {
            F.a aVar = iVar.f13152a;
            return new j(j10, aVar.f51043c, jA, aVar.f51046f);
        }
        F.a aVar2 = iVar.f13152a;
        return new j(j10, aVar2.f51043c, jA, aVar2.f51046f, j11, jArr);
    }

    private long c(int i10) {
        return (this.f13160c * i10) / 100;
    }

    @Override // O2.g
    public long a(long j10) {
        long j11 = j10 - this.f13158a;
        if (!g() || j11 <= this.f13159b) {
            return 0L;
        }
        long[] jArr = (long[]) C1804a.i(this.f13164g);
        double d10 = (j11 * 256.0d) / this.f13162e;
        int iH = L.h(jArr, (long) d10, true, true);
        long jC = c(iH);
        long j12 = jArr[iH];
        int i10 = iH + 1;
        long jC2 = c(i10);
        return jC + Math.round((j12 == (iH == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jC2 - jC));
    }

    @Override // O2.g
    public long f() {
        return this.f13163f;
    }

    @Override // v2.J
    public boolean g() {
        return this.f13164g != null;
    }

    @Override // v2.J
    public J.a k(long j10) {
        if (!g()) {
            return new J.a(new K(0L, this.f13158a + this.f13159b));
        }
        long jQ = L.q(j10, 0L, this.f13160c);
        double d10 = (jQ * 100.0d) / this.f13160c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) C1804a.i(this.f13164g))[i10];
                d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12));
            }
        }
        return new J.a(new K(jQ, this.f13158a + L.q(Math.round((d11 / 256.0d) * this.f13162e), this.f13159b, this.f13162e - 1)));
    }

    @Override // O2.g
    public int l() {
        return this.f13161d;
    }

    @Override // v2.J
    public long m() {
        return this.f13160c;
    }

    private j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f13158a = j10;
        this.f13159b = i10;
        this.f13160c = j11;
        this.f13161d = i11;
        this.f13162e = j12;
        this.f13164g = jArr;
        this.f13163f = j12 != -1 ? j10 + j12 : -1L;
    }
}
