package vb;

import Hb.AbstractC1082f0;
import Ra.H;
import kotlin.jvm.internal.C3862t;

/* compiled from: constantValues.kt */
/* renamed from: vb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4940d extends r<Byte> {
    public C4940d(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // vb.AbstractC4943g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC1082f0 a(H module) {
        C3862t.g(module, "module");
        AbstractC1082f0 abstractC1082f0T = module.q().t();
        C3862t.f(abstractC1082f0T, "getByteType(...)");
        return abstractC1082f0T;
    }

    @Override // vb.AbstractC4943g
    public String toString() {
        return b().intValue() + ".toByte()";
    }
}
