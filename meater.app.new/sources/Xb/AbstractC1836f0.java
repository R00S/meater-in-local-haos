package Xb;

import kotlin.Metadata;
import kotlin.collections.C3830k;

/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\nR\u0011\u0010$\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b#\u0010\fR\u0011\u0010&\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b%\u0010\f¨\u0006'"}, d2 = {"LXb/f0;", "LXb/E;", "<init>", "()V", "", "unconfined", "", "M0", "(Z)J", "g1", "()J", "h1", "()Z", "k1", "LXb/W;", "task", "Loa/F;", "O0", "(LXb/W;)V", "S0", "(Z)V", "G0", "shutdown", "D", "J", "useCount", "E", "Z", "shared", "Lkotlin/collections/k;", "F", "Lkotlin/collections/k;", "unconfinedQueue", "P0", "nextTime", "X0", "isUnconfinedLoopActive", "a1", "isUnconfinedQueueEmpty", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1836f0 extends E {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private long useCount;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean shared;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private C3830k<W<?>> unconfinedQueue;

    public static /* synthetic */ void L0(AbstractC1836f0 abstractC1836f0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC1836f0.G0(z10);
    }

    private final long M0(boolean unconfined) {
        return unconfined ? 4294967296L : 1L;
    }

    public static /* synthetic */ void U0(AbstractC1836f0 abstractC1836f0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC1836f0.S0(z10);
    }

    public final void G0(boolean unconfined) {
        long jM0 = this.useCount - M0(unconfined);
        this.useCount = jM0;
        if (jM0 <= 0 && this.shared) {
            shutdown();
        }
    }

    public final void O0(W<?> task) {
        C3830k<W<?>> c3830k = this.unconfinedQueue;
        if (c3830k == null) {
            c3830k = new C3830k<>();
            this.unconfinedQueue = c3830k;
        }
        c3830k.addLast(task);
    }

    protected long P0() {
        C3830k<W<?>> c3830k = this.unconfinedQueue;
        return (c3830k == null || c3830k.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void S0(boolean unconfined) {
        this.useCount += M0(unconfined);
        if (unconfined) {
            return;
        }
        this.shared = true;
    }

    public final boolean X0() {
        return this.useCount >= M0(true);
    }

    public final boolean a1() {
        C3830k<W<?>> c3830k = this.unconfinedQueue;
        if (c3830k != null) {
            return c3830k.isEmpty();
        }
        return true;
    }

    public long g1() {
        return !h1() ? Long.MAX_VALUE : 0L;
    }

    public final boolean h1() {
        W<?> wE;
        C3830k<W<?>> c3830k = this.unconfinedQueue;
        if (c3830k == null || (wE = c3830k.E()) == null) {
            return false;
        }
        wE.run();
        return true;
    }

    public boolean k1() {
        return false;
    }

    public void shutdown() {
    }
}
