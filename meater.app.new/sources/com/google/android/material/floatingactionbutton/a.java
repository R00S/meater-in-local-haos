package com.google.android.material.floatingactionbutton;

import X7.k;
import X7.l;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.material.drawable.d;
import j1.C3718c;

/* compiled from: BorderDrawable.java */
/* loaded from: classes2.dex */
class a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    private final Paint f36565b;

    /* renamed from: h, reason: collision with root package name */
    float f36571h;

    /* renamed from: i, reason: collision with root package name */
    private int f36572i;

    /* renamed from: j, reason: collision with root package name */
    private int f36573j;

    /* renamed from: k, reason: collision with root package name */
    private int f36574k;

    /* renamed from: l, reason: collision with root package name */
    private int f36575l;

    /* renamed from: m, reason: collision with root package name */
    private int f36576m;

    /* renamed from: o, reason: collision with root package name */
    private k f36578o;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f36579p;

    /* renamed from: a, reason: collision with root package name */
    private final l f36564a = l.k();

    /* renamed from: c, reason: collision with root package name */
    private final Path f36566c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final Rect f36567d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final RectF f36568e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    private final RectF f36569f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final b f36570g = new b();

    /* renamed from: n, reason: collision with root package name */
    private boolean f36577n = true;

    /* compiled from: BorderDrawable.java */
    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return a.this;
        }
    }

    a(k kVar) {
        this.f36578o = kVar;
        Paint paint = new Paint(1);
        this.f36565b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        copyBounds(this.f36567d);
        float fHeight = this.f36571h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{C3718c.g(this.f36572i, this.f36576m), C3718c.g(this.f36573j, this.f36576m), C3718c.g(C3718c.k(this.f36573j, 0), this.f36576m), C3718c.g(C3718c.k(this.f36575l, 0), this.f36576m), C3718c.g(this.f36575l, this.f36576m), C3718c.g(this.f36574k, this.f36576m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    protected RectF b() {
        this.f36569f.set(getBounds());
        return this.f36569f;
    }

    void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f36576m = colorStateList.getColorForState(getState(), this.f36576m);
        }
        this.f36579p = colorStateList;
        this.f36577n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f36571h != f10) {
            this.f36571h = f10;
            this.f36565b.setStrokeWidth(f10 * 1.3333f);
            this.f36577n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f36577n) {
            this.f36565b.setShader(a());
            this.f36577n = false;
        }
        float strokeWidth = this.f36565b.getStrokeWidth() / 2.0f;
        copyBounds(this.f36567d);
        this.f36568e.set(this.f36567d);
        float fMin = Math.min(this.f36578o.r().a(b()), this.f36568e.width() / 2.0f);
        if (this.f36578o.u(b())) {
            this.f36568e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f36568e, fMin, fMin, this.f36565b);
        }
    }

    void e(int i10, int i11, int i12, int i13) {
        this.f36572i = i10;
        this.f36573j = i11;
        this.f36574k = i12;
        this.f36575l = i13;
    }

    public void f(k kVar) {
        this.f36578o = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f36570g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f36571h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f36578o.u(b())) {
            outline.setRoundRect(getBounds(), this.f36578o.r().a(b()));
        } else {
            copyBounds(this.f36567d);
            this.f36568e.set(this.f36567d);
            this.f36564a.e(this.f36578o, 1.0f, this.f36568e, this.f36566c);
            d.j(outline, this.f36566c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f36578o.u(b())) {
            return true;
        }
        int iRound = Math.round(this.f36571h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f36579p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f36577n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f36579p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f36576m)) != this.f36576m) {
            this.f36577n = true;
            this.f36576m = colorForState;
        }
        if (this.f36577n) {
            invalidateSelf();
        }
        return this.f36577n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f36565b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f36565b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
