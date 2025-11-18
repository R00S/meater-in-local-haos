package z8;

import D8.I;
import D8.u;
import D8.v;
import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.internal.s;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import r8.y;
import s8.C4511j;
import s8.C4512k;
import s8.C4513l;
import z8.l;

/* compiled from: HmacProtoSerialization.java */
/* loaded from: classes2.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final F8.a f53905a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.k<l, com.google.crypto.tink.internal.p> f53906b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f53907c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.c<i, com.google.crypto.tink.internal.o> f53908d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f53909e;

    /* compiled from: HmacProtoSerialization.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53910a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f53911b;

        static {
            int[] iArr = new int[I.values().length];
            f53911b = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53911b[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53911b[I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53911b[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[u.values().length];
            f53910a = iArr2;
            try {
                iArr2[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53910a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53910a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f53910a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f53910a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        F8.a aVarE = s.e("type.googleapis.com/google.crypto.tink.HmacKey");
        f53905a = aVarE;
        f53906b = com.google.crypto.tink.internal.k.a(new C4511j(), l.class, com.google.crypto.tink.internal.p.class);
        f53907c = com.google.crypto.tink.internal.j.a(new C4512k(), aVarE, com.google.crypto.tink.internal.p.class);
        f53908d = com.google.crypto.tink.internal.c.a(new C4513l(), i.class, com.google.crypto.tink.internal.o.class);
        f53909e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0483b() { // from class: z8.m
            @Override // com.google.crypto.tink.internal.b.InterfaceC0483b
            public final r8.g a(com.google.crypto.tink.internal.q qVar, y yVar) {
                return n.b((com.google.crypto.tink.internal.o) qVar, yVar);
            }
        }, aVarE, com.google.crypto.tink.internal.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i b(com.google.crypto.tink.internal.o oVar, y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            v vVarH0 = v.h0(oVar.g(), C2905o.b());
            if (vVarH0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return i.c().e(l.a().c(vVarH0.c0().size()).d(vVarH0.d0().c0()).b(e(vVarH0.d0().b0())).e(f(oVar.e())).a()).d(F8.b.a(vVarH0.c0().G(), y.b(yVar))).c(oVar.c()).a();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f53906b);
        iVar.g(f53907c);
        iVar.f(f53908d);
        iVar.e(f53909e);
    }

    private static l.c e(u uVar) throws GeneralSecurityException {
        int i10 = a.f53910a[uVar.ordinal()];
        if (i10 == 1) {
            return l.c.f53894b;
        }
        if (i10 == 2) {
            return l.c.f53895c;
        }
        if (i10 == 3) {
            return l.c.f53896d;
        }
        if (i10 == 4) {
            return l.c.f53897e;
        }
        if (i10 == 5) {
            return l.c.f53898f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + uVar.e());
    }

    private static l.d f(I i10) throws GeneralSecurityException {
        int i11 = a.f53911b[i10.ordinal()];
        if (i11 == 1) {
            return l.d.f53900b;
        }
        if (i11 == 2) {
            return l.d.f53901c;
        }
        if (i11 == 3) {
            return l.d.f53902d;
        }
        if (i11 == 4) {
            return l.d.f53903e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.e());
    }
}
