package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: Future.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, m32267d2 = {"cancelFutureOnCancellation", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CancellableContinuation;", "future", "Ljava/util/concurrent/Future;", "cancelFutureOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, m32268k = 5, m32269mv = {1, 6, 0}, m32271xi = 48, m32272xs = "kotlinx/coroutines/JobKt")
/* renamed from: kotlinx.coroutines.c2 */
/* loaded from: classes3.dex */
final /* synthetic */ class C10896c2 {
    /* renamed from: a */
    public static final void m39144a(CancellableContinuation<?> cancellableContinuation, Future<?> future) {
        cancellableContinuation.mo39632e(new CancelFutureOnCancel(future));
    }
}
