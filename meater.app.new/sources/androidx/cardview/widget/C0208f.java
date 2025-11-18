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
/* renamed from: androidx.cardview.widget.f */
/* loaded from: classes.dex */
class C0208f extends Drawable {

    /* renamed from: a */
    private float f1361a;

    /* renamed from: c */
    private final RectF f1363c;

    /* renamed from: d */
    private final Rect f1364d;

    /* renamed from: e */
    private float f1365e;

    /* renamed from: h */
    private ColorStateList f1368h;

    /* renamed from: i */
    private PorterDuffColorFilter f1369i;

    /* renamed from: j */
    private ColorStateList f1370j;

    /* renamed from: f */
    private boolean f1366f = false;

    /* renamed from: g */
    private boolean f1367g = true;

    /* renamed from: k */
    private PorterDuff.Mode f1371k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f1362b = new Paint(5);

    C0208f(ColorStateList colorStateList, float f2) {
        this.f1361a = f2;
        m1282e(colorStateList);
        this.f1363c = new RectF();
        this.f1364d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m1281a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m1282e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1368h = colorStateList;
        this.f1362b.setColor(colorStateList.getColorForState(getState(), this.f1368h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m1283i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1363c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1364d.set(rect);
        if (this.f1366f) {
            this.f1364d.inset((int) Math.ceil(C0209g.m1292c(this.f1365e, this.f1361a, this.f1367g)), (int) Math.ceil(C0209g.m1293d(this.f1365e, this.f1361a, this.f1367g)));
            this.f1363c.set(this.f1364d);
        }
    }

    /* renamed from: b */
    public ColorStateList m1284b() {
        return this.f1368h;
    }

    /* renamed from: c */
    float m1285c() {
        return this.f1365e;
    }

    /* renamed from: d */
    public float m1286d() {
        return this.f1361a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1362b;
        if (this.f1369i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1369i);
            z = true;
        }
        RectF rectF = this.f1363c;
        float f2 = this.f1361a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: f */
    public void m1287f(ColorStateList colorStateList) {
        m1282e(colorStateList);
        invalidateSelf();
    }

    /* renamed from: g */
    void m1288g(float f2, boolean z, boolean z2) {
        if (f2 == this.f1365e && this.f1366f == z && this.f1367g == z2) {
            return;
        }
        this.f1365e = f2;
        this.f1366f = z;
        this.f1367g = z2;
        m1283i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1364d, this.f1361a);
    }

    /* renamed from: h */
    void m1289h(float f2) {
        if (f2 == this.f1361a) {
            return;
        }
        this.f1361a = f2;
        m1283i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1370j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1368h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1283i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1368h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1362b.getColor();
        if (z) {
            this.f1362b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1370j;
        if (colorStateList2 == null || (mode = this.f1371k) == null) {
            return z;
        }
        this.f1369i = m1281a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f1362b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1362b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1370j = colorStateList;
        this.f1369i = m1281a(colorStateList, this.f1371k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1371k = mode;
        this.f1369i = m1281a(this.f1370j, mode);
        invalidateSelf();
    }
}
