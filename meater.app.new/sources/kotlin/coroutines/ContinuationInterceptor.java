package kotlin.coroutines;

import cm.aptoide.p092pt.database.room.RoomNotification;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ContinuationInterceptor.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\bH&J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\u0010"}, m32267d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "get", "E", RoomNotification.KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "releaseInterceptedContinuation", HttpUrl.FRAGMENT_ENCODE_SET, "Key", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.y.e, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public interface ContinuationInterceptor extends CoroutineContext.b {

    /* renamed from: b */
    public static final b f41528b = b.f41529f;

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.y.e$a */
    public static final class a {
        /* renamed from: a */
        public static <E extends CoroutineContext.b> E m39030a(ContinuationInterceptor continuationInterceptor, CoroutineContext.c<E> cVar) {
            C9801m.m32346f(cVar, RoomNotification.KEY);
            if (!(cVar instanceof AbstractCoroutineContextKey)) {
                if (ContinuationInterceptor.f41528b != cVar) {
                    return null;
                }
                C9801m.m32344d(continuationInterceptor, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) cVar;
            if (!abstractCoroutineContextKey.m39021a(continuationInterceptor.getKey())) {
                return null;
            }
            E e2 = (E) abstractCoroutineContextKey.m39022b(continuationInterceptor);
            if (e2 instanceof CoroutineContext.b) {
                return e2;
            }
            return null;
        }

        /* renamed from: b */
        public static CoroutineContext m39031b(ContinuationInterceptor continuationInterceptor, CoroutineContext.c<?> cVar) {
            C9801m.m32346f(cVar, RoomNotification.KEY);
            if (!(cVar instanceof AbstractCoroutineContextKey)) {
                return ContinuationInterceptor.f41528b == cVar ? EmptyCoroutineContext.f41531f : continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) cVar;
            return (!abstractCoroutineContextKey.m39021a(continuationInterceptor.getKey()) || abstractCoroutineContextKey.m39022b(continuationInterceptor) == null) ? continuationInterceptor : EmptyCoroutineContext.f41531f;
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m32267d2 = {"Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.y.e$b */
    public static final class b implements CoroutineContext.c<ContinuationInterceptor> {

        /* renamed from: f */
        static final /* synthetic */ b f41529f = new b();

        private b() {
        }
    }

    /* renamed from: a */
    void mo39028a(Continuation<?> continuation);

    /* renamed from: c */
    <T> Continuation<T> mo39029c(Continuation<? super T> continuation);
}
