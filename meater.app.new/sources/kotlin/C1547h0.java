package kotlin;

import Ba.l;
import kotlin.Metadata;
import ta.InterfaceC4588d;
import ta.g;

/* compiled from: MonotonicFrameClock.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\"\u001e\u0010\f\u001a\u00020\u0007*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "b", "(LBa/l;Lta/d;)Ljava/lang/Object;", "Lta/g;", "LO/g0;", "a", "(Lta/g;)LO/g0;", "getMonotonicFrameClock$annotations", "(Lta/g;)V", "monotonicFrameClock", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1547h0 {
    public static final InterfaceC1545g0 a(g gVar) {
        InterfaceC1545g0 interfaceC1545g0 = (InterfaceC1545g0) gVar.b(InterfaceC1545g0.INSTANCE);
        if (interfaceC1545g0 != null) {
            return interfaceC1545g0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final <R> Object b(l<? super Long, ? extends R> lVar, InterfaceC4588d<? super R> interfaceC4588d) {
        return a(interfaceC4588d.getContext()).K(lVar, interfaceC4588d);
    }
}
