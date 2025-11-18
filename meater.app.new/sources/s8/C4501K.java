package s8;

import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import s8.C4499I;

/* compiled from: XChaCha20Poly1305ProtoSerialization.java */
/* renamed from: s8.K, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4501K {

    /* renamed from: a, reason: collision with root package name */
    private static final F8.a f49422a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.k<C4499I, com.google.crypto.tink.internal.p> f49423b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f49424c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.c<C4497G, com.google.crypto.tink.internal.o> f49425d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f49426e;

    /* compiled from: XChaCha20Poly1305ProtoSerialization.java */
    /* renamed from: s8.K$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49427a;

        static {
            int[] iArr = new int[D8.I.values().length];
            f49427a = iArr;
            try {
                iArr[D8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49427a[D8.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49427a[D8.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49427a[D8.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        F8.a aVarE = com.google.crypto.tink.internal.s.e("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f49422a = aVarE;
        f49423b = com.google.crypto.tink.internal.k.a(new C4511j(), C4499I.class, com.google.crypto.tink.internal.p.class);
        f49424c = com.google.crypto.tink.internal.j.a(new C4512k(), aVarE, com.google.crypto.tink.internal.p.class);
        f49425d = com.google.crypto.tink.internal.c.a(new C4513l(), C4497G.class, com.google.crypto.tink.internal.o.class);
        f49426e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0483b() { // from class: s8.J
            @Override // com.google.crypto.tink.internal.b.InterfaceC0483b
            public final r8.g a(com.google.crypto.tink.internal.q qVar, r8.y yVar) {
                return C4501K.b((com.google.crypto.tink.internal.o) qVar, yVar);
            }
        }, aVarE, com.google.crypto.tink.internal.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4497G b(com.google.crypto.tink.internal.o oVar, r8.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            D8.K kD0 = D8.K.d0(oVar.g(), C2905o.b());
            if (kD0.b0() == 0) {
                return C4497G.a(e(oVar.e()), F8.b.a(kD0.a0().G(), r8.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f49423b);
        iVar.g(f49424c);
        iVar.f(f49425d);
        iVar.e(f49426e);
    }

    private static C4499I.a e(D8.I i10) throws GeneralSecurityException {
        int i11 = a.f49427a[i10.ordinal()];
        if (i11 == 1) {
            return C4499I.a.f49418b;
        }
        if (i11 == 2 || i11 == 3) {
            return C4499I.a.f49419c;
        }
        if (i11 == 4) {
            return C4499I.a.f49420d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.e());
    }
}
