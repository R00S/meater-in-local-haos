package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: CoroutineScope.kt */
@Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"Lkotlinx/coroutines/GlobalScope;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.r1, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class GlobalScope implements CoroutineScope {

    /* renamed from: f */
    public static final GlobalScope f41877f = new GlobalScope();

    private GlobalScope() {
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: i */
    public CoroutineContext getF41775f() {
        return EmptyCoroutineContext.f41531f;
    }
}
