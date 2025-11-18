package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p024c.p040d.C0863b;
import p024c.p040d.C0864c;

/* compiled from: RoundRectDrawableWithShadow.java */
/* renamed from: androidx.cardview.widget.g */
/* loaded from: classes.dex */
class C0209g extends Drawable {

    /* renamed from: a */
    private static final double f1372a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    static a f1373b;

    /* renamed from: c */
    private final int f1374c;

    /* renamed from: e */
    private Paint f1376e;

    /* renamed from: f */
    private Paint f1377f;

    /* renamed from: g */
    private final RectF f1378g;

    /* renamed from: h */
    private float f1379h;

    /* renamed from: i */
    private Path f1380i;

    /* renamed from: j */
    private float f1381j;

    /* renamed from: k */
    private float f1382k;

    /* renamed from: l */
    private float f1383l;

    /* renamed from: m */
    private ColorStateList f1384m;

    /* renamed from: o */
    private final int f1386o;

    /* renamed from: p */
    private final int f1387p;

    /* renamed from: n */
    private boolean f1385n = true;

    /* renamed from: q */
    private boolean f1388q = true;

    /* renamed from: r */
    private boolean f1389r = false;

    /* renamed from: d */
    private Paint f1375d = new Paint(5);

    /* compiled from: RoundRectDrawableWithShadow.java */
    /* renamed from: androidx.cardview.widget.g$a */
    interface a {
        /* renamed from: a */
        void mo1263a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    C0209g(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.f1386o = resources.getColor(C0863b.f5691d);
        this.f1387p = resources.getColor(C0863b.f5690c);
        this.f1374c = resources.getDimensionPixelSize(C0864c.f5692a);
        m1295n(colorStateList);
        Paint paint = new Paint(5);
        this.f1376e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1379h = (int) (f2 + 0.5f);
        this.f1378g = new RectF();
        Paint paint2 = new Paint(this.f1376e);
        this.f1377f = paint2;
        paint2.setAntiAlias(false);
        m1296s(f3, f4);
    }

    /* renamed from: a */
    private void m1290a(Rect rect) {
        float f2 = this.f1381j;
        float f3 = 1.5f * f2;
        this.f1378g.set(rect.left + f2, rect.top + f3, rect.right - f2, rect.bottom - f3);
        m1291b();
    }

    /* renamed from: b */
    private void m1291b() {
        float f2 = this.f1379h;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.f1382k;
        rectF2.inset(-f3, -f3);
        Path path = this.f1380i;
        if (path == null) {
            this.f1380i = new Path();
        } else {
            path.reset();
        }
        this.f1380i.setFillType(Path.FillType.EVEN_ODD);
        this.f1380i.moveTo(-this.f1379h, 0.0f);
        this.f1380i.rLineTo(-this.f1382k, 0.0f);
        this.f1380i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1380i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1380i.close();
        float f4 = this.f1379h;
        float f5 = f4 / (this.f1382k + f4);
        Paint paint = this.f1376e;
        float f6 = this.f1379h + this.f1382k;
        int i2 = this.f1386o;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.f1387p}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1377f;
        float f7 = this.f1379h;
        float f8 = this.f1382k;
        int i3 = this.f1386o;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i3, i3, this.f1387p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1377f.setAntiAlias(false);
    }

