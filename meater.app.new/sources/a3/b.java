package a3;

import X1.C1804a;
import X1.C1809f;
import X1.L;
import X1.n;
import X1.y;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.C3910c;

/* compiled from: WebvttCssParser.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f20020c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f20021d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final y f20022a = new y();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f20023b = new StringBuilder();

    private void a(c cVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f20020c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                cVar.z((String) C1804a.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrL1 = L.l1(str, "\\.");
        String str2 = strArrL1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            cVar.y(str2.substring(0, iIndexOf2));
            cVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (strArrL1.length > 1) {
            cVar.w((String[]) L.W0(strArrL1, 1, strArrL1.length));
        }
    }

    private static boolean b(y yVar) {
        int iF = yVar.f();
        int iG = yVar.g();
        byte[] bArrE = yVar.e();
        if (iF + 2 > iG) {
            return false;
        }
        int i10 = iF + 1;
        if (bArrE[iF] != 47) {
            return false;
        }
        int i11 = iF + 2;
        if (bArrE[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iG) {
                yVar.X(iG - yVar.f());
                return true;
            }
            if (((char) bArrE[i11]) == '*' && ((char) bArrE[i12]) == '/') {
                i11 += 2;
                iG = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(y yVar) {
        char cK = k(yVar, yVar.f());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        yVar.X(1);
        return true;
    }

    private static void e(String str, c cVar) {
        Matcher matcher = f20021d.matcher(C3910c.e(str));
        if (!matcher.matches()) {
            n.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) C1804a.e(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) C1804a.e(matcher.group(1))));
    }

    private static String f(y yVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iF = yVar.f();
        int iG = yVar.g();
        while (iF < iG && !z10) {
            char c10 = (char) yVar.e()[iF];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iF++;
                sb2.append(c10);
            }
        }
        yVar.X(iF - yVar.f());
        return sb2.toString();
    }

    static String g(y yVar, StringBuilder sb2) {
        n(yVar);
        if (yVar.a() == 0) {
            return null;
        }
        String strF = f(yVar, sb2);
        if (!"".equals(strF)) {
            return strF;
        }
        return "" + ((char) yVar.H());
    }

    private static String h(y yVar, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iF = yVar.f();
            String strG = g(yVar, sb2);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                yVar.W(iF);
                z10 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    private static String i(y yVar, StringBuilder sb2) {
        n(yVar);
        if (yVar.a() < 5 || !"::cue".equals(yVar.E(5))) {
            return null;
        }
        int iF = yVar.f();
        String strG = g(yVar, sb2);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            yVar.W(iF);
            return "";
        }
        String strL = "(".equals(strG) ? l(yVar) : null;
        if (")".equals(g(yVar, sb2))) {
            return strL;
        }
        return null;
    }

    private static void j(y yVar, c cVar, StringBuilder sb2) {
        n(yVar);
        String strF = f(yVar, sb2);
        if (!"".equals(strF) && ":".equals(g(yVar, sb2))) {
            n(yVar);
            String strH = h(yVar, sb2);
            if (strH == null || "".equals(strH)) {
                return;
            }
            int iF = yVar.f();
            String strG = g(yVar, sb2);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    yVar.W(iF);
                }
            }
            if ("color".equals(strF)) {
                cVar.q(C1809f.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                cVar.n(C1809f.b(strH));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    cVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        cVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z10 = false;
                }
                cVar.p(z10);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if ("underline".equals(strH)) {
                    cVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                cVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if ("bold".equals(strH)) {
                    cVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if ("italic".equals(strH)) {
                    cVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, cVar);
            }
        }
    }

    private static char k(y yVar, int i10) {
        return (char) yVar.e()[i10];
    }

    private static String l(y yVar) {
        int iF = yVar.f();
        int iG = yVar.g();
        boolean z10 = false;
        while (iF < iG && !z10) {
            int i10 = iF + 1;
            z10 = ((char) yVar.e()[iF]) == ')';
            iF = i10;
        }
        return yVar.E((iF - 1) - yVar.f()).trim();
    }

    static void m(y yVar) {
        while (!TextUtils.isEmpty(yVar.s())) {
        }
    }

    static void n(y yVar) {
        while (true) {
            for (boolean z10 = true; yVar.a() > 0 && z10; z10 = false) {
                if (c(yVar) || b(yVar)) {
                    break;
                }
            }
            return;
        }
    }

    public List<c> d(y yVar) {
        this.f20023b.setLength(0);
        int iF = yVar.f();
        m(yVar);
        this.f20022a.U(yVar.e(), yVar.f());
        this.f20022a.W(iF);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f20022a, this.f20023b);
            if (strI == null) {
                return arrayList;
            }
            if (!"{".equals(g(this.f20022a, this.f20023b))) {
                return arrayList;
            }
            c cVar = new c();
            a(cVar, strI);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iF2 = this.f20022a.f();
                String strG = g(this.f20022a, this.f20023b);
                boolean z11 = strG == null || "}".equals(strG);
                if (!z11) {
                    this.f20022a.W(iF2);
                    j(this.f20022a, cVar, this.f20023b);
                }
                str = strG;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
    }
}
