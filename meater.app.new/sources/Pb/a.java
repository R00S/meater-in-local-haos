package Pb;

import Ub.n;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C3862t;

/* compiled from: capitalizeDecapitalize.kt */
/* loaded from: classes3.dex */
public final class a {
    public static final String a(String str) {
        char cCharAt;
        C3862t.g(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(cCharAt));
        sb2.append((CharSequence) str, 1, str.length());
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public static final String b(String str) {
        char cCharAt;
        C3862t.g(str, "<this>");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        C3862t.f(strSubstring, "substring(...)");
        return lowerCase + strSubstring;
    }

    public static final String c(String str, boolean z10) {
        Integer next;
        C3862t.g(str, "<this>");
        if (str.length() == 0 || !d(str, 0, z10)) {
            return str;
        }
        if (str.length() == 1 || !d(str, 1, z10)) {
            if (z10) {
                return b(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            C3862t.f(strSubstring, "substring(...)");
            return lowerCase + strSubstring;
        }
        Iterator<Integer> it = n.R(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!d(str, next.intValue(), z10)) {
                break;
            }
        }
        Integer num = next;
        if (num == null) {
            return e(str, z10);
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb2 = new StringBuilder();
        String strSubstring2 = str.substring(0, iIntValue);
        C3862t.f(strSubstring2, "substring(...)");
        sb2.append(e(strSubstring2, z10));
        String strSubstring3 = str.substring(iIntValue);
        C3862t.f(strSubstring3, "substring(...)");
        sb2.append(strSubstring3);
        return sb2.toString();
    }

    private static final boolean d(String str, int i10, boolean z10) {
        char cCharAt = str.charAt(i10);
        return z10 ? 'A' <= cCharAt && cCharAt < '[' : Character.isUpperCase(cCharAt);
    }

    private static final String e(String str, boolean z10) {
        if (z10) {
            return f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C3862t.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String f(String str) {
        C3862t.g(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }
}
