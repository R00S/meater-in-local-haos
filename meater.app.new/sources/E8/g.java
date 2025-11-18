package E8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import r8.InterfaceC4363a;
import t8.C4579e;

/* compiled from: ChaCha20Poly1305.java */
/* loaded from: classes2.dex */
public final class g implements InterfaceC4363a {

    /* renamed from: a, reason: collision with root package name */
    private final C4579e f4108a;

    public g(byte[] bArr) {
        this.f4108a = new C4579e(bArr);
    }

    @Override // r8.InterfaceC4363a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrC = p.c(12);
        byteBufferAllocate.put(bArrC);
        this.f4108a.b(byteBufferAllocate, bArrC, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // r8.InterfaceC4363a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.f4108a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }
}
