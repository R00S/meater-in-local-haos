package G;

import G.c;
import H0.C1060d;
import H0.C1066j;
import H0.C1067k;
import H0.K;
import H0.Placeholder;
import H0.TextLayoutInput;
import H0.TextLayoutResult;
import H0.TextStyle;
import R0.q;
import U0.s;
import U0.t;
import java.util.List;
import kotlin.AbstractC1341l;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: MultiParagraphLayoutCache.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J(\u0010$\u001a\u00020\n*\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b,\u0010-J^\u0010.\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b2\u00101R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u00109R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010:R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00109R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00109R$\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010=R\u001c\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010@R.\u0010H\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010B8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\b3\u0010F\"\u0004\bD\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010MR\u0016\u0010P\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00109R\u0016\u0010R\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u00109R\u0011\u0010T\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b7\u0010SR\u0013\u0010U\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b5\u0010S\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"LG/e;", "", "LH0/d;", "text", "LH0/J;", "style", "LL0/l$b;", "fontFamilyResolver", "LR0/q;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LH0/d$c;", "LH0/w;", "placeholders", "<init>", "(LH0/d;LH0/J;LL0/l$b;IZIILjava/util/List;Lkotlin/jvm/internal/k;)V", "LU0/t;", "layoutDirection", "LU0/b;", "finalConstraints", "LH0/j;", "multiParagraph", "LH0/F;", "m", "(LU0/t;JLH0/j;)LH0/F;", "LH0/k;", "l", "(LU0/t;)LH0/k;", "constraints", "e", "(JLU0/t;)LH0/j;", "j", "(LH0/F;JLU0/t;)Z", "Loa/F;", "g", "()V", "f", "(JLU0/t;)Z", "width", "d", "(ILU0/t;)I", "n", "(LH0/d;LH0/J;LL0/l$b;IZIILjava/util/List;)V", "h", "(LU0/t;)I", "i", "a", "LH0/d;", "b", "LH0/J;", "c", "LL0/l$b;", "I", "Z", "Ljava/util/List;", "LG/c;", "LG/c;", "mMinLinesConstrainer", "LG/a;", "J", "lastDensity", "LU0/d;", "value", "k", "LU0/d;", "()LU0/d;", "(LU0/d;)V", "density", "LH0/k;", "paragraphIntrinsics", "LU0/t;", "intrinsicsLayoutDirection", "LH0/F;", "layoutCache", "o", "cachedIntrinsicHeightInputWidth", "p", "cachedIntrinsicHeight", "()LH0/F;", "textLayoutResult", "layoutOrNull", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private C1060d text;

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
    private List<C1060d.Range<Placeholder>> placeholders;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private c mMinLinesConstrainer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long lastDensity;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private U0.d density;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private C1067k paragraphIntrinsics;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private t intrinsicsLayoutDirection;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult layoutCache;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeight;

    public /* synthetic */ e(C1060d c1060d, TextStyle textStyle, AbstractC1341l.b bVar, int i10, boolean z10, int i11, int i12, List list, C3854k c3854k) {
        this(c1060d, textStyle, bVar, i10, z10, i11, i12, list);
    }

    private final C1066j e(long constraints, t layoutDirection) {
        C1067k c1067kL = l(layoutDirection);
        return new C1066j(c1067kL, b.a(constraints, this.softWrap, this.overflow, c1067kL.c()), b.b(this.softWrap, this.overflow, this.maxLines), q.e(this.overflow, q.INSTANCE.b()), null);
    }

    private final void g() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    private final boolean j(TextLayoutResult textLayoutResult, long j10, t tVar) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().a() || tVar != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (U0.b.f(j10, textLayoutResult.getLayoutInput().getConstraints())) {
            return false;
        }
        return U0.b.l(j10) != U0.b.l(textLayoutResult.getLayoutInput().getConstraints()) || ((float) U0.b.k(j10)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
    }

    private final C1067k l(t layoutDirection) {
        C1067k c1067k = this.paragraphIntrinsics;
        if (c1067k == null || layoutDirection != this.intrinsicsLayoutDirection || c1067k.a()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            C1060d c1060d = this.text;
            TextStyle textStyleC = K.c(this.style, layoutDirection);
            U0.d dVar = this.density;
            C3862t.d(dVar);
            AbstractC1341l.b bVar = this.fontFamilyResolver;
            List<C1060d.Range<Placeholder>> listM = this.placeholders;
            if (listM == null) {
                listM = r.m();
            }
            c1067k = new C1067k(c1060d, textStyleC, listM, dVar, bVar);
        }
        this.paragraphIntrinsics = c1067k;
        return c1067k;
    }

    private final TextLayoutResult m(t layoutDirection, long finalConstraints, C1066j multiParagraph) {
        float fMin = Math.min(multiParagraph.getIntrinsics().c(), multiParagraph.getWidth());
        C1060d c1060d = this.text;
        TextStyle textStyle = this.style;
        List<C1060d.Range<Placeholder>> listM = this.placeholders;
        if (listM == null) {
            listM = r.m();
        }
        List<C1060d.Range<Placeholder>> list = listM;
        int i10 = this.maxLines;
        boolean z10 = this.softWrap;
        int i11 = this.overflow;
        U0.d dVar = this.density;
        C3862t.d(dVar);
        return new TextLayoutResult(new TextLayoutInput(c1060d, textStyle, list, i10, z10, i11, dVar, layoutDirection, this.fontFamilyResolver, finalConstraints, (C3854k) null), multiParagraph, U0.c.f(finalConstraints, s.a(F.i.a(fMin), F.i.a(multiParagraph.getHeight()))), null);
    }

    /* renamed from: a, reason: from getter */
    public final U0.d getDensity() {
        return this.density;
    }

    /* renamed from: b, reason: from getter */
    public final TextLayoutResult getLayoutCache() {
        return this.layoutCache;
    }

    public final TextLayoutResult c() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int width, t layoutDirection) {
        int i10 = this.cachedIntrinsicHeightInputWidth;
        int i11 = this.cachedIntrinsicHeight;
        if (width == i10 && i10 != -1) {
            return i11;
        }
        int iA = F.i.a(e(U0.c.a(0, width, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = iA;
        return iA;
    }

    public final boolean f(long constraints, t layoutDirection) {
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
        if (j(this.layoutCache, constraints, layoutDirection)) {
            this.layoutCache = m(layoutDirection, constraints, e(constraints, layoutDirection));
            return true;
        }
        TextLayoutResult textLayoutResult = this.layoutCache;
        C3862t.d(textLayoutResult);
        if (U0.b.f(constraints, textLayoutResult.getLayoutInput().getConstraints())) {
            return false;
        }
        TextLayoutResult textLayoutResult2 = this.layoutCache;
        C3862t.d(textLayoutResult2);
        this.layoutCache = m(layoutDirection, constraints, textLayoutResult2.getMultiParagraph());
        return true;
    }

    public final int h(t layoutDirection) {
        return F.i.a(l(layoutDirection).c());
    }

    public final int i(t layoutDirection) {
        return F.i.a(l(layoutDirection).b());
    }

    public final void k(U0.d dVar) {
        U0.d dVar2 = this.density;
        long jD = dVar != null ? a.d(dVar) : a.INSTANCE.a();
        if (dVar2 == null) {
            this.density = dVar;
            this.lastDensity = jD;
        } else if (dVar == null || !a.e(this.lastDensity, jD)) {
            this.density = dVar;
            this.lastDensity = jD;
            g();
        }
    }

    public final void n(C1060d text, TextStyle style, AbstractC1341l.b fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, List<C1060d.Range<Placeholder>> placeholders) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.placeholders = placeholders;
        g();
    }

    private e(C1060d c1060d, TextStyle textStyle, AbstractC1341l.b bVar, int i10, boolean z10, int i11, int i12, List<C1060d.Range<Placeholder>> list) {
        this.text = c1060d;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.placeholders = list;
        this.lastDensity = a.INSTANCE.a();
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }
}
