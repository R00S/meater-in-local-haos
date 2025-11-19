package O0;

import H0.AbstractC1064h;
import H0.C1060d;
import H0.L;
import H0.SpanStyle;
import H0.UrlAnnotation;
import R0.j;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import kotlin.AbstractC1341l;
import kotlin.C1312E;
import kotlin.C1335f;
import kotlin.C1352w;
import kotlin.C1353x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidAccessibilitySpannableString.android.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0010\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LH0/d;", "LU0/d;", "density", "LL0/l$b;", "fontFamilyResolver", "LO0/u;", "urlSpanCache", "Landroid/text/SpannableString;", "b", "(LH0/d;LU0/d;LL0/l$b;LO0/u;)Landroid/text/SpannableString;", "LH0/C;", "spanStyle", "", "start", "end", "Loa/F;", "a", "(Landroid/text/SpannableString;LH0/C;IILU0/d;LL0/l$b;)V", "LH0/d$c;", "LH0/h;", "LH0/h$b;", "c", "(LH0/d$c;)LH0/d$c;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    private static final void a(SpannableString spannableString, SpanStyle spanStyle, int i10, int i11, U0.d dVar, AbstractC1341l.b bVar) {
        P0.c.k(spannableString, spanStyle.g(), i10, i11);
        P0.c.o(spannableString, spanStyle.getFontSize(), dVar, i10, i11);
        if (spanStyle.getFontWeight() != null || spanStyle.getFontStyle() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.d();
            }
            C1352w fontStyle = spanStyle.getFontStyle();
            spannableString.setSpan(new StyleSpan(C1335f.c(fontWeight, fontStyle != null ? fontStyle.getValue() : C1352w.INSTANCE.b())), i10, i11, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof C1312E) {
                spannableString.setSpan(new TypefaceSpan(((C1312E) spanStyle.getFontFamily()).getName()), i10, i11, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                AbstractC1341l fontFamily = spanStyle.getFontFamily();
                C1353x fontSynthesis = spanStyle.getFontSynthesis();
                Object value = AbstractC1341l.b.a(bVar, fontFamily, null, 0, fontSynthesis != null ? fontSynthesis.getValue() : C1353x.INSTANCE.a(), 6, null).getValue();
                C3862t.e(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(j.f13094a.a((Typeface) value), i10, i11, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            R0.j textDecoration = spanStyle.getTextDecoration();
            j.Companion companion = R0.j.INSTANCE;
            if (textDecoration.d(companion.c())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (spanStyle.getTextDecoration().d(companion.a())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i10, i11, 33);
        }
        P0.c.s(spannableString, spanStyle.getLocaleList(), i10, i11);
        P0.c.h(spannableString, spanStyle.getBackground(), i10, i11);
    }

    public static final SpannableString b(C1060d c1060d, U0.d dVar, AbstractC1341l.b bVar, u uVar) {
        SpannableString spannableString = new SpannableString(c1060d.getText());
        List<C1060d.Range<SpanStyle>> listH = c1060d.h();
        if (listH != null) {
            int size = listH.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1060d.Range<SpanStyle> range = listH.get(i10);
                a(spannableString, SpanStyle.b(range.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), range.getStart(), range.getEnd(), dVar, bVar);
            }
        }
        List<C1060d.Range<L>> listK = c1060d.k(0, c1060d.length());
        int size2 = listK.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C1060d.Range<L> range2 = listK.get(i11);
            spannableString.setSpan(P0.e.a(range2.a()), range2.getStart(), range2.getEnd(), 33);
        }
        List<C1060d.Range<UrlAnnotation>> listL = c1060d.l(0, c1060d.length());
        int size3 = listL.size();
        for (int i12 = 0; i12 < size3; i12++) {
            C1060d.Range<UrlAnnotation> range3 = listL.get(i12);
            spannableString.setSpan(uVar.c(range3.a()), range3.getStart(), range3.getEnd(), 33);
        }
        List<C1060d.Range<AbstractC1064h>> listD = c1060d.d(0, c1060d.length());
        int size4 = listD.size();
        for (int i13 = 0; i13 < size4; i13++) {
            C1060d.Range<AbstractC1064h> range4 = listD.get(i13);
            if (range4.h() != range4.f()) {
                AbstractC1064h abstractC1064hG = range4.g();
                if (abstractC1064hG instanceof AbstractC1064h.b) {
                    abstractC1064hG.a();
                    spannableString.setSpan(uVar.b(c(range4)), range4.h(), range4.f(), 33);
                } else {
                    spannableString.setSpan(uVar.a(range4), range4.h(), range4.f(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final C1060d.Range<AbstractC1064h.b> c(C1060d.Range<AbstractC1064h> range) {
        AbstractC1064h abstractC1064hG = range.g();
        C3862t.e(abstractC1064hG, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new C1060d.Range<>((AbstractC1064h.b) abstractC1064hG, range.h(), range.f());
    }
}
