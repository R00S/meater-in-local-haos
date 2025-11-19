package vb;

import Hb.AbstractC1082f0;
import Ra.H;
import kotlin.jvm.internal.C3862t;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class m extends AbstractC4943g<Float> {
    public m(float f10) {
        super(Float.valueOf(f10));
    }

    @Override // vb.AbstractC4943g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC1082f0 a(H module) {
        C3862t.g(module, "module");
        AbstractC1082f0 abstractC1082f0B = module.q().B();
        C3862t.f(abstractC1082f0B, "getFloatType(...)");
        return abstractC1082f0B;
    }

    @Override // vb.AbstractC4943g
    public String toString() {
        return b().floatValue() + ".toFloat()";
    }
}
