package cc;

import Xb.InterfaceC1828b0;
import Xb.InterfaceC1847l;
import Xb.O;
import Xb.S;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: LimitedDispatcher.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0011\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000bj\u0002`\fH\u0017¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010&\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010+\u001a\u00060'j\u0002`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u000b\u0010-\u001a\u00020,8\u0002X\u0082\u0004¨\u0006/"}, d2 = {"Lcc/m;", "LXb/E;", "LXb/S;", "dispatcher", "", "parallelism", "<init>", "(LXb/E;I)V", "", "P0", "()Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "O0", "()Ljava/lang/Runnable;", "", "timeMillis", "block", "Lta/g;", "context", "LXb/b0;", "h0", "(JLjava/lang/Runnable;Lta/g;)LXb/b0;", "LXb/l;", "Loa/F;", "continuation", "i0", "(JLXb/l;)V", "p0", "(Lta/g;Ljava/lang/Runnable;)V", "r0", "D", "LXb/E;", "E", "I", "Lcc/r;", "G", "Lcc/r;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "H", "Ljava/lang/Object;", "workerAllocationLock", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2382m extends Xb.E implements S {

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f31180I = AtomicIntegerFieldUpdater.newUpdater(C2382m.class, "runningWorkers$volatile");

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Xb.E dispatcher;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final int parallelism;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ S f31183F;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final C2387r<Runnable> queue;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Object workerAllocationLock;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* compiled from: LimitedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcc/m$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Lcc/m;Ljava/lang/Runnable;)V", "Loa/F;", "run", "()V", "B", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cc.m$a */
    private final class a implements Runnable {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private Runnable currentTask;

        public a(Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th) {
                    Xb.G.a(ta.h.f50000B, th);
                }
                Runnable runnableO0 = C2382m.this.O0();
                if (runnableO0 == null) {
                    return;
                }
                this.currentTask = runnableO0;
                i10++;
                if (i10 >= 16 && C2382m.this.dispatcher.v0(C2382m.this)) {
                    C2382m.this.dispatcher.p0(C2382m.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2382m(Xb.E e10, int i10) {
        this.dispatcher = e10;
        this.parallelism = i10;
        S s10 = e10 instanceof S ? (S) e10 : null;
        this.f31183F = s10 == null ? O.a() : s10;
        this.queue = new C2387r<>(false);
        this.workerAllocationLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable O0() {
        while (true) {
            Runnable runnableE = this.queue.e();
            if (runnableE != null) {
                return runnableE;
            }
            synchronized (this.workerAllocationLock) {
                f31180I.decrementAndGet(this);
                if (this.queue.c() == 0) {
                    return null;
                }
                f31180I.incrementAndGet(this);
            }
        }
    }

    private final boolean P0() {
        synchronized (this.workerAllocationLock) {
            if (f31180I.get(this) >= this.parallelism) {
                return false;
            }
            f31180I.incrementAndGet(this);
            return true;
        }
    }

    @Override // Xb.S
    public InterfaceC1828b0 h0(long timeMillis, Runnable block, ta.g context) {
        return this.f31183F.h0(timeMillis, block, context);
    }

    @Override // Xb.S
    public void i0(long timeMillis, InterfaceC1847l<? super C4153F> continuation) {
        this.f31183F.i0(timeMillis, continuation);
    }

    @Override // Xb.E
    public void p0(ta.g context, Runnable block) {
        Runnable runnableO0;
        this.queue.a(block);
        if (f31180I.get(this) >= this.parallelism || !P0() || (runnableO0 = O0()) == null) {
            return;
        }
        this.dispatcher.p0(this, new a(runnableO0));
    }

    @Override // Xb.E
    public void r0(ta.g context, Runnable block) {
        Runnable runnableO0;
        this.queue.a(block);
        if (f31180I.get(this) >= this.parallelism || !P0() || (runnableO0 = O0()) == null) {
            return;
        }
        this.dispatcher.r0(this, new a(runnableO0));
    }
}
