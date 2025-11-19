package G;

import H0.K;
import H0.TextStyle;
import U0.t;
import kotlin.AbstractC1341l;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: MinLinesConstrainer.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001\u0012B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"LG/c;", "", "LU0/t;", "layoutDirection", "LH0/J;", "inputTextStyle", "LU0/d;", "density", "LL0/l$b;", "fontFamilyResolver", "<init>", "(LU0/t;LH0/J;LU0/d;LL0/l$b;)V", "LU0/b;", "inConstraints", "", "minLines", "c", "(JI)J", "a", "LU0/t;", "g", "()LU0/t;", "b", "LH0/J;", "f", "()LH0/J;", "LU0/d;", "d", "()LU0/d;", "LL0/l$b;", "e", "()LL0/l$b;", "resolvedStyle", "", "F", "lineHeightCache", "oneLineHeightCache", "h", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f4758i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static c f4759j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t layoutDirection;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextStyle inputTextStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final U0.d density;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1341l.b fontFamilyResolver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final TextStyle resolvedStyle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float lineHeightCache;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float oneLineHeightCache;

    /* compiled from: MinLinesConstrainer.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LG/c$a;", "", "<init>", "()V", "LG/c;", "minMaxUtil", "LU0/t;", "layoutDirection", "LH0/J;", "paramStyle", "LU0/d;", "density", "LL0/l$b;", "fontFamilyResolver", "a", "(LG/c;LU0/t;LH0/J;LU0/d;LL0/l$b;)LG/c;", "last", "LG/c;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final c a(c minMaxUtil, t layoutDirection, TextStyle paramStyle, U0.d density, AbstractC1341l.b fontFamilyResolver) {
            if (minMaxUtil != null && layoutDirection == minMaxUtil.getLayoutDirection() && C3862t.b(paramStyle, minMaxUtil.getInputTextStyle()) && density.getDensity() == minMaxUtil.getDensity().getDensity() && fontFamilyResolver == minMaxUtil.getFontFamilyResolver()) {
                return minMaxUtil;
            }
            c cVar = c.f4759j;
            if (cVar != null && layoutDirection == cVar.getLayoutDirection() && C3862t.b(paramStyle, cVar.getInputTextStyle()) && density.getDensity() == cVar.getDensity().getDensity() && fontFamilyResolver == cVar.getFontFamilyResolver()) {
                return cVar;
            }
            c cVar2 = new c(layoutDirection, K.c(paramStyle, layoutDirection), U0.f.a(density.getDensity(), density.getFontScale()), fontFamilyResolver, null);
            c.f4759j = cVar2;
            return cVar2;
        }

        private Companion() {
        }
    }

    public /* synthetic */ c(t tVar, TextStyle textStyle, U0.d dVar, AbstractC1341l.b bVar, C3854k c3854k) {
        this(tVar, textStyle, dVar, bVar);
    }

    public final long c(long inConstraints, int minLines) {
        float fA = this.oneLineHeightCache;
        float fA2 = this.lineHeightCache;
        if (Float.isNaN(fA) || Float.isNaN(fA2)) {
            fA = H0.t.a(d.f4767a, this.resolvedStyle, U0.c.b(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (96 & 32) != 0 ? r.m() : null, (96 & 64) != 0 ? r.m() : null, (96 & 128) != 0 ? Integer.MAX_VALUE : 1, (96 & 256) != 0 ? false : false).a();
            fA2 = H0.t.a(d.f4768b, this.resolvedStyle, U0.c.b(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (96 & 32) != 0 ? r.m() : null, (96 & 64) != 0 ? r.m() : null, (96 & 128) != 0 ? Integer.MAX_VALUE : 2, (96 & 256) != 0 ? false : false).a() - fA;
            this.oneLineHeightCache = fA;
            this.lineHeightCache = fA2;
        }
        return U0.c.a(U0.b.n(inConstraints), U0.b.l(inConstraints), minLines != 1 ? Ha.g.g(Ha.g.d(Math.round(fA + (fA2 * (minLines - 1))), 0), U0.b.k(inConstraints)) : U0.b.m(inConstraints), U0.b.k(inConstraints));
    }

    /* renamed from: d, reason: from getter */
    public final U0.d getDensity() {
        return this.density;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC1341l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* renamed from: f, reason: from getter */
    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    /* renamed from: g, reason: from getter */
    public final t getLayoutDirection() {
        return this.layoutDirection;
    }

    private c(t tVar, TextStyle textStyle, U0.d dVar, AbstractC1341l.b bVar) {
        this.layoutDirection = tVar;
        this.inputTextStyle = textStyle;
        this.density = dVar;
        this.fontFamilyResolver = bVar;
        this.resolvedStyle = K.c(textStyle, tVar);
        this.lineHeightCache = Float.NaN;
        this.oneLineHeightCache = Float.NaN;
    }
}
