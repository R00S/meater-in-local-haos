package E8;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import w8.C5009b;

/* compiled from: PrfAesCmac.java */
/* loaded from: classes2.dex */
public final class m implements C8.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C5009b.EnumC0751b f4123d = C5009b.EnumC0751b.f51985B;

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f4124a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f4125b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f4126c;

    public m(byte[] bArr) throws GeneralSecurityException {
        r.a(bArr.length);
        this.f4124a = new SecretKeySpec(bArr, "AES");
        b();
    }

    private void b() throws GeneralSecurityException {
        Cipher cipherC = c();
        cipherC.init(1, this.f4124a);
        byte[] bArrB = A8.a.b(cipherC.doFinal(new byte[16]));
        this.f4125b = bArrB;
        this.f4126c = A8.a.b(bArrB);
    }

    private static Cipher c() throws GeneralSecurityException {
        if (f4123d.c()) {
            return i.f4112b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // C8.a
    public byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherC = c();
        cipherC.init(1, this.f4124a);
        int iMax = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        byte[] bArrD = iMax * 16 == bArr.length ? f.d(bArr, (iMax - 1) * 16, this.f4125b, 0, 16) : f.e(A8.a.a(Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length)), this.f4126c);
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < iMax - 1; i11++) {
            bArrDoFinal = cipherC.doFinal(f.d(bArrDoFinal, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(cipherC.doFinal(f.e(bArrD, bArrDoFinal)), i10);
    }
}
