package vb;

import Hb.AbstractC1082f0;
import Hb.U;
import Oa.p;
import Ra.C1711y;
import Ra.H;
import Ra.InterfaceC1692e;
import kotlin.jvm.internal.C3862t;

/* compiled from: constantValues.kt */
/* renamed from: vb.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4932B extends AbstractC4936F<Byte> {
    public C4932B(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // vb.AbstractC4943g
    public U a(H module) {
        AbstractC1082f0 abstractC1082f0U;
        C3862t.g(module, "module");
        InterfaceC1692e interfaceC1692eB = C1711y.b(module, p.a.f13407D0);
        return (interfaceC1692eB == null || (abstractC1082f0U = interfaceC1692eB.u()) == null) ? Jb.l.d(Jb.k.f7749Y0, "UByte") : abstractC1082f0U;
    }

    @Override // vb.AbstractC4943g
    public String toString() {
        return b().intValue() + ".toUByte()";
    }
}
