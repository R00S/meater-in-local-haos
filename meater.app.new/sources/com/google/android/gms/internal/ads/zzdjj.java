package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzdjj implements zzdlk {

    /* renamed from: a */
    private final SecretKeySpec f25591a;

    /* renamed from: b */
    private final int f25592b;

    /* renamed from: c */
    private final int f25593c;

    public zzdjj(byte[] bArr, int i2) throws GeneralSecurityException {
        zzdlx.m19577a(bArr.length);
        this.f25591a = new SecretKeySpec(bArr, "AES");
        int blockSize = zzdkx.f25631c.m19569b("AES/CTR/NoPadding").getBlockSize();
        this.f25593c = blockSize;
        if (i2 < 12 || i2 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f25592b = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    /* renamed from: a */
    public final byte[] mo15563a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.f25592b;
        if (length > Integer.MAX_VALUE - i2) {
            int i3 = Integer.MAX_VALUE - this.f25592b;
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(i3);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[bArr.length + i2];
        byte[] bArrM19575c = zzdlo.m19575c(i2);
        System.arraycopy(bArrM19575c, 0, bArr2, 0, this.f25592b);
        int length2 = bArr.length;
        int i4 = this.f25592b;
        Cipher cipherM19569b = zzdkx.f25631c.m19569b("AES/CTR/NoPadding");
        byte[] bArr3 = new byte[this.f25593c];
        System.arraycopy(bArrM19575c, 0, bArr3, 0, this.f25592b);
        cipherM19569b.init(1, this.f25591a, new IvParameterSpec(bArr3));
        if (cipherM19569b.doFinal(bArr, 0, length2, bArr2, i4) == length2) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
