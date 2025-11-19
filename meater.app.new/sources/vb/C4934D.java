package vb;

import Hb.AbstractC1082f0;
import Hb.U;
import Oa.p;
import Ra.C1711y;
import Ra.H;
import Ra.InterfaceC1692e;
import kotlin.jvm.internal.C3862t;

/* compiled from: constantValues.kt */
/* renamed from: vb.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4934D extends AbstractC4936F<Long> {
    public C4934D(long j10) {
        super(Long.valueOf(j10));
    }

    @Override // vb.AbstractC4943g
    public U a(H module) {
        AbstractC1082f0 abstractC1082f0U;
        C3862t.g(module, "module");
        InterfaceC1692e interfaceC1692eB = C1711y.b(module, p.a.f13413G0);
        return (interfaceC1692eB == null || (abstractC1082f0U = interfaceC1692eB.u()) == null) ? Jb.l.d(Jb.k.f7749Y0, "ULong") : abstractC1082f0U;
    }

    @Override // vb.AbstractC4943g
    public String toString() {
        return b().longValue() + ".toULong()";
    }
}
