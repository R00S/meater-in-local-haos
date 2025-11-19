package Xb;

import Xb.S;
import cc.C2367L;
import cc.C2388s;
import cc.InterfaceC2368M;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004?@ABB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0004J%\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00122\n\u0010\u001f\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%2\n\u0010\u001f\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\rH\u0004¢\u0006\u0004\b-\u0010\u0004R$\u00103\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00105\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00100R\u0014\u00107\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b6\u0010$R\u0013\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109088\u0002X\u0082\u0004R\u000b\u0010<\u001a\u00020;8\u0002X\u0082\u0004R\u0013\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=088\u0002X\u0082\u0004¨\u0006C"}, d2 = {"LXb/g0;", "LXb/h0;", "LXb/S;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "D1", "(Ljava/lang/Runnable;)Z", "B1", "()Ljava/lang/Runnable;", "Loa/F;", "z1", "LXb/g0$c;", "P1", "(LXb/g0$c;)Z", "", "now", "delayedTask", "", "M1", "(JLXb/g0$c;)I", "J1", "shutdown", "timeMillis", "LXb/l;", "continuation", "i0", "(JLXb/l;)V", "block", "LXb/b0;", "N1", "(JLjava/lang/Runnable;)LXb/b0;", "g1", "()J", "Lta/g;", "context", "p0", "(Lta/g;Ljava/lang/Runnable;)V", "C1", "(Ljava/lang/Runnable;)V", "L1", "(JLXb/g0$c;)V", "K1", "value", "H1", "()Z", "O1", "(Z)V", "isCompleted", "I1", "isEmpty", "P0", "nextTime", "Lkotlinx/atomicfu/AtomicRef;", "LXb/g0$d;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "", "_queue", "a", "b", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1838g0 extends AbstractC1840h0 implements S {

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19077G = AtomicReferenceFieldUpdater.newUpdater(AbstractC1838g0.class, Object.class, "_queue$volatile");

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19078H = AtomicReferenceFieldUpdater.newUpdater(AbstractC1838g0.class, Object.class, "_delayed$volatile");

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19079I = AtomicIntegerFieldUpdater.newUpdater(AbstractC1838g0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LXb/g0$a;", "LXb/g0$c;", "", "nanoTime", "LXb/l;", "Loa/F;", "cont", "<init>", "(LXb/g0;JLXb/l;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "D", "LXb/l;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xb.g0$a */
    private final class a extends c {

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1847l<C4153F> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, InterfaceC1847l<? super C4153F> interfaceC1847l) {
            super(j10);
            this.cont = interfaceC1847l;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.F(AbstractC1838g0.this, C4153F.f46609a);
        }

        @Override // Xb.AbstractC1838g0.c
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LXb/g0$b;", "LXb/g0$c;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "Loa/F;", "run", "()V", "", "toString", "()Ljava/lang/String;", "D", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xb.g0$b */
    private static final class b extends c {

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final Runnable block;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // Xb.AbstractC1838g0.c
        public String toString() {
            return super.toString() + this.block;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"LXb/g0$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "LXb/b0;", "Lcc/M;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "s", "(LXb/g0$c;)I", "now", "", "u", "(J)Z", "LXb/g0$d;", "delayed", "LXb/g0;", "eventLoop", "t", "(JLXb/g0$d;LXb/g0;)I", "Loa/F;", "c", "()V", "", "toString", "()Ljava/lang/String;", "B", "J", "_heap", "Ljava/lang/Object;", "C", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lcc/L;", "value", "n", "()Lcc/L;", "p", "(Lcc/L;)V", "heap", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xb.g0$c */
    public static abstract class c implements Runnable, Comparable<c>, InterfaceC1828b0, InterfaceC2368M {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        public long nanoTime;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private int index = -1;
        private volatile Object _heap;

        public c(long j10) {
            this.nanoTime = j10;
        }

        @Override // Xb.InterfaceC1828b0
        public final void c() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == C1844j0.f19087a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = C1844j0.f19087a;
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // cc.InterfaceC2368M
        public int getIndex() {
            return this.index;
        }

        @Override // cc.InterfaceC2368M
        public C2367L<?> n() {
            Object obj = this._heap;
            if (obj instanceof C2367L) {
                return (C2367L) obj;
            }
            return null;
        }

        @Override // cc.InterfaceC2368M
        public void p(C2367L<?> c2367l) {
            if (this._heap == C1844j0.f19087a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = c2367l;
        }

        @Override // java.lang.Comparable
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public int compareTo(c other) {
            long j10 = this.nanoTime - other.nanoTime;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // cc.InterfaceC2368M
        public void setIndex(int i10) {
            this.index = i10;
        }

        public final int t(long now, d delayed, AbstractC1838g0 eventLoop) {
            synchronized (this) {
                if (this._heap == C1844j0.f19087a) {
                    return 2;
                }
                synchronized (delayed) {
                    try {
                        c cVarB = delayed.b();
                        if (eventLoop.H1()) {
                            return 1;
                        }
                        if (cVarB == null) {
                            delayed.timeNow = now;
                        } else {
                            long j10 = cVarB.nanoTime;
                            if (j10 - now < 0) {
                                now = j10;
                            }
                            if (now - delayed.timeNow > 0) {
                                delayed.timeNow = now;
                            }
                        }
                        long j11 = this.nanoTime;
                        long j12 = delayed.timeNow;
                        if (j11 - j12 < 0) {
                            this.nanoTime = j12;
                        }
                        delayed.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }

        public final boolean u(long now) {
            return now - this.nanoTime >= 0;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LXb/g0$d;", "Lcc/L;", "LXb/g0$c;", "", "timeNow", "<init>", "(J)V", "c", "J", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xb.g0$d */
    public static final class d extends C2367L<c> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public long timeNow;

        public d(long j10) {
            this.timeNow = j10;
        }
    }

    private final Runnable B1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19077G;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C2388s) {
                C3862t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C2388s c2388s = (C2388s) obj;
                Object objM = c2388s.m();
                if (objM != C2388s.f31198h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f19077G, this, obj, c2388s.l());
            } else {
                if (obj == C1844j0.f19088b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f19077G, this, obj, null)) {
                    C3862t.e(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean D1(Runnable task) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19077G;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (H1()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f19077G, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof C2388s) {
                C3862t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C2388s c2388s = (C2388s) obj;
                int iA = c2388s.a(task);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f19077G, this, obj, c2388s.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == C1844j0.f19088b) {
                    return false;
                }
                C2388s c2388s2 = new C2388s(8, true);
                C3862t.e(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c2388s2.a((Runnable) obj);
                c2388s2.a(task);
                if (androidx.concurrent.futures.b.a(f19077G, this, obj, c2388s2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean H1() {
        return f19079I.get(this) != 0;
    }

    private final void J1() {
        c cVarJ;
        C1829c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f19078H.get(this);
            if (dVar == null || (cVarJ = dVar.j()) == null) {
                return;
            } else {
                q1(jNanoTime, cVarJ);
            }
        }
    }

    private final int M1(long now, c delayedTask) {
        if (H1()) {
            return 1;
        }
        d dVar = (d) f19078H.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f19078H, this, null, new d(now));
            Object obj = f19078H.get(this);
            C3862t.d(obj);
            dVar = (d) obj;
        }
        return delayedTask.t(now, dVar, this);
    }

    private final void O1(boolean z10) {
        f19079I.set(this, z10 ? 1 : 0);
    }

    private final boolean P1(c task) {
        d dVar = (d) f19078H.get(this);
        return (dVar != null ? dVar.f() : null) == task;
    }

    private final void z1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19077G;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f19077G, this, null, C1844j0.f19088b)) {
                    return;
                }
            } else if (obj instanceof C2388s) {
                ((C2388s) obj).d();
                return;
            } else {
                if (obj == C1844j0.f19088b) {
                    return;
                }
                C2388s c2388s = new C2388s(8, true);
                C3862t.e(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c2388s.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f19077G, this, obj, c2388s)) {
                    return;
                }
            }
        }
    }

    public void C1(Runnable task) {
        if (D1(task)) {
            s1();
        } else {
            N.f19038J.C1(task);
        }
    }

    protected boolean I1() {
        if (!a1()) {
            return false;
        }
        d dVar = (d) f19078H.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f19077G.get(this);
        if (obj != null) {
            if (obj instanceof C2388s) {
                return ((C2388s) obj).j();
            }
            if (obj != C1844j0.f19088b) {
                return false;
            }
        }
        return true;
    }

    protected final void K1() {
        f19077G.set(this, null);
        f19078H.set(this, null);
    }

    public final void L1(long now, c delayedTask) {
        int iM1 = M1(now, delayedTask);
        if (iM1 == 0) {
            if (P1(delayedTask)) {
                s1();
            }
        } else if (iM1 == 1) {
            q1(now, delayedTask);
        } else if (iM1 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    protected final InterfaceC1828b0 N1(long timeMillis, Runnable block) {
        long jC = C1844j0.c(timeMillis);
        if (jC >= 4611686018427387903L) {
            return J0.f19029B;
        }
        C1829c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, block);
        L1(jNanoTime, bVar);
        return bVar;
    }

    @Override // Xb.AbstractC1836f0
    protected long P0() {
        c cVarF;
        if (super.P0() == 0) {
            return 0L;
        }
        Object obj = f19077G.get(this);
        if (obj != null) {
            if (!(obj instanceof C2388s)) {
                return obj == C1844j0.f19088b ? Long.MAX_VALUE : 0L;
            }
            if (!((C2388s) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f19078H.get(this);
        if (dVar == null || (cVarF = dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVarF.nanoTime;
        C1829c.a();
        return Ha.g.e(j10 - System.nanoTime(), 0L);
    }

    @Override // Xb.AbstractC1836f0
    public long g1() {
        c cVarI;
        if (h1()) {
            return 0L;
        }
        d dVar = (d) f19078H.get(this);
        if (dVar != null && !dVar.e()) {
            C1829c.a();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        c cVarB = dVar.b();
                        if (cVarB != null) {
                            c cVar = cVarB;
                            cVarI = cVar.u(jNanoTime) ? D1(cVar) : false ? dVar.i(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (cVarI != null);
        }
        Runnable runnableB1 = B1();
        if (runnableB1 == null) {
            return P0();
        }
        runnableB1.run();
        return 0L;
    }

    public InterfaceC1828b0 h0(long j10, Runnable runnable, ta.g gVar) {
        return S.a.a(this, j10, runnable, gVar);
    }

    @Override // Xb.S
    public void i0(long timeMillis, InterfaceC1847l<? super C4153F> continuation) {
        long jC = C1844j0.c(timeMillis);
        if (jC < 4611686018427387903L) {
            C1829c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, continuation);
            L1(jNanoTime, aVar);
            C1853o.a(continuation, aVar);
        }
    }

    @Override // Xb.E
    public final void p0(ta.g context, Runnable block) {
        C1(block);
    }

    @Override // Xb.AbstractC1836f0
    public void shutdown() {
        T0.f19045a.c();
        O1(true);
        z1();
        while (g1() <= 0) {
        }
        J1();
    }
}
