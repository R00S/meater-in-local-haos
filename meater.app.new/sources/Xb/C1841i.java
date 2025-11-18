package Xb;

import cc.C2357B;
import cc.C2365J;
import dc.C3102a;
import dc.C3103b;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.InterfaceC4588d;
import ta.e;
import ua.C4696b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000f\u0010\u0010\u001aO\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LXb/I;", "Lta/g;", "context", "LXb/K;", "start", "Lkotlin/Function2;", "Lta/d;", "Loa/F;", "", "block", "LXb/v0;", "c", "(LXb/I;Lta/g;LXb/K;LBa/p;)LXb/v0;", "T", "LXb/P;", "a", "(LXb/I;Lta/g;LXb/K;LBa/p;)LXb/P;", "e", "(Lta/g;LBa/p;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: Xb.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1841i {
    public static final <T> P<T> a(I i10, ta.g gVar, K k10, Ba.p<? super I, ? super InterfaceC4588d<? super T>, ? extends Object> pVar) {
        ta.g gVarD = D.d(i10, gVar);
        Q e02 = k10.n() ? new E0(gVarD, pVar) : new Q(gVarD, true);
        ((AbstractC1825a) e02).e1(k10, e02, pVar);
        return (P<T>) e02;
    }

    public static /* synthetic */ P b(I i10, ta.g gVar, K k10, Ba.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = ta.h.f50000B;
        }
        if ((i11 & 2) != 0) {
            k10 = K.f19030B;
        }
        return C1837g.a(i10, gVar, k10, pVar);
    }

    public static final InterfaceC1867v0 c(I i10, ta.g gVar, K k10, Ba.p<? super I, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar) {
        ta.g gVarD = D.d(i10, gVar);
        AbstractC1825a f02 = k10.n() ? new F0(gVarD, pVar) : new P0(gVarD, true);
        f02.e1(k10, f02, pVar);
        return f02;
    }

    public static /* synthetic */ InterfaceC1867v0 d(I i10, ta.g gVar, K k10, Ba.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = ta.h.f50000B;
        }
        if ((i11 & 2) != 0) {
            k10 = K.f19030B;
        }
        return C1837g.c(i10, gVar, k10, pVar);
    }

    public static final <T> Object e(ta.g gVar, Ba.p<? super I, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, InterfaceC4588d<? super T> interfaceC4588d) throws Throwable {
        Object objF1;
        ta.g context = interfaceC4588d.getContext();
        ta.g gVarE = D.e(context, gVar);
        C1873y0.m(gVarE);
        if (gVarE == context) {
            C2357B c2357b = new C2357B(gVarE, interfaceC4588d);
            objF1 = C3103b.b(c2357b, c2357b, pVar);
        } else {
            e.Companion companion = ta.e.INSTANCE;
            if (C3862t.b(gVarE.b(companion), context.b(companion))) {
                X0 x02 = new X0(gVarE, interfaceC4588d);
                ta.g context2 = x02.getContext();
                Object objC = C2365J.c(context2, null);
                try {
                    Object objB = C3103b.b(x02, x02, pVar);
                    C2365J.a(context2, objC);
                    objF1 = objB;
                } catch (Throwable th) {
                    C2365J.a(context2, objC);
                    throw th;
                }
            } else {
                V v10 = new V(gVarE, interfaceC4588d);
                C3102a.d(pVar, v10, v10, null, 4, null);
                objF1 = v10.f1();
            }
        }
        if (objF1 == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objF1;
    }
}
