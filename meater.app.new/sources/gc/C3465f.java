package gc;

import cc.AbstractC2358C;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import ta.g;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0006¨\u0006\u001a"}, d2 = {"Lgc/f;", "Lcc/C;", "", "id", "prev", "", "pointers", "<init>", "(JLgc/f;I)V", "index", "", "cause", "Lta/g;", "context", "Loa/F;", "s", "(ILjava/lang/Throwable;Lta/g;)V", "", "toString", "()Ljava/lang/String;", "r", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "", "acquirers", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gc.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3465f extends AbstractC2358C<C3465f> {

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f42172F;

    public C3465f(long j10, C3465f c3465f, int i10) {
        super(j10, c3465f, i10);
        this.f42172F = new AtomicReferenceArray(C3464e.f42171f);
    }

    @Override // cc.AbstractC2358C
    public int r() {
        return C3464e.f42171f;
    }

    @Override // cc.AbstractC2358C
    public void s(int index, Throwable cause, g context) {
        getF42172F().set(index, C3464e.f42170e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }

    /* renamed from: v, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF42172F() {
        return this.f42172F;
    }
}
