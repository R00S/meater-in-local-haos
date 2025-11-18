package kotlinx.coroutines;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C10854c;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.C10863h;
import okhttp3.HttpUrl;

/* compiled from: Delay.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\u0000\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a!\u0010\u0000\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\n*\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m32267d2 = {"delay", "Lkotlinx/coroutines/Delay;", "Lkotlin/coroutines/CoroutineContext;", "getDelay", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Delay;", "awaitCancellation", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "timeMillis", HttpUrl.FRAGMENT_ENCODE_SET, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "duration", "Lkotlin/time/Duration;", "delay-VtjQ1oo", "toDelayMillis", "toDelayMillis-LRDsOJo", "(J)J", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.y0 */
/* loaded from: classes3.dex */
public final class C11069y0 {
    /* renamed from: a */
    public static final Object m39710a(long j2, Continuation<? super C10775u> continuation) {
        if (j2 <= 0) {
            return C10775u.f41439a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C10854c.m39044b(continuation), 1);
        cancellableContinuationImpl.m39666z();
        if (j2 < Long.MAX_VALUE) {
            m39711b(cancellableContinuationImpl.getF41861l()).mo39110e(j2, cancellableContinuationImpl);
        }
        Object objM39664w = cancellableContinuationImpl.m39664w();
        if (objM39664w == C10855d.m39045c()) {
            C10863h.m39060c(continuation);
        }
        return objM39664w == C10855d.m39045c() ? objM39664w : C10775u.f41439a;
    }

    /* renamed from: b */
    public static final Delay m39711b(CoroutineContext coroutineContext) {
        CoroutineContext.b bVar = coroutineContext.get(ContinuationInterceptor.f41528b);
        Delay delay = bVar instanceof Delay ? (Delay) bVar : null;
        return delay == null ? C11057v0.m39700a() : delay;
    }
}
