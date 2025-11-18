package E8;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import w8.C5009b;

/* compiled from: AesCtrJceCipher.java */
/* loaded from: classes2.dex */
public final class a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final C5009b.EnumC0751b f4071d = C5009b.EnumC0751b.f51986C;

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f4072e = new C0074a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f4073a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4074b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4075c;

    /* compiled from: AesCtrJceCipher.java */
    /* renamed from: E8.a$a, reason: collision with other inner class name */
    class C0074a extends ThreadLocal<Cipher> {
        C0074a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f4112b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!f4071d.c()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f4073a = new SecretKeySpec(bArr, "AES");
        int blockSize = f4072e.get().getBlockSize();
        this.f4075c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f4074b = i10;
    }

    private void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = f4072e.get();
        byte[] bArr4 = new byte[this.f4075c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f4074b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z10) {
            cipher.init(1, this.f4073a, ivParameterSpec);
        } else {
            cipher.init(2, this.f4073a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // E8.l
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f4074b;
        if (length > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f4074b));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] bArrC = p.c(i10);
        System.arraycopy(bArrC, 0, bArr2, 0, this.f4074b);
        c(bArr, 0, bArr.length, bArr2, this.f4074b, bArrC, true);
        return bArr2;
    }

    @Override // E8.l
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f4074b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.f4074b;
        byte[] bArr3 = new byte[length2 - i11];
        c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }
}
