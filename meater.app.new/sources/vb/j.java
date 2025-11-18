package vb;

import Hb.AbstractC1082f0;
import Ra.H;
import kotlin.jvm.internal.C3862t;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class j extends AbstractC4943g<Double> {
    public j(double d10) {
        super(Double.valueOf(d10));
    }

    @Override // vb.AbstractC4943g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC1082f0 a(H module) {
        C3862t.g(module, "module");
        AbstractC1082f0 abstractC1082f0Z = module.q().z();
        C3862t.f(abstractC1082f0Z, "getDoubleType(...)");
        return abstractC1082f0Z;
    }

    @Override // vb.AbstractC4943g
    public String toString() {
        return b().doubleValue() + ".toDouble()";
    }
}
