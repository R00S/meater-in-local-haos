package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlinx.coroutines.C11045s0;
import okhttp3.HttpUrl;

/* compiled from: LockFreeTaskQueue.kt */
@Metadata(m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\b\u0000\u0018\u0000 /*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002/0B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0013J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#J3\u0010&\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0011\u0010)\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R\u0014\u0010*\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0011\u0010.\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, m32267d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", HttpUrl.FRAGMENT_ENCODE_SET, "E", HttpUrl.FRAGMENT_ENCODE_SET, "capacity", HttpUrl.FRAGMENT_ENCODE_SET, "singleConsumer", "<init>", "(IZ)V", "element", "addLast", "(Ljava/lang/Object;)I", HttpUrl.FRAGMENT_ENCODE_SET, "state", "Lkotlinx/coroutines/internal/Core;", "allocateNextCopy", "(J)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "allocateOrGetNextCopy", "close", "()Z", "index", "fillPlaceholder", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "R", "Lkotlin/Function1;", "transform", HttpUrl.FRAGMENT_ENCODE_SET, "map", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "markFrozen", "()J", "next", "()Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "removeFirstOrNull", "()Ljava/lang/Object;", "oldHead", "newHead", "removeSlowPath", "(II)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "I", "isEmpty", "mask", "Z", "getSize", "()I", "size", "Companion", "Placeholder", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.t, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class LockFreeTaskQueueCore<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: e */
    private final int f41825e;

    /* renamed from: f */
    private final boolean f41826f;

    /* renamed from: g */
    private final int f41827g;

    /* renamed from: h */
    private /* synthetic */ AtomicReferenceArray f41828h;

    /* renamed from: a */
    public static final a f41821a = new a(null);

    /* renamed from: d */
    public static final Symbol f41824d = new Symbol("REMOVE_FROZEN");

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41822b = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next");

    /* renamed from: c */
    private static final /* synthetic */ AtomicLongFieldUpdater f41823c = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state");

    /* compiled from: LockFreeTaskQueue.kt */
    @Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0016\u001a\u00020\u0004*\u00020\tJ\u0012\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004JP\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0001\u0010\u001c*\u00020\t26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0086\b¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0086\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, m32267d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "ADD_CLOSED", HttpUrl.FRAGMENT_ENCODE_SET, "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", HttpUrl.FRAGMENT_ENCODE_SET, "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", "T", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", "other", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.internal.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final int m39578a(long j2) {
            return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m39579b(long j2, int i2) {
            return m39581d(j2, 1073741823L) | (i2 << 0);
        }

        /* renamed from: c */
        public final long m39580c(long j2, int i2) {
            return m39581d(j2, 1152921503533105152L) | (i2 << 30);
        }

        /* renamed from: d */
        public final long m39581d(long j2, long j3) {
            return j2 & (j3 ^ (-1));
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    @Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m32267d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", HttpUrl.FRAGMENT_ENCODE_SET, "index", HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.internal.t$b */
    public static final class b {

        /* renamed from: a */
        public final int f41829a;

        public b(int i2) {
            this.f41829a = i2;
        }
    }

    public LockFreeTaskQueueCore(int i2, boolean z) {
        this.f41825e = i2;
        this.f41826f = z;
        int i3 = i2 - 1;
        this.f41827g = i3;
        this.f41828h = new AtomicReferenceArray(i2);
        if (!(i3 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i2 & i3) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final LockFreeTaskQueueCore<E> m39567b(long j2) {
        LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = new LockFreeTaskQueueCore<>(this.f41825e * 2, this.f41826f);
        int i2 = (int) ((1073741823 & j2) >> 0);
        int i3 = (int) ((1152921503533105152L & j2) >> 30);
        while (true) {
            int i4 = this.f41827g;
            if ((i2 & i4) == (i3 & i4)) {
                lockFreeTaskQueueCore._state = f41821a.m39581d(j2, 1152921504606846976L);
                return lockFreeTaskQueueCore;
            }
            Object bVar = this.f41828h.get(i4 & i2);
            if (bVar == null) {
                bVar = new b(i2);
            }
            lockFreeTaskQueueCore.f41828h.set(lockFreeTaskQueueCore.f41827g & i2, bVar);
            i2++;
        }
    }

    /* renamed from: c */
    private final LockFreeTaskQueueCore<E> m39568c(long j2) {
        while (true) {
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = (LockFreeTaskQueueCore) this._next;
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            f41822b.compareAndSet(this, null, m39567b(j2));
        }
    }

    /* renamed from: e */
    private final LockFreeTaskQueueCore<E> m39569e(int i2, E e2) {
        Object obj = this.f41828h.get(this.f41827g & i2);
        if (!(obj instanceof b) || ((b) obj).f41829a != i2) {
            return null;
        }
        this.f41828h.set(i2 & this.f41827g, e2);
        return this;
    }

    /* renamed from: h */
    private final long m39570h() {
        long j2;
        long j3;
        do {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return j2;
            }
            j3 = j2 | 1152921504606846976L;
        } while (!f41823c.compareAndSet(this, j2, j3));
        return j3;
    }

    /* renamed from: k */
    private final LockFreeTaskQueueCore<E> m39571k(int i2, int i3) {
        long j2;
        a aVar;
        int i4;
        do {
            j2 = this._state;
            aVar = f41821a;
            i4 = (int) ((1073741823 & j2) >> 0);
            if (C11045s0.m39681a()) {
                if (!(i4 == i2)) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j2) != 0) {
                return m39576i();
            }
        } while (!f41823c.compareAndSet(this, j2, aVar.m39579b(j2, i3)));
        this.f41828h.set(this.f41827g & i4, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m39572a(E r14) {
        /*
            r13 = this;
        L0:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L12
            kotlinx.coroutines.internal.t$a r14 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.f41821a
            int r14 = r14.m39578a(r2)
            return r14
        L12:
            kotlinx.coroutines.internal.t$a r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.f41821a
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f41827g
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L30
            return r11
        L30:
            boolean r4 = r13.f41826f
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f41828h
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r0 = r13.f41825e
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4e:
            return r11
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.f41823c
            long r11 = r0.m39580c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f41828h
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L69:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L7c
            kotlinx.coroutines.internal.t r0 = r0.m39576i()
            kotlinx.coroutines.internal.t r0 = r0.m39569e(r9, r14)
            if (r0 != 0) goto L69
        L7c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeTaskQueueCore.m39572a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean m39573d() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f41823c.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int m39574f() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    /* renamed from: g */
    public final boolean m39575g() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final LockFreeTaskQueueCore<E> m39576i() {
        return m39568c(m39570h());
    }

    /* renamed from: j */
    public final Object m39577j() {
        while (true) {
            long j2 = this._state;
            if ((1152921504606846976L & j2) != 0) {
                return f41824d;
            }
            a aVar = f41821a;
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.f41827g;
            if ((i3 & i4) == (i2 & i4)) {
                return null;
            }
            Object obj = this.f41828h.get(i4 & i2);
            if (obj == null) {
                if (this.f41826f) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i5 = (i2 + 1) & 1073741823;
                if (f41823c.compareAndSet(this, j2, aVar.m39579b(j2, i5))) {
                    this.f41828h.set(this.f41827g & i2, null);
                    return obj;
                }
                if (this.f41826f) {
                    LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreM39571k = this;
                    do {
                        lockFreeTaskQueueCoreM39571k = lockFreeTaskQueueCoreM39571k.m39571k(i2, i5);
                    } while (lockFreeTaskQueueCoreM39571k != null);
                    return obj;
                }
            }
        }
    }
}
