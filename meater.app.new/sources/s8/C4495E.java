package s8;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r8.InterfaceC4363a;

/* compiled from: KmsEnvelopeAead.java */
/* renamed from: s8.E, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4495E implements InterfaceC4363a {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f49408c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final D8.A f49409a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4363a f49410b;

    public C4495E(D8.A a10, InterfaceC4363a interfaceC4363a) {
        this.f49409a = a10;
        this.f49410b = interfaceC4363a;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // r8.InterfaceC4363a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrL = r8.x.j(this.f49409a).l();
        return c(this.f49410b.a(bArrL, f49408c), ((InterfaceC4363a) r8.x.g(this.f49409a.d0(), bArrL, InterfaceC4363a.class)).a(bArr, bArr2));
    }

    @Override // r8.InterfaceC4363a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((InterfaceC4363a) r8.x.g(this.f49409a.d0(), this.f49410b.b(bArr3, f49408c), InterfaceC4363a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
