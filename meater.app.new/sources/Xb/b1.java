package Xb;

import cc.C2379j;
import cc.C2380k;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Yield.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Loa/F;", "a", "(Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b1 {
    public static final Object a(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objE;
        ta.g context = interfaceC4588d.getContext();
        C1873y0.m(context);
        InterfaceC4588d interfaceC4588dC = C4696b.c(interfaceC4588d);
        C2379j c2379j = interfaceC4588dC instanceof C2379j ? (C2379j) interfaceC4588dC : null;
        if (c2379j == null) {
            objE = C4153F.f46609a;
        } else {
            if (c2379j.dispatcher.v0(context)) {
                c2379j.j(context, C4153F.f46609a);
            } else {
                a1 a1Var = new a1();
                ta.g gVarS = context.s(a1Var);
                C4153F c4153f = C4153F.f46609a;
                c2379j.j(gVarS, c4153f);
                objE = (!a1Var.dispatcherWasUnconfined || C2380k.d(c2379j)) ? C4696b.e() : c4153f;
            }
            objE = C4696b.e();
        }
        if (objE == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objE == C4696b.e() ? objE : C4153F.f46609a;
    }
}
