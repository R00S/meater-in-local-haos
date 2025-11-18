package com.google.zxing.common.reedsolomon;

/* compiled from: GenericGFPoly.java */
/* renamed from: com.google.zxing.common.reedsolomon.b */
/* loaded from: classes2.dex */
final class C8624b {

    /* renamed from: a */
    private final C8623a f32765a;

    /* renamed from: b */
    private final int[] f32766b;

    C8624b(C8623a c8623a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f32765a = c8623a;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f32766b = iArr;
            return;
        }
        int i2 = 1;
        while (i2 < length && iArr[i2] == 0) {
            i2++;
        }
        if (i2 == length) {
            this.f32766b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i2];
        this.f32766b = iArr2;
        System.arraycopy(iArr, i2, iArr2, 0, iArr2.length);
    }

    /* renamed from: a */
    C8624b m27233a(C8624b c8624b) {
        if (!this.f32765a.equals(c8624b.f32765a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m27238f()) {
            return c8624b;
        }
        if (c8624b.m27238f()) {
            return this;
        }
        int[] iArr = this.f32766b;
        int[] iArr2 = c8624b.f32766b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i2 = length; i2 < iArr.length; i2++) {
            iArr3[i2] = C8623a.m27225a(iArr2[i2 - length], iArr[i2]);
        }
        return new C8624b(this.f32765a, iArr3);
    }

    /* renamed from: b */
    C8624b[] m27234b(C8624b c8624b) {
        if (!this.f32765a.equals(c8624b.f32765a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c8624b.m27238f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        C8624b c8624bM27229e = this.f32765a.m27229e();
        int iM27230f = this.f32765a.m27230f(c8624b.m27235c(c8624b.m27237e()));
        C8624b c8624bM27233a = this;
        while (c8624bM27233a.m27237e() >= c8624b.m27237e() && !c8624bM27233a.m27238f()) {
            int iM27237e = c8624bM27233a.m27237e() - c8624b.m27237e();
            int iM27232h = this.f32765a.m27232h(c8624bM27233a.m27235c(c8624bM27233a.m27237e()), iM27230f);
            C8624b c8624bM27240h = c8624b.m27240h(iM27237e, iM27232h);
            c8624bM27229e = c8624bM27229e.m27233a(this.f32765a.m27226b(iM27237e, iM27232h));
            c8624bM27233a = c8624bM27233a.m27233a(c8624bM27240h);
        }
        return new C8624b[]{c8624bM27229e, c8624bM27233a};
    }

    /* renamed from: c */
    int m27235c(int i2) {
        return this.f32766b[(r0.length - 1) - i2];
    }

    /* renamed from: d */
    int[] m27236d() {
        return this.f32766b;
    }

    /* renamed from: e */
    int m27237e() {
        return this.f32766b.length - 1;
    }

    /* renamed from: f */
    boolean m27238f() {
        return this.f32766b[0] == 0;
    }

    /* renamed from: g */
    C8624b m27239g(C8624b c8624b) {
        if (!this.f32765a.equals(c8624b.f32765a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m27238f() || c8624b.m27238f()) {
            return this.f32765a.m27229e();
        }
        int[] iArr = this.f32766b;
        int length = iArr.length;
        int[] iArr2 = c8624b.f32766b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            for (int i4 = 0; i4 < length2; i4++) {
                int i5 = i2 + i4;
                iArr3[i5] = C8623a.m27225a(iArr3[i5], this.f32765a.m27232h(i3, iArr2[i4]));
            }
        }
        return new C8624b(this.f32765a, iArr3);
    }

    /* renamed from: h */
    C8624b m27240h(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 == 0) {
            return this.f32765a.m27229e();
        }
        int length = this.f32766b.length;
        int[] iArr = new int[i2 + length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = this.f32765a.m27232h(this.f32766b[i4], i3);
        }
        return new C8624b(this.f32765a, iArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m27237e() * 8);
        for (int iM27237e = m27237e(); iM27237e >= 0; iM27237e--) {
            int iM27235c = m27235c(iM27237e);
            if (iM27235c != 0) {
                if (iM27235c < 0) {
                    sb.append(" - ");
                    iM27235c = -iM27235c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM27237e == 0 || iM27235c != 1) {
                    int iM27231g = this.f32765a.m27231g(iM27235c);
                    if (iM27231g == 0) {
                        sb.append('1');
                    } else if (iM27231g == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(iM27231g);
                    }
                }
                if (iM27237e != 0) {
                    if (iM27237e == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM27237e);
                    }
                }
            }
        }
        return sb.toString();
    }
}
