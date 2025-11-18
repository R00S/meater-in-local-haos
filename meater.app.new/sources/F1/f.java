package F1;

import F1.b;

/* compiled from: SpringForce.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    double f4467a;

    /* renamed from: b, reason: collision with root package name */
    double f4468b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4469c;

    /* renamed from: d, reason: collision with root package name */
    private double f4470d;

    /* renamed from: e, reason: collision with root package name */
    private double f4471e;

    /* renamed from: f, reason: collision with root package name */
    private double f4472f;

    /* renamed from: g, reason: collision with root package name */
    private double f4473g;

    /* renamed from: h, reason: collision with root package name */
    private double f4474h;

    /* renamed from: i, reason: collision with root package name */
    private double f4475i;

    /* renamed from: j, reason: collision with root package name */
    private final b.p f4476j;

    public f() {
        this.f4467a = Math.sqrt(1500.0d);
        this.f4468b = 0.5d;
        this.f4469c = false;
        this.f4475i = Double.MAX_VALUE;
        this.f4476j = new b.p();
    }

    private void b() {
        if (this.f4469c) {
            return;
        }
        if (this.f4475i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f4468b;
        if (d10 > 1.0d) {
            double d11 = this.f4467a;
            this.f4472f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f4468b;
            double d13 = this.f4467a;
            this.f4473g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f4474h = this.f4467a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f4469c = true;
    }

    public float a() {
        return (float) this.f4475i;
    }

    public boolean c(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f4471e && ((double) Math.abs(f10 - a())) < this.f4470d;
    }

    public f d(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f4468b = f10;
        this.f4469c = false;
        return this;
    }

    public f e(float f10) {
        this.f4475i = f10;
        return this;
    }

    public f f(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f4467a = Math.sqrt(f10);
        this.f4469c = false;
        return this;
    }

    void g(double d10) {
        double dAbs = Math.abs(d10);
        this.f4470d = dAbs;
        this.f4471e = dAbs * 62.5d;
    }

    b.p h(double d10, double d11, long j10) {
        double dCos;
        double dPow;
        b();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f4475i;
        double d14 = this.f4468b;
        if (d14 > 1.0d) {
            double d15 = this.f4473g;
            double d16 = this.f4472f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f4472f * d12) * d18);
            double d19 = this.f4473g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f4472f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f4467a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f4467a) * d12);
            double d24 = this.f4467a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f4474h;
            double d26 = this.f4467a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            double dPow4 = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f4474h * d12) * d13) + (Math.sin(this.f4474h * d12) * d27));
            double d28 = this.f4467a;
            double d29 = this.f4468b;
            double d30 = (-d28) * dPow4 * d29;
            double dPow5 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d31 = this.f4474h;
            double dSin = (-d31) * d13 * Math.sin(d31 * d12);
            double d32 = this.f4474h;
            dCos = d30 + (dPow5 * (dSin + (d27 * d32 * Math.cos(d32 * d12))));
            dPow = dPow4;
        }
        b.p pVar = this.f4476j;
        pVar.f4460a = (float) (dPow + this.f4475i);
        pVar.f4461b = (float) dCos;
        return pVar;
    }

    public f(float f10) {
        this.f4467a = Math.sqrt(1500.0d);
        this.f4468b = 0.5d;
        this.f4469c = false;
        this.f4475i = Double.MAX_VALUE;
        this.f4476j = new b.p();
        this.f4475i = f10;
    }
}
