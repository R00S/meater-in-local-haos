package androidx.media3.common.audio;

import X1.C1804a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: Sonic.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f26058a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26059b;

    /* renamed from: c, reason: collision with root package name */
    private final float f26060c;

    /* renamed from: d, reason: collision with root package name */
    private final float f26061d;

    /* renamed from: e, reason: collision with root package name */
    private final float f26062e;

    /* renamed from: f, reason: collision with root package name */
    private final int f26063f;

    /* renamed from: g, reason: collision with root package name */
    private final int f26064g;

    /* renamed from: h, reason: collision with root package name */
    private final int f26065h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f26066i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f26067j;

    /* renamed from: k, reason: collision with root package name */
    private int f26068k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f26069l;

    /* renamed from: m, reason: collision with root package name */
    private int f26070m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f26071n;

    /* renamed from: o, reason: collision with root package name */
    private int f26072o;

    /* renamed from: p, reason: collision with root package name */
    private int f26073p;

    /* renamed from: q, reason: collision with root package name */
    private int f26074q;

    /* renamed from: r, reason: collision with root package name */
    private int f26075r;

    /* renamed from: s, reason: collision with root package name */
    private int f26076s;

    /* renamed from: t, reason: collision with root package name */
    private int f26077t;

    /* renamed from: u, reason: collision with root package name */
    private int f26078u;

    /* renamed from: v, reason: collision with root package name */
    private int f26079v;

    /* renamed from: w, reason: collision with root package name */
    private double f26080w;

    public c(int i10, int i11, float f10, float f11, int i12) {
        this.f26058a = i10;
        this.f26059b = i11;
        this.f26060c = f10;
        this.f26061d = f11;
        this.f26062e = i10 / i12;
        this.f26063f = i10 / 400;
        int i13 = i10 / 65;
        this.f26064g = i13;
        int i14 = i13 * 2;
        this.f26065h = i14;
        this.f26066i = new short[i14];
        this.f26067j = new short[i14 * i11];
        this.f26069l = new short[i14 * i11];
        this.f26071n = new short[i14 * i11];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f26070m == i10) {
            return;
        }
        int i13 = this.f26058a;
        long j10 = (long) (i13 / f10);
        long j11 = i13;
        while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
            j10 /= 2;
            j11 /= 2;
        }
        o(i10);
        int i14 = 0;
        while (true) {
            int i15 = this.f26072o;
            if (i14 >= i15 - 1) {
                u(i15 - 1);
                return;
            }
            while (true) {
                i11 = this.f26073p;
                long j12 = (i11 + 1) * j10;
                i12 = this.f26074q;
                if (j12 <= i12 * j11) {
                    break;
                }
                this.f26069l = f(this.f26069l, this.f26070m, 1);
                int i16 = 0;
                while (true) {
                    int i17 = this.f26059b;
                    if (i16 < i17) {
                        this.f26069l[(this.f26070m * i17) + i16] = n(this.f26071n, (i17 * i14) + i16, j11, j10);
                        i16++;
                    }
                }
                this.f26074q++;
                this.f26070m++;
            }
            int i18 = i11 + 1;
            this.f26073p = i18;
            if (i18 == j11) {
                this.f26073p = 0;
                C1804a.g(((long) i12) == j10);
                this.f26074q = 0;
            }
            i14++;
        }
    }

    private void b(double d10) {
        int iM;
        int i10 = this.f26068k;
        if (i10 < this.f26065h) {
            return;
        }
        int iW = 0;
        do {
            if (this.f26075r > 0) {
                iM = c(iW);
            } else {
                int iG = g(this.f26067j, iW);
                if (d10 > 1.0d) {
                    iW += iG + w(this.f26067j, iW, d10, iG);
                } else {
                    iM = m(this.f26067j, iW, d10, iG);
                }
            }
            iW += iM;
        } while (this.f26065h + iW <= i10);
        v(iW);
    }

    private int c(int i10) {
        int iMin = Math.min(this.f26065h, this.f26075r);
        d(this.f26067j, i10, iMin);
        this.f26075r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f26069l, this.f26070m, i11);
        this.f26069l = sArrF;
        int i12 = this.f26059b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f26070m * i12, i12 * i11);
        this.f26070m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f26065h / i11;
        int i13 = this.f26059b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f26066i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f26059b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f26058a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f26059b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f26063f, this.f26064g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f26066i, 0, this.f26063f / i12, this.f26064g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f26063f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f26064g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f26059b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f26066i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = q(this.f26078u, this.f26079v) ? this.f26076s : iH;
        this.f26077t = this.f26078u;
        this.f26076s = iH;
        return i19;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f26059b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f26078u = i15 / i16;
        this.f26079v = i17 / i14;
        return i16;
    }

    private int m(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 < 0.5d) {
            double d11 = ((i11 * d10) / (1.0d - d10)) + this.f26080w;
            int iRound = (int) Math.round(d11);
            this.f26080w = d11 - iRound;
            i12 = iRound;
        } else {
            double d12 = ((i11 * ((2.0d * d10) - 1.0d)) / (1.0d - d10)) + this.f26080w;
            int iRound2 = (int) Math.round(d12);
            this.f26075r = iRound2;
            this.f26080w = d12 - iRound2;
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f26069l, this.f26070m, i13);
        this.f26069l = sArrF;
        int i14 = this.f26059b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f26070m * i14, i14 * i11);
        p(i12, this.f26059b, this.f26069l, this.f26070m + i11, sArr, i10 + i11, sArr, i10);
        this.f26070m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, long j10, long j11) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f26059b];
        long j12 = this.f26074q * j10;
        long j13 = this.f26073p * j11;
        long j14 = (r7 + 1) * j11;
        long j15 = j14 - j12;
        long j16 = j14 - j13;
        return (short) (((s10 * j15) + ((j16 - j15) * s11)) / j16);
    }

    private void o(int i10) {
        int i11 = this.f26070m - i10;
        short[] sArrF = f(this.f26071n, this.f26072o, i11);
        this.f26071n = sArrF;
        short[] sArr = this.f26069l;
        int i12 = this.f26059b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f26072o * i12, i12 * i11);
        this.f26070m = i10;
        this.f26072o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f26076s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f26077t * 3;
    }

    private void r() {
        int i10 = this.f26070m;
        float f10 = this.f26060c;
        float f11 = this.f26061d;
        double d10 = f10 / f11;
        float f12 = this.f26062e * f11;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(d10);
        } else {
            d(this.f26067j, 0, this.f26068k);
            this.f26068k = 0;
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f26071n;
        int i11 = this.f26059b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f26072o - i10) * i11);
        this.f26072o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f26068k - i10;
        short[] sArr = this.f26067j;
        int i12 = this.f26059b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f26068k = i11;
    }

    private int w(short[] sArr, int i10, double d10, int i11) {
        int iRound;
        if (d10 >= 2.0d) {
            double d11 = (i11 / (d10 - 1.0d)) + this.f26080w;
            iRound = (int) Math.round(d11);
            this.f26080w = d11 - iRound;
        } else {
            double d12 = ((i11 * (2.0d - d10)) / (d10 - 1.0d)) + this.f26080w;
            int iRound2 = (int) Math.round(d12);
            this.f26075r = iRound2;
            this.f26080w = d12 - iRound2;
            iRound = i11;
        }
        short[] sArrF = f(this.f26069l, this.f26070m, iRound);
        this.f26069l = sArrF;
        p(iRound, this.f26059b, sArrF, this.f26070m, sArr, i10, sArr, i10 + i11);
        this.f26070m += iRound;
        return iRound;
    }

    public void i() {
        this.f26068k = 0;
        this.f26070m = 0;
        this.f26072o = 0;
        this.f26073p = 0;
        this.f26074q = 0;
        this.f26075r = 0;
        this.f26076s = 0;
        this.f26077t = 0;
        this.f26078u = 0;
        this.f26079v = 0;
        this.f26080w = 0.0d;
    }

    public void j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f26059b, this.f26070m);
        shortBuffer.put(this.f26069l, 0, this.f26059b * iMin);
        int i10 = this.f26070m - iMin;
        this.f26070m = i10;
        short[] sArr = this.f26069l;
        int i11 = this.f26059b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f26070m * this.f26059b * 2;
    }

    public int l() {
        return this.f26068k * this.f26059b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f26068k;
        float f10 = this.f26060c;
        float f11 = this.f26061d;
        double d10 = f10 / f11;
        int i12 = this.f26070m + ((int) (((((((i11 - r5) / d10) + this.f26075r) + this.f26080w) + this.f26072o) / (this.f26062e * f11)) + 0.5d));
        this.f26080w = 0.0d;
        this.f26067j = f(this.f26067j, i11, (this.f26065h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f26065h;
            int i14 = this.f26059b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f26067j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f26068k += i10 * 2;
        r();
        if (this.f26070m > i12) {
            this.f26070m = i12;
        }
        this.f26068k = 0;
        this.f26075r = 0;
        this.f26072o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f26059b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f26067j, this.f26068k, i11);
        this.f26067j = sArrF;
        shortBuffer.get(sArrF, this.f26068k * this.f26059b, ((i10 * i11) * 2) / 2);
        this.f26068k += i11;
        r();
    }
}
