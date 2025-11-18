package kotlinx.coroutines.flow.internal;

import cm.aptoide.p092pt.database.room.RoomNotification;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;

/* compiled from: SafeCollector.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J6\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00070\nH\u0096\u0001¢\u0006\u0002\u0010\fJ(\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0096\u0003¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0096\u0001J\u0011\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0096\u0003R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m32267d2 = {"Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "Lkotlin/coroutines/CoroutineContext;", "e", HttpUrl.FRAGMENT_ENCODE_SET, "originalContext", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", RoomNotification.KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.flow.internal.d, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class DownstreamExceptionContext implements CoroutineContext {

    /* renamed from: f */
    public final Throwable f41725f;

    /* renamed from: g */
    private final /* synthetic */ CoroutineContext f41726g;

    public DownstreamExceptionContext(Throwable th, CoroutineContext coroutineContext) {
        this.f41725f = th;
        this.f41726g = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.b, ? extends R> function2) {
        return (R) this.f41726g.fold(r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.b> E get(CoroutineContext.c<E> cVar) {
        return (E) this.f41726g.get(cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.c<?> cVar) {
        return this.f41726g.minusKey(cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f41726g.plus(coroutineContext);
    }
}
