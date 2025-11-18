package com.google.zxing.p222g;

import java.util.Arrays;

/* compiled from: BitArray.java */
/* renamed from: com.google.zxing.g.a */
/* loaded from: classes2.dex */
public final class C8636a implements Cloneable {

    /* renamed from: f */
    private int[] f32793f;

    /* renamed from: g */
    private int f32794g;

    public C8636a() {
        this.f32794g = 0;
        this.f32793f = new int[1];
    }

    /* renamed from: g */
    private void m27281g(int i2) {
        if (i2 > (this.f32793f.length << 5)) {
            int[] iArrM27282k = m27282k(i2);
            int[] iArr = this.f32793f;
            System.arraycopy(iArr, 0, iArrM27282k, 0, iArr.length);
            this.f32793f = iArrM27282k;
        }
    }

    /* renamed from: k */
    private static int[] m27282k(int i2) {
        return new int[(i2 + 31) / 32];
    }

    /* renamed from: b */
    public void m27283b(boolean z) {
        m27281g(this.f32794g + 1);
        if (z) {
            int[] iArr = this.f32793f;
            int i2 = this.f32794g;
            int i3 = i2 / 32;
            iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
        }
        this.f32794g++;
    }

    /* renamed from: d */
    public void m27284d(C8636a c8636a) {
        int i2 = c8636a.f32794g;
        m27281g(this.f32794g + i2);
        for (int i3 = 0; i3 < i2; i3++) {
            m27283b(c8636a.m27287h(i3));
        }
    }

    /* renamed from: e */
    public void m27285e(int i2, int i3) {
        if (i3 < 0 || i3 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m27281g(this.f32794g + i3);
        while (i3 > 0) {
            boolean z = true;
            if (((i2 >> (i3 - 1)) & 1) != 1) {
                z = false;
            }
            m27283b(z);
            i3--;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8636a)) {
            return false;
        }
        C8636a c8636a = (C8636a) obj;
        return this.f32794g == c8636a.f32794g && Arrays.equals(this.f32793f, c8636a.f32793f);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C8636a clone() {
        return new C8636a((int[]) this.f32793f.clone(), this.f32794g);
    }

    /* renamed from: h */
    public boolean m27287h(int i2) {
        return ((1 << (i2 & 31)) & this.f32793f[i2 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f32794g * 31) + Arrays.hashCode(this.f32793f);
    }

    /* renamed from: i */
    public int m27288i() {
        return this.f32794g;
    }

    /* renamed from: j */
    public int m27289j() {
        return (this.f32794g + 7) / 8;
    }

    /* renamed from: l */
    public void m27290l(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < 8; i7++) {
                if (m27287h(i2)) {
                    i6 |= 1 << (7 - i7);
                }
                i2++;
            }
            bArr[i3 + i5] = (byte) i6;
        }
    }

    /* renamed from: m */
    public void m27291m(C8636a c8636a) {
        if (this.f32794g != c8636a.f32794g) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f32793f;
            if (i2 >= iArr.length) {
                return;
            }
            iArr[i2] = iArr[i2] ^ c8636a.f32793f[i2];
            i2++;
        }
    }

    public String toString() {
        int i2 = this.f32794g;
        StringBuilder sb = new StringBuilder(i2 + (i2 / 8) + 1);
        for (int i3 = 0; i3 < this.f32794g; i3++) {
            if ((i3 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(m27287h(i3) ? 'X' : '.');
        }
        return sb.toString();
    }

    C8636a(int[] iArr, int i2) {
        this.f32793f = iArr;
        this.f32794g = i2;
    }
}
