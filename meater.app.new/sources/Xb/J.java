package Xb;

import cc.C2357B;
import cc.CoroutineScope;
import dc.C3103b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: CoroutineScope.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0013*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u001b\u0010\u001c\u001a\u00020\u0018*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"LXb/I;", "Lta/g;", "context", "g", "(LXb/I;Lta/g;)LXb/I;", "b", "()LXb/I;", "R", "Lkotlin/Function2;", "Lta/d;", "", "block", "d", "(LBa/p;Lta/d;)Ljava/lang/Object;", "a", "(Lta/g;)LXb/I;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Loa/F;", "c", "(LXb/I;Ljava/util/concurrent/CancellationException;)V", "e", "(LXb/I;)V", "", "f", "(LXb/I;)Z", "isActive$annotations", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class J {
    public static final I a(ta.g gVar) {
        if (gVar.b(InterfaceC1867v0.INSTANCE) == null) {
            gVar = gVar.s(A0.b(null, 1, null));
        }
        return new CoroutineScope(gVar);
    }

    public static final I b() {
        return new CoroutineScope(R0.b(null, 1, null).s(Z.c()));
    }

    public static final void c(I i10, CancellationException cancellationException) {
        InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) i10.getCoroutineContext().b(InterfaceC1867v0.INSTANCE);
        if (interfaceC1867v0 != null) {
            interfaceC1867v0.e(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + i10).toString());
    }

    public static final <R> Object d(Ba.p<? super I, ? super InterfaceC4588d<? super R>, ? extends Object> pVar, InterfaceC4588d<? super R> interfaceC4588d) {
        C2357B c2357b = new C2357B(interfaceC4588d.getContext(), interfaceC4588d);
        Object objB = C3103b.b(c2357b, c2357b, pVar);
        if (objB == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objB;
    }

    public static final void e(I i10) {
        C1873y0.m(i10.getCoroutineContext());
    }

    public static final boolean f(I i10) {
        InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) i10.getCoroutineContext().b(InterfaceC1867v0.INSTANCE);
        if (interfaceC1867v0 != null) {
            return interfaceC1867v0.a();
        }
        return true;
    }

    public static final I g(I i10, ta.g gVar) {
        return new CoroutineScope(i10.getCoroutineContext().s(gVar));
    }
}
