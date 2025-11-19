package H0;

import N0.LocaleList;
import R0.TextGeometricTransform;
import i0.C3602t0;
import i0.Shadow;
import kotlin.AbstractC1341l;
import kotlin.C1352w;
import kotlin.C1353x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;

/* compiled from: SpanStyle.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aÀ\u0001\u0010&\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010)\u001a\u0004\u0018\u00010\"*\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b)\u0010*\"\u0014\u0010-\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010.\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010,\"\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010,\"\u0014\u00100\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010,\"\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"LH0/C;", "style", "d", "(LH0/C;)LH0/C;", "Li0/t0;", "color", "Li0/j0;", "brush", "", "alpha", "LU0/v;", "fontSize", "LL0/B;", "fontWeight", "LL0/w;", "fontStyle", "LL0/x;", "fontSynthesis", "LL0/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LR0/a;", "baselineShift", "LR0/n;", "textGeometricTransform", "LN0/e;", "localeList", "background", "LR0/j;", "textDecoration", "Li0/b1;", "shadow", "LH0/z;", "platformStyle", "Lk0/g;", "drawStyle", "b", "(LH0/C;JLi0/j0;FJLL0/B;LL0/w;LL0/x;LL0/l;Ljava/lang/String;JLR0/a;LR0/n;LN0/e;JLR0/j;Li0/b1;LH0/z;Lk0/g;)LH0/C;", "other", "c", "(LH0/C;LH0/z;)LH0/z;", "a", "J", "DefaultFontSize", "DefaultLetterSpacing", "DefaultBackgroundColor", "DefaultColor", "LR0/m;", "e", "LR0/m;", "DefaultColorForegroundStyle", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private static final long f5314a = U0.w.e(14);

    /* renamed from: b, reason: collision with root package name */
    private static final long f5315b = U0.w.e(0);

    /* renamed from: c, reason: collision with root package name */
    private static final long f5316c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f5317d;

    /* renamed from: e, reason: collision with root package name */
    private static final R0.m f5318e;

    /* compiled from: SpanStyle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LR0/m;", "a", "()LR0/m;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<R0.m> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f5319B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.m invoke() {
            return D.f5318e;
        }
    }

    static {
        C3602t0.Companion companion = C3602t0.INSTANCE;
        f5316c = companion.d();
        long jA = companion.a();
        f5317d = jA;
        f5318e = R0.m.INSTANCE.b(jA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final H0.SpanStyle b(H0.SpanStyle r19, long r20, i0.AbstractC3582j0 r22, float r23, long r24, kotlin.FontWeight r26, kotlin.C1352w r27, kotlin.C1353x r28, kotlin.AbstractC1341l r29, java.lang.String r30, long r31, R0.a r33, R0.TextGeometricTransform r34, N0.LocaleList r35, long r36, R0.j r38, i0.Shadow r39, H0.z r40, k0.g r41) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.D.b(H0.C, long, i0.j0, float, long, L0.B, L0.w, L0.x, L0.l, java.lang.String, long, R0.a, R0.n, N0.e, long, R0.j, i0.b1, H0.z, k0.g):H0.C");
    }

    private static final z c(SpanStyle spanStyle, z zVar) {
        spanStyle.q();
        return zVar;
    }

    public static final SpanStyle d(SpanStyle spanStyle) {
        R0.m mVarF = spanStyle.getTextForegroundStyle().f(a.f5319B);
        long fontSize = U0.w.f(spanStyle.getFontSize()) ? f5314a : spanStyle.getFontSize();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.d();
        }
        FontWeight fontWeight2 = fontWeight;
        C1352w fontStyle = spanStyle.getFontStyle();
        C1352w c1352wC = C1352w.c(fontStyle != null ? fontStyle.getValue() : C1352w.INSTANCE.b());
        C1353x fontSynthesis = spanStyle.getFontSynthesis();
        C1353x c1353xB = C1353x.b(fontSynthesis != null ? fontSynthesis.getValue() : C1353x.INSTANCE.a());
        AbstractC1341l fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = AbstractC1341l.INSTANCE.a();
        }
        AbstractC1341l abstractC1341l = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long letterSpacing = U0.w.f(spanStyle.getLetterSpacing()) ? f5315b : spanStyle.getLetterSpacing();
        R0.a baselineShift = spanStyle.getBaselineShift();
        R0.a aVarB = R0.a.b(baselineShift != null ? baselineShift.getMultiplier() : R0.a.INSTANCE.a());
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.a();
        }
        LocaleList localeList2 = localeList;
        long background = spanStyle.getBackground();
        if (background == 16) {
            background = f5316c;
        }
        long j10 = background;
        R0.j textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = R0.j.INSTANCE.b();
        }
        R0.j jVar = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.a();
        }
        Shadow shadow2 = shadow;
        spanStyle.q();
        k0.g drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = k0.j.f43725a;
        }
        return new SpanStyle(mVarF, fontSize, fontWeight2, c1352wC, c1353xB, abstractC1341l, str, letterSpacing, aVarB, textGeometricTransform2, localeList2, j10, jVar, shadow2, (z) null, drawStyle, (C3854k) null);
    }
}
