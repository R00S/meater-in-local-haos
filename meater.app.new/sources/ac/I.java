package ac;

import cc.C2361F;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC2285a;
import kotlin.C2298n;
import kotlin.InterfaceC2295k;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030#2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b$\u0010%J-\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020!2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-R\u0016\u00100\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u0010\tR\u0011\u00105\u001a\b\u0012\u0004\u0012\u00020\u0005048\u0002X\u0082\u0004¨\u00066"}, d2 = {"Lac/I;", "T", "Lbc/a;", "Lac/K;", "Lac/t;", "", "Lbc/k;", "initialState", "<init>", "(Ljava/lang/Object;)V", "expectedState", "newState", "", "s", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", "update", "c", "value", "i", "(Ljava/lang/Object;)Z", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "d", "()V", "Lac/f;", "collector", "", "b", "(Lac/f;Lta/d;)Ljava/lang/Object;", "p", "()Lac/K;", "", "size", "", "q", "(I)[Lac/K;", "Lta/g;", "context", "capacity", "LZb/d;", "onBufferOverflow", "Lac/e;", "e", "(Lta/g;ILZb/d;)Lac/e;", "F", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "Lkotlinx/atomicfu/AtomicRef;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class I<T> extends AbstractC2285a<K> implements t<T>, InterfaceC1970e, InterfaceC2295k<T> {

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f20318G = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "_state$volatile");

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private int sequence;
    private volatile /* synthetic */ Object _state$volatile;

    /* compiled from: StateFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f20320B;

        /* renamed from: C, reason: collision with root package name */
        Object f20321C;

        /* renamed from: D, reason: collision with root package name */
        Object f20322D;

        /* renamed from: E, reason: collision with root package name */
        Object f20323E;

        /* renamed from: F, reason: collision with root package name */
        Object f20324F;

        /* renamed from: G, reason: collision with root package name */
        /* synthetic */ Object f20325G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ I<T> f20326H;

        /* renamed from: I, reason: collision with root package name */
        int f20327I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I<T> i10, InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
            this.f20326H = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f20325G = obj;
            this.f20327I |= Integer.MIN_VALUE;
            return this.f20326H.b(null, this);
        }
    }

    public I(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean s(Object expectedState, Object newState) {
        int i10;
        K[] kArrO;
        synchronized (this) {
            Object obj = f20318G.get(this);
            if (expectedState != null && !C3862t.b(obj, expectedState)) {
                return false;
            }
            if (C3862t.b(obj, newState)) {
                return true;
            }
            f20318G.set(this, newState);
            int i11 = this.sequence;
            if ((i11 & 1) != 0) {
                this.sequence = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.sequence = i12;
            K[] kArrO2 = o();
            C4153F c4153f = C4153F.f46609a;
            while (true) {
                K[] kArr = kArrO2;
                if (kArr != null) {
                    for (K k10 : kArr) {
                        if (k10 != null) {
                            k10.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.sequence;
                    if (i10 == i12) {
                        this.sequence = i12 + 1;
                        return true;
                    }
                    kArrO = o();
                    C4153F c4153f2 = C4153F.f46609a;
                }
                kArrO2 = kArrO;
                i12 = i10;
            }
        }
    }

    @Override // ac.s, ac.InterfaceC1971f
    public Object a(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        setValue(t10);
        return C4153F.f46609a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:40:0x00ba, B:42:0x00c0], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:42:0x00c0, B:40:0x00ba], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b5, B:40:0x00ba, B:50:0x00db, B:52:0x00e1, B:42:0x00c0, B:46:0x00c7, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b5, B:40:0x00ba, B:50:0x00db, B:52:0x00e1, B:42:0x00c0, B:46:0x00c7, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b5, B:40:0x00ba, B:50:0x00db, B:52:0x00e1, B:42:0x00c0, B:46:0x00c7, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [bc.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00df -> B:36:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f1 -> B:36:0x00ab). Please report as a decompilation issue!!! */
    @Override // ac.x, ac.InterfaceC1970e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(ac.InterfaceC1971f<? super T> r11, ta.InterfaceC4588d<?> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.I.b(ac.f, ta.d):java.lang.Object");
    }

    @Override // ac.t
    public boolean c(T expect, T update) {
        if (expect == null) {
            expect = (T) C2298n.f30783a;
        }
        if (update == null) {
            update = (T) C2298n.f30783a;
        }
        return s(expect, update);
    }

    @Override // ac.s
    public void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlin.InterfaceC2295k
    public InterfaceC1970e<T> e(ta.g context, int capacity, Zb.d onBufferOverflow) {
        return J.d(this, context, capacity, onBufferOverflow);
    }

    @Override // ac.t, ac.H
    public T getValue() {
        C2361F c2361f = C2298n.f30783a;
        T t10 = (T) f20318G.get(this);
        if (t10 == c2361f) {
            return null;
        }
        return t10;
    }

    @Override // ac.s
    public boolean i(T value) {
        setValue(value);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.AbstractC2285a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public K k() {
        return new K();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.AbstractC2285a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public K[] l(int size) {
        return new K[size];
    }

    @Override // ac.t
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) C2298n.f30783a;
        }
        s(null, t10);
    }
}
