package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: LockFreeTaskQueue.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m32267d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", HttpUrl.FRAGMENT_ENCODE_SET, "E", HttpUrl.FRAGMENT_ENCODE_SET, "singleConsumer", "<init>", "(Z)V", "element", "addLast", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "close", "()V", "isClosed", "()Z", "R", "Lkotlin/Function1;", "transform", HttpUrl.FRAGMENT_ENCODE_SET, "map", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "removeFirstOrNull", "()Ljava/lang/Object;", "isEmpty", HttpUrl.FRAGMENT_ENCODE_SET, "getSize", "()I", "size", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.s, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public class LockFreeTaskQueue<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41820a = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public LockFreeTaskQueue(boolean z) {
        this._cur = new LockFreeTaskQueueCore(8, z);
    }

    /* renamed from: a */
    public final boolean m39563a(E e2) {
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) this._cur;
            int iM39572a = lockFreeTaskQueueCore.m39572a(e2);
            if (iM39572a == 0) {
                return true;
            }
            if (iM39572a == 1) {
                f41820a.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.m39576i());
            } else if (iM39572a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m39564b() {
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) this._cur;
            if (lockFreeTaskQueueCore.m39573d()) {
                return;
            } else {
                f41820a.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.m39576i());
            }
        }
    }

    /* renamed from: c */
    public final int m39565c() {
        return ((LockFreeTaskQueueCore) this._cur).m39574f();
    }

    /* renamed from: d */
    public final E m39566d() {
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) this._cur;
            E e2 = (E) lockFreeTaskQueueCore.m39577j();
            if (e2 != LockFreeTaskQueueCore.f41824d) {
                return e2;
            }
            f41820a.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.m39576i());
        }
    }
}
