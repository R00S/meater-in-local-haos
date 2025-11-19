package t8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: InsecureNonceXChaCha20Poly1305.java */
/* renamed from: t8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4582h extends AbstractC4580f {
    public C4582h(byte[] bArr) {
        super(bArr);
    }

    @Override // t8.AbstractC4580f
    public /* bridge */ /* synthetic */ byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        return super.a(byteBuffer, bArr, bArr2);
    }

    @Override // t8.AbstractC4580f
    public /* bridge */ /* synthetic */ void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        super.b(byteBuffer, bArr, bArr2, bArr3);
    }

    @Override // t8.AbstractC4580f
    AbstractC4578d e(byte[] bArr, int i10) {
        return new C4581g(bArr, i10);
    }
}
