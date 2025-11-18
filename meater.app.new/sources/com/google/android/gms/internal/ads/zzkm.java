package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzkm {

    /* renamed from: a */
    public byte[] f26424a;

    /* renamed from: b */
    private int f26425b;

    /* renamed from: c */
    private int f26426c;

    public zzkm() {
    }

    /* renamed from: a */
    public final int m20139a() {
        return this.f26425b;
    }

    /* renamed from: b */
    public final int m20140b() {
        return this.f26426c;
    }

    /* renamed from: c */
    public final int m20141c() {
        byte[] bArr = this.f26424a;
        int i2 = this.f26425b;
        int i3 = i2 + 1;
        this.f26425b = i3;
        int i4 = (bArr[i2] & 255) << 24;
        int i5 = i3 + 1;
        this.f26425b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        int i7 = i5 + 1;
        this.f26425b = i7;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        this.f26425b = i7 + 1;
        return (bArr[i7] & 255) | i8;
    }

    /* renamed from: d */
    public final long m20142d() {
        byte[] bArr = this.f26424a;
        int i2 = this.f26425b + 1;
        this.f26425b = i2;
        long j2 = (bArr[r1] & 255) << 56;
        int i3 = i2 + 1;
        this.f26425b = i3;
        long j3 = j2 | ((bArr[i2] & 255) << 48);
        int i4 = i3 + 1;
        this.f26425b = i4;
        long j4 = j3 | ((bArr[i3] & 255) << 40);
        int i5 = i4 + 1;
        this.f26425b = i5;
        long j5 = j4 | ((bArr[i4] & 255) << 32);
        int i6 = i5 + 1;
        this.f26425b = i6;
        long j6 = j5 | ((bArr[i5] & 255) << 24);
        int i7 = i6 + 1;
        this.f26425b = i7;
        long j7 = j6 | ((bArr[i6] & 255) << 16);
        int i8 = i7 + 1;
        this.f26425b = i8;
        long j8 = j7 | ((bArr[i7] & 255) << 8);
        this.f26425b = i8 + 1;
        return (bArr[i8] & 255) | j8;
    }

    /* renamed from: e */
    public final int m20143e() {
        byte[] bArr = this.f26424a;
        int i2 = this.f26425b;
        this.f26425b = i2 + 1;
        return bArr[i2] & 255;
    }

    /* renamed from: f */
    public final int m20144f() {
        byte[] bArr = this.f26424a;
        int i2 = this.f26425b;
        int i3 = i2 + 1;
        this.f26425b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.f26425b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    /* renamed from: g */
    public final void m20145g(int i2) {
        zzkh.m20126a(i2 >= 0 && i2 <= this.f26426c);
        this.f26425b = i2;
    }

    /* renamed from: h */
    public final void m20146h(int i2) {
        m20145g(this.f26425b + i2);
    }

    /* renamed from: i */
    public final void m20147i(byte[] bArr, int i2) {
        this.f26424a = bArr;
        this.f26426c = i2;
        this.f26425b = 0;
    }

    /* renamed from: j */
    public final void m20148j(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f26424a, this.f26425b, bArr, i2, i3);
        this.f26425b += i3;
    }

    /* renamed from: k */
    public final long m20149k() {
        byte[] bArr = this.f26424a;
        int i2 = this.f26425b + 1;
        this.f26425b = i2;
        long j2 = (bArr[r1] & 255) << 24;
        int i3 = i2 + 1;
        this.f26425b = i3;
        long j3 = j2 | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        this.f26425b = i4;
        long j4 = j3 | ((bArr[i3] & 255) << 8);
        this.f26425b = i4 + 1;
        return (bArr[i4] & 255) | j4;
    }

    /* renamed from: l */
    public final int m20150l() {
        byte[] bArr = this.f26424a;
        int i2 = this.f26425b;
        int i3 = i2 + 1;
        this.f26425b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        int i5 = i3 + 1;
        this.f26425b = i5;
        int i6 = (bArr[i3] & 255) | i4;
        this.f26425b = i5 + 2;
        return i6;
    }

    /* renamed from: m */
    public final int m20151m() {
        int iM20141c = m20141c();
        if (iM20141c >= 0) {
            return iM20141c;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iM20141c);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: n */
    public final long m20152n() {
        long jM20142d = m20142d();
        if (jM20142d >= 0) {
            return jM20142d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jM20142d);
        throw new IllegalStateException(sb.toString());
    }

    public zzkm(int i2) {
        byte[] bArr = new byte[i2];
        this.f26424a = bArr;
        this.f26426c = bArr.length;
    }

    public zzkm(byte[] bArr) {
        this.f26424a = bArr;
        this.f26426c = bArr.length;
    }
}
