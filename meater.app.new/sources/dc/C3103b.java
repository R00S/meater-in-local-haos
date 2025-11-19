package dc;

import Ba.p;
import Xb.C1874z;
import Xb.D0;
import cc.C2357B;
import cc.C2365J;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.W;
import kotlinx.coroutines.TimeoutCancellationException;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: Undispatched.kt */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\u000e\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lta/d;", "", "receiver", "completion", "Loa/F;", "a", "(LBa/p;Ljava/lang/Object;Lta/d;)V", "Lcc/B;", "block", "b", "(Lcc/B;Ljava/lang/Object;LBa/p;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: dc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3103b {
    public static final <R, T> void a(p<? super R, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, R r10, InterfaceC4588d<? super T> interfaceC4588d) {
        InterfaceC4588d interfaceC4588dA = h.a(interfaceC4588d);
        try {
            g context = interfaceC4588d.getContext();
            Object objC = C2365J.c(context, null);
            try {
                Object objD = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? C4696b.d(pVar, r10, interfaceC4588dA) : ((p) W.f(pVar, 2)).invoke(r10, interfaceC4588dA);
                C2365J.a(context, objC);
                if (objD != C4696b.e()) {
                    interfaceC4588dA.resumeWith(C4172q.a(objD));
                }
            } catch (Throwable th) {
                C2365J.a(context, objC);
                throw th;
            }
        } catch (Throwable th2) {
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC4588dA.resumeWith(C4172q.a(C4173r.a(th2)));
        }
    }

    public static final <T, R> Object b(C2357B<? super T> c2357b, R r10, p<? super R, ? super InterfaceC4588d<? super T>, ? extends Object> pVar) {
        Object c1874z;
        try {
            c1874z = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? C4696b.d(pVar, r10, c2357b) : ((p) W.f(pVar, 2)).invoke(r10, c2357b);
        } catch (Throwable th) {
            c1874z = new C1874z(th, false, 2, null);
        }
        if (c1874z == C4696b.e()) {
            return C4696b.e();
        }
        Object objE0 = c2357b.E0(c1874z);
        if (objE0 == D0.f19014b) {
            return C4696b.e();
        }
        if (objE0 instanceof C1874z) {
            throw ((C1874z) objE0).cause;
        }
        return D0.h(objE0);
    }

    public static final <T, R> Object c(C2357B<? super T> c2357b, R r10, p<? super R, ? super InterfaceC4588d<? super T>, ? extends Object> pVar) throws Throwable {
        Object c1874z;
        try {
            c1874z = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? C4696b.d(pVar, r10, c2357b) : ((p) W.f(pVar, 2)).invoke(r10, c2357b);
        } catch (Throwable th) {
            c1874z = new C1874z(th, false, 2, null);
        }
        if (c1874z == C4696b.e()) {
            return C4696b.e();
        }
        Object objE0 = c2357b.E0(c1874z);
        if (objE0 == D0.f19014b) {
            return C4696b.e();
        }
        if (objE0 instanceof C1874z) {
            Throwable th2 = ((C1874z) objE0).cause;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).coroutine != c2357b) {
                throw th2;
            }
            if (c1874z instanceof C1874z) {
                throw ((C1874z) c1874z).cause;
            }
        } else {
            c1874z = D0.h(objE0);
        }
        return c1874z;
    }
}
