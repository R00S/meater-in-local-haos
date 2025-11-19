package cc;

import Xb.K0;
import cc.AbstractC2358C;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lcc/C;", "S", "Lcc/e;", "LXb/K0;", "", "id", "prev", "", "pointers", "<init>", "(JLcc/C;I)V", "", "u", "()Z", "p", "index", "", "cause", "Lta/g;", "context", "Loa/F;", "s", "(ILjava/lang/Throwable;Lta/g;)V", "t", "()V", "D", "J", "r", "()I", "numberOfSlots", "k", "isRemoved", "Lkotlinx/atomicfu/AtomicInt;", "cleanedAndPointers", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2358C<S extends AbstractC2358C<S>> extends AbstractC2374e<S> implements K0 {

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f31145E = AtomicIntegerFieldUpdater.newUpdater(AbstractC2358C.class, "cleanedAndPointers$volatile");

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final long id;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC2358C(long j10, S s10, int i10) {
        super(s10);
        this.id = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // cc.AbstractC2374e
    public boolean k() {
        return f31145E.get(this) == r() && !l();
    }

    public final boolean p() {
        return f31145E.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int index, Throwable cause, ta.g context);

    public final void t() {
        if (f31145E.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31145E;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
