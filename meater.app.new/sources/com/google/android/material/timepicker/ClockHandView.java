package com.google.android.material.timepicker;

import C7.l;
import C7.m;
import R7.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.internal.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s1.X;

/* loaded from: classes2.dex */
class ClockHandView extends View {

    /* renamed from: B, reason: collision with root package name */
    private final int f37487B;

    /* renamed from: C, reason: collision with root package name */
    private final TimeInterpolator f37488C;

    /* renamed from: D, reason: collision with root package name */
    private final ValueAnimator f37489D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f37490E;

    /* renamed from: F, reason: collision with root package name */
    private float f37491F;

    /* renamed from: G, reason: collision with root package name */
    private float f37492G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f37493H;

    /* renamed from: I, reason: collision with root package name */
    private final int f37494I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f37495J;

    /* renamed from: K, reason: collision with root package name */
    private final List<b> f37496K;

    /* renamed from: L, reason: collision with root package name */
    private final int f37497L;

    /* renamed from: M, reason: collision with root package name */
    private final float f37498M;

    /* renamed from: N, reason: collision with root package name */
    private final Paint f37499N;

    /* renamed from: O, reason: collision with root package name */
    private final RectF f37500O;

    /* renamed from: P, reason: collision with root package name */
    private final int f37501P;

    /* renamed from: Q, reason: collision with root package name */
    private float f37502Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f37503R;

    /* renamed from: S, reason: collision with root package name */
    private double f37504S;

    /* renamed from: T, reason: collision with root package name */
    private int f37505T;

    /* renamed from: U, reason: collision with root package name */
    private int f37506U;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2280D);
    }

    private void c(float f10, float f11) {
        this.f37506U = Q7.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + u.c(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fH = h(this.f37506U);
        float fCos = (((float) Math.cos(this.f37504S)) * fH) + f10;
        float f11 = height;
        float fSin = (fH * ((float) Math.sin(this.f37504S))) + f11;
        this.f37499N.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f37497L, this.f37499N);
        double dSin = Math.sin(this.f37504S);
        double dCos = Math.cos(this.f37504S);
        this.f37499N.setStrokeWidth(this.f37501P);
        canvas.drawLine(f10, f11, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f37499N);
        canvas.drawCircle(f10, f11, this.f37498M, this.f37499N);
    }

    private int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private int h(int i10) {
        return i10 == 2 ? Math.round(this.f37505T * 0.66f) : this.f37505T;
    }

    private Pair<Float, Float> j(float f10) {
        float fG = g();
        if (Math.abs(fG - f10) > 180.0f) {
            if (fG > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fG < 180.0f && f10 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(fG), Float.valueOf(f10));
    }

    private boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float f12 = f(f10, f11);
        boolean z13 = false;
        boolean z14 = g() != f12;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f37490E) {
            z13 = true;
        }
        o(f12, z13);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void p(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f37502Q = f11;
        this.f37504S = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f37506U);
        float fCos = width + (((float) Math.cos(this.f37504S)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f37504S)));
        RectF rectF = this.f37500O;
        int i10 = this.f37497L;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator<b> it = this.f37496K.iterator();
        while (it.hasNext()) {
            it.next().a(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f37496K.add(bVar);
    }

    public RectF e() {
        return this.f37500O;
    }

    public float g() {
        return this.f37502Q;
    }

    public int i() {
        return this.f37497L;
    }

    public void m(int i10) {
        this.f37505T = i10;
        invalidate();
    }

    public void n(float f10) {
        o(f10, false);
    }

    public void o(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f37489D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            p(f10, false);
            return;
        }
        Pair<Float, Float> pairJ = j(f10);
        this.f37489D.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f37489D.setDuration(this.f37487B);
        this.f37489D.setInterpolator(this.f37488C);
        this.f37489D.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f37518a.l(valueAnimator2);
            }
        });
        this.f37489D.addListener(new a());
        this.f37489D.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f37489D.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f37491F = x10;
            this.f37492G = y10;
            this.f37493H = true;
            this.f37503R = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f37491F);
            int i11 = (int) (y10 - this.f37492G);
            this.f37493H = (i10 * i10) + (i11 * i11) > this.f37494I;
            z11 = this.f37503R;
            boolean z13 = actionMasked == 1;
            if (this.f37495J) {
                c(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f37503R |= k(x10, y10, z11, z10, z12);
        return true;
    }

    void q(boolean z10) {
        if (this.f37495J && !z10) {
            this.f37506U = 1;
        }
        this.f37495J = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37489D = new ValueAnimator();
        this.f37496K = new ArrayList();
        Paint paint = new Paint();
        this.f37499N = paint;
        this.f37500O = new RectF();
        this.f37506U = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f2802V1, i10, l.f2562E);
        this.f37487B = i.f(context, C7.c.f2282F, 200);
        this.f37488C = i.g(context, C7.c.f2292P, D7.a.f3487b);
        this.f37505T = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f2822X1, 0);
        this.f37497L = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f2832Y1, 0);
        this.f37501P = getResources().getDimensionPixelSize(C7.e.f2363K);
        this.f37498M = r7.getDimensionPixelSize(C7.e.f2361I);
        int color = typedArrayObtainStyledAttributes.getColor(m.f2812W1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f37494I = ViewConfiguration.get(context).getScaledTouchSlop();
        X.x0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
