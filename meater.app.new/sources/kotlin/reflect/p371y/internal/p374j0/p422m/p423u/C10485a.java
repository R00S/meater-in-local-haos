package kotlin.reflect.p371y.internal.p374j0.p422m.p423u;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10547v;

/* compiled from: capitalizeDecapitalize.kt */
/* renamed from: kotlin.f0.y.e.j0.m.u.a */
/* loaded from: classes3.dex */
public final class C10485a {
    /* renamed from: a */
    public static final String m37224a(String str) {
        C9801m.m32346f(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if ('a' <= cCharAt && cCharAt < '{') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        String strSubstring = str.substring(1);
        C9801m.m32345e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return upperCase + strSubstring;
    }

    /* renamed from: b */
    public static final String m37225b(String str) {
        C9801m.m32346f(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if ('A' <= cCharAt && cCharAt < '[') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        C9801m.m32345e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return lowerCase + strSubstring;
    }

    /* renamed from: c */
    public static final String m37226c(String str, boolean z) {
        Integer next;
        C9801m.m32346f(str, "<this>");
        if ((str.length() == 0) || !m37227d(str, 0, z)) {
            return str;
        }
        if (str.length() == 1 || !m37227d(str, 1, z)) {
            if (z) {
                return m37225b(str);
            }
            if (!(str.length() > 0)) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            C9801m.m32345e(strSubstring, "this as java.lang.String).substring(startIndex)");
            return lowerCase + strSubstring;
        }
        Iterator<Integer> it = C10547v.m37550P(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!m37227d(str, next.intValue(), z)) {
                break;
            }
        }
        Integer num = next;
        if (num == null) {
            return m37228e(str, z);
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb = new StringBuilder();
        String strSubstring2 = str.substring(0, iIntValue);
        C9801m.m32345e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(m37228e(strSubstring2, z));
        String strSubstring3 = str.substring(iIntValue);
        C9801m.m32345e(strSubstring3, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring3);
        return sb.toString();
    }

    /* renamed from: d */
    private static final boolean m37227d(String str, int i2, boolean z) {
        char cCharAt = str.charAt(i2);
        return z ? 'A' <= cCharAt && cCharAt < '[' : Character.isUpperCase(cCharAt);
    }

    /* renamed from: e */
    private static final String m37228e(String str, boolean z) {
        if (z) {
            return m37229f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C9801m.m32345e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    /* renamed from: f */
    public static final String m37229f(String str) {
        C9801m.m32346f(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        C9801m.m32345e(string, "builder.toString()");
        return string;
    }
}
