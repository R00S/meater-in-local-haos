package Hb;

import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinType.kt */
/* loaded from: classes3.dex */
public abstract class K extends P0 implements Lb.g {

    /* renamed from: C, reason: collision with root package name */
    private final AbstractC1082f0 f5672C;

    /* renamed from: D, reason: collision with root package name */
    private final AbstractC1082f0 f5673D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(AbstractC1082f0 lowerBound, AbstractC1082f0 upperBound) {
        super(null);
        C3862t.g(lowerBound, "lowerBound");
        C3862t.g(upperBound, "upperBound");
        this.f5672C = lowerBound;
        this.f5673D = upperBound;
    }

    @Override // Hb.U
    public List<E0> M0() {
        return V0().M0();
    }

    @Override // Hb.U
    public u0 N0() {
        return V0().N0();
    }

    @Override // Hb.U
    public y0 O0() {
        return V0().O0();
    }

    @Override // Hb.U
    public boolean P0() {
        return V0().P0();
    }

    public abstract AbstractC1082f0 V0();

    public final AbstractC1082f0 W0() {
        return this.f5672C;
    }

    public final AbstractC1082f0 X0() {
        return this.f5673D;
    }

    public abstract String Y0(sb.n nVar, sb.w wVar);

    @Override // Hb.U
    public Ab.k s() {
        return V0().s();
    }

    public String toString() {
        return sb.n.f49599k.U(this);
    }
}
