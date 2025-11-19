package s8;

import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import s8.v;

/* compiled from: AesGcmSivProtoSerialization.java */
/* loaded from: classes2.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final F8.a f49514a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.k<v, com.google.crypto.tink.internal.p> f49515b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f49516c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.c<t, com.google.crypto.tink.internal.o> f49517d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f49518e;

    /* compiled from: AesGcmSivProtoSerialization.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49519a;

        static {
            int[] iArr = new int[D8.I.values().length];
            f49519a = iArr;
            try {
                iArr[D8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49519a[D8.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49519a[D8.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49519a[D8.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        F8.a aVarE = com.google.crypto.tink.internal.s.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f49514a = aVarE;
        f49515b = com.google.crypto.tink.internal.k.a(new C4511j(), v.class, com.google.crypto.tink.internal.p.class);
        f49516c = com.google.crypto.tink.internal.j.a(new C4512k(), aVarE, com.google.crypto.tink.internal.p.class);
        f49517d = com.google.crypto.tink.internal.c.a(new C4513l(), t.class, com.google.crypto.tink.internal.o.class);
        f49518e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0483b() { // from class: s8.w
            @Override // com.google.crypto.tink.internal.b.InterfaceC0483b
            public final r8.g a(com.google.crypto.tink.internal.q qVar, r8.y yVar) {
                return x.b((com.google.crypto.tink.internal.o) qVar, yVar);
            }
        }, aVarE, com.google.crypto.tink.internal.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t b(com.google.crypto.tink.internal.o oVar, r8.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            D8.n nVarD0 = D8.n.d0(oVar.g(), C2905o.b());
            if (nVarD0.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return t.a().e(v.a().b(nVarD0.a0().size()).c(e(oVar.e())).a()).d(F8.b.a(nVarD0.a0().G(), r8.y.b(yVar))).c(oVar.c()).a();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f49515b);
        iVar.g(f49516c);
        iVar.f(f49517d);
        iVar.e(f49518e);
    }

    private static v.c e(D8.I i10) throws GeneralSecurityException {
        int i11 = a.f49519a[i10.ordinal()];
        if (i11 == 1) {
            return v.c.f49510b;
        }
        if (i11 == 2 || i11 == 3) {
            return v.c.f49511c;
        }
        if (i11 == 4) {
            return v.c.f49512d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.e());
    }
}
