package androidx.media3.ui;

import X1.C1804a;
import X1.L;
import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import androidx.media3.ui.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import m8.AbstractC4010z;

/* compiled from: SpannedToHtmlConverter.java */
/* loaded from: classes.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f28394a = Pattern.compile("(&#13;)?&#10;");

    /* compiled from: SpannedToHtmlConverter.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f28395a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, String> f28396b;

        private b(String str, Map<String, String> map) {
            this.f28395a = str;
            this.f28396b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpannedToHtmlConverter.java */
    static final class c {

        /* renamed from: e, reason: collision with root package name */
        private static final Comparator<c> f28397e = new Comparator() { // from class: androidx.media3.ui.A
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return z.c.e((z.c) obj, (z.c) obj2);
            }
        };

        /* renamed from: f, reason: collision with root package name */
        private static final Comparator<c> f28398f = new Comparator() { // from class: androidx.media3.ui.B
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return z.c.f((z.c) obj, (z.c) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final int f28399a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28400b;

        /* renamed from: c, reason: collision with root package name */
        public final String f28401c;

        /* renamed from: d, reason: collision with root package name */
        public final String f28402d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f28400b, cVar.f28400b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f28401c.compareTo(cVar2.f28401c);
            return iCompareTo != 0 ? iCompareTo : cVar.f28402d.compareTo(cVar2.f28402d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int f(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f28399a, cVar.f28399a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f28401c.compareTo(cVar.f28401c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f28402d.compareTo(cVar.f28402d);
        }

        private c(int i10, int i11, String str, String str2) {
            this.f28399a = i10;
            this.f28400b = i11;
            this.f28401c = str;
            this.f28402d = str2;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final List<c> f28403a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<c> f28404b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", AbstractC4010z.l());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), AbstractC4010z.l());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(C2158c.a("bg_" + iIntValue), L.G("background-color:%s;", C2158c.b(iIntValue)));
        }
        SparseArray<d> sparseArrayC = c(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i10);
            sb2.append(b(spanned.subSequence(i11, iKeyAt)));
            d dVar = sparseArrayC.get(iKeyAt);
            Collections.sort(dVar.f28404b, c.f28398f);
            Iterator it2 = dVar.f28404b.iterator();
            while (it2.hasNext()) {
                sb2.append(((c) it2.next()).f28402d);
            }
            Collections.sort(dVar.f28403a, c.f28397e);
            Iterator it3 = dVar.f28403a.iterator();
            while (it3.hasNext()) {
                sb2.append(((c) it3.next()).f28401c);
            }
            i10++;
            i11 = iKeyAt;
        }
        sb2.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb2.toString(), map);
    }

    private static String b(CharSequence charSequence) {
        return f28394a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static SparseArray<d> c(Spanned spanned, float f10) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f10);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                C1804a.e(strD);
                c cVar = new c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f28403a.add(cVar);
                f(sparseArray, spanEnd).f28404b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof W1.d) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof W1.h)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof W1.f) {
                return "<rt>" + b(((W1.f) obj).f18345a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String e(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return L.G("<span style='color:%s;'>", C2158c.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return L.G("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof W1.d) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            return L.G("<span style='font-size:%.2fpx;'>", Float.valueOf(((AbsoluteSizeSpan) obj).getDip() ? r3.getSize() : r3.getSize() / f10));
        }
        if (obj instanceof RelativeSizeSpan) {
            return L.G("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return L.G("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof W1.f)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof W1.h)) {
                return null;
            }
            W1.h hVar = (W1.h) obj;
            return L.G("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(hVar.f18350a, hVar.f18351b), g(hVar.f18352c));
        }
        int i10 = ((W1.f) obj).f18346b;
        if (i10 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i10 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i10 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static d f(SparseArray<d> sparseArray, int i10) {
        d dVar = sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    private static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static String h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }
}
