package X3;

import L3.C1360e;
import android.view.Choreographer;

/* compiled from: LottieValueAnimator.java */
/* loaded from: classes.dex */
public class g extends a implements Choreographer.FrameCallback {

    /* renamed from: M, reason: collision with root package name */
    private L3.i f18735M;

    /* renamed from: E, reason: collision with root package name */
    private float f18727E = 1.0f;

    /* renamed from: F, reason: collision with root package name */
    private boolean f18728F = false;

    /* renamed from: G, reason: collision with root package name */
    private long f18729G = 0;

    /* renamed from: H, reason: collision with root package name */
    private float f18730H = 0.0f;

    /* renamed from: I, reason: collision with root package name */
    private float f18731I = 0.0f;

    /* renamed from: J, reason: collision with root package name */
    private int f18732J = 0;

    /* renamed from: K, reason: collision with root package name */
    private float f18733K = -2.14748365E9f;

    /* renamed from: L, reason: collision with root package name */
    private float f18734L = 2.14748365E9f;

    /* renamed from: N, reason: collision with root package name */
    protected boolean f18736N = false;

    /* renamed from: O, reason: collision with root package name */
    private boolean f18737O = false;

    private void L() {
        if (this.f18735M == null) {
            return;
        }
        float f10 = this.f18731I;
        if (f10 < this.f18733K || f10 > this.f18734L) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f18733K), Float.valueOf(this.f18734L), Float.valueOf(this.f18731I)));
        }
    }

    private float o() {
        L3.i iVar = this.f18735M;
        if (iVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / iVar.i()) / Math.abs(this.f18727E);
    }

    private boolean s() {
        return r() < 0.0f;
    }

    protected void A(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f18736N = false;
        }
    }

    public void B() {
        this.f18736N = true;
        v();
        this.f18729G = 0L;
        if (s() && n() == q()) {
            E(p());
        } else if (!s() && n() == p()) {
            E(q());
        }
        g();
    }

    public void C() {
        I(-r());
    }

    public void D(L3.i iVar) {
        boolean z10 = this.f18735M == null;
        this.f18735M = iVar;
        if (z10) {
            G(Math.max(this.f18733K, iVar.p()), Math.min(this.f18734L, iVar.f()));
        } else {
            G((int) iVar.p(), (int) iVar.f());
        }
        float f10 = this.f18731I;
        this.f18731I = 0.0f;
        this.f18730H = 0.0f;
        E((int) f10);
        i();
    }

    public void E(float f10) {
        if (this.f18730H == f10) {
            return;
        }
        float fB = i.b(f10, q(), p());
        this.f18730H = fB;
        if (this.f18737O) {
            fB = (float) Math.floor(fB);
        }
        this.f18731I = fB;
        this.f18729G = 0L;
        i();
    }

    public void F(float f10) {
        G(this.f18733K, f10);
    }

    public void G(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        L3.i iVar = this.f18735M;
        float fP = iVar == null ? -3.4028235E38f : iVar.p();
        L3.i iVar2 = this.f18735M;
        float f12 = iVar2 == null ? Float.MAX_VALUE : iVar2.f();
        float fB = i.b(f10, fP, f12);
        float fB2 = i.b(f11, fP, f12);
        if (fB == this.f18733K && fB2 == this.f18734L) {
            return;
        }
        this.f18733K = fB;
        this.f18734L = fB2;
        E((int) i.b(this.f18731I, fB, fB2));
    }

    public void H(int i10) {
        G(i10, (int) this.f18734L);
    }

    public void I(float f10) {
        this.f18727E = f10;
    }

    public void J(boolean z10) {
        this.f18737O = z10;
    }

    @Override // X3.a
    void b() {
        super.b();
        c(s());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        b();
        w();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        v();
        if (this.f18735M == null || !isRunning()) {
            return;
        }
        if (C1360e.g()) {
            C1360e.b("LottieValueAnimator#doFrame");
        }
        float fO = (this.f18729G != 0 ? j10 - r2 : 0L) / o();
        float f10 = this.f18730H;
        if (s()) {
            fO = -fO;
        }
        float f11 = f10 + fO;
        boolean zD = i.d(f11, q(), p());
        float f12 = this.f18730H;
        float fB = i.b(f11, q(), p());
        this.f18730H = fB;
        if (this.f18737O) {
            fB = (float) Math.floor(fB);
        }
        this.f18731I = fB;
        this.f18729G = j10;
        if (!this.f18737O || this.f18730H != f12) {
            i();
        }
        if (!zD) {
            if (getRepeatCount() == -1 || this.f18732J < getRepeatCount()) {
                f();
                this.f18732J++;
                if (getRepeatMode() == 2) {
                    this.f18728F = !this.f18728F;
                    C();
                } else {
                    float fP = s() ? p() : q();
                    this.f18730H = fP;
                    this.f18731I = fP;
                }
                this.f18729G = j10;
            } else {
                float fQ = this.f18727E < 0.0f ? q() : p();
                this.f18730H = fQ;
                this.f18731I = fQ;
                w();
                c(s());
            }
        }
        L();
        if (C1360e.g()) {
            C1360e.c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fQ;
        float fP;
        float fQ2;
        if (this.f18735M == null) {
            return 0.0f;
        }
        if (s()) {
            fQ = p() - this.f18731I;
            fP = p();
            fQ2 = q();
        } else {
            fQ = this.f18731I - q();
            fP = p();
            fQ2 = q();
        }
        return fQ / (fP - fQ2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        L3.i iVar = this.f18735M;
        if (iVar == null) {
            return 0L;
        }
        return (long) iVar.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f18736N;
    }

    public void k() {
        this.f18735M = null;
        this.f18733K = -2.14748365E9f;
        this.f18734L = 2.14748365E9f;
    }

    public void l() {
        w();
        c(s());
    }

    public float m() {
        L3.i iVar = this.f18735M;
        if (iVar == null) {
            return 0.0f;
        }
        return (this.f18731I - iVar.p()) / (this.f18735M.f() - this.f18735M.p());
    }

    public float n() {
        return this.f18731I;
    }

    public float p() {
        L3.i iVar = this.f18735M;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f18734L;
        return f10 == 2.14748365E9f ? iVar.f() : f10;
    }

    public float q() {
        L3.i iVar = this.f18735M;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f18733K;
        return f10 == -2.14748365E9f ? iVar.p() : f10;
    }

    public float r() {
        return this.f18727E;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f18728F) {
            return;
        }
        this.f18728F = false;
        C();
    }

    public void t() {
        w();
        d();
    }

    public void u() {
        this.f18736N = true;
        h(s());
        E((int) (s() ? p() : q()));
        this.f18729G = 0L;
        this.f18732J = 0;
        v();
    }

    protected void v() {
        if (isRunning()) {
            A(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void w() {
        A(true);
    }
}
