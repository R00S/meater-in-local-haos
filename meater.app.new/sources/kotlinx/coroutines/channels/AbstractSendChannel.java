package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9800l0;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C11032p;
import kotlinx.coroutines.C11045s0;
import kotlinx.coroutines.C11049t0;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;
import okhttp3.HttpUrl;

/* compiled from: AbstractChannel.kt */
@Metadata(m32266d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u000006:\u0004defgB)\u0012 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u000e\u0012\u0002\b\u00030\u0011j\u0006\u0012\u0002\b\u0003`\u00122\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00032\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010!\u001a\u00020\b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b!\u0010#J)\u0010&\u001a\u00020\u00032\u0018\u0010%\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`$H\u0016¢\u0006\u0004\b&\u0010\u0007J\u0019\u0010'\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010.\u001a\u0006\u0012\u0002\b\u00030-H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u000201H\u0014¢\u0006\u0004\b2\u00103JX\u00109\u001a\u00020\u0003\"\u0004\b\u0001\u001042\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010-2\u0006\u0010\u0010\u001a\u00028\u00002(\u00108\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000107\u0012\u0006\u0012\u0004\u0018\u00010\u001a05H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010;J\u001d\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010<2\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b?\u0010;J\u0017\u0010@\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010<H\u0014¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010\u0018H\u0004¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ$\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030G2\u0006\u0010\u0010\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bH\u0010,J+\u0010J\u001a\u00020\u0003*\u0006\u0012\u0002\b\u0003072\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020D8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bL\u0010FR\u001a\u0010P\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0014\u0010S\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\bU\u0010TR\u0011\u0010V\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0014\u0010W\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010TR#\u0010[\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000060X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR.\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\\R\u001a\u0010^\u001a\u00020]8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010F\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006h"}, m32267d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel;", "E", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "close", "(Ljava/lang/Throwable;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "countQueueSize", "()I", "element", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/AddLastDesc;", "describeSendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "describeTryOffer", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "Lkotlinx/coroutines/channels/Send;", "send", HttpUrl.FRAGMENT_ENCODE_SET, "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Closed;", "closed", "helpClose", "(Lkotlinx/coroutines/channels/Closed;)V", "helpCloseAndGetSendException", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "(Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "offer", "(Ljava/lang/Object;)Z", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onClosedIdempotent", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendSuspend", "takeFirstReceiveOrPeekClosed", "()Lkotlinx/coroutines/channels/ReceiveOrClosed;", "takeFirstSendOrPeekClosed", "()Lkotlinx/coroutines/channels/Send;", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "trySend", "helpCloseAndResumeWithSendException", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "getBufferDebugString", "bufferDebugString", "getClosedForReceive", "()Lkotlinx/coroutines/channels/Closed;", "closedForReceive", "getClosedForSend", "closedForSend", "isBufferAlwaysFull", "()Z", "isBufferFull", "isClosedForSend", "isFullImpl", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueue", "()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueueDebugStateString", "queueDebugStateString", "SendBuffered", "SendBufferedDesc", "SendSelect", "TryOfferDesc", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.channels.c, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class AbstractSendChannel<E> implements SendChannel<E> {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41656b = AtomicReferenceFieldUpdater.newUpdater(AbstractSendChannel.class, Object.class, "onCloseHandler");

    /* renamed from: c */
    protected final Function1<E, C10775u> f41657c;

    /* renamed from: d */
    private final LockFreeLinkedListHead f41658d = new LockFreeLinkedListHead();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* compiled from: AbstractChannel.kt */
    @Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0012\u0010\u0003\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m32267d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "E", "Lkotlinx/coroutines/channels/Send;", "element", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "pollResult", HttpUrl.FRAGMENT_ENCODE_SET, "getPollResult", "()Ljava/lang/Object;", "completeResumeSend", HttpUrl.FRAGMENT_ENCODE_SET, "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.channels.c$a */
    public static final class a<E> extends Send {

        /* renamed from: i */
        public final E f41659i;

        public a(E e2) {
            this.f41659i = e2;
        }

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: E */
        public void mo39239E() {
        }

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: F, reason: from getter */
        public Object getF41659i() {
            return this.f41659i;
        }

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: G */
        public Symbol mo39241G(LockFreeLinkedListNode.b bVar) {
            Symbol symbol = C11032p.f41866a;
            if (bVar == null) {
                return symbol;
            }
            throw null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "SendBuffered@" + C11049t0.m39688b(this) + '(' + this.f41659i + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractSendChannel(Function1<? super E, C10775u> function1) {
        this.f41657c = function1;
    }

    /* renamed from: e */
    private final int m39225e() {
        LockFreeLinkedListHead lockFreeLinkedListHead = this.f41658d;
        int i2 = 0;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM39558r = (LockFreeLinkedListNode) lockFreeLinkedListHead.m39557q(); !C9801m.m32341a(lockFreeLinkedListNodeM39558r, lockFreeLinkedListHead); lockFreeLinkedListNodeM39558r = lockFreeLinkedListNodeM39558r.m39558r()) {
            if (lockFreeLinkedListNodeM39558r instanceof LockFreeLinkedListNode) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: i */
    private final String m39226i() {
        String string;
        LockFreeLinkedListNode lockFreeLinkedListNodeM39558r = this.f41658d.m39558r();
        if (lockFreeLinkedListNodeM39558r == this.f41658d) {
            return "EmptyQueue";
        }
        if (lockFreeLinkedListNodeM39558r instanceof Closed) {
            string = lockFreeLinkedListNodeM39558r.toString();
        } else if (lockFreeLinkedListNodeM39558r instanceof Receive) {
            string = "ReceiveQueued";
        } else if (lockFreeLinkedListNodeM39558r instanceof Send) {
            string = "SendQueued";
        } else {
            string = "UNEXPECTED:" + lockFreeLinkedListNodeM39558r;
        }
        LockFreeLinkedListNode lockFreeLinkedListNodeM39559v = this.f41658d.m39559v();
        if (lockFreeLinkedListNodeM39559v == lockFreeLinkedListNodeM39558r) {
            return string;
        }
        String str = string + ",queueSize=" + m39225e();
        if (!(lockFreeLinkedListNodeM39559v instanceof Closed)) {
            return str;
        }
        return str + ",closedForSend=" + lockFreeLinkedListNodeM39559v;
    }

    /* renamed from: j */
    private final void m39227j(Closed<?> closed) {
        Object objM39535b = InlineList.m39535b(null, 1, null);
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNodeM39559v = closed.m39559v();
            Receive receive = lockFreeLinkedListNodeM39559v instanceof Receive ? (Receive) lockFreeLinkedListNodeM39559v : null;
            if (receive == null) {
                break;
            } else if (receive.mo39543z()) {
                objM39535b = InlineList.m39536c(objM39535b, receive);
            } else {
                receive.m39560w();
            }
        }
        if (objM39535b != null) {
            if (objM39535b instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objM39535b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((Receive) arrayList.get(size)).mo39217G(closed);
                }
            } else {
                ((Receive) objM39535b).mo39217G(closed);
            }
        }
        m39236n(closed);
    }

    /* renamed from: k */
    private final Throwable m39228k(Closed<?> closed) {
        m39227j(closed);
        return closed.m39265L();
    }

    /* renamed from: l */
    private final void m39229l(Throwable th) {
        Symbol symbol;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (symbol = C10912b.f41655f) || !f41656b.compareAndSet(this, obj, symbol)) {
            return;
        }
        ((Function1) C9800l0.m32330e(obj, 1)).invoke(th);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: c */
    public boolean mo39230c(Throwable th) {
        boolean z;
        Closed<?> closed = new Closed<>(th);
        LockFreeLinkedListNode lockFreeLinkedListNode = this.f41658d;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNodeM39559v = lockFreeLinkedListNode.m39559v();
            z = true;
            if (!(!(lockFreeLinkedListNodeM39559v instanceof Closed))) {
                z = false;
                break;
            }
            if (lockFreeLinkedListNodeM39559v.m39555l(closed, lockFreeLinkedListNode)) {
                break;
            }
        }
        if (!z) {
            closed = (Closed) this.f41658d.m39559v();
        }
        m39227j(closed);
        if (z) {
            m39229l(th);
        }
        return z;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: d */
    public final Object mo39231d(E e2) {
        Object objMo39235m = mo39235m(e2);
        if (objMo39235m == C10912b.f41651b) {
            return ChannelResult.f41673a.m39261c(C10775u.f41439a);
        }
        if (objMo39235m == C10912b.f41652c) {
            Closed<?> closedM39233g = m39233g();
            return closedM39233g == null ? ChannelResult.f41673a.m39260b() : ChannelResult.f41673a.m39259a(m39228k(closedM39233g));
        }
        if (objMo39235m instanceof Closed) {
            return ChannelResult.f41673a.m39259a(m39228k((Closed) objMo39235m));
        }
        throw new IllegalStateException(("trySend returned " + objMo39235m).toString());
    }

    /* renamed from: f */
    protected String mo39232f() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: g */
    protected final Closed<?> m39233g() {
        LockFreeLinkedListNode lockFreeLinkedListNodeM39559v = this.f41658d.m39559v();
        Closed<?> closed = lockFreeLinkedListNodeM39559v instanceof Closed ? (Closed) lockFreeLinkedListNodeM39559v : null;
        if (closed == null) {
            return null;
        }
        m39227j(closed);
        return closed;
    }

    /* renamed from: h, reason: from getter */
    protected final LockFreeLinkedListHead getF41658d() {
        return this.f41658d;
    }

    /* renamed from: m */
    protected Object mo39235m(E e2) {
        ReceiveOrClosed<E> receiveOrClosedMo39210p;
        Symbol symbolMo39220h;
        do {
            receiveOrClosedMo39210p = mo39210p();
            if (receiveOrClosedMo39210p == null) {
                return C10912b.f41652c;
            }
            symbolMo39220h = receiveOrClosedMo39210p.mo39220h(e2, null);
        } while (symbolMo39220h == null);
        if (C11045s0.m39681a()) {
            if (!(symbolMo39220h == C11032p.f41866a)) {
                throw new AssertionError();
            }
        }
        receiveOrClosedMo39210p.mo39219g(e2);
        return receiveOrClosedMo39210p.mo39266c();
    }

    /* renamed from: n */
    protected void m39236n(LockFreeLinkedListNode lockFreeLinkedListNode) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    protected final ReceiveOrClosed<?> m39237o(E e2) {
        LockFreeLinkedListNode lockFreeLinkedListNodeM39559v;
        LockFreeLinkedListHead lockFreeLinkedListHead = this.f41658d;
        a aVar = new a(e2);
        do {
            lockFreeLinkedListNodeM39559v = lockFreeLinkedListHead.m39559v();
            if (lockFreeLinkedListNodeM39559v instanceof ReceiveOrClosed) {
                return (ReceiveOrClosed) lockFreeLinkedListNodeM39559v;
            }
        } while (!lockFreeLinkedListNodeM39559v.m39555l(aVar, lockFreeLinkedListHead));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.r] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected kotlinx.coroutines.channels.ReceiveOrClosed<E> mo39210p() {
        /*
            r4 = this;
            kotlinx.coroutines.internal.p r0 = r4.f41658d
        L2:
            java.lang.Object r1 = r0.m39557q()
            kotlinx.coroutines.internal.r r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 0
            if (r1 != r0) goto Ld
        Lb:
            r1 = r2
            goto L26
        Ld:
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r3 != 0) goto L12
            goto Lb
        L12:
            r2 = r1
            kotlinx.coroutines.channels.n r2 = (kotlinx.coroutines.channels.ReceiveOrClosed) r2
            boolean r2 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r2 == 0) goto L20
            boolean r2 = r1.mo39542y()
            if (r2 != 0) goto L20
            goto L26
        L20:
            kotlinx.coroutines.internal.r r2 = r1.m39552B()
            if (r2 != 0) goto L29
        L26:
            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.ReceiveOrClosed) r1
            return r1
        L29:
            r2.m39561x()
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractSendChannel.mo39210p():kotlinx.coroutines.channels.n");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r1 = null;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final kotlinx.coroutines.channels.Send m39238q() {
        /*
            r4 = this;
            kotlinx.coroutines.internal.p r0 = r4.f41658d
        L2:
            java.lang.Object r1 = r0.m39557q()
            kotlinx.coroutines.internal.r r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 0
            if (r1 != r0) goto Ld
        Lb:
            r1 = r2
            goto L26
        Ld:
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.Send
            if (r3 != 0) goto L12
            goto Lb
        L12:
            r2 = r1
            kotlinx.coroutines.channels.p r2 = (kotlinx.coroutines.channels.Send) r2
            boolean r2 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r2 == 0) goto L20
            boolean r2 = r1.mo39542y()
            if (r2 != 0) goto L20
            goto L26
        L20:
            kotlinx.coroutines.internal.r r2 = r1.m39552B()
            if (r2 != 0) goto L29
        L26:
            kotlinx.coroutines.channels.p r1 = (kotlinx.coroutines.channels.Send) r1
            return r1
        L29:
            r2.m39561x()
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractSendChannel.m39238q():kotlinx.coroutines.channels.p");
    }

    public String toString() {
        return C11049t0.m39687a(this) + '@' + C11049t0.m39688b(this) + '{' + m39226i() + '}' + mo39232f();
    }
}
