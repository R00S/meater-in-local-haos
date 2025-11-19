package G;

import G.c;
import H0.C1060d;
import H0.C1066j;
import H0.C1067k;
import H0.K;
import H0.TextLayoutInput;
import H0.TextLayoutResult;
import H0.TextStyle;
import H0.o;
import H0.r;
import R0.q;
import U0.s;
import U0.t;
import kotlin.AbstractC1341l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: ParagraphLayoutCache.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b \u0010\u001cJ\u001d\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#JH\u0010$\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00105R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00105R\u001c\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u00109R.\u0010A\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010=\u001a\u0004\b.\u0010>\"\u0004\b?\u0010@R$\u0010F\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010B\u001a\u0004\b6\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u00107\u001a\u0004\b0\u0010G\"\u0004\bH\u0010IR(\u0010O\u001a\u00020K8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001b\u00109\u001a\u0004\b2\u0010L\"\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010UR\u001c\u0010W\u001a\u00020\u00168\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u00109R\u0016\u0010Y\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00105R\u0016\u0010[\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u00105R\u0014\u0010]\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"LG/f;", "", "", "text", "LH0/J;", "style", "LL0/l$b;", "fontFamilyResolver", "LR0/q;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Ljava/lang/String;LH0/J;LL0/l$b;IZIILkotlin/jvm/internal/k;)V", "LU0/t;", "layoutDirection", "LH0/r;", "n", "(LU0/t;)LH0/r;", "LU0/b;", "constraints", "LH0/o;", "g", "(JLU0/t;)LH0/o;", "l", "(JLU0/t;)Z", "Loa/F;", "i", "()V", "h", "width", "f", "(ILU0/t;)I", "p", "(Ljava/lang/String;LH0/J;LL0/l$b;IZII)V", "LH0/F;", "o", "(LH0/J;)LH0/F;", "k", "(LU0/t;)I", "j", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "LH0/J;", "c", "LL0/l$b;", "d", "I", "e", "Z", "LG/a;", "J", "lastDensity", "LU0/d;", "value", "LU0/d;", "()LU0/d;", "m", "(LU0/d;)V", "density", "LH0/o;", "()LH0/o;", "setParagraph$foundation_release", "(LH0/o;)V", "paragraph", "()Z", "setDidOverflow$foundation_release", "(Z)V", "didOverflow", "LU0/r;", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "layoutSize", "LG/c;", "LG/c;", "mMinLinesConstrainer", "LH0/r;", "paragraphIntrinsics", "LU0/t;", "intrinsicsLayoutDirection", "prevConstraints", "q", "cachedIntrinsicHeightInputWidth", "r", "cachedIntrinsicHeight", "()Loa/F;", "observeFontChanges", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AbstractC1341l.b fontFamilyResolver;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long lastDensity;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private U0.d density;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private o paragraph;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean didOverflow;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long layoutSize;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private c mMinLinesConstrainer;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private r paragraphIntrinsics;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private t intrinsicsLayoutDirection;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long prevConstraints;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeight;

    public /* synthetic */ f(String str, TextStyle textStyle, AbstractC1341l.b bVar, int i10, boolean z10, int i11, int i12, C3854k c3854k) {
        this(str, textStyle, bVar, i10, z10, i11, i12);
    }

    private final o g(long constraints, t layoutDirection) {
        r rVarN = n(layoutDirection);
        return H0.t.c(rVarN, b.a(constraints, this.softWrap, this.overflow, rVarN.c()), b.b(this.softWrap, this.overflow, this.maxLines), q.e(this.overflow, q.INSTANCE.b()));
    }

    private final void i() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = U0.b.INSTANCE.c(0, 0);
        this.layoutSize = s.a(0, 0);
        this.didOverflow = false;
    }

    private final boolean l(long constraints, t layoutDirection) {
        r rVar;
        o oVar = this.paragraph;
        if (oVar == null || (rVar = this.paragraphIntrinsics) == null || rVar.a() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (U0.b.f(constraints, this.prevConstraints)) {
            return false;
        }
        return U0.b.l(constraints) != U0.b.l(this.prevConstraints) || ((float) U0.b.k(constraints)) < oVar.a() || oVar.w();
    }

    private final r n(t layoutDirection) {
        r rVarB = this.paragraphIntrinsics;
        if (rVarB == null || layoutDirection != this.intrinsicsLayoutDirection || rVarB.a()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle textStyleC = K.c(this.style, layoutDirection);
            U0.d dVar = this.density;
            C3862t.d(dVar);
            rVarB = H0.s.b(str, textStyleC, null, null, dVar, this.fontFamilyResolver, 12, null);
        }
        this.paragraphIntrinsics = rVarB;
        return rVarB;
    }

    /* renamed from: a, reason: from getter */
    public final U0.d getDensity() {
        return this.density;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    /* renamed from: c, reason: from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    public final C4153F d() {
        r rVar = this.paragraphIntrinsics;
        if (rVar != null) {
            rVar.a();
        }
        return C4153F.f46609a;
    }

    /* renamed from: e, reason: from getter */
    public final o getParagraph() {
        return this.paragraph;
    }

    public final int f(int width, t layoutDirection) {
        int i10 = this.cachedIntrinsicHeightInputWidth;
        int i11 = this.cachedIntrinsicHeight;
        if (width == i10 && i10 != -1) {
            return i11;
        }
        int iA = F.i.a(g(U0.c.a(0, width, 0, Integer.MAX_VALUE), layoutDirection).a());
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = iA;
        return iA;
    }

    public final boolean h(long constraints, t layoutDirection) {
        boolean z10 = true;
        if (this.minLines > 1) {
            c.Companion companion = c.INSTANCE;
            c cVar = this.mMinLinesConstrainer;
            TextStyle textStyle = this.style;
            U0.d dVar = this.density;
            C3862t.d(dVar);
            c cVarA = companion.a(cVar, layoutDirection, textStyle, dVar, this.fontFamilyResolver);
            this.mMinLinesConstrainer = cVarA;
            constraints = cVarA.c(constraints, this.minLines);
        }
        boolean z11 = false;
        if (l(constraints, layoutDirection)) {
            o oVarG = g(constraints, layoutDirection);
            this.prevConstraints = constraints;
            this.layoutSize = U0.c.f(constraints, s.a(F.i.a(oVarG.b()), F.i.a(oVarG.a())));
            if (!q.e(this.overflow, q.INSTANCE.c()) && (U0.r.g(r9) < oVarG.b() || U0.r.f(r9) < oVarG.a())) {
                z11 = true;
            }
            this.didOverflow = z11;
            this.paragraph = oVarG;
            return true;
        }
        if (!U0.b.f(constraints, this.prevConstraints)) {
            o oVar = this.paragraph;
            C3862t.d(oVar);
            this.layoutSize = U0.c.f(constraints, s.a(F.i.a(Math.min(oVar.c(), oVar.b())), F.i.a(oVar.a())));
            if (q.e(this.overflow, q.INSTANCE.c()) || (U0.r.g(r3) >= oVar.b() && U0.r.f(r3) >= oVar.a())) {
                z10 = false;
            }
            this.didOverflow = z10;
            this.prevConstraints = constraints;
        }
        return false;
    }

    public final int j(t layoutDirection) {
        return F.i.a(n(layoutDirection).c());
    }

    public final int k(t layoutDirection) {
        return F.i.a(n(layoutDirection).b());
    }

    public final void m(U0.d dVar) {
        U0.d dVar2 = this.density;
        long jD = dVar != null ? a.d(dVar) : a.INSTANCE.a();
        if (dVar2 == null) {
            this.density = dVar;
            this.lastDensity = jD;
        } else if (dVar == null || !a.e(this.lastDensity, jD)) {
            this.density = dVar;
            this.lastDensity = jD;
            i();
        }
    }

    public final TextLayoutResult o(TextStyle style) {
        U0.d dVar;
        t tVar = this.intrinsicsLayoutDirection;
        if (tVar == null || (dVar = this.density) == null) {
            return null;
        }
        C1060d c1060d = new C1060d(this.text, null, null, 6, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long jD = U0.b.d(this.prevConstraints, 0, 0, 0, 0, 10, null);
        return new TextLayoutResult(new TextLayoutInput(c1060d, style, kotlin.collections.r.m(), this.maxLines, this.softWrap, this.overflow, dVar, tVar, this.fontFamilyResolver, jD, (C3854k) null), new C1066j(new C1067k(c1060d, style, kotlin.collections.r.m(), dVar, this.fontFamilyResolver), jD, this.maxLines, q.e(this.overflow, q.INSTANCE.b()), null), this.layoutSize, null);
    }

    public final void p(String text, TextStyle style, AbstractC1341l.b fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        i();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ParagraphLayoutCache(paragraph=");
        sb2.append(this.paragraph != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.h(this.lastDensity));
        sb2.append(')');
        return sb2.toString();
    }

    private f(String str, TextStyle textStyle, AbstractC1341l.b bVar, int i10, boolean z10, int i11, int i12) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.lastDensity = a.INSTANCE.a();
        this.layoutSize = s.a(0, 0);
        this.prevConstraints = U0.b.INSTANCE.c(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }
}
