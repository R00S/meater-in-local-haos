package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzss {

    /* renamed from: a */
    private byte[] f27009a;

    /* renamed from: b */
    private int f27010b;

    /* renamed from: c */
    private int f27011c;

    /* renamed from: d */
    private int f27012d;

    public zzss() {
    }

    /* renamed from: a */
    public final int m20499a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        int i7 = i2 / 8;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = this.f27011c;
            if (i10 != 0) {
                byte[] bArr = this.f27009a;
                int i11 = this.f27010b;
                i6 = ((bArr[i11 + 1] & 255) >>> (8 - i10)) | ((bArr[i11] & 255) << i10);
            } else {
                i6 = this.f27009a[this.f27010b];
            }
            i2 -= 8;
            i8 |= (255 & i6) << i2;
            this.f27010b++;
        }
        if (i2 > 0) {
            int i12 = this.f27011c + i2;
            byte b2 = (byte) (255 >> (8 - i2));
            if (i12 > 8) {
                byte[] bArr2 = this.f27009a;
                int i13 = this.f27010b;
                i5 = (b2 & (((255 & bArr2[i13 + 1]) >> (16 - i12)) | ((bArr2[i13] & 255) << (i12 - 8)))) | i8;
                this.f27010b = i13 + 1;
            } else {
                byte[] bArr3 = this.f27009a;
                int i14 = this.f27010b;
                i5 = (b2 & ((255 & bArr3[i14]) >> (8 - i12))) | i8;
                if (i12 == 8) {
                    this.f27010b = i14 + 1;
                }
            }
            i8 = i5;
            this.f27011c = i12 % 8;
        }
        int i15 = this.f27010b;
        if (i15 >= 0 && (i3 = this.f27011c) >= 0 && i3 < 8 && (i15 < (i4 = this.f27012d) || (i15 == i4 && i3 == 0))) {
            z = true;
        }
        zzsk.m20481e(z);
        return i8;
    }

    public zzss(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private zzss(byte[] bArr, int i2) {
        this.f27009a = bArr;
        this.f27012d = i2;
    }
}
