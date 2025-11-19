package ab;

import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: propertiesConventionUtil.kt */
/* renamed from: ab.N, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1933N {
    public static final List<qb.f> a(qb.f name) {
        C3862t.g(name, "name");
        String strJ = name.j();
        C3862t.f(strJ, "asString(...)");
        return C1927H.c(strJ) ? kotlin.collections.r.q(b(name)) : C1927H.d(strJ) ? f(name) : C1950j.f20256a.b(name);
    }

    public static final qb.f b(qb.f methodName) {
        C3862t.g(methodName, "methodName");
        qb.f fVarE = e(methodName, "get", false, null, 12, null);
        return fVarE == null ? e(methodName, "is", false, null, 8, null) : fVarE;
    }

    public static final qb.f c(qb.f methodName, boolean z10) {
        C3862t.g(methodName, "methodName");
        return e(methodName, "set", false, z10 ? "is" : null, 4, null);
    }

    private static final qb.f d(qb.f fVar, String str, boolean z10, String str2) {
        if (fVar.u()) {
            return null;
        }
        String strP = fVar.p();
        C3862t.f(strP, "getIdentifier(...)");
        if (!Ub.n.G(strP, str, false, 2, null) || strP.length() == str.length()) {
            return null;
        }
        char cCharAt = strP.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return qb.f.t(str2 + Ub.n.p0(strP, str));
        }
        if (!z10) {
            return fVar;
        }
        String strC = Pb.a.c(Ub.n.p0(strP, str), true);
        if (qb.f.v(strC)) {
            return qb.f.t(strC);
        }
        return null;
    }

    static /* synthetic */ qb.f e(qb.f fVar, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z10, str2);
    }

    public static final List<qb.f> f(qb.f methodName) {
        C3862t.g(methodName, "methodName");
        return kotlin.collections.r.r(c(methodName, false), c(methodName, true));
    }
}
