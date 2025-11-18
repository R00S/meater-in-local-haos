package Xb;

import Xb.InterfaceC1845k;
import cc.AbstractC2358C;
import cc.C2361F;
import cc.C2379j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlinx.coroutines.CompletionHandlerException;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'JK\u0010-\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\"\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b-\u0010.J9\u0010/\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010*H\u0002¢\u0006\u0004\b/\u00100J;\u00102\u001a\u0004\u0018\u0001012\b\u0010)\u001a\u0004\u0018\u00010\u001e2\b\u0010,\u001a\u0004\u0018\u00010\u001e2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010*H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0002042\b\u0010)\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\rH\u0001¢\u0006\u0004\b:\u0010\u000fJ\u0011\u0010;\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\b;\u0010<J!\u0010>\u001a\u00020\u00162\b\u0010=\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b@\u0010\u0013J\u0017\u0010A\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bA\u0010BJ\u001f\u0010D\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020C2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bD\u0010EJ)\u0010F\u001a\u00020\u00162\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160*2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00102\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0011\u0010L\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\bL\u0010<J\u000f\u0010M\u001a\u00020\u0016H\u0000¢\u0006\u0004\bM\u00108J\u001d\u0010P\u001a\u00020\u00162\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000NH\u0016¢\u0006\u0004\bP\u0010!J-\u0010R\u001a\u00020\u00162\u0006\u0010Q\u001a\u00028\u00002\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010*H\u0016¢\u0006\u0004\bR\u0010SJ#\u0010U\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010T\u001a\u00020\tH\u0016¢\u0006\u0004\bU\u0010VJ)\u0010X\u001a\u00020\u00162\u0018\u0010\u001f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00160*j\u0002`WH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020CH\u0000¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\\\u00108J9\u0010]\u001a\u0004\u0018\u00010\u001e2\u0006\u0010Q\u001a\u00028\u00002\b\u0010,\u001a\u0004\u0018\u00010\u001e2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010*H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010\u0001\u001a\u00020\u00162\u0006\u0010_\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u0001\u0010!J\u001b\u0010a\u001a\u00020\u0016*\u00020`2\u0006\u0010Q\u001a\u00028\u0000H\u0016¢\u0006\u0004\ba\u0010bJ\u001f\u0010c\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bc\u0010dJ\u001b\u0010e\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020gH\u0014¢\u0006\u0004\bj\u0010iR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001a\u0010r\u001a\u00020n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010o\u001a\u0004\bp\u0010qR\u0016\u0010t\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010\u001dR\u0014\u0010v\u001a\u00020g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010iR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bw\u0010<R\u0014\u0010y\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010\u000fR\u001c\u0010|\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u000b\u0010~\u001a\u00020}8\u0002X\u0082\u0004R\u0014\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u007f8\u0002X\u0082\u0004R\u0014\u0010\u0081\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u007f8\u0002X\u0082\u0004¨\u0006\u0082\u0001"}, d2 = {"LXb/m;", "T", "LXb/W;", "LXb/l;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "LXb/Z0;", "Lta/d;", "delegate", "", "resumeMode", "<init>", "(Lta/d;I)V", "", "C", "()Z", "", "cause", "l", "(Ljava/lang/Throwable;)Z", "Lcc/C;", "segment", "Loa/F;", "k", "(Lcc/C;Ljava/lang/Throwable;)V", "Q", "O", "LXb/b0;", "y", "()LXb/b0;", "", "handler", "z", "(Ljava/lang/Object;)V", "state", "D", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mode", "o", "(I)V", "LXb/K0;", "proposedUpdate", "Lkotlin/Function1;", "onCancellation", "idempotent", "N", "(LXb/K0;Ljava/lang/Object;ILBa/l;Ljava/lang/Object;)Ljava/lang/Object;", "K", "(Ljava/lang/Object;ILBa/l;)V", "Lcc/F;", "P", "(Ljava/lang/Object;Ljava/lang/Object;LBa/l;)Lcc/F;", "", "h", "(Ljava/lang/Object;)Ljava/lang/Void;", "n", "()V", "x", "I", "g", "()Ljava/lang/Object;", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "M", "G", "(Ljava/lang/Throwable;)V", "LXb/k;", "i", "(LXb/k;Ljava/lang/Throwable;)V", "j", "(LBa/l;Ljava/lang/Throwable;)V", "LXb/v0;", "parent", "p", "(LXb/v0;)Ljava/lang/Throwable;", "r", "H", "Loa/q;", "result", "resumeWith", "value", "J", "(Ljava/lang/Object;LBa/l;)V", "index", "c", "(Lcc/C;I)V", "Lkotlinx/coroutines/CompletionHandler;", "R", "(LBa/l;)V", "A", "(LXb/k;)V", "m", "S", "(Ljava/lang/Object;Ljava/lang/Object;LBa/l;)Ljava/lang/Object;", "token", "LXb/E;", "F", "(LXb/E;Ljava/lang/Object;)V", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "E", "Lta/d;", "b", "()Lta/d;", "Lta/g;", "Lta/g;", "getContext", "()Lta/g;", "context", "q", "parentHandle", "t", "stateDebugRepresentation", "s", "B", "isCompleted", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1849m<T> extends W<T> implements InterfaceC1847l<T>, kotlin.coroutines.jvm.internal.e, Z0 {

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19092G = AtomicIntegerFieldUpdater.newUpdater(C1849m.class, "_decisionAndIndex$volatile");

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19093H = AtomicReferenceFieldUpdater.newUpdater(C1849m.class, Object.class, "_state$volatile");

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19094I = AtomicReferenceFieldUpdater.newUpdater(C1849m.class, Object.class, "_parentHandle$volatile");

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4588d<T> delegate;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final ta.g context;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C1849m(InterfaceC4588d<? super T> interfaceC4588d, int i10) {
        super(i10);
        this.delegate = interfaceC4588d;
        this.context = interfaceC4588d.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1831d.f19068B;
    }

    private final boolean C() {
        if (X.c(this.resumeMode)) {
            InterfaceC4588d<T> interfaceC4588d = this.delegate;
            C3862t.e(interfaceC4588d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C2379j) interfaceC4588d).m()) {
                return true;
            }
        }
        return false;
    }

    private final void D(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    private final void K(Object proposedUpdate, int resumeMode, Ba.l<? super Throwable, C4153F> onCancellation) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19093H;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof K0)) {
                if (obj instanceof C1855p) {
                    C1855p c1855p = (C1855p) obj;
                    if (c1855p.e()) {
                        if (onCancellation != null) {
                            j(onCancellation, c1855p.cause);
                            return;
                        }
                        return;
                    }
                }
                h(proposedUpdate);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.b.a(f19093H, this, obj, N((K0) obj, proposedUpdate, resumeMode, onCancellation, null)));
        n();
        o(resumeMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void L(C1849m c1849m, Object obj, int i10, Ba.l lVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        c1849m.K(obj, i10, lVar);
    }

    private final Object N(K0 state, Object proposedUpdate, int resumeMode, Ba.l<? super Throwable, C4153F> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof C1874z) {
            return proposedUpdate;
        }
        if (!X.b(resumeMode) && idempotent == null) {
            return proposedUpdate;
        }
        if (onCancellation == null && !(state instanceof InterfaceC1845k) && idempotent == null) {
            return proposedUpdate;
        }
        return new CompletedContinuation(proposedUpdate, state instanceof InterfaceC1845k ? (InterfaceC1845k) state : null, onCancellation, idempotent, null, 16, null);
    }

    private final boolean O() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19092G;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f19092G.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final C2361F P(Object proposedUpdate, Object idempotent, Ba.l<? super Throwable, C4153F> onCancellation) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19093H;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof K0)) {
                if ((obj instanceof CompletedContinuation) && idempotent != null && ((CompletedContinuation) obj).idempotentResume == idempotent) {
                    return C1851n.f19098a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f19093H, this, obj, N((K0) obj, proposedUpdate, this.resumeMode, onCancellation, idempotent)));
        n();
        return C1851n.f19098a;
    }

    private final boolean Q() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19092G;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f19092G.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void h(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    private final void k(AbstractC2358C<?> segment, Throwable cause) {
        int i10 = f19092G.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.s(i10, cause, getContext());
        } catch (Throwable th) {
            G.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    private final boolean l(Throwable cause) {
        if (!C()) {
            return false;
        }
        InterfaceC4588d<T> interfaceC4588d = this.delegate;
        C3862t.e(interfaceC4588d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C2379j) interfaceC4588d).n(cause);
    }

    private final void n() {
        if (C()) {
            return;
        }
        m();
    }

    private final void o(int mode) {
        if (O()) {
            return;
        }
        X.a(this, mode);
    }

    private final InterfaceC1828b0 q() {
        return (InterfaceC1828b0) f19094I.get(this);
    }

    private final String t() {
        Object objS = s();
        return objS instanceof K0 ? "Active" : objS instanceof C1855p ? "Cancelled" : "Completed";
    }

    private final InterfaceC1828b0 y() {
        InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) getContext().b(InterfaceC1867v0.INSTANCE);
        if (interfaceC1867v0 == null) {
            return null;
        }
        InterfaceC1828b0 interfaceC1828b0O = A0.o(interfaceC1867v0, true, false, new C1857q(this), 2, null);
        androidx.concurrent.futures.b.a(f19094I, this, null, interfaceC1828b0O);
        return interfaceC1828b0O;
    }

    private final void z(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19093H;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof C1831d)) {
                if (obj instanceof InterfaceC1845k ? true : obj instanceof AbstractC2358C) {
                    D(handler, obj);
                } else {
                    if (obj instanceof C1874z) {
                        C1874z c1874z = (C1874z) obj;
                        if (!c1874z.c()) {
                            D(handler, obj);
                        }
                        if (obj instanceof C1855p) {
                            if (!(obj instanceof C1874z)) {
                                c1874z = null;
                            }
                            Throwable th = c1874z != null ? c1874z.cause : null;
                            if (handler instanceof InterfaceC1845k) {
                                i((InterfaceC1845k) handler, th);
                                return;
                            } else {
                                C3862t.e(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                k((AbstractC2358C) handler, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj instanceof CompletedContinuation) {
                        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                        if (completedContinuation.cancelHandler != null) {
                            D(handler, obj);
                        }
                        if (handler instanceof AbstractC2358C) {
                            return;
                        }
                        C3862t.e(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        InterfaceC1845k interfaceC1845k = (InterfaceC1845k) handler;
                        if (completedContinuation.c()) {
                            i(interfaceC1845k, completedContinuation.cancelCause);
                            return;
                        } else {
                            if (androidx.concurrent.futures.b.a(f19093H, this, obj, CompletedContinuation.b(completedContinuation, null, interfaceC1845k, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (handler instanceof AbstractC2358C) {
                            return;
                        }
                        C3862t.e(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.b.a(f19093H, this, obj, new CompletedContinuation(obj, (InterfaceC1845k) handler, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (androidx.concurrent.futures.b.a(f19093H, this, obj, handler)) {
                return;
            }
        }
    }

    public final void A(InterfaceC1845k handler) {
        z(handler);
    }

    public boolean B() {
        return !(s() instanceof K0);
    }

    protected String E() {
        return "CancellableContinuation";
    }

    @Override // Xb.InterfaceC1847l
    public void F(E e10, T t10) {
        InterfaceC4588d<T> interfaceC4588d = this.delegate;
        C2379j c2379j = interfaceC4588d instanceof C2379j ? (C2379j) interfaceC4588d : null;
        L(this, t10, (c2379j != null ? c2379j.dispatcher : null) == e10 ? 4 : this.resumeMode, null, 4, null);
    }

    public final void G(Throwable cause) {
        if (l(cause)) {
            return;
        }
        M(cause);
        n();
    }

    public final void H() {
        Throwable thP;
        InterfaceC4588d<T> interfaceC4588d = this.delegate;
        C2379j c2379j = interfaceC4588d instanceof C2379j ? (C2379j) interfaceC4588d : null;
        if (c2379j == null || (thP = c2379j.p(this)) == null) {
            return;
        }
        m();
        M(thP);
    }

    public final boolean I() {
        Object obj = f19093H.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            m();
            return false;
        }
        f19092G.set(this, 536870911);
        f19093H.set(this, C1831d.f19068B);
        return true;
    }

    @Override // Xb.InterfaceC1847l
    public void J(T value, Ba.l<? super Throwable, C4153F> onCancellation) {
        K(value, this.resumeMode, onCancellation);
    }

    @Override // Xb.InterfaceC1847l
    public boolean M(Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19093H;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof K0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f19093H, this, obj, new C1855p(this, cause, (obj instanceof InterfaceC1845k) || (obj instanceof AbstractC2358C))));
        K0 k02 = (K0) obj;
        if (k02 instanceof InterfaceC1845k) {
            i((InterfaceC1845k) obj, cause);
        } else if (k02 instanceof AbstractC2358C) {
            k((AbstractC2358C) obj, cause);
        }
        n();
        o(this.resumeMode);
        return true;
    }

    @Override // Xb.InterfaceC1847l
    public void R(Ba.l<? super Throwable, C4153F> handler) {
        C1853o.c(this, new InterfaceC1845k.a(handler));
    }

    @Override // Xb.InterfaceC1847l
    public Object S(T value, Object idempotent, Ba.l<? super Throwable, C4153F> onCancellation) {
        return P(value, idempotent, onCancellation);
    }

    @Override // Xb.InterfaceC1847l
    public void T(Object token) {
        o(this.resumeMode);
    }

    @Override // Xb.W
    public void a(Object takenState, Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19093H;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof K0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C1874z) {
                return;
            }
            if (obj instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                if (completedContinuation.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (androidx.concurrent.futures.b.a(f19093H, this, obj, CompletedContinuation.b(completedContinuation, null, null, null, null, cause, 15, null))) {
                    completedContinuation.d(this, cause);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f19093H, this, obj, new CompletedContinuation(obj, null, null, null, cause, 14, null))) {
                return;
            }
        }
    }

    @Override // Xb.W
    public final InterfaceC4588d<T> b() {
        return this.delegate;
    }

    @Override // Xb.Z0
    public void c(AbstractC2358C<?> segment, int index) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19092G;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + index));
        z(segment);
    }

    @Override // Xb.W
    public Throwable d(Object state) {
        Throwable thD = super.d(state);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Xb.W
    public <T> T e(Object state) {
        return state instanceof CompletedContinuation ? (T) ((CompletedContinuation) state).result : state;
    }

    @Override // Xb.W
    public Object g() {
        return s();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        InterfaceC4588d<T> interfaceC4588d = this.delegate;
        if (interfaceC4588d instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) interfaceC4588d;
        }
        return null;
    }

    @Override // ta.InterfaceC4588d
    public ta.g getContext() {
        return this.context;
    }

    public final void i(InterfaceC1845k handler, Throwable cause) {
        try {
            handler.b(cause);
        } catch (Throwable th) {
            G.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    public final void j(Ba.l<? super Throwable, C4153F> onCancellation, Throwable cause) {
        try {
            onCancellation.invoke(cause);
        } catch (Throwable th) {
            G.a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th));
        }
    }

    public final void m() {
        InterfaceC1828b0 interfaceC1828b0Q = q();
        if (interfaceC1828b0Q == null) {
            return;
        }
        interfaceC1828b0Q.c();
        f19094I.set(this, J0.f19029B);
    }

    public Throwable p(InterfaceC1867v0 parent) {
        return parent.u();
    }

    public final Object r() {
        InterfaceC1867v0 interfaceC1867v0;
        boolean zC = C();
        if (Q()) {
            if (q() == null) {
                y();
            }
            if (zC) {
                H();
            }
            return C4696b.e();
        }
        if (zC) {
            H();
        }
        Object objS = s();
        if (objS instanceof C1874z) {
            throw ((C1874z) objS).cause;
        }
        if (!X.b(this.resumeMode) || (interfaceC1867v0 = (InterfaceC1867v0) getContext().b(InterfaceC1867v0.INSTANCE)) == null || interfaceC1867v0.a()) {
            return e(objS);
        }
        CancellationException cancellationExceptionU = interfaceC1867v0.u();
        a(objS, cancellationExceptionU);
        throw cancellationExceptionU;
    }

    @Override // ta.InterfaceC4588d
    public void resumeWith(Object result) {
        L(this, B.c(result, this), this.resumeMode, null, 4, null);
    }

    public final Object s() {
        return f19093H.get(this);
    }

    public String toString() {
        return E() + '(' + M.c(this.delegate) + "){" + t() + "}@" + M.b(this);
    }

    public void x() {
        InterfaceC1828b0 interfaceC1828b0Y = y();
        if (interfaceC1828b0Y != null && B()) {
            interfaceC1828b0Y.c();
            f19094I.set(this, J0.f19029B);
        }
    }
}
