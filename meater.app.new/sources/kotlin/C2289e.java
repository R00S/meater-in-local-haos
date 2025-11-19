package kotlin;

import Ba.p;
import ac.InterfaceC1971f;
import cc.C2365J;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.W;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aZ\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00028\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000bH\u0080@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lac/f;", "Lta/g;", "emitContext", "d", "(Lac/f;Lta/g;)Lac/f;", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lta/d;", "block", "b", "(Lta/g;Ljava/lang/Object;Ljava/lang/Object;LBa/p;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2289e {
    public static final <T, V> Object b(g gVar, V v10, Object obj, p<? super V, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, InterfaceC4588d<? super T> interfaceC4588d) {
        Object objC = C2365J.c(gVar, obj);
        try {
            C2302s c2302s = new C2302s(interfaceC4588d, gVar);
            Object objD = !(pVar instanceof a) ? C4696b.d(pVar, v10, c2302s) : ((p) W.f(pVar, 2)).invoke(v10, c2302s);
            C2365J.a(gVar, objC);
            if (objD == C4696b.e()) {
                h.c(interfaceC4588d);
            }
            return objD;
        } catch (Throwable th) {
            C2365J.a(gVar, objC);
            throw th;
        }
    }

    public static /* synthetic */ Object c(g gVar, Object obj, Object obj2, p pVar, InterfaceC4588d interfaceC4588d, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = C2365J.b(gVar);
        }
        return b(gVar, obj, obj2, pVar, interfaceC4588d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC1971f<T> d(InterfaceC1971f<? super T> interfaceC1971f, g gVar) {
        return interfaceC1971f instanceof C2301r ? true : interfaceC1971f instanceof C2297m ? interfaceC1971f : new C2304u(interfaceC1971f, gVar);
    }
}
