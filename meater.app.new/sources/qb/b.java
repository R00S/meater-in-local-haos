package qb;

import Ub.n;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ClassId.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f48178d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final c f48179a;

    /* renamed from: b, reason: collision with root package name */
    private final c f48180b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f48181c;

    /* compiled from: ClassId.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public static /* synthetic */ b b(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(str, z10);
        }

        public final b a(String string, boolean z10) {
            String strC;
            String str;
            C3862t.g(string, "string");
            int iX = n.X(string, '`', 0, false, 6, null);
            if (iX == -1) {
                iX = string.length();
            }
            int iE0 = n.e0(string, "/", iX, false, 4, null);
            if (iE0 == -1) {
                strC = n.C(string, "`", "", false, 4, null);
                str = "";
            } else {
                String strSubstring = string.substring(0, iE0);
                C3862t.f(strSubstring, "substring(...)");
                String strB = n.B(strSubstring, '/', '.', false, 4, null);
                String strSubstring2 = string.substring(iE0 + 1);
                C3862t.f(strSubstring2, "substring(...)");
                strC = n.C(strSubstring2, "`", "", false, 4, null);
                str = strB;
            }
            return new b(new c(str), new c(strC), z10);
        }

        public final b c(c topLevelFqName) {
            C3862t.g(topLevelFqName, "topLevelFqName");
            c cVarE = topLevelFqName.e();
            C3862t.f(cVarE, "parent(...)");
            f fVarG = topLevelFqName.g();
            C3862t.f(fVarG, "shortName(...)");
            return new b(cVarE, fVarG);
        }

        private a() {
        }
    }

    public b(c packageFqName, c relativeClassName, boolean z10) {
        C3862t.g(packageFqName, "packageFqName");
        C3862t.g(relativeClassName, "relativeClassName");
        this.f48179a = packageFqName;
        this.f48180b = relativeClassName;
        this.f48181c = z10;
        relativeClassName.d();
    }

    private static final String c(c cVar) {
        String strB = cVar.b();
        C3862t.f(strB, "asString(...)");
        if (!n.K(strB, '/', false, 2, null)) {
            return strB;
        }
        return '`' + strB + '`';
    }

    public static final b k(c cVar) {
        return f48178d.c(cVar);
    }

    public final c a() {
        if (this.f48179a.d()) {
            return this.f48180b;
        }
        return new c(this.f48179a.b() + '.' + this.f48180b.b());
    }

    public final String b() {
        if (this.f48179a.d()) {
            return c(this.f48180b);
        }
        StringBuilder sb2 = new StringBuilder();
        String strB = this.f48179a.b();
        C3862t.f(strB, "asString(...)");
        sb2.append(n.B(strB, '.', '/', false, 4, null));
        sb2.append("/");
        sb2.append(c(this.f48180b));
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public final b d(f name) {
        C3862t.g(name, "name");
        c cVar = this.f48179a;
        c cVarC = this.f48180b.c(name);
        C3862t.f(cVarC, "child(...)");
        return new b(cVar, cVarC, this.f48181c);
    }

    public final b e() {
        c cVarE = this.f48180b.e();
        C3862t.f(cVarE, "parent(...)");
        if (cVarE.d()) {
            return null;
        }
        return new b(this.f48179a, cVarE, this.f48181c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C3862t.b(this.f48179a, bVar.f48179a) && C3862t.b(this.f48180b, bVar.f48180b) && this.f48181c == bVar.f48181c;
    }

    public final c f() {
        return this.f48179a;
    }

    public final c g() {
        return this.f48180b;
    }

    public final f h() {
        f fVarG = this.f48180b.g();
        C3862t.f(fVarG, "shortName(...)");
        return fVarG;
    }

    public int hashCode() {
        return (((this.f48179a.hashCode() * 31) + this.f48180b.hashCode()) * 31) + Boolean.hashCode(this.f48181c);
    }

    public final boolean i() {
        return this.f48181c;
    }

    public final boolean j() {
        return !this.f48180b.e().d();
    }

    public String toString() {
        if (!this.f48179a.d()) {
            return b();
        }
        return '/' + b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(c packageFqName, f topLevelName) {
        C3862t.g(packageFqName, "packageFqName");
        C3862t.g(topLevelName, "topLevelName");
        c cVarK = c.k(topLevelName);
        C3862t.f(cVarK, "topLevel(...)");
        this(packageFqName, cVarK, false);
    }
}
