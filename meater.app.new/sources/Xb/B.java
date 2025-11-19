package Xb;

import kotlin.Metadata;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "Loa/q;", "Lkotlin/Function1;", "", "Loa/F;", "onCancellation", "", "b", "(Ljava/lang/Object;LBa/l;)Ljava/lang/Object;", "LXb/l;", "caller", "c", "(Ljava/lang/Object;LXb/l;)Ljava/lang/Object;", "state", "Lta/d;", "uCont", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class B {
    public static final <T> Object a(Object obj, InterfaceC4588d<? super T> interfaceC4588d) {
        if (!(obj instanceof C1874z)) {
            return C4172q.a(obj);
        }
        C4172q.Companion aVar = C4172q.INSTANCE;
        return C4172q.a(C4173r.a(((C1874z) obj).cause));
    }

    public static final <T> Object b(Object obj, Ba.l<? super Throwable, C4153F> lVar) {
        Throwable thB = C4172q.b(obj);
        if (thB == null) {
            return lVar != null ? new CompletedWithCancellation(obj, lVar) : obj;
        }
        return new C1874z(thB, false, 2, null);
    }

    public static final <T> Object c(Object obj, InterfaceC1847l<?> interfaceC1847l) {
        Throwable thB = C4172q.b(obj);
        if (thB == null) {
            return obj;
        }
        return new C1874z(thB, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, Ba.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
