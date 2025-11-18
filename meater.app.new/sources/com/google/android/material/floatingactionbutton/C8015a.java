package com.google.android.material.floatingactionbutton;

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
import p024c.p052i.p053e.C0923a;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p272a0.C8905l;

/* compiled from: BorderDrawable.java */
/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes2.dex */
class C8015a extends Drawable {

    /* renamed from: b */
    private final Paint f30233b;

    /* renamed from: h */
    float f30239h;

    /* renamed from: i */
    private int f30240i;

    /* renamed from: j */
    private int f30241j;

    /* renamed from: k */
    private int f30242k;

    /* renamed from: l */
    private int f30243l;

    /* renamed from: m */
    private int f30244m;

    /* renamed from: o */
    private C8904k f30246o;

    /* renamed from: p */
    private ColorStateList f30247p;

    /* renamed from: a */
    private final C8905l f30232a = new C8905l();

    /* renamed from: c */
    private final Path f30234c = new Path();

    /* renamed from: d */
    private final Rect f30235d = new Rect();

    /* renamed from: e */
    private final RectF f30236e = new RectF();

    /* renamed from: f */
    private final RectF f30237f = new RectF();

    /* renamed from: g */
    private final b f30238g = new b();

    /* renamed from: n */
    private boolean f30245n = true;

    /* compiled from: BorderDrawable.java */
    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return C8015a.this;
        }
    }

    C8015a(C8904k c8904k) {
        this.f30246o = c8904k;
        Paint paint = new Paint(1);
        this.f30233b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private Shader m24500a() {
        copyBounds(this.f30235d);
        float fHeight = this.f30239h / r0.height();
        return new LinearGradient(0.0f, r0.top, 0.0f, r0.bottom, new int[]{C0923a.m5882j(this.f30240i, this.f30244m), C0923a.m5882j(this.f30241j, this.f30244m), C0923a.m5882j(C0923a.m5887o(this.f30241j, 0), this.f30244m), C0923a.m5882j(C0923a.m5887o(this.f30243l, 0), this.f30244m), C0923a.m5882j(this.f30243l, this.f30244m), C0923a.m5882j(this.f30242k, this.f30244m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: b */
    protected RectF m24501b() {
        this.f30237f.set(getBounds());
        return this.f30237f;
    }

    /* renamed from: c */
    void m24502c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f30244m = colorStateList.getColorForState(getState(), this.f30244m);
        }
        this.f30247p = colorStateList;
        this.f30245n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void m24503d(float f2) {
        if (this.f30239h != f2) {
            this.f30239h = f2;
            this.f30233b.setStrokeWidth(f2 * 1.3333f);
            this.f30245n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f30245n) {
            this.f30233b.setShader(m24500a());
            this.f30245n = false;
        }
        float strokeWidth = this.f30233b.getStrokeWidth() / 2.0f;
        copyBounds(this.f30235d);
        this.f30236e.set(this.f30235d);
        float fMin = Math.min(this.f30246o.m28330r().mo28238a(m24501b()), this.f30236e.width() / 2.0f);
        if (this.f30246o.m28333u(m24501b())) {
            this.f30236e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f30236e, fMin, fMin, this.f30233b);
        }
    }

    /* renamed from: e */
    void m24504e(int i2, int i3, int i4, int i5) {
        this.f30240i = i2;
        this.f30241j = i3;
        this.f30242k = i4;
        this.f30243l = i5;
    }

    /* renamed from: f */
    public void m24505f(C8904k c8904k) {
        this.f30246o = c8904k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f30238g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f30239h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f30246o.m28333u(m24501b())) {
            outline.setRoundRect(getBounds(), this.f30246o.m28330r().mo28238a(m24501b()));
            return;
        }
        copyBounds(this.f30235d);
        this.f30236e.set(this.f30235d);
        this.f30232a.m28379d(this.f30246o, 1.0f, this.f30236e, this.f30234c);
        if (this.f30234c.isConvex()) {
            outline.setConvexPath(this.f30234c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f30246o.m28333u(m24501b())) {
            return true;
        }
        int iRound = Math.round(this.f30239h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f30247p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f30245n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f30247p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f30244m)) != this.f30244m) {
            this.f30245n = true;
            this.f30244m = colorForState;
        }
        if (this.f30245n) {
            invalidateSelf();
        }
        return this.f30245n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f30233b.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f30233b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
