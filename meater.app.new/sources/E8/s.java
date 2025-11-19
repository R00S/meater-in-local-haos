package E8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import r8.InterfaceC4363a;
import t8.C4582h;

/* compiled from: XChaCha20Poly1305.java */
/* loaded from: classes2.dex */
public final class s implements InterfaceC4363a {

    /* renamed from: a, reason: collision with root package name */
    private final C4582h f4138a;

    public s(byte[] bArr) {
        this.f4138a = new C4582h(bArr);
    }

    @Override // r8.InterfaceC4363a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrC = p.c(24);
        byteBufferAllocate.put(bArrC);
        this.f4138a.b(byteBufferAllocate, bArrC, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    @Override // r8.InterfaceC4363a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.f4138a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }
}
