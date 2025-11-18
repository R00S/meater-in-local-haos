package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: Tasks.kt */
@Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m32267d2 = {"Lkotlinx/coroutines/scheduling/NanoTimeSource;", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "()V", "nanoTime", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.c3.e, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class NanoTimeSource extends SchedulerTimeSource {

    /* renamed from: a */
    public static final NanoTimeSource f41621a = new NanoTimeSource();

    private NanoTimeSource() {
    }

    @Override // kotlinx.coroutines.scheduling.SchedulerTimeSource
    /* renamed from: a */
    public long mo39185a() {
        return System.nanoTime();
    }
}
