package cc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* compiled from: LockFreeTaskQueue.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0014j\b\u0012\u0004\u0012\u00028\u0000`\u00150\u00138\u0002X\u0082\u0004¨\u0006\u0017"}, d2 = {"Lcc/r;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "Loa/F;", "b", "()V", "element", "a", "(Ljava/lang/Object;)Z", "e", "()Ljava/lang/Object;", "", "c", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "Lcc/s;", "Lkotlinx/coroutines/internal/Core;", "_cur", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2387r<E> {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f31194a = AtomicReferenceFieldUpdater.newUpdater(C2387r.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C2387r(boolean z10) {
        this._cur$volatile = new C2388s(8, z10);
    }

    public final boolean a(E element) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31194a;
        while (true) {
            C2388s c2388s = (C2388s) atomicReferenceFieldUpdater.get(this);
            int iA = c2388s.a(element);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f31194a, this, c2388s, c2388s.l());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31194a;
        while (true) {
            C2388s c2388s = (C2388s) atomicReferenceFieldUpdater.get(this);
            if (c2388s.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f31194a, this, c2388s, c2388s.l());
            }
        }
    }

    public final int c() {
        return ((C2388s) f31194a.get(this)).g();
    }

    public final E e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31194a;
        while (true) {
            C2388s c2388s = (C2388s) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) c2388s.m();
            if (e10 != C2388s.f31198h) {
                return e10;
            }
            androidx.concurrent.futures.b.a(f31194a, this, c2388s, c2388s.l());
        }
    }
}
