package kotlin;

import kotlin.Metadata;

/* compiled from: SpringSimulation.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R*\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013\"\u0004\b\u001c\u0010\u0005R$\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u001f\u0010\u0005\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lv/d0;", "", "", "finalPosition", "<init>", "(F)V", "Loa/F;", "c", "()V", "lastDisplacement", "lastVelocity", "", "timeElapsed", "Lv/U;", "g", "(FFJ)J", "a", "F", "getFinalPosition", "()F", "e", "", "b", "D", "naturalFreq", "", "Z", "initialized", "d", "gammaPlus", "gammaMinus", "f", "dampedFreq", "value", "dampingRatio", "stiffness", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4744d0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float finalPosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private double gammaPlus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private double gammaMinus;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private double dampedFreq;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private double naturalFreq = Math.sqrt(50.0d);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float dampingRatio = 1.0f;

    public C4744d0(float f10) {
        this.finalPosition = f10;
    }

    private final void c() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == C4746e0.b()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f10 = this.dampingRatio;
        double d10 = f10 * f10;
        if (f10 > 1.0f) {
            double d11 = this.naturalFreq;
            double d12 = d10 - 1;
            this.gammaPlus = ((-f10) * d11) + (d11 * Math.sqrt(d12));
            double d13 = -this.dampingRatio;
            double d14 = this.naturalFreq;
            this.gammaMinus = (d13 * d14) - (d14 * Math.sqrt(d12));
        } else if (f10 >= 0.0f && f10 < 1.0f) {
            this.dampedFreq = this.naturalFreq * Math.sqrt(1 - d10);
        }
        this.initialized = true;
    }

    /* renamed from: a, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float b() {
        double d10 = this.naturalFreq;
        return (float) (d10 * d10);
    }

    public final void d(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f10;
        this.initialized = false;
    }

    public final void e(float f10) {
        this.finalPosition = f10;
    }

    public final void f(float f10) {
        if (b() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f10);
        this.initialized = false;
    }

    public final long g(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dCos;
        double dExp;
        c();
        float f10 = lastDisplacement - this.finalPosition;
        double d10 = timeElapsed / 1000.0d;
        float f11 = this.dampingRatio;
        if (f11 > 1.0f) {
            double d11 = f10;
            double d12 = this.gammaMinus;
            double d13 = lastVelocity;
            double d14 = this.gammaPlus;
            double d15 = d11 - (((d12 * d11) - d13) / (d12 - d14));
            double d16 = ((d11 * d12) - d13) / (d12 - d14);
            dExp = (Math.exp(d12 * d10) * d15) + (Math.exp(this.gammaPlus * d10) * d16);
            double d17 = this.gammaMinus;
            double dExp2 = d15 * d17 * Math.exp(d17 * d10);
            double d18 = this.gammaPlus;
            dCos = dExp2 + (d16 * d18 * Math.exp(d18 * d10));
        } else if (f11 == 1.0f) {
            double d19 = this.naturalFreq;
            double d20 = f10;
            double d21 = lastVelocity + (d19 * d20);
            double d22 = d20 + (d21 * d10);
            double dExp3 = Math.exp((-d19) * d10) * d22;
            double dExp4 = d22 * Math.exp((-this.naturalFreq) * d10);
            double d23 = this.naturalFreq;
            dCos = (dExp4 * (-d23)) + (d21 * Math.exp((-d23) * d10));
            dExp = dExp3;
        } else {
            double d24 = 1 / this.dampedFreq;
            double d25 = this.naturalFreq;
            double d26 = f10;
            double d27 = d24 * ((f11 * d25 * d26) + lastVelocity);
            double dExp5 = Math.exp((-f11) * d25 * d10) * ((Math.cos(this.dampedFreq * d10) * d26) + (Math.sin(this.dampedFreq * d10) * d27));
            double d28 = this.naturalFreq;
            double d29 = (-d28) * dExp5 * this.dampingRatio;
            double dExp6 = Math.exp((-r5) * d28 * d10);
            double d30 = this.dampedFreq;
            double dSin = (-d30) * d26 * Math.sin(d30 * d10);
            double d31 = this.dampedFreq;
            dCos = d29 + (dExp6 * (dSin + (d27 * d31 * Math.cos(d31 * d10))));
            dExp = dExp5;
        }
        return C4746e0.a((float) (dExp + this.finalPosition), (float) dCos);
    }
}
