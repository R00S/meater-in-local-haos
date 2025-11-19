package a3;

import W1.a;
import X1.C1804a;
import X1.L;
import X1.n;
import X1.y;
import a3.e;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WebvttCueParser.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f20044a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f20045b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f20046c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f20047d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebvttCueParser.java */
    static class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<b> f20048c = new Comparator() { // from class: a3.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.b.e((e.b) obj, (e.b) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final c f20049a;

        /* renamed from: b, reason: collision with root package name */
        private final int f20050b;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(b bVar, b bVar2) {
            return Integer.compare(bVar.f20049a.f20052b, bVar2.f20049a.f20052b);
        }

        private b(c cVar, int i10) {
            this.f20049a = cVar;
            this.f20050b = i10;
        }
    }

    /* compiled from: WebvttCueParser.java */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f20051a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20052b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20053c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f20054d;

        private c(String str, int i10, String str2, Set<String> set) {
            this.f20052b = i10;
            this.f20051a = str;
            this.f20053c = str2;
            this.f20054d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String strTrim = str.trim();
            C1804a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrL1 = L.l1(strTrim, "\\.");
            String str3 = strArrL1[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < strArrL1.length; i11++) {
                hashSet.add(strArrL1[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* compiled from: WebvttCueParser.java */
    private static final class d implements Comparable<d> {

        /* renamed from: B, reason: collision with root package name */
        public final int f20055B;

        /* renamed from: C, reason: collision with root package name */
        public final a3.c f20056C;

        public d(int i10, a3.c cVar) {
            this.f20055B = i10;
            this.f20056C = cVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f20055B, dVar.f20055B);
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* renamed from: a3.e$e, reason: collision with other inner class name */
    private static final class C0287e {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f20059c;

        /* renamed from: a, reason: collision with root package name */
        public long f20057a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f20058b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f20060d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f20061e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f20062f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f20063g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f20064h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f20065i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f20066j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f20067k = Integer.MIN_VALUE;

        private static float b(float f10, int i10) {
            if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return f10 != -3.4028235E38f ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            n.h("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public a3.d a() {
            return new a3.d(g().a(), this.f20057a, this.f20058b);
        }

        public a.b g() {
            float fE = this.f20064h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f20060d);
            }
            int iF = this.f20065i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f20060d);
            }
            a.b bVarR = new a.b().p(c(this.f20060d)).h(b(this.f20061e, this.f20062f), this.f20062f).i(this.f20063g).k(fE).l(iF).n(Math.min(this.f20066j, d(iF, fE))).r(this.f20067k);
            CharSequence charSequence = this.f20059c;
            if (charSequence != null) {
                bVarR.o(charSequence);
            }
            return bVarR;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f20046c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f20047d = Collections.unmodifiableMap(map2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        for (String str : set) {
            Map<String, Integer> map = f20046c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i10, i11, 33);
            } else {
                Map<String, Integer> map2 = f20047d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                n.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<a3.c> list2) {
        int iJ = j(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f20048c);
        int i10 = cVar.f20052b;
        int length = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if ("rt".equals(((b) arrayList.get(i11)).f20049a.f20051a)) {
                b bVar = (b) arrayList.get(i11);
                int iH = h(j(list2, str, bVar.f20049a), iJ, 1);
                int i12 = bVar.f20049a.f20052b - length;
                int i13 = bVar.f20050b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i13);
                spannableStringBuilder.delete(i12, i13);
                spannableStringBuilder.setSpan(new W1.f(charSequenceSubSequence.toString(), iH), i10, i12, 33);
                length += charSequenceSubSequence.length();
                i10 = i12;
            }
        }
    }

    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<a3.c> list2) {
        int i10;
        int length;
        i10 = cVar.f20052b;
        length = spannableStringBuilder.length();
        String str2 = cVar.f20051a;
        str2.hashCode();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f20054d, i10, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case "v":
                f(spannableStringBuilder, cVar.f20053c, i10, length);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> listI = i(list2, str, cVar);
        for (int i11 = 0; i11 < listI.size(); i11++) {
            e(spannableStringBuilder, listI.get(i11).f20056C, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, a3.c cVar, int i10, int i11) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            W1.g.b(spannableStringBuilder, new StyleSpan(cVar.i()), i10, i11, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (cVar.k()) {
            W1.g.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i10, i11, 33);
        }
        if (cVar.j()) {
            W1.g.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i10, i11, 33);
        }
        if (cVar.d() != null) {
            W1.g.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i10, i11, 33);
        }
        int iF = cVar.f();
        if (iF == 1) {
            W1.g.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i10, i11, 33);
        } else if (iF == 2) {
            W1.g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i10, i11, 33);
        } else if (iF == 3) {
            W1.g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i10, i11, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new W1.d(), i10, i11, 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        spannableStringBuilder.setSpan(new W1.i(str), i10, i11, 33);
    }

    private static int g(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int h(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> i(List<a3.c> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            a3.c cVar2 = list.get(i10);
            int iH = cVar2.h(str, cVar.f20051a, cVar.f20054d, cVar.f20053c);
            if (iH > 0) {
                arrayList.add(new d(iH, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int j(List<a3.c> list, String str, c cVar) {
        List<d> listI = i(list, str, cVar);
        for (int i10 = 0; i10 < listI.size(); i10++) {
            a3.c cVar2 = listI.get(i10).f20056C;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    private static String k(String str) {
        String strTrim = str.trim();
        C1804a.a(!strTrim.isEmpty());
        return L.m1(strTrim, "[ \\.]")[0];
    }

    private static boolean l(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static W1.a m(CharSequence charSequence) {
        C0287e c0287e = new C0287e();
        c0287e.f20059c = charSequence;
        return c0287e.g().a();
    }

    public static a3.d n(y yVar, List<a3.c> list) {
        String strS = yVar.s();
        if (strS == null) {
            return null;
        }
        Pattern pattern = f20044a;
        Matcher matcher = pattern.matcher(strS);
        if (matcher.matches()) {
            return o(null, matcher, yVar, list);
        }
        String strS2 = yVar.s();
        if (strS2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strS2);
        if (matcher2.matches()) {
            return o(strS.trim(), matcher2, yVar, list);
        }
        return null;
    }

    private static a3.d o(String str, Matcher matcher, y yVar, List<a3.c> list) {
        C0287e c0287e = new C0287e();
        try {
            c0287e.f20057a = h.c((String) C1804a.e(matcher.group(1)));
            c0287e.f20058b = h.c((String) C1804a.e(matcher.group(2)));
            q((String) C1804a.e(matcher.group(3)), c0287e);
            StringBuilder sb2 = new StringBuilder();
            String strS = yVar.s();
            while (!TextUtils.isEmpty(strS)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strS.trim());
                strS = yVar.s();
            }
            c0287e.f20059c = r(str, sb2.toString(), list);
            return c0287e.a();
        } catch (NumberFormatException unused) {
            n.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    static a.b p(String str) {
        C0287e c0287e = new C0287e();
        q(str, c0287e);
        return c0287e.g();
    }

    private static void q(String str, C0287e c0287e) {
        Matcher matcher = f20045b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C1804a.e(matcher.group(1));
            String str3 = (String) C1804a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    t(str3, c0287e);
                } else if ("align".equals(str2)) {
                    c0287e.f20060d = w(str3);
                } else if ("position".equals(str2)) {
                    v(str3, c0287e);
                } else if ("size".equals(str2)) {
                    c0287e.f20066j = h.b(str3);
                } else if ("vertical".equals(str2)) {
                    c0287e.f20067k = x(str3);
                } else {
                    n.h("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                n.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString r(String str, String str2, List<a3.c> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iG = i10 + 1;
                if (iG < str2.length()) {
                    boolean z10 = str2.charAt(iG) == '/';
                    iG = g(str2, iG);
                    int i11 = iG - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iG - 1;
                    }
                    String strSubstring = str2.substring(i12, i11);
                    if (!strSubstring.trim().isEmpty()) {
                        String strK = k(strSubstring);
                        if (l(strK)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f20051a.equals(strK)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = iG;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int s(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                n.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void t(String str, C0287e c0287e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0287e.f20063g = s(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c0287e.f20061e = h.b(str);
            c0287e.f20062f = 0;
        } else {
            c0287e.f20061e = Integer.parseInt(str);
            c0287e.f20062f = 1;
        }
    }

    private static int u(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                n.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void v(String str, C0287e c0287e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0287e.f20065i = u(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c0287e.f20064h = h.b(str);
    }

    private static int w(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                n.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int x(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        n.h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
