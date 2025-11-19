package Zb;

import Xb.InterfaceC1847l;
import cc.C2361F;
import cc.C2364I;
import kotlin.Metadata;
import kotlin.jvm.internal.C3860q;
import oa.C4153F;

/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\u001a3\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\"\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010%\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010'\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$\"\u0014\u0010+\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*\"\u0014\u0010/\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*\"\u0014\u00101\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010*\"\u0014\u00103\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010*\"\u0014\u00105\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010*\"\u0014\u00107\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010*\"\u0014\u00109\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010*\"\u001a\u0010=\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010<\"\u0014\u0010?\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010*\"\u0014\u0010A\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010*\"\u0014\u0010C\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010*\"\u0014\u0010E\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010*\"\u0014\u0010G\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010*\"\u0014\u0010I\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010*\"\u0014\u0010K\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010*¨\u0006L"}, d2 = {"E", "Lkotlin/reflect/KFunction2;", "", "LZb/m;", "y", "()LIa/h;", "id", "prev", "x", "(JLZb/m;)LZb/m;", "T", "LXb/l;", "value", "Lkotlin/Function1;", "", "Loa/F;", "onCancellation", "", "B", "(LXb/l;Ljava/lang/Object;LBa/l;)Z", "", "capacity", "A", "(I)J", "counter", "closeStatus", "w", "(JI)J", "pauseEB", "v", "(JZ)J", "", "a", "LZb/m;", "NULL_SEGMENT", "b", "I", "SEGMENT_SIZE", "c", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "Lcc/F;", "d", "Lcc/F;", "BUFFERED", "e", "IN_BUFFER", "f", "RESUMING_BY_RCV", "g", "RESUMING_BY_EB", "h", "POISONED", "i", "DONE_RCV", "j", "INTERRUPTED_SEND", "k", "INTERRUPTED_RCV", "l", "z", "()Lcc/F;", "CHANNEL_CLOSED", "m", "SUSPEND", "n", "SUSPEND_NO_WAITER", "o", "FAILED", "p", "NO_RECEIVE_RESULT", "q", "CLOSE_HANDLER_CLOSED", "r", "CLOSE_HANDLER_INVOKED", "s", "NO_CLOSE_CAUSE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final m<Object> f19676a = new m<>(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f19677b = C2364I.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f19678c = C2364I.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* renamed from: d, reason: collision with root package name */
    public static final C2361F f19679d = new C2361F("BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    private static final C2361F f19680e = new C2361F("SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    private static final C2361F f19681f = new C2361F("S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    private static final C2361F f19682g = new C2361F("RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    private static final C2361F f19683h = new C2361F("POISONED");

    /* renamed from: i, reason: collision with root package name */
    private static final C2361F f19684i = new C2361F("DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    private static final C2361F f19685j = new C2361F("INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    private static final C2361F f19686k = new C2361F("INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    private static final C2361F f19687l = new C2361F("CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    private static final C2361F f19688m = new C2361F("SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    private static final C2361F f19689n = new C2361F("SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    private static final C2361F f19690o = new C2361F("FAILED");

    /* renamed from: p, reason: collision with root package name */
    private static final C2361F f19691p = new C2361F("NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    private static final C2361F f19692q = new C2361F("CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    private static final C2361F f19693r = new C2361F("CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    private static final C2361F f19694s = new C2361F("NO_CLOSE_CAUSE");

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a<E> extends C3860q implements Ba.p<Long, m<E>, m<E>> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f19695B = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final m<E> c(long j10, m<E> mVar) {
            return f.x(j10, mVar);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return c(l10.longValue(), (m) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean B(InterfaceC1847l<? super T> interfaceC1847l, T t10, Ba.l<? super Throwable, C4153F> lVar) {
        Object objS = interfaceC1847l.S(t10, null, lVar);
        if (objS == null) {
            return false;
        }
        interfaceC1847l.T(objS);
        return true;
    }

    static /* synthetic */ boolean C(InterfaceC1847l interfaceC1847l, Object obj, Ba.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return B(interfaceC1847l, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> m<E> x(long j10, m<E> mVar) {
        return new m<>(j10, mVar, mVar.y(), 0);
    }

    public static final <E> Ia.h<m<E>> y() {
        return a.f19695B;
    }

    public static final C2361F z() {
        return f19687l;
    }
}
