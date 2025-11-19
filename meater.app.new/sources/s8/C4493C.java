package s8;

import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import s8.C4491A;

/* compiled from: ChaCha20Poly1305ProtoSerialization.java */
/* renamed from: s8.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4493C {

    /* renamed from: a, reason: collision with root package name */
    private static final F8.a f49401a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.k<C4491A, com.google.crypto.tink.internal.p> f49402b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f49403c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.c<y, com.google.crypto.tink.internal.o> f49404d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f49405e;

    /* compiled from: ChaCha20Poly1305ProtoSerialization.java */
    /* renamed from: s8.C$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49406a;

        static {
            int[] iArr = new int[D8.I.values().length];
            f49406a = iArr;
            try {
                iArr[D8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49406a[D8.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49406a[D8.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49406a[D8.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        F8.a aVarE = com.google.crypto.tink.internal.s.e("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f49401a = aVarE;
        f49402b = com.google.crypto.tink.internal.k.a(new C4511j(), C4491A.class, com.google.crypto.tink.internal.p.class);
        f49403c = com.google.crypto.tink.internal.j.a(new C4512k(), aVarE, com.google.crypto.tink.internal.p.class);
        f49404d = com.google.crypto.tink.internal.c.a(new C4513l(), y.class, com.google.crypto.tink.internal.o.class);
        f49405e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0483b() { // from class: s8.B
            @Override // com.google.crypto.tink.internal.b.InterfaceC0483b
            public final r8.g a(com.google.crypto.tink.internal.q qVar, r8.y yVar) {
                return C4493C.b((com.google.crypto.tink.internal.o) qVar, yVar);
            }
        }, aVarE, com.google.crypto.tink.internal.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y b(com.google.crypto.tink.internal.o oVar, r8.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            D8.r rVarD0 = D8.r.d0(oVar.g(), C2905o.b());
            if (rVarD0.b0() == 0) {
                return y.a(e(oVar.e()), F8.b.a(rVarD0.a0().G(), r8.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f49402b);
        iVar.g(f49403c);
        iVar.f(f49404d);
        iVar.e(f49405e);
    }

    private static C4491A.a e(D8.I i10) throws GeneralSecurityException {
        int i11 = a.f49406a[i10.ordinal()];
        if (i11 == 1) {
            return C4491A.a.f49397b;
        }
        if (i11 == 2 || i11 == 3) {
            return C4491A.a.f49398c;
        }
        if (i11 == 4) {
            return C4491A.a.f49399d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.e());
    }
}
