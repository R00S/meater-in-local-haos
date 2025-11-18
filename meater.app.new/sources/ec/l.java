package ec;

import cc.C2362G;
import cc.C2364I;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u0013\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"", "a", "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "", "b", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "c", "I", "CORE_POOL_SIZE", "d", "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "Lec/g;", "f", "Lec/g;", "schedulerTimeSource", "Lec/i;", "g", "Lec/i;", "NonBlockingContext", "h", "BlockingContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f40995a = C2362G.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public static final long f40996b = C2364I.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f40997c = C2364I.e("kotlinx.coroutines.scheduler.core.pool.size", Ha.g.d(C2362G.a(), 2), 1, 0, 8, null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f40998d = C2364I.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* renamed from: e, reason: collision with root package name */
    public static final long f40999e = TimeUnit.SECONDS.toNanos(C2364I.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* renamed from: f, reason: collision with root package name */
    public static g f41000f = e.f40985a;

    /* renamed from: g, reason: collision with root package name */
    public static final i f41001g = new j(0);

    /* renamed from: h, reason: collision with root package name */
    public static final i f41002h = new j(1);
}
