package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzdjk implements zzdbj {

    /* renamed from: a */
    private final byte[] f25594a;

    /* renamed from: b */
    private final byte[] f25595b;

    /* renamed from: c */
    private final SecretKeySpec f25596c;

    /* renamed from: d */
    private final int f25597d;

    public zzdjk(byte[] bArr, int i2) throws GeneralSecurityException {
        if (i2 != 12 && i2 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f25597d = i2;
        zzdlx.m19577a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f25596c = secretKeySpec;
        Cipher cipher = Cipher.getInstance("AES/ECB/NOPADDING");
        cipher.init(1, secretKeySpec);
        byte[] bArrM19549d = m19549d(cipher.doFinal(new byte[16]));
        this.f25594a = bArrM19549d;
        this.f25595b = m19549d(bArrM19549d);
    }

    /* renamed from: b */
    private final byte[] m19547b(Cipher cipher, int i2, byte[] bArr, int i3, int i4) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrM19548c;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i2;
        if (i4 == 0) {
            return cipher.doFinal(m19548c(bArr2, this.f25594a));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i5 = 0;
        while (i4 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                bArrDoFinal[i6] = (byte) (bArrDoFinal[i6] ^ bArr[(i3 + i5) + i6]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i5 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5 + i3, i3 + i4);
        if (bArrCopyOfRange.length == 16) {
            bArrM19548c = m19548c(bArrCopyOfRange, this.f25594a);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f25595b, 16);
            for (int i7 = 0; i7 < bArrCopyOfRange.length; i7++) {
                bArrCopyOf[i7] = (byte) (bArrCopyOf[i7] ^ bArrCopyOfRange[i7]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
            bArrM19548c = bArrCopyOf;
        }
        return cipher.doFinal(m19548c(bArrDoFinal, bArrM19548c));
    }

    /* renamed from: c */
    private static byte[] m19548c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    /* renamed from: d */
    private static byte[] m19549d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7));
            i2 = i3;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    /* renamed from: a */
    public final byte[] mo15598a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.f25597d;
        if (length > (Integer.MAX_VALUE - i2) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i2 + 16];
        byte[] bArrM19575c = zzdlo.m19575c(i2);
        System.arraycopy(bArrM19575c, 0, bArr3, 0, this.f25597d);
        Cipher cipher = Cipher.getInstance("AES/ECB/NOPADDING");
        cipher.init(1, this.f25596c);
        byte[] bArrM19547b = m19547b(cipher, 0, bArrM19575c, 0, bArrM19575c.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM19547b2 = m19547b(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = Cipher.getInstance("AES/CTR/NOPADDING");
        cipher2.init(1, this.f25596c, new IvParameterSpec(bArrM19547b));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f25597d);
        byte[] bArrM19547b3 = m19547b(cipher, 2, bArr3, this.f25597d, bArr.length);
        int length2 = bArr.length + this.f25597d;
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[length2 + i3] = (byte) ((bArrM19547b2[i3] ^ bArrM19547b[i3]) ^ bArrM19547b3[i3]);
        }
        return bArr3;
    }
}
