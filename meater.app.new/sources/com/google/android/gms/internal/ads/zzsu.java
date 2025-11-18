package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzsu {

    /* renamed from: a */
    private byte[] f27016a;

    /* renamed from: b */
    private int f27017b;

    /* renamed from: c */
    private int f27018c;

    /* renamed from: d */
    private int f27019d = 0;

    public zzsu(byte[] bArr, int i2, int i3) {
        this.f27016a = bArr;
        this.f27018c = i2;
        this.f27017b = i3;
        m20525h();
    }

    /* renamed from: c */
    private final boolean m20523c(int i2) {
        if (2 > i2 || i2 >= this.f27017b) {
            return false;
        }
        byte[] bArr = this.f27016a;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 - 1] == 0;
    }

    /* renamed from: g */
    private final int m20524g() {
        int i2 = 0;
        while (!m20528d()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? m20526a(i2) : 0);
    }

    /* renamed from: h */
    private final void m20525h() {
        int i2;
        int i3;
        int i4 = this.f27018c;
        zzsk.m20481e(i4 >= 0 && (i2 = this.f27019d) >= 0 && i2 < 8 && (i4 < (i3 = this.f27017b) || (i4 == i3 && i2 == 0)));
    }

    /* renamed from: a */
    public final int m20526a(int i2) {
        int i3;
        int i4;
        if (i2 == 0) {
            return 0;
        }
        int i5 = i2 / 8;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = m20523c(this.f27018c + 1) ? this.f27018c + 2 : this.f27018c + 1;
            int i9 = this.f27019d;
            if (i9 != 0) {
                byte[] bArr = this.f27016a;
                i4 = ((bArr[i8] & 255) >>> (8 - i9)) | ((bArr[this.f27018c] & 255) << i9);
            } else {
                i4 = this.f27016a[this.f27018c];
            }
            i2 -= 8;
            i6 |= (255 & i4) << i2;
            this.f27018c = i8;
        }
        if (i2 > 0) {
            int i10 = this.f27019d + i2;
            byte b2 = (byte) (255 >> (8 - i2));
            int i11 = m20523c(this.f27018c + 1) ? this.f27018c + 2 : this.f27018c + 1;
            if (i10 > 8) {
                byte[] bArr2 = this.f27016a;
                i3 = (b2 & (((255 & bArr2[i11]) >> (16 - i10)) | ((bArr2[this.f27018c] & 255) << (i10 - 8)))) | i6;
                this.f27018c = i11;
            } else {
                i3 = (b2 & ((255 & this.f27016a[this.f27018c]) >> (8 - i10))) | i6;
                if (i10 == 8) {
                    this.f27018c = i11;
                }
            }
            i6 = i3;
            this.f27019d = i10 % 8;
        }
        m20525h();
        return i6;
    }

    /* renamed from: b */
    public final void m20527b(int i2) {
        int i3 = this.f27018c;
        int i4 = (i2 / 8) + i3;
        this.f27018c = i4;
        int i5 = this.f27019d + (i2 % 8);
        this.f27019d = i5;
        if (i5 > 7) {
            this.f27018c = i4 + 1;
            this.f27019d = i5 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.f27018c) {
                m20525h();
                return;
            } else if (m20523c(i3)) {
                this.f27018c++;
                i3 += 2;
            }
        }
    }

    /* renamed from: d */
    public final boolean m20528d() {
        return m20526a(1) == 1;
    }

    /* renamed from: e */
    public final int m20529e() {
        return m20524g();
    }

    /* renamed from: f */
    public final int m20530f() {
        int iM20524g = m20524g();
        return (iM20524g % 2 == 0 ? -1 : 1) * ((iM20524g + 1) / 2);
    }
}
