package com.airbnb.lottie.p118v;

import android.view.Choreographer;
import com.airbnb.lottie.C5180d;

/* compiled from: LottieValueAnimator.java */
/* renamed from: com.airbnb.lottie.v.c */
/* loaded from: classes.dex */
public class ChoreographerFrameCallbackC5317c extends AbstractC5315a implements Choreographer.FrameCallback {

    /* renamed from: o */
    private C5180d f12921o;

    /* renamed from: h */
    private float f12914h = 1.0f;

    /* renamed from: i */
    private boolean f12915i = false;

    /* renamed from: j */
    private long f12916j = 0;

    /* renamed from: k */
    private float f12917k = 0.0f;

    /* renamed from: l */
    private int f12918l = 0;

    /* renamed from: m */
    private float f12919m = -2.14748365E9f;

    /* renamed from: n */
    private float f12920n = 2.14748365E9f;

    /* renamed from: p */
    protected boolean f12922p = false;

    /* renamed from: E */
    private void m9849E() {
        if (this.f12921o == null) {
            return;
        }
        float f2 = this.f12917k;
        if (f2 < this.f12919m || f2 > this.f12920n) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f12919m), Float.valueOf(this.f12920n), Float.valueOf(this.f12917k)));
        }
    }

    /* renamed from: l */
    private float m9850l() {
        C5180d c5180d = this.f12921o;
        if (c5180d == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c5180d.m9402h()) / Math.abs(this.f12914h);
    }

    /* renamed from: p */
    private boolean m9851p() {
        return m9862o() < 0.0f;
    }

    /* renamed from: A */
    public void m9852A(int i2) {
        m9853B((int) this.f12919m, i2);
    }

    /* renamed from: B */
    public void m9853B(int i2, int i3) {
        C5180d c5180d = this.f12921o;
        float fM9407m = c5180d == null ? -3.4028235E38f : c5180d.m9407m();
        C5180d c5180d2 = this.f12921o;
        float fM9400f = c5180d2 == null ? Float.MAX_VALUE : c5180d2.m9400f();
        float f2 = i2;
        this.f12919m = C5319e.m9872b(f2, fM9407m, fM9400f);
        float f3 = i3;
        this.f12920n = C5319e.m9872b(f3, fM9407m, fM9400f);
        m9869w((int) C5319e.m9872b(this.f12917k, f2, f3));
    }

    /* renamed from: C */
    public void m9854C(int i2) {
        m9853B(i2, (int) this.f12920n);
    }

    /* renamed from: D */
    public void m9855D(float f2) {
        this.f12914h = f2;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        m9841b();
        m9865s();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        m9864r();
        if (this.f12921o == null || !isRunning()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        float fM9850l = (jNanoTime - this.f12916j) / m9850l();
        float f2 = this.f12917k;
        if (m9851p()) {
            fM9850l = -fM9850l;
        }
        float f3 = f2 + fM9850l;
        this.f12917k = f3;
        boolean z = !C5319e.m9874d(f3, m9861n(), m9860m());
        this.f12917k = C5319e.m9872b(this.f12917k, m9861n(), m9860m());
        this.f12916j = jNanoTime;
        m9845g();
        if (z) {
            if (getRepeatCount() == -1 || this.f12918l < getRepeatCount()) {
                m9843e();
                this.f12918l++;
                if (getRepeatMode() == 2) {
                    this.f12915i = !this.f12915i;
                    m9867u();
                } else {
                    this.f12917k = m9851p() ? m9860m() : m9861n();
                }
                this.f12916j = jNanoTime;
            } else {
                this.f12917k = m9860m();
                m9865s();
                m9842d(m9851p());
            }
        }
        m9849E();
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fM9861n;
        float fM9860m;
        float fM9861n2;
        if (this.f12921o == null) {
            return 0.0f;
        }
        if (m9851p()) {
            fM9861n = m9860m() - this.f12917k;
            fM9860m = m9860m();
            fM9861n2 = m9861n();
        } else {
            fM9861n = this.f12917k - m9861n();
            fM9860m = m9860m();
            fM9861n2 = m9861n();
        }
        return fM9861n / (fM9860m - fM9861n2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m9858j());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C5180d c5180d = this.f12921o;
        if (c5180d == null) {
            return 0L;
        }
        return (long) c5180d.m9398d();
    }

    /* renamed from: h */
    public void m9856h() {
        this.f12921o = null;
        this.f12919m = -2.14748365E9f;
        this.f12920n = 2.14748365E9f;
    }

    /* renamed from: i */
    public void m9857i() {
        m9865s();
        m9842d(m9851p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f12922p;
    }

    /* renamed from: j */
    public float m9858j() {
        C5180d c5180d = this.f12921o;
        if (c5180d == null) {
            return 0.0f;
        }
        return (this.f12917k - c5180d.m9407m()) / (this.f12921o.m9400f() - this.f12921o.m9407m());
    }

    /* renamed from: k */
    public float m9859k() {
        return this.f12917k;
    }

    /* renamed from: m */
    public float m9860m() {
        C5180d c5180d = this.f12921o;
        if (c5180d == null) {
            return 0.0f;
        }
        float f2 = this.f12920n;
        return f2 == 2.14748365E9f ? c5180d.m9400f() : f2;
    }

    /* renamed from: n */
    public float m9861n() {
        C5180d c5180d = this.f12921o;
        if (c5180d == null) {
            return 0.0f;
        }
        float f2 = this.f12919m;
        return f2 == -2.14748365E9f ? c5180d.m9407m() : f2;
    }

    /* renamed from: o */
    public float m9862o() {
        return this.f12914h;
    }

    /* renamed from: q */
    public void m9863q() {
        this.f12922p = true;
        m9844f(m9851p());
        m9869w((int) (m9851p() ? m9860m() : m9861n()));
        this.f12916j = System.nanoTime();
        this.f12918l = 0;
        m9864r();
    }

    /* renamed from: r */
    protected void m9864r() {
        if (isRunning()) {
            m9866t(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: s */
    protected void m9865s() {
        m9866t(true);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 == 2 || !this.f12915i) {
            return;
        }
        this.f12915i = false;
        m9867u();
    }

    /* renamed from: t */
    protected void m9866t(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f12922p = false;
        }
    }

    /* renamed from: u */
    public void m9867u() {
        m9855D(-m9862o());
    }

    /* renamed from: v */
    public void m9868v(C5180d c5180d) {
        boolean z = this.f12921o == null;
        this.f12921o = c5180d;
        if (z) {
            m9853B((int) Math.max(this.f12919m, c5180d.m9407m()), (int) Math.min(this.f12920n, c5180d.m9400f()));
        } else {
            m9853B((int) c5180d.m9407m(), (int) c5180d.m9400f());
        }
        m9869w((int) this.f12917k);
        this.f12916j = System.nanoTime();
    }

    /* renamed from: w */
    public void m9869w(int i2) {
        float f2 = i2;
        if (this.f12917k == f2) {
            return;
        }
        this.f12917k = C5319e.m9872b(f2, m9861n(), m9860m());
        this.f12916j = System.nanoTime();
        m9845g();
    }
}
