package E8;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import r8.InterfaceC4363a;
import w8.C5009b;

/* compiled from: AesEaxJce.java */
/* loaded from: classes2.dex */
public final class b implements InterfaceC4363a {

    /* renamed from: e, reason: collision with root package name */
    public static final C5009b.EnumC0751b f4076e = C5009b.EnumC0751b.f51985B;

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f4077f = new a();

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f4078g = new C0075b();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4079a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f4080b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f4081c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4082d;

    /* compiled from: AesEaxJce.java */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f4112b.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* compiled from: AesEaxJce.java */
    /* renamed from: E8.b$b, reason: collision with other inner class name */
    class C0075b extends ThreadLocal<Cipher> {
        C0075b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f4112b.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public b(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!f4076e.c()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f4082d = i10;
        r.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f4081c = secretKeySpec;
        Cipher cipher = f4077f.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrC = c(cipher.doFinal(new byte[16]));
        this.f4079a = bArrC;
        this.f4080b = c(bArrC);
    }

    private static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((bArr[i10] << 1) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private byte[] d(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        if (i12 == 0) {
            return cipher.doFinal(f(bArr2, this.f4079a));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i13 = 0;
        while (i12 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                bArrDoFinal[i14] = (byte) (bArrDoFinal[i14] ^ bArr[(i11 + i13) + i14]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i13 += 16;
        }
        return cipher.doFinal(f(bArrDoFinal, e(Arrays.copyOfRange(bArr, i13 + i11, i11 + i12))));
    }

    private byte[] e(byte[] bArr) {
        if (bArr.length == 16) {
            return f(bArr, this.f4079a);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f4080b, 16);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArrCopyOf[i10] = (byte) (bArrCopyOf[i10] ^ bArr[i10]);
        }
        bArrCopyOf[bArr.length] = (byte) (bArrCopyOf[bArr.length] ^ 128);
        return bArrCopyOf;
    }

    private static byte[] f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    @Override // r8.InterfaceC4363a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f4082d;
        if (length > 2147483631 - i10) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i10 + 16];
        byte[] bArrC = p.c(i10);
        System.arraycopy(bArrC, 0, bArr3, 0, this.f4082d);
        Cipher cipher = f4077f.get();
        cipher.init(1, this.f4081c);
        byte[] bArrD = d(cipher, 0, bArrC, 0, bArrC.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrD2 = d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = f4078g.get();
        cipher2.init(1, this.f4081c, new IvParameterSpec(bArrD));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f4082d);
        byte[] bArrD3 = d(cipher, 2, bArr3, this.f4082d, bArr.length);
        int length2 = bArr.length + this.f4082d;
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[length2 + i11] = (byte) ((bArrD2[i11] ^ bArrD[i11]) ^ bArrD3[i11]);
        }
        return bArr3;
    }

    @Override // r8.InterfaceC4363a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = (bArr.length - this.f4082d) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = f4077f.get();
        cipher.init(1, this.f4081c);
        byte[] bArrD = d(cipher, 0, bArr, 0, this.f4082d);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] bArrD2 = d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrD3 = d(cipher, 2, bArr, this.f4082d, length);
        int length2 = bArr.length - 16;
        byte b10 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b10 = (byte) (b10 | (((bArr[length2 + i10] ^ bArrD2[i10]) ^ bArrD[i10]) ^ bArrD3[i10]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = f4078g.get();
        cipher2.init(1, this.f4081c, new IvParameterSpec(bArrD));
        return cipher2.doFinal(bArr, this.f4082d, length);
    }
}
