package H0;

import H0.AbstractC1064h;
import H0.C1060d;
import H0.H;
import N0.LocaleList;
import N0.d;
import R0.TextGeometricTransform;
import R0.TextIndent;
import R0.a;
import R0.j;
import U0.v;
import h0.C3476g;
import h0.C3477h;
import i0.C3602t0;
import i0.C3606v0;
import i0.Shadow;
import java.util.ArrayList;
import java.util.List;
import kotlin.C1352w;
import kotlin.C1353x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\".\u0010\u001c\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001a0\u0019\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015\".\u0010 \u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001a\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u0012\u0004\b\u001e\u0010\u001f\" \u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0015\"&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b%\u0010\u0015\u0012\u0004\b&\u0010\u001f\" \u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0015\" \u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0015\"&\u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b/\u0010\u0017\"&\u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010\u0015\u001a\u0004\b2\u0010\u0017\"&\u00107\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010\u0015\u001a\u0004\b6\u0010\u0017\" \u0010:\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0015\" \u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0015\" \u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0015\" \u0010C\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0015\" \u0010F\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0015\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0015\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0015\" \u0010P\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\" \u0010S\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010O\" \u0010V\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010O\" \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0015\" \u0010[\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0015\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u0000*\u00020\\8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010]\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u0000*\u00020_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010`\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u0000*\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010b\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u0000*\u00020c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010d\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u0000*\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010f\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u0000*\u00020g8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u0010h\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u0000*\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010j\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u0000*\u00020k8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010l\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\b0\u0000*\u00020m8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010n\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u0000*\u00020o8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010p\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\b0\u0000*\u00020q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010r\"$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\b0\u0000*\u00020s8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010t¨\u0006u"}, d2 = {"LY/j;", "T", "Original", "Saveable", "value", "saver", "LY/l;", "scope", "", "y", "(Ljava/lang/Object;LY/j;LY/l;)Ljava/lang/Object;", "Lkotlin/Function2;", "save", "Lkotlin/Function1;", "restore", "LH0/n;", "a", "(LBa/p;LBa/l;)LH0/n;", "x", "(Ljava/lang/Object;)Ljava/lang/Object;", "LH0/d;", "LY/j;", "h", "()LY/j;", "AnnotatedStringSaver", "", "LH0/d$c;", "b", "AnnotationRangeListSaver", "c", "getAnnotationRangeSaver$annotations", "()V", "AnnotationRangeSaver", "LH0/N;", "d", "VerbatimTtsAnnotationSaver", "LH0/M;", "e", "getUrlAnnotationSaver$annotations", "UrlAnnotationSaver", "LH0/h$b;", "f", "LinkSaver", "LH0/h$a;", "g", "ClickableSaver", "LH0/u;", "i", "ParagraphStyleSaver", "LH0/C;", "v", "SpanStyleSaver", "LH0/G;", "j", "w", "TextLinkStylesSaver", "LR0/j;", "k", "TextDecorationSaver", "LR0/n;", "l", "TextGeometricTransformSaver", "LR0/o;", "m", "TextIndentSaver", "LL0/B;", "n", "FontWeightSaver", "LR0/a;", "o", "BaselineShiftSaver", "LH0/H;", "p", "TextRangeSaver", "Li0/b1;", "q", "ShadowSaver", "Li0/t0;", "r", "LH0/n;", "ColorSaver", "LU0/v;", "s", "TextUnitSaver", "Lh0/g;", "t", "OffsetSaver", "LN0/e;", "u", "LocaleListSaver", "LN0/d;", "LocaleSaver", "LR0/j$a;", "(LR0/j$a;)LY/j;", "Saver", "LR0/n$a;", "(LR0/n$a;)LY/j;", "LR0/o$a;", "(LR0/o$a;)LY/j;", "LL0/B$a;", "(LL0/B$a;)LY/j;", "LR0/a$a;", "(LR0/a$a;)LY/j;", "LH0/H$a;", "(LH0/H$a;)LY/j;", "Li0/b1$a;", "(Li0/b1$a;)LY/j;", "Li0/t0$a;", "(Li0/t0$a;)LY/j;", "LU0/v$a;", "(LU0/v$a;)LY/j;", "Lh0/g$a;", "(Lh0/g$a;)LY/j;", "LN0/e$a;", "(LN0/e$a;)LY/j;", "LN0/d$a;", "(LN0/d$a;)LY/j;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private static final Y.j<C1060d, Object> f5229a = Y.k.a(C1039a.f5270B, b.f5271B);

    /* renamed from: b, reason: collision with root package name */
    private static final Y.j<List<C1060d.Range<? extends Object>>, Object> f5230b = Y.k.a(C1040c.f5272B, C1041d.f5273B);

    /* renamed from: c, reason: collision with root package name */
    private static final Y.j<C1060d.Range<? extends Object>, Object> f5231c = Y.k.a(C1042e.f5274B, C1043f.f5276B);

    /* renamed from: d, reason: collision with root package name */
    private static final Y.j<VerbatimTtsAnnotation, Object> f5232d = Y.k.a(R.f5268B, S.f5269B);

    /* renamed from: e, reason: collision with root package name */
    private static final Y.j<UrlAnnotation, Object> f5233e = Y.k.a(P.f5266B, Q.f5267B);

    /* renamed from: f, reason: collision with root package name */
    private static final Y.j<AbstractC1064h.b, Object> f5234f = Y.k.a(C1052o.f5286B, C1053p.f5287B);

    /* renamed from: g, reason: collision with root package name */
    private static final Y.j<AbstractC1064h.a, Object> f5235g = Y.k.a(C1046i.f5280B, C1047j.f5281B);

    /* renamed from: h, reason: collision with root package name */
    private static final Y.j<ParagraphStyle, Object> f5236h = Y.k.a(x.f5296B, y.f5297B);

    /* renamed from: i, reason: collision with root package name */
    private static final Y.j<SpanStyle, Object> f5237i = Y.k.a(C0096B.f5252B, C.f5253B);

    /* renamed from: j, reason: collision with root package name */
    private static final Y.j<H0.G, Object> f5238j = Y.k.a(J.f5260B, K.f5261B);

    /* renamed from: k, reason: collision with root package name */
    private static final Y.j<R0.j, Object> f5239k = Y.k.a(D.f5254B, E.f5255B);

    /* renamed from: l, reason: collision with root package name */
    private static final Y.j<TextGeometricTransform, Object> f5240l = Y.k.a(F.f5256B, G.f5257B);

    /* renamed from: m, reason: collision with root package name */
    private static final Y.j<TextIndent, Object> f5241m = Y.k.a(H.f5258B, I.f5259B);

    /* renamed from: n, reason: collision with root package name */
    private static final Y.j<FontWeight, Object> f5242n = Y.k.a(C1050m.f5284B, C1051n.f5285B);

    /* renamed from: o, reason: collision with root package name */
    private static final Y.j<R0.a, Object> f5243o = Y.k.a(C1044g.f5278B, C1045h.f5279B);

    /* renamed from: p, reason: collision with root package name */
    private static final Y.j<H0.H, Object> f5244p = Y.k.a(L.f5262B, M.f5263B);

    /* renamed from: q, reason: collision with root package name */
    private static final Y.j<Shadow, Object> f5245q = Y.k.a(z.f5298B, A.f5251B);

    /* renamed from: r, reason: collision with root package name */
    private static final InterfaceC1070n<C3602t0, Object> f5246r = a(C1048k.f5282B, C1049l.f5283B);

    /* renamed from: s, reason: collision with root package name */
    private static final InterfaceC1070n<U0.v, Object> f5247s = a(N.f5264B, O.f5265B);

    /* renamed from: t, reason: collision with root package name */
    private static final InterfaceC1070n<C3476g, Object> f5248t = a(v.f5294B, w.f5295B);

    /* renamed from: u, reason: collision with root package name */
    private static final Y.j<LocaleList, Object> f5249u = Y.k.a(C1054q.f5288B, C1055r.f5289B);

    /* renamed from: v, reason: collision with root package name */
    private static final Y.j<N0.d, Object> f5250v = Y.k.a(C1056s.f5290B, t.f5291B);

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li0/b1;", "a", "(Ljava/lang/Object;)Li0/b1;"}, k = 3, mv = {1, 8, 0})
    static final class A extends AbstractC3864v implements Ba.l<Object, Shadow> {

        /* renamed from: B, reason: collision with root package name */
        public static final A f5251B = new A();

        A() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Shadow invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Y.j<C3602t0, Object> jVarT = B.t(C3602t0.INSTANCE);
            Boolean bool = Boolean.FALSE;
            C3602t0 c3602t0A = ((!C3862t.b(obj2, bool) || (jVarT instanceof InterfaceC1070n)) && obj2 != null) ? jVarT.a(obj2) : null;
            C3862t.d(c3602t0A);
            long value = c3602t0A.getValue();
            Object obj3 = list.get(1);
            Y.j<C3476g, Object> jVarS = B.s(C3476g.INSTANCE);
            C3476g c3476gA = ((!C3862t.b(obj3, bool) || (jVarS instanceof InterfaceC1070n)) && obj3 != null) ? jVarS.a(obj3) : null;
            C3862t.d(c3476gA);
            long packedValue = c3476gA.getPackedValue();
            Object obj4 = list.get(2);
            Float f10 = obj4 != null ? (Float) obj4 : null;
            C3862t.d(f10);
            return new Shadow(value, packedValue, f10.floatValue(), null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LH0/C;", "it", "", "a", "(LY/l;LH0/C;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$B, reason: collision with other inner class name */
    static final class C0096B extends AbstractC3864v implements Ba.p<Y.l, SpanStyle, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final C0096B f5252B = new C0096B();

        C0096B() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, SpanStyle c10) {
            C3602t0 c3602t0G = C3602t0.g(c10.g());
            C3602t0.Companion companion = C3602t0.INSTANCE;
            Object objY = B.y(c3602t0G, B.t(companion), lVar);
            U0.v vVarB = U0.v.b(c10.getFontSize());
            v.Companion companion2 = U0.v.INSTANCE;
            return kotlin.collections.r.g(objY, B.y(vVarB, B.r(companion2), lVar), B.y(c10.getFontWeight(), B.k(FontWeight.INSTANCE), lVar), B.x(c10.getFontStyle()), B.x(c10.getFontSynthesis()), B.x(-1), B.x(c10.getFontFeatureSettings()), B.y(U0.v.b(c10.getLetterSpacing()), B.r(companion2), lVar), B.y(c10.getBaselineShift(), B.n(R0.a.INSTANCE), lVar), B.y(c10.getTextGeometricTransform(), B.p(TextGeometricTransform.INSTANCE), lVar), B.y(c10.getLocaleList(), B.m(LocaleList.INSTANCE), lVar), B.y(C3602t0.g(c10.getBackground()), B.t(companion), lVar), B.y(c10.getTextDecoration(), B.o(R0.j.INSTANCE), lVar), B.y(c10.getShadow(), B.u(Shadow.INSTANCE), lVar));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LH0/C;", "a", "(Ljava/lang/Object;)LH0/C;"}, k = 3, mv = {1, 8, 0})
    static final class C extends AbstractC3864v implements Ba.l<Object, SpanStyle> {

        /* renamed from: B, reason: collision with root package name */
        public static final C f5253B = new C();

        C() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpanStyle invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C3602t0.Companion companion = C3602t0.INSTANCE;
            Y.j<C3602t0, Object> jVarT = B.t(companion);
            Boolean bool = Boolean.FALSE;
            C3602t0 c3602t0A = ((!C3862t.b(obj2, bool) || (jVarT instanceof InterfaceC1070n)) && obj2 != null) ? jVarT.a(obj2) : null;
            C3862t.d(c3602t0A);
            long value = c3602t0A.getValue();
            Object obj3 = list.get(1);
            v.Companion companion2 = U0.v.INSTANCE;
            Y.j<U0.v, Object> jVarR = B.r(companion2);
            U0.v vVarA = ((!C3862t.b(obj3, bool) || (jVarR instanceof InterfaceC1070n)) && obj3 != null) ? jVarR.a(obj3) : null;
            C3862t.d(vVarA);
            long packedValue = vVarA.getPackedValue();
            Object obj4 = list.get(2);
            Y.j<FontWeight, Object> jVarK = B.k(FontWeight.INSTANCE);
            FontWeight fontWeightA = ((!C3862t.b(obj4, bool) || (jVarK instanceof InterfaceC1070n)) && obj4 != null) ? jVarK.a(obj4) : null;
            Object obj5 = list.get(3);
            C1352w c1352w = obj5 != null ? (C1352w) obj5 : null;
            Object obj6 = list.get(4);
            C1353x c1353x = obj6 != null ? (C1353x) obj6 : null;
            Object obj7 = list.get(6);
            String str = obj7 != null ? (String) obj7 : null;
            Object obj8 = list.get(7);
            Y.j<U0.v, Object> jVarR2 = B.r(companion2);
            U0.v vVarA2 = ((!C3862t.b(obj8, bool) || (jVarR2 instanceof InterfaceC1070n)) && obj8 != null) ? jVarR2.a(obj8) : null;
            C3862t.d(vVarA2);
            long packedValue2 = vVarA2.getPackedValue();
            Object obj9 = list.get(8);
            Y.j<R0.a, Object> jVarN = B.n(R0.a.INSTANCE);
            R0.a aVarA = ((!C3862t.b(obj9, bool) || (jVarN instanceof InterfaceC1070n)) && obj9 != null) ? jVarN.a(obj9) : null;
            Object obj10 = list.get(9);
            Y.j<TextGeometricTransform, Object> jVarP = B.p(TextGeometricTransform.INSTANCE);
            TextGeometricTransform textGeometricTransformA = ((!C3862t.b(obj10, bool) || (jVarP instanceof InterfaceC1070n)) && obj10 != null) ? jVarP.a(obj10) : null;
            Object obj11 = list.get(10);
            Y.j<LocaleList, Object> jVarM = B.m(LocaleList.INSTANCE);
            LocaleList localeListA = ((!C3862t.b(obj11, bool) || (jVarM instanceof InterfaceC1070n)) && obj11 != null) ? jVarM.a(obj11) : null;
            Object obj12 = list.get(11);
            Y.j<C3602t0, Object> jVarT2 = B.t(companion);
            C3602t0 c3602t0A2 = ((!C3862t.b(obj12, bool) || (jVarT2 instanceof InterfaceC1070n)) && obj12 != null) ? jVarT2.a(obj12) : null;
            C3862t.d(c3602t0A2);
            long value2 = c3602t0A2.getValue();
            Object obj13 = list.get(12);
            Y.j<R0.j, Object> jVarO = B.o(R0.j.INSTANCE);
            R0.j jVarA = ((!C3862t.b(obj13, bool) || (jVarO instanceof InterfaceC1070n)) && obj13 != null) ? jVarO.a(obj13) : null;
            Object obj14 = list.get(13);
            Y.j<Shadow, Object> jVarU = B.u(Shadow.INSTANCE);
            return new SpanStyle(value, packedValue, fontWeightA, c1352w, c1353x, null, str, packedValue2, aVarA, textGeometricTransformA, localeListA, value2, jVarA, ((!C3862t.b(obj14, bool) || (jVarU instanceof InterfaceC1070n)) && obj14 != null) ? jVarU.a(obj14) : null, null, null, 49184, null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LR0/j;", "it", "", "a", "(LY/l;LR0/j;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class D extends AbstractC3864v implements Ba.p<Y.l, R0.j, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final D f5254B = new D();

        D() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, R0.j jVar) {
            return Integer.valueOf(jVar.getMask());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LR0/j;", "a", "(Ljava/lang/Object;)LR0/j;"}, k = 3, mv = {1, 8, 0})
    static final class E extends AbstractC3864v implements Ba.l<Object, R0.j> {

        /* renamed from: B, reason: collision with root package name */
        public static final E f5255B = new E();

        E() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.j invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Int");
            return new R0.j(((Integer) obj).intValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LR0/n;", "it", "", "a", "(LY/l;LR0/n;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class F extends AbstractC3864v implements Ba.p<Y.l, TextGeometricTransform, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final F f5256B = new F();

        F() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, TextGeometricTransform textGeometricTransform) {
            return kotlin.collections.r.g(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LR0/n;", "a", "(Ljava/lang/Object;)LR0/n;"}, k = 3, mv = {1, 8, 0})
    static final class G extends AbstractC3864v implements Ba.l<Object, TextGeometricTransform> {

        /* renamed from: B, reason: collision with root package name */
        public static final G f5257B = new G();

        G() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextGeometricTransform invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LR0/o;", "it", "", "a", "(LY/l;LR0/o;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class H extends AbstractC3864v implements Ba.p<Y.l, TextIndent, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final H f5258B = new H();

        H() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, TextIndent textIndent) {
            U0.v vVarB = U0.v.b(textIndent.getFirstLine());
            v.Companion companion = U0.v.INSTANCE;
            return kotlin.collections.r.g(B.y(vVarB, B.r(companion), lVar), B.y(U0.v.b(textIndent.getRestLine()), B.r(companion), lVar));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LR0/o;", "a", "(Ljava/lang/Object;)LR0/o;"}, k = 3, mv = {1, 8, 0})
    static final class I extends AbstractC3864v implements Ba.l<Object, TextIndent> {

        /* renamed from: B, reason: collision with root package name */
        public static final I f5259B = new I();

        I() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextIndent invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            v.Companion companion = U0.v.INSTANCE;
            Y.j<U0.v, Object> jVarR = B.r(companion);
            Boolean bool = Boolean.FALSE;
            U0.v vVarA = null;
            U0.v vVarA2 = ((!C3862t.b(obj2, bool) || (jVarR instanceof InterfaceC1070n)) && obj2 != null) ? jVarR.a(obj2) : null;
            C3862t.d(vVarA2);
            long packedValue = vVarA2.getPackedValue();
            Object obj3 = list.get(1);
            Y.j<U0.v, Object> jVarR2 = B.r(companion);
            if ((!C3862t.b(obj3, bool) || (jVarR2 instanceof InterfaceC1070n)) && obj3 != null) {
                vVarA = jVarR2.a(obj3);
            }
            C3862t.d(vVarA);
            return new TextIndent(packedValue, vVarA.getPackedValue(), null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LH0/G;", "it", "", "a", "(LY/l;LH0/G;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class J extends AbstractC3864v implements Ba.p<Y.l, H0.G, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final J f5260B = new J();

        J() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, H0.G g10) {
            return kotlin.collections.r.g(B.y(g10.getStyle(), B.v(), lVar), B.y(g10.getFocusedStyle(), B.v(), lVar), B.y(g10.getHoveredStyle(), B.v(), lVar), B.y(g10.getPressedStyle(), B.v(), lVar));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LH0/G;", "a", "(Ljava/lang/Object;)LH0/G;"}, k = 3, mv = {1, 8, 0})
    static final class K extends AbstractC3864v implements Ba.l<Object, H0.G> {

        /* renamed from: B, reason: collision with root package name */
        public static final K f5261B = new K();

        K() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0.G invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Y.j<SpanStyle, Object> jVarV = B.v();
            Boolean bool = Boolean.FALSE;
            SpanStyle cA = null;
            SpanStyle cA2 = ((!C3862t.b(obj2, bool) || (jVarV instanceof InterfaceC1070n)) && obj2 != null) ? jVarV.a(obj2) : null;
            Object obj3 = list.get(1);
            Y.j<SpanStyle, Object> jVarV2 = B.v();
            SpanStyle cA3 = ((!C3862t.b(obj3, bool) || (jVarV2 instanceof InterfaceC1070n)) && obj3 != null) ? jVarV2.a(obj3) : null;
            Object obj4 = list.get(2);
            Y.j<SpanStyle, Object> jVarV3 = B.v();
            SpanStyle cA4 = ((!C3862t.b(obj4, bool) || (jVarV3 instanceof InterfaceC1070n)) && obj4 != null) ? jVarV3.a(obj4) : null;
            Object obj5 = list.get(3);
            Y.j<SpanStyle, Object> jVarV4 = B.v();
            if ((!C3862t.b(obj5, bool) || (jVarV4 instanceof InterfaceC1070n)) && obj5 != null) {
                cA = jVarV4.a(obj5);
            }
            return new H0.G(cA2, cA3, cA4, cA);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LH0/H;", "it", "", "a", "(LY/l;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class L extends AbstractC3864v implements Ba.p<Y.l, H0.H, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final L f5262B = new L();

        L() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(Y.l lVar, long j10) {
            return kotlin.collections.r.g(B.x(Integer.valueOf(H0.H.k(j10))), B.x(Integer.valueOf(H0.H.g(j10))));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Object invoke(Y.l lVar, H0.H h10) {
            return a(lVar, h10.getPackedValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LH0/H;", "a", "(Ljava/lang/Object;)LH0/H;"}, k = 3, mv = {1, 8, 0})
    static final class M extends AbstractC3864v implements Ba.l<Object, H0.H> {

        /* renamed from: B, reason: collision with root package name */
        public static final M f5263B = new M();

        M() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0.H invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            C3862t.d(num);
            int iIntValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            C3862t.d(num2);
            return H0.H.b(H0.I.b(iIntValue, num2.intValue()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LU0/v;", "it", "", "a", "(LY/l;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class N extends AbstractC3864v implements Ba.p<Y.l, U0.v, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final N f5264B = new N();

        N() {
            super(2);
        }

        public final Object a(Y.l lVar, long j10) {
            return U0.v.e(j10, U0.v.INSTANCE.a()) ? Boolean.FALSE : kotlin.collections.r.g(B.x(Float.valueOf(U0.v.h(j10))), B.x(U0.x.d(U0.v.g(j10))));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Object invoke(Y.l lVar, U0.v vVar) {
            return a(lVar, vVar.getPackedValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LU0/v;", "a", "(Ljava/lang/Object;)LU0/v;"}, k = 3, mv = {1, 8, 0})
    static final class O extends AbstractC3864v implements Ba.l<Object, U0.v> {

        /* renamed from: B, reason: collision with root package name */
        public static final O f5265B = new O();

        O() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U0.v invoke(Object obj) {
            if (C3862t.b(obj, Boolean.FALSE)) {
                return U0.v.b(U0.v.INSTANCE.a());
            }
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            C3862t.d(f10);
            float fFloatValue = f10.floatValue();
            Object obj3 = list.get(1);
            U0.x xVar = obj3 != null ? (U0.x) obj3 : null;
            C3862t.d(xVar);
            return U0.v.b(U0.w.a(fFloatValue, xVar.getType()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LH0/M;", "it", "", "a", "(LY/l;LH0/M;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class P extends AbstractC3864v implements Ba.p<Y.l, UrlAnnotation, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final P f5266B = new P();

        P() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, UrlAnnotation urlAnnotation) {
            return B.x(urlAnnotation.getUrl());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LH0/M;", "a", "(Ljava/lang/Object;)LH0/M;"}, k = 3, mv = {1, 8, 0})
    static final class Q extends AbstractC3864v implements Ba.l<Object, UrlAnnotation> {

        /* renamed from: B, reason: collision with root package name */
        public static final Q f5267B = new Q();

        Q() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UrlAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            C3862t.d(str);
            return new UrlAnnotation(str);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LH0/N;", "it", "", "a", "(LY/l;LH0/N;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class R extends AbstractC3864v implements Ba.p<Y.l, VerbatimTtsAnnotation, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final R f5268B = new R();

        R() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, VerbatimTtsAnnotation verbatimTtsAnnotation) {
            return B.x(verbatimTtsAnnotation.getVerbatim());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LH0/N;", "a", "(Ljava/lang/Object;)LH0/N;"}, k = 3, mv = {1, 8, 0})
    static final class S extends AbstractC3864v implements Ba.l<Object, VerbatimTtsAnnotation> {

        /* renamed from: B, reason: collision with root package name */
        public static final S f5269B = new S();

        S() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VerbatimTtsAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            C3862t.d(str);
            return new VerbatimTtsAnnotation(str);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LH0/d;", "it", "", "a", "(LY/l;LH0/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$a, reason: case insensitive filesystem */
    static final class C1039a extends AbstractC3864v implements Ba.p<Y.l, C1060d, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1039a f5270B = new C1039a();

        C1039a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, C1060d c1060d) {
            return kotlin.collections.r.g(B.x(c1060d.getText()), B.y(c1060d.g(), B.f5230b, lVar), B.y(c1060d.e(), B.f5230b, lVar), B.y(c1060d.b(), B.f5230b, lVar));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LH0/d;", "a", "(Ljava/lang/Object;)LH0/d;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<Object, C1060d> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f5271B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1060d invoke(Object obj) {
            List list;
            List list2;
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list3 = (List) obj;
            Object obj2 = list3.get(1);
            Y.j jVar = B.f5230b;
            Boolean bool = Boolean.FALSE;
            List list4 = null;
            List list5 = ((!C3862t.b(obj2, bool) || (jVar instanceof InterfaceC1070n)) && obj2 != null) ? (List) jVar.a(obj2) : null;
            Object obj3 = list3.get(2);
            Y.j jVar2 = B.f5230b;
            List list6 = ((!C3862t.b(obj3, bool) || (jVar2 instanceof InterfaceC1070n)) && obj3 != null) ? (List) jVar2.a(obj3) : null;
            Object obj4 = list3.get(0);
            String str = obj4 != null ? (String) obj4 : null;
            C3862t.d(str);
            if (list5 != null) {
                List list7 = list5;
                if (list7.isEmpty()) {
                    list7 = null;
                }
                list = list7;
            } else {
                list = null;
            }
            if (list6 != null) {
                List list8 = list6;
                if (list8.isEmpty()) {
                    list8 = null;
                }
                list2 = list8;
            } else {
                list2 = null;
            }
            Object obj5 = list3.get(3);
            Y.j jVar3 = B.f5230b;
            if ((!C3862t.b(obj5, bool) || (jVar3 instanceof InterfaceC1070n)) && obj5 != null) {
                list4 = (List) jVar3.a(obj5);
            }
            return new C1060d(str, list, list2, list4);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LY/l;", "", "LH0/d$c;", "", "it", "a", "(LY/l;Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$c, reason: case insensitive filesystem */
    static final class C1040c extends AbstractC3864v implements Ba.p<Y.l, List<? extends C1060d.Range<? extends Object>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1040c f5272B = new C1040c();

        C1040c() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, List<? extends C1060d.Range<? extends Object>> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(B.y(list.get(i10), B.f5231c, lVar));
            }
            return arrayList;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "LH0/d$c;", "a", "(Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$d, reason: case insensitive filesystem */
    static final class C1041d extends AbstractC3864v implements Ba.l<Object, List<? extends C1060d.Range<? extends Object>>> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1041d f5273B = new C1041d();

        C1041d() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<C1060d.Range<? extends Object>> invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                Y.j jVar = B.f5231c;
                C1060d.Range cVar = null;
                if ((!C3862t.b(obj2, Boolean.FALSE) || (jVar instanceof InterfaceC1070n)) && obj2 != null) {
                    cVar = (C1060d.Range) jVar.a(obj2);
                }
                C3862t.d(cVar);
                arrayList.add(cVar);
            }
            return arrayList;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LH0/d$c;", "", "it", "a", "(LY/l;LH0/d$c;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$e, reason: case insensitive filesystem */
    static final class C1042e extends AbstractC3864v implements Ba.p<Y.l, C1060d.Range<? extends Object>, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1042e f5274B = new C1042e();

        /* compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: H0.B$e$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5275a;

            static {
                int[] iArr = new int[EnumC1062f.values().length];
                try {
                    iArr[EnumC1062f.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1062f.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC1062f.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC1062f.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC1062f.Link.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC1062f.Clickable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC1062f.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f5275a = iArr;
            }
        }

        C1042e() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, C1060d.Range<? extends Object> cVar) {
            Object objY;
            Object objG = cVar.g();
            EnumC1062f enumC1062f = objG instanceof ParagraphStyle ? EnumC1062f.Paragraph : objG instanceof SpanStyle ? EnumC1062f.Span : objG instanceof VerbatimTtsAnnotation ? EnumC1062f.VerbatimTts : objG instanceof UrlAnnotation ? EnumC1062f.Url : objG instanceof AbstractC1064h.b ? EnumC1062f.Link : objG instanceof AbstractC1064h.a ? EnumC1062f.Clickable : EnumC1062f.String;
            switch (a.f5275a[enumC1062f.ordinal()]) {
                case 1:
                    Object objG2 = cVar.g();
                    C3862t.e(objG2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                    objY = B.y((ParagraphStyle) objG2, B.i(), lVar);
                    break;
                case 2:
                    Object objG3 = cVar.g();
                    C3862t.e(objG3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    objY = B.y((SpanStyle) objG3, B.v(), lVar);
                    break;
                case 3:
                    Object objG4 = cVar.g();
                    C3862t.e(objG4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    objY = B.y((VerbatimTtsAnnotation) objG4, B.f5232d, lVar);
                    break;
                case 4:
                    Object objG5 = cVar.g();
                    C3862t.e(objG5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    objY = B.y((UrlAnnotation) objG5, B.f5233e, lVar);
                    break;
                case 5:
                    Object objG6 = cVar.g();
                    C3862t.e(objG6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    objY = B.y((AbstractC1064h.b) objG6, B.f5234f, lVar);
                    break;
                case 6:
                    Object objG7 = cVar.g();
                    C3862t.e(objG7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                    objY = B.y((AbstractC1064h.a) objG7, B.f5235g, lVar);
                    break;
                case 7:
                    objY = B.x(cVar.g());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return kotlin.collections.r.g(B.x(enumC1062f), objY, B.x(Integer.valueOf(cVar.h())), B.x(Integer.valueOf(cVar.f())), B.x(cVar.getTag()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LH0/d$c;", "a", "(Ljava/lang/Object;)LH0/d$c;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$f, reason: case insensitive filesystem */
    static final class C1043f extends AbstractC3864v implements Ba.l<Object, C1060d.Range<? extends Object>> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1043f f5276B = new C1043f();

        /* compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: H0.B$f$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5277a;

            static {
                int[] iArr = new int[EnumC1062f.values().length];
                try {
                    iArr[EnumC1062f.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1062f.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC1062f.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC1062f.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC1062f.Link.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC1062f.Clickable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC1062f.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f5277a = iArr;
            }
        }

        C1043f() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1060d.Range<? extends Object> invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            EnumC1062f enumC1062f = obj2 != null ? (EnumC1062f) obj2 : null;
            C3862t.d(enumC1062f);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            C3862t.d(num);
            int iIntValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            C3862t.d(num2);
            int iIntValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            C3862t.d(str);
            switch (a.f5277a[enumC1062f.ordinal()]) {
                case 1:
                    Object obj6 = list.get(1);
                    Y.j<ParagraphStyle, Object> jVarI = B.i();
                    if ((!C3862t.b(obj6, Boolean.FALSE) || (jVarI instanceof InterfaceC1070n)) && obj6 != null) {
                        uVarA = jVarI.a(obj6);
                    }
                    C3862t.d(uVarA);
                    return new C1060d.Range<>(uVarA, iIntValue, iIntValue2, str);
                case 2:
                    Object obj7 = list.get(1);
                    Y.j<SpanStyle, Object> jVarV = B.v();
                    if ((!C3862t.b(obj7, Boolean.FALSE) || (jVarV instanceof InterfaceC1070n)) && obj7 != null) {
                        uVarA = jVarV.a(obj7);
                    }
                    C3862t.d(uVarA);
                    return new C1060d.Range<>(uVarA, iIntValue, iIntValue2, str);
                case 3:
                    Object obj8 = list.get(1);
                    Y.j jVar = B.f5232d;
                    if ((!C3862t.b(obj8, Boolean.FALSE) || (jVar instanceof InterfaceC1070n)) && obj8 != null) {
                        uVarA = (VerbatimTtsAnnotation) jVar.a(obj8);
                    }
                    C3862t.d(uVarA);
                    return new C1060d.Range<>(uVarA, iIntValue, iIntValue2, str);
                case 4:
                    Object obj9 = list.get(1);
                    Y.j jVar2 = B.f5233e;
                    if ((!C3862t.b(obj9, Boolean.FALSE) || (jVar2 instanceof InterfaceC1070n)) && obj9 != null) {
                        uVarA = (UrlAnnotation) jVar2.a(obj9);
                    }
                    C3862t.d(uVarA);
                    return new C1060d.Range<>(uVarA, iIntValue, iIntValue2, str);
                case 5:
                    Object obj10 = list.get(1);
                    Y.j jVar3 = B.f5234f;
                    if ((!C3862t.b(obj10, Boolean.FALSE) || (jVar3 instanceof InterfaceC1070n)) && obj10 != null) {
                        uVarA = (AbstractC1064h.b) jVar3.a(obj10);
                    }
                    C3862t.d(uVarA);
                    return new C1060d.Range<>(uVarA, iIntValue, iIntValue2, str);
                case 6:
                    Object obj11 = list.get(1);
                    Y.j jVar4 = B.f5235g;
                    if ((!C3862t.b(obj11, Boolean.FALSE) || (jVar4 instanceof InterfaceC1070n)) && obj11 != null) {
                        uVarA = (AbstractC1064h.a) jVar4.a(obj11);
                    }
                    C3862t.d(uVarA);
                    return new C1060d.Range<>(uVarA, iIntValue, iIntValue2, str);
                case 7:
                    Object obj12 = list.get(1);
                    uVarA = obj12 != null ? (String) obj12 : null;
                    C3862t.d(uVarA);
                    return new C1060d.Range<>(uVarA, iIntValue, iIntValue2, str);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LR0/a;", "it", "", "a", "(LY/l;F)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$g, reason: case insensitive filesystem */
    static final class C1044g extends AbstractC3864v implements Ba.p<Y.l, R0.a, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1044g f5278B = new C1044g();

        C1044g() {
            super(2);
        }

        public final Object a(Y.l lVar, float f10) {
            return Float.valueOf(f10);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Object invoke(Y.l lVar, R0.a aVar) {
            return a(lVar, aVar.getMultiplier());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LR0/a;", "a", "(Ljava/lang/Object;)LR0/a;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$h, reason: case insensitive filesystem */
    static final class C1045h extends AbstractC3864v implements Ba.l<Object, R0.a> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1045h f5279B = new C1045h();

        C1045h() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Float");
            return R0.a.b(R0.a.c(((Float) obj).floatValue()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LH0/h$a;", "it", "", "a", "(LY/l;LH0/h$a;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$i, reason: case insensitive filesystem */
    static final class C1046i extends AbstractC3864v implements Ba.p<Y.l, AbstractC1064h.a, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1046i f5280B = new C1046i();

        C1046i() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, AbstractC1064h.a aVar) {
            return kotlin.collections.r.g(B.x(aVar.getTag()), B.y(aVar.getStyles(), B.w(), lVar));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LH0/h$a;", "a", "(Ljava/lang/Object;)LH0/h$a;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$j, reason: case insensitive filesystem */
    static final class C1047j extends AbstractC3864v implements Ba.l<Object, AbstractC1064h.a> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1047j f5281B = new C1047j();

        C1047j() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1064h.a invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            String str = obj2 != null ? (String) obj2 : null;
            C3862t.d(str);
            Object obj3 = list.get(1);
            Y.j<H0.G, Object> jVarW = B.w();
            return new AbstractC1064h.a(str, ((!C3862t.b(obj3, Boolean.FALSE) || (jVarW instanceof InterfaceC1070n)) && obj3 != null) ? jVarW.a(obj3) : null, null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "Li0/t0;", "it", "", "a", "(LY/l;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$k, reason: case insensitive filesystem */
    static final class C1048k extends AbstractC3864v implements Ba.p<Y.l, C3602t0, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1048k f5282B = new C1048k();

        C1048k() {
            super(2);
        }

        public final Object a(Y.l lVar, long j10) {
            return j10 == 16 ? Boolean.FALSE : Integer.valueOf(C3606v0.j(j10));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Object invoke(Y.l lVar, C3602t0 c3602t0) {
            return a(lVar, c3602t0.getValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li0/t0;", "a", "(Ljava/lang/Object;)Li0/t0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$l, reason: case insensitive filesystem */
    static final class C1049l extends AbstractC3864v implements Ba.l<Object, C3602t0> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1049l f5283B = new C1049l();

        C1049l() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3602t0 invoke(Object obj) {
            long jB;
            if (C3862t.b(obj, Boolean.FALSE)) {
                jB = C3602t0.INSTANCE.e();
            } else {
                C3862t.e(obj, "null cannot be cast to non-null type kotlin.Int");
                jB = C3606v0.b(((Integer) obj).intValue());
            }
            return C3602t0.g(jB);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LL0/B;", "it", "", "a", "(LY/l;LL0/B;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$m, reason: case insensitive filesystem */
    static final class C1050m extends AbstractC3864v implements Ba.p<Y.l, FontWeight, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1050m f5284B = new C1050m();

        C1050m() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, FontWeight fontWeight) {
            return Integer.valueOf(fontWeight.x());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LL0/B;", "a", "(Ljava/lang/Object;)LL0/B;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$n, reason: case insensitive filesystem */
    static final class C1051n extends AbstractC3864v implements Ba.l<Object, FontWeight> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1051n f5285B = new C1051n();

        C1051n() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FontWeight invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Int");
            return new FontWeight(((Integer) obj).intValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LH0/h$b;", "it", "", "a", "(LY/l;LH0/h$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$o, reason: case insensitive filesystem */
    static final class C1052o extends AbstractC3864v implements Ba.p<Y.l, AbstractC1064h.b, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1052o f5286B = new C1052o();

        C1052o() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, AbstractC1064h.b bVar) {
            return kotlin.collections.r.g(B.x(bVar.getUrl()), B.y(bVar.getStyles(), B.w(), lVar));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LH0/h$b;", "a", "(Ljava/lang/Object;)LH0/h$b;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$p, reason: case insensitive filesystem */
    static final class C1053p extends AbstractC3864v implements Ba.l<Object, AbstractC1064h.b> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1053p f5287B = new C1053p();

        C1053p() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1064h.b invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            H0.G gA = null;
            String str = obj2 != null ? (String) obj2 : null;
            C3862t.d(str);
            Object obj3 = list.get(1);
            Y.j<H0.G, Object> jVarW = B.w();
            if ((!C3862t.b(obj3, Boolean.FALSE) || (jVarW instanceof InterfaceC1070n)) && obj3 != null) {
                gA = jVarW.a(obj3);
            }
            return new AbstractC1064h.b(str, gA, null, 4, null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LN0/e;", "it", "", "a", "(LY/l;LN0/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$q, reason: case insensitive filesystem */
    static final class C1054q extends AbstractC3864v implements Ba.p<Y.l, LocaleList, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1054q f5288B = new C1054q();

        C1054q() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, LocaleList localeList) {
            List<N0.d> listJ = localeList.j();
            ArrayList arrayList = new ArrayList(listJ.size());
            int size = listJ.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(B.y(listJ.get(i10), B.l(N0.d.INSTANCE), lVar));
            }
            return arrayList;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LN0/e;", "a", "(Ljava/lang/Object;)LN0/e;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$r, reason: case insensitive filesystem */
    static final class C1055r extends AbstractC3864v implements Ba.l<Object, LocaleList> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1055r f5289B = new C1055r();

        C1055r() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LocaleList invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                Y.j<N0.d, Object> jVarL = B.l(N0.d.INSTANCE);
                N0.d dVarA = null;
                if ((!C3862t.b(obj2, Boolean.FALSE) || (jVarL instanceof InterfaceC1070n)) && obj2 != null) {
                    dVarA = jVarL.a(obj2);
                }
                C3862t.d(dVarA);
                arrayList.add(dVarA);
            }
            return new LocaleList(arrayList);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LN0/d;", "it", "", "a", "(LY/l;LN0/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: H0.B$s, reason: case insensitive filesystem */
    static final class C1056s extends AbstractC3864v implements Ba.p<Y.l, N0.d, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final C1056s f5290B = new C1056s();

        C1056s() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, N0.d dVar) {
            return dVar.b();
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LN0/d;", "a", "(Ljava/lang/Object;)LN0/d;"}, k = 3, mv = {1, 8, 0})
    static final class t extends AbstractC3864v implements Ba.l<Object, N0.d> {

        /* renamed from: B, reason: collision with root package name */
        public static final t f5291B = new t();

        t() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N0.d invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.String");
            return new N0.d((String) obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"H0/B$u", "LH0/n;", "LY/l;", "value", "b", "(LY/l;Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class u<Original, Saveable> implements InterfaceC1070n<Original, Saveable> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ba.p<Y.l, Original, Saveable> f5292a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ba.l<Saveable, Original> f5293b;

        /* JADX WARN: Multi-variable type inference failed */
        u(Ba.p<? super Y.l, ? super Original, ? extends Saveable> pVar, Ba.l<? super Saveable, ? extends Original> lVar) {
            this.f5292a = pVar;
            this.f5293b = lVar;
        }

        @Override // Y.j
        public Original a(Saveable value) {
            return this.f5293b.invoke(value);
        }

        @Override // Y.j
        public Saveable b(Y.l lVar, Original original) {
            return this.f5292a.invoke(lVar, original);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "Lh0/g;", "it", "", "a", "(LY/l;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class v extends AbstractC3864v implements Ba.p<Y.l, C3476g, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final v f5294B = new v();

        v() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(Y.l lVar, long j10) {
            return C3476g.j(j10, C3476g.INSTANCE.b()) ? Boolean.FALSE : kotlin.collections.r.g(B.x(Float.valueOf(C3476g.m(j10))), B.x(Float.valueOf(C3476g.n(j10))));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Object invoke(Y.l lVar, C3476g c3476g) {
            return a(lVar, c3476g.getPackedValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lh0/g;", "a", "(Ljava/lang/Object;)Lh0/g;"}, k = 3, mv = {1, 8, 0})
    static final class w extends AbstractC3864v implements Ba.l<Object, C3476g> {

        /* renamed from: B, reason: collision with root package name */
        public static final w f5295B = new w();

        w() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3476g invoke(Object obj) {
            if (C3862t.b(obj, Boolean.FALSE)) {
                return C3476g.d(C3476g.INSTANCE.b());
            }
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            C3862t.d(f10);
            float fFloatValue = f10.floatValue();
            Object obj3 = list.get(1);
            Float f11 = obj3 != null ? (Float) obj3 : null;
            C3862t.d(f11);
            return C3476g.d(C3477h.a(fFloatValue, f11.floatValue()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LH0/u;", "it", "", "a", "(LY/l;LH0/u;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class x extends AbstractC3864v implements Ba.p<Y.l, ParagraphStyle, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final x f5296B = new x();

        x() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, ParagraphStyle uVar) {
            return kotlin.collections.r.g(B.x(R0.i.h(uVar.getTextAlign())), B.x(R0.k.g(uVar.getTextDirection())), B.y(U0.v.b(uVar.getLineHeight()), B.r(U0.v.INSTANCE), lVar), B.y(uVar.getTextIndent(), B.q(TextIndent.INSTANCE), lVar));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LH0/u;", "a", "(Ljava/lang/Object;)LH0/u;"}, k = 3, mv = {1, 8, 0})
    static final class y extends AbstractC3864v implements Ba.l<Object, ParagraphStyle> {

        /* renamed from: B, reason: collision with root package name */
        public static final y f5297B = new y();

        y() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ParagraphStyle invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            R0.i iVar = obj2 != null ? (R0.i) obj2 : null;
            C3862t.d(iVar);
            int value = iVar.getValue();
            Object obj3 = list.get(1);
            R0.k kVar = obj3 != null ? (R0.k) obj3 : null;
            C3862t.d(kVar);
            int value2 = kVar.getValue();
            Object obj4 = list.get(2);
            Y.j<U0.v, Object> jVarR = B.r(U0.v.INSTANCE);
            Boolean bool = Boolean.FALSE;
            U0.v vVarA = ((!C3862t.b(obj4, bool) || (jVarR instanceof InterfaceC1070n)) && obj4 != null) ? jVarR.a(obj4) : null;
            C3862t.d(vVarA);
            long packedValue = vVarA.getPackedValue();
            Object obj5 = list.get(3);
            Y.j<TextIndent, Object> jVarQ = B.q(TextIndent.INSTANCE);
            return new ParagraphStyle(value, value2, packedValue, ((!C3862t.b(obj5, bool) || (jVarQ instanceof InterfaceC1070n)) && obj5 != null) ? jVarQ.a(obj5) : null, null, null, 0, 0, null, 496, null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "Li0/b1;", "it", "", "a", "(LY/l;Li0/b1;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class z extends AbstractC3864v implements Ba.p<Y.l, Shadow, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final z f5298B = new z();

        z() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, Shadow b1Var) {
            return kotlin.collections.r.g(B.y(C3602t0.g(b1Var.getColor()), B.t(C3602t0.INSTANCE), lVar), B.y(C3476g.d(b1Var.getOffset()), B.s(C3476g.INSTANCE), lVar), B.x(Float.valueOf(b1Var.getBlurRadius())));
        }
    }

    private static final <Original, Saveable> InterfaceC1070n<Original, Saveable> a(Ba.p<? super Y.l, ? super Original, ? extends Saveable> pVar, Ba.l<? super Saveable, ? extends Original> lVar) {
        return new u(pVar, lVar);
    }

    public static final Y.j<C1060d, Object> h() {
        return f5229a;
    }

    public static final Y.j<ParagraphStyle, Object> i() {
        return f5236h;
    }

    public static final Y.j<H0.H, Object> j(H.Companion companion) {
        return f5244p;
    }

    public static final Y.j<FontWeight, Object> k(FontWeight.Companion companion) {
        return f5242n;
    }

    public static final Y.j<N0.d, Object> l(d.Companion companion) {
        return f5250v;
    }

    public static final Y.j<LocaleList, Object> m(LocaleList.Companion companion) {
        return f5249u;
    }

    public static final Y.j<R0.a, Object> n(a.Companion companion) {
        return f5243o;
    }

    public static final Y.j<R0.j, Object> o(j.Companion companion) {
        return f5239k;
    }

    public static final Y.j<TextGeometricTransform, Object> p(TextGeometricTransform.Companion companion) {
        return f5240l;
    }

    public static final Y.j<TextIndent, Object> q(TextIndent.Companion companion) {
        return f5241m;
    }

    public static final Y.j<U0.v, Object> r(v.Companion companion) {
        return f5247s;
    }

    public static final Y.j<C3476g, Object> s(C3476g.Companion companion) {
        return f5248t;
    }

    public static final Y.j<C3602t0, Object> t(C3602t0.Companion companion) {
        return f5246r;
    }

    public static final Y.j<Shadow, Object> u(Shadow.Companion aVar) {
        return f5245q;
    }

    public static final Y.j<SpanStyle, Object> v() {
        return f5237i;
    }

    public static final Y.j<H0.G, Object> w() {
        return f5238j;
    }

    public static final <T extends Y.j<Original, Saveable>, Original, Saveable> Object y(Original original, T t10, Y.l lVar) {
        Object objB;
        return (original == null || (objB = t10.b(lVar, original)) == null) ? Boolean.FALSE : objB;
    }

    public static final <T> T x(T t10) {
        return t10;
    }
}
