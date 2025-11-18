package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10775u;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.C10976d0;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Symbol;
import okhttp3.HttpUrl;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(m32266d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\t\u0012\u0004\u0012\u00028\u00000\u008a\u00012\t\u0012\u0004\u0012\u00028\u00000\u008b\u00012\u00060tj\u0002`uB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0012\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00112!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0018J\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010!J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\u0011H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010+J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001b\u00108\u001a\u0004\u0018\u00010\u000f2\b\u00105\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\n\u0018\u00010;j\u0004\u0018\u0001`<H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u00105\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020\u0011H\u0016¢\u0006\u0004\bB\u0010+J\u0011\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bD\u0010EJ8\u0010F\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u001fH\u0002¢\u0006\u0004\bH\u0010IJ8\u0010J\u001a\u00020\r2'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0002¢\u0006\u0004\bJ\u0010KJB\u0010L\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u00105\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0014¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020\u0011H\u0002¢\u0006\u0004\bT\u0010+J\u000f\u0010U\u001a\u00020\u001fH\u0001¢\u0006\u0004\bU\u0010IJ<\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00028\u00002#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\bW\u0010XJH\u0010Y\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042%\b\u0002\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bY\u0010ZJ \u0010]\u001a\u00020\u00112\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010)JZ\u0010`\u001a\u0004\u0018\u00010\b2\u0006\u00105\u001a\u00020^2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\b\u0010_\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\bb\u0010:J\u000f\u0010d\u001a\u00020NH\u0016¢\u0006\u0004\bd\u0010PJ\u000f\u0010e\u001a\u00020\u001fH\u0002¢\u0006\u0004\be\u0010IJ#\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010V\u001a\u00028\u00002\b\u0010_\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\be\u0010fJH\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010V\u001a\u00028\u00002\b\u0010_\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\be\u0010gJJ\u0010i\u001a\u0004\u0018\u00010h2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010_\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bi\u0010jJ\u0019\u0010l\u001a\u0004\u0018\u00010\b2\u0006\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u001fH\u0002¢\u0006\u0004\bn\u0010IJ\u001b\u0010p\u001a\u00020\u0011*\u00020o2\u0006\u0010V\u001a\u00028\u0000H\u0016¢\u0006\u0004\bp\u0010qJ\u001b\u0010r\u001a\u00020\u0011*\u00020o2\u0006\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\br\u0010sR\u001c\u0010x\u001a\n\u0018\u00010tj\u0004\u0018\u0001`u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001a\u0010z\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0080\u0004¢\u0006\r\n\u0004\b\u0003\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0081\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010IR\u0016\u0010\u0082\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010IR\u0016\u0010\u0083\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010IR\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u00105\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010:R\u0016\u0010\u0088\u0001\u001a\u00020N8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0089\u0001"}, m32267d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlin/coroutines/Continuation;", "delegate", HttpUrl.FRAGMENT_ENCODE_SET, "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", HttpUrl.FRAGMENT_ENCODE_SET, "proposedUpdate", HttpUrl.FRAGMENT_ENCODE_SET, "alreadyResumedError", "(Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlinx/coroutines/CancelHandler;", "handler", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "callCancelHandler", "(Lkotlinx/coroutines/CancelHandler;Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "block", "callCancelHandlerSafely", "(Lkotlin/jvm/functions/Function0;)V", "onCancellation", "callOnCancellation", HttpUrl.FRAGMENT_ENCODE_SET, "cancel", "(Ljava/lang/Throwable;)Z", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "cancelLater", "token", "completeResume", "(Ljava/lang/Object;)V", "detachChild$kotlinx_coroutines_core", "()V", "detachChild", "detachChildIfNonResuable", "mode", "dispatchResume", "(I)V", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "state", "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getExceptionalResult", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "initCancellability", "Lkotlinx/coroutines/DisposableHandle;", "installParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "(Lkotlin/jvm/functions/Function1;)V", "isReusable", "()Z", "makeCancelHandler", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/CancelHandler;", "multipleHandlersError", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", HttpUrl.FRAGMENT_ENCODE_SET, "nameString", "()Ljava/lang/String;", "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "releaseClaimedReusableContinuation", "resetStateReusable", "value", "resume", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeImpl", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lkotlin/Result;", "result", "resumeWith", "Lkotlinx/coroutines/NotCompleted;", "idempotent", "resumedState", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "takeState$kotlinx_coroutines_core", "takeState", "toString", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/Symbol;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "trySuspend", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "isActive", "isCancelled", "isCompleted", "parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "getState$kotlinx_coroutines_core", "getStateDebugRepresentation", "stateDebugRepresentation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.o, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame {

    /* renamed from: i */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f41858i = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decision");

    /* renamed from: j */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41859j = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: k */
    private final Continuation<T> f41860k;

    /* renamed from: l */
    private final CoroutineContext f41861l;

    /* renamed from: m */
    private DisposableHandle f41862m;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(Continuation<? super T> continuation, int i2) {
        super(i2);
        this.f41860k = continuation;
        if (C11045s0.m39681a()) {
            if (!(i2 != -1)) {
                throw new AssertionError();
            }
        }
        this.f41861l = continuation.getF41861l();
        this._decision = 0;
        this._state = Active.f41680f;
    }

    /* renamed from: A */
    private final DisposableHandle m39641A() {
        Job job = (Job) getF41861l().get(Job.f41899e);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleM39715d = Job.a.m39715d(job, true, false, new ChildContinuation(this), 2, null);
        this.f41862m = disposableHandleM39715d;
        return disposableHandleM39715d;
    }

    /* renamed from: C */
    private final boolean m39642C() {
        return C10895c1.m39141c(this.f41578h) && ((DispatchedContinuation) this.f41860k).m39478p();
    }

    /* renamed from: D */
    private final CancelHandler m39643D(Function1<? super Throwable, C10775u> function1) {
        return function1 instanceof CancelHandler ? (CancelHandler) function1 : new InvokeOnCancel(function1);
    }

    /* renamed from: E */
    private final void m39644E(Function1<? super Throwable, C10775u> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    /* renamed from: H */
    private final void m39645H() {
        Throwable thM39481t;
        Continuation<T> continuation = this.f41860k;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation == null || (thM39481t = dispatchedContinuation.m39481t(this)) == null) {
            return;
        }
        m39663s();
        mo39636o(thM39481t);
    }

    /* renamed from: J */
    private final void m39646J(Object obj, int i2, Function1<? super Throwable, C10775u> function1) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof NotCompleted)) {
                if (obj2 instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) obj2;
                    if (cancelledContinuation.m39680c()) {
                        if (function1 != null) {
                            m39662p(function1, cancelledContinuation.f41577b);
                            return;
                        }
                        return;
                    }
                }
                m39652k(obj);
                throw new KotlinNothingValueException();
            }
        } while (!f41859j.compareAndSet(this, obj2, m39648L((NotCompleted) obj2, obj, i2, function1, null)));
        m39655t();
        m39656u(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    static /* synthetic */ void m39647K(CancellableContinuationImpl cancellableContinuationImpl, Object obj, int i2, Function1 function1, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        cancellableContinuationImpl.m39646J(obj, i2, function1);
    }

    /* renamed from: L */
    private final Object m39648L(NotCompleted notCompleted, Object obj, int i2, Function1<? super Throwable, C10775u> function1, Object obj2) {
        if (obj instanceof CompletedExceptionally) {
            if (C11045s0.m39681a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!C11045s0.m39681a()) {
                return obj;
            }
            if (function1 == null) {
                return obj;
            }
            throw new AssertionError();
        }
        if (!C10895c1.m39140b(i2) && obj2 == null) {
            return obj;
        }
        if (function1 != null || (((notCompleted instanceof CancelHandler) && !(notCompleted instanceof BeforeResumeCancelHandler)) || obj2 != null)) {
            return new CompletedContinuation(obj, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, function1, obj2, null, 16, null);
        }
        return obj;
    }

    /* renamed from: M */
    private final boolean m39649M() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f41858i.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: N */
    private final Symbol m39650N(Object obj, Object obj2, Function1<? super Throwable, C10775u> function1) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof NotCompleted)) {
                if (!(obj3 instanceof CompletedContinuation) || obj2 == null) {
                    return null;
                }
                CompletedContinuation completedContinuation = (CompletedContinuation) obj3;
                if (completedContinuation.idempotentResume != obj2) {
                    return null;
                }
                if (!C11045s0.m39681a() || C9801m.m32341a(completedContinuation.result, obj)) {
                    return C11032p.f41866a;
                }
                throw new AssertionError();
            }
        } while (!f41859j.compareAndSet(this, obj3, m39648L((NotCompleted) obj3, obj, this.f41578h, function1, obj2)));
        m39655t();
        return C11032p.f41866a;
    }

    /* renamed from: O */
    private final boolean m39651O() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f41858i.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: k */
    private final Void m39652k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: l */
    private final void m39653l(Function1<? super Throwable, C10775u> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            C11017l0.m39620a(getF41861l(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: r */
    private final boolean m39654r(Throwable th) {
        if (m39642C()) {
            return ((DispatchedContinuation) this.f41860k).m39479r(th);
        }
        return false;
    }

    /* renamed from: t */
    private final void m39655t() {
        if (m39642C()) {
            return;
        }
        m39663s();
    }

    /* renamed from: u */
    private final void m39656u(int i2) {
        if (m39649M()) {
            return;
        }
        C10895c1.m39139a(this, i2);
    }

    /* renamed from: y */
    private final String m39657y() {
        Object obj = get_state();
        return obj instanceof NotCompleted ? "Active" : obj instanceof CancelledContinuation ? "Cancelled" : "Completed";
    }

    /* renamed from: B */
    public boolean m39658B() {
        return !(get_state() instanceof NotCompleted);
    }

    /* renamed from: F */
    protected String mo39368F() {
        return "CancellableContinuation";
    }

    /* renamed from: G */
    public final void m39659G(Throwable th) {
        if (m39654r(th)) {
            return;
        }
        mo39636o(th);
        m39655t();
    }

    /* renamed from: I */
    public final boolean m39660I() {
        if (C11045s0.m39681a()) {
            if (!(this.f41578h == 2)) {
                throw new AssertionError();
            }
        }
        if (C11045s0.m39681a()) {
            if (!(this.f41862m != NonDisposableHandle.f41850f)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (C11045s0.m39681a() && !(!(obj instanceof NotCompleted))) {
            throw new AssertionError();
        }
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            m39663s();
            return false;
        }
        this._decision = 0;
        this._state = Active.f41680f;
        return true;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: a */
    public void mo39114a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof NotCompleted) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof CompletedExceptionally) {
                return;
            }
            if (obj2 instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj2;
                if (!(!completedContinuation.m39089c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (f41859j.compareAndSet(this, obj2, CompletedContinuation.m39087b(completedContinuation, null, null, null, null, th, 15, null))) {
                    completedContinuation.m39090d(this, th);
                    return;
                }
            } else if (f41859j.compareAndSet(this, obj2, new CompletedContinuation(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: b */
    public boolean mo39631b() {
        return get_state() instanceof NotCompleted;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: c */
    public final Continuation<T> mo39115c() {
        return this.f41860k;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: d */
    public Throwable mo39116d(Object obj) {
        Throwable thMo39116d = super.mo39116d(obj);
        if (thMo39116d == null) {
            return null;
        }
        Continuation<T> continuation = this.f41860k;
        return (C11045s0.m39684d() && (continuation instanceof CoroutineStackFrame)) ? C10976d0.m39462j(thMo39116d, (CoroutineStackFrame) continuation) : thMo39116d;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: e */
    public void mo39632e(Function1<? super Throwable, C10775u> function1) {
        CancelHandler cancelHandlerM39643D = m39643D(function1);
        while (true) {
            Object obj = this._state;
            if (obj instanceof Active) {
                if (f41859j.compareAndSet(this, obj, cancelHandlerM39643D)) {
                    return;
                }
            } else if (obj instanceof CancelHandler) {
                m39644E(function1, obj);
            } else {
                boolean z = obj instanceof CompletedExceptionally;
                if (z) {
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
                    if (!completedExceptionally.m39113b()) {
                        m39644E(function1, obj);
                    }
                    if (obj instanceof CancelledContinuation) {
                        if (!z) {
                            completedExceptionally = null;
                        }
                        m39653l(function1, completedExceptionally != null ? completedExceptionally.f41577b : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                    if (completedContinuation.cancelHandler != null) {
                        m39644E(function1, obj);
                    }
                    if (cancelHandlerM39643D instanceof BeforeResumeCancelHandler) {
                        return;
                    }
                    if (completedContinuation.m39089c()) {
                        m39653l(function1, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (f41859j.compareAndSet(this, obj, CompletedContinuation.m39087b(completedContinuation, null, cancelHandlerM39643D, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (cancelHandlerM39643D instanceof BeforeResumeCancelHandler) {
                        return;
                    }
                    if (f41859j.compareAndSet(this, obj, new CompletedContinuation(obj, cancelHandlerM39643D, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: f */
    public <T> T mo39117f(Object obj) {
        return obj instanceof CompletedContinuation ? (T) ((CompletedContinuation) obj).result : obj;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: g */
    public Object mo39633g(T t, Object obj, Function1<? super Throwable, C10775u> function1) {
        return m39650N(t, obj, function1);
    }

    @Override // kotlin.coroutines.p442j.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f41860k;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext, reason: from getter */
    public CoroutineContext getF41861l() {
        return this.f41861l;
    }

    @Override // kotlin.coroutines.p442j.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: h */
    public void mo39634h(CoroutineDispatcher coroutineDispatcher, T t) {
        Continuation<T> continuation = this.f41860k;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        m39647K(this, t, (dispatchedContinuation != null ? dispatchedContinuation.f41778j : null) == coroutineDispatcher ? 4 : this.f41578h, null, 4, null);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: j */
    public Object mo39119j() {
        return get_state();
    }

    /* renamed from: m */
    public final void m39661m(CancelHandler cancelHandler, Throwable th) {
        try {
            cancelHandler.mo39222b(th);
        } catch (Throwable th2) {
            C11017l0.m39620a(getF41861l(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: n */
    public void mo39635n(T t, Function1<? super Throwable, C10775u> function1) {
        m39646J(t, this.f41578h, function1);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: o */
    public boolean mo39636o(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            z = obj instanceof CancelHandler;
        } while (!f41859j.compareAndSet(this, obj, new CancelledContinuation(this, th, z)));
        CancelHandler cancelHandler = z ? (CancelHandler) obj : null;
        if (cancelHandler != null) {
            m39661m(cancelHandler, th);
        }
        m39655t();
        m39656u(this.f41578h);
        return true;
    }

    /* renamed from: p */
    public final void m39662p(Function1<? super Throwable, C10775u> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            C11017l0.m39620a(getF41861l(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: q */
    public void mo39637q(Object obj) {
        if (C11045s0.m39681a()) {
            if (!(obj == C11032p.f41866a)) {
                throw new AssertionError();
            }
        }
        m39656u(this.f41578h);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        m39647K(this, C10937e0.m39298c(result, this), this.f41578h, null, 4, null);
    }

    /* renamed from: s */
    public final void m39663s() {
        DisposableHandle disposableHandle = this.f41862m;
        if (disposableHandle == null) {
            return;
        }
        disposableHandle.mo39285k();
        this.f41862m = NonDisposableHandle.f41850f;
    }

    public String toString() {
        return mo39368F() + '(' + C11049t0.m39689c(this.f41860k) + "){" + m39657y() + "}@" + C11049t0.m39688b(this);
    }

    /* renamed from: v */
    public Throwable mo39369v(Job job) {
        return job.mo39357j();
    }

    /* renamed from: w */
    public final Object m39664w() {
        Job job;
        boolean zM39642C = m39642C();
        if (m39651O()) {
            if (this.f41862m == null) {
                m39641A();
            }
            if (zM39642C) {
                m39645H();
            }
            return C10855d.m39045c();
        }
        if (zM39642C) {
            m39645H();
        }
        Object obj = get_state();
        if (obj instanceof CompletedExceptionally) {
            Throwable th = ((CompletedExceptionally) obj).f41577b;
            if (C11045s0.m39684d()) {
                throw C10976d0.m39462j(th, this);
            }
            throw th;
        }
        if (!C10895c1.m39140b(this.f41578h) || (job = (Job) getF41861l().get(Job.f41899e)) == null || job.mo39083b()) {
            return mo39117f(obj);
        }
        CancellationException cancellationExceptionMo39357j = job.mo39357j();
        mo39114a(obj, cancellationExceptionMo39357j);
        if (C11045s0.m39684d()) {
            throw C10976d0.m39462j(cancellationExceptionMo39357j, this);
        }
        throw cancellationExceptionMo39357j;
    }

    /* renamed from: x, reason: from getter */
    public final Object get_state() {
        return this._state;
    }

    /* renamed from: z */
    public void m39666z() {
        DisposableHandle disposableHandleM39641A = m39641A();
        if (disposableHandleM39641A != null && m39658B()) {
            disposableHandleM39641A.mo39285k();
            this.f41862m = NonDisposableHandle.f41850f;
        }
    }
}
