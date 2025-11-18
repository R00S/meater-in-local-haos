package kotlinx.coroutines;

import kotlin.C10775u;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: JobSupport.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m32267d2 = {"Lkotlinx/coroutines/ChildContinuation;", "Lkotlinx/coroutines/JobCancellingNode;", "child", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invoke", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.s, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class ChildContinuation extends JobCancellingNode {

    /* renamed from: j */
    public final CancellableContinuationImpl<?> f41878j;

    public ChildContinuation(CancellableContinuationImpl<?> cancellableContinuationImpl) {
        this.f41878j = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: E */
    public void mo39270E(Throwable th) {
        CancellableContinuationImpl<?> cancellableContinuationImpl = this.f41878j;
        cancellableContinuationImpl.m39659G(cancellableContinuationImpl.mo39369v(m39303F()));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
        mo39270E(th);
        return C10775u.f41439a;
    }
}
