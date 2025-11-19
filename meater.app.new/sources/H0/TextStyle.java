package H0;

import N0.LocaleList;
import R0.LineHeightStyle;
import R0.TextGeometricTransform;
import R0.TextIndent;
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

/* compiled from: TextStyle.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b'\b\u0007\u0018\u0000 _2\u00020\u0001:\u0001OB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB\u0097\u0002\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020\r\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b\b\u00106J\u000f\u00107\u001a\u00020\u0002H\u0007¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0004H\u0007¢\u0006\u0004\b9\u0010:J\u001b\u0010<\u001a\u00020\u00002\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b<\u0010=J \u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u000104H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0004H\u0007¢\u0006\u0004\b@\u0010AJ\u009e\u0002\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00105\u001a\u0004\u0018\u000104ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020D2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020D2\u0006\u0010;\u001a\u00020\u0000¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020D2\u0006\u0010;\u001a\u00020\u0000¢\u0006\u0004\bI\u0010HJ\u000f\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0017H\u0016¢\u0006\u0004\bM\u0010NR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010R\u001a\u0004\bS\u0010:R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0013\u0010[\u001a\u0004\u0018\u00010X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0017\u0010\f\u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0011\u0010a\u001a\u00020^8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0017\u0010\u000e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bb\u0010]R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\be\u0010fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bk\u0010NR\u0017\u0010\u0019\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bl\u0010]R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0017\u0010 \u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bs\u0010]R\u0013\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0013\u0010$\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0013\u0010&\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0017\u0010(\u001a\u00020'8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bz\u0010LR\u0017\u0010*\u001a\u00020)8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b{\u0010LR\u0017\u0010+\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b|\u0010]R\u0013\u0010-\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0014\u0010/\u001a\u0004\u0018\u00010.8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u00103\u001a\u0002028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010LR\u0018\u00101\u001a\u0002008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010LR\u0015\u00105\u001a\u0004\u0018\u0001048F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0085\u0001"}, d2 = {"LH0/J;", "", "LH0/C;", "spanStyle", "LH0/u;", "paragraphStyle", "LH0/A;", "platformStyle", "<init>", "(LH0/C;LH0/u;LH0/A;)V", "(LH0/C;LH0/u;)V", "Li0/t0;", "color", "LU0/v;", "fontSize", "LL0/B;", "fontWeight", "LL0/w;", "fontStyle", "LL0/x;", "fontSynthesis", "LL0/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LR0/a;", "baselineShift", "LR0/n;", "textGeometricTransform", "LN0/e;", "localeList", "background", "LR0/j;", "textDecoration", "Li0/b1;", "shadow", "Lk0/g;", "drawStyle", "LR0/i;", "textAlign", "LR0/k;", "textDirection", "lineHeight", "LR0/o;", "textIndent", "LR0/g;", "lineHeightStyle", "LR0/e;", "lineBreak", "LR0/d;", "hyphens", "LR0/p;", "textMotion", "(JJLL0/B;LL0/w;LL0/x;LL0/l;Ljava/lang/String;JLR0/a;LR0/n;LN0/e;JLR0/j;Li0/b1;Lk0/g;IIJLR0/o;LH0/A;LR0/g;IILR0/p;Lkotlin/jvm/internal/k;)V", "M", "()LH0/C;", "L", "()LH0/u;", "other", "I", "(LH0/J;)LH0/J;", "J", "(JJLL0/B;LL0/w;LL0/x;LL0/l;Ljava/lang/String;JLR0/a;LR0/n;LN0/e;JLR0/j;Li0/b1;Lk0/g;IIJLR0/o;LR0/g;IILH0/A;LR0/p;)LH0/J;", "H", "(LH0/u;)LH0/J;", "b", "(JJLL0/B;LL0/w;LL0/x;LL0/l;Ljava/lang/String;JLR0/a;LR0/n;LN0/e;JLR0/j;Li0/b1;Lk0/g;IIJLR0/o;LH0/A;LR0/g;IILR0/p;)LH0/J;", "", "equals", "(Ljava/lang/Object;)Z", "G", "(LH0/J;)Z", "F", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "LH0/C;", "y", "LH0/u;", "v", "c", "LH0/A;", "w", "()LH0/A;", "Li0/j0;", "g", "()Li0/j0;", "brush", "h", "()J", "", "d", "()F", "alpha", "l", "o", "()LL0/B;", "m", "()LL0/w;", "n", "()LL0/x;", "j", "()LL0/l;", "k", "q", "f", "()LR0/a;", "C", "()LR0/n;", "u", "()LN0/e;", "e", "A", "()LR0/j;", "x", "()Li0/b1;", "i", "()Lk0/g;", "z", "B", "s", "D", "()LR0/o;", "t", "()LR0/g;", "p", "r", "E", "()LR0/p;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.J, reason: from toString */
/* loaded from: classes.dex */
public final class TextStyle {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final TextStyle f5345e = new TextStyle(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777215, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle spanStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ParagraphStyle paragraphStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlatformTextStyle platformStyle;

    /* compiled from: TextStyle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LH0/J$a;", "", "<init>", "()V", "LH0/J;", "Default", "LH0/J;", "a", "()LH0/J;", "getDefault$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H0.J$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final TextStyle a() {
            return TextStyle.f5345e;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, C1352w c1352w, C1353x c1353x, AbstractC1341l abstractC1341l, String str, long j12, R0.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, R0.j jVar, Shadow shadow, k0.g gVar, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, R0.p pVar, C3854k c3854k) {
        this(j10, j11, fontWeight, c1352w, c1353x, abstractC1341l, str, j12, aVar, textGeometricTransform, localeList, j13, jVar, shadow, gVar, i10, i11, j14, textIndent, platformTextStyle, lineHeightStyle, i12, i13, pVar);
    }

    public final R0.j A() {
        return this.spanStyle.getTextDecoration();
    }

    public final int B() {
        return this.paragraphStyle.getTextDirection();
    }

    public final TextGeometricTransform C() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final TextIndent D() {
        return this.paragraphStyle.getTextIndent();
    }

    public final R0.p E() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean F(TextStyle other) {
        return this == other || this.spanStyle.w(other.spanStyle);
    }

    public final boolean G(TextStyle other) {
        return this == other || (C3862t.b(this.paragraphStyle, other.paragraphStyle) && this.spanStyle.v(other.spanStyle));
    }

    public final TextStyle H(ParagraphStyle other) {
        return new TextStyle(getSpanStyle(), getParagraphStyle().l(other));
    }

    public final TextStyle I(TextStyle other) {
        return (other == null || C3862t.b(other, f5345e)) ? this : new TextStyle(getSpanStyle().x(other.getSpanStyle()), getParagraphStyle().l(other.getParagraphStyle()));
    }

    public final TextStyle J(long color, long fontSize, FontWeight fontWeight, C1352w fontStyle, C1353x fontSynthesis, AbstractC1341l fontFamily, String fontFeatureSettings, long letterSpacing, R0.a baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, R0.j textDecoration, Shadow shadow, k0.g drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, PlatformTextStyle platformStyle, R0.p textMotion) {
        SpanStyle spanStyle = this.spanStyle;
        if (platformStyle != null) {
            platformStyle.b();
        }
        SpanStyle spanStyleB = D.b(spanStyle, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, null, drawStyle);
        ParagraphStyle paragraphStyleA = v.a(this.paragraphStyle, textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion);
        return (this.spanStyle == spanStyleB && this.paragraphStyle == paragraphStyleA) ? this : new TextStyle(spanStyleB, paragraphStyleA);
    }

    /* renamed from: L, reason: from getter */
    public final ParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    /* renamed from: M, reason: from getter */
    public final SpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public final TextStyle b(long color, long fontSize, FontWeight fontWeight, C1352w fontStyle, C1353x fontSynthesis, AbstractC1341l fontFamily, String fontFeatureSettings, long letterSpacing, R0.a baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, R0.j textDecoration, Shadow shadow, k0.g drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, R0.p textMotion) {
        R0.m textForegroundStyle = C3602t0.m(color, this.spanStyle.g()) ? this.spanStyle.getTextForegroundStyle() : R0.m.INSTANCE.b(color);
        if (platformStyle != null) {
            platformStyle.b();
        }
        return new TextStyle(new SpanStyle(textForegroundStyle, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, (z) null, drawStyle, (C3854k) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, null), platformStyle);
    }

    public final float d() {
        return this.spanStyle.c();
    }

    public final long e() {
        return this.spanStyle.getBackground();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return C3862t.b(this.spanStyle, textStyle.spanStyle) && C3862t.b(this.paragraphStyle, textStyle.paragraphStyle) && C3862t.b(this.platformStyle, textStyle.platformStyle);
    }

    public final R0.a f() {
        return this.spanStyle.getBaselineShift();
    }

    public final AbstractC3582j0 g() {
        return this.spanStyle.f();
    }

    public final long h() {
        return this.spanStyle.g();
    }

    public int hashCode() {
        int iHashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final k0.g i() {
        return this.spanStyle.getDrawStyle();
    }

    public final AbstractC1341l j() {
        return this.spanStyle.getFontFamily();
    }

    public final String k() {
        return this.spanStyle.getFontFeatureSettings();
    }

    public final long l() {
        return this.spanStyle.getFontSize();
    }

    public final C1352w m() {
        return this.spanStyle.getFontStyle();
    }

    public final C1353x n() {
        return this.spanStyle.getFontSynthesis();
    }

    public final FontWeight o() {
        return this.spanStyle.getFontWeight();
    }

    public final int p() {
        return this.paragraphStyle.getHyphens();
    }

    public final long q() {
        return this.spanStyle.getLetterSpacing();
    }

    public final int r() {
        return this.paragraphStyle.getLineBreak();
    }

    public final long s() {
        return this.paragraphStyle.getLineHeight();
    }

    public final LineHeightStyle t() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) C3602t0.t(h())) + ", brush=" + g() + ", alpha=" + d() + ", fontSize=" + ((Object) U0.v.j(l())) + ", fontWeight=" + o() + ", fontStyle=" + m() + ", fontSynthesis=" + n() + ", fontFamily=" + j() + ", fontFeatureSettings=" + k() + ", letterSpacing=" + ((Object) U0.v.j(q())) + ", baselineShift=" + f() + ", textGeometricTransform=" + C() + ", localeList=" + u() + ", background=" + ((Object) C3602t0.t(e())) + ", textDecoration=" + A() + ", shadow=" + x() + ", drawStyle=" + i() + ", textAlign=" + ((Object) R0.i.m(z())) + ", textDirection=" + ((Object) R0.k.l(B())) + ", lineHeight=" + ((Object) U0.v.j(s())) + ", textIndent=" + D() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + t() + ", lineBreak=" + ((Object) R0.e.i(r())) + ", hyphens=" + ((Object) R0.d.g(p())) + ", textMotion=" + E() + ')';
    }

    public final LocaleList u() {
        return this.spanStyle.getLocaleList();
    }

    public final ParagraphStyle v() {
        return this.paragraphStyle;
    }

    /* renamed from: w, reason: from getter */
    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow x() {
        return this.spanStyle.getShadow();
    }

    public final SpanStyle y() {
        return this.spanStyle;
    }

    public final int z() {
        return this.paragraphStyle.getTextAlign();
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, K.b(null, paragraphStyle.getPlatformStyle()));
        spanStyle.q();
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, C1352w c1352w, C1353x c1353x, AbstractC1341l abstractC1341l, String str, long j12, R0.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, R0.j jVar, Shadow shadow, k0.g gVar, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, R0.p pVar, int i14, C3854k c3854k) {
        this((i14 & 1) != 0 ? C3602t0.INSTANCE.e() : j10, (i14 & 2) != 0 ? U0.v.INSTANCE.a() : j11, (i14 & 4) != 0 ? null : fontWeight, (i14 & 8) != 0 ? null : c1352w, (i14 & 16) != 0 ? null : c1353x, (i14 & 32) != 0 ? null : abstractC1341l, (i14 & 64) != 0 ? null : str, (i14 & 128) != 0 ? U0.v.INSTANCE.a() : j12, (i14 & 256) != 0 ? null : aVar, (i14 & 512) != 0 ? null : textGeometricTransform, (i14 & 1024) != 0 ? null : localeList, (i14 & 2048) != 0 ? C3602t0.INSTANCE.e() : j13, (i14 & 4096) != 0 ? null : jVar, (i14 & 8192) != 0 ? null : shadow, (i14 & 16384) != 0 ? null : gVar, (i14 & 32768) != 0 ? R0.i.INSTANCE.g() : i10, (i14 & 65536) != 0 ? R0.k.INSTANCE.f() : i11, (i14 & 131072) != 0 ? U0.v.INSTANCE.a() : j14, (i14 & 262144) != 0 ? null : textIndent, (i14 & 524288) != 0 ? null : platformTextStyle, (i14 & 1048576) != 0 ? null : lineHeightStyle, (i14 & 2097152) != 0 ? R0.e.INSTANCE.b() : i12, (i14 & 4194304) != 0 ? R0.d.INSTANCE.c() : i13, (i14 & 8388608) != 0 ? null : pVar, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private TextStyle(long j10, long j11, FontWeight fontWeight, C1352w c1352w, C1353x c1353x, AbstractC1341l abstractC1341l, String str, long j12, R0.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, R0.j jVar, Shadow shadow, k0.g gVar, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, R0.p pVar) {
        this(new SpanStyle(j10, j11, fontWeight, c1352w, c1353x, abstractC1341l, str, j12, aVar, textGeometricTransform, localeList, j13, jVar, shadow, (z) null, gVar, (C3854k) null), new ParagraphStyle(i10, i11, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, i12, i13, pVar, null), platformTextStyle);
        if (platformTextStyle != null) {
            platformTextStyle.b();
        }
    }
}
