package com.google.zxing.p222g;

import java.util.Arrays;

/* compiled from: BitMatrix.java */
/* renamed from: com.google.zxing.g.b */
/* loaded from: classes2.dex */
public final class C8637b implements Cloneable {

    /* renamed from: f */
    private final int f32795f;

    /* renamed from: g */
    private final int f32796g;

    /* renamed from: h */
    private final int f32797h;

    /* renamed from: i */
    private final int[] f32798i;

    public C8637b(int i2) {
        this(i2, i2);
    }

    /* renamed from: b */
    private String m27292b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f32796g * (this.f32795f + 1));
        for (int i2 = 0; i2 < this.f32796g; i2++) {
            for (int i3 = 0; i3 < this.f32795f; i3++) {
                sb.append(m27295f(i3, i2) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: d */
    public void m27293d() {
        int length = this.f32798i.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f32798i[i2] = 0;
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C8637b clone() {
        return new C8637b(this.f32795f, this.f32796g, this.f32797h, (int[]) this.f32798i.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8637b)) {
            return false;
        }
        C8637b c8637b = (C8637b) obj;
        return this.f32795f == c8637b.f32795f && this.f32796g == c8637b.f32796g && this.f32797h == c8637b.f32797h && Arrays.equals(this.f32798i, c8637b.f32798i);
    }

    /* renamed from: f */
    public boolean m27295f(int i2, int i3) {
        return ((this.f32798i[(i3 * this.f32797h) + (i2 / 32)] >>> (i2 & 31)) & 1) != 0;
    }

    /* renamed from: g */
    public int m27296g() {
        return this.f32796g;
    }

    /* renamed from: h */
    public int m27297h() {
        return this.f32795f;
    }

    public int hashCode() {
        int i2 = this.f32795f;
        return (((((((i2 * 31) + i2) * 31) + this.f32796g) * 31) + this.f32797h) * 31) + Arrays.hashCode(this.f32798i);
    }

    /* renamed from: i */
    public void m27298i(int i2, int i3) {
        int i4 = (i3 * this.f32797h) + (i2 / 32);
        int[] iArr = this.f32798i;
        iArr[i4] = (1 << (i2 & 31)) | iArr[i4];
    }

    /* renamed from: j */
    public void m27299j(int i2, int i3, int i4, int i5) {
        if (i3 < 0 || i2 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i5 <= 0 || i4 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i6 = i4 + i2;
        int i7 = i5 + i3;
        if (i7 > this.f32796g || i6 > this.f32795f) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i3 < i7) {
            int i8 = this.f32797h * i3;
            for (int i9 = i2; i9 < i6; i9++) {
                int[] iArr = this.f32798i;
                int i10 = (i9 / 32) + i8;
                iArr[i10] = iArr[i10] | (1 << (i9 & 31));
            }
            i3++;
        }
    }

    /* renamed from: k */
    public String m27300k(String str, String str2) {
        return m27292b(str, str2, "\n");
    }

    public String toString() {
        return m27300k("X ", "  ");
    }

    public C8637b(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f32795f = i2;
        this.f32796g = i3;
        int i4 = (i2 + 31) / 32;
        this.f32797h = i4;
        this.f32798i = new int[i4 * i3];
    }

    private C8637b(int i2, int i3, int i4, int[] iArr) {
        this.f32795f = i2;
        this.f32796g = i3;
        this.f32797h = i4;
        this.f32798i = iArr;
    }
}
