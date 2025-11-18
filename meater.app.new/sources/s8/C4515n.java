package s8;

import D8.C0991i;
import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import s8.C4510i;

/* compiled from: AesEaxProtoSerialization.java */
/* renamed from: s8.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4515n {

    /* renamed from: a, reason: collision with root package name */
    private static final F8.a f49466a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.k<C4510i, com.google.crypto.tink.internal.p> f49467b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f49468c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.c<C4508g, com.google.crypto.tink.internal.o> f49469d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f49470e;

    /* compiled from: AesEaxProtoSerialization.java */
    /* renamed from: s8.n$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49471a;

        static {
            int[] iArr = new int[D8.I.values().length];
            f49471a = iArr;
            try {
                iArr[D8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49471a[D8.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49471a[D8.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49471a[D8.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        F8.a aVarE = com.google.crypto.tink.internal.s.e("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f49466a = aVarE;
        f49467b = com.google.crypto.tink.internal.k.a(new C4511j(), C4510i.class, com.google.crypto.tink.internal.p.class);
        f49468c = com.google.crypto.tink.internal.j.a(new C4512k(), aVarE, com.google.crypto.tink.internal.p.class);
        f49469d = com.google.crypto.tink.internal.c.a(new C4513l(), C4508g.class, com.google.crypto.tink.internal.o.class);
        f49470e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0483b() { // from class: s8.m
            @Override // com.google.crypto.tink.internal.b.InterfaceC0483b
            public final r8.g a(com.google.crypto.tink.internal.q qVar, r8.y yVar) {
                return C4515n.b((com.google.crypto.tink.internal.o) qVar, yVar);
            }
        }, aVarE, com.google.crypto.tink.internal.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4508g b(com.google.crypto.tink.internal.o oVar, r8.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            C0991i c0991iG0 = C0991i.g0(oVar.g(), C2905o.b());
            if (c0991iG0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C4508g.a().e(C4510i.a().c(c0991iG0.b0().size()).b(c0991iG0.c0().a0()).d(16).e(e(oVar.e())).a()).d(F8.b.a(c0991iG0.b0().G(), r8.y.b(yVar))).c(oVar.c()).a();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f49467b);
        iVar.g(f49468c);
        iVar.f(f49469d);
        iVar.e(f49470e);
    }

    private static C4510i.c e(D8.I i10) throws GeneralSecurityException {
        int i11 = a.f49471a[i10.ordinal()];
        if (i11 == 1) {
            return C4510i.c.f49462b;
        }
        if (i11 == 2 || i11 == 3) {
            return C4510i.c.f49463c;
        }
        if (i11 == 4) {
            return C4510i.c.f49464d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.e());
    }
}
