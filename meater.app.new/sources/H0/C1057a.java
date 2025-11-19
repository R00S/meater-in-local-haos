package H0;

import I0.Z;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import h0.C3478i;
import h0.C3483n;
import i0.AbstractC3582j0;
import i0.C3545H;
import i0.C3561Y;
import i0.InterfaceC3586l0;
import i0.R0;
import i0.Shadow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3846c;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u0006*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJQ\u0010#\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,J,\u00102\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\b\b\u0001\u00101\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001f\u00107\u001a\u0002062\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b9\u0010,J\u0017\u0010;\u001a\u00020%2\u0006\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020%2\u0006\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010>\u001a\u00020%2\u0006\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b>\u0010<J\u0017\u0010?\u001a\u00020%2\u0006\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b?\u0010<J\u0017\u0010@\u001a\u00020%2\u0006\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010<J\u0017\u0010A\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\bF\u0010BJ\u001f\u0010H\u001a\u00020%2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0006H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020J2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020J2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010LJH\u0010X\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010O\u001a\u00020N2\b\u0010Q\u001a\u0004\u0018\u00010P2\b\u0010S\u001a\u0004\u0018\u00010R2\b\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010W\u001a\u00020VH\u0016ø\u0001\u0000¢\u0006\u0004\bX\u0010YJP\u0010]\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020%2\b\u0010Q\u001a\u0004\u0018\u00010P2\b\u0010S\u001a\u0004\u0018\u00010R2\b\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010W\u001a\u00020VH\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010^R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010nR \u0010v\u001a\u00020p8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b>\u0010q\u0012\u0004\bt\u0010u\u001a\u0004\br\u0010sR\"\u0010|\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0w8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010}R\u0014\u0010\u007f\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010}R\u0015\u0010\u0080\u0001\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010}R\u0016\u0010\u0082\u0001\u001a\u00020%8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010}R\u0015\u0010\u0083\u0001\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010}R\u0016\u0010\u0085\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010jR\u0016\u0010\u0087\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010fR\u001f\u0010\u008c\u0001\u001a\u00030\u0088\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u008b\u0001\u0010u\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008d\u0001"}, d2 = {"LH0/a;", "LH0/o;", "LO0/d;", "paragraphIntrinsics", "", "maxLines", "", "ellipsis", "LU0/b;", "constraints", "<init>", "(LO0/d;IZJLkotlin/jvm/internal/k;)V", "LI0/Z;", "", "LQ0/b;", "D", "(LI0/Z;)[LQ0/b;", "Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "F", "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "Li0/l0;", "canvas", "Loa/F;", "G", "(Li0/l0;)V", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "A", "(IILandroid/text/TextUtils$TruncateAt;IIIII)LI0/Z;", "", "vertical", "x", "(F)I", "offset", "Lh0/i;", "o", "(I)Lh0/i;", "LH0/H;", "range", "", "array", "arrayStart", "d", "(J[FI)V", "start", "end", "Li0/R0;", "y", "(II)Li0/R0;", "h", "lineIndex", "z", "(I)F", "t", "f", "C", "m", "q", "(I)I", "visibleEnd", "r", "(IZ)I", "i", "usePrimaryDirection", "B", "(IZ)F", "LR0/h;", "e", "(I)LR0/h;", "l", "Li0/t0;", "color", "Li0/b1;", "shadow", "LR0/j;", "textDecoration", "Lk0/g;", "drawStyle", "Li0/b0;", "blendMode", "u", "(Li0/l0;JLi0/b1;LR0/j;Lk0/g;I)V", "Li0/j0;", "brush", "alpha", "k", "(Li0/l0;Li0/j0;FLi0/b1;LR0/j;Lk0/g;I)V", "a", "LO0/d;", "getParagraphIntrinsics", "()LO0/d;", "b", "I", "getMaxLines", "()I", "c", "Z", "getEllipsis", "()Z", "J", "getConstraints-msEJaDk", "()J", "LI0/Z;", "layout", "", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "charSequence", "", "g", "Ljava/util/List;", "p", "()Ljava/util/List;", "placeholderRects", "()F", "width", "height", "maxIntrinsicWidth", "j", "firstBaseline", "lastBaseline", "w", "didExceedMaxLines", "s", "lineCount", "LO0/g;", "E", "()LO0/g;", "getTextPaint$ui_text_release$annotations", "textPaint", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1057a implements o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final O0.d paragraphIntrinsics;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean ellipsis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Z layout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<C3478i> placeholderRects;

    /* compiled from: AndroidParagraph.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0097a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5359a;

        static {
            int[] iArr = new int[R0.h.values().length];
            try {
                iArr[R0.h.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[R0.h.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5359a = iArr;
        }
    }

    public /* synthetic */ C1057a(O0.d dVar, int i10, boolean z10, long j10, C3854k c3854k) {
        this(dVar, i10, z10, j10);
    }

    private final Z A(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines, int hyphens, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle) {
        return new Z(this.charSequence, b(), E(), alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, O0.c.b(this.paragraphIntrinsics.getStyle()), true, maxLines, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphens, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 196736, null);
    }

    private final Q0.b[] D(Z z10) {
        if (!(z10.D() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceD = z10.D();
        C3862t.e(charSequenceD, "null cannot be cast to non-null type android.text.Spanned");
        if (!F((Spanned) charSequenceD, Q0.b.class)) {
            return null;
        }
        CharSequence charSequenceD2 = z10.D();
        C3862t.e(charSequenceD2, "null cannot be cast to non-null type android.text.Spanned");
        return (Q0.b[]) ((Spanned) charSequenceD2).getSpans(0, z10.D().length(), Q0.b.class);
    }

    private final boolean F(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void G(InterfaceC3586l0 canvas) {
        Canvas canvasD = C3545H.d(canvas);
        if (w()) {
            canvasD.save();
            canvasD.clipRect(0.0f, 0.0f, b(), a());
        }
        this.layout.G(canvasD);
        if (w()) {
            canvasD.restore();
        }
    }

    public float B(int offset, boolean usePrimaryDirection) {
        return usePrimaryDirection ? Z.z(this.layout, offset, false, 2, null) : Z.B(this.layout, offset, false, 2, null);
    }

    public float C(int lineIndex) {
        return this.layout.j(lineIndex);
    }

    public final O0.g E() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // H0.o
    public float a() {
        return this.layout.e();
    }

    @Override // H0.o
    public float b() {
        return U0.b.l(this.constraints);
    }

    @Override // H0.o
    public float c() {
        return this.paragraphIntrinsics.c();
    }

    @Override // H0.o
    public void d(long range, float[] array, int arrayStart) {
        this.layout.a(H.j(range), H.i(range), array, arrayStart);
    }

    @Override // H0.o
    public R0.h e(int offset) {
        return this.layout.x(this.layout.p(offset)) == 1 ? R0.h.Ltr : R0.h.Rtl;
    }

    @Override // H0.o
    public float f(int lineIndex) {
        return this.layout.v(lineIndex);
    }

    @Override // H0.o
    public float g() {
        return C(s() - 1);
    }

    @Override // H0.o
    public C3478i h(int offset) {
        if (offset >= 0 && offset <= this.charSequence.length()) {
            float fZ = Z.z(this.layout, offset, false, 2, null);
            int iP = this.layout.p(offset);
            return new C3478i(fZ, this.layout.v(iP), fZ, this.layout.k(iP));
        }
        throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ']').toString());
    }

    @Override // H0.o
    public int i(int offset) {
        return this.layout.p(offset);
    }

    @Override // H0.o
    public float j() {
        return C(0);
    }

    @Override // H0.o
    public void k(InterfaceC3586l0 canvas, AbstractC3582j0 brush, float alpha, Shadow shadow, R0.j textDecoration, k0.g drawStyle, int blendMode) {
        int backingBlendMode = E().getBackingBlendMode();
        O0.g gVarE = E();
        gVarE.e(brush, C3483n.a(b(), a()), alpha);
        gVarE.h(shadow);
        gVarE.i(textDecoration);
        gVarE.g(drawStyle);
        gVarE.d(blendMode);
        G(canvas);
        E().d(backingBlendMode);
    }

    @Override // H0.o
    public R0.h l(int offset) {
        return this.layout.F(offset) ? R0.h.Rtl : R0.h.Ltr;
    }

    @Override // H0.o
    public float m(int lineIndex) {
        return this.layout.k(lineIndex);
    }

    @Override // H0.o
    public C3478i o(int offset) {
        if (offset >= 0 && offset < this.charSequence.length()) {
            RectF rectFB = this.layout.b(offset);
            return new C3478i(rectFB.left, rectFB.top, rectFB.right, rectFB.bottom);
        }
        throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ')').toString());
    }

    @Override // H0.o
    public List<C3478i> p() {
        return this.placeholderRects;
    }

    @Override // H0.o
    public int q(int lineIndex) {
        return this.layout.u(lineIndex);
    }

    @Override // H0.o
    public int r(int lineIndex, boolean visibleEnd) {
        return visibleEnd ? this.layout.w(lineIndex) : this.layout.o(lineIndex);
    }

    @Override // H0.o
    public int s() {
        return this.layout.getLineCount();
    }

    @Override // H0.o
    public float t(int lineIndex) {
        return this.layout.t(lineIndex);
    }

    @Override // H0.o
    public void u(InterfaceC3586l0 canvas, long color, Shadow shadow, R0.j textDecoration, k0.g drawStyle, int blendMode) {
        int backingBlendMode = E().getBackingBlendMode();
        O0.g gVarE = E();
        gVarE.f(color);
        gVarE.h(shadow);
        gVarE.i(textDecoration);
        gVarE.g(drawStyle);
        gVarE.d(blendMode);
        G(canvas);
        E().d(backingBlendMode);
    }

    @Override // H0.o
    public boolean w() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // H0.o
    public int x(float vertical) {
        return this.layout.q((int) vertical);
    }

    @Override // H0.o
    public R0 y(int start, int end) {
        if (start >= 0 && start <= end && end <= this.charSequence.length()) {
            Path path = new Path();
            this.layout.C(start, end, path);
            return C3561Y.c(path);
        }
        throw new IllegalArgumentException(("start(" + start + ") or end(" + end + ") is out of range [0.." + this.charSequence.length() + "], or start > end!").toString());
    }

    @Override // H0.o
    public float z(int lineIndex) {
        return this.layout.s(lineIndex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C1057a(O0.d dVar, int i10, boolean z10, long j10) {
        List<C3478i> listM;
        C3478i c3478i;
        float fB;
        float fJ;
        int iB;
        float fV;
        float fB2;
        float fJ2;
        this.paragraphIntrinsics = dVar;
        this.maxLines = i10;
        this.ellipsis = z10;
        this.constraints = j10;
        if (U0.b.m(j10) != 0 || U0.b.n(j10) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        TextStyle style = dVar.getStyle();
        this.charSequence = C1058b.k(style, z10) ? C1058b.i(dVar.getCharSequence()) : dVar.getCharSequence();
        int iL = C1058b.l(style.z());
        boolean zK = R0.i.k(style.z(), R0.i.INSTANCE.c());
        int iN = C1058b.n(style.v().getHyphens());
        int iM = C1058b.m(R0.e.e(style.r()));
        int iO = C1058b.o(R0.e.f(style.r()));
        int iP = C1058b.p(R0.e.g(style.r()));
        TextUtils.TruncateAt truncateAt = z10 ? TextUtils.TruncateAt.END : null;
        Z zA = A(iL, zK ? 1 : 0, truncateAt, i10, iN, iM, iO, iP);
        if (!z10 || zA.e() <= U0.b.k(j10) || i10 <= 1) {
            this.layout = zA;
        } else {
            int iJ = C1058b.j(zA, U0.b.k(j10));
            if (iJ >= 0 && iJ != i10) {
                zA = A(iL, zK ? 1 : 0, truncateAt, Ha.g.d(iJ, 1), iN, iM, iO, iP);
            }
            this.layout = zA;
        }
        E().e(style.g(), C3483n.a(b(), a()), style.d());
        Q0.b[] bVarArrD = D(this.layout);
        if (bVarArrD != null) {
            Iterator itA = C3846c.a(bVarArrD);
            while (itA.hasNext()) {
                ((Q0.b) itA.next()).c(C3483n.a(b(), a()));
            }
        }
        CharSequence charSequence = this.charSequence;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Object[] spans = spanned.getSpans(0, charSequence.length(), J0.j.class);
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj : spans) {
                J0.j jVar = (J0.j) obj;
                int spanStart = spanned.getSpanStart(jVar);
                int spanEnd = spanned.getSpanEnd(jVar);
                int iP2 = this.layout.p(spanStart);
                byte b10 = iP2 >= this.maxLines;
                byte b11 = this.layout.m(iP2) > 0 && spanEnd > this.layout.n(iP2);
                byte b12 = spanEnd > this.layout.o(iP2);
                if (b11 == true || b12 == true || b10 == true) {
                    c3478i = null;
                } else {
                    int i11 = C0097a.f5359a[l(spanStart).ordinal()];
                    if (i11 == 1) {
                        fB = B(spanStart, true);
                    } else {
                        if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fB = B(spanStart, true) - jVar.d();
                    }
                    float fD = jVar.d() + fB;
                    Z z11 = this.layout;
                    switch (jVar.getVerticalAlign()) {
                        case 0:
                            fJ = z11.j(iP2);
                            iB = jVar.b();
                            fV = fJ - iB;
                            c3478i = new C3478i(fB, fV, fD, jVar.b() + fV);
                            break;
                        case 1:
                            fV = z11.v(iP2);
                            c3478i = new C3478i(fB, fV, fD, jVar.b() + fV);
                            break;
                        case 2:
                            fJ = z11.k(iP2);
                            iB = jVar.b();
                            fV = fJ - iB;
                            c3478i = new C3478i(fB, fV, fD, jVar.b() + fV);
                            break;
                        case 3:
                            fV = ((z11.v(iP2) + z11.k(iP2)) - jVar.b()) / 2;
                            c3478i = new C3478i(fB, fV, fD, jVar.b() + fV);
                            break;
                        case 4:
                            fB2 = jVar.a().ascent;
                            fJ2 = z11.j(iP2);
                            fV = fB2 + fJ2;
                            c3478i = new C3478i(fB, fV, fD, jVar.b() + fV);
                            break;
                        case 5:
                            fV = (jVar.a().descent + z11.j(iP2)) - jVar.b();
                            c3478i = new C3478i(fB, fV, fD, jVar.b() + fV);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetricsIntA = jVar.a();
                            fB2 = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - jVar.b()) / 2;
                            fJ2 = z11.j(iP2);
                            fV = fB2 + fJ2;
                            c3478i = new C3478i(fB, fV, fD, jVar.b() + fV);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(c3478i);
            }
            listM = arrayList;
        } else {
            listM = kotlin.collections.r.m();
        }
        this.placeholderRects = listM;
    }
}
