package E8;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import r8.InterfaceC4363a;
import t8.C4576b;
import w8.C5009b;

/* compiled from: AesGcmJce.java */
/* loaded from: classes2.dex */
public final class c implements InterfaceC4363a {

    /* renamed from: b, reason: collision with root package name */
    public static final C5009b.EnumC0751b f4083b = C5009b.EnumC0751b.f51986C;

    /* renamed from: a, reason: collision with root package name */
    private final C4576b f4084a;

    public c(byte[] bArr) throws GeneralSecurityException {
        if (!f4083b.c()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f4084a = new C4576b(bArr, true);
    }

    @Override // r8.InterfaceC4363a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f4084a.b(p.c(12), bArr, bArr2);
    }

    @Override // r8.InterfaceC4363a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return this.f4084a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
