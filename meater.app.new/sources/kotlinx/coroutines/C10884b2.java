package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(m32266d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, m32268k = 4, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.b2 */
/* loaded from: classes3.dex */
public final class C10884b2 {
    /* renamed from: a */
    public static final CompletableJob m39120a(Job job) {
        return C10931d2.m39271a(job);
    }

    /* renamed from: c */
    public static final void m39122c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        C10931d2.m39273c(coroutineContext, cancellationException);
    }

    /* renamed from: d */
    public static final void m39123d(CancellableContinuation<?> cancellableContinuation, Future<?> future) {
        C10896c2.m39144a(cancellableContinuation, future);
    }

    /* renamed from: e */
    public static final void m39124e(CoroutineContext coroutineContext) {
        C10931d2.m39274d(coroutineContext);
    }

    /* renamed from: f */
    public static final void m39125f(Job job) {
        C10931d2.m39275e(job);
    }
}
