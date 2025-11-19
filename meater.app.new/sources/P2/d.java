package P2;

import X1.L;

/* compiled from: FixedSampleSizeRechunker.java */
/* loaded from: classes.dex */
final class d {

    /* compiled from: FixedSampleSizeRechunker.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f13754a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f13755b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13756c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f13757d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f13758e;

        /* renamed from: f, reason: collision with root package name */
        public final long f13759f;

        private b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f13754a = jArr;
            this.f13755b = iArr;
            this.f13756c = i10;
            this.f13757d = jArr2;
            this.f13758e = iArr2;
            this.f13759f = j10;
        }
    }

    public static b a(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = 8192 / i10;
        int iK = 0;
        for (int i12 : iArr) {
            iK += L.k(i12, i11);
        }
        long[] jArr2 = new long[iK];
        int[] iArr2 = new int[iK];
        long[] jArr3 = new long[iK];
        int[] iArr3 = new int[iK];
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            long j11 = jArr[i15];
            while (i16 > 0) {
                int iMin = Math.min(i11, i16);
                jArr2[i14] = j11;
                int i17 = i10 * iMin;
                iArr2[i14] = i17;
                iMax = Math.max(iMax, i17);
                jArr3[i14] = i13 * j10;
                iArr3[i14] = 1;
                j11 += iArr2[i14];
                i13 += iMin;
                i16 -= iMin;
                i14++;
            }
        }
        return new b(jArr2, iArr2, iMax, jArr3, iArr3, j10 * i13);
    }
}
