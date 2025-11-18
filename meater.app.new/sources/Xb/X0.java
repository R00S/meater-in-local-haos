package Xb;

import cc.C2357B;
import cc.C2365J;
import kotlin.Metadata;
import oa.C4153F;
import oa.C4170o;
import ta.InterfaceC4588d;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LXb/X0;", "T", "Lcc/B;", "Lta/g;", "context", "Lta/d;", "uCont", "<init>", "(Lta/g;Lta/d;)V", "", "oldValue", "Loa/F;", "g1", "(Lta/g;Ljava/lang/Object;)V", "", "f1", "()Z", "state", "b1", "(Ljava/lang/Object;)V", "Ljava/lang/ThreadLocal;", "Loa/o;", "F", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class X0<T> extends C2357B<T> {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final ThreadLocal<C4170o<ta.g, Object>> threadStateToRecover;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public X0(ta.g gVar, InterfaceC4588d<? super T> interfaceC4588d) {
        Y0 y02 = Y0.f19058B;
        super(gVar.b(y02) == null ? gVar.s(y02) : gVar, interfaceC4588d);
        this.threadStateToRecover = new ThreadLocal<>();
        if (interfaceC4588d.getContext().b(ta.e.INSTANCE) instanceof E) {
            return;
        }
        Object objC = C2365J.c(gVar, null);
        C2365J.a(gVar, objC);
        g1(gVar, objC);
    }

    @Override // cc.C2357B, Xb.AbstractC1825a
    protected void b1(Object state) {
        if (this.threadLocalIsSet) {
            C4170o<ta.g, Object> c4170o = this.threadStateToRecover.get();
            if (c4170o != null) {
                C2365J.a(c4170o.a(), c4170o.b());
            }
            this.threadStateToRecover.remove();
        }
        Object objA = B.a(state, this.uCont);
        InterfaceC4588d<T> interfaceC4588d = this.uCont;
        ta.g context = interfaceC4588d.getContext();
        Object objC = C2365J.c(context, null);
        X0<?> x0G = objC != C2365J.f31152a ? D.g(interfaceC4588d, context, objC) : null;
        try {
            this.uCont.resumeWith(objA);
            C4153F c4153f = C4153F.f46609a;
        } finally {
            if (x0G == null || x0G.f1()) {
                C2365J.a(context, objC);
            }
        }
    }

    public final boolean f1() {
        boolean z10 = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z10;
    }

    public final void g1(ta.g context, Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(oa.v.a(context, oldValue));
    }
}
