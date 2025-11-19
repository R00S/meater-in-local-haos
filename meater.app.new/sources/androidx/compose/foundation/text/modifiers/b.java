package androidx.compose.foundation.text.modifiers;

import A0.B;
import A0.C0839s;
import A0.E;
import A0.r;
import A0.v0;
import A0.w0;
import Ba.l;
import F0.v;
import F0.x;
import G.g;
import H0.C1060d;
import H0.C1066j;
import H0.Placeholder;
import H0.TextLayoutResult;
import H0.TextStyle;
import R0.j;
import R0.q;
import b0.i;
import h0.C3476g;
import h0.C3478i;
import h0.C3479j;
import h0.C3483n;
import i0.AbstractC3582j0;
import i0.C3602t0;
import i0.InterfaceC3586l0;
import i0.InterfaceC3608w0;
import i0.Shadow;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.InterfaceC3783c;
import kotlin.AbstractC1341l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.AbstractC5096a;
import y0.C5097b;
import y0.H;
import y0.InterfaceC5112q;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: TextAnnotatedStringNode.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0088\u0001BÇ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b1\u0010+JV\u00102\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b2\u00103Ja\u00104\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b4\u00105J-\u0010:\u001a\u00020\r2\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u0011¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\rH\u0000¢\u0006\u0004\b<\u0010-J\u0013\u0010>\u001a\u00020\r*\u00020=H\u0016¢\u0006\u0004\b>\u0010?J(\u0010G\u001a\u00020F2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020Dø\u0001\u0000¢\u0006\u0004\bG\u0010HJ&\u0010I\u001a\u00020F*\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010HJ%\u0010N\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0013¢\u0006\u0004\bN\u0010OJ#\u0010P\u001a\u00020\u0013*\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0013H\u0016¢\u0006\u0004\bP\u0010OJ%\u0010R\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010Q\u001a\u00020\u0013¢\u0006\u0004\bR\u0010OJ#\u0010S\u001a\u00020\u0013*\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010Q\u001a\u00020\u0013H\u0016¢\u0006\u0004\bS\u0010OJ%\u0010T\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0013¢\u0006\u0004\bT\u0010OJ#\u0010U\u001a\u00020\u0013*\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u0010OJ%\u0010V\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010Q\u001a\u00020\u0013¢\u0006\u0004\bV\u0010OJ#\u0010W\u001a\u00020\u0013*\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010Q\u001a\u00020\u0013H\u0016¢\u0006\u0004\bW\u0010OJ\u0015\u0010Z\u001a\u00020\r2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0013\u0010\\\u001a\u00020\r*\u00020XH\u0016¢\u0006\u0004\b\\\u0010[R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010fR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010fR$\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR,\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010dR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010pR$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010dR*\u0010w\u001a\u0010\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u0013\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bt\u0010u\u0012\u0004\bv\u0010-R\u0018\u0010z\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR*\u0010}\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0{\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010dR)\u0010\u0084\u0001\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0087\u0001\u001a\u00020&8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0089\u0001"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b;", "Lb0/i$c;", "LA0/B;", "LA0/r;", "LA0/v0;", "LH0/d;", "text", "LH0/J;", "style", "LL0/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LH0/F;", "Loa/F;", "onTextLayout", "LR0/q;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LH0/d$c;", "LH0/w;", "placeholders", "Lh0/i;", "onPlaceholderLayout", "LG/g;", "selectionController", "Li0/w0;", "overrideColor", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(LH0/d;LH0/J;LL0/l$b;LBa/l;IZIILjava/util/List;LBa/l;LG/g;Li0/w0;LBa/l;Lkotlin/jvm/internal/k;)V", "LU0/d;", "density", "LG/e;", "t2", "(LU0/d;)LG/e;", "updatedText", "B2", "(LH0/d;)Z", "v2", "()V", "color", "D2", "(Li0/w0;LH0/J;)Z", "F2", "E2", "(LH0/J;Ljava/util/List;IIZLL0/l$b;I)Z", "C2", "(LBa/l;LBa/l;LG/g;LBa/l;)Z", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "q2", "(ZZZZ)V", "p2", "LF0/x;", "m1", "(LF0/x;)V", "Ly0/K;", "measureScope", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "y2", "(Ly0/K;Ly0/H;J)Ly0/J;", "b", "Ly0/r;", "intrinsicMeasureScope", "Ly0/q;", "height", "A2", "(Ly0/r;Ly0/q;I)I", "t", "width", "z2", "L", "x2", "z", "w2", "o", "Lk0/c;", "contentDrawScope", "r2", "(Lk0/c;)V", "d", "O", "LH0/d;", "P", "LH0/J;", "Q", "LL0/l$b;", "R", "LBa/l;", "S", "I", "T", "Z", "U", "V", "W", "Ljava/util/List;", "X", "Y", "LG/g;", "Li0/w0;", "a0", "", "Ly0/a;", "b0", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "c0", "LG/e;", "_layoutCache", "", "d0", "semanticsTextLayoutResult", "e0", "Landroidx/compose/foundation/text/modifiers/b$a;", "u2", "()Landroidx/compose/foundation/text/modifiers/b$a;", "setTextSubstitution$foundation_release", "(Landroidx/compose/foundation/text/modifiers/b$a;)V", "textSubstitution", "s2", "()LG/e;", "layoutCache", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends i.c implements B, r, v0 {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private C1060d text;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private AbstractC1341l.b fontFamilyResolver;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private l<? super TextLayoutResult, C4153F> onTextLayout;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private List<C1060d.Range<Placeholder>> placeholders;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private l<? super List<C3478i>, C4153F> onPlaceholderLayout;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private g selectionController;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private InterfaceC3608w0 overrideColor;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private l<? super TextSubstitutionValue, C4153F> onShowTranslation;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private Map<AbstractC5096a, Integer> baselineCache;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private G.e _layoutCache;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private l<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private TextSubstitutionValue textSubstitution;

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LH0/F;", "textLayoutResult", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.modifiers.b$b, reason: collision with other inner class name */
    static final class C0320b extends AbstractC3864v implements l<List<TextLayoutResult>, Boolean> {
        C0320b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00b8  */
        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(java.util.List<H0.TextLayoutResult> r38) {
            /*
                r37 = this;
                r0 = r37
                androidx.compose.foundation.text.modifiers.b r1 = androidx.compose.foundation.text.modifiers.b.this
                G.e r1 = androidx.compose.foundation.text.modifiers.b.j2(r1)
                H0.F r2 = r1.getLayoutCache()
                if (r2 == 0) goto Lb8
                H0.E r1 = new H0.E
                H0.E r3 = r2.getLayoutInput()
                H0.d r4 = r3.getText()
                androidx.compose.foundation.text.modifiers.b r3 = androidx.compose.foundation.text.modifiers.b.this
                H0.J r5 = androidx.compose.foundation.text.modifiers.b.m2(r3)
                androidx.compose.foundation.text.modifiers.b r3 = androidx.compose.foundation.text.modifiers.b.this
                i0.w0 r3 = androidx.compose.foundation.text.modifiers.b.l2(r3)
                if (r3 == 0) goto L2b
                long r6 = r3.a()
                goto L31
            L2b:
                i0.t0$a r3 = i0.C3602t0.INSTANCE
                long r6 = r3.e()
            L31:
                r35 = 16777214(0xfffffe, float:2.3509884E-38)
                r36 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                H0.J r5 = H0.TextStyle.K(r5, r6, r8, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36)
                H0.E r3 = r2.getLayoutInput()
                java.util.List r6 = r3.g()
                H0.E r3 = r2.getLayoutInput()
                int r7 = r3.getMaxLines()
                H0.E r3 = r2.getLayoutInput()
                boolean r8 = r3.getSoftWrap()
                H0.E r3 = r2.getLayoutInput()
                int r9 = r3.getOverflow()
                H0.E r3 = r2.getLayoutInput()
                U0.d r10 = r3.getDensity()
                H0.E r3 = r2.getLayoutInput()
                U0.t r11 = r3.getLayoutDirection()
                H0.E r3 = r2.getLayoutInput()
                L0.l$b r12 = r3.getFontFamilyResolver()
                H0.E r3 = r2.getLayoutInput()
                long r13 = r3.getConstraints()
                r15 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
                r6 = 2
                r7 = 0
                r4 = 0
                H0.F r1 = H0.TextLayoutResult.b(r2, r3, r4, r6, r7)
                if (r1 == 0) goto Lb8
                r2 = r38
                r2.add(r1)
                goto Lb9
            Lb8:
                r1 = 0
            Lb9:
                if (r1 == 0) goto Lbd
                r1 = 1
                goto Lbe
            Lbd:
                r1 = 0
            Lbe:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.b.C0320b.invoke(java.util.List):java.lang.Boolean");
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH0/d;", "updatedText", "", "a", "(LH0/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements l<C1060d, Boolean> {
        c() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C1060d c1060d) {
            b.this.B2(c1060d);
            b.this.v2();
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements l<Boolean, Boolean> {
        d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            if (b.this.getTextSubstitution() == null) {
                return Boolean.FALSE;
            }
            l lVar = b.this.onShowTranslation;
            if (lVar != null) {
                TextSubstitutionValue textSubstitution = b.this.getTextSubstitution();
                C3862t.d(textSubstitution);
                lVar.invoke(textSubstitution);
            }
            TextSubstitutionValue textSubstitution2 = b.this.getTextSubstitution();
            if (textSubstitution2 != null) {
                textSubstitution2.f(z10);
            }
            b.this.v2();
            return Boolean.TRUE;
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.a<Boolean> {
        e() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            b.this.p2();
            b.this.v2();
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z f22563B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Z z10) {
            super(1);
            this.f22563B = z10;
        }

        public final void a(Z.a aVar) {
            Z.a.h(aVar, this.f22563B, 0, 0, 0.0f, 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ b(C1060d c1060d, TextStyle textStyle, AbstractC1341l.b bVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, g gVar, InterfaceC3608w0 interfaceC3608w0, l lVar3, C3854k c3854k) {
        this(c1060d, textStyle, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, interfaceC3608w0, lVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B2(C1060d updatedText) {
        C4153F c4153f;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue == null) {
            TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, updatedText, false, null, 12, null);
            G.e eVar = new G.e(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
            eVar.k(s2().getDensity());
            textSubstitutionValue2.e(eVar);
            this.textSubstitution = textSubstitutionValue2;
            return true;
        }
        if (C3862t.b(updatedText, textSubstitutionValue.getSubstitution())) {
            return false;
        }
        textSubstitutionValue.g(updatedText);
        G.e layoutCache = textSubstitutionValue.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.n(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
            c4153f = C4153F.f46609a;
        } else {
            c4153f = null;
        }
        return c4153f != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G.e s2() {
        if (this._layoutCache == null) {
            this._layoutCache = new G.e(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        }
        G.e eVar = this._layoutCache;
        C3862t.d(eVar);
        return eVar;
    }

    private final G.e t2(U0.d density) {
        G.e layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.getIsShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.k(density);
            return layoutCache;
        }
        G.e eVarS2 = s2();
        eVarS2.k(density);
        return eVarS2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v2() {
        w0.b(this);
        E.b(this);
        C0839s.a(this);
    }

    public final int A2(y0.r intrinsicMeasureScope, InterfaceC5112q measurable, int height) {
        return t(intrinsicMeasureScope, measurable, height);
    }

    public final boolean C2(l<? super TextLayoutResult, C4153F> onTextLayout, l<? super List<C3478i>, C4153F> onPlaceholderLayout, g selectionController, l<? super TextSubstitutionValue, C4153F> onShowTranslation) {
        boolean z10;
        if (this.onTextLayout != onTextLayout) {
            this.onTextLayout = onTextLayout;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.onPlaceholderLayout != onPlaceholderLayout) {
            this.onPlaceholderLayout = onPlaceholderLayout;
            z10 = true;
        }
        if (!C3862t.b(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z10 = true;
        }
        if (this.onShowTranslation == onShowTranslation) {
            return z10;
        }
        this.onShowTranslation = onShowTranslation;
        return true;
    }

    public final boolean D2(InterfaceC3608w0 color, TextStyle style) {
        boolean zB = C3862t.b(color, this.overrideColor);
        this.overrideColor = color;
        return (zB && style.F(this.style)) ? false : true;
    }

    public final boolean E2(TextStyle style, List<C1060d.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, AbstractC1341l.b fontFamilyResolver, int overflow) {
        boolean z10 = !this.style.G(style);
        this.style = style;
        if (!C3862t.b(this.placeholders, placeholders)) {
            this.placeholders = placeholders;
            z10 = true;
        }
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z10 = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z10 = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z10 = true;
        }
        if (!C3862t.b(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z10 = true;
        }
        if (q.e(this.overflow, overflow)) {
            return z10;
        }
        this.overflow = overflow;
        return true;
    }

    public final boolean F2(C1060d text) {
        boolean zB = C3862t.b(this.text.getText(), text.getText());
        boolean z10 = (zB && C3862t.b(this.text.g(), text.g()) && C3862t.b(this.text.e(), text.e()) && this.text.m(text)) ? false : true;
        if (z10) {
            this.text = text;
        }
        if (!zB) {
            p2();
        }
        return z10;
    }

    @Override // A0.B
    public int L(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return t2(rVar).d(i10, rVar.getLayoutDirection());
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        G.e eVarT2 = t2(k10);
        boolean zF = eVarT2.f(j10, k10.getLayoutDirection());
        TextLayoutResult textLayoutResultC = eVarT2.c();
        textLayoutResultC.getMultiParagraph().getIntrinsics().a();
        if (zF) {
            E.a(this);
            l<? super TextLayoutResult, C4153F> lVar = this.onTextLayout;
            if (lVar != null) {
                lVar.invoke(textLayoutResultC);
            }
            g gVar = this.selectionController;
            if (gVar != null) {
                gVar.h(textLayoutResultC);
            }
            Map<AbstractC5096a, Integer> linkedHashMap = this.baselineCache;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(2);
            }
            linkedHashMap.put(C5097b.a(), Integer.valueOf(Math.round(textLayoutResultC.getFirstBaseline())));
            linkedHashMap.put(C5097b.b(), Integer.valueOf(Math.round(textLayoutResultC.getLastBaseline())));
            this.baselineCache = linkedHashMap;
        }
        l<? super List<C3478i>, C4153F> lVar2 = this.onPlaceholderLayout;
        if (lVar2 != null) {
            lVar2.invoke(textLayoutResultC.y());
        }
        Z zT = h10.T(U0.b.INSTANCE.b(U0.r.g(textLayoutResultC.getSize()), U0.r.g(textLayoutResultC.getSize()), U0.r.f(textLayoutResultC.getSize()), U0.r.f(textLayoutResultC.getSize())));
        int iG = U0.r.g(textLayoutResultC.getSize());
        int iF = U0.r.f(textLayoutResultC.getSize());
        Map<AbstractC5096a, Integer> map = this.baselineCache;
        C3862t.d(map);
        return k10.h0(iG, iF, map, new f(zT));
    }

    @Override // A0.r
    public void d(InterfaceC3783c interfaceC3783c) {
        if (getIsAttached()) {
            g gVar = this.selectionController;
            if (gVar != null) {
                gVar.e(interfaceC3783c);
            }
            InterfaceC3586l0 interfaceC3586l0G = interfaceC3783c.getDrawContext().G();
            TextLayoutResult textLayoutResultC = t2(interfaceC3783c).c();
            C1066j multiParagraph = textLayoutResultC.getMultiParagraph();
            boolean z10 = true;
            boolean z11 = textLayoutResultC.i() && !q.e(this.overflow, q.INSTANCE.c());
            if (z11) {
                C3478i c3478iA = C3479j.a(C3476g.INSTANCE.c(), C3483n.a(U0.r.g(textLayoutResultC.getSize()), U0.r.f(textLayoutResultC.getSize())));
                interfaceC3586l0G.h();
                InterfaceC3586l0.s(interfaceC3586l0G, c3478iA, 0, 2, null);
            }
            try {
                j jVarA = this.style.A();
                if (jVarA == null) {
                    jVarA = j.INSTANCE.b();
                }
                j jVar = jVarA;
                Shadow shadowX = this.style.x();
                if (shadowX == null) {
                    shadowX = Shadow.INSTANCE.a();
                }
                Shadow shadow = shadowX;
                k0.g gVarI = this.style.i();
                if (gVarI == null) {
                    gVarI = k0.j.f43725a;
                }
                k0.g gVar2 = gVarI;
                AbstractC3582j0 abstractC3582j0G = this.style.g();
                if (abstractC3582j0G != null) {
                    multiParagraph.A(interfaceC3586l0G, abstractC3582j0G, (64 & 4) != 0 ? Float.NaN : this.style.d(), (64 & 8) != 0 ? null : shadow, (64 & 16) != 0 ? null : jVar, (64 & 32) != 0 ? null : gVar2, (64 & 64) != 0 ? k0.f.INSTANCE.a() : 0);
                } else {
                    InterfaceC3608w0 interfaceC3608w0 = this.overrideColor;
                    long jA = interfaceC3608w0 != null ? interfaceC3608w0.a() : C3602t0.INSTANCE.e();
                    if (jA == 16) {
                        jA = this.style.h() != 16 ? this.style.h() : C3602t0.INSTANCE.a();
                    }
                    multiParagraph.y(interfaceC3586l0G, (32 & 2) != 0 ? C3602t0.INSTANCE.e() : jA, (32 & 4) != 0 ? null : shadow, (32 & 8) != 0 ? null : jVar, (32 & 16) == 0 ? gVar2 : null, (32 & 32) != 0 ? k0.f.INSTANCE.a() : 0);
                }
                if (z11) {
                    interfaceC3586l0G.t();
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (!((textSubstitutionValue == null || !textSubstitutionValue.getIsShowingSubstitution()) ? G.j.a(this.text) : false)) {
                    List<C1060d.Range<Placeholder>> list = this.placeholders;
                    if (list != null && !list.isEmpty()) {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                }
                interfaceC3783c.C1();
            } catch (Throwable th) {
                if (z11) {
                    interfaceC3586l0G.t();
                }
                throw th;
            }
        }
    }

    @Override // A0.v0
    public void m1(x xVar) {
        l c0320b = this.semanticsTextLayoutResult;
        if (c0320b == null) {
            c0320b = new C0320b();
            this.semanticsTextLayoutResult = c0320b;
        }
        v.J(xVar, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            v.K(xVar, textSubstitutionValue.getSubstitution());
            v.I(xVar, textSubstitutionValue.getIsShowingSubstitution());
        }
        v.M(xVar, null, new c(), 1, null);
        v.Q(xVar, null, new d(), 1, null);
        v.d(xVar, null, new e(), 1, null);
        v.l(xVar, null, c0320b, 1, null);
    }

    @Override // A0.B
    public int o(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return t2(rVar).d(i10, rVar.getLayoutDirection());
    }

    public final void p2() {
        this.textSubstitution = null;
    }

    public final void q2(boolean drawChanged, boolean textChanged, boolean layoutChanged, boolean callbacksChanged) {
        if (textChanged || layoutChanged || callbacksChanged) {
            s2().n(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                w0.b(this);
            }
            if (textChanged || layoutChanged || callbacksChanged) {
                E.b(this);
                C0839s.a(this);
            }
            if (drawChanged) {
                C0839s.a(this);
            }
        }
    }

    public final void r2(InterfaceC3783c contentDrawScope) {
        d(contentDrawScope);
    }

    @Override // A0.B
    public int t(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return t2(rVar).i(rVar.getLayoutDirection());
    }

    /* renamed from: u2, reason: from getter */
    public final TextSubstitutionValue getTextSubstitution() {
        return this.textSubstitution;
    }

    public final int w2(y0.r intrinsicMeasureScope, InterfaceC5112q measurable, int width) {
        return o(intrinsicMeasureScope, measurable, width);
    }

    public final int x2(y0.r intrinsicMeasureScope, InterfaceC5112q measurable, int height) {
        return z(intrinsicMeasureScope, measurable, height);
    }

    public final J y2(K measureScope, H measurable, long constraints) {
        return b(measureScope, measurable, constraints);
    }

    @Override // A0.B
    public int z(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return t2(rVar).h(rVar.getLayoutDirection());
    }

    public final int z2(y0.r intrinsicMeasureScope, InterfaceC5112q measurable, int width) {
        return L(intrinsicMeasureScope, measurable, width);
    }

    private b(C1060d c1060d, TextStyle textStyle, AbstractC1341l.b bVar, l<? super TextLayoutResult, C4153F> lVar, int i10, boolean z10, int i11, int i12, List<C1060d.Range<Placeholder>> list, l<? super List<C3478i>, C4153F> lVar2, g gVar, InterfaceC3608w0 interfaceC3608w0, l<? super TextSubstitutionValue, C4153F> lVar3) {
        this.text = c1060d;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.onTextLayout = lVar;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.placeholders = list;
        this.onPlaceholderLayout = lVar2;
        this.selectionController = gVar;
        this.overrideColor = interfaceC3608w0;
        this.onShowTranslation = lVar3;
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0014\u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b$a;", "", "LH0/d;", "original", "substitution", "", "isShowingSubstitution", "LG/e;", "layoutCache", "<init>", "(LH0/d;LH0/d;ZLG/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LH0/d;", "b", "()LH0/d;", "c", "g", "(LH0/d;)V", "Z", "d", "()Z", "f", "(Z)V", "LG/e;", "()LG/e;", "e", "(LG/e;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.modifiers.b$a, reason: from toString */
    public static final /* data */ class TextSubstitutionValue {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final C1060d original;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private C1060d substitution;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isShowingSubstitution;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private G.e layoutCache;

        public TextSubstitutionValue(C1060d c1060d, C1060d c1060d2, boolean z10, G.e eVar) {
            this.original = c1060d;
            this.substitution = c1060d2;
            this.isShowingSubstitution = z10;
            this.layoutCache = eVar;
        }

        /* renamed from: a, reason: from getter */
        public final G.e getLayoutCache() {
            return this.layoutCache;
        }

        /* renamed from: b, reason: from getter */
        public final C1060d getOriginal() {
            return this.original;
        }

        /* renamed from: c, reason: from getter */
        public final C1060d getSubstitution() {
            return this.substitution;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void e(G.e eVar) {
            this.layoutCache = eVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) other;
            return C3862t.b(this.original, textSubstitutionValue.original) && C3862t.b(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && C3862t.b(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public final void f(boolean z10) {
            this.isShowingSubstitution = z10;
        }

        public final void g(C1060d c1060d) {
            this.substitution = c1060d;
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            G.e eVar = this.layoutCache;
            return iHashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public /* synthetic */ TextSubstitutionValue(C1060d c1060d, C1060d c1060d2, boolean z10, G.e eVar, int i10, C3854k c3854k) {
            this(c1060d, c1060d2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : eVar);
        }
    }
}
