package androidx.swiperefreshlayout.widget;

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
import r1.i;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: H, reason: collision with root package name */
    private static final Interpolator f29383H = new LinearInterpolator();

    /* renamed from: I, reason: collision with root package name */
    private static final Interpolator f29384I = new M1.b();

    /* renamed from: J, reason: collision with root package name */
    private static final int[] f29385J = {-16777216};

    /* renamed from: B, reason: collision with root package name */
    private final c f29386B;

    /* renamed from: C, reason: collision with root package name */
    private float f29387C;

    /* renamed from: D, reason: collision with root package name */
    private Resources f29388D;

    /* renamed from: E, reason: collision with root package name */
    private Animator f29389E;

    /* renamed from: F, reason: collision with root package name */
    float f29390F;

    /* renamed from: G, reason: collision with root package name */
    boolean f29391G;

    /* compiled from: CircularProgressDrawable.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f29392a;

        a(c cVar) {
            this.f29392a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f29392a);
            b.this.b(fFloatValue, this.f29392a, false);
            b.this.invalidateSelf();
        }
    }

    /* compiled from: CircularProgressDrawable.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final RectF f29396a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        final Paint f29397b;

        /* renamed from: c, reason: collision with root package name */
        final Paint f29398c;

        /* renamed from: d, reason: collision with root package name */
        final Paint f29399d;

        /* renamed from: e, reason: collision with root package name */
        float f29400e;

        /* renamed from: f, reason: collision with root package name */
        float f29401f;

        /* renamed from: g, reason: collision with root package name */
        float f29402g;

        /* renamed from: h, reason: collision with root package name */
        float f29403h;

        /* renamed from: i, reason: collision with root package name */
        int[] f29404i;

        /* renamed from: j, reason: collision with root package name */
        int f29405j;

        /* renamed from: k, reason: collision with root package name */
        float f29406k;

        /* renamed from: l, reason: collision with root package name */
        float f29407l;

        /* renamed from: m, reason: collision with root package name */
        float f29408m;

        /* renamed from: n, reason: collision with root package name */
        boolean f29409n;

        /* renamed from: o, reason: collision with root package name */
        Path f29410o;

        /* renamed from: p, reason: collision with root package name */
        float f29411p;

        /* renamed from: q, reason: collision with root package name */
        float f29412q;

        /* renamed from: r, reason: collision with root package name */
        int f29413r;

        /* renamed from: s, reason: collision with root package name */
        int f29414s;

        /* renamed from: t, reason: collision with root package name */
        int f29415t;

        /* renamed from: u, reason: collision with root package name */
        int f29416u;

        c() {
            Paint paint = new Paint();
            this.f29397b = paint;
            Paint paint2 = new Paint();
            this.f29398c = paint2;
            Paint paint3 = new Paint();
            this.f29399d = paint3;
            this.f29400e = 0.0f;
            this.f29401f = 0.0f;
            this.f29402g = 0.0f;
            this.f29403h = 5.0f;
            this.f29411p = 1.0f;
            this.f29415t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f29406k = this.f29400e;
            this.f29407l = this.f29401f;
            this.f29408m = this.f29402g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f29396a;
            float f10 = this.f29412q;
            float fMin = (this.f29403h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f29413r * this.f29411p) / 2.0f, this.f29403h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f29400e;
            float f12 = this.f29402g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f29401f + f12) * 360.0f) - f13;
            this.f29397b.setColor(this.f29416u);
            this.f29397b.setAlpha(this.f29415t);
            float f15 = this.f29403h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f29399d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f29397b);
            b(canvas, f13, f14, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f29409n) {
                Path path = this.f29410o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f29410o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f29413r * this.f29411p) / 2.0f;
                this.f29410o.moveTo(0.0f, 0.0f);
                this.f29410o.lineTo(this.f29413r * this.f29411p, 0.0f);
                Path path3 = this.f29410o;
                float f13 = this.f29413r;
                float f14 = this.f29411p;
                path3.lineTo((f13 * f14) / 2.0f, this.f29414s * f14);
                this.f29410o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f29403h / 2.0f));
                this.f29410o.close();
                this.f29398c.setColor(this.f29416u);
                this.f29398c.setAlpha(this.f29415t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f29410o, this.f29398c);
                canvas.restore();
            }
        }

        int c() {
            return this.f29415t;
        }

        float d() {
            return this.f29401f;
        }

        int e() {
            return this.f29404i[f()];
        }

        int f() {
            return (this.f29405j + 1) % this.f29404i.length;
        }

        float g() {
            return this.f29400e;
        }

        int h() {
            return this.f29404i[this.f29405j];
        }

        float i() {
            return this.f29407l;
        }

        float j() {
            return this.f29408m;
        }

        float k() {
            return this.f29406k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f29406k = 0.0f;
            this.f29407l = 0.0f;
            this.f29408m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i10) {
            this.f29415t = i10;
        }

        void o(float f10, float f11) {
            this.f29413r = (int) f10;
            this.f29414s = (int) f11;
        }

        void p(float f10) {
            if (f10 != this.f29411p) {
                this.f29411p = f10;
            }
        }

        void q(float f10) {
            this.f29412q = f10;
        }

        void r(int i10) {
            this.f29416u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f29397b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f29405j = i10;
            this.f29416u = this.f29404i[i10];
        }

        void u(int[] iArr) {
            this.f29404i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f29401f = f10;
        }

        void w(float f10) {
            this.f29402g = f10;
        }

        void x(boolean z10) {
            if (this.f29409n != z10) {
                this.f29409n = z10;
            }
        }

        void y(float f10) {
            this.f29400e = f10;
        }

        void z(float f10) {
            this.f29403h = f10;
            this.f29397b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f29388D = ((Context) i.g(context)).getResources();
        c cVar = new c();
        this.f29386B = cVar;
        cVar.u(f29385J);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    private void h(float f10) {
        this.f29387C = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f29386B;
        float f14 = this.f29388D.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f29386B;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f29383H);
        valueAnimatorOfFloat.addListener(new C0408b(cVar));
        this.f29389E = valueAnimatorOfFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f29391G) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f29384I.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f29384I.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f29390F) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f11);
            h(f12);
        }
    }

    public void d(boolean z10) {
        this.f29386B.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f29387C, bounds.exactCenterX(), bounds.exactCenterY());
        this.f29386B.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f29386B.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f29386B.u(iArr);
        this.f29386B.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f29386B.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f29386B.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f29389E.isRunning();
    }

    public void j(float f10, float f11) {
        this.f29386B.y(f10);
        this.f29386B.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f29386B.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f29386B.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f29386B.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f29389E.cancel();
        this.f29386B.A();
        if (this.f29386B.d() != this.f29386B.g()) {
            this.f29391G = true;
            this.f29389E.setDuration(666L);
            this.f29389E.start();
        } else {
            this.f29386B.t(0);
            this.f29386B.m();
            this.f29389E.setDuration(1332L);
            this.f29389E.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f29389E.cancel();
        h(0.0f);
        this.f29386B.x(false);
        this.f29386B.t(0);
        this.f29386B.m();
        invalidateSelf();
    }

    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    class C0408b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f29394a;

        C0408b(c cVar) {
            this.f29394a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f29394a, true);
            this.f29394a.A();
            this.f29394a.l();
            b bVar = b.this;
            if (!bVar.f29391G) {
                bVar.f29390F += 1.0f;
                return;
            }
            bVar.f29391G = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f29394a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f29390F = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
