package t8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import w8.C5009b;

/* compiled from: InsecureNonceChaCha20Poly1305Base.java */
/* renamed from: t8.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4580f {

    /* renamed from: c, reason: collision with root package name */
    public static final C5009b.EnumC0751b f49978c = C5009b.EnumC0751b.f51985B;

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4578d f49979a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4578d f49980b;

    public AbstractC4580f(byte[] bArr) throws GeneralSecurityException {
        if (!f49978c.c()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f49979a = e(bArr, 1);
        this.f49980b = e(bArr, 0);
    }

    private byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f49980b.a(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] d(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining % 16;
        int i11 = (i10 == 0 ? iRemaining : (iRemaining + 16) - i10) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i11);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            C4583i.f(c(bArr), d(bArr2, byteBuffer), bArr3);
            byteBuffer.position(iPosition);
            return this.f49979a.c(bArr, byteBuffer);
        } catch (GeneralSecurityException e10) {
            throw new AEADBadTagException(e10.toString());
        }
    }

    public void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        this.f49979a.d(byteBuffer, bArr, bArr2);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArrA = C4583i.a(c(bArr), d(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrA);
    }

    abstract AbstractC4578d e(byte[] bArr, int i10);
}
