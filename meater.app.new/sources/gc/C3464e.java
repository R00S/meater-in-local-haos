package gc;

import cc.C2361F;
import cc.C2364I;
import kotlin.Metadata;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f\"\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f\"\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"", "id", "Lgc/f;", "prev", "h", "(JLgc/f;)Lgc/f;", "", "a", "I", "MAX_SPIN_CYCLES", "Lcc/F;", "b", "Lcc/F;", "PERMIT", "c", "TAKEN", "d", "BROKEN", "e", "CANCELLED", "f", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: gc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3464e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f42166a = C2364I.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* renamed from: b, reason: collision with root package name */
    private static final C2361F f42167b = new C2361F("PERMIT");

    /* renamed from: c, reason: collision with root package name */
    private static final C2361F f42168c = new C2361F("TAKEN");

    /* renamed from: d, reason: collision with root package name */
    private static final C2361F f42169d = new C2361F("BROKEN");

    /* renamed from: e, reason: collision with root package name */
    private static final C2361F f42170e = new C2361F("CANCELLED");

    /* renamed from: f, reason: collision with root package name */
    private static final int f42171f = C2364I.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3465f h(long j10, C3465f c3465f) {
        return new C3465f(j10, c3465f, 0);
    }
}
