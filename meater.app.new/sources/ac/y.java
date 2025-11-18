package ac;

import Xb.C1849m;
import Xb.C1853o;
import Xb.InterfaceC1828b0;
import cc.C2361F;
import java.util.Arrays;
import kotlin.AbstractC2285a;
import kotlin.AbstractC2287c;
import kotlin.C2286b;
import kotlin.InterfaceC2295k;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001CB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001c2\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J/\u0010,\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0002¢\u0006\u0004\b.\u0010\u0014J\u0019\u00100\u001a\u0004\u0018\u00010\u00052\u0006\u0010/\u001a\u00020\u0003H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0004\u0018\u00010\u00052\u0006\u00104\u001a\u00020\u0015H\u0002¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b7\u00108J3\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001090\u001c2\u0014\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001090\u001cH\u0002¢\u0006\u0004\b;\u0010<J\u001e\u0010@\u001a\u00020?2\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=H\u0096@¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bB\u0010\u0010J\u0018\u0010C\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@¢\u0006\u0004\bC\u0010#J\u000f\u0010D\u001a\u00020\u0015H\u0000¢\u0006\u0004\bD\u0010EJ%\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001090\u001c2\u0006\u0010F\u001a\u00020\u0015H\u0000¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0003H\u0014¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001c2\u0006\u0010K\u001a\u00020\u0007H\u0014¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0012H\u0016¢\u0006\u0004\bN\u0010\u0014J-\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000R2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\"R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR \u0010X\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010WR\u0016\u0010Y\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001aR\u0016\u0010Z\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010\u001aR\u0016\u0010\\\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\"R\u0016\u0010^\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\"R\u0014\u0010_\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010ER\u0014\u0010b\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010aR\u0014\u0010e\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010ER\u0014\u0010g\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010ER\u001a\u0010k\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bj\u0010\u0014\u001a\u0004\bh\u0010i¨\u0006l"}, d2 = {"Lac/y;", "T", "Lbc/a;", "Lac/A;", "Lac/s;", "", "Lbc/k;", "", "replay", "bufferCapacity", "LZb/d;", "onBufferOverflow", "<init>", "(IILZb/d;)V", "value", "", "(Ljava/lang/Object;)Z", "U", "Loa/F;", "G", "()V", "", "newHead", "D", "(J)V", "item", "J", "(Ljava/lang/Object;)V", "", "curBuffer", "curSize", "newSize", "S", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "I", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "Lac/y$a;", "emitter", "A", "(Lac/y$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "X", "(JJJJ)V", "B", "slot", "W", "(Lac/A;)Ljava/lang/Object;", "V", "(Lac/A;)J", "index", "O", "(J)Ljava/lang/Object;", "z", "(Lac/A;Lta/d;)Ljava/lang/Object;", "Lta/d;", "resumesIn", "K", "([Lta/d;)[Lta/d;", "Lac/f;", "collector", "", "b", "(Lac/f;Lta/d;)Ljava/lang/Object;", "i", "a", "Z", "()J", "oldIndex", "Y", "(J)[Lta/d;", "E", "()Lac/A;", "size", "F", "(I)[Lac/A;", "d", "Lta/g;", "context", "capacity", "Lac/e;", "e", "(Lta/g;ILZb/d;)Lac/e;", "H", "LZb/d;", "[Ljava/lang/Object;", "buffer", "replayIndex", "minCollectorIndex", "L", "bufferSize", "M", "queueSize", "head", "Q", "()I", "replaySize", "R", "totalSize", "bufferEndIndex", "P", "queueEndIndex", "N", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class y<T> extends AbstractC2285a<C1965A> implements s<T>, InterfaceC1970e, InterfaceC2295k<T> {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final int replay;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final int bufferCapacity;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Zb.d onBufferOverflow;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private Object[] buffer;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private long replayIndex;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private long minCollectorIndex;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private int bufferSize;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private int queueSize;

    /* compiled from: SharedFlow.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lac/y$a;", "LXb/b0;", "Lac/y;", "flow", "", "index", "", "value", "Lta/d;", "Loa/F;", "cont", "<init>", "(Lac/y;JLjava/lang/Object;Lta/d;)V", "c", "()V", "B", "Lac/y;", "C", "J", "D", "Ljava/lang/Object;", "E", "Lta/d;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a implements InterfaceC1828b0 {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        public final y<?> flow;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        public long index;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        public final Object value;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        public final InterfaceC4588d<C4153F> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(y<?> yVar, long j10, Object obj, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            this.flow = yVar;
            this.index = j10;
            this.value = obj;
            this.cont = interfaceC4588d;
        }

        @Override // Xb.InterfaceC1828b0
        public void c() {
            this.flow.A(this);
        }
    }

    /* compiled from: SharedFlow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20447a;

        static {
            int[] iArr = new int[Zb.d.values().length];
            try {
                iArr[Zb.d.f19650B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Zb.d.f19652D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Zb.d.f19651C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20447a = iArr;
        }
    }

    /* compiled from: SharedFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {382, 389, 392}, m = "collect$suspendImpl")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f20448B;

        /* renamed from: C, reason: collision with root package name */
        Object f20449C;

        /* renamed from: D, reason: collision with root package name */
        Object f20450D;

        /* renamed from: E, reason: collision with root package name */
        Object f20451E;

        /* renamed from: F, reason: collision with root package name */
        /* synthetic */ Object f20452F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ y<T> f20453G;

        /* renamed from: H, reason: collision with root package name */
        int f20454H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y<T> yVar, InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
            this.f20453G = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f20452F = obj;
            this.f20454H |= Integer.MIN_VALUE;
            return y.C(this.f20453G, null, this);
        }
    }

    public y(int i10, int i11, Zb.d dVar) {
        this.replay = i10;
        this.bufferCapacity = i11;
        this.onBufferOverflow = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(a emitter) {
        synchronized (this) {
            if (emitter.index < M()) {
                return;
            }
            Object[] objArr = this.buffer;
            C3862t.d(objArr);
            if (z.f(objArr, emitter.index) != emitter) {
                return;
            }
            z.g(objArr, emitter.index, z.f20455a);
            B();
            C4153F c4153f = C4153F.f46609a;
        }
    }

    private final void B() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            C3862t.d(objArr);
            while (this.queueSize > 0 && z.f(objArr, (M() + R()) - 1) == z.f20455a) {
                this.queueSize--;
                z.g(objArr, M() + R(), null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ <T> java.lang.Object C(ac.y<T> r8, ac.InterfaceC1971f<? super T> r9, ta.InterfaceC4588d<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.y.C(ac.y, ac.f, ta.d):java.lang.Object");
    }

    private final void D(long newHead) {
        AbstractC2287c[] abstractC2287cArr;
        if (((AbstractC2285a) this).nCollectors != 0 && (abstractC2287cArr = ((AbstractC2285a) this).slots) != null) {
            for (AbstractC2287c abstractC2287c : abstractC2287cArr) {
                if (abstractC2287c != null) {
                    C1965A c1965a = (C1965A) abstractC2287c;
                    long j10 = c1965a.index;
                    if (j10 >= 0 && j10 < newHead) {
                        c1965a.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    private final void G() {
        Object[] objArr = this.buffer;
        C3862t.d(objArr);
        z.g(objArr, M(), null);
        this.bufferSize--;
        long jM = M() + 1;
        if (this.replayIndex < jM) {
            this.replayIndex = jM;
        }
        if (this.minCollectorIndex < jM) {
            D(jM);
        }
    }

    static /* synthetic */ <T> Object H(y<T> yVar, T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        if (yVar.i(t10)) {
            return C4153F.f46609a;
        }
        Object objI = yVar.I(t10, interfaceC4588d);
        return objI == C4696b.e() ? objI : C4153F.f46609a;
    }

    private final Object I(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        InterfaceC4588d<C4153F>[] interfaceC4588dArrK;
        a aVar;
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        InterfaceC4588d<C4153F>[] interfaceC4588dArrK2 = C2286b.f30744a;
        synchronized (this) {
            try {
                if (T(t10)) {
                    C4172q.Companion companion = C4172q.INSTANCE;
                    c1849m.resumeWith(C4172q.a(C4153F.f46609a));
                    interfaceC4588dArrK = K(interfaceC4588dArrK2);
                    aVar = null;
                } else {
                    a aVar2 = new a(this, R() + M(), t10, c1849m);
                    J(aVar2);
                    this.queueSize++;
                    if (this.bufferCapacity == 0) {
                        interfaceC4588dArrK2 = K(interfaceC4588dArrK2);
                    }
                    interfaceC4588dArrK = interfaceC4588dArrK2;
                    aVar = aVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            C1853o.a(c1849m, aVar);
        }
        for (InterfaceC4588d<C4153F> interfaceC4588d2 : interfaceC4588dArrK) {
            if (interfaceC4588d2 != null) {
                C4172q.Companion companion2 = C4172q.INSTANCE;
                interfaceC4588d2.resumeWith(C4172q.a(C4153F.f46609a));
            }
        }
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR == C4696b.e() ? objR : C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Object item) {
        int iR = R();
        Object[] objArrS = this.buffer;
        if (objArrS == null) {
            objArrS = S(null, 0, 2);
        } else if (iR >= objArrS.length) {
            objArrS = S(objArrS, iR, objArrS.length * 2);
        }
        z.g(objArrS, M() + iR, item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final InterfaceC4588d<C4153F>[] K(InterfaceC4588d<C4153F>[] resumesIn) {
        AbstractC2287c[] abstractC2287cArr;
        C1965A c1965a;
        InterfaceC4588d<? super C4153F> interfaceC4588d;
        int length = resumesIn.length;
        if (((AbstractC2285a) this).nCollectors != 0 && (abstractC2287cArr = ((AbstractC2285a) this).slots) != null) {
            int length2 = abstractC2287cArr.length;
            int i10 = 0;
            resumesIn = resumesIn;
            while (i10 < length2) {
                AbstractC2287c abstractC2287c = abstractC2287cArr[i10];
                if (abstractC2287c != null && (interfaceC4588d = (c1965a = (C1965A) abstractC2287c).cont) != null && V(c1965a) >= 0) {
                    int length3 = resumesIn.length;
                    resumesIn = resumesIn;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(resumesIn, Math.max(2, resumesIn.length * 2));
                        C3862t.f(CopyOf, "copyOf(...)");
                        resumesIn = CopyOf;
                    }
                    resumesIn[length] = interfaceC4588d;
                    c1965a.cont = null;
                    length++;
                }
                i10++;
                resumesIn = resumesIn;
            }
        }
        return resumesIn;
    }

    private final long L() {
        return M() + this.bufferSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long M() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final Object O(long index) {
        Object[] objArr = this.buffer;
        C3862t.d(objArr);
        Object objF = z.f(objArr, index);
        return objF instanceof a ? ((a) objF).value : objF;
    }

    private final long P() {
        return M() + this.bufferSize + this.queueSize;
    }

    private final int Q() {
        return (int) ((M() + this.bufferSize) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] S(Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer == null) {
            return objArr;
        }
        long jM = M();
        for (int i10 = 0; i10 < curSize; i10++) {
            long j10 = i10 + jM;
            z.g(objArr, j10, z.f(curBuffer, j10));
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T(T value) {
        if (getNCollectors() == 0) {
            return U(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i10 = b.f20447a[this.onBufferOverflow.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        J(value);
        int i11 = this.bufferSize + 1;
        this.bufferSize = i11;
        if (i11 > this.bufferCapacity) {
            G();
        }
        if (Q() > this.replay) {
            X(this.replayIndex + 1, this.minCollectorIndex, L(), P());
        }
        return true;
    }

    private final boolean U(T value) {
        if (this.replay == 0) {
            return true;
        }
        J(value);
        int i10 = this.bufferSize + 1;
        this.bufferSize = i10;
        if (i10 > this.replay) {
            G();
        }
        this.minCollectorIndex = M() + this.bufferSize;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long V(C1965A slot) {
        long j10 = slot.index;
        if (j10 < L()) {
            return j10;
        }
        if (this.bufferCapacity <= 0 && j10 <= M() && this.queueSize != 0) {
            return j10;
        }
        return -1L;
    }

    private final Object W(C1965A slot) {
        Object obj;
        InterfaceC4588d<C4153F>[] interfaceC4588dArrY = C2286b.f30744a;
        synchronized (this) {
            try {
                long jV = V(slot);
                if (jV < 0) {
                    obj = z.f20455a;
                } else {
                    long j10 = slot.index;
                    Object objO = O(jV);
                    slot.index = jV + 1;
                    interfaceC4588dArrY = Y(j10);
                    obj = objO;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC4588d<C4153F> interfaceC4588d : interfaceC4588dArrY) {
            if (interfaceC4588d != null) {
                C4172q.Companion companion = C4172q.INSTANCE;
                interfaceC4588d.resumeWith(C4172q.a(C4153F.f46609a));
            }
        }
        return obj;
    }

    private final void X(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long jMin = Math.min(newMinCollectorIndex, newReplayIndex);
        for (long jM = M(); jM < jMin; jM++) {
            Object[] objArr = this.buffer;
            C3862t.d(objArr);
            z.g(objArr, jM, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - jMin);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
    }

    private final Object z(C1965A c1965a, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        synchronized (this) {
            try {
                if (V(c1965a) < 0) {
                    c1965a.cont = c1849m;
                } else {
                    C4172q.Companion companion = C4172q.INSTANCE;
                    c1849m.resumeWith(C4172q.a(C4153F.f46609a));
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR == C4696b.e() ? objR : C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.AbstractC2285a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C1965A k() {
        return new C1965A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.AbstractC2285a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public C1965A[] l(int size) {
        return new C1965A[size];
    }

    protected final T N() {
        Object[] objArr = this.buffer;
        C3862t.d(objArr);
        return (T) z.f(objArr, (this.replayIndex + Q()) - 1);
    }

    public final InterfaceC4588d<C4153F>[] Y(long oldIndex) {
        long j10;
        long j11;
        long j12;
        AbstractC2287c[] abstractC2287cArr;
        if (oldIndex > this.minCollectorIndex) {
            return C2286b.f30744a;
        }
        long jM = M();
        long j13 = this.bufferSize + jM;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j13++;
        }
        if (((AbstractC2285a) this).nCollectors != 0 && (abstractC2287cArr = ((AbstractC2285a) this).slots) != null) {
            for (AbstractC2287c abstractC2287c : abstractC2287cArr) {
                if (abstractC2287c != null) {
                    long j14 = ((C1965A) abstractC2287c).index;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (j13 <= this.minCollectorIndex) {
            return C2286b.f30744a;
        }
        long jL = L();
        int iMin = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (jL - j13))) : this.queueSize;
        InterfaceC4588d<C4153F>[] interfaceC4588dArr = C2286b.f30744a;
        long j15 = this.queueSize + jL;
        if (iMin > 0) {
            interfaceC4588dArr = new InterfaceC4588d[iMin];
            Object[] objArr = this.buffer;
            C3862t.d(objArr);
            long j16 = jL;
            int i10 = 0;
            while (true) {
                if (jL >= j15) {
                    j10 = j13;
                    j11 = j15;
                    break;
                }
                Object objF = z.f(objArr, jL);
                j10 = j13;
                C2361F c2361f = z.f20455a;
                if (objF != c2361f) {
                    C3862t.e(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j11 = j15;
                    interfaceC4588dArr[i10] = aVar.cont;
                    z.g(objArr, jL, c2361f);
                    z.g(objArr, j16, aVar.value);
                    j12 = 1;
                    j16++;
                    if (i11 >= iMin) {
                        break;
                    }
                    i10 = i11;
                } else {
                    j11 = j15;
                    j12 = 1;
                }
                jL += j12;
                j13 = j10;
                j15 = j11;
            }
            jL = j16;
        } else {
            j10 = j13;
            j11 = j15;
        }
        int i12 = (int) (jL - jM);
        long j17 = getNCollectors() == 0 ? jL : j10;
        long jMax = Math.max(this.replayIndex, jL - Math.min(this.replay, i12));
        if (this.bufferCapacity == 0 && jMax < j11) {
            Object[] objArr2 = this.buffer;
            C3862t.d(objArr2);
            if (C3862t.b(z.f(objArr2, jMax), z.f20455a)) {
                jL++;
                jMax++;
            }
        }
        X(jMax, j17, jL, j11);
        B();
        return !(interfaceC4588dArr.length == 0) ? K(interfaceC4588dArr) : interfaceC4588dArr;
    }

    public final long Z() {
        long j10 = this.replayIndex;
        if (j10 < this.minCollectorIndex) {
            this.minCollectorIndex = j10;
        }
        return j10;
    }

    @Override // ac.s, ac.InterfaceC1971f
    public Object a(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return H(this, t10, interfaceC4588d);
    }

    @Override // ac.x, ac.InterfaceC1970e
    public Object b(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<?> interfaceC4588d) {
        return C(this, interfaceC1971f, interfaceC4588d);
    }

    @Override // ac.s
    public void d() {
        synchronized (this) {
            X(L(), this.minCollectorIndex, L(), P());
            C4153F c4153f = C4153F.f46609a;
        }
    }

    @Override // kotlin.InterfaceC2295k
    public InterfaceC1970e<T> e(ta.g context, int capacity, Zb.d onBufferOverflow) {
        return z.e(this, context, capacity, onBufferOverflow);
    }

    @Override // ac.s
    public boolean i(T value) {
        int i10;
        boolean z10;
        InterfaceC4588d<C4153F>[] interfaceC4588dArrK = C2286b.f30744a;
        synchronized (this) {
            if (T(value)) {
                interfaceC4588dArrK = K(interfaceC4588dArrK);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (InterfaceC4588d<C4153F> interfaceC4588d : interfaceC4588dArrK) {
            if (interfaceC4588d != null) {
                C4172q.Companion companion = C4172q.INSTANCE;
                interfaceC4588d.resumeWith(C4172q.a(C4153F.f46609a));
            }
        }
        return z10;
    }
}
