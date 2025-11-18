package Zb;

import Xb.AbstractC1825a;
import Xb.C0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.JobCancellationException;
import oa.C4153F;
import oa.InterfaceC4156a;
import ta.InterfaceC4588d;

/* compiled from: ChannelCoroutine.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\u00020\u00032\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00030\u0011H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0018\u00010$j\u0004\u0018\u0001`%¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010)R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0001\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b0\u0010,\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"LZb/h;", "E", "LXb/a;", "Loa/F;", "LZb/g;", "Lta/g;", "parentContext", "_channel", "", "initParentJob", "active", "<init>", "(Lta/g;LZb/g;ZZ)V", "", "cause", "j", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "c", "(LBa/l;)V", "LZb/i;", "iterator", "()LZb/i;", "element", "h", "(Ljava/lang/Object;)Z", "r", "(Lta/d;)Ljava/lang/Object;", "v", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "LZb/k;", "i", "()Ljava/lang/Object;", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "e", "(Ljava/util/concurrent/CancellationException;)V", "W", "(Ljava/lang/Throwable;)V", "LZb/g;", "f1", "()LZb/g;", "A", "()Z", "isClosedForSend", "t", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class h<E> extends AbstractC1825a<C4153F> implements g<E> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final g<E> _channel;

    public h(ta.g gVar, g<E> gVar2, boolean z10, boolean z11) {
        super(gVar, z10, z11);
        this._channel = gVar2;
    }

    @Override // Zb.w
    public boolean A() {
        return this._channel.A();
    }

    @Override // Xb.C0
    public void W(Throwable cause) {
        CancellationException cancellationExceptionU0 = C0.U0(this, cause, null, 1, null);
        this._channel.e(cancellationExceptionU0);
        U(cancellationExceptionU0);
    }

    @Override // Zb.w
    public void c(Ba.l<? super Throwable, C4153F> handler) {
        this._channel.c(handler);
    }

    @Override // Xb.C0, Xb.InterfaceC1867v0
    public final void e(CancellationException cause) {
        if (isCancelled()) {
            return;
        }
        if (cause == null) {
            cause = new JobCancellationException(b0(), null, this);
        }
        W(cause);
    }

    protected final g<E> f1() {
        return this._channel;
    }

    @Override // Zb.w
    @InterfaceC4156a
    public boolean h(E element) {
        return this._channel.h(element);
    }

    @Override // Zb.v
    public Object i() {
        return this._channel.i();
    }

    @Override // Zb.v
    public i<E> iterator() {
        return this._channel.iterator();
    }

    @Override // Zb.w
    public boolean j(Throwable cause) {
        return this._channel.j(cause);
    }

    @Override // Zb.v
    public Object r(InterfaceC4588d<? super E> interfaceC4588d) {
        return this._channel.r(interfaceC4588d);
    }

    @Override // Zb.w
    public Object v(E e10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return this._channel.v(e10, interfaceC4588d);
    }

    @Override // Zb.w
    public Object w(E element) {
        return this._channel.w(element);
    }

    public final g<E> t() {
        return this;
    }
}
