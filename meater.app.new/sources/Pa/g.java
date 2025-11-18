package Pa;

import Pa.f;
import Ub.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: FunctionTypeKindExtractor.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f14169c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final g f14170d = new g(r.p(f.a.f14165e, f.d.f14168e, f.b.f14166e, f.c.f14167e));

    /* renamed from: a, reason: collision with root package name */
    private final List<f> f14171a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<qb.c, List<f>> f14172b;

    /* compiled from: FunctionTypeKindExtractor.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final g a() {
            return g.f14170d;
        }

        private a() {
        }
    }

    /* compiled from: FunctionTypeKindExtractor.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f14173a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14174b;

        public b(f kind, int i10) {
            C3862t.g(kind, "kind");
            this.f14173a = kind;
            this.f14174b = i10;
        }

        public final f a() {
            return this.f14173a;
        }

        public final int b() {
            return this.f14174b;
        }

        public final f c() {
            return this.f14173a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C3862t.b(this.f14173a, bVar.f14173a) && this.f14174b == bVar.f14174b;
        }

        public int hashCode() {
            return (this.f14173a.hashCode() * 31) + Integer.hashCode(this.f14174b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f14173a + ", arity=" + this.f14174b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends f> kinds) {
        C3862t.g(kinds, "kinds");
        this.f14171a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            qb.c cVarB = ((f) obj).b();
            Object arrayList = linkedHashMap.get(cVarB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVarB, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f14172b = linkedHashMap;
    }

    private final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int iCharAt = str.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i10 = (i10 * 10) + iCharAt;
        }
        return Integer.valueOf(i10);
    }

    public final f b(qb.c packageFqName, String className) {
        C3862t.g(packageFqName, "packageFqName");
        C3862t.g(className, "className");
        b bVarC = c(packageFqName, className);
        if (bVarC != null) {
            return bVarC.c();
        }
        return null;
    }

    public final b c(qb.c packageFqName, String className) {
        C3862t.g(packageFqName, "packageFqName");
        C3862t.g(className, "className");
        List<f> list = this.f14172b.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (f fVar : list) {
            if (n.G(className, fVar.a(), false, 2, null)) {
                String strSubstring = className.substring(fVar.a().length());
                C3862t.f(strSubstring, "substring(...)");
                Integer numD = d(strSubstring);
                if (numD != null) {
                    return new b(fVar, numD.intValue());
                }
            }
        }
        return null;
    }
}
