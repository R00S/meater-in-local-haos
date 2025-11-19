package s8;

import D8.C0994l;
import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import s8.q;

/* compiled from: AesGcmProtoSerialization.java */
/* loaded from: classes2.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final F8.a f49492a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.k<q, com.google.crypto.tink.internal.p> f49493b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f49494c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.c<C4516o, com.google.crypto.tink.internal.o> f49495d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f49496e;

    /* compiled from: AesGcmProtoSerialization.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49497a;

        static {
            int[] iArr = new int[D8.I.values().length];
            f49497a = iArr;
            try {
                iArr[D8.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49497a[D8.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49497a[D8.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49497a[D8.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        F8.a aVarE = com.google.crypto.tink.internal.s.e("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f49492a = aVarE;
        f49493b = com.google.crypto.tink.internal.k.a(new C4511j(), q.class, com.google.crypto.tink.internal.p.class);
        f49494c = com.google.crypto.tink.internal.j.a(new C4512k(), aVarE, com.google.crypto.tink.internal.p.class);
        f49495d = com.google.crypto.tink.internal.c.a(new C4513l(), C4516o.class, com.google.crypto.tink.internal.o.class);
        f49496e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0483b() { // from class: s8.r
            @Override // com.google.crypto.tink.internal.b.InterfaceC0483b
            public final r8.g a(com.google.crypto.tink.internal.q qVar, r8.y yVar) {
                return s.b((com.google.crypto.tink.internal.o) qVar, yVar);
            }
        }, aVarE, com.google.crypto.tink.internal.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4516o b(com.google.crypto.tink.internal.o oVar, r8.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            C0994l c0994lD0 = C0994l.d0(oVar.g(), C2905o.b());
            if (c0994lD0.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C4516o.a().e(q.a().c(c0994lD0.a0().size()).b(12).d(16).e(e(oVar.e())).a()).d(F8.b.a(c0994lD0.a0().G(), r8.y.b(yVar))).c(oVar.c()).a();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f49493b);
        iVar.g(f49494c);
        iVar.f(f49495d);
        iVar.e(f49496e);
    }

    private static q.c e(D8.I i10) throws GeneralSecurityException {
        int i11 = a.f49497a[i10.ordinal()];
        if (i11 == 1) {
            return q.c.f49488b;
        }
        if (i11 == 2 || i11 == 3) {
            return q.c.f49489c;
        }
        if (i11 == 4) {
            return q.c.f49490d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.e());
    }
}
