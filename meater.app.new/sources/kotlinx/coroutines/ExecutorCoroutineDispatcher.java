package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;

/* compiled from: Executors.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m32267d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "()V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "close", HttpUrl.FRAGMENT_ENCODE_SET, "Key", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.o1, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {

    /* renamed from: g */
    public static final a f41863g = new a(null);

    /* compiled from: Executors.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m32267d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "()V", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.o1$a */
    public static final class a extends AbstractCoroutineContextKey<CoroutineDispatcher, ExecutorCoroutineDispatcher> {

        /* compiled from: Executors.kt */
        @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "it", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        /* renamed from: kotlinx.coroutines.o1$a$a, reason: collision with other inner class name */
        static final class C11588a extends Lambda implements Function1<CoroutineContext.b, ExecutorCoroutineDispatcher> {

            /* renamed from: f */
            public static final C11588a f41864f = new C11588a();

            C11588a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExecutorCoroutineDispatcher invoke(CoroutineContext.b bVar) {
                if (bVar instanceof ExecutorCoroutineDispatcher) {
                    return (ExecutorCoroutineDispatcher) bVar;
                }
                return null;
            }
        }

        private a() {
            super(CoroutineDispatcher.f41756f, C11588a.f41864f);
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }
}
