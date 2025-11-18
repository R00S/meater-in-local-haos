package u2;

import X1.C1804a;

/* compiled from: Projection.java */
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f50348a;

    /* renamed from: b, reason: collision with root package name */
    public final a f50349b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50350c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f50351d;

    /* compiled from: Projection.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b[] f50352a;

        public a(b... bVarArr) {
            this.f50352a = bVarArr;
        }

        public b a(int i10) {
            return this.f50352a[i10];
        }

        public int b() {
            return this.f50352a.length;
        }
    }

    /* compiled from: Projection.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f50353a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50354b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f50355c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f50356d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f50353a = i10;
            C1804a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f50355c = fArr;
            this.f50356d = fArr2;
            this.f50354b = i11;
        }

        public int a() {
            return this.f50355c.length / 3;
        }
    }

    public e(a aVar, int i10) {
        this(aVar, aVar, i10);
    }

    public static e a(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        float f13;
        int i14;
        int i15;
        int i16;
        float[] fArr;
        int i17;
        int i18 = i10;
        int i19 = i11;
        C1804a.a(f10 > 0.0f);
        C1804a.a(i18 >= 1);
        C1804a.a(i19 >= 1);
        C1804a.a(f11 > 0.0f && f11 <= 180.0f);
        C1804a.a(f12 > 0.0f && f12 <= 360.0f);
        float radians = (float) Math.toRadians(f11);
        float radians2 = (float) Math.toRadians(f12);
        float f14 = radians / i18;
        float f15 = radians2 / i19;
        int i20 = i19 + 1;
        int i21 = ((i20 * 2) + 2) * i18;
        float[] fArr2 = new float[i21 * 3];
        float[] fArr3 = new float[i21 * 2];
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i22 < i18) {
            float f16 = radians / 2.0f;
            float f17 = (i22 * f14) - f16;
            int i25 = i22 + 1;
            float f18 = (i25 * f14) - f16;
            int i26 = 0;
            while (i26 < i20) {
                float f19 = f17;
                int i27 = i25;
                int i28 = 2;
                int i29 = 0;
                while (i29 < i28) {
                    if (i29 == 0) {
                        f13 = f19;
                        i13 = i20;
                    } else {
                        i13 = i20;
                        f13 = f18;
                    }
                    float f20 = i26 * f15;
                    float f21 = f15;
                    int i30 = i26;
                    double d10 = f10;
                    float f22 = f14;
                    double d11 = (f20 + 3.1415927f) - (radians2 / 2.0f);
                    int i31 = i29;
                    double d12 = f13;
                    float[] fArr4 = fArr3;
                    float f23 = f18;
                    fArr2[i23] = -((float) (Math.sin(d11) * d10 * Math.cos(d12)));
                    float f24 = radians;
                    float f25 = radians2;
                    fArr2[i23 + 1] = (float) (d10 * Math.sin(d12));
                    int i32 = i23 + 3;
                    fArr2[i23 + 2] = (float) (d10 * Math.cos(d11) * Math.cos(d12));
                    fArr4[i24] = f20 / f25;
                    int i33 = i24 + 2;
                    fArr4[i24 + 1] = ((i22 + i31) * f22) / f24;
                    if (i30 == 0 && i31 == 0) {
                        i14 = i11;
                        i15 = i30;
                        i16 = i31;
                    } else {
                        i14 = i11;
                        i15 = i30;
                        i16 = i31;
                        if (i15 != i14 || i16 != 1) {
                            fArr = fArr4;
                            i17 = 2;
                            i24 = i33;
                            i23 = i32;
                        }
                        i29 = i16 + 1;
                        i19 = i14;
                        i26 = i15;
                        fArr3 = fArr;
                        radians = f24;
                        i20 = i13;
                        f15 = f21;
                        radians2 = f25;
                        f18 = f23;
                        i28 = i17;
                        f14 = f22;
                    }
                    System.arraycopy(fArr2, i23, fArr2, i32, 3);
                    i23 += 6;
                    fArr = fArr4;
                    i17 = 2;
                    System.arraycopy(fArr, i24, fArr, i33, 2);
                    i24 += 4;
                    i29 = i16 + 1;
                    i19 = i14;
                    i26 = i15;
                    fArr3 = fArr;
                    radians = f24;
                    i20 = i13;
                    f15 = f21;
                    radians2 = f25;
                    f18 = f23;
                    i28 = i17;
                    f14 = f22;
                }
                float f26 = radians2;
                int i34 = i26;
                int i35 = i19;
                int i36 = i34 + 1;
                i25 = i27;
                f14 = f14;
                radians2 = f26;
                f18 = f18;
                f17 = f19;
                i19 = i35;
                i26 = i36;
            }
            i18 = i10;
            i22 = i25;
        }
        return new e(new a(new b(0, fArr2, fArr3, 1)), i12);
    }

    public static e b(int i10) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }

    public e(a aVar, a aVar2, int i10) {
        this.f50348a = aVar;
        this.f50349b = aVar2;
        this.f50350c = i10;
        this.f50351d = aVar == aVar2;
    }
}
