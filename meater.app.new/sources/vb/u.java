package vb;

import Hb.AbstractC1082f0;
import Ra.H;
import kotlin.jvm.internal.C3862t;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class u extends r<Long> {
    public u(long j10) {
        super(Long.valueOf(j10));
    }

    @Override // vb.AbstractC4943g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC1082f0 a(H module) {
        C3862t.g(module, "module");
        AbstractC1082f0 abstractC1082f0F = module.q().F();
        C3862t.f(abstractC1082f0F, "getLongType(...)");
        return abstractC1082f0F;
    }

    @Override // vb.AbstractC4943g
    public String toString() {
        return b().longValue() + ".toLong()";
    }
}
