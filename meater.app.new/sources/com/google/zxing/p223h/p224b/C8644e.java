package com.google.zxing.p223h.p224b;

import java.util.Arrays;

/* compiled from: DefaultPlacement.java */
/* renamed from: com.google.zxing.h.b.e */
/* loaded from: classes2.dex */
public class C8644e {

    /* renamed from: a */
    private final CharSequence f32831a;

    /* renamed from: b */
    private final int f32832b;

    /* renamed from: c */
    private final int f32833c;

    /* renamed from: d */
    private final byte[] f32834d;

    public C8644e(CharSequence charSequence, int i2, int i3) {
        this.f32831a = charSequence;
        this.f32833c = i2;
        this.f32832b = i3;
        byte[] bArr = new byte[i2 * i3];
        this.f32834d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    private void m27318a(int i2) {
        m27323g(this.f32832b - 1, 0, i2, 1);
        m27323g(this.f32832b - 1, 1, i2, 2);
        m27323g(this.f32832b - 1, 2, i2, 3);
        m27323g(0, this.f32833c - 2, i2, 4);
        m27323g(0, this.f32833c - 1, i2, 5);
        m27323g(1, this.f32833c - 1, i2, 6);
        m27323g(2, this.f32833c - 1, i2, 7);
        m27323g(3, this.f32833c - 1, i2, 8);
    }

    /* renamed from: b */
    private void m27319b(int i2) {
        m27323g(this.f32832b - 3, 0, i2, 1);
        m27323g(this.f32832b - 2, 0, i2, 2);
        m27323g(this.f32832b - 1, 0, i2, 3);
        m27323g(0, this.f32833c - 4, i2, 4);
        m27323g(0, this.f32833c - 3, i2, 5);
        m27323g(0, this.f32833c - 2, i2, 6);
        m27323g(0, this.f32833c - 1, i2, 7);
        m27323g(1, this.f32833c - 1, i2, 8);
    }

    /* renamed from: c */
    private void m27320c(int i2) {
        m27323g(this.f32832b - 3, 0, i2, 1);
        m27323g(this.f32832b - 2, 0, i2, 2);
        m27323g(this.f32832b - 1, 0, i2, 3);
        m27323g(0, this.f32833c - 2, i2, 4);
        m27323g(0, this.f32833c - 1, i2, 5);
        m27323g(1, this.f32833c - 1, i2, 6);
        m27323g(2, this.f32833c - 1, i2, 7);
        m27323g(3, this.f32833c - 1, i2, 8);
    }

    /* renamed from: d */
    private void m27321d(int i2) {
        m27323g(this.f32832b - 1, 0, i2, 1);
        m27323g(this.f32832b - 1, this.f32833c - 1, i2, 2);
        m27323g(0, this.f32833c - 3, i2, 3);
        m27323g(0, this.f32833c - 2, i2, 4);
        m27323g(0, this.f32833c - 1, i2, 5);
        m27323g(1, this.f32833c - 3, i2, 6);
        m27323g(1, this.f32833c - 2, i2, 7);
        m27323g(1, this.f32833c - 1, i2, 8);
    }

    /* renamed from: f */
    private boolean m27322f(int i2, int i3) {
        return this.f32834d[(i3 * this.f32833c) + i2] >= 0;
    }

    /* renamed from: g */
    private void m27323g(int i2, int i3, int i4, int i5) {
        if (i2 < 0) {
            int i6 = this.f32832b;
            i2 += i6;
            i3 += 4 - ((i6 + 4) % 8);
        }
        if (i3 < 0) {
            int i7 = this.f32833c;
            i3 += i7;
            i2 += 4 - ((i7 + 4) % 8);
        }
        m27324i(i3, i2, (this.f32831a.charAt(i4) & (1 << (8 - i5))) != 0);
    }

    /* renamed from: i */
    private void m27324i(int i2, int i3, boolean z) {
        this.f32834d[(i3 * this.f32833c) + i2] = z ? (byte) 1 : (byte) 0;
    }

    /* renamed from: j */
    private void m27325j(int i2, int i3, int i4) {
        int i5 = i2 - 2;
        int i6 = i3 - 2;
        m27323g(i5, i6, i4, 1);
        int i7 = i3 - 1;
        m27323g(i5, i7, i4, 2);
        int i8 = i2 - 1;
        m27323g(i8, i6, i4, 3);
        m27323g(i8, i7, i4, 4);
        m27323g(i8, i3, i4, 5);
        m27323g(i2, i6, i4, 6);
        m27323g(i2, i7, i4, 7);
        m27323g(i2, i3, i4, 8);
    }

    /* renamed from: e */
    public final boolean m27326e(int i2, int i3) {
        return this.f32834d[(i3 * this.f32833c) + i2] == 1;
    }

    /* renamed from: h */
    public final void m27327h() {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 4;
        while (true) {
            if (i6 == this.f32832b && i4 == 0) {
                m27318a(i5);
                i5++;
            }
            if (i6 == this.f32832b - 2 && i4 == 0 && this.f32833c % 4 != 0) {
                m27319b(i5);
                i5++;
            }
            if (i6 == this.f32832b - 2 && i4 == 0 && this.f32833c % 8 == 4) {
                m27320c(i5);
                i5++;
            }
            if (i6 == this.f32832b + 4 && i4 == 2 && this.f32833c % 8 == 0) {
                m27321d(i5);
                i5++;
            }
            do {
                if (i6 < this.f32832b && i4 >= 0 && !m27322f(i4, i6)) {
                    m27325j(i6, i4, i5);
                    i5++;
                }
                i6 -= 2;
                i4 += 2;
                if (i6 < 0) {
                    break;
                }
            } while (i4 < this.f32833c);
            int i7 = i6 + 1;
            int i8 = i4 + 3;
            do {
                if (i7 >= 0 && i8 < this.f32833c && !m27322f(i8, i7)) {
                    m27325j(i7, i8, i5);
                    i5++;
                }
                i7 += 2;
                i8 -= 2;
                i2 = this.f32832b;
                if (i7 >= i2) {
                    break;
                }
            } while (i8 >= 0);
            i6 = i7 + 3;
            i4 = i8 + 1;
            if (i6 >= i2 && i4 >= (i3 = this.f32833c)) {
                break;
            }
        }
        if (m27322f(i3 - 1, i2 - 1)) {
            return;
        }
        m27324i(this.f32833c - 1, this.f32832b - 1, true);
        m27324i(this.f32833c - 2, this.f32832b - 2, true);
    }
}
