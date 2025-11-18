package Mc;

/* compiled from: Strings.java */
/* loaded from: classes3.dex */
public final class b {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return b(charSequence, h(charSequence2));
    }

    public static boolean b(CharSequence charSequence, char[] cArr) {
        if (!f(charSequence) && !g(cArr)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            int i10 = length - 1;
            int i11 = length2 - 1;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = charSequence.charAt(i12);
                for (int i13 = 0; i13 < length2; i13++) {
                    if (cArr[i13] == cCharAt) {
                        if (!Character.isHighSurrogate(cCharAt) || i13 == i11) {
                            return true;
                        }
                        if (i12 < i10 && cArr[i13 + 1] == charSequence.charAt(i12 + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static int c(CharSequence charSequence, CharSequence charSequence2) {
        int length = 0;
        if (f(charSequence) || f(charSequence2)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            int iE = e(charSequence, charSequence2, length);
            if (iE == -1) {
                return i10;
            }
            i10++;
            length = iE + charSequence2.length();
        }
    }

    public static boolean d(CharSequence charSequence, CharSequence[] charSequenceArr) {
        boolean z10 = charSequence == null && charSequenceArr == null;
        if (charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                z10 = z10 || charSequence2.equals(charSequence);
            }
        }
        return z10;
    }

    private static int e(CharSequence charSequence, CharSequence charSequence2, int i10) {
        return charSequence.toString().indexOf(charSequence2.toString(), i10);
    }

    public static boolean f(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    private static boolean g(char[] cArr) {
        return cArr == null || cArr.length == 0;
    }

    private static char[] h(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).toCharArray();
        }
        int length = charSequence.length();
        char[] cArr = new char[charSequence.length()];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = charSequence.charAt(i10);
        }
        return cArr;
    }
}
