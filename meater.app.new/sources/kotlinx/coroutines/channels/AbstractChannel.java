package kotlinx.coroutines.channels;

import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10854c;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.C10863h;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BeforeResumeCancelHandler;
import kotlinx.coroutines.C11032p;
import kotlinx.coroutines.C11036q;
import kotlinx.coroutines.C11045s0;
import kotlinx.coroutines.C11049t0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.C10998q;
import kotlinx.coroutines.internal.C11006y;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;
import okhttp3.HttpUrl;

/* compiled from: AbstractChannel.kt */
@Metadata(m32266d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0007STUVWXYB'\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0016\u0010\u0019\u001a\u00020\u00062\u000e\u0010\u001a\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0004J\u0016\u0010\"\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0002J\u0016\u0010%\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0014JR\u0010&\u001a\u00020\n\"\u0004\b\u0001\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2$\u0010*\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+2\u0006\u0010.\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0002\u00100J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0086\u0002J\u0010\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\nH\u0014J/\u00105\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000208072\n\u00109\u001a\u0006\u0012\u0002\b\u00030:H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0006H\u0014J\b\u0010>\u001a\u00020\u0006H\u0014J\n\u0010?\u001a\u0004\u0018\u00010,H\u0014J\u0016\u0010@\u001a\u0004\u0018\u00010,2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)H\u0014J\u0011\u0010#\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010AJ\"\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bC\u0010AJ\u001f\u0010D\u001a\u0002H'\"\u0004\b\u0001\u0010'2\u0006\u0010.\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010EJR\u0010F\u001a\u00020\u0006\"\u0004\b\u0001\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010.\u001a\u00020/2$\u0010*\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+H\u0002ø\u0001\u0000¢\u0006\u0002\u0010GJ \u0010H\u001a\u00020\u00062\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030$H\u0002J\u0010\u0010K\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010LH\u0014J\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bN\u0010OJX\u0010P\u001a\u00020\u0006\"\u0004\b\u0001\u0010'* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010.\u001a\u00020/2\b\u0010Q\u001a\u0004\u0018\u00010,H\u0002ø\u0001\u0000¢\u0006\u0002\u0010RR\u0014\u0010\t\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00138Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, m32267d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "onUndeliveredElement", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "hasReceiveOrClosed", HttpUrl.FRAGMENT_ENCODE_SET, "getHasReceiveOrClosed", "()Z", "isBufferAlwaysEmpty", "isBufferEmpty", "isClosedForReceive", "isEmpty", "isEmptyImpl", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching", "cancel", "cause", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "cancelInternal$kotlinx_coroutines_core", "describeTryPoll", "Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "enqueueReceive", "receive", "Lkotlinx/coroutines/channels/Receive;", "enqueueReceiveInternal", "enqueueReceiveSelect", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/coroutines/Continuation;", "receiveMode", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)Z", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "onCancelIdempotent", "wasClosed", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "onReceiveDequeued", "onReceiveEnqueued", "pollInternal", "pollSelectInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveSuspend", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSelectReceiveMode", "(Lkotlinx/coroutines/selects/SelectInstance;ILkotlin/jvm/functions/Function2;)V", "removeReceiveOnCancel", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "takeFirstReceiveOrPeekClosed", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryStartBlockUnintercepted", "value", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/selects/SelectInstance;ILjava/lang/Object;)V", "Itr", "ReceiveElement", "ReceiveElementWithUndeliveredHandler", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryPollDesc", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.channels.a, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class AbstractChannel<E> extends AbstractSendChannel<E> implements Channel<E> {

    /* compiled from: AbstractChannel.kt */
    @Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m32267d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "E", "Lkotlinx/coroutines/channels/Receive;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", HttpUrl.FRAGMENT_ENCODE_SET, "receiveMode", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/CancellableContinuation;I)V", "completeResumeReceive", HttpUrl.FRAGMENT_ENCODE_SET, "value", "(Ljava/lang/Object;)V", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "resumeValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.channels.a$a */
    private static class a<E> extends Receive<E> {

        /* renamed from: i */
        public final CancellableContinuation<Object> f41644i;

        /* renamed from: j */
        public final int f41645j;

        public a(CancellableContinuation<Object> cancellableContinuation, int i2) {
            this.f41644i = cancellableContinuation;
            this.f41645j = i2;
        }

        @Override // kotlinx.coroutines.channels.Receive
        /* renamed from: G */
        public void mo39217G(Closed<?> closed) {
            if (this.f41645j != 1) {
                CancellableContinuation<Object> cancellableContinuation = this.f41644i;
                Result.a aVar = Result.f40714f;
                cancellableContinuation.resumeWith(Result.m37650a(C10568o.m37654a(closed.m39264K())));
            } else {
                CancellableContinuation<Object> cancellableContinuation2 = this.f41644i;
                ChannelResult channelResultM39250b = ChannelResult.m39250b(ChannelResult.f41673a.m39259a(closed.f41677i));
                Result.a aVar2 = Result.f40714f;
                cancellableContinuation2.resumeWith(Result.m37650a(channelResultM39250b));
            }
        }

        /* renamed from: H */
        public final Object m39218H(E e2) {
            return this.f41645j == 1 ? ChannelResult.m39250b(ChannelResult.f41673a.m39261c(e2)) : e2;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        /* renamed from: g */
        public void mo39219g(E e2) {
            this.f41644i.mo39637q(C11032p.f41866a);
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        /* renamed from: h */
        public Symbol mo39220h(E e2, LockFreeLinkedListNode.b bVar) {
            CancellableContinuation<Object> cancellableContinuation = this.f41644i;
            Object objM39218H = m39218H(e2);
            if (bVar != null) {
                throw null;
            }
            Object objMo39633g = cancellableContinuation.mo39633g(objM39218H, null, mo39221F(e2));
            if (objMo39633g == null) {
                return null;
            }
            if (C11045s0.m39681a()) {
                if (!(objMo39633g == C11032p.f41866a)) {
                    throw new AssertionError();
                }
            }
            if (bVar == null) {
                return C11032p.f41866a;
            }
            throw null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "ReceiveElement@" + C11049t0.m39688b(this) + "[receiveMode=" + this.f41645j + ']';
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010R&\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m32267d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElementWithUndeliveredHandler;", "E", "Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", HttpUrl.FRAGMENT_ENCODE_SET, "receiveMode", HttpUrl.FRAGMENT_ENCODE_SET, "onUndeliveredElement", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlinx/coroutines/CancellableContinuation;ILkotlin/jvm/functions/Function1;)V", "resumeOnCancellationFun", HttpUrl.FRAGMENT_ENCODE_SET, "value", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.channels.a$b */
    private static final class b<E> extends a<E> {

        /* renamed from: k */
        public final Function1<E, C10775u> f41646k;

        /* JADX WARN: Multi-variable type inference failed */
        public b(CancellableContinuation<Object> cancellableContinuation, int i2, Function1<? super E, C10775u> function1) {
            super(cancellableContinuation, i2);
            this.f41646k = function1;
        }

        @Override // kotlinx.coroutines.channels.Receive
        /* renamed from: F */
        public Function1<Throwable, C10775u> mo39221F(E e2) {
            return C11006y.m39591a(this.f41646k, e2, this.f41644i.getF41861l());
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m32267d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$RemoveReceiveOnCancel;", "Lkotlinx/coroutines/BeforeResumeCancelHandler;", "receive", "Lkotlinx/coroutines/channels/Receive;", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/Receive;)V", "invoke", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.channels.a$c */
    private final class c extends BeforeResumeCancelHandler {

        /* renamed from: f */
        private final Receive<?> f41647f;

        public c(Receive<?> receive) {
            this.f41647f = receive;
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* renamed from: b */
        public void mo39222b(Throwable th) {
            if (this.f41647f.mo39543z()) {
                AbstractChannel.this.m39214x();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
            mo39222b(th);
            return C10775u.f41439a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f41647f + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m32266d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, m32267d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", HttpUrl.FRAGMENT_ENCODE_SET, "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.channels.a$d */
    public static final class d extends LockFreeLinkedListNode.a {

        /* renamed from: d */
        final /* synthetic */ AbstractChannel f41649d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LockFreeLinkedListNode lockFreeLinkedListNode, AbstractChannel abstractChannel) {
            super(lockFreeLinkedListNode);
            this.f41649d = abstractChannel;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object mo39223g(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f41649d.mo39213w()) {
                return null;
            }
            return C10998q.m39544a();
        }
    }

    public AbstractChannel(Function1<? super E, C10775u> function1) {
        super(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    private final <R> Object m39203A(int i2, Continuation<? super R> continuation) {
        CancellableContinuationImpl cancellableContinuationImplM39674b = C11036q.m39674b(C10854c.m39044b(continuation));
        a aVar = this.f41657c == null ? new a(cancellableContinuationImplM39674b, i2) : new b(cancellableContinuationImplM39674b, i2, this.f41657c);
        while (true) {
            if (m39207t(aVar)) {
                m39204B(cancellableContinuationImplM39674b, aVar);
                break;
            }
            Object objMo39216z = mo39216z();
            if (objMo39216z instanceof Closed) {
                aVar.mo39217G((Closed) objMo39216z);
                break;
            }
            if (objMo39216z != C10912b.f41653d) {
                cancellableContinuationImplM39674b.mo39635n(aVar.m39218H(objMo39216z), aVar.mo39221F(objMo39216z));
                break;
            }
        }
        Object objM39664w = cancellableContinuationImplM39674b.m39664w();
        if (objM39664w == C10855d.m39045c()) {
            C10863h.m39060c(continuation);
        }
        return objM39664w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m39204B(CancellableContinuation<?> cancellableContinuation, Receive<?> receive) {
        cancellableContinuation.mo39632e(new c(receive));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final boolean m39207t(Receive<? super E> receive) {
        boolean zMo39211u = mo39211u(receive);
        if (zMo39211u) {
            m39215y();
        }
        return zMo39211u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: a */
    public final Object mo39208a() {
        Object objMo39216z = mo39216z();
        return objMo39216z == C10912b.f41653d ? ChannelResult.f41673a.m39260b() : objMo39216z instanceof Closed ? ChannelResult.f41673a.m39259a(((Closed) objMo39216z).f41677i) : ChannelResult.f41673a.m39261c(objMo39216z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: b */
    public final Object mo39209b(Continuation<? super E> continuation) {
        Object objMo39216z = mo39216z();
        return (objMo39216z == C10912b.f41653d || (objMo39216z instanceof Closed)) ? m39203A(0, continuation) : objMo39216z;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: p */
    protected ReceiveOrClosed<E> mo39210p() {
        ReceiveOrClosed<E> receiveOrClosedMo39210p = super.mo39210p();
        if (receiveOrClosedMo39210p != null && !(receiveOrClosedMo39210p instanceof Closed)) {
            m39214x();
        }
        return receiveOrClosedMo39210p;
    }

    /* renamed from: u */
    protected boolean mo39211u(Receive<? super E> receive) {
        int iM39553D;
        LockFreeLinkedListNode lockFreeLinkedListNodeM39559v;
        if (!mo39212v()) {
            LockFreeLinkedListNode f41658d = getF41658d();
            d dVar = new d(receive, this);
            do {
                LockFreeLinkedListNode lockFreeLinkedListNodeM39559v2 = f41658d.m39559v();
                if (!(!(lockFreeLinkedListNodeM39559v2 instanceof Send))) {
                    return false;
                }
                iM39553D = lockFreeLinkedListNodeM39559v2.m39553D(receive, f41658d, dVar);
                if (iM39553D != 1) {
                }
            } while (iM39553D != 2);
            return false;
        }
        LockFreeLinkedListNode f41658d2 = getF41658d();
        do {
            lockFreeLinkedListNodeM39559v = f41658d2.m39559v();
            if (!(!(lockFreeLinkedListNodeM39559v instanceof Send))) {
                return false;
            }
        } while (!lockFreeLinkedListNodeM39559v.m39555l(receive, f41658d2));
        return true;
    }

    /* renamed from: v */
    protected abstract boolean mo39212v();

    /* renamed from: w */
    protected abstract boolean mo39213w();

    /* renamed from: x */
    protected void m39214x() {
    }

    /* renamed from: y */
    protected void m39215y() {
    }

    /* renamed from: z */
    protected Object mo39216z() {
        while (true) {
            Send sendM39238q = m39238q();
            if (sendM39238q == null) {
                return C10912b.f41653d;
            }
            Symbol symbolMo39241G = sendM39238q.mo39241G(null);
            if (symbolMo39241G != null) {
                if (C11045s0.m39681a()) {
                    if (!(symbolMo39241G == C11032p.f41866a)) {
                        throw new AssertionError();
                    }
                }
                sendM39238q.mo39239E();
                return sendM39238q.getF41659i();
            }
            sendM39238q.m39269H();
        }
    }
}
