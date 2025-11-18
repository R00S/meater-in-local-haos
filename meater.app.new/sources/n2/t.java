package n2;

import java.util.Arrays;
import java.util.Random;

/* compiled from: ShuffleOrder.java */
/* loaded from: classes.dex */
public interface t {

    /* compiled from: ShuffleOrder.java */
    public static class a implements t {

        /* renamed from: a, reason: collision with root package name */
        private final Random f45656a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f45657b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f45658c;

        public a(int i10) {
            this(i10, new Random());
        }

        private static int[] i(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr[i11] = iArr[iNextInt];
                iArr[iNextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // n2.t
        public int a() {
            return this.f45657b.length;
        }

        @Override // n2.t
        public t b(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f45657b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f45657b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f45656a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // n2.t
        public int c() {
            int[] iArr = this.f45657b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // n2.t
        public int d(int i10) {
            int i11 = this.f45658c[i10] - 1;
            if (i11 >= 0) {
                return this.f45657b[i11];
            }
            return -1;
        }

        @Override // n2.t
        public int e(int i10) {
            int i11 = this.f45658c[i10] + 1;
            int[] iArr = this.f45657b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // n2.t
        public t f(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f45656a.nextInt(this.f45657b.length + 1);
                int i14 = i13 + 1;
                int iNextInt = this.f45656a.nextInt(i14);
                iArr2[i13] = iArr2[iNextInt];
                iArr2[iNextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f45657b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f45657b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f45656a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // n2.t
        public int g() {
            int[] iArr = this.f45657b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // n2.t
        public t h() {
            return new a(0, new Random(this.f45656a.nextLong()));
        }

        private a(int i10, Random random) {
            this(i(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f45657b = iArr;
            this.f45656a = random;
            this.f45658c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f45658c[iArr[i10]] = i10;
            }
        }
    }

    int a();

    t b(int i10, int i11);

    int c();

    int d(int i10);

    int e(int i10);

    t f(int i10, int i11);

    int g();

    t h();
}
