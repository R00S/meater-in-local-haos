package t8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: InsecureNonceChaCha20Base.java */
/* renamed from: t8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4578d {

    /* renamed from: a, reason: collision with root package name */
    int[] f49976a;

    /* renamed from: b, reason: collision with root package name */
    private final int f49977b;

    public AbstractC4578d(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f49976a = C4575a.e(bArr);
        this.f49977b = i10;
    }

    private void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != e()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + e());
        }
        int iRemaining = byteBuffer2.remaining();
        int i10 = iRemaining / 64;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBufferA = a(bArr, this.f49977b + i12);
            if (i12 == i10) {
                E8.f.c(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                E8.f.c(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    ByteBuffer a(byte[] bArr, int i10) {
        int[] iArrB = b(C4575a.e(bArr), i10);
        int[] iArr = (int[]) iArrB.clone();
        C4575a.d(iArr);
        for (int i11 = 0; i11 < iArrB.length; i11++) {
            iArrB[i11] = iArrB[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    abstract int[] b(int[] iArr, int i10);

    public byte[] c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    abstract int e();
}
