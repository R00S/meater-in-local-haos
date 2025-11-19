package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes2.dex */
abstract class d extends Drawable implements Animatable {

    /* renamed from: P, reason: collision with root package name */
    private static final Property<d, Float> f36928P = new c(Float.class, "growFraction");

    /* renamed from: B, reason: collision with root package name */
    final Context f36929B;

    /* renamed from: C, reason: collision with root package name */
    final com.google.android.material.progressindicator.b f36930C;

    /* renamed from: E, reason: collision with root package name */
    private ValueAnimator f36932E;

    /* renamed from: F, reason: collision with root package name */
    private ValueAnimator f36933F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f36934G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f36935H;

    /* renamed from: I, reason: collision with root package name */
    private float f36936I;

    /* renamed from: J, reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b> f36937J;

    /* renamed from: K, reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.b f36938K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f36939L;

    /* renamed from: M, reason: collision with root package name */
    private float f36940M;

    /* renamed from: O, reason: collision with root package name */
    private int f36942O;

    /* renamed from: N, reason: collision with root package name */
    final Paint f36941N = new Paint();

    /* renamed from: D, reason: collision with root package name */
    S7.a f36931D = new S7.a();

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            d.this.f();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.super.setVisible(false, false);
            d.this.e();
        }
    }

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    class c extends Property<d, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.h());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.n(f10.floatValue());
        }
    }

    d(Context context, com.google.android.material.progressindicator.b bVar) {
        this.f36929B = context;
        this.f36930C = bVar;
        setAlpha(255);
    }

    private void d(ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f36939L;
        this.f36939L = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f36939L = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f36938K;
        if (bVar != null) {
            bVar.b(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f36937J;
        if (list == null || this.f36939L) {
            return;
        }
        Iterator<androidx.vectordrawable.graphics.drawable.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f36938K;
        if (bVar != null) {
            bVar.c(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f36937J;
        if (list == null || this.f36939L) {
            return;
        }
        Iterator<androidx.vectordrawable.graphics.drawable.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    private void g(ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f36939L;
        this.f36939L = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f36939L = z10;
    }

    private void l() {
        if (this.f36932E == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f36928P, 0.0f, 1.0f);
            this.f36932E = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f36932E.setInterpolator(D7.a.f3487b);
            p(this.f36932E);
        }
        if (this.f36933F == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f36928P, 1.0f, 0.0f);
            this.f36933F = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f36933F.setInterpolator(D7.a.f3487b);
            o(this.f36933F);
        }
    }

    private void o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f36933F;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f36933F = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void p(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f36932E;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f36932E = valueAnimator;
        valueAnimator.addListener(new a());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f36942O;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    float h() {
        if (this.f36930C.b() || this.f36930C.a()) {
            return (this.f36935H || this.f36934G) ? this.f36936I : this.f36940M;
        }
        return 1.0f;
    }

    public boolean i() {
        return q(false, false, false);
    }

    public boolean isRunning() {
        return k() || j();
    }

    public boolean j() {
        ValueAnimator valueAnimator = this.f36933F;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f36935H;
    }

    public boolean k() {
        ValueAnimator valueAnimator = this.f36932E;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f36934G;
    }

    public void m(androidx.vectordrawable.graphics.drawable.b bVar) {
        if (this.f36937J == null) {
            this.f36937J = new ArrayList();
        }
        if (this.f36937J.contains(bVar)) {
            return;
        }
        this.f36937J.add(bVar);
    }

    void n(float f10) {
        if (this.f36940M != f10) {
            this.f36940M = f10;
            invalidateSelf();
        }
    }

    public boolean q(boolean z10, boolean z11, boolean z12) {
        return r(z10, z11, z12 && this.f36931D.a(this.f36929B.getContentResolver()) > 0.0f);
    }

    boolean r(boolean z10, boolean z11, boolean z12) {
        l();
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator = z10 ? this.f36932E : this.f36933F;
        ValueAnimator valueAnimator2 = z10 ? this.f36933F : this.f36932E;
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                g(valueAnimator);
            }
            return super.setVisible(z10, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z13 = !z10 || super.setVisible(z10, false);
        if (!(z10 ? this.f36930C.b() : this.f36930C.a())) {
            g(valueAnimator);
            return z13;
        }
        if (z11 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z13;
    }

    public boolean s(androidx.vectordrawable.graphics.drawable.b bVar) {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f36937J;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f36937J.remove(bVar);
        if (!this.f36937J.isEmpty()) {
            return true;
        }
        this.f36937J = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f36942O = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f36941N.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return q(z10, z11, true);
    }

    public void start() {
        r(true, true, false);
    }

    public void stop() {
        r(false, true, false);
    }
}
