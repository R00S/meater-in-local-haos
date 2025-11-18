package kotlinx.coroutines;

import cm.aptoide.p092pt.database.room.RoomNotification;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: CoroutineContext.kt */
@Metadata(m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"Lkotlinx/coroutines/UndispatchedMarker;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$Key;", "()V", RoomNotification.KEY, "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.x2, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class UndispatchedMarker implements CoroutineContext.b, CoroutineContext.c<UndispatchedMarker> {

    /* renamed from: f */
    public static final UndispatchedMarker f41898f = new UndispatchedMarker();

    private UndispatchedMarker() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.b, ? extends R> function2) {
        return (R) CoroutineContext.b.a.m39035a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.b> E get(CoroutineContext.c<E> cVar) {
        return (E) CoroutineContext.b.a.m39036b(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.b
    public CoroutineContext.c<?> getKey() {
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.c<?> cVar) {
        return CoroutineContext.b.a.m39037c(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.b.a.m39038d(this, coroutineContext);
    }
}
