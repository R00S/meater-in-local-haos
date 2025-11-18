package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11032p;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.AtomicOp;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import okhttp3.HttpUrl;

/* compiled from: Mutex.kt */
@Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00112\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110 :\u0006$%&'()B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJT\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\"\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, m32267d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", HttpUrl.FRAGMENT_ENCODE_SET, "locked", "<init>", "(Z)V", HttpUrl.FRAGMENT_ENCODE_SET, "owner", "holdsLock", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectClause2", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "tryLock", "unlock", "(Ljava/lang/Object;)V", "isLocked", "()Z", "isLockedEmptyQueueState$kotlinx_coroutines_core", "isLockedEmptyQueueState", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onLock", "LockCont", "LockSelect", "LockWaiter", "LockedQueue", "TryLockDesc", "UnlockOp", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.d3.c, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class MutexImpl implements Mutex {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f41683a = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    /* compiled from: Mutex.kt */
    @Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m32267d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockCont;", "Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", "Lkotlinx/coroutines/sync/MutexImpl;", "owner", HttpUrl.FRAGMENT_ENCODE_SET, "cont", "Lkotlinx/coroutines/CancellableContinuation;", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeLockWaiter", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "tryResumeLockWaiter", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.d3.c$a */
    private final class a extends b {

        /* renamed from: l */
        private final CancellableContinuation<C10775u> f41684l;

        /* compiled from: Mutex.kt */
        @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: kotlinx.coroutines.d3.c$a$a, reason: collision with other inner class name */
        static final class C11586a extends Lambda implements Function1<Throwable, C10775u> {

            /* renamed from: f */
            final /* synthetic */ MutexImpl f41686f;

            /* renamed from: g */
            final /* synthetic */ a f41687g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11586a(MutexImpl mutexImpl, a aVar) {
                super(1);
                this.f41686f = mutexImpl;
                this.f41687g = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
                invoke2(th);
                return C10775u.f41439a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f41686f.mo39278c(this.f41687g.f41689j);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, CancellableContinuation<? super C10775u> cancellableContinuation) {
            super(obj);
            this.f41684l = cancellableContinuation;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.b
        /* renamed from: E */
        public void mo39282E() {
            this.f41684l.mo39637q(C11032p.f41866a);
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.b
        /* renamed from: G */
        public boolean mo39283G() {
            return m39284F() && this.f41684l.mo39633g(C10775u.f41439a, null, new C11586a(MutexImpl.this, this)) != null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "LockCont[" + this.f41689j + ", " + this.f41684l + "] for " + MutexImpl.this;
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b¢\u0004\u0018\u00002\u00020\u000f2\u00020\u0010B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\r¨\u0006\u000e"}, m32267d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockWaiter;", HttpUrl.FRAGMENT_ENCODE_SET, "owner", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", HttpUrl.FRAGMENT_ENCODE_SET, "completeResumeLockWaiter", "()V", "dispose", HttpUrl.FRAGMENT_ENCODE_SET, "take", "()Z", "tryResumeLockWaiter", "Ljava/lang/Object;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.d3.c$b */
    private abstract class b extends LockFreeLinkedListNode implements DisposableHandle {

        /* renamed from: i */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f41688i = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");
        private volatile /* synthetic */ int isTaken = 0;

        /* renamed from: j */
        public final Object f41689j;

        public b(Object obj) {
            this.f41689j = obj;
        }

        /* renamed from: E */
        public abstract void mo39282E();

        /* renamed from: F */
        public final boolean m39284F() {
            return f41688i.compareAndSet(this, 0, 1);
        }

        /* renamed from: G */
        public abstract boolean mo39283G();

        @Override // kotlinx.coroutines.DisposableHandle
        /* renamed from: k */
        public final void mo39285k() {
            mo39543z();
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m32267d2 = {"Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "owner", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Object;)V", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.d3.c$c */
    private static final class c extends LockFreeLinkedListHead {
        public volatile Object owner;

        public c(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m32267d2 = {"Lkotlinx/coroutines/sync/MutexImpl$UnlockOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/sync/MutexImpl;", "queue", "Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;", "(Lkotlinx/coroutines/sync/MutexImpl$LockedQueue;)V", "complete", HttpUrl.FRAGMENT_ENCODE_SET, "affected", "failure", HttpUrl.FRAGMENT_ENCODE_SET, "prepare", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.d3.c$d */
    private static final class d extends AtomicOp<MutexImpl> {

        /* renamed from: b */
        public final c f41691b;

        public d(c cVar) {
            this.f41691b = cVar;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo39286d(MutexImpl mutexImpl, Object obj) {
            MutexImpl.f41683a.compareAndSet(mutexImpl, this, obj == null ? C10935d.f41699f : this.f41691b);
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object mo39223g(MutexImpl mutexImpl) {
            if (this.f41691b.m39540E()) {
                return null;
            }
            return C10935d.f41695b;
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.d3.c$e */
    static final class e extends Lambda implements Function1<Throwable, C10775u> {

        /* renamed from: g */
        final /* synthetic */ Object f41693g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(1);
            this.f41693g = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
            invoke2(th);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            MutexImpl.this.mo39278c(this.f41693g);
        }
    }

    public MutexImpl(boolean z) {
        this._state = z ? C10935d.f41698e : C10935d.f41699f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        kotlinx.coroutines.C11036q.m39675c(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r7 = r0.m39664w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r7 != kotlin.coroutines.intrinsics.C10855d.m39045c()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        kotlin.coroutines.p442j.internal.C10863h.m39060c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r7 != kotlin.coroutines.intrinsics.C10855d.m39045c()) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        return kotlin.C10775u.f41439a;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m39280d(java.lang.Object r7, kotlin.coroutines.Continuation<? super kotlin.C10775u> r8) {
        /*
            r6 = this;
            kotlin.y.d r0 = kotlin.coroutines.intrinsics.C10853b.m39041b(r8)
            kotlinx.coroutines.o r0 = kotlinx.coroutines.C11036q.m39674b(r0)
            kotlinx.coroutines.d3.c$a r1 = new kotlinx.coroutines.d3.c$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.Empty
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.d3.a r3 = (kotlinx.coroutines.sync.Empty) r3
            java.lang.Object r4 = r3.f41682a
            kotlinx.coroutines.internal.e0 r5 = kotlinx.coroutines.sync.C10935d.m39294f()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.MutexImpl.f41683a
            kotlinx.coroutines.d3.c$c r5 = new kotlinx.coroutines.d3.c$c
            java.lang.Object r3 = r3.f41682a
            r5.<init>(r3)
            r4.compareAndSet(r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.d3.a r3 = kotlinx.coroutines.sync.C10935d.m39291c()
            goto L37
        L32:
            kotlinx.coroutines.d3.a r3 = new kotlinx.coroutines.d3.a
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.MutexImpl.f41683a
            boolean r2 = r4.compareAndSet(r6, r2, r3)
            if (r2 == 0) goto Ld
            kotlin.u r1 = kotlin.C10775u.f41439a
            kotlinx.coroutines.d3.c$e r2 = new kotlinx.coroutines.d3.c$e
            r2.<init>(r7)
            r0.mo39635n(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.MutexImpl.c
            if (r3 == 0) goto La3
            r3 = r2
            kotlinx.coroutines.d3.c$c r3 = (kotlinx.coroutines.sync.MutexImpl.c) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L88
            r3.m39554j(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.m39284F()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            kotlinx.coroutines.d3.c$a r1 = new kotlinx.coroutines.d3.c$a
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            kotlinx.coroutines.C11036q.m39675c(r0, r1)
        L71:
            java.lang.Object r7 = r0.m39664w()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            if (r7 != r0) goto L7e
            kotlin.coroutines.p442j.internal.C10863h.m39060c(r8)
        L7e:
            java.lang.Object r8 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            if (r7 != r8) goto L85
            return r7
        L85:
            kotlin.u r7 = kotlin.C10775u.f41439a
            return r7
        L88:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Already locked by "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        La3:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r3 == 0) goto Lae
            kotlinx.coroutines.internal.z r2 = (kotlinx.coroutines.internal.OpDescriptor) r2
            r2.mo39448c(r6)
            goto Ld
        Lae:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Illegal state "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            goto Lca
        Lc9:
            throw r7
        Lca:
            goto Lc9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexImpl.m39280d(java.lang.Object, kotlin.y.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.sync.Mutex
    /* renamed from: a */
    public boolean mo39276a() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof Empty) {
                return ((Empty) obj).f41682a != C10935d.f41697d;
            }
            if (obj instanceof c) {
                return true;
            }
            if (!(obj instanceof OpDescriptor)) {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
            ((OpDescriptor) obj).mo39448c(this);
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    /* renamed from: b */
    public Object mo39277b(Object obj, Continuation<? super C10775u> continuation) {
        Object objM39280d;
        return (!m39281e(obj) && (objM39280d = m39280d(obj, continuation)) == C10855d.m39045c()) ? objM39280d : C10775u.f41439a;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    /* renamed from: c */
    public void mo39278c(Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof Empty) {
                if (obj == null) {
                    if (!(((Empty) obj2).f41682a != C10935d.f41697d)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    Empty empty = (Empty) obj2;
                    if (!(empty.f41682a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + empty.f41682a + " but expected " + obj).toString());
                    }
                }
                if (f41683a.compareAndSet(this, obj2, C10935d.f41699f)) {
                    return;
                }
            } else if (obj2 instanceof OpDescriptor) {
                ((OpDescriptor) obj2).mo39448c(this);
            } else {
                if (!(obj2 instanceof c)) {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
                if (obj != null) {
                    c cVar = (c) obj2;
                    if (!(cVar.owner == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + cVar.owner + " but expected " + obj).toString());
                    }
                }
                c cVar2 = (c) obj2;
                LockFreeLinkedListNode lockFreeLinkedListNodeM39551A = cVar2.m39551A();
                if (lockFreeLinkedListNodeM39551A == null) {
                    d dVar = new d(cVar2);
                    if (f41683a.compareAndSet(this, obj2, dVar) && dVar.mo39448c(this) == null) {
                        return;
                    }
                } else {
                    b bVar = (b) lockFreeLinkedListNodeM39551A;
                    if (bVar.mo39283G()) {
                        Object obj3 = bVar.f41689j;
                        if (obj3 == null) {
                            obj3 = C10935d.f41696c;
                        }
                        cVar2.owner = obj3;
                        bVar.mo39282E();
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public boolean m39281e(Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof Empty) {
                if (((Empty) obj2).f41682a != C10935d.f41697d) {
                    return false;
                }
                if (f41683a.compareAndSet(this, obj2, obj == null ? C10935d.f41698e : new Empty(obj))) {
                    return true;
                }
            } else {
                if (obj2 instanceof c) {
                    if (((c) obj2).owner != obj) {
                        return false;
                    }
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                if (!(obj2 instanceof OpDescriptor)) {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((OpDescriptor) obj2).mo39448c(this);
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof Empty) {
                return "Mutex[" + ((Empty) obj).f41682a + ']';
            }
            if (!(obj instanceof OpDescriptor)) {
                if (!(obj instanceof c)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                return "Mutex[" + ((c) obj).owner + ']';
            }
            ((OpDescriptor) obj).mo39448c(this);
        }
    }
}
