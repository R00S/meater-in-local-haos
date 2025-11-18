package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m14636a(byte[] bArr, int i2, int i3, int i4) {
        int i5 = (i3 & (-4)) + i2;
        while (i2 < i5) {
            int i6 = ((bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << 24)) * (-862048943);
            int i7 = i4 ^ (((i6 << 15) | (i6 >>> 17)) * 461845907);
            i4 = (((i7 >>> 19) | (i7 << 13)) * 5) - 430675100;
            i2 += 4;
        }
        int i8 = i3 & 3;
        if (i8 == 1) {
            int i9 = ((bArr[i5] & 255) | i) * (-862048943);
            i4 ^= ((i9 >>> 17) | (i9 << 15)) * 461845907;
        } else {
            if (i8 != 2) {
                i = i8 == 3 ? (bArr[i5 + 2] & 255) << 16 : 0;
            }
            i |= (bArr[i5 + 1] & 255) << 8;
            int i92 = ((bArr[i5] & 255) | i) * (-862048943);
            i4 ^= ((i92 >>> 17) | (i92 << 15)) * 461845907;
        }
        int i10 = i4 ^ i3;
        int i11 = (i10 ^ (i10 >>> 16)) * (-2048144789);
        int i12 = (i11 ^ (i11 >>> 13)) * (-1028477387);
        return i12 ^ (i12 >>> 16);
    }
}
