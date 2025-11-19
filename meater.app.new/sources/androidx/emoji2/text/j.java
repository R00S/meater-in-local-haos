package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: EmojiSpan.java */
/* loaded from: classes.dex */
public abstract class j extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    private final p f25253b;

    /* renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f25252a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    private short f25254c = -1;

    /* renamed from: d, reason: collision with root package name */
    private short f25255d = -1;

    /* renamed from: e, reason: collision with root package name */
    private float f25256e = 1.0f;

    j(p pVar) {
        r1.i.h(pVar, "rasterizer cannot be null");
        this.f25253b = pVar;
    }

    public final p a() {
        return this.f25253b;
    }

    final int b() {
        return this.f25254c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f25252a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f25252a;
        this.f25256e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f25253b.e();
        this.f25255d = (short) (this.f25253b.e() * this.f25256e);
        short sI = (short) (this.f25253b.i() * this.f25256e);
        this.f25254c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f25252a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
