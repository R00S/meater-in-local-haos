package H0;

import R0.LineHeightStyle;
import R0.TextIndent;
import R0.d;
import R0.e;
import R0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ParagraphStyle.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001af\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"LH0/u;", "style", "LU0/t;", "direction", "c", "(LH0/u;LU0/t;)LH0/u;", "LR0/i;", "textAlign", "LR0/k;", "textDirection", "LU0/v;", "lineHeight", "LR0/o;", "textIndent", "LH0/y;", "platformStyle", "LR0/g;", "lineHeightStyle", "LR0/e;", "lineBreak", "LR0/d;", "hyphens", "LR0/p;", "textMotion", "a", "(LH0/u;IIJLR0/o;LH0/y;LR0/g;IILR0/p;)LH0/u;", "other", "b", "(LH0/u;LH0/y;)LH0/y;", "J", "DefaultLineHeight", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static final long f5438a = U0.v.INSTANCE.a();

    public static final ParagraphStyle a(ParagraphStyle paragraphStyle, int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, R0.p pVar) {
        long j11;
        int textAlign = i10;
        TextIndent textIndent2 = textIndent;
        i.Companion companion = R0.i.INSTANCE;
        if (R0.i.k(textAlign, companion.g()) || R0.i.k(textAlign, paragraphStyle.getTextAlign())) {
            if (U0.w.f(j10)) {
                j11 = j10;
            } else {
                j11 = j10;
                if (U0.v.e(j11, paragraphStyle.getLineHeight())) {
                }
            }
            if ((textIndent2 == null || C3862t.b(textIndent2, paragraphStyle.getTextIndent())) && ((R0.k.j(i11, R0.k.INSTANCE.f()) || R0.k.j(i11, paragraphStyle.getTextDirection())) && ((platformParagraphStyle == null || C3862t.b(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || C3862t.b(lineHeightStyle, paragraphStyle.getLineHeightStyle())) && ((R0.e.d(i12, R0.e.INSTANCE.b()) || R0.e.d(i12, paragraphStyle.getLineBreak())) && ((R0.d.e(i13, R0.d.INSTANCE.c()) || R0.d.e(i13, paragraphStyle.getHyphens())) && (pVar == null || C3862t.b(pVar, paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j11 = j10;
        }
        long lineHeight = U0.w.f(j10) ? paragraphStyle.getLineHeight() : j11;
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (R0.i.k(textAlign, companion.g())) {
            textAlign = paragraphStyle.getTextAlign();
        }
        return new ParagraphStyle(textAlign, !R0.k.j(i11, R0.k.INSTANCE.f()) ? i11 : paragraphStyle.getTextDirection(), lineHeight, textIndent3, b(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, !R0.e.d(i12, R0.e.INSTANCE.b()) ? i12 : paragraphStyle.getLineBreak(), !R0.d.e(i13, R0.d.INSTANCE.c()) ? i13 : paragraphStyle.getHyphens(), pVar == null ? paragraphStyle.getTextMotion() : pVar, null);
    }

    private static final PlatformParagraphStyle b(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        return paragraphStyle.getPlatformStyle() == null ? platformParagraphStyle : platformParagraphStyle == null ? paragraphStyle.getPlatformStyle() : paragraphStyle.getPlatformStyle().c(platformParagraphStyle);
    }

    public static final ParagraphStyle c(ParagraphStyle paragraphStyle, U0.t tVar) {
        int textAlign = paragraphStyle.getTextAlign();
        i.Companion companion = R0.i.INSTANCE;
        int iF = R0.i.k(textAlign, companion.g()) ? companion.f() : paragraphStyle.getTextAlign();
        int iD = K.d(tVar, paragraphStyle.getTextDirection());
        long lineHeight = U0.w.f(paragraphStyle.getLineHeight()) ? f5438a : paragraphStyle.getLineHeight();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.a();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int lineBreak = paragraphStyle.getLineBreak();
        e.Companion companion2 = R0.e.INSTANCE;
        int iA = R0.e.d(lineBreak, companion2.b()) ? companion2.a() : paragraphStyle.getLineBreak();
        int hyphens = paragraphStyle.getHyphens();
        d.Companion companion3 = R0.d.INSTANCE;
        int iB = R0.d.e(hyphens, companion3.c()) ? companion3.b() : paragraphStyle.getHyphens();
        R0.p textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = R0.p.INSTANCE.a();
        }
        return new ParagraphStyle(iF, iD, lineHeight, textIndent2, platformStyle, lineHeightStyle, iA, iB, textMotion, null);
    }
}
