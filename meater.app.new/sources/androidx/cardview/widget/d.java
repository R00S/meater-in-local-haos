package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable.java */
/* loaded from: classes.dex */
class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f21820a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f21822c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f21823d;

    /* renamed from: e, reason: collision with root package name */
    private float f21824e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f21827h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f21828i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f21829j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21825f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21826g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f21830k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f21821b = new Paint(5);

    d(ColorStateList colorStateList, float f10) {
        this.f21820a = f10;
        e(colorStateList);
        this.f21822c = new RectF();
        this.f21823d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f21827h = colorStateList;
        this.f21821b.setColor(colorStateList.getColorForState(getState(), this.f21827h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f21822c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f21823d.set(rect);
        if (this.f21825f) {
            this.f21823d.inset((int) Math.ceil(e.a(this.f21824e, this.f21820a, this.f21826g)), (int) Math.ceil(e.b(this.f21824e, this.f21820a, this.f21826g)));
            this.f21822c.set(this.f21823d);
        }
    }

    public ColorStateList b() {
        return this.f21827h;
    }

    float c() {
        return this.f21824e;
    }

    public float d() {
        return this.f21820a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f21821b;
        if (this.f21828i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f21828i);
            z10 = true;
        }
        RectF rectF = this.f21822c;
        float f10 = this.f21820a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f21824e && this.f21825f == z10 && this.f21826g == z11) {
            return;
        }
        this.f21824e = f10;
        this.f21825f = z10;
        this.f21826g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f21823d, this.f21820a);
    }

    void h(float f10) {
        if (f10 == this.f21820a) {
            return;
        }
        this.f21820a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f21829j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f21827h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f21827h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f21821b.getColor();
        if (z10) {
            this.f21821b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f21829j;
        if (colorStateList2 == null || (mode = this.f21830k) == null) {
            return z10;
        }
        this.f21828i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f21821b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21821b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f21829j = colorStateList;
        this.f21828i = a(colorStateList, this.f21830k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f21830k = mode;
        this.f21828i = a(this.f21829j, mode);
        invalidateSelf();
    }
}
