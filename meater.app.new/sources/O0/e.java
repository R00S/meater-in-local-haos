package O0;

import H0.C1060d;
import H0.C1063g;
import H0.Placeholder;
import H0.PlatformParagraphStyle;
import H0.PlatformTextStyle;
import H0.SpanStyle;
import H0.TextStyle;
import N0.LocaleList;
import R0.k;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC1341l;
import kotlin.Metadata;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aW\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"LR0/k;", "textDirection", "LN0/e;", "localeList", "", "d", "(ILN0/e;)I", "", "text", "LH0/J;", "style", "", "LH0/d$c;", "LH0/C;", "spanStyles", "LH0/w;", "placeholders", "LU0/d;", "density", "LL0/l$b;", "fontFamilyResolver", "LH0/r;", "a", "(Ljava/lang/String;LH0/J;Ljava/util/List;Ljava/util/List;LU0/d;LL0/l$b;)LH0/r;", "", "c", "(LH0/J;)Z", "hasEmojiCompat", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    public static final H0.r a(String str, TextStyle textStyle, List<C1060d.Range<SpanStyle>> list, List<C1060d.Range<Placeholder>> list2, U0.d dVar, AbstractC1341l.b bVar) {
        return new d(str, textStyle, list, list2, bVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        return !(((platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : C1063g.d(paragraphSyle.getEmojiSupportMatch())) == null ? false : C1063g.g(r1.getValue(), C1063g.INSTANCE.c()));
    }

    public static final int d(int i10, LocaleList localeList) {
        Locale platformLocale;
        k.Companion companion = R0.k.INSTANCE;
        if (R0.k.j(i10, companion.b())) {
            return 2;
        }
        if (!R0.k.j(i10, companion.c())) {
            if (R0.k.j(i10, companion.d())) {
                return 0;
            }
            if (R0.k.j(i10, companion.e())) {
                return 1;
            }
            if (!(R0.k.j(i10, companion.a()) ? true : R0.k.j(i10, companion.f()))) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            if (localeList == null || (platformLocale = localeList.i(0).getPlatformLocale()) == null) {
                platformLocale = Locale.getDefault();
            }
            int iA = q1.t.a(platformLocale);
            if (iA == 0 || iA != 1) {
                return 2;
            }
        }
        return 3;
    }
}
