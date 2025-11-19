package J0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.Metadata;

/* compiled from: LineHeightStyleSpan.android.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001eR\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001eR$\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b\u001f\u0010/R$\u00102\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b \u0010/¨\u00063"}, d2 = {"LJ0/h;", "Landroid/text/style/LineHeightSpan;", "", "lineHeight", "", "startIndex", "endIndex", "", "trimFirstLineTop", "trimLastLineBottom", "topRatio", "<init>", "(FIIZZF)V", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "Loa/F;", "a", "(Landroid/graphics/Paint$FontMetricsInt;)V", "", "text", "start", "end", "spanStartVertical", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "b", "(IIZ)LJ0/h;", "F", "getLineHeight", "()F", "I", "c", "d", "Z", "e", "()Z", "f", "g", "firstAscent", "h", "ascent", "i", "descent", "j", "lastDescent", "<set-?>", "k", "()I", "firstAscentDiff", "l", "lastDescentDiff", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float lineHeight;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int endIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean trimFirstLineTop;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean trimLastLineBottom;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float topRatio;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int firstAscent = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int ascent = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int descent = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int lastDescent = Integer.MIN_VALUE;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int firstAscentDiff;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int lastDescentDiff;

    public h(float f10, int i10, int i11, boolean z10, boolean z11, float f11) {
        this.lineHeight = f10;
        this.startIndex = i10;
        this.endIndex = i11;
        this.trimFirstLineTop = z10;
        this.trimLastLineBottom = z11;
        this.topRatio = f11;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        int iCeil = (int) Math.ceil(this.lineHeight);
        int iA = iCeil - i.a(fontMetricsInt);
        float fAbs = this.topRatio;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / i.a(fontMetricsInt);
        }
        int iCeil2 = (int) (iA <= 0 ? Math.ceil(iA * fAbs) : Math.ceil(iA * (1.0f - fAbs)));
        int i10 = fontMetricsInt.descent;
        int i11 = iCeil2 + i10;
        this.descent = i11;
        int i12 = i11 - iCeil;
        this.ascent = i12;
        if (this.trimFirstLineTop) {
            i12 = fontMetricsInt.ascent;
        }
        this.firstAscent = i12;
        if (this.trimLastLineBottom) {
            i11 = i10;
        }
        this.lastDescent = i11;
        this.firstAscentDiff = fontMetricsInt.ascent - i12;
        this.lastDescentDiff = i11 - i10;
    }

    public final h b(int startIndex, int endIndex, boolean trimFirstLineTop) {
        return new h(this.lineHeight, startIndex, endIndex, trimFirstLineTop, this.trimLastLineBottom, this.topRatio);
    }

    /* renamed from: c, reason: from getter */
    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanStartVertical, int lineHeight, Paint.FontMetricsInt fontMetricsInt) {
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = start == this.startIndex;
        boolean z11 = end == this.endIndex;
        if (z10 && z11 && this.trimFirstLineTop && this.trimLastLineBottom) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z10 ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z11 ? this.lastDescent : this.descent;
    }

    /* renamed from: d, reason: from getter */
    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }
}
