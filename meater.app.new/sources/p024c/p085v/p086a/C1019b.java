package p024c.p085v.p086a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p024c.p052i.p059j.C0959i;
import p024c.p068n.p069a.p070a.C0988b;

/* compiled from: CircularProgressDrawable.java */
/* renamed from: c.v.a.b */
/* loaded from: classes.dex */
public class C1019b extends Drawable implements Animatable {

    /* renamed from: f */
    private static final Interpolator f6724f = new LinearInterpolator();

    /* renamed from: g */
    private static final Interpolator f6725g = new C0988b();

    /* renamed from: h */
    private static final int[] f6726h = {-16777216};

    /* renamed from: i */
    private final c f6727i;

    /* renamed from: j */
    private float f6728j;

    /* renamed from: k */
    private Resources f6729k;

    /* renamed from: l */
    private Animator f6730l;

    /* renamed from: m */
    float f6731m;

    /* renamed from: n */
    boolean f6732n;

    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: c.v.a.b$a */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ c f6733a;

        a(c cVar) {
            this.f6733a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1019b.this.m6493n(fFloatValue, this.f6733a);
            C1019b.this.m6485b(fFloatValue, this.f6733a, false);
            C1019b.this.invalidateSelf();
        }
    }

    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: c.v.a.b$b */
    class b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ c f6735a;

        b(c cVar) {
            this.f6735a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C1019b.this.m6485b(1.0f, this.f6735a, true);
            this.f6735a.m6494A();
            this.f6735a.m6506l();
            C1019b c1019b = C1019b.this;
            if (!c1019b.f6732n) {
                c1019b.f6731m += 1.0f;
                return;
            }
            c1019b.f6732n = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f6735a.m6518x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1019b.this.f6731m = 0.0f;
        }
    }

    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: c.v.a.b$c */
    private static class c {

        /* renamed from: a */
        final RectF f6737a = new RectF();

        /* renamed from: b */
        final Paint f6738b;

        /* renamed from: c */
        final Paint f6739c;

        /* renamed from: d */
        final Paint f6740d;

        /* renamed from: e */
        float f6741e;

        /* renamed from: f */
        float f6742f;

        /* renamed from: g */
        float f6743g;

        /* renamed from: h */
        float f6744h;

        /* renamed from: i */
        int[] f6745i;

        /* renamed from: j */
        int f6746j;

        /* renamed from: k */
        float f6747k;

        /* renamed from: l */
        float f6748l;

        /* renamed from: m */
        float f6749m;

        /* renamed from: n */
        boolean f6750n;

        /* renamed from: o */
        Path f6751o;

        /* renamed from: p */
        float f6752p;

        /* renamed from: q */
        float f6753q;

        /* renamed from: r */
        int f6754r;

        /* renamed from: s */
        int f6755s;

        /* renamed from: t */
        int f6756t;

        /* renamed from: u */
        int f6757u;

        c() {
            Paint paint = new Paint();
            this.f6738b = paint;
            Paint paint2 = new Paint();
            this.f6739c = paint2;
            Paint paint3 = new Paint();
            this.f6740d = paint3;
            this.f6741e = 0.0f;
            this.f6742f = 0.0f;
            this.f6743g = 0.0f;
            this.f6744h = 5.0f;
            this.f6752p = 1.0f;
            this.f6756t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        void m6494A() {
            this.f6747k = this.f6741e;
            this.f6748l = this.f6742f;
            this.f6749m = this.f6743g;
        }

        /* renamed from: a */
        void m6495a(Canvas canvas, Rect rect) {
            RectF rectF = this.f6737a;
            float f2 = this.f6753q;
            float fMin = (this.f6744h / 2.0f) + f2;
            if (f2 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f6754r * this.f6752p) / 2.0f, this.f6744h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f3 = this.f6741e;
            float f4 = this.f6743g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f6742f + f4) * 360.0f) - f5;
            this.f6738b.setColor(this.f6757u);
            this.f6738b.setAlpha(this.f6756t);
            float f7 = this.f6744h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f6740d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f6738b);
            m6496b(canvas, f5, f6, rectF);
        }

        /* renamed from: b */
        void m6496b(Canvas canvas, float f2, float f3, RectF rectF) {
            if (this.f6750n) {
                Path path = this.f6751o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f6751o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f4 = (this.f6754r * this.f6752p) / 2.0f;
                this.f6751o.moveTo(0.0f, 0.0f);
                this.f6751o.lineTo(this.f6754r * this.f6752p, 0.0f);
                Path path3 = this.f6751o;
                float f5 = this.f6754r;
                float f6 = this.f6752p;
                path3.lineTo((f5 * f6) / 2.0f, this.f6755s * f6);
                this.f6751o.offset((fMin + rectF.centerX()) - f4, rectF.centerY() + (this.f6744h / 2.0f));
                this.f6751o.close();
                this.f6739c.setColor(this.f6757u);
                this.f6739c.setAlpha(this.f6756t);
                canvas.save();
                canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f6751o, this.f6739c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        int m6497c() {
            return this.f6756t;
        }

        /* renamed from: d */
        float m6498d() {
            return this.f6742f;
        }

        /* renamed from: e */
        int m6499e() {
            return this.f6745i[m6500f()];
        }

        /* renamed from: f */
        int m6500f() {
            return (this.f6746j + 1) % this.f6745i.length;
        }

        /* renamed from: g */
        float m6501g() {
            return this.f6741e;
        }

        /* renamed from: h */
        int m6502h() {
            return this.f6745i[this.f6746j];
        }

        /* renamed from: i */
        float m6503i() {
            return this.f6748l;
        }

        /* renamed from: j */
        float m6504j() {
            return this.f6749m;
        }

        /* renamed from: k */
        float m6505k() {
            return this.f6747k;
        }

        /* renamed from: l */
        void m6506l() {
            m6514t(m6500f());
        }

        /* renamed from: m */
        void m6507m() {
            this.f6747k = 0.0f;
            this.f6748l = 0.0f;
            this.f6749m = 0.0f;
            m6519y(0.0f);
            m6516v(0.0f);
            m6517w(0.0f);
        }

        /* renamed from: n */
        void m6508n(int i2) {
            this.f6756t = i2;
        }

        /* renamed from: o */
        void m6509o(float f2, float f3) {
            this.f6754r = (int) f2;
            this.f6755s = (int) f3;
        }

        /* renamed from: p */
        void m6510p(float f2) {
            if (f2 != this.f6752p) {
                this.f6752p = f2;
            }
        }

        /* renamed from: q */
        void m6511q(float f2) {
            this.f6753q = f2;
        }

        /* renamed from: r */
        void m6512r(int i2) {
            this.f6757u = i2;
        }

        /* renamed from: s */
        void m6513s(ColorFilter colorFilter) {
            this.f6738b.setColorFilter(colorFilter);
        }

        /* renamed from: t */
        void m6514t(int i2) {
            this.f6746j = i2;
            this.f6757u = this.f6745i[i2];
        }

        /* renamed from: u */
        void m6515u(int[] iArr) {
            this.f6745i = iArr;
            m6514t(0);
        }

        /* renamed from: v */
        void m6516v(float f2) {
            this.f6742f = f2;
        }

        /* renamed from: w */
        void m6517w(float f2) {
            this.f6743g = f2;
        }

        /* renamed from: x */
        void m6518x(boolean z) {
            if (this.f6750n != z) {
                this.f6750n = z;
            }
        }

        /* renamed from: y */
        void m6519y(float f2) {
            this.f6741e = f2;
        }

        /* renamed from: z */
        void m6520z(float f2) {
            this.f6744h = f2;
            this.f6738b.setStrokeWidth(f2);
        }
    }

    public C1019b(Context context) {
        this.f6729k = ((Context) C0959i.m6065c(context)).getResources();
        c cVar = new c();
        this.f6727i = cVar;
        cVar.m6515u(f6726h);
        m6491k(2.5f);
        m6484m();
    }

    /* renamed from: a */
    private void m6480a(float f2, c cVar) {
        m6493n(f2, cVar);
        float fFloor = (float) (Math.floor(cVar.m6504j() / 0.8f) + 1.0d);
        cVar.m6519y(cVar.m6505k() + (((cVar.m6503i() - 0.01f) - cVar.m6505k()) * f2));
        cVar.m6516v(cVar.m6503i());
        cVar.m6517w(cVar.m6504j() + ((fFloor - cVar.m6504j()) * f2));
    }

    /* renamed from: c */
    private int m6481c(float f2, int i2, int i3) {
        return ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r0) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r1) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r2) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r8))));
    }

    /* renamed from: h */
    private void m6482h(float f2) {
        this.f6728j = f2;
    }

    /* renamed from: i */
    private void m6483i(float f2, float f3, float f4, float f5) {
        c cVar = this.f6727i;
        float f6 = this.f6729k.getDisplayMetrics().density;
        cVar.m6520z(f3 * f6);
        cVar.m6511q(f2 * f6);
        cVar.m6514t(0);
        cVar.m6509o(f4 * f6, f5 * f6);
    }

    /* renamed from: m */
    private void m6484m() {
        c cVar = this.f6727i;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f6724f);
        valueAnimatorOfFloat.addListener(new b(cVar));
        this.f6730l = valueAnimatorOfFloat;
    }

    /* renamed from: b */
    void m6485b(float f2, c cVar, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f6732n) {
            m6480a(f2, cVar);
            return;
        }
        if (f2 != 1.0f || z) {
            float fM6504j = cVar.m6504j();
            if (f2 < 0.5f) {
                interpolation = cVar.m6505k();
                interpolation2 = (f6725g.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fM6505k = cVar.m6505k() + 0.79f;
                interpolation = fM6505k - (((1.0f - f6725g.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fM6505k;
            }
            float f3 = fM6504j + (0.20999998f * f2);
            float f4 = (f2 + this.f6731m) * 216.0f;
            cVar.m6519y(interpolation);
            cVar.m6516v(interpolation2);
            cVar.m6517w(f3);
            m6482h(f4);
        }
    }

    /* renamed from: d */
    public void m6486d(boolean z) {
        this.f6727i.m6518x(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f6728j, bounds.exactCenterX(), bounds.exactCenterY());
        this.f6727i.m6495a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void m6487e(float f2) {
        this.f6727i.m6510p(f2);
        invalidateSelf();
    }

    /* renamed from: f */
    public void m6488f(int... iArr) {
        this.f6727i.m6515u(iArr);
        this.f6727i.m6514t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m6489g(float f2) {
        this.f6727i.m6517w(f2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6727i.m6497c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f6730l.isRunning();
    }

    /* renamed from: j */
    public void m6490j(float f2, float f3) {
        this.f6727i.m6519y(f2);
        this.f6727i.m6516v(f3);
        invalidateSelf();
    }

    /* renamed from: k */
    public void m6491k(float f2) {
        this.f6727i.m6520z(f2);
        invalidateSelf();
    }

    /* renamed from: l */
    public void m6492l(int i2) {
        if (i2 == 0) {
            m6483i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m6483i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: n */
    void m6493n(float f2, c cVar) {
        if (f2 > 0.75f) {
            cVar.m6512r(m6481c((f2 - 0.75f) / 0.25f, cVar.m6502h(), cVar.m6499e()));
        } else {
            cVar.m6512r(cVar.m6502h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f6727i.m6508n(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6727i.m6513s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f6730l.cancel();
        this.f6727i.m6494A();
        if (this.f6727i.m6498d() != this.f6727i.m6501g()) {
            this.f6732n = true;
            this.f6730l.setDuration(666L);
            this.f6730l.start();
        } else {
            this.f6727i.m6514t(0);
            this.f6727i.m6507m();
            this.f6730l.setDuration(1332L);
            this.f6730l.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f6730l.cancel();
        m6482h(0.0f);
        this.f6727i.m6518x(false);
        this.f6727i.m6514t(0);
        this.f6727i.m6507m();
        invalidateSelf();
    }
}
