package kotlinx.coroutines.tasks;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: Tasks.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m32267d2 = {"Lkotlinx/coroutines/tasks/DirectExecutor;", "Ljava/util/concurrent/Executor;", "()V", "execute", HttpUrl.FRAGMENT_ENCODE_SET, "r", "Ljava/lang/Runnable;", "kotlinx-coroutines-play-services"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.e3.a, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class DirectExecutor implements Executor {

    /* renamed from: f */
    public static final DirectExecutor f41705f = new DirectExecutor();

    private DirectExecutor() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r) {
        r.run();
    }
}
