package Xb;

import cc.C2357B;
import cc.C2380k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000b\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¨\u0006\u0017"}, d2 = {"LXb/V;", "T", "Lcc/B;", "Lta/g;", "context", "Lta/d;", "uCont", "<init>", "(Lta/g;Lta/d;)V", "", "i1", "()Z", "h1", "", "state", "Loa/F;", "H", "(Ljava/lang/Object;)V", "b1", "f1", "()Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class V<T> extends C2357B<T> {

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19048F = AtomicIntegerFieldUpdater.newUpdater(V.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public V(ta.g gVar, InterfaceC4588d<? super T> interfaceC4588d) {
        super(gVar, interfaceC4588d);
    }

    private final boolean h1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19048F;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f19048F.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean i1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19048F;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f19048F.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // cc.C2357B, Xb.C0
    protected void H(Object state) {
        b1(state);
    }

    @Override // cc.C2357B, Xb.AbstractC1825a
    protected void b1(Object state) {
        if (h1()) {
            return;
        }
        C2380k.c(C4696b.c(this.uCont), B.a(state, this.uCont), null, 2, null);
    }

    public final Object f1() {
        if (i1()) {
            return C4696b.e();
        }
        Object objH = D0.h(r0());
        if (objH instanceof C1874z) {
            throw ((C1874z) objH).cause;
        }
        return objH;
    }
}
