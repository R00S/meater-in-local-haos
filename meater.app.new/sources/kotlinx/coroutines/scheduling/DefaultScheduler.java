package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: Dispatcher.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\r\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m32267d2 = {"Lkotlinx/coroutines/scheduling/DefaultScheduler;", "Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "()V", "close", HttpUrl.FRAGMENT_ENCODE_SET, "shutdown", "shutdown$kotlinx_coroutines_core", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.c3.c, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class DefaultScheduler extends SchedulerCoroutineDispatcher {

    /* renamed from: m */
    public static final DefaultScheduler f41620m = new DefaultScheduler();

    private DefaultScheduler() {
        super(C10908l.f41632b, C10908l.f41633c, C10908l.f41634d, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Default";
    }
}
