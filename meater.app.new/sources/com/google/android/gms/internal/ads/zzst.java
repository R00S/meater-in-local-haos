package com.google.android.gms.internal.ads;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzst {

    /* renamed from: a */
    public byte[] f27013a;

    /* renamed from: b */
    private int f27014b;

    /* renamed from: c */
    private int f27015c;

    public zzst() {
    }

    /* renamed from: a */
    public final int m20500a() {
        byte[] bArr = this.f27013a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: b */
    public final int m20501b() {
        return this.f27014b;
    }

    /* renamed from: c */
    public final int m20502c() {
        return this.f27015c;
    }

    /* renamed from: d */
    public final int m20503d() {
        byte[] bArr = this.f27013a;
        int i2 = this.f27014b;
        int i3 = i2 + 1;
        this.f27014b = i3;
        int i4 = (bArr[i2] & 255) << 24;
        int i5 = i3 + 1;
        this.f27014b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        int i7 = i5 + 1;
        this.f27014b = i7;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        this.f27014b = i7 + 1;
        return (bArr[i7] & 255) | i8;
    }

    /* renamed from: e */
    public final long m20504e() {
        byte[] bArr = this.f27013a;
        int i2 = this.f27014b + 1;
        this.f27014b = i2;
        long j2 = (bArr[r1] & 255) << 56;
        int i3 = i2 + 1;
        this.f27014b = i3;
        long j3 = j2 | ((bArr[i2] & 255) << 48);
        int i4 = i3 + 1;
        this.f27014b = i4;
        long j4 = j3 | ((bArr[i3] & 255) << 40);
        int i5 = i4 + 1;
        this.f27014b = i5;
        long j5 = j4 | ((bArr[i4] & 255) << 32);
        int i6 = i5 + 1;
        this.f27014b = i6;
        long j6 = j5 | ((bArr[i5] & 255) << 24);
        int i7 = i6 + 1;
        this.f27014b = i7;
        long j7 = j6 | ((bArr[i6] & 255) << 16);
        int i8 = i7 + 1;
        this.f27014b = i8;
        long j8 = j7 | ((bArr[i7] & 255) << 8);
        this.f27014b = i8 + 1;
        return (bArr[i8] & 255) | j8;
    }

    /* renamed from: f */
    public final short m20505f() {
        byte[] bArr = this.f27013a;
        int i2 = this.f27014b;
        int i3 = i2 + 1;
        this.f27014b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.f27014b = i3 + 1;
        return (short) ((bArr[i3] & 255) | i4);
    }

    /* renamed from: g */
    public final int m20506g() {
        byte[] bArr = this.f27013a;
        int i2 = this.f27014b;
        this.f27014b = i2 + 1;
        return bArr[i2] & 255;
    }

    /* renamed from: h */
    public final int m20507h() {
        byte[] bArr = this.f27013a;
        int i2 = this.f27014b;
        int i3 = i2 + 1;
        this.f27014b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.f27014b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    /* renamed from: i */
    public final void m20508i() {
        this.f27014b = 0;
        this.f27015c = 0;
    }

    /* renamed from: j */
    public final void m20509j(int i2) {
        m20512m(m20500a() < i2 ? new byte[i2] : this.f27013a, i2);
    }

    /* renamed from: k */
    public final void m20510k(int i2) {
        zzsk.m20477a(i2 >= 0 && i2 <= this.f27015c);
        this.f27014b = i2;
    }

    /* renamed from: l */
    public final void m20511l(int i2) {
        m20510k(this.f27014b + i2);
    }

    /* renamed from: m */
    public final void m20512m(byte[] bArr, int i2) {
        this.f27013a = bArr;
        this.f27015c = i2;
        this.f27014b = 0;
    }

    /* renamed from: n */
    public final void m20513n(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f27013a, this.f27014b, bArr, i2, i3);
        this.f27014b += i3;
    }

    /* renamed from: o */
    public final void m20514o(int i2) {
        zzsk.m20477a(i2 >= 0 && i2 <= this.f27013a.length);
        this.f27015c = i2;
    }

    /* renamed from: p */
    public final String m20515p(int i2) {
        if (i2 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i3 = (this.f27014b + i2) - 1;
        String str = new String(this.f27013a, this.f27014b, (i3 >= this.f27015c || this.f27013a[i3] != 0) ? i2 : i2 - 1);
        this.f27014b += i2;
        return str;
    }

    /* renamed from: q */
    public final long m20516q() {
        byte[] bArr = this.f27013a;
        int i2 = this.f27014b + 1;
        this.f27014b = i2;
        long j2 = (bArr[r1] & 255) << 24;
        int i3 = i2 + 1;
        this.f27014b = i3;
        long j3 = j2 | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        this.f27014b = i4;
        long j4 = j3 | ((bArr[i3] & 255) << 8);
        this.f27014b = i4 + 1;
        return (bArr[i4] & 255) | j4;
    }

    /* renamed from: r */
    public final int m20517r() {
        byte[] bArr = this.f27013a;
        int i2 = this.f27014b;
        int i3 = i2 + 1;
        this.f27014b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        int i5 = i3 + 1;
        this.f27014b = i5;
        int i6 = (bArr[i3] & 255) | i4;
        this.f27014b = i5 + 2;
        return i6;
    }

    /* renamed from: s */
    public final int m20518s() {
        int iM20503d = m20503d();
        if (iM20503d >= 0) {
            return iM20503d;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iM20503d);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: t */
    public final long m20519t() {
        long jM20504e = m20504e();
        if (jM20504e >= 0) {
            return jM20504e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jM20504e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: u */
    public final int m20520u() {
        return this.f27015c - this.f27014b;
    }

    /* renamed from: v */
    public final int m20521v() {
        byte[] bArr = this.f27013a;
        int i2 = this.f27014b;
        int i3 = i2 + 1;
        this.f27014b = i3;
        int i4 = bArr[i2] & 255;
        this.f27014b = i3 + 1;
        return ((bArr[i3] & 255) << 8) | i4;
    }

    /* renamed from: w */
    public final long m20522w() {
        byte[] bArr = this.f27013a;
        int i2 = this.f27014b + 1;
        this.f27014b = i2;
        long j2 = bArr[r1] & 255;
        int i3 = i2 + 1;
        this.f27014b = i3;
        long j3 = j2 | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f27014b = i4;
        long j4 = j3 | ((bArr[i3] & 255) << 16);
        this.f27014b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | j4;
    }

    public zzst(int i2) {
        this.f27013a = new byte[i2];
        this.f27015c = i2;
    }

    public zzst(byte[] bArr) {
        this.f27013a = bArr;
        this.f27015c = bArr.length;
    }
}
