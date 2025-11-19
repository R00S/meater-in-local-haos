package P5;

import android.content.Context;
import android.content.res.Resources;
import java.text.Normalizer;

/* compiled from: StringUtils.java */
/* loaded from: classes2.dex */
public class H {
    public static int a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String lowerCase = str.trim().toLowerCase();
        int iIndexOf = lowerCase.indexOf("|");
        if (iIndexOf >= 0) {
            lowerCase = lowerCase.substring(iIndexOf + 1);
        }
        int iIndexOf2 = lowerCase.indexOf("v");
        if (iIndexOf2 >= 0) {
            lowerCase = lowerCase.substring(iIndexOf2 + 1);
        }
        String strReplaceAll = lowerCase.replaceAll("\\D+", "");
        if (strReplaceAll.trim().isEmpty()) {
            return 0;
        }
        return Integer.parseInt("" + strReplaceAll.charAt(0));
    }

    public static String b(String str) {
        return c(str, true);
    }

    public static String c(String str, boolean z10) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        Context contextH = x4.g.h();
        String strD = d(contextH.getResources(), contextH.getPackageName(), str);
        if (strD != null && !strD.isEmpty()) {
            return strD;
        }
        if (z10) {
            return g(str.replace('_', ' '));
        }
        return null;
    }

    public static String d(Resources resources, String str, String str2) {
        int identifier;
        if (resources == null || str == null || str2 == null || str2.trim().isEmpty() || (identifier = resources.getIdentifier(str2.trim().toLowerCase().replace("-", "_").replace(" ", "_"), "string", str)) <= 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static String e(String str) {
        return str == null ? "" : str.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();
    }

    public static String f(String str) {
        return e(h(str));
    }

    public static String g(String str) {
        if (str == null || str.trim().isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.trim().split(" ")) {
            String strI = i(str2);
            if (strI.length() > 0) {
                if (sb2.length() != 0) {
                    strI = " " + strI;
                }
                sb2.append(strI);
            }
        }
        return sb2.toString();
    }

    public static String h(String str) {
        return str == null ? "" : Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    private static String i(String str) {
        int length = str == null ? 0 : str.trim().length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toUpperCase();
        }
        return String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1).toLowerCase();
    }
}
