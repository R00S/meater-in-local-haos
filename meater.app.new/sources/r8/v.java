package r8;

import D8.C;
import D8.I;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PrimitiveSet.java */
/* loaded from: classes2.dex */
public final class v<P> {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<d, List<c<P>>> f48464a;

    /* renamed from: b, reason: collision with root package name */
    private c<P> f48465b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<P> f48466c;

    /* renamed from: d, reason: collision with root package name */
    private final B8.a f48467d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f48468e;

    /* compiled from: PrimitiveSet.java */
    public static class b<P> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<P> f48469a;

        /* renamed from: b, reason: collision with root package name */
        private ConcurrentMap<d, List<c<P>>> f48470b;

        /* renamed from: c, reason: collision with root package name */
        private c<P> f48471c;

        /* renamed from: d, reason: collision with root package name */
        private B8.a f48472d;

        private b<P> c(P p10, P p11, C.c cVar, boolean z10) throws GeneralSecurityException {
            if (this.f48470b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (p10 == null && p11 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (cVar.g0() != D8.z.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c<P> cVarB = v.b(p10, p11, cVar, this.f48470b);
            if (z10) {
                if (this.f48471c != null) {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                this.f48471c = cVarB;
            }
            return this;
        }

        public b<P> a(P p10, P p11, C.c cVar) {
            return c(p10, p11, cVar, false);
        }

        public b<P> b(P p10, P p11, C.c cVar) {
            return c(p10, p11, cVar, true);
        }

        public v<P> d() {
            ConcurrentMap<d, List<c<P>>> concurrentMap = this.f48470b;
            if (concurrentMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            v<P> vVar = new v<>(concurrentMap, this.f48471c, this.f48472d, this.f48469a);
            this.f48470b = null;
            return vVar;
        }

        public b<P> e(B8.a aVar) {
            if (this.f48470b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f48472d = aVar;
            return this;
        }

        private b(Class<P> cls) {
            this.f48470b = new ConcurrentHashMap();
            this.f48469a = cls;
            this.f48472d = B8.a.f1896b;
        }
    }

    /* compiled from: PrimitiveSet.java */
    public static final class c<P> {

        /* renamed from: a, reason: collision with root package name */
        private final P f48473a;

        /* renamed from: b, reason: collision with root package name */
        private final P f48474b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f48475c;

        /* renamed from: d, reason: collision with root package name */
        private final D8.z f48476d;

        /* renamed from: e, reason: collision with root package name */
        private final I f48477e;

        /* renamed from: f, reason: collision with root package name */
        private final int f48478f;

        /* renamed from: g, reason: collision with root package name */
        private final String f48479g;

        /* renamed from: h, reason: collision with root package name */
        private final g f48480h;

        c(P p10, P p11, byte[] bArr, D8.z zVar, I i10, int i11, String str, g gVar) {
            this.f48473a = p10;
            this.f48474b = p11;
            this.f48475c = Arrays.copyOf(bArr, bArr.length);
            this.f48476d = zVar;
            this.f48477e = i10;
            this.f48478f = i11;
            this.f48479g = str;
            this.f48480h = gVar;
        }

        public P a() {
            return this.f48473a;
        }

        public final byte[] b() {
            byte[] bArr = this.f48475c;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public g c() {
            return this.f48480h;
        }

        public int d() {
            return this.f48478f;
        }

        public String e() {
            return this.f48479g;
        }

        public I f() {
            return this.f48477e;
        }

        public P g() {
            return this.f48474b;
        }

        public D8.z h() {
            return this.f48476d;
        }
    }

    /* compiled from: PrimitiveSet.java */
    private static class d implements Comparable<d> {

        /* renamed from: B, reason: collision with root package name */
        private final byte[] f48481B;

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            byte[] bArr = this.f48481B;
            int length = bArr.length;
            byte[] bArr2 = dVar.f48481B;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i10 = 0;
            while (true) {
                byte[] bArr3 = this.f48481B;
                if (i10 >= bArr3.length) {
                    return 0;
                }
                byte b10 = bArr3[i10];
                byte b11 = dVar.f48481B[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
                i10++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return Arrays.equals(this.f48481B, ((d) obj).f48481B);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f48481B);
        }

        public String toString() {
            return E8.k.b(this.f48481B);
        }

        private d(byte[] bArr) {
            this.f48481B = Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <P> c<P> b(P p10, P p11, C.c cVar, ConcurrentMap<d, List<c<P>>> concurrentMap) {
        Integer numValueOf = Integer.valueOf(cVar.d0());
        if (cVar.e0() == I.RAW) {
            numValueOf = null;
        }
        c<P> cVar2 = new c<>(p10, p11, C4366d.a(cVar), cVar.g0(), cVar.e0(), cVar.d0(), cVar.c0().d0(), com.google.crypto.tink.internal.i.a().d(com.google.crypto.tink.internal.o.b(cVar.c0().d0(), cVar.c0().e0(), cVar.c0().c0(), cVar.e0(), numValueOf), C4368f.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.b());
        List<c<P>> listPut = concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    public static <P> b<P> j(Class<P> cls) {
        return new b<>(cls);
    }

    public Collection<List<c<P>>> c() {
        return this.f48464a.values();
    }

    public B8.a d() {
        return this.f48467d;
    }

    public c<P> e() {
        return this.f48465b;
    }

    public List<c<P>> f(byte[] bArr) {
        List<c<P>> list = this.f48464a.get(new d(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class<P> g() {
        return this.f48466c;
    }

    public List<c<P>> h() {
        return f(C4366d.f48434a);
    }

    public boolean i() {
        return !this.f48467d.b().isEmpty();
    }

    private v(ConcurrentMap<d, List<c<P>>> concurrentMap, c<P> cVar, B8.a aVar, Class<P> cls) {
        this.f48464a = concurrentMap;
        this.f48465b = cVar;
        this.f48466c = cls;
        this.f48467d = aVar;
        this.f48468e = false;
    }
}
