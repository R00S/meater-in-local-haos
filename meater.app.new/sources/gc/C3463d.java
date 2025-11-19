package gc;

import Ba.l;
import Ba.p;
import Xb.InterfaceC1847l;
import Xb.Z0;
import cc.AbstractC2358C;
import cc.C2359D;
import cc.C2373d;
import fc.InterfaceC3366b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u000e*\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\bR\u000b\u0010$\u001a\u00020#8\u0002X\u0082\u0004R\u000b\u0010&\u001a\u00020%8\u0002X\u0082\u0004R\u000b\u0010'\u001a\u00020%8\u0002X\u0082\u0004R\u0011\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004R\u0011\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¨\u0006,"}, d2 = {"Lgc/d;", "", "", "permits", "acquiredPermits", "<init>", "(II)V", "h", "()I", "Loa/F;", "g", "()V", "LXb/Z0;", "waiter", "", "f", "(LXb/Z0;)Z", "r", "()Z", "q", "(Ljava/lang/Object;)Z", "p", "LXb/l;", "e", "(LXb/l;)V", "o", "a", "I", "Lkotlin/Function1;", "", "b", "LBa/l;", "onCancellationRelease", "i", "availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "enqIdx", "Lkotlinx/atomicfu/AtomicRef;", "Lgc/f;", "head", "tail", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3463d {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42156c = AtomicReferenceFieldUpdater.newUpdater(C3463d.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f42157d = AtomicLongFieldUpdater.newUpdater(C3463d.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42158e = AtomicReferenceFieldUpdater.newUpdater(C3463d.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f42159f = AtomicLongFieldUpdater.newUpdater(C3463d.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f42160g = AtomicIntegerFieldUpdater.newUpdater(C3463d.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int permits;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<Throwable, C4153F> onCancellationRelease;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* compiled from: Semaphore.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gc.d$a */
    /* synthetic */ class a extends C3860q implements p<Long, C3465f, C3465f> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f42163B = new a();

        a() {
            super(2, C3464e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final C3465f c(long j10, C3465f c3465f) {
            return C3464e.h(j10, c3465f);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C3465f invoke(Long l10, C3465f c3465f) {
            return c(l10.longValue(), c3465f);
        }
    }

    /* compiled from: Semaphore.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gc.d$b */
    static final class b extends AbstractC3864v implements l<Throwable, C4153F> {
        b() {
            super(1);
        }

        public final void a(Throwable th) {
            C3463d.this.o();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Semaphore.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gc.d$c */
    /* synthetic */ class c extends C3860q implements p<Long, C3465f, C3465f> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f42165B = new c();

        c() {
            super(2, C3464e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final C3465f c(long j10, C3465f c3465f) {
            return C3464e.h(j10, c3465f);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C3465f invoke(Long l10, C3465f c3465f) {
            return c(l10.longValue(), c3465f);
        }
    }

    public C3463d(int i10, int i11) {
        this.permits = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        C3465f c3465f = new C3465f(0L, null, 2);
        this.head$volatile = c3465f;
        this.tail$volatile = c3465f;
        this._availablePermits$volatile = i10 - i11;
        this.onCancellationRelease = new b();
    }

    private final boolean f(Z0 waiter) {
        Object objC;
        C3465f c3465f = (C3465f) f42158e.get(this);
        long andIncrement = f42159f.getAndIncrement(this);
        a aVar = a.f42163B;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42158e;
        long j10 = andIncrement / C3464e.f42171f;
        loop0: while (true) {
            objC = C2373d.c(c3465f, j10, aVar);
            if (!C2359D.c(objC)) {
                AbstractC2358C abstractC2358CB = C2359D.b(objC);
                while (true) {
                    AbstractC2358C abstractC2358C = (AbstractC2358C) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2358C.id >= abstractC2358CB.id) {
                        break loop0;
                    }
                    if (!abstractC2358CB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC2358C, abstractC2358CB)) {
                        if (abstractC2358C.p()) {
                            abstractC2358C.n();
                        }
                    } else if (abstractC2358CB.p()) {
                        abstractC2358CB.n();
                    }
                }
            } else {
                break;
            }
        }
        C3465f c3465f2 = (C3465f) C2359D.b(objC);
        int i10 = (int) (andIncrement % C3464e.f42171f);
        if (Zb.l.a(c3465f2.getF42172F(), i10, null, waiter)) {
            waiter.c(c3465f2, i10);
            return true;
        }
        if (!Zb.l.a(c3465f2.getF42172F(), i10, C3464e.f42167b, C3464e.f42168c)) {
            return false;
        }
        if (waiter instanceof InterfaceC1847l) {
            C3862t.e(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC1847l) waiter).J(C4153F.f46609a, this.onCancellationRelease);
        } else {
            if (!(waiter instanceof InterfaceC3366b)) {
                throw new IllegalStateException(("unexpected: " + waiter).toString());
            }
            ((InterfaceC3366b) waiter).d(C4153F.f46609a);
        }
        return true;
    }

    private final void g() {
        int i10;
        do {
            i10 = f42160g.get(this);
            if (i10 <= this.permits) {
                return;
            }
        } while (!f42160g.compareAndSet(this, i10, this.permits));
    }

    private final int h() {
        int andDecrement;
        do {
            andDecrement = f42160g.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    private final boolean q(Object obj) {
        if (!(obj instanceof InterfaceC1847l)) {
            if (obj instanceof InterfaceC3366b) {
                return ((InterfaceC3366b) obj).a(this, C4153F.f46609a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        C3862t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC1847l interfaceC1847l = (InterfaceC1847l) obj;
        Object objS = interfaceC1847l.S(C4153F.f46609a, null, this.onCancellationRelease);
        if (objS == null) {
            return false;
        }
        interfaceC1847l.T(objS);
        return true;
    }

    private final boolean r() {
        Object objC;
        C3465f c3465f = (C3465f) f42156c.get(this);
        long andIncrement = f42157d.getAndIncrement(this);
        long j10 = andIncrement / C3464e.f42171f;
        c cVar = c.f42165B;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42156c;
        loop0: while (true) {
            objC = C2373d.c(c3465f, j10, cVar);
            if (C2359D.c(objC)) {
                break;
            }
            AbstractC2358C abstractC2358CB = C2359D.b(objC);
            while (true) {
                AbstractC2358C abstractC2358C = (AbstractC2358C) atomicReferenceFieldUpdater.get(this);
                if (abstractC2358C.id >= abstractC2358CB.id) {
                    break loop0;
                }
                if (!abstractC2358CB.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC2358C, abstractC2358CB)) {
                    if (abstractC2358C.p()) {
                        abstractC2358C.n();
                    }
                } else if (abstractC2358CB.p()) {
                    abstractC2358CB.n();
                }
            }
        }
        C3465f c3465f2 = (C3465f) C2359D.b(objC);
        c3465f2.c();
        if (c3465f2.id > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % C3464e.f42171f);
        Object andSet = c3465f2.getF42172F().getAndSet(i10, C3464e.f42167b);
        if (andSet != null) {
            if (andSet == C3464e.f42170e) {
                return false;
            }
            return q(andSet);
        }
        int i11 = C3464e.f42166a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (c3465f2.getF42172F().get(i10) == C3464e.f42168c) {
                return true;
            }
        }
        return !Zb.l.a(c3465f2.getF42172F(), i10, C3464e.f42167b, C3464e.f42169d);
    }

    protected final void e(InterfaceC1847l<? super C4153F> waiter) {
        while (h() <= 0) {
            C3862t.e(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (f((Z0) waiter)) {
                return;
            }
        }
        waiter.J(C4153F.f46609a, this.onCancellationRelease);
    }

    public int i() {
        return Math.max(f42160g.get(this), 0);
    }

    public void o() {
        do {
            int andIncrement = f42160g.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                g();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!r());
    }

    public boolean p() {
        while (true) {
            int i10 = f42160g.get(this);
            if (i10 > this.permits) {
                g();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f42160g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
