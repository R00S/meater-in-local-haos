package t8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: InsecureNonceChaCha20.java */
/* renamed from: t8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4577c extends AbstractC4578d {
    public C4577c(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // t8.AbstractC4578d
    public int[] b(int[] iArr, int i10) {
        if (iArr.length != e() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        C4575a.c(iArr2, this.f49976a);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // t8.AbstractC4578d
    public /* bridge */ /* synthetic */ byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        return super.c(bArr, byteBuffer);
    }

    @Override // t8.AbstractC4578d
    public /* bridge */ /* synthetic */ void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.d(byteBuffer, bArr, bArr2);
    }

    @Override // t8.AbstractC4578d
    public int e() {
        return 12;
    }
}
