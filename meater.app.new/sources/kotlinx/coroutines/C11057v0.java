package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C10980f0;
import kotlinx.coroutines.internal.C11004w;
import okhttp3.HttpUrl;

/* compiled from: DefaultExecutor.kt */
@Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m32267d2 = {"DefaultDelay", "Lkotlinx/coroutines/Delay;", "getDefaultDelay", "()Lkotlinx/coroutines/Delay;", "defaultMainDelayOptIn", HttpUrl.FRAGMENT_ENCODE_SET, "initializeDefaultDelay", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.v0 */
/* loaded from: classes3.dex */
public final class C11057v0 {

    /* renamed from: a */
    private static final boolean f41890a = C10980f0.m39470e("kotlinx.coroutines.main.delay", false);

    /* renamed from: b */
    private static final Delay f41891b = m39701b();

    /* renamed from: a */
    public static final Delay m39700a() {
        return f41891b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static final Delay m39701b() {
        if (!f41890a) {
            return DefaultExecutor.f41885l;
        }
        MainCoroutineDispatcher mainCoroutineDispatcherM39302c = Dispatchers.m39302c();
        return (C11004w.m39585c(mainCoroutineDispatcherM39302c) || !(mainCoroutineDispatcherM39302c instanceof Delay)) ? DefaultExecutor.f41885l : (Delay) mainCoroutineDispatcherM39302c;
    }
}
