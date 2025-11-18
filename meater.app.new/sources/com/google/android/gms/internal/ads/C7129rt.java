package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.rt */
/* loaded from: classes2.dex */
final class C7129rt extends AbstractC6944mt {
    C7129rt(byte[] bArr, int i2) throws InvalidKeyException {
        super(bArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6944mt
    /* renamed from: f */
    final int mo15515f() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6944mt
    /* renamed from: g */
    final int[] mo15516g(int[] iArr, int i2) {
        if (iArr.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        AbstractC6944mt.m15560e(iArr3, this.f19939b);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        AbstractC6944mt.m15561i(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        AbstractC6944mt.m15560e(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i2;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
