package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, m32267d2 = {"getIndentFunction", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", HttpUrl.FRAGMENT_ENCODE_SET, "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", HttpUrl.FRAGMENT_ENCODE_SET, "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, m32268k = 5, m32269mv = {1, 7, 1}, m32271xi = 49, m32272xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.h0.n */
/* loaded from: classes3.dex */
public class C10539n extends C10538m {

    /* compiled from: Indent.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "line", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.h0.n$a */
    static final class a extends Lambda implements Function1<String, String> {

        /* renamed from: f */
        public static final a f40684f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            C9801m.m32346f(str, "line");
            return str;
        }
    }

    /* compiled from: Indent.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "line", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.h0.n$b */
    static final class b extends Lambda implements Function1<String, String> {

        /* renamed from: f */
        final /* synthetic */ String f40685f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f40685f = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            C9801m.m32346f(str, "line");
            return this.f40685f + str;
        }
    }

    /* renamed from: b */
    private static final Function1<String, String> m37493b(String str) {
        return str.length() == 0 ? a.f40684f : new b(str);
    }

    /* renamed from: c */
    private static final int m37494c(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (!C10527b.m37413c(str.charAt(i2))) {
                break;
            }
            i2++;
        }
        return i2 == -1 ? str.length() : i2;
    }

    /* renamed from: d */
    public static final String m37495d(String str, String str2) {
        String strInvoke;
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(str2, "newIndent");
        List<String> listM37565e0 = C10547v.m37565e0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM37565e0) {
            if (!C10546u.m37518t((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10819v.m38911u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m37494c((String) it.next())));
        }
        Integer num = (Integer) C10813s.m38851k0(arrayList2);
        int i2 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listM37565e0.size());
        Function1<String, String> function1M37493b = m37493b(str2);
        int iM38890l = C10817u.m38890l(listM37565e0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM37565e0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C10817u.m38898t();
            }
            String str3 = (String) obj2;
            if ((i2 == 0 || i2 == iM38890l) && C10546u.m37518t(str3)) {
                str3 = null;
            } else {
                String strM37590P0 = C10549x.m37590P0(str3, iIntValue);
                if (strM37590P0 != null && (strInvoke = function1M37493b.invoke(strM37590P0)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i2 = i3;
        }
        String string = ((StringBuilder) C10782c0.m38597c0(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        C9801m.m32345e(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    /* renamed from: e */
    public static final String m37496e(String str, String str2, String str3) {
        int i2;
        String strInvoke;
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(str2, "newIndent");
        C9801m.m32346f(str3, "marginPrefix");
        if (!(!C10546u.m37518t(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listM37565e0 = C10547v.m37565e0(str);
        int length = str.length() + (str2.length() * listM37565e0.size());
        Function1<String, String> function1M37493b = m37493b(str2);
        int iM38890l = C10817u.m38890l(listM37565e0);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : listM37565e0) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C10817u.m38898t();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i3 == 0 || i3 == iM38890l) && C10546u.m37518t(str4)) {
                str4 = null;
            } else {
                int length2 = str4.length();
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        i2 = -1;
                        break;
                    }
                    if (!C10527b.m37413c(str4.charAt(i5))) {
                        i2 = i5;
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = i2;
                    if (C10546u.m37510D(str4, str3, i2, false, 4, null)) {
                        int length3 = i6 + str3.length();
                        C9801m.m32344d(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        C9801m.m32345e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    }
                }
                if (strSubstring != null && (strInvoke = function1M37493b.invoke(strSubstring)) != null) {
                    str4 = strInvoke;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i3 = i4;
        }
        String string = ((StringBuilder) C10782c0.m38597c0(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        C9801m.m32345e(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    /* renamed from: f */
    public static String m37497f(String str) {
        C9801m.m32346f(str, "<this>");
        return m37495d(str, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: g */
    public static final String m37498g(String str, String str2) {
        C9801m.m32346f(str, "<this>");
        C9801m.m32346f(str2, "marginPrefix");
        return m37496e(str, HttpUrl.FRAGMENT_ENCODE_SET, str2);
    }

    /* renamed from: h */
    public static /* synthetic */ String m37499h(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "|";
        }
        return m37498g(str, str2);
    }
}
