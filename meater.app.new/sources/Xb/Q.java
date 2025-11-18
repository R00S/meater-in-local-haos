package Xb;

import kotlin.Metadata;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LXb/Q;", "T", "LXb/a;", "LXb/P;", "Lta/g;", "parentContext", "", "active", "<init>", "(Lta/g;Z)V", "g", "()Ljava/lang/Object;", "n", "(Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
class Q<T> extends AbstractC1825a<T> implements P<T> {
    public Q(ta.g gVar, boolean z10) {
        super(gVar, true, z10);
    }

    static /* synthetic */ <T> Object f1(Q<T> q10, InterfaceC4588d<? super T> interfaceC4588d) throws Throwable {
        Object objI = q10.I(interfaceC4588d);
        C4696b.e();
        return objI;
    }

    @Override // Xb.P
    public T g() {
        return (T) j0();
    }

    @Override // Xb.P
    public Object n(InterfaceC4588d<? super T> interfaceC4588d) {
        return f1(this, interfaceC4588d);
    }
}
