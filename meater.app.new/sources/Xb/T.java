package Xb;

import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "timeMillis", "Loa/F;", "a", "(JLta/d;)Ljava/lang/Object;", "Lta/g;", "LXb/S;", "b", "(Lta/g;)LXb/S;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class T {
    public static final Object a(long j10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        if (j10 <= 0) {
            return C4153F.f46609a;
        }
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        if (j10 < Long.MAX_VALUE) {
            b(c1849m.getContext()).i0(j10, c1849m);
        }
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR == C4696b.e() ? objR : C4153F.f46609a;
    }

    public static final S b(ta.g gVar) {
        g.b bVarB = gVar.b(ta.e.INSTANCE);
        S s10 = bVarB instanceof S ? (S) bVarB : null;
        return s10 == null ? O.a() : s10;
    }
}
