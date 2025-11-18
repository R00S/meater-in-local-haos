package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C11032p;
import kotlinx.coroutines.C11045s0;
import kotlinx.coroutines.internal.C11006y;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import okhttp3.HttpUrl;

/* compiled from: ConflatedChannel.kt */
@Metadata(m32266d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0018\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0014J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\rH\u0014J\n\u0010$\u001a\u0004\u0018\u00010\u0017H\u0014J\u0016\u0010%\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m32267d2 = {"Lkotlinx/coroutines/channels/ConflatedChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "bufferDebugString", HttpUrl.FRAGMENT_ENCODE_SET, "getBufferDebugString", "()Ljava/lang/String;", "isBufferAlwaysEmpty", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isEmpty", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "value", HttpUrl.FRAGMENT_ENCODE_SET, "enqueueReceiveInternal", "receive", "Lkotlinx/coroutines/channels/Receive;", "offerInternal", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotent", "wasClosed", "pollInternal", "pollSelectInternal", "updateValueLocked", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.channels.j, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public class ConflatedChannel<E> extends AbstractChannel<E> {

    /* renamed from: e */
    private final ReentrantLock f41678e;

    /* renamed from: f */
    private Object f41679f;

    public ConflatedChannel(Function1<? super E, C10775u> function1) {
        super(function1);
        this.f41678e = new ReentrantLock();
        this.f41679f = C10912b.f41650a;
    }

    /* renamed from: C */
    private final UndeliveredElementException m39267C(Object obj) {
        Function1<E, C10775u> function1;
        Object obj2 = this.f41679f;
        UndeliveredElementException undeliveredElementExceptionM39594d = null;
        if (obj2 != C10912b.f41650a && (function1 = this.f41657c) != null) {
            undeliveredElementExceptionM39594d = C11006y.m39594d(function1, obj2, null, 2, null);
        }
        this.f41679f = obj;
        return undeliveredElementExceptionM39594d;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: f */
    protected String mo39232f() {
        ReentrantLock reentrantLock = this.f41678e;
        reentrantLock.lock();
        try {
            return "(value=" + this.f41679f + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: m */
    protected Object mo39235m(E e2) {
        ReceiveOrClosed<E> receiveOrClosedMo39210p;
        Symbol symbolMo39220h;
        ReentrantLock reentrantLock = this.f41678e;
        reentrantLock.lock();
        try {
            Closed<?> closedM39233g = m39233g();
            if (closedM39233g != null) {
                return closedM39233g;
            }
            if (this.f41679f == C10912b.f41650a) {
                do {
                    receiveOrClosedMo39210p = mo39210p();
                    if (receiveOrClosedMo39210p != null) {
                        if (receiveOrClosedMo39210p instanceof Closed) {
                            return receiveOrClosedMo39210p;
                        }
                        C9801m.m32343c(receiveOrClosedMo39210p);
                        symbolMo39220h = receiveOrClosedMo39210p.mo39220h(e2, null);
                    }
                } while (symbolMo39220h == null);
                if (C11045s0.m39681a()) {
                    if (!(symbolMo39220h == C11032p.f41866a)) {
                        throw new AssertionError();
                    }
                }
                C10775u c10775u = C10775u.f41439a;
                reentrantLock.unlock();
                receiveOrClosedMo39210p.mo39219g(e2);
                return receiveOrClosedMo39210p.mo39266c();
            }
            UndeliveredElementException undeliveredElementExceptionM39267C = m39267C(e2);
            if (undeliveredElementExceptionM39267C == null) {
                return C10912b.f41651b;
            }
            throw undeliveredElementExceptionM39267C;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: u */
    protected boolean mo39211u(Receive<? super E> receive) {
        ReentrantLock reentrantLock = this.f41678e;
        reentrantLock.lock();
        try {
            return super.mo39211u(receive);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: v */
    protected final boolean mo39212v() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: w */
    protected final boolean mo39213w() {
        ReentrantLock reentrantLock = this.f41678e;
        reentrantLock.lock();
        try {
            return this.f41679f == C10912b.f41650a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: z */
    protected Object mo39216z() {
        ReentrantLock reentrantLock = this.f41678e;
        reentrantLock.lock();
        try {
            Object obj = this.f41679f;
            Symbol symbol = C10912b.f41650a;
            if (obj != symbol) {
                this.f41679f = symbol;
                C10775u c10775u = C10775u.f41439a;
                return obj;
            }
            Object objM39233g = m39233g();
            if (objM39233g == null) {
                objM39233g = C10912b.f41653d;
            }
            return objM39233g;
        } finally {
            reentrantLock.unlock();
        }
    }
}
