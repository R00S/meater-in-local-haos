package sb;

import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: RenderingUtils.kt */
/* loaded from: classes3.dex */
public final class G {
    public static final String a(qb.d dVar) {
        C3862t.g(dVar, "<this>");
        List<qb.f> listH = dVar.h();
        C3862t.f(listH, "pathSegments(...)");
        return c(listH);
    }

    public static final String b(qb.f fVar) {
        C3862t.g(fVar, "<this>");
        if (!e(fVar)) {
            String strJ = fVar.j();
            C3862t.f(strJ, "asString(...)");
            return strJ;
        }
        StringBuilder sb2 = new StringBuilder();
        String strJ2 = fVar.j();
        C3862t.f(strJ2, "asString(...)");
        sb2.append('`' + strJ2);
        sb2.append('`');
        return sb2.toString();
    }

    public static final String c(List<qb.f> pathSegments) {
        C3862t.g(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (qb.f fVar : pathSegments) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(fVar));
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public static final String d(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        C3862t.g(lowerRendered, "lowerRendered");
        C3862t.g(lowerPrefix, "lowerPrefix");
        C3862t.g(upperRendered, "upperRendered");
        C3862t.g(upperPrefix, "upperPrefix");
        C3862t.g(foldedPrefix, "foldedPrefix");
        if (Ub.n.G(lowerRendered, lowerPrefix, false, 2, null) && Ub.n.G(upperRendered, upperPrefix, false, 2, null)) {
            String strSubstring = lowerRendered.substring(lowerPrefix.length());
            C3862t.f(strSubstring, "substring(...)");
            String strSubstring2 = upperRendered.substring(upperPrefix.length());
            C3862t.f(strSubstring2, "substring(...)");
            String str = foldedPrefix + strSubstring;
            if (C3862t.b(strSubstring, strSubstring2)) {
                return str;
            }
            if (f(strSubstring, strSubstring2)) {
                return str + '!';
            }
        }
        return null;
    }

    private static final boolean e(qb.f fVar) {
        String strJ = fVar.j();
        C3862t.f(strJ, "asString(...)");
        if (!B.f49548a.contains(strJ)) {
            int i10 = 0;
            while (true) {
                if (i10 < strJ.length()) {
                    char cCharAt = strJ.charAt(i10);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i10++;
                } else if (strJ.length() != 0 && Character.isJavaIdentifierStart(strJ.codePointAt(0))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "lower"
            kotlin.jvm.internal.C3862t.g(r7, r0)
            java.lang.String r0 = "upper"
            kotlin.jvm.internal.C3862t.g(r8, r0)
            r5 = 4
            r6 = 0
            java.lang.String r2 = "?"
            java.lang.String r3 = ""
            r4 = 0
            r1 = r8
            java.lang.String r0 = Ub.n.C(r1, r2, r3, r4, r5, r6)
            boolean r0 = kotlin.jvm.internal.C3862t.b(r7, r0)
            if (r0 != 0) goto L5a
            r0 = 2
            r1 = 0
            java.lang.String r2 = "?"
            r3 = 0
            boolean r0 = Ub.n.s(r8, r2, r3, r0, r1)
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r1 = 63
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.C3862t.b(r0, r8)
            if (r0 != 0) goto L5a
        L3e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ")?"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = kotlin.jvm.internal.C3862t.b(r7, r8)
            if (r7 == 0) goto L5b
        L5a:
            r3 = 1
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.G.f(java.lang.String, java.lang.String):boolean");
    }
}
