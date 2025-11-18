package Zb;

import Xb.AbstractC1825a;
import Xb.C0;
import Xb.D;
import Xb.I;
import Xb.K;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b2(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"E", "LXb/I;", "Lta/g;", "context", "", "capacity", "LXb/K;", "start", "Lkotlin/Function1;", "", "Loa/F;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "LZb/c;", "Lta/d;", "", "block", "LZb/w;", "a", "(LXb/I;Lta/g;ILXb/K;LBa/l;LBa/p;)LZb/w;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    public static final <E> w<E> a(I i10, ta.g gVar, int i11, K k10, Ba.l<? super Throwable, C4153F> lVar, Ba.p<? super c<E>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar) {
        ta.g gVarD = D.d(i10, gVar);
        g gVarB = j.b(i11, null, null, 6, null);
        a qVar = k10.n() ? new q(gVarD, gVarB, pVar) : new a(gVarD, gVarB, true);
        if (lVar != null) {
            ((C0) qVar).q(lVar);
        }
        ((AbstractC1825a) qVar).e1(k10, qVar, pVar);
        return (w<E>) qVar;
    }

    public static /* synthetic */ w b(I i10, ta.g gVar, int i11, K k10, Ba.l lVar, Ba.p pVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            gVar = ta.h.f50000B;
        }
        ta.g gVar2 = gVar;
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            k10 = K.f19030B;
        }
        K k11 = k10;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        return a(i10, gVar2, i13, k11, lVar, pVar);
    }
}
