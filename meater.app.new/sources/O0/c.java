package O0;

import H0.C1060d;
import H0.C1063g;
import H0.Placeholder;
import H0.PlatformParagraphStyle;
import H0.PlatformTextStyle;
import H0.SpanStyle;
import H0.TextStyle;
import R0.LineHeightStyle;
import R0.TextIndent;
import U0.w;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.List;
import kotlin.AbstractC1341l;
import kotlin.C1352w;
import kotlin.C1353x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidParagraphHelper.android.kt */
@Metadata(d1 = {"\u0000[\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u001c\u001a\u0087\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\f2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0015*\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"", "text", "", "contextFontSize", "LH0/J;", "contextTextStyle", "", "LH0/d$c;", "LH0/C;", "spanStyles", "LH0/w;", "placeholders", "LU0/d;", "density", "Lkotlin/Function4;", "LL0/l;", "LL0/B;", "LL0/w;", "LL0/x;", "Landroid/graphics/Typeface;", "resolveTypeface", "", "useEmojiCompat", "", "a", "(Ljava/lang/String;FLH0/J;Ljava/util/List;Ljava/util/List;LU0/d;LBa/r;Z)Ljava/lang/CharSequence;", "b", "(LH0/J;)Z", "O0/c$a", "LO0/c$a;", "NoopSpan", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final a f13070a = new a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.emoji2.text.f] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final CharSequence a(String str, float f10, TextStyle textStyle, List<C1060d.Range<SpanStyle>> list, List<C1060d.Range<Placeholder>> list2, U0.d dVar, Ba.r<? super AbstractC1341l, ? super FontWeight, ? super C1352w, ? super C1353x, ? extends Typeface> rVar, boolean z10) {
        CharSequence charSequenceS;
        PlatformParagraphStyle paragraphSyle;
        if (z10 && androidx.emoji2.text.f.i()) {
            PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            C1063g c1063gD = (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : C1063g.d(paragraphSyle.getEmojiSupportMatch());
            charSequenceS = androidx.emoji2.text.f.c().s(str, 0, str.length(), Integer.MAX_VALUE, c1063gD == null ? 0 : C1063g.g(c1063gD.getValue(), C1063g.INSTANCE.a()));
            C3862t.d(charSequenceS);
        } else {
            charSequenceS = str;
        }
        if (list.isEmpty() && list2.isEmpty() && C3862t.b(textStyle.D(), TextIndent.INSTANCE.a()) && w.f(textStyle.s())) {
            return charSequenceS;
        }
        Spannable spannableString = charSequenceS instanceof Spannable ? (Spannable) charSequenceS : new SpannableString(charSequenceS);
        if (C3862t.b(textStyle.A(), R0.j.INSTANCE.c())) {
            P0.c.u(spannableString, f13070a, 0, str.length());
        }
        if (b(textStyle) && textStyle.t() == null) {
            P0.c.r(spannableString, textStyle.s(), f10, dVar);
        } else {
            LineHeightStyle lineHeightStyleT = textStyle.t();
            if (lineHeightStyleT == null) {
                lineHeightStyleT = LineHeightStyle.INSTANCE.a();
            }
            P0.c.q(spannableString, textStyle.s(), f10, dVar, lineHeightStyleT);
        }
        P0.c.y(spannableString, textStyle.D(), f10, dVar);
        P0.c.w(spannableString, textStyle, list, dVar, rVar);
        P0.b.d(spannableString, list2, dVar);
        return spannableString;
    }

    public static final boolean b(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) {
            return false;
        }
        return paragraphSyle.getIncludeFontPadding();
    }

    /* compiled from: AndroidParagraphHelper.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"O0/c$a", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "p0", "Loa/F;", "updateDrawState", "(Landroid/text/TextPaint;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint p02) {
        }
    }
}
