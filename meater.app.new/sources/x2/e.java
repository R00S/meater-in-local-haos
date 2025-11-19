package x2;

import X1.C1804a;
import X1.L;
import java.util.Arrays;
import v2.InterfaceC4811q;
import v2.J;
import v2.K;
import v2.O;

/* compiled from: ChunkReader.java */
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    protected final O f52580a;

    /* renamed from: b, reason: collision with root package name */
    private final int f52581b;

    /* renamed from: c, reason: collision with root package name */
    private final int f52582c;

    /* renamed from: d, reason: collision with root package name */
    private final long f52583d;

    /* renamed from: e, reason: collision with root package name */
    private final int f52584e;

    /* renamed from: f, reason: collision with root package name */
    private int f52585f;

    /* renamed from: g, reason: collision with root package name */
    private int f52586g;

    /* renamed from: h, reason: collision with root package name */
    private int f52587h;

    /* renamed from: i, reason: collision with root package name */
    private int f52588i;

    /* renamed from: j, reason: collision with root package name */
    private int f52589j;

    /* renamed from: k, reason: collision with root package name */
    private long f52590k;

    /* renamed from: l, reason: collision with root package name */
    private long[] f52591l;

    /* renamed from: m, reason: collision with root package name */
    private int[] f52592m;

    public e(int i10, int i11, long j10, int i12, O o10) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        C1804a.a(z10);
        this.f52583d = j10;
        this.f52584e = i12;
        this.f52580a = o10;
        this.f52581b = d(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f52582c = i11 == 2 ? d(i10, 1650720768) : -1;
        this.f52590k = -1L;
        this.f52591l = new long[512];
        this.f52592m = new int[512];
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f52583d * i10) / this.f52584e;
    }

    private K h(int i10) {
        return new K(this.f52592m[i10] * g(), this.f52591l[i10]);
    }

    public void a() {
        this.f52587h++;
    }

    public void b(long j10, boolean z10) {
        if (this.f52590k == -1) {
            this.f52590k = j10;
        }
        if (z10) {
            if (this.f52589j == this.f52592m.length) {
                long[] jArr = this.f52591l;
                this.f52591l = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f52592m;
                this.f52592m = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f52591l;
            int i10 = this.f52589j;
            jArr2[i10] = j10;
            this.f52592m[i10] = this.f52588i;
            this.f52589j = i10 + 1;
        }
        this.f52588i++;
    }

    public void c() {
        this.f52591l = Arrays.copyOf(this.f52591l, this.f52589j);
        this.f52592m = Arrays.copyOf(this.f52592m, this.f52589j);
    }

    public long f() {
        return e(this.f52587h);
    }

    public long g() {
        return e(1);
    }

    public J.a i(long j10) {
        if (this.f52589j == 0) {
            return new J.a(new K(0L, this.f52590k));
        }
        int iG = (int) (j10 / g());
        int iG2 = L.g(this.f52592m, iG, true, true);
        if (this.f52592m[iG2] == iG) {
            return new J.a(h(iG2));
        }
        K kH = h(iG2);
        int i10 = iG2 + 1;
        return i10 < this.f52591l.length ? new J.a(kH, h(i10)) : new J.a(kH);
    }

    public boolean j(int i10) {
        return this.f52581b == i10 || this.f52582c == i10;
    }

    public boolean k() {
        return Arrays.binarySearch(this.f52592m, this.f52587h) >= 0;
    }

    public boolean l(InterfaceC4811q interfaceC4811q) {
        int i10 = this.f52586g;
        int iC = i10 - this.f52580a.c(interfaceC4811q, i10, false);
        this.f52586g = iC;
        boolean z10 = iC == 0;
        if (z10) {
            if (this.f52585f > 0) {
                this.f52580a.e(f(), k() ? 1 : 0, this.f52585f, 0, null);
            }
            a();
        }
        return z10;
    }

    public void m(int i10) {
        this.f52585f = i10;
        this.f52586g = i10;
    }

    public void n(long j10) {
        if (this.f52589j == 0) {
            this.f52587h = 0;
        } else {
            this.f52587h = this.f52592m[L.h(this.f52591l, j10, true, true)];
        }
    }
}
