package Xb;

import cc.C2361F;
import kotlin.Metadata;

/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006*\u001e\b\u0002\u0010\f\u001a\u0004\b\u0000\u0010\n\"\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0012\u0004\u0012\u00028\u00000\u000b¨\u0006\r"}, d2 = {"", "timeMillis", "c", "(J)J", "Lcc/F;", "a", "Lcc/F;", "DISPOSED_TASK", "b", "CLOSED_EMPTY", "T", "Lcc/s;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1844j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C2361F f19087a = new C2361F("REMOVED_TASK");

    /* renamed from: b, reason: collision with root package name */
    private static final C2361F f19088b = new C2361F("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}
