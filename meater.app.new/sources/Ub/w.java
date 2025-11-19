package Ub;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.AbstractC3822c;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringsJVM.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u0000*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0015\u001a\u00020\u0000*\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0000*\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0017*\u00020\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001d\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0005\u001a+\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010!\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\u0005\u001a;\u0010%\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010(\u001a\u00020\u0000*\u00020'2\u0006\u0010\u0010\u001a\u00020\u0012¢\u0006\u0004\b(\u0010)\"%\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u00000+j\b\u0012\u0004\u0012\u00020\u0000`,*\u00020*8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"", "other", "", "ignoreCase", "t", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "oldChar", "newChar", "z", "(Ljava/lang/String;CCZ)Ljava/lang/String;", "oldValue", "newValue", "A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "", "n", "([C)Ljava/lang/String;", "", "startIndex", "endIndex", "o", "([CII)Ljava/lang/String;", "", "p", "([B)Ljava/lang/String;", "q", "(Ljava/lang/String;)[B", "prefix", "E", "D", "(Ljava/lang/String;Ljava/lang/String;IZ)Z", "suffix", "r", "thisOffset", "otherOffset", "length", "w", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "", "y", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "v", "(Lkotlin/jvm/internal/V;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class w extends v {
    public static final String A(String str, String oldValue, String newValue, boolean z10) {
        C3862t.g(str, "<this>");
        C3862t.g(oldValue, "oldValue");
        C3862t.g(newValue, "newValue");
        int i10 = 0;
        int iU = x.U(str, oldValue, 0, z10);
        if (iU < 0) {
            return str;
        }
        int length = oldValue.length();
        int iD = Ha.g.d(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iU);
            sb2.append(newValue);
            i10 = iU + length;
            if (iU >= str.length()) {
                break;
            }
            iU = x.U(str, oldValue, iU + iD, z10);
        } while (iU > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String B(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return z(str, c10, c11, z10);
    }

    public static /* synthetic */ String C(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return A(str, str2, str3, z10);
    }

    public static boolean D(String str, String prefix, int i10, boolean z10) {
        C3862t.g(str, "<this>");
        C3862t.g(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : w(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean E(String str, String prefix, boolean z10) {
        C3862t.g(str, "<this>");
        C3862t.g(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : w(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean F(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return n.D(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean G(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return n.E(str, str2, z10);
    }

    public static String n(char[] cArr) {
        C3862t.g(cArr, "<this>");
        return new String(cArr);
    }

    public static String o(char[] cArr, int i10, int i11) {
        C3862t.g(cArr, "<this>");
        AbstractC3822c.INSTANCE.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static String p(byte[] bArr) {
        C3862t.g(bArr, "<this>");
        return new String(bArr, d.UTF_8);
    }

    public static byte[] q(String str) {
        C3862t.g(str, "<this>");
        byte[] bytes = str.getBytes(d.UTF_8);
        C3862t.f(bytes, "getBytes(...)");
        return bytes;
    }

    public static final boolean r(String str, String suffix, boolean z10) {
        C3862t.g(str, "<this>");
        C3862t.g(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : w(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean s(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return r(str, str2, z10);
    }

    public static boolean t(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean u(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return n.t(str, str2, z10);
    }

    public static Comparator<String> v(V v10) {
        C3862t.g(v10, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        C3862t.f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static final boolean w(String str, int i10, String other, int i11, int i12, boolean z10) {
        C3862t.g(str, "<this>");
        C3862t.g(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static /* synthetic */ boolean x(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return w(str, i10, str2, i11, i12, z10);
    }

    public static String y(CharSequence charSequence, int i10) {
        C3862t.g(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        C3862t.d(string);
        return string;
    }

    public static final String z(String str, char c10, char c11, boolean z10) {
        C3862t.g(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            C3862t.f(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (c.d(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }
}
