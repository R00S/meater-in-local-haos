package H0;

import H0.C1060d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: AnnotatedString.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\f\u001a3\u0010\u000f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\f\u001a#\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aK\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00122\u0016\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010!\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0000¢\u0006\u0004\b!\u0010\u001c\"\u0014\u0010$\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LH0/d;", "LH0/u;", "defaultParagraphStyle", "", "LH0/d$c;", "l", "(LH0/d;LH0/u;)Ljava/util/List;", "", "start", "end", "LH0/C;", "j", "(LH0/d;II)Ljava/util/List;", "i", "", "h", "m", "(LH0/d;II)LH0/d;", "T", "ranges", "g", "(Ljava/util/List;II)Ljava/util/List;", "baseStart", "baseEnd", "targetStart", "targetEnd", "", "f", "(IIII)Z", "lStart", "lEnd", "rStart", "rEnd", "k", "a", "LH0/d;", "EmptyAnnotatedString", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1061e {

    /* renamed from: a, reason: collision with root package name */
    private static final C1060d f5379a = new C1060d("", null, null, 6, null);

    public static final boolean f(int i10, int i11, int i12, int i13) {
        if (i10 > i12 || i13 > i11) {
            return false;
        }
        if (i11 == i13) {
            if ((i12 == i13) != (i10 == i11)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<C1060d.Range<T>> g(List<? extends C1060d.Range<? extends T>> list, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C1060d.Range<? extends T> range = list.get(i12);
            C1060d.Range<? extends T> range2 = range;
            if (k(i10, i11, range2.h(), range2.f())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C1060d.Range range3 = (C1060d.Range) arrayList.get(i13);
            arrayList2.add(new C1060d.Range(range3.g(), Math.max(i10, range3.h()) - i10, Math.min(i11, range3.f()) - i10, range3.getTag()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C1060d.Range<? extends Object>> h(C1060d c1060d, int i10, int i11) {
        List<C1060d.Range<? extends Object>> listB;
        if (i10 == i11 || (listB = c1060d.b()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= c1060d.getText().length()) {
            return listB;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        int size = listB.size();
        for (int i12 = 0; i12 < size; i12++) {
            C1060d.Range<? extends Object> range = listB.get(i12);
            C1060d.Range<? extends Object> range2 = range;
            if (k(i10, i11, range2.h(), range2.f())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C1060d.Range range3 = (C1060d.Range) arrayList.get(i13);
            arrayList2.add(new C1060d.Range(range3.g(), Ha.g.k(range3.h(), i10, i11) - i10, Ha.g.k(range3.f(), i10, i11) - i10, range3.getTag()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C1060d.Range<ParagraphStyle>> i(C1060d c1060d, int i10, int i11) {
        List<C1060d.Range<ParagraphStyle>> listF;
        if (i10 == i11 || (listF = c1060d.f()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= c1060d.getText().length()) {
            return listF;
        }
        ArrayList arrayList = new ArrayList(listF.size());
        int size = listF.size();
        for (int i12 = 0; i12 < size; i12++) {
            C1060d.Range<ParagraphStyle> range = listF.get(i12);
            C1060d.Range<ParagraphStyle> range2 = range;
            if (k(i10, i11, range2.h(), range2.f())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C1060d.Range range3 = (C1060d.Range) arrayList.get(i13);
            arrayList2.add(new C1060d.Range(range3.g(), Ha.g.k(range3.h(), i10, i11) - i10, Ha.g.k(range3.f(), i10, i11) - i10));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C1060d.Range<SpanStyle>> j(C1060d c1060d, int i10, int i11) {
        List<C1060d.Range<SpanStyle>> listH;
        if (i10 == i11 || (listH = c1060d.h()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= c1060d.getText().length()) {
            return listH;
        }
        ArrayList arrayList = new ArrayList(listH.size());
        int size = listH.size();
        for (int i12 = 0; i12 < size; i12++) {
            C1060d.Range<SpanStyle> range = listH.get(i12);
            C1060d.Range<SpanStyle> range2 = range;
            if (k(i10, i11, range2.h(), range2.f())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C1060d.Range range3 = (C1060d.Range) arrayList.get(i13);
            arrayList2.add(new C1060d.Range(range3.g(), Ha.g.k(range3.h(), i10, i11) - i10, Ha.g.k(range3.f(), i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final boolean k(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i12) < Math.min(i11, i13) || f(i10, i11, i12, i13) || f(i12, i13, i10, i11);
    }

    public static final List<C1060d.Range<ParagraphStyle>> l(C1060d c1060d, ParagraphStyle paragraphStyle) {
        int length = c1060d.getText().length();
        List<C1060d.Range<ParagraphStyle>> listF = c1060d.f();
        if (listF == null) {
            listF = kotlin.collections.r.m();
        }
        ArrayList arrayList = new ArrayList();
        int size = listF.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            C1060d.Range<ParagraphStyle> range = listF.get(i10);
            ParagraphStyle paragraphStyleA = range.a();
            int start = range.getStart();
            int end = range.getEnd();
            if (start != i11) {
                arrayList.add(new C1060d.Range(paragraphStyle, i11, start));
            }
            arrayList.add(new C1060d.Range(paragraphStyle.l(paragraphStyleA), start, end));
            i10++;
            i11 = end;
        }
        if (i11 != length) {
            arrayList.add(new C1060d.Range(paragraphStyle, i11, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C1060d.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1060d m(C1060d c1060d, int i10, int i11) {
        String strSubstring;
        if (i10 != i11) {
            strSubstring = c1060d.getText().substring(i10, i11);
            C3862t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new C1060d(strSubstring, j(c1060d, i10, i11), null, null, 12, null);
    }
}
