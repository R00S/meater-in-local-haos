package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: TypefaceEmojiSpan.java */
/* loaded from: classes.dex */
public final class q extends j {

    /* renamed from: g, reason: collision with root package name */
    private static Paint f25286g;

    /* renamed from: f, reason: collision with root package name */
    private TextPaint f25287f;

    public q(p pVar) {
        super(pVar);
    }

    private TextPaint c(CharSequence charSequence, int i10, int i11, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f25287f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f25287f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    private static Paint e() {
        if (f25286g == null) {
            TextPaint textPaint = new TextPaint();
            f25286g = textPaint;
            textPaint.setColor(f.c().d());
            f25286g.setStyle(Paint.Style.FILL);
        }
        return f25286g;
    }

    void d(Canvas canvas, TextPaint textPaint, float f10, float f11, float f12, float f13) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f10, f12, f11, f13, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaintC = c(charSequence, i10, i11, paint2);
        if (textPaintC != null && textPaintC.bgColor != 0) {
            d(canvas, textPaintC, f10, f10 + b(), i12, i14);
        }
        if (f.c().j()) {
            canvas.drawRect(f10, i12, f10 + b(), i14, e());
        }
        p pVarA = a();
        float f11 = i13;
        if (textPaintC != null) {
            paint2 = textPaintC;
        }
        pVarA.a(canvas, f10, f11, paint2);
    }
}
