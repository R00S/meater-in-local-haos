package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzdjm implements zzdbj {

    /* renamed from: a */
    private final SecretKey f25598a;

    public zzdjm(byte[] bArr) throws GeneralSecurityException {
        zzdlx.m19577a(bArr.length);
        this.f25598a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: b */
    private static AlgorithmParameterSpec m19550b(byte[] bArr, int i2, int i3) throws GeneralSecurityException, ClassNotFoundException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i3);
        } catch (ClassNotFoundException unused) {
            if (zzdlv.m19576a()) {
                return new IvParameterSpec(bArr, 0, i3);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    /* renamed from: a */
    public final byte[] mo15598a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] bArrM19575c = zzdlo.m19575c(12);
        System.arraycopy(bArrM19575c, 0, bArr3, 0, 12);
        Cipher cipherM19569b = zzdkx.f25631c.m19569b("AES/GCM/NoPadding");
        cipherM19569b.init(1, this.f25598a, m19550b(bArrM19575c, 0, bArrM19575c.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipherM19569b.updateAAD(bArr2);
        }
        int iDoFinal = cipherM19569b.doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }
}
