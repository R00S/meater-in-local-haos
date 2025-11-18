package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public final class zzdjh implements zzdby {

    /* renamed from: a */
    private final SecretKey f25587a;

    /* renamed from: b */
    private final int f25588b;

    /* renamed from: c */
    private byte[] f25589c;

    /* renamed from: d */
    private byte[] f25590d;

    /* renamed from: b */
    private static Cipher m19546b() throws GeneralSecurityException {
        return zzdkx.f25631c.m19569b("AES/ECB/NoPadding");
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    /* renamed from: a */
    public final byte[] mo19193a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArrM19554d;
        Cipher cipherM19546b = m19546b();
        cipherM19546b.init(1, this.f25587a);
        double length = bArr.length;
        Double.isNaN(length);
        int iMax = Math.max(1, (int) Math.ceil(length / 16.0d));
        if ((iMax << 4) == bArr.length) {
            bArrM19554d = zzdjs.m19552b(bArr, (iMax - 1) << 4, this.f25589c, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) << 4, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrM19554d = zzdjs.m19554d(bArrCopyOf, this.f25590d);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipherM19546b.doFinal(zzdjs.m19552b(bArrDoFinal, 0, bArr, i2 << 4, 16));
        }
        byte[] bArrM19554d2 = zzdjs.m19554d(bArrM19554d, bArrDoFinal);
        byte[] bArr2 = new byte[this.f25588b];
        System.arraycopy(cipherM19546b.doFinal(bArrM19554d2), 0, bArr2, 0, this.f25588b);
        return bArr2;
    }
}
