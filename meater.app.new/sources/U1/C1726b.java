package U1;

import U1.v;
import X1.C1804a;
import android.net.Uri;
import java.util.Arrays;

/* compiled from: AdPlaybackState.java */
/* renamed from: U1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1726b {

    /* renamed from: g, reason: collision with root package name */
    public static final C1726b f16996g = new C1726b(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h, reason: collision with root package name */
    private static final a f16997h = new a(0).i(0);

    /* renamed from: i, reason: collision with root package name */
    private static final String f16998i = X1.L.B0(1);

    /* renamed from: j, reason: collision with root package name */
    private static final String f16999j = X1.L.B0(2);

    /* renamed from: k, reason: collision with root package name */
    private static final String f17000k = X1.L.B0(3);

    /* renamed from: l, reason: collision with root package name */
    private static final String f17001l = X1.L.B0(4);

    /* renamed from: a, reason: collision with root package name */
    public final Object f17002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17003b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17004c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17005d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17006e;

    /* renamed from: f, reason: collision with root package name */
    private final a[] f17007f;

    /* compiled from: AdPlaybackState.java */
    /* renamed from: U1.b$a */
    public static final class a {

        /* renamed from: j, reason: collision with root package name */
        private static final String f17008j = X1.L.B0(0);

        /* renamed from: k, reason: collision with root package name */
        private static final String f17009k = X1.L.B0(1);

        /* renamed from: l, reason: collision with root package name */
        private static final String f17010l = X1.L.B0(2);

        /* renamed from: m, reason: collision with root package name */
        private static final String f17011m = X1.L.B0(3);

        /* renamed from: n, reason: collision with root package name */
        private static final String f17012n = X1.L.B0(4);

        /* renamed from: o, reason: collision with root package name */
        private static final String f17013o = X1.L.B0(5);

        /* renamed from: p, reason: collision with root package name */
        private static final String f17014p = X1.L.B0(6);

        /* renamed from: q, reason: collision with root package name */
        private static final String f17015q = X1.L.B0(7);

        /* renamed from: r, reason: collision with root package name */
        static final String f17016r = X1.L.B0(8);

        /* renamed from: a, reason: collision with root package name */
        public final long f17017a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17018b;

        /* renamed from: c, reason: collision with root package name */
        public final int f17019c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final Uri[] f17020d;

        /* renamed from: e, reason: collision with root package name */
        public final v[] f17021e;

        /* renamed from: f, reason: collision with root package name */
        public final int[] f17022f;

        /* renamed from: g, reason: collision with root package name */
        public final long[] f17023g;

        /* renamed from: h, reason: collision with root package name */
        public final long f17024h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f17025i;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new v[0], new long[0], 0L, false);
        }

        private static long[] b(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        private static int[] c(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            return this.f17025i && this.f17017a == Long.MIN_VALUE && this.f17018b == -1;
        }

        public int d() {
            return e(-1);
        }

        public int e(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f17022f;
                if (i12 >= iArr.length || this.f17025i || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17017a == aVar.f17017a && this.f17018b == aVar.f17018b && this.f17019c == aVar.f17019c && Arrays.equals(this.f17021e, aVar.f17021e) && Arrays.equals(this.f17022f, aVar.f17022f) && Arrays.equals(this.f17023g, aVar.f17023g) && this.f17024h == aVar.f17024h && this.f17025i == aVar.f17025i;
        }

        public boolean f() {
            if (this.f17018b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f17018b; i10++) {
                int i11 = this.f17022f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean h() {
            return this.f17018b == -1 || d() < this.f17018b;
        }

        public int hashCode() {
            int i10 = ((this.f17018b * 31) + this.f17019c) * 31;
            long j10 = this.f17017a;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f17021e)) * 31) + Arrays.hashCode(this.f17022f)) * 31) + Arrays.hashCode(this.f17023g)) * 31;
            long j11 = this.f17024h;
            return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f17025i ? 1 : 0);
        }

        public a i(int i10) {
            int[] iArrC = c(this.f17022f, i10);
            long[] jArrB = b(this.f17023g, i10);
            return new a(this.f17017a, i10, this.f17019c, iArrC, (v[]) Arrays.copyOf(this.f17021e, i10), jArrB, this.f17024h, this.f17025i);
        }

        private a(long j10, int i10, int i11, int[] iArr, v[] vVarArr, long[] jArr, long j11, boolean z10) {
            int i12 = 0;
            C1804a.a(iArr.length == vVarArr.length);
            this.f17017a = j10;
            this.f17018b = i10;
            this.f17019c = i11;
            this.f17022f = iArr;
            this.f17021e = vVarArr;
            this.f17023g = jArr;
            this.f17024h = j11;
            this.f17025i = z10;
            this.f17020d = new Uri[vVarArr.length];
            while (true) {
                Uri[] uriArr = this.f17020d;
                if (i12 >= uriArr.length) {
                    return;
                }
                v vVar = vVarArr[i12];
                uriArr[i12] = vVar == null ? null : ((v.h) C1804a.e(vVar.f17234b)).f17326a;
                i12++;
            }
        }
    }

    private C1726b(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f17002a = obj;
        this.f17004c = j10;
        this.f17005d = j11;
        this.f17003b = aVarArr.length + i10;
        this.f17007f = aVarArr;
        this.f17006e = i10;
    }

    private boolean e(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        a aVarA = a(i10);
        long j12 = aVarA.f17017a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || (aVarA.f17025i && aVarA.f17018b == -1) || j10 < j11 : j10 < j12;
    }

    public a a(int i10) {
        int i11 = this.f17006e;
        return i10 < i11 ? f16997h : this.f17007f[i10 - i11];
    }

    public int b(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f17006e;
        while (i10 < this.f17003b && ((a(i10).f17017a != Long.MIN_VALUE && a(i10).f17017a <= j10) || !a(i10).h())) {
            i10++;
        }
        if (i10 < this.f17003b) {
            return i10;
        }
        return -1;
    }

    public int c(long j10, long j11) {
        int i10 = this.f17003b - 1;
        int i11 = i10 - (d(i10) ? 1 : 0);
        while (i11 >= 0 && e(j10, j11, i11)) {
            i11--;
        }
        if (i11 < 0 || !a(i11).f()) {
            return -1;
        }
        return i11;
    }

    public boolean d(int i10) {
        return i10 == this.f17003b - 1 && a(i10).g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1726b.class != obj.getClass()) {
            return false;
        }
        C1726b c1726b = (C1726b) obj;
        return X1.L.d(this.f17002a, c1726b.f17002a) && this.f17003b == c1726b.f17003b && this.f17004c == c1726b.f17004c && this.f17005d == c1726b.f17005d && this.f17006e == c1726b.f17006e && Arrays.equals(this.f17007f, c1726b.f17007f);
    }

    public int hashCode() {
        int i10 = this.f17003b * 31;
        Object obj = this.f17002a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f17004c)) * 31) + ((int) this.f17005d)) * 31) + this.f17006e) * 31) + Arrays.hashCode(this.f17007f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f17002a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f17004c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f17007f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f17007f[i10].f17017a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f17007f[i10].f17022f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f17007f[i10].f17022f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f17007f[i10].f17023g[i11]);
                sb2.append(')');
                if (i11 < this.f17007f[i10].f17022f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f17007f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
