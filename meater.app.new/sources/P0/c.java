package P0;

import Ba.q;
import Ba.r;
import H0.C1060d;
import H0.C1061e;
import H0.SpanStyle;
import H0.TextStyle;
import J0.f;
import J0.h;
import J0.l;
import J0.m;
import J0.o;
import N0.LocaleList;
import R0.LineHeightStyle;
import R0.TextGeometricTransform;
import R0.TextIndent;
import R0.j;
import U0.v;
import U0.w;
import U0.x;
import Ub.n;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import h0.C3476g;
import i0.AbstractC3582j0;
import i0.C3606v0;
import i0.Shadow;
import i0.SolidColor;
import i0.a1;
import java.util.ArrayList;
import java.util.List;
import k0.g;
import kotlin.AbstractC1341l;
import kotlin.C1352w;
import kotlin.C1353x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: SpannableExtensions.android.kt */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a6\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a_\u0010+\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\u0006\u0010\u000e\u001a\u00020\r2&\u0010*\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0$H\u0000¢\u0006\u0004\b+\u0010,\u001a)\u0010.\u001a\u00020\u0006*\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010/\u001aW\u00100\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2&\u0010*\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0$H\u0002¢\u0006\u0004\b0\u00101\u001aM\u00105\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\"2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\u001e\u00104\u001a\u001a\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000603H\u0000¢\u0006\u0004\b5\u00106\u001a$\u00109\u001a\u0004\u0018\u0001082\u0006\u00107\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a-\u0010=\u001a\u00020\u0006*\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>\u001a-\u0010A\u001a\u00020\u0006*\u00020\u00002\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bA\u0010B\u001a.\u0010E\u001a\u00020\u0006*\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a-\u0010I\u001a\u00020\u0006*\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bI\u0010J\u001a-\u0010M\u001a\u00020\u0006*\u00020\u00002\b\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bM\u0010N\u001a-\u0010Q\u001a\u00020\u0006*\u00020\u00002\b\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bQ\u0010R\u001a6\u0010T\u001a\u00020\u0006*\u00020\u00002\u0006\u0010S\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a-\u0010X\u001a\u00020\u0006*\u00020\u00002\b\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bX\u0010Y\u001a.\u0010Z\u001a\u00020\u0006*\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bZ\u0010F\u001a0\u0010]\u001a\u00020\u0006*\u00020\u00002\b\u0010\\\u001a\u0004\u0018\u00010[2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b]\u0010^\u001a5\u0010b\u001a\u00020\u0006*\u00020\u00002\b\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010a\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bb\u0010c\u001a\u0013\u0010d\u001a\u00020\u001b*\u00020\u001eH\u0002¢\u0006\u0004\bd\u0010e\u001a\u001d\u0010g\u001a\u00020\"*\u0004\u0018\u00010\"2\u0006\u0010f\u001a\u00020\"H\u0002¢\u0006\u0004\bg\u0010h\"\u0018\u0010k\u001a\u00020\u001b*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006l"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "Loa/F;", "u", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "LR0/o;", "textIndent", "", "contextFontSize", "LU0/d;", "density", "y", "(Landroid/text/Spannable;LR0/o;FLU0/d;)V", "LU0/v;", "lineHeight", "LR0/g;", "lineHeightStyle", "q", "(Landroid/text/Spannable;JFLU0/d;LR0/g;)V", "r", "(Landroid/text/Spannable;JFLU0/d;)V", "g", "(JFLU0/d;)F", "", "e", "(LU0/d;)Z", "LH0/J;", "contextTextStyle", "", "LH0/d$c;", "LH0/C;", "spanStyles", "Lkotlin/Function4;", "LL0/l;", "LL0/B;", "LL0/w;", "LL0/x;", "Landroid/graphics/Typeface;", "resolveTypeface", "w", "(Landroid/text/Spannable;LH0/J;Ljava/util/List;LU0/d;LBa/r;)V", "spanStyleRange", "v", "(Landroid/text/Spannable;LH0/d$c;LU0/d;)V", "m", "(Landroid/text/Spannable;LH0/J;Ljava/util/List;LBa/r;)V", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "b", "(LH0/C;Ljava/util/List;LBa/q;)V", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "a", "(JLU0/d;)Landroid/text/style/MetricAffectingSpan;", "Li0/b1;", "shadow", "t", "(Landroid/text/Spannable;Li0/b1;II)V", "Lk0/g;", "drawStyle", "l", "(Landroid/text/Spannable;Lk0/g;II)V", "Li0/t0;", "color", "h", "(Landroid/text/Spannable;JII)V", "LN0/e;", "localeList", "s", "(Landroid/text/Spannable;LN0/e;II)V", "LR0/n;", "textGeometricTransform", "p", "(Landroid/text/Spannable;LR0/n;II)V", "", "fontFeatureSettings", "n", "(Landroid/text/Spannable;Ljava/lang/String;II)V", "fontSize", "o", "(Landroid/text/Spannable;JLU0/d;II)V", "LR0/j;", "textDecoration", "x", "(Landroid/text/Spannable;LR0/j;II)V", "k", "LR0/a;", "baselineShift", "i", "(Landroid/text/Spannable;LR0/a;II)V", "Li0/j0;", "brush", "alpha", "j", "(Landroid/text/Spannable;Li0/j0;FII)V", "d", "(LH0/J;)Z", "spanStyle", "f", "(LH0/C;LH0/C;)LH0/C;", "c", "(LH0/C;)Z", "needsLetterSpacingSpan", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* compiled from: SpannableExtensions.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LH0/C;", "spanStyle", "", "start", "end", "Loa/F;", "a", "(LH0/C;II)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements q<SpanStyle, Integer, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Spannable f13706B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ r<AbstractC1341l, FontWeight, C1352w, C1353x, Typeface> f13707C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Spannable spannable, r<? super AbstractC1341l, ? super FontWeight, ? super C1352w, ? super C1353x, ? extends Typeface> rVar) {
            super(3);
            this.f13706B = spannable;
            this.f13707C = rVar;
        }

        public final void a(SpanStyle spanStyle, int i10, int i11) {
            Spannable spannable = this.f13706B;
            r<AbstractC1341l, FontWeight, C1352w, C1353x, Typeface> rVar = this.f13707C;
            AbstractC1341l fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.d();
            }
            C1352w fontStyle = spanStyle.getFontStyle();
            C1352w c1352wC = C1352w.c(fontStyle != null ? fontStyle.getValue() : C1352w.INSTANCE.b());
            C1353x fontSynthesis = spanStyle.getFontSynthesis();
            spannable.setSpan(new o(rVar.k(fontFamily, fontWeight, c1352wC, C1353x.b(fontSynthesis != null ? fontSynthesis.getValue() : C1353x.INSTANCE.a()))), i10, i11, 33);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(SpanStyle spanStyle, Integer num, Integer num2) {
            a(spanStyle, num.intValue(), num2.intValue());
            return C4153F.f46609a;
        }
    }

    private static final MetricAffectingSpan a(long j10, U0.d dVar) {
        long jG = v.g(j10);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            return new f(dVar.w1(j10));
        }
        if (x.g(jG, companion.a())) {
            return new J0.e(v.h(j10));
        }
        return null;
    }

    public static final void b(SpanStyle spanStyle, List<C1060d.Range<SpanStyle>> list, q<? super SpanStyle, ? super Integer, ? super Integer, C4153F> qVar) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            qVar.g(f(spanStyle, list.get(0).g()), Integer.valueOf(list.get(0).h()), Integer.valueOf(list.get(0).f()));
            return;
        }
        int size = list.size();
        int i10 = size * 2;
        Integer[] numArr = new Integer[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            numArr[i11] = 0;
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            C1060d.Range<SpanStyle> range = list.get(i12);
            numArr[i12] = Integer.valueOf(range.h());
            numArr[i12 + size] = Integer.valueOf(range.f());
        }
        C3831l.G(numArr);
        int iIntValue = ((Number) C3831l.X(numArr)).intValue();
        for (int i13 = 0; i13 < i10; i13++) {
            Integer num = numArr[i13];
            int iIntValue2 = num.intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = list.size();
                SpanStyle spanStyleF = spanStyle;
                for (int i14 = 0; i14 < size3; i14++) {
                    C1060d.Range<SpanStyle> range2 = list.get(i14);
                    if (range2.h() != range2.f() && C1061e.k(iIntValue, iIntValue2, range2.h(), range2.f())) {
                        spanStyleF = f(spanStyleF, range2.g());
                    }
                }
                if (spanStyleF != null) {
                    qVar.g(spanStyleF, Integer.valueOf(iIntValue), num);
                }
                iIntValue = iIntValue2;
            }
        }
    }

    private static final boolean c(SpanStyle spanStyle) {
        long jG = v.g(spanStyle.getLetterSpacing());
        x.Companion companion = x.INSTANCE;
        return x.g(jG, companion.b()) || x.g(v.g(spanStyle.getLetterSpacing()), companion.a());
    }

    private static final boolean d(TextStyle textStyle) {
        return d.d(textStyle.getSpanStyle()) || textStyle.n() != null;
    }

    private static final boolean e(U0.d dVar) {
        return ((double) dVar.getFontScale()) > 1.05d;
    }

    private static final SpanStyle f(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.x(spanStyle2);
    }

    private static final float g(long j10, float f10, U0.d dVar) {
        float fH;
        long jG = v.g(j10);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            if (!e(dVar)) {
                return dVar.w1(j10);
            }
            fH = v.h(j10) / v.h(dVar.x(f10));
        } else {
            if (!x.g(jG, companion.a())) {
                return Float.NaN;
            }
            fH = v.h(j10);
        }
        return fH * f10;
    }

    public static final void h(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            u(spannable, new BackgroundColorSpan(C3606v0.j(j10)), i10, i11);
        }
    }

    private static final void i(Spannable spannable, R0.a aVar, int i10, int i11) {
        if (aVar != null) {
            u(spannable, new J0.a(aVar.getMultiplier()), i10, i11);
        }
    }

    private static final void j(Spannable spannable, AbstractC3582j0 abstractC3582j0, float f10, int i10, int i11) {
        if (abstractC3582j0 != null) {
            if (abstractC3582j0 instanceof SolidColor) {
                k(spannable, ((SolidColor) abstractC3582j0).getValue(), i10, i11);
            } else if (abstractC3582j0 instanceof a1) {
                u(spannable, new Q0.b((a1) abstractC3582j0, f10), i10, i11);
            }
        }
    }

    public static final void k(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            u(spannable, new ForegroundColorSpan(C3606v0.j(j10)), i10, i11);
        }
    }

    private static final void l(Spannable spannable, g gVar, int i10, int i11) {
        if (gVar != null) {
            u(spannable, new Q0.a(gVar), i10, i11);
        }
    }

    private static final void m(Spannable spannable, TextStyle textStyle, List<C1060d.Range<SpanStyle>> list, r<? super AbstractC1341l, ? super FontWeight, ? super C1352w, ? super C1353x, ? extends Typeface> rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1060d.Range<SpanStyle> range = list.get(i10);
            C1060d.Range<SpanStyle> range2 = range;
            if (d.d(range2.g()) || range2.g().getFontSynthesis() != null) {
                arrayList.add(range);
            }
        }
        b(d(textStyle) ? new SpanStyle(0L, 0L, textStyle.o(), textStyle.m(), textStyle.n(), textStyle.j(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null) : null, arrayList, new a(spannable, rVar));
    }

    private static final void n(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            u(spannable, new J0.b(str), i10, i11);
        }
    }

    public static final void o(Spannable spannable, long j10, U0.d dVar, int i10, int i11) {
        long jG = v.g(j10);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            u(spannable, new AbsoluteSizeSpan(Da.a.c(dVar.w1(j10)), false), i10, i11);
        } else if (x.g(jG, companion.a())) {
            u(spannable, new RelativeSizeSpan(v.h(j10)), i10, i11);
        }
    }

    private static final void p(Spannable spannable, TextGeometricTransform textGeometricTransform, int i10, int i11) {
        if (textGeometricTransform != null) {
            u(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i10, i11);
            u(spannable, new m(textGeometricTransform.getSkewX()), i10, i11);
        }
    }

    public static final void q(Spannable spannable, long j10, float f10, U0.d dVar, LineHeightStyle lineHeightStyle) {
        float fG = g(j10, f10, dVar);
        if (Float.isNaN(fG)) {
            return;
        }
        u(spannable, new h(fG, 0, (spannable.length() == 0 || n.W0(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.c.f(lineHeightStyle.getTrim()), LineHeightStyle.c.g(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment()), 0, spannable.length());
    }

    public static final void r(Spannable spannable, long j10, float f10, U0.d dVar) {
        float fG = g(j10, f10, dVar);
        if (Float.isNaN(fG)) {
            return;
        }
        u(spannable, new J0.g(fG), 0, spannable.length());
    }

    public static final void s(Spannable spannable, LocaleList localeList, int i10, int i11) {
        if (localeList != null) {
            u(spannable, P0.a.f13705a.a(localeList), i10, i11);
        }
    }

    private static final void t(Spannable spannable, Shadow shadow, int i10, int i11) {
        if (shadow != null) {
            u(spannable, new l(C3606v0.j(shadow.getColor()), C3476g.m(shadow.getOffset()), C3476g.n(shadow.getOffset()), d.b(shadow.getBlurRadius())), i10, i11);
        }
    }

    public static final void u(Spannable spannable, Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }

    private static final void v(Spannable spannable, C1060d.Range<SpanStyle> range, U0.d dVar) {
        int iH = range.h();
        int iF = range.f();
        SpanStyle spanStyleG = range.g();
        i(spannable, spanStyleG.getBaselineShift(), iH, iF);
        k(spannable, spanStyleG.g(), iH, iF);
        j(spannable, spanStyleG.f(), spanStyleG.c(), iH, iF);
        x(spannable, spanStyleG.getTextDecoration(), iH, iF);
        o(spannable, spanStyleG.getFontSize(), dVar, iH, iF);
        n(spannable, spanStyleG.getFontFeatureSettings(), iH, iF);
        p(spannable, spanStyleG.getTextGeometricTransform(), iH, iF);
        s(spannable, spanStyleG.getLocaleList(), iH, iF);
        h(spannable, spanStyleG.getBackground(), iH, iF);
        t(spannable, spanStyleG.getShadow(), iH, iF);
        l(spannable, spanStyleG.getDrawStyle(), iH, iF);
    }

    public static final void w(Spannable spannable, TextStyle textStyle, List<C1060d.Range<SpanStyle>> list, U0.d dVar, r<? super AbstractC1341l, ? super FontWeight, ? super C1352w, ? super C1353x, ? extends Typeface> rVar) {
        MetricAffectingSpan metricAffectingSpanA;
        m(spannable, textStyle, list, rVar);
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C1060d.Range<SpanStyle> range = list.get(i10);
            int iH = range.h();
            int iF = range.f();
            if (iH >= 0 && iH < spannable.length() && iF > iH && iF <= spannable.length()) {
                v(spannable, range, dVar);
                if (c(range.g())) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C1060d.Range<SpanStyle> range2 = list.get(i11);
                int iH2 = range2.h();
                int iF2 = range2.f();
                SpanStyle spanStyleG = range2.g();
                if (iH2 >= 0 && iH2 < spannable.length() && iF2 > iH2 && iF2 <= spannable.length() && (metricAffectingSpanA = a(spanStyleG.getLetterSpacing(), dVar)) != null) {
                    u(spannable, metricAffectingSpanA, iH2, iF2);
                }
            }
        }
    }

    public static final void x(Spannable spannable, j jVar, int i10, int i11) {
        if (jVar != null) {
            j.Companion companion = j.INSTANCE;
            u(spannable, new J0.n(jVar.d(companion.c()), jVar.d(companion.a())), i10, i11);
        }
    }

    public static final void y(Spannable spannable, TextIndent textIndent, float f10, U0.d dVar) {
        if (textIndent != null) {
            if ((v.e(textIndent.getFirstLine(), w.e(0)) && v.e(textIndent.getRestLine(), w.e(0))) || w.f(textIndent.getFirstLine()) || w.f(textIndent.getRestLine())) {
                return;
            }
            long jG = v.g(textIndent.getFirstLine());
            x.Companion companion = x.INSTANCE;
            float fH = 0.0f;
            float fW1 = x.g(jG, companion.b()) ? dVar.w1(textIndent.getFirstLine()) : x.g(jG, companion.a()) ? v.h(textIndent.getFirstLine()) * f10 : 0.0f;
            long jG2 = v.g(textIndent.getRestLine());
            if (x.g(jG2, companion.b())) {
                fH = dVar.w1(textIndent.getRestLine());
            } else if (x.g(jG2, companion.a())) {
                fH = v.h(textIndent.getRestLine()) * f10;
            }
            u(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fW1), (int) Math.ceil(fH)), 0, spannable.length());
        }
    }
}
