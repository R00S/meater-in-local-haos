package s8;

import B8.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import r8.InterfaceC4363a;
import r8.v;

/* compiled from: AeadWrapper.java */
/* renamed from: s8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4505d implements r8.w<InterfaceC4363a, InterfaceC4363a> {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f49439a = Logger.getLogger(C4505d.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final C4505d f49440b = new C4505d();

    /* compiled from: AeadWrapper.java */
    /* renamed from: s8.d$b */
    private static class b implements InterfaceC4363a {

        /* renamed from: a, reason: collision with root package name */
        private final r8.v<InterfaceC4363a> f49441a;

        /* renamed from: b, reason: collision with root package name */
        private final b.a f49442b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f49443c;

        @Override // r8.InterfaceC4363a
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = E8.f.a(this.f49441a.e().b(), this.f49441a.e().g().a(bArr, bArr2));
                this.f49442b.b(this.f49441a.e().d(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.f49442b.a();
                throw e10;
            }
        }

        @Override // r8.InterfaceC4363a
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c<InterfaceC4363a> cVar : this.f49441a.f(bArrCopyOf)) {
                    try {
                        byte[] bArrB = cVar.g().b(bArrCopyOfRange, bArr2);
                        this.f49443c.b(cVar.d(), bArrCopyOfRange.length);
                        return bArrB;
                    } catch (GeneralSecurityException e10) {
                        C4505d.f49439a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (v.c<InterfaceC4363a> cVar2 : this.f49441a.h()) {
                try {
                    byte[] bArrB2 = cVar2.g().b(bArr, bArr2);
                    this.f49443c.b(cVar2.d(), bArr.length);
                    return bArrB2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f49443c.a();
            throw new GeneralSecurityException("decryption failed");
        }

        private b(r8.v<InterfaceC4363a> vVar) {
            this.f49441a = vVar;
            if (!vVar.i()) {
                b.a aVar = com.google.crypto.tink.internal.f.f37655a;
                this.f49442b = aVar;
                this.f49443c = aVar;
            } else {
                B8.b bVarA = com.google.crypto.tink.internal.g.b().a();
                B8.c cVarA = com.google.crypto.tink.internal.f.a(vVar);
                this.f49442b = bVarA.a(cVarA, "aead", "encrypt");
                this.f49443c = bVarA.a(cVarA, "aead", "decrypt");
            }
        }
    }

    C4505d() {
    }

    public static void e() {
        r8.x.n(f49440b);
    }

    @Override // r8.w
    public Class<InterfaceC4363a> a() {
        return InterfaceC4363a.class;
    }

    @Override // r8.w
    public Class<InterfaceC4363a> b() {
        return InterfaceC4363a.class;
    }

    @Override // r8.w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4363a c(r8.v<InterfaceC4363a> vVar) {
        return new b(vVar);
    }
}
