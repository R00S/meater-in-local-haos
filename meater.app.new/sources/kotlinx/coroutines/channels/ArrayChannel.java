package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10801m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C11032p;
import kotlinx.coroutines.C11045s0;
import kotlinx.coroutines.internal.Symbol;
import okhttp3.HttpUrl;

/* compiled from: ArrayChannel.kt */
@Metadata(m32266d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000BB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u00109\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b9\u00106R\u0014\u0010:\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0014\u0010;\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00106R\u0018\u0010>\u001a\u00060<j\u0002`=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@¨\u0006A"}, m32267d2 = {"Lkotlinx/coroutines/channels/ArrayChannel;", "E", HttpUrl.FRAGMENT_ENCODE_SET, "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "currentSize", "element", "enqueueElement", "(ILjava/lang/Object;)V", "Lkotlinx/coroutines/channels/Receive;", "receive", HttpUrl.FRAGMENT_ENCODE_SET, "enqueueReceiveInternal", "(Lkotlinx/coroutines/channels/Receive;)Z", "Lkotlinx/coroutines/channels/Send;", "send", HttpUrl.FRAGMENT_ENCODE_SET, "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "ensureCapacity", "(I)V", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "wasClosed", "onCancelIdempotent", "(Z)V", "pollInternal", "()Ljava/lang/Object;", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "updateBufferSize", "(I)Lkotlinx/coroutines/internal/Symbol;", HttpUrl.FRAGMENT_ENCODE_SET, "buffer", "[Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", "I", "head", "isBufferAlwaysEmpty", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isClosedForReceive", "isEmpty", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractChannel;"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.channels.d, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public class ArrayChannel<E> extends AbstractChannel<E> {

    /* renamed from: e */
    private final int f41660e;

    /* renamed from: f */
    private final BufferOverflow f41661f;

    /* renamed from: g */
    private final ReentrantLock f41662g;

    /* renamed from: h */
    private Object[] f41663h;

    /* renamed from: i */
    private int f41664i;
    private volatile /* synthetic */ int size;

    /* compiled from: ArrayChannel.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.channels.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41665a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f41665a = iArr;
        }
    }

    public ArrayChannel(int i2, BufferOverflow bufferOverflow, Function1<? super E, C10775u> function1) {
        super(function1);
        this.f41660e = i2;
        this.f41661f = bufferOverflow;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
        this.f41662g = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i2, 8)];
        C10801m.m38712m(objArr, C10912b.f41650a, 0, 0, 6, null);
        this.f41663h = objArr;
        this.size = 0;
    }

    /* renamed from: C */
    private final void m39242C(int i2, E e2) {
        if (i2 < this.f41660e) {
            m39243D(i2);
            Object[] objArr = this.f41663h;
            objArr[(this.f41664i + i2) % objArr.length] = e2;
            return;
        }
        if (C11045s0.m39681a()) {
            if (!(this.f41661f == BufferOverflow.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f41663h;
        int i3 = this.f41664i;
        objArr2[i3 % objArr2.length] = null;
        objArr2[(i2 + i3) % objArr2.length] = e2;
        this.f41664i = (i3 + 1) % objArr2.length;
    }

    /* renamed from: D */
    private final void m39243D(int i2) {
        Object[] objArr = this.f41663h;
        if (i2 >= objArr.length) {
            int iMin = Math.min(objArr.length * 2, this.f41660e);
            Object[] objArr2 = new Object[iMin];
            for (int i3 = 0; i3 < i2; i3++) {
                Object[] objArr3 = this.f41663h;
                objArr2[i3] = objArr3[(this.f41664i + i3) % objArr3.length];
            }
            C10801m.m38710k(objArr2, C10912b.f41650a, i2, iMin);
            this.f41663h = objArr2;
            this.f41664i = 0;
        }
    }

    /* renamed from: E */
    private final Symbol m39244E(int i2) {
        if (i2 < this.f41660e) {
            this.size = i2 + 1;
            return null;
        }
        int i3 = a.f41665a[this.f41661f.ordinal()];
        if (i3 == 1) {
            return C10912b.f41652c;
        }
        if (i3 == 2) {
            return C10912b.f41651b;
        }
        if (i3 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: f */
    protected String mo39232f() {
        return "(buffer:capacity=" + this.f41660e + ",size=" + this.size + ')';
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: m */
    protected Object mo39235m(E e2) {
        ReceiveOrClosed<E> receiveOrClosedMo39210p;
        Symbol symbolMo39220h;
        ReentrantLock reentrantLock = this.f41662g;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            Closed<?> closedM39233g = m39233g();
            if (closedM39233g != null) {
                return closedM39233g;
            }
            Symbol symbolM39244E = m39244E(i2);
            if (symbolM39244E != null) {
                return symbolM39244E;
            }
            if (i2 == 0) {
                do {
                    receiveOrClosedMo39210p = mo39210p();
                    if (receiveOrClosedMo39210p != null) {
                        if (receiveOrClosedMo39210p instanceof Closed) {
                            this.size = i2;
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
                this.size = i2;
                C10775u c10775u = C10775u.f41439a;
                reentrantLock.unlock();
                receiveOrClosedMo39210p.mo39219g(e2);
                return receiveOrClosedMo39210p.mo39266c();
            }
            m39242C(i2, e2);
            return C10912b.f41651b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: u */
    protected boolean mo39211u(Receive<? super E> receive) {
        ReentrantLock reentrantLock = this.f41662g;
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
        return this.size == 0;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: z */
    protected Object mo39216z() {
        ReentrantLock reentrantLock = this.f41662g;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object objM39233g = m39233g();
                if (objM39233g == null) {
                    objM39233g = C10912b.f41653d;
                }
                return objM39233g;
            }
            Object[] objArr = this.f41663h;
            int i3 = this.f41664i;
            Object obj = objArr[i3];
            Send send = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            Object f41659i = C10912b.f41653d;
            if (i2 == this.f41660e) {
                Send send2 = null;
                while (true) {
                    Send sendM39238q = m39238q();
                    if (sendM39238q == null) {
                        send = send2;
                        break;
                    }
                    C9801m.m32343c(sendM39238q);
                    Symbol symbolMo39241G = sendM39238q.mo39241G(null);
                    if (symbolMo39241G != null) {
                        if (C11045s0.m39681a()) {
                            if (!(symbolMo39241G == C11032p.f41866a)) {
                                throw new AssertionError();
                            }
                        }
                        f41659i = sendM39238q.getF41659i();
                        send = sendM39238q;
                        z = true;
                    } else {
                        sendM39238q.m39269H();
                        send2 = sendM39238q;
                    }
                }
            }
            if (f41659i != C10912b.f41653d && !(f41659i instanceof Closed)) {
                this.size = i2;
                Object[] objArr2 = this.f41663h;
                objArr2[(this.f41664i + i2) % objArr2.length] = f41659i;
            }
            this.f41664i = (this.f41664i + 1) % this.f41663h.length;
            C10775u c10775u = C10775u.f41439a;
            if (z) {
                C9801m.m32343c(send);
                send.mo39239E();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
