package A;

import A0.InterfaceC0828g;
import kotlin.C1;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Spacer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lb0/i;", "modifier", "Loa/F;", "a", "(Lb0/i;LO/l;I)V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y {
    public static final void a(b0.i iVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-72882467, i10, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        Z z10 = Z.f46a;
        int iA = C1550j.a(interfaceC1554l, 0);
        b0.i iVarE = b0.h.e(interfaceC1554l, iVar);
        InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
        InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
        Ba.a<InterfaceC0828g> aVarA = companion.a();
        if (interfaceC1554l.w() == null) {
            C1550j.c();
        }
        interfaceC1554l.t();
        if (interfaceC1554l.n()) {
            interfaceC1554l.T(aVarA);
        } else {
            interfaceC1554l.H();
        }
        InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
        C1.b(interfaceC1554lA, z10, companion.c());
        C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
        C1.b(interfaceC1554lA, iVarE, companion.d());
        Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
        if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
            interfaceC1554lA.J(Integer.valueOf(iA));
            interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
        }
        interfaceC1554l.P();
        if (C1560o.J()) {
            C1560o.R();
        }
    }
}
