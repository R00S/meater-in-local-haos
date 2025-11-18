package p024c.p041e;

/* compiled from: ContainerHelpers.java */
/* renamed from: c.e.c */
/* loaded from: classes.dex */
class C0869c {

    /* renamed from: a */
    static final int[] f5721a = new int[0];

    /* renamed from: b */
    static final long[] f5722b = new long[0];

    /* renamed from: c */
    static final Object[] f5723c = new Object[0];

    /* renamed from: a */
    static int m5428a(int[] iArr, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return i5 ^ (-1);
    }

    /* renamed from: b */
    static int m5429b(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return i4 ^ (-1);
    }

    /* renamed from: c */
    public static boolean m5430c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static int m5431d(int i2) {
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                return i4;
            }
        }
        return i2;
    }

    /* renamed from: e */
    public static int m5432e(int i2) {
        return m5431d(i2 * 4) / 4;
    }

    /* renamed from: f */
    public static int m5433f(int i2) {
        return m5431d(i2 * 8) / 8;
    }
}
