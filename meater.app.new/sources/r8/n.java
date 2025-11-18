package r8;

import D8.C;
import D8.D;
import D8.I;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r8.v;

/* compiled from: KeysetHandle.java */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final C f48454a;

    /* renamed from: b, reason: collision with root package name */
    private final List<b> f48455b;

    /* renamed from: c, reason: collision with root package name */
    private final B8.a f48456c = B8.a.f1896b;

    /* compiled from: KeysetHandle.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48457a;

        static {
            int[] iArr = new int[D8.z.values().length];
            f48457a = iArr;
            try {
                iArr[D8.z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48457a[D8.z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48457a[D8.z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: KeysetHandle.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final g f48458a;

        /* renamed from: b, reason: collision with root package name */
        private final k f48459b;

        /* renamed from: c, reason: collision with root package name */
        private final int f48460c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f48461d;

        /* synthetic */ b(g gVar, k kVar, int i10, boolean z10, a aVar) {
            this(gVar, kVar, i10, z10);
        }

        public g a() {
            return this.f48458a;
        }

        private b(g gVar, k kVar, int i10, boolean z10) {
            this.f48458a = gVar;
            this.f48459b = kVar;
            this.f48460c = i10;
            this.f48461d = z10;
        }
    }

    private n(C c10, List<b> list) {
        this.f48454a = c10;
        this.f48455b = list;
    }

    private static void a(D8.t tVar) throws GeneralSecurityException {
        if (tVar == null || tVar.a0().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static void b(C c10) throws GeneralSecurityException {
        if (c10 == null || c10.d0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static C c(D8.t tVar, InterfaceC4363a interfaceC4363a, byte[] bArr) throws GeneralSecurityException {
        try {
            C cJ0 = C.j0(interfaceC4363a.b(tVar.a0().G(), bArr), C2905o.b());
            b(cJ0);
            return cJ0;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static D8.t d(C c10, InterfaceC4363a interfaceC4363a, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrA = interfaceC4363a.a(c10.l(), bArr);
        try {
            if (C.j0(interfaceC4363a.b(bArrA, bArr), C2905o.b()).equals(c10)) {
                return D8.t.b0().D(AbstractC2898h.j(bArrA)).E(z.b(c10)).e();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    static final n e(C c10) throws GeneralSecurityException {
        b(c10);
        return new n(c10, f(c10));
    }

    private static List<b> f(C c10) {
        ArrayList arrayList = new ArrayList(c10.d0());
        for (C.c cVar : c10.e0()) {
            int iD0 = cVar.d0();
            try {
                arrayList.add(new b(com.google.crypto.tink.internal.i.a().d(q(cVar), C4368f.a()), m(cVar.g0()), iD0, iD0 == c10.g0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private <B> B g(g gVar, Class<B> cls) {
        try {
            return (B) x.c(gVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static <B> B j(C.c cVar, Class<B> cls) throws GeneralSecurityException {
        try {
            return (B) x.e(cVar.c0(), cls);
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <B, P> P l(Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        z.d(this.f48454a);
        v.b bVarJ = v.j(cls2);
        bVarJ.e(this.f48456c);
        for (int i10 = 0; i10 < p(); i10++) {
            C.c cVarC0 = this.f48454a.c0(i10);
            if (cVarC0.g0().equals(D8.z.ENABLED)) {
                Object objJ = j(cVarC0, cls2);
                Object objG = this.f48455b.get(i10) != null ? g(this.f48455b.get(i10).a(), cls2) : null;
                if (cVarC0.d0() == this.f48454a.g0()) {
                    bVarJ.b(objG, objJ, cVarC0);
                } else {
                    bVarJ.a(objG, objJ, cVarC0);
                }
            }
        }
        return (P) x.o(bVarJ.d(), cls);
    }

    private static k m(D8.z zVar) throws GeneralSecurityException {
        int i10 = a.f48457a[zVar.ordinal()];
        if (i10 == 1) {
            return k.f48442b;
        }
        if (i10 == 2) {
            return k.f48443c;
        }
        if (i10 == 3) {
            return k.f48444d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final n n(p pVar, InterfaceC4363a interfaceC4363a) {
        return o(pVar, interfaceC4363a, new byte[0]);
    }

    public static final n o(p pVar, InterfaceC4363a interfaceC4363a, byte[] bArr) throws GeneralSecurityException {
        D8.t tVarA = pVar.a();
        a(tVarA);
        return e(c(tVarA, interfaceC4363a, bArr));
    }

    private static com.google.crypto.tink.internal.o q(C.c cVar) {
        try {
            return com.google.crypto.tink.internal.o.b(cVar.c0().d0(), cVar.c0().e0(), cVar.c0().c0(), cVar.e0(), cVar.e0() == I.RAW ? null : Integer.valueOf(cVar.d0()));
        } catch (GeneralSecurityException e10) {
            throw new TinkBugException("Creating a protokey serialization failed", e10);
        }
    }

    C h() {
        return this.f48454a;
    }

    public D i() {
        return z.b(this.f48454a);
    }

    public <P> P k(Class<P> cls) throws GeneralSecurityException {
        Class<?> clsD = x.d(cls);
        if (clsD != null) {
            return (P) l(cls, clsD);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public int p() {
        return this.f48454a.d0();
    }

    public void r(q qVar, InterfaceC4363a interfaceC4363a) {
        s(qVar, interfaceC4363a, new byte[0]);
    }

    public void s(q qVar, InterfaceC4363a interfaceC4363a, byte[] bArr) {
        qVar.b(d(this.f48454a, interfaceC4363a, bArr));
    }

    public String toString() {
        return i().toString();
    }
}
