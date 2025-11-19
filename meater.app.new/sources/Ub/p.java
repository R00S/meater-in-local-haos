package Ub;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.B;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000e2\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "marginPrefix", "g", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "newIndent", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "f", "(Ljava/lang/String;)Ljava/lang/String;", "d", "", "c", "(Ljava/lang/String;)I", "indent", "Lkotlin/Function1;", "b", "(Ljava/lang/String;)LBa/l;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class p extends o {

    /* compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends AbstractC3864v implements Ba.l<String, String> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f17973B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            C3862t.g(line, "line");
            return line;
        }
    }

    /* compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends AbstractC3864v implements Ba.l<String, String> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f17974B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f17974B = str;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            C3862t.g(line, "line");
            return this.f17974B + line;
        }
    }

    private static final Ba.l<String, String> b(String str) {
        return str.length() == 0 ? a.f17973B : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!C1786a.c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String d(String str, String newIndent) {
        String strInvoke;
        C3862t.g(str, "<this>");
        C3862t.g(newIndent, "newIndent");
        List<String> listH0 = x.h0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH0) {
            if (!n.a0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) kotlin.collections.r.A0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listH0.size());
        Ba.l<String, String> lVarB = b(newIndent);
        int iO = kotlin.collections.r.o(listH0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listH0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            String str2 = (String) obj2;
            if ((i10 == 0 || i10 == iO) && n.a0(str2)) {
                str2 = null;
            } else {
                String strV0 = z.V0(str2, iIntValue);
                if (strV0 != null && (strInvoke = lVarB.invoke(strV0)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i10 = i11;
        }
        String string = ((StringBuilder) B.p0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public static final String e(String str, String newIndent, String marginPrefix) {
        int i10;
        String strInvoke;
        C3862t.g(str, "<this>");
        C3862t.g(newIndent, "newIndent");
        C3862t.g(marginPrefix, "marginPrefix");
        if (n.a0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listH0 = x.h0(str);
        int length = str.length() + (newIndent.length() * listH0.size());
        Ba.l<String, String> lVarB = b(newIndent);
        int iO = kotlin.collections.r.o(listH0);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listH0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                kotlin.collections.r.w();
            }
            String str2 = (String) obj;
            String strSubstring = null;
            if ((i11 == 0 || i11 == iO) && n.a0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!C1786a.c(str2.charAt(i13))) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = i10;
                    if (n.F(str2, marginPrefix, i10, false, 4, null)) {
                        int length3 = i14 + marginPrefix.length();
                        C3862t.e(str2, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str2.substring(length3);
                        C3862t.f(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = lVarB.invoke(strSubstring)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i11 = i12;
        }
        String string = ((StringBuilder) B.p0(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public static String f(String str) {
        C3862t.g(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String marginPrefix) {
        C3862t.g(str, "<this>");
        C3862t.g(marginPrefix, "marginPrefix");
        return e(str, "", marginPrefix);
    }

    public static /* synthetic */ String h(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}
