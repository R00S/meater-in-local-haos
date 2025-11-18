package kotlinx.coroutines;

import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.Result;
import okhttp3.HttpUrl;

/* compiled from: JobSupport.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m32267d2 = {"Lkotlinx/coroutines/ResumeAwaitOnCompletion;", "T", "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invoke", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.o2, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class ResumeAwaitOnCompletion<T> extends JobNode {

    /* renamed from: j */
    private final CancellableContinuationImpl<T> f41865j;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeAwaitOnCompletion(CancellableContinuationImpl<? super T> cancellableContinuationImpl) {
        this.f41865j = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: E */
    public void mo39270E(Throwable th) {
        Object objM39350X = m39303F().m39350X();
        if (C11045s0.m39681a() && !(!(objM39350X instanceof Incomplete))) {
            throw new AssertionError();
        }
        if (objM39350X instanceof CompletedExceptionally) {
            CancellableContinuationImpl<T> cancellableContinuationImpl = this.f41865j;
            Result.a aVar = Result.f40714f;
            cancellableContinuationImpl.resumeWith(Result.m37650a(C10568o.m37654a(((CompletedExceptionally) objM39350X).f41577b)));
        } else {
            CancellableContinuationImpl<T> cancellableContinuationImpl2 = this.f41865j;
            Result.a aVar2 = Result.f40714f;
            cancellableContinuationImpl2.resumeWith(Result.m37650a(C10960g2.m39407h(objM39350X)));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
        mo39270E(th);
        return C10775u.f41439a;
    }
}
