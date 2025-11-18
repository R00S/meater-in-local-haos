package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.C10996o;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.LimitedDispatcher;
import okhttp3.HttpUrl;

/* compiled from: CoroutineDispatcher.kt */
@Metadata(m32266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0017J \u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\u0002J\u0012\u0010\u0017\u001a\u00020\u00052\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0016¨\u0006\u001b"}, m32267d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "dispatch", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "isDispatchNeeded", HttpUrl.FRAGMENT_ENCODE_SET, "limitedParallelism", "parallelism", HttpUrl.FRAGMENT_ENCODE_SET, "plus", "other", "releaseInterceptedContinuation", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "Key", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.i0, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class CoroutineDispatcher extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* renamed from: f */
    public static final a f41756f = new a(null);

    /* compiled from: CoroutineDispatcher.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m32267d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.i0$a */
    public static final class a extends AbstractCoroutineContextKey<ContinuationInterceptor, CoroutineDispatcher> {

        /* compiled from: CoroutineDispatcher.kt */
        @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "it", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: kotlinx.coroutines.i0$a$a, reason: collision with other inner class name */
        static final class C11587a extends Lambda implements Function1<CoroutineContext.b, CoroutineDispatcher> {

            /* renamed from: f */
            public static final C11587a f41757f = new C11587a();

            C11587a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CoroutineDispatcher invoke(CoroutineContext.b bVar) {
                if (bVar instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) bVar;
                }
                return null;
            }
        }

        private a() {
            super(ContinuationInterceptor.f41528b, C11587a.f41757f);
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public CoroutineDispatcher() {
        super(ContinuationInterceptor.f41528b);
    }

    /* renamed from: K */
    public abstract void mo39106K(CoroutineContext coroutineContext, Runnable runnable);

    /* renamed from: N */
    public boolean mo39107N(CoroutineContext coroutineContext) {
        return true;
    }

    /* renamed from: Q */
    public CoroutineDispatcher m39425Q(int i2) {
        C10996o.m39539a(i2);
        return new LimitedDispatcher(this, i2);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    /* renamed from: a */
    public final void mo39028a(Continuation<?> continuation) {
        ((DispatchedContinuation) continuation).m39480s();
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    /* renamed from: c */
    public final <T> Continuation<T> mo39029c(Continuation<? super T> continuation) {
        return new DispatchedContinuation(this, continuation);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.b> E get(CoroutineContext.c<E> cVar) {
        return (E) ContinuationInterceptor.a.m39030a(this, cVar);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.c<?> cVar) {
        return ContinuationInterceptor.a.m39031b(this, cVar);
    }

    public String toString() {
        return C11049t0.m39687a(this) + '@' + C11049t0.m39688b(this);
    }
}
