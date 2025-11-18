package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class i10 {

    /* renamed from: a */
    private final int f19257a;

    /* renamed from: b */
    private final int f19258b;

    /* renamed from: c */
    private final int f19259c;

    /* renamed from: d */
    private final int f19260d;

    /* renamed from: e */
    private final int f19261e;

    /* renamed from: f */
    private final short[] f19262f;

    /* renamed from: g */
    private int f19263g;

    /* renamed from: h */
    private short[] f19264h;

    /* renamed from: i */
    private int f19265i;

    /* renamed from: j */
    private short[] f19266j;

    /* renamed from: k */
    private int f19267k;

    /* renamed from: l */
    private short[] f19268l;

    /* renamed from: q */
    private int f19273q;

    /* renamed from: r */
    private int f19274r;

    /* renamed from: s */
    private int f19275s;

    /* renamed from: t */
    private int f19276t;

    /* renamed from: v */
    private int f19278v;

    /* renamed from: w */
    private int f19279w;

    /* renamed from: x */
    private int f19280x;

    /* renamed from: m */
    private int f19269m = 0;

    /* renamed from: n */
    private int f19270n = 0;

    /* renamed from: u */
    private int f19277u = 0;

    /* renamed from: o */
    private float f19271o = 1.0f;

    /* renamed from: p */
    private float f19272p = 1.0f;

    public i10(int i2, int i3) {
        this.f19257a = i2;
        this.f19258b = i3;
        this.f19259c = i2 / 400;
        int i4 = i2 / 65;
        this.f19260d = i4;
        int i5 = i4 * 2;
        this.f19261e = i5;
        this.f19262f = new short[i5];
        this.f19263g = i5;
        this.f19264h = new short[i5 * i3];
        this.f19265i = i5;
        this.f19266j = new short[i5 * i3];
        this.f19267k = i5;
        this.f19268l = new short[i5 * i3];
    }

    /* renamed from: b */
    private final int m15319b(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f19258b;
        int i6 = 1;
        int i7 = 255;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                short s = sArr[i5 + i11];
                short s2 = sArr[i5 + i3 + i11];
                i10 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i10 * i8 < i6 * i3) {
                i8 = i3;
                i6 = i10;
            }
            if (i10 * i7 > i9 * i3) {
                i7 = i3;
                i9 = i10;
            }
            i3++;
        }
        this.f19279w = i6 / i8;
        this.f19280x = i9 / i7;
        return i8;
    }

    /* renamed from: d */
    private static void m15320d(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i10] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    /* renamed from: f */
    private final void m15321f(short[] sArr, int i2, int i3) {
        m15322g(i3);
        int i4 = this.f19258b;
        System.arraycopy(sArr, i2 * i4, this.f19266j, this.f19274r * i4, i4 * i3);
        this.f19274r += i3;
    }

    /* renamed from: g */
    private final void m15322g(int i2) {
        int i3 = this.f19274r + i2;
        int i4 = this.f19265i;
        if (i3 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.f19265i = i5;
            this.f19266j = Arrays.copyOf(this.f19266j, i5 * this.f19258b);
        }
    }

    /* renamed from: h */
    private final void m15323h(int i2) {
        int i3 = this.f19273q + i2;
        int i4 = this.f19263g;
        if (i3 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.f19263g = i5;
            this.f19264h = Arrays.copyOf(this.f19264h, i5 * this.f19258b);
        }
    }

    /* renamed from: j */
    private final void m15324j(short[] sArr, int i2, int i3) {
        int i4 = this.f19261e / i3;
        int i5 = this.f19258b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f19262f[i8] = (short) (i9 / i6);
        }
    }

    /* renamed from: m */
    private final void m15325m() {
        int iM15319b;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f19274r;
        float f2 = this.f19271o / this.f19272p;
        double d2 = f2;
        int i8 = 1;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i9 = this.f19273q;
            if (i9 >= this.f19261e) {
                int i10 = 0;
                while (true) {
                    int i11 = this.f19276t;
                    if (i11 > 0) {
                        int iMin = Math.min(this.f19261e, i11);
                        m15321f(this.f19264h, i10, iMin);
                        this.f19276t -= iMin;
                        i10 += iMin;
                    } else {
                        short[] sArr = this.f19264h;
                        int i12 = this.f19257a;
                        int i13 = i12 > 4000 ? i12 / 4000 : 1;
                        if (this.f19258b == i8 && i13 == i8) {
                            iM15319b = m15319b(sArr, i10, this.f19259c, this.f19260d);
                        } else {
                            m15324j(sArr, i10, i13);
                            int iM15319b2 = m15319b(this.f19262f, 0, this.f19259c / i13, this.f19260d / i13);
                            if (i13 != i8) {
                                int i14 = iM15319b2 * i13;
                                int i15 = i13 << 2;
                                int i16 = i14 - i15;
                                int i17 = i14 + i15;
                                int i18 = this.f19259c;
                                if (i16 < i18) {
                                    i16 = i18;
                                }
                                int i19 = this.f19260d;
                                if (i17 > i19) {
                                    i17 = i19;
                                }
                                if (this.f19258b == i8) {
                                    iM15319b = m15319b(sArr, i10, i16, i17);
                                } else {
                                    m15324j(sArr, i10, i8);
                                    iM15319b = m15319b(this.f19262f, 0, i16, i17);
                                }
                            } else {
                                iM15319b = iM15319b2;
                            }
                        }
                        int i20 = this.f19279w;
                        int i21 = i20 != 0 && this.f19277u != 0 && this.f19280x <= i20 * 3 && (i20 << 1) > this.f19278v * 3 ? this.f19277u : iM15319b;
                        this.f19278v = i20;
                        this.f19277u = iM15319b;
                        if (d2 > 1.0d) {
                            short[] sArr2 = this.f19264h;
                            if (f2 >= 2.0f) {
                                i3 = (int) (i21 / (f2 - 1.0f));
                            } else {
                                this.f19276t = (int) ((i21 * (2.0f - f2)) / (f2 - 1.0f));
                                i3 = i21;
                            }
                            m15322g(i3);
                            int i22 = i3;
                            m15320d(i3, this.f19258b, this.f19266j, this.f19274r, sArr2, i10, sArr2, i10 + i21);
                            this.f19274r += i22;
                            i10 += i21 + i22;
                        } else {
                            int i23 = i21;
                            short[] sArr3 = this.f19264h;
                            if (f2 < 0.5f) {
                                i2 = (int) ((i23 * f2) / (1.0f - f2));
                            } else {
                                this.f19276t = (int) ((i23 * ((2.0f * f2) - 1.0f)) / (1.0f - f2));
                                i2 = i23;
                            }
                            int i24 = i23 + i2;
                            m15322g(i24);
                            int i25 = this.f19258b;
                            System.arraycopy(sArr3, i10 * i25, this.f19266j, this.f19274r * i25, i25 * i23);
                            m15320d(i2, this.f19258b, this.f19266j, this.f19274r + i23, sArr3, i23 + i10, sArr3, i10);
                            this.f19274r += i24;
                            i10 += i2;
                        }
                    }
                    if (this.f19261e + i10 > i9) {
                        break;
                    } else {
                        i8 = 1;
                    }
                }
                int i26 = this.f19273q - i10;
                short[] sArr4 = this.f19264h;
                int i27 = this.f19258b;
                System.arraycopy(sArr4, i10 * i27, sArr4, 0, i27 * i26);
                this.f19273q = i26;
            }
        } else {
            m15321f(this.f19264h, 0, this.f19273q);
            this.f19273q = 0;
        }
        float f3 = this.f19272p;
        if (f3 == 1.0f || this.f19274r == i7) {
            return;
        }
        int i28 = this.f19257a;
        int i29 = (int) (i28 / f3);
        while (true) {
            if (i29 <= 16384 && i28 <= 16384) {
                break;
            }
            i29 /= 2;
            i28 /= 2;
        }
        int i30 = this.f19274r - i7;
        int i31 = this.f19275s + i30;
        int i32 = this.f19267k;
        if (i31 > i32) {
            int i33 = i32 + (i32 / 2) + i30;
            this.f19267k = i33;
            this.f19268l = Arrays.copyOf(this.f19268l, i33 * this.f19258b);
        }
        short[] sArr5 = this.f19266j;
        int i34 = this.f19258b;
        System.arraycopy(sArr5, i7 * i34, this.f19268l, this.f19275s * i34, i34 * i30);
        this.f19274r = i7;
        this.f19275s += i30;
        int i35 = 0;
        while (true) {
            i4 = this.f19275s;
            if (i35 >= i4 - 1) {
                break;
            }
            while (true) {
                i5 = this.f19269m;
                int i36 = (i5 + 1) * i29;
                i6 = this.f19270n;
                if (i36 <= i6 * i28) {
                    break;
                }
                m15322g(1);
                int i37 = 0;
                while (true) {
                    int i38 = this.f19258b;
                    if (i37 < i38) {
                        short[] sArr6 = this.f19266j;
                        int i39 = (this.f19274r * i38) + i37;
                        short[] sArr7 = this.f19268l;
                        int i40 = (i35 * i38) + i37;
                        short s = sArr7[i40];
                        short s2 = sArr7[i40 + i38];
                        int i41 = this.f19270n * i28;
                        int i42 = this.f19269m;
                        int i43 = i42 * i29;
                        int i44 = (i42 + 1) * i29;
                        int i45 = i44 - i41;
                        int i46 = i44 - i43;
                        sArr6[i39] = (short) (((s * i45) + ((i46 - i45) * s2)) / i46);
                        i37++;
                    }
                }
                this.f19270n++;
                this.f19274r++;
            }
            int i47 = i5 + 1;
            this.f19269m = i47;
            if (i47 == i28) {
                this.f19269m = 0;
                zzsk.m20481e(i6 == i29);
                this.f19270n = 0;
            }
            i35++;
        }
        int i48 = i4 - 1;
        if (i48 != 0) {
            short[] sArr8 = this.f19268l;
            int i49 = this.f19258b;
            System.arraycopy(sArr8, i48 * i49, sArr8, 0, (i4 - i48) * i49);
            this.f19275s -= i48;
        }
    }

    /* renamed from: a */
    public final void m15326a(float f2) {
        this.f19271o = f2;
    }

    /* renamed from: c */
    public final void m15327c(float f2) {
        this.f19272p = f2;
    }

    /* renamed from: e */
    public final void m15328e(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i2 = this.f19258b;
        int i3 = iRemaining / i2;
        m15323h(i3);
        shortBuffer.get(this.f19264h, this.f19273q * this.f19258b, ((i2 * i3) << 1) / 2);
        this.f19273q += i3;
        m15325m();
    }

    /* renamed from: i */
    public final void m15329i(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f19258b, this.f19274r);
        shortBuffer.put(this.f19266j, 0, this.f19258b * iMin);
        int i2 = this.f19274r - iMin;
        this.f19274r = i2;
        short[] sArr = this.f19266j;
        int i3 = this.f19258b;
        System.arraycopy(sArr, iMin * i3, sArr, 0, i2 * i3);
    }

    /* renamed from: k */
    public final void m15330k() {
        int i2;
        int i3 = this.f19273q;
        float f2 = this.f19271o;
        float f3 = this.f19272p;
        int i4 = this.f19274r + ((int) ((((i3 / (f2 / f3)) + this.f19275s) / f3) + 0.5f));
        m15323h((this.f19261e * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.f19261e;
            int i6 = this.f19258b;
            if (i5 >= i2 * 2 * i6) {
                break;
            }
            this.f19264h[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.f19273q += i2 * 2;
        m15325m();
        if (this.f19274r > i4) {
            this.f19274r = i4;
        }
        this.f19273q = 0;
        this.f19276t = 0;
        this.f19275s = 0;
    }

    /* renamed from: l */
    public final int m15331l() {
        return this.f19274r;
    }
}
