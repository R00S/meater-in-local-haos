package P0;

import Ba.r;
import H0.SpanStyle;
import N0.LocaleList;
import O0.g;
import R0.TextGeometricTransform;
import R0.p;
import U0.v;
import U0.x;
import android.graphics.Typeface;
import h0.C3482m;
import i0.C3602t0;
import kotlin.AbstractC1341l;
import kotlin.C1352w;
import kotlin.C1353x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: TextPaintExtensions.android.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LO0/g;", "LH0/C;", "style", "Lkotlin/Function4;", "LL0/l;", "LL0/B;", "LL0/w;", "LL0/x;", "Landroid/graphics/Typeface;", "resolveTypeface", "LU0/d;", "density", "", "requiresLetterSpacing", "a", "(LO0/g;LH0/C;LBa/r;LU0/d;Z)LH0/C;", "LU0/v;", "letterSpacing", "Li0/t0;", "background", "LR0/a;", "baselineShift", "c", "(JZJLR0/a;)LH0/C;", "LR0/p;", "textMotion", "Loa/F;", "e", "(LO0/g;LR0/p;)V", "d", "(LH0/C;)Z", "", "blurRadius", "b", "(F)F", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    public static final SpanStyle a(g gVar, SpanStyle spanStyle, r<? super AbstractC1341l, ? super FontWeight, ? super C1352w, ? super C1353x, ? extends Typeface> rVar, U0.d dVar, boolean z10) {
        long jG = v.g(spanStyle.getFontSize());
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            gVar.setTextSize(dVar.w1(spanStyle.getFontSize()));
        } else if (x.g(jG, companion.a())) {
            gVar.setTextSize(gVar.getTextSize() * v.h(spanStyle.getFontSize()));
        }
        if (d(spanStyle)) {
            AbstractC1341l fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.d();
            }
            C1352w fontStyle = spanStyle.getFontStyle();
            C1352w c1352wC = C1352w.c(fontStyle != null ? fontStyle.getValue() : C1352w.INSTANCE.b());
            C1353x fontSynthesis = spanStyle.getFontSynthesis();
            gVar.setTypeface(rVar.k(fontFamily, fontWeight, c1352wC, C1353x.b(fontSynthesis != null ? fontSynthesis.getValue() : C1353x.INSTANCE.a())));
        }
        if (spanStyle.getLocaleList() != null && !C3862t.b(spanStyle.getLocaleList(), LocaleList.INSTANCE.a())) {
            a.f13705a.b(gVar, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !C3862t.b(spanStyle.getFontFeatureSettings(), "")) {
            gVar.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !C3862t.b(spanStyle.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.a())) {
            gVar.setTextScaleX(gVar.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            gVar.setTextSkewX(gVar.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        gVar.f(spanStyle.g());
        gVar.e(spanStyle.f(), C3482m.INSTANCE.a(), spanStyle.c());
        gVar.h(spanStyle.getShadow());
        gVar.i(spanStyle.getTextDecoration());
        gVar.g(spanStyle.getDrawStyle());
        if (x.g(v.g(spanStyle.getLetterSpacing()), companion.b()) && v.h(spanStyle.getLetterSpacing()) != 0.0f) {
            float textSize = gVar.getTextSize() * gVar.getTextScaleX();
            float fW1 = dVar.w1(spanStyle.getLetterSpacing());
            if (textSize != 0.0f) {
                gVar.setLetterSpacing(fW1 / textSize);
            }
        } else if (x.g(v.g(spanStyle.getLetterSpacing()), companion.a())) {
            gVar.setLetterSpacing(v.h(spanStyle.getLetterSpacing()));
        }
        return c(spanStyle.getLetterSpacing(), z10, spanStyle.getBackground(), spanStyle.getBaselineShift());
    }

    public static final float b(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    private static final SpanStyle c(long j10, boolean z10, long j11, R0.a aVar) {
        long jE = j11;
        boolean z11 = false;
        boolean z12 = z10 && x.g(v.g(j10), x.INSTANCE.b()) && v.h(j10) != 0.0f;
        C3602t0.Companion companion = C3602t0.INSTANCE;
        boolean z13 = (C3602t0.m(jE, companion.e()) || C3602t0.m(jE, companion.d())) ? false : true;
        if (aVar != null) {
            if (!R0.a.e(aVar.getMultiplier(), R0.a.INSTANCE.a())) {
                z11 = true;
            }
        }
        if (!z12 && !z13 && !z11) {
            return null;
        }
        long jA = z12 ? j10 : v.INSTANCE.a();
        if (!z13) {
            jE = companion.e();
        }
        return new SpanStyle(0L, 0L, null, null, null, null, null, jA, z11 ? aVar : null, null, null, jE, null, null, null, null, 63103, null);
    }

    public static final boolean d(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void e(g gVar, p pVar) {
        if (pVar == null) {
            pVar = p.INSTANCE.a();
        }
        gVar.setFlags(pVar.getSubpixelTextPositioning() ? gVar.getFlags() | 128 : gVar.getFlags() & (-129));
        int linearity = pVar.getLinearity();
        p.b.Companion companion = p.b.INSTANCE;
        if (p.b.e(linearity, companion.b())) {
            gVar.setFlags(gVar.getFlags() | 64);
            gVar.setHinting(0);
        } else if (p.b.e(linearity, companion.a())) {
            gVar.getFlags();
            gVar.setHinting(1);
        } else if (!p.b.e(linearity, companion.c())) {
            gVar.getFlags();
        } else {
            gVar.getFlags();
            gVar.setHinting(0);
        }
    }
}
