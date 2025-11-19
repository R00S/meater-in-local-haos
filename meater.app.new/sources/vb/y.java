package vb;

import Hb.AbstractC1082f0;
import Ra.H;
import kotlin.jvm.internal.C3862t;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class y extends AbstractC4943g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String value) {
        super(value);
        C3862t.g(value, "value");
    }

    @Override // vb.AbstractC4943g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC1082f0 a(H module) {
        C3862t.g(module, "module");
        AbstractC1082f0 abstractC1082f0W = module.q().W();
        C3862t.f(abstractC1082f0W, "getStringType(...)");
        return abstractC1082f0W;
    }

    @Override // vb.AbstractC4943g
    public String toString() {
        return '\"' + b() + '\"';
    }
}
