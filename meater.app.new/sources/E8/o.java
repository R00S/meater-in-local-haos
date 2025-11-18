package E8;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import r8.t;

/* compiled from: PrfMac.java */
/* loaded from: classes2.dex */
public class o implements t {

    /* renamed from: a, reason: collision with root package name */
    private final C8.a f4133a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4134b;

    public o(C8.a aVar, int i10) throws InvalidAlgorithmParameterException {
        this.f4133a = aVar;
        this.f4134b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i10);
    }

    @Override // r8.t
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // r8.t
    public byte[] b(byte[] bArr) {
        return this.f4133a.a(bArr, this.f4134b);
    }
}
