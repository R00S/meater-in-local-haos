package z8;

import D8.C0983a;
import D8.I;
import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.internal.s;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import r8.y;
import s8.C4511j;
import s8.C4512k;
import s8.C4513l;
import z8.C5217d;

/* compiled from: AesCmacProtoSerialization.java */
/* loaded from: classes2.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final F8.a f53868a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.k<C5217d, com.google.crypto.tink.internal.p> f53869b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f53870c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.c<C5214a, com.google.crypto.tink.internal.o> f53871d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f53872e;

    /* compiled from: AesCmacProtoSerialization.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53873a;

        static {
            int[] iArr = new int[I.values().length];
            f53873a = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53873a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53873a[I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53873a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        F8.a aVarE = s.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f53868a = aVarE;
        f53869b = com.google.crypto.tink.internal.k.a(new C4511j(), C5217d.class, com.google.crypto.tink.internal.p.class);
        f53870c = com.google.crypto.tink.internal.j.a(new C4512k(), aVarE, com.google.crypto.tink.internal.p.class);
        f53871d = com.google.crypto.tink.internal.c.a(new C4513l(), C5214a.class, com.google.crypto.tink.internal.o.class);
        f53872e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0483b() { // from class: z8.e
            @Override // com.google.crypto.tink.internal.b.InterfaceC0483b
            public final r8.g a(com.google.crypto.tink.internal.q qVar, y yVar) {
                return f.b((com.google.crypto.tink.internal.o) qVar, yVar);
            }
        }, aVarE, com.google.crypto.tink.internal.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C5214a b(com.google.crypto.tink.internal.o oVar, y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            C0983a c0983aG0 = C0983a.g0(oVar.g(), C2905o.b());
            if (c0983aG0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C5214a.c().e(C5217d.a().b(c0983aG0.b0().size()).c(c0983aG0.c0().a0()).d(e(oVar.e())).a()).c(F8.b.a(c0983aG0.b0().G(), y.b(yVar))).d(oVar.c()).a();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f53869b);
        iVar.g(f53870c);
        iVar.f(f53871d);
        iVar.e(f53872e);
    }

    private static C5217d.c e(I i10) throws GeneralSecurityException {
        int i11 = a.f53873a[i10.ordinal()];
        if (i11 == 1) {
            return C5217d.c.f53863b;
        }
        if (i11 == 2) {
            return C5217d.c.f53864c;
        }
        if (i11 == 3) {
            return C5217d.c.f53865d;
        }
        if (i11 == 4) {
            return C5217d.c.f53866e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.e());
    }
}
