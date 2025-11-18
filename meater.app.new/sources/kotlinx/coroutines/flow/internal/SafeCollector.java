package kotlinx.coroutines.flow.internal;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.C10863h;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C10539n;
import kotlinx.coroutines.C10884b2;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.HttpUrl;

/* compiled from: SafeCollector.kt */
@Metadata(m32266d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ%\u0010\u001a\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001cH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J \u0010$\u001a\u00020\u001c2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0&H\u0016ø\u0001\u0000¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0010H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m32267d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "collectContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collectContextSize", HttpUrl.FRAGMENT_ENCODE_SET, "completion", "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "lastEmissionContext", "checkContext", "currentContext", "previousContext", "value", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "uCont", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "exceptionTransparencyViolated", "exception", "Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.flow.internal.h, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class SafeCollector<T> extends ContinuationImpl implements FlowCollector<T>, CoroutineStackFrame {

    /* renamed from: f */
    public final FlowCollector<T> f41732f;

    /* renamed from: g */
    public final CoroutineContext f41733g;

    /* renamed from: h */
    public final int f41734h;

    /* renamed from: i */
    private CoroutineContext f41735i;

    /* renamed from: j */
    private Continuation<? super C10775u> f41736j;

    /* compiled from: SafeCollector.kt */
    @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "count", "<anonymous parameter 1>", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(ILkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Integer;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.flow.internal.h$a */
    static final class a extends Lambda implements Function2<Integer, CoroutineContext.b, Integer> {

        /* renamed from: f */
        public static final a f41737f = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final Integer m39393b(int i2, CoroutineContext.b bVar) {
            return Integer.valueOf(i2 + 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.b bVar) {
            return m39393b(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext) {
        super(NoOpContinuation.f41727f, EmptyCoroutineContext.f41531f);
        this.f41732f = flowCollector;
        this.f41733g = coroutineContext;
        this.f41734h = ((Number) coroutineContext.fold(0, a.f41737f)).intValue();
    }

    /* renamed from: i */
    private final void m39390i(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t) {
        if (coroutineContext2 instanceof DownstreamExceptionContext) {
            m39392k((DownstreamExceptionContext) coroutineContext2, t);
        }
        C10955j.m39396a(this, coroutineContext);
    }

    /* renamed from: j */
    private final Object m39391j(Continuation<? super C10775u> continuation, T t) {
        CoroutineContext f41861l = continuation.getF41861l();
        C10884b2.m39124e(f41861l);
        CoroutineContext coroutineContext = this.f41735i;
        if (coroutineContext != f41861l) {
            m39390i(f41861l, coroutineContext, t);
            this.f41735i = f41861l;
        }
        this.f41736j = continuation;
        Object objMo26879d = C10954i.f41738a.mo26879d(this.f41732f, t, this);
        if (!C9801m.m32341a(objMo26879d, C10855d.m39045c())) {
            this.f41736j = null;
        }
        return objMo26879d;
    }

    /* renamed from: k */
    private final void m39392k(DownstreamExceptionContext downstreamExceptionContext, Object obj) {
        throw new IllegalStateException(C10539n.m37497f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + downstreamExceptionContext.f41725f + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: c */
    public Object mo2409c(T t, Continuation<? super C10775u> continuation) {
        try {
            Object objM39391j = m39391j(continuation, t);
            if (objM39391j == C10855d.m39045c()) {
                C10863h.m39060c(continuation);
            }
            return objM39391j == C10855d.m39045c() ? objM39391j : C10775u.f41439a;
        } catch (Throwable th) {
            this.f41735i = new DownstreamExceptionContext(th, continuation.getF41861l());
            throw th;
        }
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl, kotlin.coroutines.p442j.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<? super C10775u> continuation = this.f41736j;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.p442j.internal.ContinuationImpl, kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public CoroutineContext getF41861l() {
        CoroutineContext coroutineContext = this.f41735i;
        return coroutineContext == null ? EmptyCoroutineContext.f41531f : coroutineContext;
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl, kotlin.coroutines.p442j.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public Object invokeSuspend(Object result) {
        Throwable thM37651b = Result.m37651b(result);
        if (thM37651b != null) {
            this.f41735i = new DownstreamExceptionContext(thM37651b, getF41861l());
        }
        Continuation<? super C10775u> continuation = this.f41736j;
        if (continuation != null) {
            continuation.resumeWith(result);
        }
        return C10855d.m39045c();
    }

    @Override // kotlin.coroutines.p442j.internal.ContinuationImpl, kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
