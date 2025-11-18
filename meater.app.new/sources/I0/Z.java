package I0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TextLayout.android.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b'\u0010!J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b(\u0010!J\u0015\u0010)\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b+\u0010*J\u0015\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b,\u0010*J\u0015\u0010-\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b-\u0010*J\u0015\u0010.\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b.\u0010*J\u0015\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u0010*J\u001f\u00103\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\b\u0002\u00102\u001a\u00020\u000f¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\b\u0002\u00102\u001a\u00020\u000f¢\u0006\u0004\b5\u00104J\u0015\u00106\u001a\u00020\b2\u0006\u00101\u001a\u00020\b¢\u0006\u0004\b6\u0010*J\u0015\u00107\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\b¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b9\u0010*J%\u0010?\u001a\u00020>2\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b?\u0010@J-\u0010F\u001a\u00020>2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\b2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\b¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020H2\u0006\u00101\u001a\u00020\b¢\u0006\u0004\bI\u0010JJ\u0015\u0010M\u001a\u00020>2\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u000fH\u0000¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bF\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bI\u0010T\u001a\u0004\bU\u0010PR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bV\u0010T\u001a\u0004\bW\u0010PR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\\\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b[\u0010T\u001a\u0004\bV\u0010PR \u0010c\u001a\u00020]8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010^\u0012\u0004\ba\u0010b\u001a\u0004\b_\u0010`R\u0017\u0010g\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bU\u0010d\u001a\u0004\be\u0010fR \u0010j\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b_\u0010d\u0012\u0004\bi\u0010b\u001a\u0004\bh\u0010fR \u0010n\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bk\u0010d\u0012\u0004\bm\u0010b\u001a\u0004\bl\u0010fR\u0014\u0010o\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00107R\u0014\u0010p\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00107R\u0014\u0010q\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010TR\u0016\u0010t\u001a\u0004\u0018\u00010r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010sR\u0014\u0010u\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010dR\u001c\u0010y\u001a\n\u0012\u0004\u0012\u00020w\u0018\u00010v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010xR\u0014\u0010|\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010{R\u0018\u0010\u007f\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010~R\u0016\u0010\u0081\u0001\u001a\u00020}8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bk\u0010\u0080\u0001R\u0014\u0010\u0084\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0012\u0010\u0085\u0001\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b[\u0010f¨\u0006\u0086\u0001"}, d2 = {"LI0/Z;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "LI0/B;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILI0/B;)V", "line", "f", "(I)F", "lineIndex", "s", "t", "v", "k", "j", "r", "u", "(I)I", "o", "w", "n", "m", "vertical", "q", "offset", "upstream", "y", "(IZ)F", "A", "p", "F", "(I)Z", "x", "start", "end", "Landroid/graphics/Path;", "dest", "Loa/F;", "C", "(IILandroid/graphics/Path;)V", "startOffset", "endOffset", "", "array", "arrayStart", "a", "(II[FI)V", "Landroid/graphics/RectF;", "b", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", "G", "(Landroid/graphics/Canvas;)V", "E", "()Z", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "Z", "g", "c", "d", "LI0/B;", "getLayoutIntrinsics", "()LI0/B;", "e", "didExceedMaxLines", "Landroid/text/Layout;", "Landroid/text/Layout;", "h", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "layout", "I", "l", "()I", "lineCount", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "topPadding", "i", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "bottomPadding", "leftPadding", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "lastLineExtra", "", "LJ0/h;", "[LJ0/h;", "lineHeightSpans", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "rect", "LI0/A;", "LI0/A;", "backingLayoutHelper", "()LI0/A;", "layoutHelper", "D", "()Ljava/lang/CharSequence;", "text", "height", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextPaint textPaint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean includePadding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean fallbackLineSpacing;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final B layoutIntrinsics;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Layout layout;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int lineCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int topPadding;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int bottomPadding;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float leftPadding;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float rightPadding;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean isBoringLayout;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Paint.FontMetricsInt lastLineFontMetrics;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int lastLineExtra;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final J0.h[] lineHeightSpans;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Rect rect;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private A backingLayoutHelper;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public Z(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, B b10) {
        boolean z12;
        boolean z13;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        this.textPaint = textPaint;
        this.includePadding = z10;
        this.fallbackLineSpacing = z11;
        this.layoutIntrinsics = b10;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicK = a0.k(i11);
        Layout.Alignment alignmentA = X.f6597a.a(i10);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, J0.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = b10.a();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsA == null || b10.b() > f10 || z14) {
                z12 = true;
                this.isBoringLayout = false;
                z13 = false;
                textDirectionHeuristic = textDirectionHeuristicK;
                layoutA = U.f6573a.a(charSequence, textPaint, iCeil, 0, charSequence.length(), textDirectionHeuristicK, alignmentA, i12, truncateAt, (int) Math.ceil(d10), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                this.isBoringLayout = true;
                z12 = true;
                layoutA = C1168e.f6621a.a(charSequence, textPaint, iCeil, metricsA, alignmentA, z10, z11, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristicK;
                z13 = false;
            }
            this.layout = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i12);
            this.lineCount = iMin;
            int i18 = iMin - 1;
            this.didExceedMaxLines = (iMin >= i12 && (layoutA.getEllipsisCount(i18) > 0 || layoutA.getLineEnd(i18) != charSequence.length())) ? z12 : z13;
            long jL = a0.l(this);
            J0.h[] hVarArrJ = a0.j(this);
            this.lineHeightSpans = hVarArrJ;
            long jI = hVarArrJ != null ? a0.i(hVarArrJ) : a0.f6619b;
            this.topPadding = Math.max(b0.c(jL), b0.c(jI));
            this.bottomPadding = Math.max(b0.b(jL), b0.b(jI));
            Paint.FontMetricsInt fontMetricsIntH = a0.h(this, textPaint, textDirectionHeuristic, hVarArrJ);
            this.lastLineExtra = fontMetricsIntH != null ? fontMetricsIntH.bottom - ((int) r(i18)) : z13;
            this.lastLineFontMetrics = fontMetricsIntH;
            this.leftPadding = J0.d.b(layoutA, i18, null, 2, null);
            this.rightPadding = J0.d.d(layoutA, i18, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static /* synthetic */ float B(Z z10, int i10, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return z10.A(i10, z11);
    }

    private final float f(int line) {
        if (line == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    private final A i() {
        A a10 = this.backingLayoutHelper;
        if (a10 != null) {
            C3862t.d(a10);
            return a10;
        }
        A a11 = new A(this.layout);
        this.backingLayoutHelper = a11;
        return a11;
    }

    public static /* synthetic */ float z(Z z10, int i10, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return z10.y(i10, z11);
    }

    public final float A(int offset, boolean upstream) {
        return i().c(offset, false, upstream) + f(p(offset));
    }

    public final void C(int start, int end, Path dest) {
        this.layout.getSelectionPath(start, end, dest);
        if (this.topPadding == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(0.0f, this.topPadding);
    }

    public final CharSequence D() {
        return this.layout.getText();
    }

    public final boolean E() {
        if (this.isBoringLayout) {
            C1168e c1168e = C1168e.f6621a;
            Layout layout = this.layout;
            C3862t.e(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return c1168e.b((BoringLayout) layout);
        }
        U u10 = U.f6573a;
        Layout layout2 = this.layout;
        C3862t.e(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return u10.c((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean F(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void G(Canvas canvas) {
        if (canvas.getClipBounds(this.rect)) {
            int i10 = this.topPadding;
            if (i10 != 0) {
                canvas.translate(0.0f, i10);
            }
            Y y10 = a0.f6618a;
            y10.a(canvas);
            this.layout.draw(y10);
            int i11 = this.topPadding;
            if (i11 != 0) {
                canvas.translate(0.0f, (-1) * i11);
            }
        }
    }

    public final void a(int startOffset, int endOffset, float[] array, int arrayStart) {
        float fD;
        float fE;
        int length = D().length();
        if (startOffset < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        }
        if (startOffset >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        }
        if (endOffset <= startOffset) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (endOffset > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (array.length - arrayStart < (endOffset - startOffset) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iP = p(startOffset);
        int iP2 = p(endOffset - 1);
        C1186x c1186x = new C1186x(this);
        if (iP > iP2) {
            return;
        }
        while (true) {
            int iU = u(iP);
            int iO = o(iP);
            int iMin = Math.min(endOffset, iO);
            float fV = v(iP);
            float fK = k(iP);
            boolean z10 = x(iP) == 1;
            for (int iMax = Math.max(startOffset, iU); iMax < iMin; iMax++) {
                boolean zF = F(iMax);
                if (z10 && !zF) {
                    fD = c1186x.b(iMax);
                    fE = c1186x.c(iMax + 1);
                } else if (z10 && zF) {
                    fE = c1186x.d(iMax);
                    fD = c1186x.e(iMax + 1);
                } else if (z10 || !zF) {
                    fD = c1186x.d(iMax);
                    fE = c1186x.e(iMax + 1);
                } else {
                    fE = c1186x.b(iMax);
                    fD = c1186x.c(iMax + 1);
                }
                array[arrayStart] = fD;
                array[arrayStart + 1] = fV;
                array[arrayStart + 2] = fE;
                array[arrayStart + 3] = fK;
                arrayStart += 4;
            }
            if (iP == iP2) {
                return;
            } else {
                iP++;
            }
        }
    }

    public final RectF b(int offset) {
        float fA;
        float fA2;
        float fY;
        float fY2;
        int iP = p(offset);
        float fV = v(iP);
        float fK = k(iP);
        boolean z10 = x(iP) == 1;
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(offset);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fY = A(offset, false);
                fY2 = A(offset + 1, true);
            } else if (zIsRtlCharAt) {
                fY = y(offset, false);
                fY2 = y(offset + 1, true);
            } else {
                fA = A(offset, false);
                fA2 = A(offset + 1, true);
            }
            float f10 = fY;
            fA = fY2;
            fA2 = f10;
        } else {
            fA = y(offset, false);
            fA2 = y(offset + 1, true);
        }
        return new RectF(fA, fV, fA2, fK);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int e() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    /* renamed from: h, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    public final float j(int line) {
        return this.topPadding + ((line != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(line) : v(line) - this.lastLineFontMetrics.ascent);
    }

    public final float k(int line) {
        if (line != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(line - 1) + this.lastLineFontMetrics.bottom;
    }

    /* renamed from: l, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int m(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int n(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int o(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex) == 0 ? this.layout.getLineEnd(lineIndex) : this.layout.getText().length();
    }

    public final int p(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int q(int vertical) {
        return this.layout.getLineForVertical(vertical - this.topPadding);
    }

    public final float r(int lineIndex) {
        return k(lineIndex) - v(lineIndex);
    }

    public final float s(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float t(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final int u(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float v(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final int w(int lineIndex) {
        if (this.layout.getEllipsisStart(lineIndex) == 0) {
            return i().d(lineIndex);
        }
        return this.layout.getEllipsisStart(lineIndex) + this.layout.getLineStart(lineIndex);
    }

    public final int x(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final float y(int offset, boolean upstream) {
        return i().c(offset, true, upstream) + f(p(offset));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Z(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, B b10, int i18, C3854k c3854k) {
        int i19 = (i18 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i18 & 16) != 0 ? null : truncateAt;
        int i20 = (i18 & 32) != 0 ? 2 : i11;
        this(charSequence, f10, textPaint, i19, truncateAt2, i20, (i18 & 64) != 0 ? 1.0f : f11, (i18 & 128) != 0 ? 0.0f : f12, (i18 & 256) != 0 ? false : z10, (i18 & 512) != 0 ? true : z11, (i18 & 1024) != 0 ? Integer.MAX_VALUE : i12, (i18 & 2048) != 0 ? 0 : i13, (i18 & 4096) != 0 ? 0 : i14, (i18 & 8192) != 0 ? 0 : i15, (i18 & 16384) != 0 ? 0 : i16, (32768 & i18) != 0 ? 0 : i17, (65536 & i18) != 0 ? null : iArr, (131072 & i18) != 0 ? null : iArr2, (i18 & 262144) != 0 ? new B(charSequence, textPaint, i20) : b10);
    }
}