    /* renamed from: c */
    static float m1292c(float f2, float f3, boolean z) {
        if (!z) {
            return f2;
        }
        double d2 = f2;
        double d3 = 1.0d - f1372a;
        double d4 = f3;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    /* renamed from: d */
    static float m1293d(float f2, float f3, boolean z) {
        if (!z) {
            return f2 * 1.5f;
        }
        double d2 = f2 * 1.5f;
        double d3 = 1.0d - f1372a;
        double d4 = f3;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    /* renamed from: e */
    private void m1294e(Canvas canvas) {
        float f2 = this.f1379h;
        float f3 = (-f2) - this.f1382k;
        float f4 = f2 + this.f1374c + (this.f1383l / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.f1378g.width() - f5 > 0.0f;
        boolean z2 = this.f1378g.height() - f5 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.f1378g;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.f1380i, this.f1376e);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f1378g.width() - f5, -this.f1379h, this.f1377f);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        RectF rectF2 = this.f1378g;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1380i, this.f1376e);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f1378g.width() - f5, (-this.f1379h) + this.f1382k, this.f1377f);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF3 = this.f1378g;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1380i, this.f1376e);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f1378g.height() - f5, -this.f1379h, this.f1377f);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF4 = this.f1378g;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1380i, this.f1376e);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f1378g.height() - f5, -this.f1379h, this.f1377f);
        }
        canvas.restoreToCount(iSave4);
    }

    /* renamed from: n */
    private void m1295n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1384m = colorStateList;
        this.f1375d.setColor(colorStateList.getColorForState(getState(), this.f1384m.getDefaultColor()));
    }

    /* renamed from: s */
    private void m1296s(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        }
        float fM1297t = m1297t(f2);
        float fM1297t2 = m1297t(f3);
        if (fM1297t > fM1297t2) {
            if (!this.f1389r) {
                this.f1389r = true;
            }
            fM1297t = fM1297t2;
        }
        if (this.f1383l == fM1297t && this.f1381j == fM1297t2) {
            return;
        }
        this.f1383l = fM1297t;
        this.f1381j = fM1297t2;
        this.f1382k = (int) ((fM1297t * 1.5f) + this.f1374c + 0.5f);
        this.f1385n = true;
        invalidateSelf();
    }

    /* renamed from: t */
    private int m1297t(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1385n) {
            m1290a(getBounds());
            this.f1385n = false;
        }
        canvas.translate(0.0f, this.f1383l / 2.0f);
        m1294e(canvas);
        canvas.translate(0.0f, (-this.f1383l) / 2.0f);
        f1373b.mo1263a(canvas, this.f1378g, this.f1379h, this.f1375d);
    }

    /* renamed from: f */
    ColorStateList m1298f() {
        return this.f1384m;
    }

    /* renamed from: g */
    float m1299g() {
        return this.f1379h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(m1293d(this.f1381j, this.f1379h, this.f1388q));
        int iCeil2 = (int) Math.ceil(m1292c(this.f1381j, this.f1379h, this.f1388q));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    /* renamed from: h */
    void m1300h(Rect rect) {
        getPadding(rect);
    }

    /* renamed from: i */
    float m1301i() {
        return this.f1381j;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1384m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* renamed from: j */
    float m1302j() {
        float f2 = this.f1381j;
        return (Math.max(f2, this.f1379h + this.f1374c + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.f1381j * 1.5f) + this.f1374c) * 2.0f);
    }

    /* renamed from: k */
    float m1303k() {
        float f2 = this.f1381j;
        return (Math.max(f2, this.f1379h + this.f1374c + (f2 / 2.0f)) * 2.0f) + ((this.f1381j + this.f1374c) * 2.0f);
    }

    /* renamed from: l */
    float m1304l() {
        return this.f1383l;
    }

    /* renamed from: m */
    void m1305m(boolean z) {
        this.f1388q = z;
        invalidateSelf();
    }

    /* renamed from: o */
    void m1306o(ColorStateList colorStateList) {
        m1295n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1385n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1384m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1375d.getColor() == colorForState) {
            return false;
        }
        this.f1375d.setColor(colorForState);
        this.f1385n = true;
        invalidateSelf();
        return true;
    }

    /* renamed from: p */
    void m1307p(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
        }
        float f3 = (int) (f2 + 0.5f);
        if (this.f1379h == f3) {
            return;
        }
        this.f1379h = f3;
        this.f1385n = true;
        invalidateSelf();
    }

    /* renamed from: q */
    void m1308q(float f2) {
        m1296s(this.f1383l, f2);
    }

    /* renamed from: r */
    void m1309r(float f2) {
        m1296s(f2, this.f1381j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f1375d.setAlpha(i2);
        this.f1376e.setAlpha(i2);
        this.f1377f.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1375d.setColorFilter(colorFilter);
    }
}
