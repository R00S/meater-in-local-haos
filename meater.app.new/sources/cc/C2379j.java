package cc;

import Xb.AbstractC1836f0;
import Xb.C1849m;
import Xb.CompletedWithCancellation;
import Xb.InterfaceC1847l;
import Xb.T0;
import Xb.W;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: DispatchedContinuation.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0010¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00028\u0000H\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00105\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b2\u00103\u0012\u0004\b4\u0010\u0010R\u0014\u00107\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u001a\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0014R\u0014\u0010'\u001a\u00020&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001c\u0010>\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0B8\u0002X\u0082\u0004¨\u0006D"}, d2 = {"Lcc/j;", "T", "LXb/W;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lta/d;", "LXb/E;", "dispatcher", "continuation", "<init>", "(LXb/E;Lta/d;)V", "", "m", "()Z", "Loa/F;", "h", "()V", "o", "LXb/m;", "i", "()LXb/m;", "LXb/l;", "", "p", "(LXb/l;)Ljava/lang/Throwable;", "cause", "n", "(Ljava/lang/Throwable;)Z", "", "g", "()Ljava/lang/Object;", "Loa/q;", "result", "resumeWith", "(Ljava/lang/Object;)V", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lta/g;", "context", "value", "j", "(Lta/g;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "E", "LXb/E;", "F", "Lta/d;", "G", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "H", "countOrElement", "k", "reusableCancellableContinuation", "getContext", "()Lta/g;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "b", "()Lta/d;", "delegate", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2379j<T> extends W<T> implements kotlin.coroutines.jvm.internal.e, InterfaceC4588d<T> {

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f31173I = AtomicReferenceFieldUpdater.newUpdater(C2379j.class, Object.class, "_reusableCancellableContinuation$volatile");

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final Xb.E dispatcher;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC4588d<T> continuation;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public Object _state;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public final Object countOrElement;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C2379j(Xb.E e10, InterfaceC4588d<? super T> interfaceC4588d) {
        super(-1);
        this.dispatcher = e10;
        this.continuation = interfaceC4588d;
        this._state = C2380k.f31178a;
        this.countOrElement = C2365J.b(getContext());
    }

    private final C1849m<?> k() {
        Object obj = f31173I.get(this);
        if (obj instanceof C1849m) {
            return (C1849m) obj;
        }
        return null;
    }

    @Override // Xb.W
    public void a(Object takenState, Throwable cause) {
        if (takenState instanceof CompletedWithCancellation) {
            ((CompletedWithCancellation) takenState).onCancellation.invoke(cause);
        }
    }

    @Override // Xb.W
    public Object g() {
        Object obj = this._state;
        this._state = C2380k.f31178a;
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        InterfaceC4588d<T> interfaceC4588d = this.continuation;
        if (interfaceC4588d instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) interfaceC4588d;
        }
        return null;
    }

    @Override // ta.InterfaceC4588d
    public ta.g getContext() {
        return this.continuation.getContext();
    }

    public final void h() {
        while (f31173I.get(this) == C2380k.f31179b) {
        }
    }

    public final C1849m<T> i() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31173I;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f31173I.set(this, C2380k.f31179b);
                return null;
            }
            if (obj instanceof C1849m) {
                if (androidx.concurrent.futures.b.a(f31173I, this, obj, C2380k.f31179b)) {
                    return (C1849m) obj;
                }
            } else if (obj != C2380k.f31179b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void j(ta.g context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.r0(context, this);
    }

    public final boolean m() {
        return f31173I.get(this) != null;
    }

    public final boolean n(Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31173I;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C2361F c2361f = C2380k.f31179b;
            if (C3862t.b(obj, c2361f)) {
                if (androidx.concurrent.futures.b.a(f31173I, this, c2361f, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f31173I, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void o() {
        h();
        C1849m<?> c1849mK = k();
        if (c1849mK != null) {
            c1849mK.m();
        }
    }

    public final Throwable p(InterfaceC1847l<?> continuation) {
        C2361F c2361f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31173I;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c2361f = C2380k.f31179b;
            if (obj != c2361f) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f31173I, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f31173I, this, c2361f, continuation));
        return null;
    }

    @Override // ta.InterfaceC4588d
    public void resumeWith(Object result) {
        ta.g context = this.continuation.getContext();
        Object objD = Xb.B.d(result, null, 1, null);
        if (this.dispatcher.v0(context)) {
            this._state = objD;
            this.resumeMode = 0;
            this.dispatcher.p0(context, this);
            return;
        }
        AbstractC1836f0 abstractC1836f0B = T0.f19045a.b();
        if (abstractC1836f0B.X0()) {
            this._state = objD;
            this.resumeMode = 0;
            abstractC1836f0B.O0(this);
            return;
        }
        abstractC1836f0B.S0(true);
        try {
            ta.g context2 = getContext();
            Object objC = C2365J.c(context2, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                C4153F c4153f = C4153F.f46609a;
                while (abstractC1836f0B.h1()) {
                }
            } finally {
                C2365J.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + Xb.M.c(this.continuation) + ']';
    }

    @Override // Xb.W
    public InterfaceC4588d<T> b() {
        return this;
    }
}
