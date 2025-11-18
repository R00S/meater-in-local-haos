package F1;

import F1.b;
import android.os.Looper;
import android.util.AndroidRuntimeException;

/* compiled from: SpringAnimation.java */
/* loaded from: classes.dex */
public final class e extends b<e> {

    /* renamed from: A, reason: collision with root package name */
    private f f4464A;

    /* renamed from: B, reason: collision with root package name */
    private float f4465B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f4466C;

    public e(d dVar) {
        super(dVar);
        this.f4464A = null;
        this.f4465B = Float.MAX_VALUE;
        this.f4466C = false;
    }

    private void v() {
        f fVar = this.f4464A;
        if (fVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = fVar.a();
        if (dA > this.f4452g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.f4453h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // F1.b
    public void p() {
        v();
        this.f4464A.g(f());
        super.p();
    }

    @Override // F1.b
    boolean r(long j10) {
        if (this.f4466C) {
            float f10 = this.f4465B;
            if (f10 != Float.MAX_VALUE) {
                this.f4464A.e(f10);
                this.f4465B = Float.MAX_VALUE;
            }
            this.f4447b = this.f4464A.a();
            this.f4446a = 0.0f;
            this.f4466C = false;
            return true;
        }
        if (this.f4465B != Float.MAX_VALUE) {
            this.f4464A.a();
            long j11 = j10 / 2;
            b.p pVarH = this.f4464A.h(this.f4447b, this.f4446a, j11);
            this.f4464A.e(this.f4465B);
            this.f4465B = Float.MAX_VALUE;
            b.p pVarH2 = this.f4464A.h(pVarH.f4460a, pVarH.f4461b, j11);
            this.f4447b = pVarH2.f4460a;
            this.f4446a = pVarH2.f4461b;
        } else {
            b.p pVarH3 = this.f4464A.h(this.f4447b, this.f4446a, j10);
            this.f4447b = pVarH3.f4460a;
            this.f4446a = pVarH3.f4461b;
        }
        float fMax = Math.max(this.f4447b, this.f4453h);
        this.f4447b = fMax;
        float fMin = Math.min(fMax, this.f4452g);
        this.f4447b = fMin;
        if (!u(fMin, this.f4446a)) {
            return false;
        }
        this.f4447b = this.f4464A.a();
        this.f4446a = 0.0f;
        return true;
    }

    public void s(float f10) {
        if (g()) {
            this.f4465B = f10;
            return;
        }
        if (this.f4464A == null) {
            this.f4464A = new f(f10);
        }
        this.f4464A.e(f10);
        p();
    }

    public boolean t() {
        return this.f4464A.f4468b > 0.0d;
    }

    boolean u(float f10, float f11) {
        return this.f4464A.c(f10, f11);
    }

    public e w(f fVar) {
        this.f4464A = fVar;
        return this;
    }

    public void x() {
        if (!t()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f4451f) {
            this.f4466C = true;
        }
    }

    public <K> e(K k10, c<K> cVar) {
        super(k10, cVar);
        this.f4464A = null;
        this.f4465B = Float.MAX_VALUE;
        this.f4466C = false;
    }

    @Override // F1.b
    void o(float f10) {
    }
}
