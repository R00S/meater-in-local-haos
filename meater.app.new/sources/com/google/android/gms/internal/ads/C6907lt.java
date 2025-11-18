package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.lt */
/* loaded from: classes2.dex */
final class C6907lt extends AbstractC6944mt {
    C6907lt(byte[] bArr, int i2) throws InvalidKeyException {
        super(bArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6944mt
    /* renamed from: f */
    final int mo15515f() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6944mt
    /* renamed from: g */
    final int[] mo15516g(int[] iArr, int i2) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
        }
        int[] iArr2 = new int[16];
        AbstractC6944mt.m15560e(iArr2, this.f19939b);
        iArr2[12] = i2;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }
}
