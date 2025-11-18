package E8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import r8.InterfaceC4363a;
import r8.t;

/* compiled from: EncryptThenAuthenticate.java */
/* loaded from: classes2.dex */
public final class h implements InterfaceC4363a {

    /* renamed from: a, reason: collision with root package name */
    private final l f4109a;

    /* renamed from: b, reason: collision with root package name */
    private final t f4110b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4111c;

    public h(l lVar, t tVar, int i10) {
        this.f4109a = lVar;
        this.f4110b = tVar;
        this.f4111c = i10;
    }

    @Override // r8.InterfaceC4363a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.f4109a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(bArrA, this.f4110b.b(f.a(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // r8.InterfaceC4363a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f4111c;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f4111c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f4110b.a(bArrCopyOfRange2, f.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f4109a.b(bArrCopyOfRange);
    }
}
