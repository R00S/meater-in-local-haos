package H0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4156a;
import ra.C4370a;

/* compiled from: AnnotatedString.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 G2\u00020\u0001:\u0003\u0014BEB[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rB=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J%\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J)\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b'\u0010(J+\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0007¢\u0006\u0004\b*\u0010(J)\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b,\u0010(J\u001d\u0010-\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020#2\u0006\u0010/\u001a\u00020\u0000¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u00105R(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R(\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R*\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F¢\u0006\u0006\u001a\u0004\bC\u0010>R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00048F¢\u0006\u0006\u001a\u0004\bD\u0010>R\u0014\u0010F\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"LH0/d;", "", "", "text", "", "LH0/d$c;", "LH0/C;", "spanStylesOrNull", "LH0/u;", "paragraphStylesOrNull", "", "annotations", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "spanStyles", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "index", "", "a", "(I)C", "startIndex", "endIndex", "p", "(II)LH0/d;", "LH0/H;", "range", "q", "(J)LH0/d;", "tag", "start", "end", "i", "(Ljava/lang/String;II)Ljava/util/List;", "", "o", "(Ljava/lang/String;II)Z", "LH0/L;", "k", "(II)Ljava/util/List;", "LH0/M;", "l", "LH0/h;", "d", "n", "(II)Z", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "m", "(LH0/d;)Z", "B", "Ljava/lang/String;", "j", "C", "Ljava/util/List;", "h", "()Ljava/util/List;", "D", "f", "E", "b", "g", "e", "c", "length", "F", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1060d implements CharSequence {

    /* renamed from: G, reason: collision with root package name */
    private static final Y.j<C1060d, ?> f5361G = B.h();

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final List<Range<SpanStyle>> spanStylesOrNull;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final List<Range<? extends Object>> annotations;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.d$d, reason: collision with other inner class name */
    public static final class C0099d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C4370a.d(Integer.valueOf(((Range) t10).h()), Integer.valueOf(((Range) t11).h()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1060d(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2, List<? extends Range<? extends Object>> list3) {
        List listO0;
        this.text = str;
        this.spanStylesOrNull = list;
        this.paragraphStylesOrNull = list2;
        this.annotations = list3;
        if (list2 == null || (listO0 = kotlin.collections.r.O0(list2, new C0099d())) == null) {
            return;
        }
        int size = listO0.size();
        int iF = -1;
        for (int i10 = 0; i10 < size; i10++) {
            Range range = (Range) listO0.get(i10);
            if (range.h() < iF) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (range.f() > this.text.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + range.h() + ", " + range.f() + ") is out of boundary").toString());
            }
            iF = range.f();
        }
    }

    public char a(int index) {
        return this.text.charAt(index);
    }

    public final List<Range<? extends Object>> b() {
        return this.annotations;
    }

    public int c() {
        return this.text.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public final List<Range<AbstractC1064h>> d(int start, int end) {
        List listM;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Object> range = list.get(i10);
                Range<? extends Object> range2 = range;
                if ((range2.g() instanceof AbstractC1064h) && C1061e.k(start, end, range2.h(), range2.f())) {
                    listM.add(range);
                }
            }
        } else {
            listM = kotlin.collections.r.m();
        }
        C3862t.e(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listM;
    }

    public final List<Range<ParagraphStyle>> e() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? kotlin.collections.r.m() : list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1060d)) {
            return false;
        }
        C1060d c1060d = (C1060d) other;
        return C3862t.b(this.text, c1060d.text) && C3862t.b(this.spanStylesOrNull, c1060d.spanStylesOrNull) && C3862t.b(this.paragraphStylesOrNull, c1060d.paragraphStylesOrNull) && C3862t.b(this.annotations, c1060d.annotations);
    }

    public final List<Range<ParagraphStyle>> f() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<SpanStyle>> g() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? kotlin.collections.r.m() : list;
    }

    public final List<Range<SpanStyle>> h() {
        return this.spanStylesOrNull;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Range<ParagraphStyle>> list2 = this.paragraphStylesOrNull;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Range<? extends Object>> list3 = this.annotations;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final List<Range<String>> i(String tag, int start, int end) {
        List listM;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Object> range = list.get(i10);
                Range<? extends Object> range2 = range;
                if ((range2.g() instanceof String) && C3862t.b(tag, range2.getTag()) && C1061e.k(start, end, range2.h(), range2.f())) {
                    listM.add(range);
                }
            }
        } else {
            listM = kotlin.collections.r.m();
        }
        C3862t.e(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return listM;
    }

    /* renamed from: j, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<Range<L>> k(int start, int end) {
        List listM;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Object> range = list.get(i10);
                Range<? extends Object> range2 = range;
                if ((range2.g() instanceof L) && C1061e.k(start, end, range2.h(), range2.f())) {
                    listM.add(range);
                }
            }
        } else {
            listM = kotlin.collections.r.m();
        }
        C3862t.e(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listM;
    }

    @InterfaceC4156a
    public final List<Range<UrlAnnotation>> l(int start, int end) {
        List listM;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Object> range = list.get(i10);
                Range<? extends Object> range2 = range;
                if ((range2.g() instanceof UrlAnnotation) && C1061e.k(start, end, range2.h(), range2.f())) {
                    listM.add(range);
                }
            }
        } else {
            listM = kotlin.collections.r.m();
        }
        C3862t.e(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listM;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    public final boolean m(C1060d other) {
        return C3862t.b(this.annotations, other.annotations);
    }

    public final boolean n(int start, int end) {
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Range<? extends Object> range = list.get(i10);
            if ((range.g() instanceof AbstractC1064h) && C1061e.k(start, end, range.h(), range.f())) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(String tag, int start, int end) {
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Range<? extends Object> range = list.get(i10);
            if ((range.g() instanceof String) && C3862t.b(tag, range.getTag()) && C1061e.k(start, end, range.h(), range.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C1060d subSequence(int startIndex, int endIndex) {
        if (startIndex <= endIndex) {
            if (startIndex == 0 && endIndex == this.text.length()) {
                return this;
            }
            String strSubstring = this.text.substring(startIndex, endIndex);
            C3862t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new C1060d(strSubstring, C1061e.g(this.spanStylesOrNull, startIndex, endIndex), C1061e.g(this.paragraphStylesOrNull, startIndex, endIndex), C1061e.g(this.annotations, startIndex, endIndex));
        }
        throw new IllegalArgumentException(("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')').toString());
    }

    public final C1060d q(long range) {
        return subSequence(H.j(range), H.i(range));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"LH0/d$c;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "a", "()Ljava/lang/Object;", "b", "()I", "c", "d", "(Ljava/lang/Object;IILjava/lang/String;)LH0/d$c;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "g", "I", "h", "f", "Ljava/lang/String;", "i", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H0.d$c, reason: from toString */
    public static final /* data */ class Range<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final T item;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tag;

        public Range(T t10, int i10, int i11, String str) {
            this.item = t10;
            this.start = i10;
            this.end = i11;
            this.tag = str;
            if (i10 > i11) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range e(Range range, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = range.item;
            }
            if ((i12 & 2) != 0) {
                i10 = range.start;
            }
            if ((i12 & 4) != 0) {
                i11 = range.end;
            }
            if ((i12 & 8) != 0) {
                str = range.tag;
            }
            return range.d(obj, i10, i11, str);
        }

        public final T a() {
            return this.item;
        }

        /* renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: c, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        public final Range<T> d(T item, int start, int end, String tag) {
            return new Range<>(item, start, end, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return C3862t.b(this.item, range.item) && this.start == range.start && this.end == range.end && C3862t.b(this.tag, range.tag);
        }

        public final int f() {
            return this.end;
        }

        public final T g() {
            return this.item;
        }

        public final int h() {
            return this.start;
        }

        public int hashCode() {
            T t10 = this.item;
            return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        /* renamed from: i, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t10, int i10, int i11) {
            this(t10, i10, i11, "");
        }
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001!B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ%\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010\u0006J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*R\u0018\u0010\b\u001a\u00060+j\u0002`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u000206000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102R\"\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u000206000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00102¨\u0006;"}, d2 = {"LH0/d$a;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "LH0/d;", "text", "(LH0/d;)V", "", "Loa/F;", "h", "(Ljava/lang/String;)V", "", "d", "(Ljava/lang/CharSequence;)LH0/d$a;", "start", "end", "e", "(Ljava/lang/CharSequence;II)LH0/d$a;", "", "char", "c", "(C)LH0/d$a;", "f", "g", "(LH0/d;II)V", "LH0/C;", "style", "b", "(LH0/C;II)V", "LH0/u;", "a", "(LH0/u;II)V", "k", "(LH0/C;)I", "i", "()V", "index", "j", "l", "()LH0/d;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "B", "Ljava/lang/StringBuilder;", "", "LH0/d$a$a;", "C", "Ljava/util/List;", "spanStyles", "D", "paragraphStyles", "", "E", "annotations", "F", "styleStack", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H0.d$a */
    public static final class a implements Appendable {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final StringBuilder text;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final List<MutableRange<SpanStyle>> spanStyles;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final List<MutableRange<ParagraphStyle>> paragraphStyles;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final List<MutableRange<? extends Object>> annotations;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private final List<MutableRange<? extends Object>> styleStack;

        public a(int i10) {
            this.text = new StringBuilder(i10);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        public final void a(ParagraphStyle style, int start, int end) {
            this.paragraphStyles.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        public final void b(SpanStyle style, int start, int end) {
            this.spanStyles.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a append(char c10) {
            this.text.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a append(CharSequence text) {
            if (text instanceof C1060d) {
                f((C1060d) text);
            } else {
                this.text.append(text);
            }
            return this;
        }

        @Override // java.lang.Appendable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a append(CharSequence text, int start, int end) {
            if (text instanceof C1060d) {
                g((C1060d) text, start, end);
            } else {
                this.text.append(text, start, end);
            }
            return this;
        }

        public final void f(C1060d text) {
            int length = this.text.length();
            this.text.append(text.getText());
            List<Range<SpanStyle>> listH = text.h();
            if (listH != null) {
                int size = listH.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Range<SpanStyle> range = listH.get(i10);
                    b(range.g(), range.h() + length, range.f() + length);
                }
            }
            List<Range<ParagraphStyle>> listF = text.f();
            if (listF != null) {
                int size2 = listF.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Range<ParagraphStyle> range2 = listF.get(i11);
                    a(range2.g(), range2.h() + length, range2.f() + length);
                }
            }
            List<Range<? extends Object>> listB = text.b();
            if (listB != null) {
                int size3 = listB.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Range<? extends Object> range3 = listB.get(i12);
                    this.annotations.add(new MutableRange<>(range3.g(), range3.h() + length, range3.f() + length, range3.getTag()));
                }
            }
        }

        public final void g(C1060d text, int start, int end) {
            int length = this.text.length();
            this.text.append((CharSequence) text.getText(), start, end);
            List listJ = C1061e.j(text, start, end);
            if (listJ != null) {
                int size = listJ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Range range = (Range) listJ.get(i10);
                    b((SpanStyle) range.g(), range.h() + length, range.f() + length);
                }
            }
            List listI = C1061e.i(text, start, end);
            if (listI != null) {
                int size2 = listI.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Range range2 = (Range) listI.get(i11);
                    a((ParagraphStyle) range2.g(), range2.h() + length, range2.f() + length);
                }
            }
            List listH = C1061e.h(text, start, end);
            if (listH != null) {
                int size3 = listH.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Range range3 = (Range) listH.get(i12);
                    this.annotations.add(new MutableRange<>(range3.g(), range3.h() + length, range3.f() + length, range3.getTag()));
                }
            }
        }

        public final void h(String text) {
            this.text.append(text);
        }

        public final void i() {
            if (this.styleStack.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.");
            }
            this.styleStack.remove(r0.size() - 1).a(this.text.length());
        }

        public final void j(int index) {
            if (index < this.styleStack.size()) {
                while (this.styleStack.size() - 1 >= index) {
                    i();
                }
            } else {
                throw new IllegalStateException((index + " should be less than " + this.styleStack.size()).toString());
            }
        }

        public final int k(SpanStyle style) {
            MutableRange<SpanStyle> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.spanStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final C1060d l() {
            String string = this.text.toString();
            List<MutableRange<SpanStyle>> list = this.spanStyles;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).b(this.text.length()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<MutableRange<ParagraphStyle>> list2 = this.paragraphStyles;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(list2.get(i11).b(this.text.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            List<MutableRange<? extends Object>> list3 = this.annotations;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList3.add(list3.get(i12).b(this.text.length()));
            }
            return new C1060d(string, arrayList, arrayList2, arrayList3.isEmpty() ? null : arrayList3);
        }

        /* compiled from: AnnotatedString.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u0017\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"LH0/d$a$a;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "defaultEnd", "LH0/d$c;", "b", "(I)LH0/d$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getItem", "()Ljava/lang/Object;", "I", "getStart", "c", "getEnd", "(I)V", "d", "Ljava/lang/String;", "getTag", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: H0.d$a$a, reason: collision with other inner class name and from toString */
        private static final /* data */ class MutableRange<T> {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final T item;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int start;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private int end;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String tag;

            public MutableRange(T t10, int i10, int i11, String str) {
                this.item = t10;
                this.start = i10;
                this.end = i11;
                this.tag = str;
            }

            public final void a(int i10) {
                this.end = i10;
            }

            public final Range<T> b(int defaultEnd) {
                int i10 = this.end;
                if (i10 != Integer.MIN_VALUE) {
                    defaultEnd = i10;
                }
                if (defaultEnd != Integer.MIN_VALUE) {
                    return new Range<>(this.item, this.start, defaultEnd, this.tag);
                }
                throw new IllegalStateException("Item.end should be set first");
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) other;
                return C3862t.b(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && C3862t.b(this.tag, mutableRange.tag);
            }

            public int hashCode() {
                T t10 = this.item;
                return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public /* synthetic */ MutableRange(Object obj, int i10, int i11, String str, int i12, C3854k c3854k) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ a(int i10, int i11, C3854k c3854k) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        public a(C1060d c1060d) {
            this(0, 1, null);
            f(c1060d);
        }
    }

    public /* synthetic */ C1060d(String str, List list, List list2, List list3, int i10, C3854k c3854k) {
        this(str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : list3);
    }

    public /* synthetic */ C1060d(String str, List list, List list2, int i10, C3854k c3854k) {
        this(str, (i10 & 2) != 0 ? kotlin.collections.r.m() : list, (i10 & 4) != 0 ? kotlin.collections.r.m() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1060d(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        List<Range<SpanStyle>> list3 = list;
        List<Range<ParagraphStyle>> list4 = list2;
        this(str, list3.isEmpty() ? null : list3, list4.isEmpty() ? null : list4, null);
    }
}
