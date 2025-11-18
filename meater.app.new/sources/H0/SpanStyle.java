package H0;

import N0.LocaleList;
import R0.TextGeometricTransform;
import i0.AbstractC3582j0;
import i0.C3602t0;
import i0.Shadow;
import kotlin.AbstractC1341l;
import kotlin.C1352w;
import kotlin.C1353x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: SpanStyle.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B¿\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010$J\u001b\u0010&\u001a\u00020\u00002\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b&\u0010'JÈ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020*2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u0000H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020*2\u0006\u0010%\u001a\u00020\u0000H\u0000¢\u0006\u0004\b/\u0010.J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010\t\u001a\u0004\u0018\u00010\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u00104R\u001d\u0010\u0010\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bO\u00109\u001a\u0004\bP\u0010;R\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010Q\u001a\u0004\bD\u0010RR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bN\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b:\u0010V\u001a\u0004\bW\u0010XR\u001d\u0010\u0018\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\b@\u0010;R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bF\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b>\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bP\u0010_\u001a\u0004\bO\u0010`R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010#\u001a\u00020\u00178Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bL\u0010;R\u0013\u0010f\u001a\u0004\u0018\u00010d8F¢\u0006\u0006\u001a\u0004\bH\u0010eR\u0011\u0010i\u001a\u00020g8F¢\u0006\u0006\u001a\u0004\b<\u0010h\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"LH0/C;", "", "LR0/m;", "textForegroundStyle", "LU0/v;", "fontSize", "LL0/B;", "fontWeight", "LL0/w;", "fontStyle", "LL0/x;", "fontSynthesis", "LL0/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LR0/a;", "baselineShift", "LR0/n;", "textGeometricTransform", "LN0/e;", "localeList", "Li0/t0;", "background", "LR0/j;", "textDecoration", "Li0/b1;", "shadow", "LH0/z;", "platformStyle", "Lk0/g;", "drawStyle", "<init>", "(LR0/m;JLL0/B;LL0/w;LL0/x;LL0/l;Ljava/lang/String;JLR0/a;LR0/n;LN0/e;JLR0/j;Li0/b1;LH0/z;Lk0/g;Lkotlin/jvm/internal/k;)V", "color", "(JJLL0/B;LL0/w;LL0/x;LL0/l;Ljava/lang/String;JLR0/a;LR0/n;LN0/e;JLR0/j;Li0/b1;LH0/z;Lk0/g;Lkotlin/jvm/internal/k;)V", "other", "x", "(LH0/C;)LH0/C;", "a", "(JJLL0/B;LL0/w;LL0/x;LL0/l;Ljava/lang/String;JLR0/a;LR0/n;LN0/e;JLR0/j;Li0/b1;LH0/z;Lk0/g;)LH0/C;", "", "equals", "(Ljava/lang/Object;)Z", "v", "(LH0/C;)Z", "w", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "LR0/m;", "t", "()LR0/m;", "b", "J", "k", "()J", "c", "LL0/B;", "n", "()LL0/B;", "d", "LL0/w;", "l", "()LL0/w;", "e", "LL0/x;", "m", "()LL0/x;", "f", "LL0/l;", "i", "()LL0/l;", "g", "Ljava/lang/String;", "j", "h", "o", "LR0/a;", "()LR0/a;", "LR0/n;", "u", "()LR0/n;", "LN0/e;", "p", "()LN0/e;", "LR0/j;", "s", "()LR0/j;", "Li0/b1;", "r", "()Li0/b1;", "Lk0/g;", "()Lk0/g;", "LH0/z;", "q", "()LH0/z;", "Li0/j0;", "()Li0/j0;", "brush", "", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.C, reason: from toString */
/* loaded from: classes.dex */
public final class SpanStyle {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final R0.m textForegroundStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long fontSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FontWeight fontWeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final C1352w fontStyle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final C1353x fontSynthesis;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC1341l fontFamily;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fontFeatureSettings;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long letterSpacing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final R0.a baselineShift;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextGeometricTransform textGeometricTransform;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocaleList localeList;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long background;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final R0.j textDecoration;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Shadow shadow;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final k0.g drawStyle;

    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, C1352w c1352w, C1353x c1353x, AbstractC1341l abstractC1341l, String str, long j12, R0.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, R0.j jVar, Shadow b1Var, z zVar, k0.g gVar, C3854k c3854k) {
        this(j10, j11, fontWeight, c1352w, c1353x, abstractC1341l, str, j12, aVar, textGeometricTransform, localeList, j13, jVar, b1Var, zVar, gVar);
    }

    public static /* synthetic */ SpanStyle b(SpanStyle spanStyle, long j10, long j11, FontWeight fontWeight, C1352w c1352w, C1353x c1353x, AbstractC1341l abstractC1341l, String str, long j12, R0.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, R0.j jVar, Shadow b1Var, z zVar, k0.g gVar, int i10, Object obj) {
        z zVar2;
        long jG = (i10 & 1) != 0 ? spanStyle.g() : j10;
        long j14 = (i10 & 2) != 0 ? spanStyle.fontSize : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? spanStyle.fontWeight : fontWeight;
        C1352w c1352w2 = (i10 & 8) != 0 ? spanStyle.fontStyle : c1352w;
        C1353x c1353x2 = (i10 & 16) != 0 ? spanStyle.fontSynthesis : c1353x;
        AbstractC1341l abstractC1341l2 = (i10 & 32) != 0 ? spanStyle.fontFamily : abstractC1341l;
        String str2 = (i10 & 64) != 0 ? spanStyle.fontFeatureSettings : str;
        long j15 = (i10 & 128) != 0 ? spanStyle.letterSpacing : j12;
        R0.a aVar2 = (i10 & 256) != 0 ? spanStyle.baselineShift : aVar;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? spanStyle.localeList : localeList;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        long j16 = (i10 & 2048) != 0 ? spanStyle.background : j13;
        R0.j jVar2 = (i10 & 4096) != 0 ? spanStyle.textDecoration : jVar;
        Shadow b1Var2 = (i10 & 8192) != 0 ? spanStyle.shadow : b1Var;
        if ((i10 & 16384) != 0) {
            spanStyle.getClass();
            zVar2 = null;
        } else {
            zVar2 = zVar;
        }
        return spanStyle.a(jG, j14, fontWeight2, c1352w2, c1353x2, abstractC1341l2, str2, j15, aVar2, textGeometricTransform3, localeList2, j16, jVar2, b1Var2, zVar2, (i10 & 32768) != 0 ? spanStyle.drawStyle : gVar);
    }

    public final SpanStyle a(long color, long fontSize, FontWeight fontWeight, C1352w fontStyle, C1353x fontSynthesis, AbstractC1341l fontFamily, String fontFeatureSettings, long letterSpacing, R0.a baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, R0.j textDecoration, Shadow shadow, z platformStyle, k0.g drawStyle) {
        return new SpanStyle(C3602t0.m(color, g()) ? this.textForegroundStyle : R0.m.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, (C3854k) null);
    }

    public final float c() {
        return this.textForegroundStyle.d();
    }

    /* renamed from: d, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: e, reason: from getter */
    public final R0.a getBaselineShift() {
        return this.baselineShift;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) other;
        return v(spanStyle) && w(spanStyle);
    }

    public final AbstractC3582j0 f() {
        return this.textForegroundStyle.h();
    }

    public final long g() {
        return this.textForegroundStyle.getValue();
    }

    /* renamed from: h, reason: from getter */
    public final k0.g getDrawStyle() {
        return this.drawStyle;
    }

    public int hashCode() {
        int iS = C3602t0.s(g()) * 31;
        AbstractC3582j0 abstractC3582j0F = f();
        int iHashCode = (((((iS + (abstractC3582j0F != null ? abstractC3582j0F.hashCode() : 0)) * 31) + Float.hashCode(c())) * 31) + U0.v.i(this.fontSize)) * 31;
        FontWeight fontWeight = this.fontWeight;
        int weight = (iHashCode + (fontWeight != null ? fontWeight.getWeight() : 0)) * 31;
        C1352w c1352w = this.fontStyle;
        int iG = (weight + (c1352w != null ? C1352w.g(c1352w.getValue()) : 0)) * 31;
        C1353x c1353x = this.fontSynthesis;
        int iF = (iG + (c1353x != null ? C1353x.f(c1353x.getValue()) : 0)) * 31;
        AbstractC1341l abstractC1341l = this.fontFamily;
        int iHashCode2 = (iF + (abstractC1341l != null ? abstractC1341l.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + U0.v.i(this.letterSpacing)) * 31;
        R0.a aVar = this.baselineShift;
        int iF2 = (iHashCode3 + (aVar != null ? R0.a.f(aVar.getMultiplier()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode4 = (iF2 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode5 = (((iHashCode4 + (localeList != null ? localeList.hashCode() : 0)) * 31) + C3602t0.s(this.background)) * 31;
        R0.j jVar = this.textDecoration;
        int iHashCode6 = (iHashCode5 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        Shadow b1Var = this.shadow;
        int iHashCode7 = (iHashCode6 + (b1Var != null ? b1Var.hashCode() : 0)) * 961;
        k0.g gVar = this.drawStyle;
        return iHashCode7 + (gVar != null ? gVar.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final AbstractC1341l getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: j, reason: from getter */
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: k, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* renamed from: l, reason: from getter */
    public final C1352w getFontStyle() {
        return this.fontStyle;
    }

    /* renamed from: m, reason: from getter */
    public final C1353x getFontSynthesis() {
        return this.fontSynthesis;
    }

    /* renamed from: n, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: o, reason: from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    /* renamed from: p, reason: from getter */
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final z q() {
        return null;
    }

    /* renamed from: r, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    /* renamed from: s, reason: from getter */
    public final R0.j getTextDecoration() {
        return this.textDecoration;
    }

    /* renamed from: t, reason: from getter */
    public final R0.m getTextForegroundStyle() {
        return this.textForegroundStyle;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) C3602t0.t(g())) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + ((Object) U0.v.j(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) U0.v.j(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) C3602t0.t(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + ((Object) null) + ", drawStyle=" + this.drawStyle + ')';
    }

    /* renamed from: u, reason: from getter */
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean v(SpanStyle other) {
        if (this == other) {
            return true;
        }
        return U0.v.e(this.fontSize, other.fontSize) && C3862t.b(this.fontWeight, other.fontWeight) && C3862t.b(this.fontStyle, other.fontStyle) && C3862t.b(this.fontSynthesis, other.fontSynthesis) && C3862t.b(this.fontFamily, other.fontFamily) && C3862t.b(this.fontFeatureSettings, other.fontFeatureSettings) && U0.v.e(this.letterSpacing, other.letterSpacing) && C3862t.b(this.baselineShift, other.baselineShift) && C3862t.b(this.textGeometricTransform, other.textGeometricTransform) && C3862t.b(this.localeList, other.localeList) && C3602t0.m(this.background, other.background) && C3862t.b(null, null);
    }

    public final boolean w(SpanStyle other) {
        return C3862t.b(this.textForegroundStyle, other.textForegroundStyle) && C3862t.b(this.textDecoration, other.textDecoration) && C3862t.b(this.shadow, other.shadow) && C3862t.b(this.drawStyle, other.drawStyle);
    }

    public final SpanStyle x(SpanStyle other) {
        return other == null ? this : D.b(this, other.textForegroundStyle.getValue(), other.textForegroundStyle.h(), other.textForegroundStyle.d(), other.fontSize, other.fontWeight, other.fontStyle, other.fontSynthesis, other.fontFamily, other.fontFeatureSettings, other.letterSpacing, other.baselineShift, other.textGeometricTransform, other.localeList, other.background, other.textDecoration, other.shadow, null, other.drawStyle);
    }

    public /* synthetic */ SpanStyle(R0.m mVar, long j10, FontWeight fontWeight, C1352w c1352w, C1353x c1353x, AbstractC1341l abstractC1341l, String str, long j11, R0.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, R0.j jVar, Shadow b1Var, z zVar, k0.g gVar, C3854k c3854k) {
        this(mVar, j10, fontWeight, c1352w, c1353x, abstractC1341l, str, j11, aVar, textGeometricTransform, localeList, j12, jVar, b1Var, zVar, gVar);
    }

    private SpanStyle(R0.m mVar, long j10, FontWeight fontWeight, C1352w c1352w, C1353x c1353x, AbstractC1341l abstractC1341l, String str, long j11, R0.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, R0.j jVar, Shadow b1Var, z zVar, k0.g gVar) {
        this.textForegroundStyle = mVar;
        this.fontSize = j10;
        this.fontWeight = fontWeight;
        this.fontStyle = c1352w;
        this.fontSynthesis = c1353x;
        this.fontFamily = abstractC1341l;
        this.fontFeatureSettings = str;
        this.letterSpacing = j11;
        this.baselineShift = aVar;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j12;
        this.textDecoration = jVar;
        this.shadow = b1Var;
        this.drawStyle = gVar;
    }

    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, C1352w c1352w, C1353x c1353x, AbstractC1341l abstractC1341l, String str, long j12, R0.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, R0.j jVar, Shadow b1Var, z zVar, k0.g gVar, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? C3602t0.INSTANCE.e() : j10, (i10 & 2) != 0 ? U0.v.INSTANCE.a() : j11, (i10 & 4) != 0 ? null : fontWeight, (i10 & 8) != 0 ? null : c1352w, (i10 & 16) != 0 ? null : c1353x, (i10 & 32) != 0 ? null : abstractC1341l, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? U0.v.INSTANCE.a() : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : textGeometricTransform, (i10 & 1024) != 0 ? null : localeList, (i10 & 2048) != 0 ? C3602t0.INSTANCE.e() : j13, (i10 & 4096) != 0 ? null : jVar, (i10 & 8192) != 0 ? null : b1Var, (i10 & 16384) != 0 ? null : zVar, (i10 & 32768) != 0 ? null : gVar, (C3854k) null);
    }

    private SpanStyle(long j10, long j11, FontWeight fontWeight, C1352w c1352w, C1353x c1353x, AbstractC1341l abstractC1341l, String str, long j12, R0.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, R0.j jVar, Shadow b1Var, z zVar, k0.g gVar) {
        this(R0.m.INSTANCE.b(j10), j11, fontWeight, c1352w, c1353x, abstractC1341l, str, j12, aVar, textGeometricTransform, localeList, j13, jVar, b1Var, zVar, gVar, (C3854k) null);
    }
}
