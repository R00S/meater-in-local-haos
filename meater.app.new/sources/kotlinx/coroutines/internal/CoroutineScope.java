package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import okhttp3.HttpUrl;

/* compiled from: Scopes.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m32267d2 = {"Lkotlinx/coroutines/internal/ContextScope;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.f, reason: from Kotlin metadata and from toString */
/* loaded from: classes3.dex */
public final class CoroutineScope implements kotlinx.coroutines.CoroutineScope {

    /* renamed from: f */
    private final CoroutineContext f41775f;

    public CoroutineScope(CoroutineContext coroutineContext) {
        this.f41775f = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: i, reason: from getter */
    public CoroutineContext getF41775f() {
        return this.f41775f;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getF41775f() + ')';
    }
}
