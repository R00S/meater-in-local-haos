package Hb;

import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinType.kt */
/* renamed from: Hb.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1082f0 extends P0 implements Lb.j, Lb.k {
    public AbstractC1082f0() {
        super(null);
    }

    public abstract AbstractC1082f0 V0(boolean z10);

    public abstract AbstractC1082f0 W0(u0 u0Var);

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Sa.c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            Ub.n.i(sb2, "[", sb.n.Q(sb.n.f49599k, it.next(), null, 2, null), "] ");
        }
        sb2.append(O0());
        if (!M0().isEmpty()) {
            kotlin.collections.B.p0(M0(), sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "<", (124 & 8) == 0 ? ">" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        if (P0()) {
            sb2.append("?");
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }
}
