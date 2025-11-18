package vb;

import Hb.AbstractC1082f0;
import Ra.H;
import kotlin.jvm.internal.C3862t;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class x extends r<Short> {
    public x(short s10) {
        super(Short.valueOf(s10));
    }

    @Override // vb.AbstractC4943g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC1082f0 a(H module) {
        C3862t.g(module, "module");
        AbstractC1082f0 abstractC1082f0T = module.q().T();
        C3862t.f(abstractC1082f0T, "getShortType(...)");
        return abstractC1082f0T;
    }

    @Override // vb.AbstractC4943g
    public String toString() {
        return b().intValue() + ".toShort()";
    }
}
