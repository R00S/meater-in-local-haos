package kotlinx.coroutines;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: AbstractTimeSource.kt */
@Metadata(m32266d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\t\u0010\u0006\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\b\u001a\u00020\u0007H\u0081\b\u001a\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\u000e\u001a\u00020\nH\u0081\b\u001a\t\u0010\u000f\u001a\u00020\nH\u0081\b\u001a\t\u0010\u0010\u001a\u00020\nH\u0081\b\u001a\u0011\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0081\b\u001a\t\u0010\u0014\u001a\u00020\nH\u0081\b\u001a\u0019\u0010\u0015\u001a\u00060\u0016j\u0002`\u00172\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0081\b\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0019"}, m32267d2 = {"timeSource", "Lkotlinx/coroutines/AbstractTimeSource;", "getTimeSource", "()Lkotlinx/coroutines/AbstractTimeSource;", "setTimeSource", "(Lkotlinx/coroutines/AbstractTimeSource;)V", "currentTimeMillis", HttpUrl.FRAGMENT_ENCODE_SET, "nanoTime", "parkNanos", HttpUrl.FRAGMENT_ENCODE_SET, "blocker", HttpUrl.FRAGMENT_ENCODE_SET, "nanos", "registerTimeLoopThread", "trackTask", "unTrackTask", "unpark", "thread", "Ljava/lang/Thread;", "unregisterTimeLoopThread", "wrapTask", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.c */
/* loaded from: classes3.dex */
public final class C10893c {

    /* renamed from: a */
    private static AbstractTimeSource f41588a;

    /* renamed from: a */
    public static final AbstractTimeSource m39138a() {
        return f41588a;
    }
}
