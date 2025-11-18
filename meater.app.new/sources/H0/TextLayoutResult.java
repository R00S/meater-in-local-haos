package H0;

import h0.C3478i;
import i0.R0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TextLayoutResult.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0014J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\rJ\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b$\u0010#J\u001d\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n¢\u0006\u0004\b(\u0010)J$\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010;\u001a\u0004\b<\u0010=R\u0017\u0010A\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\"\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010C\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b$\u0010>\u001a\u0004\bB\u0010@R\u001f\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0011\u0010K\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bE\u0010JR\u0011\u0010M\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0011\u0010O\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bN\u0010JR\u0011\u0010Q\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bP\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, d2 = {"LH0/F;", "", "LH0/E;", "layoutInput", "LH0/j;", "multiParagraph", "LU0/r;", "size", "<init>", "(LH0/E;LH0/j;JLkotlin/jvm/internal/k;)V", "", "lineIndex", "t", "(I)I", "", "visibleEnd", "n", "(IZ)I", "", "u", "(I)F", "l", "r", "s", "offset", "p", "vertical", "q", "(F)I", "LR0/h;", "w", "(I)LR0/h;", "c", "Lh0/i;", "d", "(I)Lh0/i;", "e", "start", "end", "Li0/R0;", "x", "(II)Li0/R0;", "a", "(LH0/E;J)LH0/F;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "LH0/E;", "k", "()LH0/E;", "b", "LH0/j;", "v", "()LH0/j;", "J", "z", "()J", "F", "h", "()F", "firstBaseline", "j", "lastBaseline", "", "f", "Ljava/util/List;", "y", "()Ljava/util/List;", "placeholderRects", "()Z", "didOverflowHeight", "g", "didOverflowWidth", "i", "hasVisualOverflow", "m", "lineCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.F, reason: from toString */
/* loaded from: classes.dex */
public final class TextLayoutResult {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextLayoutInput layoutInput;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final C1066j multiParagraph;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long size;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float firstBaseline;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float lastBaseline;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<C3478i> placeholderRects;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, C1066j c1066j, long j10, C3854k c3854k) {
        this(textLayoutInput, c1066j, j10);
    }

    public static /* synthetic */ TextLayoutResult b(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i10 & 2) != 0) {
            j10 = textLayoutResult.size;
        }
        return textLayoutResult.a(textLayoutInput, j10);
    }

    public static /* synthetic */ int o(TextLayoutResult textLayoutResult, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayoutResult.n(i10, z10);
    }

    public final TextLayoutResult a(TextLayoutInput layoutInput, long size) {
        return new TextLayoutResult(layoutInput, this.multiParagraph, size, null);
    }

    public final R0.h c(int offset) {
        return this.multiParagraph.c(offset);
    }

    public final C3478i d(int offset) {
        return this.multiParagraph.d(offset);
    }

    public final C3478i e(int offset) {
        return this.multiParagraph.e(offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) other;
        return C3862t.b(this.layoutInput, textLayoutResult.layoutInput) && C3862t.b(this.multiParagraph, textLayoutResult.multiParagraph) && U0.r.e(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && C3862t.b(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    public final boolean f() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) U0.r.f(this.size)) < this.multiParagraph.getHeight();
    }

    public final boolean g() {
        return ((float) U0.r.g(this.size)) < this.multiParagraph.getWidth();
    }

    /* renamed from: h, reason: from getter */
    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + U0.r.h(this.size)) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    /* renamed from: j, reason: from getter */
    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    /* renamed from: k, reason: from getter */
    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float l(int lineIndex) {
        return this.multiParagraph.k(lineIndex);
    }

    public final int m() {
        return this.multiParagraph.getLineCount();
    }

    public final int n(int lineIndex, boolean visibleEnd) {
        return this.multiParagraph.m(lineIndex, visibleEnd);
    }

    public final int p(int offset) {
        return this.multiParagraph.n(offset);
    }

    public final int q(float vertical) {
        return this.multiParagraph.o(vertical);
    }

    public final float r(int lineIndex) {
        return this.multiParagraph.p(lineIndex);
    }

    public final float s(int lineIndex) {
        return this.multiParagraph.q(lineIndex);
    }

    public final int t(int lineIndex) {
        return this.multiParagraph.r(lineIndex);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) U0.r.i(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    public final float u(int lineIndex) {
        return this.multiParagraph.s(lineIndex);
    }

    /* renamed from: v, reason: from getter */
    public final C1066j getMultiParagraph() {
        return this.multiParagraph;
    }

    public final R0.h w(int offset) {
        return this.multiParagraph.t(offset);
    }

    public final R0 x(int start, int end) {
        return this.multiParagraph.v(start, end);
    }

    public final List<C3478i> y() {
        return this.placeholderRects;
    }

    /* renamed from: z, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, C1066j c1066j, long j10) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = c1066j;
        this.size = j10;
        this.firstBaseline = c1066j.g();
        this.lastBaseline = c1066j.j();
        this.placeholderRects = c1066j.w();
    }
}
