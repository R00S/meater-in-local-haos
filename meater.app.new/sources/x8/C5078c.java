package x8;

import B8.b;
import com.google.crypto.tink.internal.f;
import com.google.crypto.tink.internal.g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import r8.InterfaceC4367e;
import r8.v;
import r8.w;
import r8.x;

/* compiled from: DeterministicAeadWrapper.java */
/* renamed from: x8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5078c implements w<InterfaceC4367e, InterfaceC4367e> {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f52897a = Logger.getLogger(C5078c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final C5078c f52898b = new C5078c();

    /* compiled from: DeterministicAeadWrapper.java */
    /* renamed from: x8.c$a */
    private static class a implements InterfaceC4367e {

        /* renamed from: a, reason: collision with root package name */
        private final v<InterfaceC4367e> f52899a;

        /* renamed from: b, reason: collision with root package name */
        private final b.a f52900b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f52901c;

        public a(v<InterfaceC4367e> vVar) {
            this.f52899a = vVar;
            if (!vVar.i()) {
                b.a aVar = f.f37655a;
                this.f52900b = aVar;
                this.f52901c = aVar;
            } else {
                B8.b bVarA = g.b().a();
                B8.c cVarA = f.a(vVar);
                this.f52900b = bVarA.a(cVarA, "daead", "encrypt");
                this.f52901c = bVarA.a(cVarA, "daead", "decrypt");
            }
        }

        @Override // r8.InterfaceC4367e
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = E8.f.a(this.f52899a.e().b(), this.f52899a.e().g().a(bArr, bArr2));
                this.f52900b.b(this.f52899a.e().d(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.f52900b.a();
                throw e10;
            }
        }

        @Override // r8.InterfaceC4367e
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c<InterfaceC4367e> cVar : this.f52899a.f(bArrCopyOf)) {
                    try {
                        byte[] bArrB = cVar.g().b(bArrCopyOfRange, bArr2);
                        this.f52901c.b(cVar.d(), bArrCopyOfRange.length);
                        return bArrB;
                    } catch (GeneralSecurityException e10) {
                        C5078c.f52897a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (v.c<InterfaceC4367e> cVar2 : this.f52899a.h()) {
                try {
                    byte[] bArrB2 = cVar2.g().b(bArr, bArr2);
                    this.f52901c.b(cVar2.d(), bArr.length);
                    return bArrB2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f52901c.a();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    C5078c() {
    }

    public static void e() {
        x.n(f52898b);
    }

    @Override // r8.w
    public Class<InterfaceC4367e> a() {
        return InterfaceC4367e.class;
    }

    @Override // r8.w
    public Class<InterfaceC4367e> b() {
        return InterfaceC4367e.class;
    }

    @Override // r8.w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4367e c(v<InterfaceC4367e> vVar) {
        return new a(vVar);
    }
}
