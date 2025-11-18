package cc;

import cc.AbstractC2374e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0019\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0013\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004R\u0013\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lcc/e;", "N", "", "prev", "<init>", "(Lcc/e;)V", "value", "", "o", "(Lcc/e;)Z", "Loa/F;", "c", "()V", "m", "()Z", "n", "g", "()Ljava/lang/Object;", "nextOrClosed", "d", "()Lcc/e;", "aliveSegmentLeft", "e", "aliveSegmentRight", "f", "next", "l", "isTail", "h", "k", "isRemoved", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2374e<N extends AbstractC2374e<N>> {

    /* renamed from: B, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f31169B = AtomicReferenceFieldUpdater.newUpdater(AbstractC2374e.class, Object.class, "_next$volatile");

    /* renamed from: C, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f31170C = AtomicReferenceFieldUpdater.newUpdater(AbstractC2374e.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC2374e(N n10) {
        this._prev$volatile = n10;
    }

    private final N d() {
        N n10 = (N) h();
        while (n10 != null && n10.k()) {
            n10 = (N) f31170C.get(n10);
        }
        return n10;
    }

    private final N e() {
        AbstractC2374e abstractC2374eF;
        N n10 = (N) f();
        C3862t.d(n10);
        while (n10.k() && (abstractC2374eF = n10.f()) != null) {
            n10 = (N) abstractC2374eF;
        }
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f31169B.get(this);
    }

    public final void c() {
        f31170C.set(this, null);
    }

    public final N f() {
        Object objG = g();
        if (objG == C2373d.f31168a) {
            return null;
        }
        return (N) objG;
    }

    public final N h() {
        return (N) f31170C.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f31169B, this, null, C2373d.f31168a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC2374e abstractC2374eD = d();
            AbstractC2374e abstractC2374eE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31170C;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC2374eE);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC2374eE, obj, ((AbstractC2374e) obj) == null ? null : abstractC2374eD));
            if (abstractC2374eD != null) {
                f31169B.set(abstractC2374eD, abstractC2374eE);
            }
            if (!abstractC2374eE.k() || abstractC2374eE.l()) {
                if (abstractC2374eD == null || !abstractC2374eD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(N value) {
        return androidx.concurrent.futures.b.a(f31169B, this, null, value);
    }
}
