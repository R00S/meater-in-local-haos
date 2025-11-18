package I0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: TextLayout.android.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a5\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 \"\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "k", "(I)Landroid/text/TextDirectionHeuristic;", "topPadding", "bottomPadding", "LI0/b0;", "a", "(II)J", "LI0/Z;", "l", "(LI0/Z;)J", "", "LJ0/h;", "i", "([LJ0/h;)J", "Landroid/text/TextPaint;", "textPaint", "frameworkTextDir", "lineHeightSpans", "Landroid/graphics/Paint$FontMetricsInt;", "h", "(LI0/Z;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[LJ0/h;)Landroid/graphics/Paint$FontMetricsInt;", "j", "(LI0/Z;)[LJ0/h;", "Landroid/text/Layout;", "lineIndex", "", "m", "(Landroid/text/Layout;I)Z", "LI0/Y;", "LI0/Y;", "SharedTextAndroidCanvas", "b", "J", "ZeroVerticalPadding", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Y f6618a = new Y();

    /* renamed from: b, reason: collision with root package name */
    private static final long f6619b = a(0, 0);

    public static final long a(int i10, int i11) {
        return b0.a((i11 & 4294967295L) | (i10 << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt h(Z z10, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, J0.h[] hVarArr) {
        int iL = z10.l() - 1;
        if (z10.h().getLineStart(iL) != z10.h().getLineEnd(iL) || hVarArr == null || hVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        J0.h hVar = (J0.h) C3831l.X(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (iL == 0 || !hVar.getTrimLastLineBottom()) ? hVar.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutA = U.f6573a.a(spannableString, textPaint, Integer.MAX_VALUE, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString.length() : spannableString.length(), (2072512 & 32) != 0 ? C1187y.f6635a.b() : textDirectionHeuristic, (2072512 & 64) != 0 ? C1187y.f6635a.a() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 256) != 0 ? null : null, (2072512 & 512) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 1024) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : z10.g(), (2072512 & 16384) != 0 ? true : z10.d(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & 1048576) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutA.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutA.getLineDescent(0);
        fontMetricsInt.top = staticLayoutA.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutA.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(J0.h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (J0.h hVar : hVarArr) {
            if (hVar.getFirstAscentDiff() < 0) {
                iMax = Math.max(iMax, Math.abs(hVar.getFirstAscentDiff()));
            }
            if (hVar.getLastDescentDiff() < 0) {
                iMax2 = Math.max(iMax, Math.abs(hVar.getLastDescentDiff()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f6619b : a(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J0.h[] j(Z z10) {
        if (!(z10.D() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceD = z10.D();
        C3862t.e(charSequenceD, "null cannot be cast to non-null type android.text.Spanned");
        if (!H.a((Spanned) charSequenceD, J0.h.class) && z10.D().length() > 0) {
            return null;
        }
        CharSequence charSequenceD2 = z10.D();
        C3862t.e(charSequenceD2, "null cannot be cast to non-null type android.text.Spanned");
        return (J0.h[]) ((Spanned) charSequenceD2).getSpans(0, z10.D().length(), J0.h.class);
    }

    public static final TextDirectionHeuristic k(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(Z z10) {
        if (z10.g() || z10.E()) {
            return f6619b;
        }
        TextPaint paint = z10.h().getPaint();
        CharSequence text = z10.h().getText();
        Rect rectC = G.c(paint, text, z10.h().getLineStart(0), z10.h().getLineEnd(0));
        int lineAscent = z10.h().getLineAscent(0);
        int i10 = rectC.top;
        int topPadding = i10 < lineAscent ? lineAscent - i10 : z10.h().getTopPadding();
        if (z10.l() != 1) {
            int iL = z10.l() - 1;
            rectC = G.c(paint, text, z10.h().getLineStart(iL), z10.h().getLineEnd(iL));
        }
        int lineDescent = z10.h().getLineDescent(z10.l() - 1);
        int i11 = rectC.bottom;
        int bottomPadding = i11 > lineDescent ? i11 - lineDescent : z10.h().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f6619b : a(topPadding, bottomPadding);
    }

    public static final boolean m(Layout layout, int i10) {
        return layout.getEllipsisCount(i10) > 0;
    }
}
