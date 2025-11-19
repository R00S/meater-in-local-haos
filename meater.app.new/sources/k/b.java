package k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import k1.C3784a;

/* compiled from: DrawerArrowDrawable.java */
/* loaded from: classes.dex */
public class b extends Drawable {

    /* renamed from: m, reason: collision with root package name */
    private static final float f43695m = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    private final Paint f43696a;

    /* renamed from: b, reason: collision with root package name */
    private float f43697b;

    /* renamed from: c, reason: collision with root package name */
    private float f43698c;

    /* renamed from: d, reason: collision with root package name */
    private float f43699d;

    /* renamed from: e, reason: collision with root package name */
    private float f43700e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f43701f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f43702g;

    /* renamed from: h, reason: collision with root package name */
    private final int f43703h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f43704i;

    /* renamed from: j, reason: collision with root package name */
    private float f43705j;

    /* renamed from: k, reason: collision with root package name */
    private float f43706k;

    /* renamed from: l, reason: collision with root package name */
    private int f43707l;

    private static float a(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f43707l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? C3784a.f(this) == 0 : C3784a.f(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f43697b;
        float fA = a(this.f43698c, (float) Math.sqrt(f10 * f10 * 2.0f), this.f43705j);
        float fA2 = a(this.f43698c, this.f43699d, this.f43705j);
        float fRound = Math.round(a(0.0f, this.f43706k, this.f43705j));
        float fA3 = a(0.0f, f43695m, this.f43705j);
        float fA4 = a(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f43705j);
        double d10 = fA;
        double d11 = fA3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(d10 * Math.sin(d11));
        this.f43702g.rewind();
        float fA5 = a(this.f43700e + this.f43696a.getStrokeWidth(), -this.f43706k, this.f43705j);
        float f11 = (-fA2) / 2.0f;
        this.f43702g.moveTo(f11 + fRound, 0.0f);
        this.f43702g.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        this.f43702g.moveTo(f11, fA5);
        this.f43702g.rLineTo(fRound2, fRound3);
        this.f43702g.moveTo(f11, -fA5);
        this.f43702g.rLineTo(fRound2, -fRound3);
        this.f43702g.close();
        canvas.save();
        float strokeWidth = this.f43696a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f43700e);
        if (this.f43701f) {
            canvas.rotate(fA4 * (this.f43704i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f43702g, this.f43696a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f43703h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f43703h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f43696a.getAlpha()) {
            this.f43696a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f43696a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f10) {
        if (this.f43705j != f10) {
            this.f43705j = f10;
            invalidateSelf();
        }
    }
}
