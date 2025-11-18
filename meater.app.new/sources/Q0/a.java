package Q0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import i0.C3558V;
import i0.S0;
import i0.e1;
import i0.f1;
import k0.Stroke;
import k0.g;
import k0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: DrawStyleSpan.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"LQ0/a;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lk0/g;", "drawStyle", "<init>", "(Lk0/g;)V", "Li0/f1;", "Landroid/graphics/Paint$Join;", "b", "(I)Landroid/graphics/Paint$Join;", "Li0/e1;", "Landroid/graphics/Paint$Cap;", "a", "(I)Landroid/graphics/Paint$Cap;", "Landroid/text/TextPaint;", "textPaint", "Loa/F;", "updateDrawState", "(Landroid/text/TextPaint;)V", "Lk0/g;", "getDrawStyle", "()Lk0/g;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g drawStyle;

    public a(g gVar) {
        this.drawStyle = gVar;
    }

    private final Paint.Cap a(int i10) {
        e1.Companion companion = e1.INSTANCE;
        return e1.e(i10, companion.a()) ? Paint.Cap.BUTT : e1.e(i10, companion.b()) ? Paint.Cap.ROUND : e1.e(i10, companion.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    private final Paint.Join b(int i10) {
        f1.Companion companion = f1.INSTANCE;
        return f1.e(i10, companion.b()) ? Paint.Join.MITER : f1.e(i10, companion.c()) ? Paint.Join.ROUND : f1.e(i10, companion.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = this.drawStyle;
            if (C3862t.b(gVar, j.f43725a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (gVar instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
                textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
                textPaint.setStrokeJoin(b(((Stroke) this.drawStyle).getJoin()));
                textPaint.setStrokeCap(a(((Stroke) this.drawStyle).getCap()));
                S0 pathEffect = ((Stroke) this.drawStyle).getPathEffect();
                textPaint.setPathEffect(pathEffect != null ? C3558V.a(pathEffect) : null);
            }
        }
    }
}
