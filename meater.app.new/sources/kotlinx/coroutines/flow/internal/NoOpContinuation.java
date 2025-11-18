package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import okhttp3.HttpUrl;

/* compiled from: SafeCollector.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m32267d2 = {"Lkotlinx/coroutines/flow/internal/NoOpContinuation;", "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "resumeWith", HttpUrl.FRAGMENT_ENCODE_SET, "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.flow.internal.f, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class NoOpContinuation implements Continuation<Object> {

    /* renamed from: f */
    public static final NoOpContinuation f41727f = new NoOpContinuation();

    /* renamed from: g */
    private static final CoroutineContext f41728g = EmptyCoroutineContext.f41531f;

    private NoOpContinuation() {
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return f41728g;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
    }
}
