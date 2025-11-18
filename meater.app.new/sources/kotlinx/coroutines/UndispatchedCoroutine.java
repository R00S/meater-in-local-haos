package kotlinx.coroutines;

import kotlin.C10773s;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C10986i0;
import kotlinx.coroutines.internal.ScopeCoroutine;
import okhttp3.HttpUrl;

/* compiled from: CoroutineContext.kt */
@Metadata(m32266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0014J\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bR\"\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m32267d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "threadStateToRecover", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", HttpUrl.FRAGMENT_ENCODE_SET, "afterResume", HttpUrl.FRAGMENT_ENCODE_SET, "state", "clearThreadContext", HttpUrl.FRAGMENT_ENCODE_SET, "saveThreadContext", "oldValue", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.w2, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {

    /* renamed from: i */
    private ThreadLocal<Pair<CoroutineContext, Object>> f41896i;

    /* JADX WARN: Illegal instructions before constructor call */
    public UndispatchedCoroutine(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        UndispatchedMarker undispatchedMarker = UndispatchedMarker.f41898f;
        super(coroutineContext.get(undispatchedMarker) == null ? coroutineContext.plus(undispatchedMarker) : coroutineContext, continuation);
        this.f41896i = new ThreadLocal<>();
        if (continuation.getF41861l().get(ContinuationInterceptor.f41528b) instanceof CoroutineDispatcher) {
            return;
        }
        Object objM39492c = C10986i0.m39492c(coroutineContext, null);
        C10986i0.m39490a(coroutineContext, objM39492c);
        m39706I0(coroutineContext, objM39492c);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    /* renamed from: C0 */
    protected void mo39077C0(Object obj) {
        Pair<CoroutineContext, Object> pair = this.f41896i.get();
        if (pair != null) {
            C10986i0.m39490a(pair.m37646a(), pair.m37647b());
            this.f41896i.set(null);
        }
        Object objM39296a = C10937e0.m39296a(obj, this.f41768h);
        Continuation<T> continuation = this.f41768h;
        CoroutineContext f41861l = continuation.getF41861l();
        Object objM39492c = C10986i0.m39492c(f41861l, null);
        UndispatchedCoroutine<?> undispatchedCoroutineM39419g = objM39492c != C10986i0.f41784a ? C10962h0.m39419g(continuation, f41861l, objM39492c) : null;
        try {
            this.f41768h.resumeWith(objM39296a);
            C10775u c10775u = C10775u.f41439a;
        } finally {
            if (undispatchedCoroutineM39419g == null || undispatchedCoroutineM39419g.m39705H0()) {
                C10986i0.m39490a(f41861l, objM39492c);
            }
        }
    }

    /* renamed from: H0 */
    public final boolean m39705H0() {
        if (this.f41896i.get() == null) {
            return false;
        }
        this.f41896i.set(null);
        return true;
    }

    /* renamed from: I0 */
    public final void m39706I0(CoroutineContext coroutineContext, Object obj) {
        this.f41896i.set(C10773s.m38547a(coroutineContext, obj));
    }
}
