package E8;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import r8.InterfaceC4367e;
import w8.C5009b;

/* compiled from: AesSiv.java */
/* loaded from: classes2.dex */
public final class d implements InterfaceC4367e {

    /* renamed from: c, reason: collision with root package name */
    public static final C5009b.EnumC0751b f4085c = C5009b.EnumC0751b.f51985B;

    /* renamed from: d, reason: collision with root package name */
    private static final Collection<Integer> f4086d = Arrays.asList(64);

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f4087e = new byte[16];

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f4088f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private final m f4089a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f4090b;

    public d(byte[] bArr) throws GeneralSecurityException {
        if (!f4085c.c()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (f4086d.contains(Integer.valueOf(bArr.length))) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f4090b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f4089a = new m(bArrCopyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    private byte[] c(byte[]... bArr) throws GeneralSecurityException {
        if (bArr.length == 0) {
            return this.f4089a.a(f4088f, 16);
        }
        byte[] bArrA = this.f4089a.a(f4087e, 16);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = f.e(A8.a.b(bArrA), this.f4089a.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f4089a.a(bArr3.length >= 16 ? f.f(bArr3, bArrA) : f.e(A8.a.a(bArr3), A8.a.b(bArrA)), 16);
    }

    @Override // r8.InterfaceC4367e
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipherA = i.f4112b.a("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipherA.init(1, new SecretKeySpec(this.f4090b, "AES"), new IvParameterSpec(bArr3));
        return f.a(bArrC, cipherA.doFinal(bArr));
    }

    @Override // r8.InterfaceC4367e
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipherA = i.f4112b.a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipherA.init(2, new SecretKeySpec(this.f4090b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipherA.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && q.b()) {
            bArrDoFinal = new byte[0];
        }
        if (f.b(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}
