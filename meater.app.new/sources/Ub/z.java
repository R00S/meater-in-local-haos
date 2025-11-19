package Ub;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Strings.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"", "", "W0", "(Ljava/lang/CharSequence;)C", "", "", "n", "V0", "(Ljava/lang/String;I)Ljava/lang/String;", "X0", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class z extends y {
    public static final String V0(String str, int i10) {
        C3862t.g(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(Ha.g.g(i10, str.length()));
            C3862t.f(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char W0(CharSequence charSequence) {
        C3862t.g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(n.S(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String X0(String str, int i10) {
        C3862t.g(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, Ha.g.g(i10, str.length()));
            C3862t.f(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
